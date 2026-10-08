package us;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends bt.i implements bt.r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final x f201164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static bt.s<x> f201165g = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt.d f201166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<w> f201167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f201168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f201169e;

    static class a extends bt.b<x> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public x b(bt.e eVar, bt.g gVar) {
            return new x(eVar, gVar);
        }
    }

    public static final class b extends bt.i.b<x, b> implements bt.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f201170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<w> f201171c = Collections.EMPTY_LIST;

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
            if ((this.f201170b & 1) != 1) {
                this.f201171c = new ArrayList(this.f201171c);
                this.f201170b |= 1;
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            x xVar = null;
            try {
                try {
                    x xVarB = x.f201165g.b(eVar, gVar);
                    if (xVarB != null) {
                        q(xVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    x xVar2 = (x) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        xVar = xVar2;
                        if (xVar != null) {
                            q(xVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (xVar != null) {
                    q(xVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public b q(x xVar) {
            if (xVar == x.w()) {
                return this;
            }
            if (!xVar.f201167c.isEmpty()) {
                if (this.f201171c.isEmpty()) {
                    this.f201171c = xVar.f201167c;
                    this.f201170b &= -2;
                } else {
                    z();
                    this.f201171c.addAll(xVar.f201167c);
                }
            }
            s(p().f(xVar.f201166b));
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public x build() {
            x xVarW = w();
            if (xVarW.c()) {
                return xVarW;
            }
            throw bt.a.AbstractC0557a.n(xVarW);
        }

        public x w() {
            x xVar = new x(this);
            if ((this.f201170b & 1) == 1) {
                this.f201171c = Collections.unmodifiableList(this.f201171c);
                this.f201170b &= -2;
            }
            xVar.f201167c = this.f201171c;
            return xVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b o() {
            return y().q(w());
        }
    }

    static {
        x xVar = new x(true);
        f201164f = xVar;
        xVar.B();
    }

    private void B() {
        this.f201167c = Collections.EMPTY_LIST;
    }

    public static b C() {
        return b.y();
    }

    public static b D(x xVar) {
        return C().q(xVar);
    }

    public static x w() {
        return f201164f;
    }

    public List<w> A() {
        return this.f201167c;
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
        byte b15 = this.f201168d;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        this.f201168d = (byte) 1;
        return true;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f201169e;
        if (i15 != -1) {
            return i15;
        }
        int iS = 0;
        for (int i16 = 0; i16 < this.f201167c.size(); i16++) {
            iS += bt.f.s(1, this.f201167c.get(i16));
        }
        int size = iS + this.f201166b.size();
        this.f201169e = size;
        return size;
    }

    @Override // bt.i, bt.q
    public bt.s<x> j() {
        return f201165g;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        for (int i15 = 0; i15 < this.f201167c.size(); i15++) {
            fVar.d0(1, this.f201167c.get(i15));
        }
        fVar.i0(this.f201166b);
    }

    public int y() {
        return this.f201167c.size();
    }

    private x(bt.i.b bVar) {
        super(bVar);
        this.f201168d = (byte) -1;
        this.f201169e = -1;
        this.f201166b = bVar.p();
    }

    private x(boolean z15) {
        this.f201168d = (byte) -1;
        this.f201169e = -1;
        this.f201166b = bt.d.f21388a;
    }

    private x(bt.e eVar, bt.g gVar) {
        this.f201168d = (byte) -1;
        this.f201169e = -1;
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
                                    this.f201167c = new ArrayList();
                                    z16 = true;
                                }
                                this.f201167c.add((w) eVar.u(w.f201134n, gVar));
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
                    this.f201167c = Collections.unmodifiableList(this.f201167c);
                }
                try {
                    fVarJ.I();
                } catch (IOException unused) {
                } finally {
                    this.f201166b = bVarU.r();
                }
                n();
                throw th4;
            }
        }
        if (z16) {
            this.f201167c = Collections.unmodifiableList(this.f201167c);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f201166b = bVarU.r();
        }
        n();
    }
}
