package w7;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f210718a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f210719b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f210720c = {12445, 13120, 12344, 12344};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f210721d = {12445, 13632, 12344, 12344};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f210722e = {12344};

    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ak.n0<Integer> f210723a;

        public a(String str) {
            this(str, ak.n0.C());
        }

        public a(String str, List<Integer> list) {
            super(str);
            this.f210723a = ak.n0.v(list);
        }
    }

    public static void a(String str) throws a {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new a(str + ", error code: 0x" + Integer.toHexString(iEglGetError), ak.n0.E(Integer.valueOf(iEglGetError)));
    }

    public static void b() throws a {
        StringBuilder sb5 = new StringBuilder();
        ak.n0.a aVar = new ak.n0.a();
        boolean z15 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z15) {
                sb5.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb5.append("glError: ");
            sb5.append(strGluErrorString);
            aVar.a(Integer.valueOf(iGlGetError));
            z15 = true;
        }
        if (z15) {
            throw new a(sb5.toString(), aVar.k());
        }
    }

    public static void c(boolean z15, String str) throws a {
        if (!z15) {
            throw new a(str);
        }
    }

    public static EGLDisplay d() throws a {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        c(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        c(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        a("Error in getDefaultEglDisplay");
        return eGLDisplayEglGetDisplay;
    }

    public static boolean e() {
        return h("EGL_EXT_gl_colorspace_bt2020_hlg");
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 33 && h("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean g(int i15) {
        if (i15 == 6) {
            return f();
        }
        if (i15 == 7) {
            return e();
        }
        return true;
    }

    private static boolean h(String str) {
        String strEglQueryString = EGL14.eglQueryString(d(), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static boolean i(Context context) {
        return h("EGL_EXT_protected_content");
    }

    public static boolean j() {
        return h("EGL_KHR_surfaceless_context");
    }
}
