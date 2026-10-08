package m0;

import android.annotation.SuppressLint;
import androidx.p016lifecycle.d0;
import androidx.p016lifecycle.p;
import androidx.p016lifecycle.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import o.d1;
import o.j2;
import o.p1;
import o.u1;
import r.ResolvedFeatureGroup;
import v.m0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UsesNonDefaultVisibleForTesting"})
public final class c implements p, o.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f121936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0.f f121937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p1 f121938d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f121935a = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f121939e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f121940f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f121941g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private u1 f121942h = null;

    c(q qVar, b0.f fVar, p1 p1Var) {
        this.f121936b = qVar;
        this.f121937c = fVar;
        this.f121938d = p1Var;
        if (qVar.getLifecycleRegistry().getState().e(androidx.lifecycle.j.b.STARTED)) {
            fVar.x();
        } else {
            fVar.I();
        }
        qVar.getLifecycleRegistry().a(this);
    }

    private void C(List<j2> list, p1 p1Var) {
        for (j2 j2Var : list) {
            if (j2Var.F()) {
                j2Var.a0(p1Var);
            }
        }
    }

    public static /* synthetic */ void f(ResolvedFeatureGroup bVar, u1 u1Var) {
        HashSet hashSet = new HashSet();
        if (bVar != null) {
            hashSet.addAll(bVar.a());
        }
        u1Var.e().accept(hashSet);
    }

    void A() {
        synchronized (this.f121935a) {
            List<j2> listP = this.f121937c.P();
            this.f121937c.e0(listP);
            C(listP, null);
            this.f121942h = null;
        }
    }

    public void B() {
        synchronized (this.f121935a) {
            try {
                if (this.f121940f) {
                    this.f121940f = false;
                    if (this.f121936b.getLifecycleRegistry().getState().e(androidx.lifecycle.j.b.STARTED)) {
                        onStart(this.f121936b);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // o.i
    public o.j a() {
        return this.f121937c.a();
    }

    @Override // o.i
    public o.q c() {
        return this.f121937c.c();
    }

    void j(final u1 u1Var) {
        synchronized (this.f121935a) {
            try {
                if (this.f121942h == null) {
                    this.f121942h = u1Var;
                } else if (u1Var.getIsLegacy()) {
                    if (!this.f121942h.getIsLegacy()) {
                        throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                    }
                    ArrayList arrayList = new ArrayList(this.f121942h.m());
                    arrayList.addAll(u1Var.m());
                    this.f121942h = new d1(arrayList, u1Var.getViewPort(), u1Var.d());
                } else {
                    if (this.f121942h.getIsLegacy()) {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                    this.f121942h = u1Var;
                    b0.f fVar = this.f121937c;
                    fVar.e0(fVar.P());
                }
                this.f121937c.l0(u1Var.getViewPort());
                this.f121937c.h0(u1Var.d());
                this.f121937c.k0(u1Var.getSessionType());
                this.f121937c.j0(u1Var.g());
                if (u1Var.getIsAutoRotationEnabled()) {
                    C(u1Var.m(), this.f121938d);
                }
                final ResolvedFeatureGroup bVarB = ResolvedFeatureGroup.b(u1Var, (m0) c());
                u1Var.getFeatureSelectionListenerExecutor().execute(new Runnable() { // from class: m0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.f(bVarB, u1Var);
                    }
                });
                this.f121937c.m(u1Var.m(), bVarB);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @d0(androidx.lifecycle.j.a.ON_DESTROY)
    public void onDestroy(q qVar) {
        synchronized (this.f121935a) {
            b0.f fVar = this.f121937c;
            fVar.e0(fVar.P());
        }
    }

    @d0(androidx.lifecycle.j.a.ON_PAUSE)
    public void onPause(q qVar) {
        this.f121937c.k(false);
    }

    @d0(androidx.lifecycle.j.a.ON_RESUME)
    public void onResume(q qVar) {
        this.f121937c.k(true);
    }

    @d0(androidx.lifecycle.j.a.ON_START)
    public void onStart(q qVar) {
        synchronized (this.f121935a) {
            try {
                if (!this.f121940f && !this.f121941g) {
                    this.f121937c.x();
                    this.f121939e = true;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @d0(androidx.lifecycle.j.a.ON_STOP)
    public void onStop(q qVar) {
        synchronized (this.f121935a) {
            try {
                if (!this.f121940f && !this.f121941g) {
                    this.f121937c.I();
                    this.f121939e = false;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public b0.f q() {
        return this.f121937c;
    }

    public q u() {
        q qVar;
        synchronized (this.f121935a) {
            qVar = this.f121936b;
        }
        return qVar;
    }

    public List<j2> v() {
        List<j2> listUnmodifiableList;
        synchronized (this.f121935a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f121937c.P());
        }
        return listUnmodifiableList;
    }

    public boolean w(j2 j2Var) {
        boolean zContains;
        synchronized (this.f121935a) {
            zContains = this.f121937c.P().contains(j2Var);
        }
        return zContains;
    }

    boolean y() {
        boolean zP;
        synchronized (this.f121935a) {
            u1 u1Var = this.f121942h;
            zP = u1Var == null ? false : u1Var.getIsLegacy();
        }
        return zP;
    }

    public void z() {
        synchronized (this.f121935a) {
            try {
                if (this.f121940f) {
                    return;
                }
                onStop(this.f121936b);
                this.f121940f = true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
