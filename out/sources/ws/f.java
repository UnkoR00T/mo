package ws;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends bt.i.d<M>, T> T a(bt.i.d<M> dVar, bt.i.f<M, T> fVar) {
        if (dVar.B(fVar)) {
            return (T) dVar.w(fVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends bt.i.d<M>, T> T b(bt.i.d<M> dVar, bt.i.f<M, List<T>> fVar, int i15) {
        if (i15 < dVar.A(fVar)) {
            return (T) dVar.y(fVar, i15);
        }
        return null;
    }
}
