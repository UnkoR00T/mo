package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class ew0 implements vh.c {
    ew0(fw0 fw0Var) {
        Objects.requireNonNull(fw0Var);
    }

    @Override // vh.c
    public final /* synthetic */ Object a(vh.l lVar) {
        vh.m mVar = new vh.m();
        if (lVar.o()) {
            mVar.d(new hg.b(new Status(16, "Location request was cancelled. Please try again.")));
        } else if (lVar.l() == null && lVar.m() == null) {
            mVar.d(new hg.b(new Status(8, "Location unavailable.")));
        }
        return mVar.a().l() != null ? mVar.a() : lVar;
    }
}
