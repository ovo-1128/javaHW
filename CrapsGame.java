public class CrapsGame {

        private enum Status {CONTINUE, WON, LOST}

        ;

        private static final int SNAKE_EYES = 2;
        private static final int TREY = 3;
        private static final int SEVEN = 7;
        private static final int YO_LEVEN = 11;
        private static final int BOX_CARS = 12;

        public void start() {
                int myPoint = 0;
                Status gameStatus;

                int sumOfDice = Dice.rollDice();

                switch (sumOfDice) {
                        case SEVEN: // win with 7 on first roll
                        case YO_LEVEN: // win with 11 on first roll
                                gameStatus = Status.WON;
                                break;
                        case SNAKE_EYES: // lose with 2 on first roll
                        case TREY: // lose with 3 on first roll
                        case BOX_CARS: // lose with 12 on first roll
                                gameStatus = Status.LOST;
                                break;
                        default:
                                gameStatus = Status.CONTINUE;
                                myPoint = sumOfDice;
                                System.out.printf("Point is %d%n", myPoint);
                                break;
                }

                while (gameStatus == Status.CONTINUE) {
                        sumOfDice = Dice.rollDice();

                        if (sumOfDice == myPoint) {
                                gameStatus = Status.WON;
                        } else {
                                if (sumOfDice == SEVEN) {
                                        gameStatus = Status.LOST;
                                }
                        }
                }

                if (gameStatus == Status.WON) {
                        System.out.println("Player wins");
                } else {
                        System.out.println("Player loses");
                }

        }
}
