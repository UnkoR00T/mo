package wv;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import p071kotlin.Metadata;
import vv.b0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lvv/k;", "Lvv/b0;", "path", "Lvv/j;", "c", "(Lvv/k;Lvv/b0;)Lvv/j;", "", "b", "(Lvv/k;Lvv/b0;)Z", "dir", "mustCreate", "Loq/i0;", "a", "(Lvv/k;Lvv/b0;Z)V", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void a(vv.k kVar, b0 b0Var, boolean z15) {
        pq.m mVar = new pq.m();
        for (b0 b0VarN = b0Var; b0VarN != null && !kVar.H(b0VarN); b0VarN = b0VarN.n()) {
            mVar.addFirst(b0VarN);
        }
        if (z15 && mVar.isEmpty()) {
            throw new IOException(b0Var + " already exists.");
        }
        Iterator<E> it = mVar.iterator();
        while (it.hasNext()) {
            vv.k.y(kVar, (b0) it.next(), false, 2, null);
        }
    }

    public static final boolean b(vv.k kVar, b0 b0Var) {
        return kVar.K(b0Var) != null;
    }

    public static final vv.j c(vv.k kVar, b0 b0Var) throws FileNotFoundException {
        vv.j jVarK = kVar.K(b0Var);
        if (jVarK != null) {
            return jVarK;
        }
        throw new FileNotFoundException("no such file: " + b0Var);
    }
}
