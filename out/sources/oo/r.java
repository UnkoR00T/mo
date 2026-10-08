package oo;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f147233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f147234b = 0;

    public r(byte[] bArr) {
        this.f147233a = bArr;
    }

    private int d(int i15) {
        try {
            return this.f147233a[this.f147234b + i15] & 255;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    private int f() {
        try {
            byte[] bArr = this.f147233a;
            int i15 = this.f147234b;
            int i16 = bArr[i15] & 255;
            this.f147234b = i15 + 1;
            return i16;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public int a() {
        return this.f147234b;
    }

    public boolean b() {
        return this.f147234b < this.f147233a.length;
    }

    public int c() {
        return this.f147233a.length;
    }

    public int e(int i15) throws EOFException {
        int iD = d(i15);
        if (iD >= 0) {
            return iD;
        }
        throw new EOFException();
    }

    public byte g() {
        try {
            byte[] bArr = this.f147233a;
            int i15 = this.f147234b;
            byte b15 = bArr[i15];
            this.f147234b = i15 + 1;
            return b15;
        } catch (RuntimeException unused) {
            return (byte) -1;
        }
    }

    public byte[] h(int i15) throws IOException {
        if (i15 < 0) {
            throw new IOException("length is negative");
        }
        byte[] bArr = this.f147233a;
        int length = bArr.length;
        int i16 = this.f147234b;
        if (length - i16 < i15) {
            throw new EOFException();
        }
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, i16, bArr2, 0, i15);
        this.f147234b += i15;
        return bArr2;
    }

    public int i() throws EOFException {
        int iF = f();
        int iF2 = f();
        int iF3 = f();
        int iF4 = f();
        if ((iF | iF2 | iF3 | iF4) >= 0) {
            return (iF << 24) | (iF2 << 16) | (iF3 << 8) | iF4;
        }
        throw new EOFException();
    }

    public short j() {
        return (short) l();
    }

    public int k() throws EOFException {
        int iF = f();
        if (iF >= 0) {
            return iF;
        }
        throw new EOFException();
    }

    public int l() throws EOFException {
        int iF = f();
        int iF2 = f();
        if ((iF | iF2) >= 0) {
            return (iF << 8) | iF2;
        }
        throw new EOFException();
    }

    public void m(int i15) {
        this.f147234b = i15;
    }
}
