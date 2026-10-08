package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public enum r1 {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    r1(int i15) {
        this.value = i15;
    }

    public int getValue() {
        return this.value;
    }
}
