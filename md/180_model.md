# Paczka 180 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `p136y9/e0.java (część 1/2)`

## p136y9/e0.java (część 1/2)

Powiązane klasy (możesz dosłać): `ba/u.java`, `s5/w.java`

```java
package p136y9;

import CON.m0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.p016lifecycle.q;
import androidx.p016lifecycle.x0;
import ba.h;
import ba.u;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import fr.t;
import io.sentry.android.core.c2;
import ip.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mu.p0;
import oq.i0;
import oq.k;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.m;
import pq.v;
import pq.v0;
import s5.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 32\u00020\u0001:\u0003_[VB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00110\u000f2\u0006\u0010\u0013\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\
    public class b extends u1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final s1<? extends y0> navigator;

        public b(s1<? extends y0> s1Var) {
            this.navigator = s1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 r(b bVar, w wVar) {
            super.f(wVar);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 s(b bVar, w wVar, boolean z15) {
            super.h(wVar, z15);
            return i0.f148189a;
        }

        @Override // p136y9.u1
        public w b(y0 destination, Bundle arguments) {
            return e0.this.impl.r(destination, arguments);
        }

        @Override // p136y9.u1
        public void f(final w entry) {
            e0.this.impl.a0(this, entry, new er.a() { // from class: y9.f0
                @Override // er.a
                public final Object a() {
                    return e0.b.r(this.f225402a, entry);
                }
            });
        }

        @Override // p136y9.u1
        public void h(final w popUpTo, final boolean saveState) {
            e0.this.impl.k0(this, popUpTo, saveState, new er.a() { // from class: y9.g0
                @Override // er.a
                public final Object a() {
                    return e0.b.s(this.f225406a, popUpTo, saveState);
                }
            });
        }

        @Override // p136y9.u1
        public void i(w popUpTo, boolean saveState) {
            super.i(popUpTo, saveState);
        }

        @Override // p136y9.u1
        public void j(w entry) {
            super.j(entry);
            e0.this.impl.y0(entry);
        }

        @Override // p136y9.u1
        public void k(w backStackEntry) {
            e0.this.impl.z0(this, backStackEntry);
        }

        public final void p(w backStackEntry) {
            super.k(backStackEntry);
        }

        public final s1<? extends y0> q() {
            return this.navigator;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Ly9/e0$c;", "", "Ly9/e0;", "controller", "Ly9/y0;", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "arguments", "Loq/i0;", "a", "(Ly9/e0;Ly9/y0;Landroid/os/Bundle;)V", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {
        void a(e0 controller, y0 destination, Bundle arguments);
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"y9/e0$d", "LCON/m0;", "Loq/i0;", "d", "()V", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends m0 {
        d() {
            super(false);
        }

        @Override // CON.m0
        public void d() {
            e0.this.J();
        }
    }

    public e0(Context context) {
        this.context = context;
        this.navContext = new h(context);
        for (Object obj : eu.k.o(context, new l() { // from class: y9.z
            @Override // er.l
            public final Object b(Object obj2) {
                return e0.h((Context) obj2);
            }
        })) {
            if (((Context) obj) instanceof Activity) {
                this.activity = (Activity) obj;
                this.onBackPressedCallback = new d();
                this.enableOnBackPressedCallback = true;
                this.impl.U().c(new f1(this.impl.U()));
                this.impl.U().c(new p136y9.b(this.context));
                this.navInflater = oq.l.a(new er.a() { // from class: y9.a0
                    @Override // er.a
                    public final Object a() {
                        return e0.E(this.f225367a);
                    }
                });
            }
        }
        obj = null;
        this.activity = (Activity) obj;
        this.onBackPressedCallback = new d();
        this.enableOnBackPressedCallback = true;
        this.impl.U().c(new f1(this.impl.U()));
        this.impl.U().c(new p136y9.b(this.context));
        this.navInflater = oq.l.a(new er.a() { // from class: y9.a0
            @Override // er.a
            public final Object a() {
                return e0.E(this.f225367a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(y0 y0Var, e0 e0Var, j1 j1Var) {
        j1Var.a(new l() { // from class: y9.c0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.B((c) obj);
            }
        });
        if (y0Var instanceof b1) {
            for (y0 y0Var2 : y0.INSTANCE.e(y0Var)) {
                y0 y0VarS = e0Var.s();
                if (t.c(y0Var2, y0VarS != null ? y0VarS.getParent() : null)) {
                }
            }
            if (f225388k) {
                j1Var.c(b1.INSTANCE.d(e0Var.u()).o(), new l() { // from class: y9.d0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e0.C((v1) obj);
                    }
                });
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(p136y9.c cVar) {
        cVar.e(0);
        cVar.f(0);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(v1 v1Var) {
        v1Var.c(true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(e0 e0Var) {
        e0Var.U();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h1 E(e0 e0Var) {
        h1 h1Var = e0Var.inflater;
        return h1Var == null ? new h1(e0Var.context, e0Var.impl.U()) : h1Var;
    }

    private final void H(y0 node, Bundle args, i1 navOptions, s1.a navigatorExtras) {
        this.impl.g0(node, args, navOptions, navigatorExtras);
    }

    public static /* synthetic */ void I(e0 e0Var, String str, i1 i1Var, s1.a aVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i15 & 2) != 0) {
            i1Var = null;
        }
        if ((i15 & 4) != 0) {
            aVar = null;
        }
        e0Var.G(str, i1Var, aVar);
    }

    public static /* synthetic */ boolean L(e0 e0Var, String str, boolean z15, boolean z16, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i15 & 4) != 0) {
            z16 = false;
        }
        return e0Var.K(str, z15, z16);
    }

    private final boolean M(int destinationId, boolean inclusive, boolean saveState) {
        return this.impl.r0(destinationId, inclusive, saveState);
    }

    static /* synthetic */ boolean N(e0 e0Var, int i15, boolean z15, boolean z16, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i16 & 4) != 0) {
            z16 = false;
        }
        return e0Var.M(i15, z15, z16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    private final void U() {
        boolean z15;
        m0 m0Var = this.onBackPressedCallback;
        if (this.enableOnBackPressedCallback) {
            z15 = t() > 1;
        }
        m0Var.i(z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context h(Context context) {
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static /* synthetic */ y0 n(e0 e0Var, int i15, y0 y0Var, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i16 & 2) != 0) {
            y0Var = null;
        }
        return e0Var.l(i15, y0Var);
    }

    private final String o(int[] deepLink) {
        return this.impl.G(deepLink);
    }

    private final int t() {
        m<w> mVarI = this.impl.I();
        int i15 = 0;
        if (mVarI != null && mVarI.isEmpty()) {
            return 0;
        }
        Iterator<w> it = mVarI.iterator();
        while (it.hasNext()) {
            if (!(it.next().getDestination() instanceof b1) && (i15 = i15 + 1) < 0) {
                v.w();
            }
        }
        return i15;
    }

```
