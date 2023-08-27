import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class Part18
{
    public static void main( String[] args)
    {
        System.out.println( "Hello" ); 

        // ウィンドウフレームを作成、表示
        JFrame jf = new JFrame();
        jf.setBounds( 50, 100, 750, 400);
        jf.setVisible( true );
        jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // パネルを作成し、フレームに貼り付け
        JPanel  jp = new JPanel();
        jp.setBackground( Color.BLACK );
        jf.add( jp );

        // ラベルを作成し、パネルに貼り付け
        JLabel jl = new JLabel( "Hello ");
        Font    f = new Font( Font.SERIF, 
                              Font.BOLD | Font.ITALIC, 
                              140 );
        jl.setFont( f );
        jl.setForeground( new Color( 255, 128, 0 ) );
        jp.add( jl );
    }
}