package b7;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
class h implements TransformationMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TransformationMethod f16985a;

    h(TransformationMethod transformationMethod) {
        this.f16985a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f16985a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f16985a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.e.c().g() != 1) ? charSequence : androidx.emoji2.text.e.c().r(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z15, int i15, Rect rect) {
        TransformationMethod transformationMethod = this.f16985a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z15, i15, rect);
        }
    }
}
