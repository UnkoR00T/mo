package androidx.p016lifecycle;

import p009PRn.g1;
import p101pRn.l2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y<T> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f12856k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f12857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g1<c0<? super T>, y<T>.d> f12858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f12859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f12861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f12862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f12863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f12866j;

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (y.this.f12857a) {
                obj = y.this.f12862f;
                y.this.f12862f = y.f12856k;
            }
            y.this.o(obj);
        }
    }

    private class b extends y<T>.d {
        b(c0<? super T> c0Var) {
            super(c0Var);
        }

        @Override // androidx.lifecycle.y.d
        boolean d() {
            return true;
        }
    }

    class c extends y<T>.d implements n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final q f12869e;

        c(q qVar, c0<? super T> c0Var) {
            super(c0Var);
            this.f12869e = qVar;
        }

        @Override // androidx.lifecycle.y.d
        void b() {
            this.f12869e.a().d(this);
        }

        @Override // androidx.lifecycle.y.d
        boolean c(q qVar) {
            return this.f12869e == qVar;
        }

        @Override // androidx.lifecycle.y.d
        boolean d() {
            return this.f12869e.a().b().e(j.b.STARTED);
        }

        @Override // androidx.p016lifecycle.n
        public void m(q qVar, j.a aVar) {
            j.b bVarB = this.f12869e.a().b();
            if (bVarB == j.b.DESTROYED) {
                y.this.n(this.f12871a);
                return;
            }
            j.b bVar = null;
            while (bVar != bVarB) {
                a(d());
                bVar = bVarB;
                bVarB = this.f12869e.a().b();
            }
        }
    }

    private abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c0<? super T> f12871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f12872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f12873c = -1;

        d(c0<? super T> c0Var) {
            this.f12871a = c0Var;
        }

        void a(boolean z15) {
            if (z15 == this.f12872b) {
                return;
            }
            this.f12872b = z15;
            y.this.c(z15 ? 1 : -1);
            if (this.f12872b) {
                y.this.e(this);
            }
        }

        void b() {
        }

        boolean c(q qVar) {
            return false;
        }

        abstract boolean d();
    }

    public y(T t15) {
        this.f12857a = new Object();
        this.f12858b = new g1<>();
        this.f12859c = 0;
        this.f12862f = f12856k;
        this.f12866j = new a();
        this.f12861e = t15;
        this.f12863g = 0;
    }

    static void b(String str) {
        if (l2.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(y<T>.d dVar) {
        if (dVar.f12872b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i15 = dVar.f12873c;
            int i16 = this.f12863g;
            if (i15 >= i16) {
                return;
            }
            dVar.f12873c = i16;
            dVar.f12871a.a((Object) this.f12861e);
        }
    }

    void c(int i15) {
        int i16 = this.f12859c;
        this.f12859c = i15 + i16;
        if (this.f12860d) {
            return;
        }
        this.f12860d = true;
        while (true) {
            try {
                int i17 = this.f12859c;
                if (i16 == i17) {
                    this.f12860d = false;
                    return;
                }
                boolean z15 = i16 == 0 && i17 > 0;
                boolean z16 = i16 > 0 && i17 == 0;
                if (z15) {
                    k();
                } else if (z16) {
                    l();
                }
                i16 = i17;
            } catch (Throwable th4) {
                this.f12860d = false;
                throw th4;
            }
        }
    }

    void e(y<T>.d dVar) {
        if (this.f12864h) {
            this.f12865i = true;
            return;
        }
        this.f12864h = true;
        do {
            this.f12865i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                g1<c0<? super T>, y<T>.d>.d dVarG = this.f12858b.g();
                while (dVarG.hasNext()) {
                    d((d) dVarG.next().getValue());
                    if (this.f12865i) {
                        break;
                    }
                }
            }
        } while (this.f12865i);
        this.f12864h = false;
    }

    public T f() {
        T t15 = (T) this.f12861e;
        if (t15 != f12856k) {
            return t15;
        }
        return null;
    }

    int g() {
        return this.f12863g;
    }

    public boolean h() {
        return this.f12859c > 0;
    }

    public void i(q qVar, c0<? super T> c0Var) {
        b("observe");
        if (qVar.a().b() == j.b.DESTROYED) {
            return;
        }
        c cVar = new c(qVar, c0Var);
        y<T>.d dVarJ = this.f12858b.j(c0Var, cVar);
        if (dVarJ != null && !dVarJ.c(qVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarJ != null) {
            return;
        }
        qVar.a().a(cVar);
    }

    public void j(c0<? super T> c0Var) {
        b("observeForever");
        b bVar = new b(c0Var);
        y<T>.d dVarJ = this.f12858b.j(c0Var, bVar);
        if (dVarJ instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVarJ != null) {
            return;
        }
        bVar.a(true);
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void m(T t15) {
        boolean z15;
        synchronized (this.f12857a) {
            z15 = this.f12862f == f12856k;
            this.f12862f = t15;
        }
        if (z15) {
            l2.g().c(this.f12866j);
        }
    }

    public void n(c0<? super T> c0Var) {
        b("removeObserver");
        y<T>.d dVarK = this.f12858b.k(c0Var);
        if (dVarK == null) {
            return;
        }
        dVarK.b();
        dVarK.a(false);
    }

    protected void o(T t15) {
        b("setValue");
        this.f12863g++;
        this.f12861e = t15;
        e(null);
    }

    public y() {
        this.f12857a = new Object();
        this.f12858b = new g1<>();
        this.f12859c = 0;
        Object obj = f12856k;
        this.f12862f = obj;
        this.f12866j = new a();
        this.f12861e = obj;
        this.f12863g = -1;
    }
}
