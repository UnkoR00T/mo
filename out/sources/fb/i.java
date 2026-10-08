package fb;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
class i implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rect f60621a;

    i() {
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f15, Rect rect, Rect rect2) {
        int i15 = rect.left;
        int i16 = i15 + ((int) ((rect2.left - i15) * f15));
        int i17 = rect.top;
        int i18 = i17 + ((int) ((rect2.top - i17) * f15));
        int i19 = rect.right;
        int i25 = i19 + ((int) ((rect2.right - i19) * f15));
        int i26 = rect.bottom;
        int i27 = i26 + ((int) ((rect2.bottom - i26) * f15));
        Rect rect3 = this.f60621a;
        if (rect3 == null) {
            return new Rect(i16, i18, i25, i27);
        }
        rect3.set(i16, i18, i25, i27);
        return this.f60621a;
    }
}
