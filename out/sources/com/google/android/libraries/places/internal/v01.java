package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public final class v01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f34007a;

    public final w01 a() {
        zj.p.x(this.f34007a != null, "Photo must be set to non-null value.");
        return new w01(this.f34007a, null);
    }

    public final v01 b(Bitmap bitmap) {
        this.f34007a = bitmap;
        return this;
    }
}
