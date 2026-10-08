package us;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends bt.i implements bt.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final u f201099h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static bt.s<u> f201100j = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt.d f201101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f201102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<r> f201103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f201104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte f201105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f201106g;

    static class a extends bt.b<u> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public u b(bt.e eVar, bt.g gVar) {
            return new u(eVar, gVar);
        }
    }

    public static final class b extends bt.i.b<u, b> implements bt.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f201107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<r> f201108c = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f201109d = -1;

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
            if ((this.f201107b & 1) != 1) {
                this.f201108c = new ArrayList(this.f201108c);
                this.f201107b |= 1;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            u uVar = null;
            try {
                try {
                    u uVarB = u.f201100j.b(eVar, gVar);
                    if (uVarB != null) {
                        q(uVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    u uVar2 = (u) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        uVar = uVar2;
                        if (uVar != null) {
                            q(uVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (uVar != null) {
                    q(uVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public b q(u uVar) {
            if (uVar == u.A()) {
                return this;
            }
            if (!uVar.f201103d.isEmpty()) {
                if (this.f201108c.isEmpty()) {
                    this.f201108c = uVar.f201103d;
                    this.f201107b &= -2;
                } else {
                    z();
                    this.f201108c.addAll(uVar.f201103d);
                }
            }
            if (uVar.F()) {
                G(uVar.B());
            }
            s(p().f(uVar.f201101b));
            return this;
        }

        public b G(int i15) {
            this.f201107b |= 2;
            this.f201109d = i15;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public u build() {
            u uVarW = w();
            if (uVarW.c()) {
                return uVarW;
            }
            throw bt.a.AbstractC0557a.n(uVarW);
        }

        public u w() {
            u uVar = new u(this);
            int i15 = this.f201107b;
            if ((i15 & 1) == 1) {
                this.f201108c = Collections.unmodifiableList(this.f201108c);
                this.f201107b &= -2;
            }
            uVar.f201103d = this.f201108c;
            int i16 = (i15 & 2) != 2 ? 0 : 1;
            uVar.f201104e = this.f201109d;
            uVar.f201102c = i16;
            return uVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b o() {
            return y().q(w());
        }
    }

    static {
        u uVar = new u(true);
        f201099h = uVar;
        uVar.G();
    }

    public static u A() {
        return f201099h;
    }

    private void G() {
        this.f201103d = Collections.EMPTY_LIST;
        this.f201104e = -1;
    }

    public static b H() {
        return b.y();
    }

    public static b I(u uVar) {
        return H().q(uVar);
    }

    public int B() {
        return this.f201104e;
    }

    public r C(int i15) {
        return this.f201103d.get(i15);
    }

    public int D() {
        return this.f201103d.size();
    }

    public List<r> E() {
        return this.f201103d;
    }

    public boolean F() {
        return (this.f201102c & 1) == 1;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public b g() {
        return H();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public b b() {
        return I(this);
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f201105f;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        for (int i15 = 0; i15 < D(); i15++) {
            if (!C(i15).c()) {
                this.f201105f = (byte) 0;
                return false;
            }
        }
        this.f201105f = (byte) 1;
        return true;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f201106g;
        if (i15 != -1) {
            return i15;
        }
        int iO = 0;
        for (int i16 = 0; i16 < this.f201103d.size(); i16++) {
            iO += bt.f.s(1, this.f201103d.get(i16));
        }
        if ((this.f201102c & 1) == 1) {
            iO += bt.f.o(2, this.f201104e);
        }
        int size = iO + this.f201101b.size();
        this.f201106g = size;
        return size;
    }

    @Override // bt.i, bt.q
    public bt.s<u> j() {
        return f201100j;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        for (int i15 = 0; i15 < this.f201103d.size(); i15++) {
            fVar.d0(1, this.f201103d.get(i15));
        }
        if ((this.f201102c & 1) == 1) {
            fVar.a0(2, this.f201104e);
        }
        fVar.i0(this.f201101b);
    }

    private u(bt.i.b bVar) {
        super(bVar);
        this.f201105f = (byte) -1;
        this.f201106g = -1;
        this.f201101b = bVar.p();
    }

    private u(boolean z15) {
        this.f201105f = (byte) -1;
        this.f201106g = -1;
        this.f201101b = bt.d.f21388a;
    }

    private u(bt.e eVar, bt.g gVar) {
        this.f201105f = (byte) -1;
        this.f201106g = -1;
        G();
        bt.d.b bVarU = bt.d.u();
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z15 = false;
        boolean z16 = false;
        while (!z15) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            if (!z16) {
                                this.f201103d = new ArrayList();
                                z16 = true;
                            }
                            this.f201103d.add((r) eVar.u(r.f200992y, gVar));
                        } else if (iK != 16) {
                            if (!r(eVar, fVarJ, gVar, iK)) {
                            }
                        } else {
                            this.f201102c |= 1;
                            this.f201104e = eVar.s();
                        }
                    }
                    z15 = true;
                } catch (Throwable th4) {
                    if (z16) {
                        this.f201103d = Collections.unmodifiableList(this.f201103d);
                    }
                    try {
                        fVarJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f201101b = bVarU.r();
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
        if (z16) {
            this.f201103d = Collections.unmodifiableList(this.f201103d);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f201101b = bVarU.r();
        }
        n();
    }
}
