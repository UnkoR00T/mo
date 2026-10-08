package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes5.dex */
public class SnovaSigner implements MessageSigner {
    private SnovaEngine engine;
    private SnovaParameters params;
    private SnovaPrivateKeyParameters privKey;
    private SnovaPublicKeyParameters pubKey;
    private SecureRandom random;
    private final SHAKEDigest shake = new SHAKEDigest(256);

    private void evaluation(byte[] bArr, MapGroup1 mapGroup1, byte[][][][] bArr2, byte[] bArr3) {
        int m15 = this.params.getM();
        int alpha = this.params.getAlpha();
        int n15 = this.params.getN();
        int l15 = this.params.getL();
        int lsq = this.params.getLsq();
        int o15 = this.params.getO();
        Class cls = Byte.TYPE;
        byte[][][] bArr4 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, n15, lsq);
        byte[][][] bArr5 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, n15, lsq);
        byte[] bArr6 = new byte[lsq];
        int i15 = 0;
        int i16 = 0;
        while (i15 < m15) {
            int i17 = 0;
            int i18 = 0;
            while (i17 < n15) {
                int i19 = 0;
                while (i19 < alpha) {
                    GF16Utils.gf16mTranMulMul(bArr3, i18, mapGroup1.aAlpha[i15][i19], mapGroup1.bAlpha[i15][i19], mapGroup1.qAlpha1[i15][i19], mapGroup1.qAlpha2[i15][i19], bArr6, bArr4[i19][i17], bArr5[i19][i17], l15);
                    i19++;
                    i17 = i17;
                }
                i18 += lsq;
                i17++;
            }
            int i25 = l15;
            int i26 = i15;
            int i27 = 0;
            while (i27 < alpha) {
                if (i26 >= o15) {
                    i26 -= o15;
                }
                int i28 = i15;
                int i29 = 0;
                while (i29 < n15) {
                    int i35 = i16;
                    int i36 = i28;
                    int i37 = lsq;
                    int i38 = o15;
                    int i39 = i26;
                    GF16Utils.gf16mMul(getPMatrix(mapGroup1, bArr2, i39, i29, 0), bArr5[i27][0], bArr6, i25);
                    int i45 = 1;
                    while (i45 < n15) {
                        GF16Utils.gf16mMulTo(getPMatrix(mapGroup1, bArr2, i39, i29, i45), bArr5[i27][i45], bArr6, i25);
                        i45++;
                        m15 = m15;
                    }
                    GF16Utils.gf16mMulTo(bArr4[i27][i29], bArr6, bArr, i35, i25);
                    i29++;
                    mapGroup1 = mapGroup1;
                    i26 = i39;
                    lsq = i37;
                    o15 = i38;
                    i28 = i36;
                    i16 = i35;
                }
                i27++;
                i26++;
                mapGroup1 = mapGroup1;
                o15 = o15;
                i15 = i28;
            }
            i15++;
            i16 += lsq;
            l15 = i25;
        }
    }

    private byte[] getMessageHash(byte[] bArr) {
        byte[] bArr2 = new byte[this.shake.getDigestSize()];
        this.shake.update(bArr, 0, bArr.length);
        this.shake.doFinal(bArr2, 0);
        return bArr2;
    }

    private byte[] getPMatrix(MapGroup1 mapGroup1, byte[][][][] bArr, int i15, int i16, int i17) {
        int v15 = this.params.getV();
        if (i16 < v15) {
            return i17 < v15 ? mapGroup1.f149573p11[i15][i16][i17] : mapGroup1.f149574p12[i15][i16][i17 - v15];
        }
        return i17 < v15 ? mapGroup1.f149575p21[i15][i16 - v15][i17] : bArr[i15][i16 - v15][i17 - v15];
    }

    private int performGaussianElimination(byte[][] bArr, byte[] bArr2, int i15) {
        int i16 = i15 + 1;
        int i17 = 0;
        while (i17 < i15) {
            int i18 = i17;
            while (i18 < i15 && bArr[i18][i17] == 0) {
                i18++;
            }
            if (i18 >= i15) {
                return 1;
            }
            if (i18 != i17) {
                byte[] bArr3 = bArr[i17];
                bArr[i17] = bArr[i18];
                bArr[i18] = bArr3;
            }
            byte bInv = GF16.inv(bArr[i17][i17]);
            for (int i19 = i17; i19 < i16; i19++) {
                byte[] bArr4 = bArr[i17];
                bArr4[i19] = GF16.mul(bArr4[i19], bInv);
            }
            int i25 = i17 + 1;
            for (int i26 = i25; i26 < i15; i26++) {
                byte b15 = bArr[i26][i17];
                if (b15 != 0) {
                    for (int i27 = i17; i27 < i16; i27++) {
                        byte[] bArr5 = bArr[i26];
                        bArr5[i27] = (byte) (bArr5[i27] ^ GF16.mul(bArr[i17][i27], b15));
                    }
                }
            }
            i17 = i25;
        }
        for (int i28 = i15 - 1; i28 >= 0; i28--) {
            byte bMul = bArr[i28][i15];
            for (int i29 = i28 + 1; i29 < i15; i29++) {
                bMul = (byte) (bMul ^ GF16.mul(bArr[i28][i29], bArr2[i29]));
            }
            bArr2[i28] = bMul;
        }
        return 0;
    }

    void createSignedHash(byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3, int i17, int i18, byte[] bArr4, int i19) {
        this.shake.update(bArr, 0, i15);
        this.shake.update(bArr2, 0, i16);
        this.shake.update(bArr3, i17, i18);
        this.shake.doFinal(bArr4, 0, i19);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] bArrCopyOfRange;
        byte[] bArrCopyOfRange2;
        byte[] messageHash = getMessageHash(bArr);
        byte[] bArr2 = new byte[this.params.getSaltLength()];
        this.random.nextBytes(bArr2);
        byte[] bArr3 = new byte[(((this.params.getN() * this.params.getLsq()) + 1) >>> 1) + this.params.getSaltLength()];
        SnovaKeyElements snovaKeyElements = new SnovaKeyElements(this.params);
        if (this.params.isSkIsSeed()) {
            byte[] privateKey = this.privKey.getPrivateKey();
            bArrCopyOfRange = Arrays.copyOfRange(privateKey, 0, 16);
            bArrCopyOfRange2 = Arrays.copyOfRange(privateKey, 16, privateKey.length);
            this.engine.genMap1T12Map2(snovaKeyElements, bArrCopyOfRange, bArrCopyOfRange2);
        } else {
            byte[] privateKey2 = this.privKey.getPrivateKey();
            int length = (privateKey2.length - 48) << 1;
            byte[] bArr4 = new byte[length];
            GF16Utils.decodeMergeInHalf(privateKey2, bArr4, length);
            SnovaKeyElements.copy4d(bArr4, SnovaKeyElements.copy4d(bArr4, SnovaKeyElements.copy4d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, SnovaKeyElements.copy3d(bArr4, 0, snovaKeyElements.map1.aAlpha), snovaKeyElements.map1.bAlpha), snovaKeyElements.map1.qAlpha1), snovaKeyElements.map1.qAlpha2), snovaKeyElements.T12), snovaKeyElements.map2.f149576f11), snovaKeyElements.map2.f149577f12), snovaKeyElements.map2.f149578f21);
            bArrCopyOfRange = Arrays.copyOfRange(privateKey2, privateKey2.length - 48, privateKey2.length - 32);
            bArrCopyOfRange2 = Arrays.copyOfRange(privateKey2, privateKey2.length - 32, privateKey2.length);
        }
        byte[] bArr5 = bArrCopyOfRange2;
        byte[] bArr6 = bArrCopyOfRange;
        MapGroup1 mapGroup1 = snovaKeyElements.map1;
        byte[][][] bArr7 = mapGroup1.aAlpha;
        byte[][][] bArr8 = mapGroup1.bAlpha;
        byte[][][] bArr9 = mapGroup1.qAlpha1;
        byte[][][] bArr10 = mapGroup1.qAlpha2;
        byte[][][] bArr11 = snovaKeyElements.T12;
        MapGroup2 mapGroup2 = snovaKeyElements.map2;
        signDigestCore(bArr3, messageHash, bArr2, bArr7, bArr8, bArr9, bArr10, bArr11, mapGroup2.f149576f11, mapGroup2.f149577f12, mapGroup2.f149578f21, bArr6, bArr5);
        return Arrays.concatenate(bArr3, bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z15, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (z15) {
            this.pubKey = null;
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.privKey = (SnovaPrivateKeyParameters) parametersWithRandom.getParameters();
                secureRandom = parametersWithRandom.getRandom();
            } else {
                this.privKey = (SnovaPrivateKeyParameters) cipherParameters;
                secureRandom = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random = secureRandom;
            this.params = this.privKey.getParameters();
        } else {
            SnovaPublicKeyParameters snovaPublicKeyParameters = (SnovaPublicKeyParameters) cipherParameters;
            this.pubKey = snovaPublicKeyParameters;
            this.params = snovaPublicKeyParameters.getParameters();
            this.privKey = null;
            this.random = null;
        }
        this.engine = new SnovaEngine(this.params);
    }

    void signDigestCore(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[][][] bArr4, byte[][][] bArr5, byte[][][] bArr6, byte[][][] bArr7, byte[][][] bArr8, byte[][][][] bArr9, byte[][][][] bArr10, byte[][][][] bArr11, byte[] bArr12, byte[] bArr13) {
        int i15;
        int i16;
        int i17;
        int i18;
        byte[] bArr14;
        byte b15;
        int i19;
        byte b16;
        int m15 = this.params.getM();
        int l15 = this.params.getL();
        int lsq = this.params.getLsq();
        int alpha = this.params.getAlpha();
        int v15 = this.params.getV();
        int o15 = this.params.getO();
        int n15 = this.params.getN();
        int i25 = m15 * lsq;
        int i26 = o15 * lsq;
        int i27 = v15 * lsq;
        int i28 = (i26 + 1) >>> 1;
        Class cls = Byte.TYPE;
        byte[][] bArr15 = (byte[][]) Array.newInstance((Class<?>) cls, i25, i25 + 1);
        byte[][] bArr16 = (byte[][]) Array.newInstance((Class<?>) cls, lsq, lsq);
        byte[] bArr17 = new byte[i25];
        byte[][][] bArr18 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, v15, lsq);
        byte[][][] bArr19 = (byte[][][]) Array.newInstance((Class<?>) cls, alpha, v15, lsq);
        byte[] bArr20 = new byte[lsq];
        byte[] bArr21 = new byte[lsq];
        byte[] bArr22 = new byte[lsq];
        byte[] bArr23 = new byte[i25];
        int i29 = n15 * lsq;
        byte[] bArr24 = new byte[i28];
        int i35 = (i27 + 1) >>> 1;
        int i36 = lsq;
        byte[] bArr25 = new byte[i35];
        byte[] bArr26 = new byte[l15];
        int i37 = l15;
        int i38 = o15;
        int i39 = v15;
        byte b17 = 0;
        byte[] bArr27 = bArr17;
        byte[] bArr28 = new byte[i29];
        int i45 = i35;
        byte[] bArr29 = bArr22;
        byte[] bArr30 = bArr21;
        int i46 = m15;
        int i47 = alpha;
        int i48 = i25;
        byte[] bArr31 = bArr26;
        createSignedHash(bArr12, bArr12.length, bArr2, bArr2.length, bArr3, 0, bArr3.length, bArr24, i28);
        byte[] bArr32 = bArr2;
        GF16.decode(bArr24, 0, bArr23, 0, i48);
        byte b18 = 0;
        while (true) {
            for (int i49 = b17; i49 < bArr15.length; i49++) {
                Arrays.fill(bArr15[i49], b17);
            }
            byte b19 = (byte) (b18 + 1);
            for (int i55 = b17; i55 < i48; i55++) {
                bArr15[i55][i48] = bArr23[i55];
            }
            this.shake.update(bArr13, b17, bArr13.length);
            this.shake.update(bArr32, b17, bArr32.length);
            this.shake.update(bArr3, b17, bArr3.length);
            this.shake.update(b19);
            int i56 = i45;
            this.shake.doFinal(bArr25, b17, i56);
            byte[] bArr33 = bArr28;
            GF16.decode(bArr25, bArr33, i56 << 1);
            int i57 = b17;
            int i58 = i46;
            int i59 = i57;
            while (i57 < i58) {
                byte[] bArr34 = bArr29;
                Arrays.fill(bArr34, b17);
                int i65 = i57;
                int i66 = b17;
                int i67 = i47;
                while (i66 < i67) {
                    byte b25 = b19;
                    int i68 = i38;
                    if (i65 >= i68) {
                        i65 -= i68;
                    }
                    int i69 = i65;
                    byte[] bArr35 = bArr23;
                    byte[] bArr36 = bArr25;
                    int i75 = i39;
                    int i76 = 0;
                    int i77 = 0;
                    while (i76 < i75) {
                        int i78 = i67;
                        byte[] bArr37 = bArr33;
                        GF16Utils.gf16mTranMulMul(bArr37, i77, bArr4[i57][i66], bArr5[i57][i66], bArr6[i57][i66], bArr7[i57][i66], bArr31, bArr18[i66][i76], bArr19[i66][i76], i37);
                        i77 += i36;
                        i48 = i48;
                        i76++;
                        bArr36 = bArr36;
                        i67 = i78;
                        bArr33 = bArr37;
                    }
                    byte[] bArr38 = bArr33;
                    int i79 = i67;
                    int i85 = i48;
                    byte[] bArr39 = bArr36;
                    int i86 = 0;
                    int i87 = 0;
                    while (i87 < i75) {
                        int i88 = i86;
                        while (i88 < i75) {
                            int i89 = i87;
                            int i95 = i79;
                            byte[] bArr40 = bArr31;
                            GF16Utils.gf16mMulMulTo(bArr18[i66][i87], bArr9[i69][i87][i88], bArr19[i66][i88], bArr40, bArr34, i37);
                            i88++;
                            i57 = i57;
                            i58 = i58;
                            i66 = i66;
                            i56 = i56;
                            bArr31 = bArr40;
                            i79 = i95;
                            i87 = i89;
                        }
                        i66 = i66;
                        i86 = 0;
                        bArr31 = bArr31;
                        i79 = i79;
                        i87++;
                        i57 = i57;
                    }
                    i67 = i79;
                    bArr31 = bArr31;
                    i38 = i68;
                    i39 = i75;
                    b19 = b25;
                    bArr23 = bArr35;
                    bArr25 = bArr39;
                    bArr33 = bArr38;
                    i66++;
                    i57 = i57;
                    i48 = i85;
                    i65 = i69 + 1;
                    i56 = i56;
                }
                int i96 = i56;
                int i97 = i58;
                byte[] bArr41 = bArr33;
                bArr29 = bArr34;
                byte b26 = b19;
                byte[] bArr42 = bArr23;
                byte[] bArr43 = bArr25;
                int i98 = i48;
                byte[] bArr44 = bArr31;
                int i99 = i36;
                int i100 = i37;
                int i101 = i39;
                int i102 = i38;
                int i103 = i57;
                int i104 = 0;
                int i105 = 0;
                while (i104 < i100) {
                    int i106 = i105;
                    int i107 = 0;
                    while (i107 < i100) {
                        byte[] bArr45 = bArr15[i59 + i106];
                        bArr45[i98] = (byte) (bArr29[i106] ^ bArr45[i98]);
                        i107++;
                        i106++;
                    }
                    i104++;
                    i105 = i106;
                }
                int i108 = 0;
                int i109 = 0;
                while (i108 < i102) {
                    int i110 = i103;
                    int i111 = 0;
                    while (i111 < i67) {
                        if (i110 >= i102) {
                            i110 -= i102;
                        }
                        int i112 = i110;
                        for (int i113 = 0; i113 < i99; i113++) {
                            Arrays.fill(bArr16[i113], (byte) 0);
                        }
                        int i114 = 0;
                        while (i114 < i101) {
                            int i115 = i111;
                            int i116 = i114;
                            GF16Utils.gf16mMulMul(bArr18[i111][i114], bArr10[i112][i114][i108], bArr7[i103][i111], bArr44, bArr20, i100);
                            byte[] bArr46 = bArr30;
                            GF16Utils.gf16mMulMul(bArr6[i103][i115], bArr11[i112][i108][i116], bArr19[i115][i116], bArr44, bArr46, i100);
                            int i117 = 0;
                            int i118 = 0;
                            int i119 = 0;
                            while (i117 < i99) {
                                if (i118 == i100) {
                                    i119 += i100;
                                    i118 = 0;
                                }
                                int i120 = i117;
                                int i121 = i118;
                                byte b27 = bArr20[i119];
                                byte b28 = bArr46[i118];
                                int i122 = 0;
                                int i123 = 0;
                                int i124 = 0;
                                int i125 = 0;
                                int i126 = 0;
                                while (i122 < i99) {
                                    if (i123 == i100) {
                                        i124++;
                                        i125 += i100;
                                        b15 = bArr20[i119 + i124];
                                        b16 = bArr46[i125 + i121];
                                        i126 = 0;
                                        i19 = 0;
                                    } else {
                                        b15 = b27;
                                        byte b29 = b28;
                                        i19 = i123;
                                        b16 = b29;
                                    }
                                    int i127 = i119;
                                    byte b35 = bArr5[i103][i115][i126 + i121];
                                    byte[] bArr47 = bArr44;
                                    byte b36 = bArr4[i103][i115][i127 + i19];
                                    byte[] bArr48 = bArr16[i120];
                                    bArr48[i122] = (byte) (bArr48[i122] ^ (GF16.mul(b15, b35) ^ GF16.mul(b36, b16)));
                                    int i128 = i19 + 1;
                                    i126 += i100;
                                    b27 = b15;
                                    b28 = b16;
                                    i122++;
                                    i123 = i128;
                                    i119 = i127;
                                    bArr44 = bArr47;
                                }
                                i117 = i120 + 1;
                                i118 = i121 + 1;
                            }
                            i114 = i116 + 1;
                            bArr30 = bArr46;
                            i111 = i115;
                        }
                        int i129 = i111;
                        byte[] bArr49 = bArr44;
                        byte[] bArr50 = bArr30;
                        int i130 = 0;
                        while (i130 < i99) {
                            int i131 = 0;
                            while (i131 < i99) {
                                byte[] bArr51 = bArr15[i59 + i130];
                                int i132 = i109 + i131;
                                bArr51[i132] = (byte) (bArr51[i132] ^ bArr16[i130][i131]);
                                i131++;
                                i130 = i130;
                            }
                            i130++;
                        }
                        i111 = i129 + 1;
                        i110 = i112 + 1;
                        bArr30 = bArr50;
                        bArr44 = bArr49;
                    }
                    i108++;
                    i109 += i99;
                }
                byte[] bArr52 = bArr44;
                i57 = i103 + 1;
                i59 += i99;
                i48 = i98;
                i37 = i100;
                i38 = i102;
                i39 = i101;
                i36 = i99;
                i58 = i97;
                b19 = b26;
                bArr23 = bArr42;
                bArr25 = bArr43;
                bArr33 = bArr41;
                i56 = i96;
                bArr31 = bArr52;
                i47 = i67;
                b17 = 0;
            }
            i45 = i56;
            bArr28 = bArr33;
            byte b37 = b19;
            byte[] bArr53 = bArr23;
            byte[] bArr54 = bArr25;
            int i133 = i48;
            int i134 = i47;
            byte[] bArr55 = bArr31;
            i15 = i36;
            byte[] bArr56 = bArr30;
            i16 = i37;
            i17 = i39;
            i18 = i38;
            bArr14 = bArr27;
            int i135 = i58;
            if (performGaussianElimination(bArr15, bArr14, i133) == 0) {
                break;
            }
            i48 = i133;
            bArr27 = bArr14;
            bArr30 = bArr56;
            i37 = i16;
            i38 = i18;
            i39 = i17;
            i36 = i15;
            i46 = i135;
            b18 = b37;
            bArr23 = bArr53;
            bArr25 = bArr54;
            bArr31 = bArr55;
            bArr32 = bArr2;
            i47 = i134;
            b17 = 0;
        }
        int i136 = 0;
        int i137 = 0;
        while (i136 < i17) {
            int i138 = 0;
            int i139 = 0;
            while (i139 < i18) {
                GF16Utils.gf16mMulTo(bArr8[i136][i139], bArr14, i138, bArr28, i137, i16);
                i139++;
                i138 += i15;
            }
            i136++;
            i137 += i15;
        }
        System.arraycopy(bArr14, 0, bArr28, i27, i26);
        GF16.encode(bArr28, bArr, i29);
        System.arraycopy(bArr3, 0, bArr, bArr.length - 16, 16);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        byte[] messageHash = getMessageHash(bArr);
        MapGroup1 mapGroup1 = new MapGroup1(this.params);
        byte[] encoded = this.pubKey.getEncoded();
        byte[] bArrCopyOf = Arrays.copyOf(encoded, 16);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 16, encoded.length);
        this.engine.genABQP(mapGroup1, bArrCopyOf);
        byte[][][][] bArr3 = (byte[][][][]) Array.newInstance((Class<?>) Byte.TYPE, this.params.getM(), this.params.getO(), this.params.getO(), this.params.getLsq());
        if ((this.params.getLsq() & 1) == 0) {
            MapGroup1.decodeP(bArrCopyOfRange, 0, bArr3, bArrCopyOfRange.length << 1);
        } else {
            int length = bArrCopyOfRange.length << 1;
            byte[] bArr4 = new byte[length];
            GF16.decode(bArrCopyOfRange, bArr4, length);
            MapGroup1.fillP(bArr4, 0, bArr3, length);
        }
        return verifySignatureCore(messageHash, bArr2, bArrCopyOf, mapGroup1, bArr3);
    }

    boolean verifySignatureCore(byte[] bArr, byte[] bArr2, byte[] bArr3, MapGroup1 mapGroup1, byte[][][][] bArr4) {
        int lsq = this.params.getLsq();
        int o15 = this.params.getO() * lsq;
        int i15 = (o15 + 1) >>> 1;
        int saltLength = this.params.getSaltLength();
        int m15 = this.params.getM();
        int n15 = this.params.getN() * lsq;
        byte[] bArr5 = new byte[i15];
        createSignedHash(bArr3, bArr3.length, bArr, bArr.length, bArr2, (n15 + 1) >>> 1, saltLength, bArr5, i15);
        if ((o15 & 1) != 0) {
            int i16 = i15 - 1;
            bArr5[i16] = (byte) (bArr5[i16] & 15);
        }
        byte[] bArr6 = new byte[n15];
        GF16.decode(bArr2, 0, bArr6, 0, n15);
        int i17 = m15 * lsq;
        byte[] bArr7 = new byte[i17];
        evaluation(bArr7, mapGroup1, bArr4, bArr6);
        byte[] bArr8 = new byte[i15];
        GF16.encode(bArr7, bArr8, i17);
        return Arrays.areEqual(bArr5, bArr8);
    }
}
