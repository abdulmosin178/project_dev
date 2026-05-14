import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/companydb",
                    "root",
                    "2002"
            );

            String sql = "INSERT INTO users(username, password) VALUES (?, ?)";

            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password);

           pstmt.executeUpdate();


                System.out.println("Data Inserted Successfully");


            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}