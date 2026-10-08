package iy;

import java.nio.charset.Charset;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Liy/c;", "", "", "byteArray", "Liy/b;", "charset", "Ldx/i;", "Ldx/b;", "", "c", "([BLiy/b;)Ldx/i;", "charArray", "Ljava/nio/charset/Charset;", "a", "([CLjava/nio/charset/Charset;)[B", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    static /* synthetic */ byte[] b(c cVar, char[] cArr, Charset charset, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromCharArray");
        }
        if ((i15 & 2) != 0) {
            charset = fu.d.UTF_8;
        }
        return cVar.a(cArr, charset);
    }

    byte[] a(char[] charArray, Charset charset);

    dx.i<dx.b, char[]> c(byte[] byteArray, b charset);
}
