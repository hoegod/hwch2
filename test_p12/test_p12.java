package hwch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test_p12 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
System.out.println("�п�J���");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int num = Integer.parseInt(br.readLine());
if(num == 7) {
	System.out.println("��J���O7");

}
else if(num == 5) {
	System.out.println("��J���O5");
}
else
{
	System.out.println("�п�J7�Ϊ�5");
}

	}

}
