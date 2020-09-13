package behaviour.chainofresponsibility;

public class Main {

    public static void main(String[] args) {

        // ==================
        // 担当者の作成
        // ==================
        // 庶務
        ApprovalPerson ishihara = new GeneralAffairs("石原");
        // 課長
        ApprovalPerson noguchi = new Manager("野口", 10);
        // 部長
        ApprovalPerson yamada = new GeneralManager("山田", 20);
        // 社長
        ApprovalPerson sato = new President("佐藤", 30);

        // 連鎖の形成
        ishihara.setNext(noguchi).setNext(yamada).setNext(sato);

        // ==================
        // 稟議書の作成
        // ==================
        DecisionRequest holiday = new DecisionRequest("有給申請書", 1);
        DecisionRequest retire = new DecisionRequest("退職届", 11);
        DecisionRequest hiring = new DecisionRequest("新卒採用申請書", 21);
        DecisionRequest strike = new DecisionRequest("ストライキ通知書", 99);

        // ==================
        // 稟議書を上げる
        // ==================
        ishihara.decision(holiday);
        ishihara.decision(retire);
        ishihara.decision(hiring);
        ishihara.decision(strike);
    }
}
