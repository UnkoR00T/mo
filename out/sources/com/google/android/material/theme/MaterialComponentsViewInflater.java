package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.n;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.v;
import xi.a;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialComponentsViewInflater extends n {
    @Override // androidx.appcompat.app.n
    protected d c(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    @Override // androidx.appcompat.app.n
    protected f d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.n
    protected g e(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.n
    protected androidx.appcompat.widget.v k(Context context, AttributeSet attributeSet) {
        return new hj.a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.n
    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new oj.a(context, attributeSet);
    }
}
