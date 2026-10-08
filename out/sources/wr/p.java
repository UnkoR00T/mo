package wr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f214555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f214556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final er.l<zs.c, Boolean> f214557c;

    /* JADX WARN: Multi-variable type inference failed */
    public p(h hVar, boolean z15, er.l<? super zs.c, Boolean> lVar) {
        this.f214555a = hVar;
        this.f214556b = z15;
        this.f214557c = lVar;
    }

    private final boolean e(c cVar) {
        zs.c cVarG = cVar.g();
        return cVarG != null && this.f214557c.b(cVarG).booleanValue();
    }

    @Override // wr.h
    public c H(zs.c cVar) {
        if (this.f214557c.b(cVar).booleanValue()) {
            return this.f214555a.H(cVar);
        }
        return null;
    }

    @Override // wr.h
    public boolean d2(zs.c cVar) {
        if (this.f214557c.b(cVar).booleanValue()) {
            return this.f214555a.d2(cVar);
        }
        return false;
    }

    @Override // wr.h
    public boolean isEmpty() {
        boolean z15;
        h hVar = this.f214555a;
        if (!(hVar instanceof Collection) || !((Collection) hVar).isEmpty()) {
            Iterator<c> it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z15 = false;
                    break;
                }
                if (e(it.next())) {
                    z15 = true;
                    break;
                }
            }
        } else {
            z15 = false;
            break;
        }
        if (this.f214556b) {
            return !z15;
        }
        return z15;
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        h hVar = this.f214555a;
        ArrayList arrayList = new ArrayList();
        for (c cVar : hVar) {
            if (e(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }

    public p(h hVar, er.l<? super zs.c, Boolean> lVar) {
        this(hVar, false, lVar);
    }
}
