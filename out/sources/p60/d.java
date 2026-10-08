package p60;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import p071kotlin.Metadata;
import r60.Shader;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJs\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0016\u0010$\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010(\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u0014\u0010*\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010#R\u0014\u0010,\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010#R\u0014\u0010.\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010#¨\u0006/"}, d2 = {"Lp60/d;", "Ln60/c;", "Lr60/a;", "shader", "Ls60/a;", "accelerometer", "<init>", "(Lr60/a;Ls60/a;)V", "", "Landroid/graphics/Bitmap;", "listBitmap", "", "b", "(Ljava/util/List;)[I", "", "mvpMatrix", "Ljava/nio/FloatBuffer;", "vertexBuffer", "", "firstVertex", "vertexCount", "coordsPerVertex", "vertexStride", "texMatrix", "texBuffer", "texIdArray", "texStride", "", "time", "Loq/i0;", "a", "([FLjava/nio/FloatBuffer;IIII[FLjava/nio/FloatBuffer;[ILjava/lang/Integer;Ljava/lang/Float;)V", "Lr60/a;", "Ls60/a;", "c", "I", "mProgramHandle", "d", "muMVPMatrixLoc", "e", "muTexMatrixLoc", "f", "maPositionLoc", "g", "maTextureCoordLoc", "h", "uAccelerometerCoordinates", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements n60.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Shader shader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s60.a accelerometer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int mProgramHandle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int muMVPMatrixLoc;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int muTexMatrixLoc;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int maPositionLoc;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int maTextureCoordLoc;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int uAccelerometerCoordinates;

    public d(Shader shader, s60.a aVar) {
        this.shader = shader;
        this.accelerometer = aVar;
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
        int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.mProgramHandle, "u_AccelerometerCoordinates");
        this.uAccelerometerCoordinates = iGlGetUniformLocation3;
        s60.b.b(iGlGetUniformLocation3, "u_AccelerometerCoordinates");
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
        GLES20.glUniform3fv(this.uAccelerometerCoordinates, 1, this.accelerometer.a().e(), 0);
        s60.b.a("glUniform3fv");
        GLES20.glUniformMatrix4fv(this.muMVPMatrixLoc, 1, false, mvpMatrix, 0);
        s60.b.a("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.muTexMatrixLoc, 1, false, texMatrix, 0);
        s60.b.a("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.maPositionLoc);
        s60.b.a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.maPositionLoc, coordsPerVertex, 5126, false, vertexStride, (Buffer) vertexBuffer);
        s60.b.a("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.maTextureCoordLoc);
        s60.b.a("glEnableVertexAttribArray");
        if (texStride != null) {
            GLES20.glVertexAttribPointer(this.maTextureCoordLoc, 2, 5126, false, texStride.intValue(), (Buffer) texBuffer);
            s60.b.a("glVertexAttribPointer");
        }
        GLES20.glDrawArrays(5, firstVertex, vertexCount);
        s60.b.a("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.maPositionLoc);
        GLES20.glDisableVertexAttribArray(this.maTextureCoordLoc);
        GLES20.glBindTexture(3553, 0);
        GLES20.glUseProgram(0);
    }

    public final int[] b(List<Bitmap> listBitmap) {
        int size = listBitmap.size();
        int[] iArr = new int[size];
        GLES20.glGenTextures(size, iArr, 0);
        s60.b.a("glGenTextures");
        int size2 = listBitmap.size();
        for (int i15 = 0; i15 < size2; i15++) {
            GLES20.glActiveTexture(33984 + i15);
            GLES20.glBindTexture(3553, iArr[i15]);
            s60.b.a("glBindTexture " + iArr[i15]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glTexImage2D(3553, 0, 32856, listBitmap.get(i15).getWidth(), listBitmap.get(i15).getHeight(), 0, 6408, 5121, ByteBuffer.allocateDirect(listBitmap.get(i15).getWidth() * listBitmap.get(i15).getHeight() * 4).order(ByteOrder.nativeOrder()));
            s60.b.a("glTexParameter");
        }
        return iArr;
    }
}
