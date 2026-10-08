package g4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\b2\b\b\u0002\u0010\u0002\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "start", "top", "end", "bottom", "Lg4/n1;", "b", "(IIII)J", "Lc5/h;", "Lg4/p;", "a", "(FFFF)Lg4/p;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o1 {
    public static final DpTouchBoundsExpansion a(float f15, float f16, float f17, float f18) {
        return new DpTouchBoundsExpansion(f15, f16, f17, f18, true, null);
    }

    public static final long b(int i15, int i16, int i17, int i18) {
        if (!(i15 >= 0 && i15 < 32768)) {
            d4.a.a("Start must be in the range of 0 .. 32767");
        }
        if (!(i16 >= 0 && i16 < 32768)) {
            d4.a.a("Top must be in the range of 0 .. 32767");
        }
        if (!(i17 >= 0 && i17 < 32768)) {
            d4.a.a("End must be in the range of 0 .. 32767");
        }
        if (!(i18 >= 0 && i18 < 32768)) {
            d4.a.a("Bottom must be in the range of 0 .. 32767");
        }
        return n1.d(n1.INSTANCE.c(i15, i16, i17, i18, true));
    }

    public static /* synthetic */ long c(int i15, int i16, int i17, int i18, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            i15 = 0;
        }
        if ((i19 & 2) != 0) {
            i16 = 0;
        }
        if ((i19 & 4) != 0) {
            i17 = 0;
        }
        if ((i19 & 8) != 0) {
            i18 = 0;
        }
        return b(i15, i16, i17, i18);
    }
}
