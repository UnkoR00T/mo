package oc;

import p071kotlin.Metadata;
import vv.b0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lvv/b0;", "file", "Lvv/k;", "fileSystem", "", "diskCacheKey", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Loc/s$a;", "metadata", "Loc/s;", "b", "(Lvv/b0;Lvv/k;Ljava/lang/String;Ljava/lang/AutoCloseable;Loc/s$a;)Loc/s;", "Lvv/g;", "source", "a", "(Lvv/g;Lvv/k;Loc/s$a;)Loc/s;", "coil-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {
    public static final s a(vv.g gVar, vv.k kVar, s.a aVar) {
        return new v(gVar, kVar, aVar);
    }

    public static final s b(b0 b0Var, vv.k kVar, String str, AutoCloseable autoCloseable, s.a aVar) {
        return new r(b0Var, kVar, str, autoCloseable, aVar);
    }

    public static /* synthetic */ s c(vv.g gVar, vv.k kVar, s.a aVar, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            aVar = null;
        }
        return a(gVar, kVar, aVar);
    }

    public static /* synthetic */ s d(b0 b0Var, vv.k kVar, String str, AutoCloseable autoCloseable, s.a aVar, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            str = null;
        }
        if ((i15 & 8) != 0) {
            autoCloseable = null;
        }
        if ((i15 & 16) != 0) {
            aVar = null;
        }
        return b(b0Var, kVar, str, autoCloseable, aVar);
    }
}
