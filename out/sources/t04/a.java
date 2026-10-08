package t04;

import fr.t;
import fu.r;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\"\u0015\u0010\u000f\u001a\u00020\u0004*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"", "Ljava/math/BigDecimal;", "f", "(D)Ljava/math/BigDecimal;", "", "replacement", "d", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "positionIndex", "a", "(Ljava/lang/String;I)Ljava/lang/String;", "", "c", "(F)Ljava/lang/String;", "sizeNumberFormat", "contract"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final String a(String str, int i15) {
        return (str.length() >= i15 && !t.c(r.E1(str, i15), r.D1("-"))) ? r.P0(str, i15, i15, "-").toString() : str;
    }

    public static /* synthetic */ String b(String str, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = 2;
        }
        return a(str, i15);
    }

    public static final String c(float f15) {
        return new DecimalFormat("#.##").format(Float.valueOf(f15));
    }

    public static final String d(String str, String str2) {
        return r.P(str, "-", str2, false, 4, null);
    }

    public static /* synthetic */ String e(String str, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str2 = "";
        }
        return d(str, str2);
    }

    public static final BigDecimal f(double d15) {
        return new BigDecimal(d15).setScale(7, RoundingMode.HALF_EVEN);
    }
}
