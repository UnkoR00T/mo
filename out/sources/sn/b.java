package sn;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f182422c = new b("none", a0.REQUIRED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f182423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f182424b;

    public b(String str, a0 a0Var) {
        Objects.requireNonNull(str);
        this.f182423a = str;
        this.f182424b = a0Var;
    }

    public static b b(String str) {
        if (str == null) {
            return null;
        }
        return new b(str);
    }

    public final String a() {
        return this.f182423a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && toString().equals(obj.toString());
    }

    public final int hashCode() {
        return this.f182423a.hashCode();
    }

    public final String toString() {
        return this.f182423a;
    }

    public b(String str) {
        this(str, null);
    }
}
