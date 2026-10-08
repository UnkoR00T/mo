package org.bouncycastle.tsp.ers;

import io.sentry.instrumentation.file.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.bouncycastle.operator.DigestCalculator;

/* JADX INFO: loaded from: classes5.dex */
public class ERSFileData extends ERSCachingData {
    private final File content;

    public ERSFileData(File file) throws FileNotFoundException {
        if (file.isDirectory()) {
            throw new IllegalArgumentException("directory not allowed as ERSFileData");
        }
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath() + " does not exist");
        }
        if (file.canRead()) {
            this.content = file;
            return;
        }
        throw new FileNotFoundException(file.getAbsolutePath() + " is not readable");
    }

    @Override // org.bouncycastle.tsp.ers.ERSCachingData
    protected byte[] calculateHash(DigestCalculator digestCalculator, byte[] bArr) {
        try {
            File file = this.content;
            FileInputStream fileInputStreamA = h.b.a(new FileInputStream(file), file);
            byte[] bArrCalculateDigest = ERSUtil.calculateDigest(digestCalculator, fileInputStreamA);
            fileInputStreamA.close();
            return bArr != null ? ERSUtil.concatPreviousHashes(digestCalculator, bArr, bArrCalculateDigest) : bArrCalculateDigest;
        } catch (IOException unused) {
            throw new IllegalStateException("unable to process " + this.content.getAbsolutePath());
        }
    }
}
