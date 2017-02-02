package data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;

import org.eclipse.jetty.security.PropertyUserStore.UserListener;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import com.thoughtworks.selenium.webdriven.commands.GetAlert;

import pages.SignUpPage;
import util.Verification;

public class CSVReader {

	// User u= new User(User.getFirstName(), User.getLastName(),
	// User.getNickName(), User.getEmail(), User.getPassword(),
	// User.getPasswordRepeat());
	public ArrayList<User> signUpOK() {

		String csvFile = "lib/MustPass201.csv";

		ArrayList<User> okUserList= new ArrayList<>();
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";
		User u= new User();
		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				String[] user = line.split(csvSplitBy);
				u.setFirstName(user[0]);
				u.setLastName(user[1]);
				u.setNickName(user[2]);
				u.setEmail(user[3]);
				u.setPassword(user[4]);
				u.setPasswordRepeat(user[5]);
			
		
				
			
			

				

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return ;

	}

	public static ArrayList<User> csvBadRequest() {

		ArrayList<User> badUserList = new ArrayList<>();
		String csvFile = "lib/MustNotPass400.csv";

		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";
		User badUser = null;

		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				String[] user = line.split(csvSplitBy);

				badUser = new User(user[0], user[1], user[2], user[3], user[4], user[5]);
				badUserList.add(badUser);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return badUserList;
	}

	public static ArrayList<User> csvConflict() {

		String csvFile = "lib/MustNotPass409.csv";
		ArrayList<User> conflictUserList = new ArrayList<>();
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";
		User conflictUser = null;

		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				String[] user = line.split(csvSplitBy);

				conflictUser = new User(user[0], user[1], user[2], user[3], user[4], user[5]);
				conflictUserList.add(conflictUser);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return conflictUserList;
	}

	public static ArrayList<User> csvValidUser() {

		String csvFile = "lib/MustPass201.csv";
		ArrayList<User> okUserList = new ArrayList<>();
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";
	
		
		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				
				String[] user = line.split(csvSplitBy);
				
				 okUserList.add(new User(user[3], user[4]));
				
				
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return okUserList;

	}
	
}