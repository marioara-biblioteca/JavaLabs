package exercitiu;

public class Area {
    private CandyBag candyBag=null;
    private int number;
    private String street;
    public Area(){
        System.out.println("Area constructor");
    }

    public Area(CandyBag candyBag, int number, String street) {
        this.candyBag = candyBag;
        this.number = number;
        this.street = street;
    }
    public void getBirthdayCard(){
        System.out.println("Complete address: street "+this.street+", number "+this.number+"\n Happy birthday");
        for(CandyBox c:this.candyBag.getCandyBoxes()){
            System.out.println(c.toString() );
            c.printDim();
        }
    }
}
