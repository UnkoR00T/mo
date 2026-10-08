package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class oc0 extends j40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j40 f33170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f33171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f33172c = new ArrayList();

    public oc0(j40 j40Var) {
        this.f33170a = j40Var;
    }

    private final void g(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f33171b) {
                    runnable.run();
                } else {
                    this.f33172c.add(runnable);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void a(a80 a80Var) {
        if (this.f33171b) {
            this.f33170a.a(a80Var);
        } else {
            g(new kc0(this, a80Var));
        }
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void b(Object obj) {
        if (this.f33171b) {
            this.f33170a.b(obj);
        } else {
            g(new lc0(this, obj));
        }
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void c(l90 l90Var, a80 a80Var) {
        g(new mc0(this, l90Var, a80Var));
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void d() {
        if (this.f33171b) {
            this.f33170a.d();
        } else {
            g(new nc0(this));
        }
    }

    final void e() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                try {
                    if (this.f33172c.isEmpty()) {
                        this.f33172c = null;
                        this.f33171b = true;
                        return;
                    } else {
                        list = this.f33172c;
                        this.f33172c = arrayList;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }

    final /* synthetic */ j40 f() {
        return this.f33170a;
    }
}
