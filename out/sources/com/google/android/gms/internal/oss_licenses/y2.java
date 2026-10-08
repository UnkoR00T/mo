package com.google.android.gms.internal.oss_licenses;

import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class y2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator f30946b = new q2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y2 f30947c = new y2(new w2(Collections.EMPTY_LIST));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w2 f30948a;

    private y2(w2 w2Var) {
        this.f30948a = w2Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y2) && ((y2) obj).f30948a.equals(this.f30948a);
    }

    public final int hashCode() {
        return ~this.f30948a.hashCode();
    }

    public final String toString() {
        return this.f30948a.toString();
    }
}
