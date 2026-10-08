package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.l0;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationMenuItemView extends g implements androidx.appcompat.view.menu.k.a {
    private static final int[] K = {R.attr.state_checked};
    boolean A;
    boolean B;
    private final CheckedTextView C;
    private FrameLayout D;
    private androidx.appcompat.view.menu.g E;
    private ColorStateList F;
    private boolean G;
    private Drawable H;
    private final j6.a I;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f35338y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f35339z;

    class a extends j6.a {
        a() {
        }

        @Override // j6.a
        public void g(View view, k6.p pVar) {
            super.g(view, pVar);
            pVar.m0(NavigationMenuItemView.this.A);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private StateListDrawable A() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(p007NuL.m.f330w, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(K, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean B() {
        return this.E.getTitle() == null && this.E.getIcon() == null && this.E.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.D == null) {
                this.D = (FrameLayout) ((ViewStub) findViewById(ri.f.f173995e)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.D.removeAllViews();
            this.D.addView(view);
        }
    }

    private void z() {
        if (B()) {
            this.C.setVisibility(8);
            FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                l0.a aVar = (l0.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.D.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.C.setVisibility(0);
        FrameLayout frameLayout2 = this.D;
        if (frameLayout2 != null) {
            l0.a aVar2 = (l0.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.D.setLayoutParams(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(androidx.appcompat.view.menu.g gVar, int i15) {
        this.E = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            setBackground(A());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        e1.a(this, gVar.getTooltipText());
        z();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i15) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i15 + 1);
        androidx.appcompat.view.menu.g gVar = this.E;
        if (gVar != null && gVar.isCheckable() && this.E.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, K);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z15) {
        refreshDrawableState();
        if (this.A != z15) {
            this.A = z15;
            this.I.l(this.C, 2048);
        }
    }

    public void setChecked(boolean z15) {
        refreshDrawableState();
        this.C.setChecked(z15);
        CheckedTextView checkedTextView = this.C;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z15 && this.B) ? 1 : 0);
    }

    public void setHorizontalPadding(int i15) {
        setPadding(i15, getPaddingTop(), i15, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.G) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = y5.a.r(drawable).mutate();
                drawable.setTintList(this.F);
            }
            int i15 = this.f35338y;
            drawable.setBounds(0, 0, i15, i15);
        } else if (this.f35339z) {
            if (this.H == null) {
                Drawable drawableE = w5.h.e(getResources(), ri.e.f173990k, getContext().getTheme());
                this.H = drawableE;
                if (drawableE != null) {
                    int i16 = this.f35338y;
                    drawableE.setBounds(0, 0, i16, i16);
                }
            }
            drawable = this.H;
        }
        this.C.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i15) {
        this.C.setCompoundDrawablePadding(i15);
    }

    public void setIconSize(int i15) {
        this.f35338y = i15;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.F = colorStateList;
        this.G = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.E;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i15) {
        this.C.setMaxLines(i15);
    }

    public void setNeedsEmptyIcon(boolean z15) {
        this.f35339z = z15;
    }

    public void setTextAppearance(int i15) {
        androidx.core.widget.h.m(this.C, i15);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.C.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.C.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.B = true;
        a aVar = new a();
        this.I = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(ri.h.f174022c, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(ri.d.f173944d));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(ri.f.f173996f);
        this.C = checkedTextView;
        j6.l0.h0(checkedTextView, aVar);
    }
}
