package in.oop.overloading;

public class Addition {
		public void add(int a,int b){
			System.out.println(a+b);
		}
		public void add(int a,int b,int c){
			System.out.println(a+b);
		}
		public void add(float a,int b){
			System.out.println(a+b);
		}public void add(int a,double b){
			System.out.println(a+b);
		}
		public static void main(String [] args){
			Addition x= new Addition();
			x.add(3,7);
			x.add(6,5,4);
			x.add(3f,7);
			x.add(3,7f);
		}
      
	}


