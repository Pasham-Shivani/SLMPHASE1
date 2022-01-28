package phase1_Assistedpractice;
 class DefSpecifier {
	void display() 
    { 
        System.out.println("You are using defalut access specifier"); 
    } 
} 

public class DefaultSpecifier  {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		DefSpecifier obj = new DefSpecifier(); 		  
       obj.display(); 
}
}
