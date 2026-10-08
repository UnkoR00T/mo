package i0;

import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes.dex */
final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EGLSurface f87684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f87685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f87686c;

    c(EGLSurface eGLSurface, int i15, int i16) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f87684a = eGLSurface;
        this.f87685b = i15;
        this.f87686c = i16;
    }

    @Override // i0.g
    public EGLSurface a() {
        return this.f87684a;
    }

    @Override // i0.g
    public int b() {
        return this.f87686c;
    }

    @Override // i0.g
    public int c() {
        return this.f87685b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f87684a.equals(gVar.a()) && this.f87685b == gVar.c() && this.f87686c == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f87684a.hashCode() ^ 1000003) * 1000003) ^ this.f87685b) * 1000003) ^ this.f87686c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f87684a + ", width=" + this.f87685b + ", height=" + this.f87686c + "}";
    }
}
