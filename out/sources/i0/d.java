package i0;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import g0.c0;
import i6.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.e1;
import o.i0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f87687a = {12344};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f87688b = {12445, 13632, 12344};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f87689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f87690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c0 f87691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c0 f87692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c0 f87693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float[] f87694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FloatBuffer f87695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f87696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final FloatBuffer f87697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i0.g f87698l;

    class a implements c0 {
        a() {
        }

        @Override // g0.c0
        public String a(String str, String str2) {
            return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
        }
    }

    class b implements c0 {
        b() {
        }

        @Override // g0.c0
        public String a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    class c implements c0 {
        c() {
        }

        @Override // g0.c0
        public String a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    /* JADX INFO: renamed from: i0.d$d, reason: collision with other inner class name */
    public static class C2058d extends f {
        public C2058d() {
            super("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
        }
    }

    public enum e {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int f87703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f87704b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f87705c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected int f87706d = -1;

        /* JADX WARN: Code duplicated, block: B:32:0x0078  */
        /* JADX WARN: Code duplicated, block: B:34:0x007d  */
        /* JADX WARN: Code duplicated, block: B:36:0x0082  */
        protected f(String str, String str2) throws Throwable {
            int iY;
            int iY2;
            int iGlCreateProgram;
            try {
                iY = d.y(35633, str);
                try {
                    iY2 = d.y(35632, str2);
                    try {
                        iGlCreateProgram = GLES20.glCreateProgram();
                        try {
                            d.g("glCreateProgram");
                            GLES20.glAttachShader(iGlCreateProgram, iY);
                            d.g("glAttachShader");
                            GLES20.glAttachShader(iGlCreateProgram, iY2);
                            d.g("glAttachShader");
                            GLES20.glLinkProgram(iGlCreateProgram);
                            int[] iArr = new int[1];
                            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                            if (iArr[0] == 1) {
                                this.f87703a = iGlCreateProgram;
                                c();
                            } else {
                                throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                            }
                        } catch (IllegalArgumentException e15) {
                            e = e15;
                            if (iY != -1) {
                                GLES20.glDeleteShader(iY);
                            }
                            if (iY2 != -1) {
                                GLES20.glDeleteShader(iY2);
                            }
                            if (iGlCreateProgram != -1) {
                                GLES20.glDeleteProgram(iGlCreateProgram);
                            }
                            throw e;
                        } catch (IllegalStateException e16) {
                            e = e16;
                            if (iY != -1) {
                                GLES20.glDeleteShader(iY);
                            }
                            if (iY2 != -1) {
                                GLES20.glDeleteShader(iY2);
                            }
                            if (iGlCreateProgram != -1) {
                                GLES20.glDeleteProgram(iGlCreateProgram);
                            }
                            throw e;
                        }
                    } catch (IllegalArgumentException | IllegalStateException e17) {
                        e = e17;
                        iGlCreateProgram = -1;
                    }
                } catch (IllegalArgumentException | IllegalStateException e18) {
                    e = e18;
                    iY2 = -1;
                    iGlCreateProgram = iY2;
                    if (iY != -1) {
                        GLES20.glDeleteShader(iY);
                    }
                    if (iY2 != -1) {
                        GLES20.glDeleteShader(iY2);
                    }
                    if (iGlCreateProgram != -1) {
                        GLES20.glDeleteProgram(iGlCreateProgram);
                    }
                    throw e;
                }
            } catch (IllegalArgumentException | IllegalStateException e19) {
                e = e19;
                iY = -1;
                iY2 = -1;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f87703a, "aPosition");
            this.f87706d = iGlGetAttribLocation;
            d.j(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f87703a, "uTransMatrix");
            this.f87704b = iGlGetUniformLocation;
            d.j(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f87703a, "uAlphaScale");
            this.f87705c = iGlGetUniformLocation2;
            d.j(iGlGetUniformLocation2, "uAlphaScale");
        }

        public void b() {
            GLES20.glDeleteProgram(this.f87703a);
        }

        public void d(float f15) {
            GLES20.glUniform1f(this.f87705c, f15);
            d.g("glUniform1f");
        }

        public void e(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f87704b, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        public void f() {
            GLES20.glUseProgram(this.f87703a);
            d.g("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.f87706d);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f87706d, 2, 5126, false, 0, (Buffer) d.f87695i);
            d.g("glVertexAttribPointer");
            e(d.l());
            d(1.0f);
        }
    }

    public static class g extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f87707e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f87708f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f87709g;

        public g(i0 i0Var, e eVar) {
            this(i0Var, g(i0Var, eVar));
        }

        private void c() {
            c();
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f87703a, "sTexture");
            this.f87707e = iGlGetUniformLocation;
            d.j(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f87703a, "aTextureCoord");
            this.f87709g = iGlGetAttribLocation;
            d.j(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f87703a, "uTexMatrix");
            this.f87708f = iGlGetUniformLocation2;
            d.j(iGlGetUniformLocation2, "uTexMatrix");
        }

        private static c0 g(i0 i0Var, e eVar) {
            if (!i0Var.d()) {
                return d.f87691e;
            }
            i.b(eVar != e.UNKNOWN, "No default sampler shader available for" + eVar);
            return eVar == e.YUV ? d.f87693g : d.f87692f;
        }

        @Override // i0.d.f
        public void f() {
            super.f();
            GLES20.glUniform1i(this.f87707e, 0);
            GLES20.glEnableVertexAttribArray(this.f87709g);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f87709g, 2, 5126, false, 0, (Buffer) d.f87697k);
            d.g("glVertexAttribPointer");
        }

        public void h(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f87708f, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        public g(i0 i0Var, c0 c0Var) {
            super(i0Var.d() ? d.f87690d : d.f87689c, d.v(c0Var));
            this.f87707e = -1;
            this.f87708f = -1;
            this.f87709g = -1;
            c();
        }
    }

    static {
        Locale locale = Locale.US;
        f87689c = String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f87690d = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f87691e = new a();
        f87692f = new b();
        f87693g = new c();
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f87694h = fArr;
        f87695i = m(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f87696j = fArr2;
        f87697k = m(fArr2);
        f87698l = i0.g.d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void e(String str) {
        try {
            f(str);
        } catch (IllegalStateException e15) {
            e1.d("GLUtils", e15.toString(), e15);
        }
    }

    public static void f(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public static void g(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(iGlGetError));
    }

    public static void h(Thread thread) {
        i.j(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static void i(AtomicBoolean atomicBoolean, boolean z15) {
        i.j(z15 == atomicBoolean.get(), z15 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    public static void j(int i15, String str) {
        if (i15 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    public static int[] k(String str, i0 i0Var) {
        int[] iArr = f87687a;
        if (i0Var.b() == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return f87688b;
            }
            e1.o("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static float[] l() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static FloatBuffer m(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static EGLSurface n(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i15, int i16) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i15, 12374, i16, 12344}, 0);
        f("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static Map<e, f> o(i0 i0Var, Map<e, c0> map) {
        Object gVar;
        e eVar;
        HashMap map2 = new HashMap();
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        for (int i15 = 0; i15 < length; i15++) {
            e eVar2 = eVarArrValues[i15];
            c0 c0Var = map.get(eVar2);
            if (c0Var != null) {
                gVar = new g(i0Var, c0Var);
            } else if (eVar2 == e.YUV || eVar2 == (eVar = e.DEFAULT)) {
                gVar = new g(i0Var, eVar2);
            } else {
                i.j(eVar2 == e.UNKNOWN, "Unhandled input format: " + eVar2);
                if (i0Var.d()) {
                    gVar = new C2058d();
                } else {
                    c0 c0Var2 = map.get(eVar);
                    gVar = c0Var2 != null ? new g(i0Var, c0Var2) : new g(i0Var, eVar);
                }
            }
            Objects.toString(eVar2);
            gVar.toString();
            map2.put(eVar2, gVar);
        }
        return map2;
    }

    public static int p() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        int i15 = iArr[0];
        GLES20.glBindTexture(36197, i15);
        g("glBindTexture " + i15);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        g("glTexParameter");
        return i15;
    }

    public static EGLSurface q(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        f("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static void r(int i15) {
        GLES20.glDeleteFramebuffers(1, new int[]{i15}, 0);
        g("glDeleteFramebuffers");
    }

    public static void s(int i15) {
        GLES20.glDeleteTextures(1, new int[]{i15}, 0);
        g("glDeleteTextures");
    }

    public static int t() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        g("glGenFramebuffers");
        return iArr[0];
    }

    public static int u() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        return iArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v(c0 c0Var) {
        try {
            String strA = c0Var.a("sTexture", "vTextureCoord");
            if (strA != null && strA.contains("vTextureCoord") && strA.contains("sTexture")) {
                return strA;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th4) {
            if (th4 instanceof IllegalArgumentException) {
                throw th4;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th4);
        }
    }

    public static String w() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        return ((String) i.g(matcher.group(1))) + "." + ((String) i.g(matcher.group(2)));
    }

    public static Size x(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        return new Size(z(eGLDisplay, eGLSurface, 12375), z(eGLDisplay, eGLSurface, 12374));
    }

    public static int y(int i15, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i15);
        g("glCreateShader type=" + i15);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        e1.o("GLUtils", "Could not compile shader: " + str);
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i15 + ":" + strGlGetShaderInfoLog);
    }

    public static int z(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i15) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i15, iArr, 0);
        return iArr[0];
    }
}
