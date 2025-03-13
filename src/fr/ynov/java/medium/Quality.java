package fr.ynov.java.medium;

public class Quality {
    public int id;
    public String name;
    public Quality(int id , String name) {
        this.id = id;
        this.name = name;
    }



    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) return false;
        return (this.id == ((Quality) obj).id && this.name.equals(((Quality) obj).name));
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + id;
        if (name != null) {
            result = 31 * result + name.hashCode();
        }
        return result;
    }
}
