package x20;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<m.a, m> f216560a = new EnumMap(m.a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f216561b;

    public enum a {
        MVP_MATRIX("u_MVPMatrix"),
        VERTEX_POSITION("a_VertexPosition"),
        TEXTURE_COORDINATES("a_TextureCoordinates"),
        ACCELEROMETER_COORDINATES("u_AccelerometerCoordinates");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f216567a;

        a(String str) {
            this.f216567a = str;
        }
    }

    public n(Map<m.a, String> map) {
        for (m.a aVar : m.a.values()) {
            this.f216560a.put(aVar, new m(aVar, map.get(aVar)));
            this.f216560a.get(aVar).a();
        }
    }

    private void b() {
        for (m.a aVar : m.a.values()) {
            this.f216560a.get(aVar).c(this).b();
        }
        GLES20.glDeleteProgram(this.f216561b);
    }

    private int d(String str) {
        return GLES20.glGetAttribLocation(this.f216561b, str);
    }

    private void j() {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f216561b, 35714, iArr, 0);
        if (iArr[0] != 0) {
            return;
        }
        String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.f216561b);
        b();
        throw new IllegalStateException("Could not link a shader program: " + strGlGetProgramInfoLog);
    }

    public void a() {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f216561b = iGlCreateProgram;
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, this.f216560a.get(m.a.VERTEX_SHADER).d());
            GLES20.glAttachShader(this.f216561b, this.f216560a.get(m.a.FRAGMENT_SHADER).d());
            GLES20.glLinkProgram(this.f216561b);
            j();
        }
        GLES20.glUseProgram(this.f216561b);
    }

    public void c(FloatBuffer floatBuffer) {
        floatBuffer.position(0);
        GLES20.glDrawArrays(4, 0, 6);
    }

    int e() {
        return this.f216561b;
    }

    public int f(String str) {
        return GLES20.glGetUniformLocation(this.f216561b, str);
    }

    public void g(a aVar, float[] fArr) {
        GLES20.glUniformMatrix4fv(f(aVar.f216567a), 1, false, fArr, 0);
    }

    public void h(a aVar, o oVar) {
        GLES20.glUniform3fv(f(aVar.f216567a), 1, oVar.a(), 0);
    }

    public void i(a aVar, FloatBuffer floatBuffer, int i15) {
        int iD = d(aVar.f216567a);
        floatBuffer.position(0);
        GLES20.glVertexAttribPointer(iD, i15, 5126, false, i15 * 4, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(iD);
    }
}
