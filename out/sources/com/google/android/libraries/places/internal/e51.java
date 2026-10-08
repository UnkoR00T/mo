package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class e51 extends j51 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vh.b f32159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32160c;

    e51(vh.b bVar, String str) {
        this.f32159b = bVar;
        if (str == null) {
            throw new NullPointerException("Null placeId");
        }
        this.f32160c = str;
    }

    @Override // com.google.android.libraries.places.internal.k51
    public final vh.b a() {
        return this.f32159b;
    }

    @Override // com.google.android.libraries.places.internal.j51
    public final String d() {
        return this.f32160c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j51) {
            j51 j51Var = (j51) obj;
            if (this.f32159b.equals(j51Var.a()) && this.f32160c.equals(j51Var.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f32159b.hashCode() ^ 1000003) * 1000003) ^ this.f32160c.hashCode();
    }

    public final String toString() {
        String string = this.f32159b.toString();
        int length = string.length();
        String str = this.f32160c;
        StringBuilder sb5 = new StringBuilder(length + 30 + str.length() + 1);
        sb5.append("PlaceRequest{source=");
        sb5.append(string);
        sb5.append(", placeId=");
        sb5.append(str);
        sb5.append("}");
        return sb5.toString();
    }
}
