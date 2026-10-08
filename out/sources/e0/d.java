package e0;

import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.o;
import java.nio.ByteBuffer;
import v.g3;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IncorrectJpegMetadataQuirk f46488a;

    public d(g3 g3Var) {
        this.f46488a = (IncorrectJpegMetadataQuirk) g3Var.b(IncorrectJpegMetadataQuirk.class);
    }

    public byte[] a(o oVar) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f46488a;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.f(oVar);
        }
        ByteBuffer byteBufferV = oVar.o2()[0].v();
        byte[] bArr = new byte[byteBufferV.capacity()];
        byteBufferV.rewind();
        byteBufferV.get(bArr);
        return bArr;
    }
}
