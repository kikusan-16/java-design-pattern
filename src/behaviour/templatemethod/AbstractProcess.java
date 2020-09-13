package behaviour.templatemethod;

/**
 * テンプレートクラス.
 */
public abstract class AbstractProcess {

    // 前処理
    protected abstract void before();

    // 処理
    protected abstract void process();

    // 後処理
    protected abstract void after();

    // テンプレートメソッド
    public final void execute() {
        before();
        process();
        after();
    }
}
