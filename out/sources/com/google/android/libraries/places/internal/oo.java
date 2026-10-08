package com.google.android.libraries.places.internal;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class oo extends l40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g40 f33206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f80 f33207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ak.n0 f33208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f33209d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f40 f33215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f33216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private no f33217l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j40 f33220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private a80 f33221p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final mo f33223r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private l40 f33225t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f33210e = ak.b2.h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LinkedHashMap f33211f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f33212g = ak.b2.h();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f33222q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f33224s = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Deque f33213h = new ArrayDeque();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Queue f33218m = new ArrayDeque();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Queue f33214i = new ArrayDeque();

    oo(g40 g40Var, f80 f80Var, f40 f40Var, int i15, ak.n0 n0Var) {
        this.f33206a = g40Var;
        this.f33207b = f80Var;
        this.f33215j = f40Var;
        this.f33208c = n0Var;
        this.f33217l = no.b(n0Var.size());
        Executor executorJ = f40Var.j();
        mo moVar = new mo(executorJ == null ? com.google.common.util.concurrent.u.a() : executorJ);
        this.f33223r = moVar;
        final Executor executorC = com.google.common.util.concurrent.u.c(moVar);
        this.f33209d = new Executor() { // from class: com.google.android.libraries.places.internal.eo
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(final Runnable runnable) {
                final oo ooVar = this.f32230a;
                executorC.execute(new Runnable() { // from class: com.google.android.libraries.places.internal.tn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        ooVar.s(runnable);
                    }
                });
            }
        };
    }

    private final boolean A(wo woVar) {
        int iOrdinal = woVar.c().ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            throw null;
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new IllegalStateException("Unrecognized outcome type: ".concat(String.valueOf(woVar.c())));
            }
            this.f33217l.a();
            return false;
        }
        final com.google.common.util.concurrent.q qVarD = woVar.d();
        this.f33210e.add(qVarD);
        qVarD.b(u81.a(new Runnable() { // from class: com.google.android.libraries.places.internal.wn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f34180a.l(qVarD);
            }
        }), this.f33209d);
        return false;
    }

    private final void B() {
        int iG = this.f33217l.g() - 1;
        if (iG == 1) {
            for (lo loVar : this.f33213h) {
                if (loVar.e() <= this.f33217l.f()) {
                    C(loVar, loVar.e(), this.f33217l.f() + 1);
                }
            }
            return;
        }
        if (iG != 3) {
            return;
        }
        for (lo loVar2 : this.f33213h) {
            C(loVar2, loVar2.e(), this.f33217l.d());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void C(final lo loVar, int i15, int i16) {
        final nn nnVarA = nn.a(loVar.c());
        while (i15 < i16) {
            ak.n0 n0Var = (ak.n0) this.f33208c.get(i15);
            int size = n0Var.size();
            for (int i17 = 0; i17 < size; i17++) {
                on onVar = (on) n0Var.get(i17);
                wo woVarA = wo.a();
                if (woVarA.c().equals(uo.CONTINUE_AFTER)) {
                    com.google.common.util.concurrent.q qVarD = woVarA.d();
                    loVar.d().put(onVar, qVarD);
                    qVarD.b(u81.a(new Runnable() { // from class: com.google.android.libraries.places.internal.yn
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f34414a.n(nnVarA, loVar);
                        }
                    }), this.f33209d);
                }
                A(woVarA);
            }
            i15++;
        }
        loVar.f(i16);
        if (loVar.d().isEmpty()) {
            g();
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void o(final nn nnVar, final lo loVar) {
        Iterator it = loVar.d().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((com.google.common.util.concurrent.q) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            on onVar = (on) entry.getKey();
            wo woVarA = wo.a();
            if (woVarA.c().equals(uo.CONTINUE_AFTER)) {
                com.google.common.util.concurrent.q qVarD = woVarA.d();
                loVar.d().put(onVar, qVarD);
                qVarD.b(u81.a(new Runnable() { // from class: com.google.android.libraries.places.internal.zn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f34521a.o(nnVar, loVar);
                    }
                }), this.f33209d);
            }
            A(woVarA);
        }
        if (loVar.d().isEmpty()) {
            g();
            h();
        }
    }

    private final void g() {
        while (true) {
            Deque deque = this.f33213h;
            if (deque.isEmpty() || !((lo) deque.peek()).a()) {
                return;
            }
            Object objC = ((lo) deque.poll()).c();
            if (this.f33217l.g() == 4) {
                this.f33225t.b(objC);
            } else {
                this.f33214i.add(objC);
            }
        }
    }

    private final void h() {
        if (this.f33222q) {
            lo loVar = (lo) this.f33213h.peekLast();
            int iG = this.f33217l.g() - 1;
            if (iG != 1) {
                if (iG == 3 && loVar == null) {
                    this.f33225t.d();
                    return;
                }
                return;
            }
            if (loVar == null || loVar.b()) {
                z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void i(a80 a80Var) {
        final mn mnVarA = mn.a(this.f33207b, this.f33215j, a80Var, this.f33206a.h());
        ak.n0 n0Var = (ak.n0) this.f33208c.get(this.f33217l.e());
        int size = n0Var.size();
        for (int i15 = 0; i15 < size; i15++) {
            on onVar = (on) n0Var.get(i15);
            wo woVarA = onVar.a(y(mnVarA));
            if (woVarA.c().equals(uo.CONTINUE_AFTER)) {
                com.google.common.util.concurrent.q qVarD = woVarA.d();
                this.f33211f.put(onVar, qVarD);
                qVarD.b(u81.a(new Runnable() { // from class: com.google.android.libraries.places.internal.un
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f33950a.j(mnVarA);
                    }
                }), this.f33209d);
            }
            A(woVarA);
            this.f33212g.add(onVar);
        }
        if (this.f33211f.isEmpty()) {
            z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void k(final mn mnVar) {
        LinkedHashMap linkedHashMap = this.f33211f;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((com.google.common.util.concurrent.q) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            on onVar = (on) entry.getKey();
            wo woVarB = onVar.b(y(mnVar));
            if (woVarB.c().equals(uo.CONTINUE_AFTER)) {
                com.google.common.util.concurrent.q qVarD = woVarB.d();
                linkedHashMap.put(onVar, qVarD);
                qVarD.b(u81.a(new Runnable() { // from class: com.google.android.libraries.places.internal.vn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f34071a.k(mnVar);
                    }
                }), this.f33209d);
            }
            A(woVarB);
        }
        if (!linkedHashMap.isEmpty() || this.f33224s) {
            return;
        }
        z();
    }

    private final mn y(mn mnVar) {
        f40 f40Var = this.f33215j;
        if (f40Var == mnVar.c()) {
            return mnVar;
        }
        return mn.a(this.f33207b, f40Var, mnVar.b(), mnVar.d());
    }

    private final void z() {
        no noVarC = this.f33217l.c();
        this.f33217l = noVarC;
        int iG = noVarC.g() - 1;
        if (iG == 0) {
            i(this.f33221p);
            return;
        }
        if (iG != 2) {
            B();
            return;
        }
        l40 l40VarB = this.f33206a.b(this.f33207b, this.f33215j);
        this.f33225t = l40VarB;
        l40VarB.a(this.f33220o, this.f33221p);
        int i15 = this.f33216k;
        if (i15 > 0) {
            this.f33225t.c(i15);
        }
        Iterator it = this.f33214i.iterator();
        while (it.hasNext()) {
            this.f33225t.b(it.next());
        }
        if (this.f33222q && this.f33213h.isEmpty()) {
            this.f33225t.d();
        }
        z();
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void a(j40 j40Var, final a80 a80Var) {
        ak.n0 n0Var = this.f33208c;
        Set set = this.f33212g;
        Executor executor = this.f33209d;
        this.f33220o = new ko(this, new bp(new qo(j40Var, n0Var, set, executor)));
        this.f33221p = a80Var;
        executor.execute(u81.a(new Runnable() { // from class: com.google.android.libraries.places.internal.sn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f33705a.i(a80Var);
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void b(final Object obj) {
        this.f33209d.execute(u81.a(new Runnable() { // from class: com.google.android.libraries.places.internal.xn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f34299a.m(obj);
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void c(final int i15) {
        synchronized (this.f33218m) {
            this.f33219n += i15;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Queue queue = this.f33218m;
        synchronized (queue) {
            try {
                if (!queue.isEmpty()) {
                    int i16 = this.f33219n;
                    for (int i17 = 0; i17 < i16; i17++) {
                        Object objPoll = queue.poll();
                        if (objPoll != null) {
                            arrayDeque.add(objPoll);
                            this.f33219n--;
                        }
                    }
                    boolean zIsEmpty = queue.isEmpty();
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        this.f33220o.b(it.next());
                    }
                    if (zIsEmpty) {
                        this.f33220o.c(l90.f32807e, null);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f33209d.execute(u81.a(new Runnable() { // from class: com.google.android.libraries.places.internal.ao
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f31674a.p(i15);
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void d() {
        this.f33209d.execute(u81.a(new Runnable() { // from class: com.google.android.libraries.places.internal.bo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f31809a.q();
            }
        }));
    }

    @Override // com.google.android.libraries.places.internal.l40
    public final void e(final String str, final Throwable th4) {
        this.f33209d.execute(u81.a(new Runnable() { // from class: com.google.android.libraries.places.internal.co
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f31917a.r(str, th4);
            }
        }));
    }

    final /* synthetic */ void l(com.google.common.util.concurrent.q qVar) {
        this.f33210e.remove(qVar);
    }

    final /* synthetic */ void m(Object obj) {
        this.f33213h.add(new lo(this, obj, null));
        B();
    }

    final /* synthetic */ void p(int i15) {
        if (this.f33224s) {
            return;
        }
        if (this.f33217l.g() == 4) {
            this.f33225t.c(i15);
        } else {
            this.f33216k += i15;
        }
    }

    final /* synthetic */ void q() {
        if (this.f33224s) {
            return;
        }
        this.f33222q = true;
        h();
    }

    final /* synthetic */ void r(String str, Throwable th4) {
        Iterator it = this.f33210e.iterator();
        while (it.hasNext()) {
            ((com.google.common.util.concurrent.q) it.next()).cancel(true);
        }
        l40 l40Var = this.f33225t;
        if (l40Var != null) {
            l40Var.e(str, th4);
        }
    }

    final /* synthetic */ void s(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th4) {
            this.f33224s = true;
            j40 j40Var = this.f33220o;
            if (j40Var != null) {
                j40Var.c(l90.b(th4), new a80());
                if (this.f33225t == null || this.f33217l.g() != 4) {
                    return;
                }
                this.f33225t.e(null, th4);
            }
        }
    }

    final /* synthetic */ Executor t() {
        return this.f33209d;
    }

    final /* synthetic */ no u() {
        return this.f33217l;
    }

    final /* synthetic */ mo v() {
        return this.f33223r;
    }
}
