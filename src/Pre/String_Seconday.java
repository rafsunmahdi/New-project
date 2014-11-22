package Pre;

public class String_Seconday {

	public static void main(String[] args) {
		
		
		String po = ("Hi every body this is our second class home work");
		String po1 = ("Hi");
		String po2 = ("Hi");
		Integer po3 = 4;
		String po4 = ("hi");
		
		
		//Return the first character of a string:
		System.out.println(po.charAt(0));
		
		
		//This method returns the code point value of the character at the index.
		System.out.println(po.codePointAt(1));
		
		//This method returns the Unicode code point value before the given index.
		System.out.println(po.codePointBefore(2));
		
		//This method returns the number of Unicode code points in the specified text range.
		System.out.println(po.codePointCount(1, 8));
		
		//If the Integer is equal to the argument then 0 is returned.

		//If the Integer is less than the argument then -1 is returned.

		//If the Integer is greater than the argument then 1 is returned.
		
		System.out.println(po3.compareTo(3));
		System.out.println(po3.compareTo(4));
		System.out.println(po3.compareTo(5));
		
		
		//This method returns a negative integer, zero, or a positive integer as the specified String is greater than, equal to, or less than this String, ignoring case considerations.
		System.out.println(po.compareToIgnoreCase(po1));
		System.out.println(po1.compareToIgnoreCase(po2));
		
		//String, the length and type of which depend on the input.
		//Returns the length of the array.
		System.out.println(po.concat(po1 + po2));
		
		//This method lets you determine whether or not a string contains another string.
		System.out.println(po.contains("Hi"));
		System.out.println(po.contains("Hi poran"));
		
		//This method returns true if and only if this String represents the same sequence of characters as the specified in StringBuffer, otherwise false.
		System.out.println(po.contentEquals(po1));
		System.out.println(po1.contentEquals(po2));
		
		////System.out.println(po.contentEquals(arg0)(arg0));
		
		
		//This method returns true if the character sequence represented by the argument is a suffix of the character sequence represented by this object; false otherwise. Note that the result will be true if the argument is the empty string or is equal to this String object as determined by the equals(Object) method.
		System.out.println(po.endsWith("work"));
		
		
		//This method returns true if and only if the specified Object is a BigDecimal whose value and scale are equal to this BigDecimal's.
		System.out.println(po.equals(po1));
		System.out.println(po1.equals(po2));
		
		
		//true if the two String objects contain either exactly the same data or if they differ only in case; false otherwise.
		System.out.println(po1.equalsIgnoreCase(po2));
		System.out.println(po2.equalsIgnoreCase(po4));
		
		
		//This method returns -1 if the value to search for never occurs.
		System.out.println(po.indexOf("is"));

	}

}
