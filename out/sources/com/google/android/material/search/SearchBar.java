package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.o;
import lj.h;
import lj.i;
import ri.b;
import ri.d;
import ri.e;
import ri.k;

/* JADX INFO: loaded from: classes4.dex */
public class SearchBar extends Toolbar {
    private static final int R0 = k.f174078l;
    private final ColorStateList A0;
    private final boolean B0;
    private final boolean C0;
    private final Drawable D0;
    private final boolean E0;
    private final boolean F0;
    private View G0;
    private Integer H0;
    private Drawable I0;
    private int J0;
    private boolean K0;
    private h L0;
    private boolean M0;
    private int N0;
    private ActionMenuView O0;
    private ImageButton P0;
    private final AppBarLayout.f Q0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final TextView f35439w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final TextView f35440x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final FrameLayout f35441y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f35442z0;

    static class a extends r6.a {
        public static final Parcelable.Creator<a> CREATOR = new C0751a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f35444c;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchBar$a$a, reason: collision with other inner class name */
        class C0751a implements Parcelable.ClassLoaderCreator<a> {
            C0751a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i15) {
                return new a[i15];
            }
        }

        public a(Parcel parcel) {
            this(parcel, null);
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeString(this.f35444c);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f35444c = parcel.readString();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private void T() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists == null || this.A0 == null) {
            return;
        }
        appBarLayoutParentIfExists.c(this.Q0);
    }

    private int U(int i15, int i16) {
        return i15 == 0 ? i16 : i15;
    }

    private ActionMenuView V() {
        if (this.O0 == null) {
            this.O0 = o.a(this);
        }
        return this.O0;
    }

    private ImageButton W() {
        if (this.P0 == null) {
            this.P0 = o.d(this);
        }
        return this.P0;
    }

    private void X(View view, int i15, int i16, int i17, int i18) {
        if (getLayoutDirection() == 1) {
            view.layout(getMeasuredWidth() - i17, i16, getMeasuredWidth() - i15, i18);
        } else {
            view.layout(i15, i16, i17, i18);
        }
    }

    private void Y() {
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f35441y0.getMeasuredWidth() / 2);
        int measuredWidth2 = this.f35441y0.getMeasuredWidth() + measuredWidth;
        int measuredHeight = (getMeasuredHeight() / 2) - (this.f35441y0.getMeasuredHeight() / 2);
        int measuredHeight2 = this.f35441y0.getMeasuredHeight() + measuredHeight;
        boolean z15 = getLayoutDirection() == 1;
        View viewV = V();
        ImageButton imageButtonW = W();
        int measuredWidth3 = (this.f35441y0.getMeasuredWidth() / 2) - (this.f35439w0.getMeasuredWidth() / 2);
        int measuredWidth4 = this.f35439w0.getMeasuredWidth() + measuredWidth3;
        int i15 = measuredWidth3 + measuredWidth;
        int i16 = measuredWidth4 + measuredWidth;
        View view = z15 ? viewV : imageButtonW;
        if (z15) {
            viewV = imageButtonW;
        }
        int iMax = view != null ? Math.max(view.getRight() - i15, 0) : 0;
        int i17 = i15 + iMax;
        int i18 = i16 + iMax;
        int iMax2 = viewV != null ? Math.max(i18 - viewV.getLeft(), 0) : 0;
        int i19 = i17 - iMax2;
        int i25 = i18 - iMax2;
        int iMax3 = ((iMax - iMax2) + Math.max(Math.max(getPaddingLeft() - i19, getContentInsetLeft() - i19), 0)) - Math.max(Math.max(i25 - (getMeasuredWidth() - getPaddingRight()), i25 - (getMeasuredWidth() - getContentInsetRight())), 0);
        this.f35441y0.layout(measuredWidth + iMax3, measuredHeight, measuredWidth2 + iMax3, measuredHeight2);
    }

    private void Z(View view) {
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i15 = measuredWidth2 + measuredWidth;
        int measuredHeight = view.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        X(view, measuredWidth2, measuredHeight2, i15, measuredHeight2 + measuredHeight);
    }

    private Drawable a0(Drawable drawable) {
        int iD;
        if (!this.E0 || drawable == null) {
            return drawable;
        }
        Integer num = this.H0;
        if (num != null) {
            iD = num.intValue();
        } else {
            iD = bj.a.d(this, drawable == this.D0 ? b.f173910e : b.f173909d);
        }
        Drawable drawableR = y5.a.r(drawable.mutate());
        drawableR.setTint(iD);
        return drawableR;
    }

    private void b0(int i15, int i16) {
        View view = this.G0;
        if (view != null) {
            view.measure(i15, i16);
        }
    }

    private void c0() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.v(this.Q0);
        }
    }

    private void d0() {
        if (this.C0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(d.f173978y);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = U(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = U(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = U(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = U(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void e0() {
        int width;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z15 = getLayoutDirection() == 1;
        ImageButton imageButtonD = o.d(this);
        if (imageButtonD == null || !imageButtonD.isClickable()) {
            width = 0;
        } else {
            width = z15 ? getWidth() - imageButtonD.getLeft() : imageButtonD.getRight();
        }
        ActionMenuView actionMenuViewA = o.a(this);
        if (actionMenuViewA != null) {
            right = z15 ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft();
        }
        float f15 = -(z15 ? right : width);
        if (!z15) {
            width = right;
        }
        setHandwritingBoundsOffsets(f15, 0.0f, -width, 0.0f);
    }

    private void f0() {
        if (getLayoutParams() instanceof AppBarLayout.d) {
            AppBarLayout.d dVar = (AppBarLayout.d) getLayoutParams();
            if (this.K0) {
                if (dVar.c() == 0) {
                    dVar.g(53);
                }
            } else if (dVar.c() == 53) {
                dVar.g(0);
            }
        }
    }

    private AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    private void setNavigationIconDecorative(boolean z15) {
        ImageButton imageButtonD = o.d(this);
        if (imageButtonD == null) {
            return;
        }
        imageButtonD.setClickable(!z15);
        imageButtonD.setFocusable(!z15);
        Drawable background = imageButtonD.getBackground();
        if (background != null) {
            this.I0 = background;
        }
        imageButtonD.setBackgroundDrawable(z15 ? null : this.I0);
        e0();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i15, ViewGroup.LayoutParams layoutParams) {
        if (this.B0 && this.G0 == null && !(view instanceof ActionMenuView)) {
            this.G0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i15, layoutParams);
    }

    public View getCenterView() {
        return this.G0;
    }

    float getCompatElevation() {
        h hVar = this.L0;
        return hVar != null ? hVar.A() : getElevation();
    }

    public float getCornerSize() {
        return this.L0.N();
    }

    protected int getDefaultMarginVerticalResource() {
        return d.f173979z;
    }

    protected int getDefaultNavigationIconResource() {
        return e.f173982c;
    }

    public CharSequence getHint() {
        return this.f35439w0.getHint();
    }

    public int getMaxWidth() {
        return this.N0;
    }

    int getMenuResId() {
        return this.J0;
    }

    TextView getPlaceholderTextView() {
        return this.f35440x0;
    }

    public int getStrokeColor() {
        return this.L0.J().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.L0.L();
    }

    public CharSequence getText() {
        return this.f35439w0.getText();
    }

    public boolean getTextCentered() {
        return this.M0;
    }

    public TextView getTextView() {
        return this.f35439w0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.f(this, this.L0);
        d0();
        f0();
        if (this.f35442z0) {
            T();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c0();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        super.onLayout(z15, i15, i16, i17, i18);
        View view = this.G0;
        if (view != null) {
            Z(view);
        }
        e0();
        if (this.f35439w0 == null || !this.M0) {
            return;
        }
        Y();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onMeasure(int i15, int i16) {
        int i17 = this.N0;
        if (i17 >= 0 && i17 < View.MeasureSpec.getSize(i15)) {
            i15 = View.MeasureSpec.makeMeasureSpec(this.N0, View.MeasureSpec.getMode(i15));
        }
        super.onMeasure(i15, i16);
        b0(i15, i16);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        setText(aVar.f35444c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        CharSequence text = getText();
        aVar.f35444c = text == null ? null : text.toString();
        return aVar;
    }

    public void setCenterView(View view) {
        View view2 = this.G0;
        if (view2 != null) {
            removeView(view2);
            this.G0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z15) {
        this.K0 = z15;
        f0();
    }

    @Override // android.view.View
    public void setElevation(float f15) {
        super.setElevation(f15);
        h hVar = this.L0;
        if (hVar != null) {
            hVar.f0(f15);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.f35439w0.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean z15) {
        this.f35442z0 = z15;
        if (z15) {
            T();
        } else {
            c0();
        }
    }

    public void setMaxWidth(int i15) {
        if (this.N0 != i15) {
            this.N0 = i15;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(a0(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.F0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z15) {
        throw null;
    }

    void setPlaceholderText(String str) {
        this.f35440x0.setText(str);
    }

    public void setStrokeColor(int i15) {
        if (getStrokeColor() != i15) {
            this.L0.o0(ColorStateList.valueOf(i15));
        }
    }

    public void setStrokeWidth(float f15) {
        if (getStrokeWidth() != f15) {
            this.L0.p0(f15);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.f35439w0.setText(charSequence);
        this.f35440x0.setText(charSequence);
    }

    public void setTextCentered(boolean z15) {
        this.M0 = z15;
        TextView textView = this.f35439w0;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z15) {
            layoutParams.gravity = 1;
            this.f35439w0.setGravity(1);
        } else {
            layoutParams.gravity = 0;
            this.f35439w0.setGravity(0);
        }
        this.f35439w0.setLayoutParams(layoutParams);
        this.f35440x0.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void x(int i15) {
        super.x(i15);
        this.J0 = i15;
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f35443h;

        public ScrollingViewBehavior() {
            this.f35443h = false;
        }

        private void U(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.d
        protected boolean P() {
            return true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean zH = super.h(coordinatorLayout, view, view2);
            if (!this.f35443h && (view2 instanceof AppBarLayout)) {
                this.f35443h = true;
                U((AppBarLayout) view2);
            }
            return zH;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f35443h = false;
        }
    }

    public void setHint(int i15) {
        this.f35439w0.setHint(i15);
    }

    public void setText(int i15) {
        this.f35439w0.setText(i15);
        this.f35440x0.setText(i15);
    }
}
