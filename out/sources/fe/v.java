package fe;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class v implements zd.d<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.b f61709a;

    public v(ce.b bVar) {
        this.f61709a = bVar;
    }

    @Override // zd.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, File file, zd.h hVar) {
        byte[] bArr = (byte[]) this.f61709a.c(PKIFailureInfo.notAuthorized, byte[].class);
        FileOutputStream fileOutputStreamA = null;
        try {
            fileOutputStreamA = io.sentry.instrumentation.file.l.b.a(new FileOutputStream(file), file);
            while (true) {
                int i15 = inputStream.read(bArr);
                if (i15 == -1) {
                    break;
                }
                fileOutputStreamA.write(bArr, 0, i15);
            }
            fileOutputStreamA.close();
            try {
                fileOutputStreamA.close();
            } catch (IOException unused) {
            }
            this.f61709a.put(bArr);
            return true;
        } catch (IOException unused2) {
            if (fileOutputStreamA != null) {
                try {
                    fileOutputStreamA.close();
                } catch (IOException unused3) {
                }
            }
            this.f61709a.put(bArr);
            return false;
        } catch (Throwable th4) {
            if (fileOutputStreamA != null) {
                try {
                    fileOutputStreamA.close();
                } catch (IOException unused4) {
                }
            }
            this.f61709a.put(bArr);
            throw th4;
        }
    }
}
