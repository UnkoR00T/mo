package z94;

import oq.p;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;
import w94.GradeIcon;
import w94.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw94/b;", "", "a", "(Lw94/b;)Ljava/lang/Integer;", "schoolgrades_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: z94.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C6293a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f233777a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.POINTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.VALUES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f233777a = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Integer a(GradeIcon gradeIcon) {
        int i15 = C6293a.f233777a[gradeIcon.getType().ordinal()];
        if (i15 == 1) {
            return Integer.valueOf(jz.a.f106915z5);
        }
        if (i15 == 2) {
            return Integer.valueOf(jz.a.A5);
        }
        if (i15 == 3) {
            return Integer.valueOf(jz.a.B5);
        }
        if (i15 == 4) {
            return null;
        }
        if (i15 != 5) {
            throw new p();
        }
        String value = gradeIcon.getValue();
        if (value != null) {
            int iHashCode = value.hashCode();
            switch (iHashCode) {
                case EACTags.DATE_OF_BIRTH /* 43 */:
                    if (value.equals("+")) {
                        return Integer.valueOf(jz.a.f106901x5);
                    }
                    break;
                case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                    if (value.equals("-")) {
                        return Integer.valueOf(jz.a.f106894w5);
                    }
                    break;
                case 78:
                    if (value.equals("N")) {
                        return Integer.valueOf(jz.a.f106908y5);
                    }
                    break;
                case 1562:
                    if (value.equals("1+")) {
                        return Integer.valueOf(jz.a.O4);
                    }
                    break;
                case 1564:
                    if (value.equals("1-")) {
                        return Integer.valueOf(jz.a.M4);
                    }
                    break;
                case 1593:
                    if (value.equals("2+")) {
                        return Integer.valueOf(jz.a.R4);
                    }
                    break;
                case 1595:
                    if (value.equals("2-")) {
                        return Integer.valueOf(jz.a.P4);
                    }
                    break;
                case 1624:
                    if (value.equals("3+")) {
                        return Integer.valueOf(jz.a.U4);
                    }
                    break;
                case 1626:
                    if (value.equals("3-")) {
                        return Integer.valueOf(jz.a.S4);
                    }
                    break;
                case 1655:
                    if (value.equals("4+")) {
                        return Integer.valueOf(jz.a.X4);
                    }
                    break;
                case 1657:
                    if (value.equals("4-")) {
                        return Integer.valueOf(jz.a.V4);
                    }
                    break;
                case 1686:
                    if (value.equals("5+")) {
                        return Integer.valueOf(jz.a.f106733a5);
                    }
                    break;
                case 1688:
                    if (value.equals("5-")) {
                        return Integer.valueOf(jz.a.Y4);
                    }
                    break;
                case 1717:
                    if (value.equals("6+")) {
                        return Integer.valueOf(jz.a.f106757d5);
                    }
                    break;
                case 1719:
                    if (value.equals("6-")) {
                        return Integer.valueOf(jz.a.f106741b5);
                    }
                    break;
                case 2058:
                    if (value.equals("A+")) {
                        return Integer.valueOf(jz.a.f106781g5);
                    }
                    break;
                case 2060:
                    if (value.equals("A-")) {
                        return Integer.valueOf(jz.a.f106765e5);
                    }
                    break;
                case 2089:
                    if (value.equals("B+")) {
                        return Integer.valueOf(jz.a.f106803j5);
                    }
                    break;
                case 2091:
                    if (value.equals("B-")) {
                        return Integer.valueOf(jz.a.f106789h5);
                    }
                    break;
                case 2120:
                    if (value.equals("C+")) {
                        return Integer.valueOf(jz.a.f106824m5);
                    }
                    break;
                case 2122:
                    if (value.equals("C-")) {
                        return Integer.valueOf(jz.a.f106810k5);
                    }
                    break;
                case 2151:
                    if (value.equals("D+")) {
                        return Integer.valueOf(jz.a.f106845p5);
                    }
                    break;
                case 2153:
                    if (value.equals("D-")) {
                        return Integer.valueOf(jz.a.f106831n5);
                    }
                    break;
                case 2182:
                    if (value.equals("E+")) {
                        return Integer.valueOf(jz.a.f106866s5);
                    }
                    break;
                case 2184:
                    if (value.equals("E-")) {
                        return Integer.valueOf(jz.a.f106852q5);
                    }
                    break;
                case 2213:
                    if (value.equals("F+")) {
                        return Integer.valueOf(jz.a.f106887v5);
                    }
                    break;
                case 2215:
                    if (value.equals("F-")) {
                        return Integer.valueOf(jz.a.f106873t5);
                    }
                    break;
                default:
                    switch (iHashCode) {
                        case 49:
                            if (value.equals("1")) {
                                return Integer.valueOf(jz.a.N4);
                            }
                            break;
                        case 50:
                            if (value.equals("2")) {
                                return Integer.valueOf(jz.a.Q4);
                            }
                            break;
                        case EACTags.TRANSACTION_DATE /* 51 */:
                            if (value.equals("3")) {
                                return Integer.valueOf(jz.a.T4);
                            }
                            break;
                        case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                            if (value.equals("4")) {
                                return Integer.valueOf(jz.a.W4);
                            }
                            break;
                        case 53:
                            if (value.equals("5")) {
                                return Integer.valueOf(jz.a.Z4);
                            }
                            break;
                        case EACTags.CURRENCY_EXPONENT /* 54 */:
                            if (value.equals("6")) {
                                return Integer.valueOf(jz.a.f106749c5);
                            }
                            break;
                        default:
                            switch (iHashCode) {
                                case 65:
                                    if (value.equals("A")) {
                                        return Integer.valueOf(jz.a.f106773f5);
                                    }
                                    break;
                                case 66:
                                    if (value.equals("B")) {
                                        return Integer.valueOf(jz.a.f106796i5);
                                    }
                                    break;
                                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                                    if (value.equals("C")) {
                                        return Integer.valueOf(jz.a.f106817l5);
                                    }
                                    break;
                                case EACTags.APPLICATION_IMAGE /* 68 */:
                                    if (value.equals(ip.a.f96138c)) {
                                        return Integer.valueOf(jz.a.f106838o5);
                                    }
                                    break;
                                case EACTags.DISPLAY_IMAGE /* 69 */:
                                    if (value.equals("E")) {
                                        return Integer.valueOf(jz.a.f106859r5);
                                    }
                                    break;
                                case 70:
                                    if (value.equals("F")) {
                                        return Integer.valueOf(jz.a.f106880u5);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        return null;
    }
}
