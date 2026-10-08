package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends l implements Iterable<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<l> f36699a = new ArrayList<>();

    private l q() {
        int size = this.f36699a.size();
        if (size == 1) {
            return this.f36699a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof i) && ((i) obj).f36699a.equals(this.f36699a);
        }
        return true;
    }

    @Override // com.google.gson.l
    public Number h() {
        return q().h();
    }

    public int hashCode() {
        return this.f36699a.hashCode();
    }

    @Override // com.google.gson.l
    public String i() {
        return q().i();
    }

    @Override // java.lang.Iterable
    public Iterator<l> iterator() {
        return this.f36699a.iterator();
    }

    public void o(l lVar) {
        if (lVar == null) {
            lVar = n.f36856a;
        }
        this.f36699a.add(lVar);
    }
}
