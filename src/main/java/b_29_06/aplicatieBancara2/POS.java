package b_29_06.aplicatieBancara2;

public class POS {
        private String contBancar;

    public String getContBancar() {
        return contBancar;
    }

    public void setContBancar(String contBancar) {
        this.contBancar = contBancar;
    }
        public void plateste(int dataExpirare,double sumaDinCont,double scoateBani, String numarCard){
            if(dataExpirare<2015){
                System.out.println("Cardul tau a expirat");
            }
            else if(sumaDinCont>scoateBani){
                System.out.println("Felicitari!Ai platit "+scoateBani+" lei");
            }

        }

    }

