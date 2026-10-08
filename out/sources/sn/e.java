package sn;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f182432b = new e("DEF");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f182433a;

    public e(String str) {
        Objects.requireNonNull(str);
        this.f182433a = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.f182433a.hashCode();
    }

    public String toString() {
        return this.f182433a;
    }
}
