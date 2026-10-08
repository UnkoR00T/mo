package k43;

import f43.GradeIcon;
import f43.h;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf43/h;", "", "f", "(Lf43/h;)Ljava/lang/Integer;", "Lf43/e;", "e", "(Lf43/e;)Ljava/lang/Integer;", "Lf43/b;", "d", "(Lf43/b;)Ljava/lang/Integer;", "schooldashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f108413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f108414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f108415c;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.PEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.LANGUAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.RULER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.MAGNET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.COLUMN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.BACTERIA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.ATOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[h.BALL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[h.PALETTE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[h.COMPUTER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[h.MUSIC_NOTE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[h.BELL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[h.HOURGLASS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[h.PUZZLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[h.BLOCKS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[h.GLOBE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[h.BUILDING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[h.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[h.GLASSES.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[h.SUPPORT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[h.LEAF.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[h.APPLE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[h.HAND_GESTURE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[h.POOL.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[h.BRIEFCASE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[h.BALANCE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[h.SCISSORS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[h.SECURITY.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[h.FOLDER.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[h.NOTEBOOK.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[h.CHART.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[h.UNKNOWN.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            f108413a = iArr;
            int[] iArr2 = new int[f43.e.values().length];
            try {
                iArr2[f43.e.JUSTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr2[f43.e.ABSENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr2[f43.e.EXCUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr2[f43.e.LATENESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr2[f43.e.SCHOOL_REASONS_ABSENCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr2[f43.e.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused38) {
            }
            f108414b = iArr2;
            int[] iArr3 = new int[f43.c.values().length];
            try {
                iArr3[f43.c.POINTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr3[f43.c.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr3[f43.c.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr3[f43.c.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr3[f43.c.VALUES.ordinal()] = 5;
            } catch (NoSuchFieldError unused43) {
            }
            f108415c = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Integer d(GradeIcon gradeIcon) {
        int i15 = a.f108415c[gradeIcon.getType().ordinal()];
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer e(f43.e eVar) {
        switch (a.f108414b[eVar.ordinal()]) {
            case 1:
                return Integer.valueOf(jz.a.K1);
            case 2:
                return Integer.valueOf(jz.a.f106804k);
            case 3:
                return Integer.valueOf(jz.a.F0);
            case 4:
                return Integer.valueOf(jz.a.f106797j);
            case 5:
                return Integer.valueOf(jz.a.f106827n1);
            case 6:
                return null;
            default:
                throw new p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer f(h hVar) {
        switch (a.f108413a[hVar.ordinal()]) {
            case 1:
                return Integer.valueOf(jz.a.C5);
            case 2:
                return Integer.valueOf(jz.a.D5);
            case 3:
                return Integer.valueOf(jz.a.E5);
            case 4:
                return Integer.valueOf(jz.a.F5);
            case 5:
                return Integer.valueOf(jz.a.G5);
            case 6:
                return Integer.valueOf(jz.a.H5);
            case 7:
                return Integer.valueOf(jz.a.I5);
            case 8:
                return Integer.valueOf(jz.a.J5);
            case 9:
                return Integer.valueOf(jz.a.K5);
            case 10:
                return Integer.valueOf(jz.a.L5);
            case 11:
                return Integer.valueOf(jz.a.M5);
            case 12:
                return Integer.valueOf(jz.a.N5);
            case 13:
                return Integer.valueOf(jz.a.O5);
            case 14:
                return Integer.valueOf(jz.a.P5);
            case 15:
                return Integer.valueOf(jz.a.Q5);
            case 16:
                return Integer.valueOf(jz.a.R5);
            case 17:
                return Integer.valueOf(jz.a.S5);
            case 18:
                return Integer.valueOf(jz.a.T5);
            case 19:
                return Integer.valueOf(jz.a.U5);
            case 20:
                return Integer.valueOf(jz.a.V5);
            case 21:
                return Integer.valueOf(jz.a.W5);
            case 22:
                return Integer.valueOf(jz.a.X5);
            case 23:
                return Integer.valueOf(jz.a.Y5);
            case 24:
                return Integer.valueOf(jz.a.Z5);
            case 25:
                return Integer.valueOf(jz.a.f106734a6);
            case 26:
                return Integer.valueOf(jz.a.f106742b6);
            case 27:
                return Integer.valueOf(jz.a.f106750c6);
            case 28:
                return Integer.valueOf(jz.a.f106758d6);
            case 29:
                return Integer.valueOf(jz.a.f106766e6);
            case 30:
                return Integer.valueOf(jz.a.f106774f6);
            case BERTags.DATE /* 31 */:
                return Integer.valueOf(jz.a.f106782g6);
            case 32:
                return null;
            default:
                throw new p();
        }
    }
}
