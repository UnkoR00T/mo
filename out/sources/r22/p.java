package r22;

import d1.a3;
import d1.d3;
import d1.r3;
import g30.ModalBottomSheetData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mx.Label;
import n40.FilePickerData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import pq.v0;
import t50.TextAreaData;
import z30.FileBottomSheetItemData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lr22/d;", "viewModel", "Loq/i0;", "s", "(Lr22/d;Lm2/r;I)V", "", "Lz30/a;", "data", "n", "(Ljava/util/List;Lm2/r;I)V", "Lr22/d$a;", "state", "Ld1/d3;", "paddingValues", "q", "(Lr22/d$a;Ld1/d3;Lm2/r;I)V", "z", "(Lr22/d$a;Lm2/r;I)V", "Lmx/a;", "headerLabel", "Ln40/c;", "filePickerData", "l", "(Lmx/a;Ln40/c;Lm2/r;I)V", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f171213a;

        public a(List list) {
            this.f171213a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f171213a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.r<f1.e, Integer, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f171214a;

        public b(List list) {
            this.f171214a = list;
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
                p076m2.t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            FileBottomSheetItemData fileBottomSheetItemData = (FileBottomSheetItemData) this.f171214a.get(i15);
            rVar.X(1193770906);
            z30.e.d(fileBottomSheetItemData, rVar, FileBottomSheetItemData.f232760e);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f171215e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f171216f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f171217g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f171218h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ d.Data f171219j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Map<r22.b, j1.a> f171220k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(d.Data data, Map<r22.b, ? extends j1.a> map, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f171219j = data;
            this.f171220k = map;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            d.Data data;
            Object objE = uq.b.e();
            int i15 = this.f171218h;
            if (i15 == 0) {
                oq.u.b(obj);
                r22.b fieldTypeToScroll = this.f171219j.getFieldTypeToScroll();
                if (fieldTypeToScroll != null) {
                    Map<r22.b, j1.a> map = this.f171220k;
                    d.Data data2 = this.f171219j;
                    j1.a aVar = (j1.a) v0.j(map, fieldTypeToScroll);
                    this.f171215e = data2;
                    this.f171216f = vq.j.a(fieldTypeToScroll);
                    this.f171217g = 0;
                    this.f171218h = 1;
                    if (j1.a.a(aVar, null, this, 1, null) == objE) {
                        return objE;
                    }
                    data = data2;
                }
                return oq.i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            data = (d.Data) this.f171215e;
            oq.u.b(obj);
            data.k().a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f171219j, this.f171220k, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(d.Data data, Map map, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1000930460, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.epuapmessageform.FormSection.<anonymous> (EpuapMessageFormScreen.kt:122)");
            }
            d1.i.f fVarR = d1.i.f39152a.r(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = d1.e0.a(fVarR, f3.c.INSTANCE.k(), rVar, 0);
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
            rVar.X(-1816695140);
            for (d.Data.InterfaceC4339a interfaceC4339a : data.g()) {
                f3.m mVarB = j1.e.b(f3.m.INSTANCE, (j1.a) v0.j(map, interfaceC4339a.getType()));
                w0 w0VarA2 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, mVarB);
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
                if (interfaceC4339a instanceof d.Data.InterfaceC4339a.DropDownButton) {
                    rVar.X(479138547);
                    j40.l.m(((d.Data.InterfaceC4339a.DropDownButton) interfaceC4339a).getDropDownButtonData(), rVar, DropDownButtonData.f99359i);
                    rVar.R();
                } else {
                    if (!(interfaceC4339a instanceof d.Data.InterfaceC4339a.TextArea)) {
                        rVar.X(479135784);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(479143367);
                    t50.r.m(((d.Data.InterfaceC4339a.TextArea) interfaceC4339a).getTextAreaData(), null, rVar, TextAreaData.f187694o, 2);
                    rVar.R();
                }
                rVar.x();
            }
            rVar.R();
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
    public static final oq.i0 B(d.Data data, int i15, p076m2.r rVar, int i16) {
        z(data, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void l(final Label label, FilePickerData filePickerData, p076m2.r rVar, final int i15) {
        int i16;
        final FilePickerData filePickerData2;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1904979825);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(label) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(filePickerData) : rVarH.G(filePickerData) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1904979825, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.epuapmessageform.AttachmentsSection (EpuapMessageFormScreen.kt:150)");
            }
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, label, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVarH, (i16 << 6) & 896, 0, 0, 33030107);
            rVar2 = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            int i18 = (FilePickerData.f131319k << 3) | (i16 & 112);
            filePickerData2 = filePickerData;
            m40.c.c(null, filePickerData2, rVar2, i18, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            filePickerData2 = filePickerData;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r22.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.m(label, filePickerData2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(Label label, FilePickerData filePickerData, int i15, p076m2.r rVar, int i16) {
        l(label, filePickerData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final List<FileBottomSheetItemData> list, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-763724399);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-763724399, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.epuapmessageform.BottomSheetContent (EpuapMessageFormScreen.kt:70)");
            }
            boolean zG = rVarH.G(list);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: r22.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.o(list, (f1.q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(null, null, null, false, null, null, null, false, null, (er.l) objE, rVarH, 0, 511);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r22.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.p(list, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(List list, f1.q0 q0Var) {
        q0Var.j(list.size(), null, new a(list), y2.m.b(2039820996, true, new b(list)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(List list, int i15, p076m2.r rVar, int i16) {
        n(list, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void q(final d.Data data, final d3 d3Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1214367276);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(d3Var) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1214367276, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.epuapmessageform.EpuapMessageFormInnerContent (EpuapMessageFormScreen.kt:80)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(companion, d3Var), null, rVarH, 0, 1), rVarH, 0);
            w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarN);
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
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            z(data, rVarH, i16 & 14);
            r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, 0);
            l(data.getAttachmentsSectionHeaderLabel(), data.getFilePickerData(), rVarH, FilePickerData.f131319k << 3);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r22.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.r(data, d3Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(d.Data data, d3 d3Var, int i15, p076m2.r rVar, int i16) {
        q(data, d3Var, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void s(final d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-194772570);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-194772570, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.epuapmessageform.EpuapMessageFormScreen (EpuapMessageFormScreen.kt:43)");
            }
            final f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            g30.m.j(t(f6VarC).getBottomSheetData(), t(f6VarC).getBaseScaffoldData(), 0.0f, null, null, y2.m.d(307600106, true, new er.p() { // from class: r22.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.u(f6VarC, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(1471181291, true, new er.p() { // from class: r22.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.v(f6VarC, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(2096140975, true, new er.q() { // from class: r22.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.w(f6VarC, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 14352384 | ModalBottomSheetData.f70192e | (BaseScaffoldData.f89350g << 3), 28);
            rVarH = rVarH;
            boolean zW = rVarH.W(f6VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: r22.i
                    @Override // er.a
                    public final Object a() {
                        return p.x(f6VarC);
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
            d5VarM.a(new er.p() { // from class: r22.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.y(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final d.Data t(f6<d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(307600106, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.epuapmessageform.EpuapMessageFormScreen.<anonymous> (EpuapMessageFormScreen.kt:56)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            h30.q.p(t(f6Var).getNextButton(), false, null, rVar, 0, 6);
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
    public static final oq.i0 v(f6 f6Var, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1471181291, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.epuapmessageform.EpuapMessageFormScreen.<anonymous> (EpuapMessageFormScreen.kt:48)");
            }
            n(t(f6Var).d(), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(f6 f6Var, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2096140975, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.epuapmessageform.EpuapMessageFormScreen.<anonymous> (EpuapMessageFormScreen.kt:50)");
            }
            q(t(f6Var), d3Var, rVar, (i15 << 3) & 112);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(f6 f6Var) {
        t(f6Var).b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(d dVar, int i15, p076m2.r rVar, int i16) {
        s(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static final void z(d.Data data, p076m2.r rVar, final int i15) {
        int i16;
        final d.Data data2;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(2058508189);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(data) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2058508189, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagewizard.epuapmessageform.FormSection (EpuapMessageFormScreen.kt:103)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                wq.a<r22.b> aVarE = r22.b.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(aVarE, 10)), 16));
                Iterator<r22.b> it = aVarE.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(it.next(), j1.e.a());
                }
                rVarH.v(linkedHashMap);
                objE = linkedHashMap;
            }
            final Map map = (Map) objE;
            r22.b fieldTypeToScroll = data.getFieldTypeToScroll();
            boolean zG = rVarH.G(data) | rVarH.G(map);
            Object objE2 = rVarH.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new c(data, map, null);
                rVarH.v(objE2);
            }
            Function0.d(fieldTypeToScroll, (er.p) objE2, rVarH, 0);
            Label formSectionHeaderLabel = data.getFormSectionHeaderLabel();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(null, null, formSectionHeaderLabel, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).j(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar2, i17).getSpacing200()), rVar2, 0);
            data2 = data;
            x30.c.c(null, 0.0f, y2.m.d(1000930460, true, new er.p() { // from class: r22.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.A(data2, map, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar2, 54), rVar2, MLKEMEngine.KyberPolyBytes, 3);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            data2 = data;
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: r22.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.B(data2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
