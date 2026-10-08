package ib;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.c0;
import androidx.fragment.app.o;
import androidx.p016lifecycle.j;
import androidx.p016lifecycle.n;
import androidx.p016lifecycle.q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import i6.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import r0.a0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends RecyclerView.h<ib.b> implements ib.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final j f90681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final FragmentManager f90682e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f90686i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final a0<o> f90683f = new a0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a0<o.j> f90684g = new a0<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a0<Integer> f90685h = new a0<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    f f90687j = new f();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f90688k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f90689l = false;

    /* JADX INFO: renamed from: ib.a$a, reason: collision with other inner class name */
    class C2146a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ib.b f90690a;

        C2146a(ib.b bVar) {
            this.f90690a = bVar;
        }

        @Override // androidx.p016lifecycle.n
        public void m(q qVar, j.a aVar) {
            if (a.this.V()) {
                return;
            }
            qVar.getLifecycle().d(this);
            if (this.f90690a.P().isAttachedToWindow()) {
                a.this.R(this.f90690a);
            }
        }
    }

    class b extends FragmentManager.FragmentLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f90692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f90693b;

        b(o oVar, FrameLayout frameLayout) {
            this.f90692a = oVar;
            this.f90693b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void m(FragmentManager fragmentManager, o oVar, View view, Bundle bundle) {
            if (oVar == this.f90692a) {
                fragmentManager.y1(this);
                a.this.C(view, this.f90693b);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.f90688k = false;
            aVar.H();
        }
    }

    class d implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f90696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f90697b;

        d(Handler handler, Runnable runnable) {
            this.f90696a = handler;
            this.f90697b = runnable;
        }

        @Override // androidx.p016lifecycle.n
        public void m(q qVar, j.a aVar) {
            if (aVar == j.a.ON_DESTROY) {
                this.f90696a.removeCallbacks(this.f90697b);
                qVar.getLifecycle().d(this);
            }
        }
    }

    private static abstract class e extends RecyclerView.j {
        private e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i15, int i16) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i15, int i16, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i15, int i16) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i15, int i16, int i17) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i15, int i16) {
            a();
        }

        /* synthetic */ e(C2146a c2146a) {
            this();
        }
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<h> f90699a = new CopyOnWriteArrayList();

        f() {
        }

        public List<h.b> a(o oVar, j.b bVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<h> it = this.f90699a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(oVar, bVar));
            }
            return arrayList;
        }

        public void b(List<h.b> list) {
            Iterator<h.b> it = list.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        public List<h.b> c(o oVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<h> it = this.f90699a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().b(oVar));
            }
            return arrayList;
        }

        public List<h.b> d(o oVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<h> it = this.f90699a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().c(oVar));
            }
            return arrayList;
        }

        public List<h.b> e(o oVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<h> it = this.f90699a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().d(oVar));
            }
            return arrayList;
        }
    }

    class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ViewPager2.i f90700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView.j f90701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n f90702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ViewPager2 f90703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f90704e = -1;

        /* JADX INFO: renamed from: ib.a$g$a, reason: collision with other inner class name */
        class C2147a extends ViewPager2.i {
            C2147a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void a(int i15) {
                g.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void c(int i15) {
                g.this.d(false);
            }
        }

        class b extends e {
            b() {
                super(null);
            }

            @Override // ib.a.e, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                g.this.d(true);
            }
        }

        class c implements n {
            c() {
            }

            @Override // androidx.p016lifecycle.n
            public void m(q qVar, j.a aVar) {
                g.this.d(false);
            }
        }

        g() {
        }

        private ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void b(RecyclerView recyclerView) {
            this.f90703d = a(recyclerView);
            C2147a c2147a = new C2147a();
            this.f90700a = c2147a;
            this.f90703d.g(c2147a);
            b bVar = new b();
            this.f90701b = bVar;
            a.this.z(bVar);
            c cVar = new c();
            this.f90702c = cVar;
            a.this.f90681d.a(cVar);
        }

        void c(RecyclerView recyclerView) {
            a(recyclerView).n(this.f90700a);
            a.this.B(this.f90701b);
            a.this.f90681d.d(this.f90702c);
            this.f90703d = null;
        }

        void d(boolean z15) {
            int currentItem;
            o oVarG;
            if (a.this.V() || this.f90703d.getScrollState() != 0 || a.this.f90683f.j() || a.this.g() == 0 || (currentItem = this.f90703d.getCurrentItem()) >= a.this.g()) {
                return;
            }
            long jH = a.this.h(currentItem);
            if ((jH != this.f90704e || z15) && (oVarG = a.this.f90683f.g(jH)) != null && oVarG.i0()) {
                this.f90704e = jH;
                c0 c0VarO = a.this.f90682e.o();
                ArrayList arrayList = new ArrayList();
                o oVar = null;
                for (int i15 = 0; i15 < a.this.f90683f.q(); i15++) {
                    long jL = a.this.f90683f.l(i15);
                    o oVarS = a.this.f90683f.s(i15);
                    if (oVarS.i0()) {
                        if (jL != this.f90704e) {
                            j.b bVar = j.b.STARTED;
                            c0VarO.t(oVarS, bVar);
                            arrayList.add(a.this.f90687j.a(oVarS, bVar));
                        } else {
                            oVar = oVarS;
                        }
                        oVarS.I1(jL == this.f90704e);
                    }
                }
                if (oVar != null) {
                    j.b bVar2 = j.b.RESUMED;
                    c0VarO.t(oVar, bVar2);
                    arrayList.add(a.this.f90687j.a(oVar, bVar2));
                }
                if (c0VarO.n()) {
                    return;
                }
                c0VarO.j();
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a.this.f90687j.b((List) it.next());
                }
            }
        }
    }

    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f90709a = new C2148a();

        /* JADX INFO: renamed from: ib.a$h$a, reason: collision with other inner class name */
        class C2148a implements b {
            C2148a() {
            }

            @Override // ib.a.h.b
            public void a() {
            }
        }

        public interface b {
            void a();
        }

        public b a(o oVar, j.b bVar) {
            return f90709a;
        }

        public b b(o oVar) {
            return f90709a;
        }

        public b c(o oVar) {
            return f90709a;
        }

        public b d(o oVar) {
            return f90709a;
        }
    }

    public a(FragmentManager fragmentManager, j jVar) {
        this.f90682e = fragmentManager;
        this.f90681d = jVar;
        super.A(true);
    }

    private static String F(String str, long j15) {
        return str + j15;
    }

    private void G(int i15) {
        long jH = h(i15);
        if (this.f90683f.e(jH)) {
            return;
        }
        o oVarE = E(i15);
        oVarE.H1(this.f90684g.g(jH));
        this.f90683f.m(jH, oVarE);
    }

    private boolean I(long j15) {
        View viewC0;
        if (this.f90685h.e(j15)) {
            return true;
        }
        o oVarG = this.f90683f.g(j15);
        return (oVarG == null || (viewC0 = oVarG.c0()) == null || viewC0.getParent() == null) ? false : true;
    }

    private static boolean J(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long K(int i15) {
        Long lValueOf = null;
        for (int i16 = 0; i16 < this.f90685h.q(); i16++) {
            if (this.f90685h.s(i16).intValue() == i15) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f90685h.l(i16));
            }
        }
        return lValueOf;
    }

    private static long Q(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void S(long j15) {
        ViewParent parent;
        o oVarG = this.f90683f.g(j15);
        if (oVarG == null) {
            return;
        }
        if (oVarG.c0() != null && (parent = oVarG.c0().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!D(j15)) {
            this.f90684g.o(j15);
        }
        if (!oVarG.i0()) {
            this.f90683f.o(j15);
            return;
        }
        if (V()) {
            this.f90689l = true;
            return;
        }
        if (oVarG.i0() && D(j15)) {
            List<h.b> listE = this.f90687j.e(oVarG);
            o.j jVarO1 = this.f90682e.o1(oVarG);
            this.f90687j.b(listE);
            this.f90684g.m(j15, jVarO1);
        }
        List<h.b> listD = this.f90687j.d(oVarG);
        try {
            this.f90682e.o().o(oVarG).j();
            this.f90683f.o(j15);
        } finally {
            this.f90687j.b(listD);
        }
    }

    private void T() {
        Handler handler = new Handler(Looper.getMainLooper());
        c cVar = new c();
        this.f90681d.a(new d(handler, cVar));
        handler.postDelayed(cVar, 10000L);
    }

    private void U(o oVar, FrameLayout frameLayout) {
        this.f90682e.h1(new b(oVar, frameLayout), false);
    }

    void C(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean D(long j15) {
        return j15 >= 0 && j15 < ((long) g());
    }

    public abstract o E(int i15);

    void H() {
        if (!this.f90689l || V()) {
            return;
        }
        r0.b bVar = new r0.b();
        for (int i15 = 0; i15 < this.f90683f.q(); i15++) {
            long jL = this.f90683f.l(i15);
            if (!D(jL)) {
                bVar.add(Long.valueOf(jL));
                this.f90685h.o(jL);
            }
        }
        if (!this.f90688k) {
            this.f90689l = false;
            for (int i16 = 0; i16 < this.f90683f.q(); i16++) {
                long jL2 = this.f90683f.l(i16);
                if (!I(jL2)) {
                    bVar.add(Long.valueOf(jL2));
                }
            }
        }
        Iterator<E> it = bVar.iterator();
        while (it.hasNext()) {
            S(((Long) it.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void r(ib.b bVar, int i15) {
        long jM = bVar.m();
        int id5 = bVar.P().getId();
        Long lK = K(id5);
        if (lK != null && lK.longValue() != jM) {
            S(lK.longValue());
            this.f90685h.o(lK.longValue());
        }
        this.f90685h.m(jM, Integer.valueOf(id5));
        G(i15);
        if (bVar.P().isAttachedToWindow()) {
            R(bVar);
        }
        H();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final ib.b t(ViewGroup viewGroup, int i15) {
        return ib.b.O(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final boolean v(ib.b bVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final void w(ib.b bVar) {
        R(bVar);
        H();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void y(ib.b bVar) {
        Long lK = K(bVar.P().getId());
        if (lK != null) {
            S(lK.longValue());
            this.f90685h.o(lK.longValue());
        }
    }

    void R(ib.b bVar) {
        o oVarG = this.f90683f.g(bVar.m());
        if (oVarG == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutP = bVar.P();
        View viewC0 = oVarG.c0();
        if (!oVarG.i0() && viewC0 != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (oVarG.i0() && viewC0 == null) {
            U(oVarG, frameLayoutP);
            return;
        }
        if (oVarG.i0() && viewC0.getParent() != null) {
            if (viewC0.getParent() != frameLayoutP) {
                C(viewC0, frameLayoutP);
                return;
            }
            return;
        }
        if (oVarG.i0()) {
            C(viewC0, frameLayoutP);
            return;
        }
        if (V()) {
            if (this.f90682e.K0()) {
                return;
            }
            this.f90681d.a(new C2146a(bVar));
            return;
        }
        U(oVarG, frameLayoutP);
        List<h.b> listC = this.f90687j.c(oVarG);
        try {
            oVarG.I1(false);
            this.f90682e.o().e(oVarG, "f" + bVar.m()).t(oVarG, j.b.STARTED).j();
            this.f90686i.d(false);
        } finally {
            this.f90687j.b(listC);
        }
    }

    boolean V() {
        return this.f90682e.S0();
    }

    @Override // ib.c
    public final Parcelable a() {
        Bundle bundle = new Bundle(this.f90683f.q() + this.f90684g.q());
        for (int i15 = 0; i15 < this.f90683f.q(); i15++) {
            long jL = this.f90683f.l(i15);
            o oVarG = this.f90683f.g(jL);
            if (oVarG != null && oVarG.i0()) {
                this.f90682e.g1(bundle, F("f#", jL), oVarG);
            }
        }
        for (int i16 = 0; i16 < this.f90684g.q(); i16++) {
            long jL2 = this.f90684g.l(i16);
            if (D(jL2)) {
                bundle.putParcelable(F("s#", jL2), this.f90684g.g(jL2));
            }
        }
        return bundle;
    }

    @Override // ib.c
    public final void b(Parcelable parcelable) {
        if (!this.f90684g.j() || !this.f90683f.j()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (J(str, "f#")) {
                this.f90683f.m(Q(str, "f#"), this.f90682e.u0(bundle, str));
            } else {
                if (!J(str, "s#")) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long jQ = Q(str, "s#");
                o.j jVar = (o.j) bundle.getParcelable(str);
                if (D(jQ)) {
                    this.f90684g.m(jQ, jVar);
                }
            }
        }
        if (this.f90683f.j()) {
            return;
        }
        this.f90689l = true;
        this.f90688k = true;
        H();
        T();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long h(int i15) {
        return i15;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void q(RecyclerView recyclerView) {
        i.a(this.f90686i == null);
        g gVar = new g();
        this.f90686i = gVar;
        gVar.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void u(RecyclerView recyclerView) {
        this.f90686i.c(recyclerView);
        this.f90686i = null;
    }
}
