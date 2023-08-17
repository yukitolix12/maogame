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
        put();
        
        if( lv > 200 ){
        System.out.println("レベル" + lv + "なので魔王ゴミでしたwwww");
        }else if( lv > 120 ){
        System.out.println("レベル" + lv + "なので魔王弱すぎでしたwww");
        }else if( lv > 80 ){
        System.out.println("レベル" + lv + "なので余裕でした");
        }else if( lv > 50 ){
        System.out.println("レベル" + lv + "なので倒せました");
        }else{
        System.out.println("レベル" + lv + "なので苦戦しました");
        }
        System.out.println( "GAME CLEAR!");
    }

    static void put()
    {
        String str = name + "は魔王を倒しました！";
        System.out.println(str);
    }
}