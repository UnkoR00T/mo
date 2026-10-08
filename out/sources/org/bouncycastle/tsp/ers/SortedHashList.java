package org.bouncycastle.tsp.ers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class SortedHashList {
    private static final Comparator<byte[]> hashComp = new ByteArrayComparator();
    private final LinkedList<byte[]> baseList = new LinkedList<>();

    public void add(byte[] bArr) {
        if (this.baseList.size() == 0) {
            this.baseList.addFirst(bArr);
            return;
        }
        if (hashComp.compare(bArr, this.baseList.get(0)) < 0) {
            this.baseList.addFirst(bArr);
            return;
        }
        int i15 = 1;
        while (i15 < this.baseList.size() && hashComp.compare(this.baseList.get(i15), bArr) <= 0) {
            i15++;
        }
        if (i15 == this.baseList.size()) {
            this.baseList.add(bArr);
        } else {
            this.baseList.add(i15, bArr);
        }
    }

    public byte[] getFirst() {
        return this.baseList.getFirst();
    }

    public int size() {
        return this.baseList.size();
    }

    public List<byte[]> toList() {
        return new ArrayList(this.baseList);
    }
}
