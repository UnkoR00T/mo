package androidx.camera.core;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.Locale;
import o.e1;
import v.g2;

/* JADX INFO: loaded from: classes.dex */
public final class ImageProcessingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9209a;

    private static class a extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final o.a[] f9210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f9211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f9212f;

        /* JADX INFO: renamed from: androidx.camera.core.ImageProcessingUtil$a$a, reason: collision with other inner class name */
        class C0191a implements o.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f9213a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f9214b;

            C0191a(int i15, ByteBuffer byteBuffer) {
                this.f9213a = i15;
                this.f9214b = byteBuffer;
            }

            @Override // androidx.camera.core.o.a
            public ByteBuffer v() {
                return this.f9214b;
            }

            @Override // androidx.camera.core.o.a
            public int w() {
                return this.f9213a;
            }

            @Override // androidx.camera.core.o.a
            public int x() {
                return 1;
            }
        }

        a(o oVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i15, int i16, int i17) {
            super(oVar);
            this.f9210d = m(byteBuffer, byteBuffer2, byteBuffer3, i15);
            this.f9211e = i15;
            this.f9212f = i16;
        }

        private o.a[] m(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i15) {
            return new o.a[]{new C0191a(i15, byteBuffer), new b(byteBuffer2, i15), new b(byteBuffer3, i15)};
        }

        @Override // androidx.camera.core.e, androidx.camera.core.o
        public int getHeight() {
            return this.f9212f;
        }

        @Override // androidx.camera.core.e, androidx.camera.core.o
        public int l() {
            return this.f9211e;
        }

        @Override // androidx.camera.core.e, androidx.camera.core.o
        public o.a[] o2() {
            return this.f9210d;
        }
    }

    private static class b implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f9216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9217b;

        b(ByteBuffer byteBuffer, int i15) {
            this.f9216a = byteBuffer;
            this.f9217b = i15;
        }

        @Override // androidx.camera.core.o.a
        public ByteBuffer v() {
            return this.f9216a;
        }

        @Override // androidx.camera.core.o.a
        public int w() {
            return this.f9217b;
        }

        @Override // androidx.camera.core.o.a
        public int x() {
            return 2;
        }
    }

    enum c {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static /* synthetic */ void a(o oVar, o oVar2, o oVar3) {
        if (oVar == null || oVar2 == null) {
            return;
        }
        oVar2.close();
    }

    public static /* synthetic */ void b(o oVar, o oVar2, o oVar3) {
        if (oVar == null || oVar2 == null) {
            return;
        }
        oVar2.close();
    }

    public static boolean c(o oVar) {
        if (!m(oVar)) {
            e1.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        if (d(oVar) != c.ERROR_CONVERSION) {
            return true;
        }
        e1.c("ImageProcessingUtil", "One pixel shift for YUV failure");
        return false;
    }

    private static c d(o oVar) {
        int iL = oVar.l();
        int height = oVar.getHeight();
        int iW = oVar.o2()[0].w();
        int iW2 = oVar.o2()[1].w();
        int iW3 = oVar.o2()[2].w();
        int iX = oVar.o2()[0].x();
        int iX2 = oVar.o2()[1].x();
        return nativeShiftPixel(oVar.o2()[0].v(), iW, oVar.o2()[1].v(), iW2, oVar.o2()[2].v(), iW3, iX, iX2, iL, height, iX, iX2, iX2) != 0 ? c.ERROR_CONVERSION : c.SUCCESS;
    }

    public static o e(g2 g2Var, byte[] bArr) {
        i6.i.a(g2Var.d() == 256);
        i6.i.g(bArr);
        Surface surface = g2Var.getSurface();
        i6.i.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            e1.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        o oVarC = g2Var.c();
        if (oVarC == null) {
            e1.c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return oVarC;
    }

    public static Bitmap f(o oVar) {
        if (oVar.getFormat() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int iL = oVar.l();
        int height = oVar.getHeight();
        int iW = oVar.o2()[0].w();
        int iW2 = oVar.o2()[1].w();
        int iW3 = oVar.o2()[2].w();
        int iX = oVar.o2()[0].x();
        int iX2 = oVar.o2()[1].x();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(oVar.l(), oVar.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(oVar.o2()[0].v(), iW, oVar.o2()[1].v(), iW2, oVar.o2()[2].v(), iW3, iX, iX2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), iL, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    public static o g(final o oVar, g2 g2Var, ByteBuffer byteBuffer, int i15, boolean z15) {
        if (!m(oVar)) {
            e1.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!l(i15)) {
            e1.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (h(oVar, g2Var.getSurface(), byteBuffer, i15, z15) == c.ERROR_CONVERSION) {
            e1.c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            e1.a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(f9209a)));
            f9209a++;
        }
        final o oVarC = g2Var.c();
        if (oVarC == null) {
            e1.c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        t tVar = new t(oVarC);
        tVar.b(new e.a() { // from class: o.x0
            @Override // androidx.camera.core.e.a
            public final void b(androidx.camera.core.o oVar2) {
                ImageProcessingUtil.b(oVarC, oVar, oVar2);
            }
        });
        return tVar;
    }

    private static c h(o oVar, Surface surface, ByteBuffer byteBuffer, int i15, boolean z15) {
        int iL = oVar.l();
        int height = oVar.getHeight();
        int iW = oVar.o2()[0].w();
        int iW2 = oVar.o2()[1].w();
        int iW3 = oVar.o2()[2].w();
        int iX = oVar.o2()[0].x();
        int iX2 = oVar.o2()[1].x();
        return nativeConvertAndroid420ToABGR(oVar.o2()[0].v(), iW, oVar.o2()[1].v(), iW2, oVar.o2()[2].v(), iW3, iX, iX2, surface, byteBuffer, iL, height, z15 ? iX : 0, z15 ? iX2 : 0, z15 ? iX2 : 0, i15) != 0 ? c.ERROR_CONVERSION : c.SUCCESS;
    }

    public static void i(Bitmap bitmap, ByteBuffer byteBuffer, int i15) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i15, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void j(Bitmap bitmap, ByteBuffer byteBuffer, int i15) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i15, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static boolean k(o oVar) {
        return oVar.o2().length == 3 && oVar.o2()[1].x() == 2 && nativeGetYUVImageVUOff(oVar.o2()[2].v(), oVar.o2()[1].v()) == -1;
    }

    private static boolean l(int i15) {
        return i15 == 0 || i15 == 90 || i15 == 180 || i15 == 270;
    }

    private static boolean m(o oVar) {
        return oVar.getFormat() == 35 && oVar.o2().length == 3;
    }

    public static o n(o oVar, g2 g2Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i15) {
        final o oVar2;
        c cVarP;
        if (!m(oVar)) {
            e1.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!l(i15)) {
            e1.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        c cVar = c.ERROR_CONVERSION;
        if (i15 > 0) {
            oVar2 = oVar;
            cVarP = p(oVar2, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i15);
        } else {
            oVar2 = oVar;
            cVarP = cVar;
        }
        if (cVarP == cVar) {
            e1.c("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        final o oVarC = g2Var.c();
        if (oVarC == null) {
            e1.c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
            return null;
        }
        t tVar = new t(oVarC);
        tVar.b(new e.a() { // from class: o.y0
            @Override // androidx.camera.core.e.a
            public final void b(androidx.camera.core.o oVar3) {
                ImageProcessingUtil.a(oVarC, oVar2, oVar3);
            }
        });
        return tVar;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i15, ByteBuffer byteBuffer2, int i16, ByteBuffer byteBuffer3, int i17, int i18, int i19, Surface surface, ByteBuffer byteBuffer4, int i25, int i26, int i27, int i28, int i29, int i35);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i15, ByteBuffer byteBuffer2, int i16, ByteBuffer byteBuffer3, int i17, int i18, int i19, Bitmap bitmap, int i25, int i26, int i27);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i15, int i16, int i17, int i18, boolean z15);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i15, int i16);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i15, ByteBuffer byteBuffer2, int i16, ByteBuffer byteBuffer3, int i17, int i18, ByteBuffer byteBuffer4, int i19, int i25, ByteBuffer byteBuffer5, int i26, int i27, ByteBuffer byteBuffer6, int i28, int i29, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i35, int i36, int i37);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i15, ByteBuffer byteBuffer2, int i16, ByteBuffer byteBuffer3, int i17, int i18, int i19, int i25, int i26, int i27, int i28, int i29);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    public static o o(o oVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i15) {
        if (!m(oVar)) {
            e1.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!l(i15)) {
            e1.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        if (i15 == 0 && k(oVar)) {
            return null;
        }
        int i16 = i15 % 180;
        int iL = i16 == 0 ? oVar.l() : oVar.getHeight();
        int height = i16 == 0 ? oVar.getHeight() : oVar.l();
        ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        int i17 = height;
        if (nativeRotateYUV(oVar.o2()[0].v(), oVar.o2()[0].w(), oVar.o2()[1].v(), oVar.o2()[1].w(), oVar.o2()[2].v(), oVar.o2()[2].w(), oVar.o2()[2].x(), byteBuffer4, iL, 1, byteBufferNativeNewDirectByteBuffer, iL, 2, byteBuffer5, iL, 2, byteBuffer, byteBuffer2, byteBuffer3, oVar.l(), oVar.getHeight(), i15) == 0) {
            return new t(new a(oVar, byteBuffer4, byteBufferNativeNewDirectByteBuffer, byteBuffer5, iL, i17, i15));
        }
        e1.c("ImageProcessingUtil", "rotate YUV failure");
        return null;
    }

    private static c p(o oVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i15) {
        int iL = oVar.l();
        int height = oVar.getHeight();
        int iW = oVar.o2()[0].w();
        int iW2 = oVar.o2()[1].w();
        int iW3 = oVar.o2()[2].w();
        int iX = oVar.o2()[1].x();
        Image imageB = c0.a.b(imageWriter);
        if (imageB != null && nativeRotateYUV(oVar.o2()[0].v(), iW, oVar.o2()[1].v(), iW2, oVar.o2()[2].v(), iW3, iX, imageB.getPlanes()[0].getBuffer(), imageB.getPlanes()[0].getRowStride(), imageB.getPlanes()[0].getPixelStride(), imageB.getPlanes()[1].getBuffer(), imageB.getPlanes()[1].getRowStride(), imageB.getPlanes()[1].getPixelStride(), imageB.getPlanes()[2].getBuffer(), imageB.getPlanes()[2].getRowStride(), imageB.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, iL, height, i15) == 0) {
            c0.a.d(imageWriter, imageB);
            return c.SUCCESS;
        }
        return c.ERROR_CONVERSION;
    }

    public static boolean q(Surface surface, byte[] bArr) {
        i6.i.g(bArr);
        i6.i.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        e1.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }
}
