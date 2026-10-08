package oe;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<se.h<?>> f145019a = Collections.newSetFromMap(new WeakHashMap());

    @Override // oe.l
    public void e() {
        Iterator it = ve.l.j(this.f145019a).iterator();
        while (it.hasNext()) {
            ((se.h) it.next()).e();
        }
    }

    @Override // oe.l
    public void g() {
        Iterator it = ve.l.j(this.f145019a).iterator();
        while (it.hasNext()) {
            ((se.h) it.next()).g();
        }
    }

    public void k() {
        this.f145019a.clear();
    }

    public List<se.h<?>> l() {
        return ve.l.j(this.f145019a);
    }

    public void m(se.h<?> hVar) {
        this.f145019a.add(hVar);
    }

    @Override // oe.l
    public void n() {
        Iterator it = ve.l.j(this.f145019a).iterator();
        while (it.hasNext()) {
            ((se.h) it.next()).n();
        }
    }

    public void o(se.h<?> hVar) {
        this.f145019a.remove(hVar);
    }
}
