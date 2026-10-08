package ar;

import io.sentry.instrumentation.file.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000e\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013*\u00020\bH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ljava/io/File;", "", "c", "(Ljava/io/File;)[B", "array", "Loq/i0;", "f", "(Ljava/io/File;[B)V", "Ljava/nio/charset/Charset;", "charset", "", "d", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;", "text", "g", "(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "Ljava/io/OutputStream;", "i", "(Ljava/io/OutputStream;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "Ljava/nio/charset/CharsetEncoder;", "kotlin.jvm.PlatformType", "b", "(Ljava/nio/charset/Charset;)Ljava/nio/charset/CharsetEncoder;", "", "chunkSize", "encoder", "Ljava/nio/ByteBuffer;", "a", "(ILjava/nio/charset/CharsetEncoder;)Ljava/nio/ByteBuffer;", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/io/FilesKt")
public class f extends e {
    public static final ByteBuffer a(int i15, CharsetEncoder charsetEncoder) {
        return ByteBuffer.allocate(i15 * ((int) Math.ceil(charsetEncoder.maxBytesPerChar())));
    }

    public static final CharsetEncoder b(Charset charset) {
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static byte[] c(File file) {
        FileInputStream fileInputStreamA = io.sentry.instrumentation.file.h.b.a(new FileInputStream(file), file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i15 = (int) length;
            byte[] bArrI = new byte[i15];
            int i16 = i15;
            int i17 = 0;
            while (i16 > 0) {
                int i18 = fileInputStreamA.read(bArrI, i17, i16);
                if (i18 < 0) {
                    break;
                }
                i16 -= i18;
                i17 += i18;
            }
            if (i16 > 0) {
                bArrI = Arrays.copyOf(bArrI, i17);
            } else {
                int i19 = fileInputStreamA.read();
                if (i19 != -1) {
                    c cVar = new c(8193);
                    cVar.write(i19);
                    a.b(fileInputStreamA, cVar, 0, 2, null);
                    int size = cVar.size() + i15;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    bArrI = n.i(cVar.b(), Arrays.copyOf(bArrI, size), i15, 0, cVar.size());
                }
            }
            b.a(fileInputStreamA, null);
            return bArrI;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                b.a(fileInputStreamA, th4);
                throw th5;
            }
        }
    }

    public static final String d(File file, Charset charset) {
        InputStreamReader inputStreamReader = new InputStreamReader(io.sentry.instrumentation.file.h.b.a(new FileInputStream(file), file), charset);
        try {
            String strD = j.d(inputStreamReader);
            b.a(inputStreamReader, null);
            return strD;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                b.a(inputStreamReader, th4);
                throw th5;
            }
        }
    }

    public static /* synthetic */ String e(File file, Charset charset, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            charset = fu.d.UTF_8;
        }
        return d(file, charset);
    }

    public static void f(File file, byte[] bArr) {
        FileOutputStream fileOutputStreamA = l.b.a(new FileOutputStream(file), file);
        try {
            fileOutputStreamA.write(bArr);
            i0 i0Var = i0.f148189a;
            b.a(fileOutputStreamA, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                b.a(fileOutputStreamA, th4);
                throw th5;
            }
        }
    }

    public static final void g(File file, String str, Charset charset) {
        FileOutputStream fileOutputStreamA = l.b.a(new FileOutputStream(file), file);
        try {
            i(fileOutputStreamA, str, charset);
            i0 i0Var = i0.f148189a;
            b.a(fileOutputStreamA, null);
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                b.a(fileOutputStreamA, th4);
                throw th5;
            }
        }
    }

    public static /* synthetic */ void h(File file, String str, Charset charset, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            charset = fu.d.UTF_8;
        }
        g(file, str, charset);
    }

    public static final void i(OutputStream outputStream, String str, Charset charset) throws IOException {
        if (str.length() < 16384) {
            outputStream.write(str.getBytes(charset));
            return;
        }
        CharsetEncoder charsetEncoderB = b(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(PKIFailureInfo.certRevoked);
        ByteBuffer byteBufferA = a(PKIFailureInfo.certRevoked, charsetEncoderB);
        int i15 = 0;
        int i16 = 0;
        while (i15 < str.length()) {
            int iMin = Math.min(8192 - i16, str.length() - i15);
            int i17 = i15 + iMin;
            str.getChars(i15, i17, charBufferAllocate.array(), i16);
            charBufferAllocate.limit(iMin + i16);
            i16 = 1;
            if (!charsetEncoderB.encode(charBufferAllocate, byteBufferA, i17 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferA.array(), 0, byteBufferA.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i16 = 0;
            }
            charBufferAllocate.clear();
            byteBufferA.clear();
            i15 = i17;
        }
    }
}
