package azterketa2;

import java.util.Scanner;

public class azte2 {

	public static void main(String[] args) {
		int i=0;
		
		int a=0;
		
		int kont=0;
		
		while(i==0) {
			
			Scanner sc =new Scanner (System.in); 
			System.out.println("Eman zenbaki bat batazbestekoa egiteko: ");
			int zbk=sc.nextInt();
			
			if(zbk==0) {
				i=1;
			}else {
				a=a+zbk;
				kont++;
			}
			
		}
		
		System.out.println("Zenbakien batazbestekoa hau da:"+(a/kont));
	
	}

}
