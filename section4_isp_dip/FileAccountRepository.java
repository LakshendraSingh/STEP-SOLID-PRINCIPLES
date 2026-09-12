package section4_isp_dip;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Section 4 - Subsection 4: FileAccountRepository
 * Implements AccountRepository by persisting data to a plain text file (accountNumber,name,balance).
 */
public class FileAccountRepository implements AccountRepository {
    private final String filePath;

    public FileAccountRepository(String filePath) {
        this.filePath = filePath;
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.err.println("Error initializing account file: " + e.getMessage());
        }
    }

    public FileAccountRepository() {
        this("accounts.txt");
    }

    @Override
    public synchronized void save(Account account) {
        Map<Integer, Account> all = loadAll();
        all.put(account.getAccountNumber(), account);
        writeAll(all);
        System.out.println("[FileAccountRepo] Persisted account #" + account.getAccountNumber() + " to " + filePath);
    }

    @Override
    public synchronized Optional<Account> find(int accountNumber) {
        Map<Integer, Account> all = loadAll();
        return Optional.ofNullable(all.get(accountNumber));
    }

    private Map<Integer, Account> loadAll() {
        Map<Integer, Account> map = new HashMap<>();
        File file = new File(filePath);
        if (!file.exists()) return map;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int accNo = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double bal = Double.parseDouble(parts[2].trim());
                    map.put(accNo, new Account(accNo, name, bal));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading accounts file: " + e.getMessage());
        }
        return map;
    }

    private void writeAll(Map<Integer, Account> map) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false))) {
            for (Account acc : map.values()) {
                writer.write(acc.getAccountNumber() + "," + acc.getName() + "," + acc.getBalance());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing accounts file: " + e.getMessage());
        }
    }
}
