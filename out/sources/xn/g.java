package xn;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f219895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f219896b;

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f219897b = new a("unspecified");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f219898c = new a("compromised");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f219899d = new a("superseded");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f219900a;

        public a(String str) {
            Objects.requireNonNull(str);
            this.f219900a = str;
        }

        public static a b(String str) {
            a aVar = f219897b;
            if (aVar.a().equals(str)) {
                return aVar;
            }
            a aVar2 = f219898c;
            if (aVar2.a().equals(str)) {
                return aVar2;
            }
            a aVar3 = f219899d;
            return aVar3.a().equals(str) ? aVar3 : new a(str);
        }

        public String a() {
            return this.f219900a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return Objects.equals(a(), ((a) obj).a());
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(a());
        }

        public String toString() {
            return a();
        }
    }

    public g(Date date, a aVar) {
        Objects.requireNonNull(date);
        this.f219895a = date;
        this.f219896b = aVar;
    }

    public static g c(Map<String, Object> map) {
        return new g(ko.a.a(io.k.g(map, "revoked_at")), map.get("reason") != null ? a.b(io.k.h(map, "reason")) : null);
    }

    public a a() {
        return this.f219896b;
    }

    public Date b() {
        return this.f219895a;
    }

    public Map<String, Object> d() {
        Map<String, Object> mapL = io.k.l();
        mapL.put("revoked_at", Long.valueOf(ko.a.b(b())));
        if (a() != null) {
            mapL.put("reason", a().a());
        }
        return mapL;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Objects.equals(this.f219895a, gVar.f219895a) && Objects.equals(a(), gVar.a());
    }

    public int hashCode() {
        return Objects.hash(this.f219895a, a());
    }
}
