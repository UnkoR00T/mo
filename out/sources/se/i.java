package se;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ve.k;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class i<T extends View, Z> extends se.a<Z> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f180988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f180989g = com.bumptech.glide.h.f28773a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final T f180990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f180991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnAttachStateChangeListener f180992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f180993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f180994e;

    static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static Integer f180995e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f180996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<g> f180997b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f180998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC4652a f180999d;

        /* JADX INFO: renamed from: se.i$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC4652a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final WeakReference<a> f181000a;

            ViewTreeObserverOnPreDrawListenerC4652a(a aVar) {
                this.f181000a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                a aVar = this.f181000a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f180996a = view;
        }

        private static int c(Context context) {
            if (f180995e == null) {
                Display defaultDisplay = ((WindowManager) k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f180995e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f180995e.intValue();
        }

        private int e(int i15, int i16, int i17) {
            int i18 = i16 - i17;
            if (i18 > 0) {
                return i18;
            }
            if (this.f180998c && this.f180996a.isLayoutRequested()) {
                return 0;
            }
            int i19 = i15 - i17;
            if (i19 > 0) {
                return i19;
            }
            if (this.f180996a.isLayoutRequested() || i16 != -2) {
                return 0;
            }
            return c(this.f180996a.getContext());
        }

        private int f() {
            int paddingTop = this.f180996a.getPaddingTop() + this.f180996a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f180996a.getLayoutParams();
            return e(this.f180996a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f180996a.getPaddingLeft() + this.f180996a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f180996a.getLayoutParams();
            return e(this.f180996a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i15) {
            return i15 > 0 || i15 == Integer.MIN_VALUE;
        }

        private boolean i(int i15, int i16) {
            return h(i15) && h(i16);
        }

        private void j(int i15, int i16) {
            Iterator it = new ArrayList(this.f180997b).iterator();
            while (it.hasNext()) {
                ((g) it.next()).e(i15, i16);
            }
        }

        void a() {
            if (this.f180997b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f180996a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f180999d);
            }
            this.f180999d = null;
            this.f180997b.clear();
        }

        void d(g gVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                gVar.e(iG, iF);
                return;
            }
            if (!this.f180997b.contains(gVar)) {
                this.f180997b.add(gVar);
            }
            if (this.f180999d == null) {
                ViewTreeObserver viewTreeObserver = this.f180996a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC4652a viewTreeObserverOnPreDrawListenerC4652a = new ViewTreeObserverOnPreDrawListenerC4652a(this);
                this.f180999d = viewTreeObserverOnPreDrawListenerC4652a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC4652a);
            }
        }

        void k(g gVar) {
            this.f180997b.remove(gVar);
        }
    }

    public i(T t15) {
        this.f180990a = (T) k.d(t15);
        this.f180991b = new a(t15);
    }

    private Object k() {
        return this.f180990a.getTag(f180989g);
    }

    private void l() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f180992c;
        if (onAttachStateChangeListener == null || this.f180994e) {
            return;
        }
        this.f180990a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f180994e = true;
    }

    private void m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f180992c;
        if (onAttachStateChangeListener == null || !this.f180994e) {
            return;
        }
        this.f180990a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f180994e = false;
    }

    private void o(Object obj) {
        f180988f = true;
        this.f180990a.setTag(f180989g, obj);
    }

    @Override // se.h
    public void a(g gVar) {
        this.f180991b.k(gVar);
    }

    @Override // se.h
    public re.d b() {
        Object objK = k();
        if (objK == null) {
            return null;
        }
        if (objK instanceof re.d) {
            return (re.d) objK;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // se.a, se.h
    public void c(Drawable drawable) {
        super.c(drawable);
        l();
    }

    @Override // se.a, se.h
    public void d(Drawable drawable) {
        super.d(drawable);
        this.f180991b.b();
        if (this.f180993d) {
            return;
        }
        m();
    }

    @Override // se.h
    public void f(g gVar) {
        this.f180991b.d(gVar);
    }

    @Override // se.h
    public void i(re.d dVar) {
        o(dVar);
    }

    public String toString() {
        return "Target for: " + this.f180990a;
    }
}
