import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;

public class DragAndDropListener implements MouseListener, MouseMotionListener {
	
	private List<Doodad> doodads;
	private Game board;
	
	private Doodad dragPiece;
	private int dragOffsetX;
	private int dragOffsetY;

	public DragAndDropListener(List<Doodad> doodads, Game board) {
		this.doodads = doodads;
		this.board = board;
	}
	
	@Override
	public void mousePressed(MouseEvent event) {
		int x = event.getPoint().x;
		int y = event.getPoint().y;
		
		// find out which piece to move.
		// we check the list from top to buttom
		// (therefore we itereate in reverse order)
		//
		for (int i = this.doodads.size()-1; i >= 0; i--) {
			Doodad doodad = this.doodads.get(i);
			
			if( mouseOverPiece(doodad,x,y)){
				// calculate offset, because we do not want the drag piece
				// to jump with it's upper left corner to the current mouse
				// position
				//
				this.dragOffsetX = x - doodad.getX();
				this.dragOffsetY = y - doodad.getY();
				this.dragPiece = doodad;
				break;
			}
		}
		
		// move drag piece to the top of the list
		if(this.dragPiece != null){
			this.doodads.remove( this.dragPiece );
			this.doodads.add(this.dragPiece);
		}
	}

	/**
	 * check whether the mouse is currently over this piece
	 * @param piece the playing piece
	 * @param x x coordinate of mouse
	 * @param y y coordinate of mouse
	 * @return true if mouse is over the piece
	 */
	private boolean mouseOverPiece(Doodad doodad, int x, int y) {
		return doodad.getX() <= x 
			&& doodad.getX()+doodad.getWidth() >= x
			&& doodad.getY() <= y
			&& doodad.getY()+doodad.getHeight() >= y;
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		this.dragPiece = null;
	}

	@Override
	public void mouseDragged(MouseEvent evt) {
		if(this.dragPiece != null){
			this.dragPiece.setX(evt.getPoint().x - this.dragOffsetX);
			this.dragPiece.setY(evt.getPoint().y - this.dragOffsetY);
			//this.board.repaint();
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}
	
	@Override
	public void mouseMoved(MouseEvent arg0) {}

}
