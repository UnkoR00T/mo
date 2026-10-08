package h84;

import java.util.Iterator;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lh84/b;", "", "", "Li84/b;", "interactors", "<init>", "(Ljava/util/Set;)V", "Lw74/a;", "featureConfig", "a", "(Lw74/a;)Li84/b;", "Ljava/util/Set;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<i84.b> interactors;

    public b(Set<i84.b> set) {
        this.interactors = set;
    }

    public final i84.b a(w74.a featureConfig) {
        Object next;
        Iterator<T> it = this.interactors.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((i84.b) next).b() != featureConfig);
        i84.b bVar = (i84.b) next;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("No NotificationsHistorySystemInteractor registered for config: " + featureConfig);
    }
}
