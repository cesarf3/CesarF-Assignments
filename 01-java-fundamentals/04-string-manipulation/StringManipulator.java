public class StringManipulator {
    public String trimAndConcat(String word, String wordTwo){
        //Trim both input strings and then concatenate them. Return the new string. Feel free to use the trim method of the String class.
        String newString = word.trim() + wordTwo.trim();
        return newString;
    }
    //Integer getIndexOrNull(String, char): Get the index of the character and return either the index or null. If the character appears multiple times, return the first index. Feel free to use the indexOf method of the String class.
    public Integer getIndexOrNull(String phrase, char a){
        if (phrase.indexOf(a) > -1){
            return phrase.indexOf(a);
        }
        else {
            return null;
        }
    }

    //Integer getIndexOrNull(String, String): Get the index of the start of the substring and return either the index or null. Feel free to use the indexOf method of the String class.
    public Integer getIndexOrNull(String phrase, String phraseTwo){
        if (phrase.indexOf(phraseTwo) > -1){
            return phrase.indexOf(phraseTwo);
        }
        else {
            return null;
        }
    }

    //String concatSubstring(String, int, int, String): Get a substring using a starting and ending index, and concatenate that with the second string input to our method. Feel free to use the substring method of the String class.
    public String concatSubstring(String phrase, int num, int numTwo, String phraseTwo){
        String var = phrase.substring(num, numTwo);
        return var.concat(phraseTwo);
    }
}