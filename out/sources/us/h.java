package us;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.x509.DisplayText;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends bt.i.d<h> implements bt.r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final h f200791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static bt.s<h> f200792k = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bt.d f200793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f200794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f200795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<us.b> f200796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f200797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f200798h;

    static class a extends bt.b<h> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public h b(bt.e eVar, bt.g gVar) {
            return new h(eVar, gVar);
        }
    }

    public static final class b extends bt.i.c<h, b> implements bt.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f200799d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f200800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<us.b> f200801f = Collections.EMPTY_LIST;

        private b() {
            H();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b F() {
            return new b();
        }

        private void G() {
            if ((this.f200799d & 2) != 2) {
                this.f200801f = new ArrayList(this.f200801f);
                this.f200799d |= 2;
            }
        }

        private void H() {
        }

        public h A() {
            h hVar = new h(this);
            int i15 = (this.f200799d & 1) != 1 ? 0 : 1;
            hVar.f200795e = this.f200800e;
            if ((this.f200799d & 2) == 2) {
                this.f200801f = Collections.unmodifiableList(this.f200801f);
                this.f200799d &= -3;
            }
            hVar.f200796f = this.f200801f;
            hVar.f200794d = i15;
            return hVar;
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
            h hVar = null;
            try {
                try {
                    h hVarB = h.f200792k.b(eVar, gVar);
                    if (hVarB != null) {
                        q(hVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    h hVar2 = (h) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        hVar = hVar2;
                        if (hVar != null) {
                            q(hVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (hVar != null) {
                    q(hVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public b q(h hVar) {
            if (hVar == h.M()) {
                return this;
            }
            if (hVar.Q()) {
                K(hVar.O());
            }
            if (!hVar.f200796f.isEmpty()) {
                if (this.f200801f.isEmpty()) {
                    this.f200801f = hVar.f200796f;
                    this.f200799d &= -3;
                } else {
                    G();
                    this.f200801f.addAll(hVar.f200796f);
                }
            }
            x(hVar);
            s(p().f(hVar.f200793c));
            return this;
        }

        public b K(int i15) {
            this.f200799d |= 1;
            this.f200800e = i15;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public h build() {
            h hVarA = A();
            if (hVarA.c()) {
                return hVarA;
            }
            throw bt.a.AbstractC0557a.n(hVarA);
        }
    }

    static {
        h hVar = new h(true);
        f200791j = hVar;
        hVar.R();
    }

    public static h M() {
        return f200791j;
    }

    private void R() {
        this.f200795e = 0;
        this.f200796f = Collections.EMPTY_LIST;
    }

    public static b T() {
        return b.F();
    }

    public static b U(h hVar) {
        return T().q(hVar);
    }

    public us.b J(int i15) {
        return this.f200796f.get(i15);
    }

    public int K() {
        return this.f200796f.size();
    }

    public List<us.b> L() {
        return this.f200796f;
    }

    @Override // bt.r
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public h i() {
        return f200791j;
    }

    public int O() {
        return this.f200795e;
    }

    public boolean Q() {
        return (this.f200794d & 1) == 1;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public b g() {
        return T();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public b b() {
        return U(this);
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f200797g;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        for (int i15 = 0; i15 < K(); i15++) {
            if (!J(i15).c()) {
                this.f200797g = (byte) 0;
                return false;
            }
        }
        if (u()) {
            this.f200797g = (byte) 1;
            return true;
        }
        this.f200797g = (byte) 0;
        return false;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f200798h;
        if (i15 != -1) {
            return i15;
        }
        int iO = (this.f200794d & 1) == 1 ? bt.f.o(1, this.f200795e) : 0;
        for (int i16 = 0; i16 < this.f200796f.size(); i16++) {
            iO += bt.f.s(2, this.f200796f.get(i16));
        }
        int iV = iO + v() + this.f200793c.size();
        this.f200798h = iV;
        return iV;
    }

    @Override // bt.i, bt.q
    public bt.s<h> j() {
        return f200792k;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        bt.i.d<MessageType>.a aVarC = C();
        if ((this.f200794d & 1) == 1) {
            fVar.a0(1, this.f200795e);
        }
        for (int i15 = 0; i15 < this.f200796f.size(); i15++) {
            fVar.d0(2, this.f200796f.get(i15));
        }
        aVarC.a(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, fVar);
        fVar.i0(this.f200793c);
    }

    private h(bt.i.c<h, ?> cVar) {
        super(cVar);
        this.f200797g = (byte) -1;
        this.f200798h = -1;
        this.f200793c = cVar.p();
    }

    private h(boolean z15) {
        this.f200797g = (byte) -1;
        this.f200798h = -1;
        this.f200793c = bt.d.f21388a;
    }

    private h(bt.e eVar, bt.g gVar) {
        this.f200797g = (byte) -1;
        this.f200798h = -1;
        R();
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
                            this.f200794d |= 1;
                            this.f200795e = eVar.s();
                        } else if (iK != 18) {
                            if (!r(eVar, fVarJ, gVar, iK)) {
                            }
                        } else {
                            if ((c15 & 2) != 2) {
                                this.f200796f = new ArrayList();
                                c15 = 2;
                            }
                            this.f200796f.add((us.b) eVar.u(us.b.f200603j, gVar));
                        }
                    }
                    z15 = true;
                } catch (Throwable th4) {
                    if ((c15 & 2) == 2) {
                        this.f200796f = Collections.unmodifiableList(this.f200796f);
                    }
                    try {
                        fVarJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f200793c = bVarU.r();
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
            this.f200796f = Collections.unmodifiableList(this.f200796f);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f200793c = bVarU.r();
        }
        n();
    }
}
