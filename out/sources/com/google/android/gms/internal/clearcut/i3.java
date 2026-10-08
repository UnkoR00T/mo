package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class i3 extends o3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ f3 f29362b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private i3(f3 f3Var) {
        super(f3Var, null);
        this.f29362b = f3Var;
    }

    @Override // com.google.android.gms.internal.clearcut.o3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new h3(this.f29362b, null);
    }

    /* synthetic */ i3(f3 f3Var, g3 g3Var) {
        this(f3Var);
    }
}
