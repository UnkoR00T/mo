package org.bouncycastle.tsp.ers;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class BinaryTreeRootCalculator implements ERSRootNodeCalculator {
    private List<List<byte[]>> tree;

    @Override // org.bouncycastle.tsp.ers.ERSRootNodeCalculator
    public PartialHashtree[] computePathToRoot(DigestCalculator digestCalculator, PartialHashtree partialHashtree, int i15) {
        List<byte[]> list;
        int i16;
        ArrayList arrayList = new ArrayList();
        byte[] bArrComputeNodeHash = ERSUtil.computeNodeHash(digestCalculator, partialHashtree);
        arrayList.add(partialHashtree);
        int i17 = 0;
        while (i17 < this.tree.size() - 1) {
            if (i15 == this.tree.get(i17).size() - 1) {
                while (true) {
                    int i18 = i17 + 1;
                    List<byte[]> list2 = this.tree.get(i18);
                    if (!Arrays.areEqual(bArrComputeNodeHash, list2.get(list2.size() - 1))) {
                        break;
                    }
                    i15 = this.tree.get(i18).size() - 1;
                    i17 = i18;
                }
            }
            if ((i15 & 1) == 0) {
                list = this.tree.get(i17);
                i16 = i15 + 1;
            } else {
                list = this.tree.get(i17);
                i16 = i15 - 1;
            }
            byte[] bArr = list.get(i16);
            arrayList.add(new PartialHashtree(bArr));
            bArrComputeNodeHash = ERSUtil.calculateBranchHash(digestCalculator, bArrComputeNodeHash, bArr);
            i15 /= 2;
            i17++;
        }
        return (PartialHashtree[]) arrayList.toArray(new PartialHashtree[0]);
    }

    @Override // org.bouncycastle.tsp.ers.ERSRootNodeCalculator
    public byte[] computeRootHash(DigestCalculator digestCalculator, PartialHashtree[] partialHashtreeArr) {
        ArrayList arrayList;
        SortedHashList sortedHashList = new SortedHashList();
        for (PartialHashtree partialHashtree : partialHashtreeArr) {
            sortedHashList.add(ERSUtil.computeNodeHash(digestCalculator, partialHashtree));
        }
        List<byte[]> list = sortedHashList.toList();
        ArrayList arrayList2 = new ArrayList();
        this.tree = arrayList2;
        arrayList2.add(list);
        if (list.size() > 1) {
            while (true) {
                arrayList = new ArrayList((list.size() / 2) + 1);
                for (int i15 = 0; i15 <= list.size() - 2; i15 += 2) {
                    arrayList.add(ERSUtil.calculateBranchHash(digestCalculator, list.get(i15), list.get(i15 + 1)));
                }
                if (list.size() % 2 == 1) {
                    arrayList.add(list.get(list.size() - 1));
                }
                this.tree.add(arrayList);
                if (arrayList.size() <= 1) {
                    break;
                }
                list = arrayList;
            }
            list = arrayList;
        }
        return list.get(0);
    }

    @Override // org.bouncycastle.tsp.ers.ERSRootNodeCalculator
    public byte[] recoverRootHash(DigestCalculator digestCalculator, PartialHashtree[] partialHashtreeArr) {
        byte[] bArrComputeNodeHash = ERSUtil.computeNodeHash(digestCalculator, partialHashtreeArr[0]);
        for (int i15 = 1; i15 < partialHashtreeArr.length; i15++) {
            bArrComputeNodeHash = ERSUtil.calculateBranchHash(digestCalculator, bArrComputeNodeHash, ERSUtil.computeNodeHash(digestCalculator, partialHashtreeArr[i15]));
        }
        return bArrComputeNodeHash;
    }
}
