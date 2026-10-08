package us;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends bt.i implements bt.r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final i f200802n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static bt.s<i> f200803p = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt.d f200804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f200805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f200806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f200807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f200808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private r f200809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f200810h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<i> f200811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<i> f200812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f200813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f200814m;

    static class a extends bt.b<i> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public i b(bt.e eVar, bt.g gVar) {
            return new i(eVar, gVar);
        }
    }

    public static final class b extends bt.i.b<i, b> implements bt.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f200815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f200816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f200817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f200818e = c.TRUE;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private r f200819f = r.e0();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f200820g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<i> f200821h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<i> f200822j;

        private b() {
            List<i> list = Collections.EMPTY_LIST;
            this.f200821h = list;
            this.f200822j = list;
            D();
        }

        private void A() {
            if ((this.f200815b & 64) != 64) {
                this.f200822j = new ArrayList(this.f200822j);
                this.f200815b |= 64;
            }
        }

        private void D() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b y() {
            return new b();
        }

        private void z() {
            if ((this.f200815b & 32) != 32) {
                this.f200821h = new ArrayList(this.f200821h);
                this.f200815b |= 32;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            i iVar = null;
            try {
                try {
                    i iVarB = i.f200803p.b(eVar, gVar);
                    if (iVarB != null) {
                        q(iVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    i iVar2 = (i) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        iVar = iVar2;
                        if (iVar != null) {
                            q(iVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (iVar != null) {
                    q(iVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public b q(i iVar) {
            if (iVar == i.K()) {
                return this;
            }
            if (iVar.V()) {
                J(iVar.L());
            }
            if (iVar.Y()) {
                N(iVar.T());
            }
            if (iVar.U()) {
                I(iVar.J());
            }
            if (iVar.W()) {
                H(iVar.M());
            }
            if (iVar.X()) {
                K(iVar.N());
            }
            if (!iVar.f200811j.isEmpty()) {
                if (this.f200821h.isEmpty()) {
                    this.f200821h = iVar.f200811j;
                    this.f200815b &= -33;
                } else {
                    z();
                    this.f200821h.addAll(iVar.f200811j);
                }
            }
            if (!iVar.f200812k.isEmpty()) {
                if (this.f200822j.isEmpty()) {
                    this.f200822j = iVar.f200812k;
                    this.f200815b &= -65;
                } else {
                    A();
                    this.f200822j.addAll(iVar.f200812k);
                }
            }
            s(p().f(iVar.f200804b));
            return this;
        }

        public b H(r rVar) {
            if ((this.f200815b & 8) != 8 || this.f200819f == r.e0()) {
                this.f200819f = rVar;
            } else {
                this.f200819f = r.F0(this.f200819f).q(rVar).A();
            }
            this.f200815b |= 8;
            return this;
        }

        public b I(c cVar) {
            cVar.getClass();
            this.f200815b |= 4;
            this.f200818e = cVar;
            return this;
        }

        public b J(int i15) {
            this.f200815b |= 1;
            this.f200816c = i15;
            return this;
        }

        public b K(int i15) {
            this.f200815b |= 16;
            this.f200820g = i15;
            return this;
        }

        public b N(int i15) {
            this.f200815b |= 2;
            this.f200817d = i15;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public i build() {
            i iVarW = w();
            if (iVarW.c()) {
                return iVarW;
            }
            throw bt.a.AbstractC0557a.n(iVarW);
        }

        public i w() {
            i iVar = new i(this);
            int i15 = this.f200815b;
            int i16 = (i15 & 1) != 1 ? 0 : 1;
            iVar.f200806d = this.f200816c;
            if ((i15 & 2) == 2) {
                i16 |= 2;
            }
            iVar.f200807e = this.f200817d;
            if ((i15 & 4) == 4) {
                i16 |= 4;
            }
            iVar.f200808f = this.f200818e;
            if ((i15 & 8) == 8) {
                i16 |= 8;
            }
            iVar.f200809g = this.f200819f;
            if ((i15 & 16) == 16) {
                i16 |= 16;
            }
            iVar.f200810h = this.f200820g;
            if ((this.f200815b & 32) == 32) {
                this.f200821h = Collections.unmodifiableList(this.f200821h);
                this.f200815b &= -33;
            }
            iVar.f200811j = this.f200821h;
            if ((this.f200815b & 64) == 64) {
                this.f200822j = Collections.unmodifiableList(this.f200822j);
                this.f200815b &= -65;
            }
            iVar.f200812k = this.f200822j;
            iVar.f200805c = i16;
            return iVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b o() {
            return y().q(w());
        }
    }

    public enum c implements bt.j.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static bt.j.b<c> f200826e = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f200828a;

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
            this.f200828a = i16;
        }

        public static c b(int i15) {
            if (i15 == 0) {
                return TRUE;
            }
            if (i15 == 1) {
                return FALSE;
            }
            if (i15 != 2) {
                return null;
            }
            return NULL;
        }

        @Override // bt.j.a
        public final int h() {
            return this.f200828a;
        }
    }

    static {
        i iVar = new i(true);
        f200802n = iVar;
        iVar.a0();
    }

    public static i K() {
        return f200802n;
    }

    private void a0() {
        this.f200806d = 0;
        this.f200807e = 0;
        this.f200808f = c.TRUE;
        this.f200809g = r.e0();
        this.f200810h = 0;
        List<i> list = Collections.EMPTY_LIST;
        this.f200811j = list;
        this.f200812k = list;
    }

    public static b b0() {
        return b.y();
    }

    public static b c0(i iVar) {
        return b0().q(iVar);
    }

    public i G(int i15) {
        return this.f200811j.get(i15);
    }

    public int H() {
        return this.f200811j.size();
    }

    public List<i> I() {
        return this.f200811j;
    }

    public c J() {
        return this.f200808f;
    }

    public int L() {
        return this.f200806d;
    }

    public r M() {
        return this.f200809g;
    }

    public int N() {
        return this.f200810h;
    }

    public i O(int i15) {
        return this.f200812k.get(i15);
    }

    public int Q() {
        return this.f200812k.size();
    }

    public List<i> R() {
        return this.f200812k;
    }

    public int T() {
        return this.f200807e;
    }

    public boolean U() {
        return (this.f200805c & 4) == 4;
    }

    public boolean V() {
        return (this.f200805c & 1) == 1;
    }

    public boolean W() {
        return (this.f200805c & 8) == 8;
    }

    public boolean X() {
        return (this.f200805c & 16) == 16;
    }

    public boolean Y() {
        return (this.f200805c & 2) == 2;
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f200813l;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        if (W() && !M().c()) {
            this.f200813l = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < H(); i15++) {
            if (!G(i15).c()) {
                this.f200813l = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < Q(); i16++) {
            if (!O(i16).c()) {
                this.f200813l = (byte) 0;
                return false;
            }
        }
        this.f200813l = (byte) 1;
        return true;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return b0();
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f200814m;
        if (i15 != -1) {
            return i15;
        }
        int iO = (this.f200805c & 1) == 1 ? bt.f.o(1, this.f200806d) : 0;
        if ((this.f200805c & 2) == 2) {
            iO += bt.f.o(2, this.f200807e);
        }
        if ((this.f200805c & 4) == 4) {
            iO += bt.f.h(3, this.f200808f.h());
        }
        if ((this.f200805c & 8) == 8) {
            iO += bt.f.s(4, this.f200809g);
        }
        if ((this.f200805c & 16) == 16) {
            iO += bt.f.o(5, this.f200810h);
        }
        for (int i16 = 0; i16 < this.f200811j.size(); i16++) {
            iO += bt.f.s(6, this.f200811j.get(i16));
        }
        for (int i17 = 0; i17 < this.f200812k.size(); i17++) {
            iO += bt.f.s(7, this.f200812k.get(i17));
        }
        int size = iO + this.f200804b.size();
        this.f200814m = size;
        return size;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public b b() {
        return c0(this);
    }

    @Override // bt.i, bt.q
    public bt.s<i> j() {
        return f200803p;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        if ((this.f200805c & 1) == 1) {
            fVar.a0(1, this.f200806d);
        }
        if ((this.f200805c & 2) == 2) {
            fVar.a0(2, this.f200807e);
        }
        if ((this.f200805c & 4) == 4) {
            fVar.S(3, this.f200808f.h());
        }
        if ((this.f200805c & 8) == 8) {
            fVar.d0(4, this.f200809g);
        }
        if ((this.f200805c & 16) == 16) {
            fVar.a0(5, this.f200810h);
        }
        for (int i15 = 0; i15 < this.f200811j.size(); i15++) {
            fVar.d0(6, this.f200811j.get(i15));
        }
        for (int i16 = 0; i16 < this.f200812k.size(); i16++) {
            fVar.d0(7, this.f200812k.get(i16));
        }
        fVar.i0(this.f200804b);
    }

    private i(bt.i.b bVar) {
        super(bVar);
        this.f200813l = (byte) -1;
        this.f200814m = -1;
        this.f200804b = bVar.p();
    }

    private i(boolean z15) {
        this.f200813l = (byte) -1;
        this.f200814m = -1;
        this.f200804b = bt.d.f21388a;
    }

    private i(bt.e eVar, bt.g gVar) {
        this.f200813l = (byte) -1;
        this.f200814m = -1;
        a0();
        bt.d.b bVarU = bt.d.u();
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z15 = false;
        int i15 = 0;
        while (!z15) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 8) {
                            this.f200805c |= 1;
                            this.f200806d = eVar.s();
                        } else if (iK == 16) {
                            this.f200805c |= 2;
                            this.f200807e = eVar.s();
                        } else if (iK == 24) {
                            int iN = eVar.n();
                            c cVarB = c.b(iN);
                            if (cVarB == null) {
                                fVarJ.o0(iK);
                                fVarJ.o0(iN);
                            } else {
                                this.f200805c |= 4;
                                this.f200808f = cVarB;
                            }
                        } else if (iK == 34) {
                            r.c cVarB2 = (this.f200805c & 8) == 8 ? this.f200809g.b() : null;
                            r rVar = (r) eVar.u(r.f200992y, gVar);
                            this.f200809g = rVar;
                            if (cVarB2 != null) {
                                cVarB2.q(rVar);
                                this.f200809g = cVarB2.A();
                            }
                            this.f200805c |= 8;
                        } else if (iK == 40) {
                            this.f200805c |= 16;
                            this.f200810h = eVar.s();
                        } else if (iK == 50) {
                            if ((i15 & 32) != 32) {
                                this.f200811j = new ArrayList();
                                i15 |= 32;
                            }
                            this.f200811j.add((i) eVar.u(f200803p, gVar));
                        } else if (iK != 58) {
                            if (!r(eVar, fVarJ, gVar, iK)) {
                            }
                        } else {
                            if ((i15 & 64) != 64) {
                                this.f200812k = new ArrayList();
                                i15 |= 64;
                            }
                            this.f200812k.add((i) eVar.u(f200803p, gVar));
                        }
                    }
                    z15 = true;
                } catch (Throwable th4) {
                    if ((i15 & 32) == 32) {
                        this.f200811j = Collections.unmodifiableList(this.f200811j);
                    }
                    if ((i15 & 64) == 64) {
                        this.f200812k = Collections.unmodifiableList(this.f200812k);
                    }
                    try {
                        fVarJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f200804b = bVarU.r();
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
        if ((i15 & 32) == 32) {
            this.f200811j = Collections.unmodifiableList(this.f200811j);
        }
        if ((i15 & 64) == 64) {
            this.f200812k = Collections.unmodifiableList(this.f200812k);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f200804b = bVarU.r();
        }
        n();
    }
}
