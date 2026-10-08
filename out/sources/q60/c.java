package q60;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import p071kotlin.Metadata;
import r60.Shader;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJs\u0010\u001b\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010 ¨\u0006("}, d2 = {"Lq60/c;", "Ln60/c;", "Lr60/a;", "shader", "<init>", "(Lr60/a;)V", "", "width", "height", "b", "(II)I", "", "mvpMatrix", "Ljava/nio/FloatBuffer;", "vertexBuffer", "firstVertex", "vertexCount", "coordsPerVertex", "vertexStride", "texMatrix", "texBuffer", "", "texIdArray", "texStride", "", "time", "Loq/i0;", "a", "([FLjava/nio/FloatBuffer;IIII[FLjava/nio/FloatBuffer;[ILjava/lang/Integer;Ljava/lang/Float;)V", "Lr60/a;", "getShader", "()Lr60/a;", "I", "mProgramHandle", "c", "aPositionLoc", "d", "uTime", "e", "muMVPMatrixLoc", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements n60.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Shader shader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int mProgramHandle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int aPositionLoc;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int uTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int muMVPMatrixLoc;

    public c(Shader shader) {
        this.shader = shader;
        int iE = s60.b.e(shader.getVertexShader(), shader.getFragmentShader());
        this.mProgramHandle = iE;
        if (iE == 0) {
            throw new RuntimeException("Unable to create program");
        }
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(iE, "a_Position");
        this.aPositionLoc = iGlGetAttribLocation;
        s60.b.b(iGlGetAttribLocation, "a_Position");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.mProgramHandle, "u_Time");
        this.uTime = iGlGetUniformLocation;
        s60.b.b(iGlGetUniformLocation, "u_Time");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.mProgramHandle, "u_MVPMatrix");
        this.muMVPMatrixLoc = iGlGetUniformLocation2;
        s60.b.b(iGlGetUniformLocation2, "u_MVPMatrix");
    }

    @Override // n60.c
    public void a(float[] mvpMatrix, FloatBuffer vertexBuffer, int firstVertex, int vertexCount, int coordsPerVertex, int vertexStride, float[] texMatrix, FloatBuffer texBuffer, int[] texIdArray, Integer texStride, Float time) {
        s60.b.a("draw start");
        GLES20.glUseProgram(this.mProgramHandle);
        s60.b.a("glUseProgram");
        int length = texIdArray.length;
        for (int i15 = 0; i15 < length; i15++) {
            GLES20.glActiveTexture(33984 + i15);
            GLES20.glBindTexture(3553, texIdArray[i15]);
        }
        GLES20.glUniformMatrix4fv(this.muMVPMatrixLoc, 1, false, mvpMatrix, 0);
        s60.b.a("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.aPositionLoc);
        s60.b.a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.aPositionLoc, coordsPerVertex, 5126, false, vertexStride, (Buffer) vertexBuffer);
        s60.b.a("glVertexAttribPointer");
        if (time != null) {
            GLES20.glUniform1f(this.uTime, time.floatValue());
            s60.b.a("glUniform1f");
        }
        GLES20.glDrawArrays(5, firstVertex, vertexCount);
        s60.b.a("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.aPositionLoc);
        GLES20.glDisableVertexAttribArray(this.uTime);
        GLES20.glBindTexture(3553, 0);
        GLES20.glUseProgram(0);
    }

    public final int b(int width, int height) {
        IntBuffer intBufferAllocate = IntBuffer.allocate(1);
        GLES20.glGenFramebuffers(1, intBufferAllocate);
        GLES20.glBindFramebuffer(36160, intBufferAllocate.get(0));
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        s60.b.a("glGenTextures");
        int i15 = iArr[0];
        GLES20.glBindTexture(3553, i15);
        s60.b.a("glBindTexture " + i15);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i15, 0);
        GLES20.glBindFramebuffer(36160, 0);
        s60.b.a("glTexParameter");
        return i15;
    }
}
