package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f8913b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static k f8914c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p0 f8915a;

    class a implements p0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f8916a = {p007NuL.q.R, p007NuL.q.P, p007NuL.q.f352a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f8917b = {p007NuL.q.f366o, p007NuL.q.B, p007NuL.q.f371t, p007NuL.q.f367p, p007NuL.q.f368q, p007NuL.q.f370s, p007NuL.q.f369r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f8918c = {p007NuL.q.O, p007NuL.q.Q, p007NuL.q.f362k, p007NuL.q.K, p007NuL.q.L, p007NuL.q.M, p007NuL.q.N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f8919d = {p007NuL.q.f374w, p007NuL.q.f360i, p007NuL.q.f373v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f8920e = {p007NuL.q.J, p007NuL.q.S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f8921f = {p007NuL.q.f354c, p007NuL.q.f358g, p007NuL.q.f355d, p007NuL.q.f359h};

        a() {
        }

        private boolean f(int[] iArr, int i15) {
            for (int i16 : iArr) {
                if (i16 == i15) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i15) {
            int iC = u0.c(context, p007NuL.m.f330w);
            return new ColorStateList(new int[][]{u0.f9070b, u0.f9073e, u0.f9071c, u0.f9077i}, new int[]{u0.b(context, p007NuL.m.f328u), x5.c.g(iC, i15), x5.c.g(iC, i15), i15});
        }

        private ColorStateList i(Context context) {
            return h(context, u0.c(context, p007NuL.m.f327t));
        }

        private ColorStateList j(Context context) {
            return h(context, u0.c(context, p007NuL.m.f328u));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = u0.e(context, p007NuL.m.A);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = u0.f9070b;
                iArr2[0] = u0.b(context, p007NuL.m.A);
                iArr[1] = u0.f9074f;
                iArr2[1] = u0.c(context, p007NuL.m.f329v);
                iArr[2] = u0.f9077i;
                iArr2[2] = u0.c(context, p007NuL.m.A);
            } else {
                int[] iArr3 = u0.f9070b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = u0.f9074f;
                iArr2[1] = u0.c(context, p007NuL.m.f329v);
                iArr[2] = u0.f9077i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(p0 p0Var, Context context, int i15) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i15);
            Drawable drawableI = p0Var.i(context, p007NuL.q.F);
            Drawable drawableI2 = p0Var.i(context, p007NuL.q.G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i15, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = k.f8913b;
            }
            drawableMutate.setColorFilter(k.e(i15, mode));
        }

        @Override // androidx.appcompat.widget.p0.c
        public Drawable a(p0 p0Var, Context context, int i15) {
            if (i15 == p007NuL.q.f361j) {
                return new LayerDrawable(new Drawable[]{p0Var.i(context, p007NuL.q.f360i), p0Var.i(context, p007NuL.q.f362k)});
            }
            if (i15 == p007NuL.q.f376y) {
                return l(p0Var, context, p007NuL.p.f349g);
            }
            if (i15 == p007NuL.q.f375x) {
                return l(p0Var, context, p007NuL.p.f350h);
            }
            if (i15 == p007NuL.q.f377z) {
                return l(p0Var, context, p007NuL.p.f351i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.p0.c
        public ColorStateList b(Context context, int i15) {
            if (i15 == p007NuL.q.f364m) {
                return p082nUL.y.a(context, p007NuL.o.f339e);
            }
            if (i15 == p007NuL.q.I) {
                return p082nUL.y.a(context, p007NuL.o.f342h);
            }
            if (i15 == p007NuL.q.H) {
                return k(context);
            }
            if (i15 == p007NuL.q.f357f) {
                return j(context);
            }
            if (i15 == p007NuL.q.f353b) {
                return g(context);
            }
            if (i15 == p007NuL.q.f356e) {
                return i(context);
            }
            if (i15 == p007NuL.q.D || i15 == p007NuL.q.E) {
                return p082nUL.y.a(context, p007NuL.o.f341g);
            }
            if (f(this.f8917b, i15)) {
                return u0.e(context, p007NuL.m.f331x);
            }
            if (f(this.f8920e, i15)) {
                return p082nUL.y.a(context, p007NuL.o.f338d);
            }
            if (f(this.f8921f, i15)) {
                return p082nUL.y.a(context, p007NuL.o.f337c);
            }
            if (i15 == p007NuL.q.A) {
                return p082nUL.y.a(context, p007NuL.o.f340f);
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0050  */
        /* JADX WARN: Code duplicated, block: B:25:0x0061  */
        /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
        @Override // androidx.appcompat.widget.p0.c
        public boolean c(Context context, int i15, Drawable drawable) {
            int i16;
            boolean z15;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = k.f8913b;
            if (!f(this.f8916a, i15)) {
                if (f(this.f8918c, i15)) {
                    i16 = p007NuL.m.f329v;
                } else {
                    if (f(this.f8919d, i15)) {
                        mode = PorterDuff.Mode.MULTIPLY;
                    } else {
                        if (i15 == p007NuL.q.f372u) {
                            iRound = Math.round(40.8f);
                            i16 = 16842800;
                            mode = mode;
                        } else if (i15 != p007NuL.q.f363l) {
                            i16 = 0;
                            z15 = false;
                            iRound = -1;
                        }
                        z15 = true;
                    }
                    mode = mode;
                    iRound = -1;
                    i16 = 16842801;
                    z15 = true;
                }
                if (z15) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(k.e(u0.c(context, i16), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            i16 = p007NuL.m.f331x;
            z15 = true;
            iRound = -1;
            if (z15) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(k.e(u0.c(context, i16), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }

        @Override // androidx.appcompat.widget.p0.c
        public PorterDuff.Mode d(int i15) {
            if (i15 == p007NuL.q.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.p0.c
        public boolean e(Context context, int i15, Drawable drawable) {
            if (i15 == p007NuL.q.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), u0.c(context, p007NuL.m.f331x), k.f8913b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), u0.c(context, p007NuL.m.f331x), k.f8913b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), u0.c(context, p007NuL.m.f329v), k.f8913b);
                return true;
            }
            if (i15 != p007NuL.q.f376y && i15 != p007NuL.q.f375x && i15 != p007NuL.q.f377z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), u0.b(context, p007NuL.m.f331x), k.f8913b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), u0.c(context, p007NuL.m.f329v), k.f8913b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), u0.c(context, p007NuL.m.f329v), k.f8913b);
            return true;
        }
    }

    public static synchronized k b() {
        try {
            if (f8914c == null) {
                h();
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return f8914c;
    }

    public static synchronized PorterDuffColorFilter e(int i15, PorterDuff.Mode mode) {
        return p0.k(i15, mode);
    }

    public static synchronized void h() {
        if (f8914c == null) {
            k kVar = new k();
            f8914c = kVar;
            kVar.f8915a = p0.g();
            f8914c.f8915a.t(new a());
        }
    }

    static void i(Drawable drawable, x0 x0Var, int[] iArr) {
        p0.v(drawable, x0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i15) {
        return this.f8915a.i(context, i15);
    }

    synchronized Drawable d(Context context, int i15, boolean z15) {
        return this.f8915a.j(context, i15, z15);
    }

    synchronized ColorStateList f(Context context, int i15) {
        return this.f8915a.l(context, i15);
    }

    public synchronized void g(Context context) {
        this.f8915a.r(context);
    }
}
