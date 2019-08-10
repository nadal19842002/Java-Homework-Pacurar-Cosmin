package e_03_08;

import java.util.Objects;

public class Adress {
    private String country;


    public Adress(String country) {
        this.country = country;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return country.equals(adress.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country);
    }
}
