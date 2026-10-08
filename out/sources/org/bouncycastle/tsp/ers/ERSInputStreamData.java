package org.bouncycastle.tsp.ers;

import io.sentry.instrumentation.file.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes5.dex */
public class ERSInputStreamData extends ERSCachingData {
    private final byte[] contentBytes;
    private final File contentFile;

    public ERSInputStreamData(File file) throws FileNotFoundException {
        if (file.isDirectory()) {
            throw new IllegalArgumentException("directory not allowed");
        }
        if (file.exists()) {
            this.contentBytes = null;
            this.contentFile = file;
        } else {
            throw new FileNotFoundException(file + " not found");
        }
    }

    @Override // org.bouncycastle.tsp.ers.ERSCachingData
    protected byte[] calculateHash(DigestCalculator digestCalculator, byte[] bArr) {
        byte[] bArrCalculateDigest;
        byte[] bArr2 = this.contentBytes;
        if (bArr2 != null) {
            bArrCalculateDigest = ERSUtil.calculateDigest(digestCalculator, bArr2);
        } else {
            try {
                File file = this.contentFile;
                FileInputStream fileInputStreamA = h.b.a(new FileInputStream(file), file);
                byte[] bArrCalculateDigest2 = ERSUtil.calculateDigest(digestCalculator, fileInputStreamA);
                fileInputStreamA.close();
                bArrCalculateDigest = bArrCalculateDigest2;
            } catch (IOException e15) {
                throw ExpUtil.createIllegalState("unable to open content: " + e15.getMessage(), e15);
            }
        }
        return bArr != null ? ERSUtil.concatPreviousHashes(digestCalculator, bArr, bArrCalculateDigest) : bArrCalculateDigest;
    }

    public ERSInputStreamData(InputStream inputStream) {
        try {
            this.contentBytes = Streams.readAll(inputStream);
            this.contentFile = null;
        } catch (IOException e15) {
            throw ExpUtil.createIllegalState("unable to open content: " + e15.getMessage(), e15);
        }
    }
}
