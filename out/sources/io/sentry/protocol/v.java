package io.sentry.protocol;

import io.sentry.d2;
import io.sentry.g8;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.util.k0;
import io.sentry.v0;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f95495b = new v("00000000-0000-0000-0000-000000000000".replace("-", ""));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.r<String> f95496a;

    public static final class a implements t1<v> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v a(k3 k3Var, v0 v0Var) {
            return new v(k3Var.q2());
        }
    }

    public v() {
        this((UUID) null);
    }

    public static /* synthetic */ String a(v vVar, UUID uuid) {
        vVar.getClass();
        return vVar.d(k0.c(uuid));
    }

    public static /* synthetic */ String b(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        return io.sentry.util.d0.h(str).replace("-", "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        return this.f95496a.a().equals(((v) obj).f95496a.a());
    }

    public int hashCode() {
        return this.f95496a.a().hashCode();
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.h(toString());
    }

    public String toString() {
        return this.f95496a.a();
    }

    public v(final UUID uuid) {
        if (uuid != null) {
            this.f95496a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.protocol.r
                @Override // io.sentry.util.r.a
                public final Object a() {
                    return v.a(this.f95490a, uuid);
                }
            });
        } else {
            this.f95496a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.protocol.s
                @Override // io.sentry.util.r.a
                public final Object a() {
                    return g8.a();
                }
            });
        }
    }

    public v(String str) {
        final String strH = io.sentry.util.d0.h(str);
        if (strH.length() != 32 && strH.length() != 36) {
            throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
        }
        if (strH.length() == 36) {
            this.f95496a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.protocol.t
                @Override // io.sentry.util.r.a
                public final Object a() {
                    return this.f95492a.d(strH);
                }
            });
        } else {
            this.f95496a = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.protocol.u
                @Override // io.sentry.util.r.a
                public final Object a() {
                    return v.b(strH);
                }
            });
        }
    }
}
