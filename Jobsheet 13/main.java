import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    // Tambahan metode khusus admin jika diperlukan
}

class Customer extends User {
    public Customer(String username, String password) {
        super(username, password);
    }

    // Tambahan metode khusus pelanggan jika diperlukan
}

class BookingSystem {
    private Map<String, User> users;
    private Scanner scanner;

    public BookingSystem() {
        users = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void registerUser(User user) {
        users.put(user.getUsername(), user);
    }

    public User loginUser() {
        System.out.print("Username: ");
        String username = scanner.next();
        System.out.print("Password: ");
        String password = scanner.next();

        User user = users.get(username);

        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful!");
            return user;
        } else {
            System.out.println("Login failed. Invalid username or password.");
            return null;
        }
    }
}

public class main {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();

        // Menambahkan admin dan pelanggan contoh
        Admin admin = new Admin("admin", "admin123");
        Customer customer = new Customer("customer", "customer123");

        bookingSystem.registerUser(admin);
        bookingSystem.registerUser(customer);

        // Login
        User loggedInUser;
        do {
            loggedInUser = bookingSystem.loginUser();
        } while (loggedInUser == null);

        // Cek tipe pengguna (admin atau customer) dan lakukan operasi sesuai tipe
        if (loggedInUser instanceof Admin) {
            // Operasi untuk admin
            System.out.println("Welcome, Admin!");
        } else if (loggedInUser instanceof Customer) {
            // Operasi untuk pelanggan
            System.out.println("Welcome, Customer!");
        }
    }
}
