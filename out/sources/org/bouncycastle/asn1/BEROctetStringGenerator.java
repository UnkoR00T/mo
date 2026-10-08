package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class BEROctetStringGenerator extends BERGenerator {

    private class BufferedBEROctetStream extends OutputStream {
        private byte[] _buf;
        private DEROutputStream _derOut;
        private int _off = 0;

        BufferedBEROctetStream(byte[] bArr) {
            this._buf = bArr;
            this._derOut = new DEROutputStream(BEROctetStringGenerator.this._out);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            int i15 = this._off;
            if (i15 != 0) {
                DEROctetString.encode(this._derOut, true, this._buf, 0, i15);
            }
            this._derOut.flushInternal();
            BEROctetStringGenerator.this.writeBEREnd();
        }

        @Override // java.io.OutputStream
        public void write(int i15) throws IOException {
            byte[] bArr = this._buf;
            int i16 = this._off;
            int i17 = i16 + 1;
            this._off = i17;
            bArr[i16] = (byte) i15;
            if (i17 == bArr.length) {
                DEROctetString.encode(this._derOut, true, bArr, 0, bArr.length);
                this._off = 0;
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i15, int i16) throws IOException {
            byte[] bArr2 = this._buf;
            int length = bArr2.length;
            int i17 = this._off;
            int i18 = length - i17;
            if (i16 < i18) {
                System.arraycopy(bArr, i15, bArr2, i17, i16);
                this._off += i16;
                return;
            }
            if (i17 > 0) {
                System.arraycopy(bArr, i15, bArr2, i17, i18);
                DEROctetString.encode(this._derOut, true, this._buf, 0, length);
            } else {
                i18 = 0;
            }
            while (true) {
                int i19 = i16 - i18;
                if (i19 < length) {
                    System.arraycopy(bArr, i15 + i18, this._buf, 0, i19);
                    this._off = i19;
                    return;
                } else {
                    DEROctetString.encode(this._derOut, true, bArr, i15 + i18, length);
                    i18 += length;
                }
            }
        }
    }

    public BEROctetStringGenerator(OutputStream outputStream) throws IOException {
        super(outputStream);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream() {
        return getOctetOutputStream(new byte[1000]);
    }

    public BEROctetStringGenerator(OutputStream outputStream, int i15, boolean z15) throws IOException {
        super(outputStream, i15, z15);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream(byte[] bArr) {
        return new BufferedBEROctetStream(bArr);
    }
}
