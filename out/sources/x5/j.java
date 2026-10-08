package x5;

import android.graphics.Path;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f216818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f216819b;

        a() {
        }
    }

    private static void a(ArrayList<b> arrayList, char c15, float[] fArr) {
        arrayList.add(new b(c15, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i15 = 0; i15 < bVarArr.length; i15++) {
            if (bVarArr[i15].f216820a != bVarArr2[i15].f216820a || bVarArr[i15].f216821b.length != bVarArr2[i15].f216821b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i15, int i16) {
        if (i15 > i16) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i15 < 0 || i15 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i17 = i16 - i15;
        int iMin = Math.min(i17, length - i15);
        float[] fArr2 = new float[i17];
        System.arraycopy(fArr, i15, fArr2, 0, iMin);
        return fArr2;
    }

    public static b[] d(String str) {
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        int i16 = 1;
        while (i16 < str.length()) {
            int i17 = i(str, i16);
            String strTrim = str.substring(i15, i17).trim();
            if (!strTrim.isEmpty()) {
                a(arrayList, strTrim.charAt(0), h(strTrim));
            }
            i15 = i17;
            i16 = i17 + 1;
        }
        if (i16 - i15 == 1 && i15 < str.length()) {
            a(arrayList, str.charAt(i15), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    public static Path e(String str) {
        Path path = new Path();
        try {
            b.h(d(str), path);
            return path;
        } catch (RuntimeException e15) {
            throw new RuntimeException("Error in parsing " + str, e15);
        }
    }

    public static b[] f(b[] bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i15 = 0; i15 < bVarArr.length; i15++) {
            bVarArr2[i15] = new b(bVarArr[i15]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    private static void g(String str, int i15, a aVar) {
        aVar.f216819b = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        for (int i16 = i15; i16 < str.length(); i16++) {
            char cCharAt = str.charAt(i16);
            if (cCharAt == ' ') {
                z15 = false;
                z17 = true;
            } else if (cCharAt != 'E' && cCharAt != 'e') {
                switch (cCharAt) {
                    case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                        z15 = false;
                        z17 = true;
                        break;
                    case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                        if (i16 == i15 || z15) {
                            z15 = false;
                        } else {
                            aVar.f216819b = true;
                            z15 = false;
                            z17 = true;
                        }
                        break;
                    case '.':
                        if (z16) {
                            aVar.f216819b = true;
                            z15 = false;
                            z17 = true;
                        } else {
                            z15 = false;
                            z16 = true;
                        }
                        break;
                    default:
                        z15 = false;
                        break;
                }
            } else {
                z15 = true;
            }
            if (z17) {
                aVar.f216818a = i16;
            }
        }
        aVar.f216818a = i16;
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i15 = 1;
            int i16 = 0;
            while (i15 < length) {
                g(str, i15, aVar);
                int i17 = aVar.f216818a;
                if (i15 < i17) {
                    fArr[i16] = Float.parseFloat(str.substring(i15, i17));
                    i16++;
                }
                i15 = aVar.f216819b ? i17 : i17 + 1;
            }
            return c(fArr, 0, i16);
        } catch (NumberFormatException e15) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e15);
        }
    }

    private static int i(String str, int i15) {
        while (i15 < str.length()) {
            char cCharAt = str.charAt(i15);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i15++;
        }
        return i15;
    }

    public static void j(b[] bVarArr, Path path) {
        float[] fArr = new float[6];
        char c15 = 'm';
        for (b bVar : bVarArr) {
            b.e(path, fArr, c15, bVar.f216820a, bVar.f216821b);
            c15 = bVar.f216820a;
        }
    }

    public static void k(b[] bVarArr, b[] bVarArr2) {
        for (int i15 = 0; i15 < bVarArr2.length; i15++) {
            bVarArr[i15].f216820a = bVarArr2[i15].f216820a;
            for (int i16 = 0; i16 < bVarArr2[i15].f216821b.length; i16++) {
                bVarArr[i15].f216821b[i16] = bVarArr2[i15].f216821b[i16];
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private char f216820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f216821b;

        b(char c15, float[] fArr) {
            this.f216820a = c15;
            this.f216821b = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void e(Path path, float[] fArr, char c15, char c16, float[] fArr2) {
            int i15;
            int i16;
            boolean z15;
            boolean z16;
            char c17;
            char c18;
            int i17;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f25;
            float f26;
            float f27;
            float f28;
            float f29;
            float f35;
            float f36;
            float f37;
            Path path2 = path;
            boolean z17 = false;
            float f38 = fArr[0];
            boolean z18 = true;
            float f39 = fArr[1];
            char c19 = 2;
            float f45 = fArr[2];
            char c25 = 3;
            float f46 = fArr[3];
            float f47 = fArr[4];
            float f48 = fArr[5];
            switch (c16) {
                case 'A':
                case 'a':
                    i15 = 7;
                    i16 = i15;
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                case 'c':
                    i15 = 6;
                    i16 = i15;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i16 = 1;
                    break;
                case 'L':
                case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i16 = 2;
                    break;
                case EACTags.ANSWER_TO_RESET /* 81 */:
                case 'S':
                case 'q':
                case 's':
                    i16 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f47, f48);
                    f38 = f47;
                    f45 = f38;
                    f39 = f48;
                    f46 = f39;
                    i16 = 2;
                    break;
            }
            float f49 = f38;
            float f55 = f39;
            float f56 = f47;
            float f57 = f48;
            int i18 = 0;
            char c26 = c15;
            while (i18 < fArr2.length) {
                if (c16 == 'A') {
                    z15 = z17;
                    z16 = z18;
                    c17 = c19;
                    c18 = c25;
                    i17 = i18;
                    int i19 = i17 + 5;
                    int i25 = i17 + 6;
                    g(path, f49, f55, fArr2[i19], fArr2[i25], fArr2[i17], fArr2[i17 + 1], fArr2[i17 + 2], fArr2[i17 + 3] != 0.0f ? z16 : z15, fArr2[i17 + 4] != 0 ? z16 : z15);
                    f45 = fArr2[i19];
                    f49 = f45;
                    f46 = fArr2[i25];
                    f55 = f46;
                } else if (c16 == 'C') {
                    z15 = z17;
                    z16 = z18;
                    c17 = c19;
                    c18 = c25;
                    i17 = i18;
                    int i26 = i17 + 2;
                    int i27 = i17 + 3;
                    int i28 = i17 + 4;
                    int i29 = i17 + 5;
                    path2.cubicTo(fArr2[i17], fArr2[i17 + 1], fArr2[i26], fArr2[i27], fArr2[i28], fArr2[i29]);
                    float f58 = fArr2[i28];
                    float f59 = fArr2[i29];
                    float f65 = fArr2[i26];
                    float f66 = fArr2[i27];
                    f49 = f58;
                    f55 = f59;
                    f46 = f66;
                    f45 = f65;
                } else if (c16 != 'H') {
                    if (c16 != 'Q') {
                        z15 = z17;
                        if (c16 == 'V') {
                            z16 = z18;
                            c17 = c19;
                            c18 = c25;
                            i17 = i18;
                            path2.lineTo(f49, fArr2[i17]);
                            f17 = fArr2[i17];
                        } else if (c16 != 'a') {
                            if (c16 != 'c') {
                                z16 = z18;
                                if (c16 != 'h') {
                                    if (c16 != 'q') {
                                        c17 = c19;
                                        if (c16 != 'v') {
                                            if (c16 != 'L') {
                                                if (c16 != 'M') {
                                                    c18 = c25;
                                                    if (c16 == 'S') {
                                                        if (c26 == 'c' || c26 == 's' || c26 == 'C' || c26 == 'S') {
                                                            f49 = (f49 * 2.0f) - f45;
                                                            f55 = (f55 * 2.0f) - f46;
                                                        }
                                                        float f67 = f49;
                                                        float f68 = f55;
                                                        int i35 = i18 + 1;
                                                        int i36 = i18 + 2;
                                                        int i37 = i18 + 3;
                                                        path2.cubicTo(f67, f68, fArr2[i18], fArr2[i35], fArr2[i36], fArr2[i37]);
                                                        f15 = fArr2[i18];
                                                        f16 = fArr2[i35];
                                                        f49 = fArr2[i36];
                                                        f55 = fArr2[i37];
                                                        i17 = i18;
                                                    } else if (c16 == 'T') {
                                                        if (c26 == 'q' || c26 == 't' || c26 == 'Q' || c26 == 'T') {
                                                            f49 = (f49 * 2.0f) - f45;
                                                            f55 = (f55 * 2.0f) - f46;
                                                        }
                                                        int i38 = i18 + 1;
                                                        path2.quadTo(f49, f55, fArr2[i18], fArr2[i38]);
                                                        float f69 = fArr2[i18];
                                                        f17 = fArr2[i38];
                                                        f45 = f49;
                                                        f46 = f55;
                                                        i17 = i18;
                                                        f49 = f69;
                                                    } else if (c16 == 'l') {
                                                        int i39 = i18 + 1;
                                                        path2.rLineTo(fArr2[i18], fArr2[i39]);
                                                        f49 += fArr2[i18];
                                                        f26 = fArr2[i39];
                                                    } else if (c16 == 'm') {
                                                        float f75 = fArr2[i18];
                                                        f49 += f75;
                                                        float f76 = fArr2[i18 + 1];
                                                        f55 += f76;
                                                        if (i18 > 0) {
                                                            path2.rLineTo(f75, f76);
                                                        } else {
                                                            path2.rMoveTo(f75, f76);
                                                            f56 = f49;
                                                        }
                                                    } else if (c16 == 's') {
                                                        if (c26 == 'c' || c26 == 's' || c26 == 'C' || c26 == 'S') {
                                                            f29 = f55 - f46;
                                                            f35 = f49 - f45;
                                                        } else {
                                                            f35 = 0.0f;
                                                            f29 = 0.0f;
                                                        }
                                                        int i45 = i18 + 1;
                                                        int i46 = i18 + 2;
                                                        int i47 = i18 + 3;
                                                        path2.rCubicTo(f35, f29, fArr2[i18], fArr2[i45], fArr2[i46], fArr2[i47]);
                                                        f18 = fArr2[i18] + f49;
                                                        f19 = fArr2[i45] + f55;
                                                        f49 += fArr2[i46];
                                                        f25 = fArr2[i47];
                                                    } else if (c16 == 't') {
                                                        if (c26 == 'q' || c26 == 't' || c26 == 'Q' || c26 == 'T') {
                                                            f36 = f49 - f45;
                                                            f37 = f55 - f46;
                                                        } else {
                                                            f37 = 0.0f;
                                                            f36 = 0.0f;
                                                        }
                                                        int i48 = i18 + 1;
                                                        path2.rQuadTo(f36, f37, fArr2[i18], fArr2[i48]);
                                                        float f77 = f36 + f49;
                                                        float f78 = f37 + f55;
                                                        f49 += fArr2[i18];
                                                        f55 += fArr2[i48];
                                                        f46 = f78;
                                                        f45 = f77;
                                                    }
                                                } else {
                                                    c18 = c25;
                                                    f27 = fArr2[i18];
                                                    f28 = fArr2[i18 + 1];
                                                    if (i18 > 0) {
                                                        path2.lineTo(f27, f28);
                                                    } else {
                                                        path2.moveTo(f27, f28);
                                                        f49 = f27;
                                                        f56 = f49;
                                                        f55 = f28;
                                                    }
                                                }
                                                f57 = f55;
                                            } else {
                                                c18 = c25;
                                                int i49 = i18 + 1;
                                                path2.lineTo(fArr2[i18], fArr2[i49]);
                                                f27 = fArr2[i18];
                                                f28 = fArr2[i49];
                                            }
                                            f49 = f27;
                                            f55 = f28;
                                        } else {
                                            c18 = c25;
                                            path2.rLineTo(0.0f, fArr2[i18]);
                                            f26 = fArr2[i18];
                                        }
                                        f55 += f26;
                                    } else {
                                        c17 = c19;
                                        c18 = c25;
                                        int i55 = i18 + 1;
                                        int i56 = i18 + 2;
                                        int i57 = i18 + 3;
                                        path2.rQuadTo(fArr2[i18], fArr2[i55], fArr2[i56], fArr2[i57]);
                                        f18 = fArr2[i18] + f49;
                                        f19 = fArr2[i55] + f55;
                                        f49 += fArr2[i56];
                                        f25 = fArr2[i57];
                                    }
                                    f55 += f25;
                                    f45 = f18;
                                    f46 = f19;
                                } else {
                                    c17 = c19;
                                    c18 = c25;
                                    path2.rLineTo(fArr2[i18], 0.0f);
                                    f49 += fArr2[i18];
                                }
                            } else {
                                z16 = z18;
                                c17 = c19;
                                c18 = c25;
                                int i58 = i18 + 2;
                                int i59 = i18 + 3;
                                int i65 = i18 + 4;
                                int i66 = i18 + 5;
                                path2.rCubicTo(fArr2[i18], fArr2[i18 + 1], fArr2[i58], fArr2[i59], fArr2[i65], fArr2[i66]);
                                float f79 = fArr2[i58] + f49;
                                float f85 = fArr2[i59] + f55;
                                f49 += fArr2[i65];
                                f55 += fArr2[i66];
                                f45 = f79;
                                f46 = f85;
                            }
                            i17 = i18;
                        } else {
                            z16 = z18;
                            c17 = c19;
                            c18 = c25;
                            int i67 = i18 + 5;
                            int i68 = i18 + 6;
                            i17 = i18;
                            float f86 = f49;
                            g(path, f86, f55, fArr2[i67] + f49, fArr2[i68] + f55, fArr2[i18], fArr2[i18 + 1], fArr2[i18 + 2], fArr2[i18 + 3] != 0.0f ? z16 : z15, fArr2[i18 + 4] != 0 ? z16 : z15);
                            f49 = f86 + fArr2[i67];
                            f55 += fArr2[i68];
                            f45 = f49;
                            f46 = f55;
                        }
                        f55 = f17;
                    } else {
                        z15 = z17;
                        z16 = z18;
                        c17 = c19;
                        c18 = c25;
                        i17 = i18;
                        int i69 = i17 + 1;
                        int i75 = i17 + 2;
                        int i76 = i17 + 3;
                        path2.quadTo(fArr2[i17], fArr2[i69], fArr2[i75], fArr2[i76]);
                        f15 = fArr2[i17];
                        f16 = fArr2[i69];
                        f49 = fArr2[i75];
                        f55 = fArr2[i76];
                    }
                    f45 = f15;
                    f46 = f16;
                } else {
                    z15 = z17;
                    z16 = z18;
                    c17 = c19;
                    c18 = c25;
                    i17 = i18;
                    path2.lineTo(fArr2[i17], f55);
                    f49 = fArr2[i17];
                }
                i18 = i17 + i16;
                path2 = path;
                c26 = c16;
                z17 = z15;
                z18 = z16;
                c19 = c17;
                c25 = c18;
            }
            fArr[z17 ? 1 : 0] = f49;
            fArr[z18 ? 1 : 0] = f55;
            fArr[c19] = f45;
            fArr[c25] = f46;
            fArr[4] = f56;
            fArr[5] = f57;
        }

        private static void f(Path path, double d15, double d16, double d17, double d18, double d19, double d25, double d26, double d27, double d28) {
            double d29 = d17;
            int iCeil = (int) Math.ceil(Math.abs((d28 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d26);
            double dSin = Math.sin(d26);
            double dCos2 = Math.cos(d27);
            double dSin2 = Math.sin(d27);
            double d35 = -d29;
            double d36 = d35 * dCos;
            double d37 = d18 * dSin;
            double d38 = (d36 * dSin2) - (d37 * dCos2);
            double d39 = d35 * dSin;
            double d45 = d18 * dCos;
            double d46 = (dSin2 * d39) + (dCos2 * d45);
            double d47 = d28 / ((double) iCeil);
            double d48 = d46;
            double d49 = d38;
            int i15 = 0;
            double d55 = d19;
            double d56 = d25;
            double d57 = d27;
            while (i15 < iCeil) {
                double d58 = d57 + d47;
                double dSin3 = Math.sin(d58);
                double dCos3 = Math.cos(d58);
                double d59 = (d15 + ((d29 * dCos) * dCos3)) - (d37 * dSin3);
                int i16 = i15;
                double d65 = d16 + (d17 * dSin * dCos3) + (d45 * dSin3);
                double d66 = (d36 * dSin3) - (d37 * dCos3);
                double d67 = (dSin3 * d39) + (dCos3 * d45);
                double d68 = d58 - d57;
                double dTan = Math.tan(d68 / 2.0d);
                double dSin4 = (Math.sin(d68) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d69 = d55 + (d49 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d69, (float) (d56 + (d48 * dSin4)), (float) (d59 - (dSin4 * d66)), (float) (d65 - (dSin4 * d67)), (float) d59, (float) d65);
                dSin = dSin;
                d47 = d47;
                d55 = d59;
                d39 = d39;
                d57 = d58;
                d48 = d67;
                dCos = dCos;
                d29 = d17;
                d56 = d65;
                i15 = i16 + 1;
                iCeil = iCeil;
                d49 = d66;
            }
        }

        private static void g(Path path, float f15, float f16, float f17, float f18, float f19, float f25, float f26, boolean z15, boolean z16) {
            double d15;
            double d16;
            double radians = Math.toRadians(f26);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d17 = f15;
            double d18 = f16;
            double d19 = f19;
            double d25 = ((d17 * dCos) + (d18 * dSin)) / d19;
            double d26 = f25;
            double d27 = ((((double) (-f15)) * dSin) + (d18 * dCos)) / d26;
            double d28 = f18;
            double d29 = ((((double) f17) * dCos) + (d28 * dSin)) / d19;
            double d35 = ((((double) (-f17)) * dSin) + (d28 * dCos)) / d26;
            double d36 = d25 - d29;
            double d37 = d27 - d35;
            double d38 = (d25 + d29) / 2.0d;
            double d39 = (d27 + d35) / 2.0d;
            double d45 = (d36 * d36) + (d37 * d37);
            if (d45 == 0.0d) {
                c2.g("PathParser", " Points are coincident");
                return;
            }
            double d46 = (1.0d / d45) - 0.25d;
            if (d46 < 0.0d) {
                c2.g("PathParser", "Points are too far apart " + d45);
                float fSqrt = (float) (Math.sqrt(d45) / 1.99999d);
                g(path, f15, f16, f17, f18, f19 * fSqrt, fSqrt * f25, f26, z15, z16);
                return;
            }
            double dSqrt = Math.sqrt(d46);
            double d47 = d36 * dSqrt;
            double d48 = dSqrt * d37;
            if (z15 == z16) {
                d15 = d38 - d48;
                d16 = d39 + d47;
            } else {
                d15 = d38 + d48;
                d16 = d39 - d47;
            }
            double dAtan2 = Math.atan2(d27 - d16, d25 - d15);
            double dAtan3 = Math.atan2(d35 - d16, d29 - d15) - dAtan2;
            if (z16 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d49 = d15 * d19;
            double d55 = d16 * d26;
            f(path, (d49 * dCos) - (d55 * dSin), (d49 * dSin) + (d55 * dCos), d19, d26, d17, d18, radians, dAtan2, dAtan3);
        }

        @Deprecated
        public static void h(b[] bVarArr, Path path) {
            j.j(bVarArr, path);
        }

        b(b bVar) {
            this.f216820a = bVar.f216820a;
            float[] fArr = bVar.f216821b;
            this.f216821b = j.c(fArr, 0, fArr.length);
        }
    }
}
