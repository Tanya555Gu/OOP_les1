public class Square extends Rectangle {

    private int side;

    public Square(int side){
        super(side, side);
    }

    // public void setSide(int side){
    //     this.side = side;
    // }

    public int getSide(){
        return side;
    }

    @Override
    public int calculateArea(){
        return super.calculateArea();
    }

    @Override
    public int calculatePerimeter(){
        return super.calculatePerimeter();
    }
}
