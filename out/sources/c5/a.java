package c5;

import android.content.Context;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "context", "Lc5/d;", "a", "(Landroid/content/Context;)Lc5/d;", "ui-unit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final d a(Context context) {
        float f15 = context.getResources().getConfiguration().fontScale;
        float f16 = context.getResources().getDisplayMetrics().density;
        d5.a aVarB = d5.b.f40006a.b(f15);
        if (aVarB == null) {
            aVarB = new LinearFontScaleConverter(f15);
        }
        return new DensityWithConverter(f16, f15, aVarB);
    }
}
