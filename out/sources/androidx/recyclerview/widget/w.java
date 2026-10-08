package androidx.recyclerview.widget;

import r0.a0;
import r0.l1;

/* JADX INFO: loaded from: classes3.dex */
class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final l1<RecyclerView.f0, a> f13430a = new l1<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a0<RecyclerView.f0> f13431b = new a0<>();

    static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static i6.f<a> f13432d = new i6.g(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView.m.c f13434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RecyclerView.m.c f13435c;

        private a() {
        }

        static void a() {
            while (f13432d.z() != null) {
            }
        }

        static a b() {
            a aVarZ = f13432d.z();
            return aVarZ == null ? new a() : aVarZ;
        }

        static void c(a aVar) {
            aVar.f13433a = 0;
            aVar.f13434b = null;
            aVar.f13435c = null;
            f13432d.A(aVar);
        }
    }

    interface b {
        void a(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void b(RecyclerView.f0 f0Var);

        void c(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    w() {
    }

    private RecyclerView.m.c l(RecyclerView.f0 f0Var, int i15) {
        a aVarK;
        RecyclerView.m.c cVar;
        int iD = this.f13430a.d(f0Var);
        if (iD >= 0 && (aVarK = this.f13430a.k(iD)) != null) {
            int i16 = aVarK.f13433a;
            if ((i16 & i15) != 0) {
                int i17 = (~i15) & i16;
                aVarK.f13433a = i17;
                if (i15 == 4) {
                    cVar = aVarK.f13434b;
                } else {
                    if (i15 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarK.f13435c;
                }
                if ((i17 & 12) == 0) {
                    this.f13430a.h(iD);
                    a.c(aVarK);
                }
                return cVar;
            }
        }
        return null;
    }

    void a(RecyclerView.f0 f0Var, RecyclerView.m.c cVar) {
        a aVarB = this.f13430a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f13430a.put(f0Var, aVarB);
        }
        aVarB.f13433a |= 2;
        aVarB.f13434b = cVar;
    }

    void b(RecyclerView.f0 f0Var) {
        a aVarB = this.f13430a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f13430a.put(f0Var, aVarB);
        }
        aVarB.f13433a |= 1;
    }

    void c(long j15, RecyclerView.f0 f0Var) {
        this.f13431b.m(j15, f0Var);
    }

    void d(RecyclerView.f0 f0Var, RecyclerView.m.c cVar) {
        a aVarB = this.f13430a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f13430a.put(f0Var, aVarB);
        }
        aVarB.f13435c = cVar;
        aVarB.f13433a |= 8;
    }

    void e(RecyclerView.f0 f0Var, RecyclerView.m.c cVar) {
        a aVarB = this.f13430a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f13430a.put(f0Var, aVarB);
        }
        aVarB.f13434b = cVar;
        aVarB.f13433a |= 4;
    }

    void f() {
        this.f13430a.clear();
        this.f13431b.b();
    }

    RecyclerView.f0 g(long j15) {
        return this.f13431b.g(j15);
    }

    boolean h(RecyclerView.f0 f0Var) {
        a aVar = this.f13430a.get(f0Var);
        return (aVar == null || (aVar.f13433a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.f0 f0Var) {
        a aVar = this.f13430a.get(f0Var);
        return (aVar == null || (aVar.f13433a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.f0 f0Var) {
        p(f0Var);
    }

    RecyclerView.m.c m(RecyclerView.f0 f0Var) {
        return l(f0Var, 8);
    }

    RecyclerView.m.c n(RecyclerView.f0 f0Var) {
        return l(f0Var, 4);
    }

    void o(b bVar) {
        for (int size = this.f13430a.getSize() - 1; size >= 0; size--) {
            RecyclerView.f0 f0VarF = this.f13430a.f(size);
            a aVarH = this.f13430a.h(size);
            int i15 = aVarH.f13433a;
            if ((i15 & 3) == 3) {
                bVar.b(f0VarF);
            } else if ((i15 & 1) != 0) {
                RecyclerView.m.c cVar = aVarH.f13434b;
                if (cVar == null) {
                    bVar.b(f0VarF);
                } else {
                    bVar.c(f0VarF, cVar, aVarH.f13435c);
                }
            } else if ((i15 & 14) == 14) {
                bVar.a(f0VarF, aVarH.f13434b, aVarH.f13435c);
            } else if ((i15 & 12) == 12) {
                bVar.d(f0VarF, aVarH.f13434b, aVarH.f13435c);
            } else if ((i15 & 4) != 0) {
                bVar.c(f0VarF, aVarH.f13434b, null);
            } else if ((i15 & 8) != 0) {
                bVar.a(f0VarF, aVarH.f13434b, aVarH.f13435c);
            }
            a.c(aVarH);
        }
    }

    void p(RecyclerView.f0 f0Var) {
        a aVar = this.f13430a.get(f0Var);
        if (aVar == null) {
            return;
        }
        aVar.f13433a &= -2;
    }

    void q(RecyclerView.f0 f0Var) {
        for (int iQ = this.f13431b.q() - 1; iQ >= 0; iQ--) {
            if (f0Var == this.f13431b.s(iQ)) {
                this.f13431b.p(iQ);
                break;
            }
        }
        a aVarRemove = this.f13430a.remove(f0Var);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
