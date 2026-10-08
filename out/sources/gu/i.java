package gu;

import java.io.IOException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007\"\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000e"}, d2 = {"Lgu/h;", "instant", "", "b", "(Lgu/h;)Ljava/lang/String;", "", "a", "[I", "POWERS_OF_TEN", "asciiDigitPositionsInIsoStringAfterYear", "c", "colonsInIsoOffsetString", "d", "asciiDigitsInIsoOffsetString", "kotlin-stdlib"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f76971a = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f76972b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f76973c = {3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f76974d = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(h hVar) throws IOException {
        int[] iArr;
        StringBuilder sb5 = new StringBuilder();
        n nVarA = n.INSTANCE.a(hVar);
        int iG = nVarA.getYear();
        int i15 = 0;
        if (Math.abs(iG) < 1000) {
            StringBuilder sb6 = new StringBuilder();
            if (iG >= 0) {
                sb6.append(iG + 10000);
                sb6.deleteCharAt(0);
            } else {
                sb6.append(iG - 10000);
                sb6.deleteCharAt(1);
            }
            sb5.append((CharSequence) sb6);
        } else {
            if (iG >= 10000) {
                sb5.append('+');
            }
            sb5.append(iG);
        }
        sb5.append('-');
        c(sb5, sb5, nVarA.getMonth());
        sb5.append('-');
        c(sb5, sb5, nVarA.getDay());
        sb5.append('T');
        c(sb5, sb5, nVarA.getHour());
        sb5.append(':');
        c(sb5, sb5, nVarA.getMinute());
        sb5.append(':');
        c(sb5, sb5, nVarA.getSecond());
        if (nVarA.getNanosecond() != 0) {
            sb5.append('.');
            while (true) {
                int iE = nVarA.getNanosecond();
                iArr = f76971a;
                int i16 = i15 + 1;
                if (iE % iArr[i16] != 0) {
                    break;
                }
                i15 = i16;
            }
            int i17 = i15 - (i15 % 3);
            sb5.append(String.valueOf((nVarA.getNanosecond() / iArr[i17]) + iArr[9 - i17]).substring(1));
        }
        sb5.append('Z');
        return sb5.toString();
    }

    private static final void c(Appendable appendable, StringBuilder sb5, int i15) throws IOException {
        if (i15 < 10) {
            appendable.append('0');
        }
        sb5.append(i15);
    }
}
