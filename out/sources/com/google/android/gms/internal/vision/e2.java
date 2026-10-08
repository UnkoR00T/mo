package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.g2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class e2<T extends g2<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e2 f31002d = new e2(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p4<T, Object> f31003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31005c;

    private e2() {
        this.f31003a = p4.b(16);
    }

    static int a(t5 t5Var, int i15, Object obj) {
        int iG0 = t1.g0(i15);
        if (t5Var == t5.f31277m) {
            p2.g((u3) obj);
            iG0 <<= 1;
        }
        return iG0 + b(t5Var, obj);
    }

    private static int b(t5 t5Var, Object obj) {
        switch (d2.f30988b[t5Var.ordinal()]) {
            case 1:
                return t1.z(((Double) obj).doubleValue());
            case 2:
                return t1.A(((Float) obj).floatValue());
            case 3:
                return t1.d0(((Long) obj).longValue());
            case 4:
                return t1.i0(((Long) obj).longValue());
            case 5:
                return t1.k0(((Integer) obj).intValue());
            case 6:
                return t1.r0(((Long) obj).longValue());
            case 7:
                return t1.w0(((Integer) obj).intValue());
            case 8:
                return t1.L(((Boolean) obj).booleanValue());
            case 9:
                return t1.V((u3) obj);
            case 10:
                return obj instanceof z2 ? t1.d((z2) obj) : t1.J((u3) obj);
            case 11:
                return obj instanceof e1 ? t1.I((e1) obj) : t1.K((String) obj);
            case 12:
                return obj instanceof e1 ? t1.I((e1) obj) : t1.M((byte[]) obj);
            case 13:
                return t1.o0(((Integer) obj).intValue());
            case 14:
                return t1.z0(((Integer) obj).intValue());
            case 15:
                return t1.v0(((Long) obj).longValue());
            case 16:
                return t1.s0(((Integer) obj).intValue());
            case 17:
                return t1.n0(((Long) obj).longValue());
            case 18:
                return obj instanceof o2 ? t1.B0(((o2) obj).zza()) : t1.B0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends g2<T>> e2<T> c() {
        return f31002d;
    }

    private static Object e(Object obj) {
        if (obj instanceof c4) {
            return ((c4) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static <T extends g2<T>> boolean h(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.a() == w5.MESSAGE) {
            if (key.c()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((u3) it.next()).h()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof u3)) {
                    if (value instanceof z2) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((u3) value).h()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof z2) {
            value = z2.d();
        }
        if (key.c()) {
            Object objD = d(key);
            if (objD == null) {
                objD = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objD).add(e(it.next()));
            }
            this.f31003a.put(key, objD);
            return;
        }
        if (key.a() != w5.MESSAGE) {
            this.f31003a.put(key, e(value));
            return;
        }
        Object objD2 = d(key);
        if (objD2 == null) {
            this.f31003a.put(key, e(value));
        } else {
            this.f31003a.put(key, objD2 instanceof c4 ? key.s1((c4) objD2, (c4) value) : key.U3(((u3) objD2).b(), (u3) value).f());
        }
    }

    public static int l(g2<?> g2Var, Object obj) {
        t5 t5VarZzb = g2Var.zzb();
        int iZza = g2Var.zza();
        if (!g2Var.c()) {
            return a(t5VarZzb, iZza, obj);
        }
        int iA = 0;
        if (g2Var.d()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iA += b(t5VarZzb, it.next());
            }
            return t1.g0(iZza) + iA + t1.D0(iA);
        }
        Iterator it4 = ((List) obj).iterator();
        while (it4.hasNext()) {
            iA += a(t5VarZzb, iZza, it4.next());
        }
        return iA;
    }

    private static int m(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.a() != w5.MESSAGE || key.c() || key.d()) {
            return l(key, value);
        }
        return value instanceof z2 ? t1.D(entry.getKey().zza(), (z2) value) : t1.E(entry.getKey().zza(), (u3) value);
    }

    private static void p(T t15, Object obj) {
        t5 t5VarZzb = t15.zzb();
        p2.d(obj);
        boolean z15 = true;
        switch (d2.f30987a[t5VarZzb.b().ordinal()]) {
            case 1:
                z15 = obj instanceof Integer;
                break;
            case 2:
                z15 = obj instanceof Long;
                break;
            case 3:
                z15 = obj instanceof Float;
                break;
            case 4:
                z15 = obj instanceof Double;
                break;
            case 5:
                z15 = obj instanceof Boolean;
                break;
            case 6:
                z15 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof e1) && !(obj instanceof byte[])) {
                    z15 = false;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof o2)) {
                    z15 = false;
                }
                break;
            case 9:
                if (!(obj instanceof u3) && !(obj instanceof z2)) {
                    z15 = false;
                }
                break;
            default:
                z15 = false;
                break;
        }
        if (!z15) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t15.zza()), t15.zzb().b(), obj.getClass().getName()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        e2 e2Var = new e2();
        for (int i15 = 0; i15 < this.f31003a.k(); i15++) {
            Map.Entry<K, Object> entryH = this.f31003a.h(i15);
            e2Var.g((g2) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.f31003a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            e2Var.g((g2) entry.getKey(), entry.getValue());
        }
        e2Var.f31005c = this.f31005c;
        return e2Var;
    }

    public final Object d(T t15) {
        Object obj = this.f31003a.get(t15);
        return obj instanceof z2 ? z2.d() : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e2) {
            return this.f31003a.equals(((e2) obj).f31003a);
        }
        return false;
    }

    public final void f(e2<T> e2Var) {
        for (int i15 = 0; i15 < e2Var.f31003a.k(); i15++) {
            k(e2Var.f31003a.h(i15));
        }
        Iterator it = e2Var.f31003a.n().iterator();
        while (it.hasNext()) {
            k((Map.Entry) it.next());
        }
    }

    public final void g(T t15, Object obj) {
        if (!t15.c()) {
            p(t15, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj2 = arrayList.get(i15);
                i15++;
                p(t15, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof z2) {
            this.f31005c = true;
        }
        this.f31003a.put(t15, obj);
    }

    public final int hashCode() {
        return this.f31003a.hashCode();
    }

    public final void i() {
        if (this.f31004b) {
            return;
        }
        this.f31003a.e();
        this.f31004b = true;
    }

    public final void j(T t15, Object obj) {
        List arrayList;
        if (!t15.c()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        p(t15, obj);
        Object objD = d(t15);
        if (objD == null) {
            arrayList = new ArrayList();
            this.f31003a.put(t15, arrayList);
        } else {
            arrayList = (List) objD;
        }
        arrayList.add(obj);
    }

    public final boolean n() {
        return this.f31004b;
    }

    public final Iterator<Map.Entry<T, Object>> o() {
        return this.f31005c ? new a3(this.f31003a.entrySet().iterator()) : this.f31003a.entrySet().iterator();
    }

    final Iterator<Map.Entry<T, Object>> q() {
        return this.f31005c ? new a3(this.f31003a.p().iterator()) : this.f31003a.p().iterator();
    }

    public final boolean r() {
        for (int i15 = 0; i15 < this.f31003a.k(); i15++) {
            if (!h(this.f31003a.h(i15))) {
                return false;
            }
        }
        Iterator it = this.f31003a.n().iterator();
        while (it.hasNext()) {
            if (!h((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int s() {
        int iM = 0;
        for (int i15 = 0; i15 < this.f31003a.k(); i15++) {
            iM += m(this.f31003a.h(i15));
        }
        Iterator it = this.f31003a.n().iterator();
        while (it.hasNext()) {
            iM += m((Map.Entry) it.next());
        }
        return iM;
    }

    private e2(boolean z15) {
        this(p4.b(0));
        i();
    }

    private e2(p4<T, Object> p4Var) {
        this.f31003a = p4Var;
        i();
    }
}
