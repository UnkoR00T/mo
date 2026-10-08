package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes5.dex */
public class BufferedDecoder {
    protected byte[] buf;
    protected int bufOff;
    protected Translator translator;

    public BufferedDecoder(Translator translator, int i15) {
        this.translator = translator;
        if (i15 % translator.getEncodedBlockSize() != 0) {
            throw new IllegalArgumentException("buffer size not multiple of input block size");
        }
        this.buf = new byte[i15];
        this.bufOff = 0;
    }

    public int processByte(byte b15, byte[] bArr, int i15) {
        byte[] bArr2 = this.buf;
        int i16 = this.bufOff;
        int i17 = i16 + 1;
        this.bufOff = i17;
        bArr2[i16] = b15;
        if (i17 != bArr2.length) {
            return 0;
        }
        int iDecode = this.translator.decode(bArr2, 0, bArr2.length, bArr, i15);
        this.bufOff = 0;
        return iDecode;
    }

    public int processBytes(byte[] bArr, int i15, int i16, byte[] bArr2, int i17) {
        byte[] bArr3;
        if (i16 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        byte[] bArr4 = this.buf;
        int length = bArr4.length;
        int i18 = this.bufOff;
        int i19 = length - i18;
        int iDecode = 0;
        if (i16 > i19) {
            System.arraycopy(bArr, i15, bArr4, i18, i19);
            Translator translator = this.translator;
            byte[] bArr5 = this.buf;
            int iDecode2 = translator.decode(bArr5, 0, bArr5.length, bArr2, i17);
            this.bufOff = 0;
            int i25 = i16 - i19;
            int i26 = i15 + i19;
            int length2 = i25 - (i25 % this.buf.length);
            bArr3 = bArr;
            iDecode = iDecode2 + this.translator.decode(bArr3, i26, length2, bArr2, i17 + iDecode2);
            i16 = i25 - length2;
            i15 = i26 + length2;
        } else {
            bArr3 = bArr;
        }
        if (i16 != 0) {
            System.arraycopy(bArr3, i15, this.buf, this.bufOff, i16);
            this.bufOff += i16;
        }
        return iDecode;
    }
}
