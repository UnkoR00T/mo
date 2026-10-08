package jg;

import android.content.ComponentName;
import android.os.UserHandle;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f102467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f102468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ComponentName f102469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f102470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f102471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final UserHandle f102472f;

    public f1(String str, String str2, int i15, boolean z15, UserHandle userHandle) {
        s.f(str);
        this.f102467a = str;
        s.f(str2);
        this.f102468b = str2;
        this.f102469c = null;
        this.f102470d = 4225;
        this.f102471e = z15;
        this.f102472f = userHandle;
    }

    public final String a() {
        return this.f102467a;
    }

    public final String b() {
        return this.f102468b;
    }

    public final ComponentName c() {
        return this.f102469c;
    }

    public final boolean d() {
        return this.f102471e;
    }

    public final UserHandle e() {
        return this.f102472f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return r.a(this.f102467a, f1Var.f102467a) && r.a(this.f102468b, f1Var.f102468b) && r.a(this.f102469c, f1Var.f102469c) && this.f102471e == f1Var.f102471e && r.a(this.f102472f, f1Var.f102472f);
    }

    public final int hashCode() {
        return r.b(this.f102467a, this.f102468b, this.f102469c, 4225, Boolean.valueOf(this.f102471e), this.f102472f);
    }

    public final String toString() {
        String str = this.f102467a;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.f102469c;
        s.l(componentName);
        return componentName.flattenToString();
    }
}
