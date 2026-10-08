package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private static final long C_240 = 2004413935125273122L;
    private static final int MAX_ROUNDS = 80;
    private static int[] MOD17 = null;
    private static int[] MOD3 = null;
    private static int[] MOD5 = null;
    private static int[] MOD9 = null;
    private static final int ROUNDS_1024 = 80;
    private static final int ROUNDS_256 = 72;
    private static final int ROUNDS_512 = 72;
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = 2;
    private int blocksizeBytes;
    private int blocksizeWords;
    private ThreefishCipher cipher;
    private long[] currentBlock;
    private boolean forEncryption;

    /* JADX INFO: renamed from: kw, reason: collision with root package name */
    private long[] f149063kw;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long[] f149064t;

    private static final class Threefish1024Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 24;
        private static final int ROTATION_0_1 = 13;
        private static final int ROTATION_0_2 = 8;
        private static final int ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8;
        private static final int ROTATION_0_5 = 17;
        private static final int ROTATION_0_6 = 22;
        private static final int ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38;
        private static final int ROTATION_1_1 = 19;
        private static final int ROTATION_1_2 = 10;
        private static final int ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49;
        private static final int ROTATION_1_5 = 18;
        private static final int ROTATION_1_6 = 23;
        private static final int ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33;
        private static final int ROTATION_2_1 = 4;
        private static final int ROTATION_2_2 = 51;
        private static final int ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34;
        private static final int ROTATION_2_5 = 41;
        private static final int ROTATION_2_6 = 59;
        private static final int ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 20;
        private static final int ROTATION_3_2 = 48;
        private static final int ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47;
        private static final int ROTATION_3_5 = 28;
        private static final int ROTATION_3_6 = 16;
        private static final int ROTATION_3_7 = 25;
        private static final int ROTATION_4_0 = 41;
        private static final int ROTATION_4_1 = 9;
        private static final int ROTATION_4_2 = 37;
        private static final int ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12;
        private static final int ROTATION_4_5 = 47;
        private static final int ROTATION_4_6 = 44;
        private static final int ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16;
        private static final int ROTATION_5_1 = 34;
        private static final int ROTATION_5_2 = 56;
        private static final int ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4;
        private static final int ROTATION_5_5 = 53;
        private static final int ROTATION_5_6 = 42;
        private static final int ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31;
        private static final int ROTATION_6_1 = 44;
        private static final int ROTATION_6_2 = 47;
        private static final int ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19;
        private static final int ROTATION_6_5 = 42;
        private static final int ROTATION_6_6 = 44;
        private static final int ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9;
        private static final int ROTATION_7_1 = 48;
        private static final int ROTATION_7_2 = 35;
        private static final int ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23;
        private static final int ROTATION_7_5 = 31;
        private static final int ROTATION_7_6 = 37;
        private static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f149065kw;
            long[] jArr4 = this.f149066t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j15 = jArr[0];
            int i15 = 1;
            long j16 = jArr[1];
            long j17 = jArr[2];
            long j18 = jArr[3];
            long j19 = jArr[4];
            long j25 = jArr[5];
            long j26 = jArr[6];
            long j27 = jArr[7];
            long j28 = jArr[8];
            int i16 = 9;
            long j29 = jArr[9];
            long j35 = jArr[10];
            long j36 = jArr[11];
            long j37 = jArr[12];
            long j38 = jArr[13];
            long j39 = jArr[14];
            long jXorRotr = jArr[15];
            int i17 = 19;
            while (i17 >= i15) {
                int i18 = iArr[i17];
                int i19 = iArr2[i17];
                int i25 = i18 + 1;
                long j45 = j15 - jArr3[i25];
                int i26 = i18 + 2;
                long j46 = j16 - jArr3[i26];
                int i27 = i18 + 3;
                long j47 = j17 - jArr3[i27];
                int i28 = i18 + 4;
                long j48 = j18 - jArr3[i28];
                int i29 = i18 + 5;
                int i35 = i15;
                long j49 = j19 - jArr3[i29];
                int i36 = i18 + 6;
                long[] jArr5 = jArr3;
                long j55 = j25 - jArr3[i36];
                int i37 = i18 + 7;
                long[] jArr6 = jArr4;
                long j56 = j26 - jArr5[i37];
                int i38 = i18 + 8;
                int[] iArr3 = iArr2;
                long j57 = j27 - jArr5[i38];
                int i39 = i18 + 9;
                long j58 = j28 - jArr5[i39];
                int i45 = i18 + 10;
                long j59 = j29 - jArr5[i45];
                int i46 = i18 + 11;
                long j65 = j35 - jArr5[i46];
                int i47 = i18 + 12;
                long j66 = j36 - jArr5[i47];
                int i48 = i18 + 13;
                long j67 = j37 - jArr5[i48];
                int i49 = i18 + 14;
                int i55 = i19 + 1;
                long j68 = j38 - (jArr5[i49] + jArr6[i55]);
                int i56 = i18 + 15;
                long j69 = j39 - (jArr5[i56] + jArr6[i19 + 2]);
                long j75 = i17;
                long jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr - ((jArr5[i18 + 16] + j75) + 1), i16, j45);
                long j76 = j45 - jXorRotr2;
                long jXorRotr3 = ThreefishEngine.xorRotr(j66, 48, j47);
                long j77 = j47 - jXorRotr3;
                long jXorRotr4 = ThreefishEngine.xorRotr(j68, 35, j56);
                long j78 = j56 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j59, 52, j49);
                long j79 = j49 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j46, 23, j69);
                long j85 = j69 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j55, 31, j58);
                long j86 = j58 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(j48, 37, j65);
                long j87 = j65 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(j57, 20, j67);
                long j88 = j67 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr9, 31, j76);
                long j89 = j76 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr7, 44, j77);
                long j95 = j77 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 47, j79);
                long j96 = j79 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr6, 46, j78);
                long j97 = j78 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr2, 19, j88);
                long j98 = j88 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr4, 42, j85);
                long j99 = j85 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr3, 44, j86);
                long j100 = j86 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr5, 25, j87);
                long j101 = j87 - jXorRotr17;
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr17, 16, j89);
                long j102 = j89 - jXorRotr18;
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr15, 34, j95);
                long j103 = j95 - jXorRotr19;
                long jXorRotr20 = ThreefishEngine.xorRotr(jXorRotr16, 56, j97);
                long j104 = j97 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(jXorRotr14, 51, j96);
                long j105 = j96 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(jXorRotr10, 4, j101);
                long j106 = j101 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(jXorRotr12, 53, j98);
                long j107 = j98 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr11, 42, j99);
                long j108 = j99 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr13, 41, j100);
                long j109 = j100 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr25, 41, j102);
                long j110 = j102 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr23, 9, j103);
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 37, j105);
                long j111 = j105 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr22, 31, j104);
                long j112 = j104 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr18, 12, j109);
                long j113 = j109 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr20, 47, j106);
                long j114 = j106 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr19, 44, j107);
                long j115 = j107 - jXorRotr32;
                long jXorRotr33 = ThreefishEngine.xorRotr(jXorRotr21, 30, j108);
                long j116 = j108 - jXorRotr33;
                long j117 = j110 - jArr5[i18];
                long j118 = jXorRotr26 - jArr5[i25];
                long j119 = (j103 - jXorRotr27) - jArr5[i26];
                long j120 = jXorRotr27 - jArr5[i27];
                long j121 = j111 - jArr5[i28];
                long j122 = jXorRotr28 - jArr5[i29];
                long j123 = j112 - jArr5[i36];
                long j124 = jXorRotr29 - jArr5[i37];
                long j125 = j113 - jArr5[i38];
                long j126 = jXorRotr30 - jArr5[i39];
                long j127 = j114 - jArr5[i45];
                long j128 = jXorRotr31 - jArr5[i46];
                long j129 = j115 - jArr5[i47];
                long j130 = jXorRotr32 - (jArr5[i48] + jArr6[i19]);
                long j131 = j116 - (jArr5[i49] + jArr6[i55]);
                long jXorRotr34 = ThreefishEngine.xorRotr(jXorRotr33 - (jArr5[i56] + j75), 5, j117);
                long j132 = j117 - jXorRotr34;
                long jXorRotr35 = ThreefishEngine.xorRotr(j128, 20, j119);
                long j133 = j119 - jXorRotr35;
                long jXorRotr36 = ThreefishEngine.xorRotr(j130, 48, j123);
                long j134 = j123 - jXorRotr36;
                long jXorRotr37 = ThreefishEngine.xorRotr(j126, 41, j121);
                long j135 = j121 - jXorRotr37;
                long jXorRotr38 = ThreefishEngine.xorRotr(j118, 47, j131);
                long j136 = j131 - jXorRotr38;
                long jXorRotr39 = ThreefishEngine.xorRotr(j122, 28, j125);
                long j137 = j125 - jXorRotr39;
                long jXorRotr40 = ThreefishEngine.xorRotr(j120, 16, j127);
                long j138 = j127 - jXorRotr40;
                long jXorRotr41 = ThreefishEngine.xorRotr(j124, 25, j129);
                long j139 = j129 - jXorRotr41;
                long jXorRotr42 = ThreefishEngine.xorRotr(jXorRotr41, 33, j132);
                long j140 = j132 - jXorRotr42;
                long jXorRotr43 = ThreefishEngine.xorRotr(jXorRotr39, 4, j133);
                long j141 = j133 - jXorRotr43;
                long jXorRotr44 = ThreefishEngine.xorRotr(jXorRotr40, 51, j135);
                long j142 = j135 - jXorRotr44;
                long jXorRotr45 = ThreefishEngine.xorRotr(jXorRotr38, 13, j134);
                long j143 = j134 - jXorRotr45;
                long jXorRotr46 = ThreefishEngine.xorRotr(jXorRotr34, 34, j139);
                long j144 = j139 - jXorRotr46;
                long jXorRotr47 = ThreefishEngine.xorRotr(jXorRotr36, 41, j136);
                long j145 = j136 - jXorRotr47;
                long jXorRotr48 = ThreefishEngine.xorRotr(jXorRotr35, 59, j137);
                long j146 = j137 - jXorRotr48;
                long jXorRotr49 = ThreefishEngine.xorRotr(jXorRotr37, 17, j138);
                long j147 = j138 - jXorRotr49;
                long jXorRotr50 = ThreefishEngine.xorRotr(jXorRotr49, 38, j140);
                long j148 = j140 - jXorRotr50;
                long jXorRotr51 = ThreefishEngine.xorRotr(jXorRotr47, 19, j141);
                long j149 = j141 - jXorRotr51;
                long jXorRotr52 = ThreefishEngine.xorRotr(jXorRotr48, 10, j143);
                long j150 = j143 - jXorRotr52;
                long jXorRotr53 = ThreefishEngine.xorRotr(jXorRotr46, 55, j142);
                long j151 = j142 - jXorRotr53;
                long jXorRotr54 = ThreefishEngine.xorRotr(jXorRotr42, ROTATION_1_4, j147);
                long j152 = j147 - jXorRotr54;
                long jXorRotr55 = ThreefishEngine.xorRotr(jXorRotr44, 18, j144);
                long j153 = j144 - jXorRotr55;
                long jXorRotr56 = ThreefishEngine.xorRotr(jXorRotr43, 23, j145);
                long j154 = j145 - jXorRotr56;
                long jXorRotr57 = ThreefishEngine.xorRotr(jXorRotr45, 52, j146);
                long j155 = j146 - jXorRotr57;
                long jXorRotr58 = ThreefishEngine.xorRotr(jXorRotr57, 24, j148);
                long j156 = j148 - jXorRotr58;
                long jXorRotr59 = ThreefishEngine.xorRotr(jXorRotr55, 13, j149);
                j17 = j149 - jXorRotr59;
                long jXorRotr60 = ThreefishEngine.xorRotr(jXorRotr56, 8, j151);
                long j157 = j151 - jXorRotr60;
                long jXorRotr61 = ThreefishEngine.xorRotr(jXorRotr54, 47, j150);
                long j158 = j150 - jXorRotr61;
                long jXorRotr62 = ThreefishEngine.xorRotr(jXorRotr50, 8, j155);
                long j159 = j155 - jXorRotr62;
                long jXorRotr63 = ThreefishEngine.xorRotr(jXorRotr52, 17, j152);
                long j160 = j152 - jXorRotr63;
                long jXorRotr64 = ThreefishEngine.xorRotr(jXorRotr51, 22, j153);
                j37 = j153 - jXorRotr64;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr53, 37, j154);
                j39 = j154 - jXorRotr;
                j36 = jXorRotr63;
                j35 = j160;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                j26 = j158;
                j25 = jXorRotr60;
                j15 = j156;
                i16 = 9;
                j18 = jXorRotr59;
                j38 = jXorRotr64;
                j27 = jXorRotr61;
                i17 -= 2;
                j29 = jXorRotr62;
                j19 = j157;
                j16 = jXorRotr58;
                i15 = i35;
                j28 = j159;
                iArr2 = iArr3;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i57 = i15;
            long j161 = j15 - jArr7[0];
            long j162 = j16 - jArr7[i57];
            long j163 = j17 - jArr7[2];
            long j164 = j18 - jArr7[3];
            long j165 = j19 - jArr7[4];
            long j166 = j25 - jArr7[5];
            long j167 = j26 - jArr7[6];
            long j168 = j27 - jArr7[7];
            long j169 = j28 - jArr7[8];
            long j170 = j29 - jArr7[9];
            long j171 = j35 - jArr7[10];
            long j172 = j36 - jArr7[11];
            long j173 = j37 - jArr7[12];
            long j174 = j38 - (jArr7[13] + jArr8[0]);
            long j175 = j39 - (jArr7[14] + jArr8[i57]);
            long j176 = jXorRotr - jArr7[15];
            jArr2[0] = j161;
            jArr2[i57] = j162;
            jArr2[2] = j163;
            jArr2[3] = j164;
            jArr2[4] = j165;
            jArr2[5] = j166;
            jArr2[6] = j167;
            jArr2[7] = j168;
            jArr2[8] = j169;
            jArr2[9] = j170;
            jArr2[10] = j171;
            jArr2[11] = j172;
            jArr2[12] = j173;
            jArr2[13] = j174;
            jArr2[14] = j175;
            jArr2[15] = j176;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f149065kw;
            long[] jArr4 = this.f149066t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j15 = jArr[0];
            long j16 = jArr[1];
            long j17 = jArr[2];
            long j18 = jArr[3];
            long j19 = jArr[4];
            long j25 = jArr[5];
            long j26 = jArr[6];
            long j27 = jArr[7];
            long j28 = jArr[8];
            long j29 = jArr[9];
            long j35 = jArr[10];
            long j36 = jArr[11];
            int i15 = 9;
            long j37 = jArr[12];
            int i16 = 12;
            int i17 = 13;
            long j38 = jArr[13];
            long j39 = jArr[14];
            long j45 = jArr[15];
            long j46 = j15 + jArr3[0];
            long j47 = j16 + jArr3[1];
            long j48 = j17 + jArr3[2];
            long j49 = j18 + jArr3[3];
            long j55 = j19 + jArr3[4];
            long j56 = j25 + jArr3[5];
            long j57 = j26 + jArr3[6];
            long j58 = j27 + jArr3[7];
            long j59 = j28 + jArr3[8];
            long j65 = j29 + jArr3[9];
            long j66 = j35 + jArr3[10];
            long j67 = j36 + jArr3[11];
            long j68 = j37 + jArr3[12];
            long j69 = j38 + jArr3[13] + jArr4[0];
            long j75 = j39 + jArr3[14] + jArr4[1];
            long j76 = j56;
            long j77 = j58;
            long j78 = j65;
            long j79 = j67;
            long j85 = j69;
            long j86 = j45 + jArr3[15];
            long j87 = j55;
            long j88 = j46;
            long j89 = j49;
            int i18 = 1;
            while (i18 < 20) {
                int i19 = iArr[i18];
                int i25 = iArr2[i18];
                long j95 = j89;
                long j96 = j88 + j47;
                long jRotlXor = ThreefishEngine.rotlXor(j47, 24, j96);
                long j97 = j48 + j95;
                long jRotlXor2 = ThreefishEngine.rotlXor(j95, i17, j97);
                int i26 = i18;
                long j98 = j76;
                long j99 = j87 + j98;
                long jRotlXor3 = ThreefishEngine.rotlXor(j98, 8, j99);
                long[] jArr5 = jArr3;
                long j100 = j77;
                long j101 = j57 + j100;
                long[] jArr6 = jArr4;
                long jRotlXor4 = ThreefishEngine.rotlXor(j100, 47, j101);
                long j102 = j78;
                long j103 = j59 + j102;
                int[] iArr3 = iArr2;
                long jRotlXor5 = ThreefishEngine.rotlXor(j102, 8, j103);
                long j104 = j79;
                long j105 = j66 + j104;
                long jRotlXor6 = ThreefishEngine.rotlXor(j104, 17, j105);
                long j106 = j85;
                long j107 = j68 + j106;
                long jRotlXor7 = ThreefishEngine.rotlXor(j106, 22, j107);
                long j108 = j86;
                long j109 = j75 + j108;
                long jRotlXor8 = ThreefishEngine.rotlXor(j108, 37, j109);
                long j110 = j96 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 38, j110);
                long j111 = j97 + jRotlXor7;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor7, 19, j111);
                long j112 = j101 + jRotlXor6;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor6, 10, j112);
                long j113 = j99 + jRotlXor8;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor8, 55, j113);
                long j114 = j105 + jRotlXor4;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor4, ROTATION_1_4, j114);
                long j115 = j107 + jRotlXor2;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor2, 18, j115);
                long j116 = j109 + jRotlXor3;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor3, 23, j116);
                long j117 = j103 + jRotlXor;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor, 52, j117);
                long j118 = j110 + jRotlXor13;
                long jRotlXor17 = ThreefishEngine.rotlXor(jRotlXor13, 33, j118);
                long j119 = j111 + jRotlXor15;
                long jRotlXor18 = ThreefishEngine.rotlXor(jRotlXor15, 4, j119);
                long j120 = j113 + jRotlXor14;
                long jRotlXor19 = ThreefishEngine.rotlXor(jRotlXor14, 51, j120);
                long j121 = j112 + jRotlXor16;
                long jRotlXor20 = ThreefishEngine.rotlXor(jRotlXor16, 13, j121);
                long j122 = j115 + jRotlXor12;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor12, 34, j122);
                long j123 = j116 + jRotlXor10;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor10, 41, j123);
                long j124 = j117 + jRotlXor11;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor11, 59, j124);
                long j125 = j114 + jRotlXor9;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor9, 17, j125);
                long j126 = j118 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 5, j126);
                long j127 = j119 + jRotlXor23;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor23, 20, j127);
                long j128 = j121 + jRotlXor22;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor22, 48, j128);
                long j129 = j120 + jRotlXor24;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor24, 41, j129);
                long j130 = j123 + jRotlXor20;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor20, 47, j130);
                long j131 = j124 + jRotlXor18;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor18, 28, j131);
                long j132 = j125 + jRotlXor19;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor19, 16, j132);
                long j133 = j122 + jRotlXor17;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor17, 25, j133);
                long j134 = j126 + jArr5[i19];
                int i27 = i19 + 1;
                long j135 = jRotlXor29 + jArr5[i27];
                int i28 = i19 + 2;
                long j136 = j127 + jArr5[i28];
                int i29 = i19 + 3;
                long j137 = jRotlXor31 + jArr5[i29];
                int i35 = i19 + 4;
                long j138 = j129 + jArr5[i35];
                int i36 = i19 + 5;
                long j139 = jRotlXor30 + jArr5[i36];
                int i37 = i19 + 6;
                long j140 = j128 + jArr5[i37];
                int i38 = i19 + 7;
                long j141 = jRotlXor32 + jArr5[i38];
                int i39 = i19 + 8;
                long j142 = j131 + jArr5[i39];
                int i45 = i19 + 9;
                long j143 = jRotlXor28 + jArr5[i45];
                int i46 = i19 + 10;
                long j144 = j132 + jArr5[i46];
                int i47 = i19 + 11;
                long j145 = jRotlXor26 + jArr5[i47];
                int i48 = i19 + 12;
                long j146 = j133 + jArr5[i48];
                int i49 = i19 + 13;
                long j147 = jRotlXor27 + jArr5[i49] + jArr6[i25];
                int i55 = i19 + 14;
                int i56 = i25 + 1;
                long j148 = j130 + jArr5[i55] + jArr6[i56];
                int i57 = i19 + 15;
                long j149 = i26;
                long j150 = jRotlXor25 + jArr5[i57] + j149;
                long j151 = j134 + j135;
                long jRotlXor33 = ThreefishEngine.rotlXor(j135, 41, j151);
                long j152 = j136 + j137;
                long jRotlXor34 = ThreefishEngine.rotlXor(j137, i15, j152);
                long j153 = j138 + j139;
                long jRotlXor35 = ThreefishEngine.rotlXor(j139, 37, j153);
                long j154 = j140 + j141;
                long jRotlXor36 = ThreefishEngine.rotlXor(j141, 31, j154);
                long j155 = j142 + j143;
                long jRotlXor37 = ThreefishEngine.rotlXor(j143, i16, j155);
                long j156 = j144 + j145;
                long jRotlXor38 = ThreefishEngine.rotlXor(j145, 47, j156);
                long j157 = j146 + j147;
                long jRotlXor39 = ThreefishEngine.rotlXor(j147, 44, j157);
                long j158 = j148 + j150;
                long jRotlXor40 = ThreefishEngine.rotlXor(j150, 30, j158);
                long j159 = j151 + jRotlXor37;
                long jRotlXor41 = ThreefishEngine.rotlXor(jRotlXor37, 16, j159);
                long j160 = j152 + jRotlXor39;
                long jRotlXor42 = ThreefishEngine.rotlXor(jRotlXor39, 34, j160);
                long j161 = j154 + jRotlXor38;
                long jRotlXor43 = ThreefishEngine.rotlXor(jRotlXor38, 56, j161);
                long j162 = j153 + jRotlXor40;
                long jRotlXor44 = ThreefishEngine.rotlXor(jRotlXor40, 51, j162);
                long j163 = j156 + jRotlXor36;
                long jRotlXor45 = ThreefishEngine.rotlXor(jRotlXor36, 4, j163);
                long j164 = j157 + jRotlXor34;
                long jRotlXor46 = ThreefishEngine.rotlXor(jRotlXor34, 53, j164);
                long j165 = j158 + jRotlXor35;
                long jRotlXor47 = ThreefishEngine.rotlXor(jRotlXor35, 42, j165);
                long j166 = j155 + jRotlXor33;
                long jRotlXor48 = ThreefishEngine.rotlXor(jRotlXor33, 41, j166);
                long j167 = j159 + jRotlXor45;
                long jRotlXor49 = ThreefishEngine.rotlXor(jRotlXor45, 31, j167);
                long j168 = j160 + jRotlXor47;
                long jRotlXor50 = ThreefishEngine.rotlXor(jRotlXor47, 44, j168);
                long j169 = j162 + jRotlXor46;
                long jRotlXor51 = ThreefishEngine.rotlXor(jRotlXor46, 47, j169);
                long j170 = j161 + jRotlXor48;
                long jRotlXor52 = ThreefishEngine.rotlXor(jRotlXor48, 46, j170);
                long j171 = j164 + jRotlXor44;
                long jRotlXor53 = ThreefishEngine.rotlXor(jRotlXor44, 19, j171);
                long j172 = j165 + jRotlXor42;
                long jRotlXor54 = ThreefishEngine.rotlXor(jRotlXor42, 42, j172);
                long j173 = j166 + jRotlXor43;
                long jRotlXor55 = ThreefishEngine.rotlXor(jRotlXor43, 44, j173);
                long j174 = j163 + jRotlXor41;
                long jRotlXor56 = ThreefishEngine.rotlXor(jRotlXor41, 25, j174);
                long j175 = j167 + jRotlXor53;
                long jRotlXor57 = ThreefishEngine.rotlXor(jRotlXor53, 9, j175);
                long j176 = j168 + jRotlXor55;
                long jRotlXor58 = ThreefishEngine.rotlXor(jRotlXor55, 48, j176);
                long j177 = j170 + jRotlXor54;
                long jRotlXor59 = ThreefishEngine.rotlXor(jRotlXor54, 35, j177);
                long j178 = j169 + jRotlXor56;
                long jRotlXor60 = ThreefishEngine.rotlXor(jRotlXor56, 52, j178);
                long j179 = j172 + jRotlXor52;
                long jRotlXor61 = ThreefishEngine.rotlXor(jRotlXor52, 23, j179);
                long j180 = j173 + jRotlXor50;
                long jRotlXor62 = ThreefishEngine.rotlXor(jRotlXor50, 31, j180);
                long j181 = j174 + jRotlXor51;
                long jRotlXor63 = ThreefishEngine.rotlXor(jRotlXor51, 37, j181);
                long j182 = j171 + jRotlXor49;
                long jRotlXor64 = ThreefishEngine.rotlXor(jRotlXor49, 20, j182);
                long j183 = jArr5[i27] + j175;
                long j184 = jRotlXor61 + jArr5[i28];
                long j185 = j176 + jArr5[i29];
                long j186 = jRotlXor63 + jArr5[i35];
                long j187 = j178 + jArr5[i36];
                long j188 = jRotlXor62 + jArr5[i37];
                long j189 = j177 + jArr5[i38];
                long j190 = jRotlXor64 + jArr5[i39];
                long j191 = j180 + jArr5[i45];
                j78 = jRotlXor60 + jArr5[i46];
                long j192 = j181 + jArr5[i47];
                long j193 = jRotlXor58 + jArr5[i48];
                j68 = j182 + jArr5[i49];
                j85 = jRotlXor59 + jArr5[i55] + jArr6[i56];
                long j194 = j179 + jArr5[i57] + jArr6[i25 + 2];
                j86 = jRotlXor57 + jArr5[i19 + 16] + j149 + 1;
                j57 = j189;
                j59 = j191;
                j87 = j187;
                j47 = j184;
                j48 = j185;
                i18 = i26 + 2;
                j89 = j186;
                j66 = j192;
                j79 = j193;
                j76 = j188;
                i17 = 13;
                i15 = 9;
                i16 = 12;
                j77 = j190;
                j88 = j183;
                j75 = j194;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                iArr2 = iArr3;
            }
            jArr2[0] = j88;
            jArr2[1] = j47;
            jArr2[2] = j48;
            jArr2[3] = j89;
            jArr2[4] = j87;
            jArr2[5] = j76;
            jArr2[6] = j57;
            jArr2[7] = j77;
            jArr2[8] = j59;
            jArr2[9] = j78;
            jArr2[10] = j66;
            jArr2[11] = j79;
            jArr2[12] = j68;
            jArr2[13] = j85;
            jArr2[14] = j75;
            jArr2[15] = j86;
        }
    }

    private static final class Threefish256Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 14;
        private static final int ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52;
        private static final int ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23;
        private static final int ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 37;
        private static final int ROTATION_4_0 = 25;
        private static final int ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46;
        private static final int ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58;
        private static final int ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32;
        private static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f149065kw;
            long[] jArr4 = this.f149066t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j15 = jArr[0];
            int i15 = 1;
            long j16 = jArr[1];
            char c15 = 2;
            long j17 = jArr[2];
            long jXorRotr = jArr[3];
            int i16 = 17;
            while (i16 >= i15) {
                int i17 = iArr[i16];
                int i18 = iArr2[i16];
                int i19 = i17 + 1;
                long j18 = j15 - jArr3[i19];
                int i25 = i17 + 2;
                int i26 = i18 + 1;
                long j19 = j16 - (jArr3[i25] + jArr4[i26]);
                int i27 = i17 + 3;
                long j25 = j17 - (jArr3[i27] + jArr4[i18 + 2]);
                int i28 = i15;
                long j26 = i16;
                char c16 = c15;
                long jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr - ((jArr3[i17 + 4] + j26) + 1), 32, j18);
                long j27 = j18 - jXorRotr2;
                long[] jArr5 = jArr3;
                long jXorRotr3 = ThreefishEngine.xorRotr(j19, 32, j25);
                long j28 = j25 - jXorRotr3;
                long[] jArr6 = jArr4;
                long jXorRotr4 = ThreefishEngine.xorRotr(jXorRotr3, 58, j27);
                long j29 = j27 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(jXorRotr2, 22, j28);
                long j35 = j28 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(jXorRotr5, 46, j29);
                long j36 = j29 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(jXorRotr4, 12, j35);
                long j37 = j35 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr7, 25, j36);
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr6, 33, j37);
                long j38 = (j36 - jXorRotr8) - jArr5[i17];
                long j39 = jXorRotr8 - (jArr5[i19] + jArr6[i18]);
                long j45 = (j37 - jXorRotr9) - (jArr5[i25] + jArr6[i26]);
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr9 - (jArr5[i27] + j26), 5, j38);
                long j46 = j38 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(j39, 37, j45);
                long j47 = j45 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr11, 23, j46);
                long j48 = j46 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr10, 40, j47);
                long j49 = j47 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr13, 52, j48);
                long j55 = j48 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr12, 57, j49);
                long j56 = j49 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr15, 14, j55);
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr14, 16, j56);
                j17 = j56 - jXorRotr;
                i16 -= 2;
                j16 = jXorRotr16;
                i15 = i28;
                jArr3 = jArr5;
                c15 = c16;
                j15 = j55 - jXorRotr16;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i29 = i15;
            char c17 = c15;
            long j57 = j15 - jArr7[0];
            long j58 = j16 - (jArr7[i29] + jArr8[0]);
            long j59 = j17 - (jArr7[c17] + jArr8[i29]);
            long j65 = jXorRotr - jArr7[3];
            jArr2[0] = j57;
            jArr2[i29] = j58;
            jArr2[c17] = j59;
            jArr2[3] = j65;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f149065kw;
            long[] jArr4 = this.f149066t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j15 = jArr[0];
            boolean z15 = true;
            long j16 = jArr[1];
            long j17 = jArr[2];
            char c15 = 3;
            long j18 = jArr[3];
            long j19 = j15 + jArr3[0];
            long j25 = j16 + jArr3[1] + jArr4[0];
            int i15 = 1;
            long j26 = j17 + jArr3[2] + jArr4[1];
            long j27 = j18 + jArr3[3];
            while (i15 < 18) {
                int i16 = iArr[i15];
                int i17 = iArr2[i15];
                long j28 = j19 + j25;
                boolean z16 = z15;
                long jRotlXor = ThreefishEngine.rotlXor(j25, 14, j28);
                long j29 = j26 + j27;
                long jRotlXor2 = ThreefishEngine.rotlXor(j27, 16, j29);
                long[] jArr5 = jArr3;
                long j35 = j28 + jRotlXor2;
                long jRotlXor3 = ThreefishEngine.rotlXor(jRotlXor2, 52, j35);
                long j36 = j29 + jRotlXor;
                long jRotlXor4 = ThreefishEngine.rotlXor(jRotlXor, 57, j36);
                long j37 = j35 + jRotlXor4;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor4, 23, j37);
                long j38 = j36 + jRotlXor3;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor3, 40, j38);
                long j39 = j37 + jRotlXor6;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor6, 5, j39);
                long j45 = j38 + jRotlXor5;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor5, 37, j45);
                long j46 = j39 + jArr5[i16];
                int i18 = i16 + 1;
                long j47 = jRotlXor8 + jArr5[i18] + jArr4[i17];
                int i19 = i16 + 2;
                int i25 = i17 + 1;
                long j48 = j45 + jArr5[i19] + jArr4[i25];
                int i26 = i16 + 3;
                long j49 = i15;
                long j55 = jRotlXor7 + jArr5[i26] + j49;
                long j56 = j46 + j47;
                long jRotlXor9 = ThreefishEngine.rotlXor(j47, 25, j56);
                long j57 = j48 + j55;
                long jRotlXor10 = ThreefishEngine.rotlXor(j55, 33, j57);
                long j58 = j56 + jRotlXor10;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor10, 46, j58);
                long j59 = j57 + jRotlXor9;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor9, 12, j59);
                long j65 = j58 + jRotlXor12;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor12, 58, j65);
                long j66 = j59 + jRotlXor11;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor11, 22, j66);
                long j67 = j65 + jRotlXor14;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor14, 32, j67);
                long j68 = j66 + jRotlXor13;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor13, 32, j68);
                long j69 = j67 + jArr5[i18];
                long j75 = jRotlXor16 + jArr5[i19] + jArr4[i25];
                j26 = j68 + jArr5[i26] + jArr4[i17 + 2];
                j27 = jRotlXor15 + jArr5[i16 + 4] + j49 + 1;
                i15 += 2;
                j25 = j75;
                z15 = z16;
                c15 = c15;
                j19 = j69;
                jArr3 = jArr5;
            }
            jArr2[0] = j19;
            jArr2[z15 ? 1 : 0] = j25;
            jArr2[2] = j26;
            jArr2[c15] = j27;
        }
    }

    private static final class Threefish512Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 46;
        private static final int ROTATION_0_1 = 36;
        private static final int ROTATION_0_2 = 19;
        private static final int ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33;
        private static final int ROTATION_1_1 = 27;
        private static final int ROTATION_1_2 = 14;
        private static final int ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17;
        private static final int ROTATION_2_1 = 49;
        private static final int ROTATION_2_2 = 36;
        private static final int ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44;
        private static final int ROTATION_3_1 = 9;
        private static final int ROTATION_3_2 = 54;
        private static final int ROTATION_3_3 = 56;
        private static final int ROTATION_4_0 = 39;
        private static final int ROTATION_4_1 = 30;
        private static final int ROTATION_4_2 = 34;
        private static final int ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13;
        private static final int ROTATION_5_1 = 50;
        private static final int ROTATION_5_2 = 10;
        private static final int ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25;
        private static final int ROTATION_6_1 = 29;
        private static final int ROTATION_6_2 = 39;
        private static final int ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8;
        private static final int ROTATION_7_1 = 35;
        private static final int ROTATION_7_2 = 56;
        private static final int ROTATION_7_3 = 22;

        protected Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f149065kw;
            long[] jArr4 = this.f149066t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            char c15 = 5;
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j15 = jArr[0];
            int i15 = 1;
            long j16 = jArr[1];
            char c16 = 2;
            long j17 = jArr[2];
            long jXorRotr = jArr[3];
            long j18 = jArr[4];
            long jXorRotr2 = jArr[5];
            long j19 = jArr[6];
            long jXorRotr3 = jArr[7];
            int i16 = 17;
            while (i16 >= i15) {
                int i17 = iArr[i16];
                int i18 = iArr2[i16];
                int i19 = i17 + 1;
                long j25 = j15 - jArr3[i19];
                int i25 = i17 + 2;
                long j26 = j16 - jArr3[i25];
                int i26 = i17 + 3;
                long j27 = j17 - jArr3[i26];
                int i27 = i17 + 4;
                long j28 = jXorRotr - jArr3[i27];
                int i28 = i17 + 5;
                char c17 = c16;
                long j29 = j18 - jArr3[i28];
                int i29 = i17 + 6;
                int i35 = i18 + 1;
                int i36 = i15;
                long j35 = jXorRotr2 - (jArr3[i29] + jArr4[i35]);
                int i37 = i17 + 7;
                long[] jArr5 = jArr3;
                long j36 = j19 - (jArr3[i37] + jArr4[i18 + 2]);
                long[] jArr6 = jArr4;
                long j37 = i16;
                long j38 = jXorRotr3 - ((jArr5[i17 + 8] + j37) + 1);
                int[] iArr3 = iArr2;
                long jXorRotr4 = ThreefishEngine.xorRotr(j26, 8, j36);
                long j39 = j36 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j38, 35, j25);
                long j45 = j25 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j35, 56, j27);
                long j46 = j27 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j28, 22, j29);
                long j47 = j29 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr4, 25, j47);
                long j48 = j47 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr7, 29, j39);
                long j49 = j39 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr6, 39, j45);
                long j55 = j45 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr5, 43, j46);
                long j56 = j46 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 13, j56);
                long j57 = j56 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr11, 50, j48);
                long j58 = j48 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr10, 10, j49);
                long j59 = j49 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr9, 17, j55);
                long j65 = j55 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr12, 39, j65);
                long j66 = j65 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr15, 30, j57);
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr14, 34, j58);
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr13, 24, j59);
                long j67 = j59 - jXorRotr19;
                long j68 = j66 - jArr5[i17];
                long j69 = jXorRotr16 - jArr5[i19];
                long j75 = (j57 - jXorRotr17) - jArr5[i25];
                long j76 = jXorRotr17 - jArr5[i26];
                long j77 = (j58 - jXorRotr18) - jArr5[i27];
                long j78 = jXorRotr18 - (jArr5[i28] + jArr6[i18]);
                long j79 = j67 - (jArr5[i29] + jArr6[i35]);
                long j85 = jXorRotr19 - (jArr5[i37] + j37);
                long jXorRotr20 = ThreefishEngine.xorRotr(j69, 44, j79);
                long j86 = j79 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(j85, 9, j68);
                long j87 = j68 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(j78, 54, j75);
                long j88 = j75 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(j76, 56, j77);
                long j89 = j77 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr20, 17, j89);
                long j95 = j89 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr23, ROTATION_2_1, j86);
                long j96 = j86 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr22, 36, j87);
                long j97 = j87 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr21, 39, j88);
                long j98 = j88 - jXorRotr27;
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 33, j98);
                long j99 = j98 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr27, 27, j95);
                long j100 = j95 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr26, 14, j96);
                long j101 = j96 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr25, 42, j97);
                long j102 = j97 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr28, 46, j102);
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr31, 36, j99);
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr30, 19, j100);
                long j103 = j100 - jXorRotr2;
                jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr29, 37, j101);
                j19 = j101 - jXorRotr3;
                j17 = j99 - jXorRotr;
                j16 = jXorRotr32;
                i16 -= 2;
                j15 = j102 - jXorRotr32;
                i15 = i36;
                jArr3 = jArr5;
                c15 = c15;
                c16 = c17;
                iArr2 = iArr3;
                j18 = j103;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            char c18 = c15;
            int i38 = i15;
            char c19 = c16;
            long j104 = j15 - jArr7[0];
            long j105 = j16 - jArr7[i38];
            long j106 = j17 - jArr7[c19];
            long j107 = jXorRotr - jArr7[3];
            long j108 = j18 - jArr7[4];
            long j109 = jXorRotr2 - (jArr7[c18] + jArr8[0]);
            long j110 = j19 - (jArr7[6] + jArr8[i38]);
            long j111 = jXorRotr3 - jArr7[7];
            jArr2[0] = j104;
            jArr2[i38] = j105;
            jArr2[c19] = j106;
            jArr2[3] = j107;
            jArr2[4] = j108;
            jArr2[c18] = j109;
            jArr2[6] = j110;
            jArr2[7] = j111;
        }

        @Override // org.bouncycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f149065kw;
            long[] jArr4 = this.f149066t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j15 = jArr[0];
            long j16 = jArr[1];
            long j17 = jArr[2];
            long j18 = jArr[3];
            long j19 = jArr[4];
            long j25 = jArr[5];
            long j26 = jArr[6];
            long j27 = jArr[7];
            long j28 = j15 + jArr3[0];
            long j29 = j16 + jArr3[1];
            long j35 = j17 + jArr3[2];
            long j36 = j18 + jArr3[3];
            long j37 = j19 + jArr3[4];
            long j38 = j25 + jArr3[5] + jArr4[0];
            long j39 = j26 + jArr3[6] + jArr4[1];
            int i15 = 1;
            long j45 = j28;
            long j46 = j36;
            long j47 = j27 + jArr3[7];
            long j48 = j39;
            long j49 = j35;
            long j55 = j38;
            long j56 = j37;
            while (i15 < 18) {
                int i16 = iArr[i15];
                int i17 = iArr2[i15];
                long j57 = j46;
                long j58 = j45 + j29;
                long jRotlXor = ThreefishEngine.rotlXor(j29, 46, j58);
                long[] jArr5 = jArr3;
                long j59 = j49 + j57;
                long[] jArr6 = jArr4;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long jRotlXor2 = ThreefishEngine.rotlXor(j57, 36, j59);
                long j65 = j56 + j55;
                long jRotlXor3 = ThreefishEngine.rotlXor(j55, 19, j65);
                long j66 = j48 + j47;
                long jRotlXor4 = ThreefishEngine.rotlXor(j47, 37, j66);
                long j67 = j59 + jRotlXor;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor, 33, j67);
                long j68 = j65 + jRotlXor4;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor4, 27, j68);
                long j69 = j66 + jRotlXor3;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor3, 14, j69);
                long j75 = j58 + jRotlXor2;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor2, 42, j75);
                long j76 = j68 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 17, j76);
                long j77 = j69 + jRotlXor8;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor8, ROTATION_2_1, j77);
                long j78 = j75 + jRotlXor7;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor7, 36, j78);
                long j79 = j67 + jRotlXor6;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor6, 39, j79);
                int i18 = i15;
                long j85 = j77 + jRotlXor9;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor9, 44, j85);
                long j86 = j78 + jRotlXor12;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor12, 9, j86);
                long j87 = j79 + jRotlXor11;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor11, 54, j87);
                long j88 = j76 + jRotlXor10;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor10, 56, j88);
                long j89 = j86 + jArr5[i16];
                int i19 = i16 + 1;
                long j95 = jRotlXor13 + jArr5[i19];
                int i25 = i16 + 2;
                long j96 = j87 + jArr5[i25];
                int i26 = i16 + 3;
                long j97 = jRotlXor16 + jArr5[i26];
                int i27 = i16 + 4;
                long j98 = j88 + jArr5[i27];
                int i28 = i16 + 5;
                long j99 = jRotlXor15 + jArr5[i28] + jArr6[i17];
                int i29 = i16 + 6;
                int i35 = i17 + 1;
                long j100 = j85 + jArr5[i29] + jArr6[i35];
                int i36 = i16 + 7;
                long j101 = i18;
                long j102 = jRotlXor14 + jArr5[i36] + j101;
                long j103 = j89 + j95;
                long jRotlXor17 = ThreefishEngine.rotlXor(j95, 39, j103);
                long j104 = j96 + j97;
                long jRotlXor18 = ThreefishEngine.rotlXor(j97, 30, j104);
                long j105 = j98 + j99;
                long jRotlXor19 = ThreefishEngine.rotlXor(j99, 34, j105);
                long j106 = j100 + j102;
                long jRotlXor20 = ThreefishEngine.rotlXor(j102, 24, j106);
                long j107 = j104 + jRotlXor17;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor17, 13, j107);
                long j108 = j105 + jRotlXor20;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor20, 50, j108);
                long j109 = j106 + jRotlXor19;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor19, 10, j109);
                long j110 = j103 + jRotlXor18;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor18, 17, j110);
                long j111 = j108 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 25, j111);
                long j112 = j109 + jRotlXor24;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor24, 29, j112);
                long j113 = j110 + jRotlXor23;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor23, 39, j113);
                long j114 = j107 + jRotlXor22;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor22, 43, j114);
                long j115 = j112 + jRotlXor25;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor25, 8, j115);
                long j116 = j113 + jRotlXor28;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor28, 35, j116);
                long j117 = j114 + jRotlXor27;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor27, 56, j117);
                long j118 = j111 + jRotlXor26;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor26, 22, j118);
                long j119 = j116 + jArr5[i19];
                long j120 = jRotlXor29 + jArr5[i25];
                long j121 = j117 + jArr5[i26];
                long j122 = jRotlXor32 + jArr5[i27];
                long j123 = j118 + jArr5[i28];
                long j124 = jRotlXor31 + jArr5[i29] + jArr6[i35];
                j48 = j115 + jArr5[i36] + jArr6[i17 + 2];
                j49 = j121;
                j45 = j119;
                j56 = j123;
                jArr4 = jArr6;
                iArr = iArr3;
                j29 = j120;
                j55 = j124;
                j47 = jArr5[i16 + 8] + j101 + 1 + jRotlXor30;
                i15 = i18 + 2;
                iArr2 = iArr4;
                j46 = j122;
                jArr3 = jArr5;
            }
            jArr2[0] = j45;
            jArr2[1] = j29;
            jArr2[2] = j49;
            jArr2[3] = j46;
            jArr2[4] = j56;
            jArr2[5] = j55;
            jArr2[6] = j48;
            jArr2[7] = j47;
        }
    }

    private static abstract class ThreefishCipher {

        /* JADX INFO: renamed from: kw, reason: collision with root package name */
        protected final long[] f149065kw;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        protected final long[] f149066t;

        protected ThreefishCipher(long[] jArr, long[] jArr2) {
            this.f149065kw = jArr;
            this.f149066t = jArr2;
        }

        abstract void decryptBlock(long[] jArr, long[] jArr2);

        abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        MOD9 = iArr;
        MOD17 = new int[iArr.length];
        MOD5 = new int[iArr.length];
        MOD3 = new int[iArr.length];
        int i15 = 0;
        while (true) {
            int[] iArr2 = MOD9;
            if (i15 >= iArr2.length) {
                return;
            }
            MOD17[i15] = i15 % 17;
            iArr2[i15] = i15 % 9;
            MOD5[i15] = i15 % 5;
            MOD3[i15] = i15 % 3;
            i15++;
        }
    }

    public ThreefishEngine(int i15) {
        ThreefishCipher threefish256Cipher;
        long[] jArr = new long[5];
        this.f149064t = jArr;
        int i16 = i15 / 8;
        this.blocksizeBytes = i16;
        int i17 = i16 / 8;
        this.blocksizeWords = i17;
        this.currentBlock = new long[i17];
        long[] jArr2 = new long[(i17 * 2) + 1];
        this.f149063kw = jArr2;
        if (i15 == 256) {
            threefish256Cipher = new Threefish256Cipher(jArr2, jArr);
        } else if (i15 == 512) {
            threefish256Cipher = new Threefish512Cipher(jArr2, jArr);
        } else {
            if (i15 != 1024) {
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            threefish256Cipher = new Threefish1024Cipher(jArr2, jArr);
        }
        this.cipher = threefish256Cipher;
    }

    public static long bytesToWord(byte[] bArr, int i15) {
        return Pack.littleEndianToLong(bArr, i15);
    }

    static long rotlXor(long j15, int i15, long j16) {
        return ((j15 >>> (-i15)) | (j15 << i15)) ^ j16;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.blocksizeWords + " words)");
        }
        long j15 = C_240;
        int i15 = 0;
        while (true) {
            int i16 = this.blocksizeWords;
            if (i15 >= i16) {
                long[] jArr2 = this.f149063kw;
                jArr2[i16] = j15;
                System.arraycopy(jArr2, 0, jArr2, i16 + 1, i16);
                return;
            } else {
                long[] jArr3 = this.f149063kw;
                long j16 = jArr[i15];
                jArr3[i15] = j16;
                j15 ^= j16;
                i15++;
            }
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        long[] jArr2 = this.f149064t;
        long j15 = jArr[0];
        jArr2[0] = j15;
        long j16 = jArr[1];
        jArr2[1] = j16;
        jArr2[2] = j15 ^ j16;
        jArr2[3] = j15;
        jArr2[4] = j16;
    }

    public static void wordToBytes(long j15, byte[] bArr, int i15) {
        Pack.longToLittleEndian(j15, bArr, i15);
    }

    static long xorRotr(long j15, int i15, long j16) {
        long j17 = j15 ^ j16;
        return (j17 << (-i15)) | (j17 >>> i15);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Threefish-" + (this.blocksizeBytes * 8);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z15, CipherParameters cipherParameters) {
        byte[] key;
        byte[] tweak;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            tweak = tweakableBlockCipherParameters.getTweak();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException("Invalid parameter passed to Threefish init - " + cipherParameters.getClass().getName());
            }
            key = ((KeyParameter) cipherParameters).getKey();
            tweak = null;
        }
        if (key == null) {
            jArr = null;
        } else {
            if (key.length != this.blocksizeBytes) {
                throw new IllegalArgumentException("Threefish key must be same size as block (" + this.blocksizeBytes + " bytes)");
            }
            jArr = new long[this.blocksizeWords];
            Pack.littleEndianToLong(key, 0, jArr);
        }
        if (tweak != null) {
            if (tweak.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[2];
            Pack.littleEndianToLong(tweak, 0, jArr2);
        }
        init(z15, jArr, jArr2);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 256, cipherParameters, Utils.getPurpose(z15)));
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i15, byte[] bArr2, int i16) {
        int i17 = this.blocksizeBytes;
        if (i15 + i17 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (i17 + i16 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        Pack.littleEndianToLong(bArr, i15, this.currentBlock);
        long[] jArr = this.currentBlock;
        processBlock(jArr, jArr);
        Pack.longToLittleEndian(this.currentBlock, bArr2, i16);
        return this.blocksizeBytes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    public void init(boolean z15, long[] jArr, long[] jArr2) {
        this.forEncryption = z15;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }

    public int processBlock(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.f149063kw;
        int i15 = this.blocksizeWords;
        if (jArr3[i15] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        }
        if (jArr.length != i15) {
            throw new DataLengthException("Input buffer too short");
        }
        if (jArr2.length != i15) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.forEncryption) {
            this.cipher.encryptBlock(jArr, jArr2);
        } else {
            this.cipher.decryptBlock(jArr, jArr2);
        }
        return this.blocksizeWords;
    }
}
