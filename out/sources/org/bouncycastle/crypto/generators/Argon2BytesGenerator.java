package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.Blake2bDigest;
import org.bouncycastle.crypto.params.Argon2Parameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class Argon2BytesGenerator {
    private static final int ARGON2_ADDRESSES_IN_BLOCK = 128;
    private static final int ARGON2_BLOCK_SIZE = 1024;
    private static final int ARGON2_PREHASH_DIGEST_LENGTH = 64;
    private static final int ARGON2_PREHASH_SEED_LENGTH = 72;
    private static final int ARGON2_QWORDS_IN_BLOCK = 128;
    private static final int ARGON2_SYNC_POINTS = 4;
    private static final long M32L = 4294967295L;
    private static final int MAX_PARALLELISM = 16777215;
    private static final int MIN_ITERATIONS = 1;
    private static final int MIN_OUTLEN = 4;
    private static final int MIN_PARALLELISM = 1;
    private static final byte[] ZERO_BYTES = new byte[4];
    private int laneLength;
    private Block[] memory;
    private Argon2Parameters parameters;
    private int segmentLength;

    private static class Block {
        private static final int SIZE = 128;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final long[] f149071v;

        private Block() {
            this.f149071v = new long[128];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void copyBlock(Block block) {
            System.arraycopy(block.f149071v, 0, this.f149071v, 0, 128);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xor(Block block, Block block2) {
            long[] jArr = this.f149071v;
            long[] jArr2 = block.f149071v;
            long[] jArr3 = block2.f149071v;
            for (int i15 = 0; i15 < 128; i15++) {
                jArr[i15] = jArr2[i15] ^ jArr3[i15];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xorWith(Block block) {
            long[] jArr = this.f149071v;
            long[] jArr2 = block.f149071v;
            for (int i15 = 0; i15 < 128; i15++) {
                jArr[i15] = jArr[i15] ^ jArr2[i15];
            }
        }

        public Block clear() {
            Arrays.fill(this.f149071v, 0L);
            return this;
        }

        void fromBytes(byte[] bArr) {
            if (bArr.length < 1024) {
                throw new IllegalArgumentException("input shorter than blocksize");
            }
            Pack.littleEndianToLong(bArr, 0, this.f149071v);
        }

        void toBytes(byte[] bArr) {
            if (bArr.length < 1024) {
                throw new IllegalArgumentException("output shorter than blocksize");
            }
            Pack.longToLittleEndian(this.f149071v, bArr, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xorWith(Block block, Block block2) {
            long[] jArr = this.f149071v;
            long[] jArr2 = block.f149071v;
            long[] jArr3 = block2.f149071v;
            for (int i15 = 0; i15 < 128; i15++) {
                jArr[i15] = jArr[i15] ^ (jArr2[i15] ^ jArr3[i15]);
            }
        }
    }

    private static class FillBlock {
        Block R;
        Block Z;
        Block addressBlock;
        Block inputBlock;

        private FillBlock() {
            this.R = new Block();
            this.Z = new Block();
            this.addressBlock = new Block();
            this.inputBlock = new Block();
        }

        private void applyBlake() {
            for (int i15 = 0; i15 < 8; i15++) {
                int i16 = i15 * 16;
                Argon2BytesGenerator.roundFunction(this.Z, i16, i16 + 1, i16 + 2, i16 + 3, i16 + 4, i16 + 5, i16 + 6, i16 + 7, i16 + 8, i16 + 9, i16 + 10, i16 + 11, i16 + 12, i16 + 13, i16 + 14, i16 + 15);
            }
            for (int i17 = 0; i17 < 8; i17++) {
                int i18 = i17 * 2;
                Argon2BytesGenerator.roundFunction(this.Z, i18, i18 + 1, i18 + 16, i18 + 17, i18 + 32, i18 + 33, i18 + 48, i18 + 49, i18 + 64, i18 + 65, i18 + 80, i18 + 81, i18 + 96, i18 + 97, i18 + 112, i18 + 113);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlock(Block block, Block block2) {
            this.Z.copyBlock(block);
            applyBlake();
            block2.xor(block, this.Z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlockWithXor(Block block, Block block2, Block block3) {
            this.R.xor(block, block2);
            this.Z.copyBlock(this.R);
            applyBlake();
            block3.xorWith(this.R, this.Z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlock(Block block, Block block2, Block block3) {
            this.R.xor(block, block2);
            this.Z.copyBlock(this.R);
            applyBlake();
            block3.xor(this.R, this.Z);
        }
    }

    private static class Position {
        int lane;
        int pass;
        int slice;

        Position() {
        }
    }

    private static void F(long[] jArr, int i15, int i16, int i17, int i18) {
        quarterRound(jArr, i15, i16, i18, 32);
        quarterRound(jArr, i17, i18, i16, 24);
        quarterRound(jArr, i15, i16, i18, 16);
        quarterRound(jArr, i17, i18, i16, 63);
    }

    private static void addByteString(byte[] bArr, Digest digest, byte[] bArr2) {
        if (bArr2 == null) {
            digest.update(ZERO_BYTES, 0, 4);
            return;
        }
        Pack.intToLittleEndian(bArr2.length, bArr, 0);
        digest.update(bArr, 0, 4);
        digest.update(bArr2, 0, bArr2.length);
    }

    private void digest(byte[] bArr, byte[] bArr2, int i15, int i16) {
        Block block = this.memory[this.laneLength - 1];
        for (int i17 = 1; i17 < this.parameters.getLanes(); i17++) {
            int i18 = this.laneLength;
            block.xorWith(this.memory[(i17 * i18) + (i18 - 1)]);
        }
        block.toBytes(bArr);
        hash(bArr, bArr2, i15, i16);
    }

    private void fillFirstBlocks(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[72];
        System.arraycopy(bArr2, 0, bArr3, 0, 64);
        bArr3[64] = 1;
        for (int i15 = 0; i15 < this.parameters.getLanes(); i15++) {
            Pack.intToLittleEndian(i15, bArr2, 68);
            Pack.intToLittleEndian(i15, bArr3, 68);
            hash(bArr2, bArr, 0, 1024);
            this.memory[this.laneLength * i15].fromBytes(bArr);
            hash(bArr3, bArr, 0, 1024);
            this.memory[(this.laneLength * i15) + 1].fromBytes(bArr);
        }
    }

    private void fillMemoryBlocks() {
        FillBlock fillBlock = new FillBlock();
        Position position = new Position();
        for (int i15 = 0; i15 < this.parameters.getIterations(); i15++) {
            position.pass = i15;
            for (int i16 = 0; i16 < 4; i16++) {
                position.slice = i16;
                for (int i17 = 0; i17 < this.parameters.getLanes(); i17++) {
                    position.lane = i17;
                    fillSegment(fillBlock, position);
                }
            }
        }
    }

    private void fillSegment(FillBlock fillBlock, Position position) {
        Block blockClear;
        Block blockClear2;
        FillBlock fillBlock2 = fillBlock;
        Position position2 = position;
        boolean zIsDataIndependentAddressing = isDataIndependentAddressing(position2);
        int startingIndex = getStartingIndex(position2);
        int i15 = (position2.lane * this.laneLength) + (position2.slice * this.segmentLength) + startingIndex;
        int prevOffset = getPrevOffset(i15);
        if (zIsDataIndependentAddressing) {
            blockClear = fillBlock2.addressBlock.clear();
            blockClear2 = fillBlock2.inputBlock.clear();
            initAddressBlocks(fillBlock2, position2, blockClear2, blockClear);
        } else {
            blockClear = null;
            blockClear2 = null;
        }
        boolean zIsWithXor = isWithXor(position2);
        while (true) {
            int i16 = i15;
            if (startingIndex >= this.segmentLength) {
                return;
            }
            Block block = blockClear;
            int i17 = prevOffset;
            Block block2 = blockClear2;
            long pseudoRandom = getPseudoRandom(fillBlock2, startingIndex, block, block2, i17, zIsDataIndependentAddressing);
            boolean z15 = zIsDataIndependentAddressing;
            FillBlock fillBlock3 = fillBlock2;
            int refLane = getRefLane(position2, pseudoRandom);
            int refColumn = getRefColumn(position2, startingIndex, pseudoRandom, refLane == position2.lane);
            Block[] blockArr = this.memory;
            Block block3 = blockArr[i17];
            Block block4 = blockArr[(this.laneLength * refLane) + refColumn];
            Block block5 = blockArr[i16];
            if (zIsWithXor) {
                fillBlock3.fillBlockWithXor(block3, block4, block5);
            } else {
                fillBlock3.fillBlock(block3, block4, block5);
            }
            i15 = i16 + 1;
            startingIndex++;
            position2 = position;
            fillBlock2 = fillBlock3;
            zIsDataIndependentAddressing = z15;
            prevOffset = i16;
            blockClear = block;
            blockClear2 = block2;
        }
    }

    private int getPrevOffset(int i15) {
        int i16 = this.laneLength;
        return i15 % i16 == 0 ? (i15 + i16) - 1 : i15 - 1;
    }

    private long getPseudoRandom(FillBlock fillBlock, int i15, Block block, Block block2, int i16, boolean z15) {
        if (!z15) {
            return this.memory[i16].f149071v[0];
        }
        int i17 = i15 % 128;
        if (i17 == 0) {
            nextAddresses(fillBlock, block2, block);
        }
        return block.f149071v[i17];
    }

    private int getRefColumn(Position position, int i15, long j15, boolean z15) {
        int i16;
        int i17;
        int i18 = position.pass;
        int i19 = 0;
        int i25 = position.slice;
        if (i18 != 0) {
            int i26 = this.segmentLength;
            int i27 = this.laneLength;
            int i28 = ((i25 + 1) * i26) % i27;
            int i29 = i27 - i26;
            if (z15) {
                i16 = (i29 + i15) - 1;
            } else {
                i16 = i29 + (i15 != 0 ? 0 : -1);
            }
            i19 = i28;
            i17 = i16;
        } else if (z15) {
            i17 = ((i25 * this.segmentLength) + i15) - 1;
        } else {
            i17 = (i25 * this.segmentLength) + (i15 != 0 ? 0 : -1);
        }
        long j16 = j15 & 4294967295L;
        return ((int) (((long) i19) + (((long) (i17 - 1)) - ((((long) i17) * ((j16 * j16) >>> 32)) >>> 32)))) % this.laneLength;
    }

    private int getRefLane(Position position, long j15) {
        return (position.pass == 0 && position.slice == 0) ? position.lane : (int) ((j15 >>> 32) % ((long) this.parameters.getLanes()));
    }

    private static int getStartingIndex(Position position) {
        return (position.pass == 0 && position.slice == 0) ? 2 : 0;
    }

    private void hash(byte[] bArr, byte[] bArr2, int i15, int i16) {
        byte[] bArr3 = new byte[4];
        Pack.intToLittleEndian(i16, bArr3, 0);
        if (i16 <= 64) {
            Blake2bDigest blake2bDigest = new Blake2bDigest(i16 * 8);
            blake2bDigest.update(bArr3, 0, 4);
            blake2bDigest.update(bArr, 0, bArr.length);
            blake2bDigest.doFinal(bArr2, i15);
            return;
        }
        Blake2bDigest blake2bDigest2 = new Blake2bDigest(512);
        byte[] bArr4 = new byte[64];
        blake2bDigest2.update(bArr3, 0, 4);
        blake2bDigest2.update(bArr, 0, bArr.length);
        blake2bDigest2.doFinal(bArr4, 0);
        System.arraycopy(bArr4, 0, bArr2, i15, 32);
        int i17 = i15 + 32;
        int i18 = 2;
        int i19 = ((i16 + 31) / 32) - 2;
        while (i18 <= i19) {
            blake2bDigest2.update(bArr4, 0, 64);
            blake2bDigest2.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i17, 32);
            i18++;
            i17 += 32;
        }
        Blake2bDigest blake2bDigest3 = new Blake2bDigest((i16 - (i19 * 32)) * 8);
        blake2bDigest3.update(bArr4, 0, 64);
        blake2bDigest3.doFinal(bArr2, i17);
    }

    private void initAddressBlocks(FillBlock fillBlock, Position position, Block block, Block block2) {
        block.f149071v[0] = intToLong(position.pass);
        block.f149071v[1] = intToLong(position.lane);
        block.f149071v[2] = intToLong(position.slice);
        block.f149071v[3] = intToLong(this.memory.length);
        block.f149071v[4] = intToLong(this.parameters.getIterations());
        block.f149071v[5] = intToLong(this.parameters.getType());
        if (position.pass == 0 && position.slice == 0) {
            nextAddresses(fillBlock, block, block2);
        }
    }

    private void initialize(byte[] bArr, byte[] bArr2, int i15) {
        Blake2bDigest blake2bDigest = new Blake2bDigest(512);
        Pack.intToLittleEndian(new int[]{this.parameters.getLanes(), i15, this.parameters.getMemory(), this.parameters.getIterations(), this.parameters.getVersion(), this.parameters.getType()}, bArr, 0);
        blake2bDigest.update(bArr, 0, 24);
        addByteString(bArr, blake2bDigest, bArr2);
        addByteString(bArr, blake2bDigest, this.parameters.getSalt());
        addByteString(bArr, blake2bDigest, this.parameters.getSecret());
        addByteString(bArr, blake2bDigest, this.parameters.getAdditional());
        byte[] bArr3 = new byte[72];
        blake2bDigest.doFinal(bArr3, 0);
        fillFirstBlocks(bArr, bArr3);
    }

    private long intToLong(int i15) {
        return ((long) i15) & 4294967295L;
    }

    private boolean isDataIndependentAddressing(Position position) {
        return this.parameters.getType() == 1 || (this.parameters.getType() == 2 && position.pass == 0 && position.slice < 2);
    }

    private boolean isWithXor(Position position) {
        return (position.pass == 0 || this.parameters.getVersion() == 16) ? false : true;
    }

    private void nextAddresses(FillBlock fillBlock, Block block, Block block2) {
        long[] jArr = block.f149071v;
        jArr[6] = jArr[6] + 1;
        fillBlock.fillBlock(block, block2);
        fillBlock.fillBlock(block2, block2);
    }

    private static void quarterRound(long[] jArr, int i15, int i16, int i17, int i18) {
        long j15 = jArr[i15];
        long j16 = jArr[i16];
        long j17 = j15 + j16 + ((j15 & 4294967295L) * 2 * (4294967295L & j16));
        long jRotateRight = Longs.rotateRight(jArr[i17] ^ j17, i18);
        jArr[i15] = j17;
        jArr[i17] = jRotateRight;
    }

    private void reset() {
        if (this.memory == null) {
            return;
        }
        int i15 = 0;
        while (true) {
            Block[] blockArr = this.memory;
            if (i15 >= blockArr.length) {
                return;
            }
            Block block = blockArr[i15];
            if (block != null) {
                block.clear();
            }
            i15++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void roundFunction(Block block, int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28, int i29, int i35, int i36, int i37, int i38, int i39, int i45) {
        long[] jArr = block.f149071v;
        F(jArr, i15, i19, i28, i37);
        F(jArr, i16, i25, i29, i38);
        F(jArr, i17, i26, i35, i39);
        F(jArr, i18, i27, i36, i45);
        F(jArr, i15, i25, i35, i45);
        F(jArr, i16, i26, i36, i37);
        F(jArr, i17, i27, i28, i38);
        F(jArr, i18, i19, i29, i39);
    }

    public int generateBytes(byte[] bArr, byte[] bArr2) {
        return generateBytes(bArr, bArr2, 0, bArr2.length);
    }

    public void init(Argon2Parameters argon2Parameters) {
        if (argon2Parameters.getVersion() != 16 && argon2Parameters.getVersion() != 19) {
            throw new UnsupportedOperationException("unknown Argon2 version");
        }
        if (argon2Parameters.getType() != 0 && argon2Parameters.getType() != 1 && argon2Parameters.getType() != 2) {
            throw new UnsupportedOperationException("unknown Argon2 type");
        }
        if (argon2Parameters.getLanes() < 1) {
            throw new IllegalStateException("lanes must be at least 1");
        }
        if (argon2Parameters.getLanes() > MAX_PARALLELISM) {
            throw new IllegalStateException("lanes must be at most 16777215");
        }
        if (argon2Parameters.getIterations() < 1) {
            throw new IllegalStateException("iterations is less than: 1");
        }
        this.parameters = argon2Parameters;
        int iMax = Math.max(argon2Parameters.getMemory(), argon2Parameters.getLanes() * 8) / (argon2Parameters.getLanes() * 4);
        this.segmentLength = iMax;
        this.laneLength = iMax * 4;
        this.memory = new Block[argon2Parameters.getLanes() * this.laneLength];
        int i15 = 0;
        while (true) {
            Block[] blockArr = this.memory;
            if (i15 >= blockArr.length) {
                return;
            }
            blockArr[i15] = new Block();
            i15++;
        }
    }

    public int generateBytes(byte[] bArr, byte[] bArr2, int i15, int i16) {
        if (i16 < 4) {
            throw new IllegalStateException("output length less than 4");
        }
        byte[] bArr3 = new byte[1024];
        initialize(bArr3, bArr, i16);
        fillMemoryBlocks();
        digest(bArr3, bArr2, i15, i16);
        reset();
        return i16;
    }

    public int generateBytes(char[] cArr, byte[] bArr) {
        return generateBytes(this.parameters.getCharToByteConverter().convert(cArr), bArr);
    }

    public int generateBytes(char[] cArr, byte[] bArr, int i15, int i16) {
        return generateBytes(this.parameters.getCharToByteConverter().convert(cArr), bArr, i15, i16);
    }
}
