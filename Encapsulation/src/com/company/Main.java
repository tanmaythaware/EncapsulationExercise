package com.company;

public class Main {

    public static void main(String[] args) {
	    //Without Proper Encapsulation
    	//Player player = new Player();
	    //player.name = "T2";
	    //player.health = 20;
	    //player.weapon = "AK-47";
	    //int damage = 10;
	    //player.loseHealth(damage);
	    //player.remainingHealth();
		//player.health = 200;
	    //damage = 11;
	    //player.loseHealth(damage);
	    //player.remainingHealth();

		//With Proper Encapsulation
		EnhancedPlayer player = new EnhancedPlayer("T2",50,"MP-5");
		player.loseHealth(50);
		System.out.println("Remaining Health is " + player.getHealth() + ".");
    }
}
