package v74;

import java.util.Iterator;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lv74/e;", "", "", "Lx74/a;", "providers", "<init>", "(Ljava/util/Set;)V", "Lw74/a;", "config", "a", "(Lw74/a;)Lx74/a;", "Ljava/util/Set;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<x74.a> providers;

    public e(Set<x74.a> set) {
        this.providers = set;
    }

    public final x74.a a(w74.a config) {
        Object next;
        Iterator<T> it = this.providers.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((x74.a) next).b() != config);
        x74.a aVar = (x74.a) next;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("No NotificationsInteractor registered for config: " + config);
    }
}
