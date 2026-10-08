package com.google.android.libraries.places.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class qo extends u50 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ak.n0 f33429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedHashMap f33430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f33431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashMap f33432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f33433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f33435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f33436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a80 f33437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private l90 f33438k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a80 f33439l;

    qo(j40 j40Var, ak.n0 n0Var, Set set, Executor executor) {
        super(j40Var);
        this.f33430c = new LinkedHashMap();
        this.f33431d = new ArrayDeque();
        this.f33432e = new LinkedHashMap();
        this.f33429b = n0Var;
        this.f33434g = n0Var.size();
        this.f33433f = set;
    }

    private final boolean f() {
        return !this.f33430c.isEmpty();
    }

    private final void g() {
        if (this.f33435h) {
            Queue<po> queue = this.f33431d;
            for (po poVar : queue) {
                Iterator it = ak.a1.j(this.f33429b.subList(0, poVar.d())).iterator();
                while (it.hasNext()) {
                    Iterator it4 = ak.a1.j((List) it.next()).iterator();
                    while (it4.hasNext()) {
                        if (this.f33433f.contains((on) it4.next())) {
                            zj.p.r(poVar.c(), "Response message cannot be null");
                        }
                    }
                    if (!poVar.a()) {
                        return;
                    } else {
                        poVar.e(poVar.d() - 1);
                    }
                }
            }
            while (!queue.isEmpty() && ((po) queue.peek()).b()) {
                e().b(((po) queue.poll()).c());
            }
            h();
        }
    }

    private final void h() {
        if (!f() && this.f33431d.isEmpty() && this.f33436i) {
            Iterator it = ak.a1.j(this.f33429b).iterator();
            while (it.hasNext()) {
                for (on onVar : ak.a1.j((List) it.next())) {
                    l90 l90Var = this.f33438k;
                    a80 a80Var = this.f33439l;
                    this.f33433f.contains(onVar);
                }
            }
            if (this.f33432e.isEmpty()) {
                e().c(this.f33438k, this.f33439l);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void a(a80 a80Var) {
        this.f33437j = a80Var;
        for (List list : ak.a1.j(this.f33429b.subList(0, this.f33434g))) {
            this.f33434g--;
            Iterator it = ak.a1.j(list).iterator();
            while (it.hasNext()) {
                this.f33433f.contains((on) it.next());
            }
            if (f()) {
                return;
            }
        }
        e().a(this.f33437j);
        this.f33435h = true;
        g();
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void b(Object obj) {
        this.f33431d.add(new po(this, obj, this.f33429b.size()));
        g();
    }

    @Override // com.google.android.libraries.places.internal.j40
    public final void c(l90 l90Var, a80 a80Var) {
        this.f33438k = l90Var;
        this.f33439l = a80Var;
        this.f33436i = true;
        h();
    }
}
