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

        // 親パネルを作成し、フレームに貼り付け
        JPanel  jp = new JPanel();
        jp.setBackground( Color.BLACK );
        jf.add( jp );

        // ラベルを作成し、親パネルに貼り付け
        JLabel jl = new JLabel( "魔王が世界を滅ぼそうとしています");
        Font    f = new Font( Font.MONOSPACED, 
                              Font.BOLD,
                              40 );

        jl.setFont( f );
        jl.setForeground( new Color( 255, 128, 0 ) );
        jp.add( jl );

        // パネルを作成し、親パネルに貼り付け
        JPanel  jpChild = new JPanel();
        jpChild.setBackground( Color.RED );
        jp.add( jpChild );

        // ラベルを作成し、子パネルに貼り付け
        JLabel jlChild = new JLabel( "トンヌラ Lv99 HP999/999");
        jlChild.setFont( f );
        jlChild.setForeground( Color.WHITE );
        jpChild.add( jlChild );

        //画像つきラベルを作成し、親パネル貼り付け
        JLabel jlimage = new JLabel( new javax.swing.ImageIcon( "81899335.png") );
        jlImage.setBounds( 0, 0, 384, 384);
        jp.add( jlImage );
    }
}