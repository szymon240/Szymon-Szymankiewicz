public class Main {
    public static void main(String[] args) {
        Shiritori my_shiritori = new Shiritori();
        System.out.println(my_shiritori.play("apple"));
        System.out.println(my_shiritori.play("ear"));
        System.out.println(my_shiritori.play("rhino"));
        System.out.println(my_shiritori.play("corn"));
        System.out.println(my_shiritori.printWords());
        System.out.println(my_shiritori.restart());
        System.out.println(my_shiritori.printWords());
        System.out.println(my_shiritori.play("hostess"));
        System.out.println(my_shiritori.play("stash"));
        System.out.println(my_shiritori.play("hostess"));
    }
}