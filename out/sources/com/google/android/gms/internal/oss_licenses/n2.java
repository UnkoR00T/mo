package com.google.android.gms.internal.oss_licenses;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 implements g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Level f30847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f30848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x1 f30849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f30850e;

    private n2(String str, boolean z15, int i15, Level level, boolean z16, Set set, x1 x1Var) {
        this.f30846a = "";
        this.f30850e = 2;
        this.f30847b = level;
        this.f30848c = set;
        this.f30849d = x1Var;
    }

    @Override // com.google.android.gms.internal.oss_licenses.g2
    public final q1 a(String str) {
        return new p2(this.f30846a, str, true, 2, this.f30847b, this.f30848c, this.f30849d, null);
    }

    public final n2 b(boolean z15) {
        Set set = this.f30848c;
        x1 x1Var = this.f30849d;
        return new n2(this.f30846a, true, 2, Level.OFF, false, set, x1Var);
    }

    /* synthetic */ n2(byte[] bArr) {
        this("", true, 2, Level.ALL, false, p2.f30864b, p2.f30865c);
    }
}
