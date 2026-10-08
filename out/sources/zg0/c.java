package zg0;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f235131a = Pattern.compile("[\\S\\s]*/Contents[^<>]*/ByteRange \\[\\d+ (\\d+) (\\d+) \\d+]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f235132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f235133c;

    static {
        Charset charset = StandardCharsets.UTF_8;
        f235132b = "<".getBytes(charset);
        f235133c = ">".getBytes(charset);
    }

    c() {
    }

    private byte[] a(String str, int i15) {
        StringBuilder sb5 = new StringBuilder(str);
        while (sb5.length() < i15) {
            sb5.append('0');
        }
        return sb5.toString().getBytes(StandardCharsets.UTF_8);
    }

    byte[] b(byte[] bArr, String str) {
        Matcher matcher = f235131a.matcher(new String(bArr));
        if (!matcher.find()) {
            throw new RuntimeException("Couldn't find valid placeholder for signature in pdf");
        }
        int i15 = Integer.parseInt(matcher.group(1));
        int i16 = Integer.parseInt(matcher.group(2)) - i15;
        byte[] bArr2 = f235132b;
        int length = i16 - bArr2.length;
        byte[] bArr3 = f235133c;
        int length2 = length - bArr3.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i15);
        byte[] bArrA = a(str, length2);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i15, bArr.length);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[bArrCopyOfRange.length + bArr2.length + bArrA.length + bArr3.length + bArrCopyOfRange2.length]);
        byteBufferWrap.put(bArrCopyOfRange);
        byteBufferWrap.put(bArr2);
        byteBufferWrap.put(bArrA);
        byteBufferWrap.put(bArr3);
        byteBufferWrap.put(bArrCopyOfRange2);
        return byteBufferWrap.array();
    }
}
