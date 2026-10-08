package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class w41 extends z41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ak.n0 f34107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ii.l0 f34108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ii.h f34109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ii.i f34110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Status f34111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34112g;

    w41() {
    }

    @Override // com.google.android.libraries.places.internal.z41
    public final z41 a(String str) {
        this.f34106a = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.z41
    public final z41 b(List list) {
        this.f34107b = list == null ? null : ak.n0.v(list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.z41
    public final z41 c(ii.l0 l0Var) {
        this.f34108c = l0Var;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.z41
    public final z41 d(ii.h hVar) {
        this.f34109d = hVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.z41
    public final z41 e(ii.i iVar) {
        this.f34110e = iVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.z41
    public final z41 f(Status status) {
        this.f34111f = status;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.z41
    public final a51 g() {
        int i15 = this.f34112g;
        if (i15 != 0) {
            return new x41(i15, this.f34106a, this.f34107b, this.f34108c, this.f34109d, this.f34110e, this.f34111f, null);
        }
        throw new IllegalStateException("Missing required properties: type");
    }

    public final z41 h(int i15) {
        this.f34112g = i15;
        return this;
    }
}
