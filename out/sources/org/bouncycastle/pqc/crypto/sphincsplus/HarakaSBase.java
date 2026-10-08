package org.bouncycastle.pqc.crypto.sphincsplus;

import java.lang.reflect.Array;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
class HarakaSBase {
    protected long[][] haraka512_rc = {new long[]{2652350495371256459L, -4767360454786055294L, -2778808723033108313L, -6138960262205972599L, 4944264682582508575L, 5312892415214084856L, 390034814247088728L, 2584105839607850161L}, new long[]{-2829930801980875922L, 9137660425067592590L, 7974068014816832049L, -4665944065725157058L, 2602240152241800734L, -1525694355931290902L, 8634660511727056099L, 1757945485816280992L}, new long[]{1181946526362588450L, -2765192619992380293L, 3395396416743122529L, -5116273100549372423L, -1285454309797503998L, -3363297609815171261L, -8360835858392998991L, -2371352336613968487L}, new long[]{-2500853454776756032L, 8465221333286591414L, 8817016078209461823L, 9067727467981428858L, 4244107674518258433L, -4347326460570889538L, 1711371409274742987L, 6486926172609168623L}, new long[]{1689001080716996467L, -491496126278250673L, 1273395568185090836L, 5805238412293617850L, -3441289770925384855L, 4592753210857527691L, 7062886034259989751L, -7974393977033172556L}, new long[]{-797818098819718290L, -41460260651793472L, 476036171179798187L, 7391697506481003962L, -855662275170689475L, -3489340839585811635L, -4891525734487956488L, 9110006695579921767L}, new long[]{-886938081943560790L, 4212830408327159617L, -3546674487567282635L, -1955379422127038289L, 3174578079917510314L, 5156046680874954380L, -318545805834821831L, -6176414008149462342L}, new long[]{2529785914229181047L, 2966313764524854080L, 6363694428402697361L, 8292109690175819701L, -8497546332135459587L, -3211108476154815616L, -5526938793786642321L, -4975969843627057770L}, new long[]{3357847021085574721L, -4764837212565187058L, -626391829400648692L, 2124133995575340009L, 7425858999829294301L, -3432032868905637771L, 1119301198758921294L, 1907812968586478892L}, new long[]{-8986524826712832802L, 3356175496741300052L, -5764600317639896362L, 4002747967109689317L, -8718925159733497197L, -1938063772587374661L, -8003749789895945835L, 7302960353763723932L}};
    protected int[][] haraka256_rc = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 10, 8);
    protected final byte[] buffer = new byte[64];
    protected int off = 0;

    protected HarakaSBase() {
    }

    private void Swapn(long[] jArr, int i15, int i16, int i17) {
        long j15;
        long j16;
        if (i15 == 1) {
            j15 = 6148914691236517205L;
            j16 = -6148914691236517206L;
        } else if (i15 == 2) {
            j15 = 3689348814741910323L;
            j16 = -3689348814741910324L;
        } else {
            if (i15 != 4) {
                return;
            }
            j15 = 1085102592571150095L;
            j16 = -1085102592571150096L;
        }
        long j17 = jArr[i16];
        long j18 = jArr[i17];
        jArr[i16] = ((j15 & j18) << i15) | (j17 & j15);
        jArr[i17] = ((j17 & j16) >>> i15) | (j18 & j16);
    }

    private void Swapn32(int[] iArr, int i15, int i16, int i17) {
        int i18;
        int i19;
        if (i15 == 1) {
            i18 = 1431655765;
            i19 = -1431655766;
        } else if (i15 == 2) {
            i18 = 858993459;
            i19 = -858993460;
        } else if (i15 != 4) {
            i18 = 0;
            i19 = 0;
        } else {
            i18 = 252645135;
            i19 = -252645136;
        }
        int i25 = iArr[i16];
        int i26 = iArr[i17];
        iArr[i16] = ((i18 & i26) << i15) | (i25 & i18);
        iArr[i17] = ((i25 & i19) >>> i15) | (i26 & i19);
    }

    private void addRoundKey(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] ^ jArr2[0];
        jArr[1] = jArr[1] ^ jArr2[1];
        jArr[2] = jArr[2] ^ jArr2[2];
        jArr[3] = jArr[3] ^ jArr2[3];
        jArr[4] = jArr[4] ^ jArr2[4];
        jArr[5] = jArr[5] ^ jArr2[5];
        jArr[6] = jArr[6] ^ jArr2[6];
        jArr[7] = jArr[7] ^ jArr2[7];
    }

    private void addRoundKey32(int[] iArr, int[] iArr2) {
        iArr[0] = iArr[0] ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
        iArr[2] = iArr[2] ^ iArr2[2];
        iArr[3] = iArr[3] ^ iArr2[3];
        iArr[4] = iArr[4] ^ iArr2[4];
        iArr[5] = iArr[5] ^ iArr2[5];
        iArr[6] = iArr[6] ^ iArr2[6];
        iArr[7] = iArr2[7] ^ iArr[7];
    }

    private void brAesCt64BitsliceSbox(long[] jArr) {
        long j15 = jArr[7];
        long j16 = jArr[6];
        long j17 = jArr[5];
        long j18 = jArr[4];
        long j19 = jArr[3];
        long j25 = jArr[2];
        long j26 = jArr[1];
        long j27 = jArr[0];
        long j28 = j18 ^ j25;
        long j29 = j15 ^ j26;
        long j35 = j15 ^ j18;
        long j36 = j15 ^ j25;
        long j37 = j17 ^ j16;
        long j38 = j37 ^ j27;
        long j39 = j38 ^ j18;
        long j45 = j29 ^ j28;
        long j46 = j38 ^ j15;
        long j47 = j38 ^ j26;
        long j48 = j47 ^ j36;
        long j49 = j19 ^ j45;
        long j55 = j49 ^ j25;
        long j56 = j16 ^ j49;
        long j57 = j55 ^ j27;
        long j58 = j55 ^ j37;
        long j59 = j56 ^ j35;
        long j65 = j27 ^ j59;
        long j66 = j58 ^ j59;
        long j67 = j37 ^ j59;
        long j68 = j45 & j55;
        long j69 = (j48 & j57) ^ j68;
        long j75 = j29 & j67;
        long j76 = (j47 & j38) ^ j75;
        long j77 = j35 & j59;
        long j78 = (j28 & j66) ^ j77;
        long j79 = (j36 & j58) ^ j77;
        long j85 = (j69 ^ j78) ^ j56;
        long j86 = (((j39 & j27) ^ j68) ^ j79) ^ (j58 ^ j36);
        long j87 = (j76 ^ j78) ^ (j29 ^ j67);
        long j88 = (((j46 & j65) ^ j75) ^ j79) ^ (j15 ^ j67);
        long j89 = j85 ^ j86;
        long j95 = j85 & j87;
        long j96 = j88 ^ j95;
        long j97 = (j89 & j96) ^ j86;
        long j98 = ((j86 ^ j95) & (j87 ^ j88)) ^ j88;
        long j99 = j88 & (j96 ^ j98);
        long j100 = j99 ^ (j87 ^ j98);
        long j101 = j89 ^ (j97 & (j96 ^ j99));
        long j102 = j101 ^ j100;
        long j103 = j97 ^ j98;
        long j104 = j97 ^ j101;
        long j105 = j98 ^ j100;
        long j106 = j103 ^ j102;
        long j107 = j98 & j27;
        long j108 = j104 & j67;
        long j109 = j101 & j38;
        long j110 = j97 & j65;
        long j111 = j106 & j66;
        long j112 = j100 & j48;
        long j113 = j98 & j39;
        long j114 = j104 & j29;
        long j115 = j101 & j47;
        long j116 = j103 & j35;
        long j117 = j106 & j28;
        long j118 = j102 & j36;
        long j119 = j116 ^ j117;
        long j120 = j110 ^ j115;
        long j121 = (j105 & j45) ^ j112;
        long j122 = (j105 & j55) ^ j108;
        long j123 = j117 ^ j118;
        long j124 = (j107 ^ j114) ^ j122;
        long j125 = j109 ^ j119;
        long j126 = j108 ^ ((j103 & j59) ^ j111);
        long j127 = j119 ^ j124;
        long j128 = (j97 & j46) ^ j124;
        long j129 = (j111 ^ (j102 & j58)) ^ j125;
        long j130 = j121 ^ j125;
        long j131 = j109 ^ j126;
        long j132 = j128 ^ j129;
        long j133 = (j100 & j57) ^ j130;
        long j134 = (~j129) ^ (j114 ^ j120);
        long j135 = j120 ^ (~j127);
        long j136 = j122 ^ j133;
        long j137 = j131 ^ (~j136);
        long j138 = j123 ^ (~(j131 ^ j132));
        jArr[7] = j126 ^ j130;
        jArr[6] = j137;
        jArr[5] = j138;
        jArr[4] = j136;
        jArr[3] = (j107 ^ j110) ^ j133;
        jArr[2] = (j112 ^ j113) ^ j132;
        jArr[1] = j134;
        jArr[0] = j135;
    }

    private void brAesCt64InterleaveIn(long[] jArr, int i15, int[] iArr, int i16) {
        long j15 = ((long) iArr[i16]) & BodyPartID.bodyIdMax;
        long j16 = ((long) iArr[i16 + 1]) & BodyPartID.bodyIdMax;
        long j17 = ((long) iArr[i16 + 2]) & BodyPartID.bodyIdMax;
        long j18 = ((long) iArr[i16 + 3]) & BodyPartID.bodyIdMax;
        long j19 = (j15 | (j15 << 16)) & 281470681808895L;
        long j25 = (j16 | (j16 << 16)) & 281470681808895L;
        long j26 = (j17 | (j17 << 16)) & 281470681808895L;
        long j27 = (j18 | (j18 << 16)) & 281470681808895L;
        jArr[i15] = ((j19 | (j19 << 8)) & 71777214294589695L) | (((j26 | (j26 << 8)) & 71777214294589695L) << 8);
        long j28 = ((j27 | (j27 << 8)) & 71777214294589695L) << 8;
        jArr[i15 + 4] = j28 | ((j25 | (j25 << 8)) & 71777214294589695L);
    }

    private void brAesCt64InterleaveOut(int[] iArr, long[] jArr, int i15) {
        long j15 = jArr[i15];
        long j16 = j15 & 71777214294589695L;
        long j17 = jArr[i15 + 4];
        long j18 = j17 & 71777214294589695L;
        long j19 = (j15 >>> 8) & 71777214294589695L;
        long j25 = 71777214294589695L & (j17 >>> 8);
        long j26 = (j16 | (j16 >>> 8)) & 281470681808895L;
        long j27 = ((j18 >>> 8) | j18) & 281470681808895L;
        long j28 = (j19 | (j19 >>> 8)) & 281470681808895L;
        long j29 = (j25 | (j25 >>> 8)) & 281470681808895L;
        int i16 = i15 << 2;
        iArr[i16] = (int) (j26 | (j26 >>> 16));
        iArr[i16 + 1] = (int) (j27 | (j27 >>> 16));
        iArr[i16 + 2] = (int) (j28 | (j28 >>> 16));
        iArr[i16 + 3] = (int) ((j29 >>> 16) | j29);
    }

    private void brAesCt64Ortho(long[] jArr) {
        Swapn(jArr, 1, 0, 1);
        Swapn(jArr, 1, 2, 3);
        Swapn(jArr, 1, 4, 5);
        Swapn(jArr, 1, 6, 7);
        Swapn(jArr, 2, 0, 2);
        Swapn(jArr, 2, 1, 3);
        Swapn(jArr, 2, 4, 6);
        Swapn(jArr, 2, 5, 7);
        Swapn(jArr, 4, 0, 4);
        Swapn(jArr, 4, 1, 5);
        Swapn(jArr, 4, 2, 6);
        Swapn(jArr, 4, 3, 7);
    }

    private static void brAesCtBitsliceSbox(int[] iArr) {
        int i15 = iArr[7];
        int i16 = iArr[6];
        int i17 = iArr[5];
        int i18 = iArr[4];
        int i19 = iArr[3];
        int i25 = iArr[2];
        int i26 = iArr[1];
        int i27 = iArr[0];
        int i28 = i18 ^ i25;
        int i29 = i15 ^ i26;
        int i35 = i15 ^ i18;
        int i36 = i15 ^ i25;
        int i37 = i17 ^ i16;
        int i38 = i37 ^ i27;
        int i39 = i38 ^ i18;
        int i45 = i29 ^ i28;
        int i46 = i38 ^ i15;
        int i47 = i38 ^ i26;
        int i48 = i47 ^ i36;
        int i49 = i19 ^ i45;
        int i55 = i25 ^ i49;
        int i56 = i16 ^ i49;
        int i57 = i55 ^ i27;
        int i58 = i55 ^ i37;
        int i59 = i56 ^ i35;
        int i65 = i27 ^ i59;
        int i66 = i58 ^ i59;
        int i67 = i37 ^ i59;
        int i68 = i45 & i55;
        int i69 = (i48 & i57) ^ i68;
        int i75 = i29 & i67;
        int i76 = (i47 & i38) ^ i75;
        int i77 = i35 & i59;
        int i78 = (i28 & i66) ^ i77;
        int i79 = (i36 & i58) ^ i77;
        int i85 = (i69 ^ i78) ^ i56;
        int i86 = (((i39 & i27) ^ i68) ^ i79) ^ (i58 ^ i36);
        int i87 = (i76 ^ i78) ^ (i29 ^ i67);
        int i88 = (((i46 & i65) ^ i75) ^ i79) ^ (i15 ^ i67);
        int i89 = i85 ^ i86;
        int i95 = i85 & i87;
        int i96 = i88 ^ i95;
        int i97 = (i89 & i96) ^ i86;
        int i98 = ((i86 ^ i95) & (i87 ^ i88)) ^ i88;
        int i99 = i88 & (i96 ^ i98);
        int i100 = i99 ^ (i87 ^ i98);
        int i101 = i89 ^ (i97 & (i96 ^ i99));
        int i102 = i101 ^ i100;
        int i103 = i97 ^ i98;
        int i104 = i97 ^ i101;
        int i105 = i98 ^ i100;
        int i106 = i103 ^ i102;
        int i107 = i27 & i98;
        int i108 = i104 & i67;
        int i109 = i101 & i38;
        int i110 = i97 & i65;
        int i111 = i106 & i66;
        int i112 = i100 & i48;
        int i113 = i98 & i39;
        int i114 = i104 & i29;
        int i115 = i101 & i47;
        int i116 = i103 & i35;
        int i117 = i106 & i28;
        int i118 = i102 & i36;
        int i119 = i116 ^ i117;
        int i120 = i110 ^ i115;
        int i121 = (i105 & i45) ^ i112;
        int i122 = (i105 & i55) ^ i108;
        int i123 = i117 ^ i118;
        int i124 = (i107 ^ i114) ^ i122;
        int i125 = i109 ^ i119;
        int i126 = i108 ^ ((i103 & i59) ^ i111);
        int i127 = i119 ^ i124;
        int i128 = (i97 & i46) ^ i124;
        int i129 = (i111 ^ (i102 & i58)) ^ i125;
        int i130 = i121 ^ i125;
        int i131 = i109 ^ i126;
        int i132 = i128 ^ i129;
        int i133 = (i100 & i57) ^ i130;
        int i134 = (~i129) ^ (i114 ^ i120);
        int i135 = (~i127) ^ i120;
        int i136 = i122 ^ i133;
        int i137 = i131 ^ (~i136);
        int i138 = i123 ^ (~(i131 ^ i132));
        iArr[7] = i126 ^ i130;
        iArr[6] = i137;
        iArr[5] = i138;
        iArr[4] = i136;
        iArr[3] = i133 ^ (i107 ^ i110);
        iArr[2] = (i112 ^ i113) ^ i132;
        iArr[1] = i134;
        iArr[0] = i135;
    }

    private void brAesCtOrtho(int[] iArr) {
        Swapn32(iArr, 1, 0, 1);
        Swapn32(iArr, 1, 2, 3);
        Swapn32(iArr, 1, 4, 5);
        Swapn32(iArr, 1, 6, 7);
        Swapn32(iArr, 2, 0, 2);
        Swapn32(iArr, 2, 1, 3);
        Swapn32(iArr, 2, 4, 6);
        Swapn32(iArr, 2, 5, 7);
        Swapn32(iArr, 4, 0, 4);
        Swapn32(iArr, 4, 1, 5);
        Swapn32(iArr, 4, 2, 6);
        Swapn32(iArr, 4, 3, 7);
    }

    private int brDec32Le(byte[] bArr, int i15) {
        return (bArr[i15 + 3] << 24) | (bArr[i15] & 255) | ((bArr[i15 + 1] << 8) & 65280) | ((bArr[i15 + 2] << 16) & 16711680);
    }

    private void brEnc32Le(byte[] bArr, int i15, int i16) {
        for (int i17 = 0; i17 < 4; i17++) {
            bArr[i16 + i17] = (byte) (i15 >> (i17 << 3));
        }
    }

    private void brRangeDec32Le(byte[] bArr, int[] iArr, int i15) {
        for (int i16 = 0; i16 < iArr.length; i16++) {
            int i17 = (i16 << 2) + i15;
            iArr[i16] = (bArr[i17 + 3] << 24) | (bArr[i17] & GF2Field.MASK) | ((bArr[i17 + 1] << 8) & 65280) | ((bArr[i17 + 2] << 16) & 16711680);
        }
    }

    private void mixColumns(long[] jArr) {
        long j15 = jArr[0];
        long j16 = jArr[1];
        long j17 = jArr[2];
        long j18 = jArr[3];
        long j19 = jArr[4];
        long j25 = jArr[5];
        long j26 = jArr[6];
        long j27 = jArr[7];
        long j28 = (j15 >>> 16) | (j15 << 48);
        long j29 = (j16 >>> 16) | (j16 << 48);
        long j35 = (j17 >>> 16) | (j17 << 48);
        long j36 = (j18 >>> 16) | (j18 << 48);
        long j37 = (j19 >>> 16) | (j19 << 48);
        long j38 = (j25 >>> 16) | (j25 << 48);
        long j39 = (j26 >>> 16) | (j26 << 48);
        long j45 = (j27 >>> 16) | (j27 << 48);
        long j46 = j27 ^ j45;
        long j47 = j15 ^ j28;
        jArr[0] = (j46 ^ j28) ^ rotr32(j47);
        long j48 = j16 ^ j29;
        jArr[1] = (((j47 ^ j27) ^ j45) ^ j29) ^ rotr32(j48);
        long j49 = j17 ^ j35;
        jArr[2] = (j48 ^ j35) ^ rotr32(j49);
        long j55 = ((j49 ^ j27) ^ j45) ^ j36;
        long j56 = j18 ^ j36;
        jArr[3] = j55 ^ rotr32(j56);
        long j57 = ((j56 ^ j27) ^ j45) ^ j37;
        long j58 = j19 ^ j37;
        jArr[4] = j57 ^ rotr32(j58);
        long j59 = j58 ^ j38;
        long j65 = j25 ^ j38;
        jArr[5] = j59 ^ rotr32(j65);
        long j66 = j65 ^ j39;
        long j67 = j26 ^ j39;
        jArr[6] = j66 ^ rotr32(j67);
        jArr[7] = rotr32(j46) ^ (j67 ^ j45);
    }

    private void mixColumns32(int[] iArr) {
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = iArr[2];
        int i18 = iArr[3];
        int i19 = iArr[4];
        int i25 = iArr[5];
        int i26 = iArr[6];
        int i27 = iArr[7];
        int i28 = (i15 >>> 8) | (i15 << 24);
        int i29 = (i16 >>> 8) | (i16 << 24);
        int i35 = (i17 >>> 8) | (i17 << 24);
        int i36 = (i18 >>> 8) | (i18 << 24);
        int i37 = (i19 >>> 8) | (i19 << 24);
        int i38 = (i25 >>> 8) | (i25 << 24);
        int i39 = (i26 >>> 8) | (i26 << 24);
        int i45 = (i27 >>> 8) | (i27 << 24);
        int i46 = i27 ^ i45;
        int i47 = i15 ^ i28;
        iArr[0] = (i46 ^ i28) ^ rotr16(i47);
        int i48 = i16 ^ i29;
        iArr[1] = (((i47 ^ i27) ^ i45) ^ i29) ^ rotr16(i48);
        int i49 = i17 ^ i35;
        iArr[2] = (i48 ^ i35) ^ rotr16(i49);
        int i55 = ((i49 ^ i27) ^ i45) ^ i36;
        int i56 = i18 ^ i36;
        iArr[3] = i55 ^ rotr16(i56);
        int i57 = ((i56 ^ i27) ^ i45) ^ i37;
        int i58 = i19 ^ i37;
        iArr[4] = i57 ^ rotr16(i58);
        int i59 = i58 ^ i38;
        int i65 = i25 ^ i38;
        iArr[5] = i59 ^ rotr16(i65);
        int i66 = i65 ^ i39;
        int i67 = i26 ^ i39;
        iArr[6] = i66 ^ rotr16(i67);
        iArr[7] = rotr16(i46) ^ (i67 ^ i45);
    }

    private int rotr16(int i15) {
        return (i15 >>> 16) | (i15 << 16);
    }

    private long rotr32(long j15) {
        return (j15 >>> 32) | (j15 << 32);
    }

    private void shiftRows(long[] jArr) {
        for (int i15 = 0; i15 < jArr.length; i15++) {
            long j15 = jArr[i15];
            jArr[i15] = ((j15 & 1152640029630136320L) << 4) | (65535 & j15) | ((4293918720L & j15) >>> 4) | ((983040 & j15) << 12) | ((280375465082880L & j15) >>> 8) | ((1095216660480L & j15) << 8) | (((-1152921504606846976L) & j15) >>> 12);
        }
    }

    private void shiftRows32(int[] iArr) {
        for (int i15 = 0; i15 < 8; i15++) {
            int i16 = iArr[i15];
            iArr[i15] = ((i16 & 1056964608) << 2) | (i16 & GF2Field.MASK) | ((64512 & i16) >>> 2) | ((i16 & 768) << 6) | ((15728640 & i16) >>> 4) | ((983040 & i16) << 4) | (((-1073741824) & i16) >>> 6);
        }
    }

    protected static void xor(byte[] bArr, int i15, byte[] bArr2, int i16, byte[] bArr3, int i17, int i18) {
        for (int i19 = 0; i19 < i18; i19++) {
            bArr3[i17 + i19] = (byte) (bArr[i15 + i19] ^ bArr2[i16 + i19]);
        }
    }

    protected void haraka256Perm(byte[] bArr) {
        int[] iArr = new int[8];
        interleaveConstant32(iArr, this.buffer, 0);
        for (int i15 = 0; i15 < 5; i15++) {
            for (int i16 = 0; i16 < 2; i16++) {
                brAesCtBitsliceSbox(iArr);
                shiftRows32(iArr);
                mixColumns32(iArr);
                addRoundKey32(iArr, this.haraka256_rc[(i15 << 1) + i16]);
            }
            for (int i17 = 0; i17 < 8; i17++) {
                int i18 = iArr[i17];
                iArr[i17] = ((i18 & 1077952576) >>> 1) | ((-2122219135) & i18) | ((33686018 & i18) << 1) | ((67372036 & i18) << 2) | ((134744072 & i18) << 3) | ((269488144 & i18) >>> 3) | ((538976288 & i18) >>> 2);
            }
        }
        brAesCtOrtho(iArr);
        for (int i19 = 0; i19 < 4; i19++) {
            int i25 = i19 << 1;
            int i26 = i19 << 2;
            brEnc32Le(bArr, iArr[i25], i26);
            brEnc32Le(bArr, iArr[i25 + 1], i26 + 16);
        }
    }

    protected void haraka512Perm(byte[] bArr) {
        int[] iArr = new int[16];
        long[] jArr = new long[8];
        brRangeDec32Le(this.buffer, iArr, 0);
        for (int i15 = 0; i15 < 4; i15++) {
            brAesCt64InterleaveIn(jArr, i15, iArr, i15 << 2);
        }
        brAesCt64Ortho(jArr);
        for (int i16 = 0; i16 < 5; i16++) {
            for (int i17 = 0; i17 < 2; i17++) {
                brAesCt64BitsliceSbox(jArr);
                shiftRows(jArr);
                mixColumns(jArr);
                addRoundKey(jArr, this.haraka512_rc[(i16 << 1) + i17]);
            }
            for (int i18 = 0; i18 < 8; i18++) {
                long j15 = jArr[i18];
                jArr[i18] = ((j15 & (-8934996522953571328L)) >>> 3) | ((281479271743489L & j15) << 5) | ((562958543486978L & j15) << 12) | ((1125917086973956L & j15) >>> 1) | ((2251834173947912L & j15) << 6) | ((9007336695791648L & j15) << 9) | ((18014673391583296L & j15) >>> 4) | ((36029346783166592L & j15) << 3) | ((2377936887688995072L & j15) >>> 5) | ((148621055480562192L & j15) << 2) | ((576469548530665472L & j15) << 4) | ((1152939097061330944L & j15) >>> 12) | ((4611756388245323776L & j15) >>> 10);
            }
        }
        brAesCt64Ortho(jArr);
        for (int i19 = 0; i19 < 4; i19++) {
            brAesCt64InterleaveOut(iArr, jArr, i19);
        }
        for (int i25 = 0; i25 < 16; i25++) {
            for (int i26 = 0; i26 < 4; i26++) {
                bArr[(i25 << 2) + i26] = (byte) ((iArr[i25] >>> (i26 << 3)) & GF2Field.MASK);
            }
        }
    }

    protected void interleaveConstant(long[] jArr, byte[] bArr, int i15) {
        int[] iArr = new int[16];
        brRangeDec32Le(bArr, iArr, i15);
        for (int i16 = 0; i16 < 4; i16++) {
            brAesCt64InterleaveIn(jArr, i16, iArr, i16 << 2);
        }
        brAesCt64Ortho(jArr);
    }

    protected void interleaveConstant32(int[] iArr, byte[] bArr, int i15) {
        for (int i16 = 0; i16 < 4; i16++) {
            int i17 = i16 << 1;
            int i18 = (i16 << 2) + i15;
            iArr[i17] = brDec32Le(bArr, i18);
            iArr[i17 + 1] = brDec32Le(bArr, i18 + 16);
        }
        brAesCtOrtho(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void reset() {
        this.off = 0;
        Arrays.clear(this.buffer);
    }
}
