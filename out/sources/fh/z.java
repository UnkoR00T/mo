package fh;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class z extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f63758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ c0 f63760c;

    z(c0 c0Var, int i15) {
        this.f63760c = c0Var;
        this.f63758a = c0.k(c0Var, i15);
        this.f63759b = i15;
    }

    private final void a() {
        int i15 = this.f63759b;
        if (i15 == -1 || i15 >= this.f63760c.size() || !gl.a(this.f63758a, c0.k(this.f63760c, this.f63759b))) {
            this.f63759b = this.f63760c.E(this.f63758a);
        }
    }

    @Override // fh.n, java.util.Map.Entry
    public final Object getKey() {
        return this.f63758a;
    }

    @Override // fh.n, java.util.Map.Entry
    public final Object getValue() {
        Map mapR = this.f63760c.r();
        if (mapR != null) {
            return mapR.get(this.f63758a);
        }
        a();
        int i15 = this.f63759b;
        if (i15 == -1) {
            return null;
        }
        return c0.o(this.f63760c, i15);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapR = this.f63760c.r();
        if (mapR != null) {
            return mapR.put(this.f63758a, obj);
        }
        a();
        int i15 = this.f63759b;
        if (i15 == -1) {
            this.f63760c.put(this.f63758a, obj);
            return null;
        }
        c0 c0Var = this.f63760c;
        Object objO = c0.o(c0Var, i15);
        c0.t(c0Var, this.f63759b, obj);
        return objO;
    }
}
