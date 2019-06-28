package b_29_06.aplicatieBancara2;
import java.util.ArrayList;

public class User {
    private String name;
    private String cnp;
    private String cardNumber;
    private String bankAccount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void addCard(){
        ArrayList<String> adaugaCard = new ArrayList<String>(5);
        adaugaCard.add(0,"125689");
        adaugaCard.add(1,"123355");
        adaugaCard.add(2,"127844");
        adaugaCard.add(3,"124433");
}
    public void addBankAccount(){
        ArrayList<String> bankAccount = new ArrayList<String>(5);
        bankAccount.add(0,"12345678");
        bankAccount.add(1,"87654321");
        bankAccount.add(2,"87564321");
        bankAccount.add(0,"12876543");
    }
}

