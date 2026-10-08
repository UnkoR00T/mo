package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.android.core.c2;
import j6.d0;
import j6.l0;
import j6.s;
import j6.t;
import j6.u;
import j6.w;
import j6.x;
import java.util.ArrayList;
import k6.p;
import k6.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements w, t, ScrollingView {
    private static final float H = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a I = new a();
    private static final int[] K = {R.attr.fillViewport};
    private f A;
    private final x B;
    private final u C;
    private float D;
    private e E;
    final d F;
    j6.h G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f11844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f11845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f11846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OverScroller f11847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f11848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f11849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    d0 f11850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11851h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11852j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f11853k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f11854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f11855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private VelocityTracker f11856n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f11857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f11858q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f11859r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f11860s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f11861t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f11862v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int[] f11863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int[] f11864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f11865y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f11866z;

    static class a extends j6.a {
        a() {
        }

        @Override // j6.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            r.a(accessibilityEvent, nestedScrollView.getScrollX());
            r.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // j6.a
        public void g(View view, p pVar) {
            int scrollRange;
            super.g(view, pVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            pVar.o0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            pVar.Q0(true);
            if (nestedScrollView.getScrollY() > 0) {
                pVar.b(p.a.f108674r);
                pVar.b(p.a.C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                pVar.b(p.a.f108673q);
                pVar.b(p.a.E);
            }
        }

        @Override // j6.a
        public boolean j(View view, int i15, Bundle bundle) {
            if (super.j(view, i15, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i15 != 4096) {
                if (i15 == 8192 || i15 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.X(0, iMax, true);
                    return true;
                }
                if (i15 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.X(0, iMin, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    private static final class c {
        public static void a(View view, float f15) {
            try {
                view.setFrameContentVelocity(f15);
            } catch (LinkageError unused) {
            }
        }
    }

    class d implements j6.i {
        d() {
        }

        @Override // j6.i
        public boolean a(float f15) {
            if (f15 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f15);
            return true;
        }

        @Override // j6.i
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // j6.i
        public void c() {
            NestedScrollView.this.f11847d.abortAnimation();
        }
    }

    public interface e {
        void a(NestedScrollView nestedScrollView, int i15, int i16, int i17, int i18);
    }

    static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11868a;

        class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i15) {
                return new f[i15];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f11868a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeInt(this.f11868a);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f11868a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r5.a.f171796c);
    }

    private void A() {
        VelocityTracker velocityTracker = this.f11856n;
        if (velocityTracker == null) {
            this.f11856n = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void B() {
        this.f11847d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f11859r = viewConfiguration.getScaledTouchSlop();
        this.f11860s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f11861t = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void C() {
        if (this.f11856n == null) {
            this.f11856n = VelocityTracker.obtain();
        }
    }

    private void D(int i15, int i16) {
        this.f11851h = i15;
        this.f11862v = i16;
        Y(2, 0);
    }

    private boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    private static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    private boolean G(View view, int i15, int i16) {
        view.getDrawingRect(this.f11846c);
        offsetDescendantRectToMyCoords(view, this.f11846c);
        return this.f11846c.bottom + i15 >= getScrollY() && this.f11846c.top - i15 <= getScrollY() + i16;
    }

    private void H(int i15, int i16, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i15);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.C.e(0, scrollY2, 0, i15 - scrollY2, null, i16, iArr);
    }

    private void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f11862v) {
            int i15 = actionIndex == 0 ? 1 : 0;
            this.f11851h = (int) motionEvent.getY(i15);
            this.f11862v = motionEvent.getPointerId(i15);
            VelocityTracker velocityTracker = this.f11856n;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void L() {
        VelocityTracker velocityTracker = this.f11856n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f11856n = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    private int M(int i15, float f15) {
        float fD;
        int iRound;
        float width = f15 / getWidth();
        float height = i15 / getHeight();
        float f16 = 0.0f;
        if (androidx.core.widget.d.b(this.f11848e) == 0.0f) {
            if (androidx.core.widget.d.b(this.f11849f) != 0.0f) {
                fD = androidx.core.widget.d.d(this.f11849f, height, 1.0f - width);
                if (androidx.core.widget.d.b(this.f11849f) == 0.0f) {
                    this.f11849f.onRelease();
                }
            }
            iRound = Math.round(f16 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fD = -androidx.core.widget.d.d(this.f11848e, -height, width);
        if (androidx.core.widget.d.b(this.f11848e) == 0.0f) {
            this.f11848e.onRelease();
        }
        f16 = fD;
        iRound = Math.round(f16 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private void N(boolean z15) {
        if (z15) {
            Y(2, 1);
        } else {
            a0(1);
        }
        this.f11866z = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean O(int i15, int i16, int i17) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i18 = height + scrollY;
        boolean z15 = false;
        boolean z16 = i15 == 33;
        View viewU = u(z16, i16, i17);
        if (viewU == null) {
            viewU = this;
        }
        if (i16 < scrollY || i17 > i18) {
            P(z16 ? i16 - scrollY : i17 - i18, 0, 1, true);
            z15 = true;
        }
        if (viewU != findFocus()) {
            viewU.requestFocus(i15);
        }
        return z15;
    }

    private int P(int i15, int i16, int i17, boolean z15) {
        return Q(i15, -1, null, i16, i17, z15);
    }

    private void R(View view) {
        view.getDrawingRect(this.f11846c);
        offsetDescendantRectToMyCoords(view, this.f11846c);
        int iH = h(this.f11846c);
        if (iH != 0) {
            scrollBy(0, iH);
        }
    }

    private boolean S(Rect rect, boolean z15) {
        int iH = h(rect);
        boolean z16 = iH != 0;
        if (z16) {
            if (z15) {
                scrollBy(0, iH);
                return z16;
            }
            U(0, iH);
        }
        return z16;
    }

    private boolean T(EdgeEffect edgeEffect, int i15) {
        if (i15 > 0) {
            return true;
        }
        return x(-i15) < androidx.core.widget.d.b(edgeEffect) * ((float) getHeight());
    }

    private void V(int i15, int i16, int i17, boolean z15) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f11845b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f11847d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i16 + scrollY, Math.max(0, height - height2))) - scrollY, i17);
            N(z15);
        } else {
            if (!this.f11847d.isFinished()) {
                a();
            }
            scrollBy(i15, i16);
        }
        this.f11845b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean Z(MotionEvent motionEvent) {
        boolean z15;
        if (androidx.core.widget.d.b(this.f11848e) != 0.0f) {
            androidx.core.widget.d.d(this.f11848e, 0.0f, motionEvent.getX() / getWidth());
            z15 = true;
        } else {
            z15 = false;
        }
        if (androidx.core.widget.d.b(this.f11849f) == 0.0f) {
            return z15;
        }
        androidx.core.widget.d.d(this.f11849f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f11847d.abortAnimation();
        a0(1);
    }

    private boolean e() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    private boolean f() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    private static int g(int i15, int i16, int i17) {
        if (i16 >= i17 || i15 < 0) {
            return 0;
        }
        return i16 + i15 > i17 ? i17 - i16 : i15;
    }

    private d0 getScrollFeedbackProvider() {
        if (this.f11850g == null) {
            this.f11850g = d0.a(this);
        }
        return this.f11850g;
    }

    private void q(int i15) {
        if (i15 != 0) {
            if (this.f11858q) {
                U(0, i15);
            } else {
                scrollBy(0, i15);
            }
        }
    }

    private boolean r(int i15) {
        if (androidx.core.widget.d.b(this.f11848e) != 0.0f) {
            if (T(this.f11848e, i15)) {
                this.f11848e.onAbsorb(i15);
                return true;
            }
            v(-i15);
            return true;
        }
        if (androidx.core.widget.d.b(this.f11849f) == 0.0f) {
            return false;
        }
        int i16 = -i15;
        if (T(this.f11849f, i16)) {
            this.f11849f.onAbsorb(i16);
            return true;
        }
        v(i16);
        return true;
    }

    private void s() {
        this.f11862v = -1;
        this.f11855m = false;
        L();
        a0(0);
        this.f11848e.onRelease();
        this.f11849f.onRelease();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    private View u(boolean z15, int i15, int i16) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z16 = false;
        for (int i17 = 0; i17 < size; i17++) {
            View view2 = focusables.get(i17);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i15 < bottom && top < i16) {
                boolean z17 = i15 < top && bottom < i16;
                if (view == null) {
                    view = view2;
                    z16 = z17;
                } else {
                    boolean z18 = (z15 && top < view.getTop()) || (!z15 && bottom > view.getBottom());
                    if (z16) {
                        if (z17 && z18) {
                            view = view2;
                        }
                    } else if (z17) {
                        view = view2;
                        z16 = true;
                    } else if (z18) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float x(int i15) {
        double dLog = Math.log((Math.abs(i15) * 0.35f) / (this.f11844a * 0.015f));
        float f15 = H;
        return (float) (((double) (this.f11844a * 0.015f)) * Math.exp((((double) f15) / (((double) f15) - 1.0d)) * dLog));
    }

    private boolean z(int i15, int i16) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i16 >= childAt.getTop() - scrollY && i16 < childAt.getBottom() - scrollY && i15 >= childAt.getLeft() && i15 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    boolean J(int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, boolean z15) {
        boolean z16;
        boolean z17;
        int i28;
        int overScrollMode = getOverScrollMode();
        boolean z18 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z19 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z25 = overScrollMode == 0 || (overScrollMode == 1 && z18);
        boolean z26 = overScrollMode == 0 || (overScrollMode == 1 && z19);
        int i29 = i17 + i15;
        int i35 = !z25 ? 0 : i26;
        int i36 = i18 + i16;
        int i37 = !z26 ? 0 : i27;
        int i38 = -i35;
        int i39 = i35 + i19;
        int i45 = -i37;
        int i46 = i37 + i25;
        if (i29 > i39) {
            i29 = i39;
            z16 = true;
        } else if (i29 < i38) {
            z16 = true;
            i29 = i38;
        } else {
            z16 = false;
        }
        if (i36 > i46) {
            i36 = i46;
            z17 = true;
        } else if (i36 < i45) {
            z17 = true;
            i36 = i45;
        } else {
            z17 = false;
        }
        if (!z17 || y(1)) {
            i28 = i29;
        } else {
            int i47 = i29;
            this.f11847d.springBack(i47, i36, 0, 0, 0, getScrollRange());
            i28 = i47;
        }
        onOverScrolled(i28, i36, z16, z17);
        return z16 || z17;
    }

    public boolean K(int i15) {
        boolean z15 = i15 == 130;
        int height = getHeight();
        if (z15) {
            this.f11846c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f11846c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f11846c.top = getScrollY() - height;
            Rect rect2 = this.f11846c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f11846c;
        int i16 = rect3.top;
        int i17 = height + i16;
        rect3.bottom = i17;
        return O(i15, i16, i17);
    }

    int Q(int i15, int i16, MotionEvent motionEvent, int i17, int i18, boolean z15) {
        int i19;
        int i25;
        VelocityTracker velocityTracker;
        if (i18 == 1) {
            Y(2, i18);
        }
        boolean z16 = false;
        if (l(0, i15, this.f11864x, this.f11863w, i18)) {
            int i26 = i15 - this.f11864x[1];
            i25 = this.f11863w[1];
            i19 = i26;
        } else {
            i19 = i15;
            i25 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z17 = e() && !z15;
        int i27 = i19;
        boolean z18 = J(0, i19, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i18);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().c(motionEvent.getDeviceId(), motionEvent.getSource(), i16, scrollY2);
        }
        int[] iArr = this.f11864x;
        iArr[1] = 0;
        o(0, scrollY2, 0, i27 - scrollY2, this.f11863w, i18, iArr);
        int i28 = i25 + this.f11863w[1];
        int i29 = i27 - this.f11864x[1];
        int i35 = scrollY + i29;
        if (i35 < 0) {
            if (z17) {
                androidx.core.widget.d.d(this.f11848e, (-i29) / getHeight(), i17 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().b(motionEvent.getDeviceId(), motionEvent.getSource(), i16, true);
                }
                if (!this.f11849f.isFinished()) {
                    this.f11849f.onRelease();
                }
            }
        } else if (i35 > scrollRange && z17) {
            androidx.core.widget.d.d(this.f11849f, i29 / getHeight(), 1.0f - (i17 / getWidth()));
            if (motionEvent != null) {
                getScrollFeedbackProvider().b(motionEvent.getDeviceId(), motionEvent.getSource(), i16, false);
            }
            if (!this.f11848e.isFinished()) {
                this.f11848e.onRelease();
            }
        }
        if (this.f11848e.isFinished() && this.f11849f.isFinished()) {
            z16 = z18;
        } else {
            postInvalidateOnAnimation();
        }
        if (z16 && i18 == 0 && (velocityTracker = this.f11856n) != null) {
            velocityTracker.clear();
        }
        if (i18 == 1) {
            a0(i18);
            this.f11848e.onRelease();
            this.f11849f.onRelease();
        }
        return i28;
    }

    public final void U(int i15, int i16) {
        V(i15, i16, 250, false);
    }

    void W(int i15, int i16, int i17, boolean z15) {
        V(i15 - getScrollX(), i16 - getScrollY(), i17, z15);
    }

    void X(int i15, int i16, boolean z15) {
        W(i15, i16, 250, z15);
    }

    public boolean Y(int i15, int i16) {
        return this.C.p(i15, i16);
    }

    public void a0(int i15) {
        this.C.r(i15);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // j6.v
    public void c(View view, View view2, int i15, int i16) {
        this.B.c(view, view2, i15, i16);
        Y(2, i16);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f11847d.isFinished()) {
            return;
        }
        this.f11847d.computeScrollOffset();
        int currY = this.f11847d.getCurrY();
        int i15 = i(currY - this.f11866z);
        this.f11866z = currY;
        int[] iArr = this.f11864x;
        iArr[1] = 0;
        l(0, i15, iArr, null, 1);
        int i16 = i15 - this.f11864x[1];
        int scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            c.a(this, Math.abs(this.f11847d.getCurrVelocity()));
        }
        if (i16 != 0) {
            int scrollY = getScrollY();
            J(0, i16, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i17 = i16 - scrollY2;
            int[] iArr2 = this.f11864x;
            iArr2[1] = 0;
            o(0, scrollY2, 0, i17, this.f11863w, 1, iArr2);
            i16 = i17 - this.f11864x[1];
        }
        if (i16 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i16 < 0) {
                    if (this.f11848e.isFinished()) {
                        this.f11848e.onAbsorb((int) this.f11847d.getCurrVelocity());
                    }
                } else if (this.f11849f.isFinished()) {
                    this.f11849f.onAbsorb((int) this.f11847d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f11847d.isFinished()) {
            a0(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    public boolean d(int i15) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i15);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i15 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i15 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i15 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f11846c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f11846c);
            P(h(this.f11846c), 0, 1, true);
            viewFindNextFocus.requestFocus(i15);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && E(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(PKIFailureInfo.unsupportedVersion);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f15, float f16, boolean z15) {
        return this.C.a(f15, f16, z15);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f15, float f16) {
        return this.C.b(f15, f16);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i15, int i16, int[] iArr, int[] iArr2) {
        return l(i15, i16, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i15, int i16, int i17, int i18, int[] iArr) {
        return this.C.f(i15, i16, i17, i18, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f11848e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f11848e.setSize(width, height);
            if (this.f11848e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f11849f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f11849f.setSize(width2, height2);
        if (this.f11849f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    float getVerticalScrollFactorCompat() {
        if (this.D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.D = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.D;
    }

    protected int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i15 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i16 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i15 - verticalFadingEdgeLength : i15;
        int i17 = rect.bottom;
        if (i17 > i16 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i16, (childAt.getBottom() + layoutParams.bottomMargin) - i15);
        }
        if (rect.top >= scrollY || i17 >= i16) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i16 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    int i(int i15) {
        int height = getHeight();
        if (i15 > 0 && androidx.core.widget.d.b(this.f11848e) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * androidx.core.widget.d.d(this.f11848e, ((-i15) * 4.0f) / height, 0.5f));
            if (iRound != i15) {
                this.f11848e.finish();
            }
            return i15 - iRound;
        }
        if (i15 >= 0 || androidx.core.widget.d.b(this.f11849f) == 0.0f) {
            return i15;
        }
        float f15 = height;
        int iRound2 = Math.round((f15 / 4.0f) * androidx.core.widget.d.d(this.f11849f, (i15 * 4.0f) / f15, 0.5f));
        if (iRound2 != i15) {
            this.f11849f.finish();
        }
        return i15 - iRound2;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.C.l();
    }

    @Override // j6.v
    public void j(View view, int i15) {
        this.B.d(view, i15);
        a0(i15);
    }

    @Override // j6.v
    public void k(View view, int i15, int i16, int[] iArr, int i17) {
        l(i15, i16, iArr, null, i17);
    }

    public boolean l(int i15, int i16, int[] iArr, int[] iArr2, int i17) {
        return this.C.d(i15, i16, iArr, iArr2, i17);
    }

    @Override // j6.w
    public void m(View view, int i15, int i16, int i17, int i18, int i19, int[] iArr) {
        H(i18, i19, iArr);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i15, int i16) {
        view.measure(ViewGroup.getChildMeasureSpec(i15, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i15, int i16, int i17, int i18) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i15, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i16, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // j6.v
    public void n(View view, int i15, int i16, int i17, int i18, int i19) {
        H(i18, i19, null);
    }

    public void o(int i15, int i16, int i17, int i18, int[] iArr, int i19, int[] iArr2) {
        this.C.e(i15, i16, i17, i18, iArr, i19, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11853k = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i15;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f11855m) {
            if (s.a(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i15 = 9;
                width = (int) motionEvent.getX();
            } else if (s.a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i15 = 26;
                axisValue = axisValue2;
            } else {
                i15 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                Q(-((int) (axisValue * getVerticalScrollFactorCompat())), i15, motionEvent, width, 1, s.a(motionEvent, 8194));
                if (i15 == 0) {
                    return true;
                }
                this.G.g(motionEvent, i15);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z15 = true;
        if (action == 2 && this.f11855m) {
            return true;
        }
        int i15 = action & GF2Field.MASK;
        if (i15 == 0) {
            int y15 = (int) motionEvent.getY();
            if (z((int) motionEvent.getX(), y15)) {
                this.f11851h = y15;
                this.f11862v = motionEvent.getPointerId(0);
                A();
                this.f11856n.addMovement(motionEvent);
                this.f11847d.computeScrollOffset();
                if (!Z(motionEvent) && this.f11847d.isFinished()) {
                    z15 = false;
                }
                this.f11855m = z15;
                Y(2, 0);
            } else {
                if (!Z(motionEvent) && this.f11847d.isFinished()) {
                    z15 = false;
                }
                this.f11855m = z15;
                L();
            }
        } else if (i15 == 1) {
            this.f11855m = false;
            this.f11862v = -1;
            L();
            if (this.f11847d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            a0(0);
        } else if (i15 == 2) {
            int i16 = this.f11862v;
            if (i16 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i16);
                if (iFindPointerIndex == -1) {
                    c2.e("NestedScrollView", "Invalid pointerId=" + i16 + " in onInterceptTouchEvent");
                } else {
                    int y16 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y16 - this.f11851h) > this.f11859r && (2 & getNestedScrollAxes()) == 0) {
                        this.f11855m = true;
                        this.f11851h = y16;
                        C();
                        this.f11856n.addMovement(motionEvent);
                        this.f11865y = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i15 == 3) {
            this.f11855m = false;
            this.f11862v = -1;
            L();
            if (this.f11847d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            a0(0);
        } else if (i15 == 6) {
            I(motionEvent);
        }
        return this.f11855m;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        super.onLayout(z15, i15, i16, i17, i18);
        int measuredHeight = 0;
        this.f11852j = false;
        View view = this.f11854l;
        if (view != null && F(view, this)) {
            R(this.f11854l);
        }
        this.f11854l = null;
        if (!this.f11853k) {
            if (this.A != null) {
                scrollTo(getScrollX(), this.A.f11868a);
                this.A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i18 - i16) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iG = g(scrollY, paddingTop, measuredHeight);
            if (iG != scrollY) {
                scrollTo(getScrollX(), iG);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f11853k = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        super.onMeasure(i15, i16);
        if (this.f11857p && View.MeasureSpec.getMode(i16) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i15, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f15, float f16, boolean z15) {
        if (z15) {
            return false;
        }
        dispatchNestedFling(0.0f, f16, true);
        v((int) f16);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f15, float f16) {
        return dispatchNestedPreFling(f15, f16);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i15, int i16, int[] iArr) {
        k(view, i15, i16, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i15, int i16, int i17, int i18) {
        H(i18, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i15) {
        c(view, view2, i15, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i15, int i16, boolean z15, boolean z16) {
        super.scrollTo(i15, i16);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i15, Rect rect) {
        if (i15 == 2) {
            i15 = 130;
        } else if (i15 == 1) {
            i15 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i15) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i15);
        if (viewFindNextFocus == null || E(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i15, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.A = fVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f11868a = getScrollY();
        return fVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i15, int i16, int i17, int i18) {
        super.onScrollChanged(i15, i16, i17, i18);
        e eVar = this.E;
        if (eVar != null) {
            eVar.a(this, i15, i16, i17, i18);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i15, int i16, int i17, int i18) {
        super.onSizeChanged(i15, i16, i17, i18);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !G(viewFindFocus, 0, i18)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f11846c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f11846c);
        q(h(this.f11846c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i15) {
        return p(view, view2, i15, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView;
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f11865y = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f11865y);
        if (actionMasked == 0) {
            nestedScrollView = this;
            if (getChildCount() == 0) {
                return false;
            }
            if (nestedScrollView.f11855m && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!nestedScrollView.f11847d.isFinished()) {
                a();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        } else if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f11862v);
                if (iFindPointerIndex == -1) {
                    c2.e("NestedScrollView", "Invalid pointerId=" + this.f11862v + " in onTouchEvent");
                } else {
                    int y15 = (int) motionEvent.getY(iFindPointerIndex);
                    int i15 = this.f11851h - y15;
                    int iM = i15 - M(i15, motionEvent.getX(iFindPointerIndex));
                    if (!this.f11855m && Math.abs(iM) > this.f11859r) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f11855m = true;
                        iM = iM > 0 ? iM - this.f11859r : iM + this.f11859r;
                    }
                    int i16 = iM;
                    if (this.f11855m) {
                        nestedScrollView = this;
                        int iQ = nestedScrollView.Q(i16, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        nestedScrollView.f11851h = y15 - iQ;
                        nestedScrollView.f11865y += iQ;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f11855m && getChildCount() > 0 && this.f11847d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f11851h = (int) motionEvent.getY(actionIndex);
                this.f11862v = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.f11851h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f11862v));
            }
            nestedScrollView = this;
        } else {
            nestedScrollView = this;
            VelocityTracker velocityTracker = nestedScrollView.f11856n;
            velocityTracker.computeCurrentVelocity(1000, nestedScrollView.f11861t);
            int yVelocity = (int) velocityTracker.getYVelocity(nestedScrollView.f11862v);
            if (Math.abs(yVelocity) >= nestedScrollView.f11860s) {
                if (!r(yVelocity)) {
                    int i17 = -yVelocity;
                    float f15 = i17;
                    if (!dispatchNestedPreFling(0.0f, f15)) {
                        dispatchNestedFling(0.0f, f15, true);
                        v(i17);
                    }
                }
            } else if (nestedScrollView.f11847d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            s();
        }
        VelocityTracker velocityTracker2 = nestedScrollView.f11856n;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // j6.v
    public boolean p(View view, View view2, int i15, int i16) {
        return (i15 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f11852j) {
            this.f11854l = view2;
        } else {
            R(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z15) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return S(rect, z15);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z15) {
        if (z15) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z15);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f11852j = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i15, int i16) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iG = g(i15, width, width2);
            int iG2 = g(i16, height, height2);
            if (iG == getScrollX() && iG2 == getScrollY()) {
                return;
            }
            super.scrollTo(iG, iG2);
        }
    }

    public void setFillViewport(boolean z15) {
        if (z15 != this.f11857p) {
            this.f11857p = z15;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z15) {
        this.C.m(z15);
    }

    public void setOnScrollChangeListener(e eVar) {
        this.E = eVar;
    }

    public void setSmoothScrollingEnabled(boolean z15) {
        this.f11858q = z15;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i15) {
        return Y(i15, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        a0(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.f11846c.setEmpty();
        if (!f()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? w(33) : d(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? w(130) : d(130);
            }
            if (keyCode == 62) {
                K(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return w(33);
            }
            if (keyCode == 93) {
                return w(130);
            }
            if (keyCode == 122) {
                K(33);
                return false;
            }
            if (keyCode == 123) {
                K(130);
                return false;
            }
        }
        return false;
    }

    public void v(int i15) {
        if (getChildCount() > 0) {
            this.f11847d.fling(getScrollX(), getScrollY(), 0, i15, 0, 0, PKIFailureInfo.systemUnavail, Integer.MAX_VALUE, 0, 0);
            N(true);
            if (Build.VERSION.SDK_INT >= 35) {
                c.a(this, Math.abs(this.f11847d.getCurrVelocity()));
            }
        }
    }

    public boolean w(int i15) {
        int childCount;
        boolean z15 = i15 == 130;
        int height = getHeight();
        Rect rect = this.f11846c;
        rect.top = 0;
        rect.bottom = height;
        if (z15 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f11846c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f11846c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f11846c;
        return O(i15, rect3.top, rect3.bottom);
    }

    public boolean y(int i15) {
        return this.C.k(i15);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.f11846c = new Rect();
        this.f11852j = true;
        this.f11853k = false;
        this.f11854l = null;
        this.f11855m = false;
        this.f11858q = true;
        this.f11862v = -1;
        this.f11863w = new int[2];
        this.f11864x = new int[2];
        d dVar = new d();
        this.F = dVar;
        this.G = new j6.h(getContext(), dVar);
        this.f11848e = androidx.core.widget.d.a(context, attributeSet);
        this.f11849f = androidx.core.widget.d.a(context, attributeSet);
        this.f11844a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K, i15, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.B = new x(this);
        this.C = new u(this);
        setNestedScrollingEnabled(true);
        l0.h0(this, I);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i15) {
        if (getChildCount() <= 0) {
            super.addView(view, i15);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i15, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i15, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
