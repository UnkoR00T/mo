package p010PrN;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.p016lifecycle.b0;
import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.y;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class n1 extends t0 {
    private b0<Integer> A;
    private b0<CharSequence> B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Executor f924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m1.a f925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m1.d f926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m1.c f927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h1 f928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o1 f929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private DialogInterface.OnClickListener f930h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f931j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f935n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b0<m1.b> f938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b0<j1> f939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b0<CharSequence> f940t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private b0<Boolean> f941v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private b0<Boolean> f942w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private b0<Boolean> f944y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f932k = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f943x = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f945z = 0;

    class a extends m1.a {
        a() {
        }
    }

    private static final class b extends h1.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<n1> f947a;

        b(n1 n1Var) {
            this.f947a = new WeakReference<>(n1Var);
        }

        @Override // PrN.h1.d
        void a(int i15, CharSequence charSequence) {
            if (this.f947a.get() == null || this.f947a.get().v9() || !this.f947a.get().t9()) {
                return;
            }
            this.f947a.get().C9(new j1(i15, charSequence));
        }

        @Override // PrN.h1.d
        void b() {
            if (this.f947a.get() == null || !this.f947a.get().t9()) {
                return;
            }
            this.f947a.get().D9(true);
        }

        @Override // PrN.h1.d
        void c(CharSequence charSequence) {
            if (this.f947a.get() != null) {
                this.f947a.get().E9(charSequence);
            }
        }

        @Override // PrN.h1.d
        void d(m1.b bVar) {
            if (this.f947a.get() == null || !this.f947a.get().t9()) {
                return;
            }
            if (bVar.a() == -1) {
                bVar = new m1.b(bVar.b(), this.f947a.get().n9());
            }
            this.f947a.get().F9(bVar);
        }
    }

    private static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f948a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f948a.post(runnable);
        }
    }

    private static class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<n1> f949a;

        d(n1 n1Var) {
            this.f949a = new WeakReference<>(n1Var);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i15) {
            if (this.f949a.get() != null) {
                this.f949a.get().T9(true);
            }
        }
    }

    private static <T> void X9(b0<T> b0Var, T t15) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            b0Var.o(t15);
        } else {
            b0Var.m(t15);
        }
    }

    y<Boolean> A9() {
        if (this.f942w == null) {
            this.f942w = new b0<>();
        }
        return this.f942w;
    }

    boolean B9() {
        return this.f933l;
    }

    void C9(j1 j1Var) {
        if (this.f939s == null) {
            this.f939s = new b0<>();
        }
        X9(this.f939s, j1Var);
    }

    void D9(boolean z15) {
        if (this.f941v == null) {
            this.f941v = new b0<>();
        }
        X9(this.f941v, Boolean.valueOf(z15));
    }

    void E9(CharSequence charSequence) {
        if (this.f940t == null) {
            this.f940t = new b0<>();
        }
        X9(this.f940t, charSequence);
    }

    void F9(m1.b bVar) {
        if (this.f938r == null) {
            this.f938r = new b0<>();
        }
        X9(this.f938r, bVar);
    }

    void G9(boolean z15) {
        this.f934m = z15;
    }

    void H9(int i15) {
        this.f932k = i15;
    }

    void I9(m1.a aVar) {
        this.f925c = aVar;
    }

    void J9(Executor executor) {
        this.f924b = executor;
    }

    void K9(boolean z15) {
        this.f935n = z15;
    }

    void L9(m1.c cVar) {
        this.f927e = cVar;
    }

    void M9(boolean z15) {
        this.f936p = z15;
    }

    void N9(boolean z15) {
        if (this.f944y == null) {
            this.f944y = new b0<>();
        }
        X9(this.f944y, Boolean.valueOf(z15));
    }

    void O9(boolean z15) {
        this.f943x = z15;
    }

    void P9(CharSequence charSequence) {
        if (this.B == null) {
            this.B = new b0<>();
        }
        X9(this.B, charSequence);
    }

    void Q9(int i15) {
        this.f945z = i15;
    }

    void R9(int i15) {
        if (this.A == null) {
            this.A = new b0<>();
        }
        X9(this.A, Integer.valueOf(i15));
    }

    void S9(boolean z15) {
        this.f937q = z15;
    }

    void T9(boolean z15) {
        if (this.f942w == null) {
            this.f942w = new b0<>();
        }
        X9(this.f942w, Boolean.valueOf(z15));
    }

    void U9(CharSequence charSequence) {
        this.f931j = charSequence;
    }

    void V9(m1.d dVar) {
        this.f926d = dVar;
    }

    void W9(boolean z15) {
        this.f933l = z15;
    }

    int Z8() {
        m1.d dVar = this.f926d;
        if (dVar != null) {
            return i1.b(dVar, this.f927e);
        }
        return 0;
    }

    h1 a9() {
        if (this.f928f == null) {
            this.f928f = new h1(new b(this));
        }
        return this.f928f;
    }

    b0<j1> b9() {
        if (this.f939s == null) {
            this.f939s = new b0<>();
        }
        return this.f939s;
    }

    y<CharSequence> c9() {
        if (this.f940t == null) {
            this.f940t = new b0<>();
        }
        return this.f940t;
    }

    y<m1.b> d9() {
        if (this.f938r == null) {
            this.f938r = new b0<>();
        }
        return this.f938r;
    }

    int e9() {
        return this.f932k;
    }

    o1 f9() {
        if (this.f929g == null) {
            this.f929g = new o1();
        }
        return this.f929g;
    }

    m1.a g9() {
        if (this.f925c == null) {
            this.f925c = new a();
        }
        return this.f925c;
    }

    Executor h9() {
        Executor executor = this.f924b;
        return executor != null ? executor : new c();
    }

    m1.c i9() {
        return this.f927e;
    }

    CharSequence j9() {
        m1.d dVar = this.f926d;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    y<CharSequence> k9() {
        if (this.B == null) {
            this.B = new b0<>();
        }
        return this.B;
    }

    int l9() {
        return this.f945z;
    }

    y<Integer> m9() {
        if (this.A == null) {
            this.A = new b0<>();
        }
        return this.A;
    }

    int n9() {
        int iZ8 = Z8();
        return (!i1.d(iZ8) || i1.c(iZ8)) ? -1 : 2;
    }

    DialogInterface.OnClickListener o9() {
        if (this.f930h == null) {
            this.f930h = new d(this);
        }
        return this.f930h;
    }

    CharSequence p9() {
        CharSequence charSequence = this.f931j;
        if (charSequence != null) {
            return charSequence;
        }
        m1.d dVar = this.f926d;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    CharSequence q9() {
        m1.d dVar = this.f926d;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    CharSequence r9() {
        m1.d dVar = this.f926d;
        if (dVar != null) {
            return dVar.e();
        }
        return null;
    }

    y<Boolean> s9() {
        if (this.f941v == null) {
            this.f941v = new b0<>();
        }
        return this.f941v;
    }

    boolean t9() {
        return this.f934m;
    }

    boolean u9() {
        m1.d dVar = this.f926d;
        return dVar == null || dVar.f();
    }

    boolean v9() {
        return this.f935n;
    }

    boolean w9() {
        return this.f936p;
    }

    y<Boolean> x9() {
        if (this.f944y == null) {
            this.f944y = new b0<>();
        }
        return this.f944y;
    }

    boolean y9() {
        return this.f943x;
    }

    boolean z9() {
        return this.f937q;
    }
}
