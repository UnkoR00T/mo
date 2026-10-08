package mq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<T> f127609a;

    private f(int i15) {
        this.f127609a = new ArrayList(i15);
    }

    public static <T> f<T> c(int i15) {
        return new f<>(i15);
    }

    public f<T> a(T t15) {
        this.f127609a.add((T) d.c(t15, "Set contributions cannot be null"));
        return this;
    }

    public Set<T> b() {
        if (this.f127609a.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return this.f127609a.size() == 1 ? Collections.singleton(this.f127609a.get(0)) : Collections.unmodifiableSet(new HashSet(this.f127609a));
    }
}
