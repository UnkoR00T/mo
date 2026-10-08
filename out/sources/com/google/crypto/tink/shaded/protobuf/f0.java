package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public class f0 extends c<String> implements g0, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f0 f36055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f36056d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Object> f36057b;

    static {
        f0 f0Var = new f0();
        f36055c = f0Var;
        f0Var.O();
        f36056d = f0Var;
    }

    public f0() {
        this(10);
    }

    private static String g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof h ? ((h) obj).L() : a0.j((byte[]) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public void F3(h hVar) {
        e();
        this.f36057b.add(hVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public Object K(int i15) {
        return this.f36057b.get(i15);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, com.google.crypto.tink.shaded.protobuf.a0.i
    public /* bridge */ /* synthetic */ boolean c0() {
        return super.c0();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        e();
        this.f36057b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i15, String str) {
        e();
        this.f36057b.add(i15, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public f0 d0(int i15) {
        if (i15 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i15);
        arrayList.addAll(this.f36057b);
        return new f0((ArrayList<Object>) arrayList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String remove(int i15) {
        e();
        Object objRemove = this.f36057b.remove(i15);
        ((AbstractList) this).modCount++;
        return g(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String set(int i15, String str) {
        e();
        return g(this.f36057b.set(i15, str));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public g0 n0() {
        return c0() ? new q1(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f36057b.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public List<?> y() {
        return Collections.unmodifiableList(this.f36057b);
    }

    public f0(int i15) {
        this((ArrayList<Object>) new ArrayList(i15));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i15, Collection<? extends String> collection) {
        e();
        if (collection instanceof g0) {
            collection = ((g0) collection).y();
        }
        boolean zAddAll = this.f36057b.addAll(i15, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i15) {
        Object obj = this.f36057b.get(i15);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String strL = hVar.L();
            if (hVar.s()) {
                this.f36057b.set(i15, strL);
            }
            return strL;
        }
        byte[] bArr = (byte[]) obj;
        String strJ = a0.j(bArr);
        if (a0.g(bArr)) {
            this.f36057b.set(i15, strJ);
        }
        return strJ;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private f0(ArrayList<Object> arrayList) {
        this.f36057b = arrayList;
    }
}
