package n60;

import android.opengl.Matrix;
import android.util.Size;
import java.nio.FloatBuffer;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000 12\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R*\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00020 8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\u0011\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010-¨\u00062"}, d2 = {"Ln60/a;", "", "", "texId", "<init>", "([I)V", "Ln60/c;", "program", "", "projectionMatrix", "", "distance", "Loq/i0;", "a", "(Ln60/c;[FLjava/lang/Float;)V", "[I", "Ljava/nio/FloatBuffer;", "b", "Ljava/nio/FloatBuffer;", "vertexArray", "c", "texCoordArray", "", "d", "I", "coordsPerVertex", "e", "vertexStride", "f", "texCoordStride", "g", "vertexCount", "Landroid/util/Size;", "value", "h", "Landroid/util/Size;", "getScaleSize", "()Landroid/util/Size;", "(Landroid/util/Size;)V", "scaleSize", "", "i", "Z", "mMatrixNoReady", "j", "[F", "mvpMatrix", "k", "mvMatrix", "l", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f132377m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f132378n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float[] f132379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final FloatBuffer f132380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final FloatBuffer f132381q;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int[] texId;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean mMatrixNoReady;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float[] mvMatrix;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private FloatBuffer vertexArray = f132380p;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private FloatBuffer texCoordArray = f132381q;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int coordsPerVertex = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int vertexStride = 2 * 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int texCoordStride = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int vertexCount = f132378n.length / 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Size scaleSize = new Size(0, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float[] mvpMatrix = new float[16];

    static {
        float[] fArr = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        f132378n = fArr;
        float[] fArr2 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        f132379o = fArr2;
        f132380p = s60.b.c(fArr);
        f132381q = s60.b.c(fArr2);
    }

    public a(int[] iArr) {
        this.texId = iArr;
        float[] fArr = new float[16];
        for (int i15 = 0; i15 < 16; i15++) {
            fArr[i15] = 0.0f;
        }
        this.mvMatrix = fArr;
    }

    public final void a(c program, float[] projectionMatrix, Float distance) {
        if (this.mMatrixNoReady) {
            return;
        }
        Matrix.multiplyMM(this.mvpMatrix, 0, projectionMatrix, 0, this.mvMatrix, 0);
        program.a(this.mvpMatrix, this.vertexArray, 0, this.vertexCount, this.coordsPerVertex, this.vertexStride, s60.b.f(), this.texCoordArray, this.texId, Integer.valueOf(this.texCoordStride), distance);
    }

    public final void b(Size size) {
        this.mMatrixNoReady = true;
        this.scaleSize = size;
        Matrix.setIdentityM(this.mvMatrix, 0);
        float f15 = 2;
        Matrix.translateM(this.mvMatrix, 0, size.getWidth() / f15, size.getHeight() / f15, 0.0f);
        Matrix.scaleM(this.mvMatrix, 0, size.getWidth(), size.getHeight(), 1.0f);
        this.mMatrixNoReady = false;
    }
}
