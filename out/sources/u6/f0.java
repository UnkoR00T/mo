package u6;

import java.io.File;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/io/File;", "file", "Lu6/d0;", "a", "(Ljava/io/File;)Lu6/d0;", "datastore-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class f0 {
    public static final d0 a(File file) {
        return e0.a(file.getCanonicalFile().getAbsolutePath());
    }
}
