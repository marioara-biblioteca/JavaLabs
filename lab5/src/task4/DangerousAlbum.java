package task4;

public class DangerousAlbum extends MusicAlbum{
    private boolean isPrime(int num){
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
    @Override
    public void addSong(Song s) {
        if(isPrime( s.getId()))
            getSongs().add(s);
        else System.out.println("Only songs with prime id belong to Dangerous album");
    }
}
