package db;

public class DbException extends RuntimeException {
    public static final long seriaVersionUID = 1L;

    public DbException(String message) {
        super(message);
    }
}
