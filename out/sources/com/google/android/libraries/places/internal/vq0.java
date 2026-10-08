package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class vq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Collection f34083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f34084b;

    public vq0(p50 p50Var) {
        zj.p.r(p50Var, "eag");
        if (p50Var.a().size() < 10) {
            this.f34083a = p50Var.a();
        } else {
            this.f34083a = new HashSet(p50Var.a());
        }
        Iterator it = p50Var.a().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((SocketAddress) it.next()).hashCode();
        }
        this.f34084b = iHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq0)) {
            return false;
        }
        vq0 vq0Var = (vq0) obj;
        if (vq0Var.f34084b == this.f34084b) {
            Collection collection = vq0Var.f34083a;
            int size = collection.size();
            Collection<?> collection2 = this.f34083a;
            if (size == collection2.size()) {
                return collection.containsAll(collection2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f34084b;
    }

    public final String toString() {
        return this.f34083a.toString();
    }
}
