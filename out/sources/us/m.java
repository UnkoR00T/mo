package us;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.x509.DisplayText;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends bt.i.d<m> implements bt.r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final m f200883m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static bt.s<m> f200884n = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bt.d f200885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f200886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<j> f200887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<o> f200888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<s> f200889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private u f200890h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private x f200891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte f200892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f200893l;

    static class a extends bt.b<m> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public m b(bt.e eVar, bt.g gVar) {
            return new m(eVar, gVar);
        }
    }

    public static final class b extends bt.i.c<m, b> implements bt.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f200894d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<j> f200895e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<o> f200896f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<s> f200897g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private u f200898h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private x f200899j;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f200895e = list;
            this.f200896f = list;
            this.f200897g = list;
            this.f200898h = u.A();
            this.f200899j = x.w();
            J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b F() {
            return new b();
        }

        private void G() {
            if ((this.f200894d & 1) != 1) {
                this.f200895e = new ArrayList(this.f200895e);
                this.f200894d |= 1;
            }
        }

        private void H() {
            if ((this.f200894d & 2) != 2) {
                this.f200896f = new ArrayList(this.f200896f);
                this.f200894d |= 2;
            }
        }

        private void I() {
            if ((this.f200894d & 4) != 4) {
                this.f200897g = new ArrayList(this.f200897g);
                this.f200894d |= 4;
            }
        }

        private void J() {
        }

        public m A() {
            m mVar = new m(this);
            int i15 = this.f200894d;
            if ((i15 & 1) == 1) {
                this.f200895e = Collections.unmodifiableList(this.f200895e);
                this.f200894d &= -2;
            }
            mVar.f200887e = this.f200895e;
            if ((this.f200894d & 2) == 2) {
                this.f200896f = Collections.unmodifiableList(this.f200896f);
                this.f200894d &= -3;
            }
            mVar.f200888f = this.f200896f;
            if ((this.f200894d & 4) == 4) {
                this.f200897g = Collections.unmodifiableList(this.f200897g);
                this.f200894d &= -5;
            }
            mVar.f200889g = this.f200897g;
            int i16 = (i15 & 8) != 8 ? 0 : 1;
            mVar.f200890h = this.f200898h;
            if ((i15 & 16) == 16) {
                i16 |= 2;
            }
            mVar.f200891j = this.f200899j;
            mVar.f200886d = i16;
            return mVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b o() {
            return F().q(A());
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            m mVar = null;
            try {
                try {
                    m mVarB = m.f200884n.b(eVar, gVar);
                    if (mVarB != null) {
                        q(mVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    m mVar2 = (m) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        mVar = mVar2;
                        if (mVar != null) {
                            q(mVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (mVar != null) {
                    q(mVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public b q(m mVar) {
            if (mVar == m.O()) {
                return this;
            }
            if (!mVar.f200887e.isEmpty()) {
                if (this.f200895e.isEmpty()) {
                    this.f200895e = mVar.f200887e;
                    this.f200894d &= -2;
                } else {
                    G();
                    this.f200895e.addAll(mVar.f200887e);
                }
            }
            if (!mVar.f200888f.isEmpty()) {
                if (this.f200896f.isEmpty()) {
                    this.f200896f = mVar.f200888f;
                    this.f200894d &= -3;
                } else {
                    H();
                    this.f200896f.addAll(mVar.f200888f);
                }
            }
            if (!mVar.f200889g.isEmpty()) {
                if (this.f200897g.isEmpty()) {
                    this.f200897g = mVar.f200889g;
                    this.f200894d &= -5;
                } else {
                    I();
                    this.f200897g.addAll(mVar.f200889g);
                }
            }
            if (mVar.e0()) {
                O(mVar.c0());
            }
            if (mVar.f0()) {
                P(mVar.d0());
            }
            x(mVar);
            s(p().f(mVar.f200885c));
            return this;
        }

        public b O(u uVar) {
            if ((this.f200894d & 8) != 8 || this.f200898h == u.A()) {
                this.f200898h = uVar;
            } else {
                this.f200898h = u.I(this.f200898h).q(uVar).w();
            }
            this.f200894d |= 8;
            return this;
        }

        public b P(x xVar) {
            if ((this.f200894d & 16) != 16 || this.f200899j == x.w()) {
                this.f200899j = xVar;
            } else {
                this.f200899j = x.D(this.f200899j).q(xVar).w();
            }
            this.f200894d |= 16;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public m build() {
            m mVarA = A();
            if (mVarA.c()) {
                return mVarA;
            }
            throw bt.a.AbstractC0557a.n(mVarA);
        }
    }

    static {
        m mVar = new m(true);
        f200883m = mVar;
        mVar.g0();
    }

    public static m O() {
        return f200883m;
    }

    private void g0() {
        List list = Collections.EMPTY_LIST;
        this.f200887e = list;
        this.f200888f = list;
        this.f200889g = list;
        this.f200890h = u.A();
        this.f200891j = x.w();
    }

    public static b h0() {
        return b.F();
    }

    public static b i0(m mVar) {
        return h0().q(mVar);
    }

    public static m k0(InputStream inputStream, bt.g gVar) {
        return f200884n.c(inputStream, gVar);
    }

    @Override // bt.r
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public m i() {
        return f200883m;
    }

    public j R(int i15) {
        return this.f200887e.get(i15);
    }

    public int T() {
        return this.f200887e.size();
    }

    public List<j> U() {
        return this.f200887e;
    }

    public o V(int i15) {
        return this.f200888f.get(i15);
    }

    public int W() {
        return this.f200888f.size();
    }

    public List<o> X() {
        return this.f200888f;
    }

    public s Y(int i15) {
        return this.f200889g.get(i15);
    }

    public int a0() {
        return this.f200889g.size();
    }

    public List<s> b0() {
        return this.f200889g;
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f200892k;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        for (int i15 = 0; i15 < T(); i15++) {
            if (!R(i15).c()) {
                this.f200892k = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < W(); i16++) {
            if (!V(i16).c()) {
                this.f200892k = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < a0(); i17++) {
            if (!Y(i17).c()) {
                this.f200892k = (byte) 0;
                return false;
            }
        }
        if (e0() && !c0().c()) {
            this.f200892k = (byte) 0;
            return false;
        }
        if (u()) {
            this.f200892k = (byte) 1;
            return true;
        }
        this.f200892k = (byte) 0;
        return false;
    }

    public u c0() {
        return this.f200890h;
    }

    public x d0() {
        return this.f200891j;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f200893l;
        if (i15 != -1) {
            return i15;
        }
        int iS = 0;
        for (int i16 = 0; i16 < this.f200887e.size(); i16++) {
            iS += bt.f.s(3, this.f200887e.get(i16));
        }
        for (int i17 = 0; i17 < this.f200888f.size(); i17++) {
            iS += bt.f.s(4, this.f200888f.get(i17));
        }
        for (int i18 = 0; i18 < this.f200889g.size(); i18++) {
            iS += bt.f.s(5, this.f200889g.get(i18));
        }
        if ((this.f200886d & 1) == 1) {
            iS += bt.f.s(30, this.f200890h);
        }
        if ((this.f200886d & 2) == 2) {
            iS += bt.f.s(32, this.f200891j);
        }
        int iV = iS + v() + this.f200885c.size();
        this.f200893l = iV;
        return iV;
    }

    public boolean e0() {
        return (this.f200886d & 1) == 1;
    }

    public boolean f0() {
        return (this.f200886d & 2) == 2;
    }

    @Override // bt.i, bt.q
    public bt.s<m> j() {
        return f200884n;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return h0();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public b b() {
        return i0(this);
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        bt.i.d<MessageType>.a aVarC = C();
        for (int i15 = 0; i15 < this.f200887e.size(); i15++) {
            fVar.d0(3, this.f200887e.get(i15));
        }
        for (int i16 = 0; i16 < this.f200888f.size(); i16++) {
            fVar.d0(4, this.f200888f.get(i16));
        }
        for (int i17 = 0; i17 < this.f200889g.size(); i17++) {
            fVar.d0(5, this.f200889g.get(i17));
        }
        if ((this.f200886d & 1) == 1) {
            fVar.d0(30, this.f200890h);
        }
        if ((this.f200886d & 2) == 2) {
            fVar.d0(32, this.f200891j);
        }
        aVarC.a(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, fVar);
        fVar.i0(this.f200885c);
    }

    private m(bt.i.c<m, ?> cVar) {
        super(cVar);
        this.f200892k = (byte) -1;
        this.f200893l = -1;
        this.f200885c = cVar.p();
    }

    private m(boolean z15) {
        this.f200892k = (byte) -1;
        this.f200893l = -1;
        this.f200885c = bt.d.f21388a;
    }

    private m(bt.e eVar, bt.g gVar) {
        this.f200892k = (byte) -1;
        this.f200893l = -1;
        g0();
        bt.d.b bVarU = bt.d.u();
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z15 = false;
        int i15 = 0;
        while (!z15) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 26) {
                            int i16 = (i15 == true ? 1 : 0) & 1;
                            i15 = i15;
                            if (i16 != 1) {
                                this.f200887e = new ArrayList();
                                i15 = (i15 == true ? 1 : 0) | 1;
                            }
                            this.f200887e.add((j) eVar.u(j.D, gVar));
                        } else if (iK == 34) {
                            int i17 = (i15 == true ? 1 : 0) & 2;
                            i15 = i15;
                            if (i17 != 2) {
                                this.f200888f = new ArrayList();
                                i15 = (i15 == true ? 1 : 0) | 2;
                            }
                            this.f200888f.add((o) eVar.u(o.H, gVar));
                        } else if (iK != 42) {
                            if (iK == 242) {
                                u.b bVarK = (this.f200886d & 1) == 1 ? this.f200890h.b() : null;
                                u uVar = (u) eVar.u(u.f201100j, gVar);
                                this.f200890h = uVar;
                                if (bVarK != null) {
                                    bVarK.q(uVar);
                                    this.f200890h = bVarK.w();
                                }
                                this.f200886d |= 1;
                            } else if (iK != 258) {
                                if (!r(eVar, fVarJ, gVar, iK)) {
                                }
                            } else {
                                x.b bVarF = (this.f200886d & 2) == 2 ? this.f200891j.b() : null;
                                x xVar = (x) eVar.u(x.f201165g, gVar);
                                this.f200891j = xVar;
                                if (bVarF != null) {
                                    bVarF.q(xVar);
                                    this.f200891j = bVarF.w();
                                }
                                this.f200886d |= 2;
                            }
                        } else {
                            int i18 = (i15 == true ? 1 : 0) & 4;
                            i15 = i15;
                            if (i18 != 4) {
                                this.f200889g = new ArrayList();
                                i15 = (i15 == true ? 1 : 0) | 4;
                            }
                            this.f200889g.add((s) eVar.u(s.f201047t, gVar));
                        }
                    }
                    z15 = true;
                } catch (Throwable th4) {
                    if (((i15 == true ? 1 : 0) & 1) == 1) {
                        this.f200887e = Collections.unmodifiableList(this.f200887e);
                    }
                    if (((i15 == true ? 1 : 0) & 2) == 2) {
                        this.f200888f = Collections.unmodifiableList(this.f200888f);
                    }
                    if (((i15 == true ? 1 : 0) & 4) == 4) {
                        this.f200889g = Collections.unmodifiableList(this.f200889g);
                    }
                    try {
                        fVarJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f200885c = bVarU.r();
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
        if (((i15 == true ? 1 : 0) & 1) == 1) {
            this.f200887e = Collections.unmodifiableList(this.f200887e);
        }
        if (((i15 == true ? 1 : 0) & 2) == 2) {
            this.f200888f = Collections.unmodifiableList(this.f200888f);
        }
        if (((i15 == true ? 1 : 0) & 4) == 4) {
            this.f200889g = Collections.unmodifiableList(this.f200889g);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f200885c = bVarU.r();
        }
        n();
    }
}
