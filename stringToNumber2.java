public int search(String find){
       for (int i = 0; i<tep.length ;i++){
	   if(tep[i].equals(find)){
	     return i;
           }
       }
       return-1
} 