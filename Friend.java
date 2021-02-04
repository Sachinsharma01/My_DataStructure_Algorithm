import java.util.Objects;

public class Friend {
    private String name;
    private float udhaar;

    public Friend(String name, float udhaar) {
        this.name = name;
        this.udhaar = udhaar;
    }

    public Friend() {

    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", udhaar=" + udhaar +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return Float.compare(friend.udhaar, udhaar) == 0 && Objects.equals(name, friend.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, udhaar);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUdhaar() {
        return udhaar;
    }

    public void setUdhaar(float udhaar) {
        this.udhaar = udhaar;
    }
}
