package behaviour.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Departments extends Units {

    // 部署名
    private String name;

    // 部署のList
    private List<Units> unitsList = new ArrayList<>();

    // コンストラクタ
    public Departments(String name) {
        super();
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Units add(Units units) {
        unitsList.add(units);
        return this;
    }

    @Override
    public Iterator<Units> iterator() {
        return unitsList.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

