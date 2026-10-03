package com.drivingSchool.Information;


import java.util.List;
import java.util.Scanner;
import java.util.Map;


public class LoginManager {
	public static void main(String[] args) {
		LoginManager.completeInfoForm();
	}
	
	/**
	 * При вызове данного метода в консоли пользователю будут задаваться вопросы для
	 * заполнения формы. Вся полученная информация будет перенесена в конкретный
	 * объект студента автошколы. Механизм будет синхронных, т.е. вопрос - ожидание
	 * ответа.
	 * 
	 * @return: Значение успешного/неуспешного заполнения пользователем формы.
	 * @throws: Возможно при некорректном заполнении формы будет возбуждено
	 *                   исключение.
	 */
	public static boolean completeInfoForm() {
		Scanner scanner = new Scanner(System.in);
		StringBuilder answer = new StringBuilder();

		DataQuestions.TYPING_QUESTIONS.forEach((question, typeAnswer) -> {
			System.out.print(question);
			
			answer.setLength(0);
			answer.append(scanner.nextLine().stripTrailing());
            
			System.out.println(answer);
		});

		return true;
	}

}

/**
 * Данный класс будет вспомогательный и содержать вопросы для заполнения анкеты
 * на курсанта.
 * 
 * @QUESTIONS - список вопросов к курсанту (final - привязка имени к списку,
 *            List.of - массив фикс.длины)
 * 
 * @TYPING_QUESTIONS - словарь вопросов, который в ключе хранит вопрос, а в
 *                   значении тип данных ответа.
 */
class DataQuestions {
	public static final List<String> QUESTIONS = List.of(
	/* Заполнить список вопросов к курсанту для заполнения анкеты */
	);

	/* Заполняем в формате ключ значение, но все через запятую нечет - ключи, а чет - значения */
	public static final Map<String, Class<?>> TYPING_QUESTIONS = Map.of(
        "Введи свое ФИО через пробелы --> ", String.class,
        "Введи количесто полных лет --> ", Integer.class,
        "Получена ли справка от медкомиссии? (да/нет) --> ", String.class
	);
}
