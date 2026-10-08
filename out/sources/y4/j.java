package y4;

import android.text.TextPaint;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/text/TextPaint;", "", "alpha", "Loq/i0;", "a", "(Landroid/text/TextPaint;F)V", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    public static final void a(TextPaint textPaint, float f15) {
        if (Float.isNaN(f15)) {
            return;
        }
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f15 * GF2Field.MASK));
    }
}
