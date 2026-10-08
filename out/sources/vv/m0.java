package vv;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "", "beginIndex", "endIndex", "", "a", "(Ljava/lang/String;II)J", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m0 {
    public static final long a(String str, int i15, int i16) {
        int i17;
        if (i15 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i15).toString());
        }
        if (i16 < i15) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i16 + " < " + i15).toString());
        }
        if (i16 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i16 + " > " + str.length()).toString());
        }
        long j15 = 0;
        while (i15 < i16) {
            char cCharAt = str.charAt(i15);
            if (cCharAt < 128) {
                j15++;
            } else {
                if (cCharAt < 2048) {
                    i17 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i17 = 3;
                } else {
                    int i18 = i15 + 1;
                    char cCharAt2 = i18 < i16 ? str.charAt(i18) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j15++;
                        i15 = i18;
                    } else {
                        j15 += (long) 4;
                        i15 += 2;
                    }
                }
                j15 += (long) i17;
            }
            i15++;
        }
        return j15;
    }

    public static /* synthetic */ long b(String str, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i15 = 0;
        }
        if ((i17 & 2) != 0) {
            i16 = str.length();
        }
        return a(str, i15, i16);
    }
}
