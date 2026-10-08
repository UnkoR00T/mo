package sn;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f182453b = new j("JOSE");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f182454c = new j("JOSE+JSON");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f182455d = new j("JWT");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f182456a;

    public j(String str) {
        Objects.requireNonNull(str);
        this.f182456a = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && this.f182456a.equalsIgnoreCase(((j) obj).f182456a);
    }

    public int hashCode() {
        return this.f182456a.toLowerCase().hashCode();
    }

    public String toString() {
        return this.f182456a;
    }
}
