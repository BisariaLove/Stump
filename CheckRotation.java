class CheckRotation{


	public boolean isRotated(String s1, String s2){

		int len = s1.length();
		if((len != 0) && (len == s2.length())){
			s1 = s1+s1;
			if(s1.indexOf(s2) != -1){
				return true;
			}
		}

		return false;
	}
	
	public static void main(String[] love){

		CheckRotation obj = new CheckRotation();
		boolean retval = obj.isRotated("abcd", "erbottlewat");

		if(true == retval){
			System.out.println("Rotated");
		}
		else{
			System.out.println("Not Rotated");
		}

	}
}