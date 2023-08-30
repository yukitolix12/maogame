import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Part18
{
    static BufferedImage   ba;
    static JPanel          jp;
    
    public static void main( String[] args) throws java.io.IOException 
    {

        System.out.println( "Hello" ); 

        // ウィンドウフレームを作成、表示
        JFrame jf = new JFrame();
        jf.setBounds( 20, 50, 800, 450);
        jf.setVisible( true );
        jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // 親パネルを作成し、フレームに貼り付け
        jp = new JPanel();
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

        File file = new File( "vx_chara08_a.png" ); // ファイルを開く
        ba = ImageIO.read( file );  //画像全体を読み込む

        int     cx = 32;
        int     cy = 48;

        putMonster( 3, 4, cx, cy );     // モンスター 3-4 表示
        putMonster( 6, 4, cx, cy );     // モンスター 6-4 表示
        putMonster( 9, 4, cx, cy );     // モンスター 9-4 表示
    }

    static void putMonster( int x, int y, int cw, int ch )
    {    
        BufferedImage   bs = ba.getSubimage( cw * x, ch * y, cw, ch );
        ImageIcon   ii = new ImageIcon( bs );       //JLabel用に型変換
        JLabel jlImage = new JLabel( ii ) ;         //画像部品を作成
        jlImage.setSize( cw, ch );                //画像部品サイズを設定
        jp.add( jlImage );                          //画像を貼り付け
    }    
}