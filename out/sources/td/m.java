package td;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import hd.u;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Matrix f189640a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<PathMeasure> f189641b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<Path> f189642c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<Path> f189643d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<float[]> f189644e = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f189645f = (float) (Math.sqrt(2.0d) / 2.0d);

    class a extends ThreadLocal<PathMeasure> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    class b extends ThreadLocal<Path> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    class c extends ThreadLocal<Path> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    class d extends ThreadLocal<float[]> {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f15, float f16, float f17) {
        if (fd.e.h()) {
            fd.e.b("applyTrimPathIfNeeded");
        }
        PathMeasure pathMeasure = f189641b.get();
        Path path2 = f189642c.get();
        Path path3 = f189643d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f15 == 1.0f && f16 == 0.0f) {
            if (fd.e.h()) {
                fd.e.c("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (length < 1.0f || Math.abs((f16 - f15) - 1.0f) < 0.01d) {
            if (fd.e.h()) {
                fd.e.c("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        float f18 = f15 * length;
        float f19 = f16 * length;
        float f25 = f17 * length;
        float fMin = Math.min(f18, f19) + f25;
        float fMax = Math.max(f18, f19) + f25;
        if (fMin >= length && fMax >= length) {
            fMin = j.f(fMin, length);
            fMax = j.f(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = j.f(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = j.f(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            if (fd.e.h()) {
                fd.e.c("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        if (fd.e.h()) {
            fd.e.c("applyTrimPathIfNeeded");
        }
    }

    public static void b(Path path, u uVar) {
        if (uVar == null || uVar.l()) {
            return;
        }
        a(path, ((id.d) uVar.j()).r() / 100.0f, ((id.d) uVar.g()).r() / 100.0f, ((id.d) uVar.h()).r() / 360.0f);
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e15) {
                throw e15;
            } catch (Exception unused) {
            }
        }
    }

    public static Path d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
            return path;
        }
        float f15 = pointF.x + pointF3.x;
        float f16 = pointF.y + pointF3.y;
        float f17 = pointF2.x;
        float f18 = f17 + pointF4.x;
        float f19 = pointF2.y;
        path.cubicTo(f15, f16, f18, f19 + pointF4.y, f17, f19);
        return path;
    }

    public static float e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float g(Matrix matrix) {
        float[] fArr = f189644e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f15 = f189645f;
        fArr[2] = f15;
        fArr[3] = f15;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean h(Matrix matrix) {
        float[] fArr = f189644e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static int i(float f15, float f16, float f17, float f18) {
        int i15 = f15 != 0.0f ? (int) (527 * f15) : 17;
        if (f16 != 0.0f) {
            i15 = (int) (i15 * 31 * f16);
        }
        if (f17 != 0.0f) {
            i15 = (int) (i15 * 31 * f17);
        }
        return f18 != 0.0f ? (int) (i15 * 31 * f18) : i15;
    }

    public static boolean j(int i15, int i16, int i17, int i18, int i19, int i25) {
        if (i15 < i18) {
            return false;
        }
        if (i15 > i18) {
            return true;
        }
        if (i16 < i19) {
            return false;
        }
        return i16 > i19 || i17 >= i25;
    }

    public static int k(int i15, int i16) {
        return (int) ((((i15 / 255.0f) * i16) / 255.0f) * 255.0f);
    }

    public static Bitmap l(Bitmap bitmap, int i15, int i16) {
        if (bitmap.getWidth() == i15 && bitmap.getHeight() == i16) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i15, i16, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void m(Canvas canvas, RectF rectF, Paint paint) {
        n(canvas, rectF, paint, 31);
    }

    public static void n(Canvas canvas, RectF rectF, Paint paint, int i15) {
        if (fd.e.h()) {
            fd.e.b("Utils#saveLayer");
        }
        canvas.saveLayer(rectF, paint);
        if (fd.e.h()) {
            fd.e.c("Utils#saveLayer");
        }
    }
}
