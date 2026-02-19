class EmailValidator{
    public static void validateEmail(String email) {
        int atIndex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');
        if (atIndex == -1 || atIndex != lastAtIndex) {
            System.out.println("Invalid email: must contain exactly one '@' symbol.");
            return;
        }
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);
        if (username.length() > 25 || !username.matches("[a-zA-Z0-9_\\-+]+")) {
            System.out.println("Invalid email: username must be ≤ 25 characters and contain only letters, digits, '_', '-', '+'.");
            return;
        }
        if (!(domain.endsWith(".com") || domain.endsWith(".in") || domain.endsWith(".edu"))) {
            System.out.println("Invalid email: domain must end with .com, .in, or .edu.");
            return;
        }
        System.out.println("Valid email");
        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
    }
    public static void main(String[] args) {
         System.out.println("Sana Tasneem Azimudin=2024503007");
        String email = "sana_tasneem+azimudin@university.edu";
        validateEmail(email);
    }
}






