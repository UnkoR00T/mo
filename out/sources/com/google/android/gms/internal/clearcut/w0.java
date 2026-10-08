package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class w0<FieldDescriptorType extends z0<FieldDescriptorType>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final w0 f29580d = new w0(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29583c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f3<FieldDescriptorType, Object> f29581a = f3.f(16);

    private w0() {
    }

    static int f(j4 j4Var, int i15, Object obj) {
        int iB0 = m0.B0(i15);
        if (j4Var == j4.f29378m) {
            h1.i((l2) obj);
            iB0 <<= 1;
        }
        return iB0 + o(j4Var, obj);
    }

    private final Object g(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f29581a.get(fielddescriptortype);
        return obj instanceof o1 ? o1.d() : obj;
    }

    private final void i(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.o1()) {
            j(fielddescriptortype.D3(), obj);
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
                j(fielddescriptortype.D3(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof o1) {
            this.f29583c = true;
        }
        this.f29581a.put(fielddescriptortype, obj);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    private static void j(j4 j4Var, Object obj) {
        h1.a(obj);
        boolean z15 = true;
        boolean z16 = false;
        switch (x0.f29589a[j4Var.b().ordinal()]) {
            case 1:
                z15 = obj instanceof Integer;
                z16 = z15;
                break;
            case 2:
                z15 = obj instanceof Long;
                z16 = z15;
                break;
            case 3:
                z15 = obj instanceof Float;
                z16 = z15;
                break;
            case 4:
                z15 = obj instanceof Double;
                z16 = z15;
                break;
            case 5:
                z15 = obj instanceof Boolean;
                z16 = z15;
                break;
            case 6:
                z15 = obj instanceof String;
                z16 = z15;
                break;
            case 7:
                if (!(obj instanceof a0) && !(obj instanceof byte[])) {
                    z15 = false;
                }
                z16 = z15;
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof i1)) {
                    z15 = false;
                }
                z16 = z15;
                break;
            case 9:
                if (!(obj instanceof l2) && !(obj instanceof o1)) {
                    z15 = false;
                }
                z16 = z15;
                break;
        }
        if (!z16) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static <T extends z0<T>> w0<T> k() {
        return f29580d;
    }

    private static int n(z0<?> z0Var, Object obj) {
        j4 j4VarD3 = z0Var.D3();
        int iA = z0Var.a();
        if (!z0Var.o1()) {
            return f(j4VarD3, iA, obj);
        }
        int iF = 0;
        List list = (List) obj;
        if (z0Var.H0()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iF += o(j4VarD3, it.next());
            }
            return m0.B0(iA) + iF + m0.J0(iF);
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            iF += f(j4VarD3, iA, it4.next());
        }
        return iF;
    }

    private static int o(j4 j4Var, Object obj) {
        switch (x0.f29590b[j4Var.ordinal()]) {
            case 1:
                return m0.w(((Double) obj).doubleValue());
            case 2:
                return m0.x(((Float) obj).floatValue());
            case 3:
                return m0.e0(((Long) obj).longValue());
            case 4:
                return m0.h0(((Long) obj).longValue());
            case 5:
                return m0.C0(((Integer) obj).intValue());
            case 6:
                return m0.p0(((Long) obj).longValue());
            case 7:
                return m0.F0(((Integer) obj).intValue());
            case 8:
                return m0.F(((Boolean) obj).booleanValue());
            case 9:
                return m0.Z((l2) obj);
            case 10:
                return obj instanceof o1 ? m0.e((o1) obj) : m0.R((l2) obj);
            case 11:
                return obj instanceof a0 ? m0.D((a0) obj) : m0.q0((String) obj);
            case 12:
                return obj instanceof a0 ? m0.D((a0) obj) : m0.a0((byte[]) obj);
            case 13:
                return m0.D0(((Integer) obj).intValue());
            case 14:
                return m0.G0(((Integer) obj).intValue());
            case 15:
                return m0.s0(((Long) obj).longValue());
            case 16:
                return m0.E0(((Integer) obj).intValue());
            case 17:
                return m0.l0(((Long) obj).longValue());
            case 18:
                return obj instanceof i1 ? m0.H0(((i1) obj).a()) : m0.H0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean p(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.Y0() == o4.MESSAGE) {
            boolean zO1 = key.o1();
            Object value = entry.getValue();
            if (zO1) {
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    if (!((l2) it.next()).c()) {
                        return false;
                    }
                }
            } else {
                if (!(value instanceof l2)) {
                    if (value instanceof o1) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((l2) value).c()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void q(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof o1) {
            value = o1.d();
        }
        if (key.o1()) {
            Object objG = g(key);
            if (objG == null) {
                objG = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objG).add(s(it.next()));
            }
            this.f29581a.put(key, objG);
            return;
        }
        if (key.Y0() != o4.MESSAGE) {
            this.f29581a.put(key, s(value));
            return;
        }
        Object objG2 = g(key);
        if (objG2 == null) {
            this.f29581a.put(key, s(value));
        } else {
            this.f29581a.put(key, objG2 instanceof r2 ? key.Q1((r2) objG2, (r2) value) : key.t2(((l2) objG2).g(), (l2) value).b0());
        }
    }

    private static int r(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (key.Y0() != o4.MESSAGE || key.o1() || key.H0()) {
            return n(key, value);
        }
        boolean z15 = value instanceof o1;
        int iA = entry.getKey().a();
        return z15 ? m0.A(iA, (o1) value) : m0.Y(iA, (l2) value);
    }

    private static Object s(Object obj) {
        if (obj instanceof r2) {
            return ((r2) obj).K1();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    final Iterator<Map.Entry<FieldDescriptorType, Object>> a() {
        return this.f29583c ? new r1(this.f29581a.o().iterator()) : this.f29581a.o().iterator();
    }

    final boolean b() {
        return this.f29581a.isEmpty();
    }

    public final boolean c() {
        return this.f29582b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ Object clone() {
        w0 w0Var = new w0();
        for (int i15 = 0; i15 < this.f29581a.m(); i15++) {
            Map.Entry<K, Object> entryG = this.f29581a.g(i15);
            w0Var.i((z0) entryG.getKey(), entryG.getValue());
        }
        Iterator it = this.f29581a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            w0Var.i((z0) entry.getKey(), entry.getValue());
        }
        w0Var.f29583c = this.f29583c;
        return w0Var;
    }

    public final boolean d() {
        for (int i15 = 0; i15 < this.f29581a.m(); i15++) {
            if (!p(this.f29581a.g(i15))) {
                return false;
            }
        }
        Iterator it = this.f29581a.n().iterator();
        while (it.hasNext()) {
            if (!p((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> e() {
        return this.f29583c ? new r1(this.f29581a.entrySet().iterator()) : this.f29581a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            return this.f29581a.equals(((w0) obj).f29581a);
        }
        return false;
    }

    public final void h(w0<FieldDescriptorType> w0Var) {
        for (int i15 = 0; i15 < w0Var.f29581a.m(); i15++) {
            q(w0Var.f29581a.g(i15));
        }
        Iterator it = w0Var.f29581a.n().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public final int hashCode() {
        return this.f29581a.hashCode();
    }

    public final int l() {
        int iN = 0;
        for (int i15 = 0; i15 < this.f29581a.m(); i15++) {
            Map.Entry<K, Object> entryG = this.f29581a.g(i15);
            iN += n((z0) entryG.getKey(), entryG.getValue());
        }
        Iterator it = this.f29581a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iN += n((z0) entry.getKey(), entry.getValue());
        }
        return iN;
    }

    public final int m() {
        int iR = 0;
        for (int i15 = 0; i15 < this.f29581a.m(); i15++) {
            iR += r(this.f29581a.g(i15));
        }
        Iterator it = this.f29581a.n().iterator();
        while (it.hasNext()) {
            iR += r((Map.Entry) it.next());
        }
        return iR;
    }

    public final void t() {
        if (this.f29582b) {
            return;
        }
        this.f29581a.r();
        this.f29582b = true;
    }

    private w0(boolean z15) {
        t();
    }
}
