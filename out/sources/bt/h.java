package bt;

import bt.h.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class h<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f21417d = new h(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21420c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v<FieldDescriptorType, Object> f21418a = v.o(16);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f21422b;

        static {
            int[] iArr = new int[z.b.values().length];
            f21422b = iArr;
            try {
                iArr[z.b.f21507c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21422b[z.b.f21508d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21422b[z.b.f21509e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21422b[z.b.f21510f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21422b[z.b.f21511g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21422b[z.b.f21512h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21422b[z.b.f21513j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21422b[z.b.f21514k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21422b[z.b.f21515l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21422b[z.b.f21518p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21422b[z.b.f21519q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21422b[z.b.f21521s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21422b[z.b.f21522t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21422b[z.b.f21523v.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21422b[z.b.f21524w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21422b[z.b.f21516m.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21422b[z.b.f21517n.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21422b[z.b.f21520r.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[z.c.values().length];
            f21421a = iArr2;
            try {
                iArr2[z.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21421a[z.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21421a[z.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f21421a[z.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f21421a[z.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f21421a[z.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f21421a[z.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f21421a[z.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f21421a[z.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        boolean C();

        z.b E();

        z.c L();

        boolean M();

        int h();

        q.a s3(q.a aVar, q qVar);
    }

    private h() {
    }

    private Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int d(z.b bVar, int i15, Object obj) {
        int iD = f.D(i15);
        if (bVar == z.b.f21516m) {
            iD *= 2;
        }
        return iD + e(bVar, obj);
    }

    private static int e(z.b bVar, Object obj) {
        switch (a.f21422b[bVar.ordinal()]) {
            case 1:
                return f.g(((Double) obj).doubleValue());
            case 2:
                return f.m(((Float) obj).floatValue());
            case 3:
                return f.q(((Long) obj).longValue());
            case 4:
                return f.F(((Long) obj).longValue());
            case 5:
                return f.p(((Integer) obj).intValue());
            case 6:
                return f.k(((Long) obj).longValue());
            case 7:
                return f.j(((Integer) obj).intValue());
            case 8:
                return f.b(((Boolean) obj).booleanValue());
            case 9:
                return f.C((String) obj);
            case 10:
                return obj instanceof d ? f.e((d) obj) : f.c((byte[]) obj);
            case 11:
                return f.E(((Integer) obj).intValue());
            case 12:
                return f.x(((Integer) obj).intValue());
            case 13:
                return f.y(((Long) obj).longValue());
            case 14:
                return f.z(((Integer) obj).intValue());
            case 15:
                return f.B(((Long) obj).longValue());
            case 16:
                return f.n((q) obj);
            case 17:
                return obj instanceof l ? f.r((l) obj) : f.t((q) obj);
            case 18:
                return obj instanceof j.a ? f.i(((j.a) obj).h()) : f.i(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        z.b bVarE = bVar.E();
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
            return f.D(iH) + iD + f.v(iD);
        }
        Iterator it4 = ((List) obj).iterator();
        while (it4.hasNext()) {
            iD += d(bVarE, iH, it4.next());
        }
        return iD;
    }

    public static <T extends b<T>> h<T> g() {
        return f21417d;
    }

    static int l(z.b bVar, boolean z15) {
        if (z15) {
            return 2;
        }
        return bVar.e();
    }

    private boolean o(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.L() == z.c.MESSAGE) {
            if (key.C()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((q) it.next()).c()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof q)) {
                    if (value instanceof l) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((q) value).c()) {
                    return false;
                }
            }
        }
        return true;
    }

    private void s(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof l) {
            value = ((l) value).e();
        }
        if (key.C()) {
            Object objH = h(key);
            if (objH == null) {
                objH = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objH).add(c(it.next()));
            }
            this.f21418a.p(key, objH);
            return;
        }
        if (key.L() != z.c.MESSAGE) {
            this.f21418a.p(key, c(value));
            return;
        }
        Object objH2 = h(key);
        if (objH2 == null) {
            this.f21418a.p(key, c(value));
        } else {
            this.f21418a.p(key, key.s3(((q) objH2).b(), (q) value).build());
        }
    }

    public static <T extends b<T>> h<T> t() {
        return new h<>();
    }

    public static Object u(e eVar, z.b bVar, boolean z15) {
        switch (a.f21422b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.m());
            case 2:
                return Float.valueOf(eVar.q());
            case 3:
                return Long.valueOf(eVar.t());
            case 4:
                return Long.valueOf(eVar.M());
            case 5:
                return Integer.valueOf(eVar.s());
            case 6:
                return Long.valueOf(eVar.p());
            case 7:
                return Integer.valueOf(eVar.o());
            case 8:
                return Boolean.valueOf(eVar.k());
            case 9:
                return z15 ? eVar.J() : eVar.I();
            case 10:
                return eVar.l();
            case 11:
                return Integer.valueOf(eVar.L());
            case 12:
                return Integer.valueOf(eVar.E());
            case 13:
                return Long.valueOf(eVar.F());
            case 14:
                return Integer.valueOf(eVar.G());
            case 15:
                return Long.valueOf(eVar.H());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    private static void w(z.b bVar, Object obj) {
        obj.getClass();
        boolean z15 = true;
        boolean z16 = false;
        switch (a.f21421a[bVar.b().ordinal()]) {
            case 1:
                z16 = obj instanceof Integer;
                break;
            case 2:
                z16 = obj instanceof Long;
                break;
            case 3:
                z16 = obj instanceof Float;
                break;
            case 4:
                z16 = obj instanceof Double;
                break;
            case 5:
                z16 = obj instanceof Boolean;
                break;
            case 6:
                z16 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof d) && !(obj instanceof byte[])) {
                    z15 = false;
                }
                z16 = z15;
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof j.a)) {
                    z15 = false;
                }
                z16 = z15;
                break;
            case 9:
                if (!(obj instanceof q) && !(obj instanceof l)) {
                    z15 = false;
                }
                z16 = z15;
                break;
        }
        if (!z16) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private static void x(f fVar, z.b bVar, int i15, Object obj) throws IOException {
        if (bVar == z.b.f21516m) {
            fVar.Y(i15, (q) obj);
        } else {
            fVar.w0(i15, l(bVar, false));
            y(fVar, bVar, obj);
        }
    }

    private static void y(f fVar, z.b bVar, Object obj) throws IOException {
        switch (a.f21422b[bVar.ordinal()]) {
            case 1:
                fVar.R(((Double) obj).doubleValue());
                break;
            case 2:
                fVar.X(((Float) obj).floatValue());
                break;
            case 3:
                fVar.c0(((Long) obj).longValue());
                break;
            case 4:
                fVar.z0(((Long) obj).longValue());
                break;
            case 5:
                fVar.b0(((Integer) obj).intValue());
                break;
            case 6:
                fVar.V(((Long) obj).longValue());
                break;
            case 7:
                fVar.U(((Integer) obj).intValue());
                break;
            case 8:
                fVar.M(((Boolean) obj).booleanValue());
                break;
            case 9:
                fVar.v0((String) obj);
                break;
            case 10:
                if (!(obj instanceof d)) {
                    fVar.N((byte[]) obj);
                } else {
                    fVar.P((d) obj);
                }
                break;
            case 11:
                fVar.y0(((Integer) obj).intValue());
                break;
            case 12:
                fVar.q0(((Integer) obj).intValue());
                break;
            case 13:
                fVar.r0(((Long) obj).longValue());
                break;
            case 14:
                fVar.s0(((Integer) obj).intValue());
                break;
            case 15:
                fVar.u0(((Long) obj).longValue());
                break;
            case 16:
                fVar.Z((q) obj);
                break;
            case 17:
                fVar.e0((q) obj);
                break;
            case 18:
                if (!(obj instanceof j.a)) {
                    fVar.T(((Integer) obj).intValue());
                } else {
                    fVar.T(((j.a) obj).h());
                }
                break;
        }
    }

    public static void z(b<?> bVar, Object obj, f fVar) throws IOException {
        z.b bVarE = bVar.E();
        int iH = bVar.h();
        if (!bVar.C()) {
            if (obj instanceof l) {
                x(fVar, bVarE, iH, ((l) obj).e());
                return;
            } else {
                x(fVar, bVarE, iH, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!bVar.M()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                x(fVar, bVarE, iH, it.next());
            }
            return;
        }
        fVar.w0(iH, 2);
        Iterator it4 = list.iterator();
        int iE = 0;
        while (it4.hasNext()) {
            iE += e(bVarE, it4.next());
        }
        fVar.o0(iE);
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            y(fVar, bVarE, it5.next());
        }
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (!fielddescriptortype.C()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        w(fielddescriptortype.E(), obj);
        Object objH = h(fielddescriptortype);
        if (objH == null) {
            arrayList = new ArrayList();
            this.f21418a.p(fielddescriptortype, arrayList);
        } else {
            arrayList = (List) objH;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h<FieldDescriptorType> clone() {
        h<FieldDescriptorType> hVarT = t();
        for (int i15 = 0; i15 < this.f21418a.i(); i15++) {
            Map.Entry<K, Object> entryH = this.f21418a.h(i15);
            hVarT.v((b) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.f21418a.k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            hVarT.v((b) entry.getKey(), entry.getValue());
        }
        hVarT.f21420c = this.f21420c;
        return hVarT;
    }

    public Object h(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f21418a.get(fielddescriptortype);
        return obj instanceof l ? ((l) obj).e() : obj;
    }

    public Object i(FieldDescriptorType fielddescriptortype, int i15) {
        if (!fielddescriptortype.C()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(fielddescriptortype);
        if (objH != null) {
            return ((List) objH).get(i15);
        }
        throw new IndexOutOfBoundsException();
    }

    public int j(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.C()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objH = h(fielddescriptortype);
        if (objH == null) {
            return 0;
        }
        return ((List) objH).size();
    }

    public int k() {
        int iF = 0;
        for (int i15 = 0; i15 < this.f21418a.i(); i15++) {
            Map.Entry<K, Object> entryH = this.f21418a.h(i15);
            iF += f((b) entryH.getKey(), entryH.getValue());
        }
        Iterator it = this.f21418a.k().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean m(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.C()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f21418a.get(fielddescriptortype) != null;
    }

    public boolean n() {
        for (int i15 = 0; i15 < this.f21418a.i(); i15++) {
            if (!o(this.f21418a.h(i15))) {
                return false;
            }
        }
        Iterator it = this.f21418a.k().iterator();
        while (it.hasNext()) {
            if (!o((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<FieldDescriptorType, Object>> p() {
        return this.f21420c ? new l.c(this.f21418a.entrySet().iterator()) : this.f21418a.entrySet().iterator();
    }

    public void q() {
        if (this.f21419b) {
            return;
        }
        this.f21418a.n();
        this.f21419b = true;
    }

    public void r(h<FieldDescriptorType> hVar) {
        for (int i15 = 0; i15 < hVar.f21418a.i(); i15++) {
            s(hVar.f21418a.h(i15));
        }
        Iterator it = hVar.f21418a.k().iterator();
        while (it.hasNext()) {
            s((Map.Entry) it.next());
        }
    }

    public void v(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.C()) {
            w(fielddescriptortype.E(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                w(fielddescriptortype.E(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof l) {
            this.f21420c = true;
        }
        this.f21418a.p(fielddescriptortype, obj);
    }

    private h(boolean z15) {
        q();
    }
}
