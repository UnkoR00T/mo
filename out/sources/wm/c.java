package wm;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import io.sentry.android.core.c2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import jg.s;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f214074a = new c();

    private c() {
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    public static c f() {
        return f214074a;
    }

    public static Bitmap i(ByteBuffer byteBuffer, int i15, int i16, int i17) throws lm.a {
        byte[] bArrL = l(j(byteBuffer, true).array(), i15, i16);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrL, 0, bArrL.length);
        return k(bitmapDecodeByteArray, i17, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public static ByteBuffer j(ByteBuffer byteBuffer, boolean z15) {
        int i15;
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        int i16 = iLimit / 6;
        ByteBuffer byteBufferAllocate = z15 ? ByteBuffer.allocate(iLimit) : ByteBuffer.allocateDirect(iLimit);
        int i17 = 0;
        while (true) {
            i15 = i16 * 4;
            if (i17 >= i15) {
                break;
            }
            byteBufferAllocate.put(i17, byteBuffer.get(i17));
            i17++;
        }
        for (int i18 = 0; i18 < i16 + i16; i18++) {
            byteBufferAllocate.put(i15 + i18, byteBuffer.get(((i18 % 2) * i16) + i15 + (i18 / 2)));
        }
        return byteBufferAllocate;
    }

    public static Bitmap k(Bitmap bitmap, int i15, int i16, int i17) {
        if (i15 == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i16, i17);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i15);
        return Bitmap.createBitmap(bitmap, 0, 0, i16, i17, matrix, true);
    }

    private static byte[] l(byte[] bArr, int i15, int i16) throws lm.a {
        YuvImage yuvImage = new YuvImage(bArr, 17, i15, i16, null);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                yuvImage.compressToJpeg(new Rect(0, 0, i15, i16), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                    throw th4;
                } catch (Throwable th5) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                        throw th4;
                    } catch (Exception unused) {
                        throw th4;
                    }
                }
            }
        } catch (IOException e15) {
            c2.g("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new lm.a("Image conversion error from NV21 format", 13, e15);
        }
    }

    private static final void m(Image.Plane plane, int i15, int i16, byte[] bArr, int i17, int i18) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int iLimit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (iLimit == 0) {
            return;
        }
        int i19 = i15 / (i16 / iLimit);
        int rowStride = 0;
        for (int i25 = 0; i25 < iLimit; i25++) {
            int pixelStride = rowStride;
            for (int i26 = 0; i26 < i19; i26++) {
                bArr[i17] = buffer.get(pixelStride);
                i17 += i18;
                pixelStride += plane.getPixelStride();
            }
            rowStride += plane.getRowStride();
        }
    }

    public byte[] b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        return bArr;
    }

    public Bitmap c(Image image, int i15) {
        s.b(image.getFormat() == 256, "Only JPEG is supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[iRemaining];
        buffer.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
        return k(bitmapDecodeByteArray, i15, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public ByteBuffer d(vm.a aVar, boolean z15) throws lm.a {
        int iH = aVar.h();
        if (iH != -1) {
            if (iH == 17) {
                return z15 ? a((ByteBuffer) s.l(aVar.f())) : (ByteBuffer) s.l(aVar.f());
            }
            if (iH == 35) {
                return h((Image.Plane[]) s.l(aVar.k()), aVar.m(), aVar.i());
            }
            if (iH == 842094169) {
                return j((ByteBuffer) s.l(aVar.f()), z15);
            }
            throw new lm.a("Unsupported image format", 13);
        }
        Bitmap bitmapCopy = (Bitmap) s.l(aVar.e());
        if (bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i15 = width * height;
        int[] iArr = new int[i15];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(((double) height) / 2.0d);
        int iCeil2 = ((iCeil + iCeil) * ((int) Math.ceil(((double) width) / 2.0d))) + i15;
        ByteBuffer byteBufferAllocate = z15 ? ByteBuffer.allocate(iCeil2) : ByteBuffer.allocateDirect(iCeil2);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < height; i18++) {
            int i19 = 0;
            while (i19 < width) {
                int i25 = iArr[i17];
                int i26 = i25 >> 16;
                int i27 = i25 >> 8;
                int i28 = i25 & GF2Field.MASK;
                int i29 = i16 + 1;
                int i35 = i26 & GF2Field.MASK;
                int i36 = i27 & GF2Field.MASK;
                byteBufferAllocate.put(i16, (byte) Math.min(GF2Field.MASK, (((((i35 * 66) + (i36 * 129)) + (i28 * 25)) + 128) >> 8) + 16));
                if (i18 % 2 == 0 && i17 % 2 == 0) {
                    int i37 = ((((i35 * 112) - (i36 * 94)) - (i28 * 18)) + 128) >> 8;
                    int i38 = (((((i35 * (-38)) - (i36 * 74)) + (i28 * 112)) + 128) >> 8) + 128;
                    int i39 = i15 + 1;
                    byteBufferAllocate.put(i15, (byte) Math.min(GF2Field.MASK, i37 + 128));
                    i15 += 2;
                    byteBufferAllocate.put(i39, (byte) Math.min(GF2Field.MASK, i38));
                }
                i17++;
                i19++;
                i16 = i29;
            }
        }
        return byteBufferAllocate;
    }

    public Bitmap e(vm.a aVar) throws lm.a {
        int iH = aVar.h();
        if (iH == -1) {
            return k((Bitmap) s.l(aVar.e()), aVar.l(), aVar.m(), aVar.i());
        }
        if (iH == 17) {
            return g((ByteBuffer) s.l(aVar.f()), aVar.m(), aVar.i(), aVar.l());
        }
        if (iH == 35) {
            return g(h((Image.Plane[]) s.l(aVar.k()), aVar.m(), aVar.i()), aVar.m(), aVar.i(), aVar.l());
        }
        if (iH == 842094169) {
            return i((ByteBuffer) s.l(aVar.f()), aVar.m(), aVar.i(), aVar.l());
        }
        throw new lm.a("Unsupported image format", 13);
    }

    public Bitmap g(ByteBuffer byteBuffer, int i15, int i16, int i17) throws lm.a {
        byte[] bArrL = l(b(byteBuffer), i15, i16);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrL, 0, bArrL.length);
        return k(bitmapDecodeByteArray, i17, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
    }

    public ByteBuffer h(Image.Plane[] planeArr, int i15, int i16) {
        int i17 = i15 * i16;
        int i18 = i17 / 4;
        byte[] bArr = new byte[i18 + i18 + i17];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int iPosition = buffer2.position();
        int iLimit = buffer.limit();
        buffer2.position(iPosition + 1);
        buffer.limit(iLimit - 1);
        int i19 = (i17 + i17) / 4;
        boolean z15 = buffer2.remaining() == i19 + (-2) && buffer2.compareTo(buffer) == 0;
        buffer2.position(iPosition);
        buffer.limit(iLimit);
        if (z15) {
            planeArr[0].getBuffer().get(bArr, 0, i17);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i17, 1);
            buffer3.get(bArr, i17 + 1, i19 - 1);
        } else {
            m(planeArr[0], i15, i16, bArr, 0, 1);
            m(planeArr[1], i15, i16, bArr, i17 + 1, 2);
            m(planeArr[2], i15, i16, bArr, i17, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
