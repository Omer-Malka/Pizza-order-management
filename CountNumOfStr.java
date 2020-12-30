/*
 * Name : Omer Malka
 * Id : 318766730 
 */

package H_W_3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CountNumOfStr implements Runnable {

	private String word;
	private String fileName;
	private	int count =0 ;
	
	
	public CountNumOfStr(String fileName, String word) {
		this.fileName = fileName;
		this.word = word;
	}
	
	

	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}




	public void run() {
		try (RandomAccessFile f = new RandomAccessFile(fileName, "r")) {
			//Search the word in the File
			while (f.getFilePointer() < f.length()) {
				String temp = f.readLine();
				String temps[] = temp.split(" "); 
				for (int i = 0; i < temps.length; i++) {
					if(temps[i].equals(word)) {
						count++;
					}
				}
			}
			System.out.println(
					"\nIn the '" + fileName + "' article there are " + count + " times the word '" + word + "'");
			

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
