//Structural design pattern
// allows two incompitable classes to work together

interface ModernPrinter{
    void print(String text);
}

class OldPrinter{
    public void printText(String text){
        System.out.println(text);
    }
}

class PrinterAdapter implements ModernPrinter{
    private OldPrinter instance;
    public PrinterAdapter(OldPrinter instance){
        this.instance = instance;
    }

    @Override
    public void print(String text){
        instance.printText(text);
    }
}

public class AdapterDemo{
    public static void main(String[] args){
        OldPrinter old =  new OldPrinter();
        ModernPrinter modern = new PrinterAdapter(old);
        modern.print("HI");
    }
}