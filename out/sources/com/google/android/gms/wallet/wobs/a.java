package com.google.android.gms.wallet.wobs;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ CommonWalletObject f31523a;

    /* synthetic */ a(CommonWalletObject commonWalletObject, byte[] bArr) {
        Objects.requireNonNull(commonWalletObject);
        this.f31523a = commonWalletObject;
    }

    public final a a(String str) {
        this.f31523a.f31504a = str;
        return this;
    }

    public final CommonWalletObject b() {
        return this.f31523a;
    }
}
