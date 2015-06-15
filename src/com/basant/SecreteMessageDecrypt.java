package com.basant;


import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SecreteMessageDecrypt {

	public static void main(String args []){
	
		
	
	   
		SecreteMessageDecrypt obj = new SecreteMessageDecrypt();
		
		String msg = "1 2 3 # 1 . _ # 22 # 25 1 9 _ 10";
		msg = obj.decryptMessage(msg);
		System.out.println(msg);
	}
	
	
	/*
	 * Receive A Encrypted Message And DecryptE Message
	 * 
	 * ##### DecryptE Rules
	 * 
	 * Eg :  1 2 3 #1 . _ # 22 # 25 1 9 _ 10
	 * 
	 * output : ABC1 2225AI J
	 * 
	 * 1) Space should me remove
	 * 2) Underscore(_) will consider as space
	 * 3) # symbol denotes that next numeric digits will print without any changes
	 * 4) Digits will replace with upper case alphabets
	 * Eg : 1 - A
	 *     2 - B
	 *     
	 *  Modification must be done within same string   
	 */
	
	public String decryptMessage(String msg){
		
		String words [] = {
							"A","B","C","D","E",
							"F","G","H","I","J",
							"K","L","M","N","O",
							"P","Q","R","S","T",
							"V","U","W","X","Y",
							"Z"
				          };
		
		String str [] = msg.split(" ");
		msg = "";
		boolean isNum = false;
		
		for(int i=0;i<str.length;i++){
			
			if(isNum){
				msg = msg+str[i];
				isNum = false;
			}
			else if(str[i].equals("#")){
				
				isNum = true;
				continue;
			}else if(str[i].equals("_")){
				msg = msg+" ";
			}
			else{
				  try{
					    Integer num  = Integer.parseInt(str[i]);
					    msg = msg + words[num-1];
				  }catch(Exception e){
					  msg = msg + str[i];
				  }
			}
		}
		return msg;
	}
}
