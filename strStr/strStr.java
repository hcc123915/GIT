public int strStr(String source, String target){
	if(source == null || target == null){
		return -1;
	}
	else if(target.length() == 0){
		return 0;
	}
	int l1 = source.length();
	int l2 = target.length();
	for(int i = 0 ; i < l1 - l2 + 1; i++){
		for(int j = 0; j < l2 && source.charAt(i + j) == target.charAt(j); j++){
			if(j == l2 - 1){
				return i;
			}
		}
	}
	return -1;
}

/*public class findstr{
	public static void main(String[] args){
		String a = "Hello indexof()";
		String b = "of";
		findstr(a,b);
	}
	public static void findstr(String str1, String str2){
		int mark = 0;
		for(int i = 0; i < str1.length(); i++){
			for(int j = 0; j < str2.length(); j++){
				if(str1.charAt(i+j) != str2.charAt(j)){
					break;
				}
				if((j+1) == str2.length()){
					mark++;
					System.out.println("µÚ"+(i+1));		
				}
				
			}
		}
	System.out.println("char!"+"共找到"+mark+"个结果");
	}
}*/