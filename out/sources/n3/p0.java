package n3;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ/\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J/\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u0019J/\u0010 \u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u0019J?\u0010#\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010$J?\u0010'\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010$J\u001f\u0010*\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00103\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00012\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\bH\u0016¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u00106J\u0017\u00109\u001a\u00020\b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010@J'\u0010F\u001a\u00020E2\u0006\u0010A\u001a\u00020\u00012\u0006\u0010B\u001a\u00020\u00012\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bF\u0010GR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010H\u001a\u0004\b\r\u0010IR\u0018\u0010L\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010QR$\u0010Y\u001a\u00020S2\u0006\u0010T\u001a\u00020S8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010]\u001a\u00020E8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\\\u00106\u001a\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010[¨\u0006_"}, d2 = {"Ln3/p0;", "Ln3/m2;", "Landroid/graphics/Path;", "internalPath", "<init>", "(Landroid/graphics/Path;)V", "Lm3/g;", "rect", "Loq/i0;", "z", "(Lm3/g;)V", "", "x", "y", "s", "(FF)V", "dx", "dy", "c", "v", "x1", "y1", "x2", "y2", "f", "(FFFF)V", "j", "dx1", "dy1", "dx2", "dy2", "h", "n", "x3", "y3", "t", "(FFFFFF)V", "dx3", "dy3", "d", "Ln3/m2$b;", "direction", "u", "(Lm3/g;Ln3/m2$b;)V", "Lm3/i;", "roundRect", "k", "(Lm3/i;Ln3/m2$b;)V", "path", "Lm3/e;", "offset", "w", "(Ln3/m2;J)V", "close", "()V", "reset", "l", "m", "(J)V", "Ln3/g2;", "matrix", "b", "([F)V", "getBounds", "()Lm3/g;", "path1", "path2", "Ln3/q2;", "operation", "", "e", "(Ln3/m2;Ln3/m2;I)Z", "Landroid/graphics/Path;", "()Landroid/graphics/Path;", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "", "[F", "radii", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mMatrix", "Ln3/o2;", "value", "q", "()I", "i", "(I)V", "fillType", "a", "()Z", "isConvex$annotations", "isConvex", "isEmpty", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 implements m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Path internalPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private RectF rectF;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float[] radii;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Matrix mMatrix;

    /* JADX WARN: Multi-variable type inference failed */
    public p0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void z(m3.g rect) {
        if (Float.isNaN(rect.getLeft()) || Float.isNaN(rect.getTop()) || Float.isNaN(rect.getRight()) || Float.isNaN(rect.getBottom())) {
            u0.d("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override // n3.m2
    public boolean a() {
        return this.internalPath.isConvex();
    }

    @Override // n3.m2
    public void b(float[] matrix) {
        if (this.mMatrix == null) {
            this.mMatrix = new Matrix();
        }
        m0.a(this.mMatrix, matrix);
        this.internalPath.transform(this.mMatrix);
    }

    @Override // n3.m2
    public void c(float dx4, float dy4) {
        this.internalPath.rMoveTo(dx4, dy4);
    }

    @Override // n3.m2
    public void close() {
        this.internalPath.close();
    }

    @Override // n3.m2
    public void d(float dx4, float dy4, float dx5, float dy5, float dx6, float dy6) {
        this.internalPath.rCubicTo(dx4, dy4, dx5, dy5, dx6, dy6);
    }

    @Override // n3.m2
    public boolean e(m2 path1, m2 path2, int operation) {
        Path.Op op4;
        q2.Companion companion = q2.INSTANCE;
        if (q2.f(operation, companion.a())) {
            op4 = Path.Op.DIFFERENCE;
        } else if (q2.f(operation, companion.b())) {
            op4 = Path.Op.INTERSECT;
        } else if (q2.f(operation, companion.c())) {
            op4 = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op4 = q2.f(operation, companion.d()) ? Path.Op.UNION : Path.Op.XOR;
        }
        Path path = this.internalPath;
        if (!(path1 instanceof p0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path internalPath = ((p0) path1).getInternalPath();
        if (path2 instanceof p0) {
            return path.op(internalPath, ((p0) path2).getInternalPath(), op4);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // n3.m2
    public void f(float x15, float y15, float x16, float y16) {
        this.internalPath.quadTo(x15, y15, x16, y16);
    }

    @Override // n3.m2
    public m3.g getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        this.internalPath.computeBounds(rectF, true);
        return new m3.g(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // n3.m2
    public void h(float dx4, float dy4, float dx5, float dy5) {
        this.internalPath.rQuadTo(dx4, dy4, dx5, dy5);
    }

    @Override // n3.m2
    public void i(int i15) {
        this.internalPath.setFillType(o2.d(i15, o2.INSTANCE.a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // n3.m2
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // n3.m2
    public void j(float x15, float y15, float x16, float y16) {
        this.internalPath.quadTo(x15, y15, x16, y16);
    }

    @Override // n3.m2
    public void k(m3.i roundRect, m2.b direction) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        this.rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        fArr[0] = Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() >> 32));
        fArr[1] = Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() & BodyPartID.bodyIdMax));
        fArr[2] = Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() >> 32));
        fArr[3] = Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() & BodyPartID.bodyIdMax));
        fArr[4] = Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() >> 32));
        fArr[5] = Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() & BodyPartID.bodyIdMax));
        fArr[6] = Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32));
        fArr[7] = Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() & BodyPartID.bodyIdMax));
        this.internalPath.addRoundRect(this.rectF, this.radii, u0.e(direction));
    }

    @Override // n3.m2
    public void l() {
        this.internalPath.rewind();
    }

    @Override // n3.m2
    public void m(long offset) {
        Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new Matrix();
        } else {
            matrix.reset();
        }
        this.mMatrix.setTranslate(Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & BodyPartID.bodyIdMax)));
        this.internalPath.transform(this.mMatrix);
    }

    @Override // n3.m2
    public void n(float dx4, float dy4, float dx5, float dy5) {
        this.internalPath.rQuadTo(dx4, dy4, dx5, dy5);
    }

    @Override // n3.m2
    public int q() {
        return this.internalPath.getFillType() == Path.FillType.EVEN_ODD ? o2.INSTANCE.a() : o2.INSTANCE.b();
    }

    @Override // n3.m2
    public void reset() {
        this.internalPath.reset();
    }

    @Override // n3.m2
    public void s(float x15, float y15) {
        this.internalPath.moveTo(x15, y15);
    }

    @Override // n3.m2
    public void t(float x15, float y15, float x16, float y16, float x17, float y17) {
        this.internalPath.cubicTo(x15, y15, x16, y16, x17, y17);
    }

    @Override // n3.m2
    public void u(m3.g rect, m2.b direction) {
        z(rect);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        this.rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        this.internalPath.addRect(this.rectF, u0.e(direction));
    }

    @Override // n3.m2
    public void v(float dx4, float dy4) {
        this.internalPath.rLineTo(dx4, dy4);
    }

    @Override // n3.m2
    public void w(m2 path, long offset) {
        Path path2 = this.internalPath;
        if (!(path instanceof p0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.addPath(((p0) path).getInternalPath(), Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & BodyPartID.bodyIdMax)));
    }

    @Override // n3.m2
    public void x(float x15, float y15) {
        this.internalPath.lineTo(x15, y15);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Path getInternalPath() {
        return this.internalPath;
    }

    public p0(Path path) {
        this.internalPath = path;
    }

    public /* synthetic */ p0(Path path, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? new Path() : path);
    }
}
