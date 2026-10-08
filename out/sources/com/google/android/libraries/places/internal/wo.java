package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class wo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final wo f34184c = new wo(uo.PROCEED, null, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uo f34185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f34186b;

    static {
        new wo(uo.DELAY_START, null, null, null, null);
    }

    private wo(uo uoVar, vo voVar, ro roVar, com.google.common.util.concurrent.q qVar, f40 f40Var) {
        this.f34185a = (uo) zj.p.q(uoVar);
        this.f34186b = qVar;
    }

    public static wo a() {
        return f34184c;
    }

    public static wo b(com.google.common.util.concurrent.q qVar) {
        zj.p.q(qVar);
        return new wo(uo.CONTINUE_AFTER, null, null, qVar, null);
    }

    public final uo c() {
        return this.f34185a;
    }

    public final com.google.common.util.concurrent.q d() {
        zj.p.w(this.f34185a == uo.CONTINUE_AFTER);
        return this.f34186b;
    }
}
