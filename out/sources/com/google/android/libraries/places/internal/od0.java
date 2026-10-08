package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class od0 implements ib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f33173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f33174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f33175c = new ArrayList();

    public od0(ib0 ib0Var) {
        this.f33173a = ib0Var;
    }

    private final void g(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f33174b) {
                    runnable.run();
                } else {
                    this.f33175c.add(runnable);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.lm0
    public final void a(km0 km0Var) {
        if (this.f33174b) {
            this.f33173a.a(km0Var);
        } else {
            g(new kd0(this, km0Var));
        }
    }

    @Override // com.google.android.libraries.places.internal.ib0
    public final void b(l90 l90Var, hb0 hb0Var, a80 a80Var) {
        g(new nd0(this, l90Var, hb0Var, a80Var));
    }

    @Override // com.google.android.libraries.places.internal.lm0
    public final void c() {
        if (this.f33174b) {
            this.f33173a.c();
        } else {
            g(new ld0(this));
        }
    }

    @Override // com.google.android.libraries.places.internal.ib0
    public final void d(a80 a80Var) {
        g(new md0(this, a80Var));
    }

    public final void e() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                try {
                    if (this.f33175c.isEmpty()) {
                        this.f33175c = null;
                        this.f33174b = true;
                        return;
                    } else {
                        list = this.f33175c;
                        this.f33175c = arrayList;
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

    final /* synthetic */ ib0 f() {
        return this.f33173a;
    }
}
