package com.google.android.gms.internal.clearcut;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
public final class w2 extends hg.e<hg.a.d.c> implements eg.c {
    @VisibleForTesting
    private w2(Context context) {
        super(context, eg.a.f49919p, (hg.a.d) null, new ig.a());
    }

    public static eg.c D(Context context) {
        return new w2(context);
    }

    @Override // eg.c
    public final hg.h<Status> b(eg.f fVar) {
        return n(new l5(fVar, l()));
    }
}
