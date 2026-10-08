package us;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends bt.i implements bt.r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f200748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static bt.s<f> f200749g = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt.d f200750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<g> f200751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f200752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f200753e;

    static class a extends bt.b<f> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public f b(bt.e eVar, bt.g gVar) {
            return new f(eVar, gVar);
        }
    }

    public static final class b extends bt.i.b<f, b> implements bt.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f200754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<g> f200755c = Collections.EMPTY_LIST;

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
            if ((this.f200754b & 1) != 1) {
                this.f200755c = new ArrayList(this.f200755c);
                this.f200754b |= 1;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            f fVar = null;
            try {
                try {
                    f fVarB = f.f200749g.b(eVar, gVar);
                    if (fVarB != null) {
                        q(fVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    f fVar2 = (f) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        fVar = fVar2;
                        if (fVar != null) {
                            q(fVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (fVar != null) {
                    q(fVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public b q(f fVar) {
            if (fVar == f.w()) {
                return this;
            }
            if (!fVar.f200751c.isEmpty()) {
                if (this.f200755c.isEmpty()) {
                    this.f200755c = fVar.f200751c;
                    this.f200754b &= -2;
                } else {
                    z();
                    this.f200755c.addAll(fVar.f200751c);
                }
            }
            s(p().f(fVar.f200750b));
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public f build() {
            f fVarW = w();
            if (fVarW.c()) {
                return fVarW;
            }
            throw bt.a.AbstractC0557a.n(fVarW);
        }

        public f w() {
            f fVar = new f(this);
            if ((this.f200754b & 1) == 1) {
                this.f200755c = Collections.unmodifiableList(this.f200755c);
                this.f200754b &= -2;
            }
            fVar.f200751c = this.f200755c;
            return fVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b o() {
            return y().q(w());
        }
    }

    static {
        f fVar = new f(true);
        f200748f = fVar;
        fVar.C();
    }

    private void C() {
        this.f200751c = Collections.EMPTY_LIST;
    }

    public static b D() {
        return b.y();
    }

    public static b E(f fVar) {
        return D().q(fVar);
    }

    public static f w() {
        return f200748f;
    }

    public int A() {
        return this.f200751c.size();
    }

    public List<g> B() {
        return this.f200751c;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public b g() {
        return D();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b b() {
        return E(this);
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f200752d;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        for (int i15 = 0; i15 < A(); i15++) {
            if (!y(i15).c()) {
                this.f200752d = (byte) 0;
                return false;
            }
        }
        this.f200752d = (byte) 1;
        return true;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f200753e;
        if (i15 != -1) {
            return i15;
        }
        int iS = 0;
        for (int i16 = 0; i16 < this.f200751c.size(); i16++) {
            iS += bt.f.s(1, this.f200751c.get(i16));
        }
        int size = iS + this.f200750b.size();
        this.f200753e = size;
        return size;
    }

    @Override // bt.i, bt.q
    public bt.s<f> j() {
        return f200749g;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        for (int i15 = 0; i15 < this.f200751c.size(); i15++) {
            fVar.d0(1, this.f200751c.get(i15));
        }
        fVar.i0(this.f200750b);
    }

    public g y(int i15) {
        return this.f200751c.get(i15);
    }

    private f(bt.i.b bVar) {
        super(bVar);
        this.f200752d = (byte) -1;
        this.f200753e = -1;
        this.f200750b = bVar.p();
    }

    private f(boolean z15) {
        this.f200752d = (byte) -1;
        this.f200753e = -1;
        this.f200750b = bt.d.f21388a;
    }

    private f(bt.e eVar, bt.g gVar) {
        this.f200752d = (byte) -1;
        this.f200753e = -1;
        C();
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
                                    this.f200751c = new ArrayList();
                                    z16 = true;
                                }
                                this.f200751c.add((g) eVar.u(g.f200757m, gVar));
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
                    this.f200751c = Collections.unmodifiableList(this.f200751c);
                }
                try {
                    fVarJ.I();
                } catch (IOException unused) {
                } finally {
                    this.f200750b = bVarU.r();
                }
                n();
                throw th4;
            }
        }
        if (z16) {
            this.f200751c = Collections.unmodifiableList(this.f200751c);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f200750b = bVarU.r();
        }
        n();
    }
}
