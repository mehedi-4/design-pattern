interface Shape{
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw(){
        System.out.println("drawing circle");
    }
}

class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("drawing square");
    }
}

class Factory{
    public static Shape createInstance(String type){
        if(type.equalsIgnoreCase("circle")){
            return new Circle();
        } else if(type.equalsIgnoreCase("square")){
            return new Square();
        } else{
            return null;
        }
    }
}

public class SimpleFactoryDemo {
    public static void main(String[] args) {
            Shape shapeOne = Factory.createInstance("circle");
            Shape shapeTwo = Factory.createInstance("square");
            // Shape shapeThree = Factory.createInstance("polygon");       

            shapeOne.draw();
            shapeTwo.draw();
            // shapeThree.draw();
        }
}
