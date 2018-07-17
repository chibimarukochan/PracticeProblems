

public class Palindrome
{
	public boolean isPalindrome(String s)
	{
		boolean isPalindrome = false;

		if (s.length() == 0 || s.length() == 1)
			return true;


		String first = "";
		String second = "";

		//before determining if a palindrome is even/odd, must remove special characters
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); //if not alphanumeric characters, 
		//then replace them with an empty string and convert them to lower case
		System.out.println(s); 
		
		
		if (s.length() % 2 == 0)// even
		{
			// then split in half
			first = s.substring(0, s.length() / 2);

			second = s.substring(s.length() / 2);
			System.out.println("Even: " + first + " " + second);
		} else // odd
		{ // then get the middle and split the string left and right
			first = s.substring(0, s.length() / 2);
			second = s.substring(s.length() / 2 + 1);
			System.out.println("Odd: " + first + " " + second);
		} // end if-else

		for (int i = 0; i < first.length(); i++)
		{

			// check 1st half and 2nd half are the same
			if (first.charAt(i) == second.charAt(first.length() - 1 - i))
			{
				//keep saying it's a palindrome
				isPalindrome = true;
			}
			else
				return false;//exit out of the loop and return false
		} // end for loop

		return isPalindrome;
	}

	public static void main(String[] args)
	{
		Palindrome p = new Palindrome();

		if (p.isPalindrome("A man, a plan, a canal. Panama!"))
			System.out.println("It's a palindrome.");
		else
			System.out.println("It's not a palindrome.");

	}

}
