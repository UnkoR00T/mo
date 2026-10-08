package x20;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes5.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f216553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f216554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f216555c;

    public enum a {
        VERTEX_SHADER(35633),
        FRAGMENT_SHADER(35632);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f216559a;

        a(int i15) {
            this.f216559a = i15;
        }
    }

    public m(a aVar, String str) {
        this.f216553a = aVar;
        this.f216554b = str;
    }

    private void e() {
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(this.f216555c, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(this.f216555c);
        b();
        throw new IllegalStateException("Could not compile a shader: " + strGlGetShaderInfoLog);
    }

    public void a() {
        int iGlCreateShader = GLES20.glCreateShader(this.f216553a.f216559a);
        this.f216555c = iGlCreateShader;
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, this.f216554b);
            GLES20.glCompileShader(this.f216555c);
            e();
        }
    }

    public void b() {
        GLES20.glDeleteShader(this.f216555c);
    }

    public m c(n nVar) {
        GLES20.glDetachShader(nVar.e(), this.f216555c);
        return this;
    }

    public int d() {
        return this.f216555c;
    }
}
