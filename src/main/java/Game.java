public class Game {

    private void officialMoves(int[][] field, Gamer gamer, QueueRealization queue) {

        field[gamer.getxPointGamer()][gamer.getyPointGamer()] += 1;
        gamer.setxPointGamer(111);
        queue.remove();
    }

    public void startGame(int[][] field) {
        if (field.length < 4) System.out.println("Нужно больше поле");
        else {
            QueueRealization queue = new QueueRealization();
            Gamer gamer = new Gamer(1, 2);
            queue.insert(gamer.getxPointGamer(), gamer.getyPointGamer());

            while (queue.getFrontIsNull() != null) {

                gamer.setxPointGamer(queue.getFrontIsNull().getxPointGamer());

                gamer.setxPointGamer(queue.getFrontIsNull().getyPointGamer());


                if (field[queue.getFrontIsNull().getxPointGamer()][queue.getFrontIsNull().getyPointGamer() + 1] > 0) {
                    queue.insert(queue.getFrontIsNull().getxPointGamer(), queue.getFrontIsNull().getyPointGamer() + 1);
//
//                } if (field[queue.getFrontIsNull().getxPointGamer() + 1][queue.getFrontIsNull().getyPointGamer()] > 0) {
//                    queue.insert(gamer.getxPointGamer() + 1, gamer.getyPointGamer());
//
//                }  if (field[queue.getFrontIsNull().getxPointGamer()][queue.getFrontIsNull().getyPointGamer() - 1] > 0) {
//                    queue.insert(gamer.getxPointGamer(), gamer.getyPointGamer() - 1);
//
//                }  if (field[queue.getFrontIsNull().getxPointGamer() - 1][queue.getFrontIsNull().getyPointGamer()] > 0) {
//                    queue.insert(gamer.getxPointGamer() - 1, gamer.getyPointGamer());
//
//                }

                    field[queue.getFrontIsNull().getxPointGamer()][queue.getFrontIsNull().getyPointGamer()]++;
                    queue.remove();

                }
            }
        }
    }
}







