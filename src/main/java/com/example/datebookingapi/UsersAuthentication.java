package com.example.datebookingapi;

import java.util.ArrayList;
import java.util.List;

public class UsersAuthentication {
	private static List<Integer> dateHashcodeList = new ArrayList<>();;

	public static void addDateHash(int dateHash) {
		if (!dateHashcodeList.contains(dateHash)) {
			dateHashcodeList.add(dateHash);
		}
	}

	public static boolean authenticate(int dateHash) {

		return dateHashcodeList.contains(dateHash);

	}
}
