package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
final class gj0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p50 f32393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final double f32394b;

    public gj0(p50 p50Var, double d15) {
        this.f32393a = p50Var;
        this.f32394b = d15;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Double.compare(this.f32394b, ((gj0) obj).f32394b);
    }
}
