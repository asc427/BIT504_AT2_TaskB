import java.awt.Color;

public class Paddle extends Sprite {
	
	private static final Color PADDLE_COLOUR = Color.WHITE;
	private static final int PADDLE_WIDTH = 10, PADDLE_HEIGHT = 100, PADDLE_DISTANCE_FROM_EDGE = 40;
	
	public Paddle(Player player, int PanelWidth, int PanelHeight) {
		setWidth(PADDLE_WIDTH);
        setHeight(PADDLE_HEIGHT);
        setColour(PADDLE_COLOUR);
        int xPos;
        if(player == Player.One) {
            xPos = PADDLE_DISTANCE_FROM_EDGE;
        } else {
            xPos = PanelWidth - PADDLE_DISTANCE_FROM_EDGE - getWidth();
        }
        setInitialPosition(xPos, PanelHeight / 2 - (getHeight() / 2));
        resetToInitialPosition();
		resetToInitialPosition();
	}
	

}
