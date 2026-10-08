package us;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.x509.DisplayText;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends bt.i.d<s> implements bt.r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final s f201046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static bt.s<s> f201047t = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bt.d f201048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f201049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f201050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f201051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<t> f201052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f201053h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f201054j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private r f201055k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f201056l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<us.b> f201057m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<Integer> f201058n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<d> f201059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private byte f201060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f201061r;

    static class a extends bt.b<s> {
        a() {
        }

        @Override // bt.s
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public s b(bt.e eVar, bt.g gVar) {
            return new s(eVar, gVar);
        }
    }

    public static final class b extends bt.i.c<s, b> implements bt.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f201062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f201063e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f201064f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<t> f201065g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private r f201066h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f201067j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private r f201068k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f201069l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private List<us.b> f201070m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private List<Integer> f201071n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List<d> f201072p;

        private b() {
            List list = Collections.EMPTY_LIST;
            this.f201065g = list;
            this.f201066h = r.e0();
            this.f201068k = r.e0();
            this.f201070m = list;
            this.f201071n = list;
            this.f201072p = list;
            K();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b F() {
            return new b();
        }

        private void G() {
            if ((this.f201062d & 128) != 128) {
                this.f201070m = new ArrayList(this.f201070m);
                this.f201062d |= 128;
            }
        }

        private void H() {
            if ((this.f201062d & 512) != 512) {
                this.f201072p = new ArrayList(this.f201072p);
                this.f201062d |= 512;
            }
        }

        private void I() {
            if ((this.f201062d & 4) != 4) {
                this.f201065g = new ArrayList(this.f201065g);
                this.f201062d |= 4;
            }
        }

        private void J() {
            if ((this.f201062d & 256) != 256) {
                this.f201071n = new ArrayList(this.f201071n);
                this.f201062d |= 256;
            }
        }

        private void K() {
        }

        public s A() {
            s sVar = new s(this);
            int i15 = this.f201062d;
            int i16 = (i15 & 1) != 1 ? 0 : 1;
            sVar.f201050e = this.f201063e;
            if ((i15 & 2) == 2) {
                i16 |= 2;
            }
            sVar.f201051f = this.f201064f;
            if ((this.f201062d & 4) == 4) {
                this.f201065g = Collections.unmodifiableList(this.f201065g);
                this.f201062d &= -5;
            }
            sVar.f201052g = this.f201065g;
            if ((i15 & 8) == 8) {
                i16 |= 4;
            }
            sVar.f201053h = this.f201066h;
            if ((i15 & 16) == 16) {
                i16 |= 8;
            }
            sVar.f201054j = this.f201067j;
            if ((i15 & 32) == 32) {
                i16 |= 16;
            }
            sVar.f201055k = this.f201068k;
            if ((i15 & 64) == 64) {
                i16 |= 32;
            }
            sVar.f201056l = this.f201069l;
            if ((this.f201062d & 128) == 128) {
                this.f201070m = Collections.unmodifiableList(this.f201070m);
                this.f201062d &= -129;
            }
            sVar.f201057m = this.f201070m;
            if ((this.f201062d & 256) == 256) {
                this.f201071n = Collections.unmodifiableList(this.f201071n);
                this.f201062d &= -257;
            }
            sVar.f201058n = this.f201071n;
            if ((this.f201062d & 512) == 512) {
                this.f201072p = Collections.unmodifiableList(this.f201072p);
                this.f201062d &= -513;
            }
            sVar.f201059p = this.f201072p;
            sVar.f201049d = i16;
            return sVar;
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public b o() {
            return F().q(A());
        }

        public b N(r rVar) {
            if ((this.f201062d & 32) != 32 || this.f201068k == r.e0()) {
                this.f201068k = rVar;
            } else {
                this.f201068k = r.F0(this.f201068k).q(rVar).A();
            }
            this.f201062d |= 32;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // bt.a.AbstractC0557a
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public b l(bt.e eVar, bt.g gVar) throws Throwable {
            s sVar = null;
            try {
                try {
                    s sVarB = s.f201047t.b(eVar, gVar);
                    if (sVarB != null) {
                        q(sVarB);
                    }
                    return this;
                } catch (bt.k e15) {
                    s sVar2 = (s) e15.a();
                    try {
                        throw e15;
                    } catch (Throwable th4) {
                        th = th4;
                        sVar = sVar2;
                        if (sVar != null) {
                            q(sVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                if (sVar != null) {
                    q(sVar);
                }
                throw th;
            }
        }

        @Override // bt.i.b
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public b q(s sVar) {
            if (sVar == s.c0()) {
                return this;
            }
            if (sVar.q0()) {
                S(sVar.g0());
            }
            if (sVar.r0()) {
                T(sVar.h0());
            }
            if (!sVar.f201052g.isEmpty()) {
                if (this.f201065g.isEmpty()) {
                    this.f201065g = sVar.f201052g;
                    this.f201062d &= -5;
                } else {
                    I();
                    this.f201065g.addAll(sVar.f201052g);
                }
            }
            if (sVar.s0()) {
                Q(sVar.l0());
            }
            if (sVar.t0()) {
                U(sVar.m0());
            }
            if (sVar.o0()) {
                N(sVar.e0());
            }
            if (sVar.p0()) {
                R(sVar.f0());
            }
            if (!sVar.f201057m.isEmpty()) {
                if (this.f201070m.isEmpty()) {
                    this.f201070m = sVar.f201057m;
                    this.f201062d &= -129;
                } else {
                    G();
                    this.f201070m.addAll(sVar.f201057m);
                }
            }
            if (!sVar.f201058n.isEmpty()) {
                if (this.f201071n.isEmpty()) {
                    this.f201071n = sVar.f201058n;
                    this.f201062d &= -257;
                } else {
                    J();
                    this.f201071n.addAll(sVar.f201058n);
                }
            }
            if (!sVar.f201059p.isEmpty()) {
                if (this.f201072p.isEmpty()) {
                    this.f201072p = sVar.f201059p;
                    this.f201062d &= -513;
                } else {
                    H();
                    this.f201072p.addAll(sVar.f201059p);
                }
            }
            x(sVar);
            s(p().f(sVar.f201048c));
            return this;
        }

        public b Q(r rVar) {
            if ((this.f201062d & 8) != 8 || this.f201066h == r.e0()) {
                this.f201066h = rVar;
            } else {
                this.f201066h = r.F0(this.f201066h).q(rVar).A();
            }
            this.f201062d |= 8;
            return this;
        }

        public b R(int i15) {
            this.f201062d |= 64;
            this.f201069l = i15;
            return this;
        }

        public b S(int i15) {
            this.f201062d |= 1;
            this.f201063e = i15;
            return this;
        }

        public b T(int i15) {
            this.f201062d |= 2;
            this.f201064f = i15;
            return this;
        }

        public b U(int i15) {
            this.f201062d |= 16;
            this.f201067j = i15;
            return this;
        }

        @Override // bt.q.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public s build() {
            s sVarA = A();
            if (sVarA.c()) {
                return sVarA;
            }
            throw bt.a.AbstractC0557a.n(sVarA);
        }
    }

    static {
        s sVar = new s(true);
        f201046s = sVar;
        sVar.u0();
    }

    public static s c0() {
        return f201046s;
    }

    private void u0() {
        this.f201050e = 6;
        this.f201051f = 0;
        List list = Collections.EMPTY_LIST;
        this.f201052g = list;
        this.f201053h = r.e0();
        this.f201054j = 0;
        this.f201055k = r.e0();
        this.f201056l = 0;
        this.f201057m = list;
        this.f201058n = list;
        this.f201059p = list;
    }

    public static b v0() {
        return b.F();
    }

    public static b w0(s sVar) {
        return v0().q(sVar);
    }

    public static s y0(InputStream inputStream, bt.g gVar) {
        return f201047t.a(inputStream, gVar);
    }

    public us.b W(int i15) {
        return this.f201057m.get(i15);
    }

    public int X() {
        return this.f201057m.size();
    }

    public List<us.b> Y() {
        return this.f201057m;
    }

    public d a0(int i15) {
        return this.f201059p.get(i15);
    }

    public int b0() {
        return this.f201059p.size();
    }

    @Override // bt.r
    public final boolean c() {
        byte b15 = this.f201060q;
        if (b15 == 1) {
            return true;
        }
        if (b15 == 0) {
            return false;
        }
        if (!r0()) {
            this.f201060q = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < j0(); i15++) {
            if (!i0(i15).c()) {
                this.f201060q = (byte) 0;
                return false;
            }
        }
        if (s0() && !l0().c()) {
            this.f201060q = (byte) 0;
            return false;
        }
        if (o0() && !e0().c()) {
            this.f201060q = (byte) 0;
            return false;
        }
        for (int i16 = 0; i16 < X(); i16++) {
            if (!W(i16).c()) {
                this.f201060q = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < b0(); i17++) {
            if (!a0(i17).c()) {
                this.f201060q = (byte) 0;
                return false;
            }
        }
        if (u()) {
            this.f201060q = (byte) 1;
            return true;
        }
        this.f201060q = (byte) 0;
        return false;
    }

    @Override // bt.r
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public s i() {
        return f201046s;
    }

    @Override // bt.q
    public int e() {
        int i15 = this.f201061r;
        if (i15 != -1) {
            return i15;
        }
        int iO = (this.f201049d & 1) == 1 ? bt.f.o(1, this.f201050e) : 0;
        if ((this.f201049d & 2) == 2) {
            iO += bt.f.o(2, this.f201051f);
        }
        for (int i16 = 0; i16 < this.f201052g.size(); i16++) {
            iO += bt.f.s(3, this.f201052g.get(i16));
        }
        if ((this.f201049d & 4) == 4) {
            iO += bt.f.s(4, this.f201053h);
        }
        if ((this.f201049d & 8) == 8) {
            iO += bt.f.o(5, this.f201054j);
        }
        if ((this.f201049d & 16) == 16) {
            iO += bt.f.s(6, this.f201055k);
        }
        if ((this.f201049d & 32) == 32) {
            iO += bt.f.o(7, this.f201056l);
        }
        for (int i17 = 0; i17 < this.f201057m.size(); i17++) {
            iO += bt.f.s(8, this.f201057m.get(i17));
        }
        int iP = 0;
        for (int i18 = 0; i18 < this.f201058n.size(); i18++) {
            iP += bt.f.p(this.f201058n.get(i18).intValue());
        }
        int size = iO + iP + (n0().size() * 2);
        for (int i19 = 0; i19 < this.f201059p.size(); i19++) {
            size += bt.f.s(32, this.f201059p.get(i19));
        }
        int iV = size + v() + this.f201048c.size();
        this.f201061r = iV;
        return iV;
    }

    public r e0() {
        return this.f201055k;
    }

    public int f0() {
        return this.f201056l;
    }

    public int g0() {
        return this.f201050e;
    }

    public int h0() {
        return this.f201051f;
    }

    public t i0(int i15) {
        return this.f201052g.get(i15);
    }

    @Override // bt.i, bt.q
    public bt.s<s> j() {
        return f201047t;
    }

    public int j0() {
        return this.f201052g.size();
    }

    public List<t> k0() {
        return this.f201052g;
    }

    public r l0() {
        return this.f201053h;
    }

    @Override // bt.q
    public void m(bt.f fVar) throws IOException {
        e();
        bt.i.d<MessageType>.a aVarC = C();
        if ((this.f201049d & 1) == 1) {
            fVar.a0(1, this.f201050e);
        }
        if ((this.f201049d & 2) == 2) {
            fVar.a0(2, this.f201051f);
        }
        for (int i15 = 0; i15 < this.f201052g.size(); i15++) {
            fVar.d0(3, this.f201052g.get(i15));
        }
        if ((this.f201049d & 4) == 4) {
            fVar.d0(4, this.f201053h);
        }
        if ((this.f201049d & 8) == 8) {
            fVar.a0(5, this.f201054j);
        }
        if ((this.f201049d & 16) == 16) {
            fVar.d0(6, this.f201055k);
        }
        if ((this.f201049d & 32) == 32) {
            fVar.a0(7, this.f201056l);
        }
        for (int i16 = 0; i16 < this.f201057m.size(); i16++) {
            fVar.d0(8, this.f201057m.get(i16));
        }
        for (int i17 = 0; i17 < this.f201058n.size(); i17++) {
            fVar.a0(31, this.f201058n.get(i17).intValue());
        }
        for (int i18 = 0; i18 < this.f201059p.size(); i18++) {
            fVar.d0(32, this.f201059p.get(i18));
        }
        aVarC.a(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, fVar);
        fVar.i0(this.f201048c);
    }

    public int m0() {
        return this.f201054j;
    }

    public List<Integer> n0() {
        return this.f201058n;
    }

    public boolean o0() {
        return (this.f201049d & 16) == 16;
    }

    public boolean p0() {
        return (this.f201049d & 32) == 32;
    }

    public boolean q0() {
        return (this.f201049d & 1) == 1;
    }

    public boolean r0() {
        return (this.f201049d & 2) == 2;
    }

    public boolean s0() {
        return (this.f201049d & 4) == 4;
    }

    public boolean t0() {
        return (this.f201049d & 8) == 8;
    }

    @Override // bt.q
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public b g() {
        return v0();
    }

    @Override // bt.q
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public b b() {
        return w0(this);
    }

    private s(bt.i.c<s, ?> cVar) {
        super(cVar);
        this.f201060q = (byte) -1;
        this.f201061r = -1;
        this.f201048c = cVar.p();
    }

    private s(boolean z15) {
        this.f201060q = (byte) -1;
        this.f201061r = -1;
        this.f201048c = bt.d.f21388a;
    }

    private s(bt.e eVar, bt.g gVar) {
        r.c cVarB;
        this.f201060q = (byte) -1;
        this.f201061r = -1;
        u0();
        bt.d.b bVarU = bt.d.u();
        bt.f fVarJ = bt.f.J(bVarU, 1);
        boolean z15 = false;
        int i15 = 0;
        while (!z15) {
            try {
                try {
                    int iK = eVar.K();
                    switch (iK) {
                        case 0:
                            break;
                        case 8:
                            this.f201049d |= 1;
                            this.f201050e = eVar.s();
                            continue;
                        case 16:
                            this.f201049d |= 2;
                            this.f201051f = eVar.s();
                            continue;
                        case 26:
                            if ((i15 & 4) != 4) {
                                this.f201052g = new ArrayList();
                                i15 |= 4;
                            }
                            this.f201052g.add((t) eVar.u(t.f201074q, gVar));
                            continue;
                        case 34:
                            cVarB = (this.f201049d & 4) == 4 ? this.f201053h.b() : null;
                            r rVar = (r) eVar.u(r.f200992y, gVar);
                            this.f201053h = rVar;
                            if (cVarB != null) {
                                cVarB.q(rVar);
                                this.f201053h = cVarB.A();
                            }
                            this.f201049d |= 4;
                            continue;
                        case 40:
                            this.f201049d |= 8;
                            this.f201054j = eVar.s();
                            continue;
                        case 50:
                            cVarB = (this.f201049d & 16) == 16 ? this.f201055k.b() : null;
                            r rVar2 = (r) eVar.u(r.f200992y, gVar);
                            this.f201055k = rVar2;
                            if (cVarB != null) {
                                cVarB.q(rVar2);
                                this.f201055k = cVarB.A();
                            }
                            this.f201049d |= 16;
                            continue;
                        case 56:
                            this.f201049d |= 32;
                            this.f201056l = eVar.s();
                            continue;
                        case 66:
                            if ((i15 & 128) != 128) {
                                this.f201057m = new ArrayList();
                                i15 |= 128;
                            }
                            this.f201057m.add((us.b) eVar.u(us.b.f200603j, gVar));
                            continue;
                        case 248:
                            if ((i15 & 256) != 256) {
                                this.f201058n = new ArrayList();
                                i15 |= 256;
                            }
                            this.f201058n.add(Integer.valueOf(eVar.s()));
                            continue;
                        case 250:
                            int iJ = eVar.j(eVar.A());
                            if ((i15 & 256) != 256 && eVar.e() > 0) {
                                this.f201058n = new ArrayList();
                                i15 |= 256;
                            }
                            while (eVar.e() > 0) {
                                this.f201058n.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(iJ);
                            continue;
                        case 258:
                            if ((i15 & 512) != 512) {
                                this.f201059p = new ArrayList();
                                i15 |= 512;
                            }
                            this.f201059p.add((d) eVar.u(d.f200721j, gVar));
                            continue;
                        default:
                            if (!r(eVar, fVarJ, gVar, iK)) {
                                break;
                            }
                            break;
                    }
                    z15 = true;
                } catch (Throwable th4) {
                    if ((i15 & 4) == 4) {
                        this.f201052g = Collections.unmodifiableList(this.f201052g);
                    }
                    if ((i15 & 128) == 128) {
                        this.f201057m = Collections.unmodifiableList(this.f201057m);
                    }
                    if ((i15 & 256) == 256) {
                        this.f201058n = Collections.unmodifiableList(this.f201058n);
                    }
                    if ((i15 & 512) == 512) {
                        this.f201059p = Collections.unmodifiableList(this.f201059p);
                    }
                    try {
                        fVarJ.I();
                    } catch (IOException unused) {
                    } finally {
                        this.f201048c = bVarU.r();
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
        if ((i15 & 4) == 4) {
            this.f201052g = Collections.unmodifiableList(this.f201052g);
        }
        if ((i15 & 128) == 128) {
            this.f201057m = Collections.unmodifiableList(this.f201057m);
        }
        if ((i15 & 256) == 256) {
            this.f201058n = Collections.unmodifiableList(this.f201058n);
        }
        if ((i15 & 512) == 512) {
            this.f201059p = Collections.unmodifiableList(this.f201059p);
        }
        try {
            fVarJ.I();
        } catch (IOException unused2) {
        } finally {
            this.f201048c = bVarU.r();
        }
        n();
    }
}
