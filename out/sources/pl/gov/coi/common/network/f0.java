package pl.gov.coi.common.network;

import java.io.File;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpl/gov/coi/common/network/f0;", "Lpl/gov/coi/common/network/e0;", "<init>", "()V", "", "data", "", "fileName", "fileExtension", "mimeType", "multipartName", "Lfv/y$c;", "d", "([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lfv/y$c;", "Ljava/io/File;", "file", "b", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lfv/y$c;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 implements e0 {
    @Override // pl.gov.coi.common.network.e0
    public fv.y.c b(File file, String fileName, String fileExtension, String mimeType, String multipartName) {
        fv.y.c.Companion companion = fv.y.c.INSTANCE;
        if (multipartName == null) {
            multipartName = "file";
        }
        if (fileExtension != null) {
            fileName = fileName + '.' + fileExtension;
        }
        fv.c0.Companion companion2 = fv.c0.INSTANCE;
        fv.x.Companion companion3 = fv.x.INSTANCE;
        if (mimeType == null) {
            mimeType = "application/octet-stream";
        }
        return companion.b(multipartName, fileName, companion2.e(file, companion3.a(mimeType)));
    }

    @Override // pl.gov.coi.common.network.e0
    public fv.y.c d(byte[] data, String fileName, String fileExtension, String mimeType, String multipartName) {
        fv.y.c.Companion companion = fv.y.c.INSTANCE;
        if (multipartName == null) {
            multipartName = "file";
        }
        if (fileExtension != null) {
            fileName = fileName + '.' + fileExtension;
        }
        fv.c0.Companion companion2 = fv.c0.INSTANCE;
        fv.x.Companion companion3 = fv.x.INSTANCE;
        if (mimeType == null) {
            mimeType = "application/octet-stream";
        }
        return companion.b(multipartName, fileName, fv.c0.Companion.k(companion2, data, companion3.a(mimeType), 0, 0, 6, null));
    }
}
