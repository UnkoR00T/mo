package ix2;

import d1.a3;
import d1.d3;
import d1.h0;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ju.p0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import pq.v0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\u0010\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lix2/l;", "viewModel", "Loq/i0;", "l", "(Lix2/l;Lm2/r;I)V", "Lix2/l$a;", "data", "i", "(Lix2/l$a;Lm2/r;I)V", "", "Lix2/l$b;", "fields", "", "Lix2/a;", "Lj1/a;", "bringIntoViewRequesterMap", "f", "(Ljava/util/List;Ljava/util/Map;Lm2/r;I)V", "physicalidcardapplication_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f97663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f97664f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f97665g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f97666h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ l.Data f97667j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Map<ix2.a, j1.a> f97668k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l.Data data, Map<ix2.a, ? extends j1.a> map, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f97667j = data;
            this.f97668k = map;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            l.Data data;
            Object objE = uq.b.e();
            int i15 = this.f97666h;
            if (i15 == 0) {
                oq.u.b(obj);
                ix2.a scrollToField = this.f97667j.getScrollToField();
                if (scrollToField != null) {
                    Map<ix2.a, j1.a> map = this.f97668k;
                    l.Data data2 = this.f97667j;
                    j1.a aVar = (j1.a) v0.j(map, scrollToField);
                    this.f97663e = data2;
                    this.f97664f = vq.j.a(scrollToField);
                    this.f97665g = 0;
                    this.f97666h = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                    data = data2;
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            data = (l.Data) this.f97663e;
            oq.u.b(obj);
            data.c().a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f97667j, this.f97668k, eVar);
        }
    }

    private static final void f(final List<l.FieldData> list, final Map<ix2.a, ? extends j1.a> map, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-996989264);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(map) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-996989264, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.parentsdata.FieldList (ParentsDataScreen.kt:87)");
            }
            x30.c.c(null, 0.0f, y2.m.d(693718865, true, new er.p() { // from class: ix2.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.g(list, map, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ix2.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.h(list, map, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(List list, Map map, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(693718865, i15, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.parentsdata.FieldList.<anonymous> (ParentsDataScreen.kt:89)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            rVar.X(-1661964774);
            int i16 = 0;
            for (Object obj : list) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    pq.v.x();
                }
                l.FieldData fieldData = (l.FieldData) obj;
                f3.m.Companion companion3 = f3.m.INSTANCE;
                f3.m mVarB = j1.e.b(companion3, (j1.a) v0.j(map, fieldData.getType()));
                w0 w0VarA2 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, mVarB);
                androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB2);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC2 = n6.c(rVar);
                n6.i(rVarC2, w0VarA2, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                d1.i0 i0Var2 = d1.i0.f39176a;
                u50.v0.g(fieldData.getInputData(), null, rVar, v50.c.Text.P, 2);
                if (i16 != pq.v.p(list)) {
                    rVar.X(680771337);
                    r3.a(androidx.compose.foundation.layout.d.i(companion3, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
                } else {
                    rVar.X(677123598);
                }
                rVar.R();
                rVar.x();
                i16 = i17;
            }
            rVar.R();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(List list, Map map, int i15, p076m2.r rVar, int i16) {
        f(list, map, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void i(final l.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1995789374);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1995789374, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.parentsdata.ParentsDataContent (ParentsDataScreen.kt:37)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                wq.a<ix2.a> aVarE = ix2.a.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(aVarE, 10)), 16));
                Iterator<ix2.a> it = aVarE.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), j1.e.a());
                }
                rVarH.v(linkedHashMap);
                objE = linkedHashMap;
            }
            final Map map = (Map) objE;
            ix2.a scrollToField = data.getScrollToField();
            boolean zG = rVarH.G(data) | rVarH.G(map);
            Object objE2 = rVarH.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new a(data, map, null);
                rVarH.v(objE2);
            }
            Function0.d(scrollToField, (er.p) objE2, rVarH, 0);
            rVar2 = rVarH;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-563949135, true, new er.q() { // from class: ix2.o
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return s.j(data, map, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ix2.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.k(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(l.Data data, Map map, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-563949135, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.parentsdata.ParentsDataContent.<anonymous> (ParentsDataScreen.kt:50)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarL, aVar.b(rVar, i17).getSpacing200(), 0.0f, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200(), 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarR);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarR2 = a3.r(t70.i.S(h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null), null, rVar, 0, 1), 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarR2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            j70.h.g(null, null, data.getTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            f(data.b(), map, rVar, 0);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h30.q.p(data.getButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(l.Data data, int i15, p076m2.r rVar, int i16) {
        i(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final l lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1194310287);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(lVar) : rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1194310287, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.formsteps.parentsdata.ParentsDataScreen (ParentsDataScreen.kt:31)");
            }
            i(m(m7.b.c(lVar.getState(), null, null, null, rVarH, 0, 7)), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ix2.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.n(lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final l.Data m(f6<l.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(l lVar, int i15, p076m2.r rVar, int i16) {
        l(lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
