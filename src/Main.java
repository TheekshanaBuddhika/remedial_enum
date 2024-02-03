import model.*;

public class Main {

    public static void main(String[] args) {

        Season season = Season.Spring;
        Superintf superintf = getObj(season);

    }

    public static Superintf getObj(Season season){

        Superintf superintf = null;

        switch (season){

            case Spring: superintf = new Animal();
                         break;

            case Summer: superintf =new Car();
                        break;

            case Autumn:superintf =new Star();
                        break;

            case Winter:superintf = new Human();
                        break;

        }

        return superintf;

    }


}
