public class Game {
    private int count;

    public void startGame() {
        Field field = new Field(6, 6);
        field.fillField();
        field.printField();

        count = 0;

        if (field.getArr().length < 4) System.out.println("Нужно больше поле");
        else {
            QueueRealization queue = new QueueRealization();
            Exits exits = new Exits();
            Point gamer = new Point(1, 2);

            queue.insert(1, 2); //наша начальная точка

            while (queue.getFrontIsNull() != null) {

                gamer.setX(queue.getFrontIsNull().getX());
                gamer.setY(queue.getFrontIsNull().getY());

                count = field.changeCount(gamer.getX(), (gamer.getY()));

                //проверяем по выходам
                for (int i = 0; i < exits.getExits().size(); i++) {
                    if (queue.getQueue().peek().getXnY() == exits.getExits(i).getXnY()) {
                        field.setArrIndex(gamer.getX(), gamer.getY(), 0);
                        System.out.println("_____");
                        field.printField();
                        queue.remove();
                    }
                }

                //идет наверх
                if (field.getArr()[gamer.getX() - 1][gamer.getY()] != -1 &&
                        field.getArr()[gamer.getX() - 1][gamer.getY()] <= 0) {
                    queue.insert(gamer.getX() - 1, gamer.getY());
                    field.setArrIndex(gamer.getX() - 1, gamer.getY(), count);
                }
                //идем направо
                if (field.getArr()[gamer.getX()][gamer.getY() + 1] != -1 &&
                        field.getArr()[gamer.getX()][gamer.getY() + 1] <= 0) {
                    queue.insert(gamer.getX(), gamer.getY() + 1);
                    field.setArrIndex(gamer.getX(), gamer.getY() + 1, count);
                }
                //идем вниз
                if (field.getArr()[gamer.getX() + 1][gamer.getY()] != -1 &&
                        field.getArr()[gamer.getX() + 1][gamer.getY()] <= 0) {
                    queue.insert(gamer.getX() + 1, gamer.getY());
                    field.setArrIndex(gamer.getX() + 1, gamer.getY(), count);

                //идем влево
                }
                if (field.getArr()[gamer.getX()][gamer.getY() - 1] != -1 &&
                        field.getArr()[gamer.getX()][gamer.getY() - 1] <= 0) {
                    queue.insert(gamer.getX(), gamer.getY() - 1);
                    field.setArrIndex(gamer.getX(), gamer.getY() - 1, count);
                }
                queue.remove();
            }
        }
    }
}








