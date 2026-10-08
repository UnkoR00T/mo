package yb4;

import java.text.DecimalFormat;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"", "", "a", "(F)Ljava/lang/String;", "sizeNumberFormat", "contract"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final String a(float f15) {
        return new DecimalFormat("#.##").format(Float.valueOf(f15));
    }
}
