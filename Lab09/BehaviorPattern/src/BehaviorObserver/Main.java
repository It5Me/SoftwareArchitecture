package BehaviorObserver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringPublisher publisher = new StringPublisher();
        StringSubscriber subscriber1 = new SymbolSubscriber();
        StringSubscriber subscriber2 = new NumberSubscriber();
        StringSubscriber subscriber3 = new AlphabetSubscriber();
        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        publisher.subscribe(subscriber3);

        Scanner scanner = new Scanner(System.in);
        String input="";

        while(true){
            System.out.print("Enter input : ");
            input=scanner.nextLine();

            if(input.equalsIgnoreCase("esc"))
                 break;

            publisher.publish(input);

        }
        scanner.close();

    }
}
