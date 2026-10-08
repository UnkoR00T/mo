package d8;

import ak.b2;
import ak.h2;
import ak.n0;
import ak.u0;
import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import b8.e2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public class h implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f40241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0.c f40242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j0 f40243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f40244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f40245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f40246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f40247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g f40248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k8.j f40249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C0880h f40250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f40251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<d8.g> f40252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set<f> f40253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set<d8.g> f40254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f40255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a0 f40256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private d8.g f40257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d8.g f40258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Looper f40259t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Handler f40260u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f40261v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f40262w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private e2 f40263x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    volatile d f40264y;

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f40268d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f40265a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UUID f40266b = t7.f.f188173e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a0.c f40267c = f0.f40199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f40269e = new int[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f40270f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private k8.j f40271g = new k8.i();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f40272h = 300000;

        public h a(j0 j0Var) {
            return new h(this.f40266b, this.f40267c, j0Var, this.f40265a, this.f40268d, this.f40269e, this.f40270f, this.f40271g, this.f40272h);
        }

        public b b(k8.j jVar) {
            this.f40271g = (k8.j) zj.p.q(jVar);
            return this;
        }

        public b c(boolean z15) {
            this.f40268d = z15;
            return this;
        }

        public b d(boolean z15) {
            this.f40270f = z15;
            return this;
        }

        public b e(int... iArr) {
            for (int i15 : iArr) {
                boolean z15 = true;
                if (i15 != 2 && i15 != 1) {
                    z15 = false;
                }
                zj.p.d(z15);
            }
            this.f40269e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, a0.c cVar) {
            this.f40266b = (UUID) zj.p.q(uuid);
            this.f40267c = (a0.c) zj.p.q(cVar);
            return this;
        }
    }

    private class c implements a0.b {
        private c() {
        }

        @Override // d8.a0.b
        public void a(a0 a0Var, byte[] bArr, int i15, int i16, byte[] bArr2) {
            ((d) zj.p.q(h.this.f40264y)).obtainMessage(i15, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (d8.g gVar : h.this.f40252m) {
                if (gVar.x(bArr)) {
                    gVar.D(message.what);
                    return;
                }
            }
        }
    }

    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f implements u.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t.a f40275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m f40276c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f40277d;

        public f(t.a aVar) {
            this.f40275b = aVar;
        }

        public static /* synthetic */ void c(f fVar, t7.p pVar) {
            if (h.this.f40255p == 0 || fVar.f40277d) {
                return;
            }
            h hVar = h.this;
            fVar.f40276c = hVar.u((Looper) zj.p.q(hVar.f40259t), fVar.f40275b, pVar, false);
            h.this.f40253n.add(fVar);
        }

        public static /* synthetic */ void d(f fVar) {
            if (fVar.f40277d) {
                return;
            }
            m mVar = fVar.f40276c;
            if (mVar != null) {
                mVar.f(fVar.f40275b);
            }
            h.this.f40253n.remove(fVar);
            fVar.f40277d = true;
        }

        @Override // d8.u.b
        public void b() {
            o0.R0((Handler) zj.p.q(h.this.f40260u), new Runnable() { // from class: d8.j
                @Override // java.lang.Runnable
                public final void run() {
                    h.f.d(this.f40289a);
                }
            });
        }

        public void e(final t7.p pVar) {
            ((Handler) zj.p.q(h.this.f40260u)).post(new Runnable() { // from class: d8.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.f.c(this.f40287a, pVar);
                }
            });
        }
    }

    private class g implements d8.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<d8.g> f40279a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d8.g f40280b;

        public g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // d8.g.a
        public void a(Exception exc, boolean z15) {
            this.f40280b = null;
            n0 n0VarV = n0.v(this.f40279a);
            this.f40279a.clear();
            h2 it = n0VarV.iterator();
            while (it.hasNext()) {
                ((d8.g) it.next()).F(exc, z15);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // d8.g.a
        public void b() {
            this.f40280b = null;
            n0 n0VarV = n0.v(this.f40279a);
            this.f40279a.clear();
            h2 it = n0VarV.iterator();
            while (it.hasNext()) {
                ((d8.g) it.next()).E();
            }
        }

        @Override // d8.g.a
        public void c(d8.g gVar) {
            this.f40279a.add(gVar);
            if (this.f40280b != null) {
                return;
            }
            this.f40280b = gVar;
            gVar.J();
        }

        public void d(d8.g gVar) {
            this.f40279a.remove(gVar);
            if (this.f40280b == gVar) {
                this.f40280b = null;
                if (this.f40279a.isEmpty()) {
                    return;
                }
                d8.g next = this.f40279a.iterator().next();
                this.f40280b = next;
                next.J();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d8.h$h, reason: collision with other inner class name */
    class C0880h implements d8.g.b {
        private C0880h() {
        }

        @Override // d8.g.b
        public void a(d8.g gVar, int i15) {
            if (h.this.f40251l != -9223372036854775807L) {
                h.this.f40254o.remove(gVar);
                ((Handler) zj.p.q(h.this.f40260u)).removeCallbacksAndMessages(gVar);
            }
        }

        @Override // d8.g.b
        public void b(final d8.g gVar, int i15) {
            if (i15 == 1 && h.this.f40255p > 0 && h.this.f40251l != -9223372036854775807L) {
                h.this.f40254o.add(gVar);
                ((Handler) zj.p.q(h.this.f40260u)).postAtTime(new Runnable() { // from class: d8.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        gVar.f(null);
                    }
                }, gVar, SystemClock.uptimeMillis() + h.this.f40251l);
            } else if (i15 == 0) {
                h.this.f40252m.remove(gVar);
                if (h.this.f40257r == gVar) {
                    h.this.f40257r = null;
                }
                if (h.this.f40258s == gVar) {
                    h.this.f40258s = null;
                }
                h.this.f40248i.d(gVar);
                if (h.this.f40251l != -9223372036854775807L) {
                    ((Handler) zj.p.q(h.this.f40260u)).removeCallbacksAndMessages(gVar);
                    h.this.f40254o.remove(gVar);
                }
            }
            h.this.D();
        }
    }

    private synchronized void A(Looper looper) {
        try {
            Looper looper2 = this.f40259t;
            if (looper2 == null) {
                this.f40259t = looper;
                this.f40260u = new Handler(looper);
            } else {
                zj.p.w(looper2 == looper);
                zj.p.q(this.f40260u);
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private m B(int i15, boolean z15) {
        a0 a0Var = (a0) zj.p.q(this.f40256q);
        if ((a0Var.g() == 2 && b0.f40191d) || o0.F0(this.f40246g, i15) == -1 || a0Var.g() == 1) {
            return null;
        }
        d8.g gVar = this.f40257r;
        if (gVar == null) {
            d8.g gVarY = y(n0.C(), true, null, z15);
            this.f40252m.add(gVarY);
            this.f40257r = gVarY;
        } else {
            gVar.e(null);
        }
        return this.f40257r;
    }

    private void C(Looper looper) {
        if (this.f40264y == null) {
            this.f40264y = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        if (this.f40256q != null && this.f40255p == 0 && this.f40252m.isEmpty() && this.f40253n.isEmpty()) {
            ((a0) zj.p.q(this.f40256q)).b();
            this.f40256q = null;
        }
    }

    private void E() {
        h2 it = u0.v(this.f40254o).iterator();
        while (it.hasNext()) {
            ((m) it.next()).f(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void F() {
        h2 it = u0.v(this.f40253n).iterator();
        while (it.hasNext()) {
            ((f) it.next()).b();
        }
    }

    private void H(m mVar, t.a aVar) {
        mVar.f(aVar);
        if (this.f40251l != -9223372036854775807L) {
            mVar.f(null);
        }
    }

    private void I(boolean z15) {
        if (z15 && this.f40259t == null) {
            w7.t.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) zj.p.q(this.f40259t)).getThread()) {
            w7.t.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f40259t.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public m u(Looper looper, t.a aVar, t7.p pVar, boolean z15) {
        List<t7.l.b> listZ;
        C(looper);
        t7.l lVar = pVar.f188385t;
        if (lVar == null) {
            return B(t7.w.f(pVar.f188381p), z15);
        }
        d8.g gVar = null;
        Object[] objArr = 0;
        if (this.f40262w == null) {
            listZ = z((t7.l) zj.p.q(lVar), this.f40241b, false);
            if (listZ.isEmpty()) {
                e eVar = new e(this.f40241b);
                w7.t.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new z(new m.a(eVar, 6003));
            }
        } else {
            listZ = null;
        }
        if (this.f40245f) {
            for (d8.g gVar2 : this.f40252m) {
                if (Objects.equals(gVar2.f40203a, listZ)) {
                    gVar = gVar2;
                    break;
                }
            }
        } else {
            gVar = this.f40258s;
        }
        if (gVar != null) {
            gVar.e(aVar);
            return gVar;
        }
        d8.g gVarY = y(listZ, false, aVar, z15);
        if (!this.f40245f) {
            this.f40258s = gVarY;
        }
        this.f40252m.add(gVarY);
        return gVarY;
    }

    private static boolean v(m mVar) {
        if (mVar.getState() != 1) {
            return false;
        }
        Throwable cause = ((m.a) zj.p.q(mVar.c())).getCause();
        return (cause instanceof ResourceBusyException) || x.e(cause);
    }

    private boolean w(t7.l lVar) {
        if (this.f40262w != null) {
            return true;
        }
        if (z(lVar, this.f40241b, true).isEmpty()) {
            if (lVar.f188323d != 1 || !lVar.c(0).b(t7.f.f188171c)) {
                return false;
            }
            w7.t.h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f40241b);
        }
        String str = lVar.f188322c;
        if (str == null || "cenc".equals(str) || "cbcs".equals(str)) {
            return true;
        }
        return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private d8.g x(List<t7.l.b> list, boolean z15, t.a aVar) {
        zj.p.q(this.f40256q);
        d8.g gVar = new d8.g(this.f40241b, this.f40256q, this.f40248i, this.f40250k, list, this.f40261v, this.f40247h | z15, z15, this.f40262w, this.f40244e, this.f40243d, (Looper) zj.p.q(this.f40259t), this.f40249j, (e2) zj.p.q(this.f40263x));
        gVar.e(aVar);
        if (this.f40251l != -9223372036854775807L) {
            gVar.e(null);
        }
        return gVar;
    }

    private d8.g y(List<t7.l.b> list, boolean z15, t.a aVar, boolean z16) {
        d8.g gVarX = x(list, z15, aVar);
        if (v(gVarX) && !this.f40254o.isEmpty()) {
            E();
            H(gVarX, aVar);
            gVarX = x(list, z15, aVar);
        }
        if (!v(gVarX) || !z16 || this.f40253n.isEmpty()) {
            return gVarX;
        }
        F();
        if (!this.f40254o.isEmpty()) {
            E();
        }
        H(gVarX, aVar);
        return x(list, z15, aVar);
    }

    private static List<t7.l.b> z(t7.l lVar, UUID uuid, boolean z15) {
        ArrayList arrayList = new ArrayList(lVar.f188323d);
        for (int i15 = 0; i15 < lVar.f188323d; i15++) {
            t7.l.b bVarC = lVar.c(i15);
            if ((bVarC.b(uuid) || (t7.f.f188172d.equals(uuid) && bVarC.b(t7.f.f188171c))) && (bVarC.f188328e != null || z15)) {
                arrayList.add(bVarC);
            }
        }
        return arrayList;
    }

    public void G(int i15, byte[] bArr) {
        zj.p.w(this.f40252m.isEmpty());
        if (i15 == 1 || i15 == 3) {
            zj.p.q(bArr);
        }
        this.f40261v = i15;
        this.f40262w = bArr;
    }

    @Override // d8.u
    public final void a() {
        I(true);
        int i15 = this.f40255p;
        this.f40255p = i15 + 1;
        if (i15 != 0) {
            return;
        }
        if (this.f40256q == null) {
            a0 a0VarA = this.f40242c.a(this.f40241b);
            this.f40256q = a0VarA;
            a0VarA.j(new c());
        } else if (this.f40251l != -9223372036854775807L) {
            for (int i16 = 0; i16 < this.f40252m.size(); i16++) {
                this.f40252m.get(i16).e(null);
            }
        }
    }

    @Override // d8.u
    public final void b() {
        I(true);
        int i15 = this.f40255p - 1;
        this.f40255p = i15;
        if (i15 != 0) {
            return;
        }
        if (this.f40251l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f40252m);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                ((d8.g) arrayList.get(i16)).f(null);
            }
        }
        F();
        D();
    }

    @Override // d8.u
    public int c(t7.p pVar) {
        I(false);
        int iG = ((a0) zj.p.q(this.f40256q)).g();
        t7.l lVar = pVar.f188385t;
        if (lVar == null) {
            if (o0.F0(this.f40246g, t7.w.f(pVar.f188381p)) == -1) {
                return 0;
            }
        } else if (!w(lVar)) {
            return 1;
        }
        return iG;
    }

    @Override // d8.u
    public void d(Looper looper, e2 e2Var) {
        A(looper);
        this.f40263x = e2Var;
    }

    @Override // d8.u
    public u.b e(t.a aVar, t7.p pVar) {
        zj.p.w(this.f40255p > 0);
        zj.p.q(this.f40259t);
        f fVar = new f(aVar);
        fVar.e(pVar);
        return fVar;
    }

    @Override // d8.u
    public m f(t.a aVar, t7.p pVar) {
        I(false);
        zj.p.w(this.f40255p > 0);
        zj.p.q(this.f40259t);
        return u(this.f40259t, aVar, pVar, true);
    }

    private h(UUID uuid, a0.c cVar, j0 j0Var, HashMap<String, String> map, boolean z15, int[] iArr, boolean z16, k8.j jVar, long j15) {
        zj.p.q(uuid);
        zj.p.e(!t7.f.f188171c.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f40241b = uuid;
        this.f40242c = cVar;
        this.f40243d = j0Var;
        this.f40244e = map;
        this.f40245f = z15;
        this.f40246g = iArr;
        this.f40247h = z16;
        this.f40249j = jVar;
        this.f40248i = new g();
        this.f40250k = new C0880h();
        this.f40261v = 0;
        this.f40252m = new ArrayList();
        this.f40253n = b2.h();
        this.f40254o = b2.h();
        this.f40251l = j15;
    }
}
