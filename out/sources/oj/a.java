package oj;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ij.b;
import ij.c;
import ri.l;

/* JADX INFO: loaded from: classes4.dex */
public class a extends AppCompatTextView {
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void s(Resources.Theme theme, int i15) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i15, l.f174265v3);
        int iW = w(getContext(), typedArrayObtainStyledAttributes, l.f174289y3, l.A3);
        typedArrayObtainStyledAttributes.recycle();
        if (iW >= 0) {
            setLineHeight(iW);
        }
    }

    private static boolean t(Context context) {
        return b.b(context, ri.b.V, true);
    }

    private static int u(Resources.Theme theme, AttributeSet attributeSet, int i15, int i16) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.B3, i15, i16);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.C3, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void v(AttributeSet attributeSet, int i15, int i16) {
        int iU;
        Context context = getContext();
        if (t(context)) {
            Resources.Theme theme = context.getTheme();
            if (x(context, theme, attributeSet, i15, i16) || (iU = u(theme, attributeSet, i15, i16)) == -1) {
                return;
            }
            s(theme, iU);
        }
    }

    private static int w(Context context, TypedArray typedArray, int... iArr) {
        int iC = -1;
        for (int i15 = 0; i15 < iArr.length && iC < 0; i15++) {
            iC = c.c(context, typedArray, iArr[i15], -1);
        }
        return iC;
    }

    private static boolean x(Context context, Resources.Theme theme, AttributeSet attributeSet, int i15, int i16) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.B3, i15, i16);
        int iW = w(context, typedArrayObtainStyledAttributes, l.D3, l.E3);
        typedArrayObtainStyledAttributes.recycle();
        return iW != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i15) {
        super.setTextAppearance(context, i15);
        if (t(context)) {
            s(context.getTheme(), i15);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i15) {
        super(pj.a.d(context, attributeSet, i15, 0), attributeSet, i15);
        v(attributeSet, i15, 0);
    }
}
