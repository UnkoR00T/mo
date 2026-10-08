package us;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.x509.DisplayText;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends bt.i.d<n> implements bt.r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final n f200900l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static bt.s<n> f200901m = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bt.d f200902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f200903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q f200904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p f200905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private m f200906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<c> f200907h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte f200908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f200909k;

    static class a extends bt.b<n> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public n b(bt.e eVar, bt.g gVar) {
            return new n(eVar, gVar);
        }
    }

    public static final class b extends bt.i.c<n, b> implements bt.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f200910d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private q f200911e = q.w();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private p f200912f = p.w();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private m f200913g = m.O();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<c> f200914h = Collections.EMPTY_LIST;

        private b() {
            H();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b F() {
            return new b();
        }

        private void G() {
            if ((this.f200910d & 8) != 8) {
                this.f200914h = new ArrayList(this.f200914h);
                this.f200910d |= 8;
            }
        }

        private void H() {
        }

        public n A() {
            n nVar = new n(this);
            int i15 = this.f200910d;
            int i16 = (i15 & 1) != 1 ? 0 : 1;
            nVar.f200904e = this.f200911e;
            if ((i15 & 2) == 2) {
                i16 |= 2;
            }
            nVar.f200905f = this.f200912f;
            if ((i15 & 4) == 4) {
                i16 |= 4;
            }
            nVar.f200906g = this.f200913g;
            if ((this.f200910d & 8) == 8) {
                this.f200914h = Collections.unmodifiableList(this.f200914h);
                this.f200910d &= -9;
            }
            nVar.f200907h = this.f200914h;
            nVar.f200903d = i16;
            return nVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b o() {
            return F().q(A());
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            n nVar = null;
            try {
                try {
                    n nVarB = n.f200901m.b(eVar, gVar);
                    if (nVarB != null) {
                        q(nVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    n nVar2 = (n) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        nVar = nVar2;
                        if (nVar != null) {
                            q(nVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (nVar != null) {
                    q(nVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public b q(n nVar) {
            if (nVar == n.O()) {
                return this;
            }
            if (nVar.X()) {
                O(nVar.U());
            }
            if (nVar.W()) {
                N(nVar.T());
            }
            if (nVar.V()) {
                K(nVar.R());
            }
            if (!nVar.f200907h.isEmpty()) {
                if (this.f200914h.isEmpty()) {
                    this.f200914h = nVar.f200907h;
                    this.f200910d &= -9;
                } else {
                    G();
                    this.f200914h.addAll(nVar.f200907h);
                }
            }
            x(nVar);
            s(p().f(nVar.f200902c));
            return this;
        }

        public b K(m mVar) {
            if ((this.f200910d & 4) != 4 || this.f200913g == m.O()) {
                this.f200913g = mVar;
            } else {
                this.f200913g = m.i0(this.f200913g).q(mVar).A();
            }
            this.f200910d |= 4;
            return this;
        }

        public b N(p pVar) {
            if ((this.f200910d & 2) != 2 || this.f200912f == p.w()) {
                this.f200912f = pVar;
            } else {
                this.f200912f = p.D(this.f200912f).q(pVar).w();
            }
            this.f200910d |= 2;
            return this;
        }

        public b O(q qVar) {
            if ((this.f200910d & 1) != 1 || this.f200911e == q.w()) {
                this.f200911e = qVar;
            } else {
                this.f200911e = q.D(this.f200911e).q(qVar).w();
            }
            this.f200910d |= 1;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public n build() {
            n nVarA = A();
            if (nVarA.c()) {
                return nVarA;
            }
            throw bt.a.AbstractC0557a.n(nVarA);
        }
    }

    static {
        n nVar = new n(true);
        f200900l = nVar;
        nVar.Y();
    }

    public static n O() {
        return f200900l;
    }

    private void Y() {
        this.f200904e = q.w();
        this.f200905f = p.w();
        this.f200906g = m.O();
        this.f200907h = Collections.EMPTY_LIST;
    }

    public static b a0() {
        return b.F();
    }

    public static b b0(n nVar) {
        return a0().q(nVar);
    }

    public static n d0(InputStream inputStream, bt.g gVar) {
        return f200901m.c(inputStream, gVar);
    }

    public c L(int i15) {
        return this.f200907h.get(i15);
    }

    public int M() {
        return this.f200907h.size();
    }

    public List<c> N() {
        return this.f200907h;
    }

    @Override // bt.r
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public n i() {
        return f200900l;
    }

    public m R() {
        return this.f200906g;
    }

    public p T() {
        return this.f200905f;
    }

    public q U() {
        return this.f200904e;
    }

    public boolean V() {
        return (this.f200903d & 4) == 4;
    }

    public boolean W() {
        return (this.f200903d & 2) == 2;
    }

    public boolean X() {
        return (this.f200903d & 1) == 1;
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f200908j;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        if (W() && !T().c()) {
            this.f200908j = (byte) 0;
            return false;
        }
        if (V() && !R().c()) {
            this.f200908j = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < M(); i15++) {
            if (!L(i15).c()) {
                this.f200908j = (byte) 0;
                return false;
            }
        }
        if (u()) {
            this.f200908j = (byte) 1;
            return true;
        }
        this.f200908j = (byte) 0;
        return false;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return a0();
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f200909k;
        if (i15 != -1) {
            return i15;
        }
        int iS = (this.f200903d & 1) == 1 ? bt.f.s(1, this.f200904e) : 0;
        if ((this.f200903d & 2) == 2) {
            iS += bt.f.s(2, this.f200905f);
        }
        if ((this.f200903d & 4) == 4) {
            iS += bt.f.s(3, this.f200906g);
        }
        for (int i16 = 0; i16 < this.f200907h.size(); i16++) {
            iS += bt.f.s(4, this.f200907h.get(i16));
        }
        int iV = iS + v() + this.f200902c.size();
        this.f200909k = iV;
        return iV;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public b b() {
        return b0(this);
    }

    @Override // bt.i, bt.q
    public bt.s<n> j() {
        return f200901m;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        bt.i.d<MessageType>.a aVarC = C();
        if ((this.f200903d & 1) == 1) {
            fVar.d0(1, this.f200904e);
        }
        if ((this.f200903d & 2) == 2) {
            fVar.d0(2, this.f200905f);
        }
        if ((this.f200903d & 4) == 4) {
            fVar.d0(3, this.f200906g);
        }
        for (int i15 = 0; i15 < this.f200907h.size(); i15++) {
            fVar.d0(4, this.f200907h.get(i15));
        }
        aVarC.a(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, fVar);
        fVar.i0(this.f200902c);
    }

    private n(bt.i.c<n, ?> cVar) {
        super(cVar);
        this.f200908j = (byte) -1;
        this.f200909k = -1;
        this.f200902c = cVar.p();
    }

    private n(boolean z15) {
        this.f200908j = (byte) -1;
        this.f200909k = -1;
        this.f200902c = bt.d.f21388a;
    }

    private n(bt.e eVar, bt.g gVar) {
        this.f200908j = (byte) -1;
        this.f200909k = -1;
        Y();
        bt.d.b bVarU = bt.d.u();
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z15 = false;
        char c15 = 0;
        while (!z15) {
            try {
                try {
                    int iK = eVar.K();
                    if (iK != 0) {
                        if (iK == 10) {
                            q.b bVarF = (this.f200903d & 1) == 1 ? this.f200904e.b() : null;
                            q qVar = (q) eVar.u(q.f200984g, gVar);
                            this.f200904e = qVar;
                            if (bVarF != null) {
                                bVarF.q(qVar);
                                this.f200904e = bVarF.w();
                            }
                            this.f200903d |= 1;
                        } else if (iK == 18) {
                            p.b bVarF2 = (this.f200903d & 2) == 2 ? this.f200905f.b() : null;
                            p pVar = (p) eVar.u(p.f200957g, gVar);
                            this.f200905f = pVar;
                            if (bVarF2 != null) {
                                bVarF2.q(pVar);
                                this.f200905f = bVarF2.w();
                            }
                            this.f200903d |= 2;
                        } else if (iK == 26) {
                            m.b bVarB = (this.f200903d & 4) == 4 ? this.f200906g.b() : null;
                            m mVar = (m) eVar.u(m.f200884n, gVar);
                            this.f200906g = mVar;
                            if (bVarB != null) {
                                bVarB.q(mVar);
                                this.f200906g = bVarB.A();
                            }
                            this.f200903d |= 4;
                        } else if (iK != 34) {
                            if (!r(eVar, fVarJ, gVar, iK)) {
                            }
                        } else {
                            int i15 = (c15 == true ? 1 : 0) & '\b';
                            c15 = c15;
                            if (i15 != 8) {
                                this.f200907h = new ArrayList();
                                c15 = '\b';
                            }
                            this.f200907h.add((c) eVar.u(c.O, gVar));
                        }
                    }
                    z15 = true;
                } catch (Throwable th4) {
                    if (((c15 == true ? 1 : 0) & '\b') == 8) {
                        this.f200907h = Collections.unmodifiableList(this.f200907h);
                    }
                    try {
                        fVarJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f200902c = bVarU.r();
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
        if (((c15 == true ? 1 : 0) & '\b') == 8) {
            this.f200907h = Collections.unmodifiableList(this.f200907h);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f200902c = bVarU.r();
        }
        n();
    }
}
