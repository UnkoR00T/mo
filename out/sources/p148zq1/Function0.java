package p148zq1;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.e0;
import d1.r3;
import er.l;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import i30.ButtonIconData;
import j70.h;
import mx.Label;
import mx.b;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p70.n;
import t50.TextAreaData;
import t50.e;
import t50.s;
import w0.i;

/* JADX INFO: renamed from: zq1.g, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "g", "(Ler/a;Lm2/r;I)V", "", "textArea1", "textArea2", "", "isValid", "textArea3", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: zq1.g$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f236355a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-1443574983);
            if (t.k()) {
                t.o(-1443574983, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.textarea.DeveloperTextAreaScreen.<anonymous>.<anonymous> (DeveloperTextAreaScreen.kt:37)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public static final void g(final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(312329170);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(312329170, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.textarea.DeveloperTextAreaScreen (DeveloperTextAreaScreen.kt:31)");
            }
            m.Companion companion = m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarD = i.d(companion, aVar2.a(rVarH, i17).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            c.Companion companion2 = c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarD);
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            n.g(null, null, b.b("TextArea (1.1.0)", ""), null, null, 0L, null, new ButtonIconData(null, jz.a.U, a.f236355a, null, c70.a.f23835a.a().R(), aVar, 9, null), rVarH, ButtonIconData.f88935g << 21, 123);
            c.b bVarK = companion2.k();
            m mVarS = t70.i.S(d.f(a3.r(companion, aVar2.b(rVarH, i17).getSpacing200(), 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 0.0f, 10, null), 0.0f, 1, null), null, rVarH, 0, 1);
            w0 w0VarA2 = e0.a(iVar.k(), bVarK, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarS);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            h.g(null, null, b.b("TextArea", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            h.g(a3.r(companion, 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 5, null), null, b.b("TextArea - resizable, multiline InputField with chars counter", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            h.g(null, null, b.b("TextArea - flexible", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Object objE = rVarH.E();
            r.Companion companion4 = r.INSTANCE;
            if (objE == companion4.a()) {
                objE = c6.e("", null, 2, null);
                rVarH.v(objE);
            }
            final p076m2.a3 a3Var = (p076m2.a3) objE;
            Label labelB = b.b("TextArea - flexible", "");
            Label labelB2 = b.b("TextArea - flexible", "");
            String strH = h(a3Var);
            s.Flexible flexible = new s.Flexible(0, 1, null);
            t50.a.C4878a c4878a = t50.a.C4878a.f187691a;
            e.Default r15 = new e.Default(null, 1, null);
            Object objE2 = rVarH.E();
            if (objE2 == companion4.a()) {
                objE2 = new l() { // from class: zq1.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.p(a3Var, (String) obj);
                    }
                };
                rVarH.v(objE2);
            }
            TextAreaData textAreaData = new TextAreaData(null, labelB, flexible, null, r15, strH, false, c4878a, labelB2, 0, null, null, (l) objE2, null, 11849, null);
            int i18 = TextAreaData.f187694o;
            t50.r.m(textAreaData, null, rVarH, i18, 2);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            h.g(null, null, b.b("TextArea - Fix", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Object objE3 = rVarH.E();
            if (objE3 == companion4.a()) {
                objE3 = c6.e("", null, 2, null);
                rVarH.v(objE3);
            }
            final p076m2.a3 a3Var2 = (p076m2.a3) objE3;
            Object objE4 = rVarH.E();
            if (objE4 == companion4.a()) {
                objE4 = c6.e(Boolean.TRUE, null, 2, null);
                rVarH.v(objE4);
            }
            final p076m2.a3 a3Var3 = (p076m2.a3) objE4;
            Label labelB3 = b.b("TextArea - Fix", "");
            Label labelB4 = b.b("Flexible text area - hint", "");
            String strQ = q(a3Var2);
            s.Fix fix = new s.Fix(4);
            Object objE5 = rVarH.E();
            if (objE5 == companion4.a()) {
                objE5 = new l() { // from class: zq1.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.i(a3Var3, ((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE5);
            }
            t50.a.Visible visible = new t50.a.Visible(30, (l) objE5);
            e eVar = s(a3Var3) ? new e.Default(null, 1, null) : new e.Error(b.b("Przekroczony limit.", ""));
            Object objE6 = rVarH.E();
            if (objE6 == companion4.a()) {
                objE6 = new l() { // from class: zq1.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.j(a3Var2, (String) obj);
                    }
                };
                rVarH.v(objE6);
            }
            t50.r.m(new TextAreaData(null, labelB3, fix, null, eVar, strQ, false, visible, labelB4, 0, null, null, (l) objE6, null, 11849, null), null, rVarH, i18, 2);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            h.g(null, null, b.b("TextArea - Fix, disabled", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Object objE7 = rVarH.E();
            if (objE7 == companion4.a()) {
                objE7 = c6.e("", null, 2, null);
                rVarH.v(objE7);
            }
            final p076m2.a3 a3Var4 = (p076m2.a3) objE7;
            Label labelB5 = b.b("TextArea - Fix, disabled", "");
            Label labelB6 = b.b("TextArea - Fix, disabled", "");
            String strK = k(a3Var4);
            s.Fix fix2 = new s.Fix(4);
            Object objE8 = rVarH.E();
            if (objE8 == companion4.a()) {
                objE8 = new l() { // from class: zq1.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.m(((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE8);
            }
            t50.a.Visible visible2 = new t50.a.Visible(300, (l) objE8);
            e.Default r16 = new e.Default(b.b("HelperText", ""));
            Object objE9 = rVarH.E();
            if (objE9 == companion4.a()) {
                objE9 = new l() { // from class: zq1.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.n(a3Var4, (String) obj);
                    }
                };
                rVarH.v(objE9);
            }
            t50.r.m(new TextAreaData(null, labelB5, fix2, null, r16, strK, false, visible2, labelB6, 0, null, null, (l) objE9, null, 11785, null), null, rVarH, i18, 2);
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: zq1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.u(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String h(p076m2.a3<String> a3Var) {
        return a3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(p076m2.a3 a3Var, boolean z15) {
        t(a3Var, !z15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(p076m2.a3 a3Var, String str) {
        r(a3Var, str);
        return i0.f148189a;
    }

    private static final String k(p076m2.a3<String> a3Var) {
        return a3Var.getValue();
    }

    private static final void l(p076m2.a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(p076m2.a3 a3Var, String str) {
        l(a3Var, str);
        return i0.f148189a;
    }

    private static final void o(p076m2.a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(p076m2.a3 a3Var, String str) {
        o(a3Var, str);
        return i0.f148189a;
    }

    private static final String q(p076m2.a3<String> a3Var) {
        return a3Var.getValue();
    }

    private static final void r(p076m2.a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    private static final boolean s(p076m2.a3<Boolean> a3Var) {
        return a3Var.getValue().booleanValue();
    }

    private static final void t(p076m2.a3<Boolean> a3Var, boolean z15) {
        a3Var.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(er.a aVar, int i15, r rVar, int i16) {
        g(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
