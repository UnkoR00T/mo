package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
class IndefiniteLengthInputStream extends LimitedInputStream {
    private int _b1;
    private int _b2;
    private boolean _eofOn00;
    private boolean _eofReached;

    IndefiniteLengthInputStream(InputStream inputStream, int i15) throws IOException {
        super(inputStream, i15);
        this._eofReached = false;
        this._eofOn00 = true;
        this._b1 = inputStream.read();
        int i16 = inputStream.read();
        this._b2 = i16;
        if (i16 < 0) {
            throw new EOFException();
        }
        checkForEof();
    }

    private boolean checkForEof() {
        if (!this._eofReached && this._eofOn00 && this._b1 == 0 && this._b2 == 0) {
            this._eofReached = true;
            setParentEofDetect(true);
        }
        return this._eofReached;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (checkForEof()) {
            return -1;
        }
        int i15 = this._in.read();
        if (i15 < 0) {
            throw new EOFException();
        }
        int i16 = this._b1;
        this._b1 = this._b2;
        this._b2 = i15;
        return i16;
    }

    void setEofOn00(boolean z15) {
        this._eofOn00 = z15;
        checkForEof();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        if (this._eofOn00 || i16 < 3) {
            return super.read(bArr, i15, i16);
        }
        if (this._eofReached) {
            return -1;
        }
        int i17 = this._in.read(bArr, i15 + 2, i16 - 2);
        if (i17 < 0) {
            throw new EOFException();
        }
        bArr[i15] = (byte) this._b1;
        bArr[i15 + 1] = (byte) this._b2;
        this._b1 = this._in.read();
        int i18 = this._in.read();
        this._b2 = i18;
        if (i18 >= 0) {
            return i17 + 2;
        }
        throw new EOFException();
    }
}
