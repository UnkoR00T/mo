package x20;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f216549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f216550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FloatBuffer f216551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FloatBuffer f216552d;

    static {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
        f216549a = fArr;
        float[] fArr2 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
        f216550b = fArr2;
        f216551c = a(fArr);
        f216552d = a(fArr2);
    }

    private static FloatBuffer a(float[] fArr) {
        return ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
    }

    public static void b(n nVar) {
        nVar.c(f216551c);
    }

    public static void c(n nVar) {
        nVar.i(n.a.VERTEX_POSITION, f216551c, 3);
        nVar.i(n.a.TEXTURE_COORDINATES, f216552d, 2);
    }
}
