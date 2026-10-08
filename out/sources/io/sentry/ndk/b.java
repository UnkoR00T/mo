package io.sentry.ndk;

/* JADX INFO: loaded from: classes4.dex */
public enum b {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    b(int i15) {
        this.value = i15;
    }

    public int getValue() {
        return this.value;
    }
}
