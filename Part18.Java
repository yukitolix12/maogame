public class Part18
{
    public static void main( String[] args)
    {
        System.out.println( "Hello" ); 

        javax.swing.JFrame jf = new javax.swing.JFrame();
        jf.setBounds( 50, 100, 750, 400);
        jf.setVisible( true );
        jf.setDefaultCloseOperation( javax.swing.JFrame.EXIT_ON_CLOSE );

        javax.swing.JLabel jl = new javax.swing.JLabel( "Hello ");
        jl.setFont( new java.awt.Font( null, 0, 150 ));
        jl.setForeground( new java.awt.Color( 255, 128, 0 ) );
        jf.add( jl );
    }
}