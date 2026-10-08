package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class xc0 implements hi0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f34257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u90 f34258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f34259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f34260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f34261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private gi0 f34262h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n60 f34255a = n60.a(xc0.class, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f34256b = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Collection f34263i = new LinkedHashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile wc0 f34264j = new wc0(null, null, null);

    xc0(Executor executor, u90 u90Var) {
        this.f34257c = executor;
        this.f34258d = u90Var;
    }

    @Override // com.google.android.libraries.places.internal.s60
    public final n60 a() {
        return this.f34255a;
    }

    public final boolean b() {
        boolean z15;
        synchronized (this.f34256b) {
            z15 = !this.f34263i.isEmpty();
        }
        return z15;
    }

    @Override // com.google.android.libraries.places.internal.hi0
    public final void c(l90 l90Var) {
        Collection<vc0> collection;
        Runnable runnable;
        d(l90Var);
        synchronized (this.f34256b) {
            try {
                collection = this.f34263i;
                runnable = this.f34261g;
                this.f34261g = null;
                if (!collection.isEmpty()) {
                    this.f34263i = Collections.EMPTY_LIST;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (runnable != null) {
            for (vc0 vc0Var : collection) {
                Runnable runnableK = vc0Var.k(new ee0(l90Var, hb0.REFUSED, vc0Var.y()));
                if (runnableK != null) {
                    ((fd0) runnableK).f32291a.l();
                }
            }
            u90 u90Var = this.f34258d;
            u90Var.c(runnable);
            u90Var.a();
        }
    }

    @Override // com.google.android.libraries.places.internal.hi0
    public final void d(l90 l90Var) {
        Runnable runnable;
        synchronized (this.f34256b) {
            try {
                if (this.f34264j.f34149b != null) {
                    return;
                }
                this.f34264j = this.f34264j.b(l90Var);
                u90 u90Var = this.f34258d;
                u90Var.c(new uc0(this, l90Var));
                if (!b() && (runnable = this.f34261g) != null) {
                    u90Var.c(runnable);
                    this.f34261g = null;
                }
                this.f34258d.a();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.hi0
    public final Runnable e(gi0 gi0Var) {
        this.f34262h = gi0Var;
        this.f34259e = new rc0(this, gi0Var);
        this.f34260f = new sc0(this, gi0Var);
        this.f34261g = new tc0(this, gi0Var);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.google.android.libraries.places.internal.gb0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [com.google.android.libraries.places.internal.ee0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.libraries.places.internal.gb0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.libraries.places.internal.vc0, java.lang.Object] */
    @Override // com.google.android.libraries.places.internal.jb0
    public final gb0 g(f80 f80Var, a80 a80Var, f40 f40Var, s40[] s40VarArr) {
        ?? ee0Var;
        b70 b70VarA;
        wc0 wc0Var;
        int size;
        try {
            oj0 oj0Var = new oj0(f80Var, a80Var, f40Var, new ti0(s40VarArr));
            wc0 wc0Var2 = this.f34264j;
            while (true) {
                l90 l90Var = wc0Var2.f34149b;
                if (l90Var == null) {
                    g70 g70Var = wc0Var2.f34148a;
                    byte[] bArr = null;
                    if (g70Var != null) {
                        b70VarA = g70Var.a(oj0Var);
                        f40 f40VarA = oj0Var.a();
                        jb0 jb0VarE = ze0.e(b70VarA, f40VarA.k());
                        if (jb0VarE != null) {
                            ee0Var = jb0VarE.g(oj0Var.c(), oj0Var.b(), f40VarA, s40VarArr);
                            break;
                        }
                    } else {
                        b70VarA = null;
                    }
                    Object obj = this.f34256b;
                    synchronized (obj) {
                        try {
                            wc0Var = this.f34264j;
                            if (wc0Var2 == wc0Var) {
                                ee0Var = new vc0(this, oj0Var, s40VarArr, bArr);
                                if (oj0Var.a().k() && b70VarA != null && b70VarA.h()) {
                                    ee0Var.z(b70VarA.f());
                                }
                                this.f34263i.add(ee0Var);
                                synchronized (obj) {
                                    size = this.f34263i.size();
                                }
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    if (size == 1) {
                        this.f34258d.c(this.f34259e);
                    }
                    for (s40 s40Var : s40VarArr) {
                    }
                    break;
                }
                ee0Var = new ee0(l90Var, hb0.PROCESSED, s40VarArr);
                break;
                wc0Var2 = wc0Var;
            }
            this.f34258d.a();
            return ee0Var;
        } catch (Throwable th5) {
            this.f34258d.a();
            throw th5;
        }
    }

    final void h(g70 g70Var) {
        Runnable runnable;
        synchronized (this.f34256b) {
            this.f34264j = this.f34264j.a(g70Var);
            if (g70Var != null && b()) {
                ArrayList arrayList = new ArrayList(this.f34263i);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    vc0 vc0Var = (vc0) arrayList.get(i15);
                    b70 b70VarA = g70Var.a(vc0Var.x());
                    f40 f40VarA = vc0Var.x().a();
                    if (f40VarA.k() && b70VarA.h()) {
                        vc0Var.z(b70VarA.f());
                    }
                    jb0 jb0VarE = ze0.e(b70VarA, f40VarA.k());
                    if (jb0VarE != null) {
                        Executor executorJ = this.f34257c;
                        if (f40VarA.j() != null) {
                            executorJ = f40VarA.j();
                        }
                        Runnable runnableW = vc0Var.w(jb0VarE, null);
                        if (runnableW != null) {
                            executorJ.execute(runnableW);
                        }
                        arrayList2.add(vc0Var);
                    }
                }
                synchronized (this.f34256b) {
                    try {
                        if (b()) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                this.f34263i.remove((vc0) it.next());
                            }
                            if (this.f34263i.isEmpty()) {
                                this.f34263i = new LinkedHashSet();
                            }
                            if (!b()) {
                                u90 u90Var = this.f34258d;
                                u90Var.c(this.f34260f);
                                if (this.f34264j.f34149b != null && (runnable = this.f34261g) != null) {
                                    u90Var.c(runnable);
                                    this.f34261g = null;
                                }
                            }
                            this.f34258d.a();
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
    }

    final /* synthetic */ Object i() {
        return this.f34256b;
    }

    final /* synthetic */ u90 j() {
        return this.f34258d;
    }

    final /* synthetic */ Runnable k() {
        return this.f34260f;
    }

    final /* synthetic */ Runnable l() {
        return this.f34261g;
    }

    final /* synthetic */ void m(Runnable runnable) {
        this.f34261g = null;
    }

    final /* synthetic */ gi0 n() {
        return this.f34262h;
    }

    final /* synthetic */ Collection o() {
        return this.f34263i;
    }

    final /* synthetic */ wc0 p() {
        return this.f34264j;
    }
}
