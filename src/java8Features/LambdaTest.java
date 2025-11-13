package java8Features;
@FunctionalInterface
interface  Message{
	void sendMessage();
}

@FunctionalInterface
interface Gift{
	void sendGift(String name);
	
}
public class LambdaTest {
public static void main(String[] args) {

	 Message Whatsapp=new Message() {
		 
		 public void sendMessage() {
			 System.out.println("good morning from whatsapp");
		 }
	 };
	 Whatsapp.sendMessage();
	
	 Message insta=()->System.out.println("gm from ig");
	 insta.sendMessage();
	 
	 //lambda with parameter
	 
	 Gift g1=(name)->{
		 System.out.println("sending gift ..."+name);
		 System.out.println();
	 };
	 
	 g1.sendGift("chocolate");
	 
}
}
