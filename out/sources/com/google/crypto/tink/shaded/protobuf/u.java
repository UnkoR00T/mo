package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.u.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class u<T extends b<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u f36239d = new u(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j1<T, Object> f36240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36242c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f36244b;

        static {
            int[] iArr = new int[t1.b.values().length];
            f36244b = iArr;
            try {
                iArr[t1.b.f36207c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36244b[t1.b.f36208d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36244b[t1.b.f36209e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36244b[t1.b.f36210f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36244b[t1.b.f36211g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36244b[t1.b.f36212h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36244b[t1.b.f36213j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36244b[t1.b.f36214k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36244b[t1.b.f36216m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f36244b[t1.b.f36217n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f36244b[t1.b.f36215l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f36244b[t1.b.f36218p.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f36244b[t1.b.f36219q.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f36244b[t1.b.f36221s.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f36244b[t1.b.f36222t.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f36244b[t1.b.f36223v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f36244b[t1.b.f36224w.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f36244b[t1.b.f36220r.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[t1.c.values().length];
            f36243a = iArr2;
            try {
                iArr2[t1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f36243a[t1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f36243a[t1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f36243a[t1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f36243a[t1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f36243a[t1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f36243a[t1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f36243a[t1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f36243a[t1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        boolean C();

        t1.b E();

        t1.c L();

        boolean M();

        r0.a d1(r0.a aVar, r0 r0Var);

        int h();
    }

    private u() {
        this.f36240a = j1.r(16);
    }

    private static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int d(t1.b bVar, int i15, Object obj) {
        int iT = k.T(i15);
        if (bVar == t1.b.f36216m) {
            iT *= 2;
        }
        return iT + e(bVar, obj);
    }

    static int e(t1.b bVar, Object obj) {
        switch (a.f36244b[bVar.ordinal()]) {
            case 1:
                return k.j(((Double) obj).doubleValue());
            case 2:
                return k.r(((Float) obj).floatValue());
            case 3:
                return k.y(((Long) obj).longValue());
            case 4:
                return k.X(((Long) obj).longValue());
            case 5:
                return k.w(((Integer) obj).intValue());
            case 6:
                return k.p(((Long) obj).longValue());
            case 7:
                return k.n(((Integer) obj).intValue());
            case 8:
                return k.e(((Boolean) obj).booleanValue());
            case 9:
                return k.t((r0) obj);
            case 10:
                return obj instanceof d0 ? k.B((d0) obj) : k.G((r0) obj);
            case 11:
                return obj instanceof h ? k.h((h) obj) : k.S((String) obj);
            case 12:
                return obj instanceof h ? k.h((h) obj) : k.f((byte[]) obj);
            case 13:
                return k.V(((Integer) obj).intValue());
            case 14:
                return k.K(((Integer) obj).intValue());
            case 15:
                return k.M(((Long) obj).longValue());
            case 16:
                return k.O(((Integer) obj).intValue());
            case 17:
                return k.Q(((Long) obj).longValue());
            case 18:
                return obj instanceof a0.c ? k.l(((a0.c) obj).h()) : k.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        t1.b bVarE = bVar.E();
        int iH = bVar.h();
        if (!bVar.C()) {
            return d(bVarE, iH, obj);
        }
        int iD = 0;
        if (bVar.M()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iD += e(bVarE, it.next());
            }
            return k.T(iH) + iD + k.V(iD);
        }
        Iterator it4 = ((List) obj).iterator();
        while (it4.hasNext()) {
            iD += d(bVarE, iH, it4.next());
        }
        return iD;
    }

    public static <T extends b<T>> u<T> h() {
        return f36239d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.L() != t1.c.MESSAGE || key.C() || key.M()) {
            return f(key, value);
        }
        return value instanceof d0 ? k.z(entry.getKey().h(), (d0) value) : k.D(entry.getKey().h(), (r0) value);
    }

    private static <T extends b<T>> boolean p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.L() != t1.c.MESSAGE) {
            return true;
        }
        if (!key.C()) {
            return q(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!q(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean q(Object obj) {
        if (obj instanceof s0) {
            return ((s0) obj).c();
        }
        if (obj instanceof d0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean r(t1.b bVar, Object obj) {
        a0.a(obj);
        switch (a.f36243a[bVar.b().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof h) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof a0.c);
            case 9:
                return (obj instanceof r0) || (obj instanceof d0);
            default:
                return false;
        }
    }

    private void v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof d0) {
            value = ((d0) value).f();
        }
        if (key.C()) {
            Object objI = i(key);
            if (objI == null) {
                objI = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI).add(c(it.next()));
            }
            this.f36240a.s(key, objI);
            return;
        }
        if (key.L() != t1.c.MESSAGE) {
            this.f36240a.s(key, c(value));
            return;
        }
        Object objI2 = i(key);
        if (objI2 == null) {
            this.f36240a.s(key, c(value));
        } else {
            this.f36240a.s(key, key.d1(((r0) objI2).b(), (r0) value).build());
        }
    }

    public static <T extends b<T>> u<T> w() {
        return new u<>();
    }

    private void y(T t15, Object obj) {
        if (!r(t15.E(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t15.h()), t15.E().b(), obj.getClass().getName()));
        }
    }

    public void a(T t15, Object obj) {
        List arrayList;
        if (!t15.C()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        y(t15, obj);
        Object objI = i(t15);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f36240a.s(t15, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u<T> clone() {
        u<T> uVarW = w();
        for (int i15 = 0; i15 < this.f36240a.l(); i15++) {
            Map.Entry<K, Object> entryK = this.f36240a.k(i15);
            uVarW.x((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f36240a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            uVarW.x((b) entry.getKey(), entry.getValue());
        }
        uVarW.f36242c = this.f36242c;
        return uVarW;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f36240a.equals(((u) obj).f36240a);
        }
        return false;
    }

    Iterator<Map.Entry<T, Object>> g() {
        return this.f36242c ? new d0.c(this.f36240a.h().iterator()) : this.f36240a.h().iterator();
    }

    public int hashCode() {
        return this.f36240a.hashCode();
    }

    public Object i(T t15) {
        Object obj = this.f36240a.get(t15);
        return obj instanceof d0 ? ((d0) obj).f() : obj;
    }

    public int j() {
        int iK = 0;
        for (int i15 = 0; i15 < this.f36240a.l(); i15++) {
            iK += k(this.f36240a.k(i15));
        }
        Iterator it = this.f36240a.n().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public int l() {
        int iF = 0;
        for (int i15 = 0; i15 < this.f36240a.l(); i15++) {
            Map.Entry<K, Object> entryK = this.f36240a.k(i15);
            iF += f((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f36240a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    boolean m() {
        return this.f36240a.isEmpty();
    }

    public boolean n() {
        return this.f36241b;
    }

    public boolean o() {
        for (int i15 = 0; i15 < this.f36240a.l(); i15++) {
            if (!p(this.f36240a.k(i15))) {
                return false;
            }
        }
        Iterator it = this.f36240a.n().iterator();
        while (it.hasNext()) {
            if (!p((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        return this.f36242c ? new d0.c(this.f36240a.entrySet().iterator()) : this.f36240a.entrySet().iterator();
    }

    public void t() {
        if (this.f36241b) {
            return;
        }
        for (int i15 = 0; i15 < this.f36240a.l(); i15++) {
            Map.Entry<K, Object> entryK = this.f36240a.k(i15);
            if (entryK.getValue() instanceof y) {
                ((y) entryK.getValue()).G();
            }
        }
        this.f36240a.q();
        this.f36241b = true;
    }

    public void u(u<T> uVar) {
        for (int i15 = 0; i15 < uVar.f36240a.l(); i15++) {
            v(uVar.f36240a.k(i15));
        }
        Iterator it = uVar.f36240a.n().iterator();
        while (it.hasNext()) {
            v((Map.Entry) it.next());
        }
    }

    public void x(T t15, Object obj) {
        if (!t15.C()) {
            y(t15, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                y(t15, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof d0) {
            this.f36242c = true;
        }
        this.f36240a.s(t15, obj);
    }

    private u(boolean z15) {
        this(j1.r(0));
        t();
    }

    private u(j1<T, Object> j1Var) {
        this.f36240a = j1Var;
        t();
    }
}
