package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f28832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f28833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f28834e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f28835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28836b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f28832c = bArr;
        int length = bArr.length;
        f28833d = length;
        f28834e = length + 2;
    }

    public g(InputStream inputStream, int i15) {
        super(inputStream);
        if (i15 >= -1 && i15 <= 8) {
            this.f28835a = (byte) i15;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i15);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i15) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i15;
        int i16;
        int i17 = this.f28836b;
        if (i17 < 2 || i17 > (i16 = f28834e)) {
            i15 = super.read();
        } else {
            i15 = i17 == i16 ? this.f28835a : f28832c[i17 - 2] & 255;
        }
        if (i15 != -1) {
            this.f28836b++;
        }
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j15) throws IOException {
        long jSkip = super.skip(j15);
        if (jSkip > 0) {
            this.f28836b = (int) (((long) this.f28836b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        int i17;
        int i18 = this.f28836b;
        int i19 = f28834e;
        if (i18 > i19) {
            i17 = super.read(bArr, i15, i16);
        } else if (i18 == i19) {
            bArr[i15] = this.f28835a;
            i17 = 1;
        } else if (i18 < 2) {
            i17 = super.read(bArr, i15, 2 - i18);
        } else {
            int iMin = Math.min(i19 - i18, i16);
            System.arraycopy(f28832c, this.f28836b - 2, bArr, i15, iMin);
            i17 = iMin;
        }
        if (i17 > 0) {
            this.f28836b += i17;
        }
        return i17;
    }
}
