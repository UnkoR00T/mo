package so;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class q0 extends l0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f182792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f182793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<Integer, Integer> f182794i;

    q0(n0 n0Var) {
        super(n0Var);
    }

    @Override // so.l0
    void e(n0 n0Var, i0 i0Var) {
        this.f182792g = i0Var.r();
        this.f182793h = i0Var.E();
        int iN = i0Var.N();
        this.f182794i = new ConcurrentHashMap(iN);
        for (int i15 = 0; i15 < iN; i15++) {
            this.f182794i.put(Integer.valueOf(i0Var.N()), Integer.valueOf(i0Var.E()));
        }
        this.f182681e = true;
    }
}
