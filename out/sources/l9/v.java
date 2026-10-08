package l9;

import java.io.EOFException;
import o8.s0;
import t7.w;
import w7.c0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
final class v implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s0 f117256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s.a f117257b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s f117263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t7.p f117264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f117265j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f117258c = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f117260e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f117261f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f117262g = o0.f210729f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c0 f117259d = new c0();

    public v(s0 s0Var, s.a aVar) {
        this.f117256a = s0Var;
        this.f117257b = aVar;
    }

    private void i(int i15) {
        int length = this.f117262g.length;
        int i16 = this.f117261f;
        if (length - i16 >= i15) {
            return;
        }
        int i17 = i16 - this.f117260e;
        int iMax = Math.max(i17 * 2, i15 + i17);
        byte[] bArr = this.f117262g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f117260e, bArr2, 0, i17);
        this.f117260e = 0;
        this.f117261f = i17;
        this.f117262g = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(e eVar, long j15, int i15) {
        zj.p.q(this.f117264i);
        byte[] bArrA = this.f117258c.a(eVar.f117218a, eVar.f117220c);
        this.f117259d.c0(bArrA);
        this.f117256a.a(this.f117259d, bArrA.length);
        long j16 = eVar.f117219b;
        if (j16 == -9223372036854775807L) {
            zj.p.w(this.f117264i.f188386u == Long.MAX_VALUE);
        } else {
            long j17 = this.f117264i.f188386u;
            j15 = j17 == Long.MAX_VALUE ? j15 + j16 : j16 + j17;
        }
        this.f117256a.c(j15, i15 | 1, bArrA.length, 0, null);
    }

    @Override // o8.s0
    public void b(c0 c0Var, int i15, int i16) {
        if (this.f117263h == null) {
            this.f117256a.b(c0Var, i15, i16);
            return;
        }
        i(i15);
        c0Var.u(this.f117262g, this.f117261f, i15);
        this.f117261f += i15;
    }

    @Override // o8.s0
    public void c(final long j15, final int i15, int i16, int i17, s0.a aVar) {
        if (this.f117263h == null) {
            this.f117256a.c(j15, i15, i16, i17, aVar);
            return;
        }
        zj.p.e(aVar == null, "DRM on subtitles is not supported");
        int i18 = (this.f117261f - i17) - i16;
        try {
            this.f117263h.b(this.f117262g, i18, i16, s.b.b(), new w7.l() { // from class: l9.u
                @Override // w7.l
                public final void accept(Object obj) {
                    this.f117253a.j((e) obj, j15, i15);
                }
            });
        } catch (RuntimeException e15) {
            if (!this.f117265j) {
                throw e15;
            }
            w7.t.i("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e15);
        }
        int i19 = i18 + i16;
        this.f117260e = i19;
        if (i19 == this.f117261f) {
            this.f117260e = 0;
            this.f117261f = 0;
        }
    }

    @Override // o8.s0
    public void e(t7.p pVar) {
        zj.p.q(pVar.f188381p);
        zj.p.d(w.f(pVar.f188381p) == 3);
        if (!pVar.equals(this.f117264i)) {
            this.f117264i = pVar;
            this.f117263h = this.f117257b.a(pVar) ? this.f117257b.b(pVar) : null;
        }
        if (this.f117263h == null) {
            this.f117256a.e(pVar);
        } else {
            this.f117256a.e(pVar.b().A0("application/x-media3-cues").V(pVar.f188381p).E0(Long.MAX_VALUE).Z(this.f117257b.c(pVar)).Q());
        }
    }

    @Override // o8.s0
    public int g(t7.h hVar, int i15, boolean z15, int i16) throws EOFException {
        if (this.f117263h == null) {
            return this.f117256a.g(hVar, i15, z15, i16);
        }
        i(i15);
        int i17 = hVar.read(this.f117262g, this.f117261f, i15);
        if (i17 != -1) {
            this.f117261f += i17;
            return i17;
        }
        if (z15) {
            return -1;
        }
        throw new EOFException();
    }

    public void k(boolean z15) {
        this.f117265j = z15;
    }
}
