package Chapter09.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\estback\\est_back\\test.txt"))){
			// br.close();	//자동 close 수행 (try-with-resource)
		}catch (IOException e){
			System.out.println(e.getMessage());
		}
		// try {
		// 	br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\estback\\est_back\\test.txt"));
		// 	System.out.println(br.readLine());			//예외발생시 실행 안되는 로직
		//
		// }catch (IOException e){
		// 	e.getMessage();			//예외처리
		// }finally {
		// 	if(br!=null) {
		// 		try {
		// 			br.close();
		// 		} catch (IOException e) {
		//
		// 		}
		// 	}
		//
		// }

	}
}
