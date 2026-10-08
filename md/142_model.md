# Paczka 142 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `jg/c.java (część 2/2)`

## jg/c.java (część 2/2)

```java
package jg;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.os.UserHandle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c<T extends IInterface> {
    private UserHandle D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f102409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f102410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f102411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f102412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f102413e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    k1 f102415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f102416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Looper f102417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j f102418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final gg.e f102419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final Handler f102420l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private o f102423o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected InterfaceC2422c f102424p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private IInterface f102425q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private y0 f102427s;

    /* JADX INFO: renamed from: u, reason: collision wi
    final /* synthetic */ void V(int i15) {
        int i16;
        int i17;
        synchronized (this.f102421m) {
            i16 = this.f102428t;
        }
        if (i16 == 3) {
            this.B = true;
            i17 = 5;
        } else {
            i17 = 4;
        }
        Handler handler = this.f102420l;
        handler.sendMessage(handler.obtainMessage(i17, this.E.get(), 16));
    }

    final /* synthetic */ boolean W() {
        if (this.B || TextUtils.isEmpty(B()) || TextUtils.isEmpty(y())) {
            return false;
        }
        try {
            Class.forName(B());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    final /* synthetic */ Object X() {
        return this.f102422n;
    }

    final /* synthetic */ void Y(o oVar) {
        this.f102423o = oVar;
    }

    final /* synthetic */ ArrayList Z() {
        return this.f102426r;
    }

    public void a(e eVar) {
        eVar.a();
    }

    final /* synthetic */ a a0() {
        return this.f102429u;
    }

    public void b(String str) {
        this.f102414f = str;
        disconnect();
    }

    final /* synthetic */ b b0() {
        return this.f102430v;
    }

    public boolean c() {
        boolean z15;
        synchronized (this.f102421m) {
            int i15 = this.f102428t;
            z15 = true;
            if (i15 != 2 && i15 != 3) {
                z15 = false;
            }
        }
        return z15;
    }

    final /* synthetic */ gg.a c0() {
        return this.A;
    }

    public String d() {
        k1 k1Var;
        if (!isConnected() || (k1Var = this.f102415g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return k1Var.b();
    }

    final /* synthetic */ void d0(gg.a aVar) {
        this.A = aVar;
    }

    public void disconnect() {
        this.E.incrementAndGet();
        ArrayList arrayList = this.f102426r;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    ((w0) arrayList.get(i15)).d();
                }
                arrayList.clear();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        synchronized (this.f102422n) {
            this.f102423o = null;
        }
        f0(1, null);
    }

    public void e(InterfaceC2422c interfaceC2422c) {
        s.m(interfaceC2422c, "Connection progress callbacks cannot be null.");
        this.f102424p = interfaceC2422c;
        f0(2, null);
    }

    final /* synthetic */ boolean e0() {
        return this.B;
    }

    public boolean g() {
        return true;
    }

    public boolean i() {
        return false;
    }

    public boolean isConnected() {
        boolean z15;
        synchronized (this.f102421m) {
            z15 = this.f102428t == 4;
        }
        return z15;
    }

    public void j(l lVar, Set<Scope> set) {
        AttributionSource attributionSourceA;
        Bundle bundleX = x();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.f102434z == null || (attributionSourceA = this.f102434z.a()) == null || attributionSourceA.getAttributionTag() == null) ? this.f102433y : attributionSourceA.getAttributionTag();
        String str = attributionTag;
        int i15 = this.f102431w;
        int i16 = gg.e.f72733a;
        Scope[] scopeArr = g.f102473q;
        Bundle bundle = new Bundle();
        gg.c[] cVarArr = g.f102474r;
        g gVar = new g(6, i15, i16, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        gVar.f102478d = this.f102416h.getPackageName();
        gVar.f102481g = bundleX;
        if (set != null) {
            gVar.f102480f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (i()) {
            Account accountR = r();
            if (accountR == null) {
                accountR = new Account("<<default account>>", "com.google");
            }
            gVar.f102482h = accountR;
            if (lVar != null) {
                gVar.f102479e = lVar.asBinder();
            }
        } else if (L()) {
            gVar.f102482h = r();
        }
        gVar.f102483j = G;
        gVar.f102484k = s();
        if (P()) {
            gVar.f102487n = true;
        }
        try {
            synchronized (this.f102422n) {
                try {
                    o oVar = this.f102423o;
                    if (oVar != null) {
                        oVar.g2(new x0(this, this.E.get()), gVar);
                    } else {
                        c2.g("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        } catch (DeadObjectException e15) {
            c2.h("GmsClient", "IGmsServiceBroker.getService failed", e15);
            O(3);
        } catch (RemoteException e16) {
            e = e16;
            c2.h("GmsClient", "IGmsServiceBroker.getService failed", e);
            K(8, null, null, this.E.get());
        } catch (SecurityException e17) {
            throw e17;
        } catch (RuntimeException e18) {
            e = e18;
            c2.h("GmsClient", "IGmsServiceBroker.getService failed", e);
            K(8, null, null, this.E.get());
        }
    }

    public int l() {
        return gg.e.f72733a;
    }

    public final gg.c[] m() {
        b1 b1Var = this.C;
        if (b1Var == null) {
            return null;
        }
        return b1Var.f102406b;
    }

    public String n() {
        return this.f102414f;
    }

    protected final void o() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract T p(IBinder iBinder);

    protected boolean q() {
        return false;
    }

    public Account r() {
        return null;
    }

    public gg.c[] s() {
        return G;
    }

    protected Executor t() {
        return null;
    }

    public Bundle u() {
        return null;
    }

    public final Context v() {
        return this.f102416h;
    }

    public int w() {
        return this.f102431w;
    }

    protected Bundle x() {
        return new Bundle();
    }

    protected String y() {
        return null;
    }

    protected Set<Scope> z() {
        return Collections.EMPTY_SET;
    }
}
```
