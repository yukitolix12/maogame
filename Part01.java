public class Part01      
{
    static String name = "すけさん";         //プレイヤーの名前
    static int lv = 30;                    //プレイヤーのレベル
    static int hp = 30;                    //プレイヤーのHPを定義
    static double gold = 50.0;                  //プレイヤーの所持金
    public static void main(String[] args) throws java.io.IOException 
    {
        putJyosyou();                //序章を表示
        
        putCommand();                //コマンドを表示

        if( hp == 0 ){
            return;
        }
        
        //魔王を倒しにいく
        if( lv < 40 ){      //レベルが40未満の場合
            putGameOver();  //ゲームオーバー画面を表示
        }else{              //レベルが40以上の場合
            putGameClear(); //ゲームクリアの画面を表示
        }
    }
    
    public static void putCommand() throws java.io.IOException 
    {
        put("1.魔王を倒しにいく");
        put("2.修行する"); 
        put("3.宿屋に泊まる");   
        int     c = inputCommand();
        if( c == '1'){    //1.魔王を倒しにいく
            put( "魔王が現れた！");
        }else if( c == '2' ){  //2.修行する
            syugyou();
        }else if( c == '3'){  //宿屋に泊まる
                if( gold >= 9.95 ){
                    hp = lv;
                    gold -= 9.95;  
                }
                putStatus();
                putCommand();
            }
        }
    /**
     * 修行する
     */
    public static void syugyou() throws java.io.IOException 
    {
        java.util.Random r = new java.util.Random();
        //敵出現
        int              e = r.nextInt( 3 ) + 1; //敵の数
        put( "敵が" + e + "匹、現れた");
        put( "● ● ●");

        //HPを減らす
        int              d = r.nextInt( 8 );
        hp -= d;
        if( hp < 0 ){
            hp = 0;
        }
        put( name + "は" + d + "ポイントのダメージを受けた！");

        // レベル上昇
  
        lv += e;
        put("レベルが" + lv + "になった");
        putStatus();
        if( hp == 0 ){
            put("GAME OVER");
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
    /** 
     * 序章を表示します 
    */
    public static void putJyosyou()
    {
        put("魔王" + "が世界を滅ぼそうとしている");
        putStatus();
    }

    public static void putStatus()
    {
        put("----------------------------");
        put( " " + name + " Lv" + lv + " HP"  + hp + " " + gold  +"G");
        put("----------------------------");
    }
    
    /**
     *  ゲームオーバー画面を表示します
     */
    public static void putGameOver()
    {
        put( name + "は魔王に敗れましたorz");
        put( "GAME OVER");
    }
    
    /**
     *  ゲームクリア画面を表示します
     */

    public static void putGameClear()
    {
        String s0 = name + "は魔王を倒しました！";
        put(s0);

        put("レベル" + lv);

        if( lv > 200 ){
        put( "なので魔王ゴミでしたwwww");
        }else if( lv > 120 ){
        put( "なので魔王弱すぎでしたwww");
        }else if( lv > 80 ){
        put("なので余裕でした");
        }else if( lv > 50 ){
        put("でしたが倒せました");
        }else{
        put("でしたので苦戦しました");
        }
        put( "GAME CLEAR!");
    }

    /**
     * 引数で指定された文字列を表示します
     * 
     * @param str
     */
    public static void put(String str)
    {
        System.out.println(str);
    }
}