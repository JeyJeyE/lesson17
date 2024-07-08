package com.zadachadz.les14.train;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		ArrayList<Train> tr = new ArrayList<>();
		masTrain(tr);
		
		Station station = new Station(tr);
        station.sortOfNumber(tr);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер поезда: ");
        int trainNumber = scanner.nextInt();
        station.printTrainInfoByNumber(tr, trainNumber);
        station.sortOfDestinationAndTime(tr);
    }

	public static ArrayList<Train> masTrain(ArrayList<Train> tr){
		tr.add(new Train("Моcква", 288, "12:30"));
		tr.add(new Train("Рига", 693, "07:15"));
		tr.add(new Train("Киев", 859, "23:00"));
		tr.add(new Train("Варшава", 233, "15:45"));
		tr.add(new Train("Варшава", 256, "14:50"));
		
		return tr;

	}
}
