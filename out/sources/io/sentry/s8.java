package io.sentry;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class s8 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s8 f95712b = new s8("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.r<String> f95713a;

    public static final class a implements t1<s8> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s8 a(k3 k3Var, v0 v0Var) {
            return new s8(k3Var.q2());
        }
    }

    public s8(final String str) {
        Objects.requireNonNull(str, "value is required");
        this.f95713a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.r8
            @Override // io.sentry.util.r.a
            public final Object a() {
                return s8.a(str);
            }
        });
    }

    public static /* synthetic */ String a(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s8.class != obj.getClass()) {
            return false;
        }
        return this.f95713a.a().equals(((s8) obj).f95713a.a());
    }

    public int hashCode() {
        return this.f95713a.a().hashCode();
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.h(this.f95713a.a());
    }

    public String toString() {
        return this.f95713a.a();
    }

    public s8() {
        this.f95713a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.q8
            @Override // io.sentry.util.r.a
            public final Object a() {
                return g8.b();
            }
        });
    }
}
