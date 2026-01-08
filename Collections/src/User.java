import static java.util.Objects.hash;

public class User {
    private int code;
    private String name;

    public User(final int code, final String name) {
        this.code = code;
        this.name = name;
    }

    public User(){}

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User user) {
            if (this == obj) return true;
            return this.code == user.code && this.name == user.name;
        }
        else  {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("User{code=%d, name='%s'}", code, name);
    }

    @Override
    public int hashCode() {
        return hash(this.code, this.name);
    }
}
