import java.util.Random;
public class dice
{
	public static void main(String[] args) {
	    Random dice = new Random();
	    int num;
	    for (int i=0;i<10;i++){
		num = 1 + dice.nextInt(6);
		System.out.println(num);
	    }
	}
}
