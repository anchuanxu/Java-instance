public class Rectangle {
    private double height;
    private double width;
    private double centralX;
    private double centralY;
    private double circumference;
    private double square;
    public Rectangle(double height, double width, double centralX,
                     double centralY) {
        this.height = height;
        this.width = width;
        this.centralX = centralX;
        this.centralY = centralY;
        this.circumference = (height+width) * 2;
        this.square = height * width;
    }

    //get the value of circumference
    public double getCircumference(){
        return this.circumference;
    }

    //get the value of square
    public double getSquare(){
        return this.square;
    }

    //get centralX
    public double getCentralX() {return this.centralX;}

    //get centralY
    public  double getCentralY() {return this.centralY;}


}
