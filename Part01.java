public class Part01      
{
    static String name = "すけさん";         //プレイヤーの名前
    static int lv = 30;                    //プレイヤーのレベル
    static int hp = 30;                    //プレイヤーのHPを定義
    static double gold = 50.0;                  //プレイヤーの所持金
    public static void main(String[] args) throws java.io.IOException 
    {
        Console.putJyosyou();                //序章を表示
        
        putCommand();                //コマンドを表示

        if( hp == 0 ){
            return;
        }
        
        //魔王を倒しにいく
        if( lv < 40 ){      //レベルが40未満の場合
            Console.putGameOver();  //ゲームオーバー画面を表示
        }else{              //レベルが40以上の場合
            Console.putGameClear(); //ゲームクリアの画面を表示
        }
    }
    
    public static void putCommand() throws java.io.IOException 
    {
        Console.put("1.魔王を倒しにいく");
        Console.put("2.修行する"); 
        Console.put("3.宿屋に泊まる");  

        switch( inputCommand() ){    //1.魔王を倒しにいく
            case '1':{
                Console.put( "魔王が現れた！");
                break;
            }
            case '2':{  //2.修行する
                syugyou();
                break;
            }
            case '3':{  //宿屋に泊まる
                if( gold >= 9.95 ){
                    hp = lv;
                    gold -= 9.95;
                }
                Console.putStatus();
                putCommand();
                break;
            }
        }
    }
    /**
     * 修行する
     */
    public static void syugyou() throws java.io.IOException 
    {
        java.util.Random r = new java.util.Random();
        //敵出現
        int              e = r.nextInt( 10 ) + 1; //敵の数
        Console.put( "敵が" + e + "匹、現れた");

        String m =  "(・Д・) ";
        String s =  "";

        for( int i = 0; i < e; i = i + 1){
             s = s + m;
        }
        Console.put( s );

        //HPを減らす
        int              d = r.nextInt( 8 );
        hp -= d;
        if( hp < 0 ){
            hp = 0;
        }
        Console.put( name + "は" + d + "ポイントのダメージを受けた！");

        // レベル上昇
  
        lv += e;
        Console.put("レベルが" + lv + "になった");
        Console.putStatus();
        if( hp == 0 ){
            Console.put("GAME OVER");
        }else{
            putCommand();  
        }
    }

    public static int inputCommand() throws java.io.IOException 
    {
        int  c =  System.in.read();
        if( c == 10 || c == 13){
            return( inputCommand() );
        }
        return( c );
    }       
}