package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public enum u8 implements d2 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    public static final class a implements t1<u8> {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u8 a(k3 k3Var, v0 v0Var) {
            return u8.valueOf(k3Var.q2().toUpperCase(Locale.ROOT));
        }
    }

    u8(int i15) {
        this.minHttpStatusCode = i15;
        this.maxHttpStatusCode = i15;
    }

    public static u8 fromApiNameSafely(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static u8 fromHttpStatusCode(int i15) {
        for (u8 u8Var : values()) {
            if (u8Var.matches(i15)) {
                return u8Var;
            }
        }
        return null;
    }

    private boolean matches(int i15) {
        return i15 >= this.minHttpStatusCode && i15 <= this.maxHttpStatusCode;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.h(apiName());
    }

    public static u8 fromHttpStatusCode(Integer num, u8 u8Var) {
        u8 u8VarFromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : u8Var;
        return u8VarFromHttpStatusCode != null ? u8VarFromHttpStatusCode : u8Var;
    }

    u8(int i15, int i16) {
        this.minHttpStatusCode = i15;
        this.maxHttpStatusCode = i16;
    }
}
