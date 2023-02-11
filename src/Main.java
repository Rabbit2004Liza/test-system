import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printHelloMessage();

        try {Thread.sleep(10000);} catch (Exception e) {}

         Question[] questions = Main.initQuestionsAndAnswers();
         int usersScore = 0;


            for (int i = 0; i < questions.length; i++) {

                questions[i].printQuestionAndAnswerOptions();
                 int usersAnswer = scanner.nextInt();
                if (usersAnswer==questions[i].getRightAnswer())
                    usersScore++;
        }
            printResult(usersScore);
    }






    public static Question[] initQuestionsAndAnswers(){
        Question[] questions = new Question[10];

        questions[0] = new Question(1,"Кто проживает на дне океана ?",
                new Answer[]{new Answer("СкубиДу",false),new Answer("Губка Боб Квадратные Штаны",true),
                        new Answer("Человек Паук",false),new Answer("Гомер Симсон",false)});
        questions[1] = new Question(2,"Каким животным является Сквидвард ?",
                new Answer[]{new Answer("Кальмар",false),new Answer("Каракатица",false),
                        new Answer("Осминог",true),new Answer("Медуза",false)});
        questions[2] = new Question(3,"Как зовут мистера Крабса ?",
                new Answer[]{new Answer("Юджин",true),new Answer("Алан",false),
                        new Answer("Виктор",false),new Answer("Шелдон",false)});
        questions[3] = new Question(4,"Где Мистер Крабс чаще всего хранит секретную формулу краксбургеров ?",
                new Answer[]{new Answer("Под кроватью",false),new Answer("Под своим матрацом",false),
                        new Answer("В полу своего ресторана под одной из досок ",false),new Answer("В сейфе ресторана Красти Крабс",true)});
        questions[4] = new Question(5,"Какого цвета платье у Перл ?",
                new Answer[]{new Answer("Фиолетовое",false),new Answer("Бежевое",false),
                        new Answer("Розовое",true),new Answer("Голубое",false)});
        questions[5] = new Question(6,"Каким боевым искуссивом владеет Сэнди ?",
                new Answer[]{new Answer("Айкидо",false),new Answer("Карате",true),
                        new Answer("Тхэквандо",false),new Answer("Самбо",false)});
        questions[6] = new Question(7,"Костюм какого героя Губка Боб надел на Хэллуин, тем самым разлзлив этого персонажа ?",
                new Answer[]{new Answer("Пирата Пэтчи",false),new Answer("Попугая Потти",false),
                        new Answer("Нептуна",false),new Answer("Летучего Голландца",true)});
        questions[7] = new Question(8,"Как зовут сестру Патрика ?",
                new Answer[]{new Answer("Сэм",true),new Answer("Гэрри",false),
                        new Answer("Маргаретт",false),new Answer("Херб",false)});
        questions[8] = new Question(9,"Как известно Планктон использовал личности многих персонажей,\n" +
                "чтобы получить секретную формулу краксбургеров.\n" +
                "Личность кого из нижеперечисленных Планктон не использовал ?",
                new Answer[]{new Answer("Сквидвард",true),new Answer("Мистер Крабс",false),
                        new Answer("Сэнди",false),new Answer("Прабабушка Губки Боба",false)});
        questions[9] = new Question(10,"В одной из серий Гэрри предал Губку Боба и отправился жить к Патрику,\n" +
                "но впоследствии улитка всё равно вернулась к своему истинному хозяину.\n" +
                "По какой причине Гэрри ушёл от Боба ?",
                new Answer[]{new Answer("Губка Боб сильно обидел Гэрри",false),new Answer("Гэрри хотел заполучить печенье из кармана патрика",true),
                        new Answer("Гэрри понравился новый воздушный шарик Патрика, который тот принёс из парка развлечений",false),new Answer("Гэрри надоел тот факт, что Спанч Боб проводит с ним мало времени",false)});
       return questions;
    }
    public static void printHelloMessage() {
        System.out.println("Добро пожаловать в клуб любителей Спанч Боба\n" +
                "Сегодня мы проверим ваши знания об этом мультфильме\n" +
                "Вам предстоит ответить на 10 вопросов\n" +
                "В каждом из них ровно один верный вариант ответа\n" +
                "Закончив тестирование Вы узнаетие свой результат\n" +
                "Удачи!");
        System.out.println();
        System.out.println();
    }

    public static void printResult(int result){
        if (result<5)
            System.out.println("Видимо вы совсем забыли свой любимый мультфильм\n" +
                    "Думаю, Вам стоит пересмотреть все серии сначала\n" +
                    "Ваш результат: "+result);
        if ((result>=5)&&(result<=7))
            System.out.println("Вы неплохо знакомы с Гугбкой Бобом, но явно забыли некоторых его друзей\n" +
                    "Когда будет свободноe время, посмотрите новые сезоны мультфильма\n" +
                    "Ваш результат: "+result);
        if (result>7)
            System.out.println("Вы настоящий эксперт в области Губки Боба !\n" +
                    "Ваш результат: "+result);
    }
}