package Chapter09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionSample {
	public static void main(String[] args) {
		BufferedReader br = null;
		System.out.println("0");
		try{
			br = new BufferedReader(new FileReader("존재하지_않는_파일"));		//예외발생 그 아래는 읽지않음 FileNotFound 예외로 이동
			br.readLine();
			br.close();
			System.out.println("1");
		}
		catch(FileNotFoundException e){
			System.out.println("FileNotFoundException 발생");
			System.out.println("2");
		}
		catch (IOException e){
			System.out.println("IOException 발생");
			System.out.println("3");
		}
		System.out.println("4");
	}
}
