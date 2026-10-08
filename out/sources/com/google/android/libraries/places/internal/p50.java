package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class p50 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a40 f33265d = a40.a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a40 f33266e = a40.a("io.grpc.EquivalentAddressGroup.LOCALITY");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final a40 f33267f = a40.a("io.grpc.EquivalentAddressGroup.ATTR_WEIGHT");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f33268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b40 f33269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f33270c;

    public p50(List list, b40 b40Var) {
        zj.p.e(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f33268a = listUnmodifiableList;
        this.f33269b = (b40) zj.p.r(b40Var, "attrs");
        this.f33270c = listUnmodifiableList.hashCode();
    }

    public final List a() {
        return this.f33268a;
    }

    public final b40 b() {
        return this.f33269b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p50)) {
            return false;
        }
        p50 p50Var = (p50) obj;
        List list = this.f33268a;
        int size = list.size();
        List list2 = p50Var.f33268a;
        if (size != list2.size()) {
            return false;
        }
        for (int i15 = 0; i15 < list.size(); i15++) {
            if (!((SocketAddress) list.get(i15)).equals(list2.get(i15))) {
                return false;
            }
        }
        return this.f33269b.equals(p50Var.f33269b);
    }

    public final int hashCode() {
        return this.f33270c;
    }

    public final String toString() {
        b40 b40Var = this.f33269b;
        String strValueOf = String.valueOf(this.f33268a);
        String strValueOf2 = String.valueOf(b40Var);
        StringBuilder sb5 = new StringBuilder(strValueOf.length() + 2 + strValueOf2.length() + 1);
        sb5.append("[");
        sb5.append(strValueOf);
        sb5.append("/");
        sb5.append(strValueOf2);
        sb5.append("]");
        return sb5.toString();
    }
}
