package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class RainbowPublicKeyParameters extends RainbowKeyParameters {
    short[][][] l1_Q3;
    short[][][] l1_Q5;
    short[][][] l1_Q6;
    short[][][] l1_Q9;
    short[][][] l2_Q9;

    /* JADX INFO: renamed from: pk, reason: collision with root package name */
    short[][][] f149546pk;
    byte[] pk_seed;

    public RainbowPublicKeyParameters(RainbowParameters rainbowParameters, byte[] bArr) {
        super(false, rainbowParameters);
        int m15 = rainbowParameters.getM();
        int n15 = rainbowParameters.getN();
        Version version = getParameters().getVersion();
        Version version2 = Version.CLASSIC;
        Class cls = Short.TYPE;
        if (version != version2) {
            this.pk_seed = Arrays.copyOfRange(bArr, 0, rainbowParameters.getLen_pkseed());
            this.l1_Q3 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getV1(), rainbowParameters.getO2());
            this.l1_Q5 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getO1(), rainbowParameters.getO1());
            this.l1_Q6 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getO1(), rainbowParameters.getO2());
            this.l1_Q9 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getO2(), rainbowParameters.getO2());
            this.l2_Q9 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO2(), rainbowParameters.getO2(), rainbowParameters.getO2());
            int len_pkseed = rainbowParameters.getLen_pkseed();
            int iLoadEncoded = len_pkseed + RainbowUtil.loadEncoded(this.l1_Q3, bArr, len_pkseed, false);
            int iLoadEncoded2 = iLoadEncoded + RainbowUtil.loadEncoded(this.l1_Q5, bArr, iLoadEncoded, true);
            int iLoadEncoded3 = iLoadEncoded2 + RainbowUtil.loadEncoded(this.l1_Q6, bArr, iLoadEncoded2, false);
            int iLoadEncoded4 = iLoadEncoded3 + RainbowUtil.loadEncoded(this.l1_Q9, bArr, iLoadEncoded3, true);
            if (iLoadEncoded4 + RainbowUtil.loadEncoded(this.l2_Q9, bArr, iLoadEncoded4, true) != bArr.length) {
                throw new IllegalArgumentException("unparsed data in key encoding");
            }
            return;
        }
        this.f149546pk = (short[][][]) Array.newInstance((Class<?>) cls, m15, n15, n15);
        int i15 = 0;
        for (int i16 = 0; i16 < n15; i16++) {
            for (int i17 = 0; i17 < n15; i17++) {
                for (int i18 = 0; i18 < m15; i18++) {
                    short[][][] sArr = this.f149546pk;
                    if (i16 > i17) {
                        sArr[i18][i16][i17] = 0;
                    } else {
                        sArr[i18][i16][i17] = (short) (bArr[i15] & 255);
                        i15++;
                    }
                }
            }
        }
    }

    public byte[] getEncoded() {
        return getParameters().getVersion() != Version.CLASSIC ? Arrays.concatenate(Arrays.concatenate(Arrays.concatenate(Arrays.concatenate(Arrays.concatenate(this.pk_seed, RainbowUtil.getEncoded(this.l1_Q3, false)), RainbowUtil.getEncoded(this.l1_Q5, true)), RainbowUtil.getEncoded(this.l1_Q6, false)), RainbowUtil.getEncoded(this.l1_Q9, true)), RainbowUtil.getEncoded(this.l2_Q9, true)) : RainbowUtil.getEncoded(this.f149546pk, true);
    }

    public short[][][] getPk() {
        return RainbowUtil.cloneArray(this.f149546pk);
    }

    RainbowPublicKeyParameters(RainbowParameters rainbowParameters, byte[] bArr, short[][][] sArr, short[][][] sArr2, short[][][] sArr3, short[][][] sArr4, short[][][] sArr5) {
        super(false, rainbowParameters);
        this.pk_seed = (byte[]) bArr.clone();
        this.l1_Q3 = RainbowUtil.cloneArray(sArr);
        this.l1_Q5 = RainbowUtil.cloneArray(sArr2);
        this.l1_Q6 = RainbowUtil.cloneArray(sArr3);
        this.l1_Q9 = RainbowUtil.cloneArray(sArr4);
        this.l2_Q9 = RainbowUtil.cloneArray(sArr5);
    }

    RainbowPublicKeyParameters(RainbowParameters rainbowParameters, short[][][] sArr, short[][][] sArr2, short[][][] sArr3, short[][][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11, short[][][] sArr12) {
        super(false, rainbowParameters);
        int v15 = rainbowParameters.getV1();
        int o15 = rainbowParameters.getO1();
        int o16 = rainbowParameters.getO2();
        this.f149546pk = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, rainbowParameters.getM(), rainbowParameters.getN(), rainbowParameters.getN());
        for (int i15 = 0; i15 < o15; i15++) {
            for (int i16 = 0; i16 < v15; i16++) {
                System.arraycopy(sArr[i15][i16], 0, this.f149546pk[i15][i16], 0, v15);
                System.arraycopy(sArr2[i15][i16], 0, this.f149546pk[i15][i16], v15, o15);
                System.arraycopy(sArr3[i15][i16], 0, this.f149546pk[i15][i16], v15 + o15, o16);
            }
            for (int i17 = 0; i17 < o15; i17++) {
                int i18 = i17 + v15;
                System.arraycopy(sArr4[i15][i17], 0, this.f149546pk[i15][i18], v15, o15);
                System.arraycopy(sArr5[i15][i17], 0, this.f149546pk[i15][i18], v15 + o15, o16);
            }
            for (int i19 = 0; i19 < o16; i19++) {
                System.arraycopy(sArr6[i15][i19], 0, this.f149546pk[i15][i19 + v15 + o15], v15 + o15, o16);
            }
        }
        for (int i25 = 0; i25 < o16; i25++) {
            for (int i26 = 0; i26 < v15; i26++) {
                int i27 = i25 + o15;
                System.arraycopy(sArr7[i25][i26], 0, this.f149546pk[i27][i26], 0, v15);
                System.arraycopy(sArr8[i25][i26], 0, this.f149546pk[i27][i26], v15, o15);
                System.arraycopy(sArr9[i25][i26], 0, this.f149546pk[i27][i26], v15 + o15, o16);
            }
            for (int i28 = 0; i28 < o15; i28++) {
                int i29 = i25 + o15;
                int i35 = i28 + v15;
                System.arraycopy(sArr10[i25][i28], 0, this.f149546pk[i29][i35], v15, o15);
                System.arraycopy(sArr11[i25][i28], 0, this.f149546pk[i29][i35], v15 + o15, o16);
            }
            for (int i36 = 0; i36 < o16; i36++) {
                System.arraycopy(sArr12[i25][i36], 0, this.f149546pk[i25 + o15][i36 + v15 + o15], v15 + o15, o16);
            }
        }
    }
}
