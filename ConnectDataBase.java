package mobiley;

import java.sql.*;

public class ConnectDataBase {

    private String sqlUrl = "jdbc:mysql://localhost:3306/mobiley";
    private String userName = "root";
    private String passWord = "****";// type your password here !
    private Connection con;
    private Statement statement;

    public ConnectDataBase() {
        try {
            con = DriverManager.getConnection(sqlUrl, userName, passWord);
            statement = con.createStatement();
            con.setAutoCommit(false);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void insertIntoProductsTable(String product_name, double product_main_price, double product_sold_price) {
        try {
            String SQL = "INSERT INTO products(Date,product_name,main_price,sold_price) "
                    + "VALUES(now(),?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(SQL,
                    Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, product_name);
            pstmt.setDouble(2, product_main_price);
            pstmt.setDouble(3, product_sold_price);
            pstmt.executeUpdate();
            con.commit();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void insertIntoPurchasesTable(double total_price) {
        try {
            String SQL = "INSERT INTO purchases_prices(Date,total_price) "
                    + "VALUES(now(),?)";
            PreparedStatement pstmt = con.prepareStatement(SQL,
                    Statement.RETURN_GENERATED_KEYS);
            pstmt.setDouble(1, total_price);
            pstmt.executeUpdate();
            con.commit();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public String generalReport() {
        double total_price = 0;
        double total_main = 0;
        double total_sold = 0;
        try {
            String sql1 = "SELECT sum(total_price) "
                    + "FROM purchases_prices";
            ResultSet rs1 = statement.executeQuery(sql1);
            while (rs1.next()) {
                total_price = rs1.getDouble("sum(total_price)");
            }
            rs1.close();
            String sql2 = "SELECT sum(main_price) "
                    + "FROM products";
            ResultSet rs2 = statement.executeQuery(sql2);
            while (rs2.next()) {
                total_main = rs2.getDouble("sum(main_price)");
            }
            rs2.close();
            String sql3 = "SELECT sum(sold_price) "
                    + "FROM products";
            ResultSet rs3 = statement.executeQuery(sql3);
            while (rs3.next()) {
                total_sold = rs3.getDouble("sum(sold_price)");
            }
            rs3.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        String message = "مجموع اسعار المشتريات : " + total_price + "\n"
                + " مجموع اسعار المنتجات الفعلي: " + total_main + "\n" + "مجموع اسعار المنتجات المباعه: "
                + total_sold + "\n" + " صافي الربح: " + (total_sold - total_main);
        return message;
    }

    public void dropAllInfo() {
        try {
            String SQL1 = "TRUNCATE TABLE products";
            String SQL2 = "TRUNCATE TABLE purchases_prices";
            statement.executeUpdate(SQL1);
            statement.executeUpdate(SQL2);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }
}
