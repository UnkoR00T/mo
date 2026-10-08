package com.google.android.libraries.places.internal;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class g extends AbstractMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Comparator f32354f = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f32355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f32356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f32357c = new f(this, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f32358d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f32359e = null;

    g(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw null;
        }
        int size = list.size();
        Object[] objArr = new Object[size];
        Iterator it4 = list.iterator();
        if (it4.hasNext()) {
            throw null;
        }
        int[] iArr = {0};
        this.f32355a = d(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
        this.f32356b = iArr;
    }

    private static boolean d(int i15, int i16) {
        return i15 > 16 && i15 * 9 > i16 * 10;
    }

    final /* synthetic */ Object[] b() {
        return this.f32355a;
    }

    final /* synthetic */ int[] c() {
        return this.f32356b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f32357c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f32358d == null) {
            this.f32358d = Integer.valueOf(super.hashCode());
        }
        return this.f32358d.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f32359e == null) {
            this.f32359e = super.toString();
        }
        return this.f32359e;
    }
}
