package enums;

public enum Status {
    TODO, DOING, DONE;

    public static Status fromString(String status) {
        switch (status) {
            case "TODO":
                return TODO;
            case "DOING":
                return DOING;
            case "DONE":
                return DONE;
            default:
                throw new IllegalArgumentException("Status invalide: " + status);
        }
    }
}
