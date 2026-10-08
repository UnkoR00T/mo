package com.google.android.gms.internal.vision;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class q4 extends w4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ p4 f31242b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private q4(p4 p4Var) {
        super(p4Var, null);
        this.f31242b = p4Var;
    }

    @Override // com.google.android.gms.internal.vision.w4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new r4(this.f31242b, null);
    }

    /* synthetic */ q4(p4 p4Var, o4 o4Var) {
        this(p4Var);
    }
}
