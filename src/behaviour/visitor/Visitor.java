package behaviour.visitor;

import construction.composite.Department;
import construction.composite.Group;

public interface Visitor {

    // グループに対する処理メソッド
    public void visit(Groups groups);

    // 部署に対する処理メソッド
    public void visit(Departments departments);
}
