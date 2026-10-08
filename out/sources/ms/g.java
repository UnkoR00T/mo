package ms;

import java.util.Iterator;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements wr.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f128043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qs.d f128044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f128045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final rt.h<qs.a, wr.c> f128046d;

    public g(k kVar, qs.d dVar, boolean z15) {
        this.f128043a = kVar;
        this.f128044b = dVar;
        this.f128045c = z15;
        this.f128046d = kVar.a().u().a(new f(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wr.c f(g gVar, qs.a aVar) {
        return ks.d.f112311a.e(aVar, gVar.f128043a, gVar.f128045c);
    }

    @Override // wr.h
    public wr.c H(zs.c cVar) {
        wr.c cVarB;
        qs.a aVarH = this.f128044b.H(cVar);
        return (aVarH == null || (cVarB = this.f128046d.b(aVarH)) == null) ? ks.d.f112311a.a(cVar, this.f128044b, this.f128043a) : cVarB;
    }

    @Override // wr.h
    public /* bridge */ boolean d2(zs.c cVar) {
        return wr.h.b.b(this, cVar);
    }

    @Override // wr.h
    public boolean isEmpty() {
        return this.f128044b.getAnnotations().isEmpty() && !this.f128044b.F();
    }

    @Override // java.lang.Iterable
    public Iterator<wr.c> iterator() {
        return eu.k.z(eu.k.M(eu.k.H(v.a0(this.f128044b.getAnnotations()), this.f128046d), ks.d.f112311a.a(sr.p.a.f183677y, this.f128044b, this.f128043a))).iterator();
    }

    public /* synthetic */ g(k kVar, qs.d dVar, boolean z15, int i15, fr.k kVar2) {
        this(kVar, dVar, (i15 & 4) != 0 ? false : z15);
    }
}
