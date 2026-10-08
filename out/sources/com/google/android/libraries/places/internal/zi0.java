package com.google.android.libraries.places.internal;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f34516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34517b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34518c;

    zi0(List list, boolean z15) {
        this.f34518c = z15;
        g(list);
    }

    private static final List j(List list, List list2) {
        if (list.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        for (int i15 = 0; i15 < Math.max(list.size(), list2.size()); i15++) {
            if (i15 < list.size()) {
                arrayList.add((yi0) list.get(i15));
            }
            if (i15 < list2.size()) {
                arrayList.add((yi0) list2.get(i15));
            }
        }
        return arrayList;
    }

    public final boolean a() {
        return this.f34517b < this.f34516a.size();
    }

    public final boolean b() {
        if (!a()) {
            return false;
        }
        this.f34517b++;
        return a();
    }

    public final void c() {
        this.f34517b = 0;
    }

    public final SocketAddress d() {
        if (a()) {
            return ((yi0) this.f34516a.get(this.f34517b)).c();
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final b40 e() {
        if (a()) {
            return ((yi0) this.f34516a.get(this.f34517b)).b();
        }
        throw new IllegalStateException("Index is off the end of the address group list");
    }

    public final List f() {
        if (a()) {
            return Collections.singletonList(((yi0) this.f34516a.get(this.f34517b)).a());
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final void g(List list) {
        List listJ;
        zj.p.r(list, "newGroups");
        if (this.f34518c) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Boolean bool = null;
            for (int i15 = 0; i15 < list.size(); i15++) {
                p50 p50Var = (p50) list.get(i15);
                for (int i16 = 0; i16 < p50Var.a().size(); i16++) {
                    SocketAddress socketAddress = (SocketAddress) p50Var.a().get(i16);
                    if ((socketAddress instanceof InetSocketAddress) && (((InetSocketAddress) socketAddress).getAddress() instanceof Inet4Address)) {
                        if (bool == null) {
                            bool = Boolean.FALSE;
                        }
                        arrayList.add(new yi0(p50Var.b(), socketAddress));
                    } else {
                        if (bool == null) {
                            bool = Boolean.TRUE;
                        }
                        arrayList2.add(new yi0(p50Var.b(), socketAddress));
                    }
                }
            }
            listJ = (bool == null || !bool.booleanValue()) ? j(arrayList, arrayList2) : j(arrayList2, arrayList);
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (int i17 = 0; i17 < list.size(); i17++) {
                p50 p50Var2 = (p50) list.get(i17);
                for (int i18 = 0; i18 < p50Var2.a().size(); i18++) {
                    arrayList3.add(new yi0(p50Var2.b(), (SocketAddress) p50Var2.a().get(i18)));
                }
            }
            listJ = arrayList3;
        }
        this.f34516a = listJ;
        this.f34517b = 0;
    }

    public final boolean h(SocketAddress socketAddress) {
        zj.p.r(socketAddress, "needle");
        for (int i15 = 0; i15 < this.f34516a.size(); i15++) {
            if (((yi0) this.f34516a.get(i15)).c().equals(socketAddress)) {
                this.f34517b = i15;
                return true;
            }
        }
        return false;
    }

    public final int i() {
        return this.f34516a.size();
    }
}
