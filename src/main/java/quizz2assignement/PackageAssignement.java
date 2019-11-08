package quizz2assignement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PackageAssignement {


    public static void main( String[] args ) {
        // TODO Auto-generated method stub
        List<Package> packages = new ArrayList<>();
        File file = new File("orasele de livrare.txt");
        List<String> dataFromFile = null;
        try {
            dataFromFile = Files.readAllLines(Paths.get(file.getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String s : dataFromFile) {
            String[] dataSplitted = s.split(",");
            Package pack = new Package(dataSplitted[0], Double.parseDouble(dataSplitted[1]), Double.parseDouble(dataSplitted[2]), dataSplitted[3]);
            packages.add(pack);
            double packagesTotalValue = 0.0;
            for (Package p : packages) {
                System.out.println("This package is considered to be delivered in " + p.getTargetLocation() + " on " + p.getLocalDate());
                final double pricePerKm = 1.0;
                double packageValue = p.getTargetDistance() * pricePerKm;
                System.out.println("The price for delivering this package is " + packageValue);
                packagesTotalValue = packageValue + packagesTotalValue;
                System.out.println("Delivering for " + p.getTargetLocation() + " and date " + p.getLocalDate() + " in " + p.getTargetDistance() + " seconds");
            }
            System.out.println("The total value of the packages delivered is " + packagesTotalValue);
        }
    }

}



