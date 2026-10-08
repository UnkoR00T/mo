package o60;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p071kotlin.Metadata;
import r60.Shader;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u001f\b\u0007\u0018\u0000 92\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Js\u0010\u001f\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010!R\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010!R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010!R\u0014\u0010.\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010!R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u0010!R\u0014\u00103\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00108\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lo60/d;", "Ln60/c;", "Lr60/a;", "shader", "<init>", "(Lr60/a;)V", "", "width", "height", "Loq/i0;", "c", "(II)V", "", "values", "", "colorAdj", "b", "([FF)V", "mvpMatrix", "Ljava/nio/FloatBuffer;", "vertexBuffer", "firstVertex", "vertexCount", "coordsPerVertex", "vertexStride", "texMatrix", "texBuffer", "", "texIdArray", "texStride", "time", "a", "([FLjava/nio/FloatBuffer;IIII[FLjava/nio/FloatBuffer;[ILjava/lang/Integer;Ljava/lang/Float;)V", "I", "mProgramHandle", "muMVPMatrixLoc", "muTexMatrixLoc", "d", "muKernelLoc", "e", "muTexOffsetLoc", "f", "muColorAdjustLoc", "g", "maPositionLoc", "h", "maTextureCoordLoc", "i", "uTime", "j", "[F", "mKernel", "k", "mTexOffset", "l", "F", "mColorAdjust", "m", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements n60.c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f142534n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int mProgramHandle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int muMVPMatrixLoc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int muTexMatrixLoc;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int muKernelLoc;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int muTexOffsetLoc;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int muColorAdjustLoc;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int maPositionLoc;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maTextureCoordLoc;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int uTime = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float[] mKernel = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float[] mTexOffset;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float mColorAdjust;

    public d(Shader shader) {
        int iE = s60.b.e(shader.getVertexShader(), shader.getFragmentShader());
        this.mProgramHandle = iE;
        if (iE == 0) {
            throw new RuntimeException("Unable to create program");
        }
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(iE, "a_VertexPosition");
        this.maPositionLoc = iGlGetAttribLocation;
        s60.b.b(iGlGetAttribLocation, "a_VertexPosition");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.mProgramHandle, "a_TextureCoordinates");
        this.maTextureCoordLoc = iGlGetAttribLocation2;
        s60.b.b(iGlGetAttribLocation2, "a_TextureCoordinates");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.mProgramHandle, "uMVPMatrix");
        this.muMVPMatrixLoc = iGlGetUniformLocation;
        s60.b.b(iGlGetUniformLocation, "uMVPMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.mProgramHandle, "uTexMatrix");
        this.muTexMatrixLoc = iGlGetUniformLocation2;
        s60.b.b(iGlGetUniformLocation2, "uTexMatrix");
        int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.mProgramHandle, "uKernel");
        this.muKernelLoc = iGlGetUniformLocation3;
        if (iGlGetUniformLocation3 < 0) {
            this.muKernelLoc = -1;
            this.muTexOffsetLoc = -1;
            this.muColorAdjustLoc = -1;
            return;
        }
        int iGlGetUniformLocation4 = GLES20.glGetUniformLocation(this.mProgramHandle, "uTexOffset");
        this.muTexOffsetLoc = iGlGetUniformLocation4;
        s60.b.b(iGlGetUniformLocation4, "uTexOffset");
        int iGlGetUniformLocation5 = GLES20.glGetUniformLocation(this.mProgramHandle, "uColorAdjust");
        this.muColorAdjustLoc = iGlGetUniformLocation5;
        s60.b.b(iGlGetUniformLocation5, "uColorAdjust");
        b(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 0.0f);
        c(256, 256);
    }

    private final void c(int width, int height) {
        float f15 = 1.0f / width;
        float f16 = 1.0f / height;
        float f17 = -f15;
        float f18 = -f16;
        this.mTexOffset = new float[]{f17, f18, 0.0f, f18, f15, f18, f17, 0.0f, 0.0f, 0.0f, f15, 0.0f, f17, f16, 0.0f, f16, f15, f16};
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
        GLES20.glUniformMatrix4fv(this.muTexMatrixLoc, 1, false, texMatrix, 0);
        s60.b.a("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.maPositionLoc);
        s60.b.a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.maPositionLoc, coordsPerVertex, 5126, false, vertexStride, (Buffer) vertexBuffer);
        s60.b.a("glVertexAttribPointer");
        if (time != null) {
            GLES20.glUniform1f(this.uTime, time.floatValue());
            s60.b.a("glUniform1f");
        }
        GLES20.glEnableVertexAttribArray(this.maTextureCoordLoc);
        s60.b.a("glEnableVertexAttribArray");
        if (texStride != null) {
            GLES20.glVertexAttribPointer(this.maTextureCoordLoc, 2, 5126, false, texStride.intValue(), (Buffer) texBuffer);
            s60.b.a("glVertexAttribPointer");
        }
        int i16 = this.muKernelLoc;
        if (i16 >= 0) {
            GLES20.glUniform1fv(i16, 9, this.mKernel, 0);
            int i17 = this.muTexOffsetLoc;
            float[] fArr = this.mTexOffset;
            if (fArr == null) {
                fArr = null;
            }
            GLES20.glUniform2fv(i17, 9, fArr, 0);
            GLES20.glUniform1f(this.muColorAdjustLoc, this.mColorAdjust);
        }
        GLES20.glDrawArrays(5, firstVertex, vertexCount);
        s60.b.a("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.maPositionLoc);
        GLES20.glDisableVertexAttribArray(this.maTextureCoordLoc);
        GLES20.glBindTexture(3553, 0);
        GLES20.glUseProgram(0);
    }

    public final void b(float[] values, float colorAdj) {
        if (values.length == 9) {
            System.arraycopy(values, 0, this.mKernel, 0, 9);
            this.mColorAdjust = colorAdj;
        } else {
            throw new IllegalArgumentException(("Kernel size is " + values.length + " vs. 9").toString());
        }
    }
}
