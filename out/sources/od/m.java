package od;

import fd.a0;

/* JADX INFO: loaded from: classes3.dex */
public class m implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f144757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nd.b f144758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nd.b f144759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nd.n f144760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f144761e;

    public m(String str, nd.b bVar, nd.b bVar2, nd.n nVar, boolean z15) {
        this.f144757a = str;
        this.f144758b = bVar;
        this.f144759c = bVar2;
        this.f144760d = nVar;
        this.f144761e = z15;
    }

    @Override // od.c
    public hd.c a(a0 a0Var, fd.f fVar, pd.b bVar) {
        return new hd.p(a0Var, bVar, this);
    }

    public nd.b b() {
        return this.f144758b;
    }

    public String c() {
        return this.f144757a;
    }

    public nd.b d() {
        return this.f144759c;
    }

    public nd.n e() {
        return this.f144760d;
    }

    public boolean f() {
        return this.f144761e;
    }
}
