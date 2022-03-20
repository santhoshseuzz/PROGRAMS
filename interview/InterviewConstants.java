package interview;

public enum InterviewConstants {
    Name("Enter the  Attende name :"),Regno("Your Reg No: ");
    private final String text;

    InterviewConstants(final String text) {
        this.text = text;
    }

    public String toString() {
        return text;

    }
}
