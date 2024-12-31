package student;

public class Student {
	String nom;
	float note1;
	float note2;
public float calcmoy(float note1,float note2) {
	return (note1+note2)/2;
	
}
public void show(String nom,float note1,float note2  ) {
	System.out.println(nom +" "+calcmoy(note1,note2));
	
}
}

