package v30;

import d1.e0;
import d1.r3;
import j30.ButtonTextData;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import r30.CheckBoxRowData;
import u50.v0;
import w30.CheckBoxSingleData;
import x40.LinkData;
import z60.DSScreenShotTestData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lv30/p;", "Lz60/b;", "Lw30/a;", "<init>", "()V", "", "isChecked", "Lr30/d;", "clickableTextData", "Lr30/a;", "q", "(ZLr30/d;)Lr30/a;", "Leu/h;", "Lz60/c;", "a", "Leu/h;", "d", "()Leu/h;", "screenShotTestValues", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends z60.b<CheckBoxSingleData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final eu.h<DSScreenShotTestData<CheckBoxSingleData>> screenShotTestValues;

    public p() {
        CheckBoxRowData checkBoxRowDataR = r(this, false, null, 3, null);
        r30.b.a aVar = r30.b.a.f171263a;
        DSScreenShotTestData dSScreenShotTestData = new DSScreenShotTestData("Default", new CheckBoxSingleData(checkBoxRowDataR, aVar, null, false, null, 28, null));
        DSScreenShotTestData dSScreenShotTestData2 = new DSScreenShotTestData("HelperText", new CheckBoxSingleData(r(this, true, null, 2, null), new r30.b.Helper(null, a("helper text"), 1, null), null, false, null, 28, null));
        DSScreenShotTestData dSScreenShotTestData3 = new DSScreenShotTestData("ErrorText", new CheckBoxSingleData(r(this, true, null, 2, null), new r30.b.Error(null, a("error text"), 1, null), null, false, null, 28, null));
        DSScreenShotTestData dSScreenShotTestData4 = new DSScreenShotTestData("Disabled checked", new CheckBoxSingleData(r(this, true, null, 2, null), aVar, null, false, null, 20, null));
        DSScreenShotTestData dSScreenShotTestData5 = new DSScreenShotTestData("Disabled unchecked", new CheckBoxSingleData(r(this, false, null, 2, null), aVar, null, false, null, 20, null));
        CheckBoxRowData checkBoxRowDataR2 = r(this, false, null, 3, null);
        r30.b.Helper helper = new r30.b.Helper(null, a("helper text"), 1, null);
        r30.c cVar = r30.c.CONTENT_BOX;
        DSScreenShotTestData dSScreenShotTestData6 = new DSScreenShotTestData("ContentBox", new CheckBoxSingleData(checkBoxRowDataR2, helper, cVar, false, null, 24, null));
        Label labelA = a("urlText");
        LinkData.EnumC5775a enumC5775a = LinkData.EnumC5775a.WEBSITE;
        this.screenShotTestValues = eu.k.s(dSScreenShotTestData, dSScreenShotTestData2, dSScreenShotTestData3, dSScreenShotTestData4, dSScreenShotTestData5, dSScreenShotTestData6, new DSScreenShotTestData("Url", new CheckBoxSingleData(q(true, new r30.d.Link(new LinkData(null, labelA, "url", enumC5775a, false, new er.l() { // from class: v30.e
            @Override // er.l
            public final Object b(Object obj) {
                return p.t((String) obj);
            }
        }, 17, null))), null, cVar, false, null, 26, null)), new DSScreenShotTestData("CheckBoxTextButton", new CheckBoxSingleData(r(this, false, new r30.d.Button(new ButtonTextData(null, a("textButton"), null, null, new er.a() { // from class: v30.g
            @Override // er.a
            public final Object a() {
                return p.u();
            }
        }, 13, null)), 1, null), null, cVar, false, null, 26, null)), new DSScreenShotTestData("UrlWithError", new CheckBoxSingleData(r(this, false, new r30.d.Link(new LinkData(null, a("urlText"), "url", enumC5775a, false, new er.l() { // from class: v30.h
            @Override // er.l
            public final Object b(Object obj) {
                return p.v((String) obj);
            }
        }, 17, null)), 1, null), new r30.b.Error(null, a("error text"), 1, null), null, false, null, 28, null)), new DSScreenShotTestData("CustomContent", new CheckBoxSingleData(new CheckBoxRowData(null, true, new er.l() { // from class: v30.i
            @Override // er.l
            public final Object b(Object obj) {
                return p.w(((Boolean) obj).booleanValue());
            }
        }, a("Checkbox label"), null, null, null, y2.m.b(972061210, true, new er.p() { // from class: v30.j
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p.x(this.f203430a, (r) obj, ((Integer) obj2).intValue());
            }
        }), 113, null), null, cVar, false, null, 26, null)), new DSScreenShotTestData("CustomContentAndTextButton", new CheckBoxSingleData(new CheckBoxRowData(null, true, new er.l() { // from class: v30.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.z(((Boolean) obj).booleanValue());
            }
        }, a("Checkbox label"), null, null, new r30.d.Button(new ButtonTextData(null, a("textButton"), null, null, new er.a() { // from class: v30.l
            @Override // er.a
            public final Object a() {
                return p.A();
            }
        }, 13, null)), y2.m.b(-939272594, true, new er.p() { // from class: v30.m
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p.B(this.f203431a, (r) obj, ((Integer) obj2).intValue());
            }
        }), 49, null), null, cVar, false, null, 26, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A() {
        System.out.println((Object) "buttonText clicked");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-939272594, i15, -1, "pl.gov.coi.common.ui.ds.checkbox.single.CheckBoxSinglePPP.screenShotTestValues.<anonymous> (CheckBoxSinglePPP.kt:151)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label labelA = pVar.a("Description");
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, labelA, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).f(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            Label labelA2 = pVar.a("TextInput value");
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: v30.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.C((String) obj);
                    }
                };
                rVar.v(objE);
            }
            v0.g(new v50.c.Text(null, null, null, labelA2, null, null, null, (er.l) objE, null, false, 0, null, false, null, false, null, null, null, null, null, 1048439, null), null, rVar, 0, 2);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(String str) {
        return i0.f148189a;
    }

    private final CheckBoxRowData q(boolean isChecked, r30.d clickableTextData) {
        return new CheckBoxRowData(null, isChecked, new er.l() { // from class: v30.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.s(((Boolean) obj).booleanValue());
            }
        }, a("Checkbox label"), null, null, clickableTextData, null, 177, null);
    }

    static /* synthetic */ CheckBoxRowData r(p pVar, boolean z15, r30.d dVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        if ((i15 & 2) != 0) {
            dVar = null;
        }
        return pVar.q(z15, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(String str) {
        System.out.println((Object) ("Checkbox " + str + " clicked"));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u() {
        System.out.println((Object) "buttonText clicked");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(String str) {
        System.out.println((Object) ("Checkbox " + str + " clicked"));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(972061210, i15, -1, "pl.gov.coi.common.ui.ds.checkbox.single.CheckBoxSinglePPP.screenShotTestValues.<anonymous> (CheckBoxSinglePPP.kt:122)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label labelA = pVar.a("Description");
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, labelA, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).f(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            Label labelA2 = pVar.a("TextInput value");
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: v30.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.y((String) obj);
                    }
                };
                rVar.v(objE);
            }
            v0.g(new v50.c.Text(null, null, null, labelA2, null, null, null, (er.l) objE, null, false, 0, null, false, null, false, null, null, null, null, null, 1048439, null), null, rVar, 0, 2);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(String str) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(boolean z15) {
        return i0.f148189a;
    }

    @Override // z60.b
    public eu.h<DSScreenShotTestData<CheckBoxSingleData>> d() {
        return this.screenShotTestValues;
    }
}
