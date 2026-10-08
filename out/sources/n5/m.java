package n5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class m extends e {
    public ArrayList<e> L0;

    public m() {
        this.L0 = new ArrayList<>();
    }

    public void a(e eVar) {
        this.L0.add(eVar);
        if (eVar.L() != null) {
            ((m) eVar.L()).x1(eVar);
        }
        eVar.f1(this);
    }

    public void u1(e... eVarArr) {
        for (e eVar : eVarArr) {
            a(eVar);
        }
    }

    @Override // n5.e
    public void v0() {
        this.L0.clear();
        super.v0();
    }

    public ArrayList<e> v1() {
        return this.L0;
    }

    public void w1() {
        ArrayList<e> arrayList = this.L0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            e eVar = this.L0.get(i15);
            if (eVar instanceof m) {
                ((m) eVar).w1();
            }
        }
    }

    public void x1(e eVar) {
        this.L0.remove(eVar);
        eVar.v0();
    }

    @Override // n5.e
    public void y0(g5.c cVar) {
        super.y0(cVar);
        int size = this.L0.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.L0.get(i15).y0(cVar);
        }
    }

    public void y1() {
        this.L0.clear();
    }

    public m(int i15, int i16) {
        super(i15, i16);
        this.L0 = new ArrayList<>();
    }
}
