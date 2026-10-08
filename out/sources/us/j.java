package us;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends bt.i.d<j> implements bt.r {
    private static final j C;
    public static bt.s<j> D = new a();
    private byte A;
    private int B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bt.d f200829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f200830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f200831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f200832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f200833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f200834h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f200835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<t> f200836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f200837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f200838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<r> f200839n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<Integer> f200840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f200841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<v> f200842r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List<v> f200843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private u f200844t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<Integer> f200845v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private f f200846w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List<d> f200847x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<us.b> f200848y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List<us.b> f200849z;

    static class a extends bt.b<j> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public j b(bt.e eVar, bt.g gVar) {
            return new j(eVar, gVar);
        }
    }

    public static final class b extends bt.i.c<j, b> implements bt.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f200850d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f200853g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f200855j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<t> f200856k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private r f200857l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f200858m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List<r> f200859n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List<Integer> f200860p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List<v> f200861q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List<v> f200862r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private u f200863s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List<Integer> f200864t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private f f200865v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private List<d> f200866w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private List<us.b> f200867x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private List<us.b> f200868y;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f200851e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f200852f = 6;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private r f200854h = r.e0();

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f200856k = list;
            this.f200857l = r.e0();
            this.f200859n = list;
            this.f200860p = list;
            this.f200861q = list;
            this.f200862r = list;
            this.f200863s = u.A();
            this.f200864t = list;
            this.f200865v = f.w();
            this.f200866w = list;
            this.f200867x = list;
            this.f200868y = list;
            R();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b F() {
            return new b();
        }

        private void G() {
            if ((this.f200850d & PKIFailureInfo.notAuthorized) != 65536) {
                this.f200867x = new ArrayList(this.f200867x);
                this.f200850d |= PKIFailureInfo.notAuthorized;
            }
        }

        private void H() {
            if ((this.f200850d & 32768) != 32768) {
                this.f200866w = new ArrayList(this.f200866w);
                this.f200850d |= 32768;
            }
        }

        private void I() {
            if ((this.f200850d & 1024) != 1024) {
                this.f200861q = new ArrayList(this.f200861q);
                this.f200850d |= 1024;
            }
        }

        private void J() {
            if ((this.f200850d & 512) != 512) {
                this.f200860p = new ArrayList(this.f200860p);
                this.f200850d |= 512;
            }
        }

        private void K() {
            if ((this.f200850d & 256) != 256) {
                this.f200859n = new ArrayList(this.f200859n);
                this.f200850d |= 256;
            }
        }

        private void N() {
            if ((this.f200850d & PKIFailureInfo.unsupportedVersion) != 131072) {
                this.f200868y = new ArrayList(this.f200868y);
                this.f200850d |= PKIFailureInfo.unsupportedVersion;
            }
        }

        private void O() {
            if ((this.f200850d & 32) != 32) {
                this.f200856k = new ArrayList(this.f200856k);
                this.f200850d |= 32;
            }
        }

        private void P() {
            if ((this.f200850d & 2048) != 2048) {
                this.f200862r = new ArrayList(this.f200862r);
                this.f200850d |= 2048;
            }
        }

        private void Q() {
            if ((this.f200850d & PKIFailureInfo.certRevoked) != 8192) {
                this.f200864t = new ArrayList(this.f200864t);
                this.f200850d |= PKIFailureInfo.certRevoked;
            }
        }

        private void R() {
        }

        public j A() {
            j jVar = new j(this);
            int i15 = this.f200850d;
            int i16 = (i15 & 1) != 1 ? 0 : 1;
            jVar.f200831e = this.f200851e;
            if ((i15 & 2) == 2) {
                i16 |= 2;
            }
            jVar.f200832f = this.f200852f;
            if ((i15 & 4) == 4) {
                i16 |= 4;
            }
            jVar.f200833g = this.f200853g;
            if ((i15 & 8) == 8) {
                i16 |= 8;
            }
            jVar.f200834h = this.f200854h;
            if ((i15 & 16) == 16) {
                i16 |= 16;
            }
            jVar.f200835j = this.f200855j;
            if ((this.f200850d & 32) == 32) {
                this.f200856k = Collections.unmodifiableList(this.f200856k);
                this.f200850d &= -33;
            }
            jVar.f200836k = this.f200856k;
            if ((i15 & 64) == 64) {
                i16 |= 32;
            }
            jVar.f200837l = this.f200857l;
            if ((i15 & 128) == 128) {
                i16 |= 64;
            }
            jVar.f200838m = this.f200858m;
            if ((this.f200850d & 256) == 256) {
                this.f200859n = Collections.unmodifiableList(this.f200859n);
                this.f200850d &= -257;
            }
            jVar.f200839n = this.f200859n;
            if ((this.f200850d & 512) == 512) {
                this.f200860p = Collections.unmodifiableList(this.f200860p);
                this.f200850d &= -513;
            }
            jVar.f200840p = this.f200860p;
            if ((this.f200850d & 1024) == 1024) {
                this.f200861q = Collections.unmodifiableList(this.f200861q);
                this.f200850d &= -1025;
            }
            jVar.f200842r = this.f200861q;
            if ((this.f200850d & 2048) == 2048) {
                this.f200862r = Collections.unmodifiableList(this.f200862r);
                this.f200850d &= -2049;
            }
            jVar.f200843s = this.f200862r;
            if ((i15 & PKIFailureInfo.certConfirmed) == 4096) {
                i16 |= 128;
            }
            jVar.f200844t = this.f200863s;
            if ((this.f200850d & PKIFailureInfo.certRevoked) == 8192) {
                this.f200864t = Collections.unmodifiableList(this.f200864t);
                this.f200850d &= -8193;
            }
            jVar.f200845v = this.f200864t;
            if ((i15 & 16384) == 16384) {
                i16 |= 256;
            }
            jVar.f200846w = this.f200865v;
            if ((this.f200850d & 32768) == 32768) {
                this.f200866w = Collections.unmodifiableList(this.f200866w);
                this.f200850d &= -32769;
            }
            jVar.f200847x = this.f200866w;
            if ((this.f200850d & PKIFailureInfo.notAuthorized) == 65536) {
                this.f200867x = Collections.unmodifiableList(this.f200867x);
                this.f200850d &= -65537;
            }
            jVar.f200848y = this.f200867x;
            if ((this.f200850d & PKIFailureInfo.unsupportedVersion) == 131072) {
                this.f200868y = Collections.unmodifiableList(this.f200868y);
                this.f200850d &= -131073;
            }
            jVar.f200849z = this.f200868y;
            jVar.f200830d = i16;
            return jVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b o() {
            return F().q(A());
        }

        public b S(f fVar) {
            if ((this.f200850d & 16384) != 16384 || this.f200865v == f.w()) {
                this.f200865v = fVar;
            } else {
                this.f200865v = f.E(this.f200865v).q(fVar).w();
            }
            this.f200850d |= 16384;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            j jVar = null;
            try {
                try {
                    j jVarB = j.D.b(eVar, gVar);
                    if (jVarB != null) {
                        q(jVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    j jVar2 = (j) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        jVar = jVar2;
                        if (jVar != null) {
                            q(jVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (jVar != null) {
                    q(jVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public b q(j jVar) {
            if (jVar == j.x0()) {
                return this;
            }
            if (jVar.S0()) {
                a0(jVar.C0());
            }
            if (jVar.U0()) {
                d0(jVar.E0());
            }
            if (jVar.T0()) {
                c0(jVar.D0());
            }
            if (jVar.X0()) {
                X(jVar.H0());
            }
            if (jVar.Y0()) {
                f0(jVar.I0());
            }
            if (!jVar.f200836k.isEmpty()) {
                if (this.f200856k.isEmpty()) {
                    this.f200856k = jVar.f200836k;
                    this.f200850d &= -33;
                } else {
                    O();
                    this.f200856k.addAll(jVar.f200836k);
                }
            }
            if (jVar.V0()) {
                W(jVar.F0());
            }
            if (jVar.W0()) {
                e0(jVar.G0());
            }
            if (!jVar.f200839n.isEmpty()) {
                if (this.f200859n.isEmpty()) {
                    this.f200859n = jVar.f200839n;
                    this.f200850d &= -257;
                } else {
                    K();
                    this.f200859n.addAll(jVar.f200839n);
                }
            }
            if (!jVar.f200840p.isEmpty()) {
                if (this.f200860p.isEmpty()) {
                    this.f200860p = jVar.f200840p;
                    this.f200850d &= -513;
                } else {
                    J();
                    this.f200860p.addAll(jVar.f200840p);
                }
            }
            if (!jVar.f200842r.isEmpty()) {
                if (this.f200861q.isEmpty()) {
                    this.f200861q = jVar.f200842r;
                    this.f200850d &= -1025;
                } else {
                    I();
                    this.f200861q.addAll(jVar.f200842r);
                }
            }
            if (!jVar.f200843s.isEmpty()) {
                if (this.f200862r.isEmpty()) {
                    this.f200862r = jVar.f200843s;
                    this.f200850d &= -2049;
                } else {
                    P();
                    this.f200862r.addAll(jVar.f200843s);
                }
            }
            if (jVar.Z0()) {
                Y(jVar.M0());
            }
            if (!jVar.f200845v.isEmpty()) {
                if (this.f200864t.isEmpty()) {
                    this.f200864t = jVar.f200845v;
                    this.f200850d &= -8193;
                } else {
                    Q();
                    this.f200864t.addAll(jVar.f200845v);
                }
            }
            if (jVar.R0()) {
                S(jVar.w0());
            }
            if (!jVar.f200847x.isEmpty()) {
                if (this.f200866w.isEmpty()) {
                    this.f200866w = jVar.f200847x;
                    this.f200850d &= -32769;
                } else {
                    H();
                    this.f200866w.addAll(jVar.f200847x);
                }
            }
            if (!jVar.f200848y.isEmpty()) {
                if (this.f200867x.isEmpty()) {
                    this.f200867x = jVar.f200848y;
                    this.f200850d &= -65537;
                } else {
                    G();
                    this.f200867x.addAll(jVar.f200848y);
                }
            }
            if (!jVar.f200849z.isEmpty()) {
                if (this.f200868y.isEmpty()) {
                    this.f200868y = jVar.f200849z;
                    this.f200850d &= -131073;
                } else {
                    N();
                    this.f200868y.addAll(jVar.f200849z);
                }
            }
            x(jVar);
            s(p().f(jVar.f200829c));
            return this;
        }

        public b W(r rVar) {
            if ((this.f200850d & 64) != 64 || this.f200857l == r.e0()) {
                this.f200857l = rVar;
            } else {
                this.f200857l = r.F0(this.f200857l).q(rVar).A();
            }
            this.f200850d |= 64;
            return this;
        }

        public b X(r rVar) {
            if ((this.f200850d & 8) != 8 || this.f200854h == r.e0()) {
                this.f200854h = rVar;
            } else {
                this.f200854h = r.F0(this.f200854h).q(rVar).A();
            }
            this.f200850d |= 8;
            return this;
        }

        public b Y(u uVar) {
            if ((this.f200850d & PKIFailureInfo.certConfirmed) != 4096 || this.f200863s == u.A()) {
                this.f200863s = uVar;
            } else {
                this.f200863s = u.I(this.f200863s).q(uVar).w();
            }
            this.f200850d |= PKIFailureInfo.certConfirmed;
            return this;
        }

        public b a0(int i15) {
            this.f200850d |= 1;
            this.f200851e = i15;
            return this;
        }

        public b c0(int i15) {
            this.f200850d |= 4;
            this.f200853g = i15;
            return this;
        }

        public b d0(int i15) {
            this.f200850d |= 2;
            this.f200852f = i15;
            return this;
        }

        public b e0(int i15) {
            this.f200850d |= 128;
            this.f200858m = i15;
            return this;
        }

        public b f0(int i15) {
            this.f200850d |= 16;
            this.f200855j = i15;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public j build() {
            j jVarA = A();
            if (jVarA.c()) {
                return jVarA;
            }
            throw bt.a.AbstractC0557a.n(jVarA);
        }
    }

    static {
        j jVar = new j(true);
        C = jVar;
        jVar.a1();
    }

    private void a1() {
        this.f200831e = 6;
        this.f200832f = 6;
        this.f200833g = 0;
        this.f200834h = r.e0();
        this.f200835j = 0;
        List list = Collections.EMPTY_LIST;
        this.f200836k = list;
        this.f200837l = r.e0();
        this.f200838m = 0;
        this.f200839n = list;
        this.f200840p = list;
        this.f200842r = list;
        this.f200843s = list;
        this.f200844t = u.A();
        this.f200845v = list;
        this.f200846w = f.w();
        this.f200847x = list;
        this.f200848y = list;
        this.f200849z = list;
    }

    public static b b1() {
        return b.F();
    }

    public static b c1(j jVar) {
        return b1().q(jVar);
    }

    public static j e1(InputStream inputStream, bt.g gVar) {
        return D.c(inputStream, gVar);
    }

    public static j x0() {
        return C;
    }

    public int A0() {
        return this.f200849z.size();
    }

    public List<us.b> B0() {
        return this.f200849z;
    }

    public int C0() {
        return this.f200831e;
    }

    public int D0() {
        return this.f200833g;
    }

    public int E0() {
        return this.f200832f;
    }

    public r F0() {
        return this.f200837l;
    }

    public int G0() {
        return this.f200838m;
    }

    public r H0() {
        return this.f200834h;
    }

    public int I0() {
        return this.f200835j;
    }

    public t J0(int i15) {
        return this.f200836k.get(i15);
    }

    public int K0() {
        return this.f200836k.size();
    }

    public List<t> L0() {
        return this.f200836k;
    }

    public u M0() {
        return this.f200844t;
    }

    public v N0(int i15) {
        return this.f200843s.get(i15);
    }

    public int O0() {
        return this.f200843s.size();
    }

    public List<v> P0() {
        return this.f200843s;
    }

    public List<Integer> Q0() {
        return this.f200845v;
    }

    public boolean R0() {
        return (this.f200830d & 256) == 256;
    }

    public boolean S0() {
        return (this.f200830d & 1) == 1;
    }

    public boolean T0() {
        return (this.f200830d & 4) == 4;
    }

    public boolean U0() {
        return (this.f200830d & 2) == 2;
    }

    public boolean V0() {
        return (this.f200830d & 32) == 32;
    }

    public boolean W0() {
        return (this.f200830d & 64) == 64;
    }

    public boolean X0() {
        return (this.f200830d & 8) == 8;
    }

    public boolean Y0() {
        return (this.f200830d & 16) == 16;
    }

    public boolean Z0() {
        return (this.f200830d & 128) == 128;
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.A;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        if (!T0()) {
            this.A = (byte) 0;
            return false;
        }
        if (X0() && !H0().c()) {
            this.A = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < K0(); i15++) {
            if (!J0(i15).c()) {
                this.A = (byte) 0;
                return false;
            }
        }
        if (V0() && !F0().c()) {
            this.A = (byte) 0;
            return false;
        }
        for (int i16 = 0; i16 < t0(); i16++) {
            if (!s0(i16).c()) {
                this.A = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < q0(); i17++) {
            if (!p0(i17).c()) {
                this.A = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < O0(); i18++) {
            if (!N0(i18).c()) {
                this.A = (byte) 0;
                return false;
            }
        }
        if (Z0() && !M0().c()) {
            this.A = (byte) 0;
            return false;
        }
        if (R0() && !w0().c()) {
            this.A = (byte) 0;
            return false;
        }
        for (int i19 = 0; i19 < o0(); i19++) {
            if (!n0(i19).c()) {
                this.A = (byte) 0;
                return false;
            }
        }
        for (int i25 = 0; i25 < l0(); i25++) {
            if (!k0(i25).c()) {
                this.A = (byte) 0;
                return false;
            }
        }
        for (int i26 = 0; i26 < A0(); i26++) {
            if (!z0(i26).c()) {
                this.A = (byte) 0;
                return false;
            }
        }
        if (u()) {
            this.A = (byte) 1;
            return true;
        }
        this.A = (byte) 0;
        return false;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public b g() {
        return b1();
    }

    @Override // bt.q
    public int e() {
        int i15 = this.B;
        if (i15 != -1) {
            return i15;
        }
        int iO = (this.f200830d & 2) == 2 ? bt.f.o(1, this.f200832f) : 0;
        if ((this.f200830d & 4) == 4) {
            iO += bt.f.o(2, this.f200833g);
        }
        if ((this.f200830d & 8) == 8) {
            iO += bt.f.s(3, this.f200834h);
        }
        for (int i16 = 0; i16 < this.f200836k.size(); i16++) {
            iO += bt.f.s(4, this.f200836k.get(i16));
        }
        if ((this.f200830d & 32) == 32) {
            iO += bt.f.s(5, this.f200837l);
        }
        for (int i17 = 0; i17 < this.f200843s.size(); i17++) {
            iO += bt.f.s(6, this.f200843s.get(i17));
        }
        if ((this.f200830d & 16) == 16) {
            iO += bt.f.o(7, this.f200835j);
        }
        if ((this.f200830d & 64) == 64) {
            iO += bt.f.o(8, this.f200838m);
        }
        if ((this.f200830d & 1) == 1) {
            iO += bt.f.o(9, this.f200831e);
        }
        for (int i18 = 0; i18 < this.f200839n.size(); i18++) {
            iO += bt.f.s(10, this.f200839n.get(i18));
        }
        int iP = 0;
        for (int i19 = 0; i19 < this.f200840p.size(); i19++) {
            iP += bt.f.p(this.f200840p.get(i19).intValue());
        }
        int iS = iO + iP;
        if (!u0().isEmpty()) {
            iS = iS + 1 + bt.f.p(iP);
        }
        this.f200841q = iP;
        for (int i25 = 0; i25 < this.f200848y.size(); i25++) {
            iS += bt.f.s(12, this.f200848y.get(i25));
        }
        for (int i26 = 0; i26 < this.f200842r.size(); i26++) {
            iS += bt.f.s(13, this.f200842r.get(i26));
        }
        if ((this.f200830d & 128) == 128) {
            iS += bt.f.s(30, this.f200844t);
        }
        int iP2 = 0;
        for (int i27 = 0; i27 < this.f200845v.size(); i27++) {
            iP2 += bt.f.p(this.f200845v.get(i27).intValue());
        }
        int size = iS + iP2 + (Q0().size() * 2);
        if ((this.f200830d & 256) == 256) {
            size += bt.f.s(32, this.f200846w);
        }
        for (int i28 = 0; i28 < this.f200847x.size(); i28++) {
            size += bt.f.s(33, this.f200847x.get(i28));
        }
        for (int i29 = 0; i29 < this.f200849z.size(); i29++) {
            size += bt.f.s(34, this.f200849z.get(i29));
        }
        int iV = size + v() + this.f200829c.size();
        this.B = iV;
        return iV;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public b b() {
        return c1(this);
    }

    @Override // bt.i, bt.q
    public bt.s<j> j() {
        return D;
    }

    public us.b k0(int i15) {
        return this.f200848y.get(i15);
    }

    public int l0() {
        return this.f200848y.size();
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        bt.i.d<MessageType>.a aVarC = C();
        if ((this.f200830d & 2) == 2) {
            fVar.a0(1, this.f200832f);
        }
        if ((this.f200830d & 4) == 4) {
            fVar.a0(2, this.f200833g);
        }
        if ((this.f200830d & 8) == 8) {
            fVar.d0(3, this.f200834h);
        }
        for (int i15 = 0; i15 < this.f200836k.size(); i15++) {
            fVar.d0(4, this.f200836k.get(i15));
        }
        if ((this.f200830d & 32) == 32) {
            fVar.d0(5, this.f200837l);
        }
        for (int i16 = 0; i16 < this.f200843s.size(); i16++) {
            fVar.d0(6, this.f200843s.get(i16));
        }
        if ((this.f200830d & 16) == 16) {
            fVar.a0(7, this.f200835j);
        }
        if ((this.f200830d & 64) == 64) {
            fVar.a0(8, this.f200838m);
        }
        if ((this.f200830d & 1) == 1) {
            fVar.a0(9, this.f200831e);
        }
        for (int i17 = 0; i17 < this.f200839n.size(); i17++) {
            fVar.d0(10, this.f200839n.get(i17));
        }
        if (u0().size() > 0) {
            fVar.o0(90);
            fVar.o0(this.f200841q);
        }
        for (int i18 = 0; i18 < this.f200840p.size(); i18++) {
            fVar.b0(this.f200840p.get(i18).intValue());
        }
        for (int i19 = 0; i19 < this.f200848y.size(); i19++) {
            fVar.d0(12, this.f200848y.get(i19));
        }
        for (int i25 = 0; i25 < this.f200842r.size(); i25++) {
            fVar.d0(13, this.f200842r.get(i25));
        }
        if ((this.f200830d & 128) == 128) {
            fVar.d0(30, this.f200844t);
        }
        for (int i26 = 0; i26 < this.f200845v.size(); i26++) {
            fVar.a0(31, this.f200845v.get(i26).intValue());
        }
        if ((this.f200830d & 256) == 256) {
            fVar.d0(32, this.f200846w);
        }
        for (int i27 = 0; i27 < this.f200847x.size(); i27++) {
            fVar.d0(33, this.f200847x.get(i27));
        }
        for (int i28 = 0; i28 < this.f200849z.size(); i28++) {
            fVar.d0(34, this.f200849z.get(i28));
        }
        aVarC.a(19000, fVar);
        fVar.i0(this.f200829c);
    }

    public List<us.b> m0() {
        return this.f200848y;
    }

    public d n0(int i15) {
        return this.f200847x.get(i15);
    }

    public int o0() {
        return this.f200847x.size();
    }

    public v p0(int i15) {
        return this.f200842r.get(i15);
    }

    public int q0() {
        return this.f200842r.size();
    }

    public List<v> r0() {
        return this.f200842r;
    }

    public r s0(int i15) {
        return this.f200839n.get(i15);
    }

    public int t0() {
        return this.f200839n.size();
    }

    public List<Integer> u0() {
        return this.f200840p;
    }

    public List<r> v0() {
        return this.f200839n;
    }

    public f w0() {
        return this.f200846w;
    }

    @Override // bt.r
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public j i() {
        return C;
    }

    public us.b z0(int i15) {
        return this.f200849z.get(i15);
    }

    private j(bt.i.c<j, ?> cVar) {
        super(cVar);
        this.f200841q = -1;
        this.A = (byte) -1;
        this.B = -1;
        this.f200829c = cVar.p();
    }

    private j(boolean z15) {
        this.f200841q = -1;
        this.A = (byte) -1;
        this.B = -1;
        this.f200829c = bt.d.f21388a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0044  */
    /* JADX WARN: Code duplicated, block: B:134:0x0330  */
    /* JADX WARN: Code duplicated, block: B:137:0x033c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0348  */
    /* JADX WARN: Code duplicated, block: B:143:0x0354  */
    /* JADX WARN: Code duplicated, block: B:146:0x0360  */
    /* JADX WARN: Code duplicated, block: B:149:0x036c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0378  */
    /* JADX WARN: Code duplicated, block: B:155:0x0386  */
    /* JADX WARN: Code duplicated, block: B:158:0x0394  */
    /* JADX WARN: Multi-variable type inference failed */
    private j(bt.e eVar, bt.g gVar) throws Throwable {
        int i15;
        this.f200841q = -1;
        this.A = (byte) -1;
        this.B = -1;
        a1();
        bt.d.b bVarU = bt.d.u();
        boolean z15 = true;
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z16 = false;
        int i16 = 0;
        while (true) {
            int i17 = 32768;
            int i18 = PKIFailureInfo.unsupportedVersion;
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
                            this.f200830d |= 2;
                            this.f200832f = eVar.s();
                            z15 = z17;
                            break;
                        case 16:
                            this.f200830d |= 4;
                            this.f200833g = eVar.s();
                            z15 = z17;
                            break;
                        case 26:
                            r.c cVarH0 = (this.f200830d & 8) == 8 ? this.f200834h.b() : null;
                            r rVar = (r) eVar.u(r.f200992y, gVar);
                            this.f200834h = rVar;
                            if (cVarH0 != 0) {
                                cVarH0.q(rVar);
                                this.f200834h = cVarH0.A();
                            }
                            this.f200830d |= 8;
                            z15 = z17;
                            break;
                        case 34:
                            if ((i16 & 32) != 32) {
                                this.f200836k = new ArrayList();
                                i16 |= 32;
                            }
                            this.f200836k.add((t) eVar.u(t.f201074q, gVar));
                            z15 = z17;
                            break;
                        case EACTags.CURRENCY_CODE /* 42 */:
                            r.c cVarH1 = (this.f200830d & 32) == 32 ? this.f200837l.b() : null;
                            r rVar2 = (r) eVar.u(r.f200992y, gVar);
                            this.f200837l = rVar2;
                            if (cVarH1 != 0) {
                                cVarH1.q(rVar2);
                                this.f200837l = cVarH1.A();
                            }
                            this.f200830d |= 32;
                            z15 = z17;
                            break;
                        case 50:
                            if ((i16 & 2048) != 2048) {
                                this.f200843s = new ArrayList();
                                i16 |= 2048;
                            }
                            this.f200843s.add((v) eVar.u(v.f201111r, gVar));
                            z15 = z17;
                            break;
                        case 56:
                            this.f200830d |= 16;
                            this.f200835j = eVar.s();
                            z15 = z17;
                            break;
                        case 64:
                            this.f200830d |= 64;
                            this.f200838m = eVar.s();
                            z15 = z17;
                            break;
                        case 72:
                            this.f200830d |= 1;
                            this.f200831e = eVar.s();
                            z15 = z17;
                            break;
                        case EACTags.HISTORICAL_BYTES /* 82 */:
                            if ((i16 & 256) != 256) {
                                this.f200839n = new ArrayList();
                                i16 |= 256;
                            }
                            this.f200839n.add((r) eVar.u(r.f200992y, gVar));
                            z15 = z17;
                            break;
                        case 88:
                            if ((i16 & 512) != 512) {
                                this.f200840p = new ArrayList();
                                i16 |= 512;
                            }
                            this.f200840p.add(Integer.valueOf(eVar.s()));
                            z15 = z17;
                            break;
                        case 90:
                            int iJ = eVar.j(eVar.A());
                            if ((i16 & 512) != 512 && eVar.e() > 0) {
                                this.f200840p = new ArrayList();
                                i16 |= 512;
                            }
                            while (eVar.e() > 0) {
                                this.f200840p.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(iJ);
                            z15 = z17;
                            break;
                        case 98:
                            if ((i16 & PKIFailureInfo.notAuthorized) != 65536) {
                                this.f200848y = new ArrayList();
                                i16 |= PKIFailureInfo.notAuthorized;
                            }
                            this.f200848y.add((us.b) eVar.u(us.b.f200603j, gVar));
                            z15 = z17;
                            break;
                        case 106:
                            if ((i16 & 1024) != 1024) {
                                this.f200842r = new ArrayList();
                                i16 |= 1024;
                            }
                            this.f200842r.add((v) eVar.u(v.f201111r, gVar));
                            z15 = z17;
                            break;
                        case 242:
                            u.b bVarK = (this.f200830d & 128) == 128 ? this.f200844t.b() : null;
                            u uVar = (u) eVar.u(u.f201100j, gVar);
                            this.f200844t = uVar;
                            if (bVarK != 0) {
                                bVarK.q(uVar);
                                this.f200844t = bVarK.w();
                            }
                            this.f200830d |= 128;
                            z15 = z17;
                            break;
                        case 248:
                            if ((i16 & PKIFailureInfo.certRevoked) != 8192) {
                                this.f200845v = new ArrayList();
                                i16 |= PKIFailureInfo.certRevoked;
                            }
                            this.f200845v.add(Integer.valueOf(eVar.s()));
                            z15 = z17;
                            break;
                        case 250:
                            i18 = 131072;
                            int iJ2 = eVar.j(eVar.A());
                            if ((i16 & PKIFailureInfo.certRevoked) != 8192 && eVar.e() > 0) {
                                this.f200845v = new ArrayList();
                                i16 |= PKIFailureInfo.certRevoked;
                            }
                            while (eVar.e() > 0) {
                                i15 = i17;
                                try {
                                    try {
                                        this.f200845v.add(Integer.valueOf(eVar.s()));
                                        i17 = i15;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if ((i16 & 32) == 32) {
                                            this.f200836k = Collections.unmodifiableList(this.f200836k);
                                        }
                                        if ((i16 & 2048) == 2048) {
                                            this.f200843s = Collections.unmodifiableList(this.f200843s);
                                        }
                                        if ((i16 & 256) == 256) {
                                            this.f200839n = Collections.unmodifiableList(this.f200839n);
                                        }
                                        if ((i16 & 512) == 512) {
                                            this.f200840p = Collections.unmodifiableList(this.f200840p);
                                        }
                                        if ((i16 & PKIFailureInfo.notAuthorized) == 65536) {
                                            this.f200848y = Collections.unmodifiableList(this.f200848y);
                                        }
                                        if ((i16 & 1024) == 1024) {
                                            this.f200842r = Collections.unmodifiableList(this.f200842r);
                                        }
                                        if ((i16 & PKIFailureInfo.certRevoked) == 8192) {
                                            this.f200845v = Collections.unmodifiableList(this.f200845v);
                                        }
                                        if ((i16 & i15) == i15) {
                                            this.f200847x = Collections.unmodifiableList(this.f200847x);
                                        }
                                        if ((i16 & i18) == i18) {
                                            this.f200849z = Collections.unmodifiableList(this.f200849z);
                                        }
                                        try {
                                            fVarJ.I();
                                            break;
                                        } catch (IOException unused) {
                                        } finally {
                                            this.f200829c = bVarU.r();
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
                            f.b bVarG = (this.f200830d & 256) == 256 ? this.f200846w.b() : null;
                            f fVar = (f) eVar.u(f.f200749g, gVar);
                            this.f200846w = fVar;
                            if (bVarG != 0) {
                                bVarG.q(fVar);
                                this.f200846w = bVarG.w();
                            }
                            this.f200830d |= 256;
                            z15 = z17;
                            break;
                        case 266:
                            if ((i16 & 32768) != 32768) {
                                this.f200847x = new ArrayList();
                                i16 |= 32768;
                            }
                            this.f200847x.add((d) eVar.u(d.f200721j, gVar));
                            z15 = z17;
                            break;
                        case 274:
                            if ((i16 & PKIFailureInfo.unsupportedVersion) != 131072) {
                                this.f200849z = new ArrayList();
                                i16 |= PKIFailureInfo.unsupportedVersion;
                            }
                            try {
                                try {
                                    this.f200849z.add((us.b) eVar.u(us.b.f200603j, gVar));
                                    z15 = z17;
                                } catch (bt.k e17) {
                                    e = e17;
                                    throw e.i(this);
                                } catch (IOException e18) {
                                    e = e18;
                                    throw new bt.k(e.getMessage()).i(this);
                                } catch (Throwable th5) {
                                    th = th5;
                                    i15 = 32768;
                                    if ((i16 & 32) == 32) {
                                        this.f200836k = Collections.unmodifiableList(this.f200836k);
                                    }
                                    if ((i16 & 2048) == 2048) {
                                        this.f200843s = Collections.unmodifiableList(this.f200843s);
                                    }
                                    if ((i16 & 256) == 256) {
                                        this.f200839n = Collections.unmodifiableList(this.f200839n);
                                    }
                                    if ((i16 & 512) == 512) {
                                        this.f200840p = Collections.unmodifiableList(this.f200840p);
                                    }
                                    if ((i16 & PKIFailureInfo.notAuthorized) == 65536) {
                                        this.f200848y = Collections.unmodifiableList(this.f200848y);
                                    }
                                    if ((i16 & 1024) == 1024) {
                                        this.f200842r = Collections.unmodifiableList(this.f200842r);
                                    }
                                    if ((i16 & PKIFailureInfo.certRevoked) == 8192) {
                                        this.f200845v = Collections.unmodifiableList(this.f200845v);
                                    }
                                    if ((i16 & i15) == i15) {
                                        this.f200847x = Collections.unmodifiableList(this.f200847x);
                                    }
                                    if ((i16 & i18) == i18) {
                                        this.f200849z = Collections.unmodifiableList(this.f200849z);
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
                    i15 = 32768;
                    i18 = 131072;
                }
            } else {
                if ((i16 & 32) == 32) {
                    this.f200836k = Collections.unmodifiableList(this.f200836k);
                }
                if ((i16 & 2048) == 2048) {
                    this.f200843s = Collections.unmodifiableList(this.f200843s);
                }
                if ((i16 & 256) == 256) {
                    this.f200839n = Collections.unmodifiableList(this.f200839n);
                }
                if ((i16 & 512) == 512) {
                    this.f200840p = Collections.unmodifiableList(this.f200840p);
                }
                if ((i16 & PKIFailureInfo.notAuthorized) == 65536) {
                    this.f200848y = Collections.unmodifiableList(this.f200848y);
                }
                if ((i16 & 1024) == 1024) {
                    this.f200842r = Collections.unmodifiableList(this.f200842r);
                }
                if ((i16 & PKIFailureInfo.certRevoked) == 8192) {
                    this.f200845v = Collections.unmodifiableList(this.f200845v);
                }
                if ((i16 & 32768) == 32768) {
                    this.f200847x = Collections.unmodifiableList(this.f200847x);
                }
                if ((i16 & PKIFailureInfo.unsupportedVersion) == 131072) {
                    this.f200849z = Collections.unmodifiableList(this.f200849z);
                }
                try {
                    fVarJ.I();
                } catch (IOException unused2) {
                } finally {
                    this.f200829c = bVarU.r();
                }
                n();
                return;
            }
        }
    }
}
