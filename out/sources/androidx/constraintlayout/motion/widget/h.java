package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class h extends androidx.constraintlayout.widget.b implements j.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f11238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f11239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f11240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected View[] f11241n;

    @Override // androidx.constraintlayout.motion.widget.j.c
    public void a(j jVar, int i15, int i16, float f15) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.c
    public void b(j jVar, int i15) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.c
    public void c(j jVar, int i15, int i16) {
    }

    public float getProgress() {
        return this.f11240m;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.B6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index == androidx.constraintlayout.widget.i.D6) {
                    this.f11238k = typedArrayObtainStyledAttributes.getBoolean(index, this.f11238k);
                } else if (index == androidx.constraintlayout.widget.i.C6) {
                    this.f11239l = typedArrayObtainStyledAttributes.getBoolean(index, this.f11239l);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f15) {
        this.f11240m = f15;
        int i15 = 0;
        if (this.f11391b > 0) {
            this.f11241n = l((ConstraintLayout) getParent());
            while (i15 < this.f11391b) {
                x(this.f11241n[i15], f15);
                i15++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i15 < childCount) {
            View childAt = viewGroup.getChildAt(i15);
            if (!(childAt instanceof h)) {
                x(childAt, f15);
            }
            i15++;
        }
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return this.f11239l;
    }

    public boolean v() {
        return this.f11238k;
    }

    public void w(Canvas canvas) {
    }

    public void x(View view, float f15) {
    }
}
