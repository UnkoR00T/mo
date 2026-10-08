package ig;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements hg.f.a, hg.f.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f92175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final hg.a.f f92176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f92177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v f92178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f92179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f92180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f92181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final z0 f92182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f92183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f92184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private gg.a f92185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f92186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ e f92187p;

    public e0(e eVar, hg.e eVar2) {
        Objects.requireNonNull(eVar);
        this.f92187p = eVar;
        this.f92175d = new LinkedList();
        this.f92179h = new HashSet();
        this.f92180i = new HashMap();
        this.f92184m = new ArrayList();
        this.f92185n = null;
        this.f92186o = 0;
        hg.a.f fVarY = eVar2.y(eVar.f().getLooper(), this);
        this.f92176e = fVarY;
        this.f92177f = eVar2.u();
        this.f92178g = new v();
        this.f92181j = eVar2.z();
        if (fVarY.i()) {
            this.f92182k = eVar2.A(eVar.G(), eVar.f());
        } else {
            this.f92182k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void H() {
        v();
        n(gg.a.f72705f);
        k();
        Iterator it = this.f92180i.values().iterator();
        while (it.hasNext()) {
            n nVar = ((s0) it.next()).f92276a;
            if (o(nVar.c()) != null) {
                it.remove();
            } else {
                try {
                    nVar.d(this.f92176e, new vh.m<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f92176e.b("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e15) {
                    e = e15;
                    c2.f("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e16) {
                    e = e16;
                    c2.f("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        f();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void I(int i15) {
        v();
        this.f92183l = true;
        this.f92178g.e(i15, this.f92176e.n());
        b bVar = this.f92177f;
        e eVar = this.f92187p;
        eVar.f().sendMessageDelayed(Message.obtain(eVar.f(), 9, bVar), 5000L);
        eVar.f().sendMessageDelayed(Message.obtain(eVar.f(), 11, bVar), 120000L);
        eVar.b().c();
        Iterator it = this.f92180i.values().iterator();
        while (it.hasNext()) {
            ((s0) it.next()).f92278c.run();
        }
    }

    private final boolean e(gg.a aVar) {
        synchronized (e.f92157t) {
            try {
                e eVar = this.f92187p;
                if (eVar.d() == null || !eVar.e().contains(this.f92177f)) {
                    return false;
                }
                eVar.d().q(aVar, this.f92181j);
                return true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private final void f() {
        Queue queue = this.f92175d;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            g1 g1Var = (g1) arrayList.get(i15);
            if (!this.f92176e.isConnected()) {
                return;
            }
            if (g(g1Var)) {
                queue.remove(g1Var);
            }
        }
    }

    private final boolean g(g1 g1Var) {
        if (!(g1Var instanceof q0)) {
            h(g1Var);
            return true;
        }
        q0 q0Var = (q0) g1Var;
        gg.c cVarO = o(q0Var.f(this));
        if (cVarO == null) {
            h(g1Var);
            return true;
        }
        String name = this.f92176e.getClass().getName();
        String strM = cVarO.m();
        long jP = cVarO.p();
        int length = name.length();
        StringBuilder sb5 = new StringBuilder(length + 53 + String.valueOf(strM).length() + 2 + String.valueOf(jP).length() + 2);
        sb5.append(name);
        sb5.append(" could not execute call because it requires feature (");
        sb5.append(strM);
        sb5.append(", ");
        sb5.append(jP);
        sb5.append(").");
        c2.g("GoogleApiManager", sb5.toString());
        e eVar = this.f92187p;
        if (!eVar.g() || !q0Var.g(this)) {
            q0Var.b(new hg.n(cVarO));
            return true;
        }
        f0 f0Var = new f0(this.f92177f, cVarO, null);
        List list = this.f92184m;
        int iIndexOf = list.indexOf(f0Var);
        if (iIndexOf >= 0) {
            f0 f0Var2 = (f0) list.get(iIndexOf);
            eVar.f().removeMessages(15, f0Var2);
            eVar.f().sendMessageDelayed(Message.obtain(eVar.f(), 15, f0Var2), 5000L);
            return false;
        }
        list.add(f0Var);
        eVar.f().sendMessageDelayed(Message.obtain(eVar.f(), 15, f0Var), 5000L);
        eVar.f().sendMessageDelayed(Message.obtain(eVar.f(), 16, f0Var), 120000L);
        gg.a aVar = new gg.a(2, null);
        if (e(aVar)) {
            String strM2 = cVarO.m();
            long jP2 = cVarO.p();
            StringBuilder sb6 = new StringBuilder(String.valueOf(strM2).length() + 61 + String.valueOf(jP2).length());
            sb6.append("A dialog should be displayed for missing feature: ");
            sb6.append(strM2);
            sb6.append(", version: ");
            sb6.append(jP2);
            c2.g("GoogleApiManager", sb6.toString());
            return false;
        }
        if (!eVar.y(aVar, this.f92181j)) {
            return false;
        }
        String strM3 = cVarO.m();
        long jP3 = cVarO.p();
        StringBuilder sb7 = new StringBuilder(String.valueOf(strM3).length() + 55 + String.valueOf(jP3).length());
        sb7.append("Notification displayed for missing feature: ");
        sb7.append(strM3);
        sb7.append(", version: ");
        sb7.append(jP3);
        c2.g("GoogleApiManager", sb7.toString());
        return false;
    }

    private final void h(g1 g1Var) {
        g1Var.c(this.f92178g, D());
        try {
            g1Var.d(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f92176e.b("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void i(Status status, Exception exc, boolean z15) {
        jg.s.d(this.f92187p.f());
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f92175d.iterator();
        while (it.hasNext()) {
            g1 g1Var = (g1) it.next();
            if (!z15 || g1Var.f92197a == 2) {
                if (status != null) {
                    g1Var.a(status);
                } else {
                    g1Var.b(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void J(Status status) {
        jg.s.d(this.f92187p.f());
        i(status, null, false);
    }

    private final void k() {
        if (this.f92183l) {
            e eVar = this.f92187p;
            b bVar = this.f92177f;
            eVar.f().removeMessages(11, bVar);
            eVar.f().removeMessages(9, bVar);
            this.f92183l = false;
        }
    }

    private final void l() {
        b bVar = this.f92177f;
        e eVar = this.f92187p;
        eVar.f().removeMessages(12, bVar);
        eVar.f().sendMessageDelayed(eVar.f().obtainMessage(12, bVar), eVar.D());
    }

    private final boolean m(boolean z15) {
        jg.s.d(this.f92187p.f());
        hg.a.f fVar = this.f92176e;
        if (!fVar.isConnected() || !this.f92180i.isEmpty()) {
            return false;
        }
        if (!this.f92178g.c()) {
            fVar.b("Timing out service connection.");
            return true;
        }
        if (!z15) {
            return false;
        }
        l();
        return false;
    }

    private final void n(gg.a aVar) {
        Set set = this.f92179h;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((h1) it.next()).b(this.f92177f, aVar, jg.r.a(aVar, gg.a.f72705f) ? this.f92176e.d() : null);
        }
        set.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final gg.c o(gg.c[] cVarArr) {
        if (cVarArr != null && cVarArr.length != 0) {
            gg.c[] cVarArrM = this.f92176e.m();
            if (cVarArrM == null) {
                cVarArrM = new gg.c[0];
            }
            r0.a aVar = new r0.a(cVarArrM.length);
            for (gg.c cVar : cVarArrM) {
                aVar.put(cVar.m(), Long.valueOf(cVar.p()));
            }
            for (gg.c cVar2 : cVarArr) {
                Long l15 = (Long) aVar.get(cVar2.m());
                if (l15 == null || l15.longValue() < cVar2.p()) {
                    return cVar2;
                }
            }
        }
        return null;
    }

    public final void A() {
        e eVar = this.f92187p;
        jg.s.d(eVar.f());
        hg.a.f fVar = this.f92176e;
        if (fVar.isConnected() || fVar.c()) {
            return;
        }
        try {
            int iA = eVar.b().a(eVar.G(), fVar);
            if (iA == 0) {
                h0 h0Var = new h0(eVar, fVar, this.f92177f);
                if (fVar.i()) {
                    ((z0) jg.s.l(this.f92182k)).m3(h0Var);
                }
                try {
                    fVar.e(h0Var);
                    return;
                } catch (SecurityException e15) {
                    q(new gg.a(10), e15);
                    return;
                }
            }
            gg.a aVar = new gg.a(iA, null);
            String name = this.f92176e.getClass().getName();
            String string = aVar.toString();
            StringBuilder sb5 = new StringBuilder(name.length() + 35 + string.length());
            sb5.append("The service for ");
            sb5.append(name);
            sb5.append(" is not available: ");
            sb5.append(string);
            c2.g("GoogleApiManager", sb5.toString());
            q(aVar, null);
        } catch (IllegalStateException e16) {
            q(new gg.a(10), e16);
        }
    }

    public final void B(h1 h1Var) {
        jg.s.d(this.f92187p.f());
        this.f92179h.add(h1Var);
    }

    final boolean C() {
        return this.f92176e.isConnected();
    }

    public final boolean D() {
        return this.f92176e.i();
    }

    public final int E() {
        return this.f92181j;
    }

    final int F() {
        return this.f92186o;
    }

    final void G() {
        this.f92186o++;
    }

    final /* synthetic */ boolean K(boolean z15) {
        return m(false);
    }

    final /* synthetic */ void L(f0 f0Var) {
        if (this.f92184m.contains(f0Var) && !this.f92183l) {
            if (this.f92176e.isConnected()) {
                f();
            } else {
                A();
            }
        }
    }

    final /* synthetic */ void M(f0 f0Var) {
        gg.c[] cVarArrF;
        if (this.f92184m.remove(f0Var)) {
            e eVar = this.f92187p;
            eVar.f().removeMessages(15, f0Var);
            eVar.f().removeMessages(16, f0Var);
            gg.c cVarB = f0Var.b();
            Queue<g1> queue = this.f92175d;
            ArrayList arrayList = new ArrayList(queue.size());
            for (g1 g1Var : queue) {
                if ((g1Var instanceof q0) && (cVarArrF = ((q0) g1Var).f(this)) != null && com.google.android.gms.common.util.b.b(cVarArrF, cVarB)) {
                    arrayList.add(g1Var);
                }
            }
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                g1 g1Var2 = (g1) arrayList.get(i15);
                queue.remove(g1Var2);
                g1Var2.b(new hg.n(cVarB));
            }
        }
    }

    final /* synthetic */ hg.a.f N() {
        return this.f92176e;
    }

    final /* synthetic */ b a() {
        return this.f92177f;
    }

    final /* synthetic */ boolean b() {
        return this.f92183l;
    }

    @Override // ig.d
    public final void onConnected(Bundle bundle) {
        e eVar = this.f92187p;
        if (Looper.myLooper() == eVar.f().getLooper()) {
            H();
        } else {
            eVar.f().post(new a0(this));
        }
    }

    @Override // ig.m
    public final void onConnectionFailed(gg.a aVar) {
        q(aVar, null);
    }

    @Override // ig.d
    public final void onConnectionSuspended(int i15) {
        e eVar = this.f92187p;
        if (Looper.myLooper() == eVar.f().getLooper()) {
            I(i15);
        } else {
            eVar.f().post(new b0(this, i15));
        }
    }

    public final void p(gg.a aVar) {
        jg.s.d(this.f92187p.f());
        hg.a.f fVar = this.f92176e;
        String name = fVar.getClass().getName();
        String strValueOf = String.valueOf(aVar);
        StringBuilder sb5 = new StringBuilder(name.length() + 25 + strValueOf.length());
        sb5.append("onSignInFailed for ");
        sb5.append(name);
        sb5.append(" with ");
        sb5.append(strValueOf);
        fVar.b(sb5.toString());
        q(aVar, null);
    }

    public final void q(gg.a aVar, Exception exc) {
        e eVar = this.f92187p;
        jg.s.d(eVar.f());
        z0 z0Var = this.f92182k;
        if (z0Var != null) {
            z0Var.n3();
        }
        v();
        eVar.b().c();
        n(aVar);
        if ((this.f92176e instanceof lg.e) && aVar.m() != 24) {
            eVar.E(true);
            eVar.f().sendMessageDelayed(eVar.f().obtainMessage(19), 300000L);
        }
        if (aVar.m() == 4) {
            J(e.f92156s);
            return;
        }
        if (aVar.m() == 25) {
            J(e.j(this.f92177f, aVar));
            return;
        }
        Queue queue = this.f92175d;
        if (queue.isEmpty()) {
            this.f92185n = aVar;
            return;
        }
        if (exc != null) {
            jg.s.d(eVar.f());
            i(null, exc, false);
            return;
        }
        if (!eVar.g()) {
            J(e.j(this.f92177f, aVar));
            return;
        }
        b bVar = this.f92177f;
        i(e.j(bVar, aVar), null, true);
        if (queue.isEmpty() || e(aVar) || eVar.y(aVar, this.f92181j)) {
            return;
        }
        if (aVar.m() == 18) {
            this.f92183l = true;
        }
        if (this.f92183l) {
            eVar.f().sendMessageDelayed(Message.obtain(eVar.f(), 9, bVar), 5000L);
        } else {
            J(e.j(bVar, aVar));
        }
    }

    public final void r(g1 g1Var) {
        jg.s.d(this.f92187p.f());
        if (this.f92176e.isConnected()) {
            if (g(g1Var)) {
                l();
                return;
            } else {
                this.f92175d.add(g1Var);
                return;
            }
        }
        this.f92175d.add(g1Var);
        gg.a aVar = this.f92185n;
        if (aVar == null || !aVar.u()) {
            A();
        } else {
            q(this.f92185n, null);
        }
    }

    public final void s() {
        jg.s.d(this.f92187p.f());
        J(e.f92155r);
        this.f92178g.d();
        for (j.a aVar : (j.a[]) this.f92180i.keySet().toArray(new j.a[0])) {
            r(new f1(aVar, new vh.m()));
        }
        n(new gg.a(4));
        hg.a.f fVar = this.f92176e;
        if (fVar.isConnected()) {
            fVar.a(new d0(this));
        }
    }

    public final hg.a.f t() {
        return this.f92176e;
    }

    public final Map u() {
        return this.f92180i;
    }

    public final void v() {
        jg.s.d(this.f92187p.f());
        this.f92185n = null;
    }

    public final gg.a w() {
        jg.s.d(this.f92187p.f());
        return this.f92185n;
    }

    public final void x() {
        jg.s.d(this.f92187p.f());
        if (this.f92183l) {
            A();
        }
    }

    public final void y() {
        e eVar = this.f92187p;
        jg.s.d(eVar.f());
        if (this.f92183l) {
            k();
            J(eVar.a().g(eVar.G()) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f92176e.b("Timing out connection while resuming.");
        }
    }

    public final boolean z() {
        return m(true);
    }
}
