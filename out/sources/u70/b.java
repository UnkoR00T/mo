package u70;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lu70/b;", "T", "Lhz/c;", "<init>", "()V", "Lhz/a;", "rule", "", "g", "(Lhz/a;)Z", "value", "Lhz/g;", "a", "(Ljava/lang/Object;)Lhz/g;", "", "b", "Ljava/util/Set;", "_rules", "validators_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b<T> implements hz.c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set<hz.a<T>> _rules = new LinkedHashSet();

    @Override // hz.c
    public hz.g a(T value) {
        T next;
        Iterator<T> it = this._rules.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((hz.a) next).b(value));
        hz.a aVar = (hz.a) next;
        return aVar != null ? new hz.g.Invalid(aVar) : hz.g.b.f86853b;
    }

    @Override // hz.c
    public boolean g(hz.a<T> rule) {
        return this._rules.add(rule);
    }
}
