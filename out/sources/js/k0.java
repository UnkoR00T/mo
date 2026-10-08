package js;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import pq.e1;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zs.c f104683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zs.c f104684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zs.c f104685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final zs.c f104686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final zs.c f104687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final zs.c f104688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final zs.c f104689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final zs.c f104690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final zs.c f104691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final zs.c f104692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final zs.c f104693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final zs.c f104694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final zs.c f104695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final zs.c f104696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final zs.c f104697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final zs.c f104698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Set<zs.c> f104699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Set<zs.c> f104700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Set<zs.c> f104701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set<zs.c> f104702t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Set<zs.c> f104703u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Set<zs.c> f104704v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Set<zs.c> f104705w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Map<zs.c, zs.c> f104706x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final zs.c f104707y;

    static {
        zs.c cVar = new zs.c("org.jspecify.nullness.Nullable");
        f104683a = cVar;
        zs.c cVar2 = new zs.c("org.jspecify.nullness.NullMarked");
        f104684b = cVar2;
        zs.c cVar3 = new zs.c("org.jspecify.nullness.NullnessUnspecified");
        f104685c = cVar3;
        zs.c cVar4 = new zs.c("org.jspecify.annotations.NonNull");
        f104686d = cVar4;
        zs.c cVar5 = new zs.c("org.jspecify.annotations.Nullable");
        f104687e = cVar5;
        zs.c cVar6 = new zs.c("org.jspecify.annotations.NullMarked");
        f104688f = cVar6;
        zs.c cVar7 = new zs.c("org.jspecify.annotations.NullnessUnspecified");
        f104689g = cVar7;
        zs.c cVar8 = new zs.c("org.jspecify.annotations.NullUnmarked");
        f104690h = cVar8;
        f104691i = new zs.c("javax.annotation.meta.TypeQualifier");
        f104692j = new zs.c("javax.annotation.meta.TypeQualifierNickname");
        f104693k = new zs.c("javax.annotation.meta.TypeQualifierDefault");
        zs.c cVar9 = new zs.c("javax.annotation.Nonnull");
        f104694l = cVar9;
        zs.c cVar10 = new zs.c("javax.annotation.Nullable");
        f104695m = cVar10;
        zs.c cVar11 = new zs.c("javax.annotation.CheckForNull");
        f104696n = cVar11;
        f104697o = new zs.c("javax.annotation.ParametersAreNonnullByDefault");
        f104698p = new zs.c("javax.annotation.ParametersAreNullableByDefault");
        f104699q = e1.i(cVar9, cVar11);
        Set<zs.c> setI = e1.i(j0.f104671l, cVar4, new zs.c("android.annotation.NonNull"), new zs.c("androidx.annotation.NonNull"), new zs.c("androidx.annotation.RecentlyNonNull"), new zs.c("android.support.annotation.NonNull"), new zs.c("com.android.annotations.NonNull"), new zs.c("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new zs.c("org.checkerframework.checker.nullness.qual.NonNull"), new zs.c("edu.umd.cs.findbugs.annotations.NonNull"), new zs.c("io.reactivex.annotations.NonNull"), new zs.c("io.reactivex.rxjava3.annotations.NonNull"), new zs.c("org.eclipse.jdt.annotation.NonNull"), new zs.c("lombok.NonNull"), new zs.c("jakarta.annotation.Nonnull"));
        f104700r = setI;
        Set<zs.c> setI2 = e1.i(j0.f104672m, cVar, cVar5, cVar10, cVar11, new zs.c("android.annotation.Nullable"), new zs.c("androidx.annotation.Nullable"), new zs.c("androidx.annotation.RecentlyNullable"), new zs.c("android.support.annotation.Nullable"), new zs.c("com.android.annotations.Nullable"), new zs.c("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new zs.c("org.checkerframework.checker.nullness.qual.Nullable"), new zs.c("edu.umd.cs.findbugs.annotations.Nullable"), new zs.c("edu.umd.cs.findbugs.annotations.PossiblyNull"), new zs.c("edu.umd.cs.findbugs.annotations.CheckForNull"), new zs.c("io.reactivex.annotations.Nullable"), new zs.c("io.reactivex.rxjava3.annotations.Nullable"), new zs.c("org.eclipse.jdt.annotation.Nullable"), new zs.c("jakarta.annotation.Nullable"));
        f104701s = setI2;
        f104702t = e1.i(cVar3, cVar7);
        f104703u = e1.m(e1.m(e1.m(e1.m(e1.l(e1.l(new LinkedHashSet(), setI), setI2), cVar9), cVar2), cVar6), cVar8);
        f104704v = e1.i(j0.f104674o, j0.f104675p);
        f104705w = e1.i(j0.f104673n, j0.f104676q);
        f104706x = pq.v0.l(oq.y.a(j0.f104663d, sr.p.a.H), oq.y.a(j0.f104665f, sr.p.a.L), oq.y.a(j0.f104667h, sr.p.a.f183677y), oq.y.a(j0.f104668i, sr.p.a.P));
        f104707y = new zs.c("kotlin.annotations.jvm.UnderMigration");
    }

    public static final Set<zs.c> a() {
        return f104699q;
    }

    public static final Set<zs.c> b() {
        return f104702t;
    }

    public static final zs.c c() {
        return f104694l;
    }

    public static final zs.c d() {
        return f104697o;
    }

    public static final zs.c e() {
        return f104698p;
    }

    public static final zs.c f() {
        return f104691i;
    }

    public static final zs.c g() {
        return f104693k;
    }

    public static final zs.c h() {
        return f104692j;
    }

    public static final zs.c i() {
        return f104688f;
    }

    public static final zs.c j() {
        return f104690h;
    }

    public static final zs.c k() {
        return f104684b;
    }

    public static final Set<zs.c> l() {
        return f104705w;
    }

    public static final Set<zs.c> m() {
        return f104700r;
    }

    public static final Set<zs.c> n() {
        return f104701s;
    }

    public static final Set<zs.c> o() {
        return f104704v;
    }

    public static final zs.c p() {
        return f104707y;
    }
}
