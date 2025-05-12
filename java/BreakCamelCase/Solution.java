public class Solution {
    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (i > 0 && Character.isUpperCase(current)) {
                char prev = input.charAt(i - 1);

                // Case 1: Uppercase after lowercase or symbol → start of new word
                if (!Character.isUpperCase(prev)) {
                    result.append(" ");
                }

                // Case 2: If current is uppercase AND next is lowercase,
                // and we're in a group of caps → new word is starting
                else if (
                    i + 1 < input.length() &&
                    Character.isLowerCase(input.charAt(i + 1))
                ) {
                    result.append(" ");
                }
            }

            result.append(current);
        }

        return result.toString();
    }
}


/*
 * 1. Create new string
 * 2. Iterate through input to find where next letter is uppercase letter
 * 3. Keep adding the current character to the new stringbuilder
 * 4. As long as we havent gone out of bounds, when we find that the next char
 * is uppercase
 * 5. We add a space there
 * 6. Return the new string
 */
