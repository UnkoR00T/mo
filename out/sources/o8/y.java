package o8;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f143232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f143234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f143235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f143236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f143237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f143238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f143239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f143240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f143241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f143242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final t7.v f143243l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f143244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f143245b;

        public a(long[] jArr, long[] jArr2) {
            this.f143244a = jArr;
            this.f143245b = jArr2;
        }
    }

    public y(byte[] bArr, int i15) {
        w7.b0 b0Var = new w7.b0(bArr);
        b0Var.p(i15 * 8);
        this.f143232a = b0Var.h(16);
        this.f143233b = b0Var.h(16);
        this.f143234c = b0Var.h(24);
        this.f143235d = b0Var.h(24);
        int iH = b0Var.h(20);
        this.f143236e = iH;
        this.f143237f = j(iH);
        this.f143238g = b0Var.h(3) + 1;
        int iH2 = b0Var.h(5) + 1;
        this.f143239h = iH2;
        this.f143240i = e(iH2);
        this.f143241j = b0Var.j(36);
        this.f143242k = null;
        this.f143243l = null;
    }

    private static int e(int i15) {
        if (i15 == 8) {
            return 1;
        }
        if (i15 == 12) {
            return 2;
        }
        if (i15 == 16) {
            return 4;
        }
        if (i15 == 20) {
            return 5;
        }
        if (i15 != 24) {
            return i15 != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int j(int i15) {
        switch (i15) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public y a(List<a9.a> list) {
        return new y(this.f143232a, this.f143233b, this.f143234c, this.f143235d, this.f143236e, this.f143238g, this.f143239h, this.f143241j, this.f143242k, h(new t7.v(list)));
    }

    public y b(a aVar) {
        return new y(this.f143232a, this.f143233b, this.f143234c, this.f143235d, this.f143236e, this.f143238g, this.f143239h, this.f143241j, aVar, this.f143243l);
    }

    public y c(List<String> list) {
        return new y(this.f143232a, this.f143233b, this.f143234c, this.f143235d, this.f143236e, this.f143238g, this.f143239h, this.f143241j, this.f143242k, h(v0.d(list)));
    }

    public long d() {
        long j15;
        long j16;
        int i15 = this.f143235d;
        if (i15 > 0) {
            j15 = (((long) i15) + ((long) this.f143234c)) / 2;
            j16 = 1;
        } else {
            int i16 = this.f143232a;
            j15 = ((((i16 != this.f143233b || i16 <= 0) ? 4096L : i16) * ((long) this.f143238g)) * ((long) this.f143239h)) / 8;
            j16 = 64;
        }
        return j15 + j16;
    }

    public long f() {
        long j15 = this.f143241j;
        if (j15 == 0) {
            return -9223372036854775807L;
        }
        return (j15 * 1000000) / ((long) this.f143236e);
    }

    public t7.p g(byte[] bArr, t7.v vVar) {
        bArr[4] = -128;
        int i15 = this.f143235d;
        if (i15 <= 0) {
            i15 = -1;
        }
        return new t7.p.b().A0("audio/flac").p0(i15).U(this.f143238g).B0(this.f143236e).t0(w7.o0.d0(this.f143239h)).l0(Collections.singletonList(bArr)).s0(h(vVar)).Q();
    }

    public t7.v h(t7.v vVar) {
        t7.v vVar2 = this.f143243l;
        return vVar2 == null ? vVar : vVar2.b(vVar);
    }

    public long i(long j15) {
        return w7.o0.p((j15 * ((long) this.f143236e)) / 1000000, 0L, this.f143241j - 1);
    }

    y(int i15, int i16, int i17, int i18, int i19, int i25, int i26, long j15, a aVar, t7.v vVar) {
        this.f143232a = i15;
        this.f143233b = i16;
        this.f143234c = i17;
        this.f143235d = i18;
        this.f143236e = i19;
        this.f143237f = j(i19);
        this.f143238g = i25;
        this.f143239h = i26;
        this.f143240i = e(i26);
        this.f143241j = j15;
        this.f143242k = aVar;
        this.f143243l = vVar;
    }
}
