package org.conscrypt.ct;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class Serialization {
    private static final int DER_LENGTH_LONG_FORM_FLAG = 128;
    private static final int DER_TAG_MASK = 63;
    private static final int DER_TAG_OCTET_STRING = 4;

    private Serialization() {
    }

    public static byte readByte(InputStream inputStream) throws SerializationException {
        try {
            int i15 = inputStream.read();
            if (i15 != -1) {
                return (byte) i15;
            }
            throw new SerializationException("Premature end of input, could not read byte.");
        } catch (IOException e15) {
            throw new SerializationException(e15);
        }
    }

    public static byte[] readDEROctetString(byte[] bArr) {
        return readDEROctetString(new ByteArrayInputStream(bArr));
    }

    public static byte[] readFixedBytes(InputStream inputStream, int i15) throws SerializationException {
        try {
            if (i15 < 0) {
                throw new SerializationException("Negative length: " + i15);
            }
            byte[] bArr = new byte[i15];
            int i16 = inputStream.read(bArr);
            if (i16 >= i15) {
                return bArr;
            }
            throw new SerializationException("Premature end of input, expected " + i15 + " bytes, only read " + i16);
        } catch (IOException e15) {
            throw new SerializationException(e15);
        }
    }

    public static byte[][] readList(byte[] bArr, int i15, int i16) {
        return readList(new ByteArrayInputStream(bArr), i15, i16);
    }

    public static long readLong(InputStream inputStream, int i15) {
        if (i15 > 8 || i15 < 0) {
            throw new IllegalArgumentException("Invalid width: " + i15);
        }
        long j15 = 0;
        for (int i16 = 0; i16 < i15; i16++) {
            j15 = (j15 << 8) | ((long) (readByte(inputStream) & 255));
        }
        return j15;
    }

    public static int readNumber(InputStream inputStream, int i15) throws SerializationException {
        if (i15 > 4 || i15 < 0) {
            throw new SerializationException("Invalid width: " + i15);
        }
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            i16 = (i16 << 8) | (readByte(inputStream) & 255);
        }
        return i16;
    }

    public static byte[] readVariableBytes(InputStream inputStream, int i15) {
        return readFixedBytes(inputStream, readNumber(inputStream, i15));
    }

    public static void writeFixedBytes(OutputStream outputStream, byte[] bArr) throws SerializationException {
        try {
            outputStream.write(bArr);
        } catch (IOException e15) {
            throw new SerializationException(e15);
        }
    }

    public static void writeNumber(OutputStream outputStream, long j15, int i15) throws SerializationException {
        if (i15 < 0) {
            throw new SerializationException("Negative width: " + i15);
        }
        if (i15 < 8 && j15 >= (1 << (i15 * 8))) {
            throw new SerializationException("Number too large, " + j15 + " does not fit in " + i15 + " bytes");
        }
        while (i15 > 0) {
            long j16 = ((long) (i15 - 1)) * 8;
            if (j16 < 64) {
                try {
                    outputStream.write((byte) ((j15 >> ((int) j16)) & 255));
                } catch (IOException e15) {
                    throw new SerializationException(e15);
                }
            } else {
                outputStream.write(0);
            }
            i15--;
        }
    }

    public static void writeVariableBytes(OutputStream outputStream, byte[] bArr, int i15) throws SerializationException {
        writeNumber(outputStream, bArr.length, i15);
        writeFixedBytes(outputStream, bArr);
    }

    public static byte[] readDEROctetString(InputStream inputStream) throws SerializationException {
        int i15 = readByte(inputStream) & 63;
        if (i15 == 4) {
            int number = readNumber(inputStream, 1);
            if ((number & 128) != 0) {
                number = readNumber(inputStream, number & (-129));
            }
            return readFixedBytes(inputStream, number);
        }
        throw new SerializationException("Wrong DER tag, expected OCTET STRING, got " + i15);
    }

    public static byte[][] readList(InputStream inputStream, int i15, int i16) throws SerializationException {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readVariableBytes(inputStream, i15));
        while (byteArrayInputStream.available() > 0) {
            try {
                arrayList.add(readVariableBytes(byteArrayInputStream, i16));
            } catch (IOException e15) {
                throw new SerializationException(e15);
            }
        }
        return (byte[][]) arrayList.toArray(new byte[arrayList.size()][]);
    }
}
