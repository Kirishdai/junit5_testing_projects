package Krish.learning;

/**
 * A simple utility class to reverse a given string.
 */
public class ReverseString {

    /**
     * Reverses the characters of the input string.
     *
     * @param str the string to reverse
     * @return a new string with characters in reverse order
     */
    public String reverseString(String str) {

        // Convert the input string to a character array
        char[] charArray = str.toCharArray();

        // Initialize two pointers: one at the start, one at the end
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters from both ends moving toward the center
        while (left < right) {
            // Store left character in a temporary variable
            char temp = charArray[left];

            // Swap left and right characters
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers inward
            left++;
            right--;
        }

        // Convert the reversed character array back to a string and return it
        return new String(charArray);
    }
}
