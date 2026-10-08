package ou;

import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "propertyName", "", "defaultValue", "d", "(Ljava/lang/String;Z)Z", "", "minValue", "maxValue", "a", "(Ljava/lang/String;III)I", "", "b", "(Ljava/lang/String;JJJ)J", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
public final /* synthetic */ class h0 {
    public static final int a(String str, int i15, int i16, int i17) {
        return (int) f0.c(str, i15, i16, i17);
    }

    public static final long b(String str, long j15, long j16, long j17) {
        String strD = f0.d(str);
        if (strD == null) {
            return j15;
        }
        Long lW = fu.r.w(strD);
        if (lW == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + '\'').toString());
        }
        long jLongValue = lW.longValue();
        if (j16 <= jLongValue && jLongValue <= j17) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j16 + ".." + j17 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String strD = f0.d(str);
        return strD == null ? str2 : strD;
    }

    public static final boolean d(String str, boolean z15) {
        String strD = f0.d(str);
        return strD != null ? Boolean.parseBoolean(strD) : z15;
    }

    public static /* synthetic */ int e(String str, int i15, int i16, int i17, int i18, Object obj) {
        if ((i18 & 4) != 0) {
            i16 = 1;
        }
        if ((i18 & 8) != 0) {
            i17 = Integer.MAX_VALUE;
        }
        return f0.b(str, i15, i16, i17);
    }

    public static /* synthetic */ long f(String str, long j15, long j16, long j17, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            j16 = 1;
        }
        long j18 = j16;
        if ((i15 & 8) != 0) {
            j17 = Long.MAX_VALUE;
        }
        return f0.c(str, j15, j18, j17);
    }
}
