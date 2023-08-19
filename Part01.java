public class Part01      
{
    static String name = "すけさん";         //プレイヤーの名前
    static int lv = 30;                         //プレイヤーのレベル
    public static void main(String[] args) throws java.io.IOException 
    {
        putJyosyou();                //序章を表示
        System.out.println("1.すぐに魔王を倒しにいく");
        System.out.println("2.修行してから魔王を倒しにいく");      
        
        int  c =  System.in.read();

        if( c == '2' ){
            lv = 110;
            System.out.println("レベルが" + lv + "になった");
        }                 
        
        if( lv < 40 ){      //レベルが40未満の場合
            putGameOver();  //ゲームオーバー画面を表示
        }else{              //レベルが40以上の場合
            putGameClear(); //ゲームクリアの画面を表示
        }
    }
    /** 
     * 序章を表示します 
    */
    public static void putJyosyou()
    {
        System.out.println("魔王が" + "が世界を滅ぼそうとしている");
        System.out.println(name + "はレベル" + lv + "のツワモノです");
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