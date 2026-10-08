package jg;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public class z implements hg.a.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f102574c = c().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f102575b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f102576a;

        /* synthetic */ a(byte[] bArr) {
        }

        public z a() {
            return new z(this.f102576a, null);
        }

        public a b(String str) {
            this.f102576a = str;
            return this;
        }
    }

    /* synthetic */ z(String str, byte[] bArr) {
        this.f102575b = str;
    }

    public static a c() {
        return new a(null);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.f102575b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            return r.a(this.f102575b, ((z) obj).f102575b);
        }
        return false;
    }

    public final int hashCode() {
        return r.b(this.f102575b);
    }
}
