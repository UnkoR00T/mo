package u7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f196011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f196012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f196013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f196014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l.a f196015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l.a f196016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l.a f196017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l.a f196018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f196019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private o f196020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ByteBuffer f196021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ByteBuffer f196022m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f196023n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f196024o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f196025p;

    public p() {
        this(false);
    }

    private boolean i() {
        return Math.abs(this.f196013d - 1.0f) < 1.0E-4f && Math.abs(this.f196014e - 1.0f) < 1.0E-4f && this.f196016g.f195964a == this.f196015f.f195964a;
    }

    @Override // u7.l
    public ByteBuffer a() {
        int iP;
        o oVar = this.f196020k;
        if (oVar != null && (iP = oVar.p()) > 0) {
            if (this.f196021l.capacity() < iP) {
                this.f196021l = ByteBuffer.allocateDirect(iP).order(ByteOrder.nativeOrder());
            } else {
                this.f196021l.clear();
            }
            oVar.o(this.f196021l);
            this.f196021l.flip();
            this.f196024o += (long) iP;
            this.f196022m = this.f196021l;
        }
        ByteBuffer byteBuffer = this.f196022m;
        this.f196022m = l.f195962a;
        return byteBuffer;
    }

    @Override // u7.l
    public void b(l.b bVar) {
        if (h()) {
            l.a aVar = this.f196015f;
            this.f196017h = aVar;
            l.a aVar2 = this.f196016g;
            this.f196018i = aVar2;
            if (this.f196019j) {
                this.f196020k = new o(aVar.f195964a, aVar.f195965b, this.f196013d, this.f196014e, aVar2.f195964a, aVar.f195966c == 4);
            } else {
                o oVar = this.f196020k;
                if (oVar != null) {
                    oVar.n();
                }
            }
        }
        this.f196022m = l.f195962a;
        this.f196023n = 0L;
        this.f196024o = 0L;
        this.f196025p = false;
    }

    @Override // u7.l
    public void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            o oVar = (o) zj.p.q(this.f196020k);
            this.f196023n += (long) byteBuffer.remaining();
            oVar.v(byteBuffer);
        }
    }

    @Override // u7.l
    public void d() {
        o oVar = this.f196020k;
        if (oVar != null) {
            oVar.u();
        }
        this.f196025p = true;
    }

    @Override // u7.l
    public boolean e() {
        if (!this.f196025p) {
            return false;
        }
        o oVar = this.f196020k;
        return oVar == null || oVar.p() == 0;
    }

    @Override // u7.l
    public long f(long j15) {
        return k(j15);
    }

    @Override // u7.l
    public l.a g(l.a aVar) throws l.c {
        int i15 = aVar.f195966c;
        if (i15 != 2 && i15 != 4) {
            throw new l.c(aVar);
        }
        int i16 = this.f196012c;
        if (i16 == -1) {
            i16 = aVar.f195964a;
        }
        this.f196015f = aVar;
        l.a aVar2 = new l.a(i16, aVar.f195965b, aVar.f195966c);
        this.f196016g = aVar2;
        this.f196019j = true;
        return aVar2;
    }

    @Override // u7.l
    public boolean h() {
        if (this.f196016g.f195964a != -1) {
            return this.f196011b || !i();
        }
        return false;
    }

    public long j(long j15) {
        if (this.f196024o < 1024) {
            return (long) (((double) this.f196013d) * j15);
        }
        long jQ = this.f196023n - ((long) ((o) zj.p.q(this.f196020k)).q());
        int i15 = this.f196018i.f195964a;
        int i16 = this.f196017h.f195964a;
        return i15 == i16 ? o0.U0(j15, jQ, this.f196024o) : o0.U0(j15, jQ * ((long) i15), this.f196024o * ((long) i16));
    }

    public long k(long j15) {
        if (this.f196024o < 1024) {
            return (long) (j15 / ((double) this.f196013d));
        }
        long jQ = this.f196023n - ((long) ((o) zj.p.q(this.f196020k)).q());
        int i15 = this.f196018i.f195964a;
        int i16 = this.f196017h.f195964a;
        return i15 == i16 ? o0.U0(j15, this.f196024o, jQ) : o0.U0(j15, this.f196024o * ((long) i16), jQ * ((long) i15));
    }

    public void l(float f15) {
        zj.p.d(f15 > 0.0f);
        if (this.f196014e != f15) {
            this.f196014e = f15;
            this.f196019j = true;
        }
    }

    public void m(float f15) {
        zj.p.d(f15 > 0.0f);
        if (this.f196013d != f15) {
            this.f196013d = f15;
            this.f196019j = true;
        }
    }

    @Override // u7.l
    public void reset() {
        this.f196013d = 1.0f;
        this.f196014e = 1.0f;
        l.a aVar = l.a.f195963e;
        this.f196015f = aVar;
        this.f196016g = aVar;
        this.f196017h = aVar;
        this.f196018i = aVar;
        ByteBuffer byteBuffer = l.f195962a;
        this.f196021l = byteBuffer;
        this.f196022m = byteBuffer;
        this.f196012c = -1;
        this.f196019j = false;
        this.f196020k = null;
        this.f196023n = 0L;
        this.f196024o = 0L;
        this.f196025p = false;
    }

    p(boolean z15) {
        this.f196013d = 1.0f;
        this.f196014e = 1.0f;
        l.a aVar = l.a.f195963e;
        this.f196015f = aVar;
        this.f196016g = aVar;
        this.f196017h = aVar;
        this.f196018i = aVar;
        ByteBuffer byteBuffer = l.f195962a;
        this.f196021l = byteBuffer;
        this.f196022m = byteBuffer;
        this.f196012c = -1;
        this.f196011b = z15;
    }
}
