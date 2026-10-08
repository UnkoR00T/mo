package s60;

import android.opengl.GLES20;
import android.opengl.Matrix;
import er.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import px.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u001f\u001a\u00020\u000b*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00032\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0004\b\u001f\u0010 \"\u0017\u0010$\u001a\u00020\u00168F¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"", "vertexSource", "fragmentSource", "", "e", "(Ljava/lang/String;Ljava/lang/String;)I", "shaderType", "source", "g", "(ILjava/lang/String;)I", "op", "Loq/i0;", "a", "(Ljava/lang/String;)V", "location", AnnotatedPrivateKey.LABEL, "b", "(ILjava/lang/String;)V", "width", "height", "d", "(II)I", "", "coords", "Ljava/nio/FloatBuffer;", "c", "([F)Ljava/nio/FloatBuffer;", "Ljavax/microedition/khronos/opengles/GL10;", "feature", "Lkotlin/Function1;", "block", "h", "(Ljavax/microedition/khronos/opengles/GL10;ILer/l;)V", "[F", "f", "()[F", "IDENTITY_MATRIX", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f178246a = new float[16];

    public static final void a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new RuntimeException(str + ": glError 0x" + Integer.toHexString(iGlGetError));
    }

    public static final void b(int i15, String str) {
        if (i15 >= 0) {
            return;
        }
        throw new RuntimeException("Unable to locate '" + str + "' in program");
    }

    public static final FloatBuffer c(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static final int d(int i15, int i16) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i15 * i16 * 4).order(ByteOrder.nativeOrder());
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i17 = iArr[0];
        a("glGenTextures");
        GLES20.glBindTexture(3553, i17);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        a("loadImageTexture");
        GLES20.glTexImage2D(3553, 0, 6408, i15, i16, 0, 6408, 5121, byteBufferOrder);
        a("loadImageTexture");
        return i17;
    }

    public static final int e(String str, String str2) {
        int iG;
        int iG2 = g(35633, str);
        if (iG2 == 0 || (iG = g(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            f.e(f.f163100a, "Could not create program", null, px.c.a("GlUtil"), 2, null);
        }
        GLES20.glAttachShader(iGlCreateProgram, iG2);
        a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iG);
        a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        f fVar = f.f163100a;
        f.e(fVar, "Could not link program: ", null, px.c.a("GlUtil"), 2, null);
        f.e(fVar, GLES20.glGetProgramInfoLog(iGlCreateProgram), null, px.c.a("GlUtil"), 2, null);
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    public static final float[] f() {
        float[] fArr = f178246a;
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static final int g(int i15, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i15);
        a("glCreateShader type=" + i15);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        f fVar = f.f163100a;
        f.e(fVar, "Could not compile shader " + i15 + ':', null, px.c.a("GlUtil"), 2, null);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(' ');
        sb5.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        f.e(fVar, sb5.toString(), null, px.c.a("GlUtil"), 2, null);
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static final void h(GL10 gl10, int i15, l<? super GL10, i0> lVar) {
        gl10.glEnable(i15);
        a("glEnable " + i15);
        lVar.b(gl10);
        gl10.glDisable(i15);
        a("glDisable " + i15);
    }
}
