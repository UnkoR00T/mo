package s0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0007\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0010\u001a'\u0010\b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\b\u0010\u0013\"\u0014\u0010\u0015\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016\"\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001b"}, d2 = {"", "need", "e", "(I)I", "f", "d", "", "a", "b", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "array", "size", "value", "([III)I", "", "", "([JIJ)I", "[I", "EMPTY_INTS", "[J", "EMPTY_LONGS", "", "[Ljava/lang/Object;", "EMPTY_OBJECTS", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f176996a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f176997b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f176998c = new Object[0];

    public static final int a(int[] iArr, int i15, int i16) {
        int i17 = i15 - 1;
        int i18 = 0;
        while (i18 <= i17) {
            int i19 = (i18 + i17) >>> 1;
            int i25 = iArr[i19];
            if (i25 < i16) {
                i18 = i19 + 1;
            } else {
                if (i25 <= i16) {
                    return i19;
                }
                i17 = i19 - 1;
            }
        }
        return ~i18;
    }

    public static final int b(long[] jArr, int i15, long j15) {
        int i16 = i15 - 1;
        int i17 = 0;
        while (i17 <= i16) {
            int i18 = (i17 + i16) >>> 1;
            long j16 = jArr[i18];
            if (j16 < j15) {
                i17 = i18 + 1;
            } else {
                if (j16 <= j15) {
                    return i18;
                }
                i16 = i18 - 1;
            }
        }
        return ~i17;
    }

    public static final boolean c(Object obj, Object obj2) {
        return t.c(obj, obj2);
    }

    public static final int d(int i15) {
        for (int i16 = 4; i16 < 32; i16++) {
            int i17 = (1 << i16) - 12;
            if (i15 <= i17) {
                return i17;
            }
        }
        return i15;
    }

    public static final int e(int i15) {
        return d(i15 * 4) / 4;
    }

    public static final int f(int i15) {
        return d(i15 * 8) / 8;
    }
}
