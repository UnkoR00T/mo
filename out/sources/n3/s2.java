package n3;

import android.graphics.Rect;
import android.graphics.RectF;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u0001*\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lm3/g;", "Landroid/graphics/Rect;", "b", "(Lm3/g;)Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "c", "(Lm3/g;)Landroid/graphics/RectF;", "e", "(Landroid/graphics/Rect;)Lm3/g;", "f", "(Landroid/graphics/RectF;)Lm3/g;", "Lc5/p;", "a", "(Lc5/p;)Landroid/graphics/Rect;", "d", "(Landroid/graphics/Rect;)Lc5/p;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s2 {
    public static final Rect a(c5.p pVar) {
        return new Rect(pVar.getLeft(), pVar.getTop(), pVar.getRight(), pVar.getBottom());
    }

    @oq.a
    public static final Rect b(m3.g gVar) {
        return new Rect((int) gVar.getLeft(), (int) gVar.getTop(), (int) gVar.getRight(), (int) gVar.getBottom());
    }

    public static final RectF c(m3.g gVar) {
        return new RectF(gVar.getLeft(), gVar.getTop(), gVar.getRight(), gVar.getBottom());
    }

    public static final c5.p d(Rect rect) {
        return new c5.p(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final m3.g e(Rect rect) {
        return new m3.g(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final m3.g f(RectF rectF) {
        return new m3.g(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
