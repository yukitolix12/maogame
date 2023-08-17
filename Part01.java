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

    static void put(String str)
    {
        System.out.println(str);
    }
}