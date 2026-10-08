package io.sentry;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f95989b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h1 f95990a;

    public z(h1 h1Var) {
        this.f95990a = h1Var;
    }

    private q5 b(byte[] bArr, int i15, int i16) {
        StringReader stringReader = new StringReader(new String(bArr, i15, i16, f95989b));
        try {
            q5 q5Var = (q5) this.f95990a.c(stringReader, q5.class);
            stringReader.close();
            return q5Var;
        } catch (Throwable th4) {
            try {
                stringReader.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    private q6 c(byte[] bArr, int i15, int i16) {
        StringReader stringReader = new StringReader(new String(bArr, i15, i16, f95989b));
        try {
            q6 q6Var = (q6) this.f95990a.c(stringReader, q6.class);
            stringReader.close();
            return q6Var;
        } catch (Throwable th4) {
            try {
                stringReader.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @Override // io.sentry.s0
    public p5 a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i15 = 0;
        int i16 = -1;
        while (true) {
            try {
                int i17 = inputStream.read(bArr);
                if (i17 <= 0) {
                    break;
                }
                for (int i18 = 0; i16 == -1 && i18 < i17; i18++) {
                    if (bArr[i18] == 10) {
                        i16 = i15 + i18;
                        break;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, i17);
                i15 += i17;
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i16 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        q5 q5VarB = b(byteArray, 0, i16);
        if (q5VarB == null) {
            throw new IllegalArgumentException("Envelope header is null.");
        }
        int i19 = i16 + 1;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i25 = i19;
            while (true) {
                if (i25 >= byteArray.length) {
                    i25 = -1;
                    break;
                }
                if (byteArray[i25] == 10) {
                    break;
                }
                i25++;
            }
            if (i25 == -1) {
                throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
            }
            q6 q6VarC = c(byteArray, i19, i25 - i19);
            if (q6VarC == null || q6VarC.a() <= 0) {
                throw new IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
            }
            int iA = q6VarC.a() + i25;
            int i26 = iA + 1;
            if (i26 > byteArray.length) {
                throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i26 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
            }
            arrayList.add(new p6(q6VarC, Arrays.copyOfRange(byteArray, i25 + 1, i26)));
            if (i26 == byteArray.length) {
                break;
            }
            i19 = iA + 2;
            if (i19 == byteArray.length) {
                if (byteArray[i26] == 10) {
                    break;
                }
                throw new IllegalArgumentException("Envelope has invalid data following an item.");
            }
        }
        p5 p5Var = new p5(q5VarB, arrayList);
        byteArrayOutputStream.close();
        return p5Var;
    }
}
