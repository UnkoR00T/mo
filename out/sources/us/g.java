package us;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends bt.i implements bt.r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final g f200756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static bt.s<g> f200757m = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt.d f200758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f200759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f200760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<i> f200761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f200762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f200763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f200764h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte f200765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f200766k;

    static class a extends bt.b<g> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public g b(bt.e eVar, bt.g gVar) {
            return new g(eVar, gVar);
        }
    }

    public static final class b extends bt.i.b<g, b> implements bt.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f200767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f200768c = d.RETURNS_CONSTANT;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<i> f200769d = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private i f200770e = i.K();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private e f200771f = e.AT_MOST_ONCE;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c f200772g = c.CONCLUSION_CONDITION;

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
            if ((this.f200767b & 2) != 2) {
                this.f200769d = new ArrayList(this.f200769d);
                this.f200767b |= 2;
            }
        }

        public b D(i iVar) {
            if ((this.f200767b & 4) != 4 || this.f200770e == i.K()) {
                this.f200770e = iVar;
            } else {
                this.f200770e = i.c0(this.f200770e).q(iVar).w();
            }
            this.f200767b |= 4;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            g gVar2 = null;
            try {
                try {
                    g gVarB = g.f200757m.b(eVar, gVar);
                    if (gVarB != null) {
                        q(gVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    g gVar3 = (g) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        gVar2 = gVar3;
                        if (gVar2 != null) {
                            q(gVar2);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (gVar2 != null) {
                    q(gVar2);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public b q(g gVar) {
            if (gVar == g.F()) {
                return this;
            }
            if (gVar.N()) {
                I(gVar.J());
            }
            if (!gVar.f200761e.isEmpty()) {
                if (this.f200769d.isEmpty()) {
                    this.f200769d = gVar.f200761e;
                    this.f200767b &= -3;
                } else {
                    z();
                    this.f200769d.addAll(gVar.f200761e);
                }
            }
            if (gVar.L()) {
                D(gVar.D());
            }
            if (gVar.O()) {
                J(gVar.K());
            }
            if (gVar.M()) {
                H(gVar.E());
            }
            s(p().f(gVar.f200758b));
            return this;
        }

        public b H(c cVar) {
            cVar.getClass();
            this.f200767b |= 16;
            this.f200772g = cVar;
            return this;
        }

        public b I(d dVar) {
            dVar.getClass();
            this.f200767b |= 1;
            this.f200768c = dVar;
            return this;
        }

        public b J(e eVar) {
            eVar.getClass();
            this.f200767b |= 8;
            this.f200771f = eVar;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public g build() {
            g gVarW = w();
            if (gVarW.c()) {
                return gVarW;
            }
            throw bt.a.AbstractC0557a.n(gVarW);
        }

        public g w() {
            g gVar = new g(this);
            int i15 = this.f200767b;
            int i16 = (i15 & 1) != 1 ? 0 : 1;
            gVar.f200760d = this.f200768c;
            if ((this.f200767b & 2) == 2) {
                this.f200769d = Collections.unmodifiableList(this.f200769d);
                this.f200767b &= -3;
            }
            gVar.f200761e = this.f200769d;
            if ((i15 & 4) == 4) {
                i16 |= 2;
            }
            gVar.f200762f = this.f200770e;
            if ((i15 & 8) == 8) {
                i16 |= 4;
            }
            gVar.f200763g = this.f200771f;
            if ((i15 & 16) == 16) {
                i16 |= 8;
            }
            gVar.f200764h = this.f200772g;
            gVar.f200759c = i16;
            return gVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b o() {
            return y().q(w());
        }
    }

    public enum c implements bt.j.a {
        CONCLUSION_CONDITION(0, 0),
        RETURNS_CONDITION(1, 1),
        HOLDSIN_CONDITION(2, 2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static bt.j.b<c> f200776e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f200778a;

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
            this.f200778a = i16;
        }

        public static c b(int i15) {
            if (i15 == 0) {
                return CONCLUSION_CONDITION;
            }
            if (i15 == 1) {
                return RETURNS_CONDITION;
            }
            if (i15 != 2) {
                return null;
            }
            return HOLDSIN_CONDITION;
        }

        @Override // bt.j.a
        public final int h() {
            return this.f200778a;
        }
    }

    public enum d implements bt.j.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static bt.j.b<d> f200782e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f200784a;

        static class a implements bt.j.b<d> {
            a() {
            }

            @Override // bt.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i15) {
                return d.b(i15);
            }
        }

        d(int i15, int i16) {
            this.f200784a = i16;
        }

        public static d b(int i15) {
            if (i15 == 0) {
                return RETURNS_CONSTANT;
            }
            if (i15 == 1) {
                return CALLS;
            }
            if (i15 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // bt.j.a
        public final int h() {
            return this.f200784a;
        }
    }

    public enum e implements bt.j.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static bt.j.b<e> f200788e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f200790a;

        static class a implements bt.j.b<e> {
            a() {
            }

            @Override // bt.j.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e a(int i15) {
                return e.b(i15);
            }
        }

        e(int i15, int i16) {
            this.f200790a = i16;
        }

        public static e b(int i15) {
            if (i15 == 0) {
                return AT_MOST_ONCE;
            }
            if (i15 == 1) {
                return EXACTLY_ONCE;
            }
            if (i15 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // bt.j.a
        public final int h() {
            return this.f200790a;
        }
    }

    static {
        g gVar = new g(true);
        f200756l = gVar;
        gVar.Q();
    }

    public static g F() {
        return f200756l;
    }

    private void Q() {
        this.f200760d = d.RETURNS_CONSTANT;
        this.f200761e = Collections.EMPTY_LIST;
        this.f200762f = i.K();
        this.f200763g = e.AT_MOST_ONCE;
        this.f200764h = c.CONCLUSION_CONDITION;
    }

    public static b R() {
        return b.y();
    }

    public static b T(g gVar) {
        return R().q(gVar);
    }

    public i D() {
        return this.f200762f;
    }

    public c E() {
        return this.f200764h;
    }

    public i G(int i15) {
        return this.f200761e.get(i15);
    }

    public int H() {
        return this.f200761e.size();
    }

    public List<i> I() {
        return this.f200761e;
    }

    public d J() {
        return this.f200760d;
    }

    public e K() {
        return this.f200763g;
    }

    public boolean L() {
        return (this.f200759c & 2) == 2;
    }

    public boolean M() {
        return (this.f200759c & 8) == 8;
    }

    public boolean N() {
        return (this.f200759c & 1) == 1;
    }

    public boolean O() {
        return (this.f200759c & 4) == 4;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public b g() {
        return R();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public b b() {
        return T(this);
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f200765j;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        for (int i15 = 0; i15 < H(); i15++) {
            if (!G(i15).c()) {
                this.f200765j = (byte) 0;
                return false;
            }
        }
        if (!L() || D().c()) {
            this.f200765j = (byte) 1;
            return true;
        }
        this.f200765j = (byte) 0;
        return false;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f200766k;
        if (i15 != -1) {
            return i15;
        }
        int iH = (this.f200759c & 1) == 1 ? bt.f.h(1, this.f200760d.h()) : 0;
        for (int i16 = 0; i16 < this.f200761e.size(); i16++) {
            iH += bt.f.s(2, this.f200761e.get(i16));
        }
        if ((this.f200759c & 2) == 2) {
            iH += bt.f.s(3, this.f200762f);
        }
        if ((this.f200759c & 4) == 4) {
            iH += bt.f.h(4, this.f200763g.h());
        }
        if ((this.f200759c & 8) == 8) {
            iH += bt.f.h(5, this.f200764h.h());
        }
        int size = iH + this.f200758b.size();
        this.f200766k = size;
        return size;
    }

    @Override // bt.i, bt.q
    public bt.s<g> j() {
        return f200757m;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        if ((this.f200759c & 1) == 1) {
            fVar.S(1, this.f200760d.h());
        }
        for (int i15 = 0; i15 < this.f200761e.size(); i15++) {
            fVar.d0(2, this.f200761e.get(i15));
        }
        if ((this.f200759c & 2) == 2) {
            fVar.d0(3, this.f200762f);
        }
        if ((this.f200759c & 4) == 4) {
            fVar.S(4, this.f200763g.h());
        }
        if ((this.f200759c & 8) == 8) {
            fVar.S(5, this.f200764h.h());
        }
        fVar.i0(this.f200758b);
    }

    private g(bt.i.b bVar) {
        super(bVar);
        this.f200765j = (byte) -1;
        this.f200766k = -1;
        this.f200758b = bVar.p();
    }

    private g(boolean z15) {
        this.f200765j = (byte) -1;
        this.f200766k = -1;
        this.f200758b = bt.d.f21388a;
    }

    private g(bt.e eVar, bt.g gVar) {
        this.f200765j = (byte) -1;
        this.f200766k = -1;
        Q();
        bt.d.b bVarU = bt.d.u();
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z15 = false;
        char c15 = 0;
        while (!z15) {
            try {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                int iN = eVar.n();
                                d dVarB = d.b(iN);
                                if (dVarB == null) {
                                    fVarJ.o0(iK);
                                    fVarJ.o0(iN);
                                } else {
                                    this.f200759c |= 1;
                                    this.f200760d = dVarB;
                                }
                            } else if (iK == 18) {
                                if ((c15 & 2) != 2) {
                                    this.f200761e = new ArrayList();
                                    c15 = 2;
                                }
                                this.f200761e.add((i) eVar.u(i.f200803p, gVar));
                            } else if (iK == 26) {
                                i.b bVarB = (this.f200759c & 2) == 2 ? this.f200762f.b() : null;
                                i iVar = (i) eVar.u(i.f200803p, gVar);
                                this.f200762f = iVar;
                                if (bVarB != null) {
                                    bVarB.q(iVar);
                                    this.f200762f = bVarB.w();
                                }
                                this.f200759c |= 2;
                            } else if (iK == 32) {
                                int iN2 = eVar.n();
                                e eVarB = e.b(iN2);
                                if (eVarB == null) {
                                    fVarJ.o0(iK);
                                    fVarJ.o0(iN2);
                                } else {
                                    this.f200759c |= 4;
                                    this.f200763g = eVarB;
                                }
                            } else if (iK != 40) {
                                if (!r(eVar, fVarJ, gVar, iK)) {
                                }
                            } else {
                                int iN3 = eVar.n();
                                c cVarB = c.b(iN3);
                                if (cVarB == null) {
                                    fVarJ.o0(iK);
                                    fVarJ.o0(iN3);
                                } else {
                                    this.f200759c |= 8;
                                    this.f200764h = cVarB;
                                }
                            }
                        }
                        z15 = true;
                    } catch (IOException e15) {
                        throw new bt.k(e15.getMessage()).i(this);
                    }
                } catch (bt.k e16) {
                    throw e16.i(this);
                }
            } catch (Throwable th4) {
                if ((c15 & 2) == 2) {
                    this.f200761e = Collections.unmodifiableList(this.f200761e);
                }
                try {
                    fVarJ.I();
                } catch (IOException unused) {
                } finally {
                    this.f200758b = bVarU.r();
                }
                n();
                throw th4;
            }
        }
        if ((c15 & 2) == 2) {
            this.f200761e = Collections.unmodifiableList(this.f200761e);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f200758b = bVarU.r();
        }
        n();
    }
}
