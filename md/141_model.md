# Paczka 141 (model)

> Zdekompilowany kod Androida (jadx), może być zaciemniony (R8). Wnioskuj o roli z zachowania.
> Wyciągnij: endpointy (metoda, URL, parametry, auth, podpisywanie), modele danych (czytelne nazwy, pola, typy),
> logikę przetwarzania, metryki/widoki UI. Tylko fakty z kodu, brak danych = napisz "brak". Podaj plik źródłowy przy wnioskach.

Pliki w tej paczce: `jg/c.java (część 1/2)`

## jg/c.java (część 1/2)

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
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i15);
    }

    public interface b {
        void onConnectionFailed(gg.a aVar);
    }

    /* JADX INFO: renamed from: jg.c$c, reason: collision with other inner class name */
    public interface InterfaceC2422c {
        void d(gg.a aVar);
    }

    protected class d implements InterfaceC2422c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f102435a;

        public d(c cVar) {
            Objects.requireNonNull(cVar);
            this.f102435a = cVar;
        }

        @Override // jg.c.InterfaceC2422c
        public final void d(gg.a aVar) {
            if (aVar.y()) {
                c cVar = this.f102435a;
                cVar.j(null, cVar.z());
            } else {
                c cVar2 = this.f102435a;
                if (cVar2.b0() != null) {
                    cVar2.b0().onConnectionFailed(aVar);
                }
            }
        }
    }

    public interface e {
        void a();
    }

    protected c(Context context, Looper looper, j jVar, gg.e eVar, int i15, a aVar, b bVar, String str) {
        s.m(context, "Context must not be null");
        this.f102416h = context;
        s.m(looper, "Looper must not be null");
        this.f102417i = looper;
        s.m(jVar, "Supervisor must not be null");
        this.f102418j = jVar;
        s.m(eVar, "API availability must not be null");
        this.f102419k = eVar;
        this.f102420l = new v0(this, looper);
        this.f102431w = i15;
        this.f102429u = aVar;
        this.f102430v = bVar;
        this.f102432x = str;
    }

    private final void f0(int i15, IInterface iInterface) {
        gg.a aVarC;
        k1 k1Var;
        s.a((i15 == 4) == (iInterface != null));
        synchronized (this.f102421m) {
            try {
                this.f102428t = i15;
                this.f102425q = iInterface;
                Bundle bundle = null;
                if (i15 == 1) {
                    y0 y0Var = this.f102427s;
                    if (y0Var != null) {
                        if (this.D == null || Build.VERSION.SDK_INT < 33) {
                            j jVar = this.f102418j;
                            String strA = this.f102415g.a();
                            s.l(strA);
                            jVar.e(new f1(strA, this.f102415g.b(), 4225, this.f102415g.c(), null), y0Var, Q());
                        } else {
                            j jVar2 = this.f102418j;
                            String strA2 = this.f102415g.a();
                            s.l(strA2);
                            jVar2.d(strA2, this.f102415g.b(), 4225, y0Var, Q(), this.f102415g.c(), this.D);
                        }
                        this.f102427s = null;
                    }
                } else if (i15 == 2 || i15 == 3) {
                    y0 y0Var2 = this.f102427s;
                    if (y0Var2 != null && (k1Var = this.f102415g) != null) {
                        String strA3 = k1Var.a();
                        String strB = k1Var.b();
                        StringBuilder sb5 = new StringBuilder(String.valueOf(strA3).length() + 70 + String.valueOf(strB).length());
                        sb5.append("Calling connect() while still connected, missing disconnect() for ");
                        sb5.append(strA3);
                        sb5.append(" on ");
                        sb5.append(strB);
                        c2.e("GmsClient", sb5.toString());
                        j jVar3 = this.f102418j;
                        String strA4 = this.f102415g.a();
                        s.l(strA4);
                        jVar3.d(strA4, this.f102415g.b(), 4225, y0Var2, Q(), this.f102415g.c(), this.D);
                        this.E.incrementAndGet();
                    }
                    y0 y0Var3 = new y0(this, this.E.get());
                    this.f102427s = y0Var3;
                    k1 k1Var2 = (this.f102428t != 3 || y() == null) ? new k1(D(), C(), false, 4225, F()) : new k1(v().getPackageName(), y(), true, 4225, false);
                    this.f102415g = k1Var2;
                    if (k1Var2.c() && l() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f102415g.a())));
                    }
                    if (this.D == null || Build.VERSION.SDK_INT < 33) {
                        j jVar4 = this.f102418j;
                        String strA5 = this.f102415g.a();
                        s.l(strA5);
                        aVarC = jVar4.c(new f1(strA5, this.f102415g.b(), 4225, this.f102415g.c(), null), y0Var3, Q(), t());
                    } else {
                        j jVar5 = this.f102418j;
                        String strA6 = this.f102415g.a();
                        s.l(strA6);
                        String strB2 = this.f102415g.b();
                        String strQ = Q();
                        boolean zC = this.f102415g.c();
                        UserHandle userHandle = this.D;
                        s.l(userHandle);
                        aVarC = jVar5.c(new f1(strA6, strB2, 4225, zC, userHandle), y0Var3, strQ, null);
                    }
                    if (!aVarC.y()) {
                        String strA7 = this.f102415g.a();
                        String strB3 = this.f102415g.b();
                        StringBuilder sb6 = new StringBuilder(String.valueOf(strA7).length() + 34 + String.valueOf(strB3).length());
                        sb6.append("unable to connect to service: ");
                        sb6.append(strA7);
                        sb6.append(" on ");
                        sb6.append(strB3);
                        c2.g("GmsClient", sb6.toString());
                        int iM = aVarC.m() == -1 ? 16 : aVarC.m();
                        if (aVarC.r() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", aVarC.r());
                        }
                        R(iM, bundle, this.E.get());
                    }
                } else if (i15 == 4) {
                    s.l(iInterface);
                    H(iInterface);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final T A() {
        T t15;
        synchronized (this.f102421m) {
            try {
                if (this.f102428t == 5) {
                    throw new DeadObjectException();
                }
                o();
                IInterface iInterface = this.f102425q;
                s.m(iInterface, "Client is connected but service is null");
                t15 = (T) iInterface;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return t15;
    }

    protected abstract String B();

    protected abstract String C();

    protected String D() {
        return "com.google.android.gms";
    }

    public f E() {
        b1 b1Var = this.C;
        if (b1Var == null) {
            return null;
        }
        return b1Var.f102408d;
    }

    protected boolean F() {
        return l() >= 211700000;
    }

    public boolean G() {
        return this.C != null;
    }

    protected void H(T t15) {
        this.f102411c = System.currentTimeMillis();
    }

    protected void I(gg.a aVar) {
        this.f102412d = aVar.m();
        this.f102413e = System.currentTimeMillis();
    }

    protected void J(int i15) {
        this.f102409a = i15;
        this.f102410b = System.currentTimeMillis();
    }

    protected void K(int i15, IBinder iBinder, Bundle bundle, int i16) {
        z0 z0Var = new z0(this, i15, iBinder, bundle);
        Handler handler = this.f102420l;
        handler.sendMessage(handler.obtainMessage(1, i16, -1, z0Var));
    }

    public boolean L() {
        return false;
    }

    public void M(qg.a aVar) {
        this.f102434z = aVar;
    }

    public void N(String str) {
        this.f102433y = str;
    }

    public void O(int i15) {
        int i16 = this.E.get();
        Handler handler = this.f102420l;
        handler.sendMessage(handler.obtainMessage(6, i16, i15));
    }

    public boolean P() {
        return false;
    }

    protected final String Q() {
        String str = this.f102432x;
        return str == null ? this.f102416h.getClass().getName() : str;
    }

    protected final void R(int i15, Bundle bundle, int i16) {
        a1 a1Var = new a1(this, i15, bundle);
        Handler handler = this.f102420l;
        handler.sendMessage(handler.obtainMessage(7, i16, -1, a1Var));
    }

    final /* synthetic */ void S(b1 b1Var) {
        this.C = b1Var;
        if (P()) {
            f fVar = b1Var.f102408d;
            t.b().c(fVar == null ? null : fVar.y());
        }
    }

    final /* synthetic */ void T(int i15, IInterface iInterface) {
        f0(i15, null);
    }

    final /* synthetic */ boolean U(int i15, int i16, IInterface iInterface) {
        synchronized (this.f102421m) {
            try {
                if (this.f102428t != i15) {
                    return false;
                }
                f0(i16, iInterface);
                return true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

```
