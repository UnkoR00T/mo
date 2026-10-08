package v9;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements o8.p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Deprecated
    public static final o8.u f205023v = new o8.u() { // from class: v9.j0
        @Override // o8.u
        public final o8.p[] f() {
            return k0.h();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f205024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f205025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f205026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<w7.k0> f205027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w7.c0 f205028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseIntArray f205029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l0.c f205030g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l9.s.a f205031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray<l0> f205032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f205033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SparseBooleanArray f205034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final i0 f205035l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private h0 f205036m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o8.r f205037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f205038o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f205039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f205040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f205041r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private l0 f205042s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f205043t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f205044u;

    private class a implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w7.b0 f205045a = new w7.b0(new byte[4]);

        public a() {
        }

        @Override // v9.d0
        public void a(w7.k0 k0Var, o8.r rVar, l0.d dVar) {
        }

        @Override // v9.d0
        public void b(w7.c0 c0Var) {
            if (c0Var.Q() == 0 && (c0Var.Q() & 128) != 0) {
                c0Var.g0(6);
                int iA = c0Var.a() / 4;
                for (int i15 = 0; i15 < iA; i15++) {
                    c0Var.t(this.f205045a, 4);
                    int iH = this.f205045a.h(16);
                    this.f205045a.r(3);
                    if (iH == 0) {
                        this.f205045a.r(13);
                    } else {
                        int iH2 = this.f205045a.h(13);
                        if (k0.this.f205032i.get(iH2) == null) {
                            k0.this.f205032i.put(iH2, new e0(k0.this.new b(iH2)));
                            k0.n(k0.this);
                        }
                    }
                }
                if (k0.this.f205024a != 2) {
                    k0.this.f205032i.remove(0);
                }
            }
        }
    }

    private class b implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w7.b0 f205047a = new w7.b0(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<l0> f205048b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseIntArray f205049c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f205050d;

        public b(int i15) {
            this.f205050d = i15;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004a  */
        /* JADX WARN: Code duplicated, block: B:24:0x005c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0063  */
        private l0.b c(w7.c0 c0Var, int i15) {
            int i16;
            int iG = c0Var.g();
            int i17 = iG + i15;
            int i18 = -1;
            String str = null;
            ArrayList arrayList = null;
            int iQ = 0;
            while (c0Var.g() < i17) {
                int iQ2 = c0Var.Q();
                int iG2 = c0Var.g() + c0Var.Q();
                if (iG2 > i17) {
                    break;
                }
                if (iQ2 == 5) {
                    long jS = c0Var.S();
                    if (jS == 1094921523) {
                        i18 = 129;
                    } else if (jS == 1161904947) {
                        i18 = 135;
                    } else if (jS == 1094921524) {
                        i18 = 172;
                    } else if (jS == 1212503619) {
                        i18 = 36;
                    }
                } else if (iQ2 == 106) {
                    i18 = 129;
                } else if (iQ2 == 122) {
                    i18 = 135;
                } else if (iQ2 == 127) {
                    int iQ3 = c0Var.Q();
                    if (iQ3 == 21) {
                        i18 = 172;
                    } else if (iQ3 == 14) {
                        i18 = 136;
                    } else if (iQ3 == 33) {
                        i18 = 139;
                    }
                } else {
                    if (iQ2 == 123) {
                        i16 = 138;
                    } else if (iQ2 == 10) {
                        String strTrim = c0Var.N(3).trim();
                        iQ = c0Var.Q();
                        str = strTrim;
                    } else if (iQ2 == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (c0Var.g() < iG2) {
                            String strTrim2 = c0Var.N(3).trim();
                            int iQ4 = c0Var.Q();
                            byte[] bArr = new byte[4];
                            c0Var.u(bArr, 0, 4);
                            arrayList2.add(new l0.a(strTrim2, iQ4, bArr));
                        }
                        arrayList = arrayList2;
                        i18 = 89;
                    } else if (iQ2 == 111) {
                        i16 = 257;
                    }
                    i18 = i16;
                }
                c0Var.g0(iG2 - c0Var.g());
            }
            c0Var.f0(i17);
            return new l0.b(i18, str, iQ, arrayList, Arrays.copyOfRange(c0Var.f(), iG, i17));
        }

        @Override // v9.d0
        public void a(w7.k0 k0Var, o8.r rVar, l0.d dVar) {
        }

        @Override // v9.d0
        public void b(w7.c0 c0Var) {
            w7.k0 k0Var;
            if (c0Var.Q() != 2) {
                return;
            }
            if (k0.this.f205024a == 1 || k0.this.f205024a == 2 || k0.this.f205038o == 1) {
                k0Var = (w7.k0) k0.this.f205027d.get(0);
            } else {
                k0Var = new w7.k0(((w7.k0) k0.this.f205027d.get(0)).d());
                k0.this.f205027d.add(k0Var);
            }
            if ((c0Var.Q() & 128) == 0) {
                return;
            }
            c0Var.g0(1);
            int iY = c0Var.Y();
            int i15 = 3;
            c0Var.g0(3);
            c0Var.t(this.f205047a, 2);
            this.f205047a.r(3);
            int i16 = 13;
            k0.this.f205044u = this.f205047a.h(13);
            c0Var.t(this.f205047a, 2);
            int i17 = 4;
            this.f205047a.r(4);
            c0Var.g0(this.f205047a.h(12));
            if (k0.this.f205024a == 2 && k0.this.f205042s == null) {
                l0.b bVar = new l0.b(21, null, 0, null, w7.o0.f210729f);
                k0 k0Var2 = k0.this;
                k0Var2.f205042s = k0Var2.f205030g.b(21, bVar);
                if (k0.this.f205042s != null) {
                    k0.this.f205042s.a(k0Var, k0.this.f205037n, new l0.d(iY, 21, PKIFailureInfo.certRevoked));
                }
            }
            this.f205048b.clear();
            this.f205049c.clear();
            int iA = c0Var.a();
            while (iA > 0) {
                c0Var.t(this.f205047a, 5);
                int iH = this.f205047a.h(8);
                this.f205047a.r(i15);
                int iH2 = this.f205047a.h(i16);
                this.f205047a.r(i17);
                int iH3 = this.f205047a.h(12);
                l0.b bVarC = c(c0Var, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarC.f205062a;
                }
                iA -= iH3 + 5;
                int i18 = k0.this.f205024a == 2 ? iH : iH2;
                if (!k0.this.f205033j.get(i18)) {
                    l0 l0VarB = (k0.this.f205024a == 2 && iH == 21) ? k0.this.f205042s : k0.this.f205030g.b(iH, bVarC);
                    if (k0.this.f205024a != 2 || iH2 < this.f205049c.get(i18, PKIFailureInfo.certRevoked)) {
                        this.f205049c.put(i18, iH2);
                        this.f205048b.put(i18, l0VarB);
                    }
                }
                i15 = 3;
                i17 = 4;
                i16 = 13;
            }
            int size = this.f205049c.size();
            for (int i19 = 0; i19 < size; i19++) {
                int iKeyAt = this.f205049c.keyAt(i19);
                int iValueAt = this.f205049c.valueAt(i19);
                k0.this.f205033j.put(iKeyAt, true);
                k0.this.f205034k.put(iValueAt, true);
                l0 l0VarValueAt = this.f205048b.valueAt(i19);
                if (l0VarValueAt != null) {
                    if (l0VarValueAt != k0.this.f205042s) {
                        l0VarValueAt.a(k0Var, k0.this.f205037n, new l0.d(iY, iKeyAt, PKIFailureInfo.certRevoked));
                    }
                    k0.this.f205032i.put(iValueAt, l0VarValueAt);
                }
            }
            if (k0.this.f205024a == 2) {
                if (k0.this.f205039p) {
                    return;
                }
                k0.this.f205037n.s();
                k0.this.f205038o = 0;
                k0.this.f205039p = true;
                return;
            }
            k0.this.f205032i.remove(this.f205050d);
            k0 k0Var3 = k0.this;
            k0Var3.f205038o = k0Var3.f205024a == 1 ? 0 : k0.this.f205038o - 1;
            if (k0.this.f205038o == 0) {
                k0.this.f205037n.s();
                k0.this.f205039p = true;
            }
        }
    }

    public k0(int i15, l9.s.a aVar) {
        this(1, i15, aVar, new w7.k0(0L), new j(0), 112800);
    }

    private void A() {
        this.f205033j.clear();
        this.f205032i.clear();
        SparseArray<l0> sparseArrayA = this.f205030g.a();
        int size = sparseArrayA.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f205032i.put(sparseArrayA.keyAt(i15), sparseArrayA.valueAt(i15));
        }
        this.f205032i.put(0, new e0(new a()));
        this.f205042s = null;
    }

    private boolean B(int i15) {
        return this.f205024a == 2 || this.f205039p || !this.f205034k.get(i15, false);
    }

    public static /* synthetic */ o8.p[] h() {
        return new o8.p[]{new k0(1, l9.s.a.f117245a)};
    }

    static /* synthetic */ int n(k0 k0Var) {
        int i15 = k0Var.f205038o;
        k0Var.f205038o = i15 + 1;
        return i15;
    }

    private boolean x(o8.q qVar) {
        byte[] bArrF = this.f205028e.f();
        if (9400 - this.f205028e.g() < 188) {
            int iA = this.f205028e.a();
            if (iA > 0) {
                System.arraycopy(bArrF, this.f205028e.g(), bArrF, 0, iA);
            }
            this.f205028e.d0(bArrF, iA);
        }
        while (this.f205028e.a() < 188) {
            int iJ = this.f205028e.j();
            int i15 = qVar.read(bArrF, iJ, 9400 - iJ);
            if (i15 == -1) {
                return false;
            }
            this.f205028e.e0(iJ + i15);
        }
        return true;
    }

    private int y() throws t7.x {
        int iG = this.f205028e.g();
        int iJ = this.f205028e.j();
        int iA = m0.a(this.f205028e.f(), iG, iJ);
        this.f205028e.f0(iA);
        int i15 = iA + 188;
        if (i15 <= iJ) {
            this.f205043t = 0;
            return i15;
        }
        int i16 = this.f205043t + (iA - iG);
        this.f205043t = i16;
        if (this.f205024a != 2 || i16 <= 376) {
            return i15;
        }
        throw t7.x.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void z(long j15) {
        if (this.f205040q) {
            return;
        }
        this.f205040q = true;
        if (this.f205035l.b() == -9223372036854775807L) {
            this.f205037n.f(new o8.l0.b(this.f205035l.b()));
            return;
        }
        h0 h0Var = new h0(this.f205035l.c(), this.f205035l.b(), j15, this.f205044u, this.f205026c);
        this.f205036m = h0Var;
        this.f205037n.f(h0Var.b());
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        h0 h0Var;
        zj.p.w(this.f205024a != 2);
        int size = this.f205027d.size();
        for (int i15 = 0; i15 < size; i15++) {
            w7.k0 k0Var = this.f205027d.get(i15);
            boolean z15 = k0Var.f() == -9223372036854775807L;
            if (!z15) {
                long jD = k0Var.d();
                z15 = (jD == -9223372036854775807L || jD == 0 || jD == j16) ? false : true;
            }
            if (z15) {
                k0Var.i(j16);
            }
        }
        if (j16 != 0 && (h0Var = this.f205036m) != null) {
            h0Var.h(j16);
        }
        this.f205028e.b0(0);
        this.f205029f.clear();
        for (int i16 = 0; i16 < this.f205032i.size(); i16++) {
            this.f205032i.valueAt(i16).c();
        }
        this.f205043t = 0;
    }

    @Override // o8.p
    public void b() {
    }

    @Override // o8.p
    public boolean c(o8.q qVar) {
        byte[] bArrF = this.f205028e.f();
        qVar.p(bArrF, 0, 940);
        for (int i15 = 0; i15 < 188; i15++) {
            int i16 = 0;
            while (true) {
                if (i16 >= 5) {
                    qVar.n(i15);
                    return true;
                }
                if (bArrF[(i16 * 188) + i15] != 71) {
                    break;
                }
                i16++;
            }
        }
        return false;
    }

    @Override // o8.p
    public void d(o8.r rVar) {
        if ((this.f205025b & 1) == 0) {
            rVar = new l9.t(rVar, this.f205031h);
        }
        this.f205037n = rVar;
    }

    @Override // o8.p
    public int g(o8.q qVar, o8.k0 k0Var) throws t7.x {
        int i15;
        long jA = qVar.a();
        boolean z15 = this.f205024a == 2;
        if (this.f205039p) {
            if (jA != -1 && !z15 && !this.f205035l.d()) {
                return this.f205035l.e(qVar, k0Var, this.f205044u);
            }
            z(jA);
            if (this.f205041r) {
                this.f205041r = false;
                a(0L, 0L);
                if (qVar.getPosition() != 0) {
                    k0Var.f143128a = 0L;
                    return 1;
                }
            }
            h0 h0Var = this.f205036m;
            if (h0Var != null && h0Var.d()) {
                return this.f205036m.c(qVar, k0Var);
            }
        }
        if (!x(qVar)) {
            for (int i16 = 0; i16 < this.f205032i.size(); i16++) {
                l0 l0VarValueAt = this.f205032i.valueAt(i16);
                if (l0VarValueAt instanceof y) {
                    y yVar = (y) l0VarValueAt;
                    if (yVar.d(z15)) {
                        yVar.b(new w7.c0(), 1);
                    }
                }
            }
            return -1;
        }
        int iY = y();
        int iJ = this.f205028e.j();
        if (iY > iJ) {
            return 0;
        }
        int iZ = this.f205028e.z();
        if ((8388608 & iZ) != 0) {
            this.f205028e.f0(iY);
            return 0;
        }
        int i17 = (4194304 & iZ) != 0 ? 1 : 0;
        int i18 = (2096896 & iZ) >> 8;
        boolean z16 = (iZ & 32) != 0;
        l0 l0Var = (iZ & 16) != 0 ? this.f205032i.get(i18) : null;
        if (l0Var == null) {
            this.f205028e.f0(iY);
            return 0;
        }
        if (this.f205024a != 2) {
            int i19 = iZ & 15;
            i15 = 0;
            int i25 = this.f205029f.get(i18, i19 - 1);
            this.f205029f.put(i18, i19);
            if (i25 == i19) {
                this.f205028e.f0(iY);
                return 0;
            }
            if (i19 != ((i25 + 1) & 15)) {
                l0Var.c();
            }
        } else {
            i15 = 0;
        }
        if (z16) {
            int iQ = this.f205028e.Q();
            i17 |= (this.f205028e.Q() & 64) != 0 ? 2 : i15;
            this.f205028e.g0(iQ - 1);
        }
        boolean z17 = this.f205039p;
        if (B(i18)) {
            this.f205028e.e0(iY);
            l0Var.b(this.f205028e, i17);
            this.f205028e.e0(iJ);
        }
        if (this.f205024a != 2 && !z17 && this.f205039p && jA != -1) {
            this.f205041r = true;
        }
        this.f205028e.f0(iY);
        return i15;
    }

    public k0(int i15, int i16, l9.s.a aVar, w7.k0 k0Var, l0.c cVar, int i17) {
        this.f205030g = (l0.c) zj.p.q(cVar);
        this.f205026c = i17;
        this.f205024a = i15;
        this.f205025b = i16;
        this.f205031h = aVar;
        if (i15 == 1 || i15 == 2) {
            this.f205027d = Collections.singletonList(k0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f205027d = arrayList;
            arrayList.add(k0Var);
        }
        this.f205028e = new w7.c0(new byte[9400], 0);
        this.f205033j = new SparseBooleanArray();
        this.f205034k = new SparseBooleanArray();
        this.f205032i = new SparseArray<>();
        this.f205029f = new SparseIntArray();
        this.f205035l = new i0(i17);
        this.f205037n = o8.r.f143186j0;
        this.f205044u = -1;
        A();
    }
}
