package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29002a;

    public GooglePlayServicesManifestException(int i15, String str) {
        super(str);
        this.f29002a = i15;
    }
}
