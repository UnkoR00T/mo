package v;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class s2<C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Set<C> f202843a = new HashSet();

    public void a(List<C> list) {
        this.f202843a.addAll(list);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract s2<C> clone();

    public List<C> c() {
        return Collections.unmodifiableList(new ArrayList(this.f202843a));
    }
}
