package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.o;
import androidx.p016lifecycle.C6451z0;
import androidx.p016lifecycle.p0;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.x0;
import androidx.p016lifecycle.y0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes3.dex */
public class o implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.p016lifecycle.q, y0, androidx.p016lifecycle.h, ua.j {
    static final Object E0 = new Object();
    FragmentManager A;
    private int A0;
    o B;
    private final AtomicInteger B0;
    int C;
    private final ArrayList<i> C0;
    int D;
    private final i D0;
    String E;
    boolean F;
    boolean G;
    boolean H;
    boolean I;
    boolean K;
    boolean L;
    private boolean O;
    ViewGroup P;
    View R;
    boolean T;
    boolean X;
    g Y;
    Handler Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f12589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Bundle f12590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SparseArray<Parcelable> f12591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Bundle f12592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Boolean f12593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f12594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Bundle f12595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    o f12596h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    Runnable f12597h0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f12598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f12599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Boolean f12600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f12601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f12602n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f12603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f12604q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    boolean f12605q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f12606r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    LayoutInflater f12607r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f12608s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    boolean f12609s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f12610t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f12611t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    androidx.lifecycle.j.b f12612u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f12613v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    androidx.p016lifecycle.s f12614v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f12615w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    g0 f12616w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f12617x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    androidx.p016lifecycle.b0<androidx.p016lifecycle.q> f12618x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    FragmentManager f12619y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    w0.c f12620y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    t<?> f12621z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    ua.i f12622z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.Q1();
        }
    }

    class b extends i {
        b() {
            super(null);
        }

        @Override // androidx.fragment.app.o.i
        void a() {
            o.this.f12622z0.c();
            androidx.p016lifecycle.l0.c(o.this);
            Bundle bundle = o.this.f12590b;
            o.this.f12622z0.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.j(false);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0 f12626a;

        d(k0 k0Var) {
            this.f12626a = k0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12626a.y()) {
                this.f12626a.n();
            }
        }
    }

    class e extends e7.g {
        e() {
        }

        @Override // e7.g
        public View e(int i15) {
            View view = o.this.R;
            if (view != null) {
                return view.findViewById(i15);
            }
            throw new IllegalStateException("Fragment " + o.this + " does not have a view");
        }

        @Override // e7.g
        public boolean g() {
            return o.this.R != null;
        }
    }

    class f implements androidx.p016lifecycle.n {
        f() {
        }

        @Override // androidx.p016lifecycle.n
        public void m(androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
            View view;
            if (aVar != androidx.lifecycle.j.a.ON_STOP || (view = o.this.R) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f12630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f12631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f12632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f12633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f12634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f12635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f12636g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ArrayList<String> f12637h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        ArrayList<String> f12638i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f12639j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f12640k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f12641l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f12642m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f12643n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f12644o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f12645p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Boolean f12646q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        s5.v f12647r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        s5.v f12648s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float f12649t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        View f12650u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f12651v;

        g() {
            Object obj = o.E0;
            this.f12640k = obj;
            this.f12641l = null;
            this.f12642m = obj;
            this.f12643n = null;
            this.f12644o = obj;
            this.f12647r = null;
            this.f12648s = null;
            this.f12649t = 1.0f;
            this.f12650u = null;
        }
    }

    public static class h extends RuntimeException {
        public h(String str, Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class i {
        private i() {
        }

        abstract void a();

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    public o() {
        this.f12589a = -1;
        this.f12594f = UUID.randomUUID().toString();
        this.f12598j = null;
        this.f12600l = null;
        this.A = new w();
        this.L = true;
        this.X = true;
        this.f12597h0 = new a();
        this.f12612u0 = androidx.lifecycle.j.b.RESUMED;
        this.f12618x0 = new androidx.p016lifecycle.b0<>();
        this.B0 = new AtomicInteger();
        this.C0 = new ArrayList<>();
        this.D0 = new b();
        f0();
    }

    private void C1() {
        if (FragmentManager.L0(3)) {
            toString();
        }
        if (this.R != null) {
            Bundle bundle = this.f12590b;
            D1(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.f12590b = null;
    }

    private int K() {
        androidx.lifecycle.j.b bVar = this.f12612u0;
        return (bVar == androidx.lifecycle.j.b.INITIALIZED || this.B == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.B.K());
    }

    private o b0(boolean z15) {
        String str;
        if (z15) {
            f7.c.h(this);
        }
        o oVar = this.f12596h;
        if (oVar != null) {
            return oVar;
        }
        FragmentManager fragmentManager = this.f12619y;
        if (fragmentManager == null || (str = this.f12598j) == null) {
            return null;
        }
        return fragmentManager.g0(str);
    }

    private void f0() {
        this.f12614v0 = new androidx.p016lifecycle.s(this);
        this.f12622z0 = ua.i.a(this);
        this.f12620y0 = null;
        if (this.C0.contains(this.D0)) {
            return;
        }
        w1(this.D0);
    }

    @Deprecated
    public static o h0(Context context, String str, Bundle bundle) {
        try {
            o oVarNewInstance = s.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return oVarNewInstance;
            }
            bundle.setClassLoader(oVarNewInstance.getClass().getClassLoader());
            oVarNewInstance.F1(bundle);
            return oVarNewInstance;
        } catch (IllegalAccessException e15) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e15);
        } catch (InstantiationException e16) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e16);
        } catch (NoSuchMethodException e17) {
            throw new h("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e17);
        } catch (InvocationTargetException e18) {
            throw new h("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e18);
        }
    }

    public static /* synthetic */ void i(o oVar) {
        oVar.f12616w0.e(oVar.f12592d);
        oVar.f12592d = null;
    }

    private g n() {
        if (this.Y == null) {
            this.Y = new g();
        }
        return this.Y;
    }

    private void w1(i iVar) {
        if (this.f12589a >= 0) {
            iVar.a();
        } else {
            this.C0.add(iVar);
        }
    }

    int A() {
        g gVar = this.Y;
        if (gVar == null) {
            return 0;
        }
        return gVar.f12632c;
    }

    @Deprecated
    public void A0(Menu menu, MenuInflater menuInflater) {
    }

    public final View A1() {
        View viewC0 = c0();
        if (viewC0 != null) {
            return viewC0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public Object B() {
        g gVar = this.Y;
        if (gVar == null) {
            return null;
        }
        return gVar.f12639j;
    }

    public View B0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i15 = this.A0;
        if (i15 != 0) {
            return layoutInflater.inflate(i15, viewGroup, false);
        }
        return null;
    }

    void B1() {
        Bundle bundle;
        Bundle bundle2 = this.f12590b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.A.l1(bundle);
        this.A.C();
    }

    s5.v C() {
        g gVar = this.Y;
        if (gVar == null) {
            return null;
        }
        return gVar.f12647r;
    }

    public void C0() {
        this.O = true;
    }

    int D() {
        g gVar = this.Y;
        if (gVar == null) {
            return 0;
        }
        return gVar.f12633d;
    }

    @Deprecated
    public void D0() {
    }

    final void D1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f12591c;
        if (sparseArray != null) {
            this.R.restoreHierarchyState(sparseArray);
            this.f12591c = null;
        }
        this.O = false;
        X0(bundle);
        if (this.O) {
            if (this.R != null) {
                this.f12616w0.b(androidx.lifecycle.j.a.ON_CREATE);
            }
        } else {
            throw new m0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public Object E() {
        g gVar = this.Y;
        if (gVar == null) {
            return null;
        }
        return gVar.f12641l;
    }

    public void E0() {
        this.O = true;
    }

    void E1(int i15, int i16, int i17, int i18) {
        if (this.Y == null && i15 == 0 && i16 == 0 && i17 == 0 && i18 == 0) {
            return;
        }
        n().f12632c = i15;
        n().f12633d = i16;
        n().f12634e = i17;
        n().f12635f = i18;
    }

    s5.v F() {
        g gVar = this.Y;
        if (gVar == null) {
            return null;
        }
        return gVar.f12648s;
    }

    public void F0() {
        this.O = true;
    }

    public void F1(Bundle bundle) {
        if (this.f12619y != null && p0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f12595g = bundle;
    }

    View G() {
        g gVar = this.Y;
        if (gVar == null) {
            return null;
        }
        return gVar.f12650u;
    }

    public LayoutInflater G0(Bundle bundle) {
        return J(bundle);
    }

    void G1(View view) {
        n().f12650u = view;
    }

    public final Object H() {
        t<?> tVar = this.f12621z;
        if (tVar == null) {
            return null;
        }
        return tVar.v();
    }

    public void H0(boolean z15) {
    }

    public void H1(j jVar) {
        Bundle bundle;
        if (this.f12619y != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (jVar == null || (bundle = jVar.f12652a) == null) {
            bundle = null;
        }
        this.f12590b = bundle;
    }

    public final LayoutInflater I() {
        LayoutInflater layoutInflater = this.f12607r0;
        return layoutInflater == null ? i1(null) : layoutInflater;
    }

    @Deprecated
    public void I0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.O = true;
    }

    public void I1(boolean z15) {
        if (this.L != z15) {
            this.L = z15;
            if (this.K && i0() && !j0()) {
                this.f12621z.z();
            }
        }
    }

    @Deprecated
    public LayoutInflater J(Bundle bundle) {
        t<?> tVar = this.f12621z;
        if (tVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterW = tVar.w();
        j6.n.a(layoutInflaterW, this.A.z0());
        return layoutInflaterW;
    }

    public void J0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.O = true;
        t<?> tVar = this.f12621z;
        Activity activityL = tVar == null ? null : tVar.getActivity();
        if (activityL != null) {
            this.O = false;
            I0(activityL, attributeSet, bundle);
        }
    }

    void J1(int i15) {
        if (this.Y == null && i15 == 0) {
            return;
        }
        n();
        this.Y.f12636g = i15;
    }

    public void K0(boolean z15) {
    }

    void K1(boolean z15) {
        if (this.Y == null) {
            return;
        }
        n().f12631b = z15;
    }

    int L() {
        g gVar = this.Y;
        if (gVar == null) {
            return 0;
        }
        return gVar.f12636g;
    }

    @Deprecated
    public boolean L0(MenuItem menuItem) {
        return false;
    }

    void L1(float f15) {
        n().f12649t = f15;
    }

    public final o M() {
        return this.B;
    }

    @Deprecated
    public void M0(Menu menu) {
    }

    void M1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        n();
        g gVar = this.Y;
        gVar.f12637h = arrayList;
        gVar.f12638i = arrayList2;
    }

    public final FragmentManager N() {
        FragmentManager fragmentManager = this.f12619y;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void N0() {
        this.O = true;
    }

    public void N1(Intent intent) {
        O1(intent, null);
    }

    boolean O() {
        g gVar = this.Y;
        if (gVar == null) {
            return false;
        }
        return gVar.f12631b;
    }

    public void O0(boolean z15) {
    }

    public void O1(Intent intent, Bundle bundle) {
        t<?> tVar = this.f12621z;
        if (tVar != null) {
            tVar.x(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    int P() {
        g gVar = this.Y;
        if (gVar == null) {
            return 0;
        }
        return gVar.f12634e;
    }

    @Deprecated
    public void P0(Menu menu) {
    }

    @Deprecated
    public void P1(Intent intent, int i15, Bundle bundle) {
        if (this.f12621z != null) {
            N().T0(this, intent, i15, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    int Q() {
        g gVar = this.Y;
        if (gVar == null) {
            return 0;
        }
        return gVar.f12635f;
    }

    public void Q0(boolean z15) {
    }

    public void Q1() {
        if (this.Y == null || !n().f12651v) {
            return;
        }
        if (this.f12621z == null) {
            n().f12651v = false;
        } else if (Looper.myLooper() != this.f12621z.getHandler().getLooper()) {
            this.f12621z.getHandler().postAtFrontOfQueue(new c());
        } else {
            j(true);
        }
    }

    float R() {
        g gVar = this.Y;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f12649t;
    }

    @Deprecated
    public void R0(int i15, String[] strArr, int[] iArr) {
    }

    public Object S() {
        g gVar = this.Y;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f12642m;
        return obj == E0 ? E() : obj;
    }

    public void S0() {
        this.O = true;
    }

    public final Resources T() {
        return z1().getResources();
    }

    public void T0(Bundle bundle) {
    }

    public Object U() {
        g gVar = this.Y;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f12640k;
        return obj == E0 ? B() : obj;
    }

    public void U0() {
        this.O = true;
    }

    public Object V() {
        g gVar = this.Y;
        if (gVar == null) {
            return null;
        }
        return gVar.f12643n;
    }

    public void V0() {
        this.O = true;
    }

    public Object W() {
        g gVar = this.Y;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f12644o;
        return obj == E0 ? V() : obj;
    }

    public void W0(View view, Bundle bundle) {
    }

    ArrayList<String> X() {
        ArrayList<String> arrayList;
        g gVar = this.Y;
        return (gVar == null || (arrayList = gVar.f12637h) == null) ? new ArrayList<>() : arrayList;
    }

    public void X0(Bundle bundle) {
        this.O = true;
    }

    ArrayList<String> Y() {
        ArrayList<String> arrayList;
        g gVar = this.Y;
        return (gVar == null || (arrayList = gVar.f12638i) == null) ? new ArrayList<>() : arrayList;
    }

    void Y0(Bundle bundle) {
        this.A.V0();
        this.f12589a = 3;
        this.O = false;
        r0(bundle);
        if (this.O) {
            C1();
            this.A.y();
        } else {
            throw new m0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public final String Z(int i15) {
        return T().getString(i15);
    }

    void Z0() {
        Iterator<i> it = this.C0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.C0.clear();
        this.A.m(this.f12621z, l(), this);
        this.f12589a = 0;
        this.O = false;
        u0(this.f12621z.getContext());
        if (this.O) {
            this.f12619y.I(this);
            this.A.z();
        } else {
            throw new m0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    @Override // androidx.p016lifecycle.q
    /* JADX INFO: renamed from: a */
    public androidx.p016lifecycle.j getLifecycleRegistry() {
        return this.f12614v0;
    }

    public final String a0(int i15, Object... objArr) {
        return T().getString(i15, objArr);
    }

    void a1(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean b1(MenuItem menuItem) {
        if (this.F) {
            return false;
        }
        if (w0(menuItem)) {
            return true;
        }
        return this.A.B(menuItem);
    }

    public View c0() {
        return this.R;
    }

    void c1(Bundle bundle) {
        this.A.V0();
        this.f12589a = 1;
        this.O = false;
        this.f12614v0.a(new f());
        x0(bundle);
        this.f12609s0 = true;
        if (this.O) {
            this.f12614v0.i(androidx.lifecycle.j.a.ON_CREATE);
            return;
        }
        throw new m0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public androidx.p016lifecycle.q d0() {
        g0 g0Var = this.f12616w0;
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    boolean d1(Menu menu, MenuInflater menuInflater) {
        boolean z15 = false;
        if (this.F) {
            return false;
        }
        if (this.K && this.L) {
            A0(menu, menuInflater);
            z15 = true;
        }
        return this.A.D(menu, menuInflater) | z15;
    }

    public androidx.p016lifecycle.y<androidx.p016lifecycle.q> e0() {
        return this.f12618x0;
    }

    void e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.A.V0();
        this.f12615w = true;
        this.f12616w0 = new g0(this, h(), new Runnable() { // from class: e7.b
            @Override // java.lang.Runnable
            public final void run() {
                o.i(this.f47903a);
            }
        });
        View viewB0 = B0(layoutInflater, viewGroup, bundle);
        this.R = viewB0;
        if (viewB0 == null) {
            if (this.f12616w0.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f12616w0 = null;
            return;
        }
        this.f12616w0.c();
        if (FragmentManager.L0(3)) {
            Objects.toString(this.R);
            toString();
        }
        C6451z0.b(this.R, this.f12616w0);
        androidx.p016lifecycle.View.b(this.R, this.f12616w0);
        ua.n.b(this.R, this.f12616w0);
        this.f12618x0.o(this.f12616w0);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    void f1() {
        this.A.E();
        this.f12614v0.i(androidx.lifecycle.j.a.ON_DESTROY);
        this.f12589a = 0;
        this.O = false;
        this.f12609s0 = false;
        C0();
        if (this.O) {
            return;
        }
        throw new m0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void g0() {
        f0();
        this.f12611t0 = this.f12594f;
        this.f12594f = UUID.randomUUID().toString();
        this.f12601m = false;
        this.f12602n = false;
        this.f12606r = false;
        this.f12608s = false;
        this.f12613v = false;
        this.f12617x = 0;
        this.f12619y = null;
        this.A = new w();
        this.f12621z = null;
        this.C = 0;
        this.D = 0;
        this.E = null;
        this.F = false;
        this.G = false;
    }

    void g1() {
        this.A.F();
        if (this.R != null && this.f12616w0.getLifecycleRegistry().getState().e(androidx.lifecycle.j.b.CREATED)) {
            this.f12616w0.b(androidx.lifecycle.j.a.ON_DESTROY);
        }
        this.f12589a = 1;
        this.O = false;
        E0();
        if (this.O) {
            androidx.loader.app.a.c(this).e();
            this.f12615w = false;
        } else {
            throw new m0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    @Override // androidx.p016lifecycle.y0
    public x0 h() {
        if (this.f12619y == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (K() != androidx.lifecycle.j.b.INITIALIZED.ordinal()) {
            return this.f12619y.G0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    void h1() {
        this.f12589a = -1;
        this.O = false;
        F0();
        this.f12607r0 = null;
        if (this.O) {
            if (this.A.K0()) {
                return;
            }
            this.A.E();
            this.A = new w();
            return;
        }
        throw new m0("Fragment " + this + " did not call through to super.onDetach()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean i0() {
        return this.f12621z != null && this.f12601m;
    }

    LayoutInflater i1(Bundle bundle) {
        LayoutInflater layoutInflaterG0 = G0(bundle);
        this.f12607r0 = layoutInflaterG0;
        return layoutInflaterG0;
    }

    void j(boolean z15) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        g gVar = this.Y;
        if (gVar != null) {
            gVar.f12651v = false;
        }
        if (this.R == null || (viewGroup = this.P) == null || (fragmentManager = this.f12619y) == null) {
            return;
        }
        k0 k0VarU = k0.u(viewGroup, fragmentManager);
        k0VarU.z();
        if (z15) {
            this.f12621z.getHandler().post(new d(k0VarU));
        } else {
            k0VarU.n();
        }
        Handler handler = this.Z;
        if (handler != null) {
            handler.removeCallbacks(this.f12597h0);
            this.Z = null;
        }
    }

    public final boolean j0() {
        if (this.F) {
            return true;
        }
        FragmentManager fragmentManager = this.f12619y;
        return fragmentManager != null && fragmentManager.O0(this.B);
    }

    void j1() {
        onLowMemory();
    }

    @Override // ua.j
    public final ua.g k() {
        return this.f12622z0.getSavedStateRegistry();
    }

    final boolean k0() {
        return this.f12617x > 0;
    }

    void k1(boolean z15) {
        K0(z15);
    }

    e7.g l() {
        return new e();
    }

    public final boolean l0() {
        if (!this.L) {
            return false;
        }
        FragmentManager fragmentManager = this.f12619y;
        return fragmentManager == null || fragmentManager.P0(this.B);
    }

    boolean l1(MenuItem menuItem) {
        if (this.F) {
            return false;
        }
        if (this.K && this.L && L0(menuItem)) {
            return true;
        }
        return this.A.K(menuItem);
    }

    public void m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.C));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.D));
        printWriter.print(" mTag=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f12589a);
        printWriter.print(" mWho=");
        printWriter.print(this.f12594f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f12617x);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f12601m);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f12602n);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f12606r);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f12608s);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.F);
        printWriter.print(" mDetached=");
        printWriter.print(this.G);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.L);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.K);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.H);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.X);
        if (this.f12619y != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f12619y);
        }
        if (this.f12621z != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f12621z);
        }
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.B);
        }
        if (this.f12595g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f12595g);
        }
        if (this.f12590b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f12590b);
        }
        if (this.f12591c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f12591c);
        }
        if (this.f12592d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f12592d);
        }
        o oVarB0 = b0(false);
        if (oVarB0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(oVarB0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f12599k);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(O());
        if (A() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(A());
        }
        if (D() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(D());
        }
        if (P() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(P());
        }
        if (Q() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(Q());
        }
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.P);
        }
        if (this.R != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.R);
        }
        if (u() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(u());
        }
        if (z() != null) {
            androidx.loader.app.a.c(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.A + ":");
        this.A.X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    boolean m0() {
        g gVar = this.Y;
        if (gVar == null) {
            return false;
        }
        return gVar.f12651v;
    }

    void m1(Menu menu) {
        if (this.F) {
            return;
        }
        if (this.K && this.L) {
            M0(menu);
        }
        this.A.L(menu);
    }

    public final boolean n0() {
        return this.f12602n;
    }

    void n1() {
        this.A.N();
        if (this.R != null) {
            this.f12616w0.b(androidx.lifecycle.j.a.ON_PAUSE);
        }
        this.f12614v0.i(androidx.lifecycle.j.a.ON_PAUSE);
        this.f12589a = 6;
        this.O = false;
        N0();
        if (this.O) {
            return;
        }
        throw new m0("Fragment " + this + " did not call through to super.onPause()");
    }

    public final boolean o0() {
        return this.f12589a >= 7;
    }

    void o1(boolean z15) {
        O0(z15);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.O = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        x1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.O = true;
    }

    public final boolean p0() {
        FragmentManager fragmentManager = this.f12619y;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.S0();
    }

    boolean p1(Menu menu) {
        boolean z15 = false;
        if (this.F) {
            return false;
        }
        if (this.K && this.L) {
            P0(menu);
            z15 = true;
        }
        return this.A.P(menu) | z15;
    }

    o q(String str) {
        return str.equals(this.f12594f) ? this : this.A.k0(str);
    }

    void q0() {
        this.A.V0();
    }

    void q1() {
        boolean zQ0 = this.f12619y.Q0(this);
        Boolean bool = this.f12600l;
        if (bool == null || bool.booleanValue() != zQ0) {
            this.f12600l = Boolean.valueOf(zQ0);
            Q0(zQ0);
            this.A.Q();
        }
    }

    public final p r() {
        t<?> tVar = this.f12621z;
        if (tVar == null) {
            return null;
        }
        return (p) tVar.getActivity();
    }

    @Deprecated
    public void r0(Bundle bundle) {
        this.O = true;
    }

    void r1() {
        this.A.V0();
        this.A.b0(true);
        this.f12589a = 7;
        this.O = false;
        S0();
        if (!this.O) {
            throw new m0("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.p016lifecycle.s sVar = this.f12614v0;
        androidx.lifecycle.j.a aVar = androidx.lifecycle.j.a.ON_RESUME;
        sVar.i(aVar);
        if (this.R != null) {
            this.f12616w0.b(aVar);
        }
        this.A.R();
    }

    public boolean s() {
        Boolean bool;
        g gVar = this.Y;
        if (gVar == null || (bool = gVar.f12646q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    public void s0(int i15, int i16, Intent intent) {
        if (FragmentManager.L0(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    void s1(Bundle bundle) {
        T0(bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i15) {
        P1(intent, i15, null);
    }

    public boolean t() {
        Boolean bool;
        g gVar = this.Y;
        if (gVar == null || (bool = gVar.f12645p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    public void t0(Activity activity) {
        this.O = true;
    }

    void t1() {
        this.A.V0();
        this.A.b0(true);
        this.f12589a = 5;
        this.O = false;
        U0();
        if (!this.O) {
            throw new m0("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.p016lifecycle.s sVar = this.f12614v0;
        androidx.lifecycle.j.a aVar = androidx.lifecycle.j.a.ON_START;
        sVar.i(aVar);
        if (this.R != null) {
            this.f12616w0.b(aVar);
        }
        this.A.S();
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder(128);
        sb5.append(getClass().getSimpleName());
        sb5.append("{");
        sb5.append(Integer.toHexString(System.identityHashCode(this)));
        sb5.append("}");
        sb5.append(" (");
        sb5.append(this.f12594f);
        if (this.C != 0) {
            sb5.append(" id=0x");
            sb5.append(Integer.toHexString(this.C));
        }
        if (this.E != null) {
            sb5.append(" tag=");
            sb5.append(this.E);
        }
        sb5.append(")");
        return sb5.toString();
    }

    View u() {
        g gVar = this.Y;
        if (gVar == null) {
            return null;
        }
        return gVar.f12630a;
    }

    public void u0(Context context) {
        this.O = true;
        t<?> tVar = this.f12621z;
        Activity activityL = tVar == null ? null : tVar.getActivity();
        if (activityL != null) {
            this.O = false;
            t0(activityL);
        }
    }

    void u1() {
        this.A.U();
        if (this.R != null) {
            this.f12616w0.b(androidx.lifecycle.j.a.ON_STOP);
        }
        this.f12614v0.i(androidx.lifecycle.j.a.ON_STOP);
        this.f12589a = 4;
        this.O = false;
        V0();
        if (this.O) {
            return;
        }
        throw new m0("Fragment " + this + " did not call through to super.onStop()");
    }

    public final Bundle v() {
        return this.f12595g;
    }

    @Deprecated
    public void v0(o oVar) {
    }

    void v1() {
        Bundle bundle = this.f12590b;
        W0(this.R, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.A.V();
    }

    @Override // androidx.p016lifecycle.h
    public w0.c w() {
        Application application;
        if (this.f12619y == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f12620y0 == null) {
            Context applicationContext = z1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.L0(3)) {
                Objects.toString(z1().getApplicationContext());
            }
            this.f12620y0 = new p0(application, this, v());
        }
        return this.f12620y0;
    }

    public boolean w0(MenuItem menuItem) {
        return false;
    }

    @Override // androidx.p016lifecycle.h
    public CreationExtras x() {
        Application application;
        Context applicationContext = z1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.L0(3)) {
            Objects.toString(z1().getApplicationContext());
        }
        p7.d dVar = new p7.d();
        if (application != null) {
            dVar.c(w0.a.f12845h, application);
        }
        dVar.c(androidx.p016lifecycle.l0.f12795a, this);
        dVar.c(androidx.p016lifecycle.l0.f12796b, this);
        if (v() != null) {
            dVar.c(androidx.p016lifecycle.l0.f12797c, v());
        }
        return dVar;
    }

    public void x0(Bundle bundle) {
        this.O = true;
        B1();
        if (this.A.R0(1)) {
            return;
        }
        this.A.C();
    }

    public final p x1() {
        p pVarR = r();
        if (pVarR != null) {
            return pVarR;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final FragmentManager y() {
        if (this.f12621z != null) {
            return this.A;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Animation y0(int i15, boolean z15, int i16) {
        return null;
    }

    public final Bundle y1() {
        Bundle bundleV = v();
        if (bundleV != null) {
            return bundleV;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public Context z() {
        t<?> tVar = this.f12621z;
        if (tVar == null) {
            return null;
        }
        return tVar.getContext();
    }

    public Animator z0(int i15, boolean z15, int i16) {
        return null;
    }

    public final Context z1() {
        Context contextZ = z();
        if (contextZ != null) {
            return contextZ;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class j implements Parcelable {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f12652a;

        class a implements Parcelable.ClassLoaderCreator<j> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public j createFromParcel(Parcel parcel) {
                return new j(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public j[] newArray(int i15) {
                return new j[i15];
            }
        }

        j(Bundle bundle) {
            this.f12652a = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            parcel.writeBundle(this.f12652a);
        }

        j(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f12652a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    public o(int i15) {
        this();
        this.A0 = i15;
    }
}
