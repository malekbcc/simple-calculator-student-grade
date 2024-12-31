package student;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Student s1=new Student();
		
		Scanner sc=new Scanner(System.in) ;
		System.out.println("nom");
		String nom=sc.nextLine();
		System.out.println("saisir le note1");
		float note1=sc.nextFloat();
		System.out.println("saisir le note2");
		float note2=sc.nextFloat();
		float moyenn= s1.calcmoy(note1,note2);
		s1.show(nom,note1,note2);


	}

}
