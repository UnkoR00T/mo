package ch;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class w0 extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f26438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ y0 f26440c;

    w0(y0 y0Var, int i15) {
        this.f26440c = y0Var;
        this.f26438a = y0.k(y0Var, i15);
        this.f26439b = i15;
    }

    private final void a() {
        int i15 = this.f26439b;
        if (i15 == -1 || i15 >= this.f26440c.size() || !r.a(this.f26438a, y0.k(this.f26440c, this.f26439b))) {
            this.f26439b = this.f26440c.E(this.f26438a);
        }
    }

    @Override // ch.j0, java.util.Map.Entry
    public final Object getKey() {
        return this.f26438a;
    }

    @Override // ch.j0, java.util.Map.Entry
    public final Object getValue() {
        Map mapR = this.f26440c.r();
        if (mapR != null) {
            return mapR.get(this.f26438a);
        }
        a();
        int i15 = this.f26439b;
        if (i15 == -1) {
            return null;
        }
        return y0.o(this.f26440c, i15);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapR = this.f26440c.r();
        if (mapR != null) {
            return mapR.put(this.f26438a, obj);
        }
        a();
        int i15 = this.f26439b;
        if (i15 == -1) {
            this.f26440c.put(this.f26438a, obj);
            return null;
        }
        y0 y0Var = this.f26440c;
        Object objO = y0.o(y0Var, i15);
        y0.t(y0Var, this.f26439b, obj);
        return objO;
    }
}
