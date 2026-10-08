package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class RainbowPublicMap {
    private RainbowParameters params;
    private final int num_gf_elements = 256;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private ComputeInField f149547cf = new ComputeInField();

    public RainbowPublicMap(RainbowParameters rainbowParameters) {
        this.params = rainbowParameters;
    }

    private short[] add_and_reduce(short[][] sArr) {
        int m15 = this.params.getM();
        short[] sArrAddVect = new short[m15];
        for (int i15 = 0; i15 < 8; i15++) {
            int iPow = (int) Math.pow(2.0d, i15);
            short[] sArrAddVect2 = new short[m15];
            for (int i16 = iPow; i16 < 256; i16 += iPow * 2) {
                for (int i17 = 0; i17 < iPow; i17++) {
                    sArrAddVect2 = this.f149547cf.addVect(sArrAddVect2, sArr[i16 + i17]);
                }
            }
            ComputeInField computeInField = this.f149547cf;
            sArrAddVect = computeInField.addVect(sArrAddVect, computeInField.multVect((short) iPow, sArrAddVect2));
        }
        return sArrAddVect;
    }

    private short[][] compute_accumulator(short[] sArr, short[] sArr2, short[][][] sArr3, int i15) {
        short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 256, i15);
        int length = sArr2.length;
        short[][] sArr5 = sArr3[0];
        if (length != sArr5.length || sArr.length != sArr5[0].length || sArr3.length != i15) {
            throw new RuntimeException("Accumulator calculation not possible!");
        }
        for (int i16 = 0; i16 < sArr2.length; i16++) {
            short[] sArrMultVect = this.f149547cf.multVect(sArr2[i16], sArr);
            for (int i17 = 0; i17 < sArr.length; i17++) {
                for (int i18 = 0; i18 < sArr3.length; i18++) {
                    short s15 = sArrMultVect[i17];
                    if (s15 != 0) {
                        short[] sArr6 = sArr4[s15];
                        sArr6[i18] = GF2Field.addElem(sArr6[i18], sArr3[i18][i16][i17]);
                    }
                }
            }
        }
        return sArr4;
    }

    public short[] publicMap(RainbowPublicKeyParameters rainbowPublicKeyParameters, short[] sArr) {
        return add_and_reduce(compute_accumulator(sArr, sArr, rainbowPublicKeyParameters.f149546pk, this.params.getM()));
    }

    public short[] publicMap_cyclic(RainbowPublicKeyParameters rainbowPublicKeyParameters, short[] sArr) {
        int v15 = this.params.getV1();
        int o15 = this.params.getO1();
        int o16 = this.params.getO2();
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 256, o15 + o16);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, 0, v15);
        int i15 = v15 + o15;
        short[] sArrCopyOfRange2 = Arrays.copyOfRange(sArr, v15, i15);
        short[] sArrCopyOfRange3 = Arrays.copyOfRange(sArr, i15, sArr.length);
        RainbowDRBG rainbowDRBG = new RainbowDRBG(rainbowPublicKeyParameters.pk_seed, rainbowPublicKeyParameters.getParameters().getHash_algo());
        short[][] sArrAddMatrix = this.f149547cf.addMatrix(this.f149547cf.addMatrix(this.f149547cf.addMatrix(this.f149547cf.addMatrix(this.f149547cf.addMatrix(compute_accumulator(sArrCopyOfRange, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o15, v15, v15, true), o15), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o15, v15, o15, false), o15)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange, rainbowPublicKeyParameters.l1_Q3, o15)), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange2, rainbowPublicKeyParameters.l1_Q5, o15)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange2, rainbowPublicKeyParameters.l1_Q6, o15)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange3, rainbowPublicKeyParameters.l1_Q9, o15));
        short[][] sArrAddMatrix2 = this.f149547cf.addMatrix(this.f149547cf.addMatrix(this.f149547cf.addMatrix(this.f149547cf.addMatrix(this.f149547cf.addMatrix(compute_accumulator(sArrCopyOfRange, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o16, v15, v15, true), o16), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o16, v15, o15, false), o16)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o16, v15, o16, false), o16)), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange2, RainbowUtil.generate_random(rainbowDRBG, o16, o15, o15, true), o16)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange2, RainbowUtil.generate_random(rainbowDRBG, o16, o15, o16, false), o16)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange3, rainbowPublicKeyParameters.l2_Q9, o16));
        for (int i16 = 0; i16 < 256; i16++) {
            sArr2[i16] = Arrays.concatenate(sArrAddMatrix[i16], sArrAddMatrix2[i16]);
        }
        return add_and_reduce(sArr2);
    }
}
