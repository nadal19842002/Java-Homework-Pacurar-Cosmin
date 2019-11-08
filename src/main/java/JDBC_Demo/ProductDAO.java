package JDBC_Demo;

public class ProductDAO {
    private Integer id;
    private String productName;
    private Integer weight;
    private Integer piecesPerBox;
    private double productPrice;

    public ProductDAO() {
    }

    public ProductDAO( Integer id, String productName ) {
        this.id = id;
        this.productName = productName;
    }

    public ProductDAO( Integer id, String productName, Integer weight, double productPrice ) {
        this.id = id;
        this.productName = productName;
        this.weight = weight;
        this.productPrice = productPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName( String productName ) {
        this.productName = productName;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight( Integer weight ) {
        this.weight = weight;
    }

    public Integer getPiecesPerBox() {
        return piecesPerBox;
    }

    public void setPiecesPerBox( Integer piecesPerBox ) {
        this.piecesPerBox = piecesPerBox;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice( double productPrice ) {
        this.productPrice = productPrice;
    }
}
