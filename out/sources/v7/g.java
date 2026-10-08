package v7;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static void a(Spannable spannable, float f15, int i15, int i16, int i17) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i15, i16, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i15 && spannable.getSpanEnd(relativeSizeSpan) >= i16) {
                f15 *= relativeSizeSpan.getSizeChange();
            }
            c(spannable, relativeSizeSpan, i15, i16, i17);
        }
        spannable.setSpan(new RelativeSizeSpan(f15), i15, i16, i17);
    }

    public static void b(Spannable spannable, Object obj, int i15, int i16, int i17) {
        for (Object obj2 : spannable.getSpans(i15, i16, obj.getClass())) {
            c(spannable, obj2, i15, i16, i17);
        }
        spannable.setSpan(obj, i15, i16, i17);
    }

    private static void c(Spannable spannable, Object obj, int i15, int i16, int i17) {
        if (spannable.getSpanStart(obj) == i15 && spannable.getSpanEnd(obj) == i16 && spannable.getSpanFlags(obj) == i17) {
            spannable.removeSpan(obj);
        }
    }
}
