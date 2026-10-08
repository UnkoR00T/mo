package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f11287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f11288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private n5.a f11289m;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void t(n5.e eVar, int i15, boolean z15) {
        this.f11288l = i15;
        if (z15) {
            int i16 = this.f11287k;
            if (i16 == 5) {
                this.f11288l = 1;
            } else if (i16 == 6) {
                this.f11288l = 0;
            }
        } else {
            int i17 = this.f11287k;
            if (i17 == 5) {
                this.f11288l = 0;
            } else if (i17 == 6) {
                this.f11288l = 1;
            }
        }
        if (eVar instanceof n5.a) {
            ((n5.a) eVar).D1(this.f11288l);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f11289m.x1();
    }

    public int getMargin() {
        return this.f11289m.z1();
    }

    public int getType() {
        return this.f11287k;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f11289m = new n5.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index == i.f11631l1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.f11622k1) {
                    this.f11289m.C1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.f11640m1) {
                    this.f11289m.E1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f11393d = this.f11289m;
        s();
    }

    @Override // androidx.constraintlayout.widget.b
    public void n(n5.e eVar, boolean z15) {
        t(eVar, this.f11287k, z15);
    }

    public void setAllowsGoneWidget(boolean z15) {
        this.f11289m.C1(z15);
    }

    public void setDpMargin(int i15) {
        this.f11289m.E1((int) ((i15 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i15) {
        this.f11289m.E1(i15);
    }

    public void setType(int i15) {
        this.f11287k = i15;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
