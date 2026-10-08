package com.google.android.libraries.places.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class yx implements u00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xx f34441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34444d = 0;

    private yx(xx xxVar) {
        this.f34441a = xxVar;
        xxVar.f34320e = this;
    }

    private final void Q(int i15) throws kz {
        if ((this.f34442b & 7) != i15) {
            throw new kz("Protocol message tag had invalid wire type.");
        }
    }

    private final void R(Object obj, v00 v00Var, ly lyVar) throws lz {
        xx xxVar = this.f34441a;
        int iB = xxVar.B();
        xxVar.h();
        int iA = xxVar.a(iB);
        xxVar.f34316a++;
        v00Var.f(obj, this, lyVar);
        xxVar.o(0);
        xxVar.f34316a--;
        xxVar.b(iA);
    }

    private final Object S(v00 v00Var, ly lyVar) throws lz {
        Object objZza = v00Var.zza();
        R(objZza, v00Var, lyVar);
        v00Var.h(objZza);
        return objZza;
    }

    private final void T(Object obj, v00 v00Var, ly lyVar) {
        int i15 = this.f34443c;
        this.f34443c = ((this.f34442b >>> 3) << 3) | 4;
        try {
            v00Var.f(obj, this, lyVar);
            if (this.f34442b != this.f34443c) {
                throw new lz("Failed to parse the message.");
            }
            this.f34443c = i15;
        } catch (Throwable th4) {
            this.f34443c = i15;
            throw th4;
        }
    }

    private final Object U(v00 v00Var, ly lyVar) {
        Object objZza = v00Var.zza();
        T(objZza, v00Var, lyVar);
        v00Var.h(objZza);
        return objZza;
    }

    private final Object V(u10 u10Var, Class cls, ly lyVar) {
        u10 u10Var2 = u10.f33827c;
        switch (u10Var.ordinal()) {
            case 0:
                return Double.valueOf(d());
            case 1:
                return Float.valueOf(f());
            case 2:
                return Long.valueOf(j());
            case 3:
                return Long.valueOf(i());
            case 4:
                return Integer.valueOf(o());
            case 5:
                return Long.valueOf(k());
            case 6:
                return Integer.valueOf(h());
            case 7:
                return Boolean.valueOf(A());
            case 8:
                return b();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return g(cls, lyVar);
            case 11:
                return M();
            case 12:
                return Integer.valueOf(O());
            case 13:
                return Integer.valueOf(I());
            case 14:
                return Integer.valueOf(J());
            case 15:
                return Long.valueOf(K());
            case 16:
                return Integer.valueOf(v());
            case 17:
                return Long.valueOf(l());
        }
    }

    private final void W(int i15) throws lz {
        if (this.f34441a.d() != i15) {
            throw new lz("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void X(int i15) throws lz {
        if ((i15 & 3) != 0) {
            throw new lz("Failed to parse the message.");
        }
    }

    public static yx Y(xx xxVar) {
        Object obj = xxVar.f34320e;
        return obj != null ? (yx) obj : new yx(xxVar);
    }

    private static final void Z(int i15) throws lz {
        if ((i15 & 7) != 0) {
            throw new lz("Failed to parse the message.");
        }
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final boolean A() throws kz {
        Q(0);
        return this.f34441a.x();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void B(Map map, yz yzVar, ly lyVar) throws kz {
        Q(2);
        xx xxVar = this.f34441a;
        int iA = xxVar.a(xxVar.B());
        Object obj = yzVar.f34454d;
        Object objV = yzVar.f34452b;
        Object objV2 = obj;
        while (true) {
            try {
                int iZzb = zzb();
                if (iZzb == Integer.MAX_VALUE || xxVar.c()) {
                    break;
                }
                if (iZzb == 1) {
                    objV = V(yzVar.f34451a, null, null);
                } else if (iZzb != 2) {
                    try {
                        if (!c()) {
                            throw new lz("Unable to parse map entry.");
                        }
                    } catch (kz e15) {
                        if (!c()) {
                            throw new lz("Unable to parse map entry.", e15);
                        }
                    }
                } else {
                    objV2 = V(yzVar.f34453c, obj.getClass(), lyVar);
                }
            } catch (Throwable th4) {
                this.f34441a.b(iA);
                throw th4;
            }
        }
        map.put(objV, objV2);
        this.f34441a.b(iA);
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void C(Object obj, v00 v00Var, ly lyVar) throws kz {
        Q(3);
        T(obj, v00Var, lyVar);
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void D(List list) throws lz {
        int iN;
        int iN2;
        if (list instanceof uz) {
            uz uzVar = (uz) list;
            int i15 = this.f34442b & 7;
            if (i15 != 0) {
                if (i15 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar = this.f34441a;
                int iD = xxVar.d() + xxVar.B();
                do {
                    uzVar.j(xxVar.s());
                } while (xxVar.d() < iD);
                W(iD);
                return;
            }
            do {
                xx xxVar2 = this.f34441a;
                uzVar.j(xxVar2.s());
                if (xxVar2.c()) {
                    return;
                } else {
                    iN2 = xxVar2.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            int i16 = this.f34442b & 7;
            if (i16 != 0) {
                if (i16 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar3 = this.f34441a;
                int iD2 = xxVar3.d() + xxVar3.B();
                do {
                    list.add(Long.valueOf(xxVar3.s()));
                } while (xxVar3.d() < iD2);
                W(iD2);
                return;
            }
            do {
                xx xxVar4 = this.f34441a;
                list.add(Long.valueOf(xxVar4.s()));
                if (xxVar4.c()) {
                    return;
                } else {
                    iN = xxVar4.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void E(List list) throws lz {
        int iN;
        int iN2;
        if (list instanceof bz) {
            bz bzVar = (bz) list;
            int i15 = this.f34442b & 7;
            if (i15 == 2) {
                xx xxVar = this.f34441a;
                int iB = xxVar.B();
                X(iB);
                int iD = xxVar.d() + iB;
                do {
                    bzVar.D(xxVar.D());
                } while (xxVar.d() < iD);
                return;
            }
            if (i15 != 5) {
                throw new kz("Protocol message tag had invalid wire type.");
            }
            do {
                xx xxVar2 = this.f34441a;
                bzVar.D(xxVar2.D());
                if (xxVar2.c()) {
                    return;
                } else {
                    iN2 = xxVar2.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            int i16 = this.f34442b & 7;
            if (i16 == 2) {
                xx xxVar3 = this.f34441a;
                int iB2 = xxVar3.B();
                X(iB2);
                int iD2 = xxVar3.d() + iB2;
                do {
                    list.add(Integer.valueOf(xxVar3.D()));
                } while (xxVar3.d() < iD2);
                return;
            }
            if (i16 != 5) {
                throw new kz("Protocol message tag had invalid wire type.");
            }
            do {
                xx xxVar4 = this.f34441a;
                list.add(Integer.valueOf(xxVar4.D()));
                if (xxVar4.c()) {
                    return;
                } else {
                    iN = xxVar4.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void F(List list) throws lz {
        int iN;
        int iN2;
        if (list instanceof bz) {
            bz bzVar = (bz) list;
            int i15 = this.f34442b & 7;
            if (i15 != 0) {
                if (i15 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar = this.f34441a;
                int iD = xxVar.d() + xxVar.B();
                do {
                    bzVar.D(xxVar.C());
                } while (xxVar.d() < iD);
                W(iD);
                return;
            }
            do {
                xx xxVar2 = this.f34441a;
                bzVar.D(xxVar2.C());
                if (xxVar2.c()) {
                    return;
                } else {
                    iN2 = xxVar2.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            int i16 = this.f34442b & 7;
            if (i16 != 0) {
                if (i16 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar3 = this.f34441a;
                int iD2 = xxVar3.d() + xxVar3.B();
                do {
                    list.add(Integer.valueOf(xxVar3.C()));
                } while (xxVar3.d() < iD2);
                W(iD2);
                return;
            }
            do {
                xx xxVar4 = this.f34441a;
                list.add(Integer.valueOf(xxVar4.C()));
                if (xxVar4.c()) {
                    return;
                } else {
                    iN = xxVar4.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void G(List list) throws lz {
        int iN;
        int iN2;
        if (list instanceof bz) {
            bz bzVar = (bz) list;
            int i15 = this.f34442b & 7;
            if (i15 != 0) {
                if (i15 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar = this.f34441a;
                int iD = xxVar.d() + xxVar.B();
                do {
                    bzVar.D(xxVar.F());
                } while (xxVar.d() < iD);
                W(iD);
                return;
            }
            do {
                xx xxVar2 = this.f34441a;
                bzVar.D(xxVar2.F());
                if (xxVar2.c()) {
                    return;
                } else {
                    iN2 = xxVar2.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            int i16 = this.f34442b & 7;
            if (i16 != 0) {
                if (i16 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar3 = this.f34441a;
                int iD2 = xxVar3.d() + xxVar3.B();
                do {
                    list.add(Integer.valueOf(xxVar3.F()));
                } while (xxVar3.d() < iD2);
                W(iD2);
                return;
            }
            do {
                xx xxVar4 = this.f34441a;
                list.add(Integer.valueOf(xxVar4.F()));
                if (xxVar4.c()) {
                    return;
                } else {
                    iN = xxVar4.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void H(List list) throws lz {
        int iN;
        int iN2;
        if (list instanceof uz) {
            uz uzVar = (uz) list;
            int i15 = this.f34442b & 7;
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar = this.f34441a;
                int iB = xxVar.B();
                Z(iB);
                int iD = xxVar.d() + iB;
                do {
                    uzVar.j(xxVar.E());
                } while (xxVar.d() < iD);
                return;
            }
            do {
                xx xxVar2 = this.f34441a;
                uzVar.j(xxVar2.E());
                if (xxVar2.c()) {
                    return;
                } else {
                    iN2 = xxVar2.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            int i16 = this.f34442b & 7;
            if (i16 != 1) {
                if (i16 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar3 = this.f34441a;
                int iB2 = xxVar3.B();
                Z(iB2);
                int iD2 = xxVar3.d() + iB2;
                do {
                    list.add(Long.valueOf(xxVar3.E()));
                } while (xxVar3.d() < iD2);
                return;
            }
            do {
                xx xxVar4 = this.f34441a;
                list.add(Long.valueOf(xxVar4.E()));
                if (xxVar4.c()) {
                    return;
                } else {
                    iN = xxVar4.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final int I() throws kz {
        Q(0);
        return this.f34441a.C();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final int J() throws kz {
        Q(5);
        return this.f34441a.D();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final long K() throws kz {
        Q(1);
        return this.f34441a.E();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void L(List list) throws lz {
        int iN;
        int iN2;
        if (list instanceof bz) {
            bz bzVar = (bz) list;
            int i15 = this.f34442b & 7;
            if (i15 != 0) {
                if (i15 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar = this.f34441a;
                int iD = xxVar.d() + xxVar.B();
                do {
                    bzVar.D(xxVar.B());
                } while (xxVar.d() < iD);
                W(iD);
                return;
            }
            do {
                xx xxVar2 = this.f34441a;
                bzVar.D(xxVar2.B());
                if (xxVar2.c()) {
                    return;
                } else {
                    iN2 = xxVar2.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            int i16 = this.f34442b & 7;
            if (i16 != 0) {
                if (i16 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar3 = this.f34441a;
                int iD2 = xxVar3.d() + xxVar3.B();
                do {
                    list.add(Integer.valueOf(xxVar3.B()));
                } while (xxVar3.d() < iD2);
                W(iD2);
                return;
            }
            do {
                xx xxVar4 = this.f34441a;
                list.add(Integer.valueOf(xxVar4.B()));
                if (xxVar4.c()) {
                    return;
                } else {
                    iN = xxVar4.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final tx M() throws kz {
        Q(2);
        return this.f34441a.A();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void N(List list) throws kz {
        int iN;
        if ((this.f34442b & 7) != 2) {
            throw new kz("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(M());
            xx xxVar = this.f34441a;
            if (xxVar.c()) {
                return;
            } else {
                iN = xxVar.n();
            }
        } while (iN == this.f34442b);
        this.f34444d = iN;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final int O() throws kz {
        Q(0);
        return this.f34441a.B();
    }

    public final void P(List list, boolean z15) throws kz {
        int iN;
        int iN2;
        if ((this.f34442b & 7) != 2) {
            throw new kz("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof rz) && !z15) {
            rz rzVar = (rz) list;
            do {
                M();
                rzVar.zzb();
                xx xxVar = this.f34441a;
                if (xxVar.c()) {
                    return;
                } else {
                    iN2 = xxVar.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            do {
                list.add(z15 ? b() : q());
                xx xxVar2 = this.f34441a;
                if (xxVar2.c()) {
                    return;
                } else {
                    iN = xxVar2.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final int a() {
        return this.f34442b;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final String b() throws kz {
        Q(2);
        return this.f34441a.z();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final boolean c() {
        int i15;
        xx xxVar = this.f34441a;
        if (xxVar.c() || (i15 = this.f34442b) == this.f34443c) {
            return false;
        }
        return xxVar.p(i15);
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final double d() throws kz {
        Q(1);
        return this.f34441a.q();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void e(List list, v00 v00Var, ly lyVar) throws kz {
        int iN;
        int i15 = this.f34442b;
        if ((i15 & 7) != 2) {
            throw new kz("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(S(v00Var, lyVar));
            xx xxVar = this.f34441a;
            if (xxVar.c() || this.f34444d != 0) {
                return;
            } else {
                iN = xxVar.n();
            }
        } while (iN == i15);
        this.f34444d = iN;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final float f() throws kz {
        Q(5);
        return this.f34441a.r();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final Object g(Class cls, ly lyVar) throws kz {
        Q(2);
        return S(r00.a().b(cls), lyVar);
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final int h() throws kz {
        Q(5);
        return this.f34441a.w();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final long i() throws kz {
        Q(0);
        return this.f34441a.s();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final long j() throws kz {
        Q(0);
        return this.f34441a.t();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final long k() throws kz {
        Q(1);
        return this.f34441a.v();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final long l() throws kz {
        Q(0);
        return this.f34441a.G();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void m(List list) throws lz {
        int iN;
        int iN2;
        if (list instanceof uz) {
            uz uzVar = (uz) list;
            int i15 = this.f34442b & 7;
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar = this.f34441a;
                int iB = xxVar.B();
                Z(iB);
                int iD = xxVar.d() + iB;
                do {
                    uzVar.j(xxVar.v());
                } while (xxVar.d() < iD);
                return;
            }
            do {
                xx xxVar2 = this.f34441a;
                uzVar.j(xxVar2.v());
                if (xxVar2.c()) {
                    return;
                } else {
                    iN2 = xxVar2.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            int i16 = this.f34442b & 7;
            if (i16 != 1) {
                if (i16 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar3 = this.f34441a;
                int iB2 = xxVar3.B();
                Z(iB2);
                int iD2 = xxVar3.d() + iB2;
                do {
                    list.add(Long.valueOf(xxVar3.v()));
                } while (xxVar3.d() < iD2);
                return;
            }
            do {
                xx xxVar4 = this.f34441a;
                list.add(Long.valueOf(xxVar4.v()));
                if (xxVar4.c()) {
                    return;
                } else {
                    iN = xxVar4.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    @Deprecated
    public final void n(List list, v00 v00Var, ly lyVar) throws kz {
        int iN;
        int i15 = this.f34442b;
        if ((i15 & 7) != 3) {
            throw new kz("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(U(v00Var, lyVar));
            xx xxVar = this.f34441a;
            if (xxVar.c() || this.f34444d != 0) {
                return;
            } else {
                iN = xxVar.n();
            }
        } while (iN == i15);
        this.f34444d = iN;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final int o() throws kz {
        Q(0);
        return this.f34441a.u();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void p(List list) throws lz {
        int iN;
        int iN2;
        if (list instanceof bz) {
            bz bzVar = (bz) list;
            int i15 = this.f34442b & 7;
            if (i15 != 0) {
                if (i15 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar = this.f34441a;
                int iD = xxVar.d() + xxVar.B();
                do {
                    bzVar.D(xxVar.u());
                } while (xxVar.d() < iD);
                W(iD);
                return;
            }
            do {
                xx xxVar2 = this.f34441a;
                bzVar.D(xxVar2.u());
                if (xxVar2.c()) {
                    return;
                } else {
                    iN2 = xxVar2.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            int i16 = this.f34442b & 7;
            if (i16 != 0) {
                if (i16 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar3 = this.f34441a;
                int iD2 = xxVar3.d() + xxVar3.B();
                do {
                    list.add(Integer.valueOf(xxVar3.u()));
                } while (xxVar3.d() < iD2);
                W(iD2);
                return;
            }
            do {
                xx xxVar4 = this.f34441a;
                list.add(Integer.valueOf(xxVar4.u()));
                if (xxVar4.c()) {
                    return;
                } else {
                    iN = xxVar4.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final String q() throws kz {
        Q(2);
        return this.f34441a.y();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void r(List list) throws lz {
        int iN;
        int iN2;
        if (list instanceof lx) {
            lx lxVar = (lx) list;
            int i15 = this.f34442b & 7;
            if (i15 != 0) {
                if (i15 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar = this.f34441a;
                int iD = xxVar.d() + xxVar.B();
                do {
                    lxVar.h(xxVar.x());
                } while (xxVar.d() < iD);
                W(iD);
                return;
            }
            do {
                xx xxVar2 = this.f34441a;
                lxVar.h(xxVar2.x());
                if (xxVar2.c()) {
                    return;
                } else {
                    iN2 = xxVar2.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            int i16 = this.f34442b & 7;
            if (i16 != 0) {
                if (i16 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar3 = this.f34441a;
                int iD2 = xxVar3.d() + xxVar3.B();
                do {
                    list.add(Boolean.valueOf(xxVar3.x()));
                } while (xxVar3.d() < iD2);
                W(iD2);
                return;
            }
            do {
                xx xxVar4 = this.f34441a;
                list.add(Boolean.valueOf(xxVar4.x()));
                if (xxVar4.c()) {
                    return;
                } else {
                    iN = xxVar4.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    @Deprecated
    public final Object s(Class cls, ly lyVar) throws kz {
        Q(3);
        return U(r00.a().b(cls), lyVar);
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void t(List list) throws lz {
        int iN;
        int iN2;
        if (list instanceof fy) {
            fy fyVar = (fy) list;
            int i15 = this.f34442b & 7;
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar = this.f34441a;
                int iB = xxVar.B();
                Z(iB);
                int iD = xxVar.d() + iB;
                do {
                    fyVar.h(xxVar.q());
                } while (xxVar.d() < iD);
                return;
            }
            do {
                xx xxVar2 = this.f34441a;
                fyVar.h(xxVar2.q());
                if (xxVar2.c()) {
                    return;
                } else {
                    iN2 = xxVar2.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            int i16 = this.f34442b & 7;
            if (i16 != 1) {
                if (i16 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar3 = this.f34441a;
                int iB2 = xxVar3.B();
                Z(iB2);
                int iD2 = xxVar3.d() + iB2;
                do {
                    list.add(Double.valueOf(xxVar3.q()));
                } while (xxVar3.d() < iD2);
                return;
            }
            do {
                xx xxVar4 = this.f34441a;
                list.add(Double.valueOf(xxVar4.q()));
                if (xxVar4.c()) {
                    return;
                } else {
                    iN = xxVar4.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void u(List list) throws lz {
        int iN;
        int iN2;
        if (list instanceof bz) {
            bz bzVar = (bz) list;
            int i15 = this.f34442b & 7;
            if (i15 == 2) {
                xx xxVar = this.f34441a;
                int iB = xxVar.B();
                X(iB);
                int iD = xxVar.d() + iB;
                do {
                    bzVar.D(xxVar.w());
                } while (xxVar.d() < iD);
                return;
            }
            if (i15 != 5) {
                throw new kz("Protocol message tag had invalid wire type.");
            }
            do {
                xx xxVar2 = this.f34441a;
                bzVar.D(xxVar2.w());
                if (xxVar2.c()) {
                    return;
                } else {
                    iN2 = xxVar2.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            int i16 = this.f34442b & 7;
            if (i16 == 2) {
                xx xxVar3 = this.f34441a;
                int iB2 = xxVar3.B();
                X(iB2);
                int iD2 = xxVar3.d() + iB2;
                do {
                    list.add(Integer.valueOf(xxVar3.w()));
                } while (xxVar3.d() < iD2);
                return;
            }
            if (i16 != 5) {
                throw new kz("Protocol message tag had invalid wire type.");
            }
            do {
                xx xxVar4 = this.f34441a;
                list.add(Integer.valueOf(xxVar4.w()));
                if (xxVar4.c()) {
                    return;
                } else {
                    iN = xxVar4.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final int v() throws kz {
        Q(0);
        return this.f34441a.F();
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void w(List list) throws lz {
        int iN;
        int iN2;
        if (list instanceof sy) {
            sy syVar = (sy) list;
            int i15 = this.f34442b & 7;
            if (i15 == 2) {
                xx xxVar = this.f34441a;
                int iB = xxVar.B();
                X(iB);
                int iD = xxVar.d() + iB;
                do {
                    syVar.h(xxVar.r());
                } while (xxVar.d() < iD);
                return;
            }
            if (i15 != 5) {
                throw new kz("Protocol message tag had invalid wire type.");
            }
            do {
                xx xxVar2 = this.f34441a;
                syVar.h(xxVar2.r());
                if (xxVar2.c()) {
                    return;
                } else {
                    iN2 = xxVar2.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            int i16 = this.f34442b & 7;
            if (i16 == 2) {
                xx xxVar3 = this.f34441a;
                int iB2 = xxVar3.B();
                X(iB2);
                int iD2 = xxVar3.d() + iB2;
                do {
                    list.add(Float.valueOf(xxVar3.r()));
                } while (xxVar3.d() < iD2);
                return;
            }
            if (i16 != 5) {
                throw new kz("Protocol message tag had invalid wire type.");
            }
            do {
                xx xxVar4 = this.f34441a;
                list.add(Float.valueOf(xxVar4.r()));
                if (xxVar4.c()) {
                    return;
                } else {
                    iN = xxVar4.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void x(List list) throws lz {
        int iN;
        int iN2;
        if (list instanceof uz) {
            uz uzVar = (uz) list;
            int i15 = this.f34442b & 7;
            if (i15 != 0) {
                if (i15 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar = this.f34441a;
                int iD = xxVar.d() + xxVar.B();
                do {
                    uzVar.j(xxVar.G());
                } while (xxVar.d() < iD);
                W(iD);
                return;
            }
            do {
                xx xxVar2 = this.f34441a;
                uzVar.j(xxVar2.G());
                if (xxVar2.c()) {
                    return;
                } else {
                    iN2 = xxVar2.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            int i16 = this.f34442b & 7;
            if (i16 != 0) {
                if (i16 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar3 = this.f34441a;
                int iD2 = xxVar3.d() + xxVar3.B();
                do {
                    list.add(Long.valueOf(xxVar3.G()));
                } while (xxVar3.d() < iD2);
                W(iD2);
                return;
            }
            do {
                xx xxVar4 = this.f34441a;
                list.add(Long.valueOf(xxVar4.G()));
                if (xxVar4.c()) {
                    return;
                } else {
                    iN = xxVar4.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void y(Object obj, v00 v00Var, ly lyVar) throws lz {
        Q(2);
        R(obj, v00Var, lyVar);
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final void z(List list) throws lz {
        int iN;
        int iN2;
        if (list instanceof uz) {
            uz uzVar = (uz) list;
            int i15 = this.f34442b & 7;
            if (i15 != 0) {
                if (i15 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar = this.f34441a;
                int iD = xxVar.d() + xxVar.B();
                do {
                    uzVar.j(xxVar.t());
                } while (xxVar.d() < iD);
                W(iD);
                return;
            }
            do {
                xx xxVar2 = this.f34441a;
                uzVar.j(xxVar2.t());
                if (xxVar2.c()) {
                    return;
                } else {
                    iN2 = xxVar2.n();
                }
            } while (iN2 == this.f34442b);
        } else {
            int i16 = this.f34442b & 7;
            if (i16 != 0) {
                if (i16 != 2) {
                    throw new kz("Protocol message tag had invalid wire type.");
                }
                xx xxVar3 = this.f34441a;
                int iD2 = xxVar3.d() + xxVar3.B();
                do {
                    list.add(Long.valueOf(xxVar3.t()));
                } while (xxVar3.d() < iD2);
                W(iD2);
                return;
            }
            do {
                xx xxVar4 = this.f34441a;
                list.add(Long.valueOf(xxVar4.t()));
                if (xxVar4.c()) {
                    return;
                } else {
                    iN = xxVar4.n();
                }
            } while (iN == this.f34442b);
            iN2 = iN;
        }
        this.f34444d = iN2;
    }

    @Override // com.google.android.libraries.places.internal.u00
    public final int zzb() {
        int iN = this.f34444d;
        if (iN != 0) {
            this.f34442b = iN;
            this.f34444d = 0;
        } else {
            iN = this.f34441a.n();
            this.f34442b = iN;
        }
        if (iN == 0 || iN == this.f34443c) {
            return Integer.MAX_VALUE;
        }
        return iN >>> 3;
    }
}
