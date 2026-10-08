package s6;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import io.sentry.android.core.c2;
import j6.l0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Interpolator f178209x = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f178210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f178211b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f178213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f178214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f178215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f178216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f178217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f178218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f178219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f178220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f178221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f178222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f178223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f178224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f178225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f178226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private OverScroller f178227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AbstractC4563c f178228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f178229t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f178230u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ViewGroup f178231v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f178212c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f178232w = new b();

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f15) {
            float f16 = f15 - 1.0f;
            return (f16 * f16 * f16 * f16 * f16) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E(0);
        }
    }

    /* JADX INFO: renamed from: s6.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC4563c {
        public abstract int a(View view, int i15, int i16);

        public abstract int b(View view, int i15, int i16);

        public int c(int i15) {
            return i15;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i15, int i16) {
        }

        public boolean g(int i15) {
            return false;
        }

        public void h(int i15, int i16) {
        }

        public void i(View view, int i15) {
        }

        public abstract void j(int i15);

        public abstract void k(View view, int i15, int i16, int i17, int i18);

        public abstract void l(View view, float f15, float f16);

        public abstract boolean m(View view, int i15);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC4563c abstractC4563c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC4563c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f178231v = viewGroup;
        this.f178228s = abstractC4563c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i15 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f178225p = i15;
        this.f178224o = i15;
        this.f178211b = viewConfiguration.getScaledTouchSlop();
        this.f178222m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f178223n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f178227r = new OverScroller(context, f178209x);
    }

    private void A() {
        this.f178221l.computeCurrentVelocity(1000, this.f178222m);
        n(e(this.f178221l.getXVelocity(this.f178212c), this.f178223n, this.f178222m), e(this.f178221l.getYVelocity(this.f178212c), this.f178223n, this.f178222m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [s6.c$c] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void B(float f15, float f16, int i15) {
        int i16;
        boolean zC = c(f15, f16, i15, 1);
        ?? r15 = zC;
        if (c(f16, f15, i15, 4)) {
            r15 = (zC ? 1 : 0) | 4;
        }
        ?? r16 = r15;
        if (c(f15, f16, i15, 2)) {
            r16 = (r15 == true ? 1 : 0) | 2;
        }
        ?? r17 = r16;
        if (c(f16, f15, i15, 8)) {
            i16 = (r16 == true ? 1 : 0) | 8;
        }
        if (r17 == 0) {
            r17 = i16;
            return;
        }
        r17 = i16;
        int[] iArr = this.f178218i;
        iArr[i15] = (iArr[i15] | r17) == true ? 1 : 0;
        this.f178228s.f(r17, i15);
    }

    private void C(float f15, float f16, int i15) {
        q(i15);
        float[] fArr = this.f178213d;
        this.f178215f[i15] = f15;
        fArr[i15] = f15;
        float[] fArr2 = this.f178214e;
        this.f178216g[i15] = f16;
        fArr2[i15] = f16;
        this.f178217h[i15] = t((int) f15, (int) f16);
        this.f178220k |= 1 << i15;
    }

    private void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i15 = 0; i15 < pointerCount; i15++) {
            int pointerId = motionEvent.getPointerId(i15);
            if (x(pointerId)) {
                float x15 = motionEvent.getX(i15);
                float y15 = motionEvent.getY(i15);
                this.f178215f[pointerId] = x15;
                this.f178216g[pointerId] = y15;
            }
        }
    }

    private boolean c(float f15, float f16, int i15, int i16) {
        float fAbs = Math.abs(f15);
        float fAbs2 = Math.abs(f16);
        if ((this.f178217h[i15] & i16) == i16 && (this.f178226q & i16) != 0 && (this.f178219j[i15] & i16) != i16 && (this.f178218i[i15] & i16) != i16) {
            int i17 = this.f178211b;
            if (fAbs > i17 || fAbs2 > i17) {
                if (fAbs < fAbs2 * 0.5f && this.f178228s.g(i16)) {
                    int[] iArr = this.f178219j;
                    iArr[i15] = iArr[i15] | i16;
                    return false;
                }
                if ((this.f178218i[i15] & i16) == 0 && fAbs > this.f178211b) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean d(View view, float f15, float f16) {
        if (view == null) {
            return false;
        }
        boolean z15 = this.f178228s.d(view) > 0;
        boolean z16 = this.f178228s.e(view) > 0;
        if (z15 && z16) {
            float f17 = (f15 * f15) + (f16 * f16);
            int i15 = this.f178211b;
            return f17 > ((float) (i15 * i15));
        }
        if (z15) {
            return Math.abs(f15) > ((float) this.f178211b);
        }
        return z16 && Math.abs(f16) > ((float) this.f178211b);
    }

    private float e(float f15, float f16, float f17) {
        float fAbs = Math.abs(f15);
        if (fAbs < f16) {
            return 0.0f;
        }
        if (fAbs > f17) {
            return f15 > 0.0f ? f17 : -f17;
        }
        return f15;
    }

    private int f(int i15, int i16, int i17) {
        int iAbs = Math.abs(i15);
        if (iAbs < i16) {
            return 0;
        }
        if (iAbs > i17) {
            return i15 > 0 ? i17 : -i17;
        }
        return i15;
    }

    private void g() {
        float[] fArr = this.f178213d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f178214e, 0.0f);
        Arrays.fill(this.f178215f, 0.0f);
        Arrays.fill(this.f178216g, 0.0f);
        Arrays.fill(this.f178217h, 0);
        Arrays.fill(this.f178218i, 0);
        Arrays.fill(this.f178219j, 0);
        this.f178220k = 0;
    }

    private void h(int i15) {
        if (this.f178213d == null || !w(i15)) {
            return;
        }
        this.f178213d[i15] = 0.0f;
        this.f178214e[i15] = 0.0f;
        this.f178215f[i15] = 0.0f;
        this.f178216g[i15] = 0.0f;
        this.f178217h[i15] = 0;
        this.f178218i[i15] = 0;
        this.f178219j[i15] = 0;
        this.f178220k = (~(1 << i15)) & this.f178220k;
    }

    private int i(int i15, int i16, int i17) {
        if (i15 == 0) {
            return 0;
        }
        int width = this.f178231v.getWidth();
        float f15 = width / 2;
        float fO = f15 + (o(Math.min(1.0f, Math.abs(i15) / width)) * f15);
        int iAbs = Math.abs(i16);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fO / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i15) / i17) + 1.0f) * 256.0f), 600);
    }

    private int j(View view, int i15, int i16, int i17, int i18) {
        float f15;
        float f16;
        float f17;
        float f18;
        int iF = f(i17, (int) this.f178223n, (int) this.f178222m);
        int iF2 = f(i18, (int) this.f178223n, (int) this.f178222m);
        int iAbs = Math.abs(i15);
        int iAbs2 = Math.abs(i16);
        int iAbs3 = Math.abs(iF);
        int iAbs4 = Math.abs(iF2);
        int i19 = iAbs3 + iAbs4;
        int i25 = iAbs + iAbs2;
        if (iF != 0) {
            f15 = iAbs3;
            f16 = i19;
        } else {
            f15 = iAbs;
            f16 = i25;
        }
        float f19 = f15 / f16;
        if (iF2 != 0) {
            f17 = iAbs4;
            f18 = i19;
        } else {
            f17 = iAbs2;
            f18 = i25;
        }
        return (int) ((i(i15, iF, this.f178228s.d(view)) * f19) + (i(i16, iF2, this.f178228s.e(view)) * (f17 / f18)));
    }

    public static c l(ViewGroup viewGroup, float f15, AbstractC4563c abstractC4563c) {
        c cVarM = m(viewGroup, abstractC4563c);
        cVarM.f178211b = (int) (cVarM.f178211b * (1.0f / f15));
        return cVarM;
    }

    public static c m(ViewGroup viewGroup, AbstractC4563c abstractC4563c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC4563c);
    }

    private void n(float f15, float f16) {
        this.f178230u = true;
        this.f178228s.l(this.f178229t, f15, f16);
        this.f178230u = false;
        if (this.f178210a == 1) {
            E(0);
        }
    }

    private float o(float f15) {
        return (float) Math.sin((f15 - 0.5f) * 0.47123894f);
    }

    private void p(int i15, int i16, int i17, int i18) {
        int left = this.f178229t.getLeft();
        int top = this.f178229t.getTop();
        if (i17 != 0) {
            i15 = this.f178228s.a(this.f178229t, i15, i17);
            l0.Q(this.f178229t, i15 - left);
        }
        int i19 = i15;
        if (i18 != 0) {
            i16 = this.f178228s.b(this.f178229t, i16, i18);
            l0.R(this.f178229t, i16 - top);
        }
        int i25 = i16;
        if (i17 == 0 && i18 == 0) {
            return;
        }
        this.f178228s.k(this.f178229t, i19, i25, i19 - left, i25 - top);
    }

    private void q(int i15) {
        float[] fArr = this.f178213d;
        if (fArr == null || fArr.length <= i15) {
            int i16 = i15 + 1;
            float[] fArr2 = new float[i16];
            float[] fArr3 = new float[i16];
            float[] fArr4 = new float[i16];
            float[] fArr5 = new float[i16];
            int[] iArr = new int[i16];
            int[] iArr2 = new int[i16];
            int[] iArr3 = new int[i16];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f178214e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f178215f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f178216g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f178217h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f178218i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f178219j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f178213d = fArr2;
            this.f178214e = fArr3;
            this.f178215f = fArr4;
            this.f178216g = fArr5;
            this.f178217h = iArr;
            this.f178218i = iArr2;
            this.f178219j = iArr3;
        }
    }

    private boolean s(int i15, int i16, int i17, int i18) {
        int left = this.f178229t.getLeft();
        int top = this.f178229t.getTop();
        int i19 = i15 - left;
        int i25 = i16 - top;
        if (i19 == 0 && i25 == 0) {
            this.f178227r.abortAnimation();
            E(0);
            return false;
        }
        this.f178227r.startScroll(left, top, i19, i25, j(this.f178229t, i19, i25, i17, i18));
        E(2);
        return true;
    }

    private int t(int i15, int i16) {
        int i17 = i15 < this.f178231v.getLeft() + this.f178224o ? 1 : 0;
        if (i16 < this.f178231v.getTop() + this.f178224o) {
            i17 |= 4;
        }
        if (i15 > this.f178231v.getRight() - this.f178224o) {
            i17 |= 2;
        }
        return i16 > this.f178231v.getBottom() - this.f178224o ? i17 | 8 : i17;
    }

    private boolean x(int i15) {
        if (w(i15)) {
            return true;
        }
        c2.e("ViewDragHelper", "Ignoring pointerId=" + i15 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    void E(int i15) {
        this.f178231v.removeCallbacks(this.f178232w);
        if (this.f178210a != i15) {
            this.f178210a = i15;
            this.f178228s.j(i15);
            if (this.f178210a == 0) {
                this.f178229t = null;
            }
        }
    }

    public boolean F(int i15, int i16) {
        if (this.f178230u) {
            return s(i15, i16, (int) this.f178221l.getXVelocity(this.f178212c), (int) this.f178221l.getYVelocity(this.f178212c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    public boolean G(MotionEvent motionEvent) {
        View viewR;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f178221l == null) {
            this.f178221l = VelocityTracker.obtain();
        }
        this.f178221l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x15 = motionEvent.getX();
            float y15 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            C(x15, y15, pointerId);
            View viewR2 = r((int) x15, (int) y15);
            if (viewR2 == this.f178229t && this.f178210a == 2) {
                I(viewR2, pointerId);
            }
            int i15 = this.f178217h[pointerId];
            int i16 = this.f178226q;
            if ((i15 & i16) != 0) {
                this.f178228s.h(i15 & i16, pointerId);
            }
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x16 = motionEvent.getX(actionIndex);
                float y16 = motionEvent.getY(actionIndex);
                C(x16, y16, pointerId2);
                int i17 = this.f178210a;
                if (i17 == 0) {
                    int i18 = this.f178217h[pointerId2];
                    int i19 = this.f178226q;
                    if ((i18 & i19) != 0) {
                        this.f178228s.h(i18 & i19, pointerId2);
                    }
                } else if (i17 == 2 && (viewR = r((int) x16, (int) y16)) == this.f178229t) {
                    I(viewR, pointerId2);
                }
            } else if (actionMasked == 6) {
                h(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f178213d != null && this.f178214e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i25 = 0; i25 < pointerCount; i25++) {
                int pointerId3 = motionEvent.getPointerId(i25);
                if (x(pointerId3)) {
                    float x17 = motionEvent.getX(i25);
                    float y17 = motionEvent.getY(i25);
                    float f15 = x17 - this.f178213d[pointerId3];
                    float f16 = y17 - this.f178214e[pointerId3];
                    View viewR3 = r((int) x17, (int) y17);
                    boolean z15 = viewR3 != null && d(viewR3, f15, f16);
                    if (!z15) {
                        B(f15, f16, pointerId3);
                        if (this.f178210a != 1) {
                            break;
                        }
                    } else {
                        int left = viewR3.getLeft();
                        int i26 = (int) f15;
                        int iA = this.f178228s.a(viewR3, left + i26, i26);
                        int top = viewR3.getTop();
                        int i27 = (int) f16;
                        int iB = this.f178228s.b(viewR3, top + i27, i27);
                        int iD = this.f178228s.d(viewR3);
                        int iE = this.f178228s.e(viewR3);
                        if ((iD == 0 || (iD > 0 && iA == left)) && (iE == 0 || (iE > 0 && iB == top))) {
                            break;
                        }
                        B(f15, f16, pointerId3);
                        if (this.f178210a != 1 || (z15 && I(viewR3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            D(motionEvent);
        }
        return this.f178210a == 1;
    }

    public boolean H(View view, int i15, int i16) {
        this.f178229t = view;
        this.f178212c = -1;
        boolean zS = s(i15, i16, 0, 0);
        if (!zS && this.f178210a == 0 && this.f178229t != null) {
            this.f178229t = null;
        }
        return zS;
    }

    boolean I(View view, int i15) {
        if (view == this.f178229t && this.f178212c == i15) {
            return true;
        }
        if (view == null || !this.f178228s.m(view, i15)) {
            return false;
        }
        this.f178212c = i15;
        b(view, i15);
        return true;
    }

    public void a() {
        this.f178212c = -1;
        g();
        VelocityTracker velocityTracker = this.f178221l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f178221l = null;
        }
    }

    public void b(View view, int i15) {
        if (view.getParent() == this.f178231v) {
            this.f178229t = view;
            this.f178212c = i15;
            this.f178228s.i(view, i15);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f178231v + ")");
    }

    public boolean k(boolean z15) {
        if (this.f178210a == 2) {
            boolean zComputeScrollOffset = this.f178227r.computeScrollOffset();
            int currX = this.f178227r.getCurrX();
            int currY = this.f178227r.getCurrY();
            int left = currX - this.f178229t.getLeft();
            int top = currY - this.f178229t.getTop();
            if (left != 0) {
                l0.Q(this.f178229t, left);
            }
            if (top != 0) {
                l0.R(this.f178229t, top);
            }
            if (left != 0 || top != 0) {
                this.f178228s.k(this.f178229t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f178227r.getFinalX() && currY == this.f178227r.getFinalY()) {
                this.f178227r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z15) {
                    this.f178231v.post(this.f178232w);
                } else {
                    E(0);
                }
            }
        }
        return this.f178210a == 2;
    }

    public View r(int i15, int i16) {
        for (int childCount = this.f178231v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f178231v.getChildAt(this.f178228s.c(childCount));
            if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && i16 >= childAt.getTop() && i16 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int u() {
        return this.f178211b;
    }

    public boolean v(int i15, int i16) {
        return y(this.f178229t, i15, i16);
    }

    public boolean w(int i15) {
        return ((1 << i15) & this.f178220k) != 0;
    }

    public boolean y(View view, int i15, int i16) {
        return view != null && i15 >= view.getLeft() && i15 < view.getRight() && i16 >= view.getTop() && i16 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i15;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f178221l == null) {
            this.f178221l = VelocityTracker.obtain();
        }
        this.f178221l.addMovement(motionEvent);
        int i16 = 0;
        if (actionMasked == 0) {
            float x15 = motionEvent.getX();
            float y15 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewR = r((int) x15, (int) y15);
            C(x15, y15, pointerId);
            I(viewR, pointerId);
            int i17 = this.f178217h[pointerId];
            int i18 = this.f178226q;
            if ((i17 & i18) != 0) {
                this.f178228s.h(i17 & i18, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f178210a == 1) {
                A();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f178210a == 1) {
                if (x(this.f178212c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f178212c);
                    float x16 = motionEvent.getX(iFindPointerIndex);
                    float y16 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f178215f;
                    int i19 = this.f178212c;
                    int i25 = (int) (x16 - fArr[i19]);
                    int i26 = (int) (y16 - this.f178216g[i19]);
                    p(this.f178229t.getLeft() + i25, this.f178229t.getTop() + i26, i25, i26);
                    D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i16 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i16);
                if (x(pointerId2)) {
                    float x17 = motionEvent.getX(i16);
                    float y17 = motionEvent.getY(i16);
                    float f15 = x17 - this.f178213d[pointerId2];
                    float f16 = y17 - this.f178214e[pointerId2];
                    B(f15, f16, pointerId2);
                    if (this.f178210a != 1) {
                        View viewR2 = r((int) x17, (int) y17);
                        if (d(viewR2, f15, f16) && I(viewR2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i16++;
            }
            D(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f178210a == 1) {
                n(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x18 = motionEvent.getX(actionIndex);
            float y18 = motionEvent.getY(actionIndex);
            C(x18, y18, pointerId3);
            if (this.f178210a != 0) {
                if (v((int) x18, (int) y18)) {
                    I(this.f178229t, pointerId3);
                    return;
                }
                return;
            } else {
                I(r((int) x18, (int) y18), pointerId3);
                int i27 = this.f178217h[pointerId3];
                int i28 = this.f178226q;
                if ((i27 & i28) != 0) {
                    this.f178228s.h(i27 & i28, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f178210a == 1 && pointerId4 == this.f178212c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i16 >= pointerCount2) {
                    i15 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i16);
                if (pointerId5 != this.f178212c) {
                    View viewR3 = r((int) motionEvent.getX(i16), (int) motionEvent.getY(i16));
                    View view = this.f178229t;
                    if (viewR3 == view && I(view, pointerId5)) {
                        i15 = this.f178212c;
                        break;
                    }
                }
                i16++;
            }
            if (i15 == -1) {
                A();
            }
        }
        h(pointerId4);
    }
}
