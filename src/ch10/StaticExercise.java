package ch10;

public class StaticExercise {
	 int i ;
	 public StaticExercise() {
		 {
			 i = 5+2;
		 }
	}
	 public StaticExercise(int i){
		i = this.i;
	}
	public static void main(String[] args) {
		/*
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("java.version"));
		*/
		StaticExercise nesne = new StaticExercise();
		System.out.println(nesne.i);
		
		for(int i = 0; i > -1;i ++ ) {
			StaticExercise array [] ;
			
		}
		System.out.println("asd");
	}
}
