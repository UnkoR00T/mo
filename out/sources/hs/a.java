package hs;

import fr.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f86466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f86467b;

    public a(String str, String str2) {
        super(null);
        this.f86466a = str;
        this.f86467b = str2;
    }

    public String a() {
        return this.f86467b;
    }

    public String b() {
        return this.f86466a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.c(this.f86466a, aVar.f86466a) && t.c(this.f86467b, aVar.f86467b);
    }

    public int hashCode() {
        return (this.f86466a.hashCode() * 31) + this.f86467b.hashCode();
    }

    public String toString() {
        return b() + ':' + a();
    }
}
