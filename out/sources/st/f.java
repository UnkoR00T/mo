package st;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
class f implements er.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f184021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1 f184022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wt.s f184023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wt.j f184024d;

    public f(Collection collection, w1 w1Var, wt.s sVar, wt.j jVar) {
        this.f184021a = collection;
        this.f184022b = w1Var;
        this.f184023c = sVar;
        this.f184024d = jVar;
    }

    @Override // er.l
    public Object b(Object obj) {
        return h.y(this.f184021a, this.f184022b, this.f184023c, this.f184024d, (w1.a) obj);
    }
}
