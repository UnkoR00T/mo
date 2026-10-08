package io.sentry;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class h8<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<T> f95012a;

    h8(List<T> list) {
        this.f95012a = new ArrayList(list == null ? new ArrayList<>(0) : list);
    }

    public List<T> a() {
        return this.f95012a;
    }
}
