package practice;

public class Mobile {

	Charger charger;
	Mobile(Charger charger){
		this.charger=charger;
	}
	void playGame() {
		System.out.println("battery is low");
		charger.charge();
		System.out.println("lets play pubg");
	}
}
