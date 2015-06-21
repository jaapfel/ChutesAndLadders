
public class Chutes_and_Ladders {
	static final int GRID_WIDTH = 10;
	static final int GRID_HEIGHT = 10;
	private class Board {
		private Tile[][] board = new Tile[GRID_WIDTH][GRID_HEIGHT];
		public void Board() {
			for(int i = 0; i < GRID_HEIGHT; i++) {
				for(int j = 0; j < GRID_WIDTH; j++) {
					board[i][j] = new Tile(i * 10 + j);
				}
			}
		}

		private class Tile {
			int destination; // The terminal point of the "chute" or "ladder". Matches index if self.
			int player;
			int index;
			public Tile(int index) {
				this.index = index;
				destination = index;
			}
			public void setDestination(int index) {
				destination = index;
			}
			public boolean hasPlayer() {
				return (player == 0) ? true : false;
			}
		}
	}
}
