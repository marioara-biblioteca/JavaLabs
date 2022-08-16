package task4;

public class BadAlbum extends MusicAlbum{
    private boolean isPalindrome(int num){
        int reversedNum = 0, remainder;
        int originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        return originalNum==reversedNum?true:false;
    }
    @Override
    public void addSong(Song s) {
        if(isPalindrome(s.getId()) & s.getName().length()==3)
            getSongs().add(s);
        else System.out.println("Only songs with palindrome id and name of 3 letters belong to bad album");
    }
}
