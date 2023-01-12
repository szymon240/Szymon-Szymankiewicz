import java.util.ArrayList;

final class Shiritori {
    private final ArrayList<String> words;
    private boolean game_over;

    public Shiritori() {
        words = new ArrayList<>();
        game_over = false;
    }

    public Object play(String word) {
        if (game_over) {
            return "game over";
        } else if (words.contains(word)) {
            game_over = true;
            return "game over";
        } else if (words.size() > 0 && word.charAt(0) != words.get(words.size() - 1).charAt(words.get(words.size() - 1).length() - 1)) {
            game_over = true;
            return "game over";
        } else {
            words.add(word);
            return words;
        }
    }

    public String restart() {
        words.clear();
        game_over = false;
        return "game restarted";
    }

    public ArrayList<String> printWords() {
        return words;
    }
}
