package b0;

import v.h3;
import v.p1;

/* JADX INFO: loaded from: classes.dex */
public interface r<T> extends h3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p1.a<String> f15615b = p1.a.a("camerax.core.target.name", String.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p1.a<Class<?>> f15616c = p1.a.a("camerax.core.target.class", Class.class);

    default String a0() {
        return (String) d(f15615b);
    }

    default String w(String str) {
        return (String) f(f15615b, str);
    }
}
