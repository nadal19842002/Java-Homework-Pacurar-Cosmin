package b_29_06.aplicatieBancara2;

public class testare {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("Pacurar Cosmin");
        System.out.println(user1.getName());
        user1.setCnp("12345678910");
        System.out.println(user1.getCnp());
        user1.setBankAccount("RO39987654321");
        System.out.println(user1.getBankAccount());
        user1.setCardNumber("1234 "+"5678 "+"9101 "+"5255");
        System.out.println(user1.getCardNumber());
        //System.out.println(user1.addCard());
        user1.addBankAccount();

        BankAccount b1 = new BankAccount();
        b1.setSumaDinCont(0.0);
        b1.setContBancar("RO391235897");
        b1.setNrCard("1234 "+"5678 "+"9321 "+"0000");
        b1.adaugaInCont(25000.0);
        b1.scoateBanidinCont(10000.0);
        b1.attachCard();

        POS p1 = new POS();
        p1.setContBancar("RO391235897");
        System.out.println(p1.getContBancar());
        p1.plateste(2015, 65000.0,2500.0 ,"1234 "+"5678 "+"9321 "+"0000");

    }
}
