package org.example.app.view;
import java.util.Scanner;

public class PostByIdView {
Scanner scanner = new Scanner(System.in);
public String getData(){
    System.out.println("Input post id: ");
    return scanner.nextLine();

}
public void getOutput(String output){
    System.out.println(output);
}
}
