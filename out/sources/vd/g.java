package vd;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f206169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f206170b;

    public g(String str, String str2) {
        this.f206169a = str;
        this.f206170b = str2;
    }

    public final String a() {
        return this.f206169a;
    }

    public final String b() {
        return this.f206170b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (TextUtils.equals(this.f206169a, gVar.f206169a) && TextUtils.equals(this.f206170b, gVar.f206170b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f206169a.hashCode() * 31) + this.f206170b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f206169a + ",value=" + this.f206170b + "]";
    }
}
