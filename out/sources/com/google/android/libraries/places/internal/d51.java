package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class d51 extends i51 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vh.b f31972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31973c;

    d51(vh.b bVar, String str) {
        this.f31972b = bVar;
        if (str == null) {
            throw new NullPointerException("Null query");
        }
        this.f31973c = str;
    }

    @Override // com.google.android.libraries.places.internal.k51
    public final vh.b a() {
        return this.f31972b;
    }

    @Override // com.google.android.libraries.places.internal.i51
    public final String d() {
        return this.f31973c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i51) {
            i51 i51Var = (i51) obj;
            if (this.f31972b.equals(i51Var.a()) && this.f31973c.equals(i51Var.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f31972b.hashCode() ^ 1000003) * 1000003) ^ this.f31973c.hashCode();
    }

    public final String toString() {
        String string = this.f31972b.toString();
        int length = string.length();
        String str = this.f31973c;
        StringBuilder sb5 = new StringBuilder(length + 35 + str.length() + 1);
        sb5.append("AutocompleteRequest{source=");
        sb5.append(string);
        sb5.append(", query=");
        sb5.append(str);
        sb5.append("}");
        return sb5.toString();
    }
}
