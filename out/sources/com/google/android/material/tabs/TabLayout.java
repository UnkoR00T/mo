package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.e1;
import com.google.android.material.internal.n;
import com.google.android.material.internal.q;
import io.sentry.android.core.c2;
import j6.c0;
import j6.l0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import k6.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p007NuL.v;
import p082nUL.y;
import ri.j;
import ri.k;
import ri.l;

/* JADX INFO: loaded from: classes4.dex */
@androidx.viewpager.widget.b.c
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final int f35576y0 = k.f174074h;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final i6.f<f> f35577z0 = new i6.h(16);
    private final int A;
    private final int B;
    private int C;
    int D;
    int E;
    int F;
    int G;
    boolean H;
    boolean I;
    int K;
    int L;
    boolean O;
    private com.google.android.material.tabs.c P;
    private final TimeInterpolator R;
    private c T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f35578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<f> f35579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f35580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final e f35581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f35582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f35583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f35584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f35585h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final ArrayList<c> f35586h0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f35587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f35588k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f35589l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ColorStateList f35590m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ColorStateList f35591n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ColorStateList f35592p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Drawable f35593q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private c f35594q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f35595r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private ValueAnimator f35596r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    PorterDuff.Mode f35597s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    androidx.viewpager.widget.b f35598s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f35599t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private g f35600t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private b f35601u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    float f35602v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f35603v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    float f35604w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f35605w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final int f35606x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final i6.f<h> f35607x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f35608y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f35609z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    private class b implements androidx.viewpager.widget.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f35611a;

        b() {
        }

        @Override // androidx.viewpager.widget.b.f
        public void a(androidx.viewpager.widget.b bVar, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f35598s0 == bVar) {
                tabLayout.L(aVar2, this.f35611a);
            }
        }

        void b(boolean z15) {
            this.f35611a = z15;
        }
    }

    @Deprecated
    public interface c<T extends f> {
        void a(T t15);

        void b(T t15);

        void c(T t15);
    }

    public interface d extends c<f> {
    }

    class e extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ValueAnimator f35613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35614b;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f35616a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f35617b;

            a(View view, View view2) {
                this.f35616a = view;
                this.f35617b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                e.this.j(this.f35616a, this.f35617b, valueAnimator.getAnimatedFraction());
            }
        }

        e(Context context) {
            super(context);
            this.f35614b = -1;
            setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f35578a == -1) {
                tabLayout.f35578a = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f35578a);
        }

        private void f(int i15) {
            if (TabLayout.this.f35605w0 == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i15);
                com.google.android.material.tabs.c cVar = TabLayout.this.P;
                TabLayout tabLayout = TabLayout.this;
                cVar.c(tabLayout, childAt, tabLayout.f35593q);
                TabLayout.this.f35578a = i15;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(View view, View view2, float f15) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f35593q;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f35593q.getBounds().bottom);
            } else {
                com.google.android.material.tabs.c cVar = TabLayout.this.P;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f15, tabLayout.f35593q);
            }
            postInvalidateOnAnimation();
        }

        private void k(boolean z15, int i15, int i16) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f35578a == i15) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i15);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f35578a = i15;
            a aVar = new a(childAt, childAt2);
            if (!z15) {
                this.f35613a.removeAllUpdateListeners();
                this.f35613a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f35613a = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.R);
            valueAnimator.setDuration(i16);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        void c(int i15, int i16) {
            ValueAnimator valueAnimator = this.f35613a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f35578a != i15) {
                this.f35613a.cancel();
            }
            k(true, i15, i16);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                if (getChildAt(i15).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f35593q.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f35593q.getIntrinsicHeight();
            }
            int i15 = TabLayout.this.F;
            if (i15 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i15 != 1) {
                height = 0;
                if (i15 != 2) {
                    iHeight = i15 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.f35593q.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f35593q.getBounds();
                TabLayout.this.f35593q.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.f35593q.draw(canvas);
            }
            super.draw(canvas);
        }

        void h(int i15, float f15) {
            TabLayout.this.f35578a = Math.round(i15 + f15);
            ValueAnimator valueAnimator = this.f35613a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f35613a.cancel();
            }
            j(getChildAt(i15), getChildAt(i15 + 1), f15);
        }

        void i(int i15) {
            Rect bounds = TabLayout.this.f35593q.getBounds();
            TabLayout.this.f35593q.setBounds(bounds.left, 0, bounds.right, i15);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
            super.onLayout(z15, i15, i16, i17, i18);
            ValueAnimator valueAnimator = this.f35613a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i15, int i16) {
            super.onMeasure(i15, i16);
            if (View.MeasureSpec.getMode(i15) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z15 = true;
            if (tabLayout.D == 1 || tabLayout.G == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = getChildAt(i17);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) q.c(getContext(), 16)) * 2)) {
                    boolean z16 = false;
                    for (int i18 = 0; i18 < childCount; i18++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i18).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z16 = true;
                        }
                    }
                    z15 = z16;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.D = 0;
                    tabLayout2.T(false);
                }
                if (z15) {
                    super.onMeasure(i15, i16);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i15) {
            super.onRtlPropertiesChanged(i15);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f35619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Drawable f35620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f35621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f35622d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f35624f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TabLayout f35626h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public h f35627i;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f35623e = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f35625g = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f35628j = -1;

        public View e() {
            return this.f35624f;
        }

        public Drawable f() {
            return this.f35620b;
        }

        public int g() {
            return this.f35623e;
        }

        public int h() {
            return this.f35625g;
        }

        public CharSequence i() {
            return this.f35621c;
        }

        public boolean j() {
            TabLayout tabLayout = this.f35626h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f35623e;
        }

        void k() {
            this.f35626h = null;
            this.f35627i = null;
            this.f35619a = null;
            this.f35620b = null;
            this.f35628j = -1;
            this.f35621c = null;
            this.f35622d = null;
            this.f35623e = -1;
            this.f35624f = null;
        }

        public void l() {
            TabLayout tabLayout = this.f35626h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.J(this);
        }

        public f m(CharSequence charSequence) {
            this.f35622d = charSequence;
            s();
            return this;
        }

        public f n(int i15) {
            return o(LayoutInflater.from(this.f35627i.getContext()).inflate(i15, (ViewGroup) this.f35627i, false));
        }

        public f o(View view) {
            this.f35624f = view;
            s();
            return this;
        }

        public f p(Drawable drawable) {
            this.f35620b = drawable;
            TabLayout tabLayout = this.f35626h;
            if (tabLayout.D == 1 || tabLayout.G == 2) {
                tabLayout.T(true);
            }
            s();
            return this;
        }

        void q(int i15) {
            this.f35623e = i15;
        }

        public f r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f35622d) && !TextUtils.isEmpty(charSequence)) {
                this.f35627i.setContentDescription(charSequence);
            }
            this.f35621c = charSequence;
            s();
            return this;
        }

        void s() {
            h hVar = this.f35627i;
            if (hVar != null) {
                hVar.p();
            }
        }
    }

    public static class g implements androidx.viewpager.widget.b.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<TabLayout> f35629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f35631c;

        public g(TabLayout tabLayout) {
            this.f35629a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.b.g
        public void a(int i15, float f15, int i16) {
            TabLayout tabLayout = this.f35629a.get();
            if (tabLayout != null) {
                int i17 = this.f35631c;
                boolean z15 = true;
                if (i17 == 2 && this.f35630b != 1) {
                    z15 = false;
                }
                if (i17 == 2 && this.f35630b == 0) {
                    z15 = false;
                }
                tabLayout.O(i15, f15, z15, z15, false);
            }
        }

        @Override // androidx.viewpager.widget.b.g
        public void b(int i15) {
            this.f35630b = this.f35631c;
            this.f35631c = i15;
            TabLayout tabLayout = this.f35629a.get();
            if (tabLayout != null) {
                tabLayout.U(this.f35631c);
            }
        }

        @Override // androidx.viewpager.widget.b.g
        public void c(int i15) {
            TabLayout tabLayout = this.f35629a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i15 || i15 >= tabLayout.getTabCount()) {
                return;
            }
            int i16 = this.f35631c;
            tabLayout.K(tabLayout.A(i15), i16 == 0 || (i16 == 2 && this.f35630b == 0));
        }

        void d() {
            this.f35631c = 0;
            this.f35630b = 0;
        }
    }

    public final class h extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f35632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private TextView f35633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f35634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private View f35635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ti.a f35636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f35637f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private TextView f35638g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ImageView f35639h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Drawable f35640j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f35641k;

        class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f35643a;

            a(View view) {
                this.f35643a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27) {
                if (this.f35643a.getVisibility() == 0) {
                    h.this.o(this.f35643a);
                }
            }
        }

        public h(Context context) {
            super(context);
            this.f35641k = 2;
            q(context);
            setPaddingRelative(TabLayout.this.f35582e, TabLayout.this.f35583f, TabLayout.this.f35584g, TabLayout.this.f35585h);
            setGravity(17);
            setOrientation(!TabLayout.this.H ? 1 : 0);
            setClickable(true);
            l0.r0(this, c0.b(getContext(), 1002));
        }

        private void d(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float e(Layout layout, int i15, float f15) {
            return layout.getLineWidth(i15) * (f15 / layout.getPaint().getTextSize());
        }

        private void f(boolean z15) {
            setClipChildren(z15);
            setClipToPadding(z15);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z15);
                viewGroup.setClipToPadding(z15);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(Canvas canvas) {
            Drawable drawable = this.f35640j;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f35640j.draw(canvas);
            }
        }

        private ti.a getBadge() {
            return this.f35636e;
        }

        private ti.a getOrCreateBadge() {
            if (this.f35636e == null) {
                this.f35636e = ti.a.e(getContext());
            }
            n();
            ti.a aVar = this.f35636e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private boolean h() {
            return this.f35636e != null;
        }

        private void i() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(ri.h.f174020a, (ViewGroup) this, false);
            this.f35634c = imageView;
            addView(imageView, 0);
        }

        private void j() {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(ri.h.f174021b, (ViewGroup) this, false);
            this.f35633b = textView;
            addView(textView);
        }

        private void l(View view) {
            if (h() && view != null) {
                f(false);
                ti.c.a(this.f35636e, view, null);
                this.f35635d = view;
            }
        }

        private void m() {
            if (h()) {
                f(true);
                View view = this.f35635d;
                if (view != null) {
                    ti.c.b(this.f35636e, view);
                    this.f35635d = null;
                }
            }
        }

        private void n() {
            f fVar;
            f fVar2;
            if (h()) {
                if (this.f35637f != null) {
                    m();
                    return;
                }
                if (this.f35634c != null && (fVar2 = this.f35632a) != null && fVar2.f() != null) {
                    View view = this.f35635d;
                    ImageView imageView = this.f35634c;
                    if (view == imageView) {
                        o(imageView);
                        return;
                    } else {
                        m();
                        l(this.f35634c);
                        return;
                    }
                }
                if (this.f35633b == null || (fVar = this.f35632a) == null || fVar.h() != 1) {
                    m();
                    return;
                }
                View view2 = this.f35635d;
                TextView textView = this.f35633b;
                if (view2 == textView) {
                    o(textView);
                } else {
                    m();
                    l(this.f35633b);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(View view) {
            if (h() && view == this.f35635d) {
                ti.c.c(this.f35636e, view, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(Context context) {
            GradientDrawable gradientDrawable;
            int i15 = TabLayout.this.f35606x;
            if (i15 != 0) {
                Drawable drawableB = y.b(context, i15);
                this.f35640j = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.f35640j.setState(getDrawableState());
                }
            } else {
                this.f35640j = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (TabLayout.this.f35592p != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListA = jj.a.a(TabLayout.this.f35592p);
                boolean z15 = TabLayout.this.O;
                if (z15) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, z15 ? null : gradientDrawable3);
            }
            setBackground(rippleDrawable);
            TabLayout.this.invalidate();
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0060  */
        private void t(TextView textView, ImageView imageView, boolean z15) {
            boolean z16;
            f fVar = this.f35632a;
            Drawable drawableMutate = (fVar == null || fVar.f() == null) ? null : y5.a.r(this.f35632a.f()).mutate();
            if (drawableMutate != null) {
                drawableMutate.setTintList(TabLayout.this.f35591n);
                PorterDuff.Mode mode = TabLayout.this.f35597s;
                if (mode != null) {
                    drawableMutate.setTintMode(mode);
                }
            }
            f fVar2 = this.f35632a;
            CharSequence charSequenceI = fVar2 != null ? fVar2.i() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceI);
            if (textView != null) {
                if (!zIsEmpty) {
                    z16 = this.f35632a.f35625g == 1;
                }
                textView.setText(!zIsEmpty ? charSequenceI : null);
                textView.setVisibility(z16 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z16 = false;
            }
            if (z15 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iC = (z16 && imageView.getVisibility() == 0) ? (int) q.c(getContext(), 8) : 0;
                if (TabLayout.this.H) {
                    if (iC != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iC);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iC != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iC;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            f fVar3 = this.f35632a;
            CharSequence charSequence = fVar3 != null ? fVar3.f35622d : null;
            if (zIsEmpty) {
                charSequenceI = charSequence;
            }
            e1.a(this, charSequenceI);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f35640j;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f35640j.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f35633b, this.f35634c, this.f35637f};
            int iMax = 0;
            int iMin = 0;
            boolean z15 = false;
            for (int i15 = 0; i15 < 3; i15++) {
                View view = viewArr[i15];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z15 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z15 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z15 = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f35633b, this.f35634c, this.f35637f};
            int iMax = 0;
            int iMin = 0;
            boolean z15 = false;
            for (int i15 = 0; i15 < 3; i15++) {
                View view = viewArr[i15];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z15 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z15 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z15 = true;
                }
            }
            return iMax - iMin;
        }

        public f getTab() {
            return this.f35632a;
        }

        void k() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            p pVarF1 = p.f1(accessibilityNodeInfo);
            ti.a aVar = this.f35636e;
            if (aVar != null && aVar.isVisible()) {
                pVarF1.s0(this.f35636e.i());
            }
            pVarF1.r0(p.g.a(0, 1, this.f35632a.g(), 1, false, isSelected()));
            if (isSelected()) {
                pVarF1.p0(false);
                pVarF1.f0(p.a.f108665i);
            }
            pVarF1.O0(getResources().getString(j.f174048h));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i15, int i16) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i15);
            int mode = View.MeasureSpec.getMode(i15);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i15 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f35608y, PKIFailureInfo.systemUnavail);
            }
            super.onMeasure(i15, i16);
            if (this.f35633b != null) {
                float f15 = TabLayout.this.f35599t;
                if (isSelected() && TabLayout.this.f35589l != -1) {
                    f15 = TabLayout.this.f35602v;
                }
                int i17 = this.f35641k;
                ImageView imageView = this.f35634c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f35633b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f15 = TabLayout.this.f35604w;
                    }
                } else {
                    i17 = 1;
                }
                float textSize = this.f35633b.getTextSize();
                int lineCount = this.f35633b.getLineCount();
                int maxLines = this.f35633b.getMaxLines();
                if (f15 != textSize || (maxLines >= 0 && i17 != maxLines)) {
                    if (TabLayout.this.G != 1 || f15 <= textSize || lineCount != 1 || ((layout = this.f35633b.getLayout()) != null && e(layout, 0, f15) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f35633b.setTextSize(0, f15);
                        this.f35633b.setMaxLines(i17);
                        super.onMeasure(i15, i16);
                    }
                }
            }
        }

        final void p() {
            s();
            f fVar = this.f35632a;
            setSelected(fVar != null && fVar.j());
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f35632a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f35632a.l();
            return true;
        }

        final void r() {
            setOrientation(!TabLayout.this.H ? 1 : 0);
            TextView textView = this.f35638g;
            if (textView == null && this.f35639h == null) {
                t(this.f35633b, this.f35634c, true);
            } else {
                t(textView, this.f35639h, false);
            }
        }

        final void s() {
            ViewParent parent;
            f fVar = this.f35632a;
            View viewE = fVar != null ? fVar.e() : null;
            if (viewE != null) {
                ViewParent parent2 = viewE.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewE);
                    }
                    View view = this.f35637f;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f35637f);
                    }
                    addView(viewE);
                }
                this.f35637f = viewE;
                TextView textView = this.f35633b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f35634c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f35634c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewE.findViewById(R.id.text1);
                this.f35638g = textView2;
                if (textView2 != null) {
                    this.f35641k = textView2.getMaxLines();
                }
                this.f35639h = (ImageView) viewE.findViewById(R.id.icon);
            } else {
                View view2 = this.f35637f;
                if (view2 != null) {
                    removeView(view2);
                    this.f35637f = null;
                }
                this.f35638g = null;
                this.f35639h = null;
            }
            if (this.f35637f == null) {
                if (this.f35634c == null) {
                    i();
                }
                if (this.f35633b == null) {
                    j();
                    this.f35641k = this.f35633b.getMaxLines();
                }
                androidx.core.widget.h.m(this.f35633b, TabLayout.this.f35587j);
                if (!isSelected() || TabLayout.this.f35589l == -1) {
                    androidx.core.widget.h.m(this.f35633b, TabLayout.this.f35588k);
                } else {
                    androidx.core.widget.h.m(this.f35633b, TabLayout.this.f35589l);
                }
                ColorStateList colorStateList = TabLayout.this.f35590m;
                if (colorStateList != null) {
                    this.f35633b.setTextColor(colorStateList);
                }
                t(this.f35633b, this.f35634c, true);
                n();
                d(this.f35634c);
                d(this.f35633b);
            } else {
                TextView textView3 = this.f35638g;
                if (textView3 != null || this.f35639h != null) {
                    t(textView3, this.f35639h, false);
                }
            }
            if (fVar == null || TextUtils.isEmpty(fVar.f35622d)) {
                return;
            }
            setContentDescription(fVar.f35622d);
        }

        @Override // android.view.View
        public void setSelected(boolean z15) {
            isSelected();
            super.setSelected(z15);
            TextView textView = this.f35633b;
            if (textView != null) {
                textView.setSelected(z15);
            }
            ImageView imageView = this.f35634c;
            if (imageView != null) {
                imageView.setSelected(z15);
            }
            View view = this.f35637f;
            if (view != null) {
                view.setSelected(z15);
            }
        }

        void setTab(f fVar) {
            if (fVar != this.f35632a) {
                this.f35632a = fVar;
                p();
            }
        }
    }

    public static class i implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.viewpager.widget.b f35645a;

        public i(androidx.viewpager.widget.b bVar) {
            this.f35645a = bVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(f fVar) {
            this.f35645a.setCurrentItem(fVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(f fVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ri.b.T);
    }

    private boolean B() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void I(int i15) {
        h hVar = (h) this.f35581d.getChildAt(i15);
        this.f35581d.removeViewAt(i15);
        if (hVar != null) {
            hVar.k();
            this.f35607x0.A(hVar);
        }
        requestLayout();
    }

    private void Q(androidx.viewpager.widget.b bVar, boolean z15, boolean z16) {
        androidx.viewpager.widget.b bVar2 = this.f35598s0;
        if (bVar2 != null) {
            g gVar = this.f35600t0;
            if (gVar != null) {
                bVar2.B(gVar);
            }
            b bVar3 = this.f35601u0;
            if (bVar3 != null) {
                this.f35598s0.A(bVar3);
            }
        }
        c cVar = this.f35594q0;
        if (cVar != null) {
            H(cVar);
            this.f35594q0 = null;
        }
        if (bVar != null) {
            this.f35598s0 = bVar;
            if (this.f35600t0 == null) {
                this.f35600t0 = new g(this);
            }
            this.f35600t0.d();
            bVar.b(this.f35600t0);
            i iVar = new i(bVar);
            this.f35594q0 = iVar;
            g(iVar);
            bVar.getAdapter();
            if (this.f35601u0 == null) {
                this.f35601u0 = new b();
            }
            this.f35601u0.b(z15);
            bVar.a(this.f35601u0);
            M(bVar.getCurrentItem(), 0.0f, true);
        } else {
            this.f35598s0 = null;
            L(null, false);
        }
        this.f35603v0 = z16;
    }

    private void R() {
        int size = this.f35579b.size();
        for (int i15 = 0; i15 < size; i15++) {
            this.f35579b.get(i15).s();
        }
    }

    private void S(LinearLayout.LayoutParams layoutParams) {
        if (this.G == 1 && this.D == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private int getDefaultHeight() {
        int size = this.f35579b.size();
        for (int i15 = 0; i15 < size; i15++) {
            f fVar = this.f35579b.get(i15);
            if (fVar != null && fVar.f() != null && !TextUtils.isEmpty(fVar.i())) {
                return !this.H ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i15 = this.f35609z;
        if (i15 != -1) {
            return i15;
        }
        int i16 = this.G;
        if (i16 == 0 || i16 == 2) {
            return this.B;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f35581d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void k(com.google.android.material.tabs.d dVar) {
        f fVarD = D();
        CharSequence charSequence = dVar.f35646a;
        if (charSequence != null) {
            fVarD.r(charSequence);
        }
        Drawable drawable = dVar.f35647b;
        if (drawable != null) {
            fVarD.p(drawable);
        }
        int i15 = dVar.f35648c;
        if (i15 != 0) {
            fVarD.n(i15);
        }
        if (!TextUtils.isEmpty(dVar.getContentDescription())) {
            fVarD.m(dVar.getContentDescription());
        }
        h(fVarD);
    }

    private void l(f fVar) {
        h hVar = fVar.f35627i;
        hVar.setSelected(false);
        hVar.setActivated(false);
        this.f35581d.addView(hVar, fVar.g(), t());
    }

    private void m(View view) {
        if (!(view instanceof com.google.android.material.tabs.d)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        k((com.google.android.material.tabs.d) view);
    }

    private void n(int i15) {
        if (i15 == -1) {
            return;
        }
        if (getWindowToken() == null || !isLaidOut() || this.f35581d.d()) {
            M(i15, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iQ = q(i15, 0.0f);
        if (scrollX != iQ) {
            z();
            this.f35596r0.setIntValues(scrollX, iQ);
            this.f35596r0.start();
        }
        this.f35581d.c(i15, this.E);
    }

    private void o(int i15) {
        if (i15 == 0) {
            c2.g("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i15 == 1) {
            this.f35581d.setGravity(1);
            return;
        } else if (i15 != 2) {
            return;
        }
        this.f35581d.setGravity(8388611);
    }

    private void p() {
        int i15 = this.G;
        this.f35581d.setPaddingRelative((i15 == 0 || i15 == 2) ? Math.max(0, this.C - this.f35582e) : 0, 0, 0, 0);
        int i16 = this.G;
        if (i16 == 0) {
            o(this.D);
        } else if (i16 == 1 || i16 == 2) {
            if (this.D == 2) {
                c2.g("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f35581d.setGravity(1);
        }
        T(true);
    }

    private int q(int i15, float f15) {
        View childAt;
        int i16 = this.G;
        if ((i16 != 0 && i16 != 2) || (childAt = this.f35581d.getChildAt(i15)) == null) {
            return 0;
        }
        int i17 = i15 + 1;
        View childAt2 = i17 < this.f35581d.getChildCount() ? this.f35581d.getChildAt(i17) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i18 = (int) ((width + width2) * 0.5f * f15);
        return getLayoutDirection() == 0 ? left + i18 : left - i18;
    }

    private void r(f fVar, int i15) {
        fVar.q(i15);
        this.f35579b.add(i15, fVar);
        int size = this.f35579b.size();
        int i16 = -1;
        for (int i17 = i15 + 1; i17 < size; i17++) {
            if (this.f35579b.get(i17).g() == this.f35578a) {
                i16 = i17;
            }
            this.f35579b.get(i17).q(i17);
        }
        this.f35578a = i16;
    }

    private static ColorStateList s(int i15, int i16) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i16, i15});
    }

    private void setSelectedTabView(int i15) {
        int childCount = this.f35581d.getChildCount();
        if (i15 < childCount) {
            int i16 = 0;
            while (i16 < childCount) {
                View childAt = this.f35581d.getChildAt(i16);
                if ((i16 != i15 || childAt.isSelected()) && (i16 == i15 || !childAt.isSelected())) {
                    childAt.setSelected(i16 == i15);
                    childAt.setActivated(i16 == i15);
                } else {
                    childAt.setSelected(i16 == i15);
                    childAt.setActivated(i16 == i15);
                    if (childAt instanceof h) {
                        ((h) childAt).s();
                    }
                }
                i16++;
            }
        }
    }

    private LinearLayout.LayoutParams t() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        S(layoutParams);
        return layoutParams;
    }

    private h v(f fVar) {
        i6.f<h> fVar2 = this.f35607x0;
        h hVarZ = fVar2 != null ? fVar2.z() : null;
        if (hVarZ == null) {
            hVarZ = new h(getContext());
        }
        hVarZ.setTab(fVar);
        hVarZ.setFocusable(true);
        hVarZ.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f35622d)) {
            hVarZ.setContentDescription(fVar.f35621c);
            return hVarZ;
        }
        hVarZ.setContentDescription(fVar.f35622d);
        return hVarZ;
    }

    private void w(f fVar) {
        for (int size = this.f35586h0.size() - 1; size >= 0; size--) {
            this.f35586h0.get(size).c(fVar);
        }
    }

    private void x(f fVar) {
        for (int size = this.f35586h0.size() - 1; size >= 0; size--) {
            this.f35586h0.get(size).a(fVar);
        }
    }

    private void y(f fVar) {
        for (int size = this.f35586h0.size() - 1; size >= 0; size--) {
            this.f35586h0.get(size).b(fVar);
        }
    }

    private void z() {
        if (this.f35596r0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f35596r0 = valueAnimator;
            valueAnimator.setInterpolator(this.R);
            this.f35596r0.setDuration(this.E);
            this.f35596r0.addUpdateListener(new a());
        }
    }

    public f A(int i15) {
        if (i15 < 0 || i15 >= getTabCount()) {
            return null;
        }
        return this.f35579b.get(i15);
    }

    public boolean C() {
        return this.I;
    }

    public f D() {
        f fVarU = u();
        fVarU.f35626h = this;
        fVarU.f35627i = v(fVarU);
        if (fVarU.f35628j != -1) {
            fVarU.f35627i.setId(fVarU.f35628j);
        }
        return fVarU;
    }

    void E() {
        G();
    }

    protected boolean F(f fVar) {
        return f35577z0.A(fVar);
    }

    public void G() {
        for (int childCount = this.f35581d.getChildCount() - 1; childCount >= 0; childCount--) {
            I(childCount);
        }
        Iterator<f> it = this.f35579b.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.k();
            F(next);
        }
        this.f35580c = null;
    }

    @Deprecated
    public void H(c cVar) {
        this.f35586h0.remove(cVar);
    }

    public void J(f fVar) {
        K(fVar, true);
    }

    public void K(f fVar, boolean z15) {
        f fVar2 = this.f35580c;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                w(fVar);
                n(fVar.g());
                return;
            }
            return;
        }
        int iG = fVar != null ? fVar.g() : -1;
        if (z15) {
            if ((fVar2 == null || fVar2.g() == -1) && iG != -1) {
                M(iG, 0.0f, true);
            } else {
                n(iG);
            }
            if (iG != -1) {
                setSelectedTabView(iG);
            }
        }
        this.f35580c = fVar;
        if (fVar2 != null && fVar2.f35626h != null) {
            y(fVar2);
        }
        if (fVar != null) {
            x(fVar);
        }
    }

    void L(androidx.viewpager.widget.a aVar, boolean z15) {
        E();
    }

    public void M(int i15, float f15, boolean z15) {
        N(i15, f15, z15, true);
    }

    public void N(int i15, float f15, boolean z15, boolean z16) {
        O(i15, f15, z15, z16, true);
    }

    void O(int i15, float f15, boolean z15, boolean z16, boolean z17) {
        int iRound = Math.round(i15 + f15);
        if (iRound < 0 || iRound >= this.f35581d.getChildCount()) {
            return;
        }
        if (z16) {
            this.f35581d.h(i15, f15);
        }
        ValueAnimator valueAnimator = this.f35596r0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f35596r0.cancel();
        }
        int iQ = q(i15, f15);
        int scrollX = getScrollX();
        boolean z18 = (i15 < getSelectedTabPosition() && iQ >= scrollX) || (i15 > getSelectedTabPosition() && iQ <= scrollX) || i15 == getSelectedTabPosition();
        if (getLayoutDirection() == 1) {
            z18 = (i15 < getSelectedTabPosition() && iQ <= scrollX) || (i15 > getSelectedTabPosition() && iQ >= scrollX) || i15 == getSelectedTabPosition();
        }
        if (z18 || this.f35605w0 == 1 || z17) {
            if (i15 < 0) {
                iQ = 0;
            }
            scrollTo(iQ, 0);
        }
        if (z15) {
            setSelectedTabView(iRound);
        }
    }

    public void P(androidx.viewpager.widget.b bVar, boolean z15) {
        Q(bVar, z15, false);
    }

    void T(boolean z15) {
        for (int i15 = 0; i15 < this.f35581d.getChildCount(); i15++) {
            View childAt = this.f35581d.getChildAt(i15);
            childAt.setMinimumWidth(getTabMinWidth());
            S((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z15) {
                childAt.requestLayout();
            }
        }
    }

    void U(int i15) {
        this.f35605w0 = i15;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m(view);
    }

    @Deprecated
    public void g(c cVar) {
        if (this.f35586h0.contains(cVar)) {
            return;
        }
        this.f35586h0.add(cVar);
    }

    public int getSelectedTabPosition() {
        f fVar = this.f35580c;
        if (fVar != null) {
            return fVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f35579b.size();
    }

    public int getTabGravity() {
        return this.D;
    }

    public ColorStateList getTabIconTint() {
        return this.f35591n;
    }

    public int getTabIndicatorAnimationMode() {
        return this.L;
    }

    public int getTabIndicatorGravity() {
        return this.F;
    }

    int getTabMaxWidth() {
        return this.f35608y;
    }

    public int getTabMode() {
        return this.G;
    }

    public ColorStateList getTabRippleColor() {
        return this.f35592p;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f35593q;
    }

    public ColorStateList getTabTextColors() {
        return this.f35590m;
    }

    public void h(f fVar) {
        j(fVar, this.f35579b.isEmpty());
    }

    public void i(f fVar, int i15, boolean z15) {
        if (fVar.f35626h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        r(fVar, i15);
        l(fVar);
        if (z15) {
            fVar.l();
        }
    }

    public void j(f fVar, boolean z15) {
        i(fVar, this.f35579b.size(), z15);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        lj.i.e(this);
        if (this.f35598s0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof androidx.viewpager.widget.b) {
                Q((androidx.viewpager.widget.b) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f35603v0) {
            setupWithViewPager(null);
            this.f35603v0 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i15 = 0; i15 < this.f35581d.getChildCount(); i15++) {
            View childAt = this.f35581d.getChildAt(i15);
            if (childAt instanceof h) {
                ((h) childAt).g(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p.f1(accessibilityNodeInfo).q0(p.f.a(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return B() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        int iRound = Math.round(q.c(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i16);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i16 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i16) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i15);
        if (View.MeasureSpec.getMode(i15) != 0) {
            int iC = this.A;
            if (iC <= 0) {
                iC = (int) (size - q.c(getContext(), 56));
            }
            this.f35608y = iC;
        }
        super.onMeasure(i15, i16);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i17 = this.G;
            if (i17 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i17 != 1) {
                if (i17 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i16, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || B()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f15) {
        super.setElevation(f15);
        lj.i.d(this, f15);
    }

    public void setInlineLabel(boolean z15) {
        if (this.H != z15) {
            this.H = z15;
            for (int i15 = 0; i15 < this.f35581d.getChildCount(); i15++) {
                View childAt = this.f35581d.getChildAt(i15);
                if (childAt instanceof h) {
                    ((h) childAt).r();
                }
            }
            p();
        }
    }

    public void setInlineLabelResource(int i15) {
        setInlineLabel(getResources().getBoolean(i15));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        z();
        this.f35596r0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = y5.a.r(drawable).mutate();
        this.f35593q = drawableMutate;
        com.google.android.material.drawable.c.k(drawableMutate, this.f35595r);
        int intrinsicHeight = this.K;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f35593q.getIntrinsicHeight();
        }
        this.f35581d.i(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i15) {
        this.f35595r = i15;
        com.google.android.material.drawable.c.k(this.f35593q, i15);
        T(false);
    }

    public void setSelectedTabIndicatorGravity(int i15) {
        if (this.F != i15) {
            this.F = i15;
            this.f35581d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i15) {
        this.K = i15;
        this.f35581d.i(i15);
    }

    public void setTabGravity(int i15) {
        if (this.D != i15) {
            this.D = i15;
            p();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f35591n != colorStateList) {
            this.f35591n = colorStateList;
            R();
        }
    }

    public void setTabIconTintResource(int i15) {
        setTabIconTint(y.a(getContext(), i15));
    }

    public void setTabIndicatorAnimationMode(int i15) {
        this.L = i15;
        if (i15 == 0) {
            this.P = new com.google.android.material.tabs.c();
            return;
        }
        if (i15 == 1) {
            this.P = new com.google.android.material.tabs.a();
        } else {
            if (i15 == 2) {
                this.P = new com.google.android.material.tabs.b();
                return;
            }
            throw new IllegalArgumentException(i15 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z15) {
        this.I = z15;
        this.f35581d.g();
        this.f35581d.postInvalidateOnAnimation();
    }

    public void setTabMode(int i15) {
        if (i15 != this.G) {
            this.G = i15;
            p();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f35592p != colorStateList) {
            this.f35592p = colorStateList;
            for (int i15 = 0; i15 < this.f35581d.getChildCount(); i15++) {
                View childAt = this.f35581d.getChildAt(i15);
                if (childAt instanceof h) {
                    ((h) childAt).q(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i15) {
        setTabRippleColor(y.a(getContext(), i15));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f35590m != colorStateList) {
            this.f35590m = colorStateList;
            R();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        L(aVar, false);
    }

    public void setUnboundedRipple(boolean z15) {
        if (this.O != z15) {
            this.O = z15;
            for (int i15 = 0; i15 < this.f35581d.getChildCount(); i15++) {
                View childAt = this.f35581d.getChildAt(i15);
                if (childAt instanceof h) {
                    ((h) childAt).q(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i15) {
        setUnboundedRipple(getResources().getBoolean(i15));
    }

    public void setupWithViewPager(androidx.viewpager.widget.b bVar) {
        P(bVar, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    protected f u() {
        f fVarZ = f35577z0.z();
        return fVarZ == null ? new f() : fVarZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i15) {
        int i16 = f35576y0;
        super(pj.a.d(context, attributeSet, i15, i16), attributeSet, i15);
        this.f35578a = -1;
        this.f35579b = new ArrayList<>();
        this.f35589l = -1;
        this.f35595r = 0;
        this.f35608y = Integer.MAX_VALUE;
        this.K = -1;
        this.f35586h0 = new ArrayList<>();
        this.f35607x0 = new i6.g(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context2);
        this.f35581d = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayI = n.i(context2, attributeSet, l.Q4, i15, i16, l.f174219p5);
        ColorStateList colorStateListF = com.google.android.material.drawable.c.f(getBackground());
        if (colorStateListF != null) {
            lj.h hVar = new lj.h();
            hVar.g0(colorStateListF);
            hVar.U(context2);
            hVar.f0(getElevation());
            setBackground(hVar);
        }
        setSelectedTabIndicator(ij.c.d(context2, typedArrayI, l.W4));
        setSelectedTabIndicatorColor(typedArrayI.getColor(l.Z4, 0));
        eVar.i(typedArrayI.getDimensionPixelSize(l.f174115c5, -1));
        setSelectedTabIndicatorGravity(typedArrayI.getInt(l.f174107b5, 0));
        setTabIndicatorAnimationMode(typedArrayI.getInt(l.Y4, 0));
        setTabIndicatorFullWidth(typedArrayI.getBoolean(l.f174099a5, true));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(l.f174155h5, 0);
        this.f35585h = dimensionPixelSize;
        this.f35584g = dimensionPixelSize;
        this.f35583f = dimensionPixelSize;
        this.f35582e = dimensionPixelSize;
        this.f35582e = typedArrayI.getDimensionPixelSize(l.f174179k5, dimensionPixelSize);
        this.f35583f = typedArrayI.getDimensionPixelSize(l.f174187l5, this.f35583f);
        this.f35584g = typedArrayI.getDimensionPixelSize(l.f174171j5, this.f35584g);
        this.f35585h = typedArrayI.getDimensionPixelSize(l.f174163i5, this.f35585h);
        if (n.g(context2)) {
            this.f35587j = ri.b.W;
        } else {
            this.f35587j = ri.b.U;
        }
        int resourceId = typedArrayI.getResourceId(l.f174219p5, k.f174069c);
        this.f35588k = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, v.f505n2);
        try {
            this.f35599t = typedArrayObtainStyledAttributes.getDimensionPixelSize(v.f510o2, 0);
            this.f35590m = ij.c.a(context2, typedArrayObtainStyledAttributes, v.f525r2);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayI.hasValue(l.f174203n5)) {
                this.f35589l = typedArrayI.getResourceId(l.f174203n5, resourceId);
            }
            int i17 = this.f35589l;
            if (i17 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i17, v.f505n2);
                try {
                    this.f35602v = typedArrayObtainStyledAttributes2.getDimensionPixelSize(v.f510o2, (int) this.f35599t);
                    ColorStateList colorStateListA = ij.c.a(context2, typedArrayObtainStyledAttributes2, v.f525r2);
                    if (colorStateListA != null) {
                        this.f35590m = s(this.f35590m.getDefaultColor(), colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th4) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th4;
                }
            }
            if (typedArrayI.hasValue(l.f174227q5)) {
                this.f35590m = ij.c.a(context2, typedArrayI, l.f174227q5);
            }
            if (typedArrayI.hasValue(l.f174211o5)) {
                this.f35590m = s(this.f35590m.getDefaultColor(), typedArrayI.getColor(l.f174211o5, 0));
            }
            this.f35591n = ij.c.a(context2, typedArrayI, l.U4);
            this.f35597s = q.h(typedArrayI.getInt(l.V4, -1), null);
            this.f35592p = ij.c.a(context2, typedArrayI, l.f174195m5);
            this.E = typedArrayI.getInt(l.X4, 300);
            this.R = gj.e.g(context2, ri.b.F, si.a.f181917b);
            this.f35609z = typedArrayI.getDimensionPixelSize(l.f174139f5, -1);
            this.A = typedArrayI.getDimensionPixelSize(l.f174131e5, -1);
            this.f35606x = typedArrayI.getResourceId(l.R4, 0);
            this.C = typedArrayI.getDimensionPixelSize(l.S4, 0);
            this.G = typedArrayI.getInt(l.f174147g5, 1);
            this.D = typedArrayI.getInt(l.T4, 0);
            this.H = typedArrayI.getBoolean(l.f174123d5, false);
            this.O = typedArrayI.getBoolean(l.f174235r5, false);
            typedArrayI.recycle();
            Resources resources = getResources();
            this.f35604w = resources.getDimensionPixelSize(ri.d.f173952h);
            this.B = resources.getDimensionPixelSize(ri.d.f173950g);
            p();
        } catch (Throwable th5) {
            typedArrayObtainStyledAttributes.recycle();
            throw th5;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i15) {
        m(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.T;
        if (cVar2 != null) {
            H(cVar2);
        }
        this.T = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i15, ViewGroup.LayoutParams layoutParams) {
        m(view);
    }

    public void setSelectedTabIndicator(int i15) {
        if (i15 != 0) {
            setSelectedTabIndicator(y.b(getContext(), i15));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
