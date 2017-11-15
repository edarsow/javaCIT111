package shared_student_work.objectifiedArrays;

/**
 *
 * @author nicolas.lankes
 */
public class ArrayOfObjects {
    
    public static void main(String[] args) throws InterruptedException {
        
        Songs firstSong = new Songs();
        firstSong.setMusicType("Pop");
        firstSong.setArtistName("Bebe Rexha");
        firstSong.setSongLength(3.24);
        
        Songs secondSong = new Songs();
        secondSong.setMusicType("Rap");
        secondSong.setArtistName("21 Savage");
        secondSong.setSongLength(2.55);
        
        Songs thirdSong = new Songs();
        thirdSong.setMusicType("Alternative");
        thirdSong.setArtistName("Green Day");
        thirdSong.setSongLength(4.11);
        
        Songs fourthSong = new Songs();
        fourthSong.setMusicType("Country");
        fourthSong.setArtistName("Dierks Bentley");
        fourthSong.setSongLength(3.45);
        
        Songs fifthSong = new Songs();
        fifthSong.setMusicType("Pop");
        fifthSong.setArtistName("Camilla Cabella");
        fifthSong.setSongLength(4.20);
        
        Songs[] Songs = new Songs[5];
        
        Songs[0] = firstSong;
        Songs[1] = secondSong;
        Songs[2] = thirdSong;
        Songs[3] = fourthSong;
        Songs[4] = fifthSong;
        
        for(int i = 0; i <= 4; i += 1){
            Songs accessedSong = Songs[i];
            System.out.println("Getting song info...");
            Thread.sleep(1000);
            System.out.println("Artist Name: " + accessedSong.getArtistName());
            Thread.sleep(500);
            System.out.println("Song Gene: " + accessedSong.getMusicType());
            Thread.sleep(500);
            System.out.println("Song Length: " + accessedSong.getSongLength());
            Thread.sleep(1000);
        }
        
    } //end method main
    
}