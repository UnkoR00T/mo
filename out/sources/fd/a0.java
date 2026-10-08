package fd;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public class a0 extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final boolean f61167t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final List<String> f61168u0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Executor f61169v0 = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new td.f());
    private boolean A;
    private final Matrix B;
    private Bitmap C;
    private Canvas D;
    private Rect E;
    private RectF F;
    private Paint G;
    private Rect H;
    private Rect I;
    private RectF K;
    private RectF L;
    private Matrix O;
    private float[] P;
    private Matrix R;
    private boolean T;
    private fd.a X;
    private final ValueAnimator.AnimatorUpdateListener Y;
    private final Semaphore Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f61170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final td.h f61171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f61172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f61173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f61174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f61175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<a> f61176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ld.b f61177h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private Handler f61178h0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f61179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ld.a f61180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, Typeface> f61181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f61182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c0 f61183n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f61184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f61185q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private Runnable f61186q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private pd.c f61187r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final Runnable f61188r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f61189s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private float f61190s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f61191t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f61192v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f61193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f61194x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f61195y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private m0 f61196z;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a(f fVar);
    }

    private enum b {
        NONE,
        PLAY,
        RESUME
    }

    public a0() {
        td.h hVar = new td.h();
        this.f61171b = hVar;
        this.f61172c = true;
        this.f61173d = false;
        this.f61174e = false;
        this.f61175f = b.NONE;
        this.f61176g = new ArrayList<>();
        this.f61183n = new c0();
        this.f61184p = false;
        this.f61185q = true;
        this.f61189s = GF2Field.MASK;
        this.f61195y = false;
        this.f61196z = m0.AUTOMATIC;
        this.A = false;
        this.B = new Matrix();
        this.P = new float[9];
        this.T = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: fd.t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                a0.e(this.f61317a, valueAnimator);
            }
        };
        this.Y = animatorUpdateListener;
        this.Z = new Semaphore(1);
        this.f61188r0 = new Runnable() { // from class: fd.u
            @Override // java.lang.Runnable
            public final void run() {
                a0.f(this.f61318a);
            }
        };
        this.f61190s0 = -3.4028235E38f;
        hVar.addUpdateListener(animatorUpdateListener);
    }

    private Context B() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private ld.a C() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f61180k == null) {
            ld.a aVar = new ld.a(getCallback(), null);
            this.f61180k = aVar;
            String str = this.f61182m;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f61180k;
    }

    private ld.b D() {
        ld.b bVar = this.f61177h;
        if (bVar != null && !bVar.b(B())) {
            this.f61177h = null;
        }
        if (this.f61177h == null) {
            this.f61177h = new ld.b(getCallback(), this.f61179j, null, this.f61170a.j());
        }
        return this.f61177h;
    }

    private boolean O() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (parent instanceof ViewGroup) {
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    private static boolean T(float f15) {
        return (Float.isNaN(f15) || Float.isInfinite(f15)) ? false : true;
    }

    private static boolean U(RectF rectF) {
        return T(rectF.left) && T(rectF.top) && T(rectF.right) && T(rectF.bottom);
    }

    private void X(Canvas canvas, pd.c cVar) {
        if (this.f61170a == null || cVar == null) {
            return;
        }
        v();
        canvas.getMatrix(this.O);
        canvas.getClipBounds(this.E);
        n(this.E, this.F);
        this.O.mapRect(this.F);
        o(this.F, this.E);
        if (this.f61185q) {
            this.L.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.f(this.L, null, false);
        }
        this.O.mapRect(this.L);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        a0(this.L, fWidth, fHeight);
        if (!O()) {
            RectF rectF = this.L;
            Rect rect = this.E;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        if (!U(this.L)) {
            td.e.c("Skipping software rendering: transformed bounds contain non-finite values.");
            return;
        }
        int iCeil = (int) Math.ceil(this.L.width());
        int iCeil2 = (int) Math.ceil(this.L.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            td.e.c("Skipping software rendering: transformed bounds have negative values.");
            return;
        }
        long j15 = ((long) iCeil) * ((long) iCeil2);
        if (j15 > 50000000) {
            td.e.c("Skipping software rendering: bitmap request exceeds safe pixel count (" + j15 + ")");
            return;
        }
        u(iCeil, iCeil2);
        if (this.T) {
            this.O.getValues(this.P);
            float[] fArr = this.P;
            float f15 = fArr[0];
            float f16 = fArr[4];
            this.B.set(this.O);
            this.B.preScale(fWidth, fHeight);
            Matrix matrix = this.B;
            RectF rectF2 = this.L;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.B.postScale(1.0f / f15, 1.0f / f16);
            this.C.eraseColor(0);
            this.D.setMatrix(td.m.f189640a);
            this.D.scale(f15, f16);
            cVar.d(this.D, this.B, this.f61189s, null);
            this.O.invert(this.R);
            this.R.mapRect(this.K, this.L);
            o(this.K, this.I);
        }
        this.H.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.C, this.H, this.I, this.G);
    }

    private void a0(RectF rectF, float f15, float f16) {
        rectF.set(rectF.left * f15, rectF.top * f16, rectF.right * f15, rectF.bottom * f16);
    }

    public static /* synthetic */ void e(a0 a0Var, ValueAnimator valueAnimator) {
        if (a0Var.x()) {
            a0Var.invalidateSelf();
            return;
        }
        pd.c cVar = a0Var.f61187r;
        if (cVar != null) {
            cVar.M(a0Var.f61171b.p());
        }
    }

    public static /* synthetic */ void f(final a0 a0Var) {
        pd.c cVar = a0Var.f61187r;
        if (cVar == null) {
            return;
        }
        try {
            a0Var.Z.acquire();
            cVar.M(a0Var.f61171b.p());
            if (f61167t0 && a0Var.T) {
                if (a0Var.f61178h0 == null) {
                    a0Var.f61178h0 = new Handler(Looper.getMainLooper());
                    a0Var.f61186q0 = new Runnable() { // from class: fd.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            a0.h(this.f61328a);
                        }
                    };
                }
                a0Var.f61178h0.post(a0Var.f61186q0);
            }
        } catch (InterruptedException unused) {
        } finally {
            a0Var.Z.release();
        }
    }

    public static /* synthetic */ void h(a0 a0Var) {
        Drawable.Callback callback = a0Var.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(a0Var);
        }
    }

    private void k() {
        f fVar = this.f61170a;
        if (fVar == null) {
            return;
        }
        pd.c cVar = new pd.c(this, rd.v.a(fVar), fVar.k(), fVar);
        this.f61187r = cVar;
        if (this.f61192v) {
            cVar.K(true);
        }
        this.f61187r.Q(this.f61185q);
    }

    private void m() {
        f fVar = this.f61170a;
        if (fVar == null) {
            return;
        }
        this.A = this.f61196z.e(Build.VERSION.SDK_INT, fVar.q(), fVar.m());
    }

    private void n(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void o(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private boolean o0() {
        f fVar = this.f61170a;
        if (fVar == null) {
            return false;
        }
        float f15 = this.f61190s0;
        float fP = this.f61171b.p();
        this.f61190s0 = fP;
        return Math.abs(fP - f15) * fVar.d() >= 50.0f;
    }

    private void q(Canvas canvas, Matrix matrix, pd.c cVar, int i15) {
        if (!this.A) {
            cVar.d(canvas, matrix, i15, null);
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        X(canvas, cVar);
        canvas.restore();
    }

    private void r(Canvas canvas) {
        pd.c cVar = this.f61187r;
        f fVar = this.f61170a;
        if (cVar == null || fVar == null) {
            return;
        }
        this.B.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / fVar.b().width();
            float fHeight = bounds.height() / fVar.b().height();
            this.B.preTranslate(bounds.left, bounds.top);
            this.B.preScale(fWidth, fHeight);
        }
        cVar.d(canvas, this.B, this.f61189s, null);
    }

    private void u(int i15, int i16) {
        Bitmap bitmap = this.C;
        if (bitmap == null || bitmap.getWidth() < i15 || this.C.getHeight() < i16) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i15, i16, Bitmap.Config.ARGB_8888);
            this.C = bitmapCreateBitmap;
            this.D.setBitmap(bitmapCreateBitmap);
            this.T = true;
            return;
        }
        if (this.C.getWidth() > i15 || this.C.getHeight() > i16) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.C, 0, 0, i15, i16);
            this.C = bitmapCreateBitmap2;
            this.D.setBitmap(bitmapCreateBitmap2);
            this.T = true;
        }
    }

    private void v() {
        if (this.D != null) {
            return;
        }
        this.D = new Canvas();
        this.L = new RectF();
        this.O = new Matrix();
        this.R = new Matrix();
        this.E = new Rect();
        this.F = new RectF();
        this.G = new gd.a();
        this.H = new Rect();
        this.I = new Rect();
        this.K = new RectF();
    }

    public f A() {
        return this.f61170a;
    }

    public d0 E(String str) {
        f fVar = this.f61170a;
        if (fVar == null) {
            return null;
        }
        return fVar.j().get(str);
    }

    public boolean F() {
        return this.f61184p;
    }

    public md.h G() {
        Iterator<String> it = f61168u0.iterator();
        md.h hVarL = null;
        while (it.hasNext()) {
            hVarL = this.f61170a.l(it.next());
            if (hVarL != null) {
                break;
            }
        }
        return hVarL;
    }

    public float H() {
        return this.f61171b.t();
    }

    public float I() {
        return this.f61171b.v();
    }

    public float J() {
        return this.f61171b.p();
    }

    public int K() {
        return this.f61171b.getRepeatCount();
    }

    public float L() {
        return this.f61171b.w();
    }

    public n0 M() {
        return null;
    }

    public Typeface N(md.c cVar) {
        Map<String, Typeface> map = this.f61181l;
        if (map != null) {
            String strA = cVar.a();
            if (map.containsKey(strA)) {
                return map.get(strA);
            }
            String strB = cVar.b();
            if (map.containsKey(strB)) {
                return map.get(strB);
            }
            String str = cVar.a() + "-" + cVar.c();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        ld.a aVarC = C();
        if (aVarC != null) {
            return aVarC.b(cVar);
        }
        return null;
    }

    public boolean P() {
        td.h hVar = this.f61171b;
        if (hVar == null) {
            return false;
        }
        return hVar.isRunning();
    }

    public boolean Q() {
        return this.f61193w;
    }

    public boolean R() {
        return this.f61194x;
    }

    public boolean S(b0 b0Var) {
        return this.f61183n.b(b0Var);
    }

    public void V() {
        this.f61176g.clear();
        this.f61171b.y();
        if (isVisible()) {
            return;
        }
        this.f61175f = b.NONE;
    }

    public void W() {
        if (this.f61187r == null) {
            this.f61176g.add(new a() { // from class: fd.v
                @Override // fd.a0.a
                public final void a(f fVar) {
                    this.f61319a.W();
                }
            });
            return;
        }
        m();
        if (j(B()) || K() == 0) {
            if (isVisible()) {
                this.f61171b.z();
                this.f61175f = b.NONE;
            } else {
                this.f61175f = b.PLAY;
            }
        }
        if (j(B())) {
            return;
        }
        md.h hVarG = G();
        if (hVarG != null) {
            i0((int) hVarG.f125644b);
        } else {
            i0((int) (L() < 0.0f ? I() : H()));
        }
        this.f61171b.o();
        if (isVisible()) {
            return;
        }
        this.f61175f = b.NONE;
    }

    public List<md.e> Y(md.e eVar) {
        if (this.f61187r == null) {
            td.e.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f61187r.c(eVar, 0, arrayList, new md.e(new String[0]));
        return arrayList;
    }

    public void Z() {
        if (this.f61187r == null) {
            this.f61176g.add(new a() { // from class: fd.s
                @Override // fd.a0.a
                public final void a(f fVar) {
                    this.f61316a.Z();
                }
            });
            return;
        }
        m();
        if (j(B()) || K() == 0) {
            if (isVisible()) {
                this.f61171b.G();
                this.f61175f = b.NONE;
            } else {
                this.f61175f = b.RESUME;
            }
        }
        if (j(B())) {
            return;
        }
        i0((int) (L() < 0.0f ? I() : H()));
        this.f61171b.o();
        if (isVisible()) {
            return;
        }
        this.f61175f = b.NONE;
    }

    public void b0(boolean z15) {
        this.f61193w = z15;
    }

    public void c0(boolean z15) {
        this.f61194x = z15;
    }

    public void d0(fd.a aVar) {
        this.X = aVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float fP;
        float fP2;
        pd.c cVar = this.f61187r;
        if (cVar == null) {
            return;
        }
        boolean zX = x();
        if (zX) {
            try {
                this.Z.acquire();
            } catch (InterruptedException unused) {
                if (!zX) {
                    return;
                } else {
                    if ((fP > fP2 ? 1 : (fP == fP2 ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (e.h()) {
                    e.c("Drawable#draw");
                }
                if (zX) {
                    this.Z.release();
                    if (cVar.P() != this.f61171b.p()) {
                        f61169v0.execute(this.f61188r0);
                    }
                }
            }
        }
        if (e.h()) {
            e.b("Drawable#draw");
        }
        if (zX && o0()) {
            l0(this.f61171b.p());
        }
        if (this.f61174e) {
            try {
                if (this.A) {
                    X(canvas, cVar);
                } else {
                    r(canvas);
                }
            } catch (Throwable th4) {
                td.e.b("Lottie crashed in draw!", th4);
            }
        } else if (this.A) {
            X(canvas, cVar);
        } else {
            r(canvas);
        }
        this.T = false;
    }

    public void e0(boolean z15) {
        if (z15 != this.f61195y) {
            this.f61195y = z15;
            invalidateSelf();
        }
    }

    public void f0(boolean z15) {
        if (z15 != this.f61185q) {
            this.f61185q = z15;
            pd.c cVar = this.f61187r;
            if (cVar != null) {
                cVar.Q(z15);
            }
            invalidateSelf();
        }
    }

    public boolean g0(f fVar) {
        if (this.f61170a == fVar) {
            return false;
        }
        this.T = true;
        l();
        this.f61170a = fVar;
        k();
        this.f61171b.I(fVar);
        l0(this.f61171b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f61176g).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(fVar);
            }
            it.remove();
        }
        this.f61176g.clear();
        fVar.w(this.f61191t);
        m();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f61189s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        f fVar = this.f61170a;
        if (fVar == null) {
            return -1;
        }
        return fVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        f fVar = this.f61170a;
        if (fVar == null) {
            return -1;
        }
        return fVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h0(Map<String, Typeface> map) {
        if (map == this.f61181l) {
            return;
        }
        this.f61181l = map;
        invalidateSelf();
    }

    public <T> void i(final md.e eVar, final T t15, final ud.c<T> cVar) {
        pd.c cVar2 = this.f61187r;
        if (cVar2 == null) {
            this.f61176g.add(new a() { // from class: fd.x
                @Override // fd.a0.a
                public final void a(f fVar) {
                    this.f61322a.i(eVar, t15, cVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == md.e.f125638c) {
            cVar2.g(t15, cVar);
        } else if (eVar.d() != null) {
            eVar.d().g(t15, cVar);
        } else {
            List<md.e> listY = Y(eVar);
            for (int i15 = 0; i15 < listY.size(); i15++) {
                listY.get(i15).d().g(t15, cVar);
            }
            zIsEmpty = true ^ listY.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t15 == g0.H) {
                l0(J());
            }
        }
    }

    public void i0(final int i15) {
        if (this.f61170a == null) {
            this.f61176g.add(new a() { // from class: fd.y
                @Override // fd.a0.a
                public final void a(f fVar) {
                    this.f61326a.i0(i15);
                }
            });
        } else {
            this.f61171b.J(i15);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.T) {
            return;
        }
        this.T = true;
        if ((!f61167t0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return P();
    }

    public boolean j(Context context) {
        if (this.f61173d) {
            return true;
        }
        return this.f61172c && e.f().a(context) == kd.a.STANDARD_MOTION;
    }

    public void j0(boolean z15) {
        this.f61184p = z15;
    }

    public void k0(boolean z15) {
        if (this.f61192v == z15) {
            return;
        }
        this.f61192v = z15;
        pd.c cVar = this.f61187r;
        if (cVar != null) {
            cVar.K(z15);
        }
    }

    public void l() {
        if (this.f61171b.isRunning()) {
            this.f61171b.cancel();
            if (!isVisible()) {
                this.f61175f = b.NONE;
            }
        }
        this.f61170a = null;
        this.f61187r = null;
        this.f61177h = null;
        this.f61190s0 = -3.4028235E38f;
        this.f61171b.n();
        invalidateSelf();
    }

    public void l0(final float f15) {
        if (this.f61170a == null) {
            this.f61176g.add(new a() { // from class: fd.w
                @Override // fd.a0.a
                public final void a(f fVar) {
                    this.f61320a.l0(f15);
                }
            });
            return;
        }
        if (e.h()) {
            e.b("Drawable#setProgress");
        }
        this.f61171b.J(this.f61170a.h(f15));
        if (e.h()) {
            e.c("Drawable#setProgress");
        }
    }

    public void m0(m0 m0Var) {
        this.f61196z = m0Var;
        m();
    }

    public void n0(boolean z15) {
        this.f61174e = z15;
    }

    public void p(Canvas canvas, Matrix matrix) {
        pd.c cVar = this.f61187r;
        f fVar = this.f61170a;
        if (cVar == null || fVar == null) {
            return;
        }
        boolean zX = x();
        if (zX) {
            try {
                this.Z.acquire();
                if (o0()) {
                    l0(this.f61171b.p());
                }
            } catch (InterruptedException unused) {
                if (!zX) {
                    return;
                }
                this.Z.release();
                if (cVar.P() == this.f61171b.p()) {
                    return;
                }
            } catch (Throwable th4) {
                if (zX) {
                    this.Z.release();
                    if (cVar.P() != this.f61171b.p()) {
                        f61169v0.execute(this.f61188r0);
                    }
                }
                throw th4;
            }
        }
        if (this.f61174e) {
            try {
                q(canvas, matrix, cVar, this.f61189s);
            } catch (Throwable th5) {
                td.e.b("Lottie crashed in draw!", th5);
            }
        } else {
            q(canvas, matrix, cVar, this.f61189s);
        }
        this.T = false;
        if (zX) {
            this.Z.release();
            if (cVar.P() == this.f61171b.p()) {
                return;
            }
            f61169v0.execute(this.f61188r0);
        }
    }

    public boolean p0() {
        return this.f61181l == null && this.f61170a.c().s() > 0;
    }

    public void s(b0 b0Var, boolean z15) {
        boolean zA = this.f61183n.a(b0Var, z15);
        if (this.f61170a == null || !zA) {
            return;
        }
        k();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j15) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j15);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i15) {
        this.f61189s = i15;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        td.e.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z15, boolean z16) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z15, z16);
        if (z15) {
            b bVar = this.f61175f;
            if (bVar == b.PLAY) {
                W();
                return visible;
            }
            if (bVar == b.RESUME) {
                Z();
                return visible;
            }
        } else {
            if (this.f61171b.isRunning()) {
                V();
                this.f61175f = b.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f61175f = b.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        W();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        t();
    }

    public void t() {
        this.f61176g.clear();
        this.f61171b.o();
        if (isVisible()) {
            return;
        }
        this.f61175f = b.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public fd.a w() {
        fd.a aVar = this.X;
        return aVar != null ? aVar : e.d();
    }

    public boolean x() {
        return w() == fd.a.ENABLED;
    }

    public Bitmap y(String str) {
        ld.b bVarD = D();
        if (bVarD != null) {
            return bVarD.a(str);
        }
        return null;
    }

    public boolean z() {
        return this.f61195y;
    }
}
