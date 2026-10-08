package lj;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import io.sentry.android.core.c2;
import java.util.BitSet;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public class h extends Drawable implements o {
    private static final String I = "h";
    static final l K = l.a().q(0, 0.0f).m();
    private static final Paint L;
    private static final e[] O;
    private boolean A;
    private boolean B;
    private l C;
    private z6.j D;
    z6.i[] E;
    private float[] F;
    private float[] G;
    private d H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l.c f118476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f118477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n.g[] f118478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n.g[] f118479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BitSet f118480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f118481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f118482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Matrix f118483h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f118484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f118485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RectF f118486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RectF f118487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Region f118488n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Region f118489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Paint f118490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Paint f118491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final kj.a f118492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final m.b f118493t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final m f118494v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private PorterDuffColorFilter f118495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private PorterDuffColorFilter f118496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f118497y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final RectF f118498z;

    class a implements l.c {
        a() {
        }

        @Override // lj.l.c
        public lj.d a(lj.d dVar) {
            return dVar instanceof j ? dVar : new lj.b(-h.this.K(), dVar);
        }
    }

    class b implements m.b {
        b() {
        }

        @Override // lj.m.b
        public void a(n nVar, Matrix matrix, int i15) {
            h.this.f118480e.set(i15 + 4, nVar.e());
            h.this.f118479d[i15] = nVar.f(matrix);
        }

        @Override // lj.m.b
        public void b(n nVar, Matrix matrix, int i15) {
            h.this.f118480e.set(i15, nVar.e());
            h.this.f118478c[i15] = nVar.f(matrix);
        }
    }

    public interface d {
        void a(float f15);
    }

    private static class e extends z6.f<h> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f118524b;

        e(int i15) {
            super("cornerSizeAtIndex" + i15);
            this.f118524b = i15;
        }

        @Override // z6.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(h hVar) {
            if (hVar.F != null) {
                return hVar.F[this.f118524b];
            }
            return 0.0f;
        }

        @Override // z6.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(h hVar, float f15) {
            if (hVar.F == null || hVar.F[this.f118524b] == f15) {
                return;
            }
            hVar.F[this.f118524b] = f15;
            if (hVar.H != null) {
                hVar.H.a(hVar.z());
            }
            hVar.invalidateSelf();
        }
    }

    static {
        int i15 = 0;
        Paint paint = new Paint(1);
        L = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        O = new e[4];
        while (true) {
            e[] eVarArr = O;
            if (i15 >= eVarArr.length) {
                return;
            }
            eVarArr[i15] = new e(i15);
            i15++;
        }
    }

    public h() {
        this(new l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float K() {
        if (T()) {
            return this.f118491r.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean R() {
        c cVar = this.f118477b;
        int i15 = cVar.f118518r;
        if (i15 == 1 || cVar.f118519s <= 0) {
            return false;
        }
        return i15 == 2 || b0();
    }

    private boolean S() {
        Paint.Style style = this.f118477b.f118523w;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean T() {
        Paint.Style style = this.f118477b.f118523w;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f118491r.getStrokeWidth() > 0.0f;
    }

    private void V() {
        super.invalidateSelf();
    }

    private void Y(Canvas canvas) {
        if (R()) {
            canvas.save();
            a0(canvas);
            if (!this.A) {
                s(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f118498z.width() - getBounds().width());
            int iHeight = (int) (this.f118498z.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f118498z.width()) + (this.f118477b.f118519s * 2) + iWidth, ((int) this.f118498z.height()) + (this.f118477b.f118519s * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f15 = (getBounds().left - this.f118477b.f118519s) - iWidth;
            float f16 = (getBounds().top - this.f118477b.f118519s) - iHeight;
            canvas2.translate(-f15, -f16);
            s(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f15, f16, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int Z(int i15, int i16) {
        return (i15 * (i16 + (i16 >>> 7))) >>> 8;
    }

    private void a0(Canvas canvas) {
        canvas.translate(F(), G());
    }

    private PorterDuffColorFilter j(Paint paint, boolean z15) {
        if (!z15) {
            return null;
        }
        int color = paint.getColor();
        int iQ = q(color);
        this.f118497y = iQ;
        if (iQ != color) {
            return new PorterDuffColorFilter(iQ, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void k(RectF rectF, Path path) {
        l(rectF, path);
        if (this.f118477b.f118511k != 1.0f) {
            this.f118483h.reset();
            Matrix matrix = this.f118483h;
            float f15 = this.f118477b.f118511k;
            matrix.setScale(f15, f15, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f118483h);
        }
        path.computeBounds(this.f118498z, true);
    }

    private float m(RectF rectF, l lVar, float[] fArr) {
        if (fArr == null) {
            if (lVar.v(rectF)) {
                return lVar.r().a(rectF);
            }
            return -1.0f;
        }
        if (fj.a.a(fArr) && lVar.u()) {
            return fArr[0];
        }
        return -1.0f;
    }

    private void n() {
        t0();
        this.f118494v.f(this.C, this.G, this.f118477b.f118512l, y(), null, this.f118485k);
    }

    private PorterDuffColorFilter o(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z15) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z15) {
            colorForState = q(colorForState);
        }
        this.f118497y = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter p(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z15) {
        return (colorStateList == null || mode == null) ? j(paint, z15) : o(colorStateList, mode, z15);
    }

    private boolean q0(int[] iArr) {
        boolean z15;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f118477b.f118505e == null || color2 == (colorForState2 = this.f118477b.f118505e.getColorForState(iArr, (color2 = this.f118490q.getColor())))) {
            z15 = false;
        } else {
            this.f118490q.setColor(colorForState2);
            z15 = true;
        }
        if (this.f118477b.f118506f == null || color == (colorForState = this.f118477b.f118506f.getColorForState(iArr, (color = this.f118491r.getColor())))) {
            return z15;
        }
        this.f118491r.setColor(colorForState);
        return true;
    }

    public static h r(Context context, float f15, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(bj.a.c(context, ri.b.f173912g, h.class.getSimpleName()));
        }
        h hVar = new h();
        hVar.U(context);
        hVar.g0(colorStateList);
        hVar.f0(f15);
        return hVar;
    }

    private void r0(int[] iArr) {
        s0(iArr, false);
    }

    private void s(Canvas canvas) {
        if (this.f118480e.cardinality() > 0) {
            c2.g(I, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f118477b.f118520t != 0) {
            canvas.drawPath(this.f118484j, this.f118492s.c());
        }
        for (int i15 = 0; i15 < 4; i15++) {
            this.f118478c[i15].b(this.f118492s, this.f118477b.f118519s, canvas);
            this.f118479d[i15].b(this.f118492s, this.f118477b.f118519s, canvas);
        }
        if (this.A) {
            int iF = F();
            int iG = G();
            canvas.translate(-iF, -iG);
            canvas.drawPath(this.f118484j, L);
            canvas.translate(iF, iG);
        }
    }

    private void s0(int[] iArr, boolean z15) {
        RectF rectFX = x();
        if (this.f118477b.f118502b == null || rectFX.isEmpty()) {
            return;
        }
        boolean z16 = z15 | (this.D == null);
        if (this.F == null) {
            this.F = new float[4];
        }
        l lVarD = this.f118477b.f118502b.d(iArr);
        for (int i15 = 0; i15 < 4; i15++) {
            float fA = this.f118494v.h(i15, lVarD).a(rectFX);
            if (z16) {
                this.F[i15] = fA;
            }
            z6.i iVar = this.E[i15];
            if (iVar != null) {
                iVar.t(fA);
                if (z16) {
                    this.E[i15].y();
                }
            }
        }
        if (z16) {
            invalidateSelf();
        }
    }

    private void t(Canvas canvas) {
        v(canvas, this.f118490q, this.f118484j, this.f118477b.f118501a, this.F, x());
    }

    private void t0() {
        this.C = I().z(this.f118476a);
        float[] fArr = this.F;
        if (fArr == null) {
            this.G = null;
            return;
        }
        if (this.G == null) {
            this.G = new float[fArr.length];
        }
        float fK = K();
        int i15 = 0;
        while (true) {
            float[] fArr2 = this.F;
            if (i15 >= fArr2.length) {
                return;
            }
            this.G[i15] = Math.max(0.0f, fArr2[i15] - fK);
            i15++;
        }
    }

    private boolean u0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f118495w;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f118496x;
        c cVar = this.f118477b;
        this.f118495w = p(cVar.f118508h, cVar.f118509i, this.f118490q, true);
        c cVar2 = this.f118477b;
        this.f118496x = p(cVar2.f118507g, cVar2.f118509i, this.f118491r, false);
        c cVar3 = this.f118477b;
        if (cVar3.f118522v) {
            this.f118492s.d(cVar3.f118508h.getColorForState(getState(), 0));
        }
        return (i6.c.a(porterDuffColorFilter, this.f118495w) && i6.c.a(porterDuffColorFilter2, this.f118496x)) ? false : true;
    }

    private void v(Canvas canvas, Paint paint, Path path, l lVar, float[] fArr, RectF rectF) {
        float fM = m(rectF, lVar, fArr);
        if (fM < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f15 = fM * this.f118477b.f118512l;
            canvas.drawRoundRect(rectF, f15, f15, paint);
        }
    }

    private void v0() {
        float fQ = Q();
        this.f118477b.f118519s = (int) Math.ceil(0.75f * fQ);
        this.f118477b.f118520t = (int) Math.ceil(fQ * 0.25f);
        u0();
        V();
    }

    private RectF y() {
        this.f118487m.set(x());
        float fK = K();
        this.f118487m.inset(fK, fK);
        return this.f118487m;
    }

    public float A() {
        return this.f118477b.f118516p;
    }

    public ColorStateList B() {
        return this.f118477b.f118505e;
    }

    public float C() {
        return this.f118477b.f118512l;
    }

    public float D() {
        return this.f118477b.f118515o;
    }

    public int E() {
        return this.f118497y;
    }

    public int F() {
        c cVar = this.f118477b;
        return (int) (((double) cVar.f118520t) * Math.sin(Math.toRadians(cVar.f118521u)));
    }

    public int G() {
        c cVar = this.f118477b;
        return (int) (((double) cVar.f118520t) * Math.cos(Math.toRadians(cVar.f118521u)));
    }

    public int H() {
        return this.f118477b.f118519s;
    }

    public l I() {
        return this.f118477b.f118501a;
    }

    public ColorStateList J() {
        return this.f118477b.f118506f;
    }

    public float L() {
        return this.f118477b.f118513m;
    }

    public ColorStateList M() {
        return this.f118477b.f118508h;
    }

    public float N() {
        float[] fArr = this.F;
        return fArr != null ? fArr[3] : this.f118477b.f118501a.r().a(x());
    }

    public float O() {
        float[] fArr = this.F;
        return fArr != null ? fArr[0] : this.f118477b.f118501a.t().a(x());
    }

    public float P() {
        return this.f118477b.f118517q;
    }

    public float Q() {
        return A() + P();
    }

    public void U(Context context) {
        this.f118477b.f118503c = new dj.a(context);
        v0();
    }

    public boolean W() {
        dj.a aVar = this.f118477b.f118503c;
        return aVar != null && aVar.d();
    }

    public boolean X() {
        if (this.f118477b.f118501a.v(x())) {
            return true;
        }
        float[] fArr = this.F;
        return fArr != null && fj.a.a(fArr) && this.f118477b.f118501a.u();
    }

    public boolean b0() {
        return (X() || this.f118484j.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void c0(float f15) {
        setShapeAppearanceModel(this.f118477b.f118501a.x(f15));
    }

    public void d0(lj.d dVar) {
        setShapeAppearanceModel(this.f118477b.f118501a.y(dVar));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f118490q.setColorFilter(this.f118495w);
        int alpha = this.f118490q.getAlpha();
        this.f118490q.setAlpha(Z(alpha, this.f118477b.f118514n));
        this.f118491r.setColorFilter(this.f118496x);
        this.f118491r.setStrokeWidth(this.f118477b.f118513m);
        int alpha2 = this.f118491r.getAlpha();
        this.f118491r.setAlpha(Z(alpha2, this.f118477b.f118514n));
        if (S()) {
            if (this.f118481f) {
                k(x(), this.f118484j);
                this.f118481f = false;
            }
            Y(canvas);
            t(canvas);
        }
        if (T()) {
            if (this.f118482g) {
                n();
                this.f118482g = false;
            }
            w(canvas);
        }
        this.f118490q.setAlpha(alpha);
        this.f118491r.setAlpha(alpha2);
    }

    public void e0(z6.j jVar) {
        if (this.D == jVar) {
            return;
        }
        this.D = jVar;
        int i15 = 0;
        while (true) {
            z6.i[] iVarArr = this.E;
            if (i15 >= iVarArr.length) {
                s0(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (iVarArr[i15] == null) {
                    iVarArr[i15] = new z6.i(this, O[i15]);
                }
                this.E[i15].x(new z6.j().f(jVar.a()).h(jVar.c()));
                i15++;
            }
        }
    }

    public void f0(float f15) {
        c cVar = this.f118477b;
        if (cVar.f118516p != f15) {
            cVar.f118516p = f15;
            v0();
        }
    }

    public void g0(ColorStateList colorStateList) {
        c cVar = this.f118477b;
        if (cVar.f118505e != colorStateList) {
            cVar.f118505e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f118477b.f118514n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f118477b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f118477b.f118518r == 2) {
            return;
        }
        RectF rectFX = x();
        if (rectFX.isEmpty()) {
            return;
        }
        float fM = m(rectFX, this.f118477b.f118501a, this.F);
        if (fM >= 0.0f) {
            outline.setRoundRect(getBounds(), fM * this.f118477b.f118512l);
            return;
        }
        if (this.f118481f) {
            k(rectFX, this.f118484j);
            this.f118481f = false;
        }
        com.google.android.material.drawable.c.j(outline, this.f118484j);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f118477b.f118510j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f118488n.set(getBounds());
        k(x(), this.f118484j);
        this.f118489p.setPath(this.f118484j, this.f118488n);
        this.f118488n.op(this.f118489p, Region.Op.DIFFERENCE);
        return this.f118488n;
    }

    public void h0(float f15) {
        c cVar = this.f118477b;
        if (cVar.f118512l != f15) {
            cVar.f118512l = f15;
            this.f118481f = true;
            this.f118482g = true;
            invalidateSelf();
        }
    }

    public void i0(d dVar) {
        this.H = dVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f118481f = true;
        this.f118482g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f118477b.f118508h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f118477b.f118507g;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f118477b.f118506f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f118477b.f118505e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        q qVar = this.f118477b.f118502b;
        return qVar != null && qVar.f();
    }

    public void j0(int i15, int i16, int i17, int i18) {
        c cVar = this.f118477b;
        if (cVar.f118510j == null) {
            cVar.f118510j = new Rect();
        }
        this.f118477b.f118510j.set(i15, i16, i17, i18);
        invalidateSelf();
    }

    public void k0(float f15) {
        c cVar = this.f118477b;
        if (cVar.f118515o != f15) {
            cVar.f118515o = f15;
            v0();
        }
    }

    protected final void l(RectF rectF, Path path) {
        m mVar = this.f118494v;
        c cVar = this.f118477b;
        mVar.f(cVar.f118501a, this.F, cVar.f118512l, rectF, this.f118493t, path);
    }

    public void l0(q qVar) {
        c cVar = this.f118477b;
        if (cVar.f118502b != qVar) {
            cVar.f118502b = qVar;
            s0(getState(), true);
            invalidateSelf();
        }
    }

    public void m0(float f15, int i15) {
        p0(f15);
        o0(ColorStateList.valueOf(i15));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f118477b = new c(this.f118477b);
        return this;
    }

    public void n0(float f15, ColorStateList colorStateList) {
        p0(f15);
        o0(colorStateList);
    }

    public void o0(ColorStateList colorStateList) {
        c cVar = this.f118477b;
        if (cVar.f118506f != colorStateList) {
            cVar.f118506f = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f118481f = true;
        this.f118482g = true;
        super.onBoundsChange(rect);
        if (this.f118477b.f118502b != null && !rect.isEmpty()) {
            s0(getState(), this.B);
        }
        this.B = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.l.b
    protected boolean onStateChange(int[] iArr) {
        if (this.f118477b.f118502b != null) {
            r0(iArr);
        }
        boolean z15 = q0(iArr) || u0();
        if (z15) {
            invalidateSelf();
        }
        return z15;
    }

    public void p0(float f15) {
        this.f118477b.f118513m = f15;
        invalidateSelf();
    }

    protected int q(int i15) {
        float fQ = Q() + D();
        dj.a aVar = this.f118477b.f118503c;
        return aVar != null ? aVar.c(i15, fQ) : i15;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i15) {
        c cVar = this.f118477b;
        if (cVar.f118514n != i15) {
            cVar.f118514n = i15;
            V();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f118477b.f118504d = colorFilter;
        V();
    }

    @Override // lj.o
    public void setShapeAppearanceModel(l lVar) {
        c cVar = this.f118477b;
        cVar.f118501a = lVar;
        cVar.f118502b = null;
        this.F = null;
        this.G = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i15) {
        setTintList(ColorStateList.valueOf(i15));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f118477b.f118508h = colorStateList;
        u0();
        V();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f118477b;
        if (cVar.f118509i != mode) {
            cVar.f118509i = mode;
            u0();
            V();
        }
    }

    protected void u(Canvas canvas, Paint paint, Path path, RectF rectF) {
        v(canvas, paint, path, this.f118477b.f118501a, this.F, rectF);
    }

    protected void w(Canvas canvas) {
        v(canvas, this.f118491r, this.f118485k, this.C, this.G, y());
    }

    protected RectF x() {
        this.f118486l.set(getBounds());
        return this.f118486l;
    }

    public float z() {
        float fA;
        float fA2;
        float[] fArr = this.F;
        if (fArr != null) {
            fA = (fArr[3] + fArr[2]) - fArr[1];
            fA2 = fArr[0];
        } else {
            RectF rectFX = x();
            fA = (this.f118494v.h(3, I()).a(rectFX) + this.f118494v.h(2, I()).a(rectFX)) - this.f118494v.h(1, I()).a(rectFX);
            fA2 = this.f118494v.h(0, I()).a(rectFX);
        }
        return (fA - fA2) / 2.0f;
    }

    public h(Context context, AttributeSet attributeSet, int i15, int i16) {
        this(l.e(context, attributeSet, i15, i16).m());
    }

    public h(l lVar) {
        this(new c(lVar, null));
    }

    protected h(c cVar) {
        m mVar;
        this.f118476a = new a();
        this.f118478c = new n.g[4];
        this.f118479d = new n.g[4];
        this.f118480e = new BitSet(8);
        this.f118483h = new Matrix();
        this.f118484j = new Path();
        this.f118485k = new Path();
        this.f118486l = new RectF();
        this.f118487m = new RectF();
        this.f118488n = new Region();
        this.f118489p = new Region();
        Paint paint = new Paint(1);
        this.f118490q = paint;
        Paint paint2 = new Paint(1);
        this.f118491r = paint2;
        this.f118492s = new kj.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = m.l();
        } else {
            mVar = new m();
        }
        this.f118494v = mVar;
        this.f118498z = new RectF();
        this.A = true;
        this.B = true;
        this.E = new z6.i[4];
        this.f118477b = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        u0();
        q0(getState());
        this.f118493t = new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        l f118501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        q f118502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        dj.a f118503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ColorFilter f118504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ColorStateList f118505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ColorStateList f118506f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f118507g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ColorStateList f118508h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        PorterDuff.Mode f118509i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Rect f118510j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f118511k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f118512l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f118513m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f118514n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f118515o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f118516p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f118517q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f118518r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f118519s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f118520t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f118521u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f118522v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Paint.Style f118523w;

        public c(l lVar, dj.a aVar) {
            this.f118505e = null;
            this.f118506f = null;
            this.f118507g = null;
            this.f118508h = null;
            this.f118509i = PorterDuff.Mode.SRC_IN;
            this.f118510j = null;
            this.f118511k = 1.0f;
            this.f118512l = 1.0f;
            this.f118514n = GF2Field.MASK;
            this.f118515o = 0.0f;
            this.f118516p = 0.0f;
            this.f118517q = 0.0f;
            this.f118518r = 0;
            this.f118519s = 0;
            this.f118520t = 0;
            this.f118521u = 0;
            this.f118522v = false;
            this.f118523w = Paint.Style.FILL_AND_STROKE;
            this.f118501a = lVar;
            this.f118503c = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h(this);
            hVar.f118481f = true;
            hVar.f118482g = true;
            return hVar;
        }

        public c(c cVar) {
            this.f118505e = null;
            this.f118506f = null;
            this.f118507g = null;
            this.f118508h = null;
            this.f118509i = PorterDuff.Mode.SRC_IN;
            this.f118510j = null;
            this.f118511k = 1.0f;
            this.f118512l = 1.0f;
            this.f118514n = GF2Field.MASK;
            this.f118515o = 0.0f;
            this.f118516p = 0.0f;
            this.f118517q = 0.0f;
            this.f118518r = 0;
            this.f118519s = 0;
            this.f118520t = 0;
            this.f118521u = 0;
            this.f118522v = false;
            this.f118523w = Paint.Style.FILL_AND_STROKE;
            this.f118501a = cVar.f118501a;
            this.f118502b = cVar.f118502b;
            this.f118503c = cVar.f118503c;
            this.f118513m = cVar.f118513m;
            this.f118504d = cVar.f118504d;
            this.f118505e = cVar.f118505e;
            this.f118506f = cVar.f118506f;
            this.f118509i = cVar.f118509i;
            this.f118508h = cVar.f118508h;
            this.f118514n = cVar.f118514n;
            this.f118511k = cVar.f118511k;
            this.f118520t = cVar.f118520t;
            this.f118518r = cVar.f118518r;
            this.f118522v = cVar.f118522v;
            this.f118512l = cVar.f118512l;
            this.f118515o = cVar.f118515o;
            this.f118516p = cVar.f118516p;
            this.f118517q = cVar.f118517q;
            this.f118519s = cVar.f118519s;
            this.f118521u = cVar.f118521u;
            this.f118507g = cVar.f118507g;
            this.f118523w = cVar.f118523w;
            if (cVar.f118510j != null) {
                this.f118510j = new Rect(cVar.f118510j);
            }
        }
    }
}
