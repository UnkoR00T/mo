package b00;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\n\u0010\bJ,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u001d\u001a\u00020\tH¦@¢\u0006\u0004\b\u001e\u0010\u001fJJ\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH¦@¢\u0006\u0004\b\"\u0010#J,\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020 H¦@¢\u0006\u0004\b%\u0010\u0010J2\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H¦@¢\u0006\u0004\b)\u0010*J,\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020'H¦@¢\u0006\u0004\b,\u0010-¨\u0006.À\u0006\u0003"}, d2 = {"Lb00/c;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "imageQuality", "", "l", "(Landroid/graphics/Bitmap;ILtq/e;)Ljava/lang/Object;", "", "i", "Lxw/a;", "maxSize", "Ldx/i;", "Ldx/b;", "c", "(Landroid/graphics/Bitmap;FLtq/e;)Ljava/lang/Object;", "Landroid/net/Uri;", "uri", "g", "(Landroid/net/Uri;Ltq/e;)Ljava/lang/Object;", "Ljava/io/File;", "file", "imageMaxSide", "k", "(Ljava/io/File;ILtq/e;)Ljava/lang/Object;", "base64String", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "bytes", "h", "([BLtq/e;)Ljava/lang/Object;", "", "photoOrientation", "e", "([BFIILxw/a;Ltq/e;)Ljava/lang/Object;", "scale", "d", "", "Lb00/f;", "transformations", "j", "(Landroid/graphics/Bitmap;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "transformation", "f", "(Landroid/graphics/Bitmap;Lb00/f;Ltq/e;)Ljava/lang/Object;", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    static /* synthetic */ Object a(c cVar, byte[] bArr, float f15, int i15, int i16, xw.a aVar, tq.e eVar, int i17, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformAndToByteArray-YtJVtKI");
        }
        if ((i17 & 2) != 0) {
            f15 = 0.0f;
        }
        float f16 = f15;
        if ((i17 & 16) != 0) {
            aVar = null;
        }
        return cVar.e(bArr, f16, i15, i16, aVar, eVar);
    }

    Object b(String str, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar);

    Object c(Bitmap bitmap, float f15, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar);

    Object d(Bitmap bitmap, float f15, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar);

    Object e(byte[] bArr, float f15, int i15, int i16, xw.a aVar, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar);

    Object f(Bitmap bitmap, f fVar, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar);

    Object g(Uri uri, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar);

    Object h(byte[] bArr, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar);

    Object i(Bitmap bitmap, int i15, tq.e<? super byte[]> eVar);

    Object j(Bitmap bitmap, List<? extends f> list, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar);

    Object k(File file, int i15, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar);

    Object l(Bitmap bitmap, int i15, tq.e<? super String> eVar);
}
