package com.google.android.libraries.places.internal;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class be0 extends u80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f31793a = q60.a(be0.class.getClassLoader());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f31794b = 0;

    @Override // com.google.android.libraries.places.internal.o80
    public final t80 a(URI uri, l80 l80Var) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) zj.p.r(uri.getPath(), "targetPath");
        zj.p.m(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new ae0(uri.getAuthority(), str.substring(1), l80Var, ze0.f34508p, zj.u.c(), f31793a);
    }

    @Override // com.google.android.libraries.places.internal.o80
    public final t80 b(y90 y90Var, l80 l80Var) {
        if (!"dns".equals(y90Var.b())) {
            return null;
        }
        List listD = y90Var.d();
        zj.p.m(!listD.isEmpty(), "expected 1 path segment in target %s but found %s", y90Var, listD);
        return new ae0(y90Var.c(), (String) listD.get(0), l80Var, ze0.f34508p, zj.u.c(), f31793a);
    }

    @Override // com.google.android.libraries.places.internal.o80
    public final String c() {
        return "dns";
    }

    @Override // com.google.android.libraries.places.internal.u80
    protected final boolean d() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.u80
    public final int e() {
        return 5;
    }

    @Override // com.google.android.libraries.places.internal.u80
    public final Collection f() {
        return Collections.singleton(InetSocketAddress.class);
    }
}
