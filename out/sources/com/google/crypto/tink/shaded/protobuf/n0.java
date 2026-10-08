package com.google.crypto.tink.shaded.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class n0 implements m0 {
    n0() {
    }

    private static <K, V> int i(int i15, Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        k0 k0Var = (k0) obj2;
        int iA = 0;
        if (l0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : l0Var.entrySet()) {
            iA += k0Var.a(i15, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static <K, V> l0<K, V> j(Object obj, Object obj2) {
        l0<K, V> l0VarT = (l0) obj;
        l0<K, V> l0Var = (l0) obj2;
        if (!l0Var.isEmpty()) {
            if (!l0VarT.o()) {
                l0VarT = l0VarT.t();
            }
            l0VarT.s(l0Var);
        }
        return l0VarT;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public k0.a<?, ?> b(Object obj) {
        ((k0) obj).c();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public Map<?, ?> c(Object obj) {
        return (l0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public Object d(Object obj) {
        return l0.g().t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public Map<?, ?> e(Object obj) {
        return (l0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public Object f(Object obj) {
        ((l0) obj).p();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public int g(int i15, Object obj, Object obj2) {
        return i(i15, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public boolean h(Object obj) {
        return !((l0) obj).o();
    }
}
