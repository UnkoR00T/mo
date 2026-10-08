package hs;

import fr.t;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f86468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f86469b;

    public d(String str, String str2) {
        super(null);
        this.f86468a = str;
        this.f86469b = str2;
    }

    public String a() {
        return this.f86469b;
    }

    public String b() {
        return this.f86468a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return t.c(this.f86468a, dVar.f86468a) && t.c(this.f86469b, dVar.f86469b);
    }

    public int hashCode() {
        return (this.f86468a.hashCode() * 31) + this.f86469b.hashCode();
    }

    public String toString() {
        return b() + a();
    }
}
