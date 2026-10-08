package com.google.android.libraries.places.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
final class dq0 extends InputStream implements o50, t60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g00 f32073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p00 f32074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteArrayInputStream f32075c;

    dq0(g00 g00Var, p00 p00Var) {
        this.f32073a = g00Var;
        this.f32074b = p00Var;
    }

    @Override // java.io.InputStream
    public final int available() {
        g00 g00Var = this.f32073a;
        if (g00Var != null) {
            return g00Var.j();
        }
        ByteArrayInputStream byteArrayInputStream = this.f32075c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.o50
    public final int b(OutputStream outputStream) throws IOException {
        g00 g00Var = this.f32073a;
        if (g00Var != null) {
            int iJ = g00Var.j();
            this.f32073a.b(outputStream);
            this.f32073a = null;
            return iJ;
        }
        ByteArrayInputStream byteArrayInputStream = this.f32075c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        ly lyVar = gq0.f32418a;
        zj.p.r(byteArrayInputStream, "inputStream cannot be null!");
        zj.p.r(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        long j15 = 0;
        while (true) {
            int i15 = byteArrayInputStream.read(bArr);
            if (i15 == -1) {
                int i16 = (int) j15;
                this.f32075c = null;
                return i16;
            }
            outputStream.write(bArr, 0, i15);
            j15 += (long) i15;
        }
    }

    final g00 h() {
        g00 g00Var = this.f32073a;
        if (g00Var != null) {
            return g00Var;
        }
        throw new IllegalStateException("message not available");
    }

    final p00 m() {
        return this.f32074b;
    }

    @Override // java.io.InputStream
    public final int read() {
        g00 g00Var = this.f32073a;
        if (g00Var != null) {
            this.f32075c = new ByteArrayInputStream(g00Var.i());
            this.f32073a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f32075c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i15, int i16) {
        g00 g00Var = this.f32073a;
        if (g00Var != null) {
            int iJ = g00Var.j();
            if (iJ == 0) {
                this.f32073a = null;
                this.f32075c = null;
                return -1;
            }
            if (i16 >= iJ) {
                dy dyVarC = dy.c(bArr, i15, iJ);
                this.f32073a.e(dyVarC);
                dyVarC.g();
                this.f32073a = null;
                this.f32075c = null;
                return iJ;
            }
            this.f32075c = new ByteArrayInputStream(this.f32073a.i());
            this.f32073a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f32075c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i15, i16);
        }
        return -1;
    }
}
