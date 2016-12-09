package n1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * Created by liveuser on 09.12.16.
 */
public class drunkgame {

    public static void game(int pl1[], int pl2[]){
        int count = 0;
        ArrayDeque player1 = new ArrayDeque();
        ArrayDeque player2 = new ArrayDeque();

        for (int i = 0; i<5; i++){
            player1.addLast(pl1[i]);
            player2.addLast(pl2[i]);
        }

        while (!player1.isEmpty()&&!player2.isEmpty()&&count<1000000){
            Integer c1 = (Integer) player1.getFirst();
            Integer c2 = (Integer) player2.getFirst();
            if ((c1!=0)&&(c2!=0)&&(c1>c2)){
                player1.addLast(c1);
                player1.addLast(c2);
                player1.removeFirst();
                player2.removeFirst();
            } else if((c1!=0)&&(c2!=0)&&(c1<c2)){
                player2.addLast(c1);
                player2.addLast(c2);
                player1.removeFirst();
                player2.removeFirst();
            } else if(c1 == 0){ if (c2 == 9){
                player1.addLast(c1);
                player1.addLast(c2);
                player1.removeFirst();
                player2.removeFirst();
            } else {
                player2.addLast(c1);
                player2.addLast(c2);
                player1.removeFirst();
                player2.removeFirst();
            }

            } else if(c2 == 0){ if(c1 == 9){
                player2.addLast(c1);
                player2.addLast(c2);
                player1.removeFirst();
                player2.removeFirst();
            } else {
                player1.addLast(c1);
                player1.addLast(c2);
                player1.removeFirst();
                player2.removeFirst();
            }
            }
            /*System.out.println(player1);
            System.out.println(player2);*/
            count++;
        }
        if (player1.isEmpty()){ System.out.println("first");}else if (player2.isEmpty()){System.out.println("second");} else System.out.println("botva");
        System.out.println(count);

    }


    public static void main(String[] args) {
        int pl1[] = new int[]{1, 3, 5, 7, 9};
        int pl2[] = new int[]{2, 4, 6, 8, 0};
        game(pl1, pl2);
    }
}
