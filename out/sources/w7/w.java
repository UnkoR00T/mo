package w7;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, t7.g gVar) {
        if (gVar != null) {
            d(mediaFormat, "color-transfer", gVar.f188192c);
            d(mediaFormat, "color-standard", gVar.f188190a);
            d(mediaFormat, "color-range", gVar.f188191b);
            a(mediaFormat, "hdr-static-info", gVar.f188193d);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f15) {
        if (f15 != -1.0f) {
            mediaFormat.setFloat(str, f15);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i15) {
        if (i15 != -1) {
            mediaFormat.setInteger(str, i15);
        }
    }

    public static void e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            mediaFormat.setByteBuffer("csd-" + i15, ByteBuffer.wrap(list.get(i15)));
        }
    }
}
