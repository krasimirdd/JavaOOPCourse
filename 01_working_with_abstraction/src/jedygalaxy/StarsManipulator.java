package jedygalaxy;

public class StarsManipulator {

    private Galaxy galaxy;

    public StarsManipulator(Galaxy galaxy) {
        this.galaxy = galaxy;
    }


    public void destroyStars(int[] enemyPositions) {
        int enemyRow = enemyPositions[0];
        int enemyCol = enemyPositions[1];

        while (enemyRow >= 0 && enemyCol >= 0) {

            if (isInRange(enemyRow, enemyCol)) {
                this.galaxy.setStar(enemyRow, enemyCol, new Star(0));
            }

            enemyRow--;
            enemyCol--;
        }
    }

    private boolean isInRange(int enemyRow, int enemyCol) {
        return enemyRow >= 0 && enemyRow < this.galaxy.getRows()
                && enemyCol >= 0 && enemyCol < this.galaxy.getCols(enemyRow);
    }

    public long collectStars(int[] playerPositions) {

        int playerRow = playerPositions[0];
        int playerCol = playerPositions[1];
        long sum = 0;

        while (playerRow >= 0 && playerCol < this.galaxy.getCols(0)) {

            if (isInRange(playerRow, playerCol)) {
                sum += this.galaxy.getStarValue(playerRow, playerCol);
            }

            playerRow--;
            playerCol++;
        }

        return sum;
    }
}
