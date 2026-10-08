package y1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import p079n1.k4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u001a/\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0002*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "", "softWrap", "Lb5/v;", "overflow", "", "maxIntrinsicWidth", "a", "(JZIF)J", "", "c", "(JZIF)I", "maxLinesIn", "b", "(ZII)I", "d", "(I)Z", "isEllipsis", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final long a(long j15, boolean z15, int i15, float f15) {
        return c5.b.INSTANCE.b(0, c(j15, z15, i15, f15), 0, c5.b.k(j15));
    }

    public static final int b(boolean z15, int i15, int i16) {
        if (z15 || !d(i15)) {
            return lr.m.e(i16, 1);
        }
        return 1;
    }

    public static final int c(long j15, boolean z15, int i15, float f15) {
        int iL = ((z15 || d(i15)) && c5.b.h(j15)) ? c5.b.l(j15) : Integer.MAX_VALUE;
        return c5.b.n(j15) == iL ? iL : lr.m.n(k4.a(f15), c5.b.n(j15), iL);
    }

    public static final boolean d(int i15) {
        b5.v.Companion companion = b5.v.INSTANCE;
        return b5.v.g(i15, companion.b()) || b5.v.g(i15, companion.d()) || b5.v.g(i15, companion.c());
    }
}
