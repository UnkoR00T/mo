package com.google.android.libraries.places.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class th0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f33791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Collection f33792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    l90 f33793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ uh0 f33794d;

    /* synthetic */ th0(uh0 uh0Var, byte[] bArr) {
        Objects.requireNonNull(uh0Var);
        this.f33794d = uh0Var;
        this.f33791a = new Object();
        this.f33792b = new HashSet();
    }

    final void a(l90 l90Var) {
        synchronized (this.f33791a) {
            try {
                if (this.f33793c != null) {
                    return;
                }
                this.f33793c = l90Var;
                boolean zIsEmpty = this.f33792b.isEmpty();
                if (zIsEmpty) {
                    this.f33794d.u().d(l90Var);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
