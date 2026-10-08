package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import ri.k;
import ri.l;
import si.h;

/* JADX INFO: loaded from: classes4.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private boolean R;
    private final int T;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f35230h0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f35231q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> f35232r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f35233s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f35234t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f35235u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    protected ColorStateList f35236v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final int f35226w0 = k.f174089w;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    static final Property<View, Float> f35227x0 = new a(Float.class, "width");

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    static final Property<View, Float> f35228y0 = new b(Float.class, "height");

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    static final Property<View, Float> f35229z0 = new c(Float.class, "paddingStart");
    static final Property<View, Float> A0 = new d(Float.class, "paddingEnd");

    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f15) {
            view.getLayoutParams().width = f15.intValue();
            view.requestLayout();
        }
    }

    class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f15) {
            view.getLayoutParams().height = f15.intValue();
            view.requestLayout();
        }
    }

    class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f15) {
            view.setPaddingRelative(f15.intValue(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f15) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f15.intValue(), view.getPaddingBottom());
        }
    }

    public static abstract class e {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(int i15, e eVar) {
        if (i15 == 0 || i15 == 1 || i15 == 2 || i15 == 3) {
            throw null;
        }
        throw new IllegalStateException("Unknown strategy type: " + i15);
    }

    private void v() {
        this.f35236v0 = getTextColors();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.f35232r0;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i15 = this.T;
        return i15 < 0 ? (Math.min(getPaddingStart(), getPaddingEnd()) * 2) + getIconSize() : i15;
    }

    public h getExtendMotionSpec() {
        throw null;
    }

    public h getHideMotionSpec() {
        throw null;
    }

    public h getShowMotionSpec() {
        throw null;
    }

    public h getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35233s0 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f35233s0 = false;
            throw null;
        }
    }

    public void setAnimateShowBeforeLayout(boolean z15) {
        this.f35235u0 = z15;
    }

    public void setAnimationEnabled(boolean z15) {
        this.R = z15;
    }

    public void setExtendMotionSpec(h hVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i15) {
        setExtendMotionSpec(h.c(getContext(), i15));
    }

    public void setExtended(boolean z15) {
        if (this.f35233s0 != z15) {
            throw null;
        }
    }

    public void setHideMotionSpec(h hVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i15) {
        setHideMotionSpec(h.c(getContext(), i15));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i15, int i16, int i17, int i18) {
        super.setPadding(i15, i16, i17, i18);
        if (!this.f35233s0 || this.f35234t0) {
            return;
        }
        this.f35230h0 = getPaddingStart();
        this.f35231q0 = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i15, int i16, int i17, int i18) {
        super.setPaddingRelative(i15, i16, i17, i18);
        if (!this.f35233s0 || this.f35234t0) {
            return;
        }
        this.f35230h0 = i15;
        this.f35231q0 = i17;
    }

    public void setShowMotionSpec(h hVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i15) {
        setShowMotionSpec(h.c(getContext(), i15));
    }

    public void setShrinkMotionSpec(h hVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i15) {
        setShrinkMotionSpec(h.c(getContext(), i15));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i15) {
        super.setTextColor(i15);
        v();
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rect f35237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f35238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f35239c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f35238b = false;
            this.f35239c = true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f35238b || this.f35239c) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f35237a == null) {
                this.f35237a = new Rect();
            }
            Rect rect = this.f35237a;
            com.google.android.material.internal.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        private boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                K(extendedFloatingActionButton);
                return true;
            }
            E(extendedFloatingActionButton);
            return true;
        }

        protected void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.u(this.f35239c ? 3 : 0, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!G(view)) {
                return false;
            }
            M(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i15) {
            List<View> listR = coordinatorLayout.r(extendedFloatingActionButton);
            int size = listR.size();
            for (int i16 = 0; i16 < size; i16++) {
                View view = listR.get(i16);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i15);
            return true;
        }

        protected void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.u(this.f35239c ? 2 : 1, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f11790h == 0) {
                fVar.f11790h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f174215p1);
            this.f35238b = typedArrayObtainStyledAttributes.getBoolean(l.f174223q1, false);
            this.f35239c = typedArrayObtainStyledAttributes.getBoolean(l.f174231r1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        v();
    }
}
