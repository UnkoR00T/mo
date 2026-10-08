package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f8987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b7.f f8988b;

    n(TextView textView) {
        this.f8987a = textView;
        this.f8988b = new b7.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f8988b.a(inputFilterArr);
    }

    void b(AttributeSet attributeSet, int i15) {
        TypedArray typedArrayObtainStyledAttributes = this.f8987a.getContext().obtainStyledAttributes(attributeSet, p007NuL.v.f468g0, i15, 0);
        try {
            boolean z15 = typedArrayObtainStyledAttributes.hasValue(p007NuL.v.f537u0) ? typedArrayObtainStyledAttributes.getBoolean(p007NuL.v.f537u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z15);
        } catch (Throwable th4) {
            typedArrayObtainStyledAttributes.recycle();
            throw th4;
        }
    }

    void c(boolean z15) {
        this.f8988b.b(z15);
    }

    void d(boolean z15) {
        this.f8988b.c(z15);
    }
}
