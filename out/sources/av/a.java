package av;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\n\u001a\u00020\t*\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\"(\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0017\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"", "i", "", "b", "(I)C", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "value", "Loq/i0;", "a", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "", "[Ljava/lang/String;", "getESCAPE_STRINGS", "()[Ljava/lang/String;", "getESCAPE_STRINGS$annotations", "()V", "ESCAPE_STRINGS", "", "[B", "getESCAPE_MARKERS", "()[B", "ESCAPE_MARKERS", "kotlinx-serialization-json"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f14616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f14617b;

    static {
        String[] strArr = new String[93];
        for (int i15 = 0; i15 < 32; i15++) {
            strArr[i15] = "\\u" + b(i15 >> 12) + b(i15 >> 8) + b(i15 >> 4) + b(i15);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f14616a = strArr;
        byte[] bArr = new byte[93];
        for (int i16 = 0; i16 < 32; i16++) {
            bArr[i16] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f14617b = bArr;
    }

    public static final void a(StringBuilder sb5, String str) {
        sb5.append('\"');
        int length = str.length();
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            char cCharAt = str.charAt(i16);
            String[] strArr = f14616a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb5.append((CharSequence) str, i15, i16);
                sb5.append(strArr[cCharAt]);
                i15 = i16 + 1;
            }
        }
        if (i15 != 0) {
            sb5.append((CharSequence) str, i15, str.length());
        } else {
            sb5.append(str);
        }
        sb5.append('\"');
    }

    private static final char b(int i15) {
        int i16 = i15 & 15;
        return (char) (i16 < 10 ? i16 + 48 : i16 + 87);
    }
}
