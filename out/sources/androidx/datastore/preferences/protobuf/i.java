package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class i implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f11986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11989d = 0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11990a;

        static {
            int[] iArr = new int[s1.b.values().length];
            f11990a = iArr;
            try {
                iArr[s1.b.f12104k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11990a[s1.b.f12108p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11990a[s1.b.f12097c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11990a[s1.b.f12110r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11990a[s1.b.f12103j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11990a[s1.b.f12102h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11990a[s1.b.f12098d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11990a[s1.b.f12101g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11990a[s1.b.f12099e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11990a[s1.b.f12107n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11990a[s1.b.f12111s.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11990a[s1.b.f12112t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11990a[s1.b.f12113v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11990a[s1.b.f12114w.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11990a[s1.b.f12105l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11990a[s1.b.f12109q.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11990a[s1.b.f12100f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private i(h hVar) {
        h hVar2 = (h) z.b(hVar, "input");
        this.f11986a = hVar2;
        hVar2.f11965d = this;
    }

    public static i P(h hVar) {
        i iVar = hVar.f11965d;
        return iVar != null ? iVar : new i(hVar);
    }

    private <T> void Q(T t15, g1<T> g1Var, o oVar) {
        int i15 = this.f11988c;
        this.f11988c = s1.c(s1.a(this.f11987b), 4);
        try {
            g1Var.h(t15, this, oVar);
            if (this.f11987b != this.f11988c) {
                throw a0.h();
            }
            this.f11988c = i15;
        } catch (Throwable th4) {
            this.f11988c = i15;
            throw th4;
        }
    }

    private <T> void R(T t15, g1<T> g1Var, o oVar) throws a0 {
        int iD = this.f11986a.D();
        h hVar = this.f11986a;
        if (hVar.f11962a >= hVar.f11963b) {
            throw a0.i();
        }
        int iM = hVar.m(iD);
        this.f11986a.f11962a++;
        g1Var.h(t15, this, oVar);
        this.f11986a.a(0);
        h hVar2 = this.f11986a;
        hVar2.f11962a--;
        hVar2.l(iM);
    }

    private Object S(s1.b bVar, Class<?> cls, o oVar) {
        switch (a.f11990a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(d());
            case 2:
                return n();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(j());
            case 5:
                return Integer.valueOf(t());
            case 6:
                return Long.valueOf(a());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(o());
            case 9:
                return Long.valueOf(G());
            case 10:
                return K(cls, oVar);
            case 11:
                return Integer.valueOf(D());
            case 12:
                return Long.valueOf(e());
            case 13:
                return Integer.valueOf(k());
            case 14:
                return Long.valueOf(x());
            case 15:
                return H();
            case 16:
                return Integer.valueOf(g());
            case 17:
                return Long.valueOf(r());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private <T> T T(g1<T> g1Var, o oVar) {
        T tD = g1Var.d();
        Q(tD, g1Var, oVar);
        g1Var.e(tD);
        return tD;
    }

    private <T> T U(g1<T> g1Var, o oVar) throws a0 {
        T tD = g1Var.d();
        R(tD, g1Var, oVar);
        g1Var.e(tD);
        return tD;
    }

    private void W(int i15) throws a0 {
        if (this.f11986a.e() != i15) {
            throw a0.n();
        }
    }

    private void X(int i15) throws a0.a {
        if (s1.b(this.f11987b) != i15) {
            throw a0.e();
        }
    }

    private void Y(int i15) throws a0 {
        if ((i15 & 3) != 0) {
            throw a0.h();
        }
    }

    private void Z(int i15) throws a0 {
        if ((i15 & 7) != 0) {
            throw a0.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void A(List<String> list) throws a0.a {
        V(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void B(List<Float> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof v)) {
            int iB = s1.b(this.f11987b);
            if (iB == 2) {
                int iD = this.f11986a.D();
                Y(iD);
                int iE = this.f11986a.e() + iD;
                do {
                    list.add(Float.valueOf(this.f11986a.t()));
                } while (this.f11986a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw a0.e();
            }
            do {
                list.add(Float.valueOf(this.f11986a.t()));
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC = this.f11986a.C();
                }
            } while (iC == this.f11987b);
            this.f11989d = iC;
            return;
        }
        v vVar = (v) list;
        int iB2 = s1.b(this.f11987b);
        if (iB2 == 2) {
            int iD2 = this.f11986a.D();
            Y(iD2);
            int iE2 = this.f11986a.e() + iD2;
            do {
                vVar.f(this.f11986a.t());
            } while (this.f11986a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw a0.e();
        }
        do {
            vVar.f(this.f11986a.t());
            if (this.f11986a.f()) {
                return;
            } else {
                iC2 = this.f11986a.C();
            }
        } while (iC2 == this.f11987b);
        this.f11989d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public boolean C() {
        int i15;
        if (this.f11986a.f() || (i15 = this.f11987b) == this.f11988c) {
            return false;
        }
        return this.f11986a.F(i15);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int D() throws a0.a {
        X(5);
        return this.f11986a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void E(List<g> list) throws a0.a {
        int iC;
        if (s1.b(this.f11987b) != 2) {
            throw a0.e();
        }
        do {
            list.add(n());
            if (this.f11986a.f()) {
                return;
            } else {
                iC = this.f11986a.C();
            }
        } while (iC == this.f11987b);
        this.f11989d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void F(List<Double> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof l)) {
            int iB = s1.b(this.f11987b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f11986a.p()));
                    if (this.f11986a.f()) {
                        return;
                    } else {
                        iC = this.f11986a.C();
                    }
                } while (iC == this.f11987b);
                this.f11989d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iD = this.f11986a.D();
            Z(iD);
            int iE = this.f11986a.e() + iD;
            do {
                list.add(Double.valueOf(this.f11986a.p()));
            } while (this.f11986a.e() < iE);
            return;
        }
        l lVar = (l) list;
        int iB2 = s1.b(this.f11987b);
        if (iB2 == 1) {
            do {
                lVar.f(this.f11986a.p());
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC2 = this.f11986a.C();
                }
            } while (iC2 == this.f11987b);
            this.f11989d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iD2 = this.f11986a.D();
        Z(iD2);
        int iE2 = this.f11986a.e() + iD2;
        do {
            lVar.f(this.f11986a.p());
        } while (this.f11986a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long G() throws a0.a {
        X(0);
        return this.f11986a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public String H() throws a0.a {
        X(2);
        return this.f11986a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> void I(T t15, g1<T> g1Var, o oVar) throws a0 {
        X(2);
        R(t15, g1Var, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> void J(List<T> list, g1<T> g1Var, o oVar) throws a0.a {
        int iC;
        if (s1.b(this.f11987b) != 2) {
            throw a0.e();
        }
        int i15 = this.f11987b;
        do {
            list.add(U(g1Var, oVar));
            if (this.f11986a.f() || this.f11989d != 0) {
                return;
            } else {
                iC = this.f11986a.C();
            }
        } while (iC == i15);
        this.f11989d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> T K(Class<T> cls, o oVar) throws a0.a {
        X(2);
        return (T) U(c1.a().c(cls), oVar);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    @Deprecated
    public <T> T L(Class<T> cls, o oVar) throws a0.a {
        X(3);
        return (T) T(c1.a().c(cls), oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f1
    public <K, V> void M(Map<K, V> map, k0.a<K, V> aVar, o oVar) throws a0.a {
        X(2);
        int iM = this.f11986a.m(this.f11986a.D());
        Object objS = aVar.f12038b;
        Object objS2 = aVar.f12040d;
        while (true) {
            try {
                int iZ = z();
                if (iZ == Integer.MAX_VALUE || this.f11986a.f()) {
                    break;
                }
                if (iZ == 1) {
                    objS = S(aVar.f12037a, null, null);
                } else if (iZ != 2) {
                    try {
                        if (!C()) {
                            throw new a0("Unable to parse map entry.");
                        }
                    } catch (a0.a unused) {
                        if (!C()) {
                            throw new a0("Unable to parse map entry.");
                        }
                    }
                } else {
                    objS2 = S(aVar.f12039c, aVar.f12040d.getClass(), oVar);
                }
            } catch (Throwable th4) {
                this.f11986a.l(iM);
                throw th4;
            }
        }
        map.put(objS, objS2);
        this.f11986a.l(iM);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public <T> void N(T t15, g1<T> g1Var, o oVar) throws a0.a {
        X(3);
        Q(t15, g1Var, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.f1
    @Deprecated
    public <T> void O(List<T> list, g1<T> g1Var, o oVar) throws a0.a {
        int iC;
        if (s1.b(this.f11987b) != 3) {
            throw a0.e();
        }
        int i15 = this.f11987b;
        do {
            list.add(T(g1Var, oVar));
            if (this.f11986a.f() || this.f11989d != 0) {
                return;
            } else {
                iC = this.f11986a.C();
            }
        } while (iC == i15);
        this.f11989d = iC;
    }

    public void V(List<String> list, boolean z15) throws a0.a {
        int iC;
        int iC2;
        if (s1.b(this.f11987b) != 2) {
            throw a0.e();
        }
        if (!(list instanceof e0) || z15) {
            do {
                list.add(z15 ? H() : y());
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC = this.f11986a.C();
                }
            } while (iC == this.f11987b);
            this.f11989d = iC;
            return;
        }
        e0 e0Var = (e0) list;
        do {
            e0Var.R2(n());
            if (this.f11986a.f()) {
                return;
            } else {
                iC2 = this.f11986a.C();
            }
        } while (iC2 == this.f11987b);
        this.f11989d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long a() throws a0.a {
        X(1);
        return this.f11986a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void b(List<Integer> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof y)) {
            int iB = s1.b(this.f11987b);
            if (iB == 2) {
                int iD = this.f11986a.D();
                Y(iD);
                int iE = this.f11986a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f11986a.w()));
                } while (this.f11986a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw a0.e();
            }
            do {
                list.add(Integer.valueOf(this.f11986a.w()));
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC = this.f11986a.C();
                }
            } while (iC == this.f11987b);
            this.f11989d = iC;
            return;
        }
        y yVar = (y) list;
        int iB2 = s1.b(this.f11987b);
        if (iB2 == 2) {
            int iD2 = this.f11986a.D();
            Y(iD2);
            int iE2 = this.f11986a.e() + iD2;
            do {
                yVar.h(this.f11986a.w());
            } while (this.f11986a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw a0.e();
        }
        do {
            yVar.h(this.f11986a.w());
            if (this.f11986a.f()) {
                return;
            } else {
                iC2 = this.f11986a.C();
            }
        } while (iC2 == this.f11987b);
        this.f11989d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void c(List<Long> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof i0)) {
            int iB = s1.b(this.f11987b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f11986a.z()));
                    if (this.f11986a.f()) {
                        return;
                    } else {
                        iC = this.f11986a.C();
                    }
                } while (iC == this.f11987b);
                this.f11989d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f11986a.e() + this.f11986a.D();
            do {
                list.add(Long.valueOf(this.f11986a.z()));
            } while (this.f11986a.e() < iE);
            W(iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = s1.b(this.f11987b);
        if (iB2 == 0) {
            do {
                i0Var.i(this.f11986a.z());
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC2 = this.f11986a.C();
                }
            } while (iC2 == this.f11987b);
            this.f11989d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f11986a.e() + this.f11986a.D();
        do {
            i0Var.i(this.f11986a.z());
        } while (this.f11986a.e() < iE2);
        W(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public boolean d() throws a0.a {
        X(0);
        return this.f11986a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long e() throws a0.a {
        X(1);
        return this.f11986a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void f(List<Long> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof i0)) {
            int iB = s1.b(this.f11987b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f11986a.E()));
                    if (this.f11986a.f()) {
                        return;
                    } else {
                        iC = this.f11986a.C();
                    }
                } while (iC == this.f11987b);
                this.f11989d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f11986a.e() + this.f11986a.D();
            do {
                list.add(Long.valueOf(this.f11986a.E()));
            } while (this.f11986a.e() < iE);
            W(iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = s1.b(this.f11987b);
        if (iB2 == 0) {
            do {
                i0Var.i(this.f11986a.E());
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC2 = this.f11986a.C();
                }
            } while (iC2 == this.f11987b);
            this.f11989d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f11986a.e() + this.f11986a.D();
        do {
            i0Var.i(this.f11986a.E());
        } while (this.f11986a.e() < iE2);
        W(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int g() throws a0.a {
        X(0);
        return this.f11986a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int getTag() {
        return this.f11987b;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void h(List<Long> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof i0)) {
            int iB = s1.b(this.f11987b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f11986a.v()));
                    if (this.f11986a.f()) {
                        return;
                    } else {
                        iC = this.f11986a.C();
                    }
                } while (iC == this.f11987b);
                this.f11989d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f11986a.e() + this.f11986a.D();
            do {
                list.add(Long.valueOf(this.f11986a.v()));
            } while (this.f11986a.e() < iE);
            W(iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = s1.b(this.f11987b);
        if (iB2 == 0) {
            do {
                i0Var.i(this.f11986a.v());
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC2 = this.f11986a.C();
                }
            } while (iC2 == this.f11987b);
            this.f11989d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f11986a.e() + this.f11986a.D();
        do {
            i0Var.i(this.f11986a.v());
        } while (this.f11986a.e() < iE2);
        W(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void i(List<Integer> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof y)) {
            int iB = s1.b(this.f11987b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f11986a.q()));
                    if (this.f11986a.f()) {
                        return;
                    } else {
                        iC = this.f11986a.C();
                    }
                } while (iC == this.f11987b);
                this.f11989d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f11986a.e() + this.f11986a.D();
            do {
                list.add(Integer.valueOf(this.f11986a.q()));
            } while (this.f11986a.e() < iE);
            W(iE);
            return;
        }
        y yVar = (y) list;
        int iB2 = s1.b(this.f11987b);
        if (iB2 == 0) {
            do {
                yVar.h(this.f11986a.q());
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC2 = this.f11986a.C();
                }
            } while (iC2 == this.f11987b);
            this.f11989d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f11986a.e() + this.f11986a.D();
        do {
            yVar.h(this.f11986a.q());
        } while (this.f11986a.e() < iE2);
        W(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int j() throws a0.a {
        X(0);
        return this.f11986a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int k() throws a0.a {
        X(0);
        return this.f11986a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void l(List<Boolean> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof e)) {
            int iB = s1.b(this.f11987b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f11986a.n()));
                    if (this.f11986a.f()) {
                        return;
                    } else {
                        iC = this.f11986a.C();
                    }
                } while (iC == this.f11987b);
                this.f11989d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f11986a.e() + this.f11986a.D();
            do {
                list.add(Boolean.valueOf(this.f11986a.n()));
            } while (this.f11986a.e() < iE);
            W(iE);
            return;
        }
        e eVar = (e) list;
        int iB2 = s1.b(this.f11987b);
        if (iB2 == 0) {
            do {
                eVar.f(this.f11986a.n());
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC2 = this.f11986a.C();
                }
            } while (iC2 == this.f11987b);
            this.f11989d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f11986a.e() + this.f11986a.D();
        do {
            eVar.f(this.f11986a.n());
        } while (this.f11986a.e() < iE2);
        W(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void m(List<String> list) throws a0.a {
        V(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public g n() throws a0.a {
        X(2);
        return this.f11986a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int o() throws a0.a {
        X(0);
        return this.f11986a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void p(List<Long> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof i0)) {
            int iB = s1.b(this.f11987b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f11986a.s()));
                    if (this.f11986a.f()) {
                        return;
                    } else {
                        iC = this.f11986a.C();
                    }
                } while (iC == this.f11987b);
                this.f11989d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iD = this.f11986a.D();
            Z(iD);
            int iE = this.f11986a.e() + iD;
            do {
                list.add(Long.valueOf(this.f11986a.s()));
            } while (this.f11986a.e() < iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = s1.b(this.f11987b);
        if (iB2 == 1) {
            do {
                i0Var.i(this.f11986a.s());
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC2 = this.f11986a.C();
                }
            } while (iC2 == this.f11987b);
            this.f11989d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iD2 = this.f11986a.D();
        Z(iD2);
        int iE2 = this.f11986a.e() + iD2;
        do {
            i0Var.i(this.f11986a.s());
        } while (this.f11986a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void q(List<Integer> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof y)) {
            int iB = s1.b(this.f11987b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f11986a.y()));
                    if (this.f11986a.f()) {
                        return;
                    } else {
                        iC = this.f11986a.C();
                    }
                } while (iC == this.f11987b);
                this.f11989d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f11986a.e() + this.f11986a.D();
            do {
                list.add(Integer.valueOf(this.f11986a.y()));
            } while (this.f11986a.e() < iE);
            W(iE);
            return;
        }
        y yVar = (y) list;
        int iB2 = s1.b(this.f11987b);
        if (iB2 == 0) {
            do {
                yVar.h(this.f11986a.y());
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC2 = this.f11986a.C();
                }
            } while (iC2 == this.f11987b);
            this.f11989d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f11986a.e() + this.f11986a.D();
        do {
            yVar.h(this.f11986a.y());
        } while (this.f11986a.e() < iE2);
        W(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long r() throws a0.a {
        X(0);
        return this.f11986a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public double readDouble() throws a0.a {
        X(1);
        return this.f11986a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public float readFloat() throws a0.a {
        X(5);
        return this.f11986a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void s(List<Integer> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof y)) {
            int iB = s1.b(this.f11987b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f11986a.D()));
                    if (this.f11986a.f()) {
                        return;
                    } else {
                        iC = this.f11986a.C();
                    }
                } while (iC == this.f11987b);
                this.f11989d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f11986a.e() + this.f11986a.D();
            do {
                list.add(Integer.valueOf(this.f11986a.D()));
            } while (this.f11986a.e() < iE);
            W(iE);
            return;
        }
        y yVar = (y) list;
        int iB2 = s1.b(this.f11987b);
        if (iB2 == 0) {
            do {
                yVar.h(this.f11986a.D());
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC2 = this.f11986a.C();
                }
            } while (iC2 == this.f11987b);
            this.f11989d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f11986a.e() + this.f11986a.D();
        do {
            yVar.h(this.f11986a.D());
        } while (this.f11986a.e() < iE2);
        W(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int t() throws a0.a {
        X(5);
        return this.f11986a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void u(List<Long> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof i0)) {
            int iB = s1.b(this.f11987b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f11986a.x()));
                    if (this.f11986a.f()) {
                        return;
                    } else {
                        iC = this.f11986a.C();
                    }
                } while (iC == this.f11987b);
                this.f11989d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iD = this.f11986a.D();
            Z(iD);
            int iE = this.f11986a.e() + iD;
            do {
                list.add(Long.valueOf(this.f11986a.x()));
            } while (this.f11986a.e() < iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = s1.b(this.f11987b);
        if (iB2 == 1) {
            do {
                i0Var.i(this.f11986a.x());
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC2 = this.f11986a.C();
                }
            } while (iC2 == this.f11987b);
            this.f11989d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iD2 = this.f11986a.D();
        Z(iD2);
        int iE2 = this.f11986a.e() + iD2;
        do {
            i0Var.i(this.f11986a.x());
        } while (this.f11986a.e() < iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void v(List<Integer> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof y)) {
            int iB = s1.b(this.f11987b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f11986a.u()));
                    if (this.f11986a.f()) {
                        return;
                    } else {
                        iC = this.f11986a.C();
                    }
                } while (iC == this.f11987b);
                this.f11989d = iC;
                return;
            }
            if (iB != 2) {
                throw a0.e();
            }
            int iE = this.f11986a.e() + this.f11986a.D();
            do {
                list.add(Integer.valueOf(this.f11986a.u()));
            } while (this.f11986a.e() < iE);
            W(iE);
            return;
        }
        y yVar = (y) list;
        int iB2 = s1.b(this.f11987b);
        if (iB2 == 0) {
            do {
                yVar.h(this.f11986a.u());
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC2 = this.f11986a.C();
                }
            } while (iC2 == this.f11987b);
            this.f11989d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw a0.e();
        }
        int iE2 = this.f11986a.e() + this.f11986a.D();
        do {
            yVar.h(this.f11986a.u());
        } while (this.f11986a.e() < iE2);
        W(iE2);
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public void w(List<Integer> list) throws a0 {
        int iC;
        int iC2;
        if (!(list instanceof y)) {
            int iB = s1.b(this.f11987b);
            if (iB == 2) {
                int iD = this.f11986a.D();
                Y(iD);
                int iE = this.f11986a.e() + iD;
                do {
                    list.add(Integer.valueOf(this.f11986a.r()));
                } while (this.f11986a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw a0.e();
            }
            do {
                list.add(Integer.valueOf(this.f11986a.r()));
                if (this.f11986a.f()) {
                    return;
                } else {
                    iC = this.f11986a.C();
                }
            } while (iC == this.f11987b);
            this.f11989d = iC;
            return;
        }
        y yVar = (y) list;
        int iB2 = s1.b(this.f11987b);
        if (iB2 == 2) {
            int iD2 = this.f11986a.D();
            Y(iD2);
            int iE2 = this.f11986a.e() + iD2;
            do {
                yVar.h(this.f11986a.r());
            } while (this.f11986a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw a0.e();
        }
        do {
            yVar.h(this.f11986a.r());
            if (this.f11986a.f()) {
                return;
            } else {
                iC2 = this.f11986a.C();
            }
        } while (iC2 == this.f11987b);
        this.f11989d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public long x() throws a0.a {
        X(0);
        return this.f11986a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public String y() throws a0.a {
        X(2);
        return this.f11986a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public int z() {
        int i15 = this.f11989d;
        if (i15 != 0) {
            this.f11987b = i15;
            this.f11989d = 0;
        } else {
            this.f11987b = this.f11986a.C();
        }
        int i16 = this.f11987b;
        if (i16 == 0 || i16 == this.f11988c) {
            return Integer.MAX_VALUE;
        }
        return s1.a(i16);
    }
}
