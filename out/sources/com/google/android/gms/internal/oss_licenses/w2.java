package com.google.android.gms.internal.oss_licenses;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class w2 extends AbstractMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Comparator f30923f = new s2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f30924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f30925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f30926c = new v2(this, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f30927d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f30928e = null;

    w2(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw null;
        }
        int size = list.size();
        Object[] objArrCopyOf = new Object[size];
        Iterator it4 = list.iterator();
        if (it4.hasNext()) {
            throw null;
        }
        int[] iArr = {0};
        if (size > 16 && size * 9 > 0) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, 0);
        }
        this.f30924a = objArrCopyOf;
        this.f30925b = iArr;
    }

    final /* synthetic */ Object[] b() {
        return this.f30924a;
    }

    final /* synthetic */ int[] c() {
        return this.f30925b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f30926c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f30927d == null) {
            this.f30927d = Integer.valueOf(super.hashCode());
        }
        return this.f30927d.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f30928e == null) {
            this.f30928e = super.toString();
        }
        return this.f30928e;
    }
}
