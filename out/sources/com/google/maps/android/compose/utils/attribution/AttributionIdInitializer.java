package com.google.maps.android.compose.utils.attribution;

import android.content.Context;
import db.a;
import java.util.List;
import lh.f;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/maps/android/compose/utils/attribution/AttributionIdInitializer;", "Ldb/a;", "Loq/i0;", "<init>", "()V", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "a", "()Ljava/util/List;", "maps-compose_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AttributionIdInitializer implements a<i0> {
    @Override // db.a
    public List<Class<? extends a<?>>> a() {
        return v.n();
    }

    @Override // db.a
    public /* bridge */ /* synthetic */ i0 b(Context context) {
        c(context);
        return i0.f148189a;
    }

    public void c(Context context) {
        f.a(context, "gmp_git_androidmapscompose_v8.2.0");
    }
}
