import java.util.*;
import java.io.*;

public class prob11
	{
	public static void main(String [] args) throws IOException
		{
		ArrayList <String> originalAlphabet = new ArrayList <String>();
		originalAlphabet.add("a");
		originalAlphabet.add("b");
		originalAlphabet.add("c");
		originalAlphabet.add("d");
		originalAlphabet.add("e");
		originalAlphabet.add("f");
		originalAlphabet.add("g");
		originalAlphabet.add("h");
		originalAlphabet.add("i");
		originalAlphabet.add("j");
		originalAlphabet.add("k");
		originalAlphabet.add("l");
		originalAlphabet.add("m");
		originalAlphabet.add("n");
		originalAlphabet.add("o");
		originalAlphabet.add("p");
		originalAlphabet.add("q");
		originalAlphabet.add("r");
		originalAlphabet.add("s");
		originalAlphabet.add("t");
		originalAlphabet.add("u");
		originalAlphabet.add("v");
		originalAlphabet.add("w");
		originalAlphabet.add("x");
		originalAlphabet.add("y");
		originalAlphabet.add("z");
		Scanner file = new Scanner(new File("prob11.txt"));
		int testCase = file.nextInt();
		file.nextLine();
		for(int i = 0; i < testCase; i++)
			{	
			String task = file.nextLine();
			String alphabet = file.nextLine();
			ArrayList <String> newAlphabet = new ArrayList <String>();
			String [] newAlph = alphabet.split("");
			for(int j = 0; j < newAlph.length; j++)
				{
				newAlphabet.add(newAlph[j]);
				}
			int messageNum = file.nextInt();
			for(int j = 0; j < messageNum; j++)
				{
				String message = file.nextLine().toLowerCase();
				for(int k = 0; k < message.length(); k++)
					{
					if(task.equals("ENCRYPT"))
						{
						int index = originalAlphabet.indexOf(message.substring(k, k+1));
						//message = message.substring(0, k) + newAlphabet.get(index) + message.substring(k);
						//System.out.println(message);
						}
					}
				}
			}
		}
	}
