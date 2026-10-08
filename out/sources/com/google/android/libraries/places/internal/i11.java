package com.google.android.libraries.places.internal;

import android.location.Location;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class i11 extends c21 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Location f32523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ak.n0 f32524f;

    i11(ji.i iVar, Location location, ak.n0 n0Var, Locale locale, String str, u41 u41Var) {
        super(iVar, locale, str, u41Var);
        this.f32523e = location;
        this.f32524f = n0Var;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0026  */
    @Override // com.google.android.libraries.places.internal.c21
    public final Map e() {
        Integer numValueOf;
        ji.i iVar = (ji.i) a();
        HashMap map = new HashMap();
        Location location = this.f32523e;
        c21.g(map, "location", g31.b(location), null);
        c21.g(map, "wifiaccesspoints", g31.a(this.f32524f, 4000), null);
        if (location == null) {
            numValueOf = null;
        } else {
            float accuracy = location.getAccuracy();
            if (!location.hasAccuracy() || accuracy <= 0.0f) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(Math.round(accuracy * 100.0f));
            }
        }
        c21.g(map, "precision", numValueOf, null);
        c21.g(map, "timestamp", Long.valueOf(location.getTime()), null);
        c21.g(map, "fields", h31.b(iVar.c()), null);
        return map;
    }

    @Override // com.google.android.libraries.places.internal.c21
    protected final String f() {
        return "findplacefromuserlocation/json";
    }
}
