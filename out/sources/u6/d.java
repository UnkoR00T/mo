package u6;

import java.io.IOException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu6/d;", "Ljava/io/IOException;", "Landroidx/datastore/core/IOException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends IOException {
    public d(String str, Throwable th4) {
        super(str, th4);
    }

    public /* synthetic */ d(String str, Throwable th4, int i15, fr.k kVar) {
        this(str, (i15 & 2) != 0 ? null : th4);
    }
}
