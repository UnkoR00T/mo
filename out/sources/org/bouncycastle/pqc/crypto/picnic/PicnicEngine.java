package org.bouncycastle.pqc.crypto.picnic;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.logging.Logger;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.math.raw.Bits;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class PicnicEngine {
    private static final Logger LOG = Logger.getLogger(PicnicEngine.class.getName());
    protected static final int LOWMC_MAX_AND_GATES = 1144;
    protected static final int LOWMC_MAX_KEY_BITS = 256;
    private static final int LOWMC_MAX_STATE_SIZE = 64;
    protected static final int LOWMC_MAX_WORDS = 16;
    private static final int MAX_AUX_BYTES = 176;
    private static final int MAX_DIGEST_SIZE = 64;
    private static final int PICNIC_MAX_LOWMC_BLOCK_SIZE = 32;
    private static final int TRANSFORM_FS = 0;
    private static final int TRANSFORM_INVALID = 255;
    private static final int TRANSFORM_UR = 1;
    private static final int WORD_SIZE_BITS = 32;
    protected static final int saltSizeBytes = 32;
    private final int CRYPTO_BYTES;
    private final int CRYPTO_PUBLICKEYBYTES;
    private final int CRYPTO_SECRETKEYBYTES;
    protected final int UnruhGWithInputBytes;
    protected final int UnruhGWithoutInputBytes;
    protected final int andSizeBytes;
    protected final Xof digest;
    protected final int digestSizeBytes;
    protected final LowmcConstants lowmcConstants;
    protected final int numMPCParties;
    protected final int numMPCRounds;
    protected final int numOpenedRounds;
    protected final int numRounds;
    protected final int numSboxes;
    private final int parameters;
    protected final int pqSecurityLevel;
    protected final int seedSizeBytes;
    private int signatureLength;
    protected final int stateSizeBits;
    protected final int stateSizeBytes;
    protected final int stateSizeWords;
    private final int transform;

    /* JADX WARN: Code duplicated, block: B:21:0x0100  */
    /* JADX WARN: Code duplicated, block: B:23:0x0109  */
    /* JADX WARN: Code duplicated, block: B:24:0x0111  */
    /* JADX WARN: Code duplicated, block: B:25:0x0119  */
    /* JADX WARN: Code duplicated, block: B:26:0x0124  */
    /* JADX WARN: Code duplicated, block: B:27:0x012c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0134  */
    /* JADX WARN: Code duplicated, block: B:29:0x013f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0147  */
    /* JADX WARN: Code duplicated, block: B:31:0x014f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0157  */
    /* JADX WARN: Code duplicated, block: B:33:0x015f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0169  */
    /* JADX WARN: Code duplicated, block: B:37:0x019b  */
    /* JADX WARN: Code duplicated, block: B:38:0x019e  */
    /* JADX WARN: Code duplicated, block: B:39:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x01c3  */
    PicnicEngine(int i15, LowmcConstants lowmcConstants) {
        int i16;
        int iNumBytes;
        int iNumBytes2;
        int iNumBytes3;
        int i17;
        SHAKEDigest sHAKEDigest;
        this.lowmcConstants = lowmcConstants;
        this.parameters = i15;
        switch (i15) {
            case 1:
            case 2:
                this.pqSecurityLevel = 64;
                this.stateSizeBits = 128;
                this.numMPCRounds = 219;
                this.numMPCParties = 3;
                this.numSboxes = 10;
                this.numRounds = 20;
                this.digestSizeBytes = 32;
                this.numOpenedRounds = 0;
                switch (i15) {
                    case 1:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 34036;
                        break;
                    case 2:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 53965;
                        break;
                    case 3:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 76784;
                        break;
                    case 4:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 121857;
                        break;
                    case 5:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 132876;
                        break;
                    case 6:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 209526;
                        break;
                    case 7:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 14612;
                        break;
                    case 8:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 35028;
                        break;
                    case 9:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 61028;
                        break;
                    case 10:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 32061;
                        break;
                    case 11:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 71179;
                        break;
                    case 12:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 126286;
                        break;
                    default:
                        i16 = -1;
                        this.CRYPTO_SECRETKEYBYTES = -1;
                        this.CRYPTO_PUBLICKEYBYTES = -1;
                        break;
                }
                this.CRYPTO_BYTES = i16;
                iNumBytes = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes;
                iNumBytes2 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes2;
                iNumBytes3 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes3;
                i17 = this.stateSizeBits;
                this.stateSizeWords = (i17 + 31) / 32;
                switch (i15) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.transform = 0;
                        break;
                    case 2:
                    case 4:
                    case 6:
                        this.transform = 1;
                        break;
                    default:
                        this.transform = 255;
                        break;
                }
                if (this.transform == 1) {
                    int i18 = iNumBytes3 + iNumBytes;
                    this.UnruhGWithoutInputBytes = i18;
                    this.UnruhGWithInputBytes = i18 + iNumBytes2;
                } else {
                    this.UnruhGWithoutInputBytes = 0;
                    this.UnruhGWithInputBytes = 0;
                }
                if (i17 != 128 || i17 == 129) {
                    sHAKEDigest = new SHAKEDigest(128);
                } else {
                    sHAKEDigest = new SHAKEDigest(256);
                }
                this.digest = sHAKEDigest;
                return;
            case 3:
            case 4:
                this.pqSecurityLevel = 96;
                this.stateSizeBits = 192;
                this.numMPCRounds = 329;
                this.numMPCParties = 3;
                this.numSboxes = 10;
                this.numRounds = 30;
                this.digestSizeBytes = 48;
                this.numOpenedRounds = 0;
                switch (i15) {
                    case 1:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 34036;
                        break;
                    case 2:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 53965;
                        break;
                    case 3:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 76784;
                        break;
                    case 4:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 121857;
                        break;
                    case 5:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 132876;
                        break;
                    case 6:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 209526;
                        break;
                    case 7:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 14612;
                        break;
                    case 8:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 35028;
                        break;
                    case 9:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 61028;
                        break;
                    case 10:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 32061;
                        break;
                    case 11:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 71179;
                        break;
                    case 12:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 126286;
                        break;
                    default:
                        i16 = -1;
                        this.CRYPTO_SECRETKEYBYTES = -1;
                        this.CRYPTO_PUBLICKEYBYTES = -1;
                        break;
                }
                this.CRYPTO_BYTES = i16;
                iNumBytes = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes;
                iNumBytes2 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes2;
                iNumBytes3 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes3;
                i17 = this.stateSizeBits;
                this.stateSizeWords = (i17 + 31) / 32;
                switch (i15) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.transform = 0;
                        break;
                    case 2:
                    case 4:
                    case 6:
                        this.transform = 1;
                        break;
                    default:
                        this.transform = 255;
                        break;
                }
                if (this.transform == 1) {
                    int i19 = iNumBytes3 + iNumBytes;
                    this.UnruhGWithoutInputBytes = i19;
                    this.UnruhGWithInputBytes = i19 + iNumBytes2;
                } else {
                    this.UnruhGWithoutInputBytes = 0;
                    this.UnruhGWithInputBytes = 0;
                }
                if (i17 != 128) {
                    sHAKEDigest = new SHAKEDigest(128);
                } else {
                    sHAKEDigest = new SHAKEDigest(128);
                }
                this.digest = sHAKEDigest;
                return;
            case 5:
            case 6:
                this.pqSecurityLevel = 128;
                this.stateSizeBits = 256;
                this.numMPCRounds = 438;
                this.numMPCParties = 3;
                this.numSboxes = 10;
                this.numRounds = 38;
                this.digestSizeBytes = 64;
                this.numOpenedRounds = 0;
                switch (i15) {
                    case 1:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 34036;
                        break;
                    case 2:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 53965;
                        break;
                    case 3:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 76784;
                        break;
                    case 4:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 121857;
                        break;
                    case 5:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 132876;
                        break;
                    case 6:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 209526;
                        break;
                    case 7:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 14612;
                        break;
                    case 8:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 35028;
                        break;
                    case 9:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 61028;
                        break;
                    case 10:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 32061;
                        break;
                    case 11:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 71179;
                        break;
                    case 12:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 126286;
                        break;
                    default:
                        i16 = -1;
                        this.CRYPTO_SECRETKEYBYTES = -1;
                        this.CRYPTO_PUBLICKEYBYTES = -1;
                        break;
                }
                this.CRYPTO_BYTES = i16;
                iNumBytes = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes;
                iNumBytes2 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes2;
                iNumBytes3 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes3;
                i17 = this.stateSizeBits;
                this.stateSizeWords = (i17 + 31) / 32;
                switch (i15) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.transform = 0;
                        break;
                    case 2:
                    case 4:
                    case 6:
                        this.transform = 1;
                        break;
                    default:
                        this.transform = 255;
                        break;
                }
                if (this.transform == 1) {
                    int i110 = iNumBytes3 + iNumBytes;
                    this.UnruhGWithoutInputBytes = i110;
                    this.UnruhGWithInputBytes = i110 + iNumBytes2;
                } else {
                    this.UnruhGWithoutInputBytes = 0;
                    this.UnruhGWithInputBytes = 0;
                }
                if (i17 != 128) {
                    sHAKEDigest = new SHAKEDigest(128);
                } else {
                    sHAKEDigest = new SHAKEDigest(128);
                }
                this.digest = sHAKEDigest;
                return;
            case 7:
                this.pqSecurityLevel = 64;
                this.stateSizeBits = 129;
                this.numMPCRounds = 250;
                this.numOpenedRounds = 36;
                this.numMPCParties = 16;
                this.numSboxes = 43;
                this.numRounds = 4;
                this.digestSizeBytes = 32;
                switch (i15) {
                    case 1:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 34036;
                        break;
                    case 2:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 53965;
                        break;
                    case 3:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 76784;
                        break;
                    case 4:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 121857;
                        break;
                    case 5:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 132876;
                        break;
                    case 6:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 209526;
                        break;
                    case 7:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 14612;
                        break;
                    case 8:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 35028;
                        break;
                    case 9:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 61028;
                        break;
                    case 10:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 32061;
                        break;
                    case 11:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 71179;
                        break;
                    case 12:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 126286;
                        break;
                    default:
                        i16 = -1;
                        this.CRYPTO_SECRETKEYBYTES = -1;
                        this.CRYPTO_PUBLICKEYBYTES = -1;
                        break;
                }
                this.CRYPTO_BYTES = i16;
                iNumBytes = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes;
                iNumBytes2 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes2;
                iNumBytes3 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes3;
                i17 = this.stateSizeBits;
                this.stateSizeWords = (i17 + 31) / 32;
                switch (i15) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.transform = 0;
                        break;
                    case 2:
                    case 4:
                    case 6:
                        this.transform = 1;
                        break;
                    default:
                        this.transform = 255;
                        break;
                }
                if (this.transform == 1) {
                    int i111 = iNumBytes3 + iNumBytes;
                    this.UnruhGWithoutInputBytes = i111;
                    this.UnruhGWithInputBytes = i111 + iNumBytes2;
                } else {
                    this.UnruhGWithoutInputBytes = 0;
                    this.UnruhGWithInputBytes = 0;
                }
                if (i17 != 128) {
                    sHAKEDigest = new SHAKEDigest(128);
                } else {
                    sHAKEDigest = new SHAKEDigest(128);
                }
                this.digest = sHAKEDigest;
                return;
            case 8:
                this.pqSecurityLevel = 96;
                this.stateSizeBits = 192;
                this.numMPCRounds = 419;
                this.numOpenedRounds = 52;
                this.numMPCParties = 16;
                this.numSboxes = 64;
                this.numRounds = 4;
                this.digestSizeBytes = 48;
                switch (i15) {
                    case 1:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 34036;
                        break;
                    case 2:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 53965;
                        break;
                    case 3:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 76784;
                        break;
                    case 4:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 121857;
                        break;
                    case 5:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 132876;
                        break;
                    case 6:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 209526;
                        break;
                    case 7:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 14612;
                        break;
                    case 8:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 35028;
                        break;
                    case 9:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 61028;
                        break;
                    case 10:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 32061;
                        break;
                    case 11:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 71179;
                        break;
                    case 12:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 126286;
                        break;
                    default:
                        i16 = -1;
                        this.CRYPTO_SECRETKEYBYTES = -1;
                        this.CRYPTO_PUBLICKEYBYTES = -1;
                        break;
                }
                this.CRYPTO_BYTES = i16;
                iNumBytes = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes;
                iNumBytes2 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes2;
                iNumBytes3 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes3;
                i17 = this.stateSizeBits;
                this.stateSizeWords = (i17 + 31) / 32;
                switch (i15) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.transform = 0;
                        break;
                    case 2:
                    case 4:
                    case 6:
                        this.transform = 1;
                        break;
                    default:
                        this.transform = 255;
                        break;
                }
                if (this.transform == 1) {
                    int i112 = iNumBytes3 + iNumBytes;
                    this.UnruhGWithoutInputBytes = i112;
                    this.UnruhGWithInputBytes = i112 + iNumBytes2;
                } else {
                    this.UnruhGWithoutInputBytes = 0;
                    this.UnruhGWithInputBytes = 0;
                }
                if (i17 != 128) {
                    sHAKEDigest = new SHAKEDigest(128);
                } else {
                    sHAKEDigest = new SHAKEDigest(128);
                }
                this.digest = sHAKEDigest;
                return;
            case 9:
                this.pqSecurityLevel = 128;
                this.stateSizeBits = 255;
                this.numMPCRounds = 601;
                this.numOpenedRounds = 68;
                this.numMPCParties = 16;
                this.numSboxes = 85;
                this.numRounds = 4;
                this.digestSizeBytes = 64;
                switch (i15) {
                    case 1:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 34036;
                        break;
                    case 2:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 53965;
                        break;
                    case 3:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 76784;
                        break;
                    case 4:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 121857;
                        break;
                    case 5:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 132876;
                        break;
                    case 6:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 209526;
                        break;
                    case 7:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 14612;
                        break;
                    case 8:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 35028;
                        break;
                    case 9:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 61028;
                        break;
                    case 10:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 32061;
                        break;
                    case 11:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 71179;
                        break;
                    case 12:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 126286;
                        break;
                    default:
                        i16 = -1;
                        this.CRYPTO_SECRETKEYBYTES = -1;
                        this.CRYPTO_PUBLICKEYBYTES = -1;
                        break;
                }
                this.CRYPTO_BYTES = i16;
                iNumBytes = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes;
                iNumBytes2 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes2;
                iNumBytes3 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes3;
                i17 = this.stateSizeBits;
                this.stateSizeWords = (i17 + 31) / 32;
                switch (i15) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.transform = 0;
                        break;
                    case 2:
                    case 4:
                    case 6:
                        this.transform = 1;
                        break;
                    default:
                        this.transform = 255;
                        break;
                }
                if (this.transform == 1) {
                    int i113 = iNumBytes3 + iNumBytes;
                    this.UnruhGWithoutInputBytes = i113;
                    this.UnruhGWithInputBytes = i113 + iNumBytes2;
                } else {
                    this.UnruhGWithoutInputBytes = 0;
                    this.UnruhGWithInputBytes = 0;
                }
                if (i17 != 128) {
                    sHAKEDigest = new SHAKEDigest(128);
                } else {
                    sHAKEDigest = new SHAKEDigest(128);
                }
                this.digest = sHAKEDigest;
                return;
            case 10:
                this.pqSecurityLevel = 64;
                this.stateSizeBits = 129;
                this.numMPCRounds = 219;
                this.numMPCParties = 3;
                this.numSboxes = 43;
                this.numRounds = 4;
                this.digestSizeBytes = 32;
                this.numOpenedRounds = 0;
                switch (i15) {
                    case 1:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 34036;
                        break;
                    case 2:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 53965;
                        break;
                    case 3:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 76784;
                        break;
                    case 4:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 121857;
                        break;
                    case 5:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 132876;
                        break;
                    case 6:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 209526;
                        break;
                    case 7:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 14612;
                        break;
                    case 8:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 35028;
                        break;
                    case 9:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 61028;
                        break;
                    case 10:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 32061;
                        break;
                    case 11:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 71179;
                        break;
                    case 12:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 126286;
                        break;
                    default:
                        i16 = -1;
                        this.CRYPTO_SECRETKEYBYTES = -1;
                        this.CRYPTO_PUBLICKEYBYTES = -1;
                        break;
                }
                this.CRYPTO_BYTES = i16;
                iNumBytes = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes;
                iNumBytes2 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes2;
                iNumBytes3 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes3;
                i17 = this.stateSizeBits;
                this.stateSizeWords = (i17 + 31) / 32;
                switch (i15) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.transform = 0;
                        break;
                    case 2:
                    case 4:
                    case 6:
                        this.transform = 1;
                        break;
                    default:
                        this.transform = 255;
                        break;
                }
                if (this.transform == 1) {
                    int i114 = iNumBytes3 + iNumBytes;
                    this.UnruhGWithoutInputBytes = i114;
                    this.UnruhGWithInputBytes = i114 + iNumBytes2;
                } else {
                    this.UnruhGWithoutInputBytes = 0;
                    this.UnruhGWithInputBytes = 0;
                }
                if (i17 != 128) {
                    sHAKEDigest = new SHAKEDigest(128);
                } else {
                    sHAKEDigest = new SHAKEDigest(128);
                }
                this.digest = sHAKEDigest;
                return;
            case 11:
                this.pqSecurityLevel = 96;
                this.stateSizeBits = 192;
                this.numMPCRounds = 329;
                this.numMPCParties = 3;
                this.numSboxes = 64;
                this.numRounds = 4;
                this.digestSizeBytes = 48;
                this.numOpenedRounds = 0;
                switch (i15) {
                    case 1:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 34036;
                        break;
                    case 2:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 53965;
                        break;
                    case 3:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 76784;
                        break;
                    case 4:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 121857;
                        break;
                    case 5:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 132876;
                        break;
                    case 6:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 209526;
                        break;
                    case 7:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 14612;
                        break;
                    case 8:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 35028;
                        break;
                    case 9:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 61028;
                        break;
                    case 10:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 32061;
                        break;
                    case 11:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 71179;
                        break;
                    case 12:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 126286;
                        break;
                    default:
                        i16 = -1;
                        this.CRYPTO_SECRETKEYBYTES = -1;
                        this.CRYPTO_PUBLICKEYBYTES = -1;
                        break;
                }
                this.CRYPTO_BYTES = i16;
                iNumBytes = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes;
                iNumBytes2 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes2;
                iNumBytes3 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes3;
                i17 = this.stateSizeBits;
                this.stateSizeWords = (i17 + 31) / 32;
                switch (i15) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.transform = 0;
                        break;
                    case 2:
                    case 4:
                    case 6:
                        this.transform = 1;
                        break;
                    default:
                        this.transform = 255;
                        break;
                }
                if (this.transform == 1) {
                    int i115 = iNumBytes3 + iNumBytes;
                    this.UnruhGWithoutInputBytes = i115;
                    this.UnruhGWithInputBytes = i115 + iNumBytes2;
                } else {
                    this.UnruhGWithoutInputBytes = 0;
                    this.UnruhGWithInputBytes = 0;
                }
                if (i17 != 128) {
                    sHAKEDigest = new SHAKEDigest(128);
                } else {
                    sHAKEDigest = new SHAKEDigest(128);
                }
                this.digest = sHAKEDigest;
                return;
            case 12:
                this.pqSecurityLevel = 128;
                this.stateSizeBits = 255;
                this.numMPCRounds = 438;
                this.numMPCParties = 3;
                this.numSboxes = 85;
                this.numRounds = 4;
                this.digestSizeBytes = 64;
                this.numOpenedRounds = 0;
                switch (i15) {
                    case 1:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 34036;
                        break;
                    case 2:
                        this.CRYPTO_SECRETKEYBYTES = 49;
                        this.CRYPTO_PUBLICKEYBYTES = 33;
                        i16 = 53965;
                        break;
                    case 3:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 76784;
                        break;
                    case 4:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 121857;
                        break;
                    case 5:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 132876;
                        break;
                    case 6:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 209526;
                        break;
                    case 7:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 14612;
                        break;
                    case 8:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 35028;
                        break;
                    case 9:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 61028;
                        break;
                    case 10:
                        this.CRYPTO_SECRETKEYBYTES = 52;
                        this.CRYPTO_PUBLICKEYBYTES = 35;
                        i16 = 32061;
                        break;
                    case 11:
                        this.CRYPTO_SECRETKEYBYTES = 73;
                        this.CRYPTO_PUBLICKEYBYTES = 49;
                        i16 = 71179;
                        break;
                    case 12:
                        this.CRYPTO_SECRETKEYBYTES = 97;
                        this.CRYPTO_PUBLICKEYBYTES = 65;
                        i16 = 126286;
                        break;
                    default:
                        i16 = -1;
                        this.CRYPTO_SECRETKEYBYTES = -1;
                        this.CRYPTO_PUBLICKEYBYTES = -1;
                        break;
                }
                this.CRYPTO_BYTES = i16;
                iNumBytes = Utils.numBytes(this.numSboxes * 3 * this.numRounds);
                this.andSizeBytes = iNumBytes;
                iNumBytes2 = Utils.numBytes(this.stateSizeBits);
                this.stateSizeBytes = iNumBytes2;
                iNumBytes3 = Utils.numBytes(this.pqSecurityLevel * 2);
                this.seedSizeBytes = iNumBytes3;
                i17 = this.stateSizeBits;
                this.stateSizeWords = (i17 + 31) / 32;
                switch (i15) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.transform = 0;
                        break;
                    case 2:
                    case 4:
                    case 6:
                        this.transform = 1;
                        break;
                    default:
                        this.transform = 255;
                        break;
                }
                if (this.transform == 1) {
                    int i116 = iNumBytes3 + iNumBytes;
                    this.UnruhGWithoutInputBytes = i116;
                    this.UnruhGWithInputBytes = i116 + iNumBytes2;
                } else {
                    this.UnruhGWithoutInputBytes = 0;
                    this.UnruhGWithInputBytes = 0;
                }
                if (i17 != 128) {
                    sHAKEDigest = new SHAKEDigest(128);
                } else {
                    sHAKEDigest = new SHAKEDigest(128);
                }
                this.digest = sHAKEDigest;
                return;
            default:
                throw new IllegalArgumentException("unknown parameter set " + i15);
        }
    }

    private void Commit(byte[] bArr, int i15, View view, byte[] bArr2) {
        this.digest.update((byte) 4);
        this.digest.update(bArr, i15, this.seedSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        this.digest.update((byte) 0);
        this.digest.update(bArr2, 0, this.digestSizeBytes);
        this.digest.update(Pack.intToLittleEndian(view.inputShare), 0, this.stateSizeBytes);
        this.digest.update(view.communicatedBits, 0, this.andSizeBytes);
        this.digest.update(Pack.intToLittleEndian(view.outputShare), 0, this.stateSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
    }

    private void G(int i15, byte[] bArr, int i16, View view, byte[] bArr2) {
        int i17 = this.seedSizeBytes + this.andSizeBytes;
        this.digest.update((byte) 5);
        this.digest.update(bArr, i16, this.seedSizeBytes);
        this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        this.digest.update(bArr2, 0, this.digestSizeBytes);
        if (i15 == 2) {
            this.digest.update(Pack.intToLittleEndian(view.inputShare), 0, this.stateSizeBytes);
            i17 += this.stateSizeBytes;
        }
        this.digest.update(view.communicatedBits, 0, this.andSizeBytes);
        this.digest.update(Pack.intToLittleEndian(i17), 0, 2);
        this.digest.doFinal(bArr2, 0, i17);
    }

    private void H3(int[] iArr, int[] iArr2, View[][] viewArr, byte[][][] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][][] bArr5) {
        this.digest.update((byte) 1);
        byte[] bArr6 = new byte[this.stateSizeWords * 4];
        for (int i15 = 0; i15 < this.numMPCRounds; i15++) {
            for (int i16 = 0; i16 < 3; i16++) {
                Pack.intToLittleEndian(viewArr[i15][i16].outputShare, bArr6, 0);
                this.digest.update(bArr6, 0, this.stateSizeBytes);
            }
        }
        implH3(iArr, iArr2, bArr, bArr2, bArr3, bArr4, bArr5);
    }

    private void HCP(byte[] bArr, int[] iArr, int[] iArr2, byte[][] bArr2, byte[] bArr3, byte[] bArr4, int[] iArr3, int[] iArr4, byte[] bArr5) {
        for (int i15 = 0; i15 < this.numMPCRounds; i15++) {
            this.digest.update(bArr2[i15], 0, this.digestSizeBytes);
        }
        byte[] bArr6 = new byte[32];
        this.digest.update(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr4, 0, 32);
        updateDigest(iArr3, bArr6);
        updateDigest(iArr4, bArr6);
        this.digest.update(bArr5, 0, bArr5.length);
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
        if (iArr == null || iArr2 == null) {
            return;
        }
        expandChallengeHash(bArr, iArr, iArr2);
    }

    private void LowMCEnc(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        if (iArr != iArr2) {
            System.arraycopy(iArr, 0, iArr2, 0, this.stateSizeWords);
        }
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        matrix_mul(iArr4, iArr3, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        xor_array(iArr2, iArr2, iArr4, 0);
        for (int i15 = 1; i15 <= this.numRounds; i15++) {
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i15);
            matrix_mul(iArr4, iArr3, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            substitution(iArr2);
            int i16 = i15 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i16);
            matrix_mul(iArr2, iArr2, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer());
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i16);
            xor_array(iArr2, iArr2, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer());
            xor_array(iArr2, iArr2, iArr4, 0);
        }
    }

    static int appendUnique(int[] iArr, int i15, int i16) {
        if (i16 == 0) {
            iArr[i16] = i15;
        } else {
            for (int i17 = 0; i17 < i16; i17++) {
                if (iArr[i17] == i15) {
                    return i16;
                }
            }
            iArr[i16] = i15;
        }
        return i16 + 1;
    }

    private boolean arePaddingBitsZero(byte[] bArr, int i15) {
        int iNumBytes = Utils.numBytes(i15);
        while (i15 < iNumBytes * 8) {
            if (Utils.getBit(bArr, i15) != 0) {
                return false;
            }
            i15++;
        }
        return true;
    }

    private void aux_mpc_AND(int i15, int i16, int i17, Tape tape) {
        int i18 = this.numMPCParties - 1;
        Utils.setBit(tape.tapes[i18], tape.pos - 1, (byte) ((((i15 & i16) ^ (Utils.parity16(tape.tapesToWord()) ^ Utils.getBit(tape.tapes[i18], tape.pos - 1))) ^ i17) & 255));
    }

    static int bitsToChunks(int i15, byte[] bArr, int i16, int[] iArr) {
        int i17 = i16 * 8;
        if (i15 > i17) {
            return 0;
        }
        int i18 = i17 / i15;
        for (int i19 = 0; i19 < i18; i19++) {
            iArr[i19] = 0;
            for (int i25 = 0; i25 < i15; i25++) {
                iArr[i19] = iArr[i19] + (Utils.getBit(bArr, (i19 * i15) + i25) << i25);
            }
        }
        return i18;
    }

    private void commit(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i15, int i16) {
        this.digest.update(bArr2, 0, this.seedSizeBytes);
        if (bArr3 != null) {
            this.digest.update(bArr3, 0, this.andSizeBytes);
        }
        this.digest.update(bArr4, 0, 32);
        this.digest.update(Pack.intToLittleEndian(i15), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i16), 0, 2);
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
    }

    private void commit_h(byte[] bArr, byte[][] bArr2) {
        for (int i15 = 0; i15 < this.numMPCParties; i15++) {
            this.digest.update(bArr2[i15], 0, this.digestSizeBytes);
        }
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
    }

    private void commit_v(byte[] bArr, byte[] bArr2, Msg msg) {
        this.digest.update(bArr2, 0, this.stateSizeBytes);
        for (int i15 = 0; i15 < this.numMPCParties; i15++) {
            this.digest.update(msg.msgs[i15], 0, Utils.numBytes(msg.pos));
        }
        this.digest.doFinal(bArr, 0, this.digestSizeBytes);
    }

    private void computeSaltAndRootSeed(byte[] bArr, int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        updateDigest(iArr, bArr3);
        this.digest.update(bArr2, 0, bArr2.length);
        updateDigest(iArr2, bArr3);
        updateDigest(iArr3, bArr3);
        Pack.shortToLittleEndian((short) this.stateSizeBits, bArr3, 0);
        this.digest.update(bArr3, 0, 2);
        this.digest.doFinal(bArr, 0, bArr.length);
    }

    private byte[] computeSeeds(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr) {
        byte[] bArr2 = new byte[(this.seedSizeBytes * this.numMPCParties * this.numMPCRounds) + 32];
        byte[] bArr3 = new byte[32];
        updateDigest(iArr, bArr3);
        this.digest.update(bArr, 0, bArr.length);
        updateDigest(iArr2, bArr3);
        updateDigest(iArr3, bArr3);
        this.digest.update(Pack.intToLittleEndian(this.stateSizeBits), 0, 2);
        this.digest.doFinal(bArr2, 0, (this.seedSizeBytes * this.numMPCParties * this.numMPCRounds) + 32);
        return bArr2;
    }

    private boolean contains(int[] iArr, int i15, int i16) {
        for (int i17 = 0; i17 < i15; i17++) {
            if (iArr[i17] == i16) {
                return true;
            }
        }
        return false;
    }

    private int countNonZeroChallenges(byte[] bArr, int i15) {
        int i16;
        int i17 = 0;
        int i18 = 0;
        int iBitCount = 0;
        while (true) {
            int i19 = i17 + 16;
            i16 = this.numMPCRounds;
            if (i19 > i16) {
                break;
            }
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, (i17 >>> 2) + i15);
            int i25 = iLittleEndianToInt >>> 1;
            i18 |= iLittleEndianToInt & i25;
            iBitCount += Integers.bitCount((iLittleEndianToInt ^ i25) & 1431655765);
            i17 = i19;
        }
        int i26 = (i16 - i17) * 2;
        if (i26 > 0) {
            int iLittleEndianToInt_Low = Pack.littleEndianToInt_Low(bArr, i15 + (i17 >>> 2), (i26 + 7) / 8) & Utils.getTrailingBitsMask(i26);
            int i27 = iLittleEndianToInt_Low >>> 1;
            i18 |= iLittleEndianToInt_Low & i27;
            iBitCount += Integers.bitCount((iLittleEndianToInt_Low ^ i27) & 1431655765);
        }
        if ((i18 & 1431655765) == 0) {
            return iBitCount;
        }
        return -1;
    }

    private boolean createRandomTape(byte[] bArr, int i15, byte[] bArr2, int i16, int i17, byte[] bArr3, int i18) {
        if (i18 < this.digestSizeBytes) {
            return false;
        }
        this.digest.update((byte) 2);
        this.digest.update(bArr, i15, this.seedSizeBytes);
        this.digest.doFinal(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr3, 0, this.digestSizeBytes);
        this.digest.update(bArr2, 0, 32);
        this.digest.update(Pack.intToLittleEndian(i16), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i17), 0, 2);
        this.digest.update(Pack.intToLittleEndian(i18), 0, 2);
        this.digest.doFinal(bArr3, 0, i18);
        return true;
    }

    private void createRandomTapes(Tape tape, byte[][] bArr, int i15, byte[] bArr2, int i16) {
        int i17 = this.andSizeBytes * 2;
        for (int i18 = 0; i18 < this.numMPCParties; i18++) {
            this.digest.update(bArr[i18 + i15], 0, this.seedSizeBytes);
            this.digest.update(bArr2, 0, 32);
            this.digest.update(Pack.intToLittleEndian(i16), 0, 2);
            this.digest.update(Pack.intToLittleEndian(i18), 0, 2);
            this.digest.doFinal(tape.tapes[i18], 0, i17);
        }
    }

    private int deserializeSignature(Signature signature, byte[] bArr, int i15, int i16) {
        int iCountNonZeroChallenges;
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr2 = signature.challengeBits;
        int iNumBytes = Utils.numBytes(this.numMPCRounds * 2);
        if (i15 < iNumBytes || (iCountNonZeroChallenges = countNonZeroChallenges(bArr, i16)) < 0) {
            return -1;
        }
        int i17 = this.stateSizeBytes * iCountNonZeroChallenges;
        int i18 = this.numMPCRounds;
        int i19 = iNumBytes + 32 + (((this.seedSizeBytes * 2) + this.andSizeBytes + this.digestSizeBytes) * i18) + i17;
        if (this.transform == 1) {
            i19 = i19 + (this.UnruhGWithInputBytes * (i18 - iCountNonZeroChallenges)) + (this.UnruhGWithoutInputBytes * iCountNonZeroChallenges);
        }
        if (i15 != i19) {
            LOG.fine("sigBytesLen = " + i15 + ", expected bytesRequired = " + i19);
            return -1;
        }
        System.arraycopy(bArr, i16, bArr2, 0, iNumBytes);
        int i25 = i16 + iNumBytes;
        System.arraycopy(bArr, i25, signature.salt, 0, 32);
        int i26 = i25 + 32;
        for (int i27 = 0; i27 < this.numMPCRounds; i27++) {
            int challenge = getChallenge(bArr2, i27);
            System.arraycopy(bArr, i26, proofArr[i27].view3Commitment, 0, this.digestSizeBytes);
            int i28 = i26 + this.digestSizeBytes;
            if (this.transform == 1) {
                int i29 = challenge == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
                System.arraycopy(bArr, i28, proofArr[i27].view3UnruhG, 0, i29);
                i28 += i29;
            }
            System.arraycopy(bArr, i28, proofArr[i27].communicatedBits, 0, this.andSizeBytes);
            int i35 = i28 + this.andSizeBytes;
            System.arraycopy(bArr, i35, proofArr[i27].seed1, 0, this.seedSizeBytes);
            int i36 = this.seedSizeBytes;
            int i37 = i35 + i36;
            System.arraycopy(bArr, i37, proofArr[i27].seed2, 0, i36);
            i26 = i37 + this.seedSizeBytes;
            if (challenge == 1 || challenge == 2) {
                Pack.littleEndianToInt(bArr, i26, proofArr[i27].inputShare, 0, this.stateSizeBytes / 4);
                int i38 = this.stateSizeBits;
                if (i38 == 129) {
                    proofArr[i27].inputShare[this.stateSizeWords - 1] = bArr[(this.stateSizeBytes + i26) - 1] & 255;
                }
                i26 += this.stateSizeBytes;
                if (!arePaddingBitsZero(proofArr[i27].inputShare, i38)) {
                    return -1;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x012e A[PHI: r13
      0x012e: PHI (r13v8 int) = (r13v7 int), (r13v12 int) binds: [B:25:0x0106, B:27:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0161  */
    /* JADX WARN: Code duplicated, block: B:40:0x015b A[SYNTHETIC] */
    private int deserializeSignature2(Signature2 signature2, byte[] bArr, int i15, int i16) {
        int i17;
        Logger logger;
        String str;
        int i18 = this.digestSizeBytes;
        int i19 = i18 + 32;
        if (bArr.length < i19) {
            return -1;
        }
        System.arraycopy(bArr, i16, signature2.challengeHash, 0, i18);
        int i25 = i16 + this.digestSizeBytes;
        System.arraycopy(bArr, i25, signature2.salt, 0, 32);
        int i26 = i25 + 32;
        expandChallengeHash(signature2.challengeHash, signature2.challengeC, signature2.challengeP);
        int iRevealSeedsSize = new Tree(this, this.numMPCRounds, this.seedSizeBytes).revealSeedsSize(signature2.challengeC, this.numOpenedRounds);
        signature2.iSeedInfoLen = iRevealSeedsSize;
        int i27 = i19 + iRevealSeedsSize;
        int iOpenMerkleTreeSize = new Tree(this, this.numMPCRounds, this.digestSizeBytes).openMerkleTreeSize(getMissingLeavesList(signature2.challengeC), this.numMPCRounds - this.numOpenedRounds);
        signature2.cvInfoLen = iOpenMerkleTreeSize;
        int i28 = i27 + iOpenMerkleTreeSize;
        int iRevealSeedsSize2 = new Tree(this, this.numMPCParties, this.seedSizeBytes).revealSeedsSize(new int[1], 1);
        for (int i29 = 0; i29 < this.numMPCRounds; i29++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i29)) {
                if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i29)] != this.numMPCParties - 1) {
                    i28 += this.andSizeBytes;
                }
                i28 = i28 + iRevealSeedsSize2 + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes;
            }
        }
        if (i15 == i28) {
            int i35 = signature2.iSeedInfoLen;
            byte[] bArr2 = new byte[i35];
            signature2.iSeedInfo = bArr2;
            System.arraycopy(bArr, i26, bArr2, 0, i35);
            int i36 = i26 + signature2.iSeedInfoLen;
            int i37 = signature2.cvInfoLen;
            byte[] bArr3 = new byte[i37];
            signature2.cvInfo = bArr3;
            System.arraycopy(bArr, i36, bArr3, 0, i37);
            int i38 = i36 + signature2.cvInfoLen;
            for (int i39 = 0; i39 < this.numMPCRounds; i39++) {
                if (contains(signature2.challengeC, this.numOpenedRounds, i39)) {
                    signature2.proofs[i39] = new Signature2.Proof2(this);
                    Signature2.Proof2 proof2 = signature2.proofs[i39];
                    proof2.seedInfoLen = iRevealSeedsSize2;
                    byte[] bArr4 = new byte[iRevealSeedsSize2];
                    proof2.seedInfo = bArr4;
                    System.arraycopy(bArr, i38, bArr4, 0, iRevealSeedsSize2);
                    int i45 = i38 + signature2.proofs[i39].seedInfoLen;
                    if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i39)] != this.numMPCParties - 1) {
                        System.arraycopy(bArr, i45, signature2.proofs[i39].aux, 0, this.andSizeBytes);
                        i45 += this.andSizeBytes;
                        if (arePaddingBitsZero(signature2.proofs[i39].aux, this.numRounds * 3 * this.numSboxes)) {
                            System.arraycopy(bArr, i45, signature2.proofs[i39].input, 0, this.stateSizeBytes);
                            int i46 = i45 + this.stateSizeBytes;
                            int i47 = this.andSizeBytes;
                            System.arraycopy(bArr, i46, signature2.proofs[i39].msgs, 0, i47);
                            i17 = i46 + i47;
                            if (arePaddingBitsZero(signature2.proofs[i39].msgs, this.numRounds * 3 * this.numSboxes)) {
                                System.arraycopy(bArr, i17, signature2.proofs[i39].C, 0, this.digestSizeBytes);
                                i38 = i17 + this.digestSizeBytes;
                            } else {
                                logger = LOG;
                                str = "failed while deserializing msgs bits";
                            }
                        } else {
                            logger = LOG;
                            str = "failed while deserializing aux bits";
                        }
                    } else {
                        System.arraycopy(bArr, i45, signature2.proofs[i39].input, 0, this.stateSizeBytes);
                        int i48 = i45 + this.stateSizeBytes;
                        int i49 = this.andSizeBytes;
                        System.arraycopy(bArr, i48, signature2.proofs[i39].msgs, 0, i49);
                        i17 = i48 + i49;
                        if (arePaddingBitsZero(signature2.proofs[i39].msgs, this.numRounds * 3 * this.numSboxes)) {
                            logger = LOG;
                            str = "failed while deserializing msgs bits";
                        } else {
                            System.arraycopy(bArr, i17, signature2.proofs[i39].C, 0, this.digestSizeBytes);
                            i38 = i17 + this.digestSizeBytes;
                        }
                    }
                }
            }
            return 0;
        }
        logger = LOG;
        str = "sigLen = " + i15 + ", expected bytesRequired = " + i28;
        logger.fine(str);
        return -1;
    }

    private void expandChallengeHash(byte[] bArr, int[] iArr, int[] iArr2) {
        int iCeil_log2 = Utils.ceil_log2(this.numMPCRounds);
        int iCeil_log3 = Utils.ceil_log2(this.numMPCParties);
        int[] iArr3 = new int[(this.digestSizeBytes * 8) / Math.min(iCeil_log2, iCeil_log3)];
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, this.digestSizeBytes);
        int iAppendUnique = 0;
        while (iAppendUnique < this.numOpenedRounds) {
            int iBitsToChunks = bitsToChunks(iCeil_log2, bArr2, this.digestSizeBytes, iArr3);
            for (int i15 = 0; i15 < iBitsToChunks; i15++) {
                int i16 = iArr3[i15];
                if (i16 < this.numMPCRounds) {
                    iAppendUnique = appendUnique(iArr, i16, iAppendUnique);
                }
                if (iAppendUnique == this.numOpenedRounds) {
                    break;
                }
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr2, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        }
        int i17 = 0;
        while (i17 < this.numOpenedRounds) {
            int iBitsToChunks2 = bitsToChunks(iCeil_log3, bArr2, this.digestSizeBytes, iArr3);
            for (int i18 = 0; i18 < iBitsToChunks2; i18++) {
                int i19 = iArr3[i18];
                if (i19 < this.numMPCParties) {
                    iArr2[i17] = i19;
                    i17++;
                }
                if (i17 == this.numOpenedRounds) {
                    break;
                }
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr2, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr2, 0, this.digestSizeBytes);
        }
    }

    static int extend(int i15) {
        return ~(i15 - 1);
    }

    private void getAuxBits(byte[] bArr, Tape tape) {
        byte[] bArr2 = tape.tapes[this.numMPCParties - 1];
        int i15 = this.stateSizeBits;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < this.numRounds; i18++) {
            i16 += i15;
            int i19 = 0;
            while (i19 < i15) {
                Utils.setBit(bArr, i17, Utils.getBit(bArr2, i16));
                i19++;
                i17++;
                i16++;
            }
        }
    }

    private int[] getMissingLeavesList(int[] iArr) {
        int[] iArr2 = new int[this.numMPCRounds - this.numOpenedRounds];
        int i15 = 0;
        for (int i16 = 0; i16 < this.numMPCRounds; i16++) {
            if (!contains(iArr, this.numOpenedRounds, i16)) {
                iArr2[i15] = i16;
                i15++;
            }
        }
        return iArr2;
    }

    private void implH3(int[] iArr, int[] iArr2, byte[][][] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][][] bArr5) {
        byte[] bArr6 = new byte[this.digestSizeBytes];
        bArr2[Utils.numBytes(this.numMPCRounds * 2) - 1] = 0;
        for (int i15 = 0; i15 < this.numMPCRounds; i15++) {
            for (int i16 = 0; i16 < 3; i16++) {
                this.digest.update(bArr[i15][i16], 0, this.digestSizeBytes);
            }
        }
        if (this.transform == 1) {
            for (int i17 = 0; i17 < this.numMPCRounds; i17++) {
                int i18 = 0;
                while (i18 < 3) {
                    this.digest.update(bArr5[i17][i18], 0, i18 == 2 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes);
                    i18++;
                }
            }
        }
        this.digest.update(Pack.intToLittleEndian(iArr), 0, this.stateSizeBytes);
        this.digest.update(Pack.intToLittleEndian(iArr2), 0, this.stateSizeBytes);
        this.digest.update(bArr3, 0, 32);
        this.digest.update(bArr4, 0, bArr4.length);
        this.digest.doFinal(bArr6, 0, this.digestSizeBytes);
        boolean z15 = true;
        int i19 = 0;
        while (z15) {
            for (int i25 = 0; i25 < this.digestSizeBytes; i25++) {
                byte b15 = bArr6[i25];
                for (int i26 = 0; i26 < 8; i26 += 2) {
                    int i27 = (b15 >>> (6 - i26)) & 3;
                    if (i27 < 3) {
                        setChallenge(bArr2, i19, i27);
                        i19++;
                        if (i19 == this.numMPCRounds) {
                            z15 = false;
                            break;
                        }
                    }
                }
                if (!z15) {
                    break;
                }
            }
            if (!z15) {
                return;
            }
            this.digest.update((byte) 1);
            this.digest.update(bArr6, 0, this.digestSizeBytes);
            this.digest.doFinal(bArr6, 0, this.digestSizeBytes);
        }
    }

    static int indexOf(int[] iArr, int i15, int i16) {
        for (int i17 = 0; i17 < i15; i17++) {
            if (iArr[i17] == i16) {
                return i17;
            }
        }
        return -1;
    }

    static boolean is_picnic3(int i15) {
        return i15 == 7 || i15 == 8 || i15 == 9;
    }

    private int mpc_AND(int i15, int i16, int i17, int i18, Tape tape, Msg msg) {
        int iExtend = ((i17 & extend(i16)) ^ (i18 & extend(i15))) ^ tape.tapesToWord();
        int i19 = msg.unopened;
        if (i19 >= 0) {
            iExtend = Utils.setBit(iExtend, msg.unopened, Utils.getBit(msg.msgs[i19], msg.pos));
        }
        wordToMsgs(iExtend, msg);
        return (i15 & i16) ^ Utils.parity16(iExtend);
    }

    private void mpc_LowMC(Tape tape, View[] viewArr, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i15 = this.stateSizeWords;
        mpc_xor_constant(iArr2, i15 * 3, iArr, 0, i15);
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        for (int i16 = 0; i16 < 3; i16++) {
            matrix_mul_offset(iArr2, i16 * this.stateSizeWords, viewArr[i16].inputShare, 0, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        }
        int[] iArr3 = iArr2;
        mpc_xor(iArr3, iArr3, 3);
        for (int i17 = 1; i17 <= this.numRounds; i17++) {
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i17);
            for (int i18 = 0; i18 < 3; i18++) {
                matrix_mul_offset(iArr3, this.stateSizeWords * i18, viewArr[i18].inputShare, 0, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            }
            mpc_substitution(iArr3, tape, viewArr);
            int i19 = i17 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i19);
            int i25 = this.stateSizeWords;
            mpc_matrix_mul(iArr3, i25 * 3, iArr2, i25 * 3, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer(), 3);
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i19);
            iArr3 = iArr2;
            mpc_xor_constant(iArr3, this.stateSizeWords * 3, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer(), this.stateSizeWords);
            mpc_xor(iArr3, iArr3, 3);
        }
        for (int i26 = 0; i26 < 3; i26++) {
            int i27 = this.stateSizeWords;
            System.arraycopy(iArr3, (i26 + 3) * i27, viewArr[i26].outputShare, 0, i27);
        }
    }

    private void mpc_matrix_mul(int[] iArr, int i15, int[] iArr2, int i16, int[] iArr3, int i17, int i18) {
        for (int i19 = 0; i19 < i18; i19++) {
            int i25 = this.stateSizeWords;
            matrix_mul_offset(iArr, (i19 * i25) + i15, iArr2, i16 + (i25 * i19), iArr3, i17);
        }
    }

    private void mpc_sbox(int[] iArr, int[] iArr2, Tape tape, Msg msg) {
        for (int i15 = 0; i15 < this.numSboxes * 3; i15 += 3) {
            int i16 = i15 + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i16);
            int i17 = iArr2[i16];
            int i18 = i15 + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i18);
            int i19 = iArr2[i18];
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i15);
            int i25 = iArr2[i15];
            int iMpc_AND = mpc_AND(bitFromWordArray, bitFromWordArray2, i17, i19, tape, msg);
            int iMpc_AND2 = mpc_AND(bitFromWordArray2, bitFromWordArray3, i19, i25, tape, msg);
            int iMpc_AND3 = mpc_AND(bitFromWordArray3, bitFromWordArray, i25, i17, tape, msg);
            int i26 = bitFromWordArray ^ iMpc_AND2;
            int i27 = bitFromWordArray ^ bitFromWordArray2;
            Utils.setBitInWordArray(iArr, i16, i26);
            Utils.setBitInWordArray(iArr, i18, iMpc_AND3 ^ i27);
            Utils.setBitInWordArray(iArr, i15, (i27 ^ bitFromWordArray3) ^ iMpc_AND);
        }
    }

    private void mpc_substitution(int[] iArr, Tape tape, View[] viewArr) {
        int[] iArr2 = new int[3];
        int[] iArr3 = new int[3];
        int[] iArr4 = new int[3];
        int[] iArr5 = new int[3];
        int[] iArr6 = new int[3];
        int[] iArr7 = new int[3];
        int i15 = 0;
        while (i15 < this.numSboxes * 3) {
            for (int i16 = 0; i16 < 3; i16++) {
                int i17 = ((i16 + 3) * this.stateSizeWords * 32) + i15;
                iArr2[i16] = Utils.getBitFromWordArray(iArr, i17 + 2);
                iArr3[i16] = Utils.getBitFromWordArray(iArr, i17 + 1);
                iArr4[i16] = Utils.getBitFromWordArray(iArr, i17);
            }
            mpc_AND(iArr2, iArr3, iArr5, tape, viewArr);
            int[] iArr8 = iArr4;
            int[] iArr9 = iArr2;
            int[] iArr10 = iArr3;
            int[] iArr11 = iArr6;
            int[] iArr12 = iArr5;
            mpc_AND(iArr10, iArr8, iArr11, tape, viewArr);
            int[] iArr13 = iArr7;
            mpc_AND(iArr8, iArr9, iArr13, tape, viewArr);
            iArr2 = iArr9;
            for (int i18 = 0; i18 < 3; i18++) {
                int i19 = ((i18 + 3) * this.stateSizeWords * 32) + i15;
                Utils.setBitInWordArray(iArr, i19 + 2, iArr2[i18] ^ iArr11[i18]);
                Utils.setBitInWordArray(iArr, i19 + 1, (iArr2[i18] ^ iArr10[i18]) ^ iArr13[i18]);
                Utils.setBitInWordArray(iArr, i19, ((iArr2[i18] ^ iArr10[i18]) ^ iArr8[i18]) ^ iArr12[i18]);
            }
            i15 += 3;
            iArr4 = iArr8;
            iArr3 = iArr10;
            iArr7 = iArr13;
            iArr5 = iArr12;
            iArr6 = iArr11;
        }
    }

    private void mpc_xor(int[] iArr, int[] iArr2, int i15) {
        int i16 = this.stateSizeWords * i15;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = (this.stateSizeWords * i15) + i17;
            iArr[i18] = iArr[i18] ^ iArr2[i17];
        }
    }

    private void mpc_xor_constant(int[] iArr, int i15, int[] iArr2, int i16, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = i18 + i15;
            iArr[i19] = iArr[i19] ^ iArr2[i18 + i16];
        }
    }

    private void mpc_xor_constant_verify(int[] iArr, int[] iArr2, int i15, int i16, int i17) {
        int i18;
        if (i17 == 0) {
            i18 = this.stateSizeWords * 2;
        } else if (i17 != 2) {
            return;
        } else {
            i18 = this.stateSizeWords * 3;
        }
        for (int i19 = 0; i19 < i16; i19++) {
            int i25 = i19 + i18;
            iArr[i25] = iArr[i25] ^ iArr2[i19 + i15];
        }
    }

    private void picnic_keygen(byte[] bArr, byte[] bArr2, byte[] bArr3, SecureRandom secureRandom) {
        int[] iArr = new int[bArr3.length / 4];
        int[] iArr2 = new int[bArr.length / 4];
        int[] iArr3 = new int[bArr2.length / 4];
        secureRandom.nextBytes(bArr3);
        Pack.littleEndianToInt(bArr3, 0, iArr);
        Utils.zeroTrailingBits(iArr, this.stateSizeBits);
        secureRandom.nextBytes(bArr);
        Pack.littleEndianToInt(bArr, 0, iArr2);
        Utils.zeroTrailingBits(iArr2, this.stateSizeBits);
        LowMCEnc(iArr2, iArr3, iArr);
        Pack.intToLittleEndian(iArr, bArr3, 0);
        Pack.intToLittleEndian(iArr2, bArr, 0);
        Pack.intToLittleEndian(iArr3, bArr2, 0);
    }

    private void picnic_read_public_key(int[] iArr, int[] iArr2, byte[] bArr) {
        int i15 = this.stateSizeBytes;
        int i16 = i15 + 1;
        int i17 = i15 / 4;
        Pack.littleEndianToInt(bArr, 1, iArr, 0, i17);
        Pack.littleEndianToInt(bArr, i16, iArr2, 0, i17);
        if (i17 < this.stateSizeWords) {
            int i18 = i17 * 4;
            int i19 = this.stateSizeBytes - i18;
            iArr[i17] = Pack.littleEndianToInt_Low(bArr, i18 + 1, i19);
            iArr2[i17] = Pack.littleEndianToInt_Low(bArr, i16 + i18, i19);
        }
    }

    private boolean picnic_sign(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        PicnicEngine picnicEngine;
        int iSerializeSignature2;
        int i15 = this.stateSizeWords;
        int[] iArr = new int[i15];
        int[] iArr2 = new int[i15];
        int[] iArr3 = new int[i15];
        int i16 = this.stateSizeBytes;
        int i17 = i16 + 1;
        int i18 = (i16 * 2) + 1;
        int i19 = i16 / 4;
        Pack.littleEndianToInt(bArr, 1, iArr, 0, i19);
        Pack.littleEndianToInt(bArr, i17, iArr2, 0, i19);
        Pack.littleEndianToInt(bArr, i18, iArr3, 0, i19);
        if (i19 < this.stateSizeWords) {
            int i25 = i19 * 4;
            int i26 = this.stateSizeBytes - i25;
            iArr[i19] = Pack.littleEndianToInt_Low(bArr, i25 + 1, i26);
            iArr2[i19] = Pack.littleEndianToInt_Low(bArr, i17 + i25, i26);
            iArr3[i19] = Pack.littleEndianToInt_Low(bArr, i18 + i25, i26);
        }
        if (is_picnic3(this.parameters)) {
            picnicEngine = this;
            Signature2 signature2 = new Signature2(this);
            if (!picnicEngine.sign_picnic3(iArr, iArr2, iArr3, bArr2, signature2)) {
                LOG.fine("Failed to create signature");
                return false;
            }
            iSerializeSignature2 = serializeSignature2(signature2, bArr3, bArr2.length + 4);
            if (iSerializeSignature2 < 0) {
                LOG.fine("Failed to serialize signature");
                return false;
            }
        } else {
            Signature signature = new Signature(this);
            picnicEngine = this;
            if (picnicEngine.sign_picnic1(iArr, iArr2, iArr3, bArr2, signature) != 0) {
                LOG.fine("Failed to create signature");
                return false;
            }
            iSerializeSignature2 = serializeSignature(signature, bArr3, bArr2.length + 4);
            if (iSerializeSignature2 < 0) {
                LOG.fine("Failed to serialize signature");
                return false;
            }
        }
        picnicEngine.signatureLength = iSerializeSignature2;
        Pack.intToLittleEndian(iSerializeSignature2, bArr3, 0);
        return true;
    }

    private int picnic_verify(byte[] bArr, byte[] bArr2, byte[] bArr3, int i15) {
        Logger logger;
        String str;
        int i16 = this.stateSizeWords;
        int[] iArr = new int[i16];
        int[] iArr2 = new int[i16];
        picnic_read_public_key(iArr, iArr2, bArr);
        if (is_picnic3(this.parameters)) {
            Signature2 signature2 = new Signature2(this);
            if (deserializeSignature2(signature2, bArr3, i15, bArr2.length + 4) == 0) {
                return verify_picnic3(signature2, iArr, iArr2, bArr2);
            }
            logger = LOG;
            str = "Error couldn't deserialize signature (2)!";
        } else {
            Signature signature = new Signature(this);
            if (deserializeSignature(signature, bArr3, i15, bArr2.length + 4) == 0) {
                return verify(signature, iArr, iArr2, bArr2);
            }
            logger = LOG;
            str = "Error couldn't deserialize signature!";
        }
        logger.fine(str);
        return -1;
    }

    private int picnic_write_private_key(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i15 = this.stateSizeBytes;
        int i16 = (i15 * 3) + 1;
        if (bArr4.length < i16) {
            LOG.fine("Failed writing private key!");
            return -1;
        }
        bArr4[0] = (byte) this.parameters;
        System.arraycopy(bArr, 0, bArr4, 1, i15);
        int i17 = this.stateSizeBytes;
        System.arraycopy(bArr2, 0, bArr4, i17 + 1, i17);
        int i18 = this.stateSizeBytes;
        System.arraycopy(bArr3, 0, bArr4, (i18 * 2) + 1, i18);
        return i16;
    }

    private int picnic_write_public_key(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i15 = this.stateSizeBytes;
        int i16 = (i15 * 2) + 1;
        if (bArr3.length < i16) {
            LOG.fine("Failed writing public key!");
            return -1;
        }
        bArr3[0] = (byte) this.parameters;
        System.arraycopy(bArr, 0, bArr3, 1, i15);
        int i17 = this.stateSizeBytes;
        System.arraycopy(bArr2, 0, bArr3, i17 + 1, i17);
        return i16;
    }

    private int serializeSignature2(Signature2 signature2, byte[] bArr, int i15) {
        int i16 = this.digestSizeBytes + 32 + signature2.iSeedInfoLen + signature2.cvInfoLen;
        for (int i17 = 0; i17 < this.numMPCRounds; i17++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i17)) {
                int i18 = signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i17)];
                int i19 = i16 + signature2.proofs[i17].seedInfoLen;
                if (i18 != this.numMPCParties - 1) {
                    i19 += this.andSizeBytes;
                }
                i16 = i19 + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes;
            }
        }
        if (bArr.length < i16) {
            return -1;
        }
        System.arraycopy(signature2.challengeHash, 0, bArr, i15, this.digestSizeBytes);
        int i25 = this.digestSizeBytes + i15;
        System.arraycopy(signature2.salt, 0, bArr, i25, 32);
        int i26 = i25 + 32;
        System.arraycopy(signature2.iSeedInfo, 0, bArr, i26, signature2.iSeedInfoLen);
        int i27 = i26 + signature2.iSeedInfoLen;
        System.arraycopy(signature2.cvInfo, 0, bArr, i27, signature2.cvInfoLen);
        int i28 = i27 + signature2.cvInfoLen;
        for (int i29 = 0; i29 < this.numMPCRounds; i29++) {
            if (contains(signature2.challengeC, this.numOpenedRounds, i29)) {
                Signature2.Proof2 proof2 = signature2.proofs[i29];
                System.arraycopy(proof2.seedInfo, 0, bArr, i28, proof2.seedInfoLen);
                int i35 = i28 + signature2.proofs[i29].seedInfoLen;
                if (signature2.challengeP[indexOf(signature2.challengeC, this.numOpenedRounds, i29)] != this.numMPCParties - 1) {
                    System.arraycopy(signature2.proofs[i29].aux, 0, bArr, i35, this.andSizeBytes);
                    i35 += this.andSizeBytes;
                }
                System.arraycopy(signature2.proofs[i29].input, 0, bArr, i35, this.stateSizeBytes);
                int i36 = i35 + this.stateSizeBytes;
                System.arraycopy(signature2.proofs[i29].msgs, 0, bArr, i36, this.andSizeBytes);
                int i37 = i36 + this.andSizeBytes;
                System.arraycopy(signature2.proofs[i29].C, 0, bArr, i37, this.digestSizeBytes);
                i28 = i37 + this.digestSizeBytes;
            }
        }
        return i28 - i15;
    }

    private void setChallenge(byte[] bArr, int i15, int i16) {
        int i17 = i15 * 2;
        Utils.setBit(bArr, i17, (byte) (i16 & 1));
        Utils.setBit(bArr, i17 + 1, (byte) ((i16 >>> 1) & 1));
    }

    private int sign_picnic1(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr, Signature signature) {
        byte[] bArr2;
        PicnicEngine picnicEngine = this;
        int i15 = 2;
        int i16 = 1;
        int i17 = 0;
        View[][] viewArr = (View[][]) Array.newInstance((Class<?>) View.class, picnicEngine.numMPCRounds, 3);
        int[] iArr4 = {picnicEngine.numMPCRounds, picnicEngine.numMPCParties, picnicEngine.digestSizeBytes};
        Class cls = Byte.TYPE;
        byte[][][] bArr3 = (byte[][][]) Array.newInstance((Class<?>) cls, iArr4);
        byte[][][] bArr4 = (byte[][][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, 3, picnicEngine.UnruhGWithInputBytes);
        byte[] bArrComputeSeeds = computeSeeds(iArr, iArr2, iArr3, bArr);
        int i18 = picnicEngine.numMPCParties * picnicEngine.seedSizeBytes;
        System.arraycopy(bArrComputeSeeds, picnicEngine.numMPCRounds * i18, signature.salt, 0, 32);
        Tape tape = new Tape(picnicEngine);
        int i19 = picnicEngine.stateSizeBytes;
        int iMax = Math.max(i19 * 9, i19 + picnicEngine.andSizeBytes);
        byte[] bArr5 = new byte[iMax];
        int i25 = 0;
        while (i25 < picnicEngine.numMPCRounds) {
            viewArr[i25][i17] = new View(picnicEngine);
            viewArr[i25][i16] = new View(picnicEngine);
            viewArr[i25][i15] = new View(picnicEngine);
            int i26 = i17;
            while (i26 < i15) {
                int i27 = i15;
                int i28 = iMax;
                int i29 = i16;
                Tape tape2 = tape;
                byte[] bArr6 = bArrComputeSeeds;
                byte[] bArr7 = bArr5;
                if (!picnicEngine.createRandomTape(bArr6, (i18 * i25) + (picnicEngine.seedSizeBytes * i26), signature.salt, i25, i26, bArr5, picnicEngine.stateSizeBytes + picnicEngine.andSizeBytes)) {
                    LOG.fine("createRandomTape failed");
                    return -1;
                }
                int[] iArr5 = viewArr[i25][i26].inputShare;
                Pack.littleEndianToInt(bArr7, 0, iArr5);
                Utils.zeroTrailingBits(iArr5, picnicEngine.stateSizeBits);
                System.arraycopy(bArr7, picnicEngine.stateSizeBytes, tape2.tapes[i26], 0, picnicEngine.andSizeBytes);
                i26++;
                bArrComputeSeeds = bArr6;
                bArr5 = bArr7;
                tape = tape2;
                iMax = i28;
                i15 = i27;
                i16 = i29;
            }
            int i35 = i15;
            int i36 = i16;
            Tape tape3 = tape;
            byte[] bArr8 = bArrComputeSeeds;
            int i37 = iMax;
            int i38 = i18 * i25;
            byte[] bArr9 = bArr5;
            View[][] viewArr2 = viewArr;
            int i39 = i25;
            if (!picnicEngine.createRandomTape(bArr8, (picnicEngine.seedSizeBytes * 2) + i38, signature.salt, i25, 2, tape3.tapes[i35], picnicEngine.andSizeBytes)) {
                LOG.fine("createRandomTape failed");
                return -1;
            }
            View[] viewArr3 = viewArr2[i39];
            picnicEngine.xor_three(viewArr3[i35].inputShare, iArr, viewArr3[0].inputShare, viewArr3[i36].inputShare);
            tape3.pos = 0;
            int[] iArrLittleEndianToInt = Pack.littleEndianToInt(bArr9, 0, i37 / 4);
            picnicEngine.mpc_LowMC(tape3, viewArr2[i39], iArr3, iArrLittleEndianToInt);
            Pack.intToLittleEndian(iArrLittleEndianToInt, bArr9, 0);
            int[] iArr6 = new int[16];
            View[] viewArr4 = viewArr2[i39];
            picnicEngine.xor_three(iArr6, viewArr4[0].outputShare, viewArr4[i36].outputShare, viewArr4[i35].outputShare);
            if (!subarrayEquals(iArr6, iArr2, picnicEngine.stateSizeWords)) {
                LOG.fine("Simulation failed; output does not match public key (round = " + i39 + ")");
                return -1;
            }
            picnicEngine.Commit(bArr8, i38, viewArr2[i39][0], bArr3[i39][0]);
            picnicEngine.Commit(bArr8, picnicEngine.seedSizeBytes + i38, viewArr2[i39][i36], bArr3[i39][i36]);
            picnicEngine.Commit(bArr8, (picnicEngine.seedSizeBytes * 2) + i38, viewArr2[i39][i35], bArr3[i39][i35]);
            if (picnicEngine.transform == i36) {
                picnicEngine.G(0, bArr8, i38, viewArr2[i39][0], bArr4[i39][0]);
                picnicEngine.G(1, bArr8, i38 + picnicEngine.seedSizeBytes, viewArr2[i39][i36], bArr4[i39][i36]);
                picnicEngine.G(2, bArr8, i38 + (picnicEngine.seedSizeBytes * 2), viewArr2[i39][i35], bArr4[i39][i35]);
                bArr2 = bArr8;
            } else {
                bArr2 = bArr8;
            }
            i25 = i39 + 1;
            picnicEngine = this;
            tape = tape3;
            bArr5 = bArr9;
            bArrComputeSeeds = bArr2;
            viewArr = viewArr2;
            i15 = i35;
            iMax = i37;
            i16 = 1;
            i17 = 0;
        }
        View[][] viewArr5 = viewArr;
        byte[] bArr10 = bArrComputeSeeds;
        PicnicEngine picnicEngine2 = this;
        picnicEngine2.H3(iArr2, iArr3, viewArr5, bArr3, signature.challengeBits, signature.salt, bArr, bArr4);
        int i45 = 0;
        while (i45 < picnicEngine2.numMPCRounds) {
            byte[] bArr11 = bArr10;
            picnicEngine2.prove(signature.proofs[i45], picnicEngine2.getChallenge(signature.challengeBits, i45), bArr11, i18 * i45, viewArr5[i45], bArr3[i45], picnicEngine2.transform != 1 ? null : bArr4[i45]);
            i45++;
            picnicEngine2 = this;
            bArr10 = bArr11;
        }
        return 0;
    }

    private boolean sign_picnic3(int[] iArr, int[] iArr2, int[] iArr3, byte[] bArr, Signature2 signature2) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i25 = this.seedSizeBytes + 32;
        byte[] bArr2 = new byte[i25];
        computeSaltAndRootSeed(bArr2, iArr, iArr2, iArr3, bArr);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 32, i25);
        signature2.salt = Arrays.copyOfRange(bArr2, 0, 32);
        Tree tree = new Tree(this, this.numMPCRounds, this.seedSizeBytes);
        tree.generateSeeds(bArrCopyOfRange, signature2.salt, 0);
        byte[][] leaves = tree.getLeaves();
        int leavesOffset = tree.getLeavesOffset();
        int i26 = this.numMPCRounds;
        Tape[] tapeArr = new Tape[i26];
        Tree[] treeArr = new Tree[i26];
        int i27 = 0;
        while (true) {
            i15 = this.numMPCRounds;
            if (i27 >= i15) {
                break;
            }
            tapeArr[i27] = new Tape(this);
            Tree tree2 = new Tree(this, this.numMPCParties, this.seedSizeBytes);
            treeArr[i27] = tree2;
            tree2.generateSeeds(leaves[i27 + leavesOffset], signature2.salt, i27);
            createRandomTapes(tapeArr[i27], treeArr[i27].getLeaves(), treeArr[i27].getLeavesOffset(), signature2.salt, i27);
            i27++;
        }
        int[] iArr4 = {i15, this.stateSizeWords * 4};
        Class cls = Byte.TYPE;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, iArr4);
        byte[] bArr4 = new byte[MAX_AUX_BYTES];
        int i28 = 0;
        while (true) {
            i16 = this.numMPCRounds;
            if (i28 >= i16) {
                break;
            }
            tapeArr[i28].computeAuxTape(bArr3[i28]);
            i28++;
        }
        byte[][][] bArr5 = (byte[][][]) Array.newInstance((Class<?>) cls, i16, this.numMPCParties, this.digestSizeBytes);
        int i29 = 0;
        while (true) {
            i17 = this.numMPCRounds;
            if (i29 >= i17) {
                break;
            }
            int i35 = 0;
            while (true) {
                i19 = this.numMPCParties;
                if (i35 < i19 - 1) {
                    commit(bArr5[i29][i35], treeArr[i29].getLeaf(i35), null, signature2.salt, i29, i35);
                    i35++;
                }
            }
            int i36 = i19 - 1;
            getAuxBits(bArr4, tapeArr[i29]);
            commit(bArr5[i29][i36], treeArr[i29].getLeaf(i36), bArr4, signature2.salt, i29, i36);
            i29++;
        }
        Msg[] msgArr = new Msg[i17];
        int[] iArr5 = new int[this.stateSizeBits];
        int i37 = 0;
        while (true) {
            int i38 = this.numMPCRounds;
            if (i37 >= i38) {
                byte[][] bArr6 = (byte[][]) Array.newInstance((Class<?>) cls, i38, this.digestSizeBytes);
                byte[][] bArr7 = (byte[][]) Array.newInstance((Class<?>) cls, this.numMPCRounds, this.digestSizeBytes);
                for (int i39 = 0; i39 < this.numMPCRounds; i39++) {
                    commit_h(bArr6[i39], bArr5[i39]);
                    commit_v(bArr7[i39], bArr3[i39], msgArr[i39]);
                }
                Tree tree3 = new Tree(this, this.numMPCRounds, this.digestSizeBytes);
                tree3.buildMerkleTree(bArr7, signature2.salt);
                int i45 = this.numOpenedRounds;
                int[] iArr6 = new int[i45];
                signature2.challengeC = iArr6;
                int[] iArr7 = new int[i45];
                signature2.challengeP = iArr7;
                byte[] bArr8 = new byte[this.digestSizeBytes];
                signature2.challengeHash = bArr8;
                int i46 = 0;
                HCP(bArr8, iArr6, iArr7, bArr6, tree3.nodes[0], signature2.salt, iArr2, iArr3, bArr);
                int[] iArr8 = new int[1];
                signature2.cvInfo = tree3.openMerkleTree(getMissingLeavesList(signature2.challengeC), this.numMPCRounds - this.numOpenedRounds, iArr8);
                signature2.cvInfoLen = iArr8[0];
                int i47 = this.numMPCRounds;
                int i48 = this.seedSizeBytes;
                byte[] bArr9 = new byte[i47 * i48];
                signature2.iSeedInfo = bArr9;
                signature2.iSeedInfoLen = tree.revealSeeds(signature2.challengeC, this.numOpenedRounds, bArr9, i47 * i48);
                signature2.proofs = new Signature2.Proof2[this.numMPCRounds];
                int i49 = 0;
                while (i49 < this.numMPCRounds) {
                    if (contains(signature2.challengeC, this.numOpenedRounds, i49)) {
                        signature2.proofs[i49] = new Signature2.Proof2(this);
                        int iIndexOf = indexOf(signature2.challengeC, this.numOpenedRounds, i49);
                        int[] iArr9 = {signature2.challengeP[iIndexOf]};
                        Signature2.Proof2 proof2 = signature2.proofs[i49];
                        int i55 = this.numMPCParties;
                        int i56 = this.seedSizeBytes;
                        byte[] bArr10 = new byte[i55 * i56];
                        proof2.seedInfo = bArr10;
                        proof2.seedInfoLen = treeArr[i49].revealSeeds(iArr9, 1, bArr10, i55 * i56);
                        if (signature2.challengeP[iIndexOf] != this.numMPCParties - 1) {
                            getAuxBits(signature2.proofs[i49].aux, tapeArr[i49]);
                        }
                        i18 = i46;
                        System.arraycopy(bArr3[i49], i18, signature2.proofs[i49].input, i18, this.stateSizeBytes);
                        System.arraycopy(msgArr[i49].msgs[signature2.challengeP[iIndexOf]], i18, signature2.proofs[i49].msgs, i18, this.andSizeBytes);
                        System.arraycopy(bArr5[i49][signature2.challengeP[iIndexOf]], i18, signature2.proofs[i49].C, i18, this.digestSizeBytes);
                    } else {
                        i18 = i46;
                    }
                    i49++;
                    i46 = i18;
                }
                return true;
            }
            msgArr[i37] = new Msg(this);
            int[] iArrLittleEndianToInt = Pack.littleEndianToInt(bArr3[i37], 0, this.stateSizeWords);
            xor_array(iArrLittleEndianToInt, iArrLittleEndianToInt, iArr, 0);
            int i57 = i37;
            if (simulateOnline(iArrLittleEndianToInt, tapeArr[i57], iArr5, msgArr[i57], iArr3, iArr2) != 0) {
                LOG.fine("MPC simulation failed, aborting signature");
                return false;
            }
            Pack.intToLittleEndian(iArrLittleEndianToInt, bArr3[i57], 0);
            i37 = i57 + 1;
        }
    }

    private int simulateOnline(int[] iArr, Tape tape, int[] iArr2, Msg msg, int[] iArr3, int[] iArr4) {
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[16];
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        matrix_mul(iArr5, iArr, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        xor_array(iArr6, iArr5, iArr3, 0);
        for (int i15 = 1; i15 <= this.numRounds; i15++) {
            tapesToWords(iArr2, tape);
            mpc_sbox(iArr6, iArr2, tape, msg);
            int i16 = i15 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i16);
            matrix_mul(iArr6, iArr6, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer());
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i16);
            xor_array(iArr6, iArr6, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer());
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i15);
            matrix_mul(iArr5, iArr, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            xor_array(iArr6, iArr5, iArr6, 0);
        }
        return !subarrayEquals(iArr6, iArr4, this.stateSizeWords) ? -1 : 0;
    }

    private static boolean subarrayEquals(byte[] bArr, byte[] bArr2, int i15) {
        if (bArr.length < i15 || bArr2.length < i15) {
            return false;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            if (bArr[i16] != bArr2[i16]) {
                return false;
            }
        }
        return true;
    }

    private void substitution(int[] iArr) {
        for (int i15 = 0; i15 < this.numSboxes * 3; i15 += 3) {
            int i16 = i15 + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i16);
            int i17 = i15 + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i17);
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i15);
            Utils.setBitInWordArray(iArr, i16, (bitFromWordArray2 & bitFromWordArray3) ^ bitFromWordArray);
            int i18 = bitFromWordArray ^ bitFromWordArray2;
            Utils.setBitInWordArray(iArr, i17, (bitFromWordArray & bitFromWordArray3) ^ i18);
            Utils.setBitInWordArray(iArr, i15, (i18 ^ bitFromWordArray3) ^ (bitFromWordArray & bitFromWordArray2));
        }
    }

    private void tapesToWords(int[] iArr, Tape tape) {
        for (int i15 = 0; i15 < this.stateSizeBits; i15++) {
            iArr[i15] = tape.tapesToWord();
        }
    }

    private void updateDigest(int[] iArr, byte[] bArr) {
        Pack.intToLittleEndian(iArr, bArr, 0);
        this.digest.update(bArr, 0, this.stateSizeBytes);
    }

    private int verify(Signature signature, int[] iArr, int[] iArr2, byte[] bArr) {
        int i15;
        int i16;
        PicnicEngine picnicEngine = this;
        char c15 = 3;
        char c16 = 2;
        int[] iArr3 = {picnicEngine.numMPCRounds, picnicEngine.numMPCParties, picnicEngine.digestSizeBytes};
        Class cls = Byte.TYPE;
        byte[][][] bArr2 = (byte[][][]) Array.newInstance((Class<?>) cls, iArr3);
        byte[][][] bArr3 = (byte[][][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, 3, picnicEngine.UnruhGWithInputBytes);
        int[][][] iArr4 = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, picnicEngine.numMPCRounds, 3, picnicEngine.stateSizeBytes);
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr4 = signature.challengeBits;
        int i17 = picnicEngine.stateSizeBytes;
        byte[] bArr5 = new byte[Math.max(i17 * 6, i17 + picnicEngine.andSizeBytes)];
        Tape tape = new Tape(picnicEngine);
        int i18 = picnicEngine.numMPCRounds;
        View[] viewArr = new View[i18];
        View[] viewArr2 = new View[i18];
        int i19 = 0;
        while (true) {
            int i25 = picnicEngine.numMPCRounds;
            if (i19 >= i25) {
                byte[] bArr6 = new byte[Utils.numBytes(i25 * 2)];
                picnicEngine.H3(iArr, iArr2, iArr4, bArr2, bArr6, signature.salt, bArr, bArr3);
                if (!subarrayEquals(bArr4, bArr6, Utils.numBytes(picnicEngine.numMPCRounds * 2))) {
                    break;
                }
                return 0;
            }
            viewArr[i19] = new View(picnicEngine);
            View[] viewArr3 = viewArr2;
            View view = new View(picnicEngine);
            viewArr3[i19] = view;
            Signature.Proof[] proofArr2 = proofArr;
            View[] viewArr4 = viewArr;
            char c17 = c15;
            byte[] bArr7 = bArr4;
            char c18 = c16;
            if (!picnicEngine.verifyProof(proofArr2[i19], viewArr[i19], view, picnicEngine.getChallenge(bArr4, i19), signature.salt, i19, bArr5, iArr2, tape)) {
                break;
            }
            int challenge = picnicEngine.getChallenge(bArr7, i19);
            picnicEngine.Commit(proofArr2[i19].seed1, 0, viewArr4[i19], bArr2[i19][challenge]);
            int i26 = (challenge + 1) % 3;
            picnicEngine.Commit(proofArr2[i19].seed2, 0, viewArr3[i19], bArr2[i19][i26]);
            int i27 = (challenge + 2) % 3;
            System.arraycopy(proofArr2[i19].view3Commitment, 0, bArr2[i19][i27], 0, picnicEngine.digestSizeBytes);
            if (picnicEngine.transform == 1) {
                picnicEngine.G(challenge, proofArr2[i19].seed1, 0, viewArr4[i19], bArr3[i19][challenge]);
                i15 = challenge;
                picnicEngine = this;
                i16 = i26;
                picnicEngine.G(i16, proofArr2[i19].seed2, 0, viewArr3[i19], bArr3[i19][i26]);
                System.arraycopy(proofArr2[i19].view3UnruhG, 0, bArr3[i19][i27], 0, i15 == 0 ? picnicEngine.UnruhGWithInputBytes : picnicEngine.UnruhGWithoutInputBytes);
            } else {
                i15 = challenge;
                i16 = i26;
            }
            iArr4[i19][i15] = viewArr4[i19].outputShare;
            iArr4[i19][i16] = viewArr3[i19].outputShare;
            int[] iArr5 = new int[picnicEngine.stateSizeWords];
            picnicEngine.xor_three(iArr5, viewArr4[i19].outputShare, viewArr3[i19].outputShare, iArr);
            iArr4[i19][i27] = iArr5;
            i19++;
            bArr4 = bArr7;
            proofArr = proofArr2;
            c15 = c17;
            viewArr = viewArr4;
            viewArr2 = viewArr3;
            c16 = c18;
        }
        LOG.fine("Invalid signature. Did not verify");
        return -1;
    }

    private int verify_picnic3(Signature2 signature2, int[] iArr, int[] iArr2, byte[] bArr) {
        int iVerifyMerkleTree;
        Logger logger;
        String string;
        StringBuilder sb5;
        Tape[] tapeArr;
        int i15;
        PicnicEngine picnicEngine = this;
        int[] iArr3 = {picnicEngine.numMPCRounds, picnicEngine.numMPCParties, picnicEngine.digestSizeBytes};
        Class cls = Byte.TYPE;
        byte[][][] bArr2 = (byte[][][]) Array.newInstance((Class<?>) cls, iArr3);
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, picnicEngine.digestSizeBytes);
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) cls, picnicEngine.numMPCRounds, picnicEngine.digestSizeBytes);
        Msg[] msgArr = new Msg[picnicEngine.numMPCRounds];
        Tree tree = new Tree(picnicEngine, picnicEngine.numMPCRounds, picnicEngine.digestSizeBytes);
        byte[] bArr5 = new byte[64];
        int i16 = picnicEngine.numMPCRounds;
        Tree[] treeArr = new Tree[i16];
        Tape[] tapeArr2 = new Tape[i16];
        Tree tree2 = new Tree(picnicEngine, picnicEngine.numMPCRounds, picnicEngine.seedSizeBytes);
        if (tree2.reconstructSeeds(signature2.challengeC, picnicEngine.numOpenedRounds, signature2.iSeedInfo, signature2.iSeedInfoLen, signature2.salt, 0) != 0) {
            return -1;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= picnicEngine.numMPCRounds) {
                int i18 = picnicEngine.numMPCParties - 1;
                byte[] bArr6 = new byte[MAX_AUX_BYTES];
                int i19 = 0;
                while (i19 < picnicEngine.numMPCRounds) {
                    byte[] bArr7 = bArr6;
                    Tape tape = new Tape(picnicEngine);
                    tapeArr2[i19] = tape;
                    byte[][] bArr8 = bArr3;
                    byte[][][] bArr9 = bArr2;
                    picnicEngine.createRandomTapes(tape, treeArr[i19].getLeaves(), treeArr[i19].getLeavesOffset(), signature2.salt, i19);
                    if (picnicEngine.contains(signature2.challengeC, picnicEngine.numOpenedRounds, i19)) {
                        tapeArr = tapeArr2;
                        int i25 = signature2.challengeP[indexOf(signature2.challengeC, picnicEngine.numOpenedRounds, i19)];
                        int i26 = 0;
                        while (i26 < i18) {
                            if (i26 != i25) {
                                picnicEngine.commit(bArr9[i19][i26], treeArr[i19].getLeaf(i26), null, signature2.salt, i19, i26);
                            }
                            i26++;
                            picnicEngine = this;
                        }
                        if (i18 != i25) {
                            picnicEngine = this;
                            picnicEngine.commit(bArr9[i19][i18], treeArr[i19].getLeaf(i18), signature2.proofs[i19].aux, signature2.salt, i19, i18);
                        } else {
                            picnicEngine = this;
                        }
                        System.arraycopy(signature2.proofs[i19].C, 0, bArr9[i19][i25], 0, picnicEngine.digestSizeBytes);
                    } else {
                        tapeArr2[i19].computeAuxTape(null);
                        Tape[] tapeArr3 = tapeArr2;
                        int i27 = 0;
                        while (i27 < i18) {
                            picnicEngine.commit(bArr9[i19][i27], treeArr[i19].getLeaf(i27), null, signature2.salt, i19, i27);
                            i27++;
                            tapeArr3 = tapeArr3;
                        }
                        tapeArr = tapeArr3;
                        picnicEngine.getAuxBits(bArr7, tapeArr[i19]);
                        picnicEngine.commit(bArr9[i19][i18], treeArr[i19].getLeaf(i18), bArr7, signature2.salt, i19, i18);
                    }
                    i19++;
                    bArr6 = bArr7;
                    bArr3 = bArr8;
                    tapeArr2 = tapeArr;
                    bArr2 = bArr9;
                }
                Tape[] tapeArr4 = tapeArr2;
                byte[][][] bArr10 = bArr2;
                byte[][] bArr11 = bArr3;
                for (int i28 = 0; i28 < picnicEngine.numMPCRounds; i28++) {
                    picnicEngine.commit_h(bArr11[i28], bArr10[i28]);
                }
                int[] iArr4 = new int[picnicEngine.stateSizeBits];
                int i29 = 0;
                while (true) {
                    int i35 = picnicEngine.numMPCRounds;
                    if (i29 >= i35) {
                        if (tree.addMerkleNodes(picnicEngine.getMissingLeavesList(signature2.challengeC), i35 - picnicEngine.numOpenedRounds, signature2.cvInfo, signature2.cvInfoLen) != 0 || (iVerifyMerkleTree = tree.verifyMerkleTree(bArr4, signature2.salt)) != 0) {
                            return -1;
                        }
                        picnicEngine.HCP(bArr5, null, null, bArr11, tree.nodes[0], signature2.salt, iArr, iArr2, bArr);
                        if (!subarrayEquals(signature2.challengeHash, bArr5, picnicEngine.digestSizeBytes)) {
                            logger = LOG;
                            string = "Challenge does not match, signature invalid";
                            break;
                        }
                        return iVerifyMerkleTree;
                    }
                    msgArr[i29] = new Msg(picnicEngine);
                    if (picnicEngine.contains(signature2.challengeC, picnicEngine.numOpenedRounds, i29)) {
                        int i36 = signature2.challengeP[indexOf(signature2.challengeC, picnicEngine.numOpenedRounds, i29)];
                        if (i36 != i18) {
                            tapeArr4[i29].setAuxBits(signature2.proofs[i29].aux);
                        }
                        System.arraycopy(signature2.proofs[i29].msgs, 0, msgArr[i29].msgs[i36], 0, picnicEngine.andSizeBytes);
                        Arrays.fill(tapeArr4[i29].tapes[i36], (byte) 0);
                        msgArr[i29].unopened = i36;
                        byte[] bArr12 = new byte[picnicEngine.stateSizeWords * 4];
                        byte[] bArr13 = signature2.proofs[i29].input;
                        System.arraycopy(bArr13, 0, bArr12, 0, bArr13.length);
                        int i37 = picnicEngine.stateSizeWords;
                        int[] iArr5 = new int[i37];
                        Pack.littleEndianToInt(bArr12, 0, iArr5, 0, i37);
                        if (picnicEngine.simulateOnline(iArr5, tapeArr4[i29], iArr4, msgArr[i29], iArr2, iArr) != 0) {
                            logger = LOG;
                            sb5 = new StringBuilder();
                            sb5.append("MPC simulation failed for round ");
                            sb5.append(i29);
                            sb5.append(", signature invalid");
                            break;
                        }
                        picnicEngine.commit_v(bArr4[i29], signature2.proofs[i29].input, msgArr[i29]);
                    } else {
                        bArr4[i29] = null;
                    }
                    i29++;
                }
                logger.fine(string);
                return -1;
            }
            if (picnicEngine.contains(signature2.challengeC, picnicEngine.numOpenedRounds, i17)) {
                treeArr[i17] = new Tree(picnicEngine, picnicEngine.numMPCParties, picnicEngine.seedSizeBytes);
                int[] iArr6 = {signature2.challengeP[indexOf(signature2.challengeC, picnicEngine.numOpenedRounds, i17)]};
                Tree tree3 = treeArr[i17];
                Signature2.Proof2 proof2 = signature2.proofs[i17];
                int i38 = i17;
                int iReconstructSeeds = tree3.reconstructSeeds(iArr6, 1, proof2.seedInfo, proof2.seedInfoLen, signature2.salt, i38);
                i15 = i38;
                if (iReconstructSeeds != 0) {
                    logger = LOG;
                    sb5 = new StringBuilder();
                    sb5.append("Failed to reconstruct seeds for round ");
                    sb5.append(i15);
                    break;
                }
            } else {
                Tree tree4 = new Tree(picnicEngine, picnicEngine.numMPCParties, picnicEngine.seedSizeBytes);
                treeArr[i17] = tree4;
                tree4.generateSeeds(tree2.getLeaf(i17), signature2.salt, i17);
                i15 = i17;
            }
            i17 = i15 + 1;
        }
        string = sb5.toString();
        logger.fine(string);
        return -1;
    }

    private void wordToMsgs(int i15, Msg msg) {
        for (int i16 = 0; i16 < this.numMPCParties; i16++) {
            Utils.setBit(msg.msgs[i16], msg.pos, (byte) Utils.getBit(i15, i16));
        }
        msg.pos++;
    }

    private void xor_three(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i15 = 0; i15 < this.stateSizeWords; i15++) {
            iArr[i15] = (iArr2[i15] ^ iArr3[i15]) ^ iArr4[i15];
        }
    }

    protected void aux_mpc_sbox(int[] iArr, int[] iArr2, Tape tape) {
        for (int i15 = 0; i15 < this.numSboxes * 3; i15 += 3) {
            int i16 = i15 + 2;
            int bitFromWordArray = Utils.getBitFromWordArray(iArr, i16);
            int i17 = i15 + 1;
            int bitFromWordArray2 = Utils.getBitFromWordArray(iArr, i17);
            int bitFromWordArray3 = Utils.getBitFromWordArray(iArr, i15);
            int bitFromWordArray4 = Utils.getBitFromWordArray(iArr2, i16);
            int bitFromWordArray5 = Utils.getBitFromWordArray(iArr2, i17);
            aux_mpc_AND(bitFromWordArray, bitFromWordArray2, ((Utils.getBitFromWordArray(iArr2, i15) ^ bitFromWordArray) ^ bitFromWordArray2) ^ bitFromWordArray3, tape);
            aux_mpc_AND(bitFromWordArray2, bitFromWordArray3, bitFromWordArray4 ^ bitFromWordArray, tape);
            aux_mpc_AND(bitFromWordArray3, bitFromWordArray, (bitFromWordArray5 ^ bitFromWordArray) ^ bitFromWordArray2, tape);
        }
    }

    public void crypto_sign(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (picnic_sign(bArr3, bArr2, bArr)) {
            System.arraycopy(bArr2, 0, bArr, 4, bArr2.length);
        }
    }

    public void crypto_sign_keypair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        int i15 = this.stateSizeWords;
        byte[] bArr3 = new byte[i15 * 4];
        byte[] bArr4 = new byte[i15 * 4];
        byte[] bArr5 = new byte[i15 * 4];
        picnic_keygen(bArr3, bArr4, bArr5, secureRandom);
        picnic_write_public_key(bArr4, bArr3, bArr);
        picnic_write_private_key(bArr5, bArr4, bArr3, bArr2);
    }

    public boolean crypto_sign_open(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (picnic_verify(bArr3, Arrays.copyOfRange(bArr2, 4, bArr.length + 4), bArr2, Pack.littleEndianToInt(bArr2, 0)) == -1) {
            return false;
        }
        System.arraycopy(bArr2, 4, bArr, 0, bArr.length);
        return true;
    }

    int getChallenge(byte[] bArr, int i15) {
        return Utils.getCrumbAligned(bArr, i15);
    }

    public int getPublicKeySize() {
        return this.CRYPTO_PUBLICKEYBYTES;
    }

    public int getSecretKeySize() {
        return this.CRYPTO_SECRETKEYBYTES;
    }

    public int getSignatureSize(int i15) {
        return this.CRYPTO_BYTES + i15;
    }

    public int getTrueSignatureSize() {
        return this.signatureLength;
    }

    protected void matrix_mul(int[] iArr, int[] iArr2, int[] iArr3, int i15) {
        matrix_mul_offset(iArr, 0, iArr2, 0, iArr3, i15);
    }

    protected void matrix_mul_offset(int[] iArr, int i15, int[] iArr2, int i16, int[] iArr3, int i17) {
        int[] iArr4 = new int[16];
        int i18 = this.stateSizeWords;
        iArr4[i18 - 1] = 0;
        int i19 = this.stateSizeBits;
        int i25 = i19 / 32;
        int i26 = (i18 * 32) - i19;
        int iBitPermuteStepSimple = Bits.bitPermuteStepSimple(Bits.bitPermuteStepSimple(Bits.bitPermuteStepSimple((-1) >>> i26, 1431655765, 1), 858993459, 2), 252645135, 4);
        for (int i27 = 0; i27 < this.stateSizeBits; i27++) {
            int i28 = 0;
            for (int i29 = 0; i29 < i25; i29++) {
                i28 ^= iArr3[i17 + ((this.stateSizeWords * i27) + i29)] & iArr2[i16 + i29];
            }
            if (i26 > 0) {
                i28 ^= (iArr3[i17 + ((this.stateSizeWords * i27) + i25)] & iArr2[i16 + i25]) & iBitPermuteStepSimple;
            }
            Utils.setBit(iArr4, i27, Utils.parity32(i28));
        }
        System.arraycopy(iArr4, 0, iArr, i15, this.stateSizeWords);
    }

    void mpc_AND_verify(int[] iArr, int[] iArr2, int[] iArr3, Tape tape, View view, View view2) {
        byte bit = Utils.getBit(tape.tapes[0], tape.pos);
        byte bit2 = Utils.getBit(tape.tapes[1], tape.pos);
        int i15 = iArr[0];
        int i16 = iArr[1];
        int i17 = iArr2[0];
        int i18 = ((((i16 & i17) ^ (iArr2[1] & i15)) ^ (i15 & i17)) ^ bit) ^ bit2;
        iArr3[0] = i18;
        Utils.setBit(view.communicatedBits, tape.pos, (byte) i18);
        iArr3[1] = Utils.getBit(view2.communicatedBits, tape.pos);
        tape.pos++;
    }

    void mpc_LowMC_verify(View view, View view2, Tape tape, int[] iArr, int[] iArr2, int i15) {
        Arrays.fill(iArr, 0, iArr.length, 0);
        mpc_xor_constant_verify(iArr, iArr2, 0, this.stateSizeWords, i15);
        KMatricesWithPointer kMatricesWithPointerKMatrix = this.lowmcConstants.KMatrix(this, 0);
        int[] iArr3 = iArr;
        matrix_mul_offset(iArr3, 0, view.inputShare, 0, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        matrix_mul_offset(iArr3, this.stateSizeWords, view2.inputShare, 0, kMatricesWithPointerKMatrix.getData(), kMatricesWithPointerKMatrix.getMatrixPointer());
        mpc_xor(iArr3, iArr3, 2);
        for (int i16 = 1; i16 <= this.numRounds; i16++) {
            KMatricesWithPointer kMatricesWithPointerKMatrix2 = this.lowmcConstants.KMatrix(this, i16);
            matrix_mul_offset(iArr3, 0, view.inputShare, 0, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            matrix_mul_offset(iArr, this.stateSizeWords, view2.inputShare, 0, kMatricesWithPointerKMatrix2.getData(), kMatricesWithPointerKMatrix2.getMatrixPointer());
            mpc_substitution_verify(iArr, tape, view, view2);
            int i17 = i16 - 1;
            KMatricesWithPointer kMatricesWithPointerLMatrix = this.lowmcConstants.LMatrix(this, i17);
            int i18 = this.stateSizeWords;
            mpc_matrix_mul(iArr, i18 * 2, iArr, i18 * 2, kMatricesWithPointerLMatrix.getData(), kMatricesWithPointerLMatrix.getMatrixPointer(), 2);
            KMatricesWithPointer kMatricesWithPointerRConstant = this.lowmcConstants.RConstant(this, i17);
            iArr3 = iArr;
            mpc_xor_constant_verify(iArr3, kMatricesWithPointerRConstant.getData(), kMatricesWithPointerRConstant.getMatrixPointer(), this.stateSizeWords, i15);
            mpc_xor(iArr3, iArr3, 2);
        }
        int i19 = this.stateSizeWords;
        System.arraycopy(iArr3, i19 * 2, view.outputShare, 0, i19);
        int i25 = this.stateSizeWords;
        System.arraycopy(iArr3, i25 * 3, view2.outputShare, 0, i25);
    }

    void mpc_substitution_verify(int[] iArr, Tape tape, View view, View view2) {
        int[] iArr2 = new int[2];
        int[] iArr3 = new int[2];
        int[] iArr4 = new int[2];
        int[] iArr5 = new int[2];
        int[] iArr6 = new int[2];
        int[] iArr7 = new int[2];
        int i15 = 0;
        while (i15 < this.numSboxes * 3) {
            for (int i16 = 0; i16 < 2; i16++) {
                int i17 = ((i16 + 2) * this.stateSizeWords * 32) + i15;
                iArr2[i16] = Utils.getBitFromWordArray(iArr, i17 + 2);
                iArr3[i16] = Utils.getBitFromWordArray(iArr, i17 + 1);
                iArr4[i16] = Utils.getBitFromWordArray(iArr, i17);
            }
            mpc_AND_verify(iArr2, iArr3, iArr5, tape, view, view2);
            int[] iArr8 = iArr4;
            int[] iArr9 = iArr2;
            int[] iArr10 = iArr3;
            int[] iArr11 = iArr6;
            int[] iArr12 = iArr5;
            mpc_AND_verify(iArr10, iArr8, iArr11, tape, view, view2);
            int[] iArr13 = iArr7;
            mpc_AND_verify(iArr8, iArr9, iArr13, tape, view, view2);
            iArr2 = iArr9;
            for (int i18 = 0; i18 < 2; i18++) {
                int i19 = ((i18 + 2) * this.stateSizeWords * 32) + i15;
                Utils.setBitInWordArray(iArr, i19 + 2, iArr2[i18] ^ iArr11[i18]);
                Utils.setBitInWordArray(iArr, i19 + 1, (iArr2[i18] ^ iArr10[i18]) ^ iArr13[i18]);
                Utils.setBitInWordArray(iArr, i19, ((iArr2[i18] ^ iArr10[i18]) ^ iArr8[i18]) ^ iArr12[i18]);
            }
            i15 += 3;
            iArr4 = iArr8;
            iArr3 = iArr10;
            iArr7 = iArr13;
            iArr5 = iArr12;
            iArr6 = iArr11;
        }
    }

    void prove(Signature.Proof proof, int i15, byte[] bArr, int i16, View[] viewArr, byte[][] bArr2, byte[][] bArr3) {
        if (i15 == 0) {
            System.arraycopy(bArr, i16, proof.seed1, 0, this.seedSizeBytes);
            int i17 = this.seedSizeBytes;
            System.arraycopy(bArr, i16 + i17, proof.seed2, 0, i17);
        } else if (i15 == 1) {
            int i18 = this.seedSizeBytes;
            System.arraycopy(bArr, i16 + i18, proof.seed1, 0, i18);
            int i19 = this.seedSizeBytes;
            System.arraycopy(bArr, i16 + (i19 * 2), proof.seed2, 0, i19);
        } else {
            if (i15 != 2) {
                LOG.fine("Invalid challenge");
                throw new IllegalArgumentException("challenge");
            }
            int i25 = this.seedSizeBytes;
            System.arraycopy(bArr, (i25 * 2) + i16, proof.seed1, 0, i25);
            System.arraycopy(bArr, i16, proof.seed2, 0, this.seedSizeBytes);
        }
        if (i15 == 1 || i15 == 2) {
            System.arraycopy(viewArr[2].inputShare, 0, proof.inputShare, 0, this.stateSizeWords);
        }
        System.arraycopy(viewArr[(i15 + 1) % 3].communicatedBits, 0, proof.communicatedBits, 0, this.andSizeBytes);
        int i26 = (i15 + 2) % 3;
        System.arraycopy(bArr2[i26], 0, proof.view3Commitment, 0, this.digestSizeBytes);
        if (this.transform == 1) {
            System.arraycopy(bArr3[i26], 0, proof.view3UnruhG, 0, i15 == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes);
        }
    }

    int serializeSignature(Signature signature, byte[] bArr, int i15) {
        Signature.Proof[] proofArr = signature.proofs;
        byte[] bArr2 = signature.challengeBits;
        int iNumBytes = Utils.numBytes(this.numMPCRounds * 2) + 32;
        int i16 = this.numMPCRounds;
        int i17 = iNumBytes + (((this.seedSizeBytes * 2) + this.stateSizeBytes + this.andSizeBytes + this.digestSizeBytes) * i16);
        if (this.transform == 1) {
            i17 += this.UnruhGWithoutInputBytes * i16;
        }
        if (this.CRYPTO_BYTES < i17) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i15, Utils.numBytes(i16 * 2));
        int iNumBytes2 = Utils.numBytes(this.numMPCRounds * 2) + i15;
        System.arraycopy(signature.salt, 0, bArr, iNumBytes2, 32);
        int i18 = iNumBytes2 + 32;
        for (int i19 = 0; i19 < this.numMPCRounds; i19++) {
            int challenge = getChallenge(bArr2, i19);
            System.arraycopy(proofArr[i19].view3Commitment, 0, bArr, i18, this.digestSizeBytes);
            int i25 = i18 + this.digestSizeBytes;
            if (this.transform == 1) {
                int i26 = challenge == 0 ? this.UnruhGWithInputBytes : this.UnruhGWithoutInputBytes;
                System.arraycopy(proofArr[i19].view3UnruhG, 0, bArr, i25, i26);
                i25 += i26;
            }
            System.arraycopy(proofArr[i19].communicatedBits, 0, bArr, i25, this.andSizeBytes);
            int i27 = i25 + this.andSizeBytes;
            System.arraycopy(proofArr[i19].seed1, 0, bArr, i27, this.seedSizeBytes);
            int i28 = this.seedSizeBytes;
            int i29 = i27 + i28;
            System.arraycopy(proofArr[i19].seed2, 0, bArr, i29, i28);
            i18 = i29 + this.seedSizeBytes;
            if (challenge == 1 || challenge == 2) {
                Pack.intToLittleEndian(proofArr[i19].inputShare, 0, this.stateSizeWords, bArr, i18);
                i18 += this.stateSizeBytes;
            }
        }
        return i18 - i15;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    boolean verifyProof(Signature.Proof proof, View view, View view2, int i15, byte[] bArr, int i16, byte[] bArr2, int[] iArr, Tape tape) {
        byte[] bArr3;
        boolean z15;
        System.arraycopy(proof.communicatedBits, 0, view2.communicatedBits, 0, this.andSizeBytes);
        tape.pos = 0;
        if (i15 == 0) {
            bArr3 = bArr2;
            boolean zCreateRandomTape = createRandomTape(proof.seed1, 0, bArr, i16, 0, bArr3, this.stateSizeBytes + this.andSizeBytes);
            Pack.littleEndianToInt(bArr3, 0, view.inputShare);
            System.arraycopy(bArr3, this.stateSizeBytes, tape.tapes[0], 0, this.andSizeBytes);
            z15 = zCreateRandomTape && createRandomTape(proof.seed2, 0, bArr, i16, 1, bArr3, this.stateSizeBytes + this.andSizeBytes);
            if (z15) {
                Pack.littleEndianToInt(bArr3, 0, view2.inputShare);
                System.arraycopy(bArr3, this.stateSizeBytes, tape.tapes[1], 0, this.andSizeBytes);
            }
        } else if (i15 == 1) {
            boolean zCreateRandomTape2 = createRandomTape(proof.seed1, 0, bArr, i16, 1, bArr2, this.stateSizeBytes + this.andSizeBytes);
            Pack.littleEndianToInt(bArr2, 0, view.inputShare);
            System.arraycopy(bArr2, this.stateSizeBytes, tape.tapes[0], 0, this.andSizeBytes);
            z15 = zCreateRandomTape2 && createRandomTape(proof.seed2, 0, bArr, i16, 2, tape.tapes[1], this.andSizeBytes);
            if (z15) {
                System.arraycopy(proof.inputShare, 0, view2.inputShare, 0, this.stateSizeWords);
            }
            bArr3 = bArr2;
        } else if (i15 != 2) {
            LOG.fine("Invalid Challenge!");
            bArr3 = bArr2;
            z15 = false;
        } else {
            boolean zCreateRandomTape3 = createRandomTape(proof.seed1, 0, bArr, i16, 2, tape.tapes[0], this.andSizeBytes);
            System.arraycopy(proof.inputShare, 0, view.inputShare, 0, this.stateSizeWords);
            if (zCreateRandomTape3) {
                bArr3 = bArr2;
                if (createRandomTape(proof.seed2, 0, bArr, i16, 0, bArr3, this.stateSizeBytes + this.andSizeBytes)) {
                    z15 = true;
                }
                if (z15) {
                    Pack.littleEndianToInt(bArr3, 0, view2.inputShare);
                    System.arraycopy(bArr3, this.stateSizeBytes, tape.tapes[1], 0, this.andSizeBytes);
                }
            } else {
                bArr3 = bArr2;
            }
            z15 = false;
            if (z15) {
                Pack.littleEndianToInt(bArr3, 0, view2.inputShare);
                System.arraycopy(bArr3, this.stateSizeBytes, tape.tapes[1], 0, this.andSizeBytes);
            }
        }
        if (!z15) {
            LOG.fine("Failed to generate random tapes, signature verification will fail (but signature may actually be valid)");
            return false;
        }
        Utils.zeroTrailingBits(view.inputShare, this.stateSizeBits);
        Utils.zeroTrailingBits(view2.inputShare, this.stateSizeBits);
        mpc_LowMC_verify(view, view2, tape, Pack.littleEndianToInt(bArr3, 0, bArr3.length / 4), iArr, i15);
        return true;
    }

    protected void xor_array(int[] iArr, int[] iArr2, int[] iArr3, int i15) {
        for (int i16 = 0; i16 < this.stateSizeWords; i16++) {
            iArr[i16] = iArr2[i16] ^ iArr3[i16 + i15];
        }
    }

    private void H3(int[] iArr, int[] iArr2, int[][][] iArr3, byte[][][] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][][] bArr5) {
        this.digest.update((byte) 1);
        byte[] bArr6 = new byte[this.stateSizeWords * 4];
        for (int i15 = 0; i15 < this.numMPCRounds; i15++) {
            for (int i16 = 0; i16 < 3; i16++) {
                Pack.intToLittleEndian(iArr3[i15][i16], bArr6, 0);
                this.digest.update(bArr6, 0, this.stateSizeBytes);
            }
        }
        implH3(iArr, iArr2, bArr, bArr2, bArr3, bArr4, bArr5);
    }

    private boolean arePaddingBitsZero(int[] iArr, int i15) {
        if ((i15 & 31) == 0) {
            return true;
        }
        return (iArr[i15 >>> 5] & (~Utils.getTrailingBitsMask(i15))) == 0;
    }

    private void mpc_AND(int[] iArr, int[] iArr2, int[] iArr3, Tape tape, View[] viewArr) {
        byte bit = Utils.getBit(tape.tapes[0], tape.pos);
        byte bit2 = Utils.getBit(tape.tapes[1], tape.pos);
        byte bit3 = Utils.getBit(tape.tapes[2], tape.pos);
        int i15 = iArr[0];
        int i16 = iArr2[1];
        int i17 = iArr[1];
        int i18 = iArr2[0];
        int i19 = (((i15 & i18) ^ ((i15 & i16) ^ (i17 & i18))) ^ bit) ^ bit2;
        iArr3[0] = i19;
        int i25 = iArr2[2];
        int i26 = iArr[2];
        iArr3[1] = (bit2 ^ ((i16 & i17) ^ ((i17 & i25) ^ (i26 & i16)))) ^ bit3;
        iArr3[2] = ((((iArr[0] & i25) ^ (iArr2[0] & i26)) ^ (i26 & i25)) ^ bit3) ^ bit;
        Utils.setBit(viewArr[0].communicatedBits, tape.pos, (byte) i19);
        Utils.setBit(viewArr[1].communicatedBits, tape.pos, (byte) iArr3[1]);
        Utils.setBit(viewArr[2].communicatedBits, tape.pos, (byte) iArr3[2]);
        tape.pos++;
    }

    private static boolean subarrayEquals(int[] iArr, int[] iArr2, int i15) {
        if (iArr.length < i15 || iArr2.length < i15) {
            return false;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            if (iArr[i16] != iArr2[i16]) {
                return false;
            }
        }
        return true;
    }
}
