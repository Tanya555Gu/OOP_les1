public class Rectangle {

    protected int length;
    protected int width;
    
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    // public void setLength(int length){
    //     this.length = length;
    // }

    public int getLength(){
        return length;
    }

    // public void setWidth(int width){
    //     this.width = width;
    // }

    public int getWidth(){
        return width;
    }

    public int calculateArea(){
        return getLength() * getWidth();
    }
    public int calculatePerimeter(){
        return 2 * (getLength() + getWidth());
    }
}
