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

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final a f102429u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final b f102430v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f102431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f102432x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile String f102433y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile qg.a f102434z;
    private static final gg.c[] G = new gg.c[0];
    public static final String[] F = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile String f102414f = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f102421m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f102422n = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ArrayList f102426r = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f102428t = 1;
    private gg.a A = null;
    private boolean B = false;
    private volatile b1 C = null;
    protected AtomicInteger E = new AtomicInteger(0);

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
