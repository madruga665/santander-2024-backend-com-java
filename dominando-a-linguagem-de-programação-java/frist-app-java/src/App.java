
public class App {
    public static String getFullName(String firstName, String lastName) {
        String fullName = firstName.concat(" ").concat(lastName);

        return fullName;
    }

    public static void main(String[] args) throws Exception {
        String firstName = "Luciano";
        String lastName = "Amâncio";
        String fullName = getFullName(firstName, lastName);

        System.out.println(fullName);
    }
}
