package sn;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f182416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f182417b;

    public a(String str, v vVar, d dVar) {
        super(str);
        Objects.requireNonNull(vVar);
        this.f182416a = vVar;
        Objects.requireNonNull(dVar);
        this.f182417b = dVar;
    }

    public v a() {
        return this.f182416a;
    }
}
