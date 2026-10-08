package st;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class v0 implements er.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x1 f184137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f184138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t1 f184139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f184140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lt.k f184141e;

    public v0(x1 x1Var, List list, t1 t1Var, boolean z15, lt.k kVar) {
        this.f184137a = x1Var;
        this.f184138b = list;
        this.f184139c = t1Var;
        this.f184140d = z15;
        this.f184141e = kVar;
    }

    @Override // er.l
    public Object b(Object obj) {
        return w0.o(this.f184137a, this.f184138b, this.f184139c, this.f184140d, this.f184141e, (tt.g) obj);
    }
}
