public class Part01      //おまじない
{
    public static void main(String[] args)   //おまじない
    {
        String name = "すけさん";             //プレイヤーの名前
        int lv = 40;                        //レベル
        System.out.println("魔王が" + "が世界を滅ぼそうとしている");
        System.out.println(name + "はレベル" + lv + "のツワモノです");
        System.out.println(name + "は魔王を倒しました！");
        if( lv > 50 ){
            System.out.println("レベル" + lv + "なので倒せました");
        }else{
            System.out.println("レベル" + lv + "なので苦戦しました");
        }
        System.out.println( "GAME CLEAR!");
    }
}