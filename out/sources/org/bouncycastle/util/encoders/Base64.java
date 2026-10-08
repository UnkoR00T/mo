package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public class Base64 {
    private static final Encoder encoder = new Base64Encoder();

    public static int decode(String str, OutputStream outputStream) {
        return encoder.decode(str, outputStream);
    }

    public static int encode(byte[] bArr, int i15, int i16, OutputStream outputStream) {
        return encoder.encode(bArr, i15, i16, outputStream);
    }

    public static String toBase64String(byte[] bArr) {
        return toBase64String(bArr, 0, bArr.length);
    }

    public static int decode(byte[] bArr, int i15, int i16, OutputStream outputStream) {
        try {
            return encoder.decode(bArr, i15, i16, outputStream);
        } catch (Exception e15) {
            throw new DecoderException("unable to decode base64 data: " + e15.getMessage(), e15);
        }
    }

    public static int encode(byte[] bArr, OutputStream outputStream) {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static String toBase64String(byte[] bArr, int i15, int i16) {
        return Strings.fromByteArray(encode(bArr, i15, i16));
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e15) {
            throw new DecoderException("unable to decode base64 string: " + e15.getMessage(), e15);
        }
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static byte[] decode(byte[] bArr) {
        return decode(bArr, 0, bArr.length);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static byte[] encode(byte[] bArr, int i15, int i16) {
        Encoder encoder2 = encoder;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(encoder2.getEncodedLength(i16));
        try {
            encoder2.encode(bArr, i15, i16, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e15) {
            throw new EncoderException("exception encoding base64 string: " + e15.getMessage(), e15);
        }
    }

    public static byte[] decode(byte[] bArr, int i15, int i16) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((i16 / 4) * 3);
        try {
            encoder.decode(bArr, i15, i16, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e15) {
            throw new DecoderException("unable to decode base64 data: " + e15.getMessage(), e15);
        }
    }
}
