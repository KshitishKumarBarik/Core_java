import java.util.Scanner;
public class Digit2Word 
{
    public static void digit2word(int x)
    {
        int num=0;
        String word= "";
        while(x>0)
        {
            num =x%10;
            x/=10;
            switch (num)
             {
                case 0:
                    word=("zero  " + word);
                    
                    break;
                case 1:
                    word=("one  " + word);
                    break;
                case 2: 
                    word=("two  " + word);
                    break;
                case 3:
                    word=("three  " + word);
                    break;
                case 4: 
                    word=("four  " + word);
                    break;
                case 5:
                    word=("five  " + word);
                    break;
                case 6:
                    word=("six  " + word);
                    break;
                case 7 : 
                    word=("seven  " + word);
                    break;
                case 8:
                    word=("eight  " + word);
                    break;
                case 9:
                    word=("nine  " + word);
                    break;
            
                default:
                    break;
            }

        }
        System.out.println("The entered number is "+x);
        System.out.println("Number in Words is "+word);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        digit2word(x);
        sc.close();
    }
}
