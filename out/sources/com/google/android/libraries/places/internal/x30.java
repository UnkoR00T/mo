package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class x30 implements r30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f34225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f34226b;

    static {
        s30.a(Collections.EMPTY_SET);
    }

    /* synthetic */ x30(List list, List list2, v30 v30Var) {
        this.f34225a = list;
        this.f34226b = list2;
    }

    public static w30 a(int i15, int i16) {
        return new w30(1, 0, null);
    }

    @Override // com.google.android.libraries.places.internal.hr0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.f34225a;
        int size = list.size();
        List list2 = this.f34226b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            Collection collection = (Collection) ((u30) list2.get(i15)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i16 = 0; i16 < size3; i16++) {
            Object objZzb = ((u30) list.get(i16)).zzb();
            objZzb.getClass();
            hashSet.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i17 = 0; i17 < size4; i17++) {
            for (Object obj : (Collection) arrayList.get(i17)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
