class Solution {
  public static String camelCase(String input) {

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);

      result.append(currentChar);

      if (i + 1 < input.length() - 1) { // Make sure input isnt out of bounds
        char nextChar = input.charAt(i + 1); // Store what the nect character would be
        if (Character.isUpperCase(nextChar)) { // If its uppercas
          result.append(" "); // add a space where we currently are
        }
      }

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