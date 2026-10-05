## [Unreleased] - 2026-10-05

### Добавлено
- **`TelegramAPI.java`**: поле `introduction` — приветствие при запуске.
- **`TelegramAPI.java`**: команды `/start`, `/help`, `/deleteBot` с реальной логикой.
- **`TelegramAPI.java`**: заглушки методов `enrollBot`, `statsBot`, `scheduleBot`.
- **`TelegramAPI.java`**: регистрация команд `/enroll`, `/stats`, `/schedule` в `botActionTable`.
- **`Student.java`**: класс-сущность курсанта (ФИО, возраст, категория, справка).
- **`TelegramAPI.java`**: заглушки `enrollBot`, `statsBot`, `scheduleBot`.
- **`EnrollmentForm.java`**: класс-анкета, вынесен из TelegramAPI.

### Изменено
- **`TelegramAPI.java`**: `main` переработан в бесконечный цикл с флагом `isRunning`.
- **`TelegramAPI.java`**: добавлена безопасная проверка наличия команды через `botActionTable.containsKey(...)`.
- **`TelegramAPI.java`**: `helpBot()` выводит список доступных команд.
- **`TelegramAPI.java`**: `deleteBot()` возвращает `false` и корректно завершает цикл.
- **`TelegramAPI.java`**: `enrollBot` делегирует в `EnrollmentForm`.
- **`TelegramAPI.java`**: добавлено поле `students: List<Student>`.

### Исправлено
- **`TelegramAPI.java`**: `System.out.printIn` → `System.out.println`.
- **`TelegramAPI.java`**: `boolean isRunning = True` → `true` (регистр).