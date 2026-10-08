package v;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j2 implements o.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f202616b;

    public j2(int i15) {
        this.f202616b = i15;
    }

    @Override // o.o
    public List<o.q> b(List<o.q> list) {
        ArrayList arrayList = new ArrayList();
        for (o.q qVar : list) {
            i6.i.b(qVar instanceof m0, "The camera info doesn't contain internal implementation.");
            if (qVar.n() == this.f202616b) {
                arrayList.add(qVar);
            }
        }
        return arrayList;
    }

    public int c() {
        return this.f202616b;
    }
}
