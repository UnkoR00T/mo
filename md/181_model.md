# Paczka 181 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `p136y9/e0.java (część 2/2)`

## p136y9/e0.java (część 2/2)

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
    private final boolean z(int[] deepLink, Bundle[] args, boolean newTask) {
        b1 b1Var;
        int i15 = 0;
        if (newTask) {
            if (!this.impl.I().isEmpty()) {
                N(this, this.impl.get_graph().o(), true, false, 4, null);
            }
            while (i15 < deepLink.length) {
                int i16 = deepLink[i15];
                int i17 = i15 + 1;
                Bundle bundle = args[i15];
                final y0 y0VarN = n(this, i16, null, 2, null);
                if (y0VarN == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + y0.INSTANCE.d(this.navContext, i16) + " cannot be found from the current destination " + s());
                }
                H(y0VarN, bundle, Function1.a(new l() { // from class: y9.b0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e0.A(y0VarN, this, (j1) obj);
                    }
                }), null);
                i15 = i17;
            }
            this.deepLinkHandled = true;
            return true;
        }
        b1 b1VarT = this.impl.get_graph();
        int length = deepLink.length;
        int i18 = 0;
        while (i18 < length) {
            int i19 = deepLink[i18];
            Bundle bundle2 = args[i18];
            y0 y0VarT = i18 == 0 ? this.impl.get_graph() : b1VarT.M(i19);
            if (y0VarT == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + y0.INSTANCE.d(this.navContext, i19) + " cannot be found in graph " + b1VarT);
            }
            if (i18 == deepLink.length - 1) {
                H(y0VarT, bundle2, i1.a.k(new i1.a(), this.impl.get_graph().o(), true, false, 4, null).b(0).c(0).a(), null);
            } else if (y0VarT instanceof b1) {
                while (true) {
                    b1Var = (b1) y0VarT;
                    if (!(b1Var.M(b1Var.U()) instanceof b1)) {
                        break;
                    }
                    y0VarT = b1Var.M(b1Var.U());
                }
                b1VarT = b1Var;
            }
            i18++;
        }
        this.deepLinkHandled = true;
        return true;
    }

    public void F(Uri deepLink) {
        this.impl.d0(new w0(deepLink, null, null));
    }

    public final void G(String route, i1 navOptions, s1.a navigatorExtras) {
        this.impl.c0(route, navOptions, navigatorExtras);
    }

    public boolean J() {
        return this.impl.l0();
    }

    public final boolean K(String route, boolean inclusive, boolean saveState) {
        return this.impl.o0(route, inclusive, saveState);
    }

    public void O(c listener) {
        this.impl.A0(listener);
    }

    public void P(Bundle navState) {
        if (navState != null) {
            navState.setClassLoader(this.context.getClassLoader());
        }
        this.impl.B0(navState);
        if (navState != null) {
            Boolean boolG = ua.c.g(ua.c.a(navState), "android-support-nav:controller:deepLinkHandled");
            this.deepLinkHandled = boolG != null ? boolG.booleanValue() : false;
        }
    }

    public Bundle Q() {
        r[] rVarArr;
        Bundle bundleE0 = this.impl.E0();
        if (this.deepLinkHandled) {
            if (bundleE0 == null) {
                Map mapI = v0.i();
                if (mapI.isEmpty()) {
                    rVarArr = new r[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapI.size());
                    for (Map.Entry entry : mapI.entrySet()) {
                        arrayList.add(y.a((String) entry.getKey(), entry.getValue()));
                    }
                    rVarArr = (r[]) arrayList.toArray(new r[0]);
                }
                bundleE0 = e6.c.a((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
                ua.k.a(bundleE0);
            }
            ua.k.c(ua.k.a(bundleE0), "android-support-nav:controller:deepLinkHandled", this.deepLinkHandled);
        }
        return bundleE0;
    }

    public void R(b1 b1Var) {
        this.impl.F0(b1Var);
    }

    public void S(q owner) {
        this.impl.H0(owner);
    }

    public void T(x0 viewModelStore) {
        this.impl.I0(viewModelStore);
    }

    public final void V(w0 request, Bundle args) {
        Intent intent = new Intent();
        intent.setDataAndType(request.getUri(), request.getMimeType());
        intent.setAction(request.getAction());
        ua.k.l(ua.k.a(args), "android-support-nav:controller:deepLinkIntent", intent);
    }

    public void i(c listener) {
        this.impl.o(listener);
    }

    public final boolean j() {
        Activity activity;
        return (this.deepLinkHandled || (activity = this.activity) == null || !y(activity.getIntent())) ? false : true;
    }

    public final b k(s1<? extends y0> navigator) {
        return new b(navigator);
    }

    public final y0 l(int destinationId, y0 matchingDest) {
        return this.impl.B(destinationId, matchingDest);
    }

    public final y0 m(String route) {
        return this.impl.C(route);
    }

    public final w p(String route) {
        return this.impl.K(route);
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public w r() {
        return this.impl.L();
    }

    public y0 s() {
        return this.impl.M();
    }

    public b1 u() {
        return this.impl.N();
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final h getNavContext() {
        return this.navContext;
    }

    public t1 w() {
        return this.impl.get_navigatorProvider();
    }

    public final p0<List<w>> x() {
        return this.impl.S();
    }

    public boolean y(Intent intent) {
        int[] intArray;
        r[] rVarArr;
        b1 b1VarR;
        y0.b bVarW;
        r[] rVarArr2;
        Bundle bundle;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        if (extras != null) {
            try {
                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
            } catch (Exception e15) {
                c2.f("NavController", "handleDeepLink() could not extract deepLink from " + intent, e15);
                intArray = null;
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
        Map mapI = v0.i();
        if (mapI.isEmpty()) {
            rVarArr = new r[0];
        } else {
            ArrayList arrayList2 = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList2.add(y.a((String) entry.getKey(), entry.getValue()));
            }
            rVarArr = (r[]) arrayList2.toArray(new r[0]);
        }
        Bundle bundleA = e6.c.a((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        ua.k.a(bundleA);
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            ua.k.b(ua.k.a(bundleA), bundle2);
        }
        if ((intArray == null || intArray.length == 0) && (bVarW = (b1VarR = this.impl.R()).W(h0.a(intent), true, true, b1VarR)) != null) {
            y0 destination = bVarW.getDestination();
            int[] iArrI = y0.i(destination, null, 1, null);
            Bundle bundleG = destination.g(bVarW.getMatchingArgs());
            if (bundleG != null) {
                ua.k.b(ua.k.a(bundleA), bundleG);
            }
            intArray = iArrI;
        } else {
            arrayList = parcelableArrayList;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strO = o(intArray);
        if (strO != null) {
            ba.b.INSTANCE.a("NavController", "Could not find destination " + strO + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        ua.k.l(ua.k.a(bundleA), "android-support-nav:controller:deepLinkIntent", intent);
        int length = intArray.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i15 = 0; i15 < length; i15++) {
            Map mapI2 = v0.i();
            if (mapI2.isEmpty()) {
                rVarArr2 = new r[0];
            } else {
                ArrayList arrayList3 = new ArrayList(mapI2.size());
                for (Map.Entry entry2 : mapI2.entrySet()) {
                    arrayList3.add(y.a((String) entry2.getKey(), entry2.getValue()));
                }
                rVarArr2 = (r[]) arrayList3.toArray(new r[0]);
            }
            Bundle bundleA2 = e6.c.a((r[]) Arrays.copyOf(rVarArr2, rVarArr2.length));
            Bundle bundleA3 = ua.k.a(bundleA2);
            ua.k.b(bundleA3, bundleA);
            if (arrayList != null && (bundle = (Bundle) arrayList.get(i15)) != null) {
                ua.k.b(bundleA3, bundle);
            }
            bundleArr[i15] = bundleA2;
        }
        int flags = intent.getFlags();
        int i16 = 268435456 & flags;
        if (i16 == 0 || (flags & 32768) != 0) {
            return z(intArray, bundleArr, i16 != 0);
        }
        intent.addFlags(32768);
        w.i(this.context).f(intent).j();
        Activity activity = this.activity;
        if (activity != null) {
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
        return true;
    }
}
```
