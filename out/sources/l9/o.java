package l9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o8.h0;
import o8.k0;
import o8.s0;
import t7.x;
import w7.c0;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public class o implements o8.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f117228a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t7.p f117230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<b> f117231d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s0 f117234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f117235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f117236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long[] f117237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f117238k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f117229b = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f117233f = o0.f210729f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0 f117232e = new c0();

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f117239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f117240b;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.f117239a, bVar.f117239a);
        }

        private b(long j15, byte[] bArr) {
            this.f117239a = j15;
            this.f117240b = bArr;
        }
    }

    public o(s sVar, t7.p pVar) {
        this.f117228a = sVar;
        this.f117230c = pVar != null ? pVar.b().A0("application/x-media3-cues").V(pVar.f188381p).Z(sVar.c()).Q() : null;
        this.f117231d = new ArrayList();
        this.f117236i = 0;
        this.f117237j = o0.f210730g;
        this.f117238k = -9223372036854775807L;
    }

    public static /* synthetic */ void h(o oVar, e eVar) {
        oVar.getClass();
        b bVar = new b(eVar.f117219b, oVar.f117229b.a(eVar.f117218a, eVar.f117220c));
        oVar.f117231d.add(bVar);
        long j15 = oVar.f117238k;
        if (j15 == -9223372036854775807L || eVar.f117221d >= j15) {
            oVar.m(bVar);
        }
    }

    private void i() throws x {
        try {
            long j15 = this.f117238k;
            this.f117228a.b(this.f117233f, 0, this.f117235h, j15 != -9223372036854775807L ? s.b.c(j15) : s.b.b(), new w7.l() { // from class: l9.n
                @Override // w7.l
                public final void accept(Object obj) {
                    o.h(this.f117227a, (e) obj);
                }
            });
            Collections.sort(this.f117231d);
            this.f117237j = new long[this.f117231d.size()];
            for (int i15 = 0; i15 < this.f117231d.size(); i15++) {
                this.f117237j[i15] = this.f117231d.get(i15).f117239a;
            }
            this.f117233f = o0.f210729f;
        } catch (RuntimeException e15) {
            throw x.a("SubtitleParser failed.", e15);
        }
    }

    private boolean j(o8.q qVar) {
        byte[] bArr = this.f117233f;
        if (bArr.length == this.f117235h) {
            this.f117233f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f117233f;
        int i15 = this.f117235h;
        int i16 = qVar.read(bArr2, i15, bArr2.length - i15);
        if (i16 != -1) {
            this.f117235h += i16;
        }
        long jA = qVar.a();
        return (jA != -1 && ((long) this.f117235h) == jA) || i16 == -1;
    }

    private boolean k(o8.q qVar) {
        return qVar.b((qVar.a() > (-1L) ? 1 : (qVar.a() == (-1L) ? 0 : -1)) != 0 ? ek.g.e(qVar.a()) : 1024) == -1;
    }

    private void l() {
        long j15 = this.f117238k;
        for (int iG = j15 == -9223372036854775807L ? 0 : o0.g(this.f117237j, j15, true, true); iG < this.f117231d.size(); iG++) {
            m(this.f117231d.get(iG));
        }
    }

    private void m(b bVar) {
        zj.p.q(this.f117234g);
        int length = bVar.f117240b.length;
        this.f117232e.c0(bVar.f117240b);
        this.f117234g.a(this.f117232e, length);
        this.f117234g.c(bVar.f117239a, 1, length, 0, null);
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        int i15 = this.f117236i;
        zj.p.w((i15 == 0 || i15 == 5) ? false : true);
        this.f117238k = j16;
        if (this.f117236i == 2) {
            this.f117236i = 1;
        }
        if (this.f117236i == 4) {
            this.f117236i = 3;
        }
    }

    @Override // o8.p
    public void b() {
        if (this.f117236i == 5) {
            return;
        }
        this.f117228a.reset();
        this.f117236i = 5;
    }

    @Override // o8.p
    public boolean c(o8.q qVar) {
        return true;
    }

    @Override // o8.p
    public void d(o8.r rVar) {
        zj.p.w(this.f117236i == 0);
        s0 s0VarV = rVar.v(0, 3);
        this.f117234g = s0VarV;
        t7.p pVar = this.f117230c;
        if (pVar != null) {
            s0VarV.e(pVar);
            rVar.s();
            rVar.f(new h0(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.f117236i = 1;
    }

    @Override // o8.p
    public int g(o8.q qVar, k0 k0Var) throws x {
        int i15 = this.f117236i;
        zj.p.w((i15 == 0 || i15 == 5) ? false : true);
        if (this.f117236i == 1) {
            int iE = qVar.a() != -1 ? ek.g.e(qVar.a()) : 1024;
            if (iE > this.f117233f.length) {
                this.f117233f = new byte[iE];
            }
            this.f117235h = 0;
            this.f117236i = 2;
        }
        if (this.f117236i == 2 && j(qVar)) {
            i();
            this.f117236i = 4;
        }
        if (this.f117236i == 3 && k(qVar)) {
            l();
            this.f117236i = 4;
        }
        return this.f117236i == 4 ? -1 : 0;
    }
}
