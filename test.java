int age;
while(true){
    System.out.print("Введите возраст: ");
    String input = scanner.nextLine().stripTrailing();

    if (input.matches("[0-9]+")) {
        age = Integer.parseInt(input);
        break;
    } else {
        System.out.println("Введите возраст как целое число лет");
    }
}