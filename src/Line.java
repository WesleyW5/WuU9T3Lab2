import java.awt.Graphics;

public class Line extends Shape{

    public Line(){
        super();
    }

    public void draw(Graphics g){
        g.setColor(getColor());
        g.drawLine();
    }

}
