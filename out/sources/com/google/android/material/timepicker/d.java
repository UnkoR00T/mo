package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lj.h;
import lj.j;
import ri.l;

/* JADX INFO: loaded from: classes4.dex */
class d extends ConstraintLayout {
    private final Runnable C;
    private int D;
    private h E;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void D(List<View> list, androidx.constraintlayout.widget.d dVar, int i15) {
        Iterator<View> it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            dVar.h(it.next().getId(), ri.f.f173993c, i15, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable E() {
        h hVar = new h();
        this.E = hVar;
        hVar.d0(new j(0.5f));
        this.E.g0(ColorStateList.valueOf(-1));
        return this.E;
    }

    private static boolean I(View view) {
        return "skip".equals(view.getTag());
    }

    private void K() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.C);
            handler.post(this.C);
        }
    }

    int F(int i15) {
        return i15 == 2 ? Math.round(this.D * 0.66f) : this.D;
    }

    public int G() {
        return this.D;
    }

    public void H(int i15) {
        this.D = i15;
        J();
    }

    protected void J() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this);
        HashMap map = new HashMap();
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getId() != ri.f.f173993c && !I(childAt)) {
                int i16 = (Integer) childAt.getTag(ri.f.f174001k);
                if (i16 == null) {
                    i16 = 1;
                }
                if (!map.containsKey(i16)) {
                    map.put(i16, new ArrayList());
                }
                ((List) map.get(i16)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            D((List) entry.getValue(), dVar, F(((Integer) entry.getKey()).intValue()));
        }
        dVar.c(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i15, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i15, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        K();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        J();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        K();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i15) {
        this.E.g0(ColorStateList.valueOf(i15));
    }

    public d(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        LayoutInflater.from(context).inflate(ri.h.f174027h, this);
        setBackground(E());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.Q3, i15, 0);
        this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.R3, 0);
        this.C = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f35872a.J();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
