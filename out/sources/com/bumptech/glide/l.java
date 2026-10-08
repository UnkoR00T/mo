package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import oe.p;
import oe.q;
import oe.s;

/* JADX INFO: loaded from: classes3.dex */
public class l implements ComponentCallbacks2, oe.l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final re.g f28790n = re.g.y0(Bitmap.class).a0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final re.g f28791p = re.g.y0(me.c.class).a0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final re.g f28792q = re.g.z0(be.j.f18724c).i0(g.LOW).q0(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.bumptech.glide.b f28793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f28794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final oe.j f28795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f28796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p f28797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s f28798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f28799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final oe.b f28800h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArrayList<re.f<Object>> f28801j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private re.g f28802k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f28803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f28804m;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            lVar.f28795c.a(lVar);
        }
    }

    private class b implements oe.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f28806a;

        b(q qVar) {
            this.f28806a = qVar;
        }

        @Override // oe.b.a
        public void a(boolean z15) {
            if (z15) {
                synchronized (l.this) {
                    this.f28806a.e();
                }
            }
        }
    }

    public l(com.bumptech.glide.b bVar, oe.j jVar, p pVar, Context context) {
        this(bVar, jVar, pVar, new q(), bVar.g(), context);
    }

    private void B(se.h<?> hVar) {
        boolean zA = A(hVar);
        re.d dVarB = hVar.b();
        if (zA || this.f28793a.p(hVar) || dVarB == null) {
            return;
        }
        hVar.i(null);
        dVarB.clear();
    }

    private synchronized void p() {
        try {
            Iterator<se.h<?>> it = this.f28798f.l().iterator();
            while (it.hasNext()) {
                o(it.next());
            }
            this.f28798f.k();
        } catch (Throwable th4) {
            throw th4;
        }
    }

    synchronized boolean A(se.h<?> hVar) {
        re.d dVarB = hVar.b();
        if (dVarB == null) {
            return true;
        }
        if (!this.f28796d.a(dVarB)) {
            return false;
        }
        this.f28798f.o(hVar);
        hVar.i(null);
        return true;
    }

    @Override // oe.l
    public synchronized void e() {
        try {
            this.f28798f.e();
            if (this.f28804m) {
                p();
            } else {
                w();
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // oe.l
    public synchronized void g() {
        this.f28798f.g();
        p();
        this.f28796d.b();
        this.f28795c.b(this);
        this.f28795c.b(this.f28800h);
        ve.l.v(this.f28799g);
        this.f28793a.s(this);
    }

    public <ResourceType> k<ResourceType> k(Class<ResourceType> cls) {
        return new k<>(this.f28793a, this, cls, this.f28794b);
    }

    public k<Bitmap> l() {
        return k(Bitmap.class).b(f28790n);
    }

    public k<Drawable> m() {
        return k(Drawable.class);
    }

    @Override // oe.l
    public synchronized void n() {
        x();
        this.f28798f.n();
    }

    public void o(se.h<?> hVar) {
        if (hVar == null) {
            return;
        }
        B(hVar);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i15) {
        if (i15 == 60 && this.f28803l) {
            v();
        }
    }

    List<re.f<Object>> q() {
        return this.f28801j;
    }

    synchronized re.g r() {
        return this.f28802k;
    }

    <T> m<?, T> s(Class<T> cls) {
        return this.f28793a.i().e(cls);
    }

    public k<Drawable> t(String str) {
        return m().P0(str);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f28796d + ", treeNode=" + this.f28797e + "}";
    }

    public synchronized void u() {
        this.f28796d.c();
    }

    public synchronized void v() {
        u();
        Iterator<l> it = this.f28797e.a().iterator();
        while (it.hasNext()) {
            it.next().u();
        }
    }

    public synchronized void w() {
        this.f28796d.d();
    }

    public synchronized void x() {
        this.f28796d.f();
    }

    protected synchronized void y(re.g gVar) {
        this.f28802k = gVar.clone().c();
    }

    synchronized void z(se.h<?> hVar, re.d dVar) {
        this.f28798f.m(hVar);
        this.f28796d.g(dVar);
    }

    l(com.bumptech.glide.b bVar, oe.j jVar, p pVar, q qVar, oe.c cVar, Context context) {
        this.f28798f = new s();
        a aVar = new a();
        this.f28799g = aVar;
        this.f28793a = bVar;
        this.f28795c = jVar;
        this.f28797e = pVar;
        this.f28796d = qVar;
        this.f28794b = context;
        oe.b bVarA = cVar.a(context.getApplicationContext(), new b(qVar));
        this.f28800h = bVarA;
        bVar.o(this);
        if (ve.l.q()) {
            ve.l.u(aVar);
        } else {
            jVar.a(this);
        }
        jVar.a(bVarA);
        this.f28801j = new CopyOnWriteArrayList<>(bVar.i().c());
        y(bVar.i().d());
    }
}
