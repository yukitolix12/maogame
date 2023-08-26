import javax.swing.*;

public class Part18
{
    public static void main( String[] args)
    {
        System.out.println( "Hello" ); 

        JFrame jf = new JFrame();
        jf.setBounds( 50, 100, 750, 400);
        jf.setVisible( true );
        jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        JLabel jl = new JLabel( "Hello ");
        jl.setFont( new java.awt.Font( java.awt.Font.SERIF, java.awt.Font.ITALIC, 150 ));
        jl.setForeground( new java.awt.Color( 255, 128, 0 ) );
        jf.add( jl );
    }
}