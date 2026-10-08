package c8;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public class x0 implements w0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f24448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f24449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f24450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f24451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f24452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24454h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f24455a = 250000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f24456b = 750000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f24457c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f24458d = 250000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f24459e = 50000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f24460f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f24461g = 4;

        public x0 h() {
            return new x0(this);
        }
    }

    protected x0(a aVar) {
        this.f24448b = aVar.f24455a;
        this.f24449c = aVar.f24456b;
        this.f24450d = aVar.f24457c;
        this.f24451e = aVar.f24458d;
        this.f24452f = aVar.f24459e;
        this.f24453g = aVar.f24460f;
        this.f24454h = aVar.f24461g;
    }

    protected static int b(int i15, int i16, int i17) {
        return ek.g.e(((((long) i15) * ((long) i16)) * ((long) i17)) / 1000000);
    }

    private static int d(int i15) {
        int iB = o8.s.b(i15);
        zj.p.w(iB != -2147483647);
        return iB;
    }

    @Override // c8.w0.d
    public int a(int i15, int i16, int i17, int i18, int i19, int i25, double d15) {
        return (((Math.max(i15, (int) (((double) c(i15, i16, i17, i18, i19, i25)) * d15)) + i18) - 1) / i18) * i18;
    }

    protected int c(int i15, int i16, int i17, int i18, int i19, int i25) {
        if (i17 == 0) {
            return g(i15, i19, i18);
        }
        if (i17 == 1) {
            return e(i16);
        }
        if (i17 == 2) {
            return f(i16, i25);
        }
        throw new IllegalArgumentException();
    }

    protected int e(int i15) {
        return ek.g.e((((long) this.f24452f) * ((long) d(i15))) / 1000000);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013  */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    protected int f(int i15, int i16) {
        int i17;
        int iD;
        int i18 = this.f24451e;
        if (i15 != 5) {
            if (i15 == 8) {
                i17 = this.f24454h;
            }
            if (i16 != -1) {
                iD = ck.c.b(i16, 8, RoundingMode.CEILING);
            } else {
                iD = d(i15);
            }
            return ek.g.e((((long) i18) * ((long) iD)) / 1000000);
        }
        i17 = this.f24453g;
        i18 *= i17;
        if (i16 != -1) {
            iD = ck.c.b(i16, 8, RoundingMode.CEILING);
        } else {
            iD = d(i15);
        }
        return ek.g.e((((long) i18) * ((long) iD)) / 1000000);
    }

    protected int g(int i15, int i16, int i17) {
        return w7.o0.o(i15 * this.f24450d, b(this.f24448b, i16, i17), b(this.f24449c, i16, i17));
    }
}
