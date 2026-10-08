package l9;

import android.util.SparseArray;
import o8.l0;
import o8.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements o8.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o8.r f117249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s.a f117250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<v> f117251c = new SparseArray<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f117252d;

    public t(o8.r rVar, s.a aVar) {
        this.f117249a = rVar;
        this.f117250b = aVar;
    }

    @Override // o8.r
    public void f(l0 l0Var) {
        this.f117249a.f(l0Var);
    }

    @Override // o8.r
    public void s() {
        this.f117249a.s();
        if (this.f117252d) {
            for (int i15 = 0; i15 < this.f117251c.size(); i15++) {
                this.f117251c.valueAt(i15).k(true);
            }
        }
    }

    @Override // o8.r
    public s0 v(int i15, int i16) {
        if (i16 != 3 && i16 != 5) {
            this.f117252d = true;
        }
        if (i16 != 3) {
            return this.f117249a.v(i15, i16);
        }
        v vVar = this.f117251c.get(i15);
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this.f117249a.v(i15, i16), this.f117250b);
        this.f117251c.put(i15, vVar2);
        return vVar2;
    }
}
