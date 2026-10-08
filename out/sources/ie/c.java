package ie;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class c implements zd.k<Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zd.g<Integer> f91881b = zd.g.f("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zd.g<Bitmap.CompressFormat> f91882c = zd.g.e("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.b f91883a;

    public c(ce.b bVar) {
        this.f91883a = bVar;
    }

    private Bitmap.CompressFormat d(Bitmap bitmap, zd.h hVar) {
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) hVar.c(f91882c);
        if (compressFormat != null) {
            return compressFormat;
        }
        return bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // zd.k
    public zd.c b(zd.h hVar) {
        return zd.c.TRANSFORMED;
    }

    @Override // zd.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(be.v<Bitmap> vVar, File file, zd.h hVar) {
        boolean z15;
        Bitmap bitmap = vVar.get();
        Bitmap.CompressFormat compressFormatD = d(bitmap, hVar);
        we.b.d("encode: [%dx%d] %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), compressFormatD);
        try {
            long jB = ve.g.b();
            int iIntValue = ((Integer) hVar.c(f91881b)).intValue();
            OutputStream outputStreamA = null;
            try {
                outputStreamA = io.sentry.instrumentation.file.l.b.a(new FileOutputStream(file), file);
                if (this.f91883a != null) {
                    outputStreamA = new com.bumptech.glide.load.data.c(outputStreamA, this.f91883a);
                }
                bitmap.compress(compressFormatD, iIntValue, outputStreamA);
                outputStreamA.close();
                try {
                    outputStreamA.close();
                } catch (IOException unused) {
                }
                z15 = true;
            } catch (IOException unused2) {
                if (outputStreamA != null) {
                    try {
                        outputStreamA.close();
                    } catch (IOException unused3) {
                    }
                }
                z15 = false;
            } catch (Throwable th4) {
                if (outputStreamA != null) {
                    try {
                        outputStreamA.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th4;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Objects.toString(compressFormatD);
                ve.l.h(bitmap);
                ve.g.a(jB);
                Objects.toString(hVar.c(f91882c));
                bitmap.hasAlpha();
            }
            we.b.e();
            return z15;
        } catch (Throwable th5) {
            we.b.e();
            throw th5;
        }
    }
}
