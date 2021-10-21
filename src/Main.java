
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String str = "         ";
        char[]ch = str.toCharArray();


        //massiv
        char[][] arr = new char[3][3];
        int count = 0;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = ch[count];
                count++;
            }
        }

        //output1
        System.out.println("---------");
        System.out.println("| " + arr[0][0] + " " + arr[0][1] + " " + arr[0][2] + " |");
        System.out.println("| " + arr[1][0]+ " " + arr[1][1] + " " + arr[1][2] + " |");
        System.out.println("| " + arr[2][0]+ " " + arr[2][1] + " " + arr[2][2] + " |");
        System.out.println("---------");


        // coordinates
        System.out.print("Enter the coordinates: ");
        boolean isCord1 = false;
        boolean isOccupied = false;
        int cord1;
        int cord2;
        int cord3;
        int cord4;
// peremennye
        boolean xWin = false;
        boolean oWin = false;
        boolean hasNull = false;
        boolean impossible = false;
        boolean draw = false;
        int loopCount = 0;
        int turn = 0;
        //loop
        while (isCord1 == false) {

            loopCount++;

            if (arr[0][0] == 'X' && arr[0][1] == 'X' && arr[0][2] == 'X'||
                    arr[1][0] == 'X' && arr[1][1] == 'X' && arr[1][2] == 'X' ||
                    arr[2][0] == 'X' && arr[2][1] == 'X' && arr[2][2] == 'X'||
                    arr[0][0] == 'X' && arr[1][0] == 'X' && arr[2][0] == 'X'||
                    arr[0][1] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X'||
                    arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X'||
                    arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X'||
                    arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X') {
                xWin = true;
                System.out.println("X wins");
                isCord1 = true;
                break;
            }

            if (arr[0][0] == 'O' && arr[0][1] == 'O' && arr[0][2] == 'O'||
                    arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O' ||
                    arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O'||
                    arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O'||
                    arr[0][1] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O'||
                    arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O'||
                    arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O'||
                    arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O') {
                oWin = true;
                System.out.println("O wins");
                break;
            }
            if (xWin == false && oWin == false && turn == 9) {
                draw = true;
                System.out.println("Draw");
                break;
            }
            cord1 = sc.nextInt();
            System.out.print("");
            cord2 = sc.nextInt();
            if ((cord1  == 1 || cord1  == 2 || cord1  == 3) && (cord2  == 1 || cord2  == 2 || cord2  == 3)) {
                if (arr[cord1-1][cord2-1] == ' ') {
                    if(turn % 2 == 0){
                        arr[cord1-1][cord2-1] = 'X';
                    }
                    else {
                        arr[cord1-1][cord2-1] = 'O';
                    }
                    turn++;
                }
                else {
                    System.out.println("This cell is occupied! Choose another one!");
                    System.out.print("Enter the coordinates: ");
                    continue;
                }
            }
            else if ((cord1 < 1 || cord1 > 3) || (cord2 < 1 || cord2 > 3)) {
                System.out.println("Coordinates should be from 1 to 3!");
                System.out.print("Enter the coordinates: ");
                continue;
            }
            else {
                System.out.println("You should enter numbers!");
                System.out.print("Enter the coordinates: ");
                continue;
            }
            System.out.println();
            System.out.println("---------");
            System.out.println("| " + arr[0][0] + " " + arr[0][1] + " " + arr[0][2] + " |");
            System.out.println("| " + arr[1][0]+ " " + arr[1][1] + " " + arr[1][2] + " |");
            System.out.println("| " + arr[2][0]+ " " + arr[2][1] + " " + arr[2][2] + " |");
            System.out.println("---------");
        }
        //output2





        int countO = 0;
        int countX = 0;
        for (char z : ch){
            if(z == 'X') {
                countX++;
            }
            else if (z == 'O') {
                countO++;
            }
        }

        if (arr[0][0] == 'X' && arr[0][1] == 'X' && arr[0][2] == 'X'||
                arr[1][0] == 'X' && arr[1][1] == 'X' && arr[1][2] == 'X' ||
                arr[2][0] == 'X' && arr[2][1] == 'X' && arr[2][2] == 'X'||
                arr[0][0] == 'X' && arr[1][0] == 'X' && arr[2][0] == 'X'||
                arr[0][1] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X'||
                arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X'||
                arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X'||
                arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X') {
            xWin = true;
        }
        if (arr[0][0] == 'O' && arr[0][1] == 'O' && arr[0][2] == 'O'||
                arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O' ||
                arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O'||
                arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O'||
                arr[0][1] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O'||
                arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O'||
                arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O'||
                arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O') {
            oWin = true;
        }
        if (xWin == false && oWin == false) {
            for (char x : ch) {
                if (x == '_') {
                    hasNull = true;
                }
            }
        }
        if (Math.abs(countX - countO) > 1 || xWin == true && oWin == true) {
            impossible = true;
        }
        if (xWin == false && oWin == false && hasNull == false && impossible == false) {
            draw = true;
        }


        if (xWin == true && oWin == false && hasNull == false && impossible == false){
            System.out.println("X wins");
        }
        else if (xWin == false && oWin == true && hasNull == false && impossible == false){
            System.out.println("O wins");
        }
        else if (xWin == false && oWin == false && hasNull == true && impossible == false){
            System.out.println("Game not finished");
        }
        else if (xWin == false && oWin == false && impossible == true || xWin == true && oWin == true){
            System.out.println("Impossible");
        }
        else {
            System.out.println("Draw");
        }


    }
}
