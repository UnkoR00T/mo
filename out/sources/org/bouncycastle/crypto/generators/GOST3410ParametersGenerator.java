package org.bouncycastle.crypto.generators;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410ValidationParameters;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes5.dex */
public class GOST3410ParametersGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private SecureRandom init_random;
    private int size;
    private int typeproc;

    private int procedure_A(int i15, int i16, BigInteger[] bigIntegerArr, int i17) {
        int i18;
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        int i19;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        int iNextInt = i15;
        while (true) {
            if (iNextInt >= 0 && iNextInt <= 65536) {
                break;
            }
            iNextInt = this.init_random.nextInt() / 32768;
        }
        int iNextInt2 = i16;
        while (true) {
            i18 = 1;
            if (iNextInt2 >= 0 && iNextInt2 <= 65536 && iNextInt2 / 2 != 0) {
                break;
            }
            iNextInt2 = (this.init_random.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger4 = new BigInteger(Integer.toString(iNextInt2));
        BigInteger bigInteger5 = new BigInteger("19381");
        BigInteger bigInteger6 = new BigInteger(Integer.toString(iNextInt));
        int i25 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger6};
        int[] iArr = {i17};
        int i26 = 0;
        int i27 = 0;
        while (iArr[i26] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i27 = i26 + 1;
            iArr[i27] = iArr[i26] / 2;
            i26 = i27;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i27 + 1];
        int i28 = 16;
        bigIntegerArr4[i27] = new BigInteger("8003", 16);
        int i29 = i27 - 1;
        int i35 = 0;
        while (i35 < i27) {
            int i36 = iArr[i29] / i28;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i25, bigIntegerArr5, i25, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i36 + 1];
                System.arraycopy(bigIntegerArr5, i25, bigIntegerArr2, i25, length2);
                int i37 = i25;
                while (i37 < i36) {
                    int i38 = i37 + 1;
                    bigIntegerArr2[i38] = bigIntegerArr2[i37].multiply(bigInteger5).add(bigInteger4).mod(TWO.pow(i28));
                    i37 = i38;
                }
                BigInteger bigInteger7 = new BigInteger(d.f37012h1);
                int i39 = i25;
                while (i39 < i36) {
                    bigInteger7 = bigInteger7.add(bigIntegerArr2[i39].multiply(TWO.pow(i39 * 16)));
                    i39++;
                    i25 = i25;
                }
                i19 = i25;
                bigIntegerArr2[i19] = bigIntegerArr2[i36];
                BigInteger bigInteger8 = TWO;
                int i45 = i29 + 1;
                BigInteger bigIntegerAdd = bigInteger8.pow(iArr[i29] - i18).divide(bigIntegerArr4[i45]).add(bigInteger8.pow(iArr[i29] - i18).multiply(bigInteger7).divide(bigIntegerArr4[i45].multiply(bigInteger8.pow(i36 * 16))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger8);
                BigInteger bigInteger9 = ONE;
                if (bigIntegerMod.compareTo(bigInteger9) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger9);
                }
                BigInteger bigInteger10 = bigIntegerAdd;
                int i46 = i19;
                while (true) {
                    bigInteger2 = bigInteger4;
                    bigInteger3 = bigInteger5;
                    long j15 = i46;
                    BigInteger bigIntegerMultiply = bigIntegerArr4[i45].multiply(bigInteger10.add(BigInteger.valueOf(j15)));
                    BigInteger bigInteger11 = ONE;
                    BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger11);
                    bigIntegerArr4[i29] = bigIntegerAdd2;
                    BigInteger bigInteger12 = TWO;
                    int i47 = i46;
                    if (bigIntegerAdd2.compareTo(bigInteger12.pow(iArr[i29])) != 1) {
                        if (bigInteger12.modPow(bigIntegerArr4[i45].multiply(bigInteger10.add(BigInteger.valueOf(j15))), bigIntegerArr4[i29]).compareTo(bigInteger11) == 0 && bigInteger12.modPow(bigInteger10.add(BigInteger.valueOf(j15)), bigIntegerArr4[i29]).compareTo(bigInteger11) != 0) {
                            break;
                        }
                        i46 = i47 + 2;
                        bigInteger4 = bigInteger2;
                        bigInteger5 = bigInteger3;
                    } else {
                        i25 = i19;
                        i18 = 1;
                        bigInteger4 = bigInteger2;
                        bigInteger5 = bigInteger3;
                        bigIntegerArr3 = bigIntegerArr2;
                        i28 = 16;
                    }
                }
            }
            i29--;
            if (i29 < 0) {
                bigIntegerArr[i19] = bigIntegerArr4[i19];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[i19];
                return bigInteger.intValue();
            }
            i35++;
            i25 = i19;
            bigInteger4 = bigInteger2;
            bigInteger5 = bigInteger3;
            bigIntegerArr3 = bigIntegerArr2;
            i18 = 1;
            i28 = 16;
        }
        bigInteger = bigIntegerArr3[i25];
        return bigInteger.intValue();
    }

    private long procedure_Aa(long j15, long j16, BigInteger[] bigIntegerArr, int i15) {
        int i16;
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        int i17;
        int[] iArr;
        BigInteger bigInteger2;
        long jNextInt = j15;
        while (true) {
            if (jNextInt >= 0 && jNextInt <= 4294967296L) {
                break;
            }
            jNextInt = this.init_random.nextInt() * 2;
        }
        long jNextInt2 = j16;
        while (true) {
            i16 = 1;
            if (jNextInt2 >= 0 && jNextInt2 <= 4294967296L && jNextInt2 / 2 != 0) {
                break;
            }
            jNextInt2 = (this.init_random.nextInt() * 2) + 1;
        }
        BigInteger bigInteger3 = new BigInteger(Long.toString(jNextInt2));
        BigInteger bigInteger4 = new BigInteger("97781173");
        BigInteger bigInteger5 = new BigInteger(Long.toString(jNextInt));
        int i18 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger5};
        int[] iArr2 = {i15};
        int i19 = 0;
        int i25 = 0;
        while (iArr2[i19] >= 33) {
            int length = iArr2.length + 1;
            int[] iArr3 = new int[length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr2 = new int[length];
            System.arraycopy(iArr3, 0, iArr2, 0, length);
            i25 = i19 + 1;
            iArr2[i25] = iArr2[i19] / 2;
            i19 = i25;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i25 + 1];
        bigIntegerArr4[i25] = new BigInteger("8000000B", 16);
        int i26 = i25 - 1;
        int i27 = 0;
        while (i27 < i25) {
            int i28 = 32;
            int i29 = iArr2[i26] / 32;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i18, bigIntegerArr5, i18, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i29 + 1];
                System.arraycopy(bigIntegerArr5, i18, bigIntegerArr2, i18, length2);
                int i35 = i18;
                while (i35 < i29) {
                    int i36 = i35 + 1;
                    bigIntegerArr2[i36] = bigIntegerArr2[i35].multiply(bigInteger4).add(bigInteger3).mod(TWO.pow(i28));
                    i35 = i36;
                }
                BigInteger bigInteger6 = new BigInteger(d.f37012h1);
                int i37 = i18;
                while (i37 < i29) {
                    bigInteger6 = bigInteger6.add(bigIntegerArr2[i37].multiply(TWO.pow(i37 * 32)));
                    i37++;
                    i18 = i18;
                }
                i17 = i18;
                bigIntegerArr2[i17] = bigIntegerArr2[i29];
                BigInteger bigInteger7 = TWO;
                int i38 = i26 + 1;
                BigInteger bigIntegerAdd = bigInteger7.pow(iArr2[i26] - i16).divide(bigIntegerArr4[i38]).add(bigInteger7.pow(iArr2[i26] - i16).multiply(bigInteger6).divide(bigIntegerArr4[i38].multiply(bigInteger7.pow(i29 * 32))));
                BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger7);
                BigInteger bigInteger8 = ONE;
                if (bigIntegerMod.compareTo(bigInteger8) == 0) {
                    bigIntegerAdd = bigIntegerAdd.add(bigInteger8);
                }
                BigInteger bigInteger9 = bigIntegerAdd;
                int i39 = i17;
                while (true) {
                    iArr = iArr2;
                    bigInteger2 = bigInteger3;
                    long j17 = i39;
                    BigInteger bigIntegerMultiply = bigIntegerArr4[i38].multiply(bigInteger9.add(BigInteger.valueOf(j17)));
                    BigInteger bigInteger10 = ONE;
                    BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger10);
                    bigIntegerArr4[i26] = bigIntegerAdd2;
                    BigInteger bigInteger11 = TWO;
                    if (bigIntegerAdd2.compareTo(bigInteger11.pow(iArr[i26])) != 1) {
                        if (bigInteger11.modPow(bigIntegerArr4[i38].multiply(bigInteger9.add(BigInteger.valueOf(j17))), bigIntegerArr4[i26]).compareTo(bigInteger10) == 0 && bigInteger11.modPow(bigInteger9.add(BigInteger.valueOf(j17)), bigIntegerArr4[i26]).compareTo(bigInteger10) != 0) {
                            break;
                        }
                        i39 += 2;
                        bigInteger3 = bigInteger2;
                        iArr2 = iArr;
                    } else {
                        i18 = i17;
                        iArr2 = iArr;
                        i16 = 1;
                        bigIntegerArr3 = bigIntegerArr2;
                        i28 = 32;
                        bigInteger3 = bigInteger2;
                    }
                }
            }
            i26--;
            if (i26 < 0) {
                bigIntegerArr[i17] = bigIntegerArr4[i17];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[i17];
                return bigInteger.longValue();
            }
            i27++;
            i18 = i17;
            bigInteger3 = bigInteger2;
            iArr2 = iArr;
            bigIntegerArr3 = bigIntegerArr2;
            i16 = 1;
        }
        bigInteger = bigIntegerArr3[i18];
        return bigInteger.longValue();
    }

    private void procedure_B(int i15, int i16, BigInteger[] bigIntegerArr) {
        int i17;
        int i18;
        int iNextInt = i15;
        while (true) {
            if (iNextInt >= 0 && iNextInt <= 65536) {
                break;
            } else {
                iNextInt = this.init_random.nextInt() / 32768;
            }
        }
        int iNextInt2 = i16;
        while (true) {
            i17 = 1;
            if (iNextInt2 >= 0 && iNextInt2 <= 65536 && iNextInt2 / 2 != 0) {
                break;
            } else {
                iNextInt2 = (this.init_random.nextInt() / 32768) + 1;
            }
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Integer.toString(iNextInt2));
        BigInteger bigInteger2 = new BigInteger("19381");
        int iProcedure_A = procedure_A(iNextInt, iNextInt2, bigIntegerArr2, 256);
        int i19 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        int iProcedure_A2 = procedure_A(iProcedure_A, iNextInt2, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[65];
        bigIntegerArr3[0] = new BigInteger(Integer.toString(iProcedure_A2));
        while (true) {
            int i25 = i19;
            while (i25 < 64) {
                int i26 = i25 + 1;
                bigIntegerArr3[i26] = bigIntegerArr3[i25].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(16));
                i25 = i26;
            }
            BigInteger bigInteger5 = new BigInteger(d.f37012h1);
            for (int i27 = i19; i27 < 64; i27++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i27].multiply(TWO.pow(i27 * 16)));
            }
            bigIntegerArr3[i19] = bigIntegerArr3[64];
            BigInteger bigInteger6 = TWO;
            BigInteger bigIntegerAdd = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (bigIntegerMod.compareTo(bigInteger7) == 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigInteger7);
            }
            BigInteger bigInteger8 = bigIntegerAdd;
            int i28 = i19;
            while (true) {
                long j15 = i28;
                BigInteger bigIntegerMultiply = bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j15)));
                BigInteger bigInteger9 = ONE;
                BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger9);
                BigInteger bigInteger10 = TWO;
                i18 = i19;
                if (bigIntegerAdd2.compareTo(bigInteger10.pow(1024)) == i17) {
                    break;
                }
                int i29 = i17;
                if (bigInteger10.modPow(bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j15))), bigIntegerAdd2).compareTo(bigInteger9) == 0 && bigInteger10.modPow(bigInteger3.multiply(bigInteger8.add(BigInteger.valueOf(j15))), bigIntegerAdd2).compareTo(bigInteger9) != 0) {
                    bigIntegerArr[i18] = bigIntegerAdd2;
                    bigIntegerArr[i29] = bigInteger3;
                    return;
                } else {
                    i28 += 2;
                    i19 = i18;
                    i17 = i29;
                }
            }
            i19 = i18;
        }
    }

    private void procedure_Bb(long j15, long j16, BigInteger[] bigIntegerArr) {
        int i15;
        int i16;
        long jNextInt = j15;
        while (true) {
            if (jNextInt >= 0 && jNextInt <= 4294967296L) {
                break;
            } else {
                jNextInt = this.init_random.nextInt() * 2;
            }
        }
        long jNextInt2 = j16;
        while (true) {
            i15 = 1;
            if (jNextInt2 >= 0 && jNextInt2 <= 4294967296L && jNextInt2 / 2 != 0) {
                break;
            }
            long j17 = jNextInt;
            jNextInt2 = (this.init_random.nextInt() * 2) + 1;
            jNextInt = j17;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Long.toString(jNextInt2));
        BigInteger bigInteger2 = new BigInteger("97781173");
        long jProcedure_Aa = procedure_Aa(jNextInt, jNextInt2, bigIntegerArr2, 256);
        int i17 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        long jProcedure_Aa2 = procedure_Aa(jProcedure_Aa, jNextInt2, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[33];
        bigIntegerArr3[0] = new BigInteger(Long.toString(jProcedure_Aa2));
        while (true) {
            int i18 = i17;
            while (i18 < 32) {
                int i19 = i18 + 1;
                bigIntegerArr3[i19] = bigIntegerArr3[i18].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(32));
                i18 = i19;
            }
            BigInteger bigInteger5 = new BigInteger(d.f37012h1);
            for (int i25 = i17; i25 < 32; i25++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i25].multiply(TWO.pow(i25 * 32)));
            }
            bigIntegerArr3[i17] = bigIntegerArr3[32];
            BigInteger bigInteger6 = TWO;
            BigInteger bigIntegerAdd = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger bigIntegerMod = bigIntegerAdd.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (bigIntegerMod.compareTo(bigInteger7) == 0) {
                bigIntegerAdd = bigIntegerAdd.add(bigInteger7);
            }
            int i26 = i17;
            while (true) {
                long j18 = i26;
                BigInteger bigIntegerMultiply = bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j18)));
                BigInteger bigInteger8 = ONE;
                BigInteger bigIntegerAdd2 = bigIntegerMultiply.add(bigInteger8);
                BigInteger bigInteger9 = TWO;
                i16 = i17;
                if (bigIntegerAdd2.compareTo(bigInteger9.pow(1024)) == i15) {
                    break;
                }
                int i27 = i15;
                if (bigInteger9.modPow(bigInteger3.multiply(bigInteger4).multiply(bigIntegerAdd.add(BigInteger.valueOf(j18))), bigIntegerAdd2).compareTo(bigInteger8) == 0 && bigInteger9.modPow(bigInteger3.multiply(bigIntegerAdd.add(BigInteger.valueOf(j18))), bigIntegerAdd2).compareTo(bigInteger8) != 0) {
                    bigIntegerArr[i16] = bigIntegerAdd2;
                    bigIntegerArr[i27] = bigInteger3;
                    return;
                } else {
                    i26 += 2;
                    i17 = i16;
                    i15 = i27;
                }
            }
            i17 = i16;
        }
    }

    private BigInteger procedure_C(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigIntegerSubtract = bigInteger.subtract(ONE);
        BigInteger bigIntegerDivide = bigIntegerSubtract.divide(bigInteger2);
        int iBitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(iBitLength, this.init_random);
            BigInteger bigInteger3 = ONE;
            if (bigIntegerCreateRandomBigInteger.compareTo(bigInteger3) > 0 && bigIntegerCreateRandomBigInteger.compareTo(bigIntegerSubtract) < 0) {
                BigInteger bigIntegerModPow = bigIntegerCreateRandomBigInteger.modPow(bigIntegerDivide, bigInteger);
                if (bigIntegerModPow.compareTo(bigInteger3) != 0) {
                    return bigIntegerModPow;
                }
            }
        }
    }

    public GOST3410Parameters generateParameters() {
        long j15;
        long j16;
        BigInteger[] bigIntegerArr = new BigInteger[2];
        if (this.typeproc == 1) {
            int iNextInt = this.init_random.nextInt();
            int iNextInt2 = this.init_random.nextInt();
            int i15 = this.size;
            if (i15 == 512) {
                procedure_A(iNextInt, iNextInt2, bigIntegerArr, 512);
            } else {
                if (i15 != 1024) {
                    throw new IllegalArgumentException("Ooops! key size 512 or 1024 bit.");
                }
                procedure_B(iNextInt, iNextInt2, bigIntegerArr);
            }
            BigInteger bigInteger = bigIntegerArr[0];
            BigInteger bigInteger2 = bigIntegerArr[1];
            return new GOST3410Parameters(bigInteger, bigInteger2, procedure_C(bigInteger, bigInteger2), new GOST3410ValidationParameters(iNextInt, iNextInt2));
        }
        long jNextLong = this.init_random.nextLong();
        long jNextLong2 = this.init_random.nextLong();
        int i16 = this.size;
        if (i16 == 512) {
            j15 = jNextLong;
            j16 = jNextLong2;
            procedure_Aa(j15, j16, bigIntegerArr, 512);
        } else {
            if (i16 != 1024) {
                throw new IllegalStateException("Ooops! key size 512 or 1024 bit.");
            }
            j15 = jNextLong;
            j16 = jNextLong2;
            procedure_Bb(j15, j16, bigIntegerArr);
        }
        BigInteger bigInteger3 = bigIntegerArr[0];
        BigInteger bigInteger4 = bigIntegerArr[1];
        return new GOST3410Parameters(bigInteger3, bigInteger4, procedure_C(bigInteger3, bigInteger4), new GOST3410ValidationParameters(j15, j16));
    }

    public void init(int i15, int i16, SecureRandom secureRandom) {
        this.size = i15;
        this.typeproc = i16;
        this.init_random = secureRandom;
    }
}
