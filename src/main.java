public class main {
        public static void main(String[] args) {
            // 변수를 선언하고
            int a = 2;
            int b = 3;
            // 사용한다.
            System.out.println(a + b);
            System.out.println(a);
            System.out.println(b);

            String line = "Hello Variables!";
            System.out.println(line);

            // 어떤 데이터를 담을지를 잘 정해주어야 한다.
            int thousand = 1000;
            // 다르면 오류가 발생
            // int ten = "10";

            // 변수를 먼저 만들고
            int date;
            // System.out.println(date); // 오류
            // 값은 나중에 할당할 수 있다.
            date = 10;
            // 단, 할당 전에 사용은 불가

            // 한줄에 두개 이상의 변수를 만들 수 있다.
            int month = 6, day = 20;
            int notGit = 10;
            System.out.println(month);
            System.out.println(day);
        }
    }

