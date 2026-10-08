package ar;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljava/io/InputStream;", "Ljava/io/OutputStream;", "out", "", "bufferSize", "", "a", "(Ljava/io/InputStream;Ljava/io/OutputStream;I)J", "", "c", "(Ljava/io/InputStream;)[B", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class a {
    public static final long a(InputStream inputStream, OutputStream outputStream, int i15) throws IOException {
        byte[] bArr = new byte[i15];
        int i16 = inputStream.read(bArr);
        long j15 = 0;
        while (i16 >= 0) {
            outputStream.write(bArr, 0, i16);
            j15 += (long) i16;
            i16 = inputStream.read(bArr);
        }
        return j15;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i15 = PKIFailureInfo.certRevoked;
        }
        return a(inputStream, outputStream, i15);
    }

    public static final byte[] c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(PKIFailureInfo.certRevoked, inputStream.available()));
        b(inputStream, byteArrayOutputStream, 0, 2, null);
        return byteArrayOutputStream.toByteArray();
    }
}
