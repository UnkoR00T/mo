package com.google.android.libraries.places.internal;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class za1 implements ra1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Level f34485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f34486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ha1 f34487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f34488e;

    private za1(String str, boolean z15, int i15, Level level, boolean z16, Set set, ha1 ha1Var) {
        this.f34484a = "";
        this.f34488e = 2;
        this.f34485b = level;
        this.f34486c = set;
        this.f34487d = ha1Var;
    }

    @Override // com.google.android.libraries.places.internal.ra1
    public final aa1 a(String str) {
        return new bb1(this.f34484a, str, true, 2, this.f34485b, this.f34486c, this.f34487d, null);
    }

    public final za1 b(boolean z15) {
        Set set = this.f34486c;
        ha1 ha1Var = this.f34487d;
        return new za1(this.f34484a, true, 2, Level.OFF, false, set, ha1Var);
    }

    /* synthetic */ za1(byte[] bArr) {
        this("", true, 2, Level.ALL, false, bb1.f31778g, bb1.f31779h);
    }
}
