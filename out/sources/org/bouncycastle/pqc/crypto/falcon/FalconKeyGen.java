package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Pack;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: loaded from: classes5.dex */
class FalconKeyGen {
    private static final int DEPTH_INT_FG = 4;
    private static final short[] REV10 = {0, 512, 256, 768, 128, 640, 384, 896, 64, 576, 320, 832, 192, 704, 448, 960, 32, 544, 288, 800, 160, 672, 416, 928, 96, 608, 352, 864, 224, 736, 480, 992, 16, 528, 272, 784, 144, 656, 400, 912, 80, 592, 336, 848, 208, 720, 464, 976, 48, 560, 304, 816, 176, 688, 432, 944, 112, 624, 368, 880, 240, 752, 496, 1008, 8, 520, 264, 776, 136, 648, 392, 904, 72, 584, 328, 840, 200, 712, 456, 968, 40, 552, 296, 808, 168, 680, 424, 936, 104, 616, 360, 872, 232, 744, 488, 1000, 24, 536, 280, 792, 152, 664, 408, 920, 88, 600, 344, 856, 216, 728, 472, 984, 56, 568, 312, 824, 184, 696, 440, 952, 120, 632, 376, 888, 248, 760, 504, 1016, 4, 516, 260, 772, 132, 644, 388, 900, 68, 580, 324, 836, 196, 708, 452, 964, 36, 548, 292, 804, 164, 676, 420, 932, 100, 612, 356, 868, 228, 740, 484, 996, 20, 532, 276, 788, 148, 660, 404, 916, 84, 596, 340, 852, 212, 724, 468, 980, 52, 564, 308, 820, 180, 692, 436, 948, 116, 628, 372, 884, 244, 756, 500, 1012, 12, 524, 268, 780, 140, 652, 396, 908, 76, 588, 332, 844, 204, 716, 460, 972, 44, 556, 300, 812, 172, 684, 428, 940, 108, 620, 364, 876, 236, 748, 492, 1004, 28, 540, 284, 796, 156, 668, 412, 924, 92, 604, 348, 860, 220, 732, 476, 988, 60, 572, 316, 828, 188, 700, 444, 956, 124, 636, 380, 892, 252, 764, 508, 1020, 2, 514, 258, 770, 130, 642, 386, 898, 66, 578, 322, 834, 194, 706, 450, 962, 34, 546, 290, 802, 162, 674, 418, 930, 98, 610, 354, 866, 226, 738, 482, 994, 18, 530, 274, 786, 146, 658, 402, 914, 82, 594, 338, 850, 210, 722, 466, 978, 50, 562, 306, 818, 178, 690, 434, 946, 114, 626, 370, 882, 242, 754, 498, 1010, 10, 522, 266, 778, 138, 650, 394, 906, 74, 586, 330, 842, 202, 714, 458, 970, 42, 554, 298, 810, 170, 682, 426, 938, 106, 618, 362, 874, 234, 746, 490, 1002, 26, 538, 282, 794, 154, 666, 410, 922, 90, 602, 346, 858, 218, 730, 474, 986, 58, 570, 314, 826, 186, 698, 442, 954, 122, 634, 378, 890, 250, 762, 506, 1018, 6, 518, 262, 774, 134, 646, 390, 902, 70, 582, 326, 838, 198, 710, 454, 966, 38, 550, 294, 806, 166, 678, 422, 934, 102, 614, 358, 870, 230, 742, 486, 998, 22, 534, 278, 790, 150, 662, 406, 918, 86, 598, 342, 854, 214, 726, 470, 982, 54, 566, 310, 822, 182, 694, 438, 950, 118, 630, 374, 886, 246, 758, 502, 1014, 14, 526, 270, 782, 142, 654, 398, 910, 78, 590, 334, 846, 206, 718, 462, 974, 46, 558, 302, 814, 174, 686, 430, 942, 110, 622, 366, 878, 238, 750, 494, 1006, 30, 542, 286, 798, 158, 670, 414, 926, 94, 606, 350, 862, 222, 734, 478, 990, 62, 574, 318, 830, 190, 702, 446, 958, 126, 638, 382, 894, 254, 766, 510, 1022, 1, 513, 257, 769, 129, 641, 385, 897, 65, 577, 321, 833, 193, 705, 449, 961, 33, 545, 289, 801, 161, 673, 417, 929, 97, 609, 353, 865, 225, 737, 481, 993, 17, 529, 273, 785, 145, 657, 401, 913, 81, 593, 337, 849, 209, 721, 465, 977, 49, 561, 305, 817, 177, 689, 433, 945, 113, 625, 369, 881, 241, 753, 497, 1009, 9, 521, 265, 777, 137, 649, 393, 905, 73, 585, 329, 841, 201, 713, 457, 969, 41, 553, 297, 809, 169, 681, 425, 937, 105, 617, 361, 873, 233, 745, 489, 1001, 25, 537, 281, 793, 153, 665, 409, 921, 89, 601, 345, 857, 217, 729, 473, 985, 57, 569, 313, 825, 185, 697, 441, 953, 121, 633, 377, 889, 249, 761, 505, 1017, 5, 517, 261, 773, 133, 645, 389, 901, 69, 581, 325, 837, 197, 709, 453, 965, 37, 549, 293, 805, 165, 677, 421, 933, 101, 613, 357, 869, 229, 741, 485, 997, 21, 533, 277, 789, 149, 661, 405, 917, 85, 597, 341, 853, 213, 725, 469, 981, 53, 565, 309, 821, 181, 693, 437, 949, 117, 629, 373, 885, 245, 757, 501, 1013, 13, 525, 269, 781, 141, 653, 397, 909, 77, 589, 333, 845, 205, 717, 461, 973, 45, 557, 301, 813, 173, 685, 429, 941, 109, 621, 365, 877, 237, 749, 493, 1005, 29, 541, 285, 797, 157, 669, 413, 925, 93, 605, 349, 861, 221, 733, 477, 989, 61, 573, 317, 829, 189, 701, 445, 957, 125, 637, 381, 893, 253, 765, 509, 1021, 3, 515, 259, 771, 131, 643, 387, 899, 67, 579, 323, 835, 195, 707, 451, 963, 35, 547, 291, 803, 163, 675, 419, 931, 99, 611, 355, 867, 227, 739, 483, 995, 19, 531, 275, 787, 147, 659, 403, 915, 83, 595, 339, 851, 211, 723, 467, 979, 51, 563, 307, 819, 179, 691, 435, 947, 115, 627, 371, 883, 243, 755, 499, 1011, 11, 523, 267, 779, 139, 651, 395, 907, 75, 587, 331, 843, 203, 715, 459, 971, 43, 555, 299, 811, 171, 683, 427, 939, 107, 619, 363, 875, 235, 747, 491, 1003, 27, 539, 283, 795, 155, 667, 411, 923, 91, 603, 347, 859, 219, 731, 475, 987, 59, 571, 315, 827, 187, 699, 443, 955, 123, 635, 379, 891, 251, 763, 507, 1019, 7, 519, 263, 775, 135, 647, 391, 903, 71, 583, 327, 839, 199, 711, 455, 967, 39, 551, 295, 807, 167, 679, 423, 935, 103, 615, 359, 871, 231, 743, 487, 999, 23, 535, 279, 791, 151, 663, 407, 919, 87, 599, 343, 855, 215, 727, 471, 983, 55, 567, 311, 823, 183, 695, 439, 951, 119, 631, 375, 887, 247, 759, 503, 1015, 15, 527, 271, 783, 143, 655, 399, 911, 79, 591, 335, 847, 207, 719, 463, 975, 47, 559, 303, 815, 175, 687, 431, 943, 111, 623, 367, 879, 239, 751, 495, 1007, 31, 543, 287, 799, 159, 671, 415, 927, 
    95, 607, 351, 863, 223, 735, 479, 991, 63, 575, 319, 831, 191, 703, 447, 959, 127, 639, 383, 895, 255, 767, 511, 1023};
    private static final long[] gauss_1024_12289 = {1283868770400643928L, 6416574995475331444L, 4078260278032692663L, 2353523259288686585L, 1227179971273316331L, 575931623374121527L, 242543240509105209L, 91437049221049666L, 30799446349977173L, 9255276791179340L, 2478152334826140L, 590642893610164L, 125206034929641L, 23590435911403L, 3948334035941L, 586753615614L, 77391054539L, 9056793210L, 940121950, 86539696, 7062824, 510971, 32764, 1862, 94, 4, 0};
    private static final int[] MAX_BL_SMALL = {1, 1, 2, 2, 4, 7, 14, 27, 53, 106, 209};
    private static final int[] MAX_BL_LARGE = {2, 2, 5, 7, 12, 21, 40, 78, ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384, 308};
    private static final int[] bitlength_avg = {4, 11, 24, 50, 102, 202, 401, 794, 1577, 3138, 6308};
    private static final int[] bitlength_std = {0, 1, 1, 1, 1, 2, 4, 5, 8, 13, 25};

    FalconKeyGen() {
    }

    private static long get_rng_u64(SHAKEDigest sHAKEDigest) {
        byte[] bArr = new byte[8];
        sHAKEDigest.doOutput(bArr, 0, 8);
        return Pack.littleEndianToLong(bArr, 0);
    }

    static void keygen(SHAKEDigest sHAKEDigest, byte[] bArr, byte[] bArr2, byte[] bArr3, short[] sArr, int i15) {
        int i16;
        int i17;
        byte b15;
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr2;
        int i18 = i15;
        int iMkn = mkn(i18);
        short[] sArr2 = sArr;
        while (true) {
            double[] dArr = new double[iMkn * 3];
            poly_small_mkgauss(sHAKEDigest, bArr4, i18);
            poly_small_mkgauss(sHAKEDigest, bArr5, i18);
            int i19 = 1 << (FalconCodec.max_fg_bits[i18] - 1);
            for (int i25 = 0; i25 < iMkn; i25++) {
                byte b16 = bArr4[i25];
                if (b16 >= i19 || b16 <= (i17 = -i19) || (b15 = bArr5[i25]) >= i19 || b15 <= i17) {
                    i19 = -1;
                    break;
                }
            }
            if (i19 >= 0) {
                int iPoly_small_sqnorm = poly_small_sqnorm(bArr4, i18);
                int iPoly_small_sqnorm2 = poly_small_sqnorm(bArr5, i18);
                if ((((long) ((-((iPoly_small_sqnorm | iPoly_small_sqnorm2) >>> 31)) | (iPoly_small_sqnorm + iPoly_small_sqnorm2))) & BodyPartID.bodyIdMax) >= 16823) {
                    continue;
                } else {
                    int i26 = iMkn + iMkn;
                    poly_small_to_fp(dArr, 0, bArr4, i18);
                    poly_small_to_fp(dArr, iMkn, bArr5, i18);
                    FalconFFT.FFT(dArr, 0, i18);
                    FalconFFT.FFT(dArr, iMkn, i18);
                    FalconFFT.poly_invnorm2_fft(dArr, i26, dArr, 0, dArr, iMkn, i18);
                    FalconFFT.poly_adj_fft(dArr, 0, i18);
                    FalconFFT.poly_adj_fft(dArr, iMkn, i18);
                    FalconFFT.poly_mulconst(dArr, 0, 12289.0d, i18);
                    FalconFFT.poly_mulconst(dArr, iMkn, 12289.0d, i18);
                    FalconFFT.poly_mul_autoadj_fft(dArr, 0, dArr, i26, i18);
                    FalconFFT.poly_mul_autoadj_fft(dArr, iMkn, dArr, i26, i18);
                    FalconFFT.iFFT(dArr, 0, i18);
                    FalconFFT.iFFT(dArr, iMkn, i18);
                    double d15 = 0.0d;
                    for (int i27 = 0; i27 < iMkn; i27++) {
                        double d16 = dArr[i27];
                        double d17 = dArr[iMkn + i27];
                        d15 += (d16 * d16) + (d17 * d17);
                    }
                    if (d15 >= 16822.4121d) {
                        continue;
                    } else {
                        short[] sArr3 = new short[iMkn * 2];
                        if (sArr2 == null) {
                            sArr2 = sArr3;
                            i16 = iMkn;
                        } else {
                            i16 = 0;
                        }
                        int iCompute_public = FalconVrfy.compute_public(sArr2, 0, bArr4, bArr5, i18, sArr3, i16);
                        short[] sArr4 = sArr2;
                        if (iCompute_public != 0) {
                            if (solve_NTRU(i18, bArr3, bArr, bArr2, (1 << (FalconCodec.max_FG_bits[i18] - 1)) - 1, new int[i18 > 2 ? iMkn * 28 : iMkn * 84]) != 0) {
                                return;
                            }
                        }
                        bArr4 = bArr;
                        bArr5 = bArr2;
                        i18 = i15;
                        sArr2 = sArr4;
                    }
                }
            }
        }
    }

    private static void make_fg(int[] iArr, int i15, byte[] bArr, byte[] bArr2, int i16, int i17, int i18) {
        int iMkn = mkn(i16);
        int i19 = i15 + iMkn;
        int i25 = FalconSmallPrimeList.PRIMES[0].f149455p;
        for (int i26 = 0; i26 < iMkn; i26++) {
            iArr[i15 + i26] = modp_set(bArr[i26], i25);
            iArr[i19 + i26] = modp_set(bArr2[i26], i25);
        }
        if (i17 != 0 || i18 == 0) {
            int i27 = 0;
            while (i27 < i17) {
                int i28 = i27 + 1;
                make_fg_step(iArr, i15, i16 - i27, i27, i27 != 0 ? 1 : 0, (i28 < i17 || i18 != 0) ? 1 : 0);
                i27 = i28;
            }
            return;
        }
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i29 = falconSmallPrimeArr[0].f149455p;
        int iModp_ninv31 = modp_ninv31(i29);
        int i35 = i19 + iMkn;
        modp_mkgm2(iArr, i35, iArr, i35 + iMkn, i16, falconSmallPrimeArr[0].f149454g, i29, iModp_ninv31);
        modp_NTT2(iArr, i15, iArr, i35, i16, i29, iModp_ninv31);
        modp_NTT2(iArr, i19, iArr, i35, i16, i29, iModp_ninv31);
    }

    private static void make_fg_step(int[] iArr, int i15, int i16, int i17, int i18, int i19) {
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        int[] iArr2 = iArr;
        boolean z15 = true;
        int i39 = 1 << i16;
        int i45 = i39 >> 1;
        int[] iArr3 = MAX_BL_SMALL;
        int i46 = iArr3[i17];
        int i47 = iArr3[i17 + 1];
        int i48 = i45 * i47;
        int i49 = i15 + i48;
        int i55 = i49 + i48;
        int i56 = i39 * i46;
        int i57 = i55 + i56;
        int i58 = i57 + i56;
        int i59 = i58 + i39;
        int i65 = i59 + i39;
        System.arraycopy(iArr2, i15, iArr2, i55, i39 * 2 * i46);
        int i66 = 0;
        while (i66 < i46) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i67 = falconSmallPrimeArr[i66].f149455p;
            int iModp_ninv31 = modp_ninv31(i67);
            int iModp_R2 = modp_R2(i67, iModp_ninv31);
            int i68 = falconSmallPrimeArr[i66].f149454g;
            boolean z16 = z15;
            int i69 = i66;
            int i75 = i58;
            int i76 = i59;
            modp_mkgm2(iArr2, i75, iArr, i76, i16, i68, i67, iModp_ninv31);
            int i77 = iModp_ninv31;
            int i78 = i55 + i69;
            int i79 = 0;
            int i85 = i78;
            while (i79 < i39) {
                iArr[i65 + i79] = iArr[i85];
                i79++;
                i85 += i46;
            }
            if (i18 == 0) {
                int i86 = i65;
                modp_NTT2(iArr, i86, iArr, i75, i16, i67, i77);
                i27 = i86;
                i77 = i77;
                i67 = i67;
            } else {
                i27 = i65;
            }
            int i87 = i15 + i69;
            int i88 = 0;
            int i89 = i87;
            while (i88 < i45) {
                int i95 = i27 + (i88 << 1);
                iArr[i89] = modp_montymul(modp_montymul(iArr[i95], iArr[i95 + 1], i67, i77), iModp_R2, i67, i77);
                i88++;
                i89 += i47;
            }
            if (i18 != 0) {
                int i96 = i46;
                int i97 = i77;
                modp_iNTT2_ext(iArr, i78, i96, iArr, i76, i16, i67, i97);
                i28 = i76;
                i77 = i97;
                i29 = i96;
            } else {
                int i98 = i46;
                i28 = i76;
                i29 = i98;
            }
            int i99 = i57 + i69;
            int i100 = 0;
            int i101 = i99;
            while (i100 < i39) {
                iArr[i27 + i100] = iArr[i101];
                i100++;
                i101 += i29;
            }
            if (i18 == 0) {
                int i102 = i67;
                int i103 = i77;
                modp_NTT2(iArr, i27, iArr, i75, i16, i102, i103);
                i77 = i103;
                i67 = i102;
            }
            int i104 = i49 + i69;
            int i105 = 0;
            int i106 = i104;
            while (i105 < i45) {
                int i107 = i27 + (i105 << 1);
                iArr[i106] = modp_montymul(modp_montymul(iArr[i107], iArr[i107 + 1], i67, i77), iModp_R2, i67, i77);
                i105++;
                i106 += i47;
            }
            if (i18 != 0) {
                int i108 = i29;
                i36 = i28;
                i37 = i77;
                modp_iNTT2_ext(iArr, i99, i108, iArr, i36, i16, i67, i37);
                i35 = i108;
            } else {
                i35 = i29;
                i36 = i28;
                i37 = i77;
            }
            if (i19 == 0) {
                int i109 = i16 - 1;
                int i110 = i47;
                modp_iNTT2_ext(iArr, i87, i110, iArr, i36, i109, i67, i37);
                modp_iNTT2_ext(iArr, i104, i110, iArr, i36, i109, i67, i37);
                i38 = i110;
            } else {
                i38 = i47;
            }
            i66 = i69 + 1;
            iArr2 = iArr;
            i59 = i36;
            i58 = i75;
            i65 = i27;
            i47 = i38;
            i46 = i35;
            z15 = z16;
        }
        int i111 = i46;
        int i112 = i47;
        int i113 = i65;
        int i114 = i58;
        int i115 = i59;
        zint_rebuild_CRT(iArr, i55, i111, i111, i39, 1, iArr, i114);
        zint_rebuild_CRT(iArr, i57, i111, i111, i39, 1, iArr, i114);
        int i116 = i114;
        int i117 = i111;
        while (i117 < i112) {
            FalconSmallPrime[] falconSmallPrimeArr2 = FalconSmallPrimeList.PRIMES;
            int i118 = falconSmallPrimeArr2[i117].f149455p;
            int iModp_ninv32 = modp_ninv31(i118);
            int iModp_R3 = modp_R2(i118, iModp_ninv32);
            int iModp_Rx = modp_Rx(i111, i118, iModp_ninv32, iModp_R3);
            int i119 = falconSmallPrimeArr2[i117].f149454g;
            int i120 = iModp_R3;
            int i121 = i116;
            int i122 = i115;
            int i123 = i117;
            modp_mkgm2(iArr, i121, iArr, i122, i16, i119, i118, iModp_ninv32);
            int i124 = i55;
            int i125 = 0;
            while (i125 < i39) {
                int i126 = i118;
                int i127 = i111;
                int i128 = iModp_Rx;
                int i129 = i120;
                int iZint_mod_small_signed = zint_mod_small_signed(iArr, i124, i127, i126, iModp_ninv32, i129, i128);
                i118 = i126;
                iArr[i113 + i125] = iZint_mod_small_signed;
                i125++;
                i124 += i127;
                i111 = i127;
                iModp_Rx = i128;
                i120 = i129;
            }
            int i130 = iModp_Rx;
            int i131 = i120;
            int i132 = i111;
            int i133 = i131;
            int i134 = i118;
            modp_NTT2(iArr, i113, iArr, i121, i16, i134, iModp_ninv32);
            int i135 = i134;
            int i136 = i15 + i123;
            int i137 = i136;
            int i138 = 0;
            while (i138 < i45) {
                int i139 = i113 + (i138 << 1);
                iArr[i137] = modp_montymul(modp_montymul(iArr[i139], iArr[i139 + 1], i135, iModp_ninv32), i133, i135, iModp_ninv32);
                i138++;
                i137 += i112;
            }
            int i140 = i57;
            for (int i141 = 0; i141 < i39; i141++) {
                int i142 = i135;
                int i143 = i133;
                int i144 = i132;
                int i145 = i130;
                int iZint_mod_small_signed2 = zint_mod_small_signed(iArr, i140, i144, i142, iModp_ninv32, i143, i145);
                i135 = i142;
                iArr[i113 + i141] = iZint_mod_small_signed2;
                i140 += i144;
                i133 = i143;
                i132 = i144;
                i130 = i145;
            }
            int i146 = i132;
            int i147 = i135;
            modp_NTT2(iArr, i113, iArr, i121, i16, i147, iModp_ninv32);
            int i148 = i49 + i123;
            int i149 = 0;
            int i150 = i148;
            while (i149 < i45) {
                int i151 = i113 + (i149 << 1);
                iArr[i150] = modp_montymul(modp_montymul(iArr[i151], iArr[i151 + 1], i147, iModp_ninv32), i133, i147, iModp_ninv32);
                i149++;
                i150 += i112;
            }
            if (i19 == 0) {
                int i152 = i16 - 1;
                i25 = i112;
                i26 = i122;
                modp_iNTT2_ext(iArr, i136, i25, iArr, i26, i152, i147, iModp_ninv32);
                modp_iNTT2_ext(iArr, i148, i25, iArr, i26, i152, i147, iModp_ninv32);
            } else {
                i25 = i112;
                i26 = i122;
            }
            i117 = i123 + 1;
            i112 = i25;
            i115 = i26;
            i116 = i121;
            i111 = i146;
        }
    }

    private static int mkgauss(SHAKEDigest sHAKEDigest, int i15) {
        int i16 = 1 << (10 - i15);
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            long j15 = get_rng_u64(sHAKEDigest);
            int i19 = (int) (j15 >>> 63);
            int i25 = (int) (((j15 & Long.MAX_VALUE) - gauss_1024_12289[0]) >>> 63);
            long j16 = Long.MAX_VALUE & get_rng_u64(sHAKEDigest);
            int i26 = 1;
            int i27 = 0;
            while (true) {
                long[] jArr = gauss_1024_12289;
                if (i26 < jArr.length) {
                    int i28 = ((int) ((j16 - jArr[i26]) >>> 63)) ^ 1;
                    i27 |= (-((i25 ^ 1) & i28)) & i26;
                    i25 |= i28;
                    i26++;
                }
            }
            i17 += ((-i19) ^ i27) + i19;
        }
        return i17;
    }

    private static int mkn(int i15) {
        return 1 << i15;
    }

    private static void modp_NTT2(int[] iArr, int i15, int[] iArr2, int i16, int i17, int i18, int i19) {
        modp_NTT2_ext(iArr, i15, 1, iArr2, i16, i17, i18, i19);
    }

    private static void modp_NTT2_ext(int[] iArr, int i15, int i16, int[] iArr2, int i17, int i18, int i19, int i25) {
        if (i18 == 0) {
            return;
        }
        int iMkn = mkn(i18);
        int i26 = 1;
        int i27 = iMkn;
        while (i26 < iMkn) {
            int i28 = i27 >> 1;
            int i29 = 0;
            int i35 = 0;
            while (i29 < i26) {
                int i36 = iArr2[i17 + i26 + i29];
                int i37 = i15 + (i35 * i16);
                int i38 = (i28 * i16) + i37;
                int i39 = 0;
                while (i39 < i28) {
                    int i45 = iArr[i37];
                    int iModp_montymul = modp_montymul(iArr[i38], i36, i19, i25);
                    iArr[i37] = modp_add(i45, iModp_montymul, i19);
                    iArr[i38] = modp_sub(i45, iModp_montymul, i19);
                    i39++;
                    i37 += i16;
                    i38 += i16;
                }
                i29++;
                i35 += i27;
            }
            i26 <<= 1;
            i27 = i28;
        }
    }

    private static int modp_R(int i15) {
        return PKIFailureInfo.systemUnavail - i15;
    }

    private static int modp_R2(int i15, int i16) {
        int iModp_R = modp_R(i15);
        int iModp_add = modp_add(iModp_R, iModp_R, i15);
        int iModp_montymul = modp_montymul(iModp_add, iModp_add, i15, i16);
        int iModp_montymul2 = modp_montymul(iModp_montymul, iModp_montymul, i15, i16);
        int iModp_montymul3 = modp_montymul(iModp_montymul2, iModp_montymul2, i15, i16);
        int iModp_montymul4 = modp_montymul(iModp_montymul3, iModp_montymul3, i15, i16);
        int iModp_montymul5 = modp_montymul(iModp_montymul4, iModp_montymul4, i15, i16);
        return (iModp_montymul5 + (i15 & (-(iModp_montymul5 & 1)))) >>> 1;
    }

    private static int modp_Rx(int i15, int i16, int i17, int i18) {
        int i19 = i15 - 1;
        int iModp_R = modp_R(i16);
        int i25 = 0;
        while (true) {
            int i26 = 1 << i25;
            if (i26 > i19) {
                return iModp_R;
            }
            if ((i26 & i19) != 0) {
                iModp_R = modp_montymul(iModp_R, i18, i16, i17);
            }
            i18 = modp_montymul(i18, i18, i16, i17);
            i25++;
        }
    }

    private static int modp_add(int i15, int i16, int i17) {
        int i18 = (i15 + i16) - i17;
        return i18 + ((-(i18 >>> 31)) & i17);
    }

    private static int modp_div(int i15, int i16, int i17, int i18, int i19) {
        int i25 = i17 - 2;
        for (int i26 = 30; i26 >= 0; i26--) {
            int iModp_montymul = modp_montymul(i19, i19, i17, i18);
            i19 = iModp_montymul ^ ((-(1 & (i25 >>> i26))) & (modp_montymul(iModp_montymul, i16, i17, i18) ^ iModp_montymul));
        }
        return modp_montymul(i15, modp_montymul(i19, 1, i17, i18), i17, i18);
    }

    private static void modp_iNTT2(int[] iArr, int i15, int[] iArr2, int i16, int i17, int i18, int i19) {
        modp_iNTT2_ext(iArr, i15, 1, iArr2, i16, i17, i18, i19);
    }

    private static void modp_iNTT2_ext(int[] iArr, int i15, int i16, int[] iArr2, int i17, int i18, int i19, int i25) {
        int i26;
        if (i18 == 0) {
            return;
        }
        int iMkn = mkn(i18);
        int i27 = iMkn;
        int i28 = 1;
        while (true) {
            i26 = 0;
            if (i27 <= 1) {
                break;
            }
            i27 >>= 1;
            int i29 = i28 << 1;
            int i35 = 0;
            int i36 = 0;
            while (i35 < i27) {
                int i37 = iArr2[i17 + i27 + i35];
                int i38 = i15 + (i36 * i16);
                int i39 = (i28 * i16) + i38;
                int i45 = 0;
                while (i45 < i28) {
                    int i46 = iArr[i38];
                    int i47 = iArr[i39];
                    iArr[i38] = modp_add(i46, i47, i19);
                    iArr[i39] = modp_montymul(modp_sub(i46, i47, i19), i37, i19, i25);
                    i45++;
                    i38 += i16;
                    i39 += i16;
                }
                i35++;
                i36 += i29;
            }
            i28 = i29;
        }
        int i48 = 1 << (31 - i18);
        int i49 = i15;
        while (i26 < iMkn) {
            iArr[i49] = modp_montymul(iArr[i49], i48, i19, i25);
            i26++;
            i49 += i16;
        }
    }

    private static void modp_mkgm2(int[] iArr, int i15, int[] iArr2, int i16, int i17, int i18, int i19, int i25) {
        int iMkn = mkn(i17);
        int iModp_R2 = modp_R2(i19, i25);
        int iModp_montymul = modp_montymul(i18, iModp_R2, i19, i25);
        for (int i26 = i17; i26 < 10; i26++) {
            iModp_montymul = modp_montymul(iModp_montymul, iModp_montymul, i19, i25);
        }
        int iModp_div = modp_div(iModp_R2, iModp_montymul, i19, i25, modp_R(i19));
        int i27 = 10 - i17;
        int iModp_R = modp_R(i19);
        int iModp_montymul2 = iModp_R;
        for (int i28 = 0; i28 < iMkn; i28++) {
            short s15 = REV10[i28 << i27];
            iArr[i15 + s15] = iModp_R;
            iArr2[s15 + i16] = iModp_montymul2;
            iModp_R = modp_montymul(iModp_R, iModp_montymul, i19, i25);
            iModp_montymul2 = modp_montymul(iModp_montymul2, iModp_div, i19, i25);
        }
    }

    private static int modp_montymul(int i15, int i16, int i17, int i18) {
        long unsignedLong = toUnsignedLong(i15) * toUnsignedLong(i16);
        int i19 = ((int) ((unsignedLong + (((((long) i18) * unsignedLong) & 2147483647L) * ((long) i17))) >>> 31)) - i17;
        return i19 + ((-(i19 >>> 31)) & i17);
    }

    private static int modp_ninv31(int i15) {
        int i16 = 2 - i15;
        int i17 = i16 * (2 - (i15 * i16));
        int i18 = i17 * (2 - (i15 * i17));
        int i19 = i18 * (2 - (i15 * i18));
        return Integer.MAX_VALUE & (-(i19 * (2 - (i15 * i19))));
    }

    private static int modp_norm(int i15, int i16) {
        return i15 - (i16 & (((i15 - ((i16 + 1) >>> 1)) >>> 31) - 1));
    }

    private static void modp_poly_rec_res(int[] iArr, int i15, int i16, int i17, int i18, int i19) {
        int i25 = 1 << (i16 - 1);
        for (int i26 = 0; i26 < i25; i26++) {
            int i27 = (i26 << 1) + i15;
            iArr[i15 + i26] = modp_montymul(modp_montymul(iArr[i27], iArr[i27 + 1], i17, i18), i19, i17, i18);
        }
    }

    private static int modp_set(int i15, int i16) {
        return i15 + (i16 & (-(i15 >>> 31)));
    }

    private static int modp_sub(int i15, int i16, int i17) {
        int i18 = i15 - i16;
        return i18 + ((-(i18 >>> 31)) & i17);
    }

    private static void poly_big_to_fp(double[] dArr, int[] iArr, int i15, int i16, int i17, int i18) {
        int iMkn = mkn(i18);
        double d15 = 0.0d;
        if (i16 == 0) {
            for (int i19 = 0; i19 < iMkn; i19++) {
                dArr[i19] = 0.0d;
            }
            return;
        }
        int i25 = i15;
        int i26 = 0;
        while (i26 < iMkn) {
            int i27 = -(iArr[(i25 + i16) - 1] >>> 30);
            int i28 = i27 >>> 1;
            int i29 = i27 & 1;
            double d16 = 1.0d;
            double d17 = d15;
            int i35 = 0;
            while (i35 < i16) {
                int i36 = (iArr[i25 + i35] ^ i28) + i29;
                i29 = i36 >>> 31;
                int i37 = i36 & Integer.MAX_VALUE;
                d17 += ((double) (i37 - ((i37 << 1) & i27))) * d16;
                i35++;
                d16 *= 2.147483648E9d;
            }
            dArr[i26] = d17;
            i26++;
            i25 += i17;
            d15 = 0.0d;
        }
    }

    private static int poly_big_to_small(byte[] bArr, int i15, int[] iArr, int i16, int i17, int i18) {
        int iMkn = mkn(i18);
        for (int i19 = 0; i19 < iMkn; i19++) {
            int iZint_one_to_plain = zint_one_to_plain(iArr, i16 + i19);
            if (iZint_one_to_plain < (-i17) || iZint_one_to_plain > i17) {
                return 0;
            }
            bArr[i15 + i19] = (byte) iZint_one_to_plain;
        }
        return 1;
    }

    private static void poly_small_mkgauss(SHAKEDigest sHAKEDigest, byte[] bArr, int i15) {
        int iMkgauss;
        int iMkn = mkn(i15);
        int i16 = 0;
        for (int i17 = 0; i17 < iMkn; i17++) {
            while (true) {
                iMkgauss = mkgauss(sHAKEDigest, i15);
                if (iMkgauss >= -127 && iMkgauss <= 127) {
                    if (i17 == iMkn - 1) {
                        if (((iMkgauss & 1) ^ i16) != 0) {
                            break;
                        }
                    } else {
                        i16 ^= iMkgauss & 1;
                        break;
                    }
                }
            }
            bArr[i17] = (byte) iMkgauss;
        }
    }

    private static int poly_small_sqnorm(byte[] bArr, int i15) {
        int iMkn = mkn(i15);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < iMkn; i18++) {
            byte b15 = bArr[i18];
            i16 += b15 * b15;
            i17 |= i16;
        }
        return (-(i17 >>> 31)) | i16;
    }

    private static void poly_small_to_fp(double[] dArr, int i15, byte[] bArr, int i16) {
        int iMkn = mkn(i16);
        for (int i17 = 0; i17 < iMkn; i17++) {
            dArr[i15 + i17] = bArr[i17];
        }
    }

    private static void poly_sub_scaled(int[] iArr, int i15, int i16, int i17, int[] iArr2, int i18, int i19, int i25, int[] iArr3, int i26, int i27, int i28) {
        int iMkn = mkn(i28);
        for (int i29 = 0; i29 < iMkn; i29++) {
            int i35 = i18;
            int i36 = -iArr3[i29];
            int i37 = (i29 * i17) + i15;
            for (int i38 = 0; i38 < iMkn; i38++) {
                zint_add_scaled_mul_small(iArr, i37, i16, iArr2, i35, i19, i36, i26, i27);
                if (i29 + i38 == iMkn - 1) {
                    i37 = i15;
                    i36 = -i36;
                } else {
                    i37 += i17;
                }
                i35 += i25;
            }
        }
    }

    private static void poly_sub_scaled_ntt(int[] iArr, int i15, int i16, int i17, int[] iArr2, int i18, int i19, int i25, int[] iArr3, int i26, int i27, int i28, int[] iArr4, int i29) {
        int i35 = i19;
        int iMkn = mkn(i28);
        int i36 = i35 + 1;
        int iMkn2 = i29 + mkn(i28);
        int iMkn3 = iMkn2 + mkn(i28);
        int i37 = iMkn3 + (iMkn * i36);
        int i38 = 0;
        while (i38 < i36) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i39 = falconSmallPrimeArr[i38].f149455p;
            int iModp_ninv31 = modp_ninv31(i39);
            int iModp_R2 = modp_R2(i39, iModp_ninv31);
            int iModp_Rx = modp_Rx(i35, i39, iModp_ninv31, iModp_R2);
            int i45 = iMkn2;
            modp_mkgm2(iArr4, i29, iArr4, i45, i28, falconSmallPrimeArr[i38].f149454g, i39, iModp_ninv31);
            for (int i46 = 0; i46 < iMkn; i46++) {
                iArr4[i37 + i46] = modp_set(iArr3[i46], i39);
            }
            modp_NTT2(iArr4, i37, iArr4, i29, i28, i39, iModp_ninv31);
            int i47 = iMkn3 + i38;
            int i48 = i18;
            int i49 = i47;
            int i55 = 0;
            while (i55 < iMkn) {
                iArr4[i49] = zint_mod_small_signed(iArr2, i48, i35, i39, iModp_ninv31, iModp_R2, iModp_Rx);
                i55++;
                i48 += i25;
                i49 += i36;
                i35 = i19;
            }
            int i56 = i38;
            modp_NTT2_ext(iArr4, i47, i36, iArr4, i29, i28, i39, iModp_ninv31);
            int i57 = i47;
            int i58 = 0;
            while (i58 < iMkn) {
                iArr4[i57] = modp_montymul(modp_montymul(iArr4[i37 + i58], iArr4[i57], i39, iModp_ninv31), iModp_R2, i39, iModp_ninv31);
                i58++;
                i57 += i36;
            }
            iMkn2 = i45;
            modp_iNTT2_ext(iArr4, i47, i36, iArr4, iMkn2, i28, i39, iModp_ninv31);
            i38 = i56 + 1;
            i35 = i19;
        }
        zint_rebuild_CRT(iArr4, iMkn3, i36, i36, iMkn, 1, iArr4, i37);
        int i59 = i15;
        int i65 = iMkn3;
        int i66 = 0;
        while (i66 < iMkn) {
            int i67 = i36;
            zint_sub_scaled(iArr, i59, i16, iArr4, i65, i67, i26, i27);
            i36 = i67;
            i66++;
            i59 += i17;
            i65 += i36;
        }
    }

    private static int solve_NTRU(int i15, byte[] bArr, byte[] bArr2, byte[] bArr3, int i16, int[] iArr) {
        int iMkn = mkn(i15);
        if (solve_NTRU_deepest(i15, bArr2, bArr3, iArr) == 0) {
            return 0;
        }
        if (i15 > 2) {
            int i17 = i15;
            while (true) {
                int i18 = i17 - 1;
                if (i17 <= 2) {
                    if (solve_NTRU_binary_depth1(i15, bArr2, bArr3, iArr) != 0 && solve_NTRU_binary_depth0(i15, bArr2, bArr3, iArr) != 0) {
                        break;
                    }
                    return 0;
                }
                if (solve_NTRU_intermediate(i15, bArr2, bArr3, i18, iArr) == 0) {
                    return 0;
                }
                i17 = i18;
            }
        } else {
            int i19 = i15;
            while (true) {
                int i25 = i19 - 1;
                if (i19 <= 0) {
                    break;
                }
                if (solve_NTRU_intermediate(i15, bArr2, bArr3, i25, iArr) == 0) {
                    return 0;
                }
                i19 = i25;
            }
        }
        byte[] bArr4 = new byte[iMkn];
        if (poly_big_to_small(bArr, 0, iArr, 0, i16, i15) == 0 || poly_big_to_small(bArr4, 0, iArr, iMkn, i16, i15) == 0) {
            return 0;
        }
        int i26 = iMkn + iMkn;
        int i27 = i26 + iMkn;
        int i28 = i27 + iMkn;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i29 = falconSmallPrimeArr[0].f149455p;
        int iModp_ninv31 = modp_ninv31(i29);
        modp_mkgm2(iArr, i28, iArr, 0, i15, falconSmallPrimeArr[0].f149454g, i29, iModp_ninv31);
        for (int i35 = 0; i35 < iMkn; i35++) {
            iArr[i35] = modp_set(bArr4[i35], i29);
        }
        for (int i36 = 0; i36 < iMkn; i36++) {
            iArr[iMkn + i36] = modp_set(bArr2[i36], i29);
            iArr[i26 + i36] = modp_set(bArr3[i36], i29);
            iArr[i27 + i36] = modp_set(bArr[i36], i29);
        }
        modp_NTT2(iArr, iMkn, iArr, i28, i15, i29, iModp_ninv31);
        modp_NTT2(iArr, i26, iArr, i28, i15, i29, iModp_ninv31);
        modp_NTT2(iArr, i27, iArr, i28, i15, i29, iModp_ninv31);
        modp_NTT2(iArr, 0, iArr, i28, i15, i29, iModp_ninv31);
        int iModp_montymul = modp_montymul(12289, 1, i29, iModp_ninv31);
        for (int i37 = 0; i37 < iMkn; i37++) {
            if (modp_sub(modp_montymul(iArr[iMkn + i37], iArr[i37], i29, iModp_ninv31), modp_montymul(iArr[i26 + i37], iArr[i27 + i37], i29, iModp_ninv31), i29) != iModp_montymul) {
                return 0;
            }
        }
        return 1;
    }

    private static int solve_NTRU_binary_depth0(int i15, byte[] bArr, byte[] bArr2, int[] iArr) {
        int i16 = 1;
        int i17 = 1 << i15;
        int i18 = i17 >> 1;
        FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
        int i19 = 0;
        int i25 = falconSmallPrimeArr[0].f149455p;
        int iModp_ninv31 = modp_ninv31(i25);
        int iModp_R2 = modp_R2(i25, iModp_ninv31);
        int i26 = i18 + i18;
        int i27 = i26 + i17;
        int i28 = i27 + i17;
        int i29 = i28 + i17;
        modp_mkgm2(iArr, i28, iArr, i29, i15, falconSmallPrimeArr[0].f149454g, i25, iModp_ninv31);
        for (int i35 = 0; i35 < i18; i35++) {
            iArr[i35] = modp_set(zint_one_to_plain(iArr, i35), i25);
            int i36 = i18 + i35;
            iArr[i36] = modp_set(zint_one_to_plain(iArr, i36), i25);
        }
        int i37 = i15 - 1;
        modp_NTT2(iArr, 0, iArr, i28, i37, i25, iModp_ninv31);
        modp_NTT2(iArr, i18, iArr, i28, i37, i25, iModp_ninv31);
        for (int i38 = 0; i38 < i17; i38++) {
            iArr[i26 + i38] = modp_set(bArr[i38], i25);
            iArr[i27 + i38] = modp_set(bArr2[i38], i25);
        }
        modp_NTT2(iArr, i26, iArr, i28, i15, i25, iModp_ninv31);
        modp_NTT2(iArr, i27, iArr, i28, i15, i25, iModp_ninv31);
        int i39 = 0;
        while (i39 < i17) {
            int i45 = i26 + i39;
            int i46 = iArr[i45];
            int i47 = i45 + 1;
            int i48 = iArr[i47];
            int i49 = i27 + i39;
            int i55 = i16;
            int i56 = iArr[i49];
            int i57 = i49 + 1;
            int i58 = i19;
            int i59 = iArr[i57];
            int i65 = i39 >> 1;
            int iModp_montymul = modp_montymul(iArr[i65], iModp_R2, i25, iModp_ninv31);
            int i66 = i39;
            int iModp_montymul2 = modp_montymul(iArr[i18 + i65], iModp_R2, i25, iModp_ninv31);
            iArr[i45] = modp_montymul(i59, iModp_montymul, i25, iModp_ninv31);
            iArr[i47] = modp_montymul(i56, iModp_montymul, i25, iModp_ninv31);
            iArr[i49] = modp_montymul(i48, iModp_montymul2, i25, iModp_ninv31);
            iArr[i57] = modp_montymul(i46, iModp_montymul2, i25, iModp_ninv31);
            i39 = i66 + 2;
            i16 = i55;
            i19 = i58;
        }
        int i67 = i16;
        int i68 = i19;
        modp_iNTT2(iArr, i26, iArr, i29, i15, i25, iModp_ninv31);
        modp_iNTT2(iArr, i27, iArr, i29, i15, i25, iModp_ninv31);
        int i69 = i17 + i17;
        System.arraycopy(iArr, i26, iArr, 0, i17 * 2);
        int i75 = i69 + i17;
        int i76 = i75 + i17;
        int i77 = i76 + i17;
        int i78 = i77 + i17;
        modp_mkgm2(iArr, i69, iArr, i75, i15, FalconSmallPrimeList.PRIMES[i68].f149454g, i25, iModp_ninv31);
        modp_NTT2(iArr, 0, iArr, i69, i15, i25, iModp_ninv31);
        modp_NTT2(iArr, i17, iArr, i69, i15, i25, iModp_ninv31);
        int iModp_set = modp_set(bArr[i68], i25);
        iArr[i78] = iModp_set;
        iArr[i77] = iModp_set;
        for (int i79 = i67; i79 < i17; i79++) {
            iArr[i77 + i79] = modp_set(bArr[i79], i25);
            iArr[(i78 + i17) - i79] = modp_set(-bArr[i79], i25);
        }
        modp_NTT2(iArr, i77, iArr, i69, i15, i25, iModp_ninv31);
        modp_NTT2(iArr, i78, iArr, i69, i15, i25, iModp_ninv31);
        for (int i85 = i68; i85 < i17; i85++) {
            int iModp_montymul3 = modp_montymul(iArr[i78 + i85], iModp_R2, i25, iModp_ninv31);
            iArr[i75 + i85] = modp_montymul(iModp_montymul3, iArr[i85], i25, iModp_ninv31);
            iArr[i76 + i85] = modp_montymul(iModp_montymul3, iArr[i77 + i85], i25, iModp_ninv31);
        }
        int iModp_set2 = modp_set(bArr2[i68], i25);
        iArr[i78] = iModp_set2;
        iArr[i77] = iModp_set2;
        for (int i86 = i67; i86 < i17; i86++) {
            iArr[i77 + i86] = modp_set(bArr2[i86], i25);
            iArr[(i78 + i17) - i86] = modp_set(-bArr2[i86], i25);
        }
        modp_NTT2(iArr, i77, iArr, i69, i15, i25, iModp_ninv31);
        modp_NTT2(iArr, i78, iArr, i69, i15, i25, iModp_ninv31);
        for (int i87 = i68; i87 < i17; i87++) {
            int iModp_montymul4 = modp_montymul(iArr[i78 + i87], iModp_R2, i25, iModp_ninv31);
            int i88 = i75 + i87;
            iArr[i88] = modp_add(iArr[i88], modp_montymul(iModp_montymul4, iArr[i17 + i87], i25, iModp_ninv31), i25);
            int i89 = i76 + i87;
            iArr[i89] = modp_add(iArr[i89], modp_montymul(iModp_montymul4, iArr[i77 + i87], i25, iModp_ninv31), i25);
        }
        modp_mkgm2(iArr, i69, iArr, i77, i15, FalconSmallPrimeList.PRIMES[i68].f149454g, i25, iModp_ninv31);
        modp_iNTT2(iArr, i75, iArr, i77, i15, i25, iModp_ninv31);
        modp_iNTT2(iArr, i76, iArr, i77, i15, i25, iModp_ninv31);
        int i95 = i76;
        for (int i96 = i68; i96 < i17; i96++) {
            int i97 = i75 + i96;
            iArr[i69 + i96] = modp_norm(iArr[i97], i25);
            iArr[i97] = modp_norm(iArr[i95 + i96], i25);
        }
        double[] dArr = new double[i17 * 3];
        for (int i98 = i68; i98 < i17; i98++) {
            dArr[i69 + i98] = iArr[i75 + i98];
        }
        FalconFFT.FFT(dArr, i69, i15);
        System.arraycopy(dArr, i69, dArr, i17, i18);
        int i99 = i17 + i18;
        int i100 = i68;
        while (i100 < i17) {
            dArr[i99 + i100] = iArr[i69 + i100];
            i100++;
            i95 = i95;
        }
        int i101 = i95;
        FalconFFT.FFT(dArr, i99, i15);
        FalconFFT.poly_div_autoadj_fft(dArr, i99, dArr, i17, i15);
        FalconFFT.iFFT(dArr, i99, i15);
        int i102 = i68;
        while (i102 < i17) {
            iArr[i69 + i102] = modp_set((int) FPREngine.fpr_rint(dArr[i99 + i102]), i25);
            i102++;
            dArr = dArr;
            i99 = i99;
        }
        modp_mkgm2(iArr, i75, iArr, i101, i15, FalconSmallPrimeList.PRIMES[i68].f149454g, i25, iModp_ninv31);
        for (int i103 = i68; i103 < i17; i103++) {
            iArr[i77 + i103] = modp_set(bArr[i103], i25);
            iArr[i78 + i103] = modp_set(bArr2[i103], i25);
        }
        modp_NTT2(iArr, i69, iArr, i75, i15, i25, iModp_ninv31);
        modp_NTT2(iArr, i77, iArr, i75, i15, i25, iModp_ninv31);
        modp_NTT2(iArr, i78, iArr, i75, i15, i25, iModp_ninv31);
        for (int i104 = i68; i104 < i17; i104++) {
            int iModp_montymul5 = modp_montymul(iArr[i69 + i104], iModp_R2, i25, iModp_ninv31);
            iArr[i104] = modp_sub(iArr[i104], modp_montymul(iModp_montymul5, iArr[i77 + i104], i25, iModp_ninv31), i25);
            int i105 = i17 + i104;
            iArr[i105] = modp_sub(iArr[i105], modp_montymul(iModp_montymul5, iArr[i78 + i104], i25, iModp_ninv31), i25);
        }
        modp_iNTT2(iArr, 0, iArr, i101, i15, i25, iModp_ninv31);
        modp_iNTT2(iArr, i17, iArr, i101, i15, i25, iModp_ninv31);
        for (int i106 = i68; i106 < i17; i106++) {
            iArr[i106] = modp_norm(iArr[i106], i25);
            int i107 = i17 + i106;
            iArr[i107] = modp_norm(iArr[i107], i25);
        }
        return i67;
    }

    private static int solve_NTRU_binary_depth1(int i15, byte[] bArr, byte[] bArr2, int[] iArr) {
        int i16;
        int i17;
        int i18 = 1;
        int i19 = 1 << i15;
        int i25 = i15 - 1;
        int i26 = 1 << i25;
        int i27 = i26 >> 1;
        int[] iArr2 = MAX_BL_SMALL;
        int i28 = iArr2[1];
        int i29 = iArr2[2];
        int i35 = MAX_BL_LARGE[1];
        int i36 = i29 * i27;
        int i37 = i36 + i36;
        int i38 = i35 * i26;
        int i39 = i37 + i38;
        int i45 = 0;
        while (i45 < i35) {
            int i46 = FalconSmallPrimeList.PRIMES[i45].f149455p;
            int i47 = i45;
            int iModp_ninv31 = modp_ninv31(i46);
            int iModp_R2 = modp_R2(i46, iModp_ninv31);
            int iModp_Rx = modp_Rx(i29, i46, iModp_ninv31, iModp_R2);
            int i48 = i37 + i47;
            int i49 = i39 + i47;
            int i55 = i39;
            int i56 = i36;
            int i57 = i18;
            int i58 = 0;
            int i59 = 0;
            while (i59 < i27) {
                int i65 = i46;
                int i66 = iModp_R2;
                int i67 = i58;
                iArr[i48] = zint_mod_small_signed(iArr, i58, i29, i65, iModp_ninv31, i66, iModp_Rx);
                int i68 = i56;
                iArr[i49] = zint_mod_small_signed(iArr, i68, i29, i65, iModp_ninv31, i66, iModp_Rx);
                i48 += i35;
                i49 += i35;
                i56 = i68 + i29;
                i58 = i67 + i29;
                i46 = i65;
                iModp_R2 = i66;
                i38 = i38;
                i28 = i28;
                i59++;
                i55 = i55;
            }
            i45 = i47 + 1;
            i38 = i38;
            i28 = i28;
            i18 = i57;
            i39 = i55;
        }
        int i69 = i18;
        int i75 = i28;
        int i76 = 0;
        int i77 = i38;
        int[] iArr3 = iArr;
        System.arraycopy(iArr3, i37, iArr3, 0, i77);
        System.arraycopy(iArr3, i39, iArr3, i77, i77);
        int i78 = i77 + i77;
        int i79 = i75 * i26;
        int i85 = i78 + i79;
        int i86 = i85 + i79;
        int i87 = 0;
        while (i87 < i35) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i88 = falconSmallPrimeArr[i87].f149455p;
            int iModp_ninv32 = modp_ninv31(i88);
            int iModp_R3 = modp_R2(i88, iModp_ninv32);
            int i89 = i86;
            int i95 = i89 + i19;
            int i96 = i95 + i26;
            int i97 = i96 + i19;
            int i98 = i87;
            modp_mkgm2(iArr3, i89, iArr, i95, i15, falconSmallPrimeArr[i87].f149454g, i88, iModp_ninv32);
            for (int i99 = i76; i99 < i19; i99++) {
                i16 = i88;
                iArr[i96 + i99] = modp_set(bArr[i99], i16);
                iArr[i97 + i99] = modp_set(bArr2[i99], i16);
            }
            i16 = i88;
            modp_NTT2(iArr, i96, iArr, i89, i15, i16, iModp_ninv32);
            modp_NTT2(iArr, i97, iArr, i89, i15, i16, iModp_ninv32);
            int i100 = i15;
            while (i100 > i25) {
                int i101 = i16;
                int i102 = iModp_R3;
                int i103 = i96;
                modp_poly_rec_res(iArr, i103, i100, i101, iModp_ninv32, i102);
                int i104 = i97;
                modp_poly_rec_res(iArr, i104, i100, i101, iModp_ninv32, i102);
                i16 = i101;
                iModp_R3 = i102;
                i97 = i104;
                i100--;
                i96 = i103;
            }
            int i105 = iModp_R3;
            int i106 = i89 + i26;
            System.arraycopy(iArr, i95, iArr, i106, i26);
            int i107 = i106 + i26;
            System.arraycopy(iArr, i96, iArr, i107, i26);
            int i108 = i107 + i26;
            System.arraycopy(iArr, i97, iArr, i108, i26);
            int i109 = i108 + i26;
            int i110 = i109 + i27;
            int i111 = i77 + i98;
            int i112 = i111;
            int i113 = i98;
            int i114 = 0;
            while (i114 < i27) {
                iArr[i109 + i114] = iArr[i113];
                iArr[i110 + i114] = iArr[i112];
                i114++;
                i113 += i35;
                i112 += i35;
            }
            int i115 = i15 - 2;
            modp_NTT2(iArr, i109, iArr, i89, i115, i16, iModp_ninv32);
            int i116 = i110;
            modp_NTT2(iArr, i116, iArr, i89, i115, i16, iModp_ninv32);
            int i117 = i111;
            int i118 = i98;
            int i119 = 0;
            while (i119 < i27) {
                int i120 = i119 << 1;
                int i121 = i107 + i120;
                int i122 = i118;
                int i123 = iArr[i121];
                int i124 = i116;
                int i125 = iArr[i121 + 1];
                int i126 = i120 + i108;
                int i127 = i117;
                int i128 = iArr[i126];
                int i129 = iArr[i126 + 1];
                int i130 = i119;
                int iModp_montymul = modp_montymul(iArr[i109 + i119], i105, i16, iModp_ninv32);
                int i131 = i108;
                int iModp_montymul2 = modp_montymul(iArr[i124 + i130], i105, i16, iModp_ninv32);
                iArr[i122] = modp_montymul(i129, iModp_montymul, i16, iModp_ninv32);
                iArr[i122 + i35] = modp_montymul(i128, iModp_montymul, i16, iModp_ninv32);
                iArr[i127] = modp_montymul(i125, iModp_montymul2, i16, iModp_ninv32);
                iArr[i127 + i35] = modp_montymul(i123, iModp_montymul2, i16, iModp_ninv32);
                i119 = i130 + 1;
                int i132 = i35 << 1;
                i117 = i127 + i132;
                i118 = i122 + i132;
                i116 = i124;
                i108 = i131;
            }
            int i133 = i108;
            int i134 = i35;
            int i135 = i16;
            int i136 = i25;
            modp_iNTT2_ext(iArr, i98, i134, iArr, i106, i136, i135, iModp_ninv32);
            modp_iNTT2_ext(iArr, i111, i134, iArr, i106, i136, i135, iModp_ninv32);
            int i137 = i75;
            if (i98 < i137) {
                modp_iNTT2(iArr, i107, iArr, i106, i136, i135, iModp_ninv32);
                modp_iNTT2(iArr, i133, iArr, i106, i136, i135, iModp_ninv32);
                i17 = i136;
                int i138 = i78 + i98;
                int i139 = i85 + i98;
                int i140 = 0;
                while (i140 < i26) {
                    iArr[i138] = iArr[i107 + i140];
                    iArr[i139] = iArr[i133 + i140];
                    i140++;
                    i138 += i137;
                    i139 += i137;
                }
            } else {
                i17 = i136;
            }
            i87 = i98 + 1;
            iArr3 = iArr;
            i75 = i137;
            i25 = i17;
            i86 = i89;
            i76 = 0;
            i35 = i134;
        }
        int i141 = i86;
        int i142 = i35;
        int i143 = i25;
        int i144 = i75;
        int i145 = i26 << 1;
        zint_rebuild_CRT(iArr, 0, i142, i142, i145, 1, iArr, i141);
        zint_rebuild_CRT(iArr, i78, i144, i144, i145, 1, iArr, i141);
        double[] dArr = new double[i26];
        double[] dArr2 = new double[i26];
        poly_big_to_fp(dArr, iArr, 0, i142, i142, i143);
        poly_big_to_fp(dArr2, iArr, i77, i142, i142, i143);
        System.arraycopy(iArr, i78, iArr, 0, i144 * 2 * i26);
        double[] dArr3 = new double[i26];
        double[] dArr4 = new double[i26];
        poly_big_to_fp(dArr3, iArr, 0, i144, i144, i143);
        poly_big_to_fp(dArr4, iArr, i79, i144, i144, i143);
        FalconFFT.FFT(dArr, 0, i143);
        FalconFFT.FFT(dArr2, 0, i143);
        FalconFFT.FFT(dArr3, 0, i143);
        FalconFFT.FFT(dArr4, 0, i143);
        double[] dArr5 = new double[i26];
        double[] dArr6 = new double[i27];
        FalconFFT.poly_add_muladj_fft(dArr5, dArr, dArr2, dArr3, dArr4, i143);
        FalconFFT.poly_invnorm2_fft(dArr6, 0, dArr3, 0, dArr4, 0, i143);
        FalconFFT.poly_mul_autoadj_fft(dArr5, 0, dArr6, 0, i143);
        FalconFFT.iFFT(dArr5, 0, i143);
        for (int i146 = 0; i146 < i26; i146++) {
            double d15 = dArr5[i146];
            if (d15 >= 9.223372036854776E18d || -9.223372036854776E18d >= d15) {
                return 0;
            }
            dArr5[i146] = FPREngine.fpr_rint(d15);
        }
        FalconFFT.FFT(dArr5, 0, i143);
        FalconFFT.poly_mul_fft(dArr3, 0, dArr5, 0, i143);
        FalconFFT.poly_mul_fft(dArr4, 0, dArr5, 0, i143);
        FalconFFT.poly_sub(dArr, 0, dArr3, 0, i143);
        FalconFFT.poly_sub(dArr2, 0, dArr4, 0, i143);
        FalconFFT.iFFT(dArr, 0, i143);
        FalconFFT.iFFT(dArr2, 0, i143);
        for (int i147 = 0; i147 < i26; i147++) {
            iArr[i147] = (int) FPREngine.fpr_rint(dArr[i147]);
            iArr[i26 + i147] = (int) FPREngine.fpr_rint(dArr2[i147]);
        }
        return i69;
    }

    private static int solve_NTRU_deepest(int i15, byte[] bArr, byte[] bArr2, int[] iArr) {
        int i16 = MAX_BL_SMALL[i15];
        int i17 = i16 + i16;
        int i18 = i17 + i16;
        int i19 = i18 + i16;
        make_fg(iArr, i17, bArr, bArr2, i15, i15, 0);
        zint_rebuild_CRT(iArr, i17, i16, i16, 2, 0, iArr, i19);
        return (zint_bezout(iArr, i16, iArr, 0, iArr, i17, iArr, i18, i16, iArr, i19) != 0 && zint_mul_small(iArr, 0, i16, 12289) == 0 && zint_mul_small(iArr, i16, i16, 12289) == 0) ? 1 : 0;
    }

    private static int solve_NTRU_intermediate(int i15, byte[] bArr, byte[] bArr2, int i16, int[] iArr) {
        double d15;
        int i17;
        int i18;
        int i19;
        int i25;
        int i26;
        int i27;
        int i28;
        double[] dArr;
        int[] iArr2;
        int i29;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i55;
        int i56;
        int i57;
        int i58 = i15 - i16;
        int i59 = 1;
        int i65 = 1 << i58;
        int i66 = i65 >> 1;
        int[] iArr3 = MAX_BL_SMALL;
        int i67 = iArr3[i16];
        int i68 = iArr3[i16 + 1];
        int i69 = MAX_BL_LARGE[i16];
        int i75 = i68 * i66;
        int i76 = i75 + i75;
        int[] iArr4 = iArr;
        make_fg(iArr4, i76, bArr, bArr2, i15, i16, 1);
        int i77 = i16;
        int i78 = i65 * i69;
        int i79 = i78 + i78;
        int i85 = i65 * i67;
        System.arraycopy(iArr4, i76, iArr4, i79, i85 + i85);
        int i86 = i79 + i85;
        int i87 = i86 + i85;
        int i88 = 0;
        System.arraycopy(iArr4, 0, iArr4, i87, i75 + i75);
        int i89 = i75 + i87;
        int i95 = 0;
        while (i95 < i69) {
            int i96 = FalconSmallPrimeList.PRIMES[i95].f149455p;
            int iModp_ninv31 = modp_ninv31(i96);
            int i97 = i59;
            int iModp_R2 = modp_R2(i96, iModp_ninv31);
            int iModp_Rx = modp_Rx(i68, i96, iModp_ninv31, iModp_R2);
            int i98 = i78 + i95;
            int i99 = i87;
            int i100 = i95;
            int i101 = i65;
            int i102 = i89;
            int i103 = 0;
            while (i103 < i66) {
                int i104 = i68;
                int i105 = i95;
                int i106 = i96;
                int i107 = iModp_R2;
                int i108 = i87;
                iArr[i100] = zint_mod_small_signed(iArr4, i87, i104, i106, iModp_ninv31, i107, iModp_Rx);
                int i109 = i102;
                iArr[i98] = zint_mod_small_signed(iArr, i109, i104, i106, iModp_ninv31, i107, iModp_Rx);
                i103++;
                i102 = i109 + i104;
                i100 += i69;
                i98 += i69;
                i68 = i104;
                i79 = i79;
                i87 = i108 + i104;
                iModp_R2 = i107;
                iArr4 = iArr;
                i96 = i106;
                i95 = i105;
            }
            i95++;
            i68 = i68;
            i79 = i79;
            iArr4 = iArr;
            i88 = 0;
            i59 = i97;
            i65 = i101;
            i87 = i99;
        }
        int i110 = i87;
        int i111 = i79;
        int i112 = i65;
        int i113 = i59;
        int i114 = i88;
        while (i114 < i69) {
            FalconSmallPrime[] falconSmallPrimeArr = FalconSmallPrimeList.PRIMES;
            int i115 = falconSmallPrimeArr[i114].f149455p;
            int iModp_ninv32 = modp_ninv31(i115);
            int iModp_R3 = modp_R2(i115, iModp_ninv32);
            if (i114 == i67) {
                int i116 = i111;
                i37 = iModp_R3;
                i38 = i67;
                i39 = i112;
                int i117 = i110;
                zint_rebuild_CRT(iArr, i116, i38, i67, i39, 1, iArr, i117);
                i46 = i116;
                zint_rebuild_CRT(iArr, i86, i38, i38, i39, 1, iArr, i117);
                i45 = i117;
            } else {
                i37 = iModp_R3;
                i38 = i67;
                i39 = i112;
                i45 = i110;
                i46 = i111;
            }
            int i118 = i45 + i39;
            int i119 = i118 + i39;
            int i120 = i119 + i39;
            int i121 = i38;
            int i122 = i45;
            int i123 = i115;
            int i124 = i39;
            int i125 = i58;
            modp_mkgm2(iArr, i122, iArr, i118, i125, falconSmallPrimeArr[i114].f149454g, i123, iModp_ninv32);
            if (i114 < i121) {
                int i126 = i46 + i114;
                int i127 = i86 + i114;
                int i128 = i126;
                int i129 = i127;
                int i130 = 0;
                while (i130 < i124) {
                    iArr[i119 + i130] = iArr[i128];
                    iArr[i120 + i130] = iArr[i129];
                    i130++;
                    i128 += i121;
                    i129 += i121;
                }
                modp_iNTT2_ext(iArr, i126, i121, iArr, i118, i125, i123, iModp_ninv32);
                modp_iNTT2_ext(iArr, i127, i121, iArr, i118, i125, i123, iModp_ninv32);
                i57 = iModp_ninv32;
                i47 = i122;
                i49 = i119;
                i55 = i120;
                i48 = i121;
                i56 = i125;
            } else {
                int i131 = i123;
                int iModp_Rx2 = modp_Rx(i121, i131, iModp_ninv32, i37);
                int i132 = i86;
                int i133 = i46;
                int i134 = 0;
                while (i134 < i124) {
                    int i135 = i131;
                    int i136 = i37;
                    int i137 = i134;
                    int i138 = i133;
                    int i139 = iModp_Rx2;
                    iArr[i119 + i134] = zint_mod_small_signed(iArr, i133, i121, i135, iModp_ninv32, i136, iModp_Rx2);
                    int i140 = i132;
                    iArr[i120 + i137] = zint_mod_small_signed(iArr, i140, i121, i135, iModp_ninv32, i136, i139);
                    int i141 = i137 + 1;
                    i132 = i140 + i121;
                    i133 = i138 + i121;
                    i37 = i136;
                    i131 = i135;
                    iModp_Rx2 = i139;
                    i134 = i141;
                }
                int i142 = i131;
                i47 = i122;
                i48 = i121;
                modp_NTT2(iArr, i119, iArr, i47, i125, i142, iModp_ninv32);
                i49 = i119;
                modp_NTT2(iArr, i120, iArr, i47, i125, i142, iModp_ninv32);
                i55 = i120;
                i56 = i125;
                i57 = iModp_ninv32;
                i123 = i142;
            }
            int i143 = i55 + i124;
            int i144 = i143 + i66;
            int i145 = i78 + i114;
            int i146 = i114;
            int i147 = i145;
            int i148 = 0;
            while (i148 < i66) {
                iArr[i143 + i148] = iArr[i146];
                iArr[i144 + i148] = iArr[i147];
                i148++;
                i146 += i69;
                i147 += i69;
            }
            int i149 = i123;
            int i150 = i57;
            int i151 = i56 - 1;
            modp_NTT2(iArr, i143, iArr, i47, i151, i149, i150);
            int i152 = i144;
            modp_NTT2(iArr, i152, iArr, i47, i151, i149, i150);
            i110 = i47;
            int i153 = i114;
            int i154 = i145;
            int i155 = 0;
            while (i155 < i66) {
                int i156 = i155 << 1;
                int i157 = i49 + i156;
                int i158 = i155;
                int i159 = iArr[i157];
                int i160 = i152;
                int i161 = iArr[i157 + 1];
                int i162 = i55 + i156;
                int i163 = i153;
                int i164 = iArr[i162];
                int i165 = iArr[i162 + 1];
                int i166 = i154;
                int iModp_montymul = modp_montymul(iArr[i143 + i158], i37, i149, i150);
                int i167 = i56;
                int iModp_montymul2 = modp_montymul(iArr[i160 + i158], i37, i149, i150);
                iArr[i163] = modp_montymul(i165, iModp_montymul, i149, i150);
                iArr[i163 + i69] = modp_montymul(i164, iModp_montymul, i149, i150);
                iArr[i166] = modp_montymul(i161, iModp_montymul2, i149, i150);
                iArr[i166 + i69] = modp_montymul(i159, iModp_montymul2, i149, i150);
                i155 = i158 + 1;
                int i168 = i69 << 1;
                i153 = i163 + i168;
                i154 = i166 + i168;
                i152 = i160;
                i56 = i167;
            }
            int i169 = i56;
            int i170 = i114;
            modp_iNTT2_ext(iArr, i170, i69, iArr, i118, i169, i149, i150);
            modp_iNTT2_ext(iArr, i145, i69, iArr, i118, i169, i149, i150);
            i114 = i170 + 1;
            i111 = i46;
            i112 = i124;
            i67 = i48;
            i58 = i169;
        }
        int i171 = i58;
        int i172 = i67;
        int i173 = i112;
        int i174 = i111;
        int i175 = i110;
        zint_rebuild_CRT(iArr, 0, i69, i69, i173, 1, iArr, i175);
        zint_rebuild_CRT(iArr, i78, i69, i69, i173, 1, iArr, i175);
        double[] dArr2 = new double[i173];
        double[] dArr3 = new double[i173];
        double[] dArr4 = new double[i173];
        double[] dArr5 = new double[i173];
        double[] dArr6 = new double[i66];
        int[] iArr5 = new int[i173];
        int iMin = Math.min(i172, 10);
        int i176 = (i174 + i172) - iMin;
        int i177 = 10;
        poly_big_to_fp(dArr4, iArr, i176, iMin, i172, i171);
        poly_big_to_fp(dArr5, iArr, (i86 + i172) - iMin, iMin, i172, i171);
        int i178 = i172;
        int i179 = (i178 - iMin) * 31;
        int i180 = bitlength_avg[i77];
        int i181 = bitlength_std[i77];
        int i182 = i180 - (i181 * 6);
        int i183 = i180 + (i181 * 6);
        FalconFFT.FFT(dArr4, 0, i171);
        FalconFFT.FFT(dArr5, 0, i171);
        FalconFFT.poly_invnorm2_fft(dArr6, 0, dArr4, 0, dArr5, 0, i171);
        double[] dArr7 = dArr5;
        int i184 = i171;
        double[] dArr8 = dArr4;
        FalconFFT.poly_adj_fft(dArr8, 0, i184);
        FalconFFT.poly_adj_fft(dArr7, 0, i184);
        int i185 = i69 * 31;
        int i186 = i185;
        int i187 = i185 - i182;
        int i188 = i69;
        while (true) {
            int iMin2 = Math.min(i188, i177);
            double[] dArr9 = dArr2;
            double[] dArr10 = dArr7;
            int i189 = i69;
            double[] dArr11 = dArr6;
            int i190 = i188;
            poly_big_to_fp(dArr9, iArr, i188 - iMin2, iMin2, i189, i184);
            double[] dArr12 = dArr3;
            poly_big_to_fp(dArr12, iArr, (i78 + i190) - iMin2, iMin2, i189, i184);
            FalconFFT.FFT(dArr9, 0, i184);
            FalconFFT.FFT(dArr12, 0, i184);
            FalconFFT.poly_mul_fft(dArr9, 0, dArr8, 0, i184);
            FalconFFT.poly_mul_fft(dArr12, 0, dArr10, 0, i184);
            FalconFFT.poly_add(dArr12, 0, dArr9, 0, i184);
            FalconFFT.poly_mul_autoadj_fft(dArr12, 0, dArr11, 0, i184);
            FalconFFT.iFFT(dArr12, 0, i184);
            int i191 = (i187 - ((i188 - iMin2) * 31)) + i179;
            if (i191 < 0) {
                i191 = -i191;
                d15 = 2.0d;
            } else {
                d15 = 0.5d;
            }
            double d16 = 1.0d;
            while (i191 != 0) {
                if ((i191 & 1) != 0) {
                    d16 *= d15;
                }
                i191 >>= 1;
                d15 *= d15;
            }
            int i192 = 0;
            while (i192 < i173) {
                double d17 = dArr12[i192] * d16;
                if (-2.147483647E9d >= d17 || d17 >= 2.147483647E9d) {
                    return 0;
                }
                iArr5[i192] = (int) FPREngine.fpr_rint(d17);
                i192++;
                dArr11 = dArr11;
            }
            double[] dArr13 = dArr11;
            int i193 = i186;
            int i194 = i187 / 31;
            int i195 = i187 % 31;
            if (i77 <= 4) {
                i28 = i175;
                int i196 = i178;
                i35 = i184;
                int i197 = i174;
                i29 = i178;
                dArr = dArr10;
                i17 = i193;
                i25 = 10;
                i27 = i189;
                iArr2 = iArr;
                poly_sub_scaled_ntt(iArr2, 0, i190, i27, iArr, i197, i29, i196, iArr5, i194, i195, i35, iArr, i28);
                i26 = 0;
                i19 = i197;
                i36 = i78;
                poly_sub_scaled_ntt(iArr2, i36, i190, i27, iArr, i86, i29, i29, iArr5, i194, i195, i35, iArr, i28);
                i18 = i190;
            } else {
                i17 = i193;
                i18 = i190;
                i19 = i174;
                i25 = 10;
                i26 = 0;
                i27 = i189;
                i28 = i175;
                int i198 = i178;
                dArr = dArr10;
                iArr2 = iArr;
                i29 = i198;
                i35 = i184;
                poly_sub_scaled(iArr2, 0, i18, i27, iArr, i19, i29, i198, iArr5, i194, i195, i35);
                i36 = i78;
                poly_sub_scaled(iArr2, i36, i18, i27, iArr, i86, i29, i29, iArr5, i194, i195, i35);
            }
            int i199 = i29;
            i184 = i35;
            int i200 = i187 + i183;
            int i201 = i200 + 10;
            if (i201 < i17) {
                if (i18 * 31 >= i200 + 41) {
                    i18--;
                }
                i186 = i201;
            } else {
                i186 = i17;
            }
            if (i187 <= 0) {
                if (i18 < i199) {
                    int i202 = i36;
                    int i203 = 0;
                    int i204 = i26;
                    while (i203 < i173) {
                        int i205 = (-(iArr2[(i204 + i18) - 1] >>> 30)) >>> 1;
                        for (int i206 = i18; i206 < i199; i206++) {
                            iArr2[i204 + i206] = i205;
                        }
                        int i207 = (-(iArr2[(i202 + i18) - 1] >>> 30)) >>> 1;
                        for (int i208 = i18; i208 < i199; i208++) {
                            iArr2[i202 + i208] = i207;
                        }
                        i203++;
                        i204 += i27;
                        i202 += i27;
                    }
                }
                int i209 = 0;
                int i210 = 0;
                int i211 = 0;
                while (i210 < (i173 << 1)) {
                    System.arraycopy(iArr2, i209, iArr2, i211, i199);
                    i210++;
                    i211 += i199;
                    i209 += i27;
                }
                return i113;
            }
            int i212 = i187 - 25;
            i187 = i212 < 0 ? 0 : i212;
            i77 = i16;
            i78 = i36;
            i188 = i18;
            i175 = i28;
            dArr3 = dArr12;
            dArr8 = dArr8;
            dArr7 = dArr;
            dArr2 = dArr9;
            dArr6 = dArr13;
            i177 = i25;
            i174 = i19;
            i178 = i199;
            i69 = i27;
        }
    }

    private static long toUnsignedLong(int i15) {
        return ((long) i15) & BodyPartID.bodyIdMax;
    }

    private static void zint_add_mul_small(int[] iArr, int i15, int[] iArr2, int i16, int i17, int i18) {
        int i19 = 0;
        for (int i25 = 0; i25 < i17; i25++) {
            int i26 = i15 + i25;
            long unsignedLong = (toUnsignedLong(iArr2[i16 + i25]) * toUnsignedLong(i18)) + toUnsignedLong(iArr[i26]) + toUnsignedLong(i19);
            iArr[i26] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i19 = (int) (unsignedLong >>> 31);
        }
        iArr[i15 + i17] = i19;
    }

    private static void zint_add_scaled_mul_small(int[] iArr, int i15, int i16, int[] iArr2, int i17, int i18, int i19, int i25, int i26) {
        if (i18 == 0) {
            return;
        }
        int i27 = (-(iArr2[(i17 + i18) - 1] >>> 30)) >>> 1;
        int i28 = 0;
        int i29 = i25;
        int i35 = 0;
        while (i29 < i16) {
            int i36 = i29 - i25;
            int i37 = i36 < i18 ? iArr2[i17 + i36] : i27;
            int i38 = i15 + i29;
            long unsignedLong = (toUnsignedLong(i28 | ((i37 << i26) & Integer.MAX_VALUE)) * ((long) i19)) + toUnsignedLong(iArr[i38]) + ((long) i35);
            iArr[i38] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i35 = (int) (unsignedLong >>> 31);
            i29++;
            i28 = i37 >>> (31 - i26);
        }
    }

    private static int zint_bezout(int[] iArr, int i15, int[] iArr2, int i16, int[] iArr3, int i17, int[] iArr4, int i18, int i19, int[] iArr5, int i25) {
        int[] iArr6 = iArr3;
        int i26 = i17;
        int[] iArr7 = iArr4;
        int i27 = i18;
        int i28 = i19;
        int[] iArr8 = iArr5;
        int i29 = i25;
        if (i28 == 0) {
            return 0;
        }
        int i35 = i29 + i28;
        int i36 = i35 + i28;
        int i37 = i36 + i28;
        int iModp_ninv31 = modp_ninv31(iArr6[i26]);
        int iModp_ninv32 = modp_ninv31(iArr7[i27]);
        System.arraycopy(iArr6, i26, iArr8, i36, i28);
        System.arraycopy(iArr7, i27, iArr8, i37, i28);
        iArr[i15] = 1;
        iArr2[i16] = 0;
        for (int i38 = 1; i38 < i28; i38++) {
            iArr[i15 + i38] = 0;
            iArr2[i16 + i38] = 0;
        }
        System.arraycopy(iArr7, i27, iArr8, i29, i28);
        System.arraycopy(iArr6, i26, iArr8, i35, i28);
        iArr8[i35] = iArr8[i35] - 1;
        int i39 = 30;
        int i45 = (i28 * 62) + 30;
        while (true) {
            int i46 = 31;
            if (i45 < i39) {
                break;
            }
            int i47 = -1;
            int i48 = i28;
            int i49 = -1;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            while (true) {
                int i59 = i48 - 1;
                if (i48 <= 0) {
                    break;
                }
                int i65 = iArr8[i36 + i59];
                int i66 = iArr8[i37 + i59];
                i56 ^= (i56 ^ i65) & i49;
                i55 ^= (i55 ^ i65) & i47;
                i58 ^= (i58 ^ i66) & i49;
                i57 ^= (i57 ^ i66) & i47;
                int i67 = i49 & ((((i65 | i66) + Integer.MAX_VALUE) >>> 31) - 1);
                int i68 = i49;
                i49 = i67;
                i47 = i68;
                i48 = i59;
            }
            int i69 = ~i47;
            long unsignedLong = (toUnsignedLong(i56 & i69) << 31) + toUnsignedLong(i55 | (i56 & i47));
            long unsignedLong2 = (toUnsignedLong(i58 & i69) << 31) + toUnsignedLong(i57 | (i58 & i47));
            int i75 = iArr8[i36];
            int i76 = iArr8[i37];
            long j15 = 0;
            long j16 = 1;
            int i77 = iModp_ninv31;
            long j17 = 0;
            long j18 = 1;
            int i78 = 0;
            while (i78 < i46) {
                long j19 = unsignedLong2 - unsignedLong;
                int i79 = i46;
                int i85 = i36;
                int i86 = (int) ((j19 ^ ((unsignedLong ^ unsignedLong2) & (unsignedLong ^ j19))) >>> 63);
                int i87 = (i75 >> i78) & 1;
                int i88 = i87 & (i76 >> i78) & 1;
                int i89 = i78;
                int i95 = i88 & i86;
                int i96 = i88 & (~i86);
                int i97 = (i87 ^ 1) | i95;
                int i98 = i75 - ((-i95) & i76);
                long j25 = unsignedLong - (unsignedLong2 & (-toUnsignedLong(i95)));
                long j26 = -i95;
                long j27 = j18 - (j17 & j26);
                long j28 = j15 - (j16 & j26);
                int i99 = i76 - ((-i96) & i98);
                long j29 = unsignedLong2 - (j25 & (-toUnsignedLong(i96)));
                long j35 = -i96;
                long j36 = j17 - (j27 & j35);
                long j37 = j16 - (j28 & j35);
                i75 = i98 + ((i97 - 1) & i98);
                long j38 = i97;
                long j39 = j38 - 1;
                j18 = j27 + (j27 & j39);
                j15 = j28 + (j28 & j39);
                unsignedLong = j25 ^ ((j25 ^ (j25 >> 1)) & (-toUnsignedLong(i97)));
                i76 = i99 + ((-i97) & i99);
                long j45 = -j38;
                j17 = j36 + (j36 & j45);
                j16 = j37 + (j37 & j45);
                unsignedLong2 = j29 ^ ((j29 ^ (j29 >> 1)) & (toUnsignedLong(i97) - 1));
                i78 = i89 + 1;
                iModp_ninv32 = iModp_ninv32;
                i36 = i85;
                i46 = i79;
                i45 = i45;
                i35 = i35;
            }
            int i100 = iModp_ninv32;
            long j46 = j15;
            long j47 = j18;
            int iZint_co_reduce = zint_co_reduce(iArr8, i36, iArr5, i37, i28, j47, j46, j17, j16);
            long j48 = -(iZint_co_reduce & 1);
            long j49 = j47 - ((j47 + j47) & j48);
            long j55 = j46 - (j48 & (j46 + j46));
            long j56 = -(iZint_co_reduce >>> 1);
            long j57 = j17 - ((j17 + j17) & j56);
            long j58 = j16 - ((j16 + j16) & j56);
            zint_co_reduce_mod(iArr, i15, iArr5, i29, iArr7, i27, i19, i100, j49, j55, j57, j58);
            i28 = i19;
            zint_co_reduce_mod(iArr2, i16, iArr5, i35, iArr6, i26, i28, i77, j49, j55, j57, j58);
            i45 -= 30;
            iArr6 = iArr3;
            i26 = i17;
            iArr7 = iArr4;
            i27 = i18;
            iArr8 = iArr5;
            i29 = i25;
            iModp_ninv31 = i77;
            i37 = i37;
            i39 = 30;
            iModp_ninv32 = i100;
            i36 = i36;
        }
        int i101 = i36;
        int i102 = iArr5[i101] ^ 1;
        for (int i103 = 1; i103 < i28; i103++) {
            i102 |= iArr5[i101 + i103];
        }
        return (1 - ((i102 | (-i102)) >>> 31)) & iArr3[i17] & iArr4[i18];
    }

    private static int zint_co_reduce(int[] iArr, int i15, int[] iArr2, int i16, int i17, long j15, long j16, long j17, long j18) {
        long j19 = 0;
        int i18 = 0;
        long j25 = 0;
        while (i18 < i17) {
            int i19 = i15 + i18;
            int i25 = i16 + i18;
            long j26 = iArr[i19];
            int i26 = i18;
            long j27 = iArr2[i25];
            long j28 = (j26 * j15) + (j27 * j16) + j19;
            long j29 = (j26 * j17) + (j27 * j18) + j25;
            if (i26 > 0) {
                iArr[i19 - 1] = ((int) j28) & Integer.MAX_VALUE;
                iArr2[i25 - 1] = ((int) j29) & Integer.MAX_VALUE;
            }
            j19 = j28 >> 31;
            j25 = j29 >> 31;
            i18 = i26 + 1;
        }
        iArr[(i15 + i17) - 1] = (int) j19;
        iArr2[(i16 + i17) - 1] = (int) j25;
        int i27 = (int) (j19 >>> 63);
        int i28 = (int) (j25 >>> 63);
        zint_negate(iArr, i15, i17, i27);
        zint_negate(iArr2, i16, i17, i28);
        return (i28 << 1) | i27;
    }

    private static void zint_co_reduce_mod(int[] iArr, int i15, int[] iArr2, int i16, int[] iArr3, int i17, int i18, int i19, long j15, long j16, long j17, long j18) {
        long j19 = j16;
        int i25 = iArr[i15];
        int i26 = iArr2[i16];
        int i27 = (((((int) j15) * i25) + (((int) j19) * i26)) * i19) & Integer.MAX_VALUE;
        int i28 = (((i25 * ((int) j17)) + (i26 * ((int) j18))) * i19) & Integer.MAX_VALUE;
        int i29 = 0;
        int i35 = Integer.MAX_VALUE;
        long j25 = 0;
        long j26 = 0;
        while (i29 < i18) {
            int i36 = i15 + i29;
            int i37 = i35;
            int i38 = i16 + i29;
            long j27 = iArr[i36];
            long j28 = iArr2[i38];
            int i39 = i17 + i29;
            long unsignedLong = (j27 * j15) + (j28 * j19) + (((long) iArr3[i39]) * toUnsignedLong(i27)) + j25;
            long unsignedLong2 = (j27 * j17) + (j28 * j18) + (((long) iArr3[i39]) * toUnsignedLong(i28)) + j26;
            if (i29 > 0) {
                iArr[i36 - 1] = ((int) unsignedLong) & i37;
                iArr2[i38 - 1] = ((int) unsignedLong2) & i37;
            }
            j25 = unsignedLong >> 31;
            j26 = unsignedLong2 >> 31;
            i29++;
            i35 = i37;
            j19 = j16;
        }
        long j29 = j25;
        iArr[(i15 + i18) - 1] = (int) j29;
        iArr2[(i16 + i18) - 1] = (int) j26;
        zint_finish_mod(iArr, i15, i18, iArr3, i17, (int) (j29 >>> 63));
        zint_finish_mod(iArr2, i16, i18, iArr3, i17, (int) (j26 >>> 63));
    }

    private static void zint_finish_mod(int[] iArr, int i15, int i16, int[] iArr2, int i17, int i18) {
        int i19 = 0;
        for (int i25 = 0; i25 < i16; i25++) {
            i19 = ((iArr[i15 + i25] - iArr2[i17 + i25]) - i19) >>> 31;
        }
        int i26 = (-i18) >>> 1;
        int i27 = -((1 - i19) | i18);
        for (int i28 = 0; i28 < i16; i28++) {
            int i29 = i15 + i28;
            int i35 = (iArr[i29] - ((iArr2[i17 + i28] ^ i26) & i27)) - i18;
            iArr[i29] = Integer.MAX_VALUE & i35;
            i18 = i35 >>> 31;
        }
    }

    private static int zint_mod_small_signed(int[] iArr, int i15, int i16, int i17, int i18, int i19, int i25) {
        if (i16 == 0) {
            return 0;
        }
        return modp_sub(zint_mod_small_unsigned(iArr, i15, i16, i17, i18, i19), (-(iArr[(i15 + i16) - 1] >>> 30)) & i25, i17);
    }

    private static int zint_mod_small_unsigned(int[] iArr, int i15, int i16, int i17, int i18, int i19) {
        int iModp_add = 0;
        while (true) {
            int i25 = i16 - 1;
            if (i16 <= 0) {
                return iModp_add;
            }
            int iModp_montymul = modp_montymul(iModp_add, i19, i17, i18);
            int i26 = iArr[i15 + i25] - i17;
            iModp_add = modp_add(iModp_montymul, i26 + ((-(i26 >>> 31)) & i17), i17);
            i16 = i25;
        }
    }

    private static int zint_mul_small(int[] iArr, int i15, int i16, int i17) {
        int i18 = 0;
        for (int i19 = 0; i19 < i16; i19++) {
            int i25 = i15 + i19;
            long unsignedLong = (toUnsignedLong(iArr[i25]) * toUnsignedLong(i17)) + ((long) i18);
            iArr[i25] = ((int) unsignedLong) & Integer.MAX_VALUE;
            i18 = (int) (unsignedLong >> 31);
        }
        return i18;
    }

    private static void zint_negate(int[] iArr, int i15, int i16, int i17) {
        int i18 = (-i17) >>> 1;
        for (int i19 = 0; i19 < i16; i19++) {
            int i25 = i15 + i19;
            int i26 = (iArr[i25] ^ i18) + i17;
            iArr[i25] = Integer.MAX_VALUE & i26;
            i17 = i26 >>> 31;
        }
    }

    private static void zint_norm_zero(int[] iArr, int i15, int[] iArr2, int i16, int i17) {
        int i18 = 0;
        int i19 = i17;
        int i25 = 0;
        while (true) {
            int i26 = i19 - 1;
            if (i19 <= 0) {
                zint_sub(iArr, i15, iArr2, i16, i17, i18 >>> 31);
                return;
            }
            int i27 = iArr[i15 + i26];
            int i28 = iArr2[i16 + i26];
            int i29 = ((i25 << 30) | (i28 >>> 1)) - i27;
            i18 |= ((-(i29 >>> 31)) | ((-i29) >>> 31)) & ((i18 & 1) - 1);
            i19 = i26;
            i25 = i28 & 1;
        }
    }

    private static int zint_one_to_plain(int[] iArr, int i15) {
        int i16 = iArr[i15];
        return i16 | ((1073741824 & i16) << 1);
    }

    private static void zint_rebuild_CRT(int[] iArr, int i15, int i16, int i17, int i18, int i19, int[] iArr2, int i25) {
        int i26 = 0;
        iArr2[i25] = FalconSmallPrimeList.PRIMES[0].f149455p;
        int i27 = 1;
        while (i27 < i16) {
            FalconSmallPrime falconSmallPrime = FalconSmallPrimeList.PRIMES[i27];
            int i28 = falconSmallPrime.f149455p;
            int i29 = falconSmallPrime.f149456s;
            int iModp_ninv31 = modp_ninv31(i28);
            int iModp_R2 = modp_R2(i28, iModp_ninv31);
            int i35 = i15;
            int i36 = 0;
            while (i36 < i18) {
                int i37 = i28;
                int i38 = iModp_ninv31;
                int i39 = iModp_R2;
                int iModp_montymul = modp_montymul(i29, modp_sub(iArr[i35 + i27], zint_mod_small_unsigned(iArr, i35, i27, i28, iModp_ninv31, iModp_R2), i37), i37, i38);
                int i45 = i27;
                zint_add_mul_small(iArr, i35, iArr2, i25, i45, iModp_montymul);
                i36++;
                i35 += i17;
                i27 = i45;
                i28 = i37;
                iModp_ninv31 = i38;
                iModp_R2 = i39;
            }
            int i46 = i27;
            iArr2[i25 + i46] = zint_mul_small(iArr2, i25, i46, i28);
            i27 = i46 + 1;
        }
        if (i19 != 0) {
            int i47 = i15;
            while (i26 < i18) {
                zint_norm_zero(iArr, i47, iArr2, i25, i16);
                i26++;
                i47 += i17;
            }
        }
    }

    private static void zint_sub(int[] iArr, int i15, int[] iArr2, int i16, int i17, int i18) {
        int i19 = -i18;
        int i25 = 0;
        for (int i26 = 0; i26 < i17; i26++) {
            int i27 = i15 + i26;
            int i28 = iArr[i27];
            int i29 = (i28 - iArr2[i16 + i26]) - i25;
            i25 = i29 >>> 31;
            iArr[i27] = i28 ^ (((i29 & Integer.MAX_VALUE) ^ i28) & i19);
        }
    }

    private static void zint_sub_scaled(int[] iArr, int i15, int i16, int[] iArr2, int i17, int i18, int i19, int i25) {
        if (i18 == 0) {
            return;
        }
        int i26 = (-(iArr2[(i17 + i18) - 1] >>> 30)) >>> 1;
        int i27 = 0;
        int i28 = i19;
        int i29 = 0;
        while (i28 < i16) {
            int i35 = i28 - i19;
            int i36 = i35 < i18 ? iArr2[i35 + i17] : i26;
            int i37 = i15 + i28;
            int i38 = (iArr[i37] - (i27 | ((i36 << i25) & Integer.MAX_VALUE))) - i29;
            iArr[i37] = i38 & Integer.MAX_VALUE;
            i29 = i38 >>> 31;
            i28++;
            i27 = i36 >>> (31 - i25);
        }
    }
}
