package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class RainbowSigner implements MessageSigner {
    private static final int MAXITS = 65536;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private ComputeInField f149548cf = new ComputeInField();
    private Digest hashAlgo;
    private RainbowKeyParameters key;
    private SecureRandom random;
    int signableDocumentLength;
    private Version version;

    /* JADX INFO: renamed from: org.bouncycastle.pqc.crypto.rainbow.RainbowSigner$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version;

        static {
            int[] iArr = new int[Version.values().length];
            $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version = iArr;
            try {
                iArr[Version.CLASSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version[Version.CIRCUMZENITHAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version[Version.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private byte[] genSignature(byte[] bArr) {
        short[] sArr;
        int i15;
        int i16;
        int i17;
        int i18;
        byte[] bArr2 = new byte[this.hashAlgo.getDigestSize()];
        this.hashAlgo.update(bArr, 0, bArr.length);
        this.hashAlgo.doFinal(bArr2, 0);
        int v15 = this.key.getParameters().getV1();
        int o15 = this.key.getParameters().getO1();
        int o16 = this.key.getParameters().getO2();
        int m15 = this.key.getParameters().getM();
        int n15 = this.key.getParameters().getN();
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = (RainbowPrivateKeyParameters) this.key;
        Digest digest = this.hashAlgo;
        this.random = new RainbowDRBG(RainbowUtil.hash(digest, rainbowPrivateKeyParameters.sk_seed, bArr2, new byte[digest.getDigestSize()]), rainbowPrivateKeyParameters.getParameters().getHash_algo());
        short[] sArr2 = new short[v15];
        short[] sArr3 = new short[o15];
        short[] sArr4 = new short[o16];
        Class cls = Short.TYPE;
        short[][] sArr5 = (short[][]) Array.newInstance((Class<?>) cls, o16, o15);
        int i19 = 0;
        short[][] sArr6 = (short[][]) Array.newInstance((Class<?>) cls, o16, o16);
        byte[] bArr3 = new byte[rainbowPrivateKeyParameters.getParameters().getLen_salt()];
        short[] sArr7 = new short[m15];
        short[] sArr8 = new short[o15];
        short[] sArr9 = new short[o16];
        int i25 = 0;
        short[][] sArrInverse = null;
        while (sArrInverse == null && i25 < 65536) {
            byte[] bArr4 = new byte[v15];
            this.random.nextBytes(bArr4);
            int i26 = 0;
            while (true) {
                i17 = i25;
                if (i26 >= v15) {
                    break;
                }
                sArr2[i26] = (short) (bArr4[i26] & 255);
                i26++;
                i25 = i17;
            }
            short[][] sArr10 = (short[][]) Array.newInstance((Class<?>) cls, o15, o15);
            int i27 = 0;
            while (i27 < v15) {
                int i28 = 0;
                while (true) {
                    i18 = i27;
                    if (i28 < o15) {
                        int i29 = 0;
                        while (i29 < o15) {
                            int i35 = i29;
                            int i36 = i28;
                            short sMultElem = GF2Field.multElem(rainbowPrivateKeyParameters.l1_F2[i28][i18][i35], sArr2[i18]);
                            short[] sArr11 = sArr10[i36];
                            sArr11[i35] = GF2Field.addElem(sArr11[i35], sMultElem);
                            i29 = i35 + 1;
                            i28 = i36;
                        }
                        i28++;
                        i27 = i18;
                    }
                }
                i27 = i18 + 1;
            }
            sArrInverse = this.f149548cf.inverse(sArr10);
            i25 = i17 + 1;
        }
        int i37 = i25;
        int i38 = 0;
        while (i38 < o15) {
            int i39 = i38;
            sArr3[i39] = this.f149548cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l1_F1[i39], sArr2);
            i38 = i39 + 1;
        }
        int i45 = 0;
        while (i45 < v15) {
            int i46 = 0;
            while (true) {
                i16 = i45;
                if (i46 < o16) {
                    int i47 = i46;
                    sArr4[i47] = this.f149548cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l2_F1[i47], sArr2);
                    int i48 = 0;
                    while (i48 < o15) {
                        int i49 = i48;
                        short sMultElem2 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F2[i47][i16][i48], sArr2[i16]);
                        short[] sArr12 = sArr5[i47];
                        sArr12[i49] = GF2Field.addElem(sArr12[i49], sMultElem2);
                        i48 = i49 + 1;
                    }
                    int i55 = 0;
                    while (i55 < o16) {
                        int i56 = i55;
                        short sMultElem3 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F3[i47][i16][i55], sArr2[i16]);
                        short[] sArr13 = sArr6[i47];
                        sArr13[i56] = GF2Field.addElem(sArr13[i56], sMultElem3);
                        i55 = i56 + 1;
                    }
                    i46 = i47 + 1;
                    i45 = i16;
                }
            }
            i45 = i16 + 1;
        }
        byte[] bArr5 = new byte[m15];
        short[] sArr14 = sArr8;
        short[] sArrSolveEquation = null;
        int i57 = i37;
        while (true) {
            sArr = sArr2;
            if (sArrSolveEquation != null || i57 >= 65536) {
                break;
            }
            int[] iArr = new int[2];
            iArr[1] = o16;
            iArr[i19] = o16;
            short[][] sArr15 = (short[][]) Array.newInstance((Class<?>) cls, iArr);
            this.random.nextBytes(bArr3);
            short[] sArrMakeMessageRepresentative = makeMessageRepresentative(RainbowUtil.hash(this.hashAlgo, bArr2, bArr3, bArr5));
            byte[] bArr6 = bArr2;
            byte[] bArr7 = bArr5;
            Class cls2 = cls;
            int i58 = i19;
            System.arraycopy(this.f149548cf.addVect(Arrays.copyOf(sArrMakeMessageRepresentative, o15), this.f149548cf.multiplyMatrix(rainbowPrivateKeyParameters.f149542s1, Arrays.copyOfRange(sArrMakeMessageRepresentative, o15, m15))), i58, sArr7, i58, o15);
            System.arraycopy(sArrMakeMessageRepresentative, o15, sArr7, o15, o16);
            short[] sArrMultiplyMatrix = this.f149548cf.multiplyMatrix(sArrInverse, this.f149548cf.addVect(sArr3, Arrays.copyOf(sArr7, o15)));
            short[] sArrMultiplyMatrix2 = this.f149548cf.multiplyMatrix(sArr5, sArrMultiplyMatrix);
            int i59 = 0;
            while (i59 < o16) {
                int i65 = i59;
                sArr9[i65] = this.f149548cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l2_F5[i65], sArrMultiplyMatrix);
                i59 = i65 + 1;
            }
            short[] sArr16 = sArr9;
            short[] sArrAddVect = this.f149548cf.addVect(this.f149548cf.addVect(this.f149548cf.addVect(sArrMultiplyMatrix2, sArr16), sArr4), Arrays.copyOfRange(sArr7, o15, m15));
            int i66 = 0;
            while (i66 < o15) {
                int i67 = 0;
                while (true) {
                    i15 = i66;
                    if (i67 < o16) {
                        int i68 = 0;
                        while (i68 < o16) {
                            int i69 = i68;
                            int i75 = m15;
                            short sMultElem4 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F6[i67][i15][i69], sArrMultiplyMatrix[i15]);
                            short[] sArr17 = sArr15[i67];
                            sArr17[i69] = GF2Field.addElem(sArr17[i69], sMultElem4);
                            i68 = i69 + 1;
                            m15 = i75;
                        }
                        i67++;
                        i66 = i15;
                    }
                }
                i66 = i15 + 1;
            }
            i57++;
            sArrSolveEquation = this.f149548cf.solveEquation(this.f149548cf.addMatrix(sArr15, sArr6), sArrAddVect);
            sArr14 = sArrMultiplyMatrix;
            sArr9 = sArr16;
            sArr2 = sArr;
            bArr2 = bArr6;
            bArr5 = bArr7;
            cls = cls2;
            m15 = m15;
            i19 = 0;
        }
        short[] sArr18 = sArrSolveEquation == null ? new short[o16] : sArrSolveEquation;
        short[] sArrAddVect2 = this.f149548cf.addVect(this.f149548cf.addVect(sArr, this.f149548cf.multiplyMatrix(rainbowPrivateKeyParameters.f149543t1, sArr14)), this.f149548cf.multiplyMatrix(rainbowPrivateKeyParameters.f149545t4, sArr18));
        short[] sArrAddVect3 = this.f149548cf.addVect(sArr14, this.f149548cf.multiplyMatrix(rainbowPrivateKeyParameters.f149544t3, sArr18));
        short[] sArrCopyOf = Arrays.copyOf(sArrAddVect2, n15);
        System.arraycopy(sArrAddVect3, 0, sArrCopyOf, v15, o15);
        System.arraycopy(sArr18, 0, sArrCopyOf, o15 + v15, o16);
        if (i57 != 65536) {
            return Arrays.concatenate(RainbowUtil.convertArray(sArrCopyOf), bArr3);
        }
        throw new IllegalStateException("unable to generate signature - LES not solvable");
    }

    private short[] makeMessageRepresentative(byte[] bArr) {
        int i15 = this.signableDocumentLength;
        short[] sArr = new short[i15];
        int i16 = 0;
        int i17 = 0;
        while (i16 < bArr.length) {
            sArr[i16] = (short) (bArr[i17] & 255);
            i17++;
            i16++;
            if (i16 >= i15) {
                break;
            }
        }
        return sArr;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        return genSignature(bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z15, CipherParameters cipherParameters) {
        RainbowKeyParameters rainbowKeyParameters;
        if (z15) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.random = parametersWithRandom.getRandom();
                rainbowKeyParameters = (RainbowKeyParameters) parametersWithRandom.getParameters();
            } else {
                rainbowKeyParameters = (RainbowKeyParameters) cipherParameters;
                SecureRandom secureRandom = CryptoServicesRegistrar.getSecureRandom();
                byte[] bArr = new byte[rainbowKeyParameters.getParameters().getLen_skseed()];
                secureRandom.nextBytes(bArr);
                this.random = new RainbowDRBG(bArr, rainbowKeyParameters.getParameters().getHash_algo());
            }
            this.version = rainbowKeyParameters.getParameters().getVersion();
            this.key = rainbowKeyParameters;
        } else {
            RainbowKeyParameters rainbowKeyParameters2 = (RainbowKeyParameters) cipherParameters;
            this.key = rainbowKeyParameters2;
            this.version = rainbowKeyParameters2.getParameters().getVersion();
        }
        this.signableDocumentLength = this.key.getDocLength();
        this.hashAlgo = this.key.getParameters().getHash_algo();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        short[] sArrPublicMap;
        byte[] bArr3 = new byte[this.hashAlgo.getDigestSize()];
        this.hashAlgo.update(bArr, 0, bArr.length);
        this.hashAlgo.doFinal(bArr3, 0);
        int m15 = this.key.getParameters().getM();
        int n15 = this.key.getParameters().getN();
        RainbowPublicMap rainbowPublicMap = new RainbowPublicMap(this.key.getParameters());
        short[] sArrMakeMessageRepresentative = makeMessageRepresentative(RainbowUtil.hash(this.hashAlgo, bArr3, Arrays.copyOfRange(bArr2, n15, bArr2.length), new byte[m15]));
        short[] sArrConvertArray = RainbowUtil.convertArray(Arrays.copyOfRange(bArr2, 0, n15));
        int i15 = AnonymousClass1.$SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version[this.version.ordinal()];
        if (i15 == 1) {
            sArrPublicMap = rainbowPublicMap.publicMap((RainbowPublicKeyParameters) this.key, sArrConvertArray);
        } else {
            if (i15 != 2 && i15 != 3) {
                throw new IllegalArgumentException("No valid version. Please choose one of the following: classic, circumzenithal, compressed");
            }
            sArrPublicMap = rainbowPublicMap.publicMap_cyclic((RainbowPublicKeyParameters) this.key, sArrConvertArray);
        }
        return RainbowUtil.equals(sArrMakeMessageRepresentative, sArrPublicMap);
    }
}
