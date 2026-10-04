public static void main(String[] args) {
		System.out.println(introduction);
		String request = scanner.nextLine().stripTrailing();
		
		while (!request.equals("/start")) {
			System.out.println("Для начала функционирования бота введите команду `/start`");
			request = scanner.nextLine().stripTrailing();
		}
		botActionTable.get(request).execute();
	}



    

public static void main {
    System.out.println(introduction);
    System.out.println("Для начала функционирования бота введите команду `/start`");

    while(isRunning){
        String request = scanner.nextLine().stripTrailing();
        if (botActionTable.containsKey(request)){
            botActionTable.get(request).execute();
        }
        else{System.out.println("Бот не знает команду ") + request;}
    }
}