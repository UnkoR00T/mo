package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.m0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class v extends androidx.appcompat.widget.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m0 f35806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AccessibilityManager f35807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f35808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f35809h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f35810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f35811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f35812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f35813m;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i15, long j15) {
            v vVar = v.this;
            Object objV = i15 < 0 ? vVar.f35806e.v() : vVar.getAdapter().getItem(i15);
            v vVar2 = v.this;
            vVar2.setText(vVar2.convertSelectionToString(objV), false);
            AdapterView.OnItemClickListener onItemClickListener = v.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i15 < 0) {
                    view = v.this.f35806e.y();
                    i15 = v.this.f35806e.x();
                    j15 = v.this.f35806e.w();
                }
                onItemClickListener.onItemClick(v.this.f35806e.p(), view, i15, j15);
            }
            v.this.f35806e.dismiss();
        }
    }

    private class b<T> extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ColorStateList f35815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ColorStateList f35816b;

        b(Context context, int i15, String[] strArr) {
            super(context, i15, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = v.this.f35813m.getColorForState(iArr2, 0);
            int colorForState2 = v.this.f35813m.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{bj.a.i(v.this.f35812l, colorForState), bj.a.i(v.this.f35812l, colorForState2), v.this.f35812l});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(v.this.f35812l);
            if (this.f35816b == null) {
                return colorDrawable;
            }
            colorDrawable.setTintList(this.f35815a);
            return new RippleDrawable(this.f35816b, colorDrawable, null);
        }

        private boolean c() {
            return v.this.f35812l != 0;
        }

        private boolean d() {
            return v.this.f35813m != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{v.this.f35813m.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f35816b = e();
            this.f35815a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i15, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i15, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setBackground(v.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p007NuL.m.f323p);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        return i() || h();
    }

    private boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f35807f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f35807f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = this.f35807f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutF = f();
        int i15 = 0;
        if (adapter == null || textInputLayoutF == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f35806e.x()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i15) {
                view = null;
                i15 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutF);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableH = this.f35806e.h();
        if (drawableH != null) {
            drawableH.getPadding(this.f35808g);
            Rect rect = this.f35808g;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutF.getEndIconView().getMeasuredWidth();
    }

    private void k() {
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null) {
            textInputLayoutF.s0();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f35806e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f35811k;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutF = f();
        return (textInputLayoutF == null || !textInputLayoutF.T()) ? super.getHint() : textInputLayoutF.getHint();
    }

    public float getPopupElevation() {
        return this.f35810j;
    }

    public int getSimpleItemSelectedColor() {
        return this.f35812l;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f35813m;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null && textInputLayoutF.T() && super.getHint() == null && com.google.android.material.internal.h.b()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f35806e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i15, int i16) {
        super.onMeasure(i15, i16);
        if (View.MeasureSpec.getMode(i15) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i15)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z15) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z15);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t15) {
        super.setAdapter(t15);
        this.f35806e.n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        m0 m0Var = this.f35806e;
        if (m0Var != null) {
            m0Var.c(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i15) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i15));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f35811k = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof lj.h) {
            ((lj.h) dropDownBackground).g0(this.f35811k);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f35806e.M(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i15) {
        super.setRawInputType(i15);
        k();
    }

    public void setSimpleItemSelectedColor(int i15) {
        this.f35812l = i15;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f35813m = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i15) {
        setSimpleItems(getResources().getStringArray(i15));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f35806e.a();
        } else {
            super.showDropDown();
        }
    }

    public v(Context context, AttributeSet attributeSet, int i15) {
        super(pj.a.d(context, attributeSet, i15, 0), attributeSet, i15);
        this.f35808g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.n.i(context2, attributeSet, ri.l.G1, i15, p007NuL.u.f436e, new int[0]);
        if (typedArrayI.hasValue(ri.l.H1) && typedArrayI.getInt(ri.l.H1, 0) == 0) {
            setKeyListener(null);
        }
        this.f35809h = typedArrayI.getResourceId(ri.l.K1, ri.h.f174031l);
        this.f35810j = typedArrayI.getDimensionPixelOffset(ri.l.I1, ri.d.f173953h0);
        if (typedArrayI.hasValue(ri.l.J1)) {
            this.f35811k = ColorStateList.valueOf(typedArrayI.getColor(ri.l.J1, 0));
        }
        this.f35812l = typedArrayI.getColor(ri.l.L1, 0);
        this.f35813m = ij.c.a(context2, typedArrayI, ri.l.M1);
        this.f35807f = (AccessibilityManager) context2.getSystemService("accessibility");
        m0 m0Var = new m0(context2);
        this.f35806e = m0Var;
        m0Var.J(true);
        m0Var.D(this);
        m0Var.I(2);
        m0Var.n(getAdapter());
        m0Var.L(new a());
        if (typedArrayI.hasValue(ri.l.N1)) {
            setSimpleItems(typedArrayI.getResourceId(ri.l.N1, 0));
        }
        typedArrayI.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f35809h, strArr));
    }
}
