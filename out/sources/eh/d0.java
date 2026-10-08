package eh;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class d0 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f50351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f0 f50353c;

    d0(f0 f0Var, int i15) {
        this.f50353c = f0Var;
        this.f50351a = f0.i(f0Var, i15);
        this.f50352b = i15;
    }

    private final void a() {
        int i15 = this.f50352b;
        if (i15 == -1 || i15 >= this.f50353c.size() || !ze.a(this.f50351a, f0.i(this.f50353c, this.f50352b))) {
            this.f50352b = this.f50353c.C(this.f50351a);
        }
    }

    @Override // eh.r, java.util.Map.Entry
    public final Object getKey() {
        return this.f50351a;
    }

    @Override // eh.r, java.util.Map.Entry
    public final Object getValue() {
        Map mapP = this.f50353c.p();
        if (mapP != null) {
            return mapP.get(this.f50351a);
        }
        a();
        int i15 = this.f50352b;
        if (i15 == -1) {
            return null;
        }
        return f0.n(this.f50353c, i15);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapP = this.f50353c.p();
        if (mapP != null) {
            return mapP.put(this.f50351a, obj);
        }
        a();
        int i15 = this.f50352b;
        if (i15 == -1) {
            this.f50353c.put(this.f50351a, obj);
            return null;
        }
        Object objN = f0.n(this.f50353c, i15);
        f0.r(this.f50353c, this.f50352b, obj);
        return objN;
    }
}
