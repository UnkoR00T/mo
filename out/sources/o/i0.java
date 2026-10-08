package o;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i0 f140010c = new i0(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f140011d = new i0(1, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i0 f140012e = new i0(2, 10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i0 f140013f = new i0(3, 10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i0 f140014g = new i0(4, 10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i0 f140015h = new i0(5, 10);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i0 f140016i = new i0(6, 10);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i0 f140017j = new i0(6, 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f140018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f140019b;

    public i0(int i15, int i16) {
        this.f140018a = i15;
        this.f140019b = i16;
    }

    private static String c(int i15) {
        switch (i15) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    public int a() {
        return this.f140019b;
    }

    public int b() {
        return this.f140018a;
    }

    public boolean d() {
        return e() && b() != 1 && a() == 10;
    }

    public boolean e() {
        return (b() == 0 || b() == 2 || a() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            if (this.f140018a == i0Var.b() && this.f140019b == i0Var.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f140018a ^ 1000003) * 1000003) ^ this.f140019b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + c(this.f140018a) + ", bitDepth=" + this.f140019b + "}";
    }
}
