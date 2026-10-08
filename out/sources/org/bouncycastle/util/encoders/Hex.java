package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public class Hex {
    private static final HexEncoder encoder = new HexEncoder();

    public static int decode(String str, OutputStream outputStream) {
        return encoder.decode(str, outputStream);
    }

    public static byte[] decodeStrict(String str) {
        try {
            return encoder.decodeStrict(str, 0, str.length());
        } catch (Exception e15) {
            throw new DecoderException("exception decoding Hex string: " + e15.getMessage(), e15);
        }
    }

    public static int encode(byte[] bArr, int i15, int i16, OutputStream outputStream) {
        return encoder.encode(bArr, i15, i16, outputStream);
    }

    public static String toHexString(byte[] bArr) {
        return toHexString(bArr, 0, bArr.length);
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e15) {
            throw new DecoderException("exception decoding Hex string: " + e15.getMessage(), e15);
        }
    }

    public static byte[] decodeStrict(String str, int i15, int i16) {
        try {
            return encoder.decodeStrict(str, i15, i16);
        } catch (Exception e15) {
            throw new DecoderException("exception decoding Hex string: " + e15.getMessage(), e15);
        }
    }

    public static int encode(byte[] bArr, OutputStream outputStream) {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static String toHexString(byte[] bArr, int i15, int i16) {
        return Strings.fromByteArray(encode(bArr, i15, i16));
    }

    public static byte[] decode(byte[] bArr) {
        return decode(bArr, 0, bArr.length);
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static byte[] decode(byte[] bArr, int i15, int i16) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i16 / 2);
        try {
            encoder.decode(bArr, i15, i16, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e15) {
            throw new DecoderException("exception decoding Hex data: " + e15.getMessage(), e15);
        }
    }

    public static byte[] encode(byte[] bArr, int i15, int i16) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encoder.encode(bArr, i15, i16, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e15) {
            throw new EncoderException("exception encoding Hex string: " + e15.getMessage(), e15);
        }
    }
}
