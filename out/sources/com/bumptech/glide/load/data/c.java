package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f28825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f28826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ce.b f28827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f28828d;

    public c(OutputStream outputStream, ce.b bVar) {
        this(outputStream, bVar, PKIFailureInfo.notAuthorized);
    }

    private void b() throws IOException {
        int i15 = this.f28828d;
        if (i15 > 0) {
            this.f28825a.write(this.f28826b, 0, i15);
            this.f28828d = 0;
        }
    }

    private void h() throws IOException {
        if (this.f28828d == this.f28826b.length) {
            b();
        }
    }

    private void m() {
        byte[] bArr = this.f28826b;
        if (bArr != null) {
            this.f28827c.put(bArr);
            this.f28826b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f28825a.close();
            m();
        } catch (Throwable th4) {
            this.f28825a.close();
            throw th4;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        b();
        this.f28825a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i15) throws IOException {
        byte[] bArr = this.f28826b;
        int i16 = this.f28828d;
        this.f28828d = i16 + 1;
        bArr[i16] = (byte) i15;
        h();
    }

    c(OutputStream outputStream, ce.b bVar, int i15) {
        this.f28825a = outputStream;
        this.f28827c = bVar;
        this.f28826b = (byte[]) bVar.c(i15, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i15, int i16) throws IOException {
        int i17 = 0;
        do {
            int i18 = i16 - i17;
            int i19 = i15 + i17;
            int i25 = this.f28828d;
            if (i25 == 0 && i18 >= this.f28826b.length) {
                this.f28825a.write(bArr, i19, i18);
                return;
            }
            int iMin = Math.min(i18, this.f28826b.length - i25);
            System.arraycopy(bArr, i19, this.f28826b, this.f28828d, iMin);
            this.f28828d += iMin;
            i17 += iMin;
            h();
        } while (i17 < i16);
    }
}
