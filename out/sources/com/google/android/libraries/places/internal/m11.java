package com.google.android.libraries.places.internal;

import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class m11 extends wd.j {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final /* synthetic */ Map f32916x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m11(q11 q11Var, int i15, String str, JSONObject jSONObject, vd.p.b bVar, vd.p.a aVar, Map map) {
        super(0, str, null, bVar, aVar);
        this.f32916x = map;
        Objects.requireNonNull(q11Var);
    }

    @Override // vd.n
    public final Map v() {
        return this.f32916x;
    }
}
