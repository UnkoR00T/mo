package y0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001a1\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\t\u001a'\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\f\u001a'\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a'\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"", "position", "popupLength", "windowLength", "", "closeAffinity", "b", "(IIIZ)I", "h", "(IIIZ)Z", "g", "e", "(IIZ)I", "d", "f", "a", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {
    private static final int a(int i15, int i16, boolean z15) {
        return f(i15, i16, !z15);
    }

    public static final int b(int i15, int i16, int i17, boolean z15) {
        if (i16 >= i17) {
            return f(i16, i17, z15);
        }
        if (g(i15, i16, i17, z15)) {
            return e(i15, i16, z15);
        }
        return h(i15, i16, i17, z15) ? d(i15, i16, z15) : a(i16, i17, z15);
    }

    public static /* synthetic */ int c(int i15, int i16, int i17, boolean z15, int i18, Object obj) {
        if ((i18 & 8) != 0) {
            z15 = true;
        }
        return b(i15, i16, i17, z15);
    }

    private static final int d(int i15, int i16, boolean z15) {
        return e(i15, i16, !z15);
    }

    private static final int e(int i15, int i16, boolean z15) {
        return z15 ? i15 : i15 - i16;
    }

    private static final int f(int i15, int i16, boolean z15) {
        if (z15) {
            return 0;
        }
        return i16 - i15;
    }

    private static final boolean g(int i15, int i16, int i17, boolean z15) {
        return h(i15, i16, i17, !z15);
    }

    private static final boolean h(int i15, int i16, int i17, boolean z15) {
        if (z15) {
            return i16 <= i15;
        }
        return i17 - i16 > i15;
    }
}
