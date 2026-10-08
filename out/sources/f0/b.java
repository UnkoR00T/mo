package f0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.o;
import i6.i;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import o.e1;
import y.h;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC1285a f54487a;

        /* JADX INFO: renamed from: f0.b$a$a, reason: collision with other inner class name */
        public enum EnumC1285a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        a(String str, EnumC1285a enumC1285a) {
            super(str);
            this.f54487a = enumC1285a;
        }
    }

    public static Rect a(Size size, Rational rational) {
        int i15;
        if (!i(rational)) {
            e1.o("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f15 = width;
        float f16 = height;
        float f17 = f15 / f16;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i16 = 0;
        if (rational.floatValue() > f17) {
            int iRound = Math.round((f15 / numerator) * denominator);
            i15 = (height - iRound) / 2;
            height = iRound;
        } else {
            int iRound2 = Math.round((f16 / denominator) * numerator);
            int i17 = (width - iRound2) / 2;
            width = iRound2;
            i15 = 0;
            i16 = i17;
        }
        return new Rect(i16, i15, width + i16, height + i15);
    }

    public static Bitmap b(o oVar) {
        int format = oVar.getFormat();
        if (format == 1) {
            return e(oVar);
        }
        if (format == 35) {
            return ImageProcessingUtil.f(oVar);
        }
        if (format == 256 || format == 4101) {
            return c(oVar);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + oVar.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    private static Bitmap c(o oVar) {
        byte[] bArrL = l(oVar);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrL, 0, bArrL.length, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static Bitmap d(o.a[] aVarArr, int i15, int i16) {
        i.b(aVarArr.length == 1, "Expect a single plane");
        i.b(aVarArr[0].x() == 4, "Expect pixelStride=4");
        i.b(aVarArr[0].w() == i15 * 4, "Expect rowStride=width*4");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i15, i16, Bitmap.Config.ARGB_8888);
        aVarArr[0].v().rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, aVarArr[0].v(), aVarArr[0].w());
        return bitmapCreateBitmap;
    }

    private static Bitmap e(o oVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(oVar.l(), oVar.getHeight(), Bitmap.Config.ARGB_8888);
        oVar.o2()[0].v().rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, oVar.o2()[0].v(), oVar.o2()[0].w());
        return bitmapCreateBitmap;
    }

    public static ByteBuffer f(Bitmap bitmap) {
        i.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.i(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    public static Rational g(int i15, Rational rational) {
        return (i15 == 90 || i15 == 270) ? h(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    private static Rational h(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean i(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    public static boolean j(int i15) {
        return i15 == 256 || i15 == 4101;
    }

    public static boolean k(int i15) {
        return i15 == 32;
    }

    public static byte[] l(o oVar) {
        if (!j(oVar.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + oVar.getFormat());
        }
        ByteBuffer byteBufferV = oVar.o2()[0].v();
        byte[] bArr = new byte[byteBufferV.capacity()];
        byteBufferV.rewind();
        byteBufferV.get(bArr);
        return bArr;
    }

    public static Bitmap m(Bitmap bitmap, int i15) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i15);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static byte[] n(o oVar, Rect rect, int i15, int i16) throws a {
        if (oVar.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + oVar.getFormat());
        }
        YuvImage yuvImage = new YuvImage(o(oVar), 17, oVar.l(), oVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        y.i iVar = new y.i(byteArrayOutputStream, h.c(oVar, i16));
        if (rect == null) {
            rect = new Rect(0, 0, oVar.l(), oVar.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i15, iVar)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new a("YuvImage failed to encode jpeg.", a.EnumC1285a.ENCODE_FAILED);
    }

    public static byte[] o(o oVar) {
        o.a aVar = oVar.o2()[0];
        o.a aVar2 = oVar.o2()[1];
        o.a aVar3 = oVar.o2()[2];
        ByteBuffer byteBufferV = aVar.v();
        ByteBuffer byteBufferV2 = aVar2.v();
        ByteBuffer byteBufferV3 = aVar3.v();
        byteBufferV.rewind();
        byteBufferV2.rewind();
        byteBufferV3.rewind();
        int iRemaining = byteBufferV.remaining();
        byte[] bArr = new byte[((oVar.l() * oVar.getHeight()) / 2) + iRemaining];
        int iL = 0;
        for (int i15 = 0; i15 < oVar.getHeight(); i15++) {
            byteBufferV.get(bArr, iL, oVar.l());
            iL += oVar.l();
            byteBufferV.position(Math.min(iRemaining, (byteBufferV.position() - oVar.l()) + aVar.w()));
        }
        int height = oVar.getHeight() / 2;
        int iL2 = oVar.l() / 2;
        int iW = aVar3.w();
        int iW2 = aVar2.w();
        int iX = aVar3.x();
        int iX2 = aVar2.x();
        byte[] bArr2 = new byte[iW];
        byte[] bArr3 = new byte[iW2];
        for (int i16 = 0; i16 < height; i16++) {
            byteBufferV3.get(bArr2, 0, Math.min(iW, byteBufferV3.remaining()));
            byteBufferV2.get(bArr3, 0, Math.min(iW2, byteBufferV2.remaining()));
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < iL2; i19++) {
                int i25 = iL + 1;
                bArr[iL] = bArr2[i17];
                iL += 2;
                bArr[i25] = bArr3[i18];
                i17 += iX;
                i18 += iX2;
            }
        }
        return bArr;
    }
}
