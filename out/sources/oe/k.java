package oe;

import androidx.p016lifecycle.d0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class k implements j, androidx.p016lifecycle.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<l> f144988a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.p016lifecycle.j f144989b;

    k(androidx.p016lifecycle.j jVar) {
        this.f144989b = jVar;
        jVar.a(this);
    }

    @Override // oe.j
    public void a(l lVar) {
        this.f144988a.add(lVar);
        if (this.f144989b.getState() == androidx.lifecycle.j.b.DESTROYED) {
            lVar.g();
        } else if (this.f144989b.getState().e(androidx.lifecycle.j.b.STARTED)) {
            lVar.n();
        } else {
            lVar.e();
        }
    }

    @Override // oe.j
    public void b(l lVar) {
        this.f144988a.remove(lVar);
    }

    @d0(androidx.lifecycle.j.a.ON_DESTROY)
    public void onDestroy(androidx.p016lifecycle.q qVar) {
        Iterator it = ve.l.j(this.f144988a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).g();
        }
        qVar.getLifecycle().d(this);
    }

    @d0(androidx.lifecycle.j.a.ON_START)
    public void onStart(androidx.p016lifecycle.q qVar) {
        Iterator it = ve.l.j(this.f144988a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).n();
        }
    }

    @d0(androidx.lifecycle.j.a.ON_STOP)
    public void onStop(androidx.p016lifecycle.q qVar) {
        Iterator it = ve.l.j(this.f144988a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).e();
        }
    }
}
