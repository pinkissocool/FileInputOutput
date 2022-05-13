public class PersonRunner {
    public static void main(String[] args) {
        PersonSaver savedPerson = new PersonSaver();
        savedPerson.load();
    }
}