class MaximumNumberWords {
    public static int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split("\\s+");
        int count = words.length;

        for (String word : words) {
            for (int i = 0; i < brokenLetters.length(); i++) {
                if (word.indexOf(brokenLetters.charAt(i)) >= 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(canBeTypedWords("satish gupta gupta s n","sg"));
    }
}