package t4;

import android.graphics.Paint;
import android.text.Layout;
import p071kotlin.Metadata;
import r4.l0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroid/text/Layout;", "", "lineIndex", "Landroid/graphics/Paint;", "paint", "", "a", "(Landroid/text/Layout;ILandroid/graphics/Paint;)F", "c", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187599a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f187599a = iArr;
        }
    }

    public static final float a(Layout layout, int i15, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i15);
        if (!l0.m(layout, i15) || layout.getParagraphDirection(i15) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i15) + layout.getEllipsisStart(i15)) - lineLeft) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i15);
        if ((paragraphAlignment == null ? -1 : a.f187599a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return fAbs + width;
    }

    public static /* synthetic */ float b(Layout layout, int i15, Paint paint, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            paint = layout.getPaint();
        }
        return a(layout, i15, paint);
    }

    public static final float c(Layout layout, int i15, Paint paint) {
        float width;
        float width2;
        if (!l0.m(layout, i15)) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i15) != -1 || layout.getWidth() >= layout.getLineRight(i15)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i15) - layout.getPrimaryHorizontal(layout.getLineStart(i15) + layout.getEllipsisStart(i15))) + paint.measureText("…");
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i15);
        if ((paragraphAlignment != null ? a.f187599a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i15);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i15);
            width2 = layout.getWidth() - lineRight;
        }
        return width - width2;
    }

    public static /* synthetic */ float d(Layout layout, int i15, Paint paint, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            paint = layout.getPaint();
        }
        return c(layout, i15, paint);
    }
}
