package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.i;
import androidx.constraintlayout.widget.k;
import n5.e;
import n5.g;
import n5.l;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g f11202m;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.k, androidx.constraintlayout.widget.b
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f11202m = new g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index == i.W0) {
                    this.f11202m.G2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.X0) {
                    this.f11202m.L1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f11595h1) {
                    this.f11202m.Q1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f11604i1) {
                    this.f11202m.N1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.Y0) {
                    this.f11202m.O1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.Z0) {
                    this.f11202m.R1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f11532a1) {
                    this.f11202m.P1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.f11541b1) {
                    this.f11202m.M1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.H1) {
                    this.f11202m.L2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f11732x1) {
                    this.f11202m.A2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.G1) {
                    this.f11202m.K2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f11684r1) {
                    this.f11202m.u2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f11748z1) {
                    this.f11202m.C2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f11700t1) {
                    this.f11202m.w2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.B1) {
                    this.f11202m.E2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f11716v1) {
                    this.f11202m.y2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f11676q1) {
                    this.f11202m.t2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f11740y1) {
                    this.f11202m.B2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f11692s1) {
                    this.f11202m.v2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.A1) {
                    this.f11202m.D2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.E1) {
                    this.f11202m.I2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == i.f11708u1) {
                    this.f11202m.x2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.D1) {
                    this.f11202m.H2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == i.f11724w1) {
                    this.f11202m.z2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.F1) {
                    this.f11202m.J2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == i.C1) {
                    this.f11202m.F2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f11393d = this.f11202m;
        s();
    }

    @Override // androidx.constraintlayout.widget.b
    public void n(e eVar, boolean z15) {
        this.f11202m.w1(z15);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i15, int i16) {
        t(this.f11202m, i15, i16);
    }

    public void setFirstHorizontalBias(float f15) {
        this.f11202m.t2(f15);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i15) {
        this.f11202m.u2(i15);
        requestLayout();
    }

    public void setFirstVerticalBias(float f15) {
        this.f11202m.v2(f15);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i15) {
        this.f11202m.w2(i15);
        requestLayout();
    }

    public void setHorizontalAlign(int i15) {
        this.f11202m.x2(i15);
        requestLayout();
    }

    public void setHorizontalBias(float f15) {
        this.f11202m.y2(f15);
        requestLayout();
    }

    public void setHorizontalGap(int i15) {
        this.f11202m.z2(i15);
        requestLayout();
    }

    public void setHorizontalStyle(int i15) {
        this.f11202m.A2(i15);
        requestLayout();
    }

    public void setLastHorizontalBias(float f15) {
        this.f11202m.B2(f15);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i15) {
        this.f11202m.C2(i15);
        requestLayout();
    }

    public void setLastVerticalBias(float f15) {
        this.f11202m.D2(f15);
        requestLayout();
    }

    public void setLastVerticalStyle(int i15) {
        this.f11202m.E2(i15);
        requestLayout();
    }

    public void setMaxElementsWrap(int i15) {
        this.f11202m.F2(i15);
        requestLayout();
    }

    public void setOrientation(int i15) {
        this.f11202m.G2(i15);
        requestLayout();
    }

    public void setPadding(int i15) {
        this.f11202m.L1(i15);
        requestLayout();
    }

    public void setPaddingBottom(int i15) {
        this.f11202m.M1(i15);
        requestLayout();
    }

    public void setPaddingLeft(int i15) {
        this.f11202m.O1(i15);
        requestLayout();
    }

    public void setPaddingRight(int i15) {
        this.f11202m.P1(i15);
        requestLayout();
    }

    public void setPaddingTop(int i15) {
        this.f11202m.R1(i15);
        requestLayout();
    }

    public void setVerticalAlign(int i15) {
        this.f11202m.H2(i15);
        requestLayout();
    }

    public void setVerticalBias(float f15) {
        this.f11202m.I2(f15);
        requestLayout();
    }

    public void setVerticalGap(int i15) {
        this.f11202m.J2(i15);
        requestLayout();
    }

    public void setVerticalStyle(int i15) {
        this.f11202m.K2(i15);
        requestLayout();
    }

    public void setWrapMode(int i15) {
        this.f11202m.L2(i15);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.k
    public void t(l lVar, int i15, int i16) {
        int mode = View.MeasureSpec.getMode(i15);
        int size = View.MeasureSpec.getSize(i15);
        int mode2 = View.MeasureSpec.getMode(i16);
        int size2 = View.MeasureSpec.getSize(i16);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.F1(mode, size, mode2, size2);
            setMeasuredDimension(lVar.A1(), lVar.z1());
        }
    }
}
