package x7;

import t7.v;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f217149a;

    public c(int i15) {
        this.f217149a = i15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f217149a == ((c) obj).f217149a;
    }

    public int hashCode() {
        return this.f217149a;
    }

    public String toString() {
        return "Mp4AlternateGroup: " + this.f217149a;
    }
}
