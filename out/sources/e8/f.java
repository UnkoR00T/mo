package e8;

import a8.a3;
import a8.w;
import a8.y1;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import t7.p;
import w7.l0;

/* JADX INFO: loaded from: classes3.dex */
public class f extends a8.b {
    private a A;
    private long B;
    private long C;
    private int D;
    private int E;
    private p F;
    private e8.b G;
    private z7.f H;
    private d I;
    private Bitmap K;
    private boolean L;
    private b O;
    private b P;
    private int R;
    private boolean T;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final e8.b.a f48332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final z7.f f48333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ArrayDeque<a> f48334x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f48335y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f48336z;

    private static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f48337c = new a(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48339b;

        public a(long j15, long j16) {
            this.f48338a = j15;
            this.f48339b = j16;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f48341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f48342c;

        public b(int i15, long j15) {
            this.f48340a = i15;
            this.f48341b = j15;
        }

        public long a() {
            return this.f48341b;
        }

        public Bitmap b() {
            return this.f48342c;
        }

        public int c() {
            return this.f48340a;
        }

        public boolean d() {
            return this.f48342c != null;
        }

        public void e(Bitmap bitmap) {
            this.f48342c = bitmap;
        }
    }

    public f(e8.b.a aVar, d dVar) {
        super(4);
        this.f48332v = aVar;
        this.I = z0(dVar);
        this.f48333w = z7.f.A();
        this.A = a.f48337c;
        this.f48334x = new ArrayDeque<>();
        this.C = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.D = 0;
        this.E = 1;
    }

    private boolean A0(b bVar) {
        return ((p) zj.p.q(this.F)).O == -1 || this.F.P == -1 || bVar.c() == (((p) zj.p.q(this.F)).P * this.F.O) - 1;
    }

    private void B0(int i15) {
        this.E = Math.min(this.E, i15);
    }

    private void C0(long j15, z7.f fVar) {
        boolean z15 = true;
        if (fVar.p()) {
            this.L = true;
            return;
        }
        b bVar = new b(this.R, fVar.f233230f);
        this.P = bVar;
        this.R++;
        if (!this.L) {
            long jA = bVar.a();
            boolean z16 = jA - 30000 <= j15 && j15 <= 30000 + jA;
            b bVar2 = this.O;
            boolean z17 = bVar2 != null && bVar2.a() <= j15 && j15 < jA;
            boolean zA0 = A0((b) zj.p.q(this.P));
            if (!z16 && !z17 && !zA0) {
                z15 = false;
            }
            this.L = z15;
            if (z17 && !z16) {
                return;
            }
        }
        this.O = this.P;
        this.P = null;
    }

    private boolean D0() throws w {
        if (!E0()) {
            return false;
        }
        if (!this.T) {
            return true;
        }
        if (!v0((p) zj.p.q(this.F))) {
            throw U(new c("Provided decoder factory can't create decoder for format."), this.F, 4005);
        }
        e8.b bVar = this.G;
        if (bVar != null) {
            bVar.b();
        }
        this.G = this.f48332v.b();
        this.T = false;
        return true;
    }

    private void F0(long j15) {
        this.B = j15;
        while (!this.f48334x.isEmpty() && j15 >= this.f48334x.peek().f48338a) {
            this.A = this.f48334x.removeFirst();
        }
    }

    private void H0() {
        this.H = null;
        this.D = 0;
        this.C = -9223372036854775807L;
        e8.b bVar = this.G;
        if (bVar != null) {
            bVar.b();
            this.G = null;
        }
    }

    private void I0(d dVar) {
        this.I = z0(dVar);
    }

    private boolean J0() {
        boolean z15 = getState() == 2;
        int i15 = this.E;
        if (i15 == 0) {
            return z15;
        }
        if (i15 == 1) {
            return true;
        }
        if (i15 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    private boolean v0(p pVar) {
        int iA = this.f48332v.a(pVar);
        return iA == a3.y(4) || iA == a3.y(3);
    }

    private Bitmap w0(int i15) {
        zj.p.q(this.K);
        int width = this.K.getWidth() / ((p) zj.p.q(this.F)).O;
        int height = this.K.getHeight() / ((p) zj.p.q(this.F)).P;
        int i16 = this.F.O;
        return Bitmap.createBitmap(this.K, (i15 % i16) * width, (i15 / i16) * height, width, height);
    }

    private boolean x0(long j15, long j16) throws w {
        if (this.K != null && this.O == null) {
            return false;
        }
        if (this.E == 0 && getState() != 2) {
            return false;
        }
        if (this.K == null) {
            zj.p.q(this.G);
            e eVarA = this.G.a();
            if (eVarA == null) {
                return false;
            }
            if (((e) zj.p.q(eVarA)).p()) {
                if (this.D == 3) {
                    H0();
                    zj.p.q(this.F);
                    D0();
                } else {
                    ((e) zj.p.q(eVarA)).w();
                    if (this.f48334x.isEmpty()) {
                        this.f48336z = true;
                    }
                }
                return false;
            }
            zj.p.r(eVarA.f48331e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.K = eVarA.f48331e;
            ((e) zj.p.q(eVarA)).w();
        }
        if (!this.L || this.K == null || this.O == null) {
            return false;
        }
        zj.p.q(this.F);
        p pVar = this.F;
        int i15 = pVar.O;
        boolean z15 = ((i15 == 1 && pVar.P == 1) || i15 == -1 || pVar.P == -1) ? false : true;
        if (!this.O.d()) {
            b bVar = this.O;
            bVar.e(z15 ? w0(bVar.c()) : (Bitmap) zj.p.q(this.K));
        }
        if (!G0(j15, j16, (Bitmap) zj.p.q(this.O.b()), this.O.a())) {
            return false;
        }
        F0(((b) zj.p.q(this.O)).a());
        this.E = 3;
        if (!z15 || ((b) zj.p.q(this.O)).c() == (((p) zj.p.q(this.F)).P * ((p) zj.p.q(this.F)).O) - 1) {
            this.K = null;
        }
        this.O = this.P;
        this.P = null;
        return true;
    }

    private boolean y0(long j15) {
        if (this.L && this.O != null) {
            return false;
        }
        y1 y1VarY = Y();
        e8.b bVar = this.G;
        if (bVar == null || this.D == 3 || this.f48335y) {
            return false;
        }
        if (this.H == null) {
            z7.f fVarG = bVar.g();
            this.H = fVarG;
            if (fVarG == null) {
                return false;
            }
        }
        if (this.D == 2) {
            zj.p.q(this.H);
            this.H.v(4);
            ((e8.b) zj.p.q(this.G)).d(this.H);
            this.H = null;
            this.D = 3;
            return false;
        }
        int iS0 = s0(y1VarY, this.H, 0);
        if (iS0 == -5) {
            this.F = (p) zj.p.q(y1VarY.f4794b);
            this.T = true;
            this.D = 2;
            return true;
        }
        if (iS0 != -4) {
            if (iS0 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.H.y();
        ByteBuffer byteBuffer = this.H.f233228d;
        boolean z15 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((z7.f) zj.p.q(this.H)).p();
        if (z15) {
            ((z7.f) zj.p.q(this.H)).f233226b = this.F;
            ((e8.b) zj.p.q(this.G)).d((z7.f) zj.p.q(this.H));
            this.R = 0;
        }
        C0(j15, (z7.f) zj.p.q(this.H));
        if (((z7.f) zj.p.q(this.H)).p()) {
            this.f48335y = true;
            this.H = null;
            return false;
        }
        this.C = Math.max(this.C, ((z7.f) zj.p.q(this.H)).f233230f);
        if (z15) {
            this.H = null;
        } else {
            ((z7.f) zj.p.q(this.H)).l();
        }
        return !this.L;
    }

    private static d z0(d dVar) {
        return dVar == null ? d.f48330a : dVar;
    }

    @Override // a8.b, a8.x2.b
    public void A(int i15, Object obj) {
        if (i15 != 15) {
            super.A(i15, obj);
        } else {
            I0(obj instanceof d ? (d) obj : null);
        }
    }

    protected boolean E0() {
        return true;
    }

    protected boolean G0(long j15, long j16, Bitmap bitmap, long j17) {
        long j18 = j17 - j15;
        if (!J0() && j18 >= 30000) {
            return false;
        }
        this.I.b(j17 - this.A.f48339b, bitmap);
        return true;
    }

    @Override // a8.a3
    public int a(p pVar) {
        return this.f48332v.a(pVar);
    }

    @Override // a8.z2
    public boolean e() {
        return this.f48336z;
    }

    @Override // a8.z2
    public boolean f() {
        int i15 = this.E;
        if (i15 != 3) {
            return i15 == 0 && this.L;
        }
        return true;
    }

    @Override // a8.z2, a8.a3
    public String getName() {
        return "ImageRenderer";
    }

    @Override // a8.z2
    public void h(long j15, long j16) throws w {
        if (this.f48336z) {
            return;
        }
        if (this.F == null) {
            y1 y1VarY = Y();
            this.f48333w.l();
            int iS0 = s0(y1VarY, this.f48333w, 2);
            if (iS0 != -5) {
                if (iS0 == -4) {
                    zj.p.w(this.f48333w.p());
                    this.f48335y = true;
                    this.f48336z = true;
                    return;
                }
                return;
            }
            this.F = (p) zj.p.q(y1VarY.f4794b);
            this.T = true;
        }
        if (this.G != null || D0()) {
            try {
                l0.a("drainAndFeedDecoder");
                while (x0(j15, j16)) {
                }
                while (y0(j15)) {
                }
                l0.b();
            } catch (c e15) {
                throw U(e15, null, 4003);
            }
        }
    }

    @Override // a8.b
    protected void h0() {
        this.F = null;
        this.A = a.f48337c;
        this.f48334x.clear();
        H0();
        this.I.a();
    }

    @Override // a8.b
    protected void i0(boolean z15, boolean z16) {
        this.E = z16 ? 1 : 0;
    }

    @Override // a8.b
    protected void k0(long j15, boolean z15, boolean z16) {
        B0(1);
        this.f48336z = false;
        this.f48335y = false;
        this.K = null;
        this.O = null;
        this.P = null;
        this.L = false;
        this.H = null;
        e8.b bVar = this.G;
        if (bVar != null) {
            bVar.flush();
        }
        this.f48334x.clear();
    }

    @Override // a8.b
    protected void l0() {
        H0();
    }

    @Override // a8.b
    protected void n0() {
        H0();
        B0(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // a8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void q0(t7.p[] r5, long r6, long r8, h8.c0.b r10) {
        /*
            r4 = this;
            super.q0(r5, r6, r8, r10)
            r5 = r4
            e8.f$a r6 = r5.A
            long r6 = r6.f48339b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L37
            java.util.ArrayDeque<e8.f$a> r6 = r5.f48334x
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L2a
            long r6 = r5.C
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L37
            long r2 = r5.B
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L2a
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L2a
            goto L37
        L2a:
            java.util.ArrayDeque<e8.f$a> r6 = r5.f48334x
            e8.f$a r7 = new e8.f$a
            long r0 = r5.C
            r7.<init>(r0, r8)
            r6.add(r7)
            return
        L37:
            e8.f$a r6 = new e8.f$a
            r6.<init>(r0, r8)
            r5.A = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.f.q0(t7.p[], long, long, h8.c0$b):void");
    }
}
