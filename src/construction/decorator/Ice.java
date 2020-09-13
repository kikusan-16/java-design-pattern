package construction.decorator;

public abstract class Ice extends IceCream {

    // 中身、または装飾のインスタンスを持っている
    protected IceCream iceCream;

    // コンストラクタ
    // 中身、または装飾のインスタンスはコンストラクタで指定する
    protected Ice(IceCream iceCream) {
        super();
        this.iceCream = iceCream;
    }
}
