package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

 public class FlamesCheckService{
	 public char findFlames(String name1,String name2) {
		StringBuilder str = new StringBuilder(name2);
		char temp,temp1;
		int name1Size=name1.length();
		int name2Size=name2.length();
		int totalSize=name1Size+name2Size;
	 
	    for (int index=0; index<name1Size; index++){
	           for (int index1=0; index1<name2Size; index1++){
	        	   temp=name1.charAt(index);
	        	   temp1=str.charAt(index1);
	                 if(temp==temp1) {
	                	 totalSize-=2;
	                	 str.setCharAt(index1, '0');
	                 }
	          }
	    }
	    return checkFlames(totalSize);
	}
	char checkFlames(int size) {
		int start=0,indexCount,flameCount=0;
	    String tmp;
	    StringBuilder flames = new StringBuilder("flames");
	     while(start<flames.length()) {
	         tmp=Character.toString(flames.charAt(start));
	    	indexCount=flames.indexOf(tmp);
	    	flameCount+=1;
	    	if(flameCount==size){
	    	     flames.deleteCharAt(indexCount);
	    	     start--;
	    	    if(flames.length()==1)
	    	    break;
	    	    else
	    	    flameCount=0;
	    	}
	    	//System.out.print(m);
	    	start++;
	    	if(start==flames.length())
	    	start=0;
	    }
	    
	    return flames.charAt(0);
	}
	 
	    	
	    }
	