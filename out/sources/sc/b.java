package sc;

import ed.f0;
import kc.h0;
import kc.i0;
import p071kotlin.Metadata;
import vv.b0;
import zc.Options;
import zc.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsc/b;", "Lsc/c;", "Lkc/h0;", "<init>", "()V", "data", "Lzc/n;", "options", "", "b", "(Lkc/h0;Lzc/n;)Ljava/lang/String;", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements c<h0> {
    @Override // sc.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(h0 data, Options options) {
        String strD;
        if (!f0.m(data) || !g.a(options) || (strD = i0.d(data)) == null) {
            return null;
        }
        return data + "-" + options.getFileSystem().J(b0.Companion.e(b0.INSTANCE, strD, false, 1, null)).getLastModifiedAtMillis();
    }
}
