package us;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends bt.i.d<c> implements bt.r {
    private static final c L;
    public static bt.s<c> O = new a();
    private int A;
    private r B;
    private int C;
    private List<us.b> D;
    private u E;
    private List<Integer> F;
    private x G;
    private List<d> H;
    private byte I;
    private int K;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bt.d f200669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f200670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f200671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f200672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f200673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<t> f200674h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<r> f200675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<Integer> f200676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f200677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<Integer> f200678m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f200679n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<r> f200680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<Integer> f200681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f200682r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List<e> f200683s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<j> f200684t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<o> f200685v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<s> f200686w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List<h> f200687x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<Integer> f200688y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f200689z;

    static class a extends bt.b<c> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public c b(bt.e eVar, bt.g gVar) {
            return new c(eVar, gVar);
        }
    }

    public static final class b extends bt.i.c<c, b> implements bt.r {
        private u A;
        private List<Integer> B;
        private x C;
        private List<d> D;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f200690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f200691e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f200692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f200693g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<t> f200694h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<r> f200695j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List<Integer> f200696k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private List<Integer> f200697l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<r> f200698m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List<Integer> f200699n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List<e> f200700p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List<j> f200701q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List<o> f200702r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private List<s> f200703s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List<h> f200704t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private List<Integer> f200705v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f200706w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private r f200707x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f200708y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private List<us.b> f200709z;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f200694h = list;
            this.f200695j = list;
            this.f200696k = list;
            this.f200697l = list;
            this.f200698m = list;
            this.f200699n = list;
            this.f200700p = list;
            this.f200701q = list;
            this.f200702r = list;
            this.f200703s = list;
            this.f200704t = list;
            this.f200705v = list;
            this.f200707x = r.e0();
            this.f200709z = list;
            this.A = u.A();
            this.B = list;
            this.C = x.w();
            this.D = list;
            Y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b F() {
            return new b();
        }

        private void G() {
            if ((this.f200690d & PKIFailureInfo.transactionIdInUse) != 262144) {
                this.f200709z = new ArrayList(this.f200709z);
                this.f200690d |= PKIFailureInfo.transactionIdInUse;
            }
        }

        private void H() {
            if ((this.f200690d & 4194304) != 4194304) {
                this.D = new ArrayList(this.D);
                this.f200690d |= 4194304;
            }
        }

        private void I() {
            if ((this.f200690d & 512) != 512) {
                this.f200700p = new ArrayList(this.f200700p);
                this.f200690d |= 512;
            }
        }

        private void J() {
            if ((this.f200690d & 256) != 256) {
                this.f200699n = new ArrayList(this.f200699n);
                this.f200690d |= 256;
            }
        }

        private void K() {
            if ((this.f200690d & 128) != 128) {
                this.f200698m = new ArrayList(this.f200698m);
                this.f200690d |= 128;
            }
        }

        private void N() {
            if ((this.f200690d & PKIFailureInfo.certRevoked) != 8192) {
                this.f200704t = new ArrayList(this.f200704t);
                this.f200690d |= PKIFailureInfo.certRevoked;
            }
        }

        private void O() {
            if ((this.f200690d & 1024) != 1024) {
                this.f200701q = new ArrayList(this.f200701q);
                this.f200690d |= 1024;
            }
        }

        private void P() {
            if ((this.f200690d & 64) != 64) {
                this.f200697l = new ArrayList(this.f200697l);
                this.f200690d |= 64;
            }
        }

        private void Q() {
            if ((this.f200690d & 2048) != 2048) {
                this.f200702r = new ArrayList(this.f200702r);
                this.f200690d |= 2048;
            }
        }

        private void R() {
            if ((this.f200690d & 16384) != 16384) {
                this.f200705v = new ArrayList(this.f200705v);
                this.f200690d |= 16384;
            }
        }

        private void S() {
            if ((this.f200690d & 32) != 32) {
                this.f200696k = new ArrayList(this.f200696k);
                this.f200690d |= 32;
            }
        }

        private void T() {
            if ((this.f200690d & 16) != 16) {
                this.f200695j = new ArrayList(this.f200695j);
                this.f200690d |= 16;
            }
        }

        private void U() {
            if ((this.f200690d & PKIFailureInfo.certConfirmed) != 4096) {
                this.f200703s = new ArrayList(this.f200703s);
                this.f200690d |= PKIFailureInfo.certConfirmed;
            }
        }

        private void W() {
            if ((this.f200690d & 8) != 8) {
                this.f200694h = new ArrayList(this.f200694h);
                this.f200690d |= 8;
            }
        }

        private void X() {
            if ((this.f200690d & PKIFailureInfo.badCertTemplate) != 1048576) {
                this.B = new ArrayList(this.B);
                this.f200690d |= PKIFailureInfo.badCertTemplate;
            }
        }

        private void Y() {
        }

        public c A() {
            c cVar = new c(this);
            int i15 = this.f200690d;
            int i16 = (i15 & 1) != 1 ? 0 : 1;
            cVar.f200671e = this.f200691e;
            if ((i15 & 2) == 2) {
                i16 |= 2;
            }
            cVar.f200672f = this.f200692f;
            if ((i15 & 4) == 4) {
                i16 |= 4;
            }
            cVar.f200673g = this.f200693g;
            if ((this.f200690d & 8) == 8) {
                this.f200694h = Collections.unmodifiableList(this.f200694h);
                this.f200690d &= -9;
            }
            cVar.f200674h = this.f200694h;
            if ((this.f200690d & 16) == 16) {
                this.f200695j = Collections.unmodifiableList(this.f200695j);
                this.f200690d &= -17;
            }
            cVar.f200675j = this.f200695j;
            if ((this.f200690d & 32) == 32) {
                this.f200696k = Collections.unmodifiableList(this.f200696k);
                this.f200690d &= -33;
            }
            cVar.f200676k = this.f200696k;
            if ((this.f200690d & 64) == 64) {
                this.f200697l = Collections.unmodifiableList(this.f200697l);
                this.f200690d &= -65;
            }
            cVar.f200678m = this.f200697l;
            if ((this.f200690d & 128) == 128) {
                this.f200698m = Collections.unmodifiableList(this.f200698m);
                this.f200690d &= -129;
            }
            cVar.f200680p = this.f200698m;
            if ((this.f200690d & 256) == 256) {
                this.f200699n = Collections.unmodifiableList(this.f200699n);
                this.f200690d &= -257;
            }
            cVar.f200681q = this.f200699n;
            if ((this.f200690d & 512) == 512) {
                this.f200700p = Collections.unmodifiableList(this.f200700p);
                this.f200690d &= -513;
            }
            cVar.f200683s = this.f200700p;
            if ((this.f200690d & 1024) == 1024) {
                this.f200701q = Collections.unmodifiableList(this.f200701q);
                this.f200690d &= -1025;
            }
            cVar.f200684t = this.f200701q;
            if ((this.f200690d & 2048) == 2048) {
                this.f200702r = Collections.unmodifiableList(this.f200702r);
                this.f200690d &= -2049;
            }
            cVar.f200685v = this.f200702r;
            if ((this.f200690d & PKIFailureInfo.certConfirmed) == 4096) {
                this.f200703s = Collections.unmodifiableList(this.f200703s);
                this.f200690d &= -4097;
            }
            cVar.f200686w = this.f200703s;
            if ((this.f200690d & PKIFailureInfo.certRevoked) == 8192) {
                this.f200704t = Collections.unmodifiableList(this.f200704t);
                this.f200690d &= -8193;
            }
            cVar.f200687x = this.f200704t;
            if ((this.f200690d & 16384) == 16384) {
                this.f200705v = Collections.unmodifiableList(this.f200705v);
                this.f200690d &= -16385;
            }
            cVar.f200688y = this.f200705v;
            if ((i15 & 32768) == 32768) {
                i16 |= 8;
            }
            cVar.A = this.f200706w;
            if ((i15 & PKIFailureInfo.notAuthorized) == 65536) {
                i16 |= 16;
            }
            cVar.B = this.f200707x;
            if ((i15 & PKIFailureInfo.unsupportedVersion) == 131072) {
                i16 |= 32;
            }
            cVar.C = this.f200708y;
            if ((this.f200690d & PKIFailureInfo.transactionIdInUse) == 262144) {
                this.f200709z = Collections.unmodifiableList(this.f200709z);
                this.f200690d &= -262145;
            }
            cVar.D = this.f200709z;
            if ((i15 & PKIFailureInfo.signerNotTrusted) == 524288) {
                i16 |= 64;
            }
            cVar.E = this.A;
            if ((this.f200690d & PKIFailureInfo.badCertTemplate) == 1048576) {
                this.B = Collections.unmodifiableList(this.B);
                this.f200690d &= -1048577;
            }
            cVar.F = this.B;
            if ((i15 & PKIFailureInfo.badSenderNonce) == 2097152) {
                i16 |= 128;
            }
            cVar.G = this.C;
            if ((this.f200690d & 4194304) == 4194304) {
                this.D = Collections.unmodifiableList(this.D);
                this.f200690d &= -4194305;
            }
            cVar.H = this.D;
            cVar.f200670d = i16;
            return cVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public b o() {
            return F().q(A());
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            c cVar = null;
            try {
                try {
                    c cVarB = c.O.b(eVar, gVar);
                    if (cVarB != null) {
                        q(cVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    c cVar2 = (c) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        cVar = cVar2;
                        if (cVar != null) {
                            q(cVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (cVar != null) {
                    q(cVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
        public b q(c cVar) {
            if (cVar == c.I0()) {
                return this;
            }
            if (cVar.o1()) {
                h0(cVar.N0());
            }
            if (cVar.p1()) {
                i0(cVar.O0());
            }
            if (cVar.n1()) {
                g0(cVar.y0());
            }
            if (!cVar.f200674h.isEmpty()) {
                if (this.f200694h.isEmpty()) {
                    this.f200694h = cVar.f200674h;
                    this.f200690d &= -9;
                } else {
                    W();
                    this.f200694h.addAll(cVar.f200674h);
                }
            }
            if (!cVar.f200675j.isEmpty()) {
                if (this.f200695j.isEmpty()) {
                    this.f200695j = cVar.f200675j;
                    this.f200690d &= -17;
                } else {
                    T();
                    this.f200695j.addAll(cVar.f200675j);
                }
            }
            if (!cVar.f200676k.isEmpty()) {
                if (this.f200696k.isEmpty()) {
                    this.f200696k = cVar.f200676k;
                    this.f200690d &= -33;
                } else {
                    S();
                    this.f200696k.addAll(cVar.f200676k);
                }
            }
            if (!cVar.f200678m.isEmpty()) {
                if (this.f200697l.isEmpty()) {
                    this.f200697l = cVar.f200678m;
                    this.f200690d &= -65;
                } else {
                    P();
                    this.f200697l.addAll(cVar.f200678m);
                }
            }
            if (!cVar.f200680p.isEmpty()) {
                if (this.f200698m.isEmpty()) {
                    this.f200698m = cVar.f200680p;
                    this.f200690d &= -129;
                } else {
                    K();
                    this.f200698m.addAll(cVar.f200680p);
                }
            }
            if (!cVar.f200681q.isEmpty()) {
                if (this.f200699n.isEmpty()) {
                    this.f200699n = cVar.f200681q;
                    this.f200690d &= -257;
                } else {
                    J();
                    this.f200699n.addAll(cVar.f200681q);
                }
            }
            if (!cVar.f200683s.isEmpty()) {
                if (this.f200700p.isEmpty()) {
                    this.f200700p = cVar.f200683s;
                    this.f200690d &= -513;
                } else {
                    I();
                    this.f200700p.addAll(cVar.f200683s);
                }
            }
            if (!cVar.f200684t.isEmpty()) {
                if (this.f200701q.isEmpty()) {
                    this.f200701q = cVar.f200684t;
                    this.f200690d &= -1025;
                } else {
                    O();
                    this.f200701q.addAll(cVar.f200684t);
                }
            }
            if (!cVar.f200685v.isEmpty()) {
                if (this.f200702r.isEmpty()) {
                    this.f200702r = cVar.f200685v;
                    this.f200690d &= -2049;
                } else {
                    Q();
                    this.f200702r.addAll(cVar.f200685v);
                }
            }
            if (!cVar.f200686w.isEmpty()) {
                if (this.f200703s.isEmpty()) {
                    this.f200703s = cVar.f200686w;
                    this.f200690d &= -4097;
                } else {
                    U();
                    this.f200703s.addAll(cVar.f200686w);
                }
            }
            if (!cVar.f200687x.isEmpty()) {
                if (this.f200704t.isEmpty()) {
                    this.f200704t = cVar.f200687x;
                    this.f200690d &= -8193;
                } else {
                    N();
                    this.f200704t.addAll(cVar.f200687x);
                }
            }
            if (!cVar.f200688y.isEmpty()) {
                if (this.f200705v.isEmpty()) {
                    this.f200705v = cVar.f200688y;
                    this.f200690d &= -16385;
                } else {
                    R();
                    this.f200705v.addAll(cVar.f200688y);
                }
            }
            if (cVar.q1()) {
                j0(cVar.S0());
            }
            if (cVar.r1()) {
                d0(cVar.T0());
            }
            if (cVar.s1()) {
                k0(cVar.U0());
            }
            if (!cVar.D.isEmpty()) {
                if (this.f200709z.isEmpty()) {
                    this.f200709z = cVar.D;
                    this.f200690d &= -262145;
                } else {
                    G();
                    this.f200709z.addAll(cVar.D);
                }
            }
            if (cVar.t1()) {
                e0(cVar.k1());
            }
            if (!cVar.F.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = cVar.F;
                    this.f200690d &= -1048577;
                } else {
                    X();
                    this.B.addAll(cVar.F);
                }
            }
            if (cVar.u1()) {
                f0(cVar.m1());
            }
            if (!cVar.H.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = cVar.H;
                    this.f200690d &= -4194305;
                } else {
                    H();
                    this.D.addAll(cVar.H);
                }
            }
            x(cVar);
            s(p().f(cVar.f200669c));
            return this;
        }

        public b d0(r rVar) {
            if ((this.f200690d & PKIFailureInfo.notAuthorized) != 65536 || this.f200707x == r.e0()) {
                this.f200707x = rVar;
            } else {
                this.f200707x = r.F0(this.f200707x).q(rVar).A();
            }
            this.f200690d |= PKIFailureInfo.notAuthorized;
            return this;
        }

        public b e0(u uVar) {
            if ((this.f200690d & PKIFailureInfo.signerNotTrusted) != 524288 || this.A == u.A()) {
                this.A = uVar;
            } else {
                this.A = u.I(this.A).q(uVar).w();
            }
            this.f200690d |= PKIFailureInfo.signerNotTrusted;
            return this;
        }

        public b f0(x xVar) {
            if ((this.f200690d & PKIFailureInfo.badSenderNonce) != 2097152 || this.C == x.w()) {
                this.C = xVar;
            } else {
                this.C = x.D(this.C).q(xVar).w();
            }
            this.f200690d |= PKIFailureInfo.badSenderNonce;
            return this;
        }

        public b g0(int i15) {
            this.f200690d |= 4;
            this.f200693g = i15;
            return this;
        }

        public b h0(int i15) {
            this.f200690d |= 1;
            this.f200691e = i15;
            return this;
        }

        public b i0(int i15) {
            this.f200690d |= 2;
            this.f200692f = i15;
            return this;
        }

        public b j0(int i15) {
            this.f200690d |= 32768;
            this.f200706w = i15;
            return this;
        }

        public b k0(int i15) {
            this.f200690d |= PKIFailureInfo.unsupportedVersion;
            this.f200708y = i15;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public c build() {
            c cVarA = A();
            if (cVarA.c()) {
                return cVarA;
            }
            throw bt.a.AbstractC0557a.n(cVarA);
        }
    }

    /* JADX INFO: renamed from: us.c$c, reason: collision with other inner class name */
    public enum EnumC5226c implements bt.j.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static bt.j.b<EnumC5226c> f200717j = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f200719a;

        /* JADX INFO: renamed from: us.c$c$a */
        static class a implements bt.j.b<EnumC5226c> {
            a() {
            }

            @Override // bt.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public EnumC5226c a(int i15) {
                return EnumC5226c.b(i15);
            }
        }

        EnumC5226c(int i15, int i16) {
            this.f200719a = i16;
        }

        public static EnumC5226c b(int i15) {
            switch (i15) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // bt.j.a
        public final int h() {
            return this.f200719a;
        }
    }

    static {
        c cVar = new c(true);
        L = cVar;
        cVar.v1();
    }

    public static c I0() {
        return L;
    }

    private void v1() {
        this.f200671e = 6;
        this.f200672f = 0;
        this.f200673g = 0;
        List list = Collections.EMPTY_LIST;
        this.f200674h = list;
        this.f200675j = list;
        this.f200676k = list;
        this.f200678m = list;
        this.f200680p = list;
        this.f200681q = list;
        this.f200683s = list;
        this.f200684t = list;
        this.f200685v = list;
        this.f200686w = list;
        this.f200687x = list;
        this.f200688y = list;
        this.A = 0;
        this.B = r.e0();
        this.C = 0;
        this.D = list;
        this.E = u.A();
        this.F = list;
        this.G = x.w();
        this.H = list;
    }

    public static b w1() {
        return b.F();
    }

    public static b x1(c cVar) {
        return w1().q(cVar);
    }

    public static c z1(InputStream inputStream, bt.g gVar) {
        return O.c(inputStream, gVar);
    }

    public int A0() {
        return this.H.size();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
    public b b() {
        return x1(this);
    }

    public e B0(int i15) {
        return this.f200683s.get(i15);
    }

    public int C0() {
        return this.f200683s.size();
    }

    public List<e> D0() {
        return this.f200683s;
    }

    public r E0(int i15) {
        return this.f200680p.get(i15);
    }

    public int F0() {
        return this.f200680p.size();
    }

    public List<Integer> G0() {
        return this.f200681q;
    }

    public List<r> H0() {
        return this.f200680p;
    }

    @Override // bt.r
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public c i() {
        return L;
    }

    public h K0(int i15) {
        return this.f200687x.get(i15);
    }

    public int L0() {
        return this.f200687x.size();
    }

    public List<h> M0() {
        return this.f200687x;
    }

    public int N0() {
        return this.f200671e;
    }

    public int O0() {
        return this.f200672f;
    }

    public j P0(int i15) {
        return this.f200684t.get(i15);
    }

    public int Q0() {
        return this.f200684t.size();
    }

    public List<j> R0() {
        return this.f200684t;
    }

    public int S0() {
        return this.A;
    }

    public r T0() {
        return this.B;
    }

    public int U0() {
        return this.C;
    }

    public List<Integer> V0() {
        return this.f200678m;
    }

    public o W0(int i15) {
        return this.f200685v.get(i15);
    }

    public int X0() {
        return this.f200685v.size();
    }

    public List<o> Y0() {
        return this.f200685v;
    }

    public List<Integer> Z0() {
        return this.f200688y;
    }

    public r a1(int i15) {
        return this.f200675j.get(i15);
    }

    public int b1() {
        return this.f200675j.size();
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.I;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        if (!p1()) {
            this.I = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < i1(); i15++) {
            if (!h1(i15).c()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < b1(); i16++) {
            if (!a1(i16).c()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < F0(); i17++) {
            if (!E0(i17).c()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i18 = 0; i18 < C0(); i18++) {
            if (!B0(i18).c()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i19 = 0; i19 < Q0(); i19++) {
            if (!P0(i19).c()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i25 = 0; i25 < X0(); i25++) {
            if (!W0(i25).c()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i26 = 0; i26 < f1(); i26++) {
            if (!e1(i26).c()) {
                this.I = (byte) 0;
                return false;
            }
        }
        for (int i27 = 0; i27 < L0(); i27++) {
            if (!K0(i27).c()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if (r1() && !T0().c()) {
            this.I = (byte) 0;
            return false;
        }
        for (int i28 = 0; i28 < w0(); i28++) {
            if (!v0(i28).c()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if (t1() && !k1().c()) {
            this.I = (byte) 0;
            return false;
        }
        for (int i29 = 0; i29 < A0(); i29++) {
            if (!z0(i29).c()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if (u()) {
            this.I = (byte) 1;
            return true;
        }
        this.I = (byte) 0;
        return false;
    }

    public List<Integer> c1() {
        return this.f200676k;
    }

    public List<r> d1() {
        return this.f200675j;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.K;
        if (i15 != -1) {
            return i15;
        }
        int iO = (this.f200670d & 1) == 1 ? bt.f.o(1, this.f200671e) : 0;
        int iP = 0;
        for (int i16 = 0; i16 < this.f200676k.size(); i16++) {
            iP += bt.f.p(this.f200676k.get(i16).intValue());
        }
        int iS = iO + iP;
        if (!c1().isEmpty()) {
            iS = iS + 1 + bt.f.p(iP);
        }
        this.f200677l = iP;
        if ((this.f200670d & 2) == 2) {
            iS += bt.f.o(3, this.f200672f);
        }
        if ((this.f200670d & 4) == 4) {
            iS += bt.f.o(4, this.f200673g);
        }
        for (int i17 = 0; i17 < this.f200674h.size(); i17++) {
            iS += bt.f.s(5, this.f200674h.get(i17));
        }
        for (int i18 = 0; i18 < this.f200675j.size(); i18++) {
            iS += bt.f.s(6, this.f200675j.get(i18));
        }
        int iP2 = 0;
        for (int i19 = 0; i19 < this.f200678m.size(); i19++) {
            iP2 += bt.f.p(this.f200678m.get(i19).intValue());
        }
        int iS2 = iS + iP2;
        if (!V0().isEmpty()) {
            iS2 = iS2 + 1 + bt.f.p(iP2);
        }
        this.f200679n = iP2;
        for (int i25 = 0; i25 < this.f200683s.size(); i25++) {
            iS2 += bt.f.s(8, this.f200683s.get(i25));
        }
        for (int i26 = 0; i26 < this.f200684t.size(); i26++) {
            iS2 += bt.f.s(9, this.f200684t.get(i26));
        }
        for (int i27 = 0; i27 < this.f200685v.size(); i27++) {
            iS2 += bt.f.s(10, this.f200685v.get(i27));
        }
        for (int i28 = 0; i28 < this.f200686w.size(); i28++) {
            iS2 += bt.f.s(11, this.f200686w.get(i28));
        }
        for (int i29 = 0; i29 < this.f200687x.size(); i29++) {
            iS2 += bt.f.s(13, this.f200687x.get(i29));
        }
        int iP3 = 0;
        for (int i35 = 0; i35 < this.f200688y.size(); i35++) {
            iP3 += bt.f.p(this.f200688y.get(i35).intValue());
        }
        int iS3 = iS2 + iP3;
        if (!Z0().isEmpty()) {
            iS3 = iS3 + 2 + bt.f.p(iP3);
        }
        this.f200689z = iP3;
        if ((this.f200670d & 8) == 8) {
            iS3 += bt.f.o(17, this.A);
        }
        if ((this.f200670d & 16) == 16) {
            iS3 += bt.f.s(18, this.B);
        }
        if ((this.f200670d & 32) == 32) {
            iS3 += bt.f.o(19, this.C);
        }
        for (int i36 = 0; i36 < this.f200680p.size(); i36++) {
            iS3 += bt.f.s(20, this.f200680p.get(i36));
        }
        int iP4 = 0;
        for (int i37 = 0; i37 < this.f200681q.size(); i37++) {
            iP4 += bt.f.p(this.f200681q.get(i37).intValue());
        }
        int iS4 = iS3 + iP4;
        if (!G0().isEmpty()) {
            iS4 = iS4 + 2 + bt.f.p(iP4);
        }
        this.f200682r = iP4;
        for (int i38 = 0; i38 < this.D.size(); i38++) {
            iS4 += bt.f.s(25, this.D.get(i38));
        }
        if ((this.f200670d & 64) == 64) {
            iS4 += bt.f.s(30, this.E);
        }
        int iP5 = 0;
        for (int i39 = 0; i39 < this.F.size(); i39++) {
            iP5 += bt.f.p(this.F.get(i39).intValue());
        }
        int size = iS4 + iP5 + (l1().size() * 2);
        if ((this.f200670d & 128) == 128) {
            size += bt.f.s(32, this.G);
        }
        for (int i45 = 0; i45 < this.H.size(); i45++) {
            size += bt.f.s(33, this.H.get(i45));
        }
        int iV = size + v() + this.f200669c.size();
        this.K = iV;
        return iV;
    }

    public s e1(int i15) {
        return this.f200686w.get(i15);
    }

    public int f1() {
        return this.f200686w.size();
    }

    public List<s> g1() {
        return this.f200686w;
    }

    public t h1(int i15) {
        return this.f200674h.get(i15);
    }

    public int i1() {
        return this.f200674h.size();
    }

    @Override // bt.i, bt.q
    public bt.s<c> j() {
        return O;
    }

    public List<t> j1() {
        return this.f200674h;
    }

    public u k1() {
        return this.E;
    }

    public List<Integer> l1() {
        return this.F;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        bt.i.d<MessageType>.a aVarC = C();
        if ((this.f200670d & 1) == 1) {
            fVar.a0(1, this.f200671e);
        }
        if (c1().size() > 0) {
            fVar.o0(18);
            fVar.o0(this.f200677l);
        }
        for (int i15 = 0; i15 < this.f200676k.size(); i15++) {
            fVar.b0(this.f200676k.get(i15).intValue());
        }
        if ((this.f200670d & 2) == 2) {
            fVar.a0(3, this.f200672f);
        }
        if ((this.f200670d & 4) == 4) {
            fVar.a0(4, this.f200673g);
        }
        for (int i16 = 0; i16 < this.f200674h.size(); i16++) {
            fVar.d0(5, this.f200674h.get(i16));
        }
        for (int i17 = 0; i17 < this.f200675j.size(); i17++) {
            fVar.d0(6, this.f200675j.get(i17));
        }
        if (V0().size() > 0) {
            fVar.o0(58);
            fVar.o0(this.f200679n);
        }
        for (int i18 = 0; i18 < this.f200678m.size(); i18++) {
            fVar.b0(this.f200678m.get(i18).intValue());
        }
        for (int i19 = 0; i19 < this.f200683s.size(); i19++) {
            fVar.d0(8, this.f200683s.get(i19));
        }
        for (int i25 = 0; i25 < this.f200684t.size(); i25++) {
            fVar.d0(9, this.f200684t.get(i25));
        }
        for (int i26 = 0; i26 < this.f200685v.size(); i26++) {
            fVar.d0(10, this.f200685v.get(i26));
        }
        for (int i27 = 0; i27 < this.f200686w.size(); i27++) {
            fVar.d0(11, this.f200686w.get(i27));
        }
        for (int i28 = 0; i28 < this.f200687x.size(); i28++) {
            fVar.d0(13, this.f200687x.get(i28));
        }
        if (Z0().size() > 0) {
            fVar.o0(130);
            fVar.o0(this.f200689z);
        }
        for (int i29 = 0; i29 < this.f200688y.size(); i29++) {
            fVar.b0(this.f200688y.get(i29).intValue());
        }
        if ((this.f200670d & 8) == 8) {
            fVar.a0(17, this.A);
        }
        if ((this.f200670d & 16) == 16) {
            fVar.d0(18, this.B);
        }
        if ((this.f200670d & 32) == 32) {
            fVar.a0(19, this.C);
        }
        for (int i35 = 0; i35 < this.f200680p.size(); i35++) {
            fVar.d0(20, this.f200680p.get(i35));
        }
        if (G0().size() > 0) {
            fVar.o0(170);
            fVar.o0(this.f200682r);
        }
        for (int i36 = 0; i36 < this.f200681q.size(); i36++) {
            fVar.b0(this.f200681q.get(i36).intValue());
        }
        for (int i37 = 0; i37 < this.D.size(); i37++) {
            fVar.d0(25, this.D.get(i37));
        }
        if ((this.f200670d & 64) == 64) {
            fVar.d0(30, this.E);
        }
        for (int i38 = 0; i38 < this.F.size(); i38++) {
            fVar.a0(31, this.F.get(i38).intValue());
        }
        if ((this.f200670d & 128) == 128) {
            fVar.d0(32, this.G);
        }
        for (int i39 = 0; i39 < this.H.size(); i39++) {
            fVar.d0(33, this.H.get(i39));
        }
        aVarC.a(19000, fVar);
        fVar.i0(this.f200669c);
    }

    public x m1() {
        return this.G;
    }

    public boolean n1() {
        return (this.f200670d & 4) == 4;
    }

    public boolean o1() {
        return (this.f200670d & 1) == 1;
    }

    public boolean p1() {
        return (this.f200670d & 2) == 2;
    }

    public boolean q1() {
        return (this.f200670d & 8) == 8;
    }

    public boolean r1() {
        return (this.f200670d & 16) == 16;
    }

    public boolean s1() {
        return (this.f200670d & 32) == 32;
    }

    public boolean t1() {
        return (this.f200670d & 64) == 64;
    }

    public boolean u1() {
        return (this.f200670d & 128) == 128;
    }

    public us.b v0(int i15) {
        return this.D.get(i15);
    }

    public int w0() {
        return this.D.size();
    }

    public List<us.b> x0() {
        return this.D;
    }

    public int y0() {
        return this.f200673g;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public b g() {
        return w1();
    }

    public d z0(int i15) {
        return this.H.get(i15);
    }

    private c(bt.i.c<c, ?> cVar) {
        super(cVar);
        this.f200677l = -1;
        this.f200679n = -1;
        this.f200682r = -1;
        this.f200689z = -1;
        this.I = (byte) -1;
        this.K = -1;
        this.f200669c = cVar.p();
    }

    private c(boolean z15) {
        this.f200677l = -1;
        this.f200679n = -1;
        this.f200682r = -1;
        this.f200689z = -1;
        this.I = (byte) -1;
        this.K = -1;
        this.f200669c = bt.d.f21388a;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    private c(bt.e r22, bt.g r23) {
        /*
            Method dump skipped, instruction units count: 1602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us.c.<init>(bt.e, bt.g):void");
    }
}
