public class Part01      
{
    static String name = "すけさん";         //プレイヤーの名前
    static int lv = 30;                    //プレイヤーのレベル
    static int hp = 30;                    //プレイヤーのHPを定義
    static int gold = 50;                  //プレイヤーの所持金
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
        System.out.println("1.魔王を倒しにいく");
        System.out.println("2.修行する"); 
        System.out.println("3.宿屋に泊まる");   
        int     c = inputCommand();
        if( c == '1'){
            System.out.println( "魔王が現れた！");
        }else if( c == '2' ){
            lv += 5;
            hp -= 3;
            if( hp < 0 ){
                hp = 0;
            }
            System.out.println("レベルが" + lv + "になった");
            System.out.println("HPが" + hp + "になった");
            if( hp == 0 ){
                System.out.println("GAME OVER");
            }else{
                putCommand();  
            }
            }else if( c == '3'){  //宿屋に泊まる
                hp = lv;
                System.out.println("HPが" + hp + "になった");
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
        System.out.println("魔王" + "が世界を滅ぼそうとしている");
        putStatus();
    }

    public static void putStatus()
    {
        System.out.println( "Lv" + lv + "HP" + hp + ""+ gold +"G");
        
    }
    
    /**
     *  ゲームオーバー画面を表示します
     */
    public static void putGameOver()
    {
        System.out.println( name + "は魔王に敗れましたorz");
        System.out.println( "GAME OVER");
    }
    
    /**
     *  ゲームクリア画面を表示します
     */

    public static void putGameClear()
    {
        String s0 = name + "は魔王を倒しました！";
        put(s0);

        System.out.print("レベル" + lv);

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