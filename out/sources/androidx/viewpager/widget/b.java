package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import io.sentry.android.core.c2;
import j6.l0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public class b extends ViewGroup {
    private boolean A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    private float G;
    private float H;
    private int I;
    private VelocityTracker K;
    private int L;
    private boolean O;
    private EdgeEffect P;
    private EdgeEffect R;
    private boolean T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<d> f13613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f13614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f13615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f13616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f13617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Parcelable f13618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ClassLoader f13619h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f13620h0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Scroller f13621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f13622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f13623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f13624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f13625n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f13626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f13627q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f13628q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f13629r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private List<g> f13630r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f13631s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private g f13632s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f13633t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private g f13634t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private List<f> f13635u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f13636v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f13637v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f13638w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private ArrayList<View> f13639w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f13640x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final Runnable f13641x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f13642y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f13643y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f13644z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    static final int[] f13611z0 = {R.attr.layout_gravity};
    private static final Comparator<d> A0 = new a();
    private static final Interpolator B0 = new InterpolatorC0289b();
    private static final i C0 = new i();

    static class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f13646b - dVar2.f13646b;
        }
    }

    /* JADX INFO: renamed from: androidx.viewpager.widget.b$b, reason: collision with other inner class name */
    static class InterpolatorC0289b implements Interpolator {
        InterpolatorC0289b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f15) {
            float f16 = f15 - 1.0f;
            return (f16 * f16 * f16 * f16 * f16) + 1.0f;
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f13645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f13647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f13648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f13649e;

        d() {
        }
    }

    public interface f {
        void a(b bVar, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    public interface g {
        void a(int i15, float f15, int i16);

        void b(int i15);

        void c(int i15);
    }

    public static class h extends r6.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Parcelable f13657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ClassLoader f13658e;

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

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f13656c + "}";
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeInt(this.f13656c);
            parcel.writeParcelable(this.f13657d, i15);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f13656c = parcel.readInt();
            this.f13657d = parcel.readParcelable(classLoader);
            this.f13658e = classLoader;
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            e eVar = (e) view.getLayoutParams();
            e eVar2 = (e) view2.getLayoutParams();
            boolean z15 = eVar.f13650a;
            if (z15 != eVar2.f13650a) {
                return z15 ? 1 : -1;
            }
            return eVar.f13654e - eVar2.f13654e;
        }
    }

    private void C(boolean z15) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z15);
        }
    }

    private boolean D() {
        this.I = -1;
        j();
        this.P.onRelease();
        this.R.onRelease();
        return this.P.isFinished() || this.R.isFinished();
    }

    private void E(int i15, boolean z15, int i16, boolean z16) {
        d dVarO = o(i15);
        int clientWidth = dVarO != null ? (int) (getClientWidth() * Math.max(this.f13627q, Math.min(dVarO.f13649e, this.f13629r))) : 0;
        if (z15) {
            I(clientWidth, 0, i16);
            if (z16) {
                g(i15);
                return;
            }
            return;
        }
        if (z16) {
            g(i15);
        }
        e(false);
        scrollTo(clientWidth, 0);
        v(clientWidth);
    }

    private void J() {
        if (this.f13637v0 != 0) {
            ArrayList<View> arrayList = this.f13639w0;
            if (arrayList == null) {
                this.f13639w0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                this.f13639w0.add(getChildAt(i15));
            }
            Collections.sort(this.f13639w0, C0);
        }
    }

    private void e(boolean z15) {
        boolean z16 = this.f13643y0 == 2;
        if (z16) {
            setScrollingCacheEnabled(false);
            if (!this.f13621j.isFinished()) {
                this.f13621j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f13621j.getCurrX();
                int currY = this.f13621j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        v(currX);
                    }
                }
            }
        }
        this.f13640x = false;
        for (int i15 = 0; i15 < this.f13613b.size(); i15++) {
            d dVar = this.f13613b.get(i15);
            if (dVar.f13647c) {
                dVar.f13647c = false;
                z16 = true;
            }
        }
        if (z16) {
            if (z15) {
                l0.Z(this, this.f13641x0);
            } else {
                this.f13641x0.run();
            }
        }
    }

    private void f(int i15, float f15, int i16) {
        g gVar = this.f13632s0;
        if (gVar != null) {
            gVar.a(i15, f15, i16);
        }
        List<g> list = this.f13630r0;
        if (list != null) {
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                g gVar2 = this.f13630r0.get(i17);
                if (gVar2 != null) {
                    gVar2.a(i15, f15, i16);
                }
            }
        }
        g gVar3 = this.f13634t0;
        if (gVar3 != null) {
            gVar3.a(i15, f15, i16);
        }
    }

    private void g(int i15) {
        g gVar = this.f13632s0;
        if (gVar != null) {
            gVar.c(i15);
        }
        List<g> list = this.f13630r0;
        if (list != null) {
            int size = list.size();
            for (int i16 = 0; i16 < size; i16++) {
                g gVar2 = this.f13630r0.get(i16);
                if (gVar2 != null) {
                    gVar2.c(i15);
                }
            }
        }
        g gVar3 = this.f13634t0;
        if (gVar3 != null) {
            gVar3.c(i15);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void h(int i15) {
        g gVar = this.f13632s0;
        if (gVar != null) {
            gVar.b(i15);
        }
        List<g> list = this.f13630r0;
        if (list != null) {
            int size = list.size();
            for (int i16 = 0; i16 < size; i16++) {
                g gVar2 = this.f13630r0.get(i16);
                if (gVar2 != null) {
                    gVar2.b(i15);
                }
            }
        }
        g gVar3 = this.f13634t0;
        if (gVar3 != null) {
            gVar3.b(i15);
        }
    }

    private void j() {
        this.f13644z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
    }

    private Rect l(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private d n() {
        int i15;
        int clientWidth = getClientWidth();
        float f15 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f16 = clientWidth > 0 ? this.f13623l / clientWidth : 0.0f;
        int i16 = 0;
        d dVar = null;
        boolean z15 = true;
        int i17 = -1;
        float f17 = 0.0f;
        while (i16 < this.f13613b.size()) {
            d dVar2 = this.f13613b.get(i16);
            if (!z15 && dVar2.f13646b != (i15 = i17 + 1)) {
                d dVar3 = this.f13614c;
                dVar3.f13649e = f15 + f17 + f16;
                dVar3.f13646b = i15;
                throw null;
            }
            f15 = dVar2.f13649e;
            float f18 = dVar2.f13648d + f15 + f16;
            if (!z15 && scrollX < f15) {
                break;
            }
            if (scrollX < f18 || i16 == this.f13613b.size() - 1) {
                return dVar2;
            }
            i17 = dVar2.f13646b;
            f17 = dVar2.f13648d;
            i16++;
            z15 = false;
            dVar = dVar2;
        }
        return dVar;
    }

    private static boolean p(View view) {
        return view.getClass().getAnnotation(c.class) != null;
    }

    private boolean q(float f15, float f16) {
        if (f15 >= this.C || f16 <= 0.0f) {
            return f15 > ((float) (getWidth() - this.C)) && f16 < 0.0f;
        }
        return true;
    }

    private void s(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.I) {
            int i15 = actionIndex == 0 ? 1 : 0;
            this.E = motionEvent.getX(i15);
            this.I = motionEvent.getPointerId(i15);
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z15) {
        if (this.f13638w != z15) {
            this.f13638w = z15;
        }
    }

    private boolean v(int i15) {
        if (this.f13613b.size() == 0) {
            if (this.T) {
                return false;
            }
            this.f13620h0 = false;
            r(0, 0.0f, 0);
            if (this.f13620h0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        d dVarN = n();
        int clientWidth = getClientWidth();
        int i16 = this.f13623l;
        int i17 = clientWidth + i16;
        float f15 = clientWidth;
        int i18 = dVarN.f13646b;
        float f16 = ((i15 / f15) - dVarN.f13649e) / (dVarN.f13648d + (i16 / f15));
        this.f13620h0 = false;
        r(i18, f16, (int) (i17 * f16));
        if (this.f13620h0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean w(float f15) {
        this.E = f15;
        getScrollX();
        getClientWidth();
        d dVar = this.f13613b.get(0);
        ArrayList<d> arrayList = this.f13613b;
        d dVar2 = arrayList.get(arrayList.size() - 1);
        int i15 = dVar.f13646b;
        int i16 = dVar2.f13646b;
        throw null;
    }

    private void z(int i15, int i16, int i17, int i18) {
        if (i16 > 0 && !this.f13613b.isEmpty()) {
            if (!this.f13621j.isFinished()) {
                this.f13621j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i16 - getPaddingLeft()) - getPaddingRight()) + i18)) * (((i15 - getPaddingLeft()) - getPaddingRight()) + i17)), getScrollY());
                return;
            }
        }
        d dVarO = o(this.f13616e);
        int iMin = (int) ((dVarO != null ? Math.min(dVarO.f13649e, this.f13629r) : 0.0f) * ((i15 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            e(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public void A(f fVar) {
        List<f> list = this.f13635u0;
        if (list != null) {
            list.remove(fVar);
        }
    }

    public void B(g gVar) {
        List<g> list = this.f13630r0;
        if (list != null) {
            list.remove(gVar);
        }
    }

    public void F(int i15, boolean z15) {
        this.f13640x = false;
        G(i15, z15, false);
    }

    void G(int i15, boolean z15, boolean z16) {
        H(i15, z15, z16, 0);
    }

    void H(int i15, boolean z15, boolean z16, int i16) {
        setScrollingCacheEnabled(false);
    }

    void I(int i15, int i16, int i17) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f13621j;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f13622k ? this.f13621j.getCurrX() : this.f13621j.getStartX();
            this.f13621j.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i18 = scrollX;
        int scrollY = getScrollY();
        int i19 = i15 - i18;
        int i25 = i16 - scrollY;
        if (i19 == 0 && i25 == 0) {
            e(false);
            x();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        float f15 = clientWidth / 2;
        float fI = f15 + (i(Math.min(1.0f, (Math.abs(i19) * 1.0f) / clientWidth)) * f15);
        int iAbs = Math.abs(i17);
        if (iAbs <= 0) {
            throw null;
        }
        int iMin = Math.min(Math.round(Math.abs(fI / iAbs) * 1000.0f) * 4, 600);
        this.f13622k = false;
        this.f13621j.startScroll(i18, scrollY, i19, i25, iMin);
        l0.Y(this);
    }

    public void a(f fVar) {
        if (this.f13635u0 == null) {
            this.f13635u0 = new ArrayList();
        }
        this.f13635u0.add(fVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i15, int i16) {
        d dVarM;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                View childAt = getChildAt(i17);
                if (childAt.getVisibility() == 0 && (dVarM = m(childAt)) != null && dVarM.f13646b == this.f13616e) {
                    childAt.addFocusables(arrayList, i15, i16);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i16 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        d dVarM;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 0 && (dVarM = m(childAt)) != null && dVarM.f13646b == this.f13616e) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i15, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        e eVar = (e) layoutParams;
        boolean zP = eVar.f13650a | p(view);
        eVar.f13650a = zP;
        if (!this.f13636v) {
            super.addView(view, i15, layoutParams);
        } else {
            if (zP) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            eVar.f13653d = true;
            addViewInLayout(view, i15, layoutParams);
        }
    }

    public void b(g gVar) {
        if (this.f13630r0 == null) {
            this.f13630r0 = new ArrayList();
        }
        this.f13630r0.add(gVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    public boolean c(int i15) {
        boolean zT;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb5.append(" => ");
                        sb5.append(parent2.getClass().getSimpleName());
                    }
                    c2.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb5.toString());
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i15);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i15 == 17 || i15 == 1) {
                zT = t();
            } else if (i15 == 66 || i15 == 2) {
                zT = u();
            } else {
                zT = false;
            }
        } else if (i15 == 17) {
            zT = (viewFindFocus == null || l(this.f13615d, viewFindNextFocus).left < l(this.f13615d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : t();
        } else if (i15 == 66) {
            zT = (viewFindFocus == null || l(this.f13615d, viewFindNextFocus).left > l(this.f13615d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : u();
        } else {
            zT = false;
        }
        if (zT) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i15));
        }
        return zT;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i15) {
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f13622k = true;
        if (this.f13621j.isFinished() || !this.f13621j.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f13621j.getCurrX();
        int currY = this.f13621j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!v(currX)) {
                this.f13621j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        l0.Y(this);
    }

    protected boolean d(View view, boolean z15, int i15, int i16, int i17) {
        int i18;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i19 = i16 + scrollX;
                if (i19 >= childAt.getLeft() && i19 < childAt.getRight() && (i18 = i17 + scrollY) >= childAt.getTop() && i18 < childAt.getBottom() && d(childAt, true, i15, i19 - childAt.getLeft(), i18 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z15 && view.canScrollHorizontally(-i15);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || k(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        d dVarM;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 0 && (dVarM = m(childAt)) != null && dVarM.f13646b == this.f13616e && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean zDraw = false;
        if (getOverScrollMode() != 0) {
            this.P.finish();
            this.R.finish();
        } else {
            if (!this.P.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f13627q * width);
                this.P.setSize(height, width);
                zDraw = this.P.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.R.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f13629r + 1.0f)) * width2);
                this.R.setSize(height2, width2);
                zDraw |= this.R.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        }
        if (zDraw) {
            l0.Y(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f13624m;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i15, int i16) {
        if (this.f13637v0 == 2) {
            i16 = (i15 - 1) - i16;
        }
        return ((e) this.f13639w0.get(i16).getLayoutParams()).f13655f;
    }

    public int getCurrentItem() {
        return this.f13616e;
    }

    public int getOffscreenPageLimit() {
        return this.f13642y;
    }

    public int getPageMargin() {
        return this.f13623l;
    }

    float i(float f15) {
        return (float) Math.sin((f15 - 0.5f) * 0.47123894f);
    }

    public boolean k(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            return keyEvent.hasModifiers(2) ? t() : c(17);
        }
        if (keyCode == 22) {
            return keyEvent.hasModifiers(2) ? u() : c(66);
        }
        if (keyCode != 61) {
            return false;
        }
        if (keyEvent.hasNoModifiers()) {
            return c(2);
        }
        if (keyEvent.hasModifiers(1)) {
            return c(1);
        }
        return false;
    }

    d m(View view) {
        if (this.f13613b.size() <= 0) {
            return null;
        }
        Object obj = this.f13613b.get(0).f13645a;
        throw null;
    }

    d o(int i15) {
        for (int i16 = 0; i16 < this.f13613b.size(); i16++) {
            d dVar = this.f13613b.get(i16);
            if (dVar.f13646b == i15) {
                return dVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f13641x0);
        Scroller scroller = this.f13621j;
        if (scroller != null && !scroller.isFinished()) {
            this.f13621j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f13623l <= 0 || this.f13624m == null) {
            return;
        }
        this.f13613b.size();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & GF2Field.MASK;
        if (action == 3 || action == 1) {
            D();
            return false;
        }
        if (action != 0) {
            if (this.f13644z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        if (action == 0) {
            float x15 = motionEvent.getX();
            this.G = x15;
            this.E = x15;
            float y15 = motionEvent.getY();
            this.H = y15;
            this.F = y15;
            this.I = motionEvent.getPointerId(0);
            this.A = false;
            this.f13622k = true;
            this.f13621j.computeScrollOffset();
            if (this.f13643y0 != 2 || Math.abs(this.f13621j.getFinalX() - this.f13621j.getCurrX()) <= this.L) {
                e(false);
                this.f13644z = false;
            } else {
                this.f13621j.abortAnimation();
                this.f13640x = false;
                x();
                this.f13644z = true;
                C(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i15 = this.I;
            if (i15 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i15);
                float x16 = motionEvent.getX(iFindPointerIndex);
                float f15 = x16 - this.E;
                float fAbs = Math.abs(f15);
                float y16 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y16 - this.H);
                if (f15 != 0.0f && !q(this.E, f15) && d(this, false, (int) f15, (int) x16, (int) y16)) {
                    this.E = x16;
                    this.F = y16;
                    this.A = true;
                    return false;
                }
                int i16 = this.D;
                if (fAbs > i16 && fAbs * 0.5f > fAbs2) {
                    this.f13644z = true;
                    C(true);
                    setScrollState(1);
                    float f16 = this.G;
                    float f17 = this.D;
                    this.E = f15 > 0.0f ? f16 + f17 : f16 - f17;
                    this.F = y16;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i16) {
                    this.A = true;
                }
                if (this.f13644z && w(x16)) {
                    l0.Y(this);
                }
            }
        } else if (action == 6) {
            s(motionEvent);
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        return this.f13644z;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        boolean z16;
        d dVarM;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i19 = i17 - i15;
        int i25 = i18 - i16;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i26 = 0;
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt = getChildAt(i27);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f13650a) {
                    int i28 = eVar.f13651b;
                    int i29 = i28 & 7;
                    int i35 = i28 & 112;
                    if (i29 != 1) {
                        if (i29 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i29 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i19 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i35 != 16) {
                            if (i35 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i35 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i25 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i36 = paddingLeft + scrollX;
                            childAt.layout(i36, paddingTop, childAt.getMeasuredWidth() + i36, paddingTop + childAt.getMeasuredHeight());
                            i26++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i25 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i37 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i37;
                        int i38 = paddingLeft + scrollX;
                        childAt.layout(i38, paddingTop, childAt.getMeasuredWidth() + i38, paddingTop + childAt.getMeasuredHeight());
                        i26++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i19 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i39 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i39;
                    if (i35 != 16) {
                        if (i35 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i35 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i25 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i310 = paddingLeft + scrollX;
                        childAt.layout(i310, paddingTop, childAt.getMeasuredWidth() + i310, paddingTop + childAt.getMeasuredHeight());
                        i26++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i25 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i311 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i311;
                    int i312 = paddingLeft + scrollX;
                    childAt.layout(i312, paddingTop, childAt.getMeasuredWidth() + i312, paddingTop + childAt.getMeasuredHeight());
                    i26++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i45 = (i19 - paddingLeft) - paddingRight;
        for (int i46 = 0; i46 < childCount; i46++) {
            View childAt2 = getChildAt(i46);
            if (childAt2.getVisibility() != 8) {
                e eVar2 = (e) childAt2.getLayoutParams();
                if (!eVar2.f13650a && (dVarM = m(childAt2)) != null) {
                    float f15 = i45;
                    int i47 = ((int) (dVarM.f13649e * f15)) + paddingLeft;
                    if (eVar2.f13653d) {
                        eVar2.f13653d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f15 * eVar2.f13652c), 1073741824), View.MeasureSpec.makeMeasureSpec((i25 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i47, paddingTop, childAt2.getMeasuredWidth() + i47, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f13625n = paddingTop;
        this.f13626p = i25 - paddingBottom;
        this.f13628q0 = i26;
        if (this.T) {
            z16 = false;
            E(this.f13616e, false, 0, false);
        } else {
            z16 = false;
        }
        this.T = z16;
    }

    @Override // android.view.View
    protected void onMeasure(int i15, int i16) {
        e eVar;
        e eVar2;
        int i17;
        setMeasuredDimension(View.getDefaultSize(0, i15), View.getDefaultSize(0, i16));
        int measuredWidth = getMeasuredWidth();
        this.C = Math.min(measuredWidth / 10, this.B);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i18 = 0;
        while (true) {
            boolean z15 = true;
            int i19 = 1073741824;
            if (i18 >= childCount) {
                break;
            }
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8 && (eVar2 = (e) childAt.getLayoutParams()) != null && eVar2.f13650a) {
                int i25 = eVar2.f13651b;
                int i26 = i25 & 7;
                int i27 = i25 & 112;
                boolean z16 = i27 == 48 || i27 == 80;
                if (i26 != 3 && i26 != 5) {
                    z15 = false;
                }
                int i28 = PKIFailureInfo.systemUnavail;
                if (z16) {
                    i17 = Integer.MIN_VALUE;
                    i28 = 1073741824;
                } else {
                    i17 = z15 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i29 = ((ViewGroup.LayoutParams) eVar2).width;
                if (i29 != -2) {
                    if (i29 == -1) {
                        i29 = paddingLeft;
                    }
                    i28 = 1073741824;
                } else {
                    i29 = paddingLeft;
                }
                int i35 = ((ViewGroup.LayoutParams) eVar2).height;
                if (i35 == -2) {
                    i35 = measuredHeight;
                    i19 = i17;
                } else if (i35 == -1) {
                    i35 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i29, i28), View.MeasureSpec.makeMeasureSpec(i35, i19));
                if (z16) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z15) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i18++;
        }
        this.f13631s = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f13633t = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f13636v = true;
        x();
        this.f13636v = false;
        int childCount2 = getChildCount();
        for (int i36 = 0; i36 < childCount2; i36++) {
            View childAt2 = getChildAt(i36);
            if (childAt2.getVisibility() != 8 && ((eVar = (e) childAt2.getLayoutParams()) == null || !eVar.f13650a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * eVar.f13652c), 1073741824), this.f13633t);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i15, Rect rect) {
        int i16;
        int i17;
        int i18;
        d dVarM;
        int childCount = getChildCount();
        if ((i15 & 2) != 0) {
            i17 = childCount;
            i16 = 0;
            i18 = 1;
        } else {
            i16 = childCount - 1;
            i17 = -1;
            i18 = -1;
        }
        while (i16 != i17) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 0 && (dVarM = m(childAt)) != null && dVarM.f13646b == this.f13616e && childAt.requestFocus(i15, rect)) {
                return true;
            }
            i16 += i18;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        this.f13617f = hVar.f13656c;
        this.f13618g = hVar.f13657d;
        this.f13619h = hVar.f13658e;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f13656c = this.f13616e;
        return hVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i15, int i16, int i17, int i18) {
        super.onSizeChanged(i15, i16, i17, i18);
        if (i15 != i17) {
            int i19 = this.f13623l;
            z(i15, i17, i19, i19);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.O) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    protected void r(int i15, float f15, int i16) {
        int iMax;
        int width;
        int left;
        if (this.f13628q0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = getChildAt(i17);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f13650a) {
                    int i18 = eVar.f13651b & 7;
                    if (i18 != 1) {
                        if (i18 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i18 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i19 = iMax;
                    width = paddingLeft;
                    paddingLeft = i19;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        f(i15, f15, i16);
        this.f13620h0 = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f13636v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        this.f13612a = 0;
        List<f> list = this.f13635u0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f13635u0.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f13635u0.get(i15).a(this, null, aVar);
        }
    }

    public void setCurrentItem(int i15) {
        this.f13640x = false;
        G(i15, !this.T, false);
    }

    public void setOffscreenPageLimit(int i15) {
        if (i15 < 1) {
            c2.g("ViewPager", "Requested offscreen page limit " + i15 + " too small; defaulting to 1");
            i15 = 1;
        }
        if (i15 != this.f13642y) {
            this.f13642y = i15;
            x();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(g gVar) {
        this.f13632s0 = gVar;
    }

    public void setPageMargin(int i15) {
        int i16 = this.f13623l;
        this.f13623l = i15;
        int width = getWidth();
        z(width, width, i15, i16);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f13624m = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i15) {
        if (this.f13643y0 == i15) {
            return;
        }
        this.f13643y0 = i15;
        h(i15);
    }

    boolean t() {
        int i15 = this.f13616e;
        if (i15 <= 0) {
            return false;
        }
        F(i15 - 1, true);
        return true;
    }

    boolean u() {
        return false;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f13624m;
    }

    void x() {
        y(this.f13616e);
    }

    void y(int i15) {
        int i16 = this.f13616e;
        if (i16 != i15) {
            o(i16);
            this.f13616e = i15;
        }
        J();
    }

    public static class e extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f13652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f13653d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f13654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f13655f;

        public e() {
            super(-1, -1);
            this.f13652c = 0.0f;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13652c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f13611z0);
            this.f13651b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i15) {
        setPageMarginDrawable(u5.a.f(getContext(), i15));
    }
}
