package xo;

import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends a implements DataOutput, DataInput {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f220177j = new byte[8];

    protected final void l() throws IOException {
        int i15;
        a();
        int i16 = this.f220170d;
        if (i16 == 0) {
            return;
        }
        int i17 = read();
        if (i17 == -1) {
            i15 = 0;
            this.f220170d = 0;
        } else {
            i(f() - 1);
            i15 = ((-1) << (8 - i16)) & i17;
        }
        write(i15);
    }

    public void m(long j15, int i15) throws IOException {
        a();
        int i16 = this.f220170d;
        if (i16 > 0) {
            int i17 = read();
            if (i17 == -1) {
                i17 = 0;
            } else {
                i(f() - 1);
            }
            int i18 = 8 - i16;
            if (i15 >= i18) {
                int i19 = (-1) >>> (32 - i18);
                i15 -= i18;
                write((int) (((long) (i17 & (~i19))) | ((j15 >> i15) & ((long) i19))));
            } else {
                int i25 = i16 + i15;
                int i26 = (-1) >>> i15;
                int i27 = 8 - i25;
                write((int) (((long) (i17 & (~(i26 << i27)))) | ((((long) i26) & j15) << i27)));
                i(f() - 1);
                this.f220170d = i25;
                i15 = 0;
            }
        }
        while (i15 > 7) {
            write((int) ((j15 >> (i15 - 8)) & ((long) GF2Field.MASK)));
            i15 -= 8;
        }
        if (i15 > 0) {
            write((int) ((j15 << (8 - i15)) & ((long) GF2Field.MASK)));
            i(f() - 1);
            this.f220170d = i15;
        }
    }

    public void n(char[] cArr, int i15, int i16) {
        if (i15 < 0 || i16 < 0 || i15 + i16 > cArr.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i17 = 0; i17 < i16; i17++) {
            writeShort(cArr[i15 + i17]);
        }
    }

    @Override // java.io.DataOutput
    public abstract void write(int i15);

    @Override // java.io.DataOutput
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.DataOutput
    public abstract void write(byte[] bArr, int i15, int i16);

    @Override // java.io.DataOutput
    public void writeBoolean(boolean z15) {
        write(z15 ? 1 : 0);
    }

    @Override // java.io.DataOutput
    public void writeByte(int i15) {
        write(i15);
    }

    @Override // java.io.DataOutput
    public void writeBytes(String str) {
        write(str.getBytes());
    }

    @Override // java.io.DataOutput
    public void writeChar(int i15) {
        writeShort(i15);
    }

    @Override // java.io.DataOutput
    public void writeChars(String str) {
        char[] charArray = str.toCharArray();
        n(charArray, 0, charArray.length);
    }

    @Override // java.io.DataOutput
    public void writeDouble(double d15) {
        writeLong(Double.doubleToLongBits(d15));
    }

    @Override // java.io.DataOutput
    public void writeFloat(float f15) {
        writeInt(Float.floatToIntBits(f15));
    }

    @Override // java.io.DataOutput
    public void writeInt(int i15) {
        if (this.f220167a == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f220177j;
            bArr[0] = (byte) (i15 >> 24);
            bArr[1] = (byte) (i15 >> 16);
            bArr[2] = (byte) (i15 >> 8);
            bArr[3] = (byte) i15;
        } else {
            byte[] bArr2 = this.f220177j;
            bArr2[3] = (byte) (i15 >> 24);
            bArr2[2] = (byte) (i15 >> 16);
            bArr2[1] = (byte) (i15 >> 8);
            bArr2[0] = (byte) i15;
        }
        write(this.f220177j, 0, 4);
    }

    @Override // java.io.DataOutput
    public void writeLong(long j15) {
        if (this.f220167a == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f220177j;
            bArr[0] = (byte) (j15 >> 56);
            bArr[1] = (byte) (j15 >> 48);
            bArr[2] = (byte) (j15 >> 40);
            bArr[3] = (byte) (j15 >> 32);
            bArr[4] = (byte) (j15 >> 24);
            bArr[5] = (byte) (j15 >> 16);
            bArr[6] = (byte) (j15 >> 8);
            bArr[7] = (byte) j15;
        } else {
            byte[] bArr2 = this.f220177j;
            bArr2[7] = (byte) (j15 >> 56);
            bArr2[6] = (byte) (j15 >> 48);
            bArr2[5] = (byte) (j15 >> 40);
            bArr2[4] = (byte) (j15 >> 32);
            bArr2[3] = (byte) (j15 >> 24);
            bArr2[2] = (byte) (j15 >> 16);
            bArr2[1] = (byte) (j15 >> 8);
            bArr2[0] = (byte) j15;
        }
        write(this.f220177j, 0, 8);
    }

    @Override // java.io.DataOutput
    public void writeShort(int i15) {
        if (this.f220167a == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f220177j;
            bArr[0] = (byte) (i15 >> 8);
            bArr[1] = (byte) i15;
        } else {
            byte[] bArr2 = this.f220177j;
            bArr2[1] = (byte) (i15 >> 8);
            bArr2[0] = (byte) i15;
        }
        write(this.f220177j, 0, 2);
    }

    @Override // java.io.DataOutput
    public void writeUTF(String str) throws IOException {
        ByteOrder byteOrderD = d();
        j(ByteOrder.BIG_ENDIAN);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new DataOutputStream(byteArrayOutputStream).writeUTF(str);
        write(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
        j(byteOrderD);
    }
}
