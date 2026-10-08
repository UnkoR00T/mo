package vm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import dh.fc;
import dh.hc;
import java.io.IOException;
import java.nio.ByteBuffer;
import jg.s;
import pm.h;
import wm.c;
import wm.d;

/* JADX INFO: loaded from: classes4.dex */
public class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Bitmap f207423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile ByteBuffer f207424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile b f207425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f207426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f207427e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f207428f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f207429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Matrix f207430h;

    private a(Bitmap bitmap, int i15) {
        this.f207423a = (Bitmap) s.l(bitmap);
        this.f207426d = bitmap.getWidth();
        this.f207427e = bitmap.getHeight();
        n(i15);
        this.f207428f = i15;
        this.f207429g = -1;
        this.f207430h = null;
    }

    public static a a(Bitmap bitmap, int i15) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a aVar = new a(bitmap, i15);
        p(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i15);
        return aVar;
    }

    public static a b(ByteBuffer byteBuffer, int i15, int i16, int i17, int i18) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a aVar = new a(byteBuffer, i15, i16, i17, i18);
        p(i18, 3, jElapsedRealtime, i16, i15, byteBuffer.limit(), i17);
        return aVar;
    }

    public static a c(Context context, Uri uri) throws IOException {
        s.m(context, "Please provide a valid Context");
        s.m(uri, "Please provide a valid imageUri");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapF = d.b().f(context.getContentResolver(), uri);
        a aVar = new a(bitmapF, 0);
        p(-1, 4, jElapsedRealtime, bitmapF.getHeight(), bitmapF.getWidth(), bitmapF.getAllocationByteCount(), 0);
        return aVar;
    }

    public static a d(Image image, int i15) {
        return o(image, i15, null);
    }

    private static int n(int i15) {
        boolean z15 = true;
        if (i15 != 0 && i15 != 90 && i15 != 180) {
            if (i15 == 270) {
                i15 = 270;
            } else {
                z15 = false;
            }
        }
        s.b(z15, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i15;
    }

    private static a o(Image image, int i15, Matrix matrix) {
        Image image2;
        int i16;
        int iLimit;
        a aVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        s.m(image, "Please provide a valid image");
        n(i15);
        boolean z15 = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z15 = false;
        }
        s.b(z15, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            image2 = image;
            i16 = i15;
            aVar = new a(c.f().c(image, i15), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            image2 = image;
            i16 = i15;
            a aVar2 = new a(image2, image.getWidth(), image.getHeight(), i16, matrix);
            iLimit = (image2.getPlanes()[0].getBuffer().limit() * 3) / 2;
            aVar = aVar2;
        }
        p(image2.getFormat(), 5, jElapsedRealtime, image2.getHeight(), image2.getWidth(), iLimit, i16);
        return aVar;
    }

    private static void p(int i15, int i16, long j15, int i17, int i18, int i19, int i25) {
        hc.a(fc.b("vision-common"), i15, i16, j15, i17, i18, i19, i25);
    }

    public Bitmap e() {
        return this.f207423a;
    }

    public ByteBuffer f() {
        return this.f207424b;
    }

    public Matrix g() {
        return this.f207430h;
    }

    public int h() {
        return this.f207429g;
    }

    public int i() {
        return this.f207427e;
    }

    public Image j() {
        if (this.f207425c == null) {
            return null;
        }
        return this.f207425c.a();
    }

    public Image.Plane[] k() {
        if (this.f207425c == null) {
            return null;
        }
        return this.f207425c.b();
    }

    public int l() {
        return this.f207428f;
    }

    public int m() {
        return this.f207426d;
    }

    private a(Image image, int i15, int i16, int i17, Matrix matrix) {
        s.l(image);
        this.f207425c = new b(image);
        this.f207426d = i15;
        this.f207427e = i16;
        n(i17);
        this.f207428f = i17;
        this.f207429g = 35;
        this.f207430h = matrix;
    }

    private a(ByteBuffer byteBuffer, int i15, int i16, int i17, int i18) {
        boolean z15;
        if (i18 == 842094169) {
            z15 = true;
        } else if (i18 == 17) {
            i18 = 17;
            z15 = true;
        } else {
            z15 = false;
        }
        s.a(z15);
        this.f207424b = (ByteBuffer) s.l(byteBuffer);
        s.b(byteBuffer.limit() > i15 * i16, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.f207426d = i15;
        this.f207427e = i16;
        n(i17);
        this.f207428f = i17;
        this.f207429g = i18;
        this.f207430h = null;
    }
}
