public class LineAndLengthLine {
    private String line;
    private int lineLength;

    public LineAndLengthLine(String line) {
        this.line = line;
        this.lineLength = this.line.length();
    }

    public String getLine() {
        return line;
    }

    public int getLineLength() {
        return lineLength;
    }

    @Override
    public String toString() {
        return "LineLength{" +
                "line='" + line + '\'' +
                ", lineLength=" + lineLength +
                '}';
    }
}
