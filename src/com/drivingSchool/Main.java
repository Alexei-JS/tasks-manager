package com.drivingSchool;

import com.drivingSchool.API.consoleAPI;

class Main {
    public static void main(String[] args) {
    	System.out.println(introduction);
    	System.out.println("Для начала функционирования бота введите команду `/start`\n");

		boolean isRunning = true;
		while (isRunning) {
			System.out.print("> ");
			String request = scanner.nextLine().stripTrailing();

			if (botActionTable.containsKey(request)) {
				isRunning = botActionTable.get(request).execute();
			} else {
				System.out.println("Бот не знает команду " + request);
			}
		}
	}
}