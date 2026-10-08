package us;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends bt.i.d<e> implements bt.r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final e f200731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static bt.s<e> f200732n = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bt.d f200733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f200734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f200735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<v> f200736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<Integer> f200737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<d> f200738h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<us.b> f200739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte f200740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f200741l;

    static class a extends bt.b<e> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public e b(bt.e eVar, bt.g gVar) {
            return new e(eVar, gVar);
        }
    }

    public static final class b extends bt.i.c<e, b> implements bt.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f200742d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f200743e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<v> f200744f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<Integer> f200745g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<d> f200746h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<us.b> f200747j;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f200744f = list;
            this.f200745g = list;
            this.f200746h = list;
            this.f200747j = list;
            K();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b F() {
            return new b();
        }

        private void G() {
            if ((this.f200742d & 16) != 16) {
                this.f200747j = new ArrayList(this.f200747j);
                this.f200742d |= 16;
            }
        }

        private void H() {
            if ((this.f200742d & 8) != 8) {
                this.f200746h = new ArrayList(this.f200746h);
                this.f200742d |= 8;
            }
        }

        private void I() {
            if ((this.f200742d & 2) != 2) {
                this.f200744f = new ArrayList(this.f200744f);
                this.f200742d |= 2;
            }
        }

        private void J() {
            if ((this.f200742d & 4) != 4) {
                this.f200745g = new ArrayList(this.f200745g);
                this.f200742d |= 4;
            }
        }

        private void K() {
        }

        public e A() {
            e eVar = new e(this);
            int i15 = (this.f200742d & 1) != 1 ? 0 : 1;
            eVar.f200735e = this.f200743e;
            if ((this.f200742d & 2) == 2) {
                this.f200744f = Collections.unmodifiableList(this.f200744f);
                this.f200742d &= -3;
            }
            eVar.f200736f = this.f200744f;
            if ((this.f200742d & 4) == 4) {
                this.f200745g = Collections.unmodifiableList(this.f200745g);
                this.f200742d &= -5;
            }
            eVar.f200737g = this.f200745g;
            if ((this.f200742d & 8) == 8) {
                this.f200746h = Collections.unmodifiableList(this.f200746h);
                this.f200742d &= -9;
            }
            eVar.f200738h = this.f200746h;
            if ((this.f200742d & 16) == 16) {
                this.f200747j = Collections.unmodifiableList(this.f200747j);
                this.f200742d &= -17;
            }
            eVar.f200739j = this.f200747j;
            eVar.f200734d = i15;
            return eVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b o() {
            return F().q(A());
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            e eVar2 = null;
            try {
                try {
                    e eVarB = e.f200732n.b(eVar, gVar);
                    if (eVarB != null) {
                        q(eVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    e eVar3 = (e) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        eVar2 = eVar3;
                        if (eVar2 != null) {
                            q(eVar2);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (eVar2 != null) {
                    q(eVar2);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public b q(e eVar) {
            if (eVar == e.W()) {
                return this;
            }
            if (eVar.e0()) {
                P(eVar.Y());
            }
            if (!eVar.f200736f.isEmpty()) {
                if (this.f200744f.isEmpty()) {
                    this.f200744f = eVar.f200736f;
                    this.f200742d &= -3;
                } else {
                    I();
                    this.f200744f.addAll(eVar.f200736f);
                }
            }
            if (!eVar.f200737g.isEmpty()) {
                if (this.f200745g.isEmpty()) {
                    this.f200745g = eVar.f200737g;
                    this.f200742d &= -5;
                } else {
                    J();
                    this.f200745g.addAll(eVar.f200737g);
                }
            }
            if (!eVar.f200738h.isEmpty()) {
                if (this.f200746h.isEmpty()) {
                    this.f200746h = eVar.f200738h;
                    this.f200742d &= -9;
                } else {
                    H();
                    this.f200746h.addAll(eVar.f200738h);
                }
            }
            if (!eVar.f200739j.isEmpty()) {
                if (this.f200747j.isEmpty()) {
                    this.f200747j = eVar.f200739j;
                    this.f200742d &= -17;
                } else {
                    G();
                    this.f200747j.addAll(eVar.f200739j);
                }
            }
            x(eVar);
            s(p().f(eVar.f200733c));
            return this;
        }

        public b P(int i15) {
            this.f200742d |= 1;
            this.f200743e = i15;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public e build() {
            e eVarA = A();
            if (eVarA.c()) {
                return eVarA;
            }
            throw bt.a.AbstractC0557a.n(eVarA);
        }
    }

    static {
        e eVar = new e(true);
        f200731m = eVar;
        eVar.f0();
    }

    public static e W() {
        return f200731m;
    }

    private void f0() {
        this.f200735e = 6;
        List list = Collections.EMPTY_LIST;
        this.f200736f = list;
        this.f200737g = list;
        this.f200738h = list;
        this.f200739j = list;
    }

    public static b g0() {
        return b.F();
    }

    public static b h0(e eVar) {
        return g0().q(eVar);
    }

    public us.b Q(int i15) {
        return this.f200739j.get(i15);
    }

    public int R() {
        return this.f200739j.size();
    }

    public List<us.b> T() {
        return this.f200739j;
    }

    public d U(int i15) {
        return this.f200738h.get(i15);
    }

    public int V() {
        return this.f200738h.size();
    }

    @Override // bt.r
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public e i() {
        return f200731m;
    }

    public int Y() {
        return this.f200735e;
    }

    public v a0(int i15) {
        return this.f200736f.get(i15);
    }

    public int b0() {
        return this.f200736f.size();
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f200740k;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        for (int i15 = 0; i15 < b0(); i15++) {
            if (!a0(i15).c()) {
                this.f200740k = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < V(); i16++) {
            if (!U(i16).c()) {
                this.f200740k = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < R(); i17++) {
            if (!Q(i17).c()) {
                this.f200740k = (byte) 0;
                return false;
            }
        }
        if (u()) {
            this.f200740k = (byte) 1;
            return true;
        }
        this.f200740k = (byte) 0;
        return false;
    }

    public List<v> c0() {
        return this.f200736f;
    }

    public List<Integer> d0() {
        return this.f200737g;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f200741l;
        if (i15 != -1) {
            return i15;
        }
        int iO = (this.f200734d & 1) == 1 ? bt.f.o(1, this.f200735e) : 0;
        for (int i16 = 0; i16 < this.f200736f.size(); i16++) {
            iO += bt.f.s(2, this.f200736f.get(i16));
        }
        for (int i17 = 0; i17 < this.f200739j.size(); i17++) {
            iO += bt.f.s(3, this.f200739j.get(i17));
        }
        int iP = 0;
        for (int i18 = 0; i18 < this.f200737g.size(); i18++) {
            iP += bt.f.p(this.f200737g.get(i18).intValue());
        }
        int size = iO + iP + (d0().size() * 2);
        for (int i19 = 0; i19 < this.f200738h.size(); i19++) {
            size += bt.f.s(32, this.f200738h.get(i19));
        }
        int iV = size + v() + this.f200733c.size();
        this.f200741l = iV;
        return iV;
    }

    public boolean e0() {
        return (this.f200734d & 1) == 1;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return g0();
    }

    @Override // bt.i, bt.q
    public bt.s<e> j() {
        return f200732n;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public b b() {
        return h0(this);
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        bt.i.d<MessageType>.a aVarC = C();
        if ((this.f200734d & 1) == 1) {
            fVar.a0(1, this.f200735e);
        }
        for (int i15 = 0; i15 < this.f200736f.size(); i15++) {
            fVar.d0(2, this.f200736f.get(i15));
        }
        for (int i16 = 0; i16 < this.f200739j.size(); i16++) {
            fVar.d0(3, this.f200739j.get(i16));
        }
        for (int i17 = 0; i17 < this.f200737g.size(); i17++) {
            fVar.a0(31, this.f200737g.get(i17).intValue());
        }
        for (int i18 = 0; i18 < this.f200738h.size(); i18++) {
            fVar.d0(32, this.f200738h.get(i18));
        }
        aVarC.a(19000, fVar);
        fVar.i0(this.f200733c);
    }

    private e(bt.i.c<e, ?> cVar) {
        super(cVar);
        this.f200740k = (byte) -1;
        this.f200741l = -1;
        this.f200733c = cVar.p();
    }

    private e(boolean z15) {
        this.f200740k = (byte) -1;
        this.f200741l = -1;
        this.f200733c = bt.d.f21388a;
    }

    private e(bt.e eVar, bt.g gVar) {
        this.f200740k = (byte) -1;
        this.f200741l = -1;
        f0();
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
                            this.f200734d |= 1;
                            this.f200735e = eVar.s();
                        } else if (iK == 18) {
                            if ((i15 & 2) != 2) {
                                this.f200736f = new ArrayList();
                                i15 |= 2;
                            }
                            this.f200736f.add((v) eVar.u(v.f201111r, gVar));
                        } else if (iK == 26) {
                            if ((i15 & 16) != 16) {
                                this.f200739j = new ArrayList();
                                i15 |= 16;
                            }
                            this.f200739j.add((us.b) eVar.u(us.b.f200603j, gVar));
                        } else if (iK == 248) {
                            if ((i15 & 4) != 4) {
                                this.f200737g = new ArrayList();
                                i15 |= 4;
                            }
                            this.f200737g.add(Integer.valueOf(eVar.s()));
                        } else if (iK == 250) {
                            int iJ = eVar.j(eVar.A());
                            if ((i15 & 4) != 4 && eVar.e() > 0) {
                                this.f200737g = new ArrayList();
                                i15 |= 4;
                            }
                            while (eVar.e() > 0) {
                                this.f200737g.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(iJ);
                        } else if (iK != 258) {
                            if (!r(eVar, fVarJ, gVar, iK)) {
                            }
                        } else {
                            if ((i15 & 8) != 8) {
                                this.f200738h = new ArrayList();
                                i15 |= 8;
                            }
                            this.f200738h.add((d) eVar.u(d.f200721j, gVar));
                        }
                    }
                    z15 = true;
                } catch (bt.k e15) {
                    throw e15.i(this);
                } catch (IOException e16) {
                    throw new bt.k(e16.getMessage()).i(this);
                }
            } catch (Throwable th4) {
                if ((i15 & 2) == 2) {
                    this.f200736f = Collections.unmodifiableList(this.f200736f);
                }
                if ((i15 & 16) == 16) {
                    this.f200739j = Collections.unmodifiableList(this.f200739j);
                }
                if ((i15 & 4) == 4) {
                    this.f200737g = Collections.unmodifiableList(this.f200737g);
                }
                if ((i15 & 8) == 8) {
                    this.f200738h = Collections.unmodifiableList(this.f200738h);
                }
                try {
                    fVarJ.I();
                } catch (IOException unused) {
                } finally {
                    this.f200733c = bVarU.r();
                }
                n();
                throw th4;
            }
        }
        if ((i15 & 2) == 2) {
            this.f200736f = Collections.unmodifiableList(this.f200736f);
        }
        if ((i15 & 16) == 16) {
            this.f200739j = Collections.unmodifiableList(this.f200739j);
        }
        if ((i15 & 4) == 4) {
            this.f200737g = Collections.unmodifiableList(this.f200737g);
        }
        if ((i15 & 8) == 8) {
            this.f200738h = Collections.unmodifiableList(this.f200738h);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f200733c = bVarU.r();
        }
        n();
    }
}
