package io.sentry.clientreport;

import io.sentry.util.v;

/* JADX INFO: loaded from: classes4.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f94782b;

    d(String str, String str2) {
        this.f94781a = str;
        this.f94782b = str2;
    }

    public String a() {
        return this.f94782b;
    }

    public String b() {
        return this.f94781a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return v.a(b(), dVar.b()) && v.a(a(), dVar.a());
    }

    public int hashCode() {
        return v.b(b(), a());
    }
}
