package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import n5.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f11756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f11757l;

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.b
    protected void i(ConstraintLayout constraintLayout) {
        h(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.b
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index == i.f11550c1) {
                    this.f11756k = true;
                } else if (index == i.f11613j1) {
                    this.f11757l = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11756k || this.f11757l) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i15 = 0; i15 < this.f11391b; i15++) {
                    View viewQ = constraintLayout.q(this.f11390a[i15]);
                    if (viewQ != null) {
                        if (this.f11756k) {
                            viewQ.setVisibility(visibility);
                        }
                        if (this.f11757l && elevation > 0.0f) {
                            viewQ.setTranslationZ(viewQ.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f15) {
        super.setElevation(f15);
        g();
    }

    @Override // android.view.View
    public void setVisibility(int i15) {
        super.setVisibility(i15);
        g();
    }

    public void t(l lVar, int i15, int i16) {
    }
}
