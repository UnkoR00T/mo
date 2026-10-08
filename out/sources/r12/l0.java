package r12;

import d1.a3;
import d1.d3;
import d1.r3;
import f1.q0;
import i50.BaseScaffoldData;
import ju.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r0;
import p076m2.s0;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a5\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0011\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lr12/d;", "viewModel", "Loq/i0;", "x", "(Lr12/d;Lm2/r;I)V", "Lr12/d$a;", "state", "Lf2/al;", "snackBarHostState", "Li70/p;", "snackBarState", "Lka/a;", "Ln50/k;", "pagingItems", "p", "(Lr12/d$a;Lf2/al;Li70/p;Lka/a;Lm2/r;I)V", "Lr12/d$a$b$a;", "l", "(Lka/a;Lr12/d$a$b$a;Lm2/r;I)V", "Lr12/d$a$b$b;", "v", "(Lr12/d$a$b$b;Lm2/r;I)V", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170568e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ mu.f0<r12.b> f170569f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ka.a<n50.k> f170570g;

        /* JADX INFO: renamed from: r12.l0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C4324a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ka.a<n50.k> f170571a;

            C4324a(ka.a<n50.k> aVar) {
                this.f170571a = aVar;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(r12.b bVar, tq.e<? super oq.i0> eVar) {
                if (fr.t.c(bVar, r12.b.a.f170519a)) {
                    this.f170571a.j();
                } else {
                    if (!fr.t.c(bVar, r12.b.C4319b.f170520a)) {
                        throw new oq.p();
                    }
                    this.f170571a.k();
                }
                return oq.i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(mu.f0<? extends r12.b> f0Var, ka.a<n50.k> aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f170569f = f0Var;
            this.f170570g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f170568e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.f0<r12.b> f0Var = this.f170569f;
                C4324a c4324a = new C4324a(this.f170570g);
                this.f170568e = 1;
                if (f0Var.a(c4324a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            throw new oq.g();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f170569f, this.f170570g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.a<oq.i0> {
        b(Object obj) {
            super(0, obj, d.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((d) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"r12/l0$c", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f170572a;

        public c(d dVar) {
            this.f170572a = dVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f170572a.B0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 A(d dVar, s0 s0Var) {
        return new c(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(d dVar, int i15, p076m2.r rVar, int i16) {
        x(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final ka.a<n50.k> aVar, final d.a.b.Displaying displaying, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1876073889);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(displaying) : rVarH.G(displaying) ? 32 : 16;
        }
        boolean z15 = false;
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1876073889, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messageslist.MessageListInitialized (MessagesListScreen.kt:136)");
            }
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d3 d3VarH = a3.h(aVar2.b(rVarH, i17).getSpacing200(), aVar2.b(rVarH, i17).getSpacing100(), aVar2.b(rVarH, i17).getSpacing200(), aVar2.b(rVarH, i17).getSpacing200());
            boolean z16 = (i16 & 112) == 32 || ((i16 & 64) != 0 && rVarH.G(displaying));
            if ((i16 & 14) == 4 || ((i16 & 8) != 0 && rVarH.G(aVar))) {
                z15 = true;
            }
            boolean z17 = z16 | z15;
            Object objE = rVarH.E();
            if (z17 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: r12.i0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l0.m(aVar, displaying, (q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(null, null, d3VarH, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 507);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r12.j0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.o(aVar, displaying, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(ka.a aVar, final d.a.b.Displaying displaying, q0 q0Var) {
        q0.c(q0Var, null, null, y2.m.b(-899114570, true, new er.q() { // from class: r12.b0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l0.n(displaying, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        m30.q.d(q0Var, aVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(d.a.b.Displaying displaying, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-899114570, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messageslist.MessageListInitialized.<anonymous>.<anonymous>.<anonymous> (MessagesListScreen.kt:146)");
            }
            c30.b alertData = displaying.getAlertData();
            if (alertData == null) {
                rVar.X(-2106068431);
            } else {
                rVar.X(-2106068430);
                c30.e.c(null, alertData, rVar, c30.b.f22944i << 3, 1);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(ka.a aVar, d.a.b.Displaying displaying, int i15, p076m2.r rVar, int i16) {
        l(aVar, displaying, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void p(final d.a aVar, final al alVar, final i70.p pVar, final ka.a<n50.k> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1133231673);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(alVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(pVar) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= (i15 & PKIFailureInfo.certConfirmed) == 0 ? rVarH.W(aVar2) : rVarH.G(aVar2) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1133231673, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messageslist.MessagesListContent (MessagesListScreen.kt:91)");
            }
            if (fr.t.c(aVar, d.a.c.f170541a)) {
                rVarH.X(1886063185);
                x70.f.g(x70.a.b.f217282c, rVarH, x70.a.b.f217283d);
                rVarH.R();
                rVar2 = rVarH;
            } else if (aVar instanceof d.a.b) {
                rVarH.X(1886067277);
                i50.s.r(((d.a.b) aVar).getBaseScaffoldData(), null, y2.m.d(340585680, true, new er.p() { // from class: r12.d0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l0.q(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-999553671, true, new er.q() { // from class: r12.e0
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return l0.r(aVar2, aVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
                rVar2 = rVarH;
                rVar2.R();
            } else {
                rVar2 = rVarH;
                if (!(aVar instanceof d.a.Error)) {
                    rVar2.X(1886062694);
                    rVar2.R();
                    throw new oq.p();
                }
                rVar2.X(1886103023);
                ((d.a.Error) aVar).getErrorVMS().b(rVar2, 0);
                rVar2.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r12.f0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.u(aVar, alVar, pVar, aVar2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(340585680, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messageslist.MessagesListContent.<anonymous> (MessagesListScreen.kt:98)");
            }
            i70.d.d(alVar, pVar, false, rVar, 0, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(final ka.a aVar, final d.a aVar2, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-999553671, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messageslist.MessagesListContent.<anonymous> (MessagesListScreen.kt:104)");
            }
            ja.w refresh = aVar.i().getRefresh();
            ja.w.Loading loading = ja.w.Loading.f101205b;
            if (fr.t.c(refresh, loading)) {
                rVar.X(-695064806);
                f3.m mVarL = a3.l(f3.m.INSTANCE, d3Var);
                w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT = rVar.t();
                f3.m mVarE = f3.j.e(rVar, mVarL);
                androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC = n6.c(rVar);
                n6.i(rVarC, w0VarA, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                d1.i0 i0Var = d1.i0.f39176a;
                x70.f.g(x70.a.b.f217282c, rVar, x70.a.b.f217283d);
                rVar.x();
                rVar.R();
            } else {
                rVar.X(-694892229);
                f3.m mVarL2 = a3.l(f3.m.INSTANCE, d3Var);
                boolean zC = fr.t.c(aVar.i().getRefresh(), loading);
                boolean zG = rVar.G(aVar);
                Object objE = rVar.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.a() { // from class: r12.g0
                        @Override // er.a
                        public final Object a() {
                            return l0.s(aVar);
                        }
                    };
                    rVar.v(objE);
                }
                k2.t.o(zC, (er.a) objE, mVarL2, null, null, null, false, 0.0f, y2.m.d(1505063289, true, new er.q() { // from class: r12.h0
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return l0.t(aVar2, aVar, (d1.w) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVar, 54), rVar, 100663296, 248);
                rVar.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(ka.a aVar) {
        aVar.j();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(d.a aVar, ka.a aVar2, d1.w wVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1505063289, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messageslist.MessagesListContent.<anonymous>.<anonymous> (MessagesListScreen.kt:114)");
            }
            d.a.b bVar = (d.a.b) aVar;
            if (bVar instanceof d.a.b.Displaying) {
                rVar.X(-1038154876);
                l(aVar2, (d.a.b.Displaying) aVar, rVar, ka.a.f109310f);
                rVar.R();
            } else {
                if (!(bVar instanceof d.a.b.Empty)) {
                    rVar.X(-1038157311);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-1038149418);
                v((d.a.b.Empty) aVar, rVar, 0);
                rVar.R();
            }
            p088nul.q0.g(false, bVar.a(), rVar, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(d.a aVar, al alVar, i70.p pVar, ka.a aVar2, int i15, p076m2.r rVar, int i16) {
        p(aVar, alVar, pVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void v(final d.a.b.Empty empty, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(16560324);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(empty) : rVarH.G(empty) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(16560324, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messageslist.MessagesListEmpty (MessagesListScreen.kt:158)");
            }
            f3.m mVarN = a3.n(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200());
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            q40.i.b(empty.c(), null, null, rVarH, IconPageData.f164667h, 6);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r12.k0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.w(empty, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(d.a.b.Empty empty, int i15, p076m2.r rVar, int i16) {
        v(empty, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void x(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1921260790);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1921260790, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messageslist.MessagesListScreen (MessagesListScreen.kt:43)");
            }
            f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(dVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            al alVar = (al) objE;
            ka.a aVarB = ka.b.b(dVar.Z2(), null, rVarH, 0, 1);
            mu.f0<r12.b> f0VarQ6 = dVar.q6();
            oz.l.b(dVar.getLifecycleConnector(), rVarH, 0);
            oq.i0 i0Var = oq.i0.f148189a;
            boolean zG = rVarH.G(f0VarQ6) | rVarH.G(aVarB);
            Object objE2 = rVarH.E();
            if (zG || objE2 == companion.a()) {
                objE2 = new a(f0VarQ6, aVarB, null);
                rVarH.v(objE2);
            }
            Function0.d(i0Var, (er.p) objE2, rVarH, 6);
            int i17 = i16 & 14;
            boolean z15 = i17 == 4 || ((i16 & 8) != 0 && rVarH.G(dVar));
            Object objE3 = rVarH.E();
            if (z15 || objE3 == companion.a()) {
                objE3 = new er.l() { // from class: r12.a0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l0.A(dVar, (s0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            Function0.a(i0Var, (er.l) objE3, rVarH, 6);
            i70.p pVarZ = z(f6VarB);
            boolean z16 = i17 == 4 || ((i16 & 8) != 0 && rVarH.G(dVar));
            Object objE4 = rVarH.E();
            if (z16 || objE4 == companion.a()) {
                objE4 = new b(dVar);
                rVarH.v(objE4);
            }
            i70.m.d(alVar, pVarZ, (er.a) ((mr.g) objE4), null, null, rVarH, 6, 24);
            rVarH = rVarH;
            p(y(f6VarC), alVar, z(f6VarB), aVarB, rVarH, (ka.a.f109310f << 9) | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r12.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.B(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.a y(f6<? extends d.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p z(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }
}
