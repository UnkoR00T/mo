package ti;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.internal.l;
import com.google.android.material.internal.n;
import ij.d;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import lj.h;
import ri.j;
import ri.k;

/* JADX INFO: loaded from: classes4.dex */
public class a extends Drawable implements l.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f190371p = k.f174081o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f190372q = ri.b.f173906a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f190373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f190374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f190375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f190376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f190377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f190378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f190379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f190380h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f190381j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f190382k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f190383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WeakReference<View> f190384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WeakReference<FrameLayout> f190385n;

    private a(Context context, int i15, int i16, int i17, b.a aVar) {
        this.f190373a = new WeakReference<>(context);
        n.c(context);
        this.f190376d = new Rect();
        l lVar = new l(this);
        this.f190375c = lVar;
        lVar.g().setTextAlign(Paint.Align.CENTER);
        b bVar = new b(context, i15, i16, i17, aVar);
        this.f190377e = bVar;
        this.f190374b = new h(lj.l.b(context, y() ? bVar.m() : bVar.i(), y() ? bVar.l() : bVar.h()).m());
        K();
    }

    private void B() {
        this.f190375c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void C() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f190377e.e());
        if (this.f190374b.B() != colorStateListValueOf) {
            this.f190374b.g0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void D() {
        this.f190375c.l(true);
        F();
        N();
        invalidateSelf();
    }

    private void E() {
        WeakReference<View> weakReference = this.f190384m;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.f190384m.get();
        WeakReference<FrameLayout> weakReference2 = this.f190385n;
        M(view, weakReference2 != null ? weakReference2.get() : null);
    }

    private void F() {
        Context context = this.f190373a.get();
        if (context == null) {
            return;
        }
        this.f190374b.setShapeAppearanceModel(lj.l.b(context, y() ? this.f190377e.m() : this.f190377e.i(), y() ? this.f190377e.l() : this.f190377e.h()).m());
        invalidateSelf();
    }

    private void G() {
        d dVar;
        Context context = this.f190373a.get();
        if (context == null || this.f190375c.e() == (dVar = new d(context, this.f190377e.z()))) {
            return;
        }
        this.f190375c.k(dVar, context);
        H();
        N();
        invalidateSelf();
    }

    private void H() {
        this.f190375c.g().setColor(this.f190377e.j());
        invalidateSelf();
    }

    private void I() {
        O();
        this.f190375c.l(true);
        N();
        invalidateSelf();
    }

    private void J() {
        setVisible(this.f190377e.F(), false);
    }

    private void K() {
        F();
        G();
        I();
        D();
        B();
        C();
        H();
        E();
        N();
        J();
    }

    private static void L(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void N() {
        Context context = this.f190373a.get();
        WeakReference<View> weakReference = this.f190384m;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f190376d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f190385n;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null) {
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        d(rect2, view);
        c.d(this.f190376d, this.f190378f, this.f190379g, this.f190382k, this.f190383l);
        float f15 = this.f190381j;
        if (f15 != -1.0f) {
            this.f190374b.c0(f15);
        }
        if (rect.equals(this.f190376d)) {
            return;
        }
        this.f190374b.setBounds(this.f190376d);
    }

    private void O() {
        if (m() != -2) {
            this.f190380h = ((int) Math.pow(10.0d, ((double) m()) - 1.0d)) - 1;
        } else {
            this.f190380h = n();
        }
    }

    private void b(View view) {
        ViewParent viewParentJ = j();
        if (viewParentJ == null) {
            viewParentJ = view.getParent();
        }
        if ((viewParentJ instanceof View) && (viewParentJ.getParent() instanceof View)) {
            c(view, (View) viewParentJ.getParent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(View view, View view2) {
        float y15;
        float x15;
        ViewParent parent;
        boolean z15;
        FrameLayout frameLayoutJ = j();
        if (frameLayoutJ == null) {
            float y16 = view.getY();
            x15 = view.getX();
            parent = view.getParent();
            y15 = y16;
        } else {
            y15 = 0.0f;
            x15 = 0.0f;
            parent = frameLayoutJ;
        }
        while (true) {
            z15 = parent instanceof View;
            if (!z15 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y15 += view3.getY();
            x15 += view3.getX();
            parent = parent.getParent();
        }
        if (z15) {
            float fV = v(y15);
            float fL = l(x15);
            View view4 = (View) parent;
            float fH = h(view4.getHeight(), y15);
            float fR = r(view4.getWidth(), x15);
            if (fV < 0.0f) {
                this.f190379g += Math.abs(fV);
            }
            if (fL < 0.0f) {
                this.f190378f += Math.abs(fL);
            }
            if (fH > 0.0f) {
                this.f190379g -= Math.abs(fH);
            }
            if (fR > 0.0f) {
                this.f190378f -= Math.abs(fR);
            }
        }
    }

    private void d(Rect rect, View view) {
        float f15;
        float f16;
        float f17 = y() ? this.f190377e.f190389d : this.f190377e.f190388c;
        this.f190381j = f17;
        if (f17 != -1.0f) {
            this.f190382k = f17;
            this.f190383l = f17;
        } else {
            this.f190382k = Math.round((y() ? this.f190377e.f190392g : this.f190377e.f190390e) / 2.0f);
            this.f190383l = Math.round((y() ? this.f190377e.f190393h : this.f190377e.f190391f) / 2.0f);
        }
        if (y()) {
            String strG = g();
            this.f190382k = Math.max(this.f190382k, (this.f190375c.h(strG) / 2.0f) + this.f190377e.g());
            float fMax = Math.max(this.f190383l, (this.f190375c.f(strG) / 2.0f) + this.f190377e.k());
            this.f190383l = fMax;
            this.f190382k = Math.max(this.f190382k, fMax);
        }
        int iX = x();
        int iF = this.f190377e.f();
        if (iF == 8388691 || iF == 8388693) {
            this.f190379g = rect.bottom - iX;
        } else {
            this.f190379g = rect.top + iX;
        }
        int iW = w();
        int iF2 = this.f190377e.f();
        if (iF2 == 8388659 || iF2 == 8388691) {
            if (this.f190377e.f190397l == 0) {
                f15 = view.getLayoutDirection() == 0 ? (rect.left + this.f190382k) - ((this.f190383l * 2.0f) - iW) : (rect.right - this.f190382k) + ((this.f190383l * 2.0f) - iW);
            } else {
                f15 = view.getLayoutDirection() == 0 ? (rect.left - this.f190382k) + iW : (rect.right + this.f190382k) - iW;
            }
            this.f190378f = f15;
        } else {
            if (this.f190377e.f190397l == 0) {
                f16 = view.getLayoutDirection() == 0 ? (rect.right + this.f190382k) - iW : (rect.left - this.f190382k) + iW;
            } else {
                f16 = view.getLayoutDirection() == 0 ? (rect.right - this.f190382k) + ((this.f190383l * 2.0f) - iW) : (rect.left + this.f190382k) - ((this.f190383l * 2.0f) - iW);
            }
            this.f190378f = f16;
        }
        if (this.f190377e.E()) {
            b(view);
        } else {
            c(view, null);
        }
    }

    public static a e(Context context) {
        return new a(context, 0, f190372q, f190371p, null);
    }

    private void f(Canvas canvas) {
        String strG = g();
        if (strG != null) {
            Rect rect = new Rect();
            this.f190375c.g().getTextBounds(strG, 0, strG.length(), rect);
            float fExactCenterY = this.f190379g - rect.exactCenterY();
            canvas.drawText(strG, this.f190378f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), this.f190375c.g());
        }
    }

    private String g() {
        if (A()) {
            return t();
        }
        if (z()) {
            return p();
        }
        return null;
    }

    private float h(float f15, float f16) {
        return ((this.f190379g + this.f190383l) - f15) + f16;
    }

    private CharSequence k() {
        return this.f190377e.p();
    }

    private float l(float f15) {
        return (this.f190378f - this.f190382k) + f15;
    }

    private String p() {
        if (this.f190380h == -2 || o() <= this.f190380h) {
            return NumberFormat.getInstance(this.f190377e.x()).format(o());
        }
        Context context = this.f190373a.get();
        return context == null ? "" : String.format(this.f190377e.x(), context.getString(j.f174056p), Integer.valueOf(this.f190380h), "+");
    }

    private String q() {
        Context context;
        if (this.f190377e.q() == 0 || (context = this.f190373a.get()) == null) {
            return null;
        }
        return (this.f190380h == -2 || o() <= this.f190380h) ? context.getResources().getQuantityString(this.f190377e.q(), o(), Integer.valueOf(o())) : context.getString(this.f190377e.n(), Integer.valueOf(this.f190380h));
    }

    private float r(float f15, float f16) {
        return ((this.f190378f + this.f190382k) - f15) + f16;
    }

    private String t() {
        String strS = s();
        int iM = m();
        if (iM == -2 || strS == null || strS.length() <= iM) {
            return strS;
        }
        Context context = this.f190373a.get();
        if (context == null) {
            return "";
        }
        return String.format(context.getString(j.f174049i), strS.substring(0, iM - 1), "…");
    }

    private CharSequence u() {
        CharSequence charSequenceO = this.f190377e.o();
        return charSequenceO != null ? charSequenceO : s();
    }

    private float v(float f15) {
        return (this.f190379g - this.f190383l) + f15;
    }

    private int w() {
        int iR = y() ? this.f190377e.r() : this.f190377e.s();
        if (this.f190377e.f190396k == 1) {
            iR += y() ? this.f190377e.f190395j : this.f190377e.f190394i;
        }
        return iR + this.f190377e.b();
    }

    private int x() {
        int iB = this.f190377e.B();
        if (y()) {
            iB = this.f190377e.A();
            Context context = this.f190373a.get();
            if (context != null) {
                iB = si.a.c(iB, iB - this.f190377e.t(), si.a.b(0.0f, 1.0f, 0.3f, 1.0f, ij.c.e(context) - 1.0f));
            }
        }
        if (this.f190377e.f190396k == 0) {
            iB -= Math.round(this.f190383l);
        }
        return iB + this.f190377e.c();
    }

    private boolean y() {
        return A() || z();
    }

    public boolean A() {
        return this.f190377e.D();
    }

    public void M(View view, FrameLayout frameLayout) {
        this.f190384m = new WeakReference<>(view);
        this.f190385n = new WeakReference<>(frameLayout);
        L(view);
        N();
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.l.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f190374b.draw(canvas);
        if (y()) {
            f(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f190377e.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f190376d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f190376d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public CharSequence i() {
        if (!isVisible()) {
            return null;
        }
        if (A()) {
            return u();
        }
        return z() ? q() : k();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public FrameLayout j() {
        WeakReference<FrameLayout> weakReference = this.f190385n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int m() {
        return this.f190377e.u();
    }

    public int n() {
        return this.f190377e.v();
    }

    public int o() {
        if (this.f190377e.C()) {
            return this.f190377e.w();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.l.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public String s() {
        return this.f190377e.y();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i15) {
        this.f190377e.H(i15);
        B();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean z() {
        return !this.f190377e.D() && this.f190377e.C();
    }
}
