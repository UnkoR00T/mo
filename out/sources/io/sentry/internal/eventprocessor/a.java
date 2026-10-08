package io.sentry.internal.eventprocessor;

import io.sentry.e0;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f95109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f95110b;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        return this.f95110b.compareTo(aVar.f95110b);
    }

    public e0 e() {
        return this.f95109a;
    }
}
