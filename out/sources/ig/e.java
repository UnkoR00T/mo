package ig;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class e implements Handler.Callback {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static e f92158v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private jg.w f92162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private jg.y f92163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f92164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final gg.d f92165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final jg.j0 f92166g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Handler f92173p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f92174q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Status f92155r = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Status f92156s = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Object f92157t = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static volatile boolean f92159w = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f92160a = 10000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f92161b = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicInteger f92167h = new AtomicInteger(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicInteger f92168j = new AtomicInteger(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map f92169k = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private w f92170l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f92171m = new r0.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f92172n = new r0.b();

    private e(Context context, Looper looper, gg.d dVar) {
        this.f92174q = true;
        this.f92164e = context;
        vg.f fVar = new vg.f(looper, this);
        this.f92173p = fVar;
        this.f92165f = dVar;
        this.f92166g = new jg.j0(dVar);
        if (com.google.android.gms.common.util.g.a(context)) {
            this.f92174q = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    private final e0 h(hg.e eVar) {
        Map map = this.f92169k;
        b bVarU = eVar.u();
        e0 e0Var = (e0) map.get(bVarU);
        if (e0Var == null) {
            e0Var = new e0(this, eVar);
            map.put(bVarU, e0Var);
        }
        if (e0Var.D()) {
            this.f92172n.add(bVarU);
        }
        e0Var.A();
        return e0Var;
    }

    private final void i(vh.m mVar, int i15, hg.e eVar) {
        o0 o0VarB;
        if (i15 == 0 || (o0VarB = o0.b(this, i15, eVar.u())) == null) {
            return;
        }
        vh.l lVarA = mVar.a();
        final Handler handler = this.f92173p;
        Objects.requireNonNull(handler);
        lVarA.b(new Executor() { // from class: ig.j0
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, o0VarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status j(b bVar, gg.a aVar) {
        String strB = bVar.b();
        String strValueOf = String.valueOf(aVar);
        StringBuilder sb5 = new StringBuilder(String.valueOf(strB).length() + 63 + strValueOf.length());
        sb5.append("API: ");
        sb5.append(strB);
        sb5.append(" is not available on this device. Connection failed with: ");
        sb5.append(strValueOf);
        return new Status(aVar, sb5.toString());
    }

    private final void k() {
        jg.w wVar = this.f92162c;
        if (wVar != null) {
            if (wVar.h() > 0 || v()) {
                l().g(wVar);
            }
            this.f92162c = null;
        }
    }

    private final jg.y l() {
        if (this.f92163d == null) {
            this.f92163d = jg.x.a(this.f92164e);
        }
        return this.f92163d;
    }

    public static e m(Context context) {
        e eVar;
        synchronized (f92157t) {
            try {
                if (f92158v == null) {
                    f92158v = new e(context.getApplicationContext(), jg.j.b().getLooper(), gg.d.n());
                    if (f92159w) {
                        final Handler handler = f92158v.f92173p;
                        Objects.requireNonNull(handler);
                        jg.h.i0(new Executor() { // from class: ig.i0
                            @Override // java.util.concurrent.Executor
                            public final /* synthetic */ void execute(Runnable runnable) {
                                handler.post(runnable);
                            }
                        });
                    }
                }
                eVar = f92158v;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return eVar;
    }

    final void A(jg.q qVar, int i15, long j15, int i16) {
        p0 p0Var = new p0(qVar, i15, j15, i16);
        Handler handler = this.f92173p;
        handler.sendMessage(handler.obtainMessage(18, p0Var));
    }

    final /* synthetic */ long D() {
        return this.f92160a;
    }

    final /* synthetic */ void E(boolean z15) {
        this.f92161b = true;
    }

    final /* synthetic */ Context G() {
        return this.f92164e;
    }

    final /* synthetic */ gg.d a() {
        return this.f92165f;
    }

    final /* synthetic */ jg.j0 b() {
        return this.f92166g;
    }

    final /* synthetic */ Map c() {
        return this.f92169k;
    }

    final /* synthetic */ w d() {
        return this.f92170l;
    }

    final /* synthetic */ Set e() {
        return this.f92171m;
    }

    final /* synthetic */ Handler f() {
        return this.f92173p;
    }

    final /* synthetic */ boolean g() {
        return this.f92174q;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x022b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0238  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i15 = message.what;
        e0 e0Var = null;
        switch (i15) {
            case 1:
                this.f92160a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                Handler handler = this.f92173p;
                handler.removeMessages(12);
                Iterator it = this.f92169k.keySet().iterator();
                while (it.hasNext()) {
                    handler.sendMessageDelayed(handler.obtainMessage(12, (b) it.next()), this.f92160a);
                }
                return true;
            case 2:
                h1 h1Var = (h1) message.obj;
                for (b bVar : h1Var.a()) {
                    e0 e0Var2 = (e0) this.f92169k.get(bVar);
                    if (e0Var2 == null) {
                        h1Var.b(bVar, new gg.a(13), null);
                        return true;
                    }
                    if (e0Var2.C()) {
                        h1Var.b(bVar, gg.a.f72705f, e0Var2.t().d());
                    } else {
                        gg.a aVarW = e0Var2.w();
                        if (aVarW != null) {
                            h1Var.b(bVar, aVarW, null);
                        } else {
                            e0Var2.B(h1Var);
                            e0Var2.A();
                        }
                    }
                }
                return true;
            case 3:
                for (e0 e0Var3 : this.f92169k.values()) {
                    e0Var3.v();
                    e0Var3.A();
                }
                return true;
            case 4:
            case 8:
            case 13:
                r0 r0Var = (r0) message.obj;
                Map map = this.f92169k;
                hg.e eVar = r0Var.f92268c;
                e0 e0VarH = (e0) map.get(eVar.u());
                if (e0VarH == null) {
                    e0VarH = h(eVar);
                }
                if (!e0VarH.D() || this.f92168j.get() == r0Var.f92267b) {
                    e0VarH.r(r0Var.f92266a);
                } else {
                    r0Var.f92266a.a(f92155r);
                    e0VarH.s();
                }
                return true;
            case 5:
                int i16 = message.arg1;
                gg.a aVar = (gg.a) message.obj;
                for (e0 e0Var4 : this.f92169k.values()) {
                    if (e0Var4.E() == i16) {
                        e0Var = e0Var4;
                        if (e0Var != null) {
                            StringBuilder sb5 = new StringBuilder(String.valueOf(i16).length() + 65);
                            sb5.append("Could not find API instance ");
                            sb5.append(i16);
                            sb5.append(" while trying to fail enqueued calls.");
                            c2.k("GoogleApiManager", sb5.toString(), new Exception());
                        } else if (aVar.m() == 13) {
                            String strE = this.f92165f.e(aVar.m());
                            String strP = aVar.p();
                            StringBuilder sb6 = new StringBuilder(String.valueOf(strE).length() + 69 + String.valueOf(strP).length());
                            sb6.append("Error resolution was canceled by the user, original error message: ");
                            sb6.append(strE);
                            sb6.append(": ");
                            sb6.append(strP);
                            e0Var.J(new Status(17, sb6.toString()));
                        } else {
                            e0Var.J(j(e0Var.a(), aVar));
                        }
                        return true;
                    }
                }
                if (e0Var != null) {
                    StringBuilder sb7 = new StringBuilder(String.valueOf(i16).length() + 65);
                    sb7.append("Could not find API instance ");
                    sb7.append(i16);
                    sb7.append(" while trying to fail enqueued calls.");
                    c2.k("GoogleApiManager", sb7.toString(), new Exception());
                } else if (aVar.m() == 13) {
                    String strE2 = this.f92165f.e(aVar.m());
                    String strP2 = aVar.p();
                    StringBuilder sb8 = new StringBuilder(String.valueOf(strE2).length() + 69 + String.valueOf(strP2).length());
                    sb8.append("Error resolution was canceled by the user, original error message: ");
                    sb8.append(strE2);
                    sb8.append(": ");
                    sb8.append(strP2);
                    e0Var.J(new Status(17, sb8.toString()));
                } else {
                    e0Var.J(j(e0Var.a(), aVar));
                }
                return true;
            case 6:
                Context context = this.f92164e;
                if (context.getApplicationContext() instanceof Application) {
                    c.c((Application) context.getApplicationContext());
                    c.b().a(new z(this));
                    if (!c.b().e(true)) {
                        this.f92160a = 300000L;
                    }
                }
                return true;
            case 7:
                h((hg.e) message.obj);
                return true;
            case 9:
                Map map2 = this.f92169k;
                if (map2.containsKey(message.obj)) {
                    ((e0) map2.get(message.obj)).x();
                }
                return true;
            case 10:
                Set set = this.f92172n;
                Iterator it4 = set.iterator();
                while (it4.hasNext()) {
                    e0 e0Var5 = (e0) this.f92169k.remove((b) it4.next());
                    if (e0Var5 != null) {
                        e0Var5.s();
                    }
                }
                set.clear();
                return true;
            case 11:
                Map map3 = this.f92169k;
                if (map3.containsKey(message.obj)) {
                    ((e0) map3.get(message.obj)).y();
                }
                return true;
            case 12:
                Map map4 = this.f92169k;
                if (map4.containsKey(message.obj)) {
                    ((e0) map4.get(message.obj)).z();
                }
                return true;
            case 14:
                x xVar = (x) message.obj;
                b bVarA = xVar.a();
                Map map5 = this.f92169k;
                if (map5.containsKey(bVarA)) {
                    xVar.b().c(Boolean.valueOf(((e0) map5.get(bVarA)).K(false)));
                } else {
                    xVar.b().c(Boolean.FALSE);
                }
                return true;
            case 15:
                f0 f0Var = (f0) message.obj;
                Map map6 = this.f92169k;
                if (map6.containsKey(f0Var.a())) {
                    ((e0) map6.get(f0Var.a())).L(f0Var);
                }
                return true;
            case 16:
                f0 f0Var2 = (f0) message.obj;
                Map map7 = this.f92169k;
                if (map7.containsKey(f0Var2.a())) {
                    ((e0) map7.get(f0Var2.a())).M(f0Var2);
                }
                return true;
            case 17:
                k();
                return true;
            case 18:
                p0 p0Var = (p0) message.obj;
                long j15 = p0Var.f92258c;
                if (j15 == 0) {
                    l().g(new jg.w(p0Var.f92257b, Arrays.asList(p0Var.f92256a)));
                } else {
                    jg.w wVar = this.f92162c;
                    if (wVar != null) {
                        List listM = wVar.m();
                        if (wVar.h() != p0Var.f92257b || (listM != null && listM.size() >= p0Var.f92259d)) {
                            this.f92173p.removeMessages(17);
                            k();
                        } else {
                            this.f92162c.p(p0Var.f92256a);
                        }
                    }
                    if (this.f92162c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(p0Var.f92256a);
                        this.f92162c = new jg.w(p0Var.f92257b, arrayList);
                        Handler handler2 = this.f92173p;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), j15);
                    }
                }
                return true;
            case 19:
                this.f92161b = false;
                return true;
            default:
                StringBuilder sb9 = new StringBuilder(String.valueOf(i15).length() + 20);
                sb9.append("Unknown message id: ");
                sb9.append(i15);
                c2.g("GoogleApiManager", sb9.toString());
                return false;
        }
    }

    public final int n() {
        return this.f92167h.getAndIncrement();
    }

    public final void o(hg.e eVar) {
        Handler handler = this.f92173p;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void p(w wVar) {
        synchronized (f92157t) {
            try {
                if (this.f92170l != wVar) {
                    this.f92170l = wVar;
                    this.f92171m.clear();
                }
                this.f92171m.addAll(wVar.u());
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    final void q(w wVar) {
        synchronized (f92157t) {
            try {
                if (this.f92170l == wVar) {
                    this.f92170l = null;
                    this.f92171m.clear();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    final e0 r(b bVar) {
        return (e0) this.f92169k.get(bVar);
    }

    public final void s() {
        Handler handler = this.f92173p;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void t(hg.e eVar, int i15, com.google.android.gms.common.api.internal.a aVar) {
        r0 r0Var = new r0(new c1(i15, aVar), this.f92168j.get(), eVar);
        Handler handler = this.f92173p;
        handler.sendMessage(handler.obtainMessage(4, r0Var));
    }

    public final void u(hg.e eVar, int i15, s sVar, vh.m mVar, q qVar) {
        i(mVar, sVar.e(), eVar);
        r0 r0Var = new r0(new e1(i15, sVar, mVar, qVar), this.f92168j.get(), eVar);
        Handler handler = this.f92173p;
        handler.sendMessage(handler.obtainMessage(4, r0Var));
    }

    final boolean v() {
        if (this.f92161b) {
            return false;
        }
        jg.u uVarA = jg.t.b().a();
        if (uVarA != null && !uVarA.p()) {
            return false;
        }
        int iB = this.f92166g.b(this.f92164e, 203400000);
        return iB == -1 || iB == 0;
    }

    public final vh.l w(hg.e eVar, n nVar, u uVar, Runnable runnable) {
        vh.m mVar = new vh.m();
        i(mVar, nVar.f(), eVar);
        r0 r0Var = new r0(new d1(new s0(nVar, uVar, runnable), mVar), this.f92168j.get(), eVar);
        Handler handler = this.f92173p;
        handler.sendMessage(handler.obtainMessage(8, r0Var));
        return mVar.a();
    }

    public final vh.l x(hg.e eVar, j.a aVar, int i15) {
        vh.m mVar = new vh.m();
        i(mVar, i15, eVar);
        r0 r0Var = new r0(new f1(aVar, mVar), this.f92168j.get(), eVar);
        Handler handler = this.f92173p;
        handler.sendMessage(handler.obtainMessage(13, r0Var));
        return mVar.a();
    }

    final boolean y(gg.a aVar, int i15) {
        return this.f92165f.t(this.f92164e, aVar, i15);
    }

    public final void z(gg.a aVar, int i15) {
        if (y(aVar, i15)) {
            return;
        }
        Handler handler = this.f92173p;
        handler.sendMessage(handler.obtainMessage(5, i15, 0, aVar));
    }
}
