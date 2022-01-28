package phase1_Assistedpractice;

public class InnerClass3 {

		private String msg="Inner Classes";

		 void display(){  
			 class Inner{  
				 void msg(){
					 System.out.println(msg);
				 }  
		  }  
		  
		  Inner l=new Inner();  
		  l.msg();  
		 }  

		 
		public static void main(String[] args) {
			InnerClass3 ob=new InnerClass3 ();  
			ob.display();  
			}
		}


