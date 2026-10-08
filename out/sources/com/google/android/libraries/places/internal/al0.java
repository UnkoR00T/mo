package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class al0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f31665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List f31666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Collection f31667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Collection f31668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f31669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final jl0 f31670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f31671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f31672h;

    al0(List list, Collection collection, Collection collection2, jl0 jl0Var, boolean z15, boolean z16, boolean z17, int i15) {
        this.f31666b = list;
        this.f31667c = (Collection) zj.p.r(collection, "drainedSubstreams");
        this.f31670f = jl0Var;
        this.f31668d = collection2;
        this.f31671g = z15;
        this.f31665a = z16;
        this.f31672h = z17;
        this.f31669e = i15;
        zj.p.x(!z16 || list == null, "passThrough should imply buffer is null");
        zj.p.x((z16 && jl0Var == null) ? false : true, "passThrough should imply winningSubstream != null");
        zj.p.x(!z16 || (collection.size() == 1 && collection.contains(jl0Var)) || (collection.size() == 0 && jl0Var.f32665b), "passThrough should imply winningSubstream is drained");
        zj.p.x((z15 && jl0Var == null) ? false : true, "cancelled should imply committed");
    }

    final al0 a(jl0 jl0Var) {
        Collection collectionUnmodifiableCollection;
        zj.p.x(!this.f31665a, "Already passThrough");
        if (jl0Var.f32665b) {
            collectionUnmodifiableCollection = this.f31667c;
        } else {
            Collection collection = this.f31667c;
            if (collection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(jl0Var);
            } else {
                ArrayList arrayList = new ArrayList(collection);
                arrayList.add(jl0Var);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection2 = collectionUnmodifiableCollection;
        jl0 jl0Var2 = this.f31670f;
        boolean z15 = jl0Var2 != null;
        List list = this.f31666b;
        if (z15) {
            zj.p.x(jl0Var2 == jl0Var, "Another RPC attempt has already committed");
            list = null;
        }
        return new al0(list, collection2, this.f31668d, jl0Var2, this.f31671g, z15, this.f31672h, this.f31669e);
    }

    final al0 b() {
        return this.f31672h ? this : new al0(this.f31666b, this.f31667c, this.f31668d, this.f31670f, this.f31671g, this.f31665a, true, this.f31669e);
    }

    final al0 c(jl0 jl0Var) {
        Collection collectionUnmodifiableCollection;
        boolean z15 = this.f31672h;
        zj.p.x(!z15, "hedging frozen");
        jl0 jl0Var2 = this.f31670f;
        zj.p.x(jl0Var2 == null, "already committed");
        Collection collection = this.f31668d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(jl0Var);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(jl0Var);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new al0(this.f31666b, this.f31667c, collectionUnmodifiableCollection, jl0Var2, this.f31671g, this.f31665a, z15, this.f31669e + 1);
    }
}
