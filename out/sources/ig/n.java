package ig;

import hg.a.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n<A extends hg.a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f92231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gg.c[] f92232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f92233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f92234d;

    protected n(j<L> jVar, gg.c[] cVarArr, boolean z15, int i15) {
        this.f92231a = jVar;
        this.f92232b = cVarArr;
        this.f92233c = z15;
        this.f92234d = i15;
    }

    public void a() {
        this.f92231a.a();
    }

    public j.a<L> b() {
        return this.f92231a.b();
    }

    public gg.c[] c() {
        return this.f92232b;
    }

    protected abstract void d(A a15, vh.m<Void> mVar);

    public final boolean e() {
        return this.f92233c;
    }

    public final int f() {
        return this.f92234d;
    }
}
