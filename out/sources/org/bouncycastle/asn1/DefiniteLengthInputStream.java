package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes3.dex */
class DefiniteLengthInputStream extends LimitedInputStream {
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final int _originalLength;
    private int _remaining;

    DefiniteLengthInputStream(InputStream inputStream, int i15, int i16) {
        super(inputStream, i16);
        if (i15 <= 0) {
            if (i15 < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            setParentEofDetect(true);
        }
        this._originalLength = i15;
        this._remaining = i15;
    }

    int getRemaining() {
        return this._remaining;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this._remaining == 0) {
            return -1;
        }
        int i15 = this._in.read();
        if (i15 >= 0) {
            int i16 = this._remaining - 1;
            this._remaining = i16;
            if (i16 == 0) {
                setParentEofDetect(true);
            }
            return i15;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }

    void readAllIntoByteArray(byte[] bArr) throws IOException {
        int i15 = this._remaining;
        if (i15 != bArr.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i15 == 0) {
            return;
        }
        int limit = getLimit();
        int i16 = this._remaining;
        if (i16 >= limit) {
            throw new IOException("corrupted stream - out of bounds length found: " + this._remaining + " >= " + limit);
        }
        int fully = i16 - Streams.readFully(this._in, bArr, 0, bArr.length);
        this._remaining = fully;
        if (fully == 0) {
            setParentEofDetect(true);
            return;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }

    byte[] toByteArray() throws IOException {
        if (this._remaining == 0) {
            return EMPTY_BYTES;
        }
        int limit = getLimit();
        int i15 = this._remaining;
        if (i15 >= limit) {
            throw new IOException("corrupted stream - out of bounds length found: " + this._remaining + " >= " + limit);
        }
        byte[] bArr = new byte[i15];
        int fully = i15 - Streams.readFully(this._in, bArr, 0, i15);
        this._remaining = fully;
        if (fully == 0) {
            setParentEofDetect(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i15, int i16) throws IOException {
        int i17 = this._remaining;
        if (i17 == 0) {
            return -1;
        }
        int i18 = this._in.read(bArr, i15, Math.min(i16, i17));
        if (i18 >= 0) {
            int i19 = this._remaining - i18;
            this._remaining = i19;
            if (i19 == 0) {
                setParentEofDetect(true);
            }
            return i18;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }
}
