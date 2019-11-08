package JDBC_Demo;

package view;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TestingMain {

    public static void main( String[] args ) throws Exception {
        int ch;
        do {
            System.out.println("____________________________");
            System.out.println("Product Application");
            System.out.println("____________________________");
            System.out.println("1. Insert Product \n 2 Search Product \n 3 Delete Product \n 4 Search All Product\n 5 Exit");
            System.out.println("__________________________");
            System.out.println("Enter Your Choice");
            Scanner scan = new Scanner(System.in);
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    insert();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    deleteId();
                    break;
                case 4:
                    searchAll();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.....");
            }
        }
        while (ch != 5);
    }

    public static void searchAll() throws SQLException {
        ProductDAO E = new ProductDAO();
        List<ProductDAO> mylist1;

        for (ProductDAO p1 : mylist1) {
            System.out.print(p1.getId() + " ");
            System.out.print(p1.getProductName() + " ");
            System.out.print(p1.getProductPrice() + " ");
            System.out.println(p1.getWeight() + " ");
        }
    }

    public static void insert() throws Exception {


        int id, weight, piecesPerBox, productPrice;
        String productName;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Product Id");
        id = scan.nextInt();
        System.out.println("Enter Product Name");
        productName = scan.next();
        System.out.println("Enter Product Price");
        productPrice = scan.nextInt();
//


        ProductDAO productDAO = new ProductDAO();
        productDAO.setId(id);
        productDAO.setProductName(productName);
        ;
        productDAO.setProductPrice(productPrice);
//

        ProductDAOImpl pd = new ProductDAOImpl();

        if (pd.insertProduct())
            System.out.println("Record Inserted...........");
        else
            System.out.println("Record Not Inserted...........");
    }

    public static void deleteId() throws Exception {
        int id;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee No. to Delete");
        id = scan.nextInt();
        ProductDAO productDAO = new ProductDAO();
        if (productDAO.getId() == 1) {
            System.out.println("Record Deleted.......");
        } else
            System.out.println("Record not Found.....");
    }

    public static void search() throws SQLException {
        int id;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee No.");
        id = scan.nextInt();
        ProductDAO productDAO = new ProductDAO();
        ProductDAOImpl productDAO1;
        productDAO = productDAO1.searchById(id);
        if (productDAO == null) {
            System.out.println("Record Not Found....");
        } else {
            System.out.print(productDAO.getId() + " | ");
            System.out.print(productDAO.getProductName() + " | ");
            System.out.print(productDAO.getProductPrice() + " | ");
            System.out.println(productDAO.getWeight() + " | ");
        }
    }
}
