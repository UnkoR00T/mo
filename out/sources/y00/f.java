package y00;

import java.nio.charset.Charset;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ly00/f;", "Liy/c;", "<init>", "()V", "", "byteArray", "Liy/b;", "charset", "Ldx/i;", "Ldx/b;", "", "c", "([BLiy/b;)Ldx/i;", "charArray", "Ljava/nio/charset/Charset;", "a", "([CLjava/nio/charset/Charset;)[B", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements iy.c {
    @Override // iy.c
    public byte[] a(char[] charArray, Charset charset) {
        return new String(charArray).getBytes(charset);
    }

    @Override // iy.c
    public dx.i<dx.b, char[]> c(byte[] byteArray, iy.b charset) {
        if (!fr.t.c(charset, iy.b.a.f97723a)) {
            if (charset instanceof iy.b.Standard) {
                return new dx.i.Right(new String(byteArray, ((iy.b.Standard) charset).getCharset()).toCharArray());
            }
            throw new oq.p();
        }
        char[] cArr = new char[byteArray.length];
        int length = byteArray.length;
        for (int i15 = 0; i15 < length; i15++) {
            byte b15 = byteArray[i15];
            if (b15 > 128) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Byte integer is greater than ASCII size: " + ((int) b15));
                px.f.f163100a.d("Logging silent exception for illegal byte array", illegalArgumentException, px.c.a(this));
                new dx.i.Left(new dx.b.Generic(illegalArgumentException));
            }
            cArr[i15] = (char) b15;
        }
        return new dx.i.Right(cArr);
    }
}
