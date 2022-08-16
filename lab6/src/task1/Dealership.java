package task1;
import java.lang.*;
import java.util.*;
public class Dealership {
    private int discount;

    //task2
    class BrandOffer implements Offer{ //calculează un discount în funcție de tipul mașinii (e.g. pentru o dacie discount-ul este 5% din prețul ei)

        @Override
        public int getDiscount(Car car) {
            switch(car.getType()){
                case FORD:
                    return 10;
                case JEEP:
                    return 15;
                case TESLA:
                    return 19;
                default:
                    return 0;
            }
        }
    }
    //task2
    class DealerOffer implements Offer{ //calculează un discount în funcție de vechimea mașinii (e.g. 100 pentru fiecare an de vechime)

        @Override
        public int getDiscount(Car car) {
            return (2022-car.getYear())/10;
        }
    }
    //task2
    class SpecialOffer implements Offer{// calculează un discount random (e.g. random între 0 și 100)

        @Override
        public int getDiscount(Car car) {
            return  new Random().nextInt(100);
        }
    }
    public void getFinalPrice(Car car){
        System.out.println("Car la inceput: "+car.toString());
        BrandOffer bo=new BrandOffer();
        SpecialOffer so=new SpecialOffer();
        DealerOffer dof=new DealerOffer();
        System.out.println("BrandOffer: "+bo.getDiscount(car));
        System.out.println("SpecialOffer: "+so.getDiscount(car));
        System.out.println("DealerOffer: "+dof.getDiscount(car));
        car.setPrice(car.getPrice()-(bo.getDiscount(car)+so.getDiscount(car)+dof.getDiscount(car)));
        System.out.println("Car dupa cele 2 discounturi:" + car.toString());
    }
    public void negotiate(Car car,Offer offer){
        int toDo=new Random().nextInt(2);
        if(toDo==1){
            //accepta oferta clientului
            car.setPrice( car.getPrice()-offer.getDiscount(car));
        }
        System.out.println("Car la final: "+car.toString());
    }
}
