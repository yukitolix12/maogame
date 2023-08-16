public class Part03      //おまじない
{
    public static void main(String[] args)   //おまじない
    {
        String name = "アーサー";             //プレイヤーの名前
        String enemy = "魔王サタン";          //敵の名前
        int lv = 49;                        //レベル」
        System.out.println(enemy + "が世界を滅ぼそうとしている");
        System.out.println(name + "はレベル" + lv + "のツワモノです");
        if( lv > 90 ){                      // レベルが90より大きい場合のみ
            System.out.println("うわっ、" + name + "のレベル、高すぎ？");
        }
        if( lv >= 50 ){                     //レベルが50以上の場合
            System.out.println(name + "は" + enemy + "を倒しました");
            System.out.println("レベル" +lv + "なので余裕でしたwww");
            System.out.println("GAME CLEAR!");
        }else{                             //そうではない場合(レベルが50未満の場合)
            System.out.println(name + "は" + enemy + "に負けました");
            System.out.println("GAME OVER!");
        }
    }
}