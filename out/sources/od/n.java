package od;

import fd.a0;

/* JADX INFO: loaded from: classes3.dex */
public class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f144762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nd.o<Float, Float> f144763b;

    public n(String str, nd.o<Float, Float> oVar) {
        this.f144762a = str;
        this.f144763b = oVar;
    }

    @Override // od.c
    public hd.c a(a0 a0Var, fd.f fVar, pd.b bVar) {
        return new hd.q(a0Var, bVar, this);
    }

    public nd.o<Float, Float> b() {
        return this.f144763b;
    }

    public String c() {
        return this.f144762a;
    }
}
