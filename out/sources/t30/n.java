package t30;

import d1.e0;
import d1.i0;
import d1.r3;
import er.p;
import j30.ButtonTextData;
import java.util.List;
import mx.Label;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;
import r30.CheckBoxRowData;
import u30.CheckBoxGroupData;
import u30.CheckBoxHeaderData;
import u50.v0;
import x40.LinkData;
import z60.DSScreenShotTestData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JC\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lt30/n;", "Lz60/b;", "Lu30/a;", "<init>", "()V", "", "isChecked", "", "description", "Lr30/d;", "clickableTextData", "Lkotlin/Function0;", "Loq/i0;", "customContent", "Lr30/a;", "q", "(ZLjava/lang/String;Lr30/d;Ler/p;)Lr30/a;", "n", "(Lm2/r;I)V", "Lu30/b;", "t", "()Lu30/b;", "Leu/h;", "Lz60/c;", "a", "Leu/h;", "d", "()Leu/h;", "screenShotTestValues", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends z60.b<CheckBoxGroupData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final eu.h<DSScreenShotTestData<CheckBoxGroupData>> screenShotTestValues;

    public n() {
        List listQ = v.q(r(this, true, null, null, null, 14, null), r(this, false, null, null, null, 15, null));
        CheckBoxHeaderData checkBoxHeaderDataT = t();
        r30.b.a aVar = r30.b.a.f171263a;
        DSScreenShotTestData dSScreenShotTestData = new DSScreenShotTestData("CheckboxGroup", new CheckBoxGroupData(listQ, checkBoxHeaderDataT, aVar, null, false, null, 56, null));
        DSScreenShotTestData dSScreenShotTestData2 = new DSScreenShotTestData("CheckboxesWithErrorText", new CheckBoxGroupData(v.q(r(this, false, null, null, null, 15, null), r(this, false, null, null, null, 15, null)), t(), new r30.b.Error(null, a("errorText"), 1, null), null, false, null, 56, null));
        DSScreenShotTestData dSScreenShotTestData3 = new DSScreenShotTestData("CheckboxesWithHelperText", new CheckBoxGroupData(v.q(r(this, false, null, null, null, 15, null), r(this, false, null, null, null, 15, null)), t(), new r30.b.Helper(null, a("Helper text"), 1, null), null, false, null, 56, null));
        DSScreenShotTestData dSScreenShotTestData4 = new DSScreenShotTestData("CheckboxesUrl", new CheckBoxGroupData(v.q(r(this, true, null, null, null, 14, null), r(this, false, null, new r30.d.Link(new LinkData(null, a("urlText"), "url", LinkData.EnumC5775a.WEBSITE, false, new er.l() { // from class: t30.f
            @Override // er.l
            public final Object b(Object obj) {
                return n.v((String) obj);
            }
        }, 17, null)), null, 11, null)), t(), aVar, null, false, null, 56, null));
        DSScreenShotTestData dSScreenShotTestData5 = new DSScreenShotTestData("CheckboxesTextButton", new CheckBoxGroupData(v.q(r(this, true, null, null, null, 14, null), r(this, false, null, new r30.d.Button(new ButtonTextData(null, a("text button"), null, null, new er.a() { // from class: t30.g
            @Override // er.a
            public final Object a() {
                return n.w();
            }
        }, 13, null)), null, 11, null)), t(), aVar, null, false, null, 56, null));
        CheckBoxHeaderData checkBoxHeaderDataT2 = t();
        List listQ2 = v.q(r(this, true, null, null, null, 14, null), r(this, false, null, null, null, 15, null));
        r30.b.Error error = new r30.b.Error(null, a("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation "), 1, null);
        r30.c cVar = r30.c.CONTENT_BOX;
        this.screenShotTestValues = eu.k.s(dSScreenShotTestData, dSScreenShotTestData2, dSScreenShotTestData3, dSScreenShotTestData4, dSScreenShotTestData5, new DSScreenShotTestData("CheckboxesContentWithError", new CheckBoxGroupData(listQ2, checkBoxHeaderDataT2, error, cVar, false, null, 48, null)), new DSScreenShotTestData("CheckboxesDisabled", new CheckBoxGroupData(v.q(r(this, true, null, null, null, 14, null), r(this, true, null, null, null, 14, null), r(this, false, null, null, null, 15, null)), t(), new r30.b.Error(null, a("Error text"), 1, null), null, false, null, 40, null)), new DSScreenShotTestData("CheckboxesWithCustomContents", new CheckBoxGroupData(v.q(r(this, true, null, null, y2.m.b(-1274612410, true, new p() { // from class: t30.h
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return n.x(this.f187411a, (r) obj, ((Integer) obj2).intValue());
            }
        }), 6, null), r(this, true, null, null, y2.m.b(215956295, true, new p() { // from class: t30.i
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return n.y(this.f187412a, (r) obj, ((Integer) obj2).intValue());
            }
        }), 6, null), r(this, false, null, null, null, 15, null)), null, null, cVar, false, null, 54, null)), new DSScreenShotTestData("CheckboxesDescription", new CheckBoxGroupData(v.q(r(this, false, "Description text", null, null, 13, null), r(this, false, "Description text 2", null, null, 13, null)), t(), new r30.b.Error(null, a("Error text"), 1, null), null, false, null, 40, null)));
    }

    private final void n(r rVar, final int i15) {
        int i16;
        final n nVar;
        r rVarH = rVar.h(-537615660);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(this) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-537615660, i16, -1, "pl.gov.coi.common.ui.ds.checkbox.group.GroupCheckBoxPPP.CheckboxCustomContent (GroupCheckBoxPPP.kt:167)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            i0 i0Var = i0.f39176a;
            Label labelA = a("Description");
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, labelA, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).f(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            nVar = this;
            Label labelA2 = nVar.a("TextInput value");
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: t30.l
                    @Override // er.l
                    public final Object b(Object obj) {
                        return n.o((String) obj);
                    }
                };
                rVarH.v(objE);
            }
            v0.g(new v50.c.Text(null, null, null, labelA2, null, null, null, (er.l) objE, null, false, 0, null, false, null, false, null, null, null, null, null, 1048439, null), null, rVarH, 0, 2);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            nVar = this;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: t30.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return n.p(this.f187413a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(String str) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(n nVar, int i15, r rVar, int i16) {
        nVar.n(rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private final CheckBoxRowData q(boolean isChecked, String description, r30.d clickableTextData, p<? super r, ? super Integer, oq.i0> customContent) {
        return new CheckBoxRowData(null, isChecked, new er.l() { // from class: t30.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.s(((Boolean) obj).booleanValue());
            }
        }, a("Checkbox label"), description != null ? a(description) : null, null, clickableTextData, customContent, 33, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ CheckBoxRowData r(n nVar, boolean z15, String str, r30.d dVar, p pVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        if ((i15 & 2) != 0) {
            str = null;
        }
        if ((i15 & 4) != 0) {
            dVar = null;
        }
        if ((i15 & 8) != 0) {
            pVar = null;
        }
        return nVar.q(z15, str, dVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(boolean z15) {
        return oq.i0.f148189a;
    }

    private final CheckBoxHeaderData t() {
        return new CheckBoxHeaderData(a("Checkbox group Label"), new er.a() { // from class: t30.k
            @Override // er.a
            public final Object a() {
                return n.u();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(String str) {
        System.out.println((Object) ("Checkbox " + str + " clicked"));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(n nVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1274612410, i15, -1, "pl.gov.coi.common.ui.ds.checkbox.group.GroupCheckBoxPPP.screenShotTestValues.<anonymous> (GroupCheckBoxPPP.kt:130)");
            }
            nVar.n(rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(n nVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(215956295, i15, -1, "pl.gov.coi.common.ui.ds.checkbox.group.GroupCheckBoxPPP.screenShotTestValues.<anonymous> (GroupCheckBoxPPP.kt:131)");
            }
            nVar.n(rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    @Override // z60.b
    public eu.h<DSScreenShotTestData<CheckBoxGroupData>> d() {
        return this.screenShotTestValues;
    }
}
