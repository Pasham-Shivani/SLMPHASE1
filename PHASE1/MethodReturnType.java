package phase1_Assistedpractice;
public class MethodReturnType {
		public int multipynumbers(int a,int b) {
			int z=a*b;
			return z;
		}

		public static void main(String[] args) {

			MethodReturnType m=new MethodReturnType();
			int result= m.multipynumbers(10,3);
			System.out.println("Multipilcation is :"+result);
			}

	}


