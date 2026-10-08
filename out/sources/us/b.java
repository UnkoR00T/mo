package us;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends bt.i implements bt.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f200602h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static bt.s<b> f200603j = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt.d f200604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f200605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f200606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<C5222b> f200607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f200608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f200609g;

    static class a extends bt.b<b> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b b(bt.e eVar, bt.g gVar) {
            return new b(eVar, gVar);
        }
    }

    /* JADX INFO: renamed from: us.b$b, reason: collision with other inner class name */
    public static final class C5222b extends bt.i implements bt.r {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final C5222b f200610h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static bt.s<C5222b> f200611j = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bt.d f200612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f200613c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f200614d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f200615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f200616f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f200617g;

        /* JADX INFO: renamed from: us.b$b$a */
        static class a extends bt.b<C5222b> {
            a() {
            }

            @Override // bt.s
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public C5222b b(bt.e eVar, bt.g gVar) {
                return new C5222b(eVar, gVar);
            }
        }

        /* JADX INFO: renamed from: us.b$b$b, reason: collision with other inner class name */
        public static final class C5223b extends bt.i.b<C5222b, C5223b> implements bt.r {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f200618b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f200619c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private c f200620d = c.Q();

            private C5223b() {
                z();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static C5223b y() {
                return new C5223b();
            }

            private void z() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // bt.a.AbstractC0557a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public C5223b l(bt.e eVar, bt.g gVar) throws Throwable {
                C5222b c5222b = null;
                try {
                    try {
                        C5222b c5222bB = C5222b.f200611j.b(eVar, gVar);
                        if (c5222bB != null) {
                            q(c5222bB);
                        }
                        return this;
                    } catch (bt.k e15) {
                        C5222b c5222b2 = (C5222b) e15.a();
                        try {
                            throw e15;
                        } catch (Throwable th4) {
                            th = th4;
                            c5222b = c5222b2;
                            if (c5222b != null) {
                                q(c5222b);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (c5222b != null) {
                        q(c5222b);
                    }
                    throw th;
                }
            }

            @Override // bt.i.b
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public C5223b q(C5222b c5222b) {
                if (c5222b == C5222b.y()) {
                    return this;
                }
                if (c5222b.C()) {
                    G(c5222b.A());
                }
                if (c5222b.D()) {
                    F(c5222b.B());
                }
                s(p().f(c5222b.f200612b));
                return this;
            }

            public C5223b F(c cVar) {
                if ((this.f200618b & 2) != 2 || this.f200620d == c.Q()) {
                    this.f200620d = cVar;
                } else {
                    this.f200620d = c.m0(this.f200620d).q(cVar).w();
                }
                this.f200618b |= 2;
                return this;
            }

            public C5223b G(int i15) {
                this.f200618b |= 1;
                this.f200619c = i15;
                return this;
            }

            @Override // bt.q.a
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public C5222b build() {
                C5222b c5222bW = w();
                if (c5222bW.c()) {
                    return c5222bW;
                }
                throw bt.a.AbstractC0557a.n(c5222bW);
            }

            public C5222b w() {
                C5222b c5222b = new C5222b(this);
                int i15 = this.f200618b;
                int i16 = (i15 & 1) != 1 ? 0 : 1;
                c5222b.f200614d = this.f200619c;
                if ((i15 & 2) == 2) {
                    i16 |= 2;
                }
                c5222b.f200615e = this.f200620d;
                c5222b.f200613c = i16;
                return c5222b;
            }

            @Override // bt.i.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public C5223b o() {
                return y().q(w());
            }
        }

        static {
            C5222b c5222b = new C5222b(true);
            f200610h = c5222b;
            c5222b.E();
        }

        private void E() {
            this.f200614d = 0;
            this.f200615e = c.Q();
        }

        public static C5223b F() {
            return C5223b.y();
        }

        public static C5223b G(C5222b c5222b) {
            return F().q(c5222b);
        }

        public static C5222b y() {
            return f200610h;
        }

        public int A() {
            return this.f200614d;
        }

        public c B() {
            return this.f200615e;
        }

        public boolean C() {
            return (this.f200613c & 1) == 1;
        }

        public boolean D() {
            return (this.f200613c & 2) == 2;
        }

        @Override // bt.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public C5223b g() {
            return F();
        }

        @Override // bt.q
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public C5223b b() {
            return G(this);
        }

        @Override // bt.r
        public final boolean c() {
            byte b15 = this.f200616f;
            if (b15 == 1) {
                return true;
            }
            if (b15 == 0) {
                return false;
            }
            if (!C()) {
                this.f200616f = (byte) 0;
                return false;
            }
            if (!D()) {
                this.f200616f = (byte) 0;
                return false;
            }
            if (B().c()) {
                this.f200616f = (byte) 1;
                return true;
            }
            this.f200616f = (byte) 0;
            return false;
        }

        @Override // bt.q
        public int e() {
            int i15 = this.f200617g;
            if (i15 != -1) {
                return i15;
            }
            int iO = (this.f200613c & 1) == 1 ? bt.f.o(1, this.f200614d) : 0;
            if ((this.f200613c & 2) == 2) {
                iO += bt.f.s(2, this.f200615e);
            }
            int size = iO + this.f200612b.size();
            this.f200617g = size;
            return size;
        }

        @Override // bt.i, bt.q
        public bt.s<C5222b> j() {
            return f200611j;
        }

        @Override // bt.q
        public void m(bt.f fVar) throws IOException {
            e();
            if ((this.f200613c & 1) == 1) {
                fVar.a0(1, this.f200614d);
            }
            if ((this.f200613c & 2) == 2) {
                fVar.d0(2, this.f200615e);
            }
            fVar.i0(this.f200612b);
        }

        /* JADX INFO: renamed from: us.b$b$c */
        public static final class c extends bt.i implements bt.r {

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private static final c f200621s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static bt.s<c> f200622t = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final bt.d f200623b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f200624c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private EnumC5225c f200625d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private long f200626e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private float f200627f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private double f200628g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private int f200629h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private int f200630j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private int f200631k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private b f200632l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private List<c> f200633m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f200634n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private int f200635p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private byte f200636q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private int f200637r;

            /* JADX INFO: renamed from: us.b$b$c$a */
            static class a extends bt.b<c> {
                a() {
                }

                @Override // bt.s
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public c b(bt.e eVar, bt.g gVar) {
                    return new c(eVar, gVar);
                }
            }

            /* JADX INFO: renamed from: us.b$b$c$b, reason: collision with other inner class name */
            public static final class C5224b extends bt.i.b<c, C5224b> implements bt.r {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private int f200638b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private long f200640d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private float f200641e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private double f200642f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private int f200643g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private int f200644h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private int f200645j;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private int f200648m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private int f200649n;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private EnumC5225c f200639c = EnumC5225c.BYTE;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                private b f200646k = b.D();

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private List<c> f200647l = Collections.EMPTY_LIST;

                private C5224b() {
                    A();
                }

                private void A() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static C5224b y() {
                    return new C5224b();
                }

                private void z() {
                    if ((this.f200638b & 256) != 256) {
                        this.f200647l = new ArrayList(this.f200647l);
                        this.f200638b |= 256;
                    }
                }

                public C5224b D(b bVar) {
                    if ((this.f200638b & 128) != 128 || this.f200646k == b.D()) {
                        this.f200646k = bVar;
                    } else {
                        this.f200646k = b.I(this.f200646k).q(bVar).w();
                    }
                    this.f200638b |= 128;
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // bt.a.AbstractC0557a
                /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
                public C5224b l(bt.e eVar, bt.g gVar) throws Throwable {
                    c cVar = null;
                    try {
                        try {
                            c cVarB = c.f200622t.b(eVar, gVar);
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
                /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
                public C5224b q(c cVar) {
                    if (cVar == c.Q()) {
                        return this;
                    }
                    if (cVar.j0()) {
                        R(cVar.Y());
                    }
                    if (cVar.h0()) {
                        P(cVar.W());
                    }
                    if (cVar.g0()) {
                        O(cVar.V());
                    }
                    if (cVar.d0()) {
                        J(cVar.R());
                    }
                    if (cVar.i0()) {
                        Q(cVar.X());
                    }
                    if (cVar.c0()) {
                        I(cVar.O());
                    }
                    if (cVar.e0()) {
                        K(cVar.T());
                    }
                    if (cVar.a0()) {
                        D(cVar.J());
                    }
                    if (!cVar.f200633m.isEmpty()) {
                        if (this.f200647l.isEmpty()) {
                            this.f200647l = cVar.f200633m;
                            this.f200638b &= -257;
                        } else {
                            z();
                            this.f200647l.addAll(cVar.f200633m);
                        }
                    }
                    if (cVar.b0()) {
                        H(cVar.K());
                    }
                    if (cVar.f0()) {
                        N(cVar.U());
                    }
                    s(p().f(cVar.f200623b));
                    return this;
                }

                public C5224b H(int i15) {
                    this.f200638b |= 512;
                    this.f200648m = i15;
                    return this;
                }

                public C5224b I(int i15) {
                    this.f200638b |= 32;
                    this.f200644h = i15;
                    return this;
                }

                public C5224b J(double d15) {
                    this.f200638b |= 8;
                    this.f200642f = d15;
                    return this;
                }

                public C5224b K(int i15) {
                    this.f200638b |= 64;
                    this.f200645j = i15;
                    return this;
                }

                public C5224b N(int i15) {
                    this.f200638b |= 1024;
                    this.f200649n = i15;
                    return this;
                }

                public C5224b O(float f15) {
                    this.f200638b |= 4;
                    this.f200641e = f15;
                    return this;
                }

                public C5224b P(long j15) {
                    this.f200638b |= 2;
                    this.f200640d = j15;
                    return this;
                }

                public C5224b Q(int i15) {
                    this.f200638b |= 16;
                    this.f200643g = i15;
                    return this;
                }

                public C5224b R(EnumC5225c enumC5225c) {
                    enumC5225c.getClass();
                    this.f200638b |= 1;
                    this.f200639c = enumC5225c;
                    return this;
                }

                @Override // bt.q.a
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public c build() {
                    c cVarW = w();
                    if (cVarW.c()) {
                        return cVarW;
                    }
                    throw bt.a.AbstractC0557a.n(cVarW);
                }

                public c w() {
                    c cVar = new c(this);
                    int i15 = this.f200638b;
                    int i16 = (i15 & 1) != 1 ? 0 : 1;
                    cVar.f200625d = this.f200639c;
                    if ((i15 & 2) == 2) {
                        i16 |= 2;
                    }
                    cVar.f200626e = this.f200640d;
                    if ((i15 & 4) == 4) {
                        i16 |= 4;
                    }
                    cVar.f200627f = this.f200641e;
                    if ((i15 & 8) == 8) {
                        i16 |= 8;
                    }
                    cVar.f200628g = this.f200642f;
                    if ((i15 & 16) == 16) {
                        i16 |= 16;
                    }
                    cVar.f200629h = this.f200643g;
                    if ((i15 & 32) == 32) {
                        i16 |= 32;
                    }
                    cVar.f200630j = this.f200644h;
                    if ((i15 & 64) == 64) {
                        i16 |= 64;
                    }
                    cVar.f200631k = this.f200645j;
                    if ((i15 & 128) == 128) {
                        i16 |= 128;
                    }
                    cVar.f200632l = this.f200646k;
                    if ((this.f200638b & 256) == 256) {
                        this.f200647l = Collections.unmodifiableList(this.f200647l);
                        this.f200638b &= -257;
                    }
                    cVar.f200633m = this.f200647l;
                    if ((i15 & 512) == 512) {
                        i16 |= 256;
                    }
                    cVar.f200634n = this.f200648m;
                    if ((i15 & 1024) == 1024) {
                        i16 |= 512;
                    }
                    cVar.f200635p = this.f200649n;
                    cVar.f200624c = i16;
                    return cVar;
                }

                @Override // bt.i.b
                /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
                public C5224b o() {
                    return y().q(w());
                }
            }

            /* JADX INFO: renamed from: us.b$b$c$c, reason: collision with other inner class name */
            public enum EnumC5225c implements bt.j.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);


                /* JADX INFO: renamed from: q, reason: collision with root package name */
                private static bt.j.b<EnumC5225c> f200663q = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final int f200665a;

                /* JADX INFO: renamed from: us.b$b$c$c$a */
                static class a implements bt.j.b<EnumC5225c> {
                    a() {
                    }

                    @Override // bt.j.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC5225c a(int i15) {
                        return EnumC5225c.b(i15);
                    }
                }

                EnumC5225c(int i15, int i16) {
                    this.f200665a = i16;
                }

                public static EnumC5225c b(int i15) {
                    switch (i15) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // bt.j.a
                public final int h() {
                    return this.f200665a;
                }
            }

            static {
                c cVar = new c(true);
                f200621s = cVar;
                cVar.k0();
            }

            public static c Q() {
                return f200621s;
            }

            private void k0() {
                this.f200625d = EnumC5225c.BYTE;
                this.f200626e = 0L;
                this.f200627f = 0.0f;
                this.f200628g = 0.0d;
                this.f200629h = 0;
                this.f200630j = 0;
                this.f200631k = 0;
                this.f200632l = b.D();
                this.f200633m = Collections.EMPTY_LIST;
                this.f200634n = 0;
                this.f200635p = 0;
            }

            public static C5224b l0() {
                return C5224b.y();
            }

            public static C5224b m0(c cVar) {
                return l0().q(cVar);
            }

            public b J() {
                return this.f200632l;
            }

            public int K() {
                return this.f200634n;
            }

            public c L(int i15) {
                return this.f200633m.get(i15);
            }

            public int M() {
                return this.f200633m.size();
            }

            public List<c> N() {
                return this.f200633m;
            }

            public int O() {
                return this.f200630j;
            }

            public double R() {
                return this.f200628g;
            }

            public int T() {
                return this.f200631k;
            }

            public int U() {
                return this.f200635p;
            }

            public float V() {
                return this.f200627f;
            }

            public long W() {
                return this.f200626e;
            }

            public int X() {
                return this.f200629h;
            }

            public EnumC5225c Y() {
                return this.f200625d;
            }

            public boolean a0() {
                return (this.f200624c & 128) == 128;
            }

            public boolean b0() {
                return (this.f200624c & 256) == 256;
            }

            @Override // bt.r
            public final boolean c() {
                byte b15 = this.f200636q;
                if (b15 == 1) {
                    return true;
                }
                if (b15 == 0) {
                    return false;
                }
                if (a0() && !J().c()) {
                    this.f200636q = (byte) 0;
                    return false;
                }
                for (int i15 = 0; i15 < M(); i15++) {
                    if (!L(i15).c()) {
                        this.f200636q = (byte) 0;
                        return false;
                    }
                }
                this.f200636q = (byte) 1;
                return true;
            }

            public boolean c0() {
                return (this.f200624c & 32) == 32;
            }

            public boolean d0() {
                return (this.f200624c & 8) == 8;
            }

            @Override // bt.q
            public int e() {
                int i15 = this.f200637r;
                if (i15 != -1) {
                    return i15;
                }
                int iH = (this.f200624c & 1) == 1 ? bt.f.h(1, this.f200625d.h()) : 0;
                if ((this.f200624c & 2) == 2) {
                    iH += bt.f.A(2, this.f200626e);
                }
                if ((this.f200624c & 4) == 4) {
                    iH += bt.f.l(3, this.f200627f);
                }
                if ((this.f200624c & 8) == 8) {
                    iH += bt.f.f(4, this.f200628g);
                }
                if ((this.f200624c & 16) == 16) {
                    iH += bt.f.o(5, this.f200629h);
                }
                if ((this.f200624c & 32) == 32) {
                    iH += bt.f.o(6, this.f200630j);
                }
                if ((this.f200624c & 64) == 64) {
                    iH += bt.f.o(7, this.f200631k);
                }
                if ((this.f200624c & 128) == 128) {
                    iH += bt.f.s(8, this.f200632l);
                }
                for (int i16 = 0; i16 < this.f200633m.size(); i16++) {
                    iH += bt.f.s(9, this.f200633m.get(i16));
                }
                if ((this.f200624c & 512) == 512) {
                    iH += bt.f.o(10, this.f200635p);
                }
                if ((this.f200624c & 256) == 256) {
                    iH += bt.f.o(11, this.f200634n);
                }
                int size = iH + this.f200623b.size();
                this.f200637r = size;
                return size;
            }

            public boolean e0() {
                return (this.f200624c & 64) == 64;
            }

            public boolean f0() {
                return (this.f200624c & 512) == 512;
            }

            public boolean g0() {
                return (this.f200624c & 4) == 4;
            }

            public boolean h0() {
                return (this.f200624c & 2) == 2;
            }

            public boolean i0() {
                return (this.f200624c & 16) == 16;
            }

            @Override // bt.i, bt.q
            public bt.s<c> j() {
                return f200622t;
            }

            public boolean j0() {
                return (this.f200624c & 1) == 1;
            }

            @Override // bt.q
            public void m(bt.f fVar) throws IOException {
                e();
                if ((this.f200624c & 1) == 1) {
                    fVar.S(1, this.f200625d.h());
                }
                if ((this.f200624c & 2) == 2) {
                    fVar.t0(2, this.f200626e);
                }
                if ((this.f200624c & 4) == 4) {
                    fVar.W(3, this.f200627f);
                }
                if ((this.f200624c & 8) == 8) {
                    fVar.Q(4, this.f200628g);
                }
                if ((this.f200624c & 16) == 16) {
                    fVar.a0(5, this.f200629h);
                }
                if ((this.f200624c & 32) == 32) {
                    fVar.a0(6, this.f200630j);
                }
                if ((this.f200624c & 64) == 64) {
                    fVar.a0(7, this.f200631k);
                }
                if ((this.f200624c & 128) == 128) {
                    fVar.d0(8, this.f200632l);
                }
                for (int i15 = 0; i15 < this.f200633m.size(); i15++) {
                    fVar.d0(9, this.f200633m.get(i15));
                }
                if ((this.f200624c & 512) == 512) {
                    fVar.a0(10, this.f200635p);
                }
                if ((this.f200624c & 256) == 256) {
                    fVar.a0(11, this.f200634n);
                }
                fVar.i0(this.f200623b);
            }

            @Override // bt.q
            /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
            public C5224b g() {
                return l0();
            }

            @Override // bt.q
            /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
            public C5224b b() {
                return m0(this);
            }

            private c(bt.i.b bVar) {
                super(bVar);
                this.f200636q = (byte) -1;
                this.f200637r = -1;
                this.f200623b = bVar.p();
            }

            private c(boolean z15) {
                this.f200636q = (byte) -1;
                this.f200637r = -1;
                this.f200623b = bt.d.f21388a;
            }

            private c(bt.e eVar, bt.g gVar) {
                this.f200636q = (byte) -1;
                this.f200637r = -1;
                k0();
                bt.d.b bVarU = bt.d.u();
                bt.f fVarJ = bt.f.J(bVarU, 1);
                boolean z15 = false;
                char c15 = 0;
                while (!z15) {
                    try {
                        try {
                            int iK = eVar.K();
                            switch (iK) {
                                case 0:
                                    break;
                                case 8:
                                    int iN = eVar.n();
                                    EnumC5225c enumC5225cB = EnumC5225c.b(iN);
                                    if (enumC5225cB == null) {
                                        fVarJ.o0(iK);
                                        fVarJ.o0(iN);
                                    } else {
                                        this.f200624c |= 1;
                                        this.f200625d = enumC5225cB;
                                        continue;
                                    }
                                    break;
                                case 16:
                                    this.f200624c |= 2;
                                    this.f200626e = eVar.H();
                                    continue;
                                case 29:
                                    this.f200624c |= 4;
                                    this.f200627f = eVar.q();
                                    continue;
                                case 33:
                                    this.f200624c |= 8;
                                    this.f200628g = eVar.m();
                                    continue;
                                case 40:
                                    this.f200624c |= 16;
                                    this.f200629h = eVar.s();
                                    continue;
                                case 48:
                                    this.f200624c |= 32;
                                    this.f200630j = eVar.s();
                                    continue;
                                case 56:
                                    this.f200624c |= 64;
                                    this.f200631k = eVar.s();
                                    continue;
                                case 66:
                                    c cVarB = (this.f200624c & 128) == 128 ? this.f200632l.b() : null;
                                    b bVar = (b) eVar.u(b.f200603j, gVar);
                                    this.f200632l = bVar;
                                    if (cVarB != null) {
                                        cVarB.q(bVar);
                                        this.f200632l = cVarB.w();
                                    }
                                    this.f200624c |= 128;
                                    continue;
                                case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                                    if ((c15 & 256) != 256) {
                                        this.f200633m = new ArrayList();
                                        c15 = 256;
                                    }
                                    this.f200633m.add((c) eVar.u(f200622t, gVar));
                                    continue;
                                case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                                    this.f200624c |= 512;
                                    this.f200635p = eVar.s();
                                    continue;
                                case 88:
                                    this.f200624c |= 256;
                                    this.f200634n = eVar.s();
                                    continue;
                                default:
                                    if (!r(eVar, fVarJ, gVar, iK)) {
                                        break;
                                    }
                                    break;
                            }
                            z15 = true;
                        } catch (Throwable th4) {
                            if ((c15 & 256) == 256) {
                                this.f200633m = Collections.unmodifiableList(this.f200633m);
                            }
                            try {
                                fVarJ.I();
                            } catch (IOException unused) {
                            } finally {
                                this.f200623b = bVarU.r();
                            }
                            n();
                            throw th4;
                        }
                    } catch (bt.k e15) {
                        throw e15.i(this);
                    } catch (IOException e16) {
                        throw new bt.k(e16.getMessage()).i(this);
                    }
                }
                if ((c15 & 256) == 256) {
                    this.f200633m = Collections.unmodifiableList(this.f200633m);
                }
                try {
                    fVarJ.I();
                } catch (IOException unused2) {
                } finally {
                    this.f200623b = bVarU.r();
                }
                n();
            }
        }

        private C5222b(bt.i.b bVar) {
            super(bVar);
            this.f200616f = (byte) -1;
            this.f200617g = -1;
            this.f200612b = bVar.p();
        }

        private C5222b(boolean z15) {
            this.f200616f = (byte) -1;
            this.f200617g = -1;
            this.f200612b = bt.d.f21388a;
        }

        private C5222b(bt.e eVar, bt.g gVar) {
            this.f200616f = (byte) -1;
            this.f200617g = -1;
            E();
            bt.d.b bVarU = bt.d.u();
            bt.f fVarJ = bt.f.J(bVarU, 1);
            boolean z15 = false;
            while (!z15) {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f200613c |= 1;
                                this.f200614d = eVar.s();
                            } else if (iK != 18) {
                                if (!r(eVar, fVarJ, gVar, iK)) {
                                }
                            } else {
                                c.C5224b c5224bB = (this.f200613c & 2) == 2 ? this.f200615e.b() : null;
                                c cVar = (c) eVar.u(c.f200622t, gVar);
                                this.f200615e = cVar;
                                if (c5224bB != null) {
                                    c5224bB.q(cVar);
                                    this.f200615e = c5224bB.w();
                                }
                                this.f200613c |= 2;
                            }
                        }
                        z15 = true;
                    } catch (Throwable th4) {
                        try {
                            fVarJ.I();
                        } catch (IOException unused) {
                        } finally {
                            this.f200612b = bVarU.r();
                        }
                        n();
                        throw th4;
                    }
                } catch (bt.k e15) {
                    throw e15.i(this);
                } catch (IOException e16) {
                    throw new bt.k(e16.getMessage()).i(this);
                }
            }
            try {
                fVarJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f200612b = bVarU.r();
            }
            n();
        }
    }

    public static final class c extends bt.i.b<b, c> implements bt.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f200666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f200667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<C5222b> f200668d = Collections.EMPTY_LIST;

        private c() {
            A();
        }

        private void A() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c y() {
            return new c();
        }

        private void z() {
            if ((this.f200666b & 2) != 2) {
                this.f200668d = new ArrayList(this.f200668d);
                this.f200666b |= 2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public c l(bt.e eVar, bt.g gVar) throws Throwable {
            b bVar = null;
            try {
                try {
                    b bVarB = b.f200603j.b(eVar, gVar);
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
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public c q(b bVar) {
            if (bVar == b.D()) {
                return this;
            }
            if (bVar.F()) {
                G(bVar.E());
            }
            if (!bVar.f200607e.isEmpty()) {
                if (this.f200668d.isEmpty()) {
                    this.f200668d = bVar.f200607e;
                    this.f200666b &= -3;
                } else {
                    z();
                    this.f200668d.addAll(bVar.f200607e);
                }
            }
            s(p().f(bVar.f200604b));
            return this;
        }

        public c G(int i15) {
            this.f200666b |= 1;
            this.f200667c = i15;
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
            int i15 = (this.f200666b & 1) != 1 ? 0 : 1;
            bVar.f200606d = this.f200667c;
            if ((this.f200666b & 2) == 2) {
                this.f200668d = Collections.unmodifiableList(this.f200668d);
                this.f200666b &= -3;
            }
            bVar.f200607e = this.f200668d;
            bVar.f200605c = i15;
            return bVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public c o() {
            return y().q(w());
        }
    }

    static {
        b bVar = new b(true);
        f200602h = bVar;
        bVar.G();
    }

    public static b D() {
        return f200602h;
    }

    private void G() {
        this.f200606d = 0;
        this.f200607e = Collections.EMPTY_LIST;
    }

    public static c H() {
        return c.y();
    }

    public static c I(b bVar) {
        return H().q(bVar);
    }

    public C5222b A(int i15) {
        return this.f200607e.get(i15);
    }

    public int B() {
        return this.f200607e.size();
    }

    public List<C5222b> C() {
        return this.f200607e;
    }

    public int E() {
        return this.f200606d;
    }

    public boolean F() {
        return (this.f200605c & 1) == 1;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public c g() {
        return H();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public c b() {
        return I(this);
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f200608f;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        if (!F()) {
            this.f200608f = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < B(); i15++) {
            if (!A(i15).c()) {
                this.f200608f = (byte) 0;
                return false;
            }
        }
        this.f200608f = (byte) 1;
        return true;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f200609g;
        if (i15 != -1) {
            return i15;
        }
        int iO = (this.f200605c & 1) == 1 ? bt.f.o(1, this.f200606d) : 0;
        for (int i16 = 0; i16 < this.f200607e.size(); i16++) {
            iO += bt.f.s(2, this.f200607e.get(i16));
        }
        int size = iO + this.f200604b.size();
        this.f200609g = size;
        return size;
    }

    @Override // bt.i, bt.q
    public bt.s<b> j() {
        return f200603j;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        if ((this.f200605c & 1) == 1) {
            fVar.a0(1, this.f200606d);
        }
        for (int i15 = 0; i15 < this.f200607e.size(); i15++) {
            fVar.d0(2, this.f200607e.get(i15));
        }
        fVar.i0(this.f200604b);
    }

    private b(bt.i.b bVar) {
        super(bVar);
        this.f200608f = (byte) -1;
        this.f200609g = -1;
        this.f200604b = bVar.p();
    }

    private b(boolean z15) {
        this.f200608f = (byte) -1;
        this.f200609g = -1;
        this.f200604b = bt.d.f21388a;
    }

    private b(bt.e eVar, bt.g gVar) {
        this.f200608f = (byte) -1;
        this.f200609g = -1;
        G();
        bt.d.b bVarU = bt.d.u();
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z15 = false;
        char c15 = 0;
        while (!z15) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 8) {
                            this.f200605c |= 1;
                            this.f200606d = eVar.s();
                        } else if (iK != 18) {
                            if (!r(eVar, fVarJ, gVar, iK)) {
                            }
                        } else {
                            if ((c15 & 2) != 2) {
                                this.f200607e = new ArrayList();
                                c15 = 2;
                            }
                            this.f200607e.add((C5222b) eVar.u(C5222b.f200611j, gVar));
                        }
                    }
                    z15 = true;
                } catch (Throwable th4) {
                    if ((c15 & 2) == 2) {
                        this.f200607e = Collections.unmodifiableList(this.f200607e);
                    }
                    try {
                        fVarJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f200604b = bVarU.r();
                    }
                    n();
                    throw th4;
                }
            } catch (bt.k e15) {
                throw e15.i(this);
            } catch (IOException e16) {
                throw new bt.k(e16.getMessage()).i(this);
            }
        }
        if ((c15 & 2) == 2) {
            this.f200607e = Collections.unmodifiableList(this.f200607e);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f200604b = bVarU.r();
        }
        n();
    }
}
