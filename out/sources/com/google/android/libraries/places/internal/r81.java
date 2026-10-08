package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r81 {
    r81() {
    }

    public abstract ak.n0 a();

    public abstract ak.n0 b();

    public abstract UUID c();

    public abstract long d();

    public final String toString() {
        return TextUtils.join(" -> ", a());
    }
}
