public class Console
{
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
        put( " " +  Part01.name + " Lv" +  Part01.lv + " HP"  +  Part01.hp + " " +  Part01.gold  +"G");
        put("----------------------------");
    }
    
    /**
     *  ゲームオーバー画面を表示します
     */
    public static void putGameOver()
    {
        put(  Part01.name + "は魔王に敗れましたorz");
        put( "GAME OVER");
    }
    
    /**
     *  ゲームクリア画面を表示します
     */

    public static void putGameClear()
    {
        String s0 =  Part01.name + "は魔王を倒しました！";
        put(s0);

        put("レベル" +  Part01.lv);

        if(  Part01.lv > 200 ){
        put( "なので魔王ゴミでしたwwww");
        }else if( Part01.lv > 120 ){
        put( "なので魔王弱すぎでしたwww");
        }else if( Part01.lv > 80 ){
        put("なので余裕でした");
        }else if( Part01.lv > 50 ){
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
