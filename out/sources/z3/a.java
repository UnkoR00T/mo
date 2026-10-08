package z3;

import c5.y;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lz3/a;", "", "Lm3/e;", "available", "Lz3/g;", "source", "h2", "(JI)J", "consumed", "d1", "(JJI)J", "Lc5/y;", "r2", "(JLtq/e;)Ljava/lang/Object;", "W0", "(JJLtq/e;)Ljava/lang/Object;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {
    static /* synthetic */ Object X(a aVar, long j15, long j16, tq.e<? super y> eVar) {
        return y.b(y.INSTANCE.a());
    }

    static /* synthetic */ Object r0(a aVar, long j15, tq.e<? super y> eVar) {
        return y.b(y.INSTANCE.a());
    }

    default Object W0(long j15, long j16, tq.e<? super y> eVar) {
        return X(this, j15, j16, eVar);
    }

    default long d1(long consumed, long available, int source) {
        return m3.e.INSTANCE.c();
    }

    default long h2(long available, int source) {
        return m3.e.INSTANCE.c();
    }

    default Object r2(long j15, tq.e<? super y> eVar) {
        return r0(this, j15, eVar);
    }
}
