package cells;

import java.awt.Image;

import javax.swing.*;
import beings.*;

@SuppressWarnings("serial")
public class ToadCell extends BeingCell {

	@Override
	public void setbeing(Being being) {
		this.being=being;
		this.setIcon(new ImageIcon(being.image.getScaledInstance(width, height, Image.SCALE_SMOOTH)));
	}
	
	@Override
	public boolean placeallowed(Being being) {
		if(this.being!=null||!(being instanceof Toad))
			return false;
		else
			return true;
	}
}
