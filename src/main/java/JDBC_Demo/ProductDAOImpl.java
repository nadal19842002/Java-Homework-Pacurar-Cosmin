package JDBC_Demo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl {
    private String sql;
    private ResultSet rs;

    public boolean insertProduct( ProductDAO productDAO ) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        con = MyConnection.getConnection();
        String sql;
        sql = "insert into productDAO values(?,?,?,?)";
        ps = con.prepareStatement(sql);
        ps.setInt(1, productDAO.getId());
        ps.setString(2, productDAO.getProductName());
        ps.setInt(3, productDAO.getWeight());
        ps.setInt(4, productDAO.getPiecesPerBox());
        ps.setFloat(5, (float) productDAO.getProductPrice());
        if (ps.executeUpdate() > 0) {
            return true;
        else if
            return false;

        }

        public ProductDAO searchById ( int id) throws SQLException
        {
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            con = MyConnection.getConnection();
            String sql;

            sql = "select * from employee where id= ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            ProductDAO productDAO1 = new ProductDAO();
            if (rs.next()) {
                productDAO1.setId(rs.getInt(1));
                productDAO1.setProductName(rs.getString(2));
                productDAO1.setWeight(rs.getInt(3));
                productDAO1.setPiecesPerBox(rs.getInt(4));
                productDAO1.setProductPrice(rs.getFloat(5));
            } else
                productDAO1 = null;

            return productDAO1;
        }

        public List<ProductDAO> searchAll () throws SQLException
        {
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            con = MyConnection.getConnection();
            String sql;
            sql = "select * from productDAO";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            List<ProductDAO> mylist = new ArrayList<ProductDAO>();

            while (rs.next()) {
                ProductDAO productDAO1 = new ProductDAO();
                productDAO1.setId(rs.getInt(1));
                productDAO1.setProductName(rs.getString(2));
                productDAO1.setWeight(rs.getInt(3));
                productDAO1.setPiecesPerBox(rs.getString(4));
                mylist.add(productDAO1);
                productDAO1 = null;
            }
            return mylist;
        }

        public boolean deleteById ( int id) throws SQLException
        {
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            con = MyConnection.getConnection();
            String sql;
            sql = "delete from ProductDao where id =?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                return true;
            }
            return false;
        }
    }
}
