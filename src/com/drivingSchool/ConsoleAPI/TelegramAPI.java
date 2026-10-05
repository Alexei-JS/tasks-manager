package com.drivingSchool.ConsoleAPI;

import java.util.Scanner;
import java.util.Map;


public class TelegramAPI
{
	private static String  introduction = "Здравствуйте! Я — консольный бот автошколы.\n" +
				"Я помогу вам записаться на курс, узнать расписание и посмотреть статистику.\n" +
				"Введите /help, чтобы увидеть список доступных команд.";
	
	private static final Map<String, BotAction> botActionTable = Map.of(
            "/start", TelegramAPI::startBot,
			"/help", TelegramAPI::helpBot,
			"/deleteBot", TelegramAPI::deleteBot,
			"/enroll", TelegramAPI::enrollBot,
			"/stats", TelegramAPI::statsBot,
			"/schedule", TelegramAPI::scheduleBot
	);
	
	private static Scanner scanner = new Scanner(System.in);
	
	
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
	
	public static boolean startBot() {
		System.out.println(introduction);
		/* Основная логика бота */
		return true;
	}
	
	public static boolean helpBot() {
		System.out.println("Доступные команды:\n" + "/help      — показать список команд\n" + "/start     — приветствие и краткая информация о боте\n" + 
			"/enroll    — записаться на курс (анкета курсанта)\n" + "/stats     — статистика по записанным курсантам\n" + "/schedule  — расписание занятий\n" + 
			"/deleteBot — завершить работу бота\n");
		return true;
	}
	
	public static boolean deleteBot() {
		scanner.close();
		System.out.println("Телеграмм бот завершил свою работу.\nДо скорых встреч!");
		return false;
	}
	
	public static boolean enrollBot() {

		return true;
	}

	public static boolean statsBot() {

		return true;
	}

	public static boolean scheduleBot() {

		return true;
	}
}
