package i0;

import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static g d(EGLSurface eGLSurface, int i15, int i16) {
        return new c(eGLSurface, i15, i16);
    }

    public abstract EGLSurface a();

    public abstract int b();

    public abstract int c();
}
