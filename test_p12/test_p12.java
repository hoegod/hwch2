package hwch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test_p12 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
System.out.println("請輸入整數");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int num = Integer.parseInt(br.readLine());
if(num == 7) {
	System.out.println("輸入的是7");

}
else if(num == 5) {
	System.out.println("輸入的是5");
}
else
{
	System.out.println("請輸入7或者5");
}

	}

}
