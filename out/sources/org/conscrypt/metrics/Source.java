package org.conscrypt.metrics;

/* JADX INFO: loaded from: classes5.dex */
public enum Source {
    SOURCE_UNKNOWN(0),
    SOURCE_MAINLINE(1),
    SOURCE_GMS(2),
    SOURCE_UNBUNDLED(3);


    /* JADX INFO: renamed from: id, reason: collision with root package name */
    final int f149639id;

    Source(int i15) {
        this.f149639id = i15;
    }

    public int getId() {
        return this.f149639id;
    }
}
