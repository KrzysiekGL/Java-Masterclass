package pl.krzysiekgl;

import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);
  private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
    
    
    
//      class ClickListener implements Button.OnCLickListener {
//        public ClickListener() {
//          System.out.println("I've been attached");
//        }
//
//        @Override
//        public void onClick(String title) {
//          System.out.println(title + " was clicked");
//        }
//      }
//
//      btnPrint.setOnClickListener(new ClickListener());
      
      //!!!!!!!!!!!!!!!!!!!!!!  --- anonymous class example
      btnPrint.setOnClickListener(new Button.OnCLickListener() {  //using anonymous class - the same as above
        @Override
        public void onClick(String title) {
          System.out.println(title + " was Clicked");
        }
      });
      
      listen();
      
    }
    
    public static void listen() {
      boolean quit = false;
      while(!quit) {
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
          case 0:
            quit = true;
            break;
          case 1:
            btnPrint.onClick();
        }
      }
    }
}
