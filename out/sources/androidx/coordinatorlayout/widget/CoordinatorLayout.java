package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import io.sentry.android.core.c2;
import j6.f1;
import j6.k;
import j6.l0;
import j6.v;
import j6.w;
import j6.x;
import j6.y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements v, w {
    static final Comparator<View> A;
    private static final i6.f<Rect> B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final String f11758x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final Class<?>[] f11759y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<c>>> f11760z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<View> f11761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a<View> f11762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<View> f11763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<View> f11764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f11765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f11766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f11767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11768h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f11770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f11771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f11772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g f11773n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f11774p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private f1 f11775q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f11776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Drawable f11777s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f11778t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private y f11779v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final x f11780w;

    class a implements y {
        a() {
        }

        @Override // j6.y
        public f1 b(View view, f1 f1Var) {
            return CoordinatorLayout.this.W(f1Var);
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v15, View view, View view2, int i15, int i16) {
            if (i16 == 0) {
                return z(coordinatorLayout, v15, view, view2, i15);
            }
            return false;
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v15, View view) {
        }

        public void C(CoordinatorLayout coordinatorLayout, V v15, View view, int i15) {
            if (i15 == 0) {
                B(coordinatorLayout, v15, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v15, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v15) {
            return d(coordinatorLayout, v15) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v15, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v15) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v15) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v15, View view) {
            return false;
        }

        public f1 f(CoordinatorLayout coordinatorLayout, V v15, f1 f1Var) {
            return f1Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v15, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v15, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v15, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v15, int i15) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v15, int i15, int i16, int i17, int i18) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v15, View view, float f15, float f16, boolean z15) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v15, View view, float f15, float f16) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v15, View view, int i15, int i16, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v15, View view, int i15, int i16, int[] iArr, int i17) {
            if (i17 == 0) {
                p(coordinatorLayout, v15, view, i15, i16, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v15, View view, int i15, int i16, int i17, int i18) {
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v15, View view, int i15, int i16, int i17, int i18, int i19) {
            if (i19 == 0) {
                r(coordinatorLayout, v15, view, i15, i16, i17, i18);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v15, View view, int i15, int i16, int i17, int i18, int i19, int[] iArr) {
            iArr[0] = iArr[0] + i17;
            iArr[1] = iArr[1] + i18;
            s(coordinatorLayout, v15, view, i15, i16, i17, i18, i19);
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v15, View view, View view2, int i15) {
        }

        public void v(CoordinatorLayout coordinatorLayout, V v15, View view, View view2, int i15, int i16) {
            if (i16 == 0) {
                u(coordinatorLayout, v15, view, view2, i15);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v15, Rect rect, boolean z15) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, V v15, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v15) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v15, View view, View view2, int i15) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f11778t;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f11778t;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fI = l0.I(view);
            float fI2 = l0.I(view2);
            if (fI > fI2) {
                return -1;
            }
            return fI < fI2 ? 1 : 0;
        }
    }

    static {
        Package r15 = CoordinatorLayout.class.getPackage();
        f11758x = r15 != null ? r15.getName() : null;
        A = new i();
        f11759y = new Class[]{Context.class, AttributeSet.class};
        f11760z = new ThreadLocal<>();
        B = new i6.h(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q5.a.f164759a);
    }

    private boolean A(View view) {
        return this.f11762b.j(view);
    }

    private void C(View view, int i15) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f11775q != null && l0.v(this) && !l0.v(view)) {
            rectA.left += this.f11775q.j();
            rectA.top += this.f11775q.l();
            rectA.right -= this.f11775q.k();
            rectA.bottom -= this.f11775q.i();
        }
        Rect rectA2 = a();
        k.a(S(fVar.f11785c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i15);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        O(rectA);
        O(rectA2);
    }

    private void D(View view, View view2, int i15) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            t(view2, rectA);
            u(view, i15, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            O(rectA);
            O(rectA2);
        }
    }

    private void E(View view, int i15, int i16) {
        int i17;
        f fVar = (f) view.getLayoutParams();
        int iB = k.b(T(fVar.f11785c), i16);
        int i18 = iB & 7;
        int i19 = iB & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i16 == 1) {
            i15 = width - i15;
        }
        int iW = w(i15) - measuredWidth;
        if (i18 == 1) {
            iW += measuredWidth / 2;
        } else if (i18 == 5) {
            iW += measuredWidth;
        }
        if (i19 != 16) {
            i17 = i19 != 80 ? 0 : measuredHeight;
        } else {
            i17 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iW, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i17, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void F(View view, Rect rect, int i15) {
        boolean z15;
        boolean z16;
        int width;
        int i16;
        int i17;
        int i18;
        int height;
        int i19;
        int i25;
        int i26;
        if (l0.N(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF == null || !cVarF.b(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            O(rectA2);
            if (rectA.isEmpty()) {
                O(rectA);
                return;
            }
            int iB = k.b(fVar.f11790h, i15);
            boolean z17 = true;
            if ((iB & 48) != 48 || (i25 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f11792j) >= (i26 = rect.top)) {
                z15 = false;
            } else {
                V(view, i26 - i25);
                z15 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f11792j) < (i19 = rect.bottom)) {
                V(view, height - i19);
                z15 = true;
            }
            if (!z15) {
                V(view, 0);
            }
            if ((iB & 3) != 3 || (i17 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f11791i) >= (i18 = rect.left)) {
                z16 = false;
            } else {
                U(view, i18 - i17);
                z16 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f11791i) >= (i16 = rect.right)) {
                z17 = z16;
            } else {
                U(view, width - i16);
            }
            if (!z17) {
                U(view, 0);
            }
            O(rectA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f11758x;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f11760z;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f11759y);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e15) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e15);
        }
    }

    private boolean L(MotionEvent motionEvent, int i15) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f11763c;
        z(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zK = false;
        boolean z15 = false;
        for (int i16 = 0; i16 < size; i16++) {
            View view = list.get(i16);
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            if (!(zK || z15) || actionMasked == 0) {
                if (!zK && cVarF != null) {
                    if (i15 == 0) {
                        zK = cVarF.k(this, view, motionEvent);
                    } else if (i15 == 1) {
                        zK = cVarF.D(this, view, motionEvent);
                    }
                    if (zK) {
                        this.f11771l = view;
                    }
                }
                boolean zC = fVar.c();
                boolean zI = fVar.i(this, view);
                z15 = zI && !zC;
                if (zI && !z15) {
                    break;
                }
            } else if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i15 == 0) {
                    cVarF.k(this, view, motionEventObtain);
                } else if (i15 == 1) {
                    cVarF.D(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zK;
    }

    private void M() {
        this.f11761a.clear();
        this.f11762b.c();
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            f fVarY = y(childAt);
            fVarY.d(this, childAt);
            this.f11762b.b(childAt);
            for (int i16 = 0; i16 < childCount; i16++) {
                if (i16 != i15) {
                    View childAt2 = getChildAt(i16);
                    if (fVarY.b(this, childAt, childAt2)) {
                        if (!this.f11762b.d(childAt2)) {
                            this.f11762b.b(childAt2);
                        }
                        this.f11762b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f11761a.addAll(this.f11762b.i());
        Collections.reverse(this.f11761a);
    }

    private static void O(Rect rect) {
        rect.setEmpty();
        B.A(rect);
    }

    private void Q(boolean z15) {
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z15) {
                    cVarF.k(this, childAt, motionEventObtain);
                } else {
                    cVarF.D(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            ((f) getChildAt(i16).getLayoutParams()).m();
        }
        this.f11771l = null;
        this.f11768h = false;
    }

    private static int R(int i15) {
        if (i15 == 0) {
            return 17;
        }
        return i15;
    }

    private static int S(int i15) {
        if ((i15 & 7) == 0) {
            i15 |= 8388611;
        }
        return (i15 & 112) == 0 ? i15 | 48 : i15;
    }

    private static int T(int i15) {
        if (i15 == 0) {
            return 8388661;
        }
        return i15;
    }

    private void U(View view, int i15) {
        f fVar = (f) view.getLayoutParams();
        int i16 = fVar.f11791i;
        if (i16 != i15) {
            l0.Q(view, i15 - i16);
            fVar.f11791i = i15;
        }
    }

    private void V(View view, int i15) {
        f fVar = (f) view.getLayoutParams();
        int i16 = fVar.f11792j;
        if (i16 != i15) {
            l0.R(view, i15 - i16);
            fVar.f11792j = i15;
        }
    }

    private void X() {
        if (!l0.v(this)) {
            l0.q0(this, null);
            return;
        }
        if (this.f11779v == null) {
            this.f11779v = new a();
        }
        l0.q0(this, this.f11779v);
        setSystemUiVisibility(1280);
    }

    private static Rect a() {
        Rect rectZ = B.z();
        return rectZ == null ? new Rect() : rectZ;
    }

    private static int d(int i15, int i16, int i17) {
        if (i15 < i16) {
            return i16;
        }
        return i15 > i17 ? i17 : i15;
    }

    private void e(f fVar, Rect rect, int i15, int i16) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i15) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i16) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i15 + iMax, i16 + iMax2);
    }

    private f1 f(f1 f1Var) {
        c cVarF;
        if (f1Var.p()) {
            return f1Var;
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (l0.v(childAt) && (cVarF = ((f) childAt.getLayoutParams()).f()) != null) {
                f1Var = cVarF.f(this, childAt, f1Var);
                if (f1Var.p()) {
                    return f1Var;
                }
            }
        }
        return f1Var;
    }

    private void v(View view, int i15, Rect rect, Rect rect2, f fVar, int i16, int i17) {
        int iWidth;
        int iHeight;
        int iB = k.b(R(fVar.f11785c), i15);
        int iB2 = k.b(S(fVar.f11786d), i15);
        int i18 = iB & 7;
        int i19 = iB & 112;
        int i25 = iB2 & 7;
        int i26 = iB2 & 112;
        if (i25 != 1) {
            iWidth = i25 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i26 != 16) {
            iHeight = i26 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i18 == 1) {
            iWidth -= i16 / 2;
        } else if (i18 != 5) {
            iWidth -= i16;
        }
        if (i19 == 16) {
            iHeight -= i17 / 2;
        } else if (i19 != 80) {
            iHeight -= i17;
        }
        rect2.set(iWidth, iHeight, i16 + iWidth, i17 + iHeight);
    }

    private int w(int i15) {
        int[] iArr = this.f11770k;
        if (iArr == null) {
            c2.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i15);
            return 0;
        }
        if (i15 >= 0 && i15 < iArr.length) {
            return iArr[i15];
        }
        c2.e("CoordinatorLayout", "Keyline index " + i15 + " out of range for " + this);
        return 0;
    }

    private void z(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i15 = childCount - 1; i15 >= 0; i15--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i15) : i15));
        }
        Comparator<View> comparator = A;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public boolean B(View view, int i15, int i16) {
        Rect rectA = a();
        t(view, rectA);
        try {
            return rectA.contains(i15, i16);
        } finally {
            O(rectA);
        }
    }

    void G(View view, int i15) {
        c cVarF;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f11793k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            t(fVar.f11793k, rectA);
            q(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            v(view, i15, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z15 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            e(fVar, rectA3, measuredWidth, measuredHeight);
            int i16 = rectA3.left - rectA2.left;
            int i17 = rectA3.top - rectA2.top;
            if (i16 != 0) {
                l0.Q(view, i16);
            }
            if (i17 != 0) {
                l0.R(view, i17);
            }
            if (z15 && (cVarF = fVar.f()) != null) {
                cVarF.h(this, view, fVar.f11793k);
            }
            O(rectA);
            O(rectA2);
            O(rectA3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    final void H(int i15) {
        int i16;
        c cVarF;
        boolean zH;
        int iY = l0.y(this);
        int size = this.f11761a.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        for (int i17 = 0; i17 < size; i17++) {
            View view = this.f11761a.get(i17);
            f fVar = (f) view.getLayoutParams();
            if (i15 != 0 || view.getVisibility() != 8) {
                for (int i18 = 0; i18 < i17; i18++) {
                    if (fVar.f11794l == this.f11761a.get(i18)) {
                        G(view, iY);
                    }
                }
                q(view, true, rectA2);
                if (fVar.f11789g != 0 && !rectA2.isEmpty()) {
                    int iB = k.b(fVar.f11789g, iY);
                    int i19 = iB & 112;
                    if (i19 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i19 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i25 = iB & 7;
                    if (i25 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i25 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (fVar.f11790h != 0 && view.getVisibility() == 0) {
                    F(view, rectA, iY);
                }
                if (i15 != 2) {
                    x(view, rectA3);
                    if (!rectA3.equals(rectA2)) {
                        N(view, rectA2);
                        for (i16 = i17 + 1; i16 < size; i16++) {
                            View view2 = this.f11761a.get(i16);
                            f fVar2 = (f) view2.getLayoutParams();
                            cVarF = fVar2.f();
                            if (cVarF == null && cVarF.e(this, view2, view)) {
                                if (i15 == 0 && fVar2.g()) {
                                    fVar2.k();
                                } else {
                                    if (i15 != 2) {
                                        zH = cVarF.h(this, view2, view);
                                    } else {
                                        cVarF.i(this, view2, view);
                                        zH = true;
                                    }
                                    if (i15 == 1) {
                                        fVar2.p(zH);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i16 < size) {
                        View view3 = this.f11761a.get(i16);
                        f fVar3 = (f) view3.getLayoutParams();
                        cVarF = fVar3.f();
                        if (cVarF == null) {
                        }
                    }
                }
            }
        }
        O(rectA);
        O(rectA2);
        O(rectA3);
    }

    public void I(View view, int i15) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f11793k;
        if (view2 != null) {
            D(view, view2, i15);
            return;
        }
        int i16 = fVar.f11787e;
        if (i16 >= 0) {
            E(view, i16, i15);
        } else {
            C(view, i15);
        }
    }

    public void J(View view, int i15, int i16, int i17, int i18) {
        measureChildWithMargins(view, i15, i16, i17, i18);
    }

    void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void P() {
        if (this.f11769j && this.f11773n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f11773n);
        }
        this.f11774p = false;
    }

    final f1 W(f1 f1Var) {
        if (i6.c.a(this.f11775q, f1Var)) {
            return f1Var;
        }
        this.f11775q = f1Var;
        boolean z15 = false;
        boolean z16 = f1Var != null && f1Var.l() > 0;
        this.f11776r = z16;
        if (!z16 && getBackground() == null) {
            z15 = true;
        }
        setWillNotDraw(z15);
        f1 f1VarF = f(f1Var);
        requestLayout();
        return f1VarF;
    }

    void b() {
        if (this.f11769j) {
            if (this.f11773n == null) {
                this.f11773n = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f11773n);
        }
        this.f11774p = true;
    }

    @Override // j6.v
    public void c(View view, View view2, int i15, int i16) {
        c cVarF;
        View view3;
        View view4;
        int i17;
        int i18;
        this.f11780w.c(view, view2, i15, i16);
        this.f11772m = view2;
        int childCount = getChildCount();
        int i19 = 0;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i16) && (cVarF = fVar.f()) != null) {
                view3 = view;
                view4 = view2;
                i17 = i15;
                i18 = i16;
                cVarF.v(this, childAt, view3, view4, i17, i18);
            } else {
                view3 = view;
                view4 = view2;
                i17 = i15;
                i18 = i16;
            }
            i19++;
            view = view3;
            view2 = view4;
            i15 = i17;
            i16 = i18;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j15) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f11783a;
        if (cVar != null) {
            float fD = cVar.d(this, view);
            if (fD > 0.0f) {
                if (this.f11765e == null) {
                    this.f11765e = new Paint();
                }
                this.f11765e.setColor(fVar.f11783a.c(this, view));
                this.f11765e.setAlpha(d(Math.round(fD * 255.0f), 0, GF2Field.MASK));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f11765e);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j15);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f11777s;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void g(View view) {
        List listG = this.f11762b.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i15 = 0; i15 < listG.size(); i15++) {
            View view2 = (View) listG.get(i15);
            c cVarF = ((f) view2.getLayoutParams()).f();
            if (cVarF != null) {
                cVarF.h(this, view2, view);
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f11761a);
    }

    public final f1 getLastWindowInsets() {
        return this.f11775q;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f11780w.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f11777s;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    void h() {
        int childCount = getChildCount();
        boolean z15 = false;
        for (int i15 = 0; i15 < childCount; i15++) {
            if (A(getChildAt(i15))) {
                z15 = true;
                break;
            }
        }
        if (z15 != this.f11774p) {
            if (z15) {
                b();
            } else {
                P();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // j6.v
    public void j(View view, int i15) {
        this.f11780w.d(view, i15);
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i15)) {
                c cVarF = fVar.f();
                if (cVarF != null) {
                    cVarF.C(this, childAt, view, i15);
                }
                fVar.l(i15);
                fVar.k();
            }
        }
        this.f11772m = null;
    }

    @Override // j6.v
    public void k(View view, int i15, int i16, int[] iArr, int i17) {
        c cVarF;
        int childCount = getChildCount();
        boolean z15 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i17) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f11766f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.q(this, childAt, view, i15, i16, iArr2, i17);
                    int[] iArr3 = this.f11766f;
                    iMax = i15 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f11766f;
                    iMax2 = i16 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z15 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z15) {
            H(1);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // j6.w
    public void m(View view, int i15, int i16, int i17, int i18, int i19, int[] iArr) {
        c cVarF;
        int childCount = getChildCount();
        boolean z15 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt = getChildAt(i25);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i19) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f11766f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.t(this, childAt, view, i15, i16, i17, i18, i19, iArr2);
                    int[] iArr3 = this.f11766f;
                    iMax = i17 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f11766f;
                    iMax2 = i18 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z15 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z15) {
            H(1);
        }
    }

    @Override // j6.v
    public void n(View view, int i15, int i16, int i17, int i18, int i19) {
        m(view, i15, i16, i17, i18, 0, this.f11767g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.f11774p) {
            if (this.f11773n == null) {
                this.f11773n = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f11773n);
        }
        if (this.f11775q == null && l0.v(this)) {
            l0.e0(this);
        }
        this.f11769j = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.f11774p && this.f11773n != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f11773n);
        }
        View view = this.f11772m;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f11769j = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f11776r || this.f11777s == null) {
            return;
        }
        f1 f1Var = this.f11775q;
        int iL = f1Var != null ? f1Var.l() : 0;
        if (iL > 0) {
            this.f11777s.setBounds(0, 0, getWidth(), iL);
            this.f11777s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean zL = L(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zL;
        }
        Q(true);
        return zL;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        c cVarF;
        int iY = l0.y(this);
        int size = this.f11761a.size();
        for (int i19 = 0; i19 < size; i19++) {
            View view = this.f11761a.get(i19);
            if (view.getVisibility() != 8 && ((cVarF = ((f) view.getLayoutParams()).f()) == null || !cVarF.l(this, view, iY))) {
                I(view, iY);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    @Override // android.view.View
    protected void onMeasure(int i15, int i16) {
        int i17;
        int i18;
        int i19;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVarF;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i35;
        int i36;
        View view;
        int i37;
        int i38;
        boolean zM;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.M();
        coordinatorLayout.h();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int iY = l0.y(coordinatorLayout);
        boolean z15 = iY == 1;
        int mode = View.MeasureSpec.getMode(i15);
        int size = View.MeasureSpec.getSize(i15);
        int mode2 = View.MeasureSpec.getMode(i16);
        int size2 = View.MeasureSpec.getSize(i16);
        int i39 = paddingLeft + paddingRight;
        int i45 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z16 = coordinatorLayout.f11775q != null && l0.v(coordinatorLayout);
        int size3 = coordinatorLayout.f11761a.size();
        int i46 = 0;
        int iCombineMeasuredStates = 0;
        while (i46 < size3) {
            View view2 = coordinatorLayout.f11761a.get(i46);
            int i47 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i27 = size3;
                i18 = i46;
                i28 = paddingLeft;
                i25 = iY;
                suggestedMinimumWidth = i47;
                i37 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i48 = fVar.f11787e;
                if (i48 < 0 || mode == 0) {
                    i17 = suggestedMinimumHeight;
                } else {
                    int iW = coordinatorLayout.w(i48);
                    int iB = k.b(T(fVar.f11785c), iY) & 7;
                    i17 = suggestedMinimumHeight;
                    if ((iB != 3 || z15) && !(iB == 5 && z15)) {
                        if ((iB == 5 && !z15) || (iB == 3 && z15)) {
                            iMax = Math.max(0, iW - paddingLeft);
                        }
                        if (z16 || l0.v(view2)) {
                            iMakeMeasureSpec = i15;
                            iMakeMeasureSpec2 = i16;
                        } else {
                            int iJ = coordinatorLayout.f11775q.j() + coordinatorLayout.f11775q.k();
                            int iL = coordinatorLayout.f11775q.l() + coordinatorLayout.f11775q.i();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iJ, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iL, mode2);
                        }
                        cVarF = fVar.f();
                        if (cVarF != null) {
                            i27 = size3;
                            int i49 = iMakeMeasureSpec;
                            view = view2;
                            int i55 = i17;
                            i25 = iY;
                            i26 = i55;
                            i28 = paddingLeft;
                            i29 = i47;
                            i37 = paddingRight;
                            i38 = iCombineMeasuredStates;
                            int i56 = iMakeMeasureSpec2;
                            zM = cVarF.m(this, view, i49, i19, i56, 0);
                            i36 = i49;
                            i35 = i56;
                            if (zM) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i29, i39 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int iMax2 = Math.max(i26, i45 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i38, view.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            int i57 = i17;
                            i25 = iY;
                            i26 = i57;
                            i27 = size3;
                            i28 = paddingLeft;
                            i29 = i47;
                            i35 = iMakeMeasureSpec2;
                            i36 = iMakeMeasureSpec;
                            view = view2;
                            i37 = paddingRight;
                            i38 = iCombineMeasuredStates;
                        }
                        View view3 = view;
                        coordinatorLayout = this;
                        coordinatorLayout.J(view3, i36, i19, i35, 0);
                        view = view3;
                        suggestedMinimumWidth = Math.max(i29, i39 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax3 = Math.max(i26, i45 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i38, view.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iW);
                    }
                    int i58 = i46;
                    i19 = iMax;
                    i18 = i58;
                    if (z16) {
                        iMakeMeasureSpec = i15;
                        iMakeMeasureSpec2 = i16;
                    } else {
                        iMakeMeasureSpec = i15;
                        iMakeMeasureSpec2 = i16;
                    }
                    cVarF = fVar.f();
                    if (cVarF != null) {
                        i27 = size3;
                        int i410 = iMakeMeasureSpec;
                        view = view2;
                        int i59 = i17;
                        i25 = iY;
                        i26 = i59;
                        i28 = paddingLeft;
                        i29 = i47;
                        i37 = paddingRight;
                        i38 = iCombineMeasuredStates;
                        int i510 = iMakeMeasureSpec2;
                        zM = cVarF.m(this, view, i410, i19, i510, 0);
                        i36 = i410;
                        i35 = i510;
                        if (zM) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i29, i39 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax4 = Math.max(i26, i45 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i38, view.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        int i511 = i17;
                        i25 = iY;
                        i26 = i511;
                        i27 = size3;
                        i28 = paddingLeft;
                        i29 = i47;
                        i35 = iMakeMeasureSpec2;
                        i36 = iMakeMeasureSpec;
                        view = view2;
                        i37 = paddingRight;
                        i38 = iCombineMeasuredStates;
                    }
                    View view4 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.J(view4, i36, i19, i35, 0);
                    view = view4;
                    suggestedMinimumWidth = Math.max(i29, i39 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax5 = Math.max(i26, i45 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i38, view.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i18 = i46;
                i19 = 0;
                if (z16) {
                    iMakeMeasureSpec = i15;
                    iMakeMeasureSpec2 = i16;
                } else {
                    iMakeMeasureSpec = i15;
                    iMakeMeasureSpec2 = i16;
                }
                cVarF = fVar.f();
                if (cVarF != null) {
                    i27 = size3;
                    int i411 = iMakeMeasureSpec;
                    view = view2;
                    int i512 = i17;
                    i25 = iY;
                    i26 = i512;
                    i28 = paddingLeft;
                    i29 = i47;
                    i37 = paddingRight;
                    i38 = iCombineMeasuredStates;
                    int i513 = iMakeMeasureSpec2;
                    zM = cVarF.m(this, view, i411, i19, i513, 0);
                    i36 = i411;
                    i35 = i513;
                    if (zM) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i29, i39 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax6 = Math.max(i26, i45 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i38, view.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    int i514 = i17;
                    i25 = iY;
                    i26 = i514;
                    i27 = size3;
                    i28 = paddingLeft;
                    i29 = i47;
                    i35 = iMakeMeasureSpec2;
                    i36 = iMakeMeasureSpec;
                    view = view2;
                    i37 = paddingRight;
                    i38 = iCombineMeasuredStates;
                }
                View view5 = view;
                coordinatorLayout = this;
                coordinatorLayout.J(view5, i36, i19, i35, 0);
                view = view5;
                suggestedMinimumWidth = Math.max(i29, i39 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int iMax7 = Math.max(i26, i45 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i38, view.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i46 = i18 + 1;
            paddingLeft = i28;
            paddingRight = i37;
            iY = i25;
            size3 = i27;
        }
        int i65 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i15, (-16777216) & i65), View.resolveSizeAndState(suggestedMinimumHeight, i16, i65 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f15, float f16, boolean z15) {
        c cVarF;
        View view2;
        float f17;
        float f18;
        boolean z16;
        int childCount = getChildCount();
        int i15 = 0;
        boolean zN = false;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f17 = f15;
                f18 = f16;
                z16 = z15;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    view2 = view;
                    f17 = f15;
                    f18 = f16;
                    z16 = z15;
                    zN |= cVarF.n(this, childAt, view2, f17, f18, z16);
                } else {
                    view2 = view;
                    f17 = f15;
                    f18 = f16;
                    z16 = z15;
                }
            }
            i15++;
            view = view2;
            f15 = f17;
            f16 = f18;
            z15 = z16;
        }
        if (zN) {
            H(1);
        }
        return zN;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f15, float f16) {
        c cVarF;
        View view2;
        float f17;
        float f18;
        int childCount = getChildCount();
        int i15 = 0;
        boolean zO = false;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f17 = f15;
                f18 = f16;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    view2 = view;
                    f17 = f15;
                    f18 = f16;
                    zO |= cVarF.o(this, childAt, view2, f17, f18);
                } else {
                    view2 = view;
                    f17 = f15;
                    f18 = f16;
                }
            }
            i15++;
            view = view2;
            f15 = f17;
            f16 = f18;
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i15, int i16, int[] iArr) {
        k(view, i15, i16, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i15, int i16, int i17, int i18) {
        n(view, i15, i16, i17, i18, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i15) {
        c(view, view2, i15, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray<Parcelable> sparseArray = hVar.f11802c;
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            int id5 = childAt.getId();
            c cVarF = y(childAt).f();
            if (id5 != -1 && cVarF != null && (parcelable2 = sparseArray.get(id5)) != null) {
                cVarF.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableY;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            int id5 = childAt.getId();
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (id5 != -1 && cVarF != null && (parcelableY = cVarF.y(this, childAt)) != null) {
                sparseArray.append(id5, parcelableY);
            }
        }
        hVar.f11802c = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i15) {
        return p(view, view2, i15, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zL;
        boolean zD;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11771l == null) {
            zL = L(motionEvent, 1);
            if (!zL) {
                zD = false;
            }
            motionEventObtain = null;
            if (this.f11771l == null) {
                zD |= super.onTouchEvent(motionEvent);
            } else if (zL) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zD;
            }
            Q(false);
            return zD;
        }
        zL = false;
        c cVarF = ((f) this.f11771l.getLayoutParams()).f();
        if (cVarF != null) {
            zD = cVarF.D(this, this.f11771l, motionEvent);
        } else {
            zD = false;
        }
        motionEventObtain = null;
        if (this.f11771l == null) {
            zD |= super.onTouchEvent(motionEvent);
        } else if (zL) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        Q(false);
        return zD;
    }

    @Override // j6.v
    public boolean p(View view, View view2, int i15, int i16) {
        int childCount = getChildCount();
        boolean z15 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarF = fVar.f();
                if (cVarF != null) {
                    boolean zA = cVarF.A(this, childAt, view, view2, i15, i16);
                    z15 |= zA;
                    fVar.r(i16, zA);
                } else {
                    fVar.r(i16, false);
                }
            }
        }
        return z15;
    }

    void q(View view, boolean z15, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z15) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> r(View view) {
        List<View> listH = this.f11762b.h(view);
        this.f11764d.clear();
        if (listH != null) {
            this.f11764d.addAll(listH);
        }
        return this.f11764d;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z15) {
        c cVarF = ((f) view.getLayoutParams()).f();
        if (cVarF == null || !cVarF.w(this, view, rect, z15)) {
            return super.requestChildRectangleOnScreen(view, rect, z15);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z15) {
        super.requestDisallowInterceptTouchEvent(z15);
        if (!z15 || this.f11768h) {
            return;
        }
        Q(false);
        this.f11768h = true;
    }

    public List<View> s(View view) {
        List listG = this.f11762b.g(view);
        this.f11764d.clear();
        if (listG != null) {
            this.f11764d.addAll(listG);
        }
        return this.f11764d;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z15) {
        super.setFitsSystemWindows(z15);
        X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f11778t = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f11777s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f11777s = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f11777s.setState(getDrawableState());
                }
                y5.a.m(this.f11777s, l0.y(this));
                this.f11777s.setVisible(getVisibility() == 0, false);
                this.f11777s.setCallback(this);
            }
            l0.Y(this);
        }
    }

    public void setStatusBarBackgroundColor(int i15) {
        setStatusBarBackground(new ColorDrawable(i15));
    }

    public void setStatusBarBackgroundResource(int i15) {
        setStatusBarBackground(i15 != 0 ? u5.a.f(getContext(), i15) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i15) {
        super.setVisibility(i15);
        boolean z15 = i15 == 0;
        Drawable drawable = this.f11777s;
        if (drawable == null || drawable.isVisible() == z15) {
            return;
        }
        this.f11777s.setVisible(z15, false);
    }

    void t(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void u(View view, int i15, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i15, rect, rect2, fVar, measuredWidth, measuredHeight);
        e(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11777s;
    }

    void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f11784b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    c2.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f11784b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.o(dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e15) {
                    c2.f("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e15);
                }
            }
            fVar.f11784b = true;
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i15) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i15);
        this.f11761a = new ArrayList();
        this.f11762b = new androidx.coordinatorlayout.widget.a<>();
        this.f11763c = new ArrayList();
        this.f11764d = new ArrayList();
        this.f11766f = new int[2];
        this.f11767g = new int[2];
        this.f11780w = new x(this);
        TypedArray typedArrayObtainStyledAttributes = i15 == 0 ? context.obtainStyledAttributes(attributeSet, q5.c.f164762b, 0, q5.b.f164760a) : context.obtainStyledAttributes(attributeSet, q5.c.f164762b, i15, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i15 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, q5.c.f164762b, attributeSet, typedArrayObtainStyledAttributes, 0, q5.b.f164760a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, q5.c.f164762b, attributeSet, typedArrayObtainStyledAttributes, i15, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(q5.c.f164763c, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f11770k = resources.getIntArray(resourceId);
            float f15 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f11770k.length;
            for (int i16 = 0; i16 < length; i16++) {
                int[] iArr = coordinatorLayout.f11770k;
                iArr[i16] = (int) (iArr[i16] * f15);
            }
        }
        coordinatorLayout.f11777s = typedArrayObtainStyledAttributes.getDrawable(q5.c.f164764d);
        typedArrayObtainStyledAttributes.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
        if (l0.w(this) == 0) {
            l0.n0(this, 1);
        }
    }

    protected static class h extends r6.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        SparseArray<Parcelable> f11802c;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i15) {
                return new h[i15];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i15 = parcel.readInt();
            int[] iArr = new int[i15];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f11802c = new SparseArray<>(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                this.f11802c.append(iArr[i16], parcelableArray[i16]);
            }
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            SparseArray<Parcelable> sparseArray = this.f11802c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i16 = 0; i16 < size; i16++) {
                iArr[i16] = this.f11802c.keyAt(i16);
                parcelableArr[i16] = this.f11802c.valueAt(i16);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i15);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f11783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f11784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f11787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f11788f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f11789g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f11790h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f11791i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f11792j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        View f11793k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        View f11794l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f11795m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f11796n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f11797o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f11798p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final Rect f11799q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f11800r;

        public f(int i15, int i16) {
            super(i15, i16);
            this.f11784b = false;
            this.f11785c = 0;
            this.f11786d = 0;
            this.f11787e = -1;
            this.f11788f = -1;
            this.f11789g = 0;
            this.f11790h = 0;
            this.f11799q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f11788f);
            this.f11793k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f11794l = null;
                    this.f11793k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f11788f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f11794l = null;
                this.f11793k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f11794l = null;
                    this.f11793k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f11794l = viewFindViewById;
        }

        private boolean s(View view, int i15) {
            int iB = k.b(((f) view.getLayoutParams()).f11789g, i15);
            return iB != 0 && (k.b(this.f11790h, i15) & iB) == iB;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f11793k.getId() != this.f11788f) {
                return false;
            }
            View view2 = this.f11793k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f11794l = null;
                    this.f11793k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f11794l = view2;
            return true;
        }

        boolean a() {
            return this.f11793k == null && this.f11788f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f11794l || s(view2, l0.y(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f11783a;
            return cVar != null && cVar.e(coordinatorLayout, view, view2);
        }

        boolean c() {
            if (this.f11783a == null) {
                this.f11795m = false;
            }
            return this.f11795m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f11788f == -1) {
                this.f11794l = null;
                this.f11793k = null;
                return null;
            }
            if (this.f11793k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f11793k;
        }

        public int e() {
            return this.f11788f;
        }

        public c f() {
            return this.f11783a;
        }

        boolean g() {
            return this.f11798p;
        }

        Rect h() {
            return this.f11799q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z15 = this.f11795m;
            if (z15) {
                return true;
            }
            c cVar = this.f11783a;
            boolean zA = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z15;
            this.f11795m = zA;
            return zA;
        }

        boolean j(int i15) {
            if (i15 == 0) {
                return this.f11796n;
            }
            if (i15 != 1) {
                return false;
            }
            return this.f11797o;
        }

        void k() {
            this.f11798p = false;
        }

        void l(int i15) {
            r(i15, false);
        }

        void m() {
            this.f11795m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f11783a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f11783a = cVar;
                this.f11800r = null;
                this.f11784b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void p(boolean z15) {
            this.f11798p = z15;
        }

        void q(Rect rect) {
            this.f11799q.set(rect);
        }

        void r(int i15, boolean z15) {
            if (i15 == 0) {
                this.f11796n = z15;
            } else {
                if (i15 != 1) {
                    return;
                }
                this.f11797o = z15;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11784b = false;
            this.f11785c = 0;
            this.f11786d = 0;
            this.f11787e = -1;
            this.f11788f = -1;
            this.f11789g = 0;
            this.f11790h = 0;
            this.f11799q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q5.c.f164765e);
            this.f11785c = typedArrayObtainStyledAttributes.getInteger(q5.c.f164766f, 0);
            this.f11788f = typedArrayObtainStyledAttributes.getResourceId(q5.c.f164767g, -1);
            this.f11786d = typedArrayObtainStyledAttributes.getInteger(q5.c.f164768h, 0);
            this.f11787e = typedArrayObtainStyledAttributes.getInteger(q5.c.f164772l, -1);
            this.f11789g = typedArrayObtainStyledAttributes.getInt(q5.c.f164771k, 0);
            this.f11790h = typedArrayObtainStyledAttributes.getInt(q5.c.f164770j, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(q5.c.f164769i);
            this.f11784b = zHasValue;
            if (zHasValue) {
                this.f11783a = CoordinatorLayout.K(context, attributeSet, typedArrayObtainStyledAttributes.getString(q5.c.f164769i));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f11783a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f11784b = false;
            this.f11785c = 0;
            this.f11786d = 0;
            this.f11787e = -1;
            this.f11788f = -1;
            this.f11789g = 0;
            this.f11790h = 0;
            this.f11799q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11784b = false;
            this.f11785c = 0;
            this.f11786d = 0;
            this.f11787e = -1;
            this.f11788f = -1;
            this.f11789g = 0;
            this.f11790h = 0;
            this.f11799q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11784b = false;
            this.f11785c = 0;
            this.f11786d = 0;
            this.f11787e = -1;
            this.f11788f = -1;
            this.f11789g = 0;
            this.f11790h = 0;
            this.f11799q = new Rect();
        }
    }
}
