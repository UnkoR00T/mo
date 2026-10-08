package org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class RainbowKeyComputation {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    ComputeInField f149527cf;
    private short[][][] l1_F1;
    private short[][][] l1_F2;
    private short[][][] l1_Q1;
    private short[][][] l1_Q2;
    private short[][][] l1_Q3;
    private short[][][] l1_Q5;
    private short[][][] l1_Q6;
    private short[][][] l1_Q9;
    private short[][][] l2_F1;
    private short[][][] l2_F2;
    private short[][][] l2_F3;
    private short[][][] l2_F5;
    private short[][][] l2_F6;
    private short[][][] l2_Q1;
    private short[][][] l2_Q2;
    private short[][][] l2_Q3;
    private short[][][] l2_Q5;
    private short[][][] l2_Q6;
    private short[][][] l2_Q9;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private int f149528o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    private int f149529o2;
    private byte[] pk_seed;
    private RainbowParameters rainbowParams;
    private SecureRandom random;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private short[][] f149530s1;
    private byte[] sk_seed;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private short[][] f149531t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    private short[][] f149532t2;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private short[][] f149533t3;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private short[][] f149534t4;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private int f149535v1;
    private Version version;

    public RainbowKeyComputation(RainbowParameters rainbowParameters, SecureRandom secureRandom) {
        this.f149527cf = new ComputeInField();
        this.rainbowParams = rainbowParameters;
        this.random = secureRandom;
        this.version = rainbowParameters.getVersion();
        this.f149535v1 = this.rainbowParams.getV1();
        this.f149528o1 = this.rainbowParams.getO1();
        this.f149529o2 = this.rainbowParams.getO2();
    }

    private void calculate_F_from_Q() {
        this.l1_F1 = RainbowUtil.cloneArray(this.l1_Q1);
        this.l1_F2 = new short[this.f149528o1][][];
        for (int i15 = 0; i15 < this.f149528o1; i15++) {
            this.l1_F2[i15] = this.f149527cf.addMatrixTranspose(this.l1_Q1[i15]);
            short[][][] sArr = this.l1_F2;
            sArr[i15] = this.f149527cf.multiplyMatrix(sArr[i15], this.f149531t1);
            short[][][] sArr2 = this.l1_F2;
            sArr2[i15] = this.f149527cf.addMatrix(sArr2[i15], this.l1_Q2[i15]);
        }
        int i16 = this.f149529o2;
        this.l2_F2 = new short[i16][][];
        this.l2_F3 = new short[i16][][];
        this.l2_F5 = new short[i16][][];
        this.l2_F6 = new short[i16][][];
        this.l2_F1 = RainbowUtil.cloneArray(this.l2_Q1);
        for (int i17 = 0; i17 < this.f149529o2; i17++) {
            short[][] sArrAddMatrixTranspose = this.f149527cf.addMatrixTranspose(this.l2_Q1[i17]);
            this.l2_F2[i17] = this.f149527cf.multiplyMatrix(sArrAddMatrixTranspose, this.f149531t1);
            short[][][] sArr3 = this.l2_F2;
            sArr3[i17] = this.f149527cf.addMatrix(sArr3[i17], this.l2_Q2[i17]);
            this.l2_F3[i17] = this.f149527cf.multiplyMatrix(sArrAddMatrixTranspose, this.f149534t4);
            short[][] sArrMultiplyMatrix = this.f149527cf.multiplyMatrix(this.l2_Q2[i17], this.f149533t3);
            short[][][] sArr4 = this.l2_F3;
            sArr4[i17] = this.f149527cf.addMatrix(sArr4[i17], sArrMultiplyMatrix);
            short[][][] sArr5 = this.l2_F3;
            sArr5[i17] = this.f149527cf.addMatrix(sArr5[i17], this.l2_Q3[i17]);
            short[][] sArrAddMatrix = this.f149527cf.addMatrix(this.f149527cf.multiplyMatrix(this.l2_Q1[i17], this.f149531t1), this.l2_Q2[i17]);
            short[][] sArrTranspose = this.f149527cf.transpose(this.f149531t1);
            this.l2_F5[i17] = this.f149527cf.multiplyMatrix(sArrTranspose, sArrAddMatrix);
            short[][][] sArr6 = this.l2_F5;
            sArr6[i17] = this.f149527cf.addMatrix(sArr6[i17], this.l2_Q5[i17]);
            short[][][] sArr7 = this.l2_F5;
            sArr7[i17] = this.f149527cf.to_UT(sArr7[i17]);
            this.l2_F6[i17] = this.f149527cf.multiplyMatrix(sArrTranspose, this.l2_F3[i17]);
            ComputeInField computeInField = this.f149527cf;
            short[][] sArrMultiplyMatrix2 = computeInField.multiplyMatrix(computeInField.transpose(this.l2_Q2[i17]), this.f149534t4);
            short[][][] sArr8 = this.l2_F6;
            sArr8[i17] = this.f149527cf.addMatrix(sArr8[i17], sArrMultiplyMatrix2);
            short[][] sArrMultiplyMatrix3 = this.f149527cf.multiplyMatrix(this.f149527cf.addMatrixTranspose(this.l2_Q5[i17]), this.f149533t3);
            short[][][] sArr9 = this.l2_F6;
            sArr9[i17] = this.f149527cf.addMatrix(sArr9[i17], sArrMultiplyMatrix3);
            short[][][] sArr10 = this.l2_F6;
            sArr10[i17] = this.f149527cf.addMatrix(sArr10[i17], this.l2_Q6[i17]);
        }
    }

    private void calculate_Q_from_F() {
        short[][] sArrTranspose = this.f149527cf.transpose(this.f149531t1);
        short[][] sArrTranspose2 = this.f149527cf.transpose(this.f149532t2);
        this.l1_Q1 = RainbowUtil.cloneArray(this.l1_F1);
        this.l1_Q2 = new short[this.f149528o1][][];
        for (int i15 = 0; i15 < this.f149528o1; i15++) {
            this.l1_Q2[i15] = this.f149527cf.addMatrixTranspose(this.l1_F1[i15]);
            short[][][] sArr = this.l1_Q2;
            sArr[i15] = this.f149527cf.multiplyMatrix(sArr[i15], this.f149531t1);
            short[][][] sArr2 = this.l1_Q2;
            sArr2[i15] = this.f149527cf.addMatrix(sArr2[i15], this.l1_F2[i15]);
        }
        calculate_l1_Q3569(sArrTranspose, sArrTranspose2);
        int i16 = this.f149529o2;
        this.l2_Q2 = new short[i16][][];
        this.l2_Q3 = new short[i16][][];
        this.l2_Q5 = new short[i16][][];
        this.l2_Q6 = new short[i16][][];
        this.l2_Q1 = RainbowUtil.cloneArray(this.l2_F1);
        for (int i17 = 0; i17 < this.f149529o2; i17++) {
            short[][] sArrAddMatrixTranspose = this.f149527cf.addMatrixTranspose(this.l2_F1[i17]);
            this.l2_Q2[i17] = this.f149527cf.multiplyMatrix(sArrAddMatrixTranspose, this.f149531t1);
            short[][][] sArr3 = this.l2_Q2;
            sArr3[i17] = this.f149527cf.addMatrix(sArr3[i17], this.l2_F2[i17]);
            this.l2_Q3[i17] = this.f149527cf.multiplyMatrix(sArrAddMatrixTranspose, this.f149532t2);
            short[][] sArrMultiplyMatrix = this.f149527cf.multiplyMatrix(this.l2_F2[i17], this.f149533t3);
            short[][][] sArr4 = this.l2_Q3;
            sArr4[i17] = this.f149527cf.addMatrix(sArr4[i17], sArrMultiplyMatrix);
            short[][][] sArr5 = this.l2_Q3;
            sArr5[i17] = this.f149527cf.addMatrix(sArr5[i17], this.l2_F3[i17]);
            this.l2_Q5[i17] = this.f149527cf.multiplyMatrix(sArrTranspose, this.f149527cf.addMatrix(this.f149527cf.multiplyMatrix(this.l2_F1[i17], this.f149531t1), this.l2_F2[i17]));
            short[][][] sArr6 = this.l2_Q5;
            sArr6[i17] = this.f149527cf.addMatrix(sArr6[i17], this.l2_F5[i17]);
            short[][][] sArr7 = this.l2_Q5;
            sArr7[i17] = this.f149527cf.to_UT(sArr7[i17]);
            this.l2_Q6[i17] = this.f149527cf.multiplyMatrix(sArrTranspose, this.l2_Q3[i17]);
            ComputeInField computeInField = this.f149527cf;
            short[][] sArrMultiplyMatrix2 = computeInField.multiplyMatrix(computeInField.transpose(this.l2_F2[i17]), this.f149532t2);
            short[][][] sArr8 = this.l2_Q6;
            sArr8[i17] = this.f149527cf.addMatrix(sArr8[i17], sArrMultiplyMatrix2);
            short[][] sArrMultiplyMatrix3 = this.f149527cf.multiplyMatrix(this.f149527cf.addMatrixTranspose(this.l2_F5[i17]), this.f149533t3);
            short[][][] sArr9 = this.l2_Q6;
            sArr9[i17] = this.f149527cf.addMatrix(sArr9[i17], sArrMultiplyMatrix3);
            short[][][] sArr10 = this.l2_Q6;
            sArr10[i17] = this.f149527cf.addMatrix(sArr10[i17], this.l2_F6[i17]);
        }
        calculate_l2_Q9(sArrTranspose2);
    }

    private void calculate_Q_from_F_cyclic() {
        short[][] sArrTranspose = this.f149527cf.transpose(this.f149531t1);
        short[][] sArrTranspose2 = this.f149527cf.transpose(this.f149532t2);
        calculate_l1_Q3569(sArrTranspose, sArrTranspose2);
        calculate_l2_Q9(sArrTranspose2);
    }

    private void calculate_l1_Q3569(short[][] sArr, short[][] sArr2) {
        int i15 = this.f149528o1;
        this.l1_Q3 = new short[i15][][];
        this.l1_Q5 = new short[i15][][];
        this.l1_Q6 = new short[i15][][];
        this.l1_Q9 = new short[i15][][];
        for (int i16 = 0; i16 < this.f149528o1; i16++) {
            short[][] sArrMultiplyMatrix = this.f149527cf.multiplyMatrix(this.l1_F2[i16], this.f149533t3);
            this.l1_Q3[i16] = this.f149527cf.addMatrixTranspose(this.l1_F1[i16]);
            short[][][] sArr3 = this.l1_Q3;
            sArr3[i16] = this.f149527cf.multiplyMatrix(sArr3[i16], this.f149532t2);
            short[][][] sArr4 = this.l1_Q3;
            sArr4[i16] = this.f149527cf.addMatrix(sArr4[i16], sArrMultiplyMatrix);
            this.l1_Q5[i16] = this.f149527cf.multiplyMatrix(this.l1_F1[i16], this.f149531t1);
            short[][][] sArr5 = this.l1_Q5;
            sArr5[i16] = this.f149527cf.addMatrix(sArr5[i16], this.l1_F2[i16]);
            short[][][] sArr6 = this.l1_Q5;
            sArr6[i16] = this.f149527cf.multiplyMatrix(sArr, sArr6[i16]);
            short[][][] sArr7 = this.l1_Q5;
            sArr7[i16] = this.f149527cf.to_UT(sArr7[i16]);
            ComputeInField computeInField = this.f149527cf;
            short[][] sArrMultiplyMatrix2 = computeInField.multiplyMatrix(computeInField.transpose(this.l1_F2[i16]), this.f149532t2);
            this.l1_Q6[i16] = this.f149527cf.multiplyMatrix(sArr, this.l1_Q3[i16]);
            short[][][] sArr8 = this.l1_Q6;
            sArr8[i16] = this.f149527cf.addMatrix(sArr8[i16], sArrMultiplyMatrix2);
            this.l1_Q9[i16] = this.f149527cf.addMatrix(this.f149527cf.multiplyMatrix(this.l1_F1[i16], this.f149532t2), sArrMultiplyMatrix);
            short[][][] sArr9 = this.l1_Q9;
            sArr9[i16] = this.f149527cf.multiplyMatrix(sArr2, sArr9[i16]);
            short[][][] sArr10 = this.l1_Q9;
            sArr10[i16] = this.f149527cf.to_UT(sArr10[i16]);
        }
    }

    private void calculate_l2_Q9(short[][] sArr) {
        this.l2_Q9 = new short[this.f149529o2][][];
        for (int i15 = 0; i15 < this.f149529o2; i15++) {
            this.l2_Q9[i15] = this.f149527cf.multiplyMatrix(this.l2_F1[i15], this.f149532t2);
            short[][] sArrMultiplyMatrix = this.f149527cf.multiplyMatrix(this.l2_F2[i15], this.f149533t3);
            short[][][] sArr2 = this.l2_Q9;
            sArr2[i15] = this.f149527cf.addMatrix(sArr2[i15], sArrMultiplyMatrix);
            short[][][] sArr3 = this.l2_Q9;
            sArr3[i15] = this.f149527cf.addMatrix(sArr3[i15], this.l2_F3[i15]);
            short[][][] sArr4 = this.l2_Q9;
            sArr4[i15] = this.f149527cf.multiplyMatrix(sArr, sArr4[i15]);
            short[][] sArrAddMatrix = this.f149527cf.addMatrix(this.f149527cf.multiplyMatrix(this.l2_F5[i15], this.f149533t3), this.l2_F6[i15]);
            ComputeInField computeInField = this.f149527cf;
            short[][] sArrMultiplyMatrix2 = computeInField.multiplyMatrix(computeInField.transpose(this.f149533t3), sArrAddMatrix);
            short[][][] sArr5 = this.l2_Q9;
            sArr5[i15] = this.f149527cf.addMatrix(sArr5[i15], sArrMultiplyMatrix2);
            short[][][] sArr6 = this.l2_Q9;
            sArr6[i15] = this.f149527cf.to_UT(sArr6[i15]);
        }
    }

    private void calculate_t4() {
        this.f149534t4 = this.f149527cf.addMatrix(this.f149527cf.multiplyMatrix(this.f149531t1, this.f149533t3), this.f149532t2);
    }

    private void genKeyMaterial() {
        byte[] bArr = new byte[this.rainbowParams.getLen_skseed()];
        this.sk_seed = bArr;
        this.random.nextBytes(bArr);
        RainbowDRBG rainbowDRBG = new RainbowDRBG(this.sk_seed, this.rainbowParams.getHash_algo());
        generate_S_and_T(rainbowDRBG);
        int i15 = this.f149528o1;
        int i16 = this.f149535v1;
        this.l1_F1 = RainbowUtil.generate_random(rainbowDRBG, i15, i16, i16, true);
        int i17 = this.f149528o1;
        this.l1_F2 = RainbowUtil.generate_random(rainbowDRBG, i17, this.f149535v1, i17, false);
        int i18 = this.f149529o2;
        int i19 = this.f149535v1;
        this.l2_F1 = RainbowUtil.generate_random(rainbowDRBG, i18, i19, i19, true);
        this.l2_F2 = RainbowUtil.generate_random(rainbowDRBG, this.f149529o2, this.f149535v1, this.f149528o1, false);
        int i25 = this.f149529o2;
        this.l2_F3 = RainbowUtil.generate_random(rainbowDRBG, i25, this.f149535v1, i25, false);
        int i26 = this.f149529o2;
        int i27 = this.f149528o1;
        this.l2_F5 = RainbowUtil.generate_random(rainbowDRBG, i26, i27, i27, true);
        int i28 = this.f149529o2;
        this.l2_F6 = RainbowUtil.generate_random(rainbowDRBG, i28, this.f149528o1, i28, false);
        calculate_Q_from_F();
        calculate_t4();
        this.l1_Q1 = this.f149527cf.obfuscate_l1_polys(this.f149530s1, this.l2_Q1, this.l1_Q1);
        this.l1_Q2 = this.f149527cf.obfuscate_l1_polys(this.f149530s1, this.l2_Q2, this.l1_Q2);
        this.l1_Q3 = this.f149527cf.obfuscate_l1_polys(this.f149530s1, this.l2_Q3, this.l1_Q3);
        this.l1_Q5 = this.f149527cf.obfuscate_l1_polys(this.f149530s1, this.l2_Q5, this.l1_Q5);
        this.l1_Q6 = this.f149527cf.obfuscate_l1_polys(this.f149530s1, this.l2_Q6, this.l1_Q6);
        this.l1_Q9 = this.f149527cf.obfuscate_l1_polys(this.f149530s1, this.l2_Q9, this.l1_Q9);
    }

    private void genKeyMaterial_cyclic() {
        byte[] bArr = new byte[this.rainbowParams.getLen_skseed()];
        this.sk_seed = bArr;
        this.random.nextBytes(bArr);
        byte[] bArr2 = new byte[this.rainbowParams.getLen_pkseed()];
        this.pk_seed = bArr2;
        this.random.nextBytes(bArr2);
        genPrivateKeyMaterial_cyclic();
        calculate_Q_from_F_cyclic();
        this.l1_Q3 = this.f149527cf.obfuscate_l1_polys(this.f149530s1, this.l2_Q3, this.l1_Q3);
        this.l1_Q5 = this.f149527cf.obfuscate_l1_polys(this.f149530s1, this.l2_Q5, this.l1_Q5);
        this.l1_Q6 = this.f149527cf.obfuscate_l1_polys(this.f149530s1, this.l2_Q6, this.l1_Q6);
        this.l1_Q9 = this.f149527cf.obfuscate_l1_polys(this.f149530s1, this.l2_Q9, this.l1_Q9);
    }

    private void genPrivateKeyMaterial_cyclic() {
        RainbowDRBG rainbowDRBG = new RainbowDRBG(this.sk_seed, this.rainbowParams.getHash_algo());
        RainbowDRBG rainbowDRBG2 = new RainbowDRBG(this.pk_seed, this.rainbowParams.getHash_algo());
        generate_S_and_T(rainbowDRBG);
        calculate_t4();
        generate_B1_and_B2(rainbowDRBG2);
        this.l1_Q1 = this.f149527cf.obfuscate_l1_polys(this.f149530s1, this.l2_Q1, this.l1_Q1);
        this.l1_Q2 = this.f149527cf.obfuscate_l1_polys(this.f149530s1, this.l2_Q2, this.l1_Q2);
        calculate_F_from_Q();
    }

    private void generate_B1_and_B2(SecureRandom secureRandom) {
        int i15 = this.f149528o1;
        int i16 = this.f149535v1;
        this.l1_Q1 = RainbowUtil.generate_random(secureRandom, i15, i16, i16, true);
        int i17 = this.f149528o1;
        this.l1_Q2 = RainbowUtil.generate_random(secureRandom, i17, this.f149535v1, i17, false);
        int i18 = this.f149529o2;
        int i19 = this.f149535v1;
        this.l2_Q1 = RainbowUtil.generate_random(secureRandom, i18, i19, i19, true);
        this.l2_Q2 = RainbowUtil.generate_random(secureRandom, this.f149529o2, this.f149535v1, this.f149528o1, false);
        int i25 = this.f149529o2;
        this.l2_Q3 = RainbowUtil.generate_random(secureRandom, i25, this.f149535v1, i25, false);
        int i26 = this.f149529o2;
        int i27 = this.f149528o1;
        this.l2_Q5 = RainbowUtil.generate_random(secureRandom, i26, i27, i27, true);
        int i28 = this.f149529o2;
        this.l2_Q6 = RainbowUtil.generate_random(secureRandom, i28, this.f149528o1, i28, false);
    }

    private void generate_S_and_T(SecureRandom secureRandom) {
        this.f149530s1 = RainbowUtil.generate_random_2d(secureRandom, this.f149528o1, this.f149529o2);
        this.f149531t1 = RainbowUtil.generate_random_2d(secureRandom, this.f149535v1, this.f149528o1);
        this.f149532t2 = RainbowUtil.generate_random_2d(secureRandom, this.f149535v1, this.f149529o2);
        this.f149533t3 = RainbowUtil.generate_random_2d(secureRandom, this.f149528o1, this.f149529o2);
    }

    public AsymmetricCipherKeyPair genKeyPairCircumzenithal() {
        genKeyMaterial_cyclic();
        RainbowPublicKeyParameters rainbowPublicKeyParameters = new RainbowPublicKeyParameters(this.rainbowParams, this.pk_seed, this.l1_Q3, this.l1_Q5, this.l1_Q6, this.l1_Q9, this.l2_Q9);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) rainbowPublicKeyParameters, (AsymmetricKeyParameter) new RainbowPrivateKeyParameters(this.rainbowParams, this.sk_seed, this.f149530s1, this.f149531t1, this.f149533t3, this.f149534t4, this.l1_F1, this.l1_F2, this.l2_F1, this.l2_F2, this.l2_F3, this.l2_F5, this.l2_F6, rainbowPublicKeyParameters.getEncoded()));
    }

    public AsymmetricCipherKeyPair genKeyPairClassical() {
        genKeyMaterial();
        RainbowPublicKeyParameters rainbowPublicKeyParameters = new RainbowPublicKeyParameters(this.rainbowParams, this.l1_Q1, this.l1_Q2, this.l1_Q3, this.l1_Q5, this.l1_Q6, this.l1_Q9, this.l2_Q1, this.l2_Q2, this.l2_Q3, this.l2_Q5, this.l2_Q6, this.l2_Q9);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) rainbowPublicKeyParameters, (AsymmetricKeyParameter) new RainbowPrivateKeyParameters(this.rainbowParams, this.sk_seed, this.f149530s1, this.f149531t1, this.f149533t3, this.f149534t4, this.l1_F1, this.l1_F2, this.l2_F1, this.l2_F2, this.l2_F3, this.l2_F5, this.l2_F6, rainbowPublicKeyParameters.getEncoded()));
    }

    public AsymmetricCipherKeyPair genKeyPairCompressed() {
        genKeyMaterial_cyclic();
        RainbowPublicKeyParameters rainbowPublicKeyParameters = new RainbowPublicKeyParameters(this.rainbowParams, this.pk_seed, this.l1_Q3, this.l1_Q5, this.l1_Q6, this.l1_Q9, this.l2_Q9);
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) rainbowPublicKeyParameters, (AsymmetricKeyParameter) new RainbowPrivateKeyParameters(this.rainbowParams, this.pk_seed, this.sk_seed, rainbowPublicKeyParameters.getEncoded()));
    }

    RainbowPrivateKeyParameters generatePrivateKey() {
        this.sk_seed = Arrays.clone(this.sk_seed);
        this.pk_seed = Arrays.clone(this.pk_seed);
        genPrivateKeyMaterial_cyclic();
        return new RainbowPrivateKeyParameters(this.rainbowParams, this.sk_seed, this.f149530s1, this.f149531t1, this.f149533t3, this.f149534t4, this.l1_F1, this.l1_F2, this.l2_F1, this.l2_F2, this.l2_F3, this.l2_F5, this.l2_F6, null);
    }

    public RainbowKeyComputation(RainbowParameters rainbowParameters, byte[] bArr, byte[] bArr2) {
        this.f149527cf = new ComputeInField();
        this.rainbowParams = rainbowParameters;
        this.random = null;
        this.version = rainbowParameters.getVersion();
        this.pk_seed = bArr;
        this.sk_seed = bArr2;
        this.f149535v1 = this.rainbowParams.getV1();
        this.f149528o1 = this.rainbowParams.getO1();
        this.f149529o2 = this.rainbowParams.getO2();
    }
}
