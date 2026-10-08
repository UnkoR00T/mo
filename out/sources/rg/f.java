package rg;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f173724a;

    f(a aVar) {
        Objects.requireNonNull(aVar);
        this.f173724a = aVar;
    }

    @Override // rg.e
    public final void a(c cVar) {
        a aVar = this.f173724a;
        aVar.l(cVar);
        Iterator it = aVar.n().iterator();
        while (it.hasNext()) {
            ((k) it.next()).b(aVar.k());
        }
        aVar.n().clear();
        aVar.m(null);
    }
}
