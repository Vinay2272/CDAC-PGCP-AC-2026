package question18;

import java.sql.*;
import java.util.Scanner;

import com.sun.jdi.connect.spi.Connection;

public class ProductCRUD {

    static final String URL =
            "jdbc:mysql://localhost:3306/productdb";
    static final String USER = "root";
    static final String PASS = "root";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public static void addProduct(Product p) {
        try (Connection con = getConnection()) {

            String sql =
                "insert into product values(?,?,?,?)";

            PreparedStatement ps =
                con.prepareStatement(sql);

            ps.setInt(1, p.getProductId());
            ps.setString(2, p.getPname());
            ps.setDouble(3, p.getPrice());
            ps.setInt(4, p.getQty());

            ps.executeUpdate();
            System.out.println("Product Added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public static void deleteProduct(int id) {
        try (Connection con = getConnection()) {

            String sql =
                "delete from product where productid=?";

            PreparedStatement ps =
                con.prepareStatement(sql);

            ps.setInt(1, id);

            int n = ps.executeUpdate();

            if (n > 0)
                System.out.println("Product Deleted");
            else
                System.out.println("Product Not Found");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public static void updateProduct(Product p) {
        try (Connection con = getConnection()) {

            String sql =
             "update product set pname=?,price=?,qty=? where productid=?";

            PreparedStatement ps =
                con.prepareStatement(sql);

            ps.setString(1, p.getPname());
            ps.setDouble(2, p.getPrice());
            ps.setInt(3, p.getQty());
            ps.setInt(4, p.getProductId());

            int n = ps.executeUpdate();

            if (n > 0)
                System.out.println("Product Updated");
            else
                System.out.println("Product Not Found");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public static void displayAll() {
        try (Connection con = getConnection()) {

            Statement st = con.createStatement();

            ResultSet rs =
                st.executeQuery("select * from product");

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " "
                      + rs.getString(2) + " "
                      + rs.getDouble(3) + " "
                      + rs.getInt(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public static void displayById(int id) {
        try (Connection con = getConnection()) {

            String sql =
                "select * from product where productid=?";

            PreparedStatement ps =
                con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " "
                      + rs.getString(2) + " "
                      + rs.getDouble(3) + " "
                      + rs.getInt(4));
            } else {
                System.out.println("Product Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public static void displayQtyGreater(int qty) {
        try (Connection con = getConnection()) {

            String sql =
                "select * from product where qty>?";

            PreparedStatement ps =
                con.prepareStatement(sql);

            ps.setInt(1, qty);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " "
                      + rs.getString(2) + " "
                      + rs.getDouble(3) + " "
                      + rs.getInt(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Product");
            System.out.println("2.Delete Product");
            System.out.println("3.Modify Product");
            System.out.println("4.Display All Products");
            System.out.println("5.Display Product By Id");
            System.out.println("6.Display Products Qty > Given Qty");
            System.out.println("7.Exit");

            System.out.print("Enter Choice : ");
            int ch = sc.nextInt();

            switch (ch) {

            case 1:
                System.out.print("Id : ");
                int id = sc.nextInt();

                System.out.print("Name : ");
                String name = sc.next();

                System.out.print("Price : ");
                double price = sc.nextDouble();

                System.out.print("Qty : ");
                int qty = sc.nextInt();

                addProduct(
                    new Product(id, name, price, qty));
                break;

            case 2:
                System.out.print("Enter Product Id : ");
                deleteProduct(sc.nextInt());
                break;

            case 3:
                System.out.print("Id : ");
                id = sc.nextInt();

                System.out.print("Name : ");
                name = sc.next();

                System.out.print("Price : ");
                price = sc.nextDouble();

                System.out.print("Qty : ");
                qty = sc.nextInt();

                updateProduct(
                    new Product(id, name, price, qty));
                break;

            case 4:
                displayAll();
                break;

            case 5:
                System.out.print("Enter Product Id : ");
                displayById(sc.nextInt());
                break;

            case 6:
                System.out.print("Enter Qty : ");
                displayQtyGreater(sc.nextInt());
                break;

            case 7:
                System.exit(0);

            default:
                System.out.println("Invalid Choice");
            }
        }
    }
}
