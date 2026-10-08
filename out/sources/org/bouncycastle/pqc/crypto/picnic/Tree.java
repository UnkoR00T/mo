package org.bouncycastle.pqc.crypto.picnic;

import java.lang.reflect.Array;
import java.util.logging.Logger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
class Tree {
    private static final Logger LOG = Logger.getLogger(Tree.class.getName());
    private static final int MAX_SEED_SIZE_BYTES = 32;
    private int dataSize;
    private int depth;
    private PicnicEngine engine;
    private boolean[] exists;
    private boolean[] haveNode;
    byte[][] nodes;
    private int numLeaves;
    private int numNodes;

    public Tree(PicnicEngine picnicEngine, int i15, int i16) {
        int i17;
        this.engine = picnicEngine;
        int iCeil_log2 = Utils.ceil_log2(i15);
        int i18 = iCeil_log2 + 1;
        this.depth = i18;
        int i19 = ((1 << i18) - 1) - ((1 << iCeil_log2) - i15);
        this.numNodes = i19;
        this.numLeaves = i15;
        this.dataSize = i16;
        this.nodes = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i19, i16);
        int i25 = 0;
        while (true) {
            i17 = this.numNodes;
            if (i25 >= i17) {
                break;
            }
            this.nodes[i25] = new byte[i16];
            i25++;
        }
        this.haveNode = new boolean[i17];
        boolean[] zArr = new boolean[i17];
        this.exists = zArr;
        Arrays.fill(zArr, i17 - this.numLeaves, i17, true);
        for (int i26 = this.numNodes - this.numLeaves; i26 > 0; i26--) {
            int i27 = i26 * 2;
            if (exists(i27 + 1) || exists(i27 + 2)) {
                this.exists[i26] = true;
            }
        }
        this.exists[0] = true;
    }

    private void computeParentHash(int i15, byte[] bArr) {
        if (exists(i15)) {
            int parent = getParent(i15);
            boolean[] zArr = this.haveNode;
            if (zArr[parent]) {
                return;
            }
            int i16 = parent * 2;
            int i17 = i16 + 1;
            if (zArr[i17]) {
                int i18 = i16 + 2;
                if (!exists(i18) || this.haveNode[i18]) {
                    this.engine.digest.update((byte) 3);
                    PicnicEngine picnicEngine = this.engine;
                    picnicEngine.digest.update(this.nodes[i17], 0, picnicEngine.digestSizeBytes);
                    if (hasRightChild(parent)) {
                        PicnicEngine picnicEngine2 = this.engine;
                        picnicEngine2.digest.update(this.nodes[i18], 0, picnicEngine2.digestSizeBytes);
                    }
                    this.engine.digest.update(bArr, 0, 32);
                    this.engine.digest.update(Pack.intToLittleEndian(parent), 0, 2);
                    PicnicEngine picnicEngine3 = this.engine;
                    picnicEngine3.digest.doFinal(this.nodes[parent], 0, picnicEngine3.digestSizeBytes);
                    this.haveNode[parent] = true;
                }
            }
        }
    }

    private boolean contains(int[] iArr, int i15, int i16) {
        for (int i17 = 0; i17 < i15; i17++) {
            if (iArr[i17] == i16) {
                return true;
            }
        }
        return false;
    }

    private boolean exists(int i15) {
        if (i15 >= this.numNodes) {
            return false;
        }
        return this.exists[i15];
    }

    private void expandSeeds(byte[] bArr, int i15) {
        byte[] bArr2;
        int i16;
        byte[] bArr3 = new byte[64];
        int parent = getParent(this.numNodes - 1);
        int i17 = 0;
        while (i17 <= parent) {
            if (this.haveNode[i17]) {
                bArr2 = bArr;
                i16 = i15;
                hashSeed(bArr3, this.nodes[i17], bArr2, (byte) 1, i16, i17);
                int i18 = i17 * 2;
                int i19 = i18 + 1;
                if (!this.haveNode[i19]) {
                    System.arraycopy(bArr3, 0, this.nodes[i19], 0, this.engine.seedSizeBytes);
                    this.haveNode[i19] = true;
                }
                int i25 = i18 + 2;
                if (exists(i25) && !this.haveNode[i25]) {
                    int i26 = this.engine.seedSizeBytes;
                    System.arraycopy(bArr3, i26, this.nodes[i25], 0, i26);
                    this.haveNode[i25] = true;
                }
            } else {
                bArr2 = bArr;
                i16 = i15;
            }
            i17++;
            bArr = bArr2;
            i15 = i16;
        }
    }

    private int getParent(int i15) {
        return (isLeftChild(i15) ? i15 - 1 : i15 - 2) / 2;
    }

    private int[] getRevealedMerkleNodes(int[] iArr, int i15, int[] iArr2) {
        int i16 = this.numNodes;
        int i17 = i16 - this.numLeaves;
        boolean[] zArr = new boolean[i16];
        for (int i18 = 0; i18 < i15; i18++) {
            zArr[iArr[i18] + i17] = true;
        }
        for (int parent = getParent(this.numNodes - 1); parent > 0; parent--) {
            if (exists(parent)) {
                int i19 = parent * 2;
                int i25 = i19 + 2;
                int i26 = i19 + 1;
                if (exists(i25)) {
                    if (zArr[i26] && zArr[i25]) {
                        zArr[parent] = true;
                    }
                } else if (zArr[i26]) {
                    zArr[parent] = true;
                }
            }
        }
        int[] iArr3 = new int[this.numLeaves];
        int i27 = 0;
        for (int i28 = 0; i28 < i15; i28++) {
            int parent2 = iArr[i28] + i17;
            do {
                if (!zArr[getParent(parent2)]) {
                    if (!contains(iArr3, i27, parent2)) {
                        iArr3[i27] = parent2;
                        i27++;
                        break;
                    }
                    break;
                }
                parent2 = getParent(parent2);
            } while (parent2 != 0);
        }
        iArr2[0] = i27;
        return iArr3;
    }

    private int[] getRevealedNodes(int[] iArr, int i15, int[] iArr2) {
        int i16 = this.depth - 1;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i16, i15);
        for (int i17 = 0; i17 < i15; i17++) {
            int parent = iArr[i17] + (this.numNodes - this.numLeaves);
            iArr3[0][i17] = parent;
            int i18 = 1;
            while (true) {
                parent = getParent(parent);
                if (parent != 0) {
                    iArr3[i18][i17] = parent;
                    i18++;
                }
            }
        }
        int[] iArr4 = new int[this.numLeaves];
        int i19 = 0;
        for (int i25 = 0; i25 < i16; i25++) {
            for (int i26 = 0; i26 < i15; i26++) {
                if (hasSibling(iArr3[i25][i26])) {
                    int sibling = getSibling(iArr3[i25][i26]);
                    if (!contains(iArr3[i25], i15, sibling)) {
                        while (!hasRightChild(sibling) && !isLeafNode(sibling)) {
                            sibling = (sibling * 2) + 1;
                        }
                        if (!contains(iArr4, i19, sibling)) {
                            iArr4[i19] = sibling;
                            i19++;
                        }
                    }
                }
            }
        }
        iArr2[0] = i19;
        return iArr4;
    }

    private int getSibling(int i15) {
        if (!isLeftChild(i15)) {
            return i15 - 1;
        }
        int i16 = i15 + 1;
        if (i16 < this.numNodes) {
            return i16;
        }
        LOG.fine("getSibling: request for node with not sibling");
        return 0;
    }

    private boolean hasRightChild(int i15) {
        return (i15 * 2) + 2 < this.numNodes && exists(i15);
    }

    private boolean hasSibling(int i15) {
        if (exists(i15)) {
            return !isLeftChild(i15) || exists(i15 + 1);
        }
        return false;
    }

    private void hashSeed(byte[] bArr, byte[] bArr2, byte[] bArr3, byte b15, int i15, int i16) {
        this.engine.digest.update(b15);
        PicnicEngine picnicEngine = this.engine;
        picnicEngine.digest.update(bArr2, 0, picnicEngine.seedSizeBytes);
        this.engine.digest.update(bArr3, 0, 32);
        this.engine.digest.update(Pack.shortToLittleEndian((short) (i15 & 65535)), 0, 2);
        this.engine.digest.update(Pack.shortToLittleEndian((short) (65535 & i16)), 0, 2);
        PicnicEngine picnicEngine2 = this.engine;
        picnicEngine2.digest.doFinal(bArr, 0, picnicEngine2.seedSizeBytes * 2);
    }

    private boolean isLeafNode(int i15) {
        return (i15 * 2) + 1 >= this.numNodes;
    }

    private boolean isLeftChild(int i15) {
        return i15 % 2 == 1;
    }

    protected int addMerkleNodes(int[] iArr, int i15, byte[] bArr, int i16) {
        int[] iArr2 = {0};
        int[] revealedMerkleNodes = getRevealedMerkleNodes(iArr, i15, iArr2);
        for (int i17 = 0; i17 < iArr2[0]; i17++) {
            int i18 = this.dataSize;
            i16 -= i18;
            if (i16 < 0) {
                return -1;
            }
            System.arraycopy(bArr, i17 * i18, this.nodes[revealedMerkleNodes[i17]], 0, i18);
            this.haveNode[revealedMerkleNodes[i17]] = true;
        }
        return i16 != 0 ? -1 : 0;
    }

    protected void buildMerkleTree(byte[][] bArr, byte[] bArr2) {
        int i15 = this.numNodes - this.numLeaves;
        for (int i16 = 0; i16 < this.numLeaves; i16++) {
            byte[] bArr3 = bArr[i16];
            if (bArr3 != null) {
                int i17 = i15 + i16;
                System.arraycopy(bArr3, 0, this.nodes[i17], 0, this.dataSize);
                this.haveNode[i17] = true;
            }
        }
        for (int i18 = this.numNodes; i18 > 0; i18--) {
            computeParentHash(i18, bArr2);
        }
    }

    protected void generateSeeds(byte[] bArr, byte[] bArr2, int i15) {
        this.nodes[0] = bArr;
        this.haveNode[0] = true;
        expandSeeds(bArr2, i15);
    }

    protected byte[] getLeaf(int i15) {
        return this.nodes[(this.numNodes - this.numLeaves) + i15];
    }

    protected byte[][] getLeaves() {
        return this.nodes;
    }

    protected int getLeavesOffset() {
        return this.numNodes - this.numLeaves;
    }

    boolean hasLeftChild(Tree tree, int i15) {
        return (i15 * 2) + 1 < this.numNodes;
    }

    protected byte[] openMerkleTree(int[] iArr, int i15, int[] iArr2) {
        int[] iArr3 = new int[1];
        int[] revealedMerkleNodes = getRevealedMerkleNodes(iArr, i15, iArr3);
        int i16 = iArr3[0] * this.dataSize;
        iArr2[0] = i16;
        byte[] bArr = new byte[i16];
        for (int i17 = 0; i17 < iArr3[0]; i17++) {
            byte[] bArr2 = this.nodes[revealedMerkleNodes[i17]];
            int i18 = this.dataSize;
            System.arraycopy(bArr2, 0, bArr, i17 * i18, i18);
        }
        return bArr;
    }

    protected int openMerkleTreeSize(int[] iArr, int i15) {
        int[] iArr2 = new int[1];
        getRevealedMerkleNodes(iArr, i15, iArr2);
        return iArr2[0] * this.engine.digestSizeBytes;
    }

    protected int reconstructSeeds(int[] iArr, int i15, byte[] bArr, int i16, byte[] bArr2, int i17) {
        int[] iArr2 = {0};
        int[] revealedNodes = getRevealedNodes(iArr, i15, iArr2);
        for (int i18 = 0; i18 < iArr2[0]; i18++) {
            int i19 = this.engine.seedSizeBytes;
            i16 -= i19;
            if (i16 < 0) {
                return -1;
            }
            System.arraycopy(bArr, i18 * i19, this.nodes[revealedNodes[i18]], 0, i19);
            this.haveNode[revealedNodes[i18]] = true;
        }
        expandSeeds(bArr2, i17);
        return 0;
    }

    protected int revealSeeds(int[] iArr, int i15, byte[] bArr, int i16) {
        int[] iArr2 = {0};
        int[] revealedNodes = getRevealedNodes(iArr, i15, iArr2);
        for (int i17 = 0; i17 < iArr2[0]; i17++) {
            int i18 = this.engine.seedSizeBytes;
            i16 -= i18;
            if (i16 < 0) {
                LOG.fine("Insufficient sized buffer provided to revealSeeds");
                return 0;
            }
            System.arraycopy(this.nodes[revealedNodes[i17]], 0, bArr, i17 * i18, i18);
        }
        return bArr.length - i16;
    }

    protected int revealSeedsSize(int[] iArr, int i15) {
        int[] iArr2 = {0};
        getRevealedNodes(iArr, i15, iArr2);
        return iArr2[0] * this.engine.seedSizeBytes;
    }

    protected int verifyMerkleTree(byte[][] bArr, byte[] bArr2) {
        int i15 = this.numNodes - this.numLeaves;
        for (int i16 = 0; i16 < this.numLeaves; i16++) {
            byte[] bArr3 = bArr[i16];
            if (bArr3 != null) {
                int i17 = i15 + i16;
                if (this.haveNode[i17]) {
                    return -1;
                }
                if (bArr3 != null) {
                    System.arraycopy(bArr3, 0, this.nodes[i17], 0, this.dataSize);
                    this.haveNode[i17] = true;
                }
            }
        }
        for (int i18 = this.numNodes; i18 > 0; i18--) {
            computeParentHash(i18, bArr2);
        }
        return !this.haveNode[0] ? -1 : 0;
    }
}
