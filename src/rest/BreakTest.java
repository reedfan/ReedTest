package rest;

/*created by fanqunsong
    Date : 2017/11/22
    Time : 9:49
    */
public class BreakTest {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if(j==3){
                    break;
                }
                System.out.println(i+"*"+j);
            }

        }
    }
}
