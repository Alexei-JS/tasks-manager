package com.drivingSchool.ConsoleAPI;

import java.util.Scanner;
import java.util.Map;


public class TelegramAPI
{
	private static String  introduction = "...";                      // Начальный текст приветствия ТГ-бота.
	
	private static final Map<String, BotAction> botActionTable = Map.of(
            "/start", TelegramAPI::startBot,
			"/help", TelegramAPI::helpBot,
			"/deleteBot", TelegramAPI::deleteBot
	);
	
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println(introduction);
		String request = scanner.nextLine().stripTrailing();
		
		while (!request.equals("/start")) {
			System.out.println("Для начала функционирования бота введите команду `/start`");
			request = scanner.nextLine().stripTrailing();
		}
		botActionTable.get(request).execute();
	}
	
	public static boolean startBot() {
		System.out.println("Телеграмм бот успешно запушен");
		/* Основная логика бота */
		botActionTable.get("/deleteBot").execute();
		return true;
	}
	
	public static boolean helpBot() {
		return true;
	}
	
	public static boolean deleteBot() {
		scanner.close();
		System.out.println("Телеграмм бот завершил свою работу.\nДо скорых встреч!");
		return true;
	}
	
}
