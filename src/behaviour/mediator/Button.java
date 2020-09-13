package behaviour.mediator;

public interface Button {

    // Mediatorをセット
    public void setMediator(Mediator mediator);

    // ボタンを押す
    public void press();

    // 状態のgetter
    public boolean isEnable();

    // 状態のsetter
    public void setEnable(boolean enable);

}
