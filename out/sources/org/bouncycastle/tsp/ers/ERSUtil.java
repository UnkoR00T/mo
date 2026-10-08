package org.bouncycastle.tsp.ers;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes5.dex */
class ERSUtil {
    private static final Comparator<byte[]> hashComp = new ByteArrayComparator();

    private ERSUtil() {
    }

    static List<byte[]> buildHashList(DigestCalculator digestCalculator, List<ERSData> list, byte[] bArr) {
        SortedHashList sortedHashList = new SortedHashList();
        for (int i15 = 0; i15 != list.size(); i15++) {
            sortedHashList.add(list.get(i15).getHash(digestCalculator, bArr));
        }
        return sortedHashList.toList();
    }

    static List<IndexedHash> buildIndexedHashList(DigestCalculator digestCalculator, List<ERSData> list, byte[] bArr) {
        SortedIndexedHashList sortedIndexedHashList = new SortedIndexedHashList();
        for (int i15 = 0; i15 != list.size(); i15++) {
            sortedIndexedHashList.add(new IndexedHash(i15, list.get(i15).getHash(digestCalculator, bArr)));
        }
        return sortedIndexedHashList.toList();
    }

    static byte[] calculateBranchHash(DigestCalculator digestCalculator, byte[] bArr, byte[] bArr2) {
        return hashComp.compare(bArr, bArr2) <= 0 ? calculateDigest(digestCalculator, bArr, bArr2) : calculateDigest(digestCalculator, bArr2, bArr);
    }

    static byte[] calculateDigest(DigestCalculator digestCalculator, InputStream inputStream) {
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            Streams.pipeAll(inputStream, outputStream);
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (IOException e15) {
            throw ExpUtil.createIllegalState("unable to calculate hash: " + e15.getMessage(), e15);
        }
    }

    static byte[] computeNodeHash(DigestCalculator digestCalculator, PartialHashtree partialHashtree) {
        byte[][] values = partialHashtree.getValues();
        return values.length > 1 ? calculateDigest(digestCalculator, buildIndexedHashList(values).iterator()) : values[0];
    }

    static byte[] concatPreviousHashes(DigestCalculator digestCalculator, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(bArr2);
            outputStream.write(bArr);
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (IOException unused) {
            throw new IllegalStateException("unable to hash data");
        }
    }

    static List<byte[]> buildIndexedHashList(byte[][] bArr) {
        SortedHashList sortedHashList = new SortedHashList();
        for (int i15 = 0; i15 != bArr.length; i15++) {
            sortedHashList.add(bArr[i15]);
        }
        return sortedHashList.toList();
    }

    static byte[] calculateBranchHash(DigestCalculator digestCalculator, byte[][] bArr) {
        return bArr.length == 2 ? calculateBranchHash(digestCalculator, bArr[0], bArr[1]) : calculateDigest(digestCalculator, buildIndexedHashList(bArr).iterator());
    }

    static byte[] calculateDigest(DigestCalculator digestCalculator, Iterator<byte[]> it) {
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            while (it.hasNext()) {
                outputStream.write(it.next());
            }
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (IOException e15) {
            throw ExpUtil.createIllegalState("unable to calculate hash: " + e15.getMessage(), e15);
        }
    }

    static byte[] calculateDigest(DigestCalculator digestCalculator, byte[] bArr) {
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (IOException e15) {
            throw ExpUtil.createIllegalState("unable to calculate hash: " + e15.getMessage(), e15);
        }
    }

    static byte[] calculateDigest(DigestCalculator digestCalculator, byte[] bArr, byte[] bArr2) {
        try {
            OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(bArr);
            outputStream.write(bArr2);
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (IOException e15) {
            throw ExpUtil.createIllegalState("unable to calculate hash: " + e15.getMessage(), e15);
        }
    }
}
