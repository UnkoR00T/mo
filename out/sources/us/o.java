package us;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends bt.i.d<o> implements bt.r {
    private static final o G;
    public static bt.s<o> H = new a();
    private List<us.b> A;
    private List<us.b> B;
    private List<us.b> C;
    private List<us.b> D;
    private byte E;
    private int F;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bt.d f200915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f200916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f200917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f200918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f200919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f200920h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f200921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<t> f200922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f200923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f200924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<r> f200925n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<Integer> f200926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f200927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<v> f200928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private v f200929s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f200930t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f200931v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<Integer> f200932w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List<d> f200933x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<us.b> f200934y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List<us.b> f200935z;

    static class a extends bt.b<o> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public o b(bt.e eVar, bt.g gVar) {
            return new o(eVar, gVar);
        }
    }

    public static final class b extends bt.i.c<o, b> implements bt.r {
        private List<us.b> A;
        private List<us.b> B;
        private List<us.b> C;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f200936d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f200939g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f200941j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<t> f200942k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private r f200943l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f200944m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List<r> f200945n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List<Integer> f200946p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List<v> f200947q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private v f200948r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f200949s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f200950t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private List<Integer> f200951v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private List<d> f200952w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private List<us.b> f200953x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private List<us.b> f200954y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private List<us.b> f200955z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f200937e = 518;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f200938f = 2054;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private r f200940h = r.e0();

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f200942k = list;
            this.f200943l = r.e0();
            this.f200945n = list;
            this.f200946p = list;
            this.f200947q = list;
            this.f200948r = v.V();
            this.f200951v = list;
            this.f200952w = list;
            this.f200953x = list;
            this.f200954y = list;
            this.f200955z = list;
            this.A = list;
            this.B = list;
            this.C = list;
            U();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b F() {
            return new b();
        }

        private void G() {
            if ((this.f200936d & PKIFailureInfo.notAuthorized) != 65536) {
                this.f200953x = new ArrayList(this.f200953x);
                this.f200936d |= PKIFailureInfo.notAuthorized;
            }
        }

        private void H() {
            if ((this.f200936d & PKIFailureInfo.badCertTemplate) != 1048576) {
                this.B = new ArrayList(this.B);
                this.f200936d |= PKIFailureInfo.badCertTemplate;
            }
        }

        private void I() {
            if ((this.f200936d & 32768) != 32768) {
                this.f200952w = new ArrayList(this.f200952w);
                this.f200936d |= 32768;
            }
        }

        private void J() {
            if ((this.f200936d & 1024) != 1024) {
                this.f200947q = new ArrayList(this.f200947q);
                this.f200936d |= 1024;
            }
        }

        private void K() {
            if ((this.f200936d & 512) != 512) {
                this.f200946p = new ArrayList(this.f200946p);
                this.f200936d |= 512;
            }
        }

        private void N() {
            if ((this.f200936d & 256) != 256) {
                this.f200945n = new ArrayList(this.f200945n);
                this.f200936d |= 256;
            }
        }

        private void O() {
            if ((this.f200936d & PKIFailureInfo.badSenderNonce) != 2097152) {
                this.C = new ArrayList(this.C);
                this.f200936d |= PKIFailureInfo.badSenderNonce;
            }
        }

        private void P() {
            if ((this.f200936d & PKIFailureInfo.signerNotTrusted) != 524288) {
                this.A = new ArrayList(this.A);
                this.f200936d |= PKIFailureInfo.signerNotTrusted;
            }
        }

        private void Q() {
            if ((this.f200936d & PKIFailureInfo.unsupportedVersion) != 131072) {
                this.f200954y = new ArrayList(this.f200954y);
                this.f200936d |= PKIFailureInfo.unsupportedVersion;
            }
        }

        private void R() {
            if ((this.f200936d & PKIFailureInfo.transactionIdInUse) != 262144) {
                this.f200955z = new ArrayList(this.f200955z);
                this.f200936d |= PKIFailureInfo.transactionIdInUse;
            }
        }

        private void S() {
            if ((this.f200936d & 32) != 32) {
                this.f200942k = new ArrayList(this.f200942k);
                this.f200936d |= 32;
            }
        }

        private void T() {
            if ((this.f200936d & 16384) != 16384) {
                this.f200951v = new ArrayList(this.f200951v);
                this.f200936d |= 16384;
            }
        }

        private void U() {
        }

        public o A() {
            o oVar = new o(this);
            int i15 = this.f200936d;
            int i16 = (i15 & 1) != 1 ? 0 : 1;
            oVar.f200917e = this.f200937e;
            if ((i15 & 2) == 2) {
                i16 |= 2;
            }
            oVar.f200918f = this.f200938f;
            if ((i15 & 4) == 4) {
                i16 |= 4;
            }
            oVar.f200919g = this.f200939g;
            if ((i15 & 8) == 8) {
                i16 |= 8;
            }
            oVar.f200920h = this.f200940h;
            if ((i15 & 16) == 16) {
                i16 |= 16;
            }
            oVar.f200921j = this.f200941j;
            if ((this.f200936d & 32) == 32) {
                this.f200942k = Collections.unmodifiableList(this.f200942k);
                this.f200936d &= -33;
            }
            oVar.f200922k = this.f200942k;
            if ((i15 & 64) == 64) {
                i16 |= 32;
            }
            oVar.f200923l = this.f200943l;
            if ((i15 & 128) == 128) {
                i16 |= 64;
            }
            oVar.f200924m = this.f200944m;
            if ((this.f200936d & 256) == 256) {
                this.f200945n = Collections.unmodifiableList(this.f200945n);
                this.f200936d &= -257;
            }
            oVar.f200925n = this.f200945n;
            if ((this.f200936d & 512) == 512) {
                this.f200946p = Collections.unmodifiableList(this.f200946p);
                this.f200936d &= -513;
            }
            oVar.f200926p = this.f200946p;
            if ((this.f200936d & 1024) == 1024) {
                this.f200947q = Collections.unmodifiableList(this.f200947q);
                this.f200936d &= -1025;
            }
            oVar.f200928r = this.f200947q;
            if ((i15 & 2048) == 2048) {
                i16 |= 128;
            }
            oVar.f200929s = this.f200948r;
            if ((i15 & PKIFailureInfo.certConfirmed) == 4096) {
                i16 |= 256;
            }
            oVar.f200930t = this.f200949s;
            if ((i15 & PKIFailureInfo.certRevoked) == 8192) {
                i16 |= 512;
            }
            oVar.f200931v = this.f200950t;
            if ((this.f200936d & 16384) == 16384) {
                this.f200951v = Collections.unmodifiableList(this.f200951v);
                this.f200936d &= -16385;
            }
            oVar.f200932w = this.f200951v;
            if ((this.f200936d & 32768) == 32768) {
                this.f200952w = Collections.unmodifiableList(this.f200952w);
                this.f200936d &= -32769;
            }
            oVar.f200933x = this.f200952w;
            if ((this.f200936d & PKIFailureInfo.notAuthorized) == 65536) {
                this.f200953x = Collections.unmodifiableList(this.f200953x);
                this.f200936d &= -65537;
            }
            oVar.f200934y = this.f200953x;
            if ((this.f200936d & PKIFailureInfo.unsupportedVersion) == 131072) {
                this.f200954y = Collections.unmodifiableList(this.f200954y);
                this.f200936d &= -131073;
            }
            oVar.f200935z = this.f200954y;
            if ((this.f200936d & PKIFailureInfo.transactionIdInUse) == 262144) {
                this.f200955z = Collections.unmodifiableList(this.f200955z);
                this.f200936d &= -262145;
            }
            oVar.A = this.f200955z;
            if ((this.f200936d & PKIFailureInfo.signerNotTrusted) == 524288) {
                this.A = Collections.unmodifiableList(this.A);
                this.f200936d &= -524289;
            }
            oVar.B = this.A;
            if ((this.f200936d & PKIFailureInfo.badCertTemplate) == 1048576) {
                this.B = Collections.unmodifiableList(this.B);
                this.f200936d &= -1048577;
            }
            oVar.C = this.B;
            if ((this.f200936d & PKIFailureInfo.badSenderNonce) == 2097152) {
                this.C = Collections.unmodifiableList(this.C);
                this.f200936d &= -2097153;
            }
            oVar.D = this.C;
            oVar.f200916d = i16;
            return oVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b o() {
            return F().q(A());
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            o oVar = null;
            try {
                try {
                    o oVarB = o.H.b(eVar, gVar);
                    if (oVarB != null) {
                        q(oVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    o oVar2 = (o) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        oVar = oVar2;
                        if (oVar != null) {
                            q(oVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (oVar != null) {
                    q(oVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public b q(o oVar) {
            if (oVar == o.G0()) {
                return this;
            }
            if (oVar.i1()) {
                d0(oVar.O0());
            }
            if (oVar.l1()) {
                g0(oVar.U0());
            }
            if (oVar.k1()) {
                f0(oVar.T0());
            }
            if (oVar.o1()) {
                a0(oVar.X0());
            }
            if (oVar.p1()) {
                i0(oVar.Y0());
            }
            if (!oVar.f200922k.isEmpty()) {
                if (this.f200942k.isEmpty()) {
                    this.f200942k = oVar.f200922k;
                    this.f200936d &= -33;
                } else {
                    S();
                    this.f200942k.addAll(oVar.f200922k);
                }
            }
            if (oVar.m1()) {
                Y(oVar.V0());
            }
            if (oVar.n1()) {
                h0(oVar.W0());
            }
            if (!oVar.f200925n.isEmpty()) {
                if (this.f200945n.isEmpty()) {
                    this.f200945n = oVar.f200925n;
                    this.f200936d &= -257;
                } else {
                    N();
                    this.f200945n.addAll(oVar.f200925n);
                }
            }
            if (!oVar.f200926p.isEmpty()) {
                if (this.f200946p.isEmpty()) {
                    this.f200946p = oVar.f200926p;
                    this.f200936d &= -513;
                } else {
                    K();
                    this.f200946p.addAll(oVar.f200926p);
                }
            }
            if (!oVar.f200928r.isEmpty()) {
                if (this.f200947q.isEmpty()) {
                    this.f200947q = oVar.f200928r;
                    this.f200936d &= -1025;
                } else {
                    J();
                    this.f200947q.addAll(oVar.f200928r);
                }
            }
            if (oVar.r1()) {
                c0(oVar.d1());
            }
            if (oVar.j1()) {
                e0(oVar.S0());
            }
            if (oVar.q1()) {
                j0(oVar.c1());
            }
            if (!oVar.f200932w.isEmpty()) {
                if (this.f200951v.isEmpty()) {
                    this.f200951v = oVar.f200932w;
                    this.f200936d &= -16385;
                } else {
                    T();
                    this.f200951v.addAll(oVar.f200932w);
                }
            }
            if (!oVar.f200933x.isEmpty()) {
                if (this.f200952w.isEmpty()) {
                    this.f200952w = oVar.f200933x;
                    this.f200936d &= -32769;
                } else {
                    I();
                    this.f200952w.addAll(oVar.f200933x);
                }
            }
            if (!oVar.f200934y.isEmpty()) {
                if (this.f200953x.isEmpty()) {
                    this.f200953x = oVar.f200934y;
                    this.f200936d &= -65537;
                } else {
                    G();
                    this.f200953x.addAll(oVar.f200934y);
                }
            }
            if (!oVar.f200935z.isEmpty()) {
                if (this.f200954y.isEmpty()) {
                    this.f200954y = oVar.f200935z;
                    this.f200936d &= -131073;
                } else {
                    Q();
                    this.f200954y.addAll(oVar.f200935z);
                }
            }
            if (!oVar.A.isEmpty()) {
                if (this.f200955z.isEmpty()) {
                    this.f200955z = oVar.A;
                    this.f200936d &= -262145;
                } else {
                    R();
                    this.f200955z.addAll(oVar.A);
                }
            }
            if (!oVar.B.isEmpty()) {
                if (this.A.isEmpty()) {
                    this.A = oVar.B;
                    this.f200936d &= -524289;
                } else {
                    P();
                    this.A.addAll(oVar.B);
                }
            }
            if (!oVar.C.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = oVar.C;
                    this.f200936d &= -1048577;
                } else {
                    H();
                    this.B.addAll(oVar.C);
                }
            }
            if (!oVar.D.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = oVar.D;
                    this.f200936d &= -2097153;
                } else {
                    O();
                    this.C.addAll(oVar.D);
                }
            }
            x(oVar);
            s(p().f(oVar.f200915c));
            return this;
        }

        public b Y(r rVar) {
            if ((this.f200936d & 64) != 64 || this.f200943l == r.e0()) {
                this.f200943l = rVar;
            } else {
                this.f200943l = r.F0(this.f200943l).q(rVar).A();
            }
            this.f200936d |= 64;
            return this;
        }

        public b a0(r rVar) {
            if ((this.f200936d & 8) != 8 || this.f200940h == r.e0()) {
                this.f200940h = rVar;
            } else {
                this.f200940h = r.F0(this.f200940h).q(rVar).A();
            }
            this.f200936d |= 8;
            return this;
        }

        public b c0(v vVar) {
            if ((this.f200936d & 2048) != 2048 || this.f200948r == v.V()) {
                this.f200948r = vVar;
            } else {
                this.f200948r = v.n0(this.f200948r).q(vVar).A();
            }
            this.f200936d |= 2048;
            return this;
        }

        public b d0(int i15) {
            this.f200936d |= 1;
            this.f200937e = i15;
            return this;
        }

        public b e0(int i15) {
            this.f200936d |= PKIFailureInfo.certConfirmed;
            this.f200949s = i15;
            return this;
        }

        public b f0(int i15) {
            this.f200936d |= 4;
            this.f200939g = i15;
            return this;
        }

        public b g0(int i15) {
            this.f200936d |= 2;
            this.f200938f = i15;
            return this;
        }

        public b h0(int i15) {
            this.f200936d |= 128;
            this.f200944m = i15;
            return this;
        }

        public b i0(int i15) {
            this.f200936d |= 16;
            this.f200941j = i15;
            return this;
        }

        public b j0(int i15) {
            this.f200936d |= PKIFailureInfo.certRevoked;
            this.f200950t = i15;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public o build() {
            o oVarA = A();
            if (oVarA.c()) {
                return oVarA;
            }
            throw bt.a.AbstractC0557a.n(oVarA);
        }
    }

    static {
        o oVar = new o(true);
        G = oVar;
        oVar.s1();
    }

    public static o G0() {
        return G;
    }

    private void s1() {
        this.f200917e = 518;
        this.f200918f = 2054;
        this.f200919g = 0;
        this.f200920h = r.e0();
        this.f200921j = 0;
        List list = Collections.EMPTY_LIST;
        this.f200922k = list;
        this.f200923l = r.e0();
        this.f200924m = 0;
        this.f200925n = list;
        this.f200926p = list;
        this.f200928r = list;
        this.f200929s = v.V();
        this.f200930t = 0;
        this.f200931v = 0;
        this.f200932w = list;
        this.f200933x = list;
        this.f200934y = list;
        this.f200935z = list;
        this.A = list;
        this.B = list;
        this.C = list;
        this.D = list;
    }

    public static b t1() {
        return b.F();
    }

    public static b u1(o oVar) {
        return t1().q(oVar);
    }

    public int A0() {
        return this.f200928r.size();
    }

    public List<v> B0() {
        return this.f200928r;
    }

    public r C0(int i15) {
        return this.f200925n.get(i15);
    }

    public int D0() {
        return this.f200925n.size();
    }

    public List<Integer> E0() {
        return this.f200926p;
    }

    public List<r> F0() {
        return this.f200925n;
    }

    @Override // bt.r
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public o i() {
        return G;
    }

    public us.b I0(int i15) {
        return this.D.get(i15);
    }

    public int J0() {
        return this.D.size();
    }

    public List<us.b> K0() {
        return this.D;
    }

    public us.b L0(int i15) {
        return this.B.get(i15);
    }

    public int M0() {
        return this.B.size();
    }

    public List<us.b> N0() {
        return this.B;
    }

    public int O0() {
        return this.f200917e;
    }

    public us.b P0(int i15) {
        return this.f200935z.get(i15);
    }

    public int Q0() {
        return this.f200935z.size();
    }

    public List<us.b> R0() {
        return this.f200935z;
    }

    public int S0() {
        return this.f200930t;
    }

    public int T0() {
        return this.f200919g;
    }

    public int U0() {
        return this.f200918f;
    }

    public r V0() {
        return this.f200923l;
    }

    public int W0() {
        return this.f200924m;
    }

    public r X0() {
        return this.f200920h;
    }

    public int Y0() {
        return this.f200921j;
    }

    public us.b Z0(int i15) {
        return this.A.get(i15);
    }

    public int a1() {
        return this.A.size();
    }

    public List<us.b> b1() {
        return this.A;
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.E;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        if (!k1()) {
            this.E = (byte) 0;
            return false;
        }
        if (o1() && !X0().c()) {
            this.E = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < f1(); i15++) {
            if (!e1(i15).c()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if (m1() && !V0().c()) {
            this.E = (byte) 0;
            return false;
        }
        for (int i16 = 0; i16 < D0(); i16++) {
            if (!C0(i16).c()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < A0(); i17++) {
            if (!z0(i17).c()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if (r1() && !d1().c()) {
            this.E = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < y0(); i18++) {
            if (!x0(i18).c()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < s0(); i19++) {
            if (!r0(i19).c()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i25 = 0; i25 < Q0(); i25++) {
            if (!P0(i25).c()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i26 = 0; i26 < a1(); i26++) {
            if (!Z0(i26).c()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i27 = 0; i27 < M0(); i27++) {
            if (!L0(i27).c()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i28 = 0; i28 < v0(); i28++) {
            if (!u0(i28).c()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i29 = 0; i29 < J0(); i29++) {
            if (!I0(i29).c()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if (u()) {
            this.E = (byte) 1;
            return true;
        }
        this.E = (byte) 0;
        return false;
    }

    public int c1() {
        return this.f200931v;
    }

    public v d1() {
        return this.f200929s;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.F;
        if (i15 != -1) {
            return i15;
        }
        int iO = (this.f200916d & 2) == 2 ? bt.f.o(1, this.f200918f) : 0;
        if ((this.f200916d & 4) == 4) {
            iO += bt.f.o(2, this.f200919g);
        }
        if ((this.f200916d & 8) == 8) {
            iO += bt.f.s(3, this.f200920h);
        }
        for (int i16 = 0; i16 < this.f200922k.size(); i16++) {
            iO += bt.f.s(4, this.f200922k.get(i16));
        }
        if ((this.f200916d & 32) == 32) {
            iO += bt.f.s(5, this.f200923l);
        }
        if ((this.f200916d & 128) == 128) {
            iO += bt.f.s(6, this.f200929s);
        }
        if ((this.f200916d & 256) == 256) {
            iO += bt.f.o(7, this.f200930t);
        }
        if ((this.f200916d & 512) == 512) {
            iO += bt.f.o(8, this.f200931v);
        }
        if ((this.f200916d & 16) == 16) {
            iO += bt.f.o(9, this.f200921j);
        }
        if ((this.f200916d & 64) == 64) {
            iO += bt.f.o(10, this.f200924m);
        }
        if ((this.f200916d & 1) == 1) {
            iO += bt.f.o(11, this.f200917e);
        }
        for (int i17 = 0; i17 < this.f200925n.size(); i17++) {
            iO += bt.f.s(12, this.f200925n.get(i17));
        }
        int iP = 0;
        for (int i18 = 0; i18 < this.f200926p.size(); i18++) {
            iP += bt.f.p(this.f200926p.get(i18).intValue());
        }
        int iS = iO + iP;
        if (!E0().isEmpty()) {
            iS = iS + 1 + bt.f.p(iP);
        }
        this.f200927q = iP;
        for (int i19 = 0; i19 < this.f200934y.size(); i19++) {
            iS += bt.f.s(14, this.f200934y.get(i19));
        }
        for (int i25 = 0; i25 < this.f200935z.size(); i25++) {
            iS += bt.f.s(15, this.f200935z.get(i25));
        }
        for (int i26 = 0; i26 < this.A.size(); i26++) {
            iS += bt.f.s(16, this.A.get(i26));
        }
        for (int i27 = 0; i27 < this.f200928r.size(); i27++) {
            iS += bt.f.s(17, this.f200928r.get(i27));
        }
        int iP2 = 0;
        for (int i28 = 0; i28 < this.f200932w.size(); i28++) {
            iP2 += bt.f.p(this.f200932w.get(i28).intValue());
        }
        int size = iS + iP2 + (h1().size() * 2);
        for (int i29 = 0; i29 < this.f200933x.size(); i29++) {
            size += bt.f.s(32, this.f200933x.get(i29));
        }
        for (int i35 = 0; i35 < this.B.size(); i35++) {
            size += bt.f.s(33, this.B.get(i35));
        }
        for (int i36 = 0; i36 < this.C.size(); i36++) {
            size += bt.f.s(34, this.C.get(i36));
        }
        for (int i37 = 0; i37 < this.D.size(); i37++) {
            size += bt.f.s(35, this.D.get(i37));
        }
        int iV = size + v() + this.f200915c.size();
        this.F = iV;
        return iV;
    }

    public t e1(int i15) {
        return this.f200922k.get(i15);
    }

    public int f1() {
        return this.f200922k.size();
    }

    public List<t> g1() {
        return this.f200922k;
    }

    public List<Integer> h1() {
        return this.f200932w;
    }

    public boolean i1() {
        return (this.f200916d & 1) == 1;
    }

    @Override // bt.i, bt.q
    public bt.s<o> j() {
        return H;
    }

    public boolean j1() {
        return (this.f200916d & 256) == 256;
    }

    public boolean k1() {
        return (this.f200916d & 4) == 4;
    }

    public boolean l1() {
        return (this.f200916d & 2) == 2;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        bt.i.d<MessageType>.a aVarC = C();
        if ((this.f200916d & 2) == 2) {
            fVar.a0(1, this.f200918f);
        }
        if ((this.f200916d & 4) == 4) {
            fVar.a0(2, this.f200919g);
        }
        if ((this.f200916d & 8) == 8) {
            fVar.d0(3, this.f200920h);
        }
        for (int i15 = 0; i15 < this.f200922k.size(); i15++) {
            fVar.d0(4, this.f200922k.get(i15));
        }
        if ((this.f200916d & 32) == 32) {
            fVar.d0(5, this.f200923l);
        }
        if ((this.f200916d & 128) == 128) {
            fVar.d0(6, this.f200929s);
        }
        if ((this.f200916d & 256) == 256) {
            fVar.a0(7, this.f200930t);
        }
        if ((this.f200916d & 512) == 512) {
            fVar.a0(8, this.f200931v);
        }
        if ((this.f200916d & 16) == 16) {
            fVar.a0(9, this.f200921j);
        }
        if ((this.f200916d & 64) == 64) {
            fVar.a0(10, this.f200924m);
        }
        if ((this.f200916d & 1) == 1) {
            fVar.a0(11, this.f200917e);
        }
        for (int i16 = 0; i16 < this.f200925n.size(); i16++) {
            fVar.d0(12, this.f200925n.get(i16));
        }
        if (E0().size() > 0) {
            fVar.o0(106);
            fVar.o0(this.f200927q);
        }
        for (int i17 = 0; i17 < this.f200926p.size(); i17++) {
            fVar.b0(this.f200926p.get(i17).intValue());
        }
        for (int i18 = 0; i18 < this.f200934y.size(); i18++) {
            fVar.d0(14, this.f200934y.get(i18));
        }
        for (int i19 = 0; i19 < this.f200935z.size(); i19++) {
            fVar.d0(15, this.f200935z.get(i19));
        }
        for (int i25 = 0; i25 < this.A.size(); i25++) {
            fVar.d0(16, this.A.get(i25));
        }
        for (int i26 = 0; i26 < this.f200928r.size(); i26++) {
            fVar.d0(17, this.f200928r.get(i26));
        }
        for (int i27 = 0; i27 < this.f200932w.size(); i27++) {
            fVar.a0(31, this.f200932w.get(i27).intValue());
        }
        for (int i28 = 0; i28 < this.f200933x.size(); i28++) {
            fVar.d0(32, this.f200933x.get(i28));
        }
        for (int i29 = 0; i29 < this.B.size(); i29++) {
            fVar.d0(33, this.B.get(i29));
        }
        for (int i35 = 0; i35 < this.C.size(); i35++) {
            fVar.d0(34, this.C.get(i35));
        }
        for (int i36 = 0; i36 < this.D.size(); i36++) {
            fVar.d0(35, this.D.get(i36));
        }
        aVarC.a(19000, fVar);
        fVar.i0(this.f200915c);
    }

    public boolean m1() {
        return (this.f200916d & 32) == 32;
    }

    public boolean n1() {
        return (this.f200916d & 64) == 64;
    }

    public boolean o1() {
        return (this.f200916d & 8) == 8;
    }

    public boolean p1() {
        return (this.f200916d & 16) == 16;
    }

    public boolean q1() {
        return (this.f200916d & 512) == 512;
    }

    public us.b r0(int i15) {
        return this.f200934y.get(i15);
    }

    public boolean r1() {
        return (this.f200916d & 128) == 128;
    }

    public int s0() {
        return this.f200934y.size();
    }

    public List<us.b> t0() {
        return this.f200934y;
    }

    public us.b u0(int i15) {
        return this.C.get(i15);
    }

    public int v0() {
        return this.C.size();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public b g() {
        return t1();
    }

    public List<us.b> w0() {
        return this.C;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public b b() {
        return u1(this);
    }

    public d x0(int i15) {
        return this.f200933x.get(i15);
    }

    public int y0() {
        return this.f200933x.size();
    }

    public v z0(int i15) {
        return this.f200928r.get(i15);
    }

    private o(bt.i.c<o, ?> cVar) {
        super(cVar);
        this.f200927q = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.f200915c = cVar.p();
    }

    private o(boolean z15) {
        this.f200927q = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.f200915c = bt.d.f21388a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:140:0x0387  */
    /* JADX WARN: Code duplicated, block: B:143:0x0395  */
    /* JADX WARN: Code duplicated, block: B:146:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:149:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:152:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:155:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:158:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:161:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:170:0x0407  */
    /* JADX WARN: Code duplicated, block: B:173:0x0415  */
    /* JADX WARN: Code duplicated, block: B:9:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    private o(bt.e eVar, bt.g gVar) throws Throwable {
        int i15;
        this.f200927q = -1;
        this.E = (byte) -1;
        this.F = -1;
        s1();
        bt.d.b bVarU = bt.d.u();
        boolean z15 = true;
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z16 = false;
        int i16 = 0;
        while (true) {
            int i17 = PKIFailureInfo.badCertTemplate;
            int i18 = PKIFailureInfo.badSenderNonce;
            boolean z17 = z15;
            if (!z16) {
                try {
                    int iK = eVar.K();
                    switch (iK) {
                        case 0:
                            z16 = z17;
                            z15 = z17;
                            break;
                        case 8:
                            this.f200916d |= 2;
                            this.f200918f = eVar.s();
                            z15 = z17;
                            break;
                        case 16:
                            this.f200916d |= 4;
                            this.f200919g = eVar.s();
                            z15 = z17;
                            break;
                        case 26:
                            r.c cVarH0 = (this.f200916d & 8) == 8 ? this.f200920h.b() : null;
                            r rVar = (r) eVar.u(r.f200992y, gVar);
                            this.f200920h = rVar;
                            if (cVarH0 != 0) {
                                cVarH0.q(rVar);
                                this.f200920h = cVarH0.A();
                            }
                            this.f200916d |= 8;
                            z15 = z17;
                            break;
                        case 34:
                            if ((i16 & 32) != 32) {
                                this.f200922k = new ArrayList();
                                i16 |= 32;
                            }
                            this.f200922k.add((t) eVar.u(t.f201074q, gVar));
                            z15 = z17;
                            break;
                        case EACTags.CURRENCY_CODE /* 42 */:
                            r.c cVarH1 = (this.f200916d & 32) == 32 ? this.f200923l.b() : null;
                            r rVar2 = (r) eVar.u(r.f200992y, gVar);
                            this.f200923l = rVar2;
                            if (cVarH1 != 0) {
                                cVarH1.q(rVar2);
                                this.f200923l = cVarH1.A();
                            }
                            this.f200916d |= 32;
                            z15 = z17;
                            break;
                        case 50:
                            v.b bVarP0 = (this.f200916d & 128) == 128 ? this.f200929s.b() : null;
                            v vVar = (v) eVar.u(v.f201111r, gVar);
                            this.f200929s = vVar;
                            if (bVarP0 != 0) {
                                bVarP0.q(vVar);
                                this.f200929s = bVarP0.A();
                            }
                            this.f200916d |= 128;
                            z15 = z17;
                            break;
                        case 56:
                            this.f200916d |= 256;
                            this.f200930t = eVar.s();
                            z15 = z17;
                            break;
                        case 64:
                            this.f200916d |= 512;
                            this.f200931v = eVar.s();
                            z15 = z17;
                            break;
                        case 72:
                            this.f200916d |= 16;
                            this.f200921j = eVar.s();
                            z15 = z17;
                            break;
                        case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                            this.f200916d |= 64;
                            this.f200924m = eVar.s();
                            z15 = z17;
                            break;
                        case 88:
                            this.f200916d |= 1;
                            this.f200917e = eVar.s();
                            z15 = z17;
                            break;
                        case 98:
                            if ((i16 & 256) != 256) {
                                this.f200925n = new ArrayList();
                                i16 |= 256;
                            }
                            this.f200925n.add((r) eVar.u(r.f200992y, gVar));
                            z15 = z17;
                            break;
                        case 104:
                            if ((i16 & 512) != 512) {
                                this.f200926p = new ArrayList();
                                i16 |= 512;
                            }
                            this.f200926p.add(Integer.valueOf(eVar.s()));
                            z15 = z17;
                            break;
                        case 106:
                            int iJ = eVar.j(eVar.A());
                            if ((i16 & 512) != 512 && eVar.e() > 0) {
                                this.f200926p = new ArrayList();
                                i16 |= 512;
                            }
                            while (eVar.e() > 0) {
                                this.f200926p.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(iJ);
                            z15 = z17;
                            break;
                        case 114:
                            if ((i16 & PKIFailureInfo.notAuthorized) != 65536) {
                                this.f200934y = new ArrayList();
                                i16 |= PKIFailureInfo.notAuthorized;
                            }
                            this.f200934y.add((us.b) eVar.u(us.b.f200603j, gVar));
                            z15 = z17;
                            break;
                        case 122:
                            if ((i16 & PKIFailureInfo.unsupportedVersion) != 131072) {
                                this.f200935z = new ArrayList();
                                i16 |= PKIFailureInfo.unsupportedVersion;
                            }
                            this.f200935z.add((us.b) eVar.u(us.b.f200603j, gVar));
                            z15 = z17;
                            break;
                        case 130:
                            if ((i16 & PKIFailureInfo.transactionIdInUse) != 262144) {
                                this.A = new ArrayList();
                                i16 |= PKIFailureInfo.transactionIdInUse;
                            }
                            this.A.add((us.b) eVar.u(us.b.f200603j, gVar));
                            z15 = z17;
                            break;
                        case 138:
                            if ((i16 & 1024) != 1024) {
                                this.f200928r = new ArrayList();
                                i16 |= 1024;
                            }
                            this.f200928r.add((v) eVar.u(v.f201111r, gVar));
                            z15 = z17;
                            break;
                        case 248:
                            if ((i16 & 16384) != 16384) {
                                this.f200932w = new ArrayList();
                                i16 |= 16384;
                            }
                            this.f200932w.add(Integer.valueOf(eVar.s()));
                            z15 = z17;
                            break;
                        case 250:
                            i18 = 2097152;
                            int iJ2 = eVar.j(eVar.A());
                            if ((i16 & 16384) != 16384 && eVar.e() > 0) {
                                this.f200932w = new ArrayList();
                                i16 |= 16384;
                            }
                            while (eVar.e() > 0) {
                                i15 = i17;
                                try {
                                    try {
                                        this.f200932w.add(Integer.valueOf(eVar.s()));
                                        i17 = i15;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if ((i16 & 32) == 32) {
                                            this.f200922k = Collections.unmodifiableList(this.f200922k);
                                        }
                                        if ((i16 & 256) == 256) {
                                            this.f200925n = Collections.unmodifiableList(this.f200925n);
                                        }
                                        if ((i16 & 512) == 512) {
                                            this.f200926p = Collections.unmodifiableList(this.f200926p);
                                        }
                                        if ((i16 & PKIFailureInfo.notAuthorized) == 65536) {
                                            this.f200934y = Collections.unmodifiableList(this.f200934y);
                                        }
                                        if ((i16 & PKIFailureInfo.unsupportedVersion) == 131072) {
                                            this.f200935z = Collections.unmodifiableList(this.f200935z);
                                        }
                                        if ((i16 & PKIFailureInfo.transactionIdInUse) == 262144) {
                                            this.A = Collections.unmodifiableList(this.A);
                                        }
                                        if ((i16 & 1024) == 1024) {
                                            this.f200928r = Collections.unmodifiableList(this.f200928r);
                                        }
                                        if ((i16 & 16384) == 16384) {
                                            this.f200932w = Collections.unmodifiableList(this.f200932w);
                                        }
                                        if ((i16 & 32768) == 32768) {
                                            this.f200933x = Collections.unmodifiableList(this.f200933x);
                                        }
                                        if ((i16 & PKIFailureInfo.signerNotTrusted) == 524288) {
                                            this.B = Collections.unmodifiableList(this.B);
                                        }
                                        if ((i16 & i15) == i15) {
                                            this.C = Collections.unmodifiableList(this.C);
                                        }
                                        if ((i16 & i18) == i18) {
                                            this.D = Collections.unmodifiableList(this.D);
                                        }
                                        try {
                                            fVarJ.I();
                                            break;
                                        } catch (IOException unused) {
                                        } finally {
                                            this.f200915c = bVarU.r();
                                        }
                                        n();
                                        throw th;
                                    }
                                } catch (bt.k e15) {
                                    e = e15;
                                    throw e.i(this);
                                } catch (IOException e16) {
                                    e = e16;
                                    throw new bt.k(e.getMessage()).i(this);
                                }
                            }
                            eVar.i(iJ2);
                            z15 = z17;
                            break;
                        case 258:
                            if ((i16 & 32768) != 32768) {
                                this.f200933x = new ArrayList();
                                i16 |= 32768;
                            }
                            this.f200933x.add((d) eVar.u(d.f200721j, gVar));
                            z15 = z17;
                            break;
                        case 266:
                            if ((i16 & PKIFailureInfo.signerNotTrusted) != 524288) {
                                this.B = new ArrayList();
                                i16 |= PKIFailureInfo.signerNotTrusted;
                            }
                            this.B.add((us.b) eVar.u(us.b.f200603j, gVar));
                            z15 = z17;
                            break;
                        case 274:
                            if ((i16 & PKIFailureInfo.badCertTemplate) != 1048576) {
                                this.C = new ArrayList();
                                i16 |= PKIFailureInfo.badCertTemplate;
                            }
                            this.C.add((us.b) eVar.u(us.b.f200603j, gVar));
                            z15 = z17;
                            break;
                        case 282:
                            if ((i16 & PKIFailureInfo.badSenderNonce) != 2097152) {
                                this.D = new ArrayList();
                                i16 |= PKIFailureInfo.badSenderNonce;
                            }
                            try {
                                try {
                                    this.D.add((us.b) eVar.u(us.b.f200603j, gVar));
                                    z15 = z17;
                                } catch (bt.k e17) {
                                    e = e17;
                                    throw e.i(this);
                                } catch (IOException e18) {
                                    e = e18;
                                    throw new bt.k(e.getMessage()).i(this);
                                } catch (Throwable th5) {
                                    th = th5;
                                    i15 = 1048576;
                                    if ((i16 & 32) == 32) {
                                        this.f200922k = Collections.unmodifiableList(this.f200922k);
                                    }
                                    if ((i16 & 256) == 256) {
                                        this.f200925n = Collections.unmodifiableList(this.f200925n);
                                    }
                                    if ((i16 & 512) == 512) {
                                        this.f200926p = Collections.unmodifiableList(this.f200926p);
                                    }
                                    if ((i16 & PKIFailureInfo.notAuthorized) == 65536) {
                                        this.f200934y = Collections.unmodifiableList(this.f200934y);
                                    }
                                    if ((i16 & PKIFailureInfo.unsupportedVersion) == 131072) {
                                        this.f200935z = Collections.unmodifiableList(this.f200935z);
                                    }
                                    if ((i16 & PKIFailureInfo.transactionIdInUse) == 262144) {
                                        this.A = Collections.unmodifiableList(this.A);
                                    }
                                    if ((i16 & 1024) == 1024) {
                                        this.f200928r = Collections.unmodifiableList(this.f200928r);
                                    }
                                    if ((i16 & 16384) == 16384) {
                                        this.f200932w = Collections.unmodifiableList(this.f200932w);
                                    }
                                    if ((i16 & 32768) == 32768) {
                                        this.f200933x = Collections.unmodifiableList(this.f200933x);
                                    }
                                    if ((i16 & PKIFailureInfo.signerNotTrusted) == 524288) {
                                        this.B = Collections.unmodifiableList(this.B);
                                    }
                                    if ((i16 & i15) == i15) {
                                        this.C = Collections.unmodifiableList(this.C);
                                    }
                                    if ((i16 & i18) == i18) {
                                        this.D = Collections.unmodifiableList(this.D);
                                    }
                                    fVarJ.I();
                                    n();
                                    throw th;
                                }
                            } catch (bt.k e19) {
                                e = e19;
                            } catch (IOException e25) {
                                e = e25;
                            } catch (Throwable th6) {
                                th = th6;
                            }
                            break;
                        default:
                            if (!r(eVar, fVarJ, gVar, iK)) {
                                z16 = z17;
                            }
                            z15 = z17;
                            break;
                    }
                } catch (bt.k e26) {
                    e = e26;
                } catch (IOException e27) {
                    e = e27;
                } catch (Throwable th7) {
                    th = th7;
                    i15 = 1048576;
                    i18 = 2097152;
                }
            } else {
                if ((i16 & 32) == 32) {
                    this.f200922k = Collections.unmodifiableList(this.f200922k);
                }
                if ((i16 & 256) == 256) {
                    this.f200925n = Collections.unmodifiableList(this.f200925n);
                }
                if ((i16 & 512) == 512) {
                    this.f200926p = Collections.unmodifiableList(this.f200926p);
                }
                if ((i16 & PKIFailureInfo.notAuthorized) == 65536) {
                    this.f200934y = Collections.unmodifiableList(this.f200934y);
                }
                if ((i16 & PKIFailureInfo.unsupportedVersion) == 131072) {
                    this.f200935z = Collections.unmodifiableList(this.f200935z);
                }
                if ((i16 & PKIFailureInfo.transactionIdInUse) == 262144) {
                    this.A = Collections.unmodifiableList(this.A);
                }
                if ((i16 & 1024) == 1024) {
                    this.f200928r = Collections.unmodifiableList(this.f200928r);
                }
                if ((i16 & 16384) == 16384) {
                    this.f200932w = Collections.unmodifiableList(this.f200932w);
                }
                if ((i16 & 32768) == 32768) {
                    this.f200933x = Collections.unmodifiableList(this.f200933x);
                }
                if ((i16 & PKIFailureInfo.signerNotTrusted) == 524288) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                if ((i16 & PKIFailureInfo.badCertTemplate) == 1048576) {
                    this.C = Collections.unmodifiableList(this.C);
                }
                if ((i16 & PKIFailureInfo.badSenderNonce) == 2097152) {
                    this.D = Collections.unmodifiableList(this.D);
                }
                try {
                    fVarJ.I();
                } catch (IOException unused2) {
                } finally {
                    this.f200915c = bVarU.r();
                }
                n();
                return;
            }
        }
    }
}
