import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Music_Player {
    public static void main(String[] args){

        String filePath = "src\\Arash_Aysel_-_Always_on_my_mind_Evrovidenie_2009_(mp3.pm).wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();  // Clip mostly used with music player type of things
            clip.open(audioStream);

            clip.start();

            String response = "";

            while(!response.equals("Q")){
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice");
                 }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Couldn't locate the file");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file not supported");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resources");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Bye");
        }



    }
}
