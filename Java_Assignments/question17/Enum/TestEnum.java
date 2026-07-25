package Enum;

import java.util.Scanner;

import Enum.enumClass;

public class TestEnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		System.out.println("0.Distinction \n1.First \n2.Second \n"
				+ "3.Pass \n4.Fail");
		System.out.println("Enter Choice:");
		choice=sc.nextInt();
		System.out.println(enumClass.values()[choice]);
		enumClass ch=enumClass.values()[choice];
		switch(ch) {
		case distinction ->{
			System.out.println("You selected Distinction:"+"Minimun:"+ch.getMin()+"Maximum:"+ch.getMax());
		}
		
		case first ->{
			System.out.println("You Selected First:"+"Minimum:"+ch.getMin()+"Maximum:"+ch.getMax());
		}
		
		case second ->{
			System.out.println("You Selected Second:"+"Minimum:"+ch.getMin()+"Maximum:"+ch.getMax());
		}
		
		case pass ->{
			System.out.println("You selected Pass:"+"Minimum:"+ch.getMin()+"Maximum:"+ch.getMax());
		}
		
		case fail ->{
			System.out.println("You selected Fail:"+"Minimum:"+ch.getMin()+"Maximum:"+ch.getMax());
		}
		
		default ->{}
		}
	}
}

