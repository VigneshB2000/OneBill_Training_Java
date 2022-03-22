package com.testyantra.corejava.casting;

public class Group {

	public static void main(String[] args) {
		User user = new Admin("Vignesh" , 7598532136l);
		user.chat();
		user.videocall();
		
		Admin admin = (Admin) user;
		admin.addUser("Raja", 9876543210l);
		admin.RemoveUser("Goku", 1234356678l);
		

	}

}
