package org.bouncycastle.est;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes5.dex */
public class ESTException extends IOException {
    private static final long MAX_ERROR_BODY = 8192;
    private InputStream body;
    private Throwable cause;
    private int statusCode;

    public ESTException(String str) {
        this(str, null);
    }

    public InputStream getBody() {
        InputStream inputStream = this.body;
        return inputStream == null ? new InputStream() { // from class: org.bouncycastle.est.ESTException.1
            @Override // java.io.InputStream
            public int read() {
                return -1;
            }
        } : inputStream;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + " HTTP Status Code: " + this.statusCode;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public ESTException(String str, Throwable th4) {
        super(str);
        this.cause = th4;
        this.body = null;
        this.statusCode = 0;
    }

    public ESTException(String str, Throwable th4, int i15, InputStream inputStream) {
        super(str);
        this.cause = th4;
        this.statusCode = i15;
        if (inputStream == null) {
            this.body = null;
            return;
        }
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int i16 = inputStream.read(bArr);
                if (i16 < 0) {
                    break;
                }
                if (byteArrayOutputStream.size() + i16 > MAX_ERROR_BODY) {
                    byteArrayOutputStream.write(bArr, 0, PKIFailureInfo.certRevoked - byteArrayOutputStream.size());
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i16);
            } catch (Exception unused) {
                return;
            }
        }
        byteArrayOutputStream.flush();
        byteArrayOutputStream.close();
        this.body = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        inputStream.close();
    }
}
