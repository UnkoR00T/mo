package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p011Prn.f2;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f8925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f8926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f8927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8929h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f8930j = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = k0.this.f8925d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k0.this.e();
        }
    }

    public k0(View view) {
        this.f8925d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f8922a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f8923b = tapTimeout;
        this.f8924c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f8927f;
        if (runnable != null) {
            this.f8925d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f8926e;
        if (runnable2 != null) {
            this.f8925d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        i0 i0Var;
        View view = this.f8925d;
        f2 f2VarB = b();
        if (f2VarB != null && f2VarB.b() && (i0Var = (i0) f2VarB.p()) != null && i0Var.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(i0Var, motionEventObtainNoHistory);
            boolean zE = i0Var.e(motionEventObtainNoHistory, this.f8929h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z15 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zE && z15) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f8925d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8929h = motionEvent.getPointerId(0);
            if (this.f8926e == null) {
                this.f8926e = new a();
            }
            view.postDelayed(this.f8926e, this.f8923b);
            if (this.f8927f == null) {
                this.f8927f = new b();
            }
            view.postDelayed(this.f8927f, this.f8924c);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f8929h);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f8922a)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    private static boolean h(View view, float f15, float f16, float f17) {
        float f18 = -f17;
        return f15 >= f18 && f16 >= f18 && f15 < ((float) (view.getRight() - view.getLeft())) + f17 && f16 < ((float) (view.getBottom() - view.getTop())) + f17;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f8930j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f8930j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract f2 b();

    protected abstract boolean c();

    protected boolean d() {
        f2 f2VarB = b();
        if (f2VarB == null || !f2VarB.b()) {
            return true;
        }
        f2VarB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f8925d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f8928g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z15;
        boolean z16 = this.f8928g;
        if (z16) {
            z15 = f(motionEvent) || !d();
        } else {
            z15 = g(motionEvent) && c();
            if (z15) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f8925d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f8928g = z15;
        return z15 || z16;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f8928g = false;
        this.f8929h = -1;
        Runnable runnable = this.f8926e;
        if (runnable != null) {
            this.f8925d.removeCallbacks(runnable);
        }
    }
}
