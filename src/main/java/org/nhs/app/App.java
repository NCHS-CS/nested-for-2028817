public class App{
    public static void main(String[] args){
        practiceOne();
        System.out.println();
        practiceTwo();
        System.out.println();
        praticeThree();
        System.out.println();
        challenge();
    }
    
    public static void practiceOne(){
        for(int i = 1; i < 6; i++){
            for(int x = 0; x < i; x++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void practiceTwo(){
        for(int x = 1; x <= 5; x++){
            for(int i = 5 - x; i > 0; i--){
                System.out.print(".");
            }
            for(int y = 0; y < x; y ++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
    public static void praticeThree(){
        for(int x = 1; x <= 5; x++){
            for(int i = 5 - x; i > 0; i--){
                System.out.print(".");
            }
            for(int y = 0; y < 1; y++){
                System.out.print(x);
            }
            for(int z = 0; z < x - 1; z++ ){
                System.out.print(".");
            }
            System.out.println();
        }
    }
    public static void challenge(){
        part1();
        part2();
    }
    public static void part1(){
        for(int line = 1; line <= 9; line++){
            for(int space = 9 - line; space > 0; space--){
                System.out.print(" ");
            }
            for(int number = 1; number <= line * 2; number++){
                System.out.print(line);
            }
            System.out.println();
        }
    }
    public static void part2(){
        for(int line = 8; line > 0; line--){
            for(int spaces = 9 - line; spaces > 0; spaces --){
                System.out.print(" ");
            }
            for(int numbers = 1; numbers <= line * 2; numbers++){
                System.out.print(line);
            }
            System.out.println();
        }
    }

}