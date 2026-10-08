package ln;

import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f118901f = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[][] f118902g = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    public static String c(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb5 = new StringBuilder(12);
        sb5.append(str.charAt(0));
        char c15 = cArr[5];
        switch (c15) {
            case '0':
            case '1':
            case '2':
                sb5.append(cArr, 0, 2);
                sb5.append(c15);
                sb5.append("0000");
                sb5.append(cArr, 2, 3);
                break;
            case EACTags.TRANSACTION_DATE /* 51 */:
                sb5.append(cArr, 0, 3);
                sb5.append("00000");
                sb5.append(cArr, 3, 2);
                break;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                sb5.append(cArr, 0, 4);
                sb5.append("00000");
                sb5.append(cArr[4]);
                break;
            default:
                sb5.append(cArr, 0, 5);
                sb5.append("0000");
                sb5.append(c15);
                break;
        }
        if (str.length() >= 8) {
            sb5.append(str.charAt(7));
        }
        return sb5.toString();
    }
}
