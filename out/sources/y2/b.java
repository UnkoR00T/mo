package y2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u0088\u0001\u0007\u0092\u0001\u00020\u0006¨\u0006\u0012"}, d2 = {"Ly2/b;", "", "", "value", "b", "(Z)Ly2/c;", "Ly2/c;", "wrapped", "a", "(Ly2/c;)Ly2/c;", "c", "(Ly2/c;)Z", "Loq/i0;", "e", "(Ly2/c;Z)V", "newValue", "d", "(Ly2/c;Z)Z", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static c a(c cVar) {
        return cVar;
    }

    public static c b(boolean z15) {
        return a(new c(z15 ? 1 : 0));
    }

    public static final boolean c(c cVar) {
        return cVar.get() != 0;
    }

    public static final boolean d(c cVar, boolean z15) {
        return cVar.compareAndSet(1, z15 ? 1 : 0);
    }

    public static final void e(c cVar, boolean z15) {
        cVar.set(z15 ? 1 : 0);
    }
}
