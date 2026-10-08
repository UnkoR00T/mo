package com.google.android.libraries.places.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u60 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[][] f33854d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f33855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b40 f33856b = b40.f31734c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[][] f33857c = f33854d;

    u60() {
    }

    public final u60 a(v60 v60Var, Object obj) {
        zj.p.r(v60Var, "key");
        zj.p.r(obj, "value");
        int length = 0;
        while (true) {
            Object[][] objArr = this.f33857c;
            if (length >= objArr.length) {
                length = -1;
                break;
            }
            if (v60Var.equals(objArr[length][0])) {
                break;
            }
            length++;
        }
        if (length == -1) {
            Object[][] objArr2 = this.f33857c;
            int length2 = objArr2.length;
            Object[][] objArr3 = (Object[][]) Array.newInstance((Class<?>) Object.class, length2 + 1, 2);
            System.arraycopy(objArr2, 0, objArr3, 0, length2);
            this.f33857c = objArr3;
            length = objArr3.length - 1;
        }
        this.f33857c[length] = new Object[]{v60Var, obj};
        return this;
    }

    public final u60 b(List list) {
        zj.p.e(!list.isEmpty(), "addrs is empty");
        this.f33855a = Collections.unmodifiableList(new ArrayList(list));
        return this;
    }

    public final w60 c() {
        return new w60(this.f33855a, this.f33856b, this.f33857c, null);
    }
}
