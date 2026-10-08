package us;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.asn1.x509.DisplayText;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends bt.i.d<r> implements bt.r {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final r f200991x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static bt.s<r> f200992y = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bt.d f200993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f200994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<b> f200995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f200996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f200997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f200998h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f200999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f201000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f201001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f201002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f201003n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private r f201004p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f201005q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private r f201006r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f201007s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f201008t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte f201009v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f201010w;

    static class a extends bt.b<r> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public r b(bt.e eVar, bt.g gVar) {
            return new r(eVar, gVar);
        }
    }

    public static final class c extends bt.i.c<r, c> implements bt.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f201031d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f201033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f201034g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f201036j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f201037k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f201038l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f201039m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f201040n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f201042q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f201044s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f201045t;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<b> f201032e = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private r f201035h = r.e0();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private r f201041p = r.e0();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private r f201043r = r.e0();

        private c() {
            H();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c F() {
            return new c();
        }

        private void G() {
            if ((this.f201031d & 1) != 1) {
                this.f201032e = new ArrayList(this.f201032e);
                this.f201031d |= 1;
            }
        }

        private void H() {
        }

        public r A() {
            r rVar = new r(this);
            int i15 = this.f201031d;
            if ((i15 & 1) == 1) {
                this.f201032e = Collections.unmodifiableList(this.f201032e);
                this.f201031d &= -2;
            }
            rVar.f200995e = this.f201032e;
            int i16 = (i15 & 2) != 2 ? 0 : 1;
            rVar.f200996f = this.f201033f;
            if ((i15 & 4) == 4) {
                i16 |= 2;
            }
            rVar.f200997g = this.f201034g;
            if ((i15 & 8) == 8) {
                i16 |= 4;
            }
            rVar.f200998h = this.f201035h;
            if ((i15 & 16) == 16) {
                i16 |= 8;
            }
            rVar.f200999j = this.f201036j;
            if ((i15 & 32) == 32) {
                i16 |= 16;
            }
            rVar.f201000k = this.f201037k;
            if ((i15 & 64) == 64) {
                i16 |= 32;
            }
            rVar.f201001l = this.f201038l;
            if ((i15 & 128) == 128) {
                i16 |= 64;
            }
            rVar.f201002m = this.f201039m;
            if ((i15 & 256) == 256) {
                i16 |= 128;
            }
            rVar.f201003n = this.f201040n;
            if ((i15 & 512) == 512) {
                i16 |= 256;
            }
            rVar.f201004p = this.f201041p;
            if ((i15 & 1024) == 1024) {
                i16 |= 512;
            }
            rVar.f201005q = this.f201042q;
            if ((i15 & 2048) == 2048) {
                i16 |= 1024;
            }
            rVar.f201006r = this.f201043r;
            if ((i15 & PKIFailureInfo.certConfirmed) == 4096) {
                i16 |= 2048;
            }
            rVar.f201007s = this.f201044s;
            if ((i15 & PKIFailureInfo.certRevoked) == 8192) {
                i16 |= PKIFailureInfo.certConfirmed;
            }
            rVar.f201008t = this.f201045t;
            rVar.f200994d = i16;
            return rVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public c o() {
            return F().q(A());
        }

        public c I(r rVar) {
            if ((this.f201031d & 2048) != 2048 || this.f201043r == r.e0()) {
                this.f201043r = rVar;
            } else {
                this.f201043r = r.F0(this.f201043r).q(rVar).A();
            }
            this.f201031d |= 2048;
            return this;
        }

        public c J(r rVar) {
            if ((this.f201031d & 8) != 8 || this.f201035h == r.e0()) {
                this.f201035h = rVar;
            } else {
                this.f201035h = r.F0(this.f201035h).q(rVar).A();
            }
            this.f201031d |= 8;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public c l(bt.e eVar, bt.g gVar) throws Throwable {
            r rVar = null;
            try {
                try {
                    r rVarB = r.f200992y.b(eVar, gVar);
                    if (rVarB != null) {
                        q(rVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    r rVar2 = (r) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        rVar = rVar2;
                        if (rVar != null) {
                            q(rVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (rVar != null) {
                    q(rVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public c q(r rVar) {
            if (rVar == r.e0()) {
                return this;
            }
            if (!rVar.f200995e.isEmpty()) {
                if (this.f201032e.isEmpty()) {
                    this.f201032e = rVar.f200995e;
                    this.f201031d &= -2;
                } else {
                    G();
                    this.f201032e.addAll(rVar.f200995e);
                }
            }
            if (rVar.x0()) {
                U(rVar.k0());
            }
            if (rVar.u0()) {
                S(rVar.h0());
            }
            if (rVar.v0()) {
                J(rVar.i0());
            }
            if (rVar.w0()) {
                T(rVar.j0());
            }
            if (rVar.s0()) {
                Q(rVar.d0());
            }
            if (rVar.B0()) {
                Y(rVar.o0());
            }
            if (rVar.C0()) {
                a0(rVar.p0());
            }
            if (rVar.A0()) {
                X(rVar.n0());
            }
            if (rVar.y0()) {
                O(rVar.l0());
            }
            if (rVar.z0()) {
                W(rVar.m0());
            }
            if (rVar.q0()) {
                I(rVar.X());
            }
            if (rVar.r0()) {
                P(rVar.Y());
            }
            if (rVar.t0()) {
                R(rVar.g0());
            }
            x(rVar);
            s(p().f(rVar.f200993c));
            return this;
        }

        public c O(r rVar) {
            if ((this.f201031d & 512) != 512 || this.f201041p == r.e0()) {
                this.f201041p = rVar;
            } else {
                this.f201041p = r.F0(this.f201041p).q(rVar).A();
            }
            this.f201031d |= 512;
            return this;
        }

        public c P(int i15) {
            this.f201031d |= PKIFailureInfo.certConfirmed;
            this.f201044s = i15;
            return this;
        }

        public c Q(int i15) {
            this.f201031d |= 32;
            this.f201037k = i15;
            return this;
        }

        public c R(int i15) {
            this.f201031d |= PKIFailureInfo.certRevoked;
            this.f201045t = i15;
            return this;
        }

        public c S(int i15) {
            this.f201031d |= 4;
            this.f201034g = i15;
            return this;
        }

        public c T(int i15) {
            this.f201031d |= 16;
            this.f201036j = i15;
            return this;
        }

        public c U(boolean z15) {
            this.f201031d |= 2;
            this.f201033f = z15;
            return this;
        }

        public c W(int i15) {
            this.f201031d |= 1024;
            this.f201042q = i15;
            return this;
        }

        public c X(int i15) {
            this.f201031d |= 256;
            this.f201040n = i15;
            return this;
        }

        public c Y(int i15) {
            this.f201031d |= 64;
            this.f201038l = i15;
            return this;
        }

        public c a0(int i15) {
            this.f201031d |= 128;
            this.f201039m = i15;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public r build() {
            r rVarA = A();
            if (rVarA.c()) {
                return rVarA;
            }
            throw bt.a.AbstractC0557a.n(rVarA);
        }
    }

    static {
        r rVar = new r(true);
        f200991x = rVar;
        rVar.D0();
    }

    private void D0() {
        this.f200995e = Collections.EMPTY_LIST;
        this.f200996f = false;
        this.f200997g = 0;
        this.f200998h = e0();
        this.f200999j = 0;
        this.f201000k = 0;
        this.f201001l = 0;
        this.f201002m = 0;
        this.f201003n = 0;
        this.f201004p = e0();
        this.f201005q = 0;
        this.f201006r = e0();
        this.f201007s = 0;
        this.f201008t = 0;
    }

    public static c E0() {
        return c.F();
    }

    public static c F0(r rVar) {
        return E0().q(rVar);
    }

    public static r e0() {
        return f200991x;
    }

    public boolean A0() {
        return (this.f200994d & 128) == 128;
    }

    public boolean B0() {
        return (this.f200994d & 32) == 32;
    }

    public boolean C0() {
        return (this.f200994d & 64) == 64;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public c g() {
        return E0();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public c b() {
        return F0(this);
    }

    public r X() {
        return this.f201006r;
    }

    public int Y() {
        return this.f201007s;
    }

    public b a0(int i15) {
        return this.f200995e.get(i15);
    }

    public int b0() {
        return this.f200995e.size();
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f201009v;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        for (int i15 = 0; i15 < b0(); i15++) {
            if (!a0(i15).c()) {
                this.f201009v = (byte) 0;
                return false;
            }
        }
        if (v0() && !i0().c()) {
            this.f201009v = (byte) 0;
            return false;
        }
        if (y0() && !l0().c()) {
            this.f201009v = (byte) 0;
            return false;
        }
        if (q0() && !X().c()) {
            this.f201009v = (byte) 0;
            return false;
        }
        if (u()) {
            this.f201009v = (byte) 1;
            return true;
        }
        this.f201009v = (byte) 0;
        return false;
    }

    public List<b> c0() {
        return this.f200995e;
    }

    public int d0() {
        return this.f201000k;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f201010w;
        if (i15 != -1) {
            return i15;
        }
        int iO = (this.f200994d & PKIFailureInfo.certConfirmed) == 4096 ? bt.f.o(1, this.f201008t) : 0;
        for (int i16 = 0; i16 < this.f200995e.size(); i16++) {
            iO += bt.f.s(2, this.f200995e.get(i16));
        }
        if ((this.f200994d & 1) == 1) {
            iO += bt.f.a(3, this.f200996f);
        }
        if ((this.f200994d & 2) == 2) {
            iO += bt.f.o(4, this.f200997g);
        }
        if ((this.f200994d & 4) == 4) {
            iO += bt.f.s(5, this.f200998h);
        }
        if ((this.f200994d & 16) == 16) {
            iO += bt.f.o(6, this.f201000k);
        }
        if ((this.f200994d & 32) == 32) {
            iO += bt.f.o(7, this.f201001l);
        }
        if ((this.f200994d & 8) == 8) {
            iO += bt.f.o(8, this.f200999j);
        }
        if ((this.f200994d & 64) == 64) {
            iO += bt.f.o(9, this.f201002m);
        }
        if ((this.f200994d & 256) == 256) {
            iO += bt.f.s(10, this.f201004p);
        }
        if ((this.f200994d & 512) == 512) {
            iO += bt.f.o(11, this.f201005q);
        }
        if ((this.f200994d & 128) == 128) {
            iO += bt.f.o(12, this.f201003n);
        }
        if ((this.f200994d & 1024) == 1024) {
            iO += bt.f.s(13, this.f201006r);
        }
        if ((this.f200994d & 2048) == 2048) {
            iO += bt.f.o(14, this.f201007s);
        }
        int iV = iO + v() + this.f200993c.size();
        this.f201010w = iV;
        return iV;
    }

    @Override // bt.r
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public r i() {
        return f200991x;
    }

    public int g0() {
        return this.f201008t;
    }

    public int h0() {
        return this.f200997g;
    }

    public r i0() {
        return this.f200998h;
    }

    @Override // bt.i, bt.q
    public bt.s<r> j() {
        return f200992y;
    }

    public int j0() {
        return this.f200999j;
    }

    public boolean k0() {
        return this.f200996f;
    }

    public r l0() {
        return this.f201004p;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        bt.i.d<MessageType>.a aVarC = C();
        if ((this.f200994d & PKIFailureInfo.certConfirmed) == 4096) {
            fVar.a0(1, this.f201008t);
        }
        for (int i15 = 0; i15 < this.f200995e.size(); i15++) {
            fVar.d0(2, this.f200995e.get(i15));
        }
        if ((this.f200994d & 1) == 1) {
            fVar.L(3, this.f200996f);
        }
        if ((this.f200994d & 2) == 2) {
            fVar.a0(4, this.f200997g);
        }
        if ((this.f200994d & 4) == 4) {
            fVar.d0(5, this.f200998h);
        }
        if ((this.f200994d & 16) == 16) {
            fVar.a0(6, this.f201000k);
        }
        if ((this.f200994d & 32) == 32) {
            fVar.a0(7, this.f201001l);
        }
        if ((this.f200994d & 8) == 8) {
            fVar.a0(8, this.f200999j);
        }
        if ((this.f200994d & 64) == 64) {
            fVar.a0(9, this.f201002m);
        }
        if ((this.f200994d & 256) == 256) {
            fVar.d0(10, this.f201004p);
        }
        if ((this.f200994d & 512) == 512) {
            fVar.a0(11, this.f201005q);
        }
        if ((this.f200994d & 128) == 128) {
            fVar.a0(12, this.f201003n);
        }
        if ((this.f200994d & 1024) == 1024) {
            fVar.d0(13, this.f201006r);
        }
        if ((this.f200994d & 2048) == 2048) {
            fVar.a0(14, this.f201007s);
        }
        aVarC.a(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, fVar);
        fVar.i0(this.f200993c);
    }

    public int m0() {
        return this.f201005q;
    }

    public int n0() {
        return this.f201003n;
    }

    public int o0() {
        return this.f201001l;
    }

    public int p0() {
        return this.f201002m;
    }

    public boolean q0() {
        return (this.f200994d & 1024) == 1024;
    }

    public boolean r0() {
        return (this.f200994d & 2048) == 2048;
    }

    public boolean s0() {
        return (this.f200994d & 16) == 16;
    }

    public boolean t0() {
        return (this.f200994d & PKIFailureInfo.certConfirmed) == 4096;
    }

    public boolean u0() {
        return (this.f200994d & 2) == 2;
    }

    public boolean v0() {
        return (this.f200994d & 4) == 4;
    }

    public boolean w0() {
        return (this.f200994d & 8) == 8;
    }

    public boolean x0() {
        return (this.f200994d & 1) == 1;
    }

    public boolean y0() {
        return (this.f200994d & 256) == 256;
    }

    public boolean z0() {
        return (this.f200994d & 512) == 512;
    }

    public static final class b extends bt.i implements bt.r {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final b f201011j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static bt.s<b> f201012k = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bt.d f201013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f201014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f201015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private r f201016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f201017f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f201018g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f201019h;

        static class a extends bt.b<b> {
            a() {
            }

            @Override // bt.s
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public b b(bt.e eVar, bt.g gVar) {
                return new b(eVar, gVar);
            }
        }

        /* JADX INFO: renamed from: us.r$b$b, reason: collision with other inner class name */
        public static final class C5228b extends bt.i.b<b, C5228b> implements bt.r {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f201020b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private c f201021c = c.INV;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private r f201022d = r.e0();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f201023e;

            private C5228b() {
                z();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C5228b y() {
                return new C5228b();
            }

            private void z() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // bt.a.AbstractC0557a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public C5228b l(bt.e eVar, bt.g gVar) throws Throwable {
                b bVar = null;
                try {
                    try {
                        b bVarB = b.f201012k.b(eVar, gVar);
                        if (bVarB != null) {
                            q(bVarB);
                        }
                        return this;
                    } catch (bt.k e15) {
                        b bVar2 = (b) e15.a();
                        try {
                            throw e15;
                        } catch (Throwable th4) {
                            th = th4;
                            bVar = bVar2;
                            if (bVar != null) {
                                q(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (bVar != null) {
                        q(bVar);
                    }
                    throw th;
                }
            }

            @Override // bt.i.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public C5228b q(b bVar) {
                if (bVar == b.A()) {
                    return this;
                }
                if (bVar.E()) {
                    G(bVar.B());
                }
                if (bVar.F()) {
                    F(bVar.C());
                }
                if (bVar.G()) {
                    H(bVar.D());
                }
                s(p().f(bVar.f201013b));
                return this;
            }

            public C5228b F(r rVar) {
                if ((this.f201020b & 2) != 2 || this.f201022d == r.e0()) {
                    this.f201022d = rVar;
                } else {
                    this.f201022d = r.F0(this.f201022d).q(rVar).A();
                }
                this.f201020b |= 2;
                return this;
            }

            public C5228b G(c cVar) {
                cVar.getClass();
                this.f201020b |= 1;
                this.f201021c = cVar;
                return this;
            }

            public C5228b H(int i15) {
                this.f201020b |= 4;
                this.f201023e = i15;
                return this;
            }

            @Override // bt.q.a
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b build() {
                b bVarW = w();
                if (bVarW.c()) {
                    return bVarW;
                }
                throw bt.a.AbstractC0557a.n(bVarW);
            }

            public b w() {
                b bVar = new b(this);
                int i15 = this.f201020b;
                int i16 = (i15 & 1) != 1 ? 0 : 1;
                bVar.f201015d = this.f201021c;
                if ((i15 & 2) == 2) {
                    i16 |= 2;
                }
                bVar.f201016e = this.f201022d;
                if ((i15 & 4) == 4) {
                    i16 |= 4;
                }
                bVar.f201017f = this.f201023e;
                bVar.f201014c = i16;
                return bVar;
            }

            @Override // bt.i.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public C5228b o() {
                return y().q(w());
            }
        }

        public enum c implements bt.j.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);


            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static bt.j.b<c> f201028f = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f201030a;

            static class a implements bt.j.b<c> {
                a() {
                }

                @Override // bt.j.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public c a(int i15) {
                    return c.b(i15);
                }
            }

            c(int i15, int i16) {
                this.f201030a = i16;
            }

            public static c b(int i15) {
                if (i15 == 0) {
                    return IN;
                }
                if (i15 == 1) {
                    return OUT;
                }
                if (i15 == 2) {
                    return INV;
                }
                if (i15 != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // bt.j.a
            public final int h() {
                return this.f201030a;
            }
        }

        static {
            b bVar = new b(true);
            f201011j = bVar;
            bVar.H();
        }

        public static b A() {
            return f201011j;
        }

        private void H() {
            this.f201015d = c.INV;
            this.f201016e = r.e0();
            this.f201017f = 0;
        }

        public static C5228b I() {
            return C5228b.y();
        }

        public static C5228b J(b bVar) {
            return I().q(bVar);
        }

        public c B() {
            return this.f201015d;
        }

        public r C() {
            return this.f201016e;
        }

        public int D() {
            return this.f201017f;
        }

        public boolean E() {
            return (this.f201014c & 1) == 1;
        }

        public boolean F() {
            return (this.f201014c & 2) == 2;
        }

        public boolean G() {
            return (this.f201014c & 4) == 4;
        }

        @Override // bt.q
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public C5228b g() {
            return I();
        }

        @Override // bt.q
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public C5228b b() {
            return J(this);
        }

        @Override // bt.r
        public final boolean c() {
            byte b15 = this.f201018g;
            if (b15 == 1) {
                return true;
            }
            if (b15 == 0) {
                return false;
            }
            if (!F() || C().c()) {
                this.f201018g = (byte) 1;
                return true;
            }
            this.f201018g = (byte) 0;
            return false;
        }

        @Override // bt.q
        public int e() {
            int i15 = this.f201019h;
            if (i15 != -1) {
                return i15;
            }
            int iH = (this.f201014c & 1) == 1 ? bt.f.h(1, this.f201015d.h()) : 0;
            if ((this.f201014c & 2) == 2) {
                iH += bt.f.s(2, this.f201016e);
            }
            if ((this.f201014c & 4) == 4) {
                iH += bt.f.o(3, this.f201017f);
            }
            int size = iH + this.f201013b.size();
            this.f201019h = size;
            return size;
        }

        @Override // bt.i, bt.q
        public bt.s<b> j() {
            return f201012k;
        }

        @Override // bt.q
        public void m(bt.f fVar) throws IOException {
            e();
            if ((this.f201014c & 1) == 1) {
                fVar.S(1, this.f201015d.h());
            }
            if ((this.f201014c & 2) == 2) {
                fVar.d0(2, this.f201016e);
            }
            if ((this.f201014c & 4) == 4) {
                fVar.a0(3, this.f201017f);
            }
            fVar.i0(this.f201013b);
        }

        private b(bt.i.b bVar) {
            super(bVar);
            this.f201018g = (byte) -1;
            this.f201019h = -1;
            this.f201013b = bVar.p();
        }

        private b(boolean z15) {
            this.f201018g = (byte) -1;
            this.f201019h = -1;
            this.f201013b = bt.d.f21388a;
        }

        private b(bt.e eVar, bt.g gVar) {
            this.f201018g = (byte) -1;
            this.f201019h = -1;
            H();
            bt.d.b bVarU = bt.d.u();
            bt.f fVarJ = bt.f.J(bVarU, 1);
            boolean z15 = false;
            while (!z15) {
                try {
                    try {
                        try {
                            int iK = eVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    int iN = eVar.n();
                                    c cVarB = c.b(iN);
                                    if (cVarB == null) {
                                        fVarJ.o0(iK);
                                        fVarJ.o0(iN);
                                    } else {
                                        this.f201014c |= 1;
                                        this.f201015d = cVarB;
                                    }
                                } else if (iK == 18) {
                                    c cVarB2 = (this.f201014c & 2) == 2 ? this.f201016e.b() : null;
                                    r rVar = (r) eVar.u(r.f200992y, gVar);
                                    this.f201016e = rVar;
                                    if (cVarB2 != null) {
                                        cVarB2.q(rVar);
                                        this.f201016e = cVarB2.A();
                                    }
                                    this.f201014c |= 2;
                                } else if (iK != 24) {
                                    if (!r(eVar, fVarJ, gVar, iK)) {
                                    }
                                } else {
                                    this.f201014c |= 4;
                                    this.f201017f = eVar.s();
                                }
                            }
                            z15 = true;
                        } catch (bt.k e15) {
                            throw e15.i(this);
                        }
                    } catch (IOException e16) {
                        throw new bt.k(e16.getMessage()).i(this);
                    }
                } catch (Throwable th4) {
                    try {
                        fVarJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f201013b = bVarU.r();
                    }
                    n();
                    throw th4;
                }
            }
            try {
                fVarJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f201013b = bVarU.r();
            }
            n();
        }
    }

    private r(bt.i.c<r, ?> cVar) {
        super(cVar);
        this.f201009v = (byte) -1;
        this.f201010w = -1;
        this.f200993c = cVar.p();
    }

    private r(boolean z15) {
        this.f201009v = (byte) -1;
        this.f201010w = -1;
        this.f200993c = bt.d.f21388a;
    }

    private r(bt.e eVar, bt.g gVar) {
        c cVarB;
        this.f201009v = (byte) -1;
        this.f201010w = -1;
        D0();
        bt.d.b bVarU = bt.d.u();
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z15 = false;
        boolean z16 = false;
        while (!z15) {
            try {
                try {
                    try {
                        int iK = eVar.K();
                        switch (iK) {
                            case 0:
                                break;
                            case 8:
                                this.f200994d |= PKIFailureInfo.certConfirmed;
                                this.f201008t = eVar.s();
                                continue;
                            case 18:
                                if (!z16) {
                                    this.f200995e = new ArrayList();
                                    z16 = true;
                                }
                                this.f200995e.add((b) eVar.u(b.f201012k, gVar));
                                continue;
                            case 24:
                                this.f200994d |= 1;
                                this.f200996f = eVar.k();
                                continue;
                            case 32:
                                this.f200994d |= 2;
                                this.f200997g = eVar.s();
                                continue;
                            case EACTags.CURRENCY_CODE /* 42 */:
                                cVarB = (this.f200994d & 4) == 4 ? this.f200998h.b() : null;
                                r rVar = (r) eVar.u(f200992y, gVar);
                                this.f200998h = rVar;
                                if (cVarB != null) {
                                    cVarB.q(rVar);
                                    this.f200998h = cVarB.A();
                                }
                                this.f200994d |= 4;
                                continue;
                            case 48:
                                this.f200994d |= 16;
                                this.f201000k = eVar.s();
                                continue;
                            case 56:
                                this.f200994d |= 32;
                                this.f201001l = eVar.s();
                                continue;
                            case 64:
                                this.f200994d |= 8;
                                this.f200999j = eVar.s();
                                continue;
                            case 72:
                                this.f200994d |= 64;
                                this.f201002m = eVar.s();
                                continue;
                            case EACTags.HISTORICAL_BYTES /* 82 */:
                                cVarB = (this.f200994d & 256) == 256 ? this.f201004p.b() : null;
                                r rVar2 = (r) eVar.u(f200992y, gVar);
                                this.f201004p = rVar2;
                                if (cVarB != null) {
                                    cVarB.q(rVar2);
                                    this.f201004p = cVarB.A();
                                }
                                this.f200994d |= 256;
                                continue;
                            case 88:
                                this.f200994d |= 512;
                                this.f201005q = eVar.s();
                                continue;
                            case 96:
                                this.f200994d |= 128;
                                this.f201003n = eVar.s();
                                continue;
                            case 106:
                                cVarB = (this.f200994d & 1024) == 1024 ? this.f201006r.b() : null;
                                r rVar3 = (r) eVar.u(f200992y, gVar);
                                this.f201006r = rVar3;
                                if (cVarB != null) {
                                    cVarB.q(rVar3);
                                    this.f201006r = cVarB.A();
                                }
                                this.f200994d |= 1024;
                                continue;
                            case 112:
                                this.f200994d |= 2048;
                                this.f201007s = eVar.s();
                                continue;
                            default:
                                if (!r(eVar, fVarJ, gVar, iK)) {
                                    break;
                                }
                                break;
                        }
                        z15 = true;
                    } catch (bt.k e15) {
                        throw e15.i(this);
                    }
                } catch (IOException e16) {
                    throw new bt.k(e16.getMessage()).i(this);
                }
            } catch (Throwable th4) {
                if (z16) {
                    this.f200995e = Collections.unmodifiableList(this.f200995e);
                }
                try {
                    fVarJ.I();
                } catch (IOException unused) {
                } finally {
                    this.f200993c = bVarU.r();
                }
                n();
                throw th4;
            }
        }
        if (z16) {
            this.f200995e = Collections.unmodifiableList(this.f200995e);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f200993c = bVarU.r();
        }
        n();
    }
}
