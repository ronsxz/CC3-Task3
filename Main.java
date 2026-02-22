import java.util.List;

public class Main {
    public static void main(String[] args) {

        Repository repo = new Repository();
        repo.insertStudent(new Student(10, "Jaymie", "Gayo", 19, "Feale", "BSIT", 2, "jaymiegayo@gmail.com", 987654321, "Valenzuela City"));
        repo.SelectAll();
        
    }
}