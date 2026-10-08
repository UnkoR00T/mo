package org.bouncycastle.cms;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class InputStreamWithMAC extends InputStream {
    private final InputStream base;
    private boolean baseFinished = false;
    private int index = 0;
    private byte[] mac;
    private MACProvider macProvider;

    InputStreamWithMAC(InputStream inputStream, MACProvider mACProvider) {
        this.base = inputStream;
        this.macProvider = mACProvider;
    }

    public byte[] getMAC() {
        if (this.baseFinished) {
            return Arrays.clone(this.mac);
        }
        throw new IllegalStateException("input stream not fully processed");
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte b15;
        if (this.baseFinished) {
            int i15 = this.index;
            byte[] bArr = this.mac;
            if (i15 >= bArr.length) {
                return -1;
            }
            this.index = i15 + 1;
            b15 = bArr[i15];
        } else {
            int i16 = this.base.read();
            if (i16 >= 0) {
                return i16;
            }
            this.baseFinished = true;
            MACProvider mACProvider = this.macProvider;
            if (mACProvider != null) {
                mACProvider.init();
                this.mac = this.macProvider.getMAC();
            }
            byte[] bArr2 = this.mac;
            int i17 = this.index;
            this.index = i17 + 1;
            b15 = bArr2[i17];
        }
        return b15 & 255;
    }

    public InputStreamWithMAC(InputStream inputStream, byte[] bArr) {
        this.base = inputStream;
        this.mac = bArr;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("input array is null");
        }
        if (i15 < 0 || bArr.length < i15 + i16) {
            throw new IndexOutOfBoundsException("invalid off(" + i15 + ") and len(" + i16 + ")");
        }
        if (this.baseFinished) {
            int i17 = this.index;
            byte[] bArr2 = this.mac;
            if (i17 >= bArr2.length) {
                return -1;
            }
            if (i16 >= bArr2.length - i17) {
                System.arraycopy(bArr2, i17, bArr, i15, bArr2.length - i17);
                byte[] bArr3 = this.mac;
                int length = bArr3.length - this.index;
                this.index = bArr3.length;
                return length;
            }
            System.arraycopy(bArr2, i17, bArr, i15, i16);
        } else {
            int i18 = this.base.read(bArr, i15, i16);
            if (i18 >= 0) {
                return i18;
            }
            this.baseFinished = true;
            MACProvider mACProvider = this.macProvider;
            if (mACProvider != null) {
                mACProvider.init();
                this.mac = this.macProvider.getMAC();
            }
            byte[] bArr4 = this.mac;
            if (i16 >= bArr4.length) {
                System.arraycopy(bArr4, 0, bArr, i15, bArr4.length);
                byte[] bArr5 = this.mac;
                this.index = bArr5.length;
                return bArr5.length;
            }
            System.arraycopy(bArr4, 0, bArr, i15, i16);
        }
        this.index += i16;
        return i16;
    }
}
