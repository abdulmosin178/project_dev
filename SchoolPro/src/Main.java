//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb", "root", "2002");
            while (true) {
                System.out.println("\n1.Add Student");
                System.out.println("2.View Student");
                System.out.println("3.Exit");
                System.out.println("Enter Choice :");
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1) {
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Course:");
                    String course = sc.nextLine();
                    String sql = "INSERT INTO students(name,course) VALUES(?,?)";
                    PreparedStatement pstmt = con.prepareStatement(sql);
                    pstmt.setString(1, name);
                    pstmt.setString(2, course);
                    pstmt.executeUpdate();
                    System.out.println("student added");
                } else if (choice == 2) {
                    String sql = "SELECT * from students";
                    PreparedStatement pstmt = con.prepareStatement(sql);
                    ResultSet rs = pstmt.executeQuery();
                    System.out.println("\nStudent List:");
                    while (rs.next()) {
                        System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("course"));

                    }

                } else if (choice==3) {
                    System.out.println("Prgram end");
                    break;

                }
                else{
                    System.out.println("invalid");
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

            }

        }




