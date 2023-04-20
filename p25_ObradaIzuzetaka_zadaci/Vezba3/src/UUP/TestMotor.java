package UUP;

import java.util.Scanner;

public class TestMotor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Motor motor=new Motor();
		System.out.println("Unesite marku motora");
		String marka=sc.nextLine();
		System.out.println("Unesite kubikazu motora");
		double kubikaza=sc.nextDouble();
		try {
			motor.setMarka(marka);
			motor.setKubikaza(kubikaza);
			System.out.println(motor.Ispisi());
			
		
		} catch (Izuzetak e) {
			System.out.println("Greška! " + e.getMessage());
		}
	}

}
