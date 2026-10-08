package b8;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 implements c2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final zj.w<String> f17446i = new zj.w() { // from class: b8.n1
        @Override // zj.w
        public final Object get() {
            return o1.m();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Random f17447j = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t7.e0.c f17448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t7.e0.b f17449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f17450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zj.w<String> f17451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c2.a f17452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private t7.e0 f17453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f17454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f17455h;

    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f17457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f17458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h8.c0.b f17459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f17460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f17461f;

        public a(String str, int i15, h8.c0.b bVar) {
            this.f17456a = str;
            this.f17457b = i15;
            this.f17458c = bVar == null ? -1L : bVar.f81471d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f17459d = bVar;
        }

        private int l(t7.e0 e0Var, t7.e0 e0Var2, int i15) {
            if (i15 >= e0Var.p()) {
                if (i15 < e0Var2.p()) {
                    return i15;
                }
                return -1;
            }
            e0Var.n(i15, o1.this.f17448a);
            for (int i16 = o1.this.f17448a.f188166n; i16 <= o1.this.f17448a.f188167o; i16++) {
                int iB = e0Var2.b(e0Var.m(i16));
                if (iB != -1) {
                    return e0Var2.f(iB, o1.this.f17449b).f188138c;
                }
            }
            return -1;
        }

        public boolean i(int i15, h8.c0.b bVar) {
            if (bVar != null) {
                long j15 = bVar.f81471d;
                if (j15 != -1) {
                    h8.c0.b bVar2 = this.f17459d;
                    if (bVar2 == null) {
                        return !bVar.b() && bVar.f81471d == this.f17458c;
                    }
                    return j15 == bVar2.f81471d && bVar.f81469b == bVar2.f81469b && bVar.f81470c == bVar2.f81470c;
                }
            }
            return i15 == this.f17457b;
        }

        public boolean j(b.a aVar) {
            h8.c0.b bVar = aVar.f17296d;
            if (bVar == null) {
                return this.f17457b != aVar.f17295c;
            }
            long j15 = this.f17458c;
            if (j15 == -1) {
                return false;
            }
            if (bVar.f81471d > j15) {
                return true;
            }
            if (this.f17459d == null) {
                return false;
            }
            int iB = aVar.f17294b.b(bVar.f81468a);
            int iB2 = aVar.f17294b.b(this.f17459d.f81468a);
            h8.c0.b bVar2 = aVar.f17296d;
            if (bVar2.f81471d < this.f17459d.f81471d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            if (!bVar2.b()) {
                int i15 = aVar.f17296d.f81472e;
                return i15 == -1 || i15 > this.f17459d.f81469b;
            }
            h8.c0.b bVar3 = aVar.f17296d;
            int i16 = bVar3.f81469b;
            int i17 = bVar3.f81470c;
            h8.c0.b bVar4 = this.f17459d;
            int i18 = bVar4.f81469b;
            return i16 > i18 || (i16 == i18 && i17 > bVar4.f81470c);
        }

        public void k(int i15, h8.c0.b bVar) {
            if (this.f17458c != -1 || i15 != this.f17457b || bVar == null || bVar.f81471d < o1.this.n()) {
                return;
            }
            this.f17458c = bVar.f81471d;
        }

        public boolean m(t7.e0 e0Var, t7.e0 e0Var2) {
            int iL = l(e0Var, e0Var2, this.f17457b);
            this.f17457b = iL;
            if (iL == -1) {
                return false;
            }
            h8.c0.b bVar = this.f17459d;
            return bVar == null || e0Var2.b(bVar.f81468a) != -1;
        }
    }

    public o1() {
        this(f17446i);
    }

    private void l(a aVar) {
        if (aVar.f17458c != -1 && aVar.f17460e) {
            this.f17455h = aVar.f17458c;
        }
        this.f17454g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        f17447j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        a aVar = this.f17450c.get(this.f17454g);
        return (aVar == null || aVar.f17458c == -1) ? this.f17455h + 1 : aVar.f17458c;
    }

    private a o(int i15, h8.c0.b bVar) {
        a aVar = null;
        long j15 = Long.MAX_VALUE;
        for (a aVar2 : this.f17450c.values()) {
            aVar2.k(i15, bVar);
            if (aVar2.i(i15, bVar)) {
                long j16 = aVar2.f17458c;
                if (j16 == -1 || j16 < j15) {
                    aVar = aVar2;
                    j15 = j16;
                } else if (j16 == j15 && ((a) w7.o0.h(aVar)).f17459d != null && aVar2.f17459d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f17451d.get();
        a aVar3 = new a(str, i15, bVar);
        this.f17450c.put(str, aVar3);
        return aVar3;
    }

    private void p(b.a aVar) {
        if (aVar.f17294b.q()) {
            String str = this.f17454g;
            if (str != null) {
                l((a) zj.p.q(this.f17450c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = this.f17450c.get(this.f17454g);
        a aVarO = o(aVar.f17295c, aVar.f17296d);
        this.f17454g = aVarO.f17456a;
        e(aVar);
        h8.c0.b bVar = aVar.f17296d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f17458c == aVar.f17296d.f81471d && aVar2.f17459d != null && aVar2.f17459d.f81469b == aVar.f17296d.f81469b && aVar2.f17459d.f81470c == aVar.f17296d.f81470c) {
            return;
        }
        h8.c0.b bVar2 = aVar.f17296d;
        this.f17452e.Y(aVar, o(aVar.f17295c, new h8.c0.b(bVar2.f81468a, bVar2.f81471d)).f17456a, aVarO.f17456a);
    }

    @Override // b8.c2
    public synchronized String a() {
        return this.f17454g;
    }

    @Override // b8.c2
    public synchronized void b(b.a aVar, int i15) {
        try {
            zj.p.q(this.f17452e);
            boolean z15 = i15 == 0;
            Iterator<a> it = this.f17450c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.j(aVar)) {
                    it.remove();
                    boolean zEquals = next.f17456a.equals(this.f17454g);
                    if (zEquals) {
                        l(next);
                    }
                    if (next.f17460e) {
                        this.f17452e.I(aVar, next.f17456a, z15 && zEquals && next.f17461f);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // b8.c2
    public synchronized void c(b.a aVar) {
        try {
            zj.p.q(this.f17452e);
            t7.e0 e0Var = this.f17453f;
            this.f17453f = aVar.f17294b;
            Iterator<a> it = this.f17450c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (!next.m(e0Var, this.f17453f) || next.j(aVar)) {
                    it.remove();
                    if (next.f17456a.equals(this.f17454g)) {
                        l(next);
                    }
                    if (next.f17460e) {
                        this.f17452e.I(aVar, next.f17456a, false);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // b8.c2
    public void d(c2.a aVar) {
        this.f17452e = aVar;
    }

    @Override // b8.c2
    public synchronized void e(b.a aVar) {
        zj.p.q(this.f17452e);
        if (aVar.f17294b.q()) {
            return;
        }
        h8.c0.b bVar = aVar.f17296d;
        if (bVar != null) {
            long j15 = bVar.f81471d;
            if (j15 != -1 && j15 < n()) {
                return;
            }
            a aVar2 = this.f17450c.get(this.f17454g);
            if (aVar2 != null && aVar2.f17458c == -1 && aVar2.f17457b != aVar.f17295c) {
                return;
            }
        }
        a aVarO = o(aVar.f17295c, aVar.f17296d);
        if (this.f17454g == null) {
            this.f17454g = aVarO.f17456a;
        }
        h8.c0.b bVar2 = aVar.f17296d;
        if (bVar2 != null && bVar2.b()) {
            h8.c0.b bVar3 = aVar.f17296d;
            h8.c0.b bVar4 = new h8.c0.b(bVar3.f81468a, bVar3.f81471d, bVar3.f81469b);
            a aVarO2 = o(aVar.f17295c, bVar4);
            if (!aVarO2.f17460e) {
                aVarO2.f17460e = true;
                aVar.f17294b.h(aVar.f17296d.f81468a, this.f17449b);
                this.f17452e.b(new b.a(aVar.f17293a, aVar.f17294b, aVar.f17295c, bVar4, Math.max(0L, w7.o0.g1(this.f17449b.f(aVar.f17296d.f81469b)) + this.f17449b.n()), aVar.f17298f, aVar.f17299g, aVar.f17300h, aVar.f17301i, aVar.f17302j), aVarO2.f17456a);
            }
        }
        if (!aVarO.f17460e) {
            aVarO.f17460e = true;
            this.f17452e.b(aVar, aVarO.f17456a);
        }
        if (aVarO.f17456a.equals(this.f17454g) && !aVarO.f17461f) {
            aVarO.f17461f = true;
            this.f17452e.h0(aVar, aVarO.f17456a);
        }
    }

    @Override // b8.c2
    public synchronized void f(b.a aVar) {
        c2.a aVar2;
        try {
            String str = this.f17454g;
            if (str != null) {
                l((a) zj.p.q(this.f17450c.get(str)));
            }
            Iterator<a> it = this.f17450c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                it.remove();
                if (next.f17460e && (aVar2 = this.f17452e) != null) {
                    aVar2.I(aVar, next.f17456a, false);
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // b8.c2
    public synchronized String g(t7.e0 e0Var, h8.c0.b bVar) {
        return o(e0Var.h(bVar.f81468a, this.f17449b).f188138c, bVar).f17456a;
    }

    public o1(zj.w<String> wVar) {
        this.f17451d = wVar;
        this.f17448a = new t7.e0.c();
        this.f17449b = new t7.e0.b();
        this.f17450c = new HashMap<>();
        this.f17453f = t7.e0.f188127a;
        this.f17455h = -1L;
    }
}
