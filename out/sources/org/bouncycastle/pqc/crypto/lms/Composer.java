package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.util.Encodable;

/* JADX INFO: loaded from: classes5.dex */
public class Composer {
    private final ByteArrayOutputStream bos = new ByteArrayOutputStream();

    private Composer() {
    }

    public static Composer compose() {
        return new Composer();
    }

    public Composer bool(boolean z15) {
        this.bos.write(z15 ? 1 : 0);
        return this;
    }

    public byte[] build() {
        return this.bos.toByteArray();
    }

    public Composer bytes(Encodable encodable) {
        try {
            this.bos.write(encodable.getEncoded());
            return this;
        } catch (Exception e15) {
            throw new RuntimeException(e15.getMessage(), e15);
        }
    }

    public Composer pad(int i15, int i16) {
        while (i16 >= 0) {
            try {
                this.bos.write(i15);
                i16--;
            } catch (Exception e15) {
                throw new RuntimeException(e15.getMessage(), e15);
            }
        }
        return this;
    }

    public Composer padUntil(int i15, int i16) {
        while (this.bos.size() < i16) {
            this.bos.write(i15);
        }
        return this;
    }

    public Composer u16str(int i15) {
        int i16 = i15 & 65535;
        this.bos.write((byte) (i16 >>> 8));
        this.bos.write((byte) i16);
        return this;
    }

    public Composer u32str(int i15) {
        this.bos.write((byte) (i15 >>> 24));
        this.bos.write((byte) (i15 >>> 16));
        this.bos.write((byte) (i15 >>> 8));
        this.bos.write((byte) i15);
        return this;
    }

    public Composer u64str(long j15) {
        u32str((int) (j15 >>> 32));
        u32str((int) j15);
        return this;
    }

    public Composer bytes(byte[] bArr) {
        try {
            this.bos.write(bArr);
            return this;
        } catch (Exception e15) {
            throw new RuntimeException(e15.getMessage(), e15);
        }
    }

    public Composer bytes(byte[] bArr, int i15, int i16) {
        try {
            this.bos.write(bArr, i15, i16);
            return this;
        } catch (Exception e15) {
            throw new RuntimeException(e15.getMessage(), e15);
        }
    }

    public Composer bytes(Encodable[] encodableArr) {
        try {
            for (Encodable encodable : encodableArr) {
                this.bos.write(encodable.getEncoded());
            }
            return this;
        } catch (Exception e15) {
            throw new RuntimeException(e15.getMessage(), e15);
        }
    }

    public Composer bytes(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.bos.write(bArr2);
            }
            return this;
        } catch (Exception e15) {
            throw new RuntimeException(e15.getMessage(), e15);
        }
    }

    public Composer bytes(byte[][] bArr, int i15, int i16) {
        while (i15 != i16) {
            try {
                this.bos.write(bArr[i15]);
                i15++;
            } catch (Exception e15) {
                throw new RuntimeException(e15.getMessage(), e15);
            }
        }
        return this;
    }
}
