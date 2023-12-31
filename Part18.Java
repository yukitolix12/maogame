import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Part18
{
    static BufferedImage   ba;
    static JPanel          jp;
    static JPanel          jpChild2;
    
    public static void main( String[] args) throws java.io.IOException 
    {

        System.out.println( "Hello" ); 

        // ウィンドウフレームを作成、表示
        JFrame jf = new JFrame();
        jf.setBounds( 20, 40, 940, 540);
        jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // 親パネルを作成し、フレームに貼り付け
        jp = new JPanel( new java.awt.GridLayout( 3, 1 ));
        jp.setBackground( Color.BLACK );
        jf.add( jp );

        //フォントを作成
        Font    f = new Font( Font.MONOSPACED, 
                              Font.BOLD,
                              40 );

        //レイアウト1行目
        // パネルを作成し、親パネルに貼り付け
        JPanel  jpChild = new JPanel();
        jpChild.setBackground( Color.BLUE );
        jp.add( jpChild );
        // ラベルを作成し、子パネルに貼り付け
        JLabel jlChild = new JLabel( Console.getstatusString());

        jlChild.setFont( f );
        jlChild.setForeground( Color.WHITE );
        jpChild.add( jlChild );


        //レイアウト2行目
        // パネルを作成し、親パネルに貼り付け
        jpChild2 = new JPanel();
        jpChild2.setBackground( Color.CYAN );
        jp.add( jpChild2 );

        //選択肢をパネルに貼り付け
        JLabel jlMain = new JLabel("<html>1.魔王を倒しにいく<br>2.修行する<br>3.宿屋に泊まる"); 
        jlMain.setFont( f );
        jpChild2.add( jlMain );     

          

/* 
        // モンスターをパネルに貼り付け
        File file = new File( "vx_chara08_a.png" ); // ファイルを開く
        ba = ImageIO.read( file );  //画像全体を読み込む

        int     cw = 32;            //セルサイズ・幅
        int     ch = 48;            //セルサイズ・高さ
        int     sw = 200;            //表示サイズ・幅
        int     sh = 200;            //表示サイズ・高さ

        putMonster( 3, 4, cw, ch, sw, sh );     // モンスター 3-4 表示
        putMonster( 6, 4, cw, ch, sw, sh );     // モンスター 6-4 表示
        putMonster( 9, 4, cw, ch, sw, sh );     // モンスター 9-4 表示
*/
 
        //レイアウト3行目
        // ラベルを作成し、親パネルに貼り付け
        JLabel jl = new JLabel( "魔王が世界を滅ぼそうとしています");

        jl.setFont( f );
        jl.setForeground( new Color( 255, 128, 0 ) );
        jp.add( jl );

        jf.setVisible( true );
    }

    /**
     * モンスターを表示
     * 
     * @param x    表示するセル座標X
     * @param y    表示するセル座標Y
     * @param cw   セルの大きさ・幅
     * @param ch   セルの大きさ・高さ
     * @param sw     表示サイズ・幅
     * @param sh     表示サイズ・高さ
     */

    static void putMonster( int x, int y, int cw, int ch, int sw, int sh )
    {    
        BufferedImage   bs = ba.getSubimage( cw * x, ch * y, cw, ch );
        Image   im = bs.getScaledInstance( sw, sh, Image.SCALE_DEFAULT );
        ImageIcon   ii = new ImageIcon( im );       //JLabel用に型変換
        JLabel jlImage = new JLabel( ii ) ;         //画像部品を作成
        jlImage.setSize( sw, sh );                //画像部品サイズを設定
        jpChild2.add( jlImage );                          //画像を貼り付け
    }    
}