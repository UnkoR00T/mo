package v40;

import androidx.compose.ui.graphics.Color;
import b1.k;
import b1.l;
import d1.a3;
import d1.e0;
import d1.h0;
import d1.m3;
import d1.p3;
import d1.q3;
import er.p;
import er.q;
import f3.j;
import f3.m;
import mx.Label;
import n3.y2;
import n4.f0;
import n4.i0;
import n4.v;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.c2;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import t70.s;
import w0.BorderStroke;
import w0.r1;
import w0.x;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\n\u001a\u0013\u0010\f\u001a\u00020\b*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lv40/a;", "data", "Loq/i0;", "h", "(Lv40/a;Lm2/r;I)V", "Lw0/w;", "p", "(Lv40/a;Lm2/r;I)Lw0/w;", "", "r", "(Lv40/a;)Ljava/lang/String;", "s", "q", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputDateTimeData f203794a;

        a(InputDateTimeData inputDateTimeData) {
            this.f203794a = inputDateTimeData;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            long jK;
            rVar.X(-29742944);
            if (t.k()) {
                t.o(-29742944, i15, -1, "pl.gov.coi.common.ui.ds.inputdatetime.InputDateTime.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InputDateTime.kt:138)");
            }
            if (this.f203794a.getEnabled()) {
                rVar.X(-1308745890);
                jK = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                rVar.R();
            } else {
                rVar.X(-1308672513);
                jK = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().k();
                rVar.R();
            }
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jK;
        }
    }

    public static final void h(final InputDateTimeData inputDateTimeData, r rVar, final int i15) {
        int i16;
        String str;
        long jD;
        final InputDateTimeData inputDateTimeData2 = inputDateTimeData;
        r rVarH = rVar.h(143939955);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(inputDateTimeData2) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(143939955, i16, -1, "pl.gov.coi.common.ui.ds.inputdatetime.InputDateTime (InputDateTime.kt:51)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = s.I();
                rVarH.v(objE);
            }
            final cx.a aVar = (cx.a) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = k.a();
                rVarH.v(objE2);
            }
            l lVar = (l) objE2;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            m.Companion companion2 = m.INSTANCE;
            m mVarC = androidx.compose.foundation.layout.d.C(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), null, false, 3, null);
            boolean zG = rVarH.G(inputDateTimeData2);
            Object objE3 = rVarH.E();
            if (zG || objE3 == companion.a()) {
                objE3 = new er.l() { // from class: v40.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.i(inputDateTimeData2, (i0) obj);
                    }
                };
                rVarH.v(objE3);
            }
            m mVarE = d60.m.e(v.d(mVarC, false, (er.l) objE3, 1, null), inputDateTimeData2.getFieldIndex(), rVarH, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarE);
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
            n6.i(rVarC, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            String testTag = inputDateTimeData2.getTestTag();
            if (testTag != null) {
                str = testTag + "Text";
            } else {
                str = null;
            }
            Label label = inputDateTimeData2.getLabel();
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            TextStyle textStyleD = aVar2.f(rVarH, i17).d();
            if (inputDateTimeData2.getEnabled()) {
                rVarH.X(-1474395023);
                jD = aVar2.a(rVarH, i17).getNeutral().b();
                rVarH.R();
            } else {
                rVarH.X(-1474337487);
                jD = aVar2.a(rVarH, i17).getNeutral().d();
                rVarH.R();
            }
            Label labelContentDescription = inputDateTimeData2.getLabelContentDescription();
            if (labelContentDescription == null) {
                labelContentDescription = inputDateTimeData2.getLabel();
            }
            int i18 = i16;
            j70.h.g(null, str, label, labelContentDescription, null, jD, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleD, null, null, false, true, null, rVarH, 0, 0, 3072, 24641489);
            m mVarP = a3.p(companion2, 0.0f, aVar2.b(rVarH, i17).getSpacing50(), 1, null);
            boolean zG2 = rVarH.G(inputDateTimeData);
            Object objE4 = rVarH.E();
            if (zG2 || objE4 == companion.a()) {
                objE4 = new er.l() { // from class: v40.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.j(inputDateTimeData, (i0) obj);
                    }
                };
                rVarH.v(objE4);
            }
            m mVarW = s.w(v.c(mVarP, true, (er.l) objE4), f6VarA, aVar2.b(rVarH, i17).getSpacing150(), 0.0f, 4, null);
            boolean enabled = inputDateTimeData.getEnabled();
            r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
            n4.l lVarJ = n4.l.j(n4.l.INSTANCE.a());
            boolean zG3 = rVarH.G(aVar) | rVarH.G(inputDateTimeData);
            Object objE5 = rVarH.E();
            if (zG3 || objE5 == companion.a()) {
                objE5 = new er.a() { // from class: v40.d
                    @Override // er.a
                    public final Object a() {
                        return i.k(aVar, inputDateTimeData);
                    }
                };
                rVarH.v(objE5);
            }
            m mVarL = androidx.compose.foundation.b.l(mVarW, lVar, r1VarE, enabled, null, lVarJ, (er.a) objE5, 8, null);
            BorderStroke borderStrokeP = p(inputDateTimeData, rVarH, i18 & 14);
            y2 radius150 = aVar2.e(rVarH, i17).getRadius150();
            y1 y1Var = y1.f58315a;
            float level0 = aVar2.c(rVarH, i17).getLevel0();
            int i19 = y1.f58316b;
            inputDateTimeData2 = inputDateTimeData;
            c2.c(mVarL, radius150, y1Var.b(aVar2.a(rVarH, i17).getSurface().a(), 0L, 0L, 0L, rVarH, i19 << 12, 14), y1Var.c(level0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVarH, i19 << 18, 62), borderStrokeP, y2.m.d(1666786443, true, new q() { // from class: v40.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return i.m(inputDateTimeData2, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 196608, 0);
            rVarH = rVarH;
            if (inputDateTimeData2.getValidationState() instanceof hz.b.Invalid) {
                rVarH.X(-1471686708);
                l40.d.d(null, ((hz.b.Invalid) inputDateTimeData2.getValidationState()).getMessage(), true, rVarH, MLKEMEngine.KyberPolyBytes, 1);
                rVarH.R();
                oq.i0 i0Var2 = oq.i0.f148189a;
            } else {
                rVarH.X(-1471535893);
                Label helperText = inputDateTimeData2.getHelperText();
                if (helperText == null) {
                    rVarH.X(-1471535894);
                } else {
                    rVarH.X(-1471535893);
                    p40.b.b(null, helperText, true, rVarH, MLKEMEngine.KyberPolyBytes, 1);
                    oq.i0 i0Var3 = oq.i0.f148189a;
                }
                rVarH.R();
                rVarH.R();
            }
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: v40.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.o(inputDateTimeData2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(InputDateTimeData inputDateTimeData, i0 i0Var) {
        if (inputDateTimeData.getValidationState() instanceof hz.b.Invalid) {
            f0.l0(i0Var, n4.i.INSTANCE.a());
            f0.x0(i0Var, ((hz.b.Invalid) inputDateTimeData.getValidationState()).getMessage().getText());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Instruction removed from duplicated block: B:10:0x0023, please report this as an issue */
    public static final oq.i0 j(InputDateTimeData inputDateTimeData, i0 i0Var) {
        String str;
        if (!inputDateTimeData.getEnabled()) {
            f0.j(i0Var);
        }
        String testTag = inputDateTimeData.getTestTag();
        if (testTag != null) {
            str = testTag + "EditValue";
            if (str == null) {
                str = inputDateTimeData.getLabel().getText() + "Value";
            }
        } else {
            str = inputDateTimeData.getLabel().getText() + "Value";
        }
        f0.y0(i0Var, str);
        f0.c0(i0Var, q(inputDateTimeData));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(cx.a aVar, final InputDateTimeData inputDateTimeData) {
        cx.a.a(aVar, 0L, new er.a() { // from class: v40.h
            @Override // er.a
            public final Object a() {
                return i.l(inputDateTimeData);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(InputDateTimeData inputDateTimeData) {
        inputDateTimeData.j().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(InputDateTimeData inputDateTimeData, h0 h0Var, r rVar, int i15) {
        long jD;
        String inputText;
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(1666786443, i15, -1, "pl.gov.coi.common.ui.ds.inputdatetime.InputDateTime.<anonymous>.<anonymous> (InputDateTime.kt:112)");
            }
            m.Companion companion = m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            m mVarH = androidx.compose.foundation.layout.d.h(a3.n(w0.i.d(companion, aVar.a(rVar, i16).getNeutral().c(), null, 2, null), aVar.b(rVar, i16).getSpacing200()), 0.0f, 1, null);
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: v40.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.n((i0) obj);
                    }
                };
                rVar.v(objE);
            }
            m mVarD = v.d(mVarH, false, (er.l) objE, 1, null);
            w0 w0VarB = m3.b(d1.i.f39152a.r(aVar.b(rVar, i16).getSpacing100()), f3.c.INSTANCE.i(), rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            m mVarE = j.e(rVar, mVarD);
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            m mVarC = p3.c(q3.f39261a, companion, 1.0f, false, 2, null);
            Label labelB = mx.b.b(r(inputDateTimeData), "inputText");
            int iB = b5.v.INSTANCE.b();
            TextStyle textStyleB = aVar.f(rVar, i16).b();
            if (!inputDateTimeData.getEnabled() || (inputText = inputDateTimeData.getInputText()) == null || fu.r.t0(inputText)) {
                rVar.X(1267782609);
                jD = aVar.a(rVar, i16).getNeutral().d();
                rVar.R();
            } else {
                rVar.X(1267784369);
                jD = aVar.a(rVar, i16).getNeutral().i();
                rVar.R();
            }
            j70.h.g(mVarC, null, labelB, null, null, jD, 0L, null, null, null, 0L, null, null, 0L, iB, false, 1, 0, null, textStyleB, null, null, false, true, null, rVar, 0, 1597440, 3072, 24559578);
            d40.h.f(null, new d40.b.C0864b(null, inputDateTimeData.getType().getIconResId(), d40.i.f.f39709e, new a(inputDateTimeData), null, null, 33, null), false, rVar, 0, 5);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(InputDateTimeData inputDateTimeData, int i15, r rVar, int i16) {
        h(inputDateTimeData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final BorderStroke p(InputDateTimeData inputDateTimeData, r rVar, int i15) {
        long jA;
        if (t.k()) {
            t.o(1971437334, i15, -1, "pl.gov.coi.common.ui.ds.inputdatetime.getBorderStroke (InputDateTime.kt:166)");
        }
        k70.a aVar = k70.a.f108864a;
        int i16 = k70.a.f108865b;
        float strokeWidth = aVar.b(rVar, i16).getStrokeWidth();
        if (inputDateTimeData.getValidationState() instanceof hz.b.Invalid) {
            rVar.X(470706690);
            jA = aVar.a(rVar, i16).getSupport().g();
            rVar.R();
        } else if (inputDateTimeData.getEnabled()) {
            rVar.X(470710175);
            jA = aVar.a(rVar, i16).getNeutral().a();
            rVar.R();
        } else {
            rVar.X(470708703);
            jA = aVar.a(rVar, i16).getNeutral().g();
            rVar.R();
        }
        BorderStroke borderStrokeA = x.a(strokeWidth, jA);
        if (t.k()) {
            t.n();
        }
        return borderStrokeA;
    }

    private static final String q(InputDateTimeData inputDateTimeData) {
        String text;
        StringBuilder sb5 = new StringBuilder();
        Label labelContentDescription = inputDateTimeData.getLabelContentDescription();
        if (labelContentDescription == null || (text = labelContentDescription.getText()) == null) {
            text = "";
        }
        sb5.append(text);
        sb5.append(s.O(inputDateTimeData.getLabel()));
        sb5.append(s.N(s(inputDateTimeData)));
        sb5.append(fu.r.u1(s.O(inputDateTimeData.getValidationState() instanceof hz.b.Invalid ? ((hz.b.Invalid) inputDateTimeData.getValidationState()).getMessage() : inputDateTimeData.getHelperText())).toString());
        return sb5.toString();
    }

    private static final String r(InputDateTimeData inputDateTimeData) {
        String inputText = inputDateTimeData.getInputText();
        if (inputText != null) {
            if (fu.r.t0(inputText)) {
                inputText = null;
            }
            if (inputText != null) {
                return inputText;
            }
        }
        return inputDateTimeData.getType().getPlaceholder();
    }

    private static final String s(InputDateTimeData inputDateTimeData) {
        String text;
        Label inputTextContentDescription = inputDateTimeData.getInputTextContentDescription();
        if (inputTextContentDescription != null && (text = inputTextContentDescription.getText()) != null) {
            if (fu.r.t0(text)) {
                text = null;
            }
            if (text != null) {
                return text;
            }
        }
        String inputText = inputDateTimeData.getInputText();
        if (inputText != null) {
            String str = fu.r.t0(inputText) ? null : inputText;
            if (str != null) {
                return str;
            }
        }
        return inputDateTimeData.getType().getPlaceholder();
    }
}
