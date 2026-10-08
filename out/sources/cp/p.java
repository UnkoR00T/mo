package cp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import com.gemalto.jp2.JP2Decoder;
import com.gemalto.jp2.JP2Encoder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends l {
    private Bitmap g(InputStream inputStream, j jVar, k kVar) throws r {
        try {
            Class.forName("com.gemalto.jp2.JP2Decoder");
            Bitmap bitmapDecode = new JP2Decoder(inputStream).decode();
            bp.d dVarB = kVar.b();
            if (!dVarB.h4(bp.i.f20923x4, false)) {
                dVarB.Y4(bp.i.f20705c2, null);
            }
            dVarB.W4(bp.i.H9, bitmapDecode.getWidth());
            dVarB.W4(bp.i.f20737f4, bitmapDecode.getHeight());
            if (!dVarB.J3(bp.i.I1) && Build.VERSION.SDK_INT > 26) {
                kVar.c(new op.g(bitmapDecode.getColorSpace()));
            }
            return bitmapDecode;
        } catch (ClassNotFoundException unused) {
            throw new r("Cannot read JPX image: JP2Android is not installed.");
        }
    }

    @Override // cp.l
    public k a(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15) {
        return b(inputStream, outputStream, dVar, i15, j.f37213g);
    }

    @Override // cp.l
    public k b(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15, j jVar) throws IOException {
        k kVar = new k(new bp.d());
        kVar.b().i3(dVar);
        Bitmap bitmapG = g(inputStream, jVar, kVar);
        int width = bitmapG.getWidth() * bitmapG.getHeight();
        int[] iArr = new int[width];
        bitmapG.getPixels(iArr, 0, bitmapG.getWidth(), 0, 0, bitmapG.getWidth(), bitmapG.getHeight());
        byte[] bArr = new byte[3072];
        int i16 = 0;
        for (int i17 = 0; i17 < width; i17++) {
            if (i16 + 3 >= 3072) {
                outputStream.write(bArr, 0, i16);
                i16 = 0;
            }
            int i18 = iArr[i17];
            bArr[i16] = (byte) Color.red(i18);
            bArr[i16 + 1] = (byte) Color.green(i18);
            bArr[i16 + 2] = (byte) Color.blue(i18);
            i16 += 3;
        }
        outputStream.write(bArr, 0, i16);
        return kVar;
    }

    @Override // cp.l
    protected void c(InputStream inputStream, OutputStream outputStream, bp.d dVar) throws IOException {
        dp.a.c(new ByteArrayInputStream(new JP2Encoder(BitmapFactory.decodeStream(inputStream)).encode()), outputStream);
        outputStream.flush();
    }
}
