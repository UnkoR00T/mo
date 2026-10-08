package io.sentry.rrweb;

import io.sentry.k3;
import io.sentry.l3;
import io.sentry.util.v;
import io.sentry.v0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f95622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f95623b;

    public static final class a {
        public boolean a(b bVar, String str, k3 k3Var, v0 v0Var) {
            str.getClass();
            if (str.equals("type")) {
                bVar.f95622a = (c) v.c((c) k3Var.M1(v0Var, new c.a()), "");
                return true;
            }
            if (!str.equals("timestamp")) {
                return false;
            }
            bVar.f95623b = k3Var.nextLong();
            return true;
        }
    }

    /* JADX INFO: renamed from: io.sentry.rrweb.b$b, reason: collision with other inner class name */
    public static final class C2242b {
        public void a(b bVar, l3 l3Var, v0 v0Var) {
            l3Var.f("type").l(v0Var, bVar.f95622a);
            l3Var.f("timestamp").b(bVar.f95623b);
        }
    }

    protected b(c cVar) {
        this.f95622a = cVar;
        this.f95623b = System.currentTimeMillis();
    }

    public long e() {
        return this.f95623b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f95623b == bVar.f95623b && this.f95622a == bVar.f95622a;
    }

    public void f(long j15) {
        this.f95623b = j15;
    }

    public int hashCode() {
        return v.b(this.f95622a, Long.valueOf(this.f95623b));
    }

    protected b() {
        this(c.Custom);
    }
}
