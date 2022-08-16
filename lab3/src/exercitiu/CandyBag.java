package exercitiu;
import java.util.*;
public class CandyBag {
    private ArrayList<CandyBox>candyBoxes=null;
    public CandyBag(){
        this.candyBoxes=new ArrayList<CandyBox>();
    }
    public ArrayList<CandyBox>getCandyBoxes(){return this.candyBoxes;}
    public boolean addCandyBox(CandyBox c){
        for(CandyBox cb:this.candyBoxes)
            if(c.equals(cb)) return false;
        this.candyBoxes.add(c);
        return true;
    }
}
