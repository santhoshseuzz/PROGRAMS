package interview;

import java.util.Scanner;

public class InterviewMain {
    public static void main(String[] args) {
        InterviewMethod call = new InterviewMethod();
        Scanner get = new Scanner(System.in);
        call.appearedCandidates();

        call.mainHall();
        while(true) {
            System.out.println("Enter 1 to send 3 member in the     waiting room..\nEnter 2 for sending Candidate to get into interview room..");
            int choice = get.nextInt();
            switch (choice){
                 case 1:
                     call.waitingRoom();
                     break;
                case 2:
                    call.interviewRoom();
                    break;
                case 0:
                    System.exit(0);
            }

        }
    }

}

