package us;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends bt.i implements bt.r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p f200956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static bt.s<p> f200957g = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt.d f200958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<c> f200959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f200960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f200961e;

    static class a extends bt.b<p> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public p b(bt.e eVar, bt.g gVar) {
            return new p(eVar, gVar);
        }
    }

    public static final class b extends bt.i.b<p, b> implements bt.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f200962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<c> f200963c = Collections.EMPTY_LIST;

        private b() {
            A();
        }

        private void A() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b y() {
            return new b();
        }

        private void z() {
            if ((this.f200962b & 1) != 1) {
                this.f200963c = new ArrayList(this.f200963c);
                this.f200962b |= 1;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            p pVar = null;
            try {
                try {
                    p pVarB = p.f200957g.b(eVar, gVar);
                    if (pVarB != null) {
                        q(pVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    p pVar2 = (p) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        pVar = pVar2;
                        if (pVar != null) {
                            q(pVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (pVar != null) {
                    q(pVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public b q(p pVar) {
            if (pVar == p.w()) {
                return this;
            }
            if (!pVar.f200959c.isEmpty()) {
                if (this.f200963c.isEmpty()) {
                    this.f200963c = pVar.f200959c;
                    this.f200962b &= -2;
                } else {
                    z();
                    this.f200963c.addAll(pVar.f200959c);
                }
            }
            s(p().f(pVar.f200958b));
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public p build() {
            p pVarW = w();
            if (pVarW.c()) {
                return pVarW;
            }
            throw bt.a.AbstractC0557a.n(pVarW);
        }

        public p w() {
            p pVar = new p(this);
            if ((this.f200962b & 1) == 1) {
                this.f200963c = Collections.unmodifiableList(this.f200963c);
                this.f200962b &= -2;
            }
            pVar.f200959c = this.f200963c;
            return pVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b o() {
            return y().q(w());
        }
    }

    static {
        p pVar = new p(true);
        f200956f = pVar;
        pVar.B();
    }

    private void B() {
        this.f200959c = Collections.EMPTY_LIST;
    }

    public static b C() {
        return b.y();
    }

    public static b D(p pVar) {
        return C().q(pVar);
    }

    public static p w() {
        return f200956f;
    }

    public int A() {
        return this.f200959c.size();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b g() {
        return C();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public b b() {
        return D(this);
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f200960d;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        for (int i15 = 0; i15 < A(); i15++) {
            if (!y(i15).c()) {
                this.f200960d = (byte) 0;
                return false;
            }
        }
        this.f200960d = (byte) 1;
        return true;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f200961e;
        if (i15 != -1) {
            return i15;
        }
        int iS = 0;
        for (int i16 = 0; i16 < this.f200959c.size(); i16++) {
            iS += bt.f.s(1, this.f200959c.get(i16));
        }
        int size = iS + this.f200958b.size();
        this.f200961e = size;
        return size;
    }

    @Override // bt.i, bt.q
    public bt.s<p> j() {
        return f200957g;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        for (int i15 = 0; i15 < this.f200959c.size(); i15++) {
            fVar.d0(1, this.f200959c.get(i15));
        }
        fVar.i0(this.f200958b);
    }

    public c y(int i15) {
        return this.f200959c.get(i15);
    }

    public static final class c extends bt.i implements bt.r {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final c f200964j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static bt.s<c> f200965k = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bt.d f200966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f200967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f200968d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f200969e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private EnumC5227c f200970f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f200971g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f200972h;

        static class a extends bt.b<c> {
            a() {
            }

            @Override // bt.s
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public c b(bt.e eVar, bt.g gVar) {
                return new c(eVar, gVar);
            }
        }

        public static final class b extends bt.i.b<c, b> implements bt.r {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f200973b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f200975d;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f200974c = -1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private EnumC5227c f200976e = EnumC5227c.PACKAGE;

            private b() {
                z();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static b y() {
                return new b();
            }

            private void z() {
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // bt.a.AbstractC0557a
            /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
            public b l(bt.e eVar, bt.g gVar) throws Throwable {
                c cVar = null;
                try {
                    try {
                        c cVarB = c.f200965k.b(eVar, gVar);
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
            /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
            public b q(c cVar) {
                if (cVar == c.A()) {
                    return this;
                }
                if (cVar.F()) {
                    G(cVar.C());
                }
                if (cVar.G()) {
                    H(cVar.D());
                }
                if (cVar.E()) {
                    F(cVar.B());
                }
                s(p().f(cVar.f200966b));
                return this;
            }

            public b F(EnumC5227c enumC5227c) {
                enumC5227c.getClass();
                this.f200973b |= 4;
                this.f200976e = enumC5227c;
                return this;
            }

            public b G(int i15) {
                this.f200973b |= 1;
                this.f200974c = i15;
                return this;
            }

            public b H(int i15) {
                this.f200973b |= 2;
                this.f200975d = i15;
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
                int i15 = this.f200973b;
                int i16 = (i15 & 1) != 1 ? 0 : 1;
                cVar.f200968d = this.f200974c;
                if ((i15 & 2) == 2) {
                    i16 |= 2;
                }
                cVar.f200969e = this.f200975d;
                if ((i15 & 4) == 4) {
                    i16 |= 4;
                }
                cVar.f200970f = this.f200976e;
                cVar.f200967c = i16;
                return cVar;
            }

            @Override // bt.i.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public b o() {
                return y().q(w());
            }
        }

        /* JADX INFO: renamed from: us.p$c$c, reason: collision with other inner class name */
        public enum EnumC5227c implements bt.j.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static bt.j.b<EnumC5227c> f200980e = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f200982a;

            /* JADX INFO: renamed from: us.p$c$c$a */
            static class a implements bt.j.b<EnumC5227c> {
                a() {
                }

                @Override // bt.j.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public EnumC5227c a(int i15) {
                    return EnumC5227c.b(i15);
                }
            }

            EnumC5227c(int i15, int i16) {
                this.f200982a = i16;
            }

            public static EnumC5227c b(int i15) {
                if (i15 == 0) {
                    return CLASS;
                }
                if (i15 == 1) {
                    return PACKAGE;
                }
                if (i15 != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // bt.j.a
            public final int h() {
                return this.f200982a;
            }
        }

        static {
            c cVar = new c(true);
            f200964j = cVar;
            cVar.H();
        }

        public static c A() {
            return f200964j;
        }

        private void H() {
            this.f200968d = -1;
            this.f200969e = 0;
            this.f200970f = EnumC5227c.PACKAGE;
        }

        public static b I() {
            return b.y();
        }

        public static b J(c cVar) {
            return I().q(cVar);
        }

        public EnumC5227c B() {
            return this.f200970f;
        }

        public int C() {
            return this.f200968d;
        }

        public int D() {
            return this.f200969e;
        }

        public boolean E() {
            return (this.f200967c & 4) == 4;
        }

        public boolean F() {
            return (this.f200967c & 1) == 1;
        }

        public boolean G() {
            return (this.f200967c & 2) == 2;
        }

        @Override // bt.q
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public b g() {
            return I();
        }

        @Override // bt.q
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public b b() {
            return J(this);
        }

        @Override // bt.r
        public final boolean c() {
            byte b15 = this.f200971g;
            if (b15 == 1) {
                return true;
            }
            if (b15 == 0) {
                return false;
            }
            if (G()) {
                this.f200971g = (byte) 1;
                return true;
            }
            this.f200971g = (byte) 0;
            return false;
        }

        @Override // bt.q
        public int e() {
            int i15 = this.f200972h;
            if (i15 != -1) {
                return i15;
            }
            int iO = (this.f200967c & 1) == 1 ? bt.f.o(1, this.f200968d) : 0;
            if ((this.f200967c & 2) == 2) {
                iO += bt.f.o(2, this.f200969e);
            }
            if ((this.f200967c & 4) == 4) {
                iO += bt.f.h(3, this.f200970f.h());
            }
            int size = iO + this.f200966b.size();
            this.f200972h = size;
            return size;
        }

        @Override // bt.i, bt.q
        public bt.s<c> j() {
            return f200965k;
        }

        @Override // bt.q
        public void m(bt.f fVar) throws IOException {
            e();
            if ((this.f200967c & 1) == 1) {
                fVar.a0(1, this.f200968d);
            }
            if ((this.f200967c & 2) == 2) {
                fVar.a0(2, this.f200969e);
            }
            if ((this.f200967c & 4) == 4) {
                fVar.S(3, this.f200970f.h());
            }
            fVar.i0(this.f200966b);
        }

        private c(bt.i.b bVar) {
            super(bVar);
            this.f200971g = (byte) -1;
            this.f200972h = -1;
            this.f200966b = bVar.p();
        }

        private c(boolean z15) {
            this.f200971g = (byte) -1;
            this.f200972h = -1;
            this.f200966b = bt.d.f21388a;
        }

        private c(bt.e eVar, bt.g gVar) {
            this.f200971g = (byte) -1;
            this.f200972h = -1;
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
                                    this.f200967c |= 1;
                                    this.f200968d = eVar.s();
                                } else if (iK == 16) {
                                    this.f200967c |= 2;
                                    this.f200969e = eVar.s();
                                } else if (iK != 24) {
                                    if (!r(eVar, fVarJ, gVar, iK)) {
                                    }
                                } else {
                                    int iN = eVar.n();
                                    EnumC5227c enumC5227cB = EnumC5227c.b(iN);
                                    if (enumC5227cB == null) {
                                        fVarJ.o0(iK);
                                        fVarJ.o0(iN);
                                    } else {
                                        this.f200967c |= 4;
                                        this.f200970f = enumC5227cB;
                                    }
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
                        this.f200966b = bVarU.r();
                    }
                    n();
                    throw th4;
                }
            }
            try {
                fVarJ.I();
            } catch (IOException unused2) {
            } finally {
                this.f200966b = bVarU.r();
            }
            n();
        }
    }

    private p(bt.i.b bVar) {
        super(bVar);
        this.f200960d = (byte) -1;
        this.f200961e = -1;
        this.f200958b = bVar.p();
    }

    private p(boolean z15) {
        this.f200960d = (byte) -1;
        this.f200961e = -1;
        this.f200958b = bt.d.f21388a;
    }

    private p(bt.e eVar, bt.g gVar) {
        this.f200960d = (byte) -1;
        this.f200961e = -1;
        B();
        bt.d.b bVarU = bt.d.u();
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z15 = false;
        boolean z16 = false;
        while (!z15) {
            try {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK != 10) {
                                if (!r(eVar, fVarJ, gVar, iK)) {
                                }
                            } else {
                                if (!z16) {
                                    this.f200959c = new ArrayList();
                                    z16 = true;
                                }
                                this.f200959c.add((c) eVar.u(c.f200965k, gVar));
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
                if (z16) {
                    this.f200959c = Collections.unmodifiableList(this.f200959c);
                }
                try {
                    fVarJ.I();
                } catch (IOException unused) {
                } finally {
                    this.f200958b = bVarU.r();
                }
                n();
                throw th4;
            }
        }
        if (z16) {
            this.f200959c = Collections.unmodifiableList(this.f200959c);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f200958b = bVarU.r();
        }
        n();
    }
}
