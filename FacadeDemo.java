class TV{
    public void on(){
        System.out.println("TV ON");
    }
}

class Sound{
    public void on(){
        System.out.println("Sound ON");
    }
}

class DVD{
    public void on(){
        System.out.println("DVD ON");
    }
}

class Facade{
    private TV tv;
    private Sound sound;
    private DVD dvd;

    public Facade(TV tv, Sound sound, DVD dvd){
        this.tv = tv;
        this.sound = sound;
        this.dvd = dvd;
    }

    public void watchMovie(String movie){
        tv.on();
        sound.on();
        dvd.on();
        System.out.println("playing " + movie);
    }
}

public class FacadeDemo{
    public static void main(String[] args) {
        TV tv = new TV();
        Sound sound = new Sound();
        DVD dvd = new DVD();

        Facade facade = new Facade(tv, sound, dvd);
        facade.watchMovie("Se7en");
    }
}