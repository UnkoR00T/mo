package b70;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.m3;
import d1.q3;
import d1.r3;
import er.l;
import er.p;
import f3.j;
import f3.m;
import java.util.Comparator;
import mx.Label;
import n4.f0;
import n4.g0;
import n4.i0;
import n4.v;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lb70/b;", "data", "Loq/i0;", "l", "(Lb70/b;Lm2/r;I)V", "Lf3/m;", "modifier", "Lb70/a;", "requirementItem", "", "isError", "Lmx/a;", "fulfilledStateDescription", "unfulfilledStateDescription", "g", "(Lf3/m;Lb70/a;ZLmx/a;Lmx/a;Lm2/r;II)V", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f17006a;

        a(long j15) {
            this.f17006a = j15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-488020732);
            if (t.k()) {
                t.o(-488020732, i15, -1, "pl.gov.coi.common.ui.requirementlist.RequirementItem.<anonymous>.<anonymous> (RequirementList.kt:79)");
            }
            long j15 = this.f17006a;
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return j15;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Boolean.valueOf(((RequirementItem) t15).getIsFulfilled()), Boolean.valueOf(((RequirementItem) t16).getIsFulfilled()));
        }
    }

    private static final void g(m mVar, final RequirementItem requirementItem, final boolean z15, final Label label, final Label label2, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        final m mVar3;
        long jB;
        String str;
        r rVarH = rVar.h(1448694767);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(requirementItem) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.a(z15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= rVarH.W(label) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= rVarH.W(label2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (rVarH.r((i17 & 9363) != 9362, i17 & 1)) {
            mVar3 = i18 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(1448694767, i17, -1, "pl.gov.coi.common.ui.requirementlist.RequirementItem (RequirementList.kt:60)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = new l() { // from class: b70.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.h((i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarD = v.d(mVar3, false, (l) objE, 1, null);
            int i19 = i17 & 112;
            boolean z16 = i19 == 32;
            Object objE2 = rVarH.E();
            if (z16 || objE2 == companion.a()) {
                objE2 = new l() { // from class: b70.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.i(requirementItem, (i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            m mVarD2 = v.d(mVarD, false, (l) objE2, 1, null);
            w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.i(), rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarD2);
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            if (requirementItem.getIsFulfilled()) {
                rVarH.X(-1762635239);
                jB = k70.a.f108864a.a(rVarH, k70.a.f108865b).getSupport().d();
                rVarH.R();
            } else if (z15) {
                rVarH.X(-1762633449);
                jB = k70.a.f108864a.a(rVarH, k70.a.f108865b).getSupport().g();
                rVarH.R();
            } else {
                rVarH.X(-1762631819);
                jB = k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
                rVarH.R();
            }
            long j15 = jB;
            String testTag = requirementItem.getTestTag();
            if (testTag != null) {
                str = testTag + "Icon";
            } else {
                str = null;
            }
            int i25 = i17;
            d40.h.f(null, new d40.b.C0864b(str, requirementItem.getIsFulfilled() ? jz.a.f106783h : jz.a.Y, d40.i.e.f39708e, new a(j15), null, null, 32, null), false, rVarH, d40.b.C0864b.f39687h << 3, 5);
            m.Companion companion3 = m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i26 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.y(companion3, aVar.b(rVarH, i26).getSpacing50()), rVarH, 0);
            boolean z17 = ((i25 & 7168) == 2048) | (i19 == 32) | ((i25 & 57344) == 16384);
            Object objE3 = rVarH.E();
            if (z17 || objE3 == companion.a()) {
                objE3 = new l() { // from class: b70.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.j(requirementItem, label, label2, (i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            String str2 = null;
            m mVarD3 = v.d(companion3, false, (l) objE3, 1, null);
            String testTag2 = requirementItem.getTestTag();
            if (testTag2 != null) {
                str2 = testTag2 + "Text";
            }
            j70.h.g(mVarD3, str2, requirementItem.getLabel(), null, null, j15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i26).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030104);
            rVarH = rVarH;
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: b70.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.k(mVar3, requirementItem, z15, label, label2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(i0 i0Var) {
        g0.a(i0Var, true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(RequirementItem requirementItem, i0 i0Var) {
        String testTag = requirementItem.getTestTag();
        if (testTag == null) {
            testTag = "ValidatorItem_" + requirementItem.getLabel().getTag();
        }
        f0.y0(i0Var, testTag);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(RequirementItem requirementItem, Label label, Label label2, i0 i0Var) {
        f0.x0(i0Var, requirementItem.getIsFulfilled() ? label.getText() : label2.getText());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(m mVar, RequirementItem requirementItem, boolean z15, Label label, Label label2, int i15, int i16, r rVar, int i17) {
        g(mVar, requirementItem, z15, label, label2, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    public static final void l(final RequirementListData requirementListData, r rVar, final int i15) {
        r rVarH = rVar.h(-972644008);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(requirementListData) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-972644008, i16, -1, "pl.gov.coi.common.ui.requirementlist.RequirementList (RequirementList.kt:30)");
            }
            if (requirementListData.getRequirementsVisible()) {
                rVarH.X(2106810736);
                m mVarP = a3.p(m.INSTANCE, 0.0f, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200(), 1, null);
                Object objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new l() { // from class: b70.c
                        @Override // er.l
                        public final Object b(Object obj) {
                            return i.m((i0) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                m mVarC = v.c(mVarP, true, (l) objE);
                w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
                m mVarE = j.e(rVarH, mVarC);
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
                n6.i(rVarC, w0VarA, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                d1.i0 i0Var = d1.i0.f39176a;
                rVarH.X(-494623099);
                int i17 = 0;
                for (Object obj : pq.v.U0(requirementListData.a(), new b())) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        pq.v.x();
                    }
                    RequirementItem requirementItem = (RequirementItem) obj;
                    boolean isError = requirementListData.getIsError();
                    c70.a aVar = c70.a.f23835a;
                    g(null, requirementItem, isError, aVar.a().O0(), aVar.a().Z(), rVarH, 0, 1);
                    if (i17 != requirementListData.a().size() - 1) {
                        rVarH.X(-1659014064);
                        r3.a(androidx.compose.foundation.layout.d.i(m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing100()), rVarH, 0);
                    } else {
                        rVarH.X(-1660910520);
                    }
                    rVarH.R();
                    i17 = i18;
                }
                rVarH.R();
                rVarH.x();
            } else {
                rVarH.X(2105482634);
            }
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: b70.d
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return i.n(requirementListData, i15, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(i0 i0Var) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(RequirementListData requirementListData, int i15, r rVar, int i16) {
        l(requirementListData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
