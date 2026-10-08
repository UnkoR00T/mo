package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class t<T extends b<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final t<?> f12129d = new t<>(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j1<T, Object> f12130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f12131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12132c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f12134b;

        static {
            int[] iArr = new int[s1.b.values().length];
            f12134b = iArr;
            try {
                iArr[s1.b.f12097c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12134b[s1.b.f12098d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12134b[s1.b.f12099e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12134b[s1.b.f12100f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12134b[s1.b.f12101g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12134b[s1.b.f12102h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12134b[s1.b.f12103j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12134b[s1.b.f12104k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12134b[s1.b.f12106m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12134b[s1.b.f12107n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12134b[s1.b.f12105l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12134b[s1.b.f12108p.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12134b[s1.b.f12109q.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12134b[s1.b.f12111s.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12134b[s1.b.f12112t.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12134b[s1.b.f12113v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12134b[s1.b.f12114w.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f12134b[s1.b.f12110r.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[s1.c.values().length];
            f12133a = iArr2;
            try {
                iArr2[s1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f12133a[s1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f12133a[s1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f12133a[s1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f12133a[s1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f12133a[s1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f12133a[s1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f12133a[s1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f12133a[s1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        boolean C();

        s1.b E();

        s1.c L();

        boolean M();

        int h();

        r0.a i2(r0.a aVar, r0 r0Var);
    }

    private t() {
        this.f12130a = j1.r();
    }

    static void A(j jVar, s1.b bVar, int i15, Object obj) {
        if (bVar == s1.b.f12106m) {
            jVar.z0(i15, (r0) obj);
        } else {
            jVar.V0(i15, m(bVar, false));
            B(jVar, bVar, obj);
        }
    }

    static void B(j jVar, s1.b bVar, Object obj) {
        switch (a.f12134b[bVar.ordinal()]) {
            case 1:
                jVar.q0(((Double) obj).doubleValue());
                break;
            case 2:
                jVar.y0(((Float) obj).floatValue());
                break;
            case 3:
                jVar.G0(((Long) obj).longValue());
                break;
            case 4:
                jVar.Z0(((Long) obj).longValue());
                break;
            case 5:
                jVar.E0(((Integer) obj).intValue());
                break;
            case 6:
                jVar.w0(((Long) obj).longValue());
                break;
            case 7:
                jVar.u0(((Integer) obj).intValue());
                break;
            case 8:
                jVar.k0(((Boolean) obj).booleanValue());
                break;
            case 9:
                jVar.B0((r0) obj);
                break;
            case 10:
                jVar.I0((r0) obj);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    jVar.U0((String) obj);
                } else {
                    jVar.o0((g) obj);
                }
                break;
            case 12:
                if (!(obj instanceof g)) {
                    jVar.l0((byte[]) obj);
                } else {
                    jVar.o0((g) obj);
                }
                break;
            case 13:
                jVar.X0(((Integer) obj).intValue());
                break;
            case 14:
                jVar.M0(((Integer) obj).intValue());
                break;
            case 15:
                jVar.O0(((Long) obj).longValue());
                break;
            case 16:
                jVar.Q0(((Integer) obj).intValue());
                break;
            case 17:
                jVar.S0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof z.a)) {
                    jVar.s0(((Integer) obj).intValue());
                } else {
                    jVar.s0(((z.a) obj).h());
                }
                break;
        }
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

    static int d(s1.b bVar, int i15, Object obj) {
        int iU = j.U(i15);
        if (bVar == s1.b.f12106m) {
            iU *= 2;
        }
        return iU + e(bVar, obj);
    }

    static int e(s1.b bVar, Object obj) {
        switch (a.f12134b[bVar.ordinal()]) {
            case 1:
                return j.j(((Double) obj).doubleValue());
            case 2:
                return j.r(((Float) obj).floatValue());
            case 3:
                return j.y(((Long) obj).longValue());
            case 4:
                return j.Y(((Long) obj).longValue());
            case 5:
                return j.w(((Integer) obj).intValue());
            case 6:
                return j.p(((Long) obj).longValue());
            case 7:
                return j.n(((Integer) obj).intValue());
            case 8:
                return j.e(((Boolean) obj).booleanValue());
            case 9:
                return j.t((r0) obj);
            case 10:
                return obj instanceof c0 ? j.B((c0) obj) : j.G((r0) obj);
            case 11:
                return obj instanceof g ? j.h((g) obj) : j.T((String) obj);
            case 12:
                return obj instanceof g ? j.h((g) obj) : j.f((byte[]) obj);
            case 13:
                return j.W(((Integer) obj).intValue());
            case 14:
                return j.L(((Integer) obj).intValue());
            case 15:
                return j.N(((Long) obj).longValue());
            case 16:
                return j.P(((Integer) obj).intValue());
            case 17:
                return j.R(((Long) obj).longValue());
            case 18:
                return obj instanceof z.a ? j.l(((z.a) obj).h()) : j.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        s1.b bVarE = bVar.E();
        int iH = bVar.h();
        if (!bVar.C()) {
            return d(bVarE, iH, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i15 = 0;
        if (!bVar.M()) {
            int iD = 0;
            while (i15 < size) {
                iD += d(bVarE, iH, list.get(i15));
                i15++;
            }
            return iD;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iE = 0;
        while (i15 < size) {
            iE += e(bVarE, list.get(i15));
            i15++;
        }
        return j.U(iH) + iE + j.W(iE);
    }

    public static <T extends b<T>> t<T> h() {
        return (t<T>) f12129d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.L() != s1.c.MESSAGE || key.C() || key.M()) {
            return f(key, value);
        }
        return value instanceof c0 ? j.z(entry.getKey().h(), (c0) value) : j.D(entry.getKey().h(), (r0) value);
    }

    static int m(s1.b bVar, boolean z15) {
        if (z15) {
            return 2;
        }
        return bVar.e();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.L() != s1.c.MESSAGE) {
            return true;
        }
        if (!key.C()) {
            return r(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (!r(list.get(i15))) {
                return false;
            }
        }
        return true;
    }

    private static boolean r(Object obj) {
        if (obj instanceof s0) {
            return ((s0) obj).c();
        }
        if (obj instanceof c0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static boolean s(s1.b bVar, Object obj) {
        z.a(obj);
        switch (a.f12133a[bVar.b().ordinal()]) {
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
                return (obj instanceof g) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof z.a);
            case 9:
                return (obj instanceof r0) || (obj instanceof c0);
            default:
                return false;
        }
    }

    private void w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z15 = value instanceof c0;
        if (key.C()) {
            if (z15) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objI = i(key);
            if (objI == null) {
                objI = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI).add(c(it.next()));
            }
            this.f12130a.s(key, objI);
            return;
        }
        if (key.L() != s1.c.MESSAGE) {
            if (z15) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f12130a.s(key, c(value));
            return;
        }
        Object objI2 = i(key);
        if (objI2 == null) {
            this.f12130a.s(key, c(value));
            if (z15) {
                this.f12132c = true;
                return;
            }
            return;
        }
        if (z15) {
            value = ((c0) value).f();
        }
        this.f12130a.s(key, key.i2(((r0) objI2).b(), (r0) value).build());
    }

    public static <T extends b<T>> t<T> x() {
        return new t<>();
    }

    private void z(T t15, Object obj) {
        if (!s(t15.E(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t15.h()), t15.E().b(), obj.getClass().getName()));
        }
    }

    public void a(T t15, Object obj) {
        List arrayList;
        if (!t15.C()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        z(t15, obj);
        Object objI = i(t15);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f12130a.s(t15, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t<T> clone() {
        t<T> tVarX = x();
        int iL = this.f12130a.l();
        for (int i15 = 0; i15 < iL; i15++) {
            Map.Entry<K, Object> entryK = this.f12130a.k(i15);
            tVarX.y((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f12130a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            tVarX.y((b) entry.getKey(), entry.getValue());
        }
        tVarX.f12132c = this.f12132c;
        return tVarX;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f12130a.equals(((t) obj).f12130a);
        }
        return false;
    }

    Iterator<Map.Entry<T, Object>> g() {
        if (n()) {
            return Collections.emptyIterator();
        }
        return this.f12132c ? new c0.c(this.f12130a.h().iterator()) : this.f12130a.h().iterator();
    }

    public int hashCode() {
        return this.f12130a.hashCode();
    }

    public Object i(T t15) {
        Object obj = this.f12130a.get(t15);
        return obj instanceof c0 ? ((c0) obj).f() : obj;
    }

    public int j() {
        int iL = this.f12130a.l();
        int iK = 0;
        for (int i15 = 0; i15 < iL; i15++) {
            iK += k(this.f12130a.k(i15));
        }
        Iterator it = this.f12130a.n().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public int l() {
        int iL = this.f12130a.l();
        int iF = 0;
        for (int i15 = 0; i15 < iL; i15++) {
            Map.Entry<K, Object> entryK = this.f12130a.k(i15);
            iF += f((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f12130a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    boolean n() {
        return this.f12130a.isEmpty();
    }

    public boolean o() {
        return this.f12131b;
    }

    public boolean p() {
        int iL = this.f12130a.l();
        for (int i15 = 0; i15 < iL; i15++) {
            if (!q(this.f12130a.k(i15))) {
                return false;
            }
        }
        Iterator it = this.f12130a.n().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> t() {
        if (n()) {
            return Collections.emptyIterator();
        }
        return this.f12132c ? new c0.c(this.f12130a.entrySet().iterator()) : this.f12130a.entrySet().iterator();
    }

    public void u() {
        if (this.f12131b) {
            return;
        }
        int iL = this.f12130a.l();
        for (int i15 = 0; i15 < iL; i15++) {
            Map.Entry<K, Object> entryK = this.f12130a.k(i15);
            if (entryK.getValue() instanceof x) {
                ((x) entryK.getValue()).I();
            }
        }
        this.f12130a.q();
        this.f12131b = true;
    }

    public void v(t<T> tVar) {
        int iL = tVar.f12130a.l();
        for (int i15 = 0; i15 < iL; i15++) {
            w(tVar.f12130a.k(i15));
        }
        Iterator it = tVar.f12130a.n().iterator();
        while (it.hasNext()) {
            w((Map.Entry) it.next());
        }
    }

    public void y(T t15, Object obj) {
        if (!t15.C()) {
            z(t15, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z(t15, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof c0) {
            this.f12132c = true;
        }
        this.f12130a.s(t15, obj);
    }

    private t(boolean z15) {
        this(j1.r());
        u();
    }

    private t(j1<T, Object> j1Var) {
        this.f12130a = j1Var;
        u();
    }
}
