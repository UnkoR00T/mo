package org.bouncycastle.cms;

import io.sentry.instrumentation.file.h;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes5.dex */
public class CMSProcessableFile implements CMSTypedData, CMSReadable {
    private static final int DEFAULT_BUF_SIZE = 32768;
    private final int bufSize;
    private final File file;
    private final ASN1ObjectIdentifier type;

    public CMSProcessableFile(File file) {
        this(file, 32768);
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public Object getContent() {
        return this.file;
    }

    @Override // org.bouncycastle.cms.CMSTypedData
    public ASN1ObjectIdentifier getContentType() {
        return this.type;
    }

    @Override // org.bouncycastle.cms.CMSReadable
    public InputStream getInputStream() {
        File file = this.file;
        return new BufferedInputStream(h.b.a(new FileInputStream(file), file), this.bufSize);
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public void write(OutputStream outputStream) throws IOException {
        File file = this.file;
        FileInputStream fileInputStreamA = h.b.a(new FileInputStream(file), file);
        Streams.pipeAll(fileInputStreamA, outputStream, this.bufSize);
        fileInputStreamA.close();
    }

    public CMSProcessableFile(File file, int i15) {
        this(CMSObjectIdentifiers.data, file, i15);
    }

    public CMSProcessableFile(ASN1ObjectIdentifier aSN1ObjectIdentifier, File file, int i15) {
        this.type = aSN1ObjectIdentifier;
        this.file = file;
        this.bufSize = i15;
    }
}
