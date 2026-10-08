package androidx.camera.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import j6.l0;
import java.util.concurrent.atomic.AtomicReference;
import o.e1;
import o.h1;
import o.h2;
import o.k2;
import o.m1;
import o.t0;
import v.m0;
import v.n0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final c f9389q = c.PERFORMANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c f9390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    n f9391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final s f9392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final f f9393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f9394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.p016lifecycle.b0<e> f9395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final AtomicReference<androidx.camera.view.e> f9396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    o f9397h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p0.a f9398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    m0 f9399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MotionEvent f9400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b f9401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View.OnLayoutChangeListener f9402n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final m1.c f9403p;

    class a implements m1.c {
        a() {
        }

        public static /* synthetic */ void c(a aVar, androidx.camera.view.e eVar, n0 n0Var) {
            if (i.a(m.this.f9396g, eVar, null)) {
                eVar.i(e.IDLE);
            }
            eVar.f();
            n0Var.d().c(eVar);
        }

        public static /* synthetic */ void d(a aVar, n0 n0Var, h2 h2Var, h2.h hVar) {
            m mVar;
            n nVar;
            aVar.getClass();
            e1.a("PreviewView", "Preview transformation info updated. " + hVar);
            m.this.f9393d.r(hVar, h2Var.p(), n0Var.o().n() == 0);
            if (hVar.d() == -1 || ((nVar = (mVar = m.this).f9391b) != null && (nVar instanceof w))) {
                m.this.f9394e = true;
            } else {
                mVar.f9394e = false;
            }
            m.this.d();
        }

        @Override // o.m1.c
        public void a(final h2 h2Var) {
            n wVar;
            if (!y.w.d()) {
                u5.a.i(m.this.getContext()).execute(new Runnable() { // from class: androidx.camera.view.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.f9403p.a(h2Var);
                    }
                });
                return;
            }
            e1.a("PreviewView", "Surface requested by Preview.");
            final n0 n0VarM = h2Var.m();
            m.this.f9399k = n0VarM.o();
            m.this.f9397h.c(n0VarM.o().k());
            h2Var.u(u5.a.i(m.this.getContext()), new h2.i() { // from class: androidx.camera.view.k
                @Override // o.h2.i
                public final void a(h2.h hVar) {
                    m.a.d(this.f9383a, n0VarM, h2Var, hVar);
                }
            });
            m mVar = m.this;
            if (!m.e(mVar.f9391b, h2Var, mVar.f9390a)) {
                m mVar2 = m.this;
                if (m.f(h2Var, mVar2.f9390a)) {
                    m mVar3 = m.this;
                    wVar = new d0(mVar3, mVar3.f9393d);
                } else {
                    m mVar4 = m.this;
                    wVar = new w(mVar4, mVar4.f9393d);
                }
                mVar2.f9391b = wVar;
            }
            m0 m0VarO = n0VarM.o();
            m mVar5 = m.this;
            final androidx.camera.view.e eVar = new androidx.camera.view.e(m0VarO, mVar5.f9395f, mVar5.f9391b);
            m.this.f9396g.set(eVar);
            n0VarM.d().a(u5.a.i(m.this.getContext()), eVar);
            m.this.f9391b.g(h2Var, new n.a() { // from class: androidx.camera.view.l
                @Override // androidx.camera.view.n.a
                public final void a() {
                    m.a.c(this.f9386a, eVar, n0VarM);
                }
            });
            m mVar6 = m.this;
            if (mVar6.indexOfChild(mVar6.f9392c) == -1) {
                m mVar7 = m.this;
                mVar7.addView(mVar7.f9392c);
            }
            m.this.getClass();
        }
    }

    class b implements DisplayManager.DisplayListener {
        b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i15) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i15) {
            Display defaultDisplay = m.this.getDefaultDisplay();
            if (defaultDisplay == null || defaultDisplay.getDisplayId() != i15) {
                return;
            }
            m.this.d();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i15) {
        }
    }

    public enum c {
        PERFORMANCE(0),
        COMPATIBLE(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9409a;

        c(int i15) {
            this.f9409a = i15;
        }

        static c e(int i15) {
            for (c cVar : values()) {
                if (cVar.f9409a == i15) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i15);
        }

        int g() {
            return this.f9409a;
        }
    }

    public enum d {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9417a;

        d(int i15) {
            this.f9417a = i15;
        }

        static d e(int i15) {
            for (d dVar : values()) {
                if (dVar.f9417a == i15) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i15);
        }

        int g() {
            return this.f9417a;
        }
    }

    public enum e {
        IDLE,
        STREAMING
    }

    public m(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(m mVar, View view, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27) {
        mVar.getClass();
        if (i17 - i15 == i26 - i19 && i18 - i16 == i27 - i25) {
            return;
        }
        mVar.d();
        mVar.b(true);
    }

    private void b(boolean z15) {
        y.w.b();
        getViewPort();
    }

    static boolean e(n nVar, h2 h2Var, c cVar) {
        return (nVar instanceof w) && !f(h2Var, cVar);
    }

    static boolean f(h2 h2Var, c cVar) {
        boolean zEquals = h2Var.m().o().f().equals("androidx.camera.camera2.legacy");
        boolean z15 = (androidx.camera.view.internal.compat.quirk.a.b(SurfaceViewStretchedQuirk.class) == null && androidx.camera.view.internal.compat.quirk.a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (zEquals || z15) {
            return true;
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }

    private t0.j getScreenFlashInternal() {
        return this.f9392c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i15 = 1;
        if (iOrdinal != 1) {
            i15 = 2;
            if (iOrdinal != 2) {
                i15 = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i15;
    }

    private void setScreenFlashUiInfo(t0.j jVar) {
        e1.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    @SuppressLint({"WrongConstant"})
    public k2 c(int i15) {
        y.w.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new k2.a(new Rational(getWidth(), getHeight()), i15).c(getViewPortScaleType()).b(getLayoutDirection()).a();
    }

    void d() {
        y.w.b();
        if (this.f9391b != null) {
            i();
            this.f9391b.h();
        }
        this.f9397h.b(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    void g() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f9401m, new Handler(Looper.getMainLooper()));
    }

    public Bitmap getBitmap() {
        y.w.b();
        n nVar = this.f9391b;
        if (nVar == null) {
            return null;
        }
        return nVar.a();
    }

    public androidx.camera.view.a getController() {
        y.w.b();
        return null;
    }

    Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public c getImplementationMode() {
        y.w.b();
        return this.f9390a;
    }

    public h1 getMeteringPointFactory() {
        y.w.b();
        return this.f9397h;
    }

    public o0.a getOutputTransform() {
        Matrix matrixJ;
        y.w.b();
        try {
            matrixJ = this.f9393d.j(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixJ = null;
        }
        Rect rectI = this.f9393d.i();
        if (matrixJ == null || rectI == null) {
            e1.a("PreviewView", "Transform info is not ready");
            return null;
        }
        matrixJ.preConcat(y.x.b(rectI));
        if (this.f9391b instanceof d0) {
            matrixJ.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            e1.o("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new o0.a(matrixJ, new Size(rectI.width(), rectI.height()));
    }

    public androidx.p016lifecycle.y<e> getPreviewStreamState() {
        return this.f9395f;
    }

    public d getScaleType() {
        y.w.b();
        return this.f9393d.g();
    }

    public t0.j getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        y.w.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return this.f9393d.h(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public m1.c getSurfaceProvider() {
        y.w.b();
        return this.f9403p;
    }

    public k2 getViewPort() {
        y.w.b();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        return c(defaultDisplay.getRotation());
    }

    void h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f9401m);
    }

    void i() {
        Display defaultDisplay;
        m0 m0Var;
        if (!this.f9394e || (defaultDisplay = getDefaultDisplay()) == null || (m0Var = this.f9399k) == null) {
            return;
        }
        this.f9393d.o(m0Var.A(defaultDisplay.getRotation()), defaultDisplay.getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            g();
        }
        addOnLayoutChangeListener(this.f9402n);
        n nVar = this.f9391b;
        if (nVar != null) {
            nVar.d();
        }
        b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f9402n);
        n nVar = this.f9391b;
        if (nVar != null) {
            nVar.e();
        }
        if (isInEditMode()) {
            return;
        }
        h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f9400l = null;
        return super.performClick();
    }

    public void setController(androidx.camera.view.a aVar) {
        y.w.b();
        b(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(c cVar) {
        y.w.b();
        this.f9390a = cVar;
        c cVar2 = c.PERFORMANCE;
    }

    public void setScaleType(d dVar) {
        y.w.b();
        this.f9393d.q(dVar);
        d();
        b(false);
    }

    public void setScreenFlashOverlayColor(int i15) {
        this.f9392c.setBackgroundColor(i15);
    }

    public void setScreenFlashWindow(Window window) {
        y.w.b();
        this.f9392c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public m(Context context, AttributeSet attributeSet, int i15) {
        this(context, attributeSet, i15, 0);
    }

    public m(Context context, AttributeSet attributeSet, int i15, int i16) {
        super(context, attributeSet, i15, i16);
        c cVar = f9389q;
        this.f9390a = cVar;
        f fVar = new f();
        this.f9393d = fVar;
        this.f9394e = true;
        this.f9395f = new androidx.p016lifecycle.b0<>(e.IDLE);
        this.f9396g = new AtomicReference<>();
        this.f9397h = new o(fVar);
        this.f9401m = new b();
        this.f9402n = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.g
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i17, int i18, int i19, int i25, int i26, int i27, int i28, int i29) {
                m.a(this.f9378a, view, i17, i18, i19, i25, i26, i27, i28, i29);
            }
        };
        this.f9403p = new a();
        y.w.b();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p.f9429a, i15, i16);
        l0.f0(this, context, p.f9429a, attributeSet, typedArrayObtainStyledAttributes, i15, i16);
        try {
            setScaleType(d.e(typedArrayObtainStyledAttributes.getInteger(p.f9431c, fVar.g().g())));
            setImplementationMode(c.e(typedArrayObtainStyledAttributes.getInteger(p.f9430b, cVar.g())));
            typedArrayObtainStyledAttributes.recycle();
            this.f9398j = new p0.a(context, new p0.a.b() { // from class: androidx.camera.view.h
            });
            if (getBackground() == null) {
                setBackgroundColor(u5.a.d(getContext(), R.color.black));
            }
            s sVar = new s(context);
            this.f9392c = sVar;
            sVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th4) {
            typedArrayObtainStyledAttributes.recycle();
            throw th4;
        }
    }
}
