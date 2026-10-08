package n3;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000f\u001a\u00020\n*\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0014\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0003H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u0019\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\f\u001a\u0013\u0010\u001d\u001a\u00020\u0011*\u00020\u0003H\u0000¢\u0006\u0004\b\u001d\u0010\u0013\u001a\u001b\u0010\u001e\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001e\u0010\u0015\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u0003H\u0000¢\u0006\u0004\b \u0010!\u001a\u001b\u0010\"\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010\f\u001a\u0013\u0010$\u001a\u00020#*\u00020\u0003H\u0000¢\u0006\u0004\b$\u0010!\u001a\u001b\u0010%\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010\f\u001a\u0013\u0010&\u001a\u00020\u0011*\u00020\u0003H\u0000¢\u0006\u0004\b&\u0010\u0013\u001a\u001b\u0010'\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0011H\u0000¢\u0006\u0004\b'\u0010\u0015\u001a\u0013\u0010)\u001a\u00020(*\u00020\u0003H\u0000¢\u0006\u0004\b)\u0010!\u001a\u001b\u0010*\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000e\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010\f\u001a#\u0010-\u001a\u00020\n*\u00020\u00032\u000e\u0010\u000e\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0000¢\u0006\u0004\b-\u0010.\u001a\u001d\u00100\u001a\u00020\n*\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010/H\u0000¢\u0006\u0004\b0\u00101\"\u0015\u00104\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b2\u00103*8\b\u0007\u0010=\"\u00020\u00032\u00020\u0003B*\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u001c\b8\u0012\u0018\b\u000bB\u0014\b9\u0012\b\b:\u0012\u0004\b\b(;\u0012\u0006\b<\u0012\u0002\b\f¨\u0006>"}, d2 = {"Ln3/k2;", "a", "()Ln3/k2;", "Landroid/graphics/Paint;", "b", "(Landroid/graphics/Paint;)Ln3/k2;", "k", "()Landroid/graphics/Paint;", "Ln3/a1;", "mode", "Loq/i0;", "m", "(Landroid/graphics/Paint;I)V", "Ln3/n1;", "value", "o", "(Landroid/graphics/Paint;Ln3/n1;)V", "", "c", "(Landroid/graphics/Paint;)F", "l", "(Landroid/graphics/Paint;F)V", "Landroidx/compose/ui/graphics/Color;", "d", "(Landroid/graphics/Paint;)J", "n", "(Landroid/graphics/Paint;J)V", "Ln3/l2;", "w", "j", "v", "Ln3/a3;", "g", "(Landroid/graphics/Paint;)I", "s", "Ln3/b3;", "h", "t", "i", "u", "Ln3/v1;", "e", "p", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "r", "(Landroid/graphics/Paint;Landroid/graphics/Shader;)V", "Ln3/n2;", "q", "(Landroid/graphics/Paint;Ln3/n2;)V", "f", "(Ln3/k2;)Landroid/graphics/Paint;", "nativePaint", "Loq/a;", "message", "Use android.graphics.Paint directly instead", "replaceWith", "Loq/s;", "expression", "android.graphics.Paint", "imports", "NativePaint", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f131042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f131043c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f131041a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f131042b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f131043c = iArr3;
        }
    }

    public static final k2 a() {
        return new n0();
    }

    public static final k2 b(Paint paint) {
        return new n0(paint);
    }

    public static final float c(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final long d(Paint paint) {
        return o1.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        return !paint.isFilterBitmap() ? v1.INSTANCE.b() : v1.INSTANCE.a();
    }

    public static final Paint f(k2 k2Var) {
        if (!(k2Var instanceof n0)) {
            e2.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + fr.q0.c(k2Var.getClass()).C());
        }
        return ((n0) k2Var).getInternalPaint();
    }

    public static final int g(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i15 = strokeCap == null ? -1 : a.f131042b[strokeCap.ordinal()];
        if (i15 == 1) {
            return a3.INSTANCE.a();
        }
        if (i15 != 2) {
            return i15 != 3 ? a3.INSTANCE.a() : a3.INSTANCE.c();
        }
        return a3.INSTANCE.b();
    }

    public static final int h(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i15 = strokeJoin == null ? -1 : a.f131043c[strokeJoin.ordinal()];
        if (i15 == 1) {
            return b3.INSTANCE.b();
        }
        if (i15 != 2) {
            return i15 != 3 ? b3.INSTANCE.b() : b3.INSTANCE.c();
        }
        return b3.INSTANCE.a();
    }

    public static final float i(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float j(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final Paint k() {
        return new Paint(7);
    }

    public static final void l(Paint paint, float f15) {
        paint.setAlpha((int) Math.rint(f15 * 255.0f));
    }

    public static final void m(Paint paint, int i15) {
        if (Build.VERSION.SDK_INT >= 29) {
            g3.f130996a.a(paint, i15);
        } else {
            paint.setXfermode(new PorterDuffXfermode(d0.b(i15)));
        }
    }

    public static final void n(Paint paint, long j15) {
        paint.setColor(o1.j(j15));
    }

    public static final void o(Paint paint, n1 n1Var) {
        paint.setColorFilter(n1Var != null ? g0.b(n1Var) : null);
    }

    public static final void p(Paint paint, int i15) {
        paint.setFilterBitmap(!v1.d(i15, v1.INSTANCE.b()));
    }

    public static final void q(Paint paint, n2 n2Var) {
        q0 q0Var = (q0) n2Var;
        paint.setPathEffect(q0Var != null ? q0Var.getNativePathEffect() : null);
    }

    public static final void r(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void s(Paint paint, int i15) {
        Paint.Cap cap;
        a3.Companion companion = a3.INSTANCE;
        if (a3.e(i15, companion.c())) {
            cap = Paint.Cap.SQUARE;
        } else if (a3.e(i15, companion.b())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = a3.e(i15, companion.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final void t(Paint paint, int i15) {
        Paint.Join join;
        b3.Companion companion = b3.INSTANCE;
        if (b3.e(i15, companion.b())) {
            join = Paint.Join.MITER;
        } else if (b3.e(i15, companion.a())) {
            join = Paint.Join.BEVEL;
        } else {
            join = b3.e(i15, companion.c()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void u(Paint paint, float f15) {
        paint.setStrokeMiter(f15);
    }

    public static final void v(Paint paint, float f15) {
        paint.setStrokeWidth(f15);
    }

    public static final void w(Paint paint, int i15) {
        paint.setStyle(l2.d(i15, l2.INSTANCE.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
