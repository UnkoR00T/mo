package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.n;
import com.google.android.material.internal.o;
import lj.h;
import lj.i;
import p007NuL.m;
import ri.k;
import ri.l;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialToolbar extends Toolbar {
    private static final int B0 = k.C;
    private static final ImageView.ScaleType[] C0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Boolean A0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private Integer f34710w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f34711x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f34712y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private ImageView.ScaleType f34713z0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m.P);
    }

    private Pair<Integer, Integer> T(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i15 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void U(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : com.google.android.material.drawable.c.f(background);
        if (colorStateListValueOf != null) {
            h hVar = new h();
            hVar.g0(colorStateListValueOf);
            hVar.U(context);
            hVar.f0(getElevation());
            setBackground(hVar);
        }
    }

    private void V(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i15 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i16 = measuredWidth2 + i15;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i15, 0), Math.max(i16 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i15 += iMax;
            i16 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i16 - i15, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i15, view.getTop(), i16, view.getBottom());
    }

    private void W() {
        if (this.f34711x0 || this.f34712y0) {
            TextView textViewG = o.g(this);
            TextView textViewE = o.e(this);
            if (textViewG == null && textViewE == null) {
                return;
            }
            Pair<Integer, Integer> pairT = T(textViewG, textViewE);
            if (this.f34711x0 && textViewG != null) {
                V(textViewG, pairT);
            }
            if (!this.f34712y0 || textViewE == null) {
                return;
            }
            V(textViewE, pairT);
        }
    }

    private Drawable X(Drawable drawable) {
        if (drawable == null || this.f34710w0 == null) {
            return drawable;
        }
        Drawable drawableR = y5.a.r(drawable.mutate());
        drawableR.setTint(this.f34710w0.intValue());
        return drawableR;
    }

    private void Y() {
        ImageView imageViewC = o.c(this);
        if (imageViewC != null) {
            Boolean bool = this.A0;
            if (bool != null) {
                imageViewC.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f34713z0;
            if (scaleType != null) {
                imageViewC.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f34713z0;
    }

    public Integer getNavigationIconTint() {
        return this.f34710w0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        super.onLayout(z15, i15, i16, i17, i18);
        W();
        Y();
    }

    @Override // android.view.View
    public void setElevation(float f15) {
        super.setElevation(f15);
        i.d(this, f15);
    }

    public void setLogoAdjustViewBounds(boolean z15) {
        Boolean bool = this.A0;
        if (bool == null || bool.booleanValue() != z15) {
            this.A0 = Boolean.valueOf(z15);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f34713z0 != scaleType) {
            this.f34713z0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(X(drawable));
    }

    public void setNavigationIconTint(int i15) {
        this.f34710w0 = Integer.valueOf(i15);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z15) {
        if (this.f34712y0 != z15) {
            this.f34712y0 = z15;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z15) {
        if (this.f34711x0 != z15) {
            this.f34711x0 = z15;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i15) {
        int i16 = B0;
        super(pj.a.d(context, attributeSet, i15, i16), attributeSet, i15);
        Context context2 = getContext();
        TypedArray typedArrayI = n.i(context2, attributeSet, l.G3, i15, i16, new int[0]);
        if (typedArrayI.hasValue(l.J3)) {
            setNavigationIconTint(typedArrayI.getColor(l.J3, -1));
        }
        this.f34711x0 = typedArrayI.getBoolean(l.L3, false);
        this.f34712y0 = typedArrayI.getBoolean(l.K3, false);
        int i17 = typedArrayI.getInt(l.I3, -1);
        if (i17 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = C0;
            if (i17 < scaleTypeArr.length) {
                this.f34713z0 = scaleTypeArr[i17];
            }
        }
        if (typedArrayI.hasValue(l.H3)) {
            this.A0 = Boolean.valueOf(typedArrayI.getBoolean(l.H3, false));
        }
        typedArrayI.recycle();
        U(context2);
    }
}
