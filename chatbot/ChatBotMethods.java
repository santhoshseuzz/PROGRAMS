package chatbot;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ChatBotMethods {
    Stack<ChatBotData> layerSelection = new Stack<ChatBotData>();
    Scanner scan = new Scanner(System.in);
    int count;

    void start() {
        int choice;
        layerSelection.push(new ChatBotData(0, 0));
        print(0, 0);
        do {
            System.out.print("\nEnter your Choice :: ");
            choice = scan.nextInt();
            if (choice == 9) {
                layerSelection.pop();
                if (layerSelection.isEmpty()) {
                    break;
                }
            } else {
                layerSelection.push(new ChatBotData(choice, layerSelection.peek().getLayer() + 1));
            }
            ChatBotData top = layerSelection.peek();
            print(top.getChoice(),top.getLayer());

        } while (choice != 0);
        System.out.println(Layer1.Exit);
    }

    //printing the choice ..to choose....
    void print(int choice, int layer) {
        for (String printChoice : getChoice(layer, choice)) {
            System.out.println(printChoice);
        }

    }


    ArrayList<String> getChoice(int layer, int choice) {
        ArrayList<String> showList = new ArrayList<>();

        //plan layer
        if (layer == 0) {
            showList.add(Layer1.OUTPUT.toString());
            showList.add(Layer1.CHOICE_1.toString());
            showList.add(Layer1.CHOICE_2.toString());
            showList.add(Layer1.CHOICE_X.toString());
        } else if (layer == 1) {
            switch (choice) {
                //basic plan..
                case 1:
                    showList.add(LayerA2.OUTPUT.toString());
                    showList.add(LayerA2.CHOICE_1.toString());
                    showList.add(LayerA2.CHOICE_2.toString());
                    showList.add(LayerA2.CHOICE_BACK.toString());
                    showList.add(LayerA2.CHOICE_X.toString());
                    count = 0;
                    break;

                // vip plan...
                case 2:
                    showList.add(LayerB2.OUTPUT.toString());
                    showList.add(LayerB2.CHOICE_1.toString());
                    showList.add(LayerB2.CHOICE_2.toString());
                    showList.add(LayerB2.CHOICE_3.toString());
                    showList.add(LayerB2.CHOICE_BACK.toString());
                    showList.add(LayerB2.CHOICE_X.toString());
                    count = 1;
                    break;
            }
        }
        else if (layer == 2) {
            if (count == 0) {
                switch (choice) {
                    //basic english category
                    case 1:
                        showList.add(LayerA3.OUTPUT.toString());
                        showList.add(LayerA3.CHOICE_1.toString());
                        showList.add(LayerA3.CHOICE_2.toString());
                        showList.add(LayerA3.CHOICE_BACK.toString());
                        showList.add(LayerA3.CHOICE_X.toString());
                        break;
                     //basic tamil category
                    case 2:
                        showList.add(LayerB3.OUTPUT.toString());
                        showList.add(LayerB3.CHOICE_1.toString());
                        showList.add(LayerB3.CHOICE_2.toString());
                        showList.add(LayerB3.CHOICE_BACK.toString());
                        showList.add(LayerB3.CHOICE_X.toString());
                        break;
                }
            }
            if (count == 1) {
                switch (choice) {
                    //vip english category
                    case 1:
                        showList.add(LayerA3.OUTPUT.toString());
                        showList.add(LayerA3.CHOICE_1.toString());
                        showList.add(LayerA3.CHOICE_2.toString());
                        showList.add(LayerA3.CHOICE_3.toString());
                        showList.add(LayerA3.CHOICE_BACK.toString());
                        showList.add(LayerA3.CHOICE_X.toString());
                        break;
                    //vip tamil category..
                    case 2:
                        showList.add(LayerB3.OUTPUT.toString());
                        showList.add(LayerB3.CHOICE_1.toString());
                        showList.add(LayerB3.CHOICE_2.toString());
                        showList.add(LayerB3.CHOICE_3.toString());
                        showList.add(LayerB3.CHOICE_BACK.toString());
                        showList.add(LayerB3.CHOICE_X.toString());
                        break;
                }
            }
        }
        return showList;
    }

}
