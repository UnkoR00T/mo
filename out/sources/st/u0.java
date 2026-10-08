package st;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class u0 implements er.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x1 f184130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f184131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t1 f184132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f184133d;

    public u0(x1 x1Var, List list, t1 t1Var, boolean z15) {
        this.f184130a = x1Var;
        this.f184131b = list;
        this.f184132c = t1Var;
        this.f184133d = z15;
    }

    @Override // er.l
    public Object b(Object obj) {
        return w0.l(this.f184130a, this.f184131b, this.f184132c, this.f184133d, (tt.g) obj);
    }
}
