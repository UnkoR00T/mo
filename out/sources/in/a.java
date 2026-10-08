package in;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f93484h = new a(4201, PKIFailureInfo.certConfirmed, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f93485i = new a(1033, 1024, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f93486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f93487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f93488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f93489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f93490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f93491o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f93492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f93493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f93494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f93495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f93496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f93497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f93498g;

    static {
        a aVar = new a(67, 64, 1);
        f93486j = aVar;
        f93487k = new a(19, 16, 1);
        f93488l = new a(285, 256, 0);
        a aVar2 = new a(301, 256, 1);
        f93489m = aVar2;
        f93490n = aVar2;
        f93491o = aVar;
    }

    public a(int i15, int i16, int i17) {
        this.f93497f = i15;
        this.f93496e = i16;
        this.f93498g = i17;
        this.f93492a = new int[i16];
        this.f93493b = new int[i16];
        int i18 = 1;
        for (int i19 = 0; i19 < i16; i19++) {
            this.f93492a[i19] = i18;
            i18 *= 2;
            if (i18 >= i16) {
                i18 = (i18 ^ i15) & (i16 - 1);
            }
        }
        for (int i25 = 0; i25 < i16 - 1; i25++) {
            this.f93493b[this.f93492a[i25]] = i25;
        }
        this.f93494c = new b(this, new int[]{0});
        this.f93495d = new b(this, new int[]{1});
    }

    static int a(int i15, int i16) {
        return i15 ^ i16;
    }

    b b(int i15, int i16) {
        if (i15 < 0) {
            throw new IllegalArgumentException();
        }
        if (i16 == 0) {
            return this.f93494c;
        }
        int[] iArr = new int[i15 + 1];
        iArr[0] = i16;
        return new b(this, iArr);
    }

    int c(int i15) {
        return this.f93492a[i15];
    }

    public int d() {
        return this.f93498g;
    }

    b e() {
        return this.f93494c;
    }

    int f(int i15) {
        if (i15 != 0) {
            return this.f93492a[(this.f93496e - this.f93493b[i15]) - 1];
        }
        throw new ArithmeticException();
    }

    int g(int i15) {
        if (i15 != 0) {
            return this.f93493b[i15];
        }
        throw new IllegalArgumentException();
    }

    int h(int i15, int i16) {
        if (i15 == 0 || i16 == 0) {
            return 0;
        }
        int[] iArr = this.f93492a;
        int[] iArr2 = this.f93493b;
        return iArr[(iArr2[i15] + iArr2[i16]) % (this.f93496e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f93497f) + ',' + this.f93496e + ')';
    }
}
