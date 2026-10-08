package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f34117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b40 f34118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[][] f34119c;

    /* synthetic */ w60(List list, b40 b40Var, Object[][] objArr, byte[] bArr) {
        this.f34117a = (List) zj.p.r(list, "addresses are not set");
        this.f34118b = (b40) zj.p.r(b40Var, "attrs");
        this.f34119c = (Object[][]) zj.p.r(objArr, "customOptions");
    }

    public static u60 d() {
        return new u60();
    }

    public final List a() {
        return this.f34117a;
    }

    public final b40 b() {
        return this.f34118b;
    }

    public final Object c(v60 v60Var) {
        zj.p.r(v60Var, "key");
        int i15 = 0;
        while (true) {
            Object[][] objArr = this.f34119c;
            if (i15 >= objArr.length) {
                return v60Var.c();
            }
            if (v60Var.equals(objArr[i15][0])) {
                return objArr[i15][1];
            }
            i15++;
        }
    }

    public final String toString() {
        return zj.j.c(this).d("addrs", this.f34117a).d("attrs", this.f34118b).d("customOptions", Arrays.deepToString(this.f34119c)).toString();
    }
}
