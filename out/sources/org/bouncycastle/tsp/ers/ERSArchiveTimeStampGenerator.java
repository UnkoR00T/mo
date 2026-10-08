package org.bouncycastle.tsp.ers;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.tsp.ArchiveTimeStamp;
import org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence;
import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.asn1.tsp.TSTInfo;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TimeStampRequest;
import org.bouncycastle.tsp.TimeStampRequestGenerator;
import org.bouncycastle.tsp.TimeStampResponse;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ERSArchiveTimeStampGenerator {
    private final DigestCalculator digCalc;
    private byte[] previousChainHash;
    private List<ERSData> dataObjects = new ArrayList();
    private ERSRootNodeCalculator rootNodeCalculator = new BinaryTreeRootCalculator();

    public ERSArchiveTimeStampGenerator(DigestCalculator digestCalculator) {
        this.digCalc = digestCalculator;
    }

    private IndexedPartialHashtree[] getPartialHashtrees() {
        List<IndexedHash> listBuildIndexedHashList = ERSUtil.buildIndexedHashList(this.digCalc, this.dataObjects, this.previousChainHash);
        IndexedPartialHashtree[] indexedPartialHashtreeArr = new IndexedPartialHashtree[listBuildIndexedHashList.size()];
        HashSet hashSet = new HashSet();
        for (int i15 = 0; i15 != this.dataObjects.size(); i15++) {
            if (this.dataObjects.get(i15) instanceof ERSDataGroup) {
                hashSet.add((ERSDataGroup) this.dataObjects.get(i15));
            }
        }
        for (int i16 = 0; i16 != listBuildIndexedHashList.size(); i16++) {
            byte[] bArr = listBuildIndexedHashList.get(i16).digest;
            ERSData eRSData = this.dataObjects.get(listBuildIndexedHashList.get(i16).order);
            if (eRSData instanceof ERSDataGroup) {
                List<byte[]> hashes = ((ERSDataGroup) eRSData).getHashes(this.digCalc, this.previousChainHash);
                indexedPartialHashtreeArr[i16] = new IndexedPartialHashtree(listBuildIndexedHashList.get(i16).order, (byte[][]) hashes.toArray(new byte[hashes.size()][]));
            } else {
                indexedPartialHashtreeArr[i16] = new IndexedPartialHashtree(listBuildIndexedHashList.get(i16).order, bArr);
            }
        }
        return indexedPartialHashtreeArr;
    }

    public void addAllData(List<ERSData> list) {
        this.dataObjects.addAll(list);
    }

    public void addData(ERSData eRSData) {
        this.dataObjects.add(eRSData);
    }

    void addPreviousChains(ArchiveTimeStampSequence archiveTimeStampSequence) throws IOException {
        OutputStream outputStream = this.digCalc.getOutputStream();
        outputStream.write(archiveTimeStampSequence.getEncoded(ASN1Encoding.DER));
        outputStream.close();
        this.previousChainHash = this.digCalc.getDigest();
    }

    public ERSArchiveTimeStamp generateArchiveTimeStamp(TimeStampResponse timeStampResponse) throws ERSException, TSPException {
        IndexedPartialHashtree[] partialHashtrees = getPartialHashtrees();
        if (partialHashtrees.length != 1) {
            throw new ERSException("multiple reduced hash trees found");
        }
        byte[] bArrComputeRootHash = this.rootNodeCalculator.computeRootHash(this.digCalc, partialHashtrees);
        if (timeStampResponse.getStatus() != 0) {
            throw new TSPException("TSP response error status: " + timeStampResponse.getStatusString());
        }
        TSTInfo aSN1Structure = timeStampResponse.getTimeStampToken().getTimeStampInfo().toASN1Structure();
        if (!aSN1Structure.getMessageImprint().getHashAlgorithm().equals(this.digCalc.getAlgorithmIdentifier())) {
            throw new ERSException("time stamp imprint for wrong algorithm");
        }
        if (Arrays.areEqual(aSN1Structure.getMessageImprint().getHashedMessage(), bArrComputeRootHash)) {
            return partialHashtrees[0].getValueCount() == 1 ? new ERSArchiveTimeStamp(new ArchiveTimeStamp(null, null, timeStampResponse.getTimeStampToken().toCMSSignedData().toASN1Structure()), this.digCalc) : new ERSArchiveTimeStamp(new ArchiveTimeStamp(this.digCalc.getAlgorithmIdentifier(), partialHashtrees, timeStampResponse.getTimeStampToken().toCMSSignedData().toASN1Structure()), this.digCalc);
        }
        throw new ERSException("time stamp imprint for wrong root hash");
    }

    public List<ERSArchiveTimeStamp> generateArchiveTimeStamps(TimeStampResponse timeStampResponse) throws ERSException, TSPException {
        IndexedPartialHashtree[] partialHashtrees = getPartialHashtrees();
        byte[] bArrComputeRootHash = this.rootNodeCalculator.computeRootHash(this.digCalc, partialHashtrees);
        if (timeStampResponse.getStatus() != 0) {
            throw new TSPException("TSP response error status: " + timeStampResponse.getStatusString());
        }
        TSTInfo aSN1Structure = timeStampResponse.getTimeStampToken().getTimeStampInfo().toASN1Structure();
        if (!aSN1Structure.getMessageImprint().getHashAlgorithm().equals(this.digCalc.getAlgorithmIdentifier())) {
            throw new ERSException("time stamp imprint for wrong algorithm");
        }
        if (!Arrays.areEqual(aSN1Structure.getMessageImprint().getHashedMessage(), bArrComputeRootHash)) {
            throw new ERSException("time stamp imprint for wrong root hash");
        }
        ContentInfo aSN1Structure2 = timeStampResponse.getTimeStampToken().toCMSSignedData().toASN1Structure();
        ArrayList arrayList = new ArrayList();
        if (partialHashtrees.length == 1 && partialHashtrees[0].getValueCount() == 1) {
            arrayList.add(new ERSArchiveTimeStamp(new ArchiveTimeStamp(null, null, aSN1Structure2), this.digCalc));
            return arrayList;
        }
        ERSArchiveTimeStamp[] eRSArchiveTimeStampArr = new ERSArchiveTimeStamp[partialHashtrees.length];
        for (int i15 = 0; i15 != partialHashtrees.length; i15++) {
            eRSArchiveTimeStampArr[partialHashtrees[i15].order] = new ERSArchiveTimeStamp(new ArchiveTimeStamp(this.digCalc.getAlgorithmIdentifier(), this.rootNodeCalculator.computePathToRoot(this.digCalc, partialHashtrees[i15], i15), aSN1Structure2), this.digCalc);
        }
        for (int i16 = 0; i16 != partialHashtrees.length; i16++) {
            arrayList.add(eRSArchiveTimeStampArr[i16]);
        }
        return arrayList;
    }

    public TimeStampRequest generateTimeStampRequest(TimeStampRequestGenerator timeStampRequestGenerator) {
        return timeStampRequestGenerator.generate(this.digCalc.getAlgorithmIdentifier(), this.rootNodeCalculator.computeRootHash(this.digCalc, getPartialHashtrees()));
    }

    private static class IndexedPartialHashtree extends PartialHashtree {
        final int order;

        private IndexedPartialHashtree(int i15, byte[] bArr) {
            super(bArr);
            this.order = i15;
        }

        private IndexedPartialHashtree(int i15, byte[][] bArr) {
            super(bArr);
            this.order = i15;
        }
    }

    public TimeStampRequest generateTimeStampRequest(TimeStampRequestGenerator timeStampRequestGenerator, BigInteger bigInteger) {
        return timeStampRequestGenerator.generate(this.digCalc.getAlgorithmIdentifier(), this.rootNodeCalculator.computeRootHash(this.digCalc, getPartialHashtrees()), bigInteger);
    }
}
