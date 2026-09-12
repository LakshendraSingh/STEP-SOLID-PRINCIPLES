package section3_lsp;

/**
 * Section 3 - Subsection 1: Square extending Rectangle (Violates LSP)
 */
public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}
