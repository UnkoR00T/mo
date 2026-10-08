package rs;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class g implements wr.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zs.c f175640a;

    public g(zs.c cVar) {
        this.f175640a = cVar;
    }

    @Override // wr.h
    public /* bridge */ boolean d2(zs.c cVar) {
        return wr.h.b.b(this, cVar);
    }

    @Override // wr.h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public f H(zs.c cVar) {
        if (fr.t.c(cVar, this.f175640a)) {
            return f.f175633a;
        }
        return null;
    }

    @Override // wr.h
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<wr.c> iterator() {
        return pq.v.n().iterator();
    }
}
