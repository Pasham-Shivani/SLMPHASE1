package phase1_Assistedpractice;
public class InnerClass2 {

		 private String msg="Welcome to Java"; 
			 
			 class Inner{  
			  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
			 }  


			public static void main(String[] args) {

				InnerClass2 obj=new InnerClass2();
				InnerClass2.Inner in=obj.new Inner();  
				in.hello();  
			}
		}

