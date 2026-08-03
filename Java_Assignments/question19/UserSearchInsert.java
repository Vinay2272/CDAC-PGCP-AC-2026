package question19;

import java.sql.*;
import java.util.Scanner;

public class UserSearchInsert {

    static final String URL =
            "jdbc:mysql://localhost:3306/userdb";
    static final String USER = "root";
    static final String PASS = "root";

    public static Connection getConnection()
            throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
                URL, USER, PASS);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Username : ");
            String uname = sc.nextLine();

            System.out.print("Enter Address : ");
            String addr = sc.nextLine();

            Connection con = getConnection();

            String sql =
            "select * from users where username=? and address=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, uname);
            ps.setString(2, addr);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("\nUser Found");
                System.out.println("Username : "
                        + rs.getString("username"));
                System.out.println("Address : "
                        + rs.getString("address"));
                System.out.println("Mobile : "
                        + rs.getString("mobile"));
                System.out.println("Email : "
                        + rs.getString("email"));

            } else {

                System.out.println(
                        "\nUser Not Found");
                System.out.println(
                        "Enter New User Details");

                System.out.print("Mobile : ");
                String mobile = sc.nextLine();

                System.out.print("Email : ");
                String email = sc.nextLine();

                String insertSql =
                "insert into users values(?,?,?,?)";

                PreparedStatement ps2 =
                    con.prepareStatement(insertSql);

                ps2.setString(1, uname);
                ps2.setString(2, addr);
                ps2.setString(3, mobile);
                ps2.setString(4, email);

                int n = ps2.executeUpdate();

                if (n > 0)
                    System.out.println(
                        "User Added Successfully");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
