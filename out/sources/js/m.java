package js;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f104712a = new m();

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(vr.b bVar) {
        return f104712a.d(bVar);
    }

    private final boolean e(vr.b bVar) {
        if (pq.v.c0(j.f104654a.c(), ht.e.k(bVar)) && bVar.l().isEmpty()) {
            return true;
        }
        if (!sr.j.h0(bVar)) {
            return false;
        }
        Collection<? extends vr.b> collectionE = bVar.e();
        if (collectionE.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionE.iterator();
        while (it.hasNext()) {
            if (f104712a.d((vr.b) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final String b(vr.b bVar) {
        zs.f fVar;
        sr.j.h0(bVar);
        vr.b bVarI = ht.e.i(ht.e.w(bVar), false, l.f104708a, 1, null);
        if (bVarI == null || (fVar = j.f104654a.a().get(ht.e.o(bVarI))) == null) {
            return null;
        }
        return fVar.e();
    }

    public final boolean d(vr.b bVar) {
        if (j.f104654a.d().contains(bVar.getName())) {
            return e(bVar);
        }
        return false;
    }
}
