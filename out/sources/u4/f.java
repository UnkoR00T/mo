package u4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\u000f\u001a\u00020\u0000*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lu4/d0;", "fontWeight", "Lu4/y;", "fontStyle", "", "c", "(Lu4/d0;I)I", "", "isBold", "isItalic", "b", "(ZZ)I", "Lu4/d0$a;", "a", "(Lu4/d0$a;)Lu4/d0;", "AndroidBold", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final FontWeight a(FontWeight.Companion companion) {
        return companion.g();
    }

    public static final int b(boolean z15, boolean z16) {
        if (z16 && z15) {
            return 3;
        }
        if (z15) {
            return 1;
        }
        return z16 ? 2 : 0;
    }

    public static final int c(FontWeight fontWeight, int i15) {
        return b(fontWeight.compareTo(a(FontWeight.INSTANCE)) >= 0, y.f(i15, y.INSTANCE.a()));
    }
}
