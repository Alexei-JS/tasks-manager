package com.drivingSchool.Information;


import java.util.Scanner;
import java.util.List;


public class LoginManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		if (LoginManager.completeInfoForm(scanner)) {
			scanner.close();
		}
	}
	
	/**
	 * При вызове данного метода в консоли пользователю будут задаваться вопросы для
	 * заполнения формы. Вся полученная информация будет перенесена в конкретный
	 * объект студента автошколы. Механизм будет синхронных, т.е. вопрос - ожидание
	 * ответа.
	 * @scanner: Объекта для считывания ответов пользователя через объект Scanner
	 * 
	 * @return: Значение успешного/неуспешного заполнения пользователем формы.
	 * @throws: Возможно при некорректном заполнении формы будет возбуждено
	 *                   исключение.
	 */
	public static boolean completeInfoForm(Scanner scanner) {
		StringBuilder answer = new StringBuilder();

		for (List<Object> pair : DataQuestions.TYPING_QUESTIONS) {
			System.out.print(pair.get(0));
			
			answer.setLength(0);
			answer.append(scanner.nextLine().stripTrailing());
            
			System.out.println(answer);
		}

		return true;
	}

}

/**
 * Данный класс будет вспомогательный и содержать вопросы для заполнения анкеты
 * на курсанта.
 * 
 * @TYPING_QUESTIONS - список списков. В каждом маленьком списке первое поле - вопрос, второе - тип выхода
 */
class DataQuestions {
	public static final List<List<Object>> TYPING_QUESTIONS = List.of(
        List.of("Введи свое ФИО через пробелы --> ", String.class),
        List.of("Введи количесто полных лет --> ", Integer.class),
        List.of("Получена ли справка от медкомиссии? (да/нет) --> ", String.class)
	);
}
