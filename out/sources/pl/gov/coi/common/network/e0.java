package pl.gov.coi.common.network;

import java.io.File;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JC\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\n\u0010\u000bJC\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lpl/gov/coi/common/network/e0;", "", "", "data", "", "fileName", "fileExtension", "mimeType", "multipartName", "Lfv/y$c;", "d", "([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lfv/y$c;", "Ljava/io/File;", "file", "b", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lfv/y$c;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e0 {
    static /* synthetic */ fv.y.c a(e0 e0Var, File file, String str, String str2, String str3, String str4, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fileToMultipartData");
        }
        if ((i15 & 4) != 0) {
            str2 = null;
        }
        if ((i15 & 8) != 0) {
            str3 = null;
        }
        if ((i15 & 16) != 0) {
            str4 = null;
        }
        return e0Var.b(file, str, str2, str3, str4);
    }

    static /* synthetic */ fv.y.c c(e0 e0Var, byte[] bArr, String str, String str2, String str3, String str4, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: byteDataToMultipartData");
        }
        if ((i15 & 4) != 0) {
            str2 = null;
        }
        if ((i15 & 8) != 0) {
            str3 = null;
        }
        if ((i15 & 16) != 0) {
            str4 = null;
        }
        return e0Var.d(bArr, str, str2, str3, str4);
    }

    fv.y.c b(File file, String fileName, String fileExtension, String mimeType, String multipartName);

    fv.y.c d(byte[] data, String fileName, String fileExtension, String mimeType, String multipartName);
}
