package ur1;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;
import u4.FontWeight;
import v40.InputDateTimeData;
import vr1.DocumentListItem;
import vr1.LocalNotificationItem;
import w0.r1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\b\u001a5\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Lur1/d;", "viewModel", "Loq/i0;", "y", "(Lur1/d;Lm2/r;I)V", "Lur1/d$a$a;", "data", "u", "(Lur1/d$a$a;Lm2/r;I)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "B", "Lmx/a;", "item", "selectedItem", "Lkotlin/Function1;", "onClickItem", "E", "(Lmx/a;Lmx/a;Ler/l;Lm2/r;I)V", "Lf3/m;", "modifier", "", "", "fields", "Lkotlin/Function0;", "onClick", ip.a.f96137b, "(Lf3/m;Ljava/util/List;Ler/a;Lm2/r;II)V", "Lur1/d$a;", "state", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class y {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.a<oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalNotificationItem f200396a;

        a(LocalNotificationItem localNotificationItem) {
            this.f200396a = localNotificationItem;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            c();
            return oq.i0.f148189a;
        }

        public final void c() {
            this.f200396a.d().a();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f200397a = new b();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(LocalNotificationItem localNotificationItem) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f200398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f200399b;

        public c(er.l lVar, List list) {
            this.f200398a = lVar;
            this.f200399b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f200398a.b(this.f200399b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements er.r<f1.e, Integer, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f200400a;

        public d(List list) {
            this.f200400a = list;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = (rVar.W(eVar) ? 4 : 2) | i16;
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(802480018, i17, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            LocalNotificationItem localNotificationItem = (LocalNotificationItem) this.f200400a.get(i15);
            rVar.X(-1384707042);
            f3.m mVarI = androidx.compose.foundation.layout.d.i(f1.e.c(eVar, f3.m.INSTANCE, 0.0f, 1, null), c5.h.n(48));
            List listQ = pq.v.q(localNotificationItem.getName(), localNotificationItem.getExpirationDate(), localNotificationItem.getNotificationDate(), localNotificationItem.getStatus());
            boolean zW = rVar.W(localNotificationItem);
            Object objE = rVar.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(localNotificationItem);
                rVar.v(objE);
            }
            y.S(mVarI, listQ, (er.a) objE, rVar, 0, 0);
            vb.f(null, 0.0f, 0L, rVar, 0, 7);
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ oq.i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f200401a;

        static {
            int[] iArr = new int[g30.v.values().length];
            try {
                iArr[g30.v.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f200401a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(ur1.d dVar, int i15, p076m2.r rVar, int i16) {
        y(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void B(final ur1.d.a.DataSet dataSet, p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-1840837725);
        int i16 = (i15 & 6) == 0 ? (rVarH.G(dataSet) ? 4 : 2) | i15 : i15;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1840837725, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.push.DropDownDocumentListContent (LocalNotificationsScreen.kt:239)");
            }
            f3.m mVarS = t70.i.S(f3.m.INSTANCE, null, rVarH, 6, 1);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarS);
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
            rVarH.X(219788334);
            for (final DocumentListItem documentListItem : dataSet.getDropDownDocumentListData().a()) {
                Label label = documentListItem.getLabel();
                DocumentListItem selectedItem = dataSet.getDropDownDocumentListData().getSelectedItem();
                Label label2 = selectedItem != null ? selectedItem.getLabel() : null;
                boolean zG = rVarH.G(dataSet) | rVarH.G(documentListItem);
                Object objE = rVarH.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.l() { // from class: ur1.u
                        @Override // er.l
                        public final Object b(Object obj) {
                            return y.C(dataSet, documentListItem, (Label) obj);
                        }
                    };
                    rVarH.v(objE);
                }
                E(label, label2, (er.l) objE, rVarH, 0);
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ur1.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.D(dataSet, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(ur1.d.a.DataSet dataSet, DocumentListItem documentListItem, Label label) {
        dataSet.getDropDownDocumentListData().b().b(documentListItem);
        dataSet.l().b(g30.v.HIDDEN);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(ur1.d.a.DataSet dataSet, int i15, p076m2.r rVar, int i16) {
        B(dataSet, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void E(final Label label, final Label label2, final er.l<? super Label, oq.i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        long jC;
        p076m2.r rVarH = rVar.h(-1788571313);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(label) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(label2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(lVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1788571313, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.push.DropDownDocumentListElement (LocalNotificationsScreen.kt:261)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            if (fr.t.c(label, label2)) {
                rVarH.X(-830106152);
                jC = k70.a.f108864a.a(rVarH, k70.a.f108865b).getBase().getSecondary();
            } else {
                rVarH.X(-830104905);
                jC = k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c();
            }
            rVarH.R();
            f3.m mVarD = w0.i.d(mVarH, jC, null, 2, null);
            Object objE = rVarH.E();
            p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
            if (objE == companion2.a()) {
                objE = b1.k.a();
                rVarH.v(objE);
            }
            b1.l lVar2 = (b1.l) objE;
            r1 r1VarE = t70.s.E(0.0f, rVarH, 0, 1);
            boolean z15 = ((i16 & 896) == 256) | ((i16 & 14) == 4);
            Object objE2 = rVarH.E();
            if (z15 || objE2 == companion2.a()) {
                objE2 = new er.a() { // from class: ur1.x
                    @Override // er.a
                    public final Object a() {
                        return y.F(lVar, label);
                    }
                };
                rVarH.v(objE2);
            }
            f3.m mVarL = androidx.compose.foundation.b.l(mVarD, lVar2, r1VarE, false, null, null, (er.a) objE2, 20, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = a3.n(mVarL, aVar.b(rVarH, i17).getSpacing200());
            p036e4.w0 w0VarB = m3.b(d1.i.f39152a.h(), f3.c.INSTANCE.i(), rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            j70.h.g(null, null, label, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, fr.t.c(label, label2) ? FontWeight.INSTANCE.c() : FontWeight.INSTANCE.d(), null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, (i16 << 6) & 896, 0, 0, 33025755);
            rVar2 = rVarH;
            if (fr.t.c(label, label2)) {
                rVar2.X(645583217);
                r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar2, i17).getSpacing50()), rVar2, 0);
                h60.f.e(a3.r(companion, aVar.b(rVar2, i17).getSpacing100(), 0.0f, 0.0f, 0.0f, 14, null), null, Integer.valueOf(c20.b.f22709q), h60.g.Small, aVar.a(rVar2, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0.0f, null, null, 0L, 0.0f, 0.0f, "Chosen element", rVar2, 3072, 48, 2018);
            } else {
                rVar2.X(635571767);
            }
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ur1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.G(label, label2, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(er.l lVar, Label label) {
        lVar.b(label);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(Label label, Label label2, er.l lVar, int i15, p076m2.r rVar, int i16) {
        E(label, label2, lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void H(final ur1.d.a.DataSet dataSet, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-232517182);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(dataSet) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-232517182, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.push.LocalNotificationsScreenContent (LocalNotificationsScreen.kt:86)");
            }
            i50.s.r(dataSet.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(280441589, true, new er.q() { // from class: ur1.r
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return y.I(dataSet, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean zG = rVarH.G(dataSet);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ur1.s
                    @Override // er.a
                    public final Object a() {
                        return y.Q(dataSet);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ur1.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.R(dataSet, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(final ur1.d.a.DataSet dataSet, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        f3.m.Companion companion;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(280441589, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.push.LocalNotificationsScreenContent.<anonymous> (LocalNotificationsScreen.kt:88)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.q(a3.l(w0.i.d(companion2, aVar.a(rVar, i17).getBase().a(), null, 2, null), d3Var), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200()), 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null);
            Label labelB = mx.b.b("[ Zaplanowane powiadomienia wyświetlane są tylko w godzinach 6:00-20:00 ]", "");
            long jG = c5.w.g(11);
            TextStyle textStyleF = aVar.f(rVar, i17).f();
            long jG2 = aVar.a(rVar, i17).getSupport().g();
            b5.j.Companion companion5 = b5.j.INSTANCE;
            j70.h.g(mVarH, null, labelB, null, null, jG2, jG, null, null, null, 0L, null, b5.j.h(companion5.a()), 0L, 0, false, 0, 0, null, textStyleF, null, null, false, false, null, rVar, 1572870, 0, 0, 33025946);
            j70.h.g(androidx.compose.foundation.layout.d.h(a3.p(companion2, 0.0f, aVar.b(rVar, i17).getSpacing100(), 1, null), 0.0f, 1, null), null, mx.b.b("Next: " + dataSet.getNextCheck(), ""), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(companion5.a()), 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33550330);
            y30.n.Switch controllersData = dataSet.getControllersData();
            if (controllersData == null) {
                rVar.X(1980139192);
                rVar.R();
                companion = companion2;
            } else {
                rVar.X(1980139193);
                f3.m mVarR = a3.r(companion2, 0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
                companion = companion2;
                p036e4.w0 w0VarB = m3.b(iVar.j(), companion3.l(), rVar, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, mVarR);
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
                n6.i(rVarC2, w0VarB, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                q3 q3Var = q3.f39261a;
                y30.m.g(controllersData, rVar, y30.n.Switch.f223693f);
                rVar.x();
                oq.i0 i0Var2 = oq.i0.f148189a;
                rVar.R();
            }
            f3.m mVarF2 = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            boolean zG = rVar.G(dataSet);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ur1.w
                    @Override // er.l
                    public final Object b(Object obj) {
                        return y.J(dataSet, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarF2, null, null, false, null, null, null, false, null, (er.l) objE, rVar, 6, 510);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(final ur1.d.a.DataSet dataSet, f1.q0 q0Var) {
        f1.q0.c(q0Var, null, null, y2.m.b(-482914806, true, new er.q() { // from class: ur1.g
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return y.K(dataSet, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        f1.q0.c(q0Var, null, null, y2.m.b(2048912051, true, new er.q() { // from class: ur1.h
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return y.O(dataSet, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        f1.q0.c(q0Var, null, null, y2.m.b(-580181550, true, new er.q() { // from class: ur1.i
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return y.P(dataSet, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        List<LocalNotificationItem> listI = dataSet.i();
        q0Var.j(listI.size(), null, new c(b.f200397a, listI), y2.m.b(802480018, true, new d(listI)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(final ur1.d.a.DataSet dataSet, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-482914806, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.push.LocalNotificationsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LocalNotificationsScreen.kt:134)");
            }
            vr1.d configSection = dataSet.getConfigSection();
            if (configSection instanceof vr1.d.LocalDocumentNotificationConfig) {
                rVar.X(1625589108);
                j40.l.m(dataSet.getDropDownButtonData(), rVar, DropDownButtonData.f99359i);
                f3.m mVarP = a3.p(f3.m.INSTANCE, 0.0f, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200(), 1, null);
                p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT = rVar.t();
                f3.m mVarE = f3.j.e(rVar, mVarP);
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
                Label labelB = mx.b.b("Ważne do", "");
                String documentDate = ((vr1.d.LocalDocumentNotificationConfig) dataSet.getConfigSection()).getDocumentDate();
                InputDateTimeData.b.C5303a c5303a = InputDateTimeData.b.C5303a.f203783c;
                boolean zG = rVar.G(dataSet);
                Object objE = rVar.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.a() { // from class: ur1.j
                        @Override // er.a
                        public final Object a() {
                            return y.L(dataSet);
                        }
                    };
                    rVar.v(objE);
                }
                v40.i.h(new InputDateTimeData(null, labelB, documentDate, c5303a, null, null, null, null, false, null, (er.a) objE, 1009, null), rVar, InputDateTimeData.f203769m);
                rVar.x();
                rVar.R();
            } else {
                if (!(configSection instanceof vr1.d.LocalVehicleNotificationConfig)) {
                    rVar.X(-224658459);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-224632586);
                f3.m.Companion companion2 = f3.m.INSTANCE;
                p036e4.w0 w0VarA2 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, companion2);
                androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
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
                d1.i0 i0Var2 = d1.i0.f39176a;
                u50.v0.g(((vr1.d.LocalVehicleNotificationConfig) dataSet.getConfigSection()).getRegisterNo(), null, rVar, v50.c.Text.P, 2);
                Label labelB2 = mx.b.b("Ubezpieczenie:", "");
                String insuranceDate = ((vr1.d.LocalVehicleNotificationConfig) dataSet.getConfigSection()).getInsuranceDate();
                InputDateTimeData.b.C5303a c5303a2 = InputDateTimeData.b.C5303a.f203783c;
                boolean zG2 = rVar.G(dataSet);
                Object objE2 = rVar.E();
                if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                    objE2 = new er.a() { // from class: ur1.k
                        @Override // er.a
                        public final Object a() {
                            return y.M(dataSet);
                        }
                    };
                    rVar.v(objE2);
                }
                InputDateTimeData inputDateTimeData = new InputDateTimeData(null, labelB2, insuranceDate, c5303a2, null, null, null, null, false, null, (er.a) objE2, 1009, null);
                int i16 = InputDateTimeData.f203769m;
                v40.i.h(inputDateTimeData, rVar, i16);
                Label labelB3 = mx.b.b("Badanie techniczne:", "");
                String technicalExaminationDate = ((vr1.d.LocalVehicleNotificationConfig) dataSet.getConfigSection()).getTechnicalExaminationDate();
                boolean zG3 = rVar.G(dataSet);
                Object objE3 = rVar.E();
                if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
                    objE3 = new er.a() { // from class: ur1.l
                        @Override // er.a
                        public final Object a() {
                            return y.N(dataSet);
                        }
                    };
                    rVar.v(objE3);
                }
                v40.i.h(new InputDateTimeData(null, labelB3, technicalExaminationDate, c5303a2, null, null, null, null, false, null, (er.a) objE3, 1009, null), rVar, i16);
                rVar.x();
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
    public static final oq.i0 L(ur1.d.a.DataSet dataSet) {
        ((vr1.d.LocalDocumentNotificationConfig) dataSet.getConfigSection()).c().b(vr1.a.DOCUMENT_DATE);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(ur1.d.a.DataSet dataSet) {
        ((vr1.d.LocalVehicleNotificationConfig) dataSet.getConfigSection()).c().b(vr1.a.INSURANCE_DATE);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(ur1.d.a.DataSet dataSet) {
        ((vr1.d.LocalVehicleNotificationConfig) dataSet.getConfigSection()).c().b(vr1.a.TECHNICAL_EXAMINATION_DATE);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(ur1.d.a.DataSet dataSet, f1.e eVar, p076m2.r rVar, int i15) {
        f3.m.Companion companion;
        p076m2.r rVar2 = rVar;
        if (rVar2.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2048912051, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.push.LocalNotificationsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LocalNotificationsScreen.kt:179)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, companion2);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            if (dataSet.getDataInputError() instanceof hz.b.Invalid) {
                rVar2.X(-88222027);
                companion = companion2;
                j70.h.g(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), null, ((hz.b.Invalid) dataSet.getDataInputError()).getMessage(), null, null, k70.a.f108864a.a(rVar2, k70.a.f108865b).getSupport().g(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 6, 0, 0, 33550298);
                rVar2 = rVar;
            } else {
                companion = companion2;
                rVar2.X(-95044507);
            }
            rVar2.R();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m.Companion companion4 = companion;
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar.b(rVar2, i16).getSpacing200()), rVar2, 0);
            h30.q.p(dataSet.getSendButton(), false, null, rVar2, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar.b(rVar2, i16).getSpacing200()), rVar2, 0);
            h30.q.p(dataSet.getRemoveButton(), false, null, rVar2, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar.b(rVar2, i16).getSpacing200()), rVar2, 0);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(ur1.d.a.DataSet dataSet, f1.e eVar, p076m2.r rVar, int i15) {
        List<String> listB;
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-580181550, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.push.LocalNotificationsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LocalNotificationsScreen.kt:198)");
            }
            f3.m mVarI = androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null), c5.h.n(32));
            vr1.d configSection = dataSet.getConfigSection();
            if (configSection instanceof vr1.d.LocalDocumentNotificationConfig) {
                listB = ((vr1.d.LocalDocumentNotificationConfig) configSection).b();
            } else {
                if (!(configSection instanceof vr1.d.LocalVehicleNotificationConfig)) {
                    throw new oq.p();
                }
                listB = ((vr1.d.LocalVehicleNotificationConfig) configSection).b();
            }
            S(mVarI, listB, null, rVar, 6, 4);
            vb.f(null, 0.0f, 0L, rVar, 0, 7);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q(ur1.d.a.DataSet dataSet) {
        if (e.f200401a[dataSet.getSheetValue().ordinal()] == 1) {
            dataSet.k();
        } else {
            dataSet.l().b(g30.v.HIDDEN);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(ur1.d.a.DataSet dataSet, int i15, p076m2.r rVar, int i16) {
        H(dataSet, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x013d A[LOOP:0: B:51:0x0137->B:53:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void S(final f3.m mVar, final List<String> list, er.a<oq.i0> aVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        er.a<oq.i0> aVar2;
        boolean z15;
        p076m2.r rVar2;
        final er.a<oq.i0> aVar3;
        d5 d5VarM;
        er.a<oq.i0> aVar4;
        er.a<androidx.compose.ui.node.c> aVarB;
        q3 q3Var;
        Iterator<T> it;
        Object objE;
        p076m2.r rVarH = rVar.h(1376888668);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(list) ? 32 : 16;
        }
        int i18 = i16 & 4;
        if (i18 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                aVar2 = aVar;
                i17 |= rVarH.G(aVar2) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i18 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: ur1.m
                            @Override // er.a
                            public final Object a() {
                                return y.T();
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar4 = (er.a) objE;
                } else {
                    aVar4 = aVar2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(1376888668, i17, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.push.NotificationRow (LocalNotificationsScreen.kt:301)");
                }
                f3.m mVarN = androidx.compose.foundation.b.n(w0.i.d(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.h(mVar, 0.0f, 1, null), c5.h.n(32)), k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), null, 2, null), false, null, null, null, aVar4, 15, null);
                er.a<oq.i0> aVar5 = aVar4;
                p036e4.w0 w0VarB = m3.b(d1.i.f39152a.g(), f3.c.INSTANCE.i(), rVarH, 54);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                p076m2.e0 e0VarT = rVarH.t();
                f3.m mVarE = f3.j.e(rVarH, mVarN);
                androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion.b();
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
                n6.i(rVarC, w0VarB, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                q3Var = q3.f39261a;
                rVarH.X(58366395);
                it = list.iterator();
                while (it.hasNext()) {
                    j70.h.g(p3.c(q3Var, f3.m.INSTANCE, 1.0f, false, 2, null), null, mx.b.b((String) it.next(), ""), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVarH, 0, 0, 0, 33550330);
                    q3Var = q3Var;
                }
                rVar2 = rVarH;
                rVar2.R();
                rVar2.x();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                aVar3 = aVar5;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                aVar3 = aVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: ur1.n
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return y.U(mVar, list, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        aVar2 = aVar;
        if ((i17 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i18 != 0) {
                objE = rVarH.E();
                if (objE == p076m2.r.INSTANCE.a()) {
                    objE = new er.a() { // from class: ur1.m
                        @Override // er.a
                        public final Object a() {
                            return y.T();
                        }
                    };
                    rVarH.v(objE);
                }
                aVar4 = (er.a) objE;
            } else {
                aVar4 = aVar2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1376888668, i17, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.push.NotificationRow (LocalNotificationsScreen.kt:301)");
            }
            f3.m mVarN2 = androidx.compose.foundation.b.n(w0.i.d(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.h(mVar, 0.0f, 1, null), c5.h.n(32)), k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), null, 2, null), false, null, null, null, aVar4, 15, null);
            er.a<oq.i0> aVar6 = aVar4;
            p036e4.w0 w0VarB2 = m3.b(d1.i.f39152a.g(), f3.c.INSTANCE.i(), rVarH, 54);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarN2);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB2, companion2.d());
            n6.i(rVarC2, e0VarT2, companion2.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
            n6.g(rVarC2, companion2.a());
            n6.i(rVarC2, mVarE2, companion2.e());
            q3Var = q3.f39261a;
            rVarH.X(58366395);
            it = list.iterator();
            while (it.hasNext()) {
                j70.h.g(p3.c(q3Var, f3.m.INSTANCE, 1.0f, false, 2, null), null, mx.b.b((String) it.next(), ""), null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVarH, 0, 0, 0, 33550330);
                q3Var = q3Var;
            }
            rVar2 = rVarH;
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            aVar3 = aVar6;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            aVar3 = aVar2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ur1.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.U(mVar, list, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(f3.m mVar, List list, er.a aVar, int i15, int i16, p076m2.r rVar, int i17) {
        S(mVar, list, aVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    public static final void u(final ur1.d.a.DataSet dataSet, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1996813471);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(dataSet) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1996813471, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.push.DeveloperPushContent (LocalNotificationsScreen.kt:69)");
            }
            g30.t.f(dataSet.getBottomSheetData(), k70.a.f108864a.b(rVarH, k70.a.f108865b).getZero(), false, null, null, y2.m.d(-406476358, true, new er.p() { // from class: ur1.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.v(dataSet, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-1291212165, true, new er.p() { // from class: ur1.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.w(dataSet, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, ModalBottomSheetData.f70192e | 1769472, 28);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ur1.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.x(dataSet, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(ur1.d.a.DataSet dataSet, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-406476358, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.push.DeveloperPushContent.<anonymous> (LocalNotificationsScreen.kt:74)");
            }
            B(dataSet, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(ur1.d.a.DataSet dataSet, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1291212165, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.push.DeveloperPushContent.<anonymous> (LocalNotificationsScreen.kt:78)");
            }
            H(dataSet, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(ur1.d.a.DataSet dataSet, int i15, p076m2.r rVar, int i16) {
        u(dataSet, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void y(final ur1.d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1884700982);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1884700982, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.push.DeveloperPushScreen (LocalNotificationsScreen.kt:55)");
            }
            ur1.d.a aVarZ = z(m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarZ, ur1.d.a.b.f200202a)) {
                rVarH.X(-1278548646);
                rVarH.R();
            } else {
                if (!(aVarZ instanceof ur1.d.a.DataSet)) {
                    rVarH.X(-1278550836);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-980243522);
                ur1.d.a.DataSet dataSet = (ur1.d.a.DataSet) aVarZ;
                u(dataSet, rVarH, 0);
                cb4.i dialogVMS = dataSet.getDialogVMS();
                if (dialogVMS == null) {
                    rVarH.X(-980182205);
                    rVarH.R();
                } else {
                    rVarH.X(-1278544770);
                    dialogVMS.b(rVarH, 0);
                    rVarH.R();
                    oq.i0 i0Var = oq.i0.f148189a;
                }
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ur1.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return y.A(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final ur1.d.a z(f6<? extends ur1.d.a> f6Var) {
        return f6Var.getValue();
    }
}
