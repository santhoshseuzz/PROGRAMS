package interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class InterviewMethod {
    Scanner get = new Scanner(System.in);
    ArrayList<String> candidates = new ArrayList<>();
    Queue<AttendeeData> attendeeAdd = new LinkedList<>();
    Queue<AttendeeData> waitingAdd = new LinkedList<>();
    Queue<AttendeeData> selectedAdd = new LinkedList<>();
    int regNo = 0, totalAttende = 0;

    void appearedCandidates(){
        candidates.add("Seuzz");
        candidates.add("sandy");
        candidates.add("Riya");
        candidates.add("Priya");
        candidates.add("Ram");
        candidates.add("Tom");
        candidates.add("Jerry");
        candidates.add("Bheem");
        candidates.add("Raju");
        candidates.add("Ajith");
        candidates.add("Gal Gadot");
        candidates.add("Shraddha");
        candidates.add("Britney");
        candidates.add("Chuki");
    }


    void mainHall() {
        while(attendeeAdd.size()!=10){
        AttendeeData queueadd  = new AttendeeData();
//        System.out.print(InterviewConstants.Name);
//        System.out.print(InterviewConstants.Regno);
//        System.out.println(regNo);
        String attendeeName = candidates.get(regNo);
        regNo++;
        queueadd.setNameOfAttendee(attendeeName);
        queueadd.setRegNo(regNo);
        attendeeAdd.add(queueadd);
    }
        System.out.println("Attendee in....Reception....");
        System.out.println("..........................................Main Hall....................................................");
        print(attendeeAdd);
    }
    void waitingRoom() {
        if(waitingAdd.size()<3) {
            while (waitingAdd.size() != 3) {
                Object head = attendeeAdd.remove();
                waitingAdd.add((AttendeeData) head);
            }
        }
        System.out.println(".........................................Waiting room......................................................");
        print(waitingAdd);
    }
    void interviewRoom(){
        Object head = waitingAdd.remove();
        System.out.println("Interview Process................\n1.Selected \n 2.Not Selected");
        int process = get.nextInt();
        totalAttende++;
        if (process == 1) {
            selectedAdd.add((AttendeeData) head);
        }
        if(totalAttende == 5){
            print(selectedAdd);
        }
    }

     void print(Queue Real) {
        Queue<AttendeeData> temp = new LinkedList<>();
        temp = Real;
        for (AttendeeData get : temp) {
            System.out.println("Attendee name :" + get.getNameOfAttendee());
            System.out.println("Roll no       :" + get.getRegNo());
        }
    }
}