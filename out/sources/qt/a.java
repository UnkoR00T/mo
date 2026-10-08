package qt;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a implements wr.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f168310b = {fr.q0.j(new fr.h0(a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rt.i f168311a;

    public a(rt.n nVar, er.a<? extends List<? extends wr.c>> aVar) {
        this.f168311a = nVar.d(aVar);
    }

    private final List<wr.c> e() {
        return (List) rt.m.a(this.f168311a, this, f168310b[0]);
    }

    @Override // wr.h
    public /* bridge */ wr.c H(zs.c cVar) {
        return wr.h.b.a(this, cVar);
    }

    @Override // wr.h
    public /* bridge */ boolean d2(zs.c cVar) {
        return wr.h.b.b(this, cVar);
    }

    @Override // wr.h
    public boolean isEmpty() {
        return e().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<wr.c> iterator() {
        return e().iterator();
    }
}
