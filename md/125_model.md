# Paczka 125 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `ib/a.java (część 2/2)`

## ib/a.java (część 2/2)

```java
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
```
