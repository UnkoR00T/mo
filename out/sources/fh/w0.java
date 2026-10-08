package fh;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 {
    public static List a(List list, uj ujVar) {
        return list instanceof RandomAccess ? new t0(list, ujVar) : new v0(list, ujVar);
    }
}
