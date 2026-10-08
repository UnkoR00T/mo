package rh1;

import androidx.compose.ui.platform.g1;
import b1.k;
import d1.e0;
import d1.i;
import d1.m3;
import d1.q3;
import d1.r3;
import er.l;
import er.p;
import f3.j;
import f3.m;
import j70.h;
import l3.o;
import n4.f0;
import n4.g0;
import n4.i0;
import n4.v;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.s;
import w0.r1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrh1/a;", "data", "Loq/i0;", "f", "(Lrh1/a;Lm2/r;I)V", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void f(final SearchRowListData searchRowListData, r rVar, final int i15) {
        r rVar2;
        final SearchRowListData searchRowListData2 = searchRowListData;
        r rVarH = rVar.h(-2102233206);
        int i16 = 2;
        int i17 = (i15 & 6) == 0 ? i15 | (rVarH.G(searchRowListData2) ? 4 : 2) : i15;
        int i18 = 1;
        if (rVarH.r((i17 & 3) != 2, i17 & 1)) {
            if (t.k()) {
                t.o(-2102233206, i17, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.globalsearch.component.SearchRowList (SearchRowList.kt:34)");
            }
            m.Companion companion = m.INSTANCE;
            boolean zG = rVarH.G(searchRowListData2);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: rh1.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.g(searchRowListData2, (i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            Object obj = null;
            m mVarD = v.d(companion, false, (l) objE, 1, null);
            w0 w0VarA = e0.a(i.f39152a.r(k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            final o oVar = (o) rVarH.N(g1.g());
            Object objE2 = rVarH.E();
            if (objE2 == r.INSTANCE.a()) {
                objE2 = new cx.b();
                rVarH.v(objE2);
            }
            final cx.b bVar = (cx.b) objE2;
            rVarH.X(-401763881);
            int i19 = 0;
            for (Object obj2 : searchRowListData2.a()) {
                int i25 = i19 + 1;
                if (i19 < 0) {
                    pq.v.x();
                }
                final SearchRowListData.Row row = (SearchRowListData.Row) obj2;
                Object objE3 = rVarH.E();
                r.Companion companion3 = r.INSTANCE;
                if (objE3 == companion3.a()) {
                    objE3 = k.a();
                    rVarH.v(objE3);
                }
                b1.l lVar = (b1.l) objE3;
                f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
                final String str = searchRowListData2.getTestTag() + "Element" + i19;
                f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
                m.Companion companion4 = m.INSTANCE;
                m mVarH = androidx.compose.foundation.layout.d.h(companion4, 0.0f, i18, obj);
                k70.a aVar = k70.a.f108864a;
                int i26 = k70.a.f108865b;
                m mVarK = androidx.compose.foundation.layout.d.k(mVarH, aVar.b(rVarH, i26).getSpacing300(), 0.0f, i16, obj);
                boolean zW = rVarH.W(str);
                Object objE4 = rVarH.E();
                if (zW || objE4 == companion3.a()) {
                    objE4 = new l() { // from class: rh1.c
                        @Override // er.l
                        public final Object b(Object obj3) {
                            return g.h(str, (i0) obj3);
                        }
                    };
                    rVarH.v(objE4);
                }
                m mVarW = s.w(v.c(mVarK, true, (l) objE4), f6VarA, aVar.b(rVarH, i26).getSpacing25(), 0.0f, 4, null);
                r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
                n4.l lVarJ = n4.l.j(n4.l.INSTANCE.a());
                boolean zG2 = rVarH.G(bVar) | rVarH.W(row) | rVarH.G(oVar);
                Object objE5 = rVarH.E();
                if (zG2 || objE5 == companion3.a()) {
                    objE5 = new er.a() { // from class: rh1.d
                        @Override // er.a
                        public final Object a() {
                            return g.i(bVar, row, oVar);
                        }
                    };
                    rVarH.v(objE5);
                }
                m mVarL = androidx.compose.foundation.b.l(mVarW, lVar, r1VarE, false, null, lVarJ, (er.a) objE5, 12, null);
                w0 w0VarB = m3.b(i.f39152a.j(), interfaceC1317cI, rVarH, 48);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT2 = rVarH.t();
                m mVarE2 = j.e(rVarH, mVarL);
                androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB2 = companion5.b();
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
                n6.i(rVarC2, w0VarB, companion5.d());
                n6.i(rVarC2, e0VarT2, companion5.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion5.c());
                n6.g(rVarC2, companion5.a());
                n6.i(rVarC2, mVarE2, companion5.e());
                q3 q3Var = q3.f39261a;
                r rVar3 = rVarH;
                h60.f.e(null, str + "_Icon", Integer.valueOf(row.getIconResId()), h60.g.Medium, aVar.a(rVarH, i26).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0.0f, null, null, 0L, 0.0f, 0.0f, null, rVar3, 3072, 0, 4065);
                r3.a(androidx.compose.foundation.layout.d.y(companion4, aVar.b(rVar3, i26).getSpacing200()), rVar3, 0);
                h.g(null, str + "_Text", mx.b.b(row.getText(), ""), null, null, aVar.a(rVar3, i26).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar3, i26).a(), null, null, false, false, null, rVar3, 0, 0, MLKEMEngine.KyberPolyBytes, 28835801);
                rVar3.x();
                searchRowListData2 = searchRowListData;
                oVar = oVar;
                rVarH = rVar3;
                i19 = i25;
                bVar = bVar;
                obj = null;
                i16 = 2;
                i18 = 1;
            }
            rVar2 = rVarH;
            rVar2.R();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: rh1.e
                @Override // er.p
                public final Object B(Object obj3, Object obj4) {
                    return g.k(searchRowListData, i15, (r) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 g(SearchRowListData searchRowListData, i0 i0Var) {
        g0.a(i0Var, true);
        f0.y0(i0Var, searchRowListData.getTestTag() + "Container");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(String str, i0 i0Var) {
        g0.a(i0Var, true);
        f0.y0(i0Var, str);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(cx.b bVar, final SearchRowListData.Row row, final o oVar) {
        cx.a.a(bVar, 0L, new er.a() { // from class: rh1.f
            @Override // er.a
            public final Object a() {
                return g.j(row, oVar);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(SearchRowListData.Row row, o oVar) {
        row.b().a();
        oVar.B(true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(SearchRowListData searchRowListData, int i15, r rVar, int i16) {
        f(searchRowListData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
