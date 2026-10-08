package s70;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import d1.a3;
import d1.e0;
import d1.h0;
import d1.m3;
import d1.q3;
import d1.r3;
import d1.x;
import er.p;
import er.q;
import java.util.List;
import ju.p0;
import mx.Label;
import oq.i0;
import oq.u;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p060i1.f0;
import p060i1.i1;
import p060i1.m1;
import p060i1.v0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p076m2.x5;
import q4.TextStyle;
import w0.o;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a?\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, d2 = {"Ls70/l;", "illustrationPageVMS", "", "Lkotlin/Function0;", "Loq/i0;", "contentScreenList", "bottomContent", "e", "(Ls70/l;Ljava/util/List;Ler/p;Lm2/r;II)V", "CONTENT", "Ls70/e;", "data", "Lkotlin/Function1;", "content", "i", "(Ls70/e;Ler/q;Lm2/r;II)V", "Li1/i1;", "pagerState", "k", "(Li1/i1;Lm2/r;I)V", "", "currentPage", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i1 f178615f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l f178616g;

        /* JADX INFO: renamed from: s70.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "targetPage", "Loq/i0;", "<anonymous>", "(I)V"}, k = 3, mv = {2, 2, 0})
        static final class C4581a extends vq.k implements p<Integer, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f178617e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ int f178618f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ l f178619g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4581a(l lVar, tq.e<? super C4581a> eVar) {
                super(2, eVar);
                this.f178619g = lVar;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Object B(Integer num, tq.e<? super i0> eVar) {
                return M(num.intValue(), eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                int i15 = this.f178618f;
                Object objE = uq.b.e();
                int i16 = this.f178617e;
                if (i16 == 0) {
                    u.b(obj);
                    l lVar = this.f178619g;
                    this.f178618f = i15;
                    this.f178617e = 1;
                    if (lVar.c(i15, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            public final Object M(int i15, tq.e<? super i0> eVar) {
                return ((C4581a) v(Integer.valueOf(i15), eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C4581a c4581a = new C4581a(this.f178619g, eVar);
                c4581a.f178618f = ((Number) obj).intValue();
                return c4581a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i1 i1Var, l lVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f178615f = i1Var;
            this.f178616g = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int O(i1 i1Var) {
            return i1Var.Z();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178614e;
            if (i15 == 0) {
                u.b(obj);
                final i1 i1Var = this.f178615f;
                mu.g gVarP = mu.i.p(x5.q(new er.a() { // from class: s70.j
                    @Override // er.a
                    public final Object a() {
                        return Integer.valueOf(k.a.O(i1Var));
                    }
                }));
                C4581a c4581a = new C4581a(this.f178616g, null);
                this.f178614e = 1;
                if (mu.i.j(gVarP, c4581a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f178615f, this.f178616g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178620e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i1 f178621f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ f6<Integer> f178622g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i1 i1Var, f6<Integer> f6Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f178621f = i1Var;
            this.f178622g = f6Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178620e;
            if (i15 == 0) {
                u.b(obj);
                i1 i1Var = this.f178621f;
                int iF = k.f(this.f178622g);
                this.f178620e = 1;
                if (i1.p(i1Var, iF, 0.0f, null, this, 6, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f178621f, this.f178622g, eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    /* JADX WARN: Code duplicated, block: B:67:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:77:0x0207  */
    /* JADX WARN: Code duplicated, block: B:79:0x0242  */
    /* JADX WARN: Code duplicated, block: B:82:0x024e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0252  */
    /* JADX WARN: Code duplicated, block: B:87:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:92:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void e(final l lVar, final List<? extends p<? super r, ? super Integer, i0>> list, p<? super r, ? super Integer, i0> pVar, r rVar, final int i15, final int i16) {
        int i17;
        p<? super r, ? super Integer, i0> pVar2;
        boolean z15;
        final p<? super r, ? super Integer, i0> pVar3;
        d5 d5VarM;
        p<? super r, ? super Integer, i0> pVar4;
        f6 f6VarC;
        i1 i1VarN;
        boolean z16;
        boolean z17;
        Object objE;
        boolean zW;
        Object objE2;
        f3.m.Companion companion;
        f3.c.Companion companion2;
        androidx.compose.ui.node.c.Companion companion3;
        er.a<androidx.compose.ui.node.c> aVarB;
        er.a<androidx.compose.ui.node.c> aVarB2;
        r rVarH = rVar.h(408101701);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(lVar) : rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(list) ? 32 : 16;
        }
        int i18 = i16 & 4;
        if (i18 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                pVar2 = pVar;
                i17 |= rVarH.G(pVar2) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i18 != 0) {
                    pVar2 = null;
                }
                if (t.k()) {
                    t.o(408101701, i17, -1, "pl.gov.coi.common.ui.unmapped.illustrationpage.IllustrationPage (IllustrationPage.kt:61)");
                }
                pVar4 = pVar2;
                f6VarC = m7.b.c(lVar.b(), null, null, null, rVarH, 0, 7);
                i1VarN = m1.n(lVar.getInitialIndex(), 0.0f, lVar.e(), rVarH, 0, 2);
                Integer numValueOf = Integer.valueOf(i1VarN.Z());
                boolean zW2 = rVarH.W(i1VarN);
                if ((i17 & 14) != 4 || ((i17 & 8) != 0 && rVarH.G(lVar))) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | zW2;
                objE = rVarH.E();
                if (z17 || objE == r.INSTANCE.a()) {
                    objE = new a(i1VarN, lVar, null);
                    rVarH.v(objE);
                }
                Function0.d(numValueOf, (p) objE, rVarH, 0);
                Integer numValueOf2 = Integer.valueOf(f(f6VarC));
                zW = rVarH.W(i1VarN) | rVarH.W(f6VarC);
                objE2 = rVarH.E();
                if (zW || objE2 == r.INSTANCE.a()) {
                    objE2 = new b(i1VarN, f6VarC, null);
                    rVarH.v(objE2);
                }
                Function0.d(numValueOf2, (p) objE2, rVarH, 0);
                companion = f3.m.INSTANCE;
                d1.i.n nVarK = d1.i.f39152a.k();
                companion2 = f3.c.INSTANCE;
                w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, companion);
                companion3 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarA, companion3.d());
                n6.i(rVarC, e0VarT, companion3.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
                n6.g(rVarC, companion3.a());
                n6.i(rVarC, mVarE, companion3.e());
                f0.g(i1VarN, h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, null, 0, 0.0f, companion2.l(), null, false, false, null, null, null, null, y2.m.d(-752865874, true, new er.r() { // from class: s70.f
                    @Override // er.r
                    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                        return k.g(list, (v0) obj, ((Integer) obj2).intValue(), (r) obj3, ((Integer) obj4).intValue());
                    }
                }, rVarH, 54), rVarH, 1572864, 24576, 16316);
                rVarH = rVarH;
                if (list.size() > 1) {
                    rVarH.X(1969419387);
                    k70.a aVar = k70.a.f108864a;
                    int i19 = k70.a.f108865b;
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i19).getSpacing200()), rVarH, 0);
                    k(i1VarN, rVarH, 0);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i19).getSpacing200()), rVarH, 0);
                } else {
                    rVarH.X(1965868275);
                }
                rVarH.R();
                if (pVar4 == null) {
                    rVarH.X(1969654490);
                } else {
                    rVarH.X(1969654491);
                    k70.a aVar2 = k70.a.f108864a;
                    int i25 = k70.a.f108865b;
                    f3.m mVarP = a3.p(companion, aVar2.b(rVarH, i25).getSpacing200(), 0.0f, 2, null);
                    w0 w0VarI = d1.r.i(companion2.o(), false);
                    int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                    p076m2.e0 e0VarT2 = rVarH.t();
                    f3.m mVarE2 = f3.j.e(rVarH, mVarP);
                    aVarB2 = companion3.b();
                    if (rVarH.l() == null) {
                        p076m2.m.d();
                    }
                    rVarH.K();
                    if (rVarH.getInserting()) {
                        rVarH.H(aVarB2);
                    } else {
                        rVarH.u();
                    }
                    r rVarC2 = n6.c(rVarH);
                    n6.i(rVarC2, w0VarI, companion3.d());
                    n6.i(rVarC2, e0VarT2, companion3.f());
                    n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                    n6.g(rVarC2, companion3.a());
                    n6.i(rVarC2, mVarE2, companion3.e());
                    x xVar = x.f39368a;
                    pVar4.B(rVarH, 0);
                    rVarH.x();
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i25).getSpacing200()), rVarH, 0);
                    i0 i0Var = i0.f148189a;
                }
                rVarH.R();
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                pVar3 = pVar4;
            } else {
                rVarH.O();
                pVar3 = pVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: s70.g
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return k.h(lVar, list, pVar3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        pVar2 = pVar;
        if ((i17 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i18 != 0) {
                pVar2 = null;
            }
            if (t.k()) {
                t.o(408101701, i17, -1, "pl.gov.coi.common.ui.unmapped.illustrationpage.IllustrationPage (IllustrationPage.kt:61)");
            }
            pVar4 = pVar2;
            f6VarC = m7.b.c(lVar.b(), null, null, null, rVarH, 0, 7);
            i1VarN = m1.n(lVar.getInitialIndex(), 0.0f, lVar.e(), rVarH, 0, 2);
            Integer numValueOf3 = Integer.valueOf(i1VarN.Z());
            boolean zW3 = rVarH.W(i1VarN);
            if ((i17 & 14) != 4) {
                z16 = true;
            } else {
                z16 = true;
            }
            z17 = z16 | zW3;
            objE = rVarH.E();
            if (z17) {
                objE = new a(i1VarN, lVar, null);
                rVarH.v(objE);
            } else {
                objE = new a(i1VarN, lVar, null);
                rVarH.v(objE);
            }
            Function0.d(numValueOf3, (p) objE, rVarH, 0);
            Integer numValueOf4 = Integer.valueOf(f(f6VarC));
            zW = rVarH.W(i1VarN) | rVarH.W(f6VarC);
            objE2 = rVarH.E();
            if (zW) {
                objE2 = new b(i1VarN, f6VarC, null);
                rVarH.v(objE2);
            } else {
                objE2 = new b(i1VarN, f6VarC, null);
                rVarH.v(objE2);
            }
            Function0.d(numValueOf4, (p) objE2, rVarH, 0);
            companion = f3.m.INSTANCE;
            d1.i.n nVarK2 = d1.i.f39152a.k();
            companion2 = f3.c.INSTANCE;
            w0 w0VarA2 = e0.a(nVarK2, companion2.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            f3.m mVarE3 = f3.j.e(rVarH, companion);
            companion3 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            f0.g(i1VarN, h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, null, 0, 0.0f, companion2.l(), null, false, false, null, null, null, null, y2.m.d(-752865874, true, new er.r() { // from class: s70.f
                @Override // er.r
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                    return k.g(list, (v0) obj, ((Integer) obj2).intValue(), (r) obj3, ((Integer) obj4).intValue());
                }
            }, rVarH, 54), rVarH, 1572864, 24576, 16316);
            rVarH = rVarH;
            if (list.size() > 1) {
                rVarH.X(1969419387);
                k70.a aVar3 = k70.a.f108864a;
                int i110 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i110).getSpacing200()), rVarH, 0);
                k(i1VarN, rVarH, 0);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar3.b(rVarH, i110).getSpacing200()), rVarH, 0);
            } else {
                rVarH.X(1965868275);
            }
            rVarH.R();
            if (pVar4 == null) {
                rVarH.X(1969654490);
            } else {
                rVarH.X(1969654491);
                k70.a aVar4 = k70.a.f108864a;
                int i26 = k70.a.f108865b;
                f3.m mVarP2 = a3.p(companion, aVar4.b(rVarH, i26).getSpacing200(), 0.0f, 2, null);
                w0 w0VarI2 = d1.r.i(companion2.o(), false);
                int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT4 = rVarH.t();
                f3.m mVarE4 = f3.j.e(rVarH, mVarP2);
                aVarB2 = companion3.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB2);
                } else {
                    rVarH.u();
                }
                r rVarC4 = n6.c(rVarH);
                n6.i(rVarC4, w0VarI2, companion3.d());
                n6.i(rVarC4, e0VarT4, companion3.f());
                n6.i(rVarC4, Integer.valueOf(iHashCode4), companion3.c());
                n6.g(rVarC4, companion3.a());
                n6.i(rVarC4, mVarE4, companion3.e());
                x xVar2 = x.f39368a;
                pVar4.B(rVarH, 0);
                rVarH.x();
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar4.b(rVarH, i26).getSpacing200()), rVarH, 0);
                i0 i0Var2 = i0.f148189a;
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            pVar3 = pVar4;
        } else {
            rVarH.O();
            pVar3 = pVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: s70.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.h(lVar, list, pVar3, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(f6<Integer> f6Var) {
        return f6Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(List list, v0 v0Var, int i15, r rVar, int i16) {
        if (t.k()) {
            t.o(-752865874, i16, -1, "pl.gov.coi.common.ui.unmapped.illustrationpage.IllustrationPage.<anonymous>.<anonymous> (IllustrationPage.kt:87)");
        }
        ((p) list.get(i15)).B(rVar, 0);
        if (t.k()) {
            t.n();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(l lVar, List list, p pVar, int i15, int i16, r rVar, int i17) {
        e(lVar, list, pVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x0256  */
    /* JADX WARN: Code duplicated, block: B:52:0x0262  */
    /* JADX WARN: Code duplicated, block: B:55:0x028e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0293  */
    /* JADX WARN: Code duplicated, block: B:60:0x029c  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static final <CONTENT> void i(final IllustrationPageContentData<CONTENT> illustrationPageContentData, q<? super CONTENT, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16) {
        int i17;
        final q qVar2;
        int i18;
        boolean z15;
        d5 d5VarM;
        q qVarD;
        f3.m.Companion companion;
        k70.a aVar;
        int i19;
        er.a<androidx.compose.ui.node.c> aVarB;
        q qVar3;
        b5.j.Companion companion2;
        Label description;
        CONTENT contentA;
        q qVar4;
        r rVarH = rVar.h(1432697850);
        if ((i15 & 6) == 0) {
            i17 = i15 | ((i15 & 8) == 0 ? rVarH.W(illustrationPageContentData) : rVarH.G(illustrationPageContentData) ? 4 : 2);
        } else {
            i17 = i15;
        }
        int i25 = i16 & 2;
        if (i25 == 0) {
            if ((i15 & 48) == 0) {
                qVar2 = qVar;
                i17 |= rVarH.G(qVar2) ? 32 : 16;
            }
            i18 = i17;
            if ((i18 & 19) != 18) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i18 & 1)) {
                if (i25 != 0) {
                    qVarD = d.f178592a.d();
                } else {
                    qVarD = qVar2;
                }
                if (t.k()) {
                    t.o(1432697850, i18, -1, "pl.gov.coi.common.ui.unmapped.illustrationpage.IllustrationPageContentData (IllustrationPage.kt:109)");
                }
                companion = f3.m.INSTANCE;
                f3.m mVarS = t70.i.S(companion, null, rVarH, 6, 1);
                aVar = k70.a.f108864a;
                i19 = k70.a.f108865b;
                f3.m mVarN = a3.n(mVarS, aVar.b(rVarH, i19).getSpacing200());
                d1.i.n nVarK = d1.i.f39152a.k();
                f3.c.Companion companion3 = f3.c.INSTANCE;
                w0 w0VarA = e0.a(nVarK, companion3.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarN);
                androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion4.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarA, companion4.d());
                n6.i(rVarC, e0VarT, companion4.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
                n6.g(rVarC, companion4.a());
                n6.i(rVarC, mVarE, companion4.e());
                f3.m mVarF = androidx.compose.foundation.layout.d.f(d1.i0.f39176a.c(companion, companion3.g()), 0.0f, 1, null);
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                qVar3 = qVarD;
                w0.i1.c(l4.c.c(illustrationPageContentData.getImageResId(), rVarH, 0), null, androidx.compose.foundation.layout.d.i(mVarF, c5.h.n((float) ((((double) displayMetrics.heightPixels) * 0.3d) / ((double) displayMetrics.density)))), null, p036e4.l.INSTANCE.e(), 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 24624, 104);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i19).getSpacing200()), rVarH, 0);
                Label title = illustrationPageContentData.getTitle();
                TextStyle textStyleK = aVar.f(rVarH, i19).k();
                long jI = aVar.a(rVarH, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
                companion2 = b5.j.INSTANCE;
                j70.h.g(null, null, title, null, null, jI, 0L, null, null, null, 0L, null, b5.j.h(companion2.a()), 0L, 0, false, 0, 0, null, textStyleK, null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
                rVarH = rVarH;
                description = illustrationPageContentData.getDescription();
                if (description == null) {
                    rVarH.X(-241341270);
                } else {
                    rVarH.X(-241341269);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i19).getSpacing200()), rVarH, 0);
                    j70.h.g(null, null, description, null, null, aVar.a(rVarH, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(companion2.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i19).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
                    rVarH = rVarH;
                }
                rVarH.R();
                contentA = illustrationPageContentData.a();
                if (contentA == null) {
                    rVarH.X(-241023458);
                    rVarH.R();
                    qVar4 = qVar3;
                } else {
                    rVarH.X(-241023457);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i19).getSpacing200()), rVarH, 0);
                    qVar4 = qVar3;
                    qVar4.w(contentA, rVarH, Integer.valueOf(i18 & 112));
                    rVarH.R();
                }
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                qVar2 = qVar4;
            } else {
                rVarH.O();
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: s70.h
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return k.j(illustrationPageContentData, qVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        qVar2 = qVar;
        i18 = i17;
        if ((i18 & 19) != 18) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i18 & 1)) {
            if (i25 != 0) {
                qVarD = d.f178592a.d();
            } else {
                qVarD = qVar2;
            }
            if (t.k()) {
                t.o(1432697850, i18, -1, "pl.gov.coi.common.ui.unmapped.illustrationpage.IllustrationPageContentData (IllustrationPage.kt:109)");
            }
            companion = f3.m.INSTANCE;
            f3.m mVarS2 = t70.i.S(companion, null, rVarH, 6, 1);
            aVar = k70.a.f108864a;
            i19 = k70.a.f108865b;
            f3.m mVarN2 = a3.n(mVarS2, aVar.b(rVarH, i19).getSpacing200());
            d1.i.n nVarK2 = d1.i.f39152a.k();
            f3.c.Companion companion5 = f3.c.INSTANCE;
            w0 w0VarA2 = e0.a(nVarK2, companion5.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarN2);
            androidx.compose.ui.node.c.Companion companion6 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion6.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA2, companion6.d());
            n6.i(rVarC2, e0VarT2, companion6.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion6.c());
            n6.g(rVarC2, companion6.a());
            n6.i(rVarC2, mVarE2, companion6.e());
            f3.m mVarF2 = androidx.compose.foundation.layout.d.f(d1.i0.f39176a.c(companion, companion5.g()), 0.0f, 1, null);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            qVar3 = qVarD;
            w0.i1.c(l4.c.c(illustrationPageContentData.getImageResId(), rVarH, 0), null, androidx.compose.foundation.layout.d.i(mVarF2, c5.h.n((float) ((((double) displayMetrics2.heightPixels) * 0.3d) / ((double) displayMetrics2.density)))), null, p036e4.l.INSTANCE.e(), 0.0f, null, rVarH, androidx.compose.ui.graphics.painter.a.f9956g | 24624, 104);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i19).getSpacing200()), rVarH, 0);
            Label title2 = illustrationPageContentData.getTitle();
            TextStyle textStyleK2 = aVar.f(rVarH, i19).k();
            long jI2 = aVar.a(rVarH, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
            companion2 = b5.j.INSTANCE;
            j70.h.g(null, null, title2, null, null, jI2, 0L, null, null, null, 0L, null, b5.j.h(companion2.a()), 0L, 0, false, 0, 0, null, textStyleK2, null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
            rVarH = rVarH;
            description = illustrationPageContentData.getDescription();
            if (description == null) {
                rVarH.X(-241341270);
            } else {
                rVarH.X(-241341269);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i19).getSpacing200()), rVarH, 0);
                j70.h.g(null, null, description, null, null, aVar.a(rVarH, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(companion2.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i19).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
                rVarH = rVarH;
            }
            rVarH.R();
            contentA = illustrationPageContentData.a();
            if (contentA == null) {
                rVarH.X(-241023458);
                rVarH.R();
                qVar4 = qVar3;
            } else {
                rVarH.X(-241023457);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i19).getSpacing200()), rVarH, 0);
                qVar4 = qVar3;
                qVar4.w(contentA, rVarH, Integer.valueOf(i18 & 112));
                rVarH.R();
            }
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            qVar2 = qVar4;
        } else {
            rVarH.O();
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: s70.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.j(illustrationPageContentData, qVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(IllustrationPageContentData illustrationPageContentData, q qVar, int i15, int i16, r rVar, int i17) {
        i(illustrationPageContentData, qVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void k(final i1 i1Var, r rVar, final int i15) {
        f3.m mVarH;
        r rVarH = rVar.h(-2045884472);
        int i16 = (i15 & 6) == 0 ? (rVarH.W(i1Var) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-2045884472, i16, -1, "pl.gov.coi.common.ui.unmapped.illustrationpage.PageIndicator (IllustrationPage.kt:149)");
            }
            f3.m mVarH2 = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
            w0 w0VarB = m3.b(d1.i.f39152a.e(), f3.c.INSTANCE.a(), rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarH2);
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            q3 q3Var = q3.f39261a;
            rVarH.X(-476094942);
            int iN = i1Var.N();
            for (int i17 = 0; i17 < iN; i17++) {
                if (i1Var.A() == i17) {
                    rVarH.X(1838563867);
                    mVarH = w0.i.d(f3.m.INSTANCE, k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().getPrimary(), null, 2, null);
                    rVarH.R();
                } else {
                    rVarH.X(1838647443);
                    f3.m.Companion companion2 = f3.m.INSTANCE;
                    k70.a aVar = k70.a.f108864a;
                    int i18 = k70.a.f108865b;
                    mVarH = o.h(companion2, aVar.b(rVarH, i18).getStrokeWidth(), aVar.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().a(), l1.h.i());
                    rVarH.R();
                }
                d1.r.b(androidx.compose.foundation.layout.d.t(k3.f.a(a3.p(f3.m.INSTANCE, c5.h.n(6), 0.0f, 2, null), l1.h.i()), c5.h.n(8)).u(mVarH), rVarH, 0);
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: s70.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.l(i1Var, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(i1 i1Var, int i15, r rVar, int i16) {
        k(i1Var, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
