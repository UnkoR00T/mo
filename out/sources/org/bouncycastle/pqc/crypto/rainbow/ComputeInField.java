package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
class ComputeInField {
    private void gaussElim(short[][] sArr) {
        int i15 = 0;
        while (i15 < sArr.length) {
            int i16 = i15 + 1;
            for (int i17 = i16; i17 < sArr.length; i17++) {
                if (sArr[i15][i15] == 0) {
                    for (int i18 = i15; i18 < sArr[0].length; i18++) {
                        short[] sArr2 = sArr[i15];
                        sArr2[i18] = GF2Field.addElem(sArr2[i18], sArr[i17][i18]);
                    }
                }
            }
            short sInvElem = GF2Field.invElem(sArr[i15][i15]);
            if (sInvElem == 0) {
                throw new RuntimeException("The matrix is not invertible");
            }
            sArr[i15] = multVect(sInvElem, sArr[i15]);
            for (int i19 = 0; i19 < sArr.length; i19++) {
                if (i15 != i19) {
                    short s15 = sArr[i19][i15];
                    for (int i25 = i15; i25 < sArr[0].length; i25++) {
                        short sMultElem = GF2Field.multElem(sArr[i15][i25], s15);
                        short[] sArr3 = sArr[i19];
                        sArr3[i25] = GF2Field.addElem(sArr3[i25], sMultElem);
                    }
                }
            }
            i15 = i16;
        }
    }

    public short[][] addMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length == sArr2.length) {
            short[] sArr3 = sArr[0];
            if (sArr3.length == sArr2[0].length) {
                short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr3.length);
                for (int i15 = 0; i15 < sArr.length; i15++) {
                    for (int i16 = 0; i16 < sArr[0].length; i16++) {
                        sArr4[i15][i16] = GF2Field.addElem(sArr[i15][i16], sArr2[i15][i16]);
                    }
                }
                return sArr4;
            }
        }
        throw new RuntimeException("Addition is not possible!");
    }

    public short[][] addMatrixTranspose(short[][] sArr) {
        if (sArr.length == sArr[0].length) {
            return addMatrix(sArr, transpose(sArr));
        }
        throw new RuntimeException("Addition is not possible!");
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Addition is not possible! vector1.length: " + sArr.length + " vector2.length: " + sArr2.length);
        }
        int length = sArr.length;
        short[] sArr3 = new short[length];
        for (int i15 = 0; i15 < length; i15++) {
            sArr3[i15] = GF2Field.addElem(sArr[i15], sArr2[i15]);
        }
        return sArr3;
    }

    public short[][] inverse(short[][] sArr) {
        Class cls = Short.TYPE;
        if (sArr.length != sArr[0].length) {
            throw new RuntimeException("The matrix is not invertible. Please choose another one!");
        }
        try {
            short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) cls, sArr.length, sArr.length * 2);
            for (int i15 = 0; i15 < sArr.length; i15++) {
                System.arraycopy(sArr[i15], 0, sArr2[i15], 0, sArr.length);
                for (int length = sArr.length; length < sArr.length * 2; length++) {
                    sArr2[i15][length] = 0;
                }
                sArr2[i15][sArr2.length + i15] = 1;
            }
            gaussElim(sArr2);
            short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) cls, sArr2.length, sArr2.length);
            for (int i16 = 0; i16 < sArr2.length; i16++) {
                for (int length2 = sArr2.length; length2 < sArr2.length * 2; length2++) {
                    sArr3[i16][length2 - sArr2.length] = sArr2[i16][length2];
                }
            }
            return sArr3;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multMatrix(short s15, short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr[0].length);
        for (int i15 = 0; i15 < sArr.length; i15++) {
            for (int i16 = 0; i16 < sArr[0].length; i16++) {
                sArr2[i15][i16] = GF2Field.multElem(s15, sArr[i15][i16]);
            }
        }
        return sArr2;
    }

    public short[] multVect(short s15, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i15 = 0; i15 < length; i15++) {
            sArr2[i15] = GF2Field.multElem(s15, sArr[i15]);
        }
        return sArr2;
    }

    public short[][] multVects(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2.length);
        for (int i15 = 0; i15 < sArr.length; i15++) {
            for (int i16 = 0; i16 < sArr2.length; i16++) {
                sArr3[i15][i16] = GF2Field.multElem(sArr[i15], sArr2[i16]);
            }
        }
        return sArr3;
    }

    public short[] multiplyMatrix(short[][] sArr, short[] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[] sArr3 = new short[sArr.length];
        for (int i15 = 0; i15 < sArr.length; i15++) {
            for (int i16 = 0; i16 < sArr2.length; i16++) {
                sArr3[i15] = GF2Field.addElem(sArr3[i15], GF2Field.multElem(sArr[i15][i16], sArr2[i16]));
            }
        }
        return sArr3;
    }

    public short multiplyMatrix_quad(short[][] sArr, short[] sArr2) {
        int length = sArr.length;
        short[] sArr3 = sArr[0];
        if (length != sArr3.length || sArr3.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[] sArr4 = new short[sArr.length];
        short sAddElem = 0;
        for (int i15 = 0; i15 < sArr.length; i15++) {
            for (int i16 = 0; i16 < sArr2.length; i16++) {
                sArr4[i15] = GF2Field.addElem(sArr4[i15], GF2Field.multElem(sArr[i15][i16], sArr2[i16]));
            }
            sAddElem = GF2Field.addElem(sAddElem, GF2Field.multElem(sArr4[i15], sArr2[i15]));
        }
        return sAddElem;
    }

    public short[][][] obfuscate_l1_polys(short[][] sArr, short[][][] sArr2, short[][][] sArr3) {
        short[][] sArr4 = sArr2[0];
        int length = sArr4.length;
        short[][] sArr5 = sArr3[0];
        if (length == sArr5.length) {
            int length2 = sArr4[0].length;
            short[] sArr6 = sArr5[0];
            if (length2 == sArr6.length && sArr2.length == sArr[0].length && sArr3.length == sArr.length) {
                short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, sArr3.length, sArr5.length, sArr6.length);
                for (int i15 = 0; i15 < sArr2[0].length; i15++) {
                    for (int i16 = 0; i16 < sArr2[0][0].length; i16++) {
                        for (int i17 = 0; i17 < sArr.length; i17++) {
                            for (int i18 = 0; i18 < sArr[0].length; i18++) {
                                short sMultElem = GF2Field.multElem(sArr[i17][i18], sArr2[i18][i15][i16]);
                                short[] sArr8 = sArr7[i17][i15];
                                sArr8[i16] = GF2Field.addElem(sArr8[i16], sMultElem);
                            }
                            short[] sArr9 = sArr7[i17][i15];
                            sArr9[i16] = GF2Field.addElem(sArr3[i17][i15][i16], sArr9[i16]);
                        }
                    }
                }
                return sArr7;
            }
        }
        throw new RuntimeException("Multiplication not possible!");
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return null;
        }
        try {
            short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length + 1);
            short[] sArr4 = new short[sArr.length];
            for (int i15 = 0; i15 < sArr.length; i15++) {
                System.arraycopy(sArr[i15], 0, sArr3[i15], 0, sArr[0].length);
                short[] sArr5 = sArr3[i15];
                sArr5[sArr2.length] = GF2Field.addElem(sArr2[i15], sArr5[sArr2.length]);
            }
            gaussElim(sArr3);
            for (int i16 = 0; i16 < sArr3.length; i16++) {
                sArr4[i16] = sArr3[i16][sArr2.length];
            }
            return sArr4;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] to_UT(short[][] sArr) {
        if (sArr.length != sArr[0].length) {
            throw new RuntimeException("Computation to upper triangular matrix is not possible!");
        }
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length);
        int i15 = 0;
        while (i15 < sArr.length) {
            sArr2[i15][i15] = sArr[i15][i15];
            int i16 = i15 + 1;
            for (int i17 = i16; i17 < sArr[0].length; i17++) {
                sArr2[i15][i17] = GF2Field.addElem(sArr[i15][i17], sArr[i17][i15]);
            }
            i15 = i16;
        }
        return sArr2;
    }

    public short[][] transpose(short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr[0].length, sArr.length);
        for (int i15 = 0; i15 < sArr.length; i15++) {
            for (int i16 = 0; i16 < sArr[0].length; i16++) {
                sArr2[i16][i15] = sArr[i15][i16];
            }
        }
        return sArr2;
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i15 = 0; i15 < sArr.length; i15++) {
            for (int i16 = 0; i16 < sArr2.length; i16++) {
                for (int i17 = 0; i17 < sArr2[0].length; i17++) {
                    short sMultElem = GF2Field.multElem(sArr[i15][i16], sArr2[i16][i17]);
                    short[] sArr4 = sArr3[i15];
                    sArr4[i17] = GF2Field.addElem(sArr4[i17], sMultElem);
                }
            }
        }
        return sArr3;
    }
}
