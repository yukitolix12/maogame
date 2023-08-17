public class Part01      //おまじない
{
    static String name = "すけさん";             //プレイヤーの名前
    static int lv = 65;                        //レベル
    public static void main(String[] args)   //おまじない
    {
        putJyosyou();
        
        if( lv < 40 ){
            putGameOver();  
        }else{
            putGameClear();
        }
    }
    static void putJyosyou()
    {
        System.out.println("魔王が" + "が世界を滅ぼそうとしている");
        System.out.println(name + "はレベル" + lv + "のツワモノです");
    }
    
    static void putGameOver()
    {
        System.out.println( name + "は魔王に敗れましたorz");
        System.out.println( "GAME OVER");
    }

    static void putGameClear()
    {
        String s0 = name + "は魔王を倒しました！";
        put(s0);

        if( lv > 200 ){
        put("レベル" + lv + "なので魔王ゴミでしたwwww");
        }else if( lv > 120 ){
        put("レベル" + lv + "なので魔王弱すぎでしたwww");
        }else if( lv > 80 ){
        put("レベル" + lv + "なので余裕でした");
        }else if( lv > 50 ){
        put("レベル" + lv + "なので倒せました");
        }else{
        put("レベル" + lv + "なので苦戦しました");
        }
        put( "GAME CLEAR!");
    }

    static void put(String str)
    {
        System.out.println(str);
    }
}