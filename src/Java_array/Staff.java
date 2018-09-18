public class Staff {
    private double hourlyWage;
    private double workingHour;
    public Staff(){
        this.hourlyWage = 0;
        this.workingHour = 0;
    }
    public Staff(double hourlyWage,double workingHour){
        this.hourlyWage = hourlyWage;
        this.workingHour = workingHour;
    }
    public double getBiweeklyWage(){
        return this.hourlyWage*this.workingHour;
    }
}
