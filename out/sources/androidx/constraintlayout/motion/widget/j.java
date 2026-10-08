package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.sentry.android.core.c2;
import j6.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j extends ConstraintLayout implements w {
    public static boolean V0;
    float A0;
    private boolean B0;
    Interpolator C;
    private ArrayList<h> C0;
    Interpolator D;
    private ArrayList<h> D0;
    float E;
    private ArrayList<h> E0;
    private int F;
    private CopyOnWriteArrayList<c> F0;
    int G;
    private int G0;
    private int H;
    private float H0;
    private boolean I;
    boolean I0;
    protected boolean J0;
    HashMap<View, g> K;
    float K0;
    private long L;
    private boolean L0;
    private b M0;
    private Runnable N0;
    private float O;
    private int[] O0;
    float P;
    int P0;
    private int Q0;
    float R;
    private boolean R0;
    d S0;
    private long T;
    private boolean T0;
    ArrayList<Integer> U0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    float f11242h0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f11243q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    boolean f11244r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private c f11245s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    int f11246t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f11247u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private androidx.constraintlayout.motion.widget.b f11248v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    boolean f11249w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    float f11250x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    float f11251y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    long f11252z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.M0.a();
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f11254a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f11255b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f11256c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f11257d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final String f11258e = "motion.progress";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f11259f = "motion.velocity";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final String f11260g = "motion.StartState";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final String f11261h = "motion.EndState";

        b() {
        }

        void a() {
            int i15 = this.f11256c;
            if (i15 != -1 || this.f11257d != -1) {
                if (i15 == -1) {
                    j.this.R(this.f11257d);
                } else {
                    int i16 = this.f11257d;
                    if (i16 == -1) {
                        j.this.O(i15, -1, -1);
                    } else {
                        j.this.P(i15, i16);
                    }
                }
                j.this.setState(d.SETUP);
            }
            if (Float.isNaN(this.f11255b)) {
                if (Float.isNaN(this.f11254a)) {
                    return;
                }
                j.this.setProgress(this.f11254a);
            } else {
                j.this.N(this.f11254a, this.f11255b);
                this.f11254a = Float.NaN;
                this.f11255b = Float.NaN;
                this.f11256c = -1;
                this.f11257d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f11254a);
            bundle.putFloat("motion.velocity", this.f11255b);
            bundle.putInt("motion.StartState", this.f11256c);
            bundle.putInt("motion.EndState", this.f11257d);
            return bundle;
        }

        public void c() {
            this.f11257d = j.this.H;
            this.f11256c = j.this.F;
            this.f11255b = j.this.getVelocity();
            this.f11254a = j.this.getProgress();
        }

        public void d(int i15) {
            this.f11257d = i15;
        }

        public void e(float f15) {
            this.f11254a = f15;
        }

        public void f(int i15) {
            this.f11256c = i15;
        }

        public void g(Bundle bundle) {
            this.f11254a = bundle.getFloat("motion.progress");
            this.f11255b = bundle.getFloat("motion.velocity");
            this.f11256c = bundle.getInt("motion.StartState");
            this.f11257d = bundle.getInt("motion.EndState");
        }

        public void h(float f15) {
            this.f11255b = f15;
        }
    }

    public interface c {
        void a(j jVar, int i15, int i16, float f15);

        void b(j jVar, int i15);

        void c(j jVar, int i15, int i16);
    }

    enum d {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private void I() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.f11245s0 == null && ((copyOnWriteArrayList = this.F0) == null || copyOnWriteArrayList.isEmpty())) || this.H0 == this.P) {
            return;
        }
        if (this.G0 != -1) {
            K();
            this.I0 = true;
        }
        this.G0 = -1;
        float f15 = this.P;
        this.H0 = f15;
        c cVar = this.f11245s0;
        if (cVar != null) {
            cVar.a(this, this.F, this.H, f15);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.F0;
        if (copyOnWriteArrayList2 != null) {
            Iterator<c> it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.F, this.H, this.P);
            }
        }
        this.I0 = true;
    }

    private void K() {
        c cVar = this.f11245s0;
        if (cVar != null) {
            cVar.c(this, this.F, this.H);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.F0;
        if (copyOnWriteArrayList != null) {
            Iterator<c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().c(this, this.F, this.H);
            }
        }
    }

    private void M() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if (this.f11245s0 == null && ((copyOnWriteArrayList = this.F0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.I0 = false;
        for (Integer num : this.U0) {
            c cVar = this.f11245s0;
            if (cVar != null) {
                cVar.b(this, num.intValue());
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.F0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<c> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().b(this, num.intValue());
                }
            }
        }
        this.U0.clear();
    }

    void G(float f15) {
    }

    void H(boolean z15) {
        boolean z16;
        int i15;
        float interpolation;
        boolean z17;
        if (this.T == -1) {
            this.T = getNanoTime();
        }
        float f15 = this.R;
        if (f15 > 0.0f && f15 < 1.0f) {
            this.G = -1;
        }
        boolean z18 = false;
        if (this.B0 || (this.f11244r0 && (z15 || this.f11242h0 != f15))) {
            float fSignum = Math.signum(this.f11242h0 - f15);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.C;
            float f16 = !(interpolator instanceof i) ? (((nanoTime - this.T) * fSignum) * 1.0E-9f) / this.O : 0.0f;
            float f17 = this.R + f16;
            if (this.f11243q0) {
                f17 = this.f11242h0;
            }
            if ((fSignum <= 0.0f || f17 < this.f11242h0) && (fSignum > 0.0f || f17 > this.f11242h0)) {
                z16 = false;
            } else {
                f17 = this.f11242h0;
                this.f11244r0 = false;
                z16 = true;
            }
            this.R = f17;
            this.P = f17;
            this.T = nanoTime;
            if (interpolator == null || z16) {
                this.E = f16;
            } else {
                if (this.f11247u0) {
                    interpolation = interpolator.getInterpolation((nanoTime - this.L) * 1.0E-9f);
                    Interpolator interpolator2 = this.C;
                    if (interpolator2 == null) {
                        throw null;
                    }
                    this.R = interpolation;
                    this.T = nanoTime;
                    if (interpolator2 instanceof i) {
                        float fA = ((i) interpolator2).a();
                        this.E = fA;
                        Math.abs(fA);
                        if (fA > 0.0f && interpolation >= 1.0f) {
                            this.R = 1.0f;
                            this.f11244r0 = false;
                            interpolation = 1.0f;
                        }
                        if (fA < 0.0f && interpolation <= 0.0f) {
                            this.R = 0.0f;
                            this.f11244r0 = false;
                            f17 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f17);
                    Interpolator interpolator3 = this.C;
                    if (interpolator3 instanceof i) {
                        this.E = ((i) interpolator3).a();
                    } else {
                        this.E = ((interpolator3.getInterpolation(f17 + f16) - interpolation) * fSignum) / f16;
                    }
                }
                f17 = interpolation;
            }
            if (Math.abs(this.E) > 1.0E-5f) {
                setState(d.MOVING);
            }
            if ((fSignum > 0.0f && f17 >= this.f11242h0) || (fSignum <= 0.0f && f17 <= this.f11242h0)) {
                f17 = this.f11242h0;
                this.f11244r0 = false;
            }
            if (f17 >= 1.0f || f17 <= 0.0f) {
                this.f11244r0 = false;
                setState(d.FINISHED);
            }
            int childCount = getChildCount();
            this.B0 = false;
            long nanoTime2 = getNanoTime();
            this.K0 = f17;
            Interpolator interpolator4 = this.D;
            float interpolation2 = interpolator4 == null ? f17 : interpolator4.getInterpolation(f17);
            Interpolator interpolator5 = this.D;
            if (interpolator5 != null) {
                float interpolation3 = interpolator5.getInterpolation((fSignum / this.O) + f17);
                this.E = interpolation3;
                this.E = interpolation3 - this.D.getInterpolation(f17);
            }
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = getChildAt(i16);
                g gVar = this.K.get(childAt);
                if (gVar != null) {
                    this.B0 = gVar.c(childAt, interpolation2, nanoTime2, null) | this.B0;
                }
            }
            boolean z19 = (fSignum > 0.0f && f17 >= this.f11242h0) || (fSignum <= 0.0f && f17 <= this.f11242h0);
            if (!this.B0 && !this.f11244r0 && z19) {
                setState(d.FINISHED);
            }
            if (this.J0) {
                requestLayout();
            }
            boolean z25 = (!z19) | this.B0;
            this.B0 = z25;
            if (f17 <= 0.0f && (i15 = this.F) != -1 && this.G != i15) {
                this.G = i15;
                throw null;
            }
            if (f17 >= 1.0d) {
                int i17 = this.G;
                int i18 = this.H;
                if (i17 != i18) {
                    this.G = i18;
                    throw null;
                }
            }
            if (z25 || this.f11244r0) {
                invalidate();
            } else if ((fSignum > 0.0f && f17 == 1.0f) || (fSignum < 0.0f && f17 == 0.0f)) {
                setState(d.FINISHED);
            }
            if (!this.B0 && !this.f11244r0 && ((fSignum > 0.0f && f17 == 1.0f) || (fSignum < 0.0f && f17 == 0.0f))) {
                L();
            }
        }
        float f18 = this.R;
        if (f18 < 1.0f) {
            if (f18 <= 0.0f) {
                int i19 = this.G;
                int i25 = this.F;
                z17 = i19 != i25;
                this.G = i25;
            }
            this.T0 |= z18;
            if (z18 && !this.L0) {
                requestLayout();
            }
            this.P = this.R;
        }
        int i26 = this.G;
        int i27 = this.H;
        z17 = i26 != i27;
        this.G = i27;
        z18 = z17;
        this.T0 |= z18;
        if (z18) {
            requestLayout();
        }
        this.P = this.R;
    }

    protected void J() {
        int iIntValue;
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.f11245s0 != null || ((copyOnWriteArrayList = this.F0) != null && !copyOnWriteArrayList.isEmpty())) && this.G0 == -1) {
            this.G0 = this.G;
            if (this.U0.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList<Integer> arrayList = this.U0;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i15 = this.G;
            if (iIntValue != i15 && i15 != -1) {
                this.U0.add(Integer.valueOf(i15));
            }
        }
        M();
        Runnable runnable = this.N0;
        if (runnable != null) {
            runnable.run();
            this.N0 = null;
        }
        int[] iArr = this.O0;
        if (iArr == null || this.P0 <= 0) {
            return;
        }
        R(iArr[0]);
        int[] iArr2 = this.O0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.P0--;
    }

    void L() {
    }

    public void N(float f15, float f16) {
        if (!isAttachedToWindow()) {
            if (this.M0 == null) {
                this.M0 = new b();
            }
            this.M0.e(f15);
            this.M0.h(f16);
            return;
        }
        setProgress(f15);
        setState(d.MOVING);
        this.E = f16;
        if (f16 != 0.0f) {
            G(f16 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f15 == 0.0f || f15 == 1.0f) {
                return;
            }
            G(f15 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void O(int i15, int i16, int i17) {
        setState(d.SETUP);
        this.G = i15;
        this.F = -1;
        this.H = -1;
        androidx.constraintlayout.widget.c cVar = this.f11300l;
        if (cVar != null) {
            cVar.d(i15, i16, i17);
        }
    }

    public void P(int i15, int i16) {
        if (isAttachedToWindow()) {
            return;
        }
        if (this.M0 == null) {
            this.M0 = new b();
        }
        this.M0.f(i15);
        this.M0.d(i16);
    }

    public void Q() {
        G(1.0f);
        this.N0 = null;
    }

    public void R(int i15) {
        if (isAttachedToWindow()) {
            S(i15, -1, -1);
            return;
        }
        if (this.M0 == null) {
            this.M0 = new b();
        }
        this.M0.d(i15);
    }

    public void S(int i15, int i16, int i17) {
        T(i15, i16, i17, -1);
    }

    public void T(int i15, int i16, int i17, int i18) {
        int i19 = this.G;
        if (i19 == i15) {
            return;
        }
        if (this.F == i15) {
            G(0.0f);
            if (i18 > 0) {
                this.O = i18 / 1000.0f;
                return;
            }
            return;
        }
        if (this.H == i15) {
            G(1.0f);
            if (i18 > 0) {
                this.O = i18 / 1000.0f;
                return;
            }
            return;
        }
        this.H = i15;
        if (i19 != -1) {
            P(i19, i15);
            G(1.0f);
            this.R = 0.0f;
            Q();
            if (i18 > 0) {
                this.O = i18 / 1000.0f;
                return;
            }
            return;
        }
        this.f11247u0 = false;
        this.f11242h0 = 1.0f;
        this.P = 0.0f;
        this.R = 0.0f;
        this.T = getNanoTime();
        this.L = getNanoTime();
        this.f11243q0 = false;
        this.C = null;
        if (i18 == -1) {
            throw null;
        }
        this.F = -1;
        throw null;
    }

    @Override // j6.v
    public void c(View view, View view2, int i15, int i16) {
        this.f11252z0 = getNanoTime();
        this.A0 = 0.0f;
        this.f11250x0 = 0.0f;
        this.f11251y0 = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        ArrayList<h> arrayList = this.E0;
        if (arrayList != null) {
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().w(canvas);
            }
        }
        H(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.G;
    }

    public ArrayList<l.a> getDefinedTransitions() {
        return null;
    }

    public androidx.constraintlayout.motion.widget.b getDesignTool() {
        if (this.f11248v0 == null) {
            this.f11248v0 = new androidx.constraintlayout.motion.widget.b(this);
        }
        return this.f11248v0;
    }

    public int getEndState() {
        return this.H;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.R;
    }

    public l getScene() {
        return null;
    }

    public int getStartState() {
        return this.F;
    }

    public float getTargetPosition() {
        return this.f11242h0;
    }

    public Bundle getTransitionState() {
        if (this.M0 == null) {
            this.M0 = new b();
        }
        this.M0.c();
        return this.M0.b();
    }

    public long getTransitionTimeMs() {
        return (long) (this.O * 1000.0f);
    }

    public float getVelocity() {
        return this.E;
    }

    @Override // j6.v
    public void j(View view, int i15) {
    }

    @Override // j6.v
    public void k(View view, int i15, int i16, int[] iArr, int i17) {
    }

    @Override // j6.w
    public void m(View view, int i15, int i16, int i17, int i18, int i19, int[] iArr) {
        if (this.f11249w0 || i15 != 0 || i16 != 0) {
            iArr[0] = iArr[0] + i17;
            iArr[1] = iArr[1] + i18;
        }
        this.f11249w0 = false;
    }

    @Override // j6.v
    public void n(View view, int i15, int i16, int i17, int i18, int i19) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.Q0 = display.getRotation();
        }
        L();
        b bVar = this.M0;
        if (bVar != null) {
            if (this.R0) {
                post(new a());
            } else {
                bVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        this.L0 = true;
        try {
            super.onLayout(z15, i15, i16, i17, i18);
        } finally {
            this.L0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i15, int i16) {
        super.onMeasure(i15, i16);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f15, float f16, boolean z15) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f15, float f16) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i15) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h) {
            h hVar = (h) view;
            if (this.F0 == null) {
                this.F0 = new CopyOnWriteArrayList<>();
            }
            this.F0.add(hVar);
            if (hVar.v()) {
                if (this.C0 == null) {
                    this.C0 = new ArrayList<>();
                }
                this.C0.add(hVar);
            }
            if (hVar.u()) {
                if (this.D0 == null) {
                    this.D0 = new ArrayList<>();
                }
                this.D0.add(hVar);
            }
            if (hVar.t()) {
                if (this.E0 == null) {
                    this.E0 = new ArrayList<>();
                }
                this.E0.add(hVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h> arrayList = this.C0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<h> arrayList2 = this.D0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // j6.v
    public boolean p(View view, View view2, int i15, int i16) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    public void setDebugMode(int i15) {
        this.f11246t0 = i15;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z15) {
        this.R0 = z15;
    }

    public void setInteractionEnabled(boolean z15) {
        this.I = z15;
    }

    public void setInterpolatedProgress(float f15) {
        setProgress(f15);
    }

    public void setOnHide(float f15) {
        ArrayList<h> arrayList = this.D0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                this.D0.get(i15).setProgress(f15);
            }
        }
    }

    public void setOnShow(float f15) {
        ArrayList<h> arrayList = this.C0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                this.C0.get(i15).setProgress(f15);
            }
        }
    }

    public void setProgress(float f15) {
        if (f15 < 0.0f || f15 > 1.0f) {
            c2.g("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.M0 == null) {
                this.M0 = new b();
            }
            this.M0.e(f15);
            return;
        }
        if (f15 <= 0.0f) {
            if (this.R == 1.0f && this.G == this.H) {
                setState(d.MOVING);
            }
            this.G = this.F;
            if (this.R == 0.0f) {
                setState(d.FINISHED);
                return;
            }
            return;
        }
        if (f15 < 1.0f) {
            this.G = -1;
            setState(d.MOVING);
            return;
        }
        if (this.R == 0.0f && this.G == this.F) {
            setState(d.MOVING);
        }
        this.G = this.H;
        if (this.R == 1.0f) {
            setState(d.FINISHED);
        }
    }

    public void setScene(l lVar) {
        t();
        throw null;
    }

    void setStartState(int i15) {
        if (isAttachedToWindow()) {
            this.G = i15;
            return;
        }
        if (this.M0 == null) {
            this.M0 = new b();
        }
        this.M0.f(i15);
        this.M0.d(i15);
    }

    void setState(d dVar) {
        d dVar2 = d.FINISHED;
        if (dVar == dVar2 && this.G == -1) {
            return;
        }
        d dVar3 = this.S0;
        this.S0 = dVar;
        d dVar4 = d.MOVING;
        if (dVar3 == dVar4 && dVar == dVar4) {
            I();
        }
        int iOrdinal = dVar3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && dVar == dVar2) {
                J();
                return;
            }
            return;
        }
        if (dVar == dVar4) {
            I();
        }
        if (dVar == dVar2) {
            J();
        }
    }

    public void setTransition(int i15) {
    }

    public void setTransitionDuration(int i15) {
        c2.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.f11245s0 = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.M0 == null) {
            this.M0 = new b();
        }
        this.M0.g(bundle);
        if (isAttachedToWindow()) {
            this.M0.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.a.a(context, this.F) + "->" + androidx.constraintlayout.motion.widget.a.a(context, this.H) + " (pos:" + this.R + " Dpos/Dt:" + this.E;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void v(int i15) {
        this.f11300l = null;
    }

    protected void setTransition(l.a aVar) {
        throw null;
    }
}
