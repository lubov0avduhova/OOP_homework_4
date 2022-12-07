public class Main {
    public static void main(String[] args) {
        Field field = new Field(6, 6);

        Game game = new Game();

        game.startGame(field.fillField());
        field.printField();

    }
}
