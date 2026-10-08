package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class bb1 extends pa1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set f31778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ha1 f31779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final za1 f31780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f31781j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Level f31783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f31784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ha1 f31785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f31786f;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(s91.f33658a, x91.f34249b, y91.f34376a)));
        f31778g = setUnmodifiableSet;
        f31779h = ka1.a(setUnmodifiableSet).c();
        f31780i = new za1(null);
    }

    /* synthetic */ bb1(String str, String str2, boolean z15, int i15, Level level, Set set, ha1 ha1Var, byte[] bArr) {
        super(str2);
        this.f31782b = va1.a("", str2, true);
        this.f31786f = 2;
        this.f31783c = level;
        this.f31784d = set;
        this.f31785e = ha1Var;
    }

    public static za1 b() {
        return f31780i;
    }
}
