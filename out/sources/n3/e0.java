package n3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\"\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010'J\u0011\u0010)\u001a\u00020(*\u00020 ¢\u0006\u0004\b)\u0010*J'\u0010.\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J7\u00100\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u00101JG\u00104\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u00105J'\u00108\u001a\u00020\u00042\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b8\u00109JO\u0010>\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r2\u0006\u0010=\u001a\u00020<2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b@\u0010AJ'\u0010E\u001a\u00020\u00042\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020+2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bE\u0010FJ?\u0010M\u001a\u00020\u00042\u0006\u0010C\u001a\u00020B2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020G2\u0006\u0010L\u001a\u00020I2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0004H\u0016¢\u0006\u0004\bO\u0010\u0003J\u000f\u0010P\u001a\u00020\u0004H\u0016¢\u0006\u0004\bP\u0010\u0003R(\u0010X\u001a\u00020Q8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bR\u0010S\u0012\u0004\bW\u0010\u0003\u001a\u0004\bR\u0010T\"\u0004\bU\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010Z¨\u0006]"}, d2 = {"Ln3/e0;", "Ln3/h1;", "<init>", "()V", "Loq/i0;", "q", "j", "Lm3/g;", "bounds", "Ln3/k2;", "paint", "v", "(Lm3/g;Ln3/k2;)V", "", "dx", "dy", "d", "(FF)V", "sx", "sy", "f", "degrees", "n", "(F)V", "Ln3/g2;", "matrix", "t", "([F)V", "left", "top", "right", "bottom", "Ln3/m1;", "clipOp", "c", "(FFFFI)V", "Ln3/m2;", "path", "e", "(Ln3/m2;I)V", "Landroid/graphics/Region$Op;", "z", "(I)Landroid/graphics/Region$Op;", "Lm3/e;", "p1", "p2", "o", "(JJLn3/k2;)V", "h", "(FFFFLn3/k2;)V", "radiusX", "radiusY", "r", "(FFFFFFLn3/k2;)V", "center", "radius", "i", "(JFLn3/k2;)V", "startAngle", "sweepAngle", "", "useCenter", "x", "(FFFFFFZLn3/k2;)V", "u", "(Ln3/m2;Ln3/k2;)V", "Ln3/b2;", "image", "topLeftOffset", "m", "(Ln3/b2;JLn3/k2;)V", "Lc5/n;", "srcOffset", "Lc5/r;", "srcSize", "dstOffset", "dstSize", "k", "(Ln3/b2;JJJJLn3/k2;)V", "l", "s", "Landroid/graphics/Canvas;", "a", "Landroid/graphics/Canvas;", "()Landroid/graphics/Canvas;", "b", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "internalCanvas", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "srcRect", "dstRect", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 implements h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Canvas internalCanvas = f0.f130984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Rect srcRect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Rect dstRect;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    public final void b(Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // n3.h1
    public void c(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, z(clipOp));
    }

    @Override // n3.h1
    public void d(float dx4, float dy4) {
        this.internalCanvas.translate(dx4, dy4);
    }

    @Override // n3.h1
    public void e(m2 path, int clipOp) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof p0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((p0) path).getInternalPath(), z(clipOp));
    }

    @Override // n3.h1
    public void f(float sx4, float sy4) {
        this.internalCanvas.scale(sx4, sy4);
    }

    @Override // n3.h1
    public void h(float left, float top, float right, float bottom, k2 paint) {
        this.internalCanvas.drawRect(left, top, right, bottom, o0.f(paint));
    }

    @Override // n3.h1
    public void i(long center, float radius, k2 paint) {
        this.internalCanvas.drawCircle(Float.intBitsToFloat((int) (center >> 32)), Float.intBitsToFloat((int) (center & BodyPartID.bodyIdMax)), radius, o0.f(paint));
    }

    @Override // n3.h1
    public void j() {
        this.internalCanvas.restore();
    }

    @Override // n3.h1
    public void k(b2 image, long srcOffset, long srcSize, long dstOffset, long dstSize, k2 paint) {
        if (this.srcRect == null) {
            this.srcRect = new Rect();
            this.dstRect = new Rect();
        }
        Canvas canvas = this.internalCanvas;
        Bitmap bitmapB = l0.b(image);
        Rect rect = this.srcRect;
        rect.left = c5.n.i(srcOffset);
        rect.top = c5.n.j(srcOffset);
        rect.right = c5.n.i(srcOffset) + ((int) (srcSize >> 32));
        rect.bottom = c5.n.j(srcOffset) + ((int) (srcSize & BodyPartID.bodyIdMax));
        oq.i0 i0Var = oq.i0.f148189a;
        Rect rect2 = this.dstRect;
        rect2.left = c5.n.i(dstOffset);
        rect2.top = c5.n.j(dstOffset);
        rect2.right = c5.n.i(dstOffset) + ((int) (dstSize >> 32));
        rect2.bottom = c5.n.j(dstOffset) + ((int) (dstSize & BodyPartID.bodyIdMax));
        canvas.drawBitmap(bitmapB, rect, rect2, o0.f(paint));
    }

    @Override // n3.h1
    public void l() {
        k1.f131014a.a(this.internalCanvas, true);
    }

    @Override // n3.h1
    public void m(b2 image, long topLeftOffset, k2 paint) {
        this.internalCanvas.drawBitmap(l0.b(image), Float.intBitsToFloat((int) (topLeftOffset >> 32)), Float.intBitsToFloat((int) (topLeftOffset & BodyPartID.bodyIdMax)), o0.f(paint));
    }

    @Override // n3.h1
    public void n(float degrees) {
        this.internalCanvas.rotate(degrees);
    }

    @Override // n3.h1
    public void o(long p15, long p16, k2 paint) {
        this.internalCanvas.drawLine(Float.intBitsToFloat((int) (p15 >> 32)), Float.intBitsToFloat((int) (p15 & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (p16 >> 32)), Float.intBitsToFloat((int) (p16 & BodyPartID.bodyIdMax)), o0.f(paint));
    }

    @Override // n3.h1
    public void q() {
        this.internalCanvas.save();
    }

    @Override // n3.h1
    public void r(float left, float top, float right, float bottom, float radiusX, float radiusY, k2 paint) {
        this.internalCanvas.drawRoundRect(left, top, right, bottom, radiusX, radiusY, o0.f(paint));
    }

    @Override // n3.h1
    public void s() {
        k1.f131014a.a(this.internalCanvas, false);
    }

    @Override // n3.h1
    public void t(float[] matrix) {
        if (h2.a(matrix)) {
            return;
        }
        Matrix matrix2 = new Matrix();
        m0.a(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }

    @Override // n3.h1
    public void u(m2 path, k2 paint) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof p0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((p0) path).getInternalPath(), o0.f(paint));
    }

    @Override // n3.h1
    public void v(m3.g bounds, k2 paint) {
        this.internalCanvas.saveLayer(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom(), o0.f(paint), 31);
    }

    @Override // n3.h1
    public void x(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, k2 paint) {
        this.internalCanvas.drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, o0.f(paint));
    }

    public final Region.Op z(int i15) {
        return m1.d(i15, m1.INSTANCE.a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }
}
