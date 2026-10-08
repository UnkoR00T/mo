package fd;

/* JADX INFO: loaded from: classes3.dex */
public enum m0 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f61301a;

        static {
            int[] iArr = new int[m0.values().length];
            f61301a = iArr;
            try {
                iArr[m0.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f61301a[m0.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f61301a[m0.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean e(int i15, boolean z15, int i16) {
        int i17 = a.f61301a[ordinal()];
        if (i17 == 1) {
            return false;
        }
        if (i17 != 2) {
            return (z15 && i15 < 28) || i16 > 4 || i15 <= 25;
        }
        return true;
    }
}
