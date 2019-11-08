package quizz2assignement;

public class Package {

    private String targetLocation;
    private double targetDistance;
    private double packageValue;
    private String localDate;

    public Package( String targetLocation, double targetDistance, double packageValue, String localDate ) {
        this.targetLocation = targetLocation;
        this.targetDistance = targetDistance;
        this.packageValue = packageValue;
        this.localDate = localDate;
    }

    public String getTargetLocation() {
        return targetLocation;
    }

    public void setTargetLocation( String targetLocation ) {
        this.targetLocation = targetLocation;
    }

    public double getTargetDistance() {
        return targetDistance;
    }

    public void setTargetDistance( double targetDistance ) {
        this.targetDistance = targetDistance;
    }

    public double getPackageValue() {
        return packageValue;
    }

    public void setPackageValue( double packageValue ) {
        this.packageValue = packageValue;
    }

    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate( String localDate ) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Package{" +
                "targetLocation='" + targetLocation + '\'' +
                ", targetDistance=" + targetDistance +
                ", packageValue=" + packageValue +
                ", localDate='" + localDate + '\'' +
                '}';
    }
}
