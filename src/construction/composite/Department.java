package construction.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department extends Unit {

    // 部署名
    private String name;

    // エントリーのList
    private List<Unit> departmentList = new ArrayList<>();

    // コンストラクタ
    public Department(String name) {
        super();
        this.name = name;
    }

    @Override
    public void add(Unit units) {
        departmentList.add(units);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void printList(String prefix) {
        // 部署名を表示
        System.out.println(prefix + "/" + this);

        // Listのiterator取得
        Iterator<Unit> it = departmentList.iterator();
        while (it.hasNext()) {

            Unit units = it.next();

            // 再帰的な処理
            units.printList(prefix + "/" + this.name);
        }
    }

}
