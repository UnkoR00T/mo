package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.r;
import i6.i;
import j6.l0;
import java.util.List;
import lj.l;
import lj.o;
import ri.k;
import si.h;

/* JADX INFO: loaded from: classes4.dex */
public class FloatingActionButton extends r implements ej.a, o, CoordinatorLayout.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f35240r = k.f174073g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f35241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f35242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f35243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f35244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f35245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f35246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f35247h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f35250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Rect f35251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f35252n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final q f35253p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.b f35254q;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: E */
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.h(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: J */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i15) {
            return super.l(coordinatorLayout, floatingActionButton, i15);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void g(CoordinatorLayout.f fVar) {
            super.g(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements com.google.android.material.floatingactionbutton.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f35258a;

        a(b bVar) {
            this.f35258a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.b.f
        public void a() {
            this.f35258a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.b.f
        public void b() {
            this.f35258a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class c implements kj.b {
        c() {
        }

        @Override // kj.b
        public void a(int i15, int i16, int i17, int i18) {
            FloatingActionButton.this.f35251m.set(i15, i16, i17, i18);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i15 + floatingActionButton.f35248j, i16 + FloatingActionButton.this.f35248j, i17 + FloatingActionButton.this.f35248j, i18 + FloatingActionButton.this.f35248j);
        }

        @Override // kj.b
        public boolean b() {
            return FloatingActionButton.this.f35250l;
        }

        @Override // kj.b
        public void c(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    class d<T extends FloatingActionButton> implements com.google.android.material.floatingactionbutton.b.e {
        d(si.k<T> kVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.b.e
        public void a() {
            throw null;
        }

        @Override // com.google.android.material.floatingactionbutton.b.e
        public void b() {
            throw null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                throw null;
            }
            return false;
        }

        public int hashCode() {
            throw null;
        }
    }

    private com.google.android.material.floatingactionbutton.b getImpl() {
        if (this.f35254q == null) {
            this.f35254q = new com.google.android.material.floatingactionbutton.b(this, new c());
        }
        return this.f35254q;
    }

    private int i(int i15) {
        int i16 = this.f35247h;
        if (i16 != 0) {
            return i16;
        }
        Resources resources = getResources();
        if (i15 != -1) {
            return i15 != 1 ? resources.getDimensionPixelSize(ri.d.f173942c) : resources.getDimensionPixelSize(ri.d.f173940b);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? i(1) : i(0);
    }

    private void j(Rect rect) {
        h(rect);
        int i15 = -this.f35254q.v();
        rect.inset(i15, i15);
    }

    private void o(Rect rect) {
        int i15 = rect.left;
        Rect rect2 = this.f35251m;
        rect.left = i15 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void p() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f35243d;
        if (colorStateList == null) {
            y5.a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f35244e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(androidx.appcompat.widget.k.e(colorForState, mode));
    }

    private com.google.android.material.floatingactionbutton.b.f s(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @Override // ej.a
    public boolean a() {
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    public void g(si.k<? extends FloatingActionButton> kVar) {
        getImpl().g(new d(kVar));
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f35241b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f35242c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().s();
    }

    public Drawable getContentBackground() {
        return getImpl().m();
    }

    public int getCustomSize() {
        return this.f35247h;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public h getHideMotionSpec() {
        return getImpl().p();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f35245f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f35245f;
    }

    public l getShapeAppearanceModel() {
        return (l) i.g(getImpl().t());
    }

    public h getShowMotionSpec() {
        return getImpl().u();
    }

    public int getSize() {
        return this.f35246g;
    }

    int getSizeDimension() {
        return i(this.f35246g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f35243d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f35244e;
    }

    public boolean getUseCompatPadding() {
        return this.f35250l;
    }

    public void h(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        o(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
    }

    public void k(b bVar) {
        l(bVar, true);
    }

    void l(b bVar, boolean z15) {
        getImpl().w(s(bVar), z15);
    }

    public boolean m() {
        return getImpl().y();
    }

    public boolean n() {
        return getImpl().z();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().A();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().C();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i15, int i16) {
        int sizeDimension = getSizeDimension();
        this.f35248j = (sizeDimension - this.f35249k) / 2;
        getImpl().Y();
        int iMin = Math.min(View.resolveSize(sizeDimension, i15), View.resolveSize(sizeDimension, i16));
        Rect rect = this.f35251m;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof nj.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        nj.a aVar = (nj.a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        throw null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        new nj.a(parcelableOnSaveInstanceState);
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            j(this.f35252n);
            if (!this.f35252n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void q(b bVar) {
        r(bVar, true);
    }

    void r(b bVar, boolean z15) {
        getImpl().W(s(bVar), z15);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i15) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i15) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f35241b != colorStateList) {
            this.f35241b = colorStateList;
            getImpl().H(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f35242c != mode) {
            this.f35242c = mode;
            getImpl().I(mode);
        }
    }

    public void setCompatElevation(float f15) {
        getImpl().J(f15);
    }

    public void setCompatElevationResource(int i15) {
        setCompatElevation(getResources().getDimension(i15));
    }

    public void setCompatHoveredFocusedTranslationZ(float f15) {
        getImpl().M(f15);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i15) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i15));
    }

    public void setCompatPressedTranslationZ(float f15) {
        getImpl().P(f15);
    }

    public void setCompatPressedTranslationZResource(int i15) {
        setCompatPressedTranslationZ(getResources().getDimension(i15));
    }

    public void setCustomSize(int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i15 != this.f35247h) {
            this.f35247h = i15;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f15) {
        super.setElevation(f15);
        getImpl().Z(f15);
    }

    public void setEnsureMinTouchTargetSize(boolean z15) {
        if (z15 != getImpl().o()) {
            getImpl().K(z15);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i15) {
        throw null;
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().L(hVar);
    }

    public void setHideMotionSpecResource(int i15) {
        setHideMotionSpec(h.c(getContext(), i15));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().X();
            if (this.f35243d != null) {
                p();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i15) {
        this.f35253p.i(i15);
        p();
    }

    public void setMaxImageSize(int i15) {
        this.f35249k = i15;
        getImpl().O(i15);
    }

    public void setRippleColor(int i15) {
        setRippleColor(ColorStateList.valueOf(i15));
    }

    @Override // android.view.View
    public void setScaleX(float f15) {
        super.setScaleX(f15);
        getImpl().F();
    }

    @Override // android.view.View
    public void setScaleY(float f15) {
        super.setScaleY(f15);
        getImpl().F();
    }

    public void setShadowPaddingEnabled(boolean z15) {
        getImpl().R(z15);
    }

    @Override // lj.o
    public void setShapeAppearanceModel(l lVar) {
        getImpl().S(lVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().T(hVar);
    }

    public void setShowMotionSpecResource(int i15) {
        setShowMotionSpec(h.c(getContext(), i15));
    }

    public void setSize(int i15) {
        this.f35247h = 0;
        if (i15 != this.f35246g) {
            this.f35246g = i15;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f35243d != colorStateList) {
            this.f35243d = colorStateList;
            p();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f35244e != mode) {
            this.f35244e = mode;
            p();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f15) {
        super.setTranslationX(f15);
        getImpl().G();
    }

    @Override // android.view.View
    public void setTranslationY(float f15) {
        super.setTranslationY(f15);
        getImpl().G();
    }

    @Override // android.view.View
    public void setTranslationZ(float f15) {
        super.setTranslationZ(f15);
        getImpl().G();
    }

    public void setUseCompatPadding(boolean z15) {
        if (this.f35250l != z15) {
            this.f35250l = z15;
            getImpl().B();
        }
    }

    @Override // com.google.android.material.internal.r, android.widget.ImageView, android.view.View
    public void setVisibility(int i15) {
        super.setVisibility(i15);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rect f35255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f35256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f35257c;

        public BaseBehavior() {
            this.f35257c = true;
        }

        private boolean F(View view, FloatingActionButton floatingActionButton) {
            return (this.f35257c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) ? false : true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i15;
            Rect rect = floatingActionButton.f35251m;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i16 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                i15 = rect.right;
            } else {
                i15 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i16 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i16 = -rect.top;
            }
            if (i16 != 0) {
                l0.R(floatingActionButton, i16);
            }
            if (i15 != 0) {
                l0.Q(floatingActionButton, i15);
            }
        }

        private boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (F(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f35255a == null) {
                this.f35255a = new Rect();
            }
            Rect rect = this.f35255a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.l(this.f35256b, false);
                return true;
            }
            floatingActionButton.r(this.f35256b, false);
            return true;
        }

        private boolean L(View view, FloatingActionButton floatingActionButton) {
            if (F(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.l(this.f35256b, false);
                return true;
            }
            floatingActionButton.r(this.f35256b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f35251m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!G(view)) {
                return false;
            }
            L(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i15) {
            List<View> listR = coordinatorLayout.r(floatingActionButton);
            int size = listR.size();
            for (int i16 = 0; i16 < size; i16++) {
                View view = listR.get(i16);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && L(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(floatingActionButton, i15);
            H(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f11790h == 0) {
                fVar.f11790h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ri.l.f174247t1);
            this.f35257c = typedArrayObtainStyledAttributes.getBoolean(ri.l.f174255u1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f35245f != colorStateList) {
            this.f35245f = colorStateList;
            getImpl().Q(this.f35245f);
        }
    }
}
