package u6;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lu6/j;", "", "<init>", "()V", "T", "Lu6/q0;", "storage", "Lv6/b;", "corruptionHandler", "", "Lu6/g;", "migrations", "Lju/p0;", "scope", "Lu6/i;", "a", "(Lu6/q0;Lv6/b;Ljava/util/List;Lju/p0;)Lu6/i;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f195555a = new j();

    private j() {
    }

    public final <T> i<T> a(q0<T> storage, v6.b<T> corruptionHandler, List<? extends g<T>> migrations, ju.p0 scope) {
        if (corruptionHandler == null) {
            corruptionHandler = (v6.b<T>) new v6.a();
        }
        return new o(storage, pq.v.e(h.INSTANCE.b(migrations)), corruptionHandler, scope);
    }
}
