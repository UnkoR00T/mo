package t50;

import androidx.compose.ui.graphics.SolidColor;
import b5.TextGeometricTransform;
import d1.a3;
import d1.e0;
import d1.h0;
import d1.r3;
import fr.t;
import l3.l0;
import mx.Label;
import n3.Shadow;
import n3.y2;
import n4.f0;
import n4.g0;
import n4.v;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p030d20.Function0;
import p036e4.w0;
import p046f2.c2;
import p046f2.y1;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p079n1.KeyboardOptions;
import p079n1.u;
import q4.SpanStyle;
import q4.TextStyle;
import q4.j0;
import u4.FontWeight;
import u4.y;
import u4.z;
import v4.a0;
import v4.e1;
import w0.BorderStroke;
import w0.x;
import x4.LocaleList;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0017\u0010\u0016\u001a'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010!\u001a\u00020 *\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010%\u001a\u00020 *\u00020#2\u0006\u0010$\u001a\u00020\u0014H\u0002¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lt50/d;", "data", "Ld60/c;", "focusHost", "Loq/i0;", "m", "(Lt50/d;Ld60/c;Lm2/r;II)V", "q", "Lc5/h;", ip.a.f96138c, "(Ld60/c;Lm2/r;I)F", "Lt50/e;", "state", "", "isFocused", "Landroidx/compose/ui/graphics/j;", "F", "(Lt50/e;ZLm2/r;I)Landroidx/compose/ui/graphics/j;", "Lt50/s;", "textAreaType", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lt50/s;Lm2/r;I)I", "G", "enabled", "Landroidx/compose/ui/graphics/Color;", "E", "(ZLt50/e;ZLm2/r;I)J", "contentLength", "maxLength", "z", "(ZIILm2/r;I)V", "", "C", "(Lt50/d;)Ljava/lang/String;", "Lt50/a;", "textLength", "B", "(Lt50/a;I)Ljava/lang/String;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(boolean z15, int i15, int i16, int i17, p076m2.r rVar, int i18) {
        z(z15, i15, i16, rVar, g4.a(i17 | 1));
        return i0.f148189a;
    }

    private static final String B(a aVar, int i15) {
        if (!(aVar instanceof a.Visible)) {
            if (t.c(aVar, a.C4878a.f187691a)) {
                return "";
            }
            throw new oq.p();
        }
        StringBuilder sb5 = new StringBuilder();
        c70.a aVar2 = c70.a.f23835a;
        sb5.append(aVar2.a().B0(String.valueOf(i15)).getText());
        sb5.append(", ");
        sb5.append(aVar2.a().Y(String.valueOf(((a.Visible) aVar).getMaxLength())).getText());
        return sb5.toString();
    }

    private static final String C(TextAreaData textAreaData) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(t70.s.O(textAreaData.getLabel()));
        e state = textAreaData.getState();
        e.Default r15 = state instanceof e.Default ? (e.Default) state : null;
        sb5.append(fu.r.u1(t70.s.O(r15 != null ? r15.getHelperLabel() : null)).toString());
        sb5.append(' ');
        sb5.append(B(textAreaData.getCounterState(), textAreaData.getContent().length()));
        return sb5.toString();
    }

    private static final float D(d60.c cVar, p076m2.r rVar, int i15) {
        float strokeWidth;
        if (p076m2.t.k()) {
            p076m2.t.o(506245175, i15, -1, "pl.gov.coi.common.ui.ds.textarea.getBorderWidth (TextArea.kt:210)");
        }
        if (cVar.j()) {
            rVar.X(1919900712);
            strokeWidth = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing25();
            rVar.R();
        } else {
            rVar.X(1919941446);
            strokeWidth = k70.a.f108864a.b(rVar, k70.a.f108865b).getStrokeWidth();
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return strokeWidth;
    }

    private static final long E(boolean z15, e eVar, boolean z16, p076m2.r rVar, int i15) {
        long jA;
        if (p076m2.t.k()) {
            p076m2.t.o(781182658, i15, -1, "pl.gov.coi.common.ui.ds.textarea.getCardBorderColor (TextArea.kt:253)");
        }
        if (!z15) {
            rVar.X(-902737717);
            jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().g();
            rVar.R();
        } else if (eVar instanceof e.Error) {
            rVar.X(-902735410);
            jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            rVar.R();
        } else if (z16) {
            rVar.X(-902733847);
            jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            rVar.R();
        } else {
            rVar.X(-902732501);
            jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().a();
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return jA;
    }

    private static final SolidColor F(e eVar, boolean z15, p076m2.r rVar, int i15) {
        SolidColor solidColor;
        long jD;
        if (p076m2.t.k()) {
            p076m2.t.o(-1093612795, i15, -1, "pl.gov.coi.common.ui.ds.textarea.getCursorBrushColor (TextArea.kt:220)");
        }
        if (eVar instanceof e.Error) {
            rVar.X(1305095605);
            solidColor = new SolidColor(k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g(), null);
            rVar.R();
        } else {
            rVar.X(1305097585);
            if (z15) {
                rVar.X(1803355123);
                jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
                rVar.R();
            } else {
                rVar.X(1803402925);
                jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().d();
                rVar.R();
            }
            solidColor = new SolidColor(jD, null);
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return solidColor;
    }

    private static final int G(s sVar, p076m2.r rVar, int i15) {
        int maxLines;
        if (p076m2.t.k()) {
            p076m2.t.o(-1063192373, i15, -1, "pl.gov.coi.common.ui.ds.textarea.getMaxLines (TextArea.kt:243)");
        }
        if (sVar instanceof s.Fix) {
            maxLines = ((s.Fix) sVar).getLines();
        } else {
            if (!(sVar instanceof s.Flexible)) {
                throw new oq.p();
            }
            maxLines = ((s.Flexible) sVar).getMaxLines();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return maxLines;
    }

    private static final int H(s sVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2137353031, i15, -1, "pl.gov.coi.common.ui.ds.textarea.getMinLines (TextArea.kt:234)");
        }
        int lines = sVar instanceof s.Fix ? ((s.Fix) sVar).getLines() : 1;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return lines;
    }

    public static final void m(final TextAreaData textAreaData, final d60.c cVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(10795809);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(textAreaData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= ((i16 & 2) == 0 && rVarH.W(cVar)) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
                if ((i16 & 2) != 0) {
                    i17 &= -113;
                }
            } else if ((i16 & 2) != 0) {
                cVar = d60.e.b(false, textAreaData.k(), rVarH, 0, 1);
                i17 &= -113;
            }
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(10795809, i17, -1, "pl.gov.coi.common.ui.ds.textarea.TextArea (TextArea.kt:57)");
            }
            d60.m.c(textAreaData.getFieldIndex(), y2.m.d(-2065763435, true, new er.p() { // from class: t50.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.n(textAreaData, cVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: t50.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.p(textAreaData, cVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(final TextAreaData textAreaData, final d60.c cVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2065763435, i15, -1, "pl.gov.coi.common.ui.ds.textarea.TextArea.<anonymous> (TextArea.kt:59)");
            }
            Function0.c(y2.m.d(207801021, true, new er.p() { // from class: t50.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.o(textAreaData, cVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(TextAreaData textAreaData, d60.c cVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(207801021, i15, -1, "pl.gov.coi.common.ui.ds.textarea.TextArea.<anonymous>.<anonymous> (TextArea.kt:60)");
            }
            q(textAreaData, cVar, rVar, 0, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(TextAreaData textAreaData, d60.c cVar, int i15, int i16, p076m2.r rVar, int i17) {
        m(textAreaData, cVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void q(TextAreaData textAreaData, d60.c cVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        final d60.c cVarB;
        final TextAreaData textAreaData2;
        String str;
        long jD;
        int i18;
        d60.c cVar2;
        int i19;
        String str2;
        String str3;
        String str4;
        p076m2.r rVarH = rVar.h(-996878146);
        if ((i15 & 6) == 0) {
            i17 = i15 | (rVarH.G(textAreaData) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            if ((i16 & 2) == 0) {
                cVarB = cVar;
                int i25 = rVarH.W(cVarB) ? 32 : 16;
                i17 |= i25;
            } else {
                cVarB = cVar;
            }
            i17 |= i25;
        } else {
            cVarB = cVar;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0 && !rVarH.Q()) {
                rVarH.O();
                if ((i16 & 2) != 0) {
                    i17 &= -113;
                }
            } else if ((i16 & 2) != 0) {
                cVarB = d60.e.b(false, textAreaData.k(), rVarH, 0, 1);
                i17 &= -113;
            }
            d60.c cVar3 = cVarB;
            int i26 = i17;
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-996878146, i26, -1, "pl.gov.coi.common.ui.ds.textarea.TextAreaInternal (TextArea.kt:74)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarC = androidx.compose.foundation.layout.d.C(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, false, 3, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarC);
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
            Label label = textAreaData.getLabel();
            if (label == null) {
                rVarH.X(1216012033);
                rVarH.R();
                cVar2 = cVar3;
                i18 = i26;
                i19 = 0;
                str2 = null;
            } else {
                rVarH.X(1216012034);
                String testTag = textAreaData.getTestTag();
                if (testTag != null) {
                    str = testTag + "Text";
                } else {
                    str = null;
                }
                k70.a aVar = k70.a.f108864a;
                int i27 = k70.a.f108865b;
                TextStyle textStyleD = aVar.f(rVarH, i27).d();
                if (textAreaData.getEnabled()) {
                    rVarH.X(2048818275);
                    jD = aVar.a(rVarH, i27).getNeutral().b();
                } else {
                    rVarH.X(2048819555);
                    jD = aVar.a(rVarH, i27).getNeutral().d();
                }
                rVarH.R();
                i18 = i26;
                cVar2 = cVar3;
                i19 = 0;
                str2 = null;
                j70.h.g(null, str, label, null, null, jD, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleD, textAreaData.getIndexTag(), null, false, true, null, rVarH, 0, 0, 3072, 23592921);
                rVarH = rVarH;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i27).getSpacing50()), rVarH, 0);
                rVarH.R();
            }
            textAreaData2 = textAreaData;
            final d60.c cVar4 = cVar2;
            p076m2.r rVar2 = rVarH;
            p030d20.d.d(cVar4, 0, 0, false, y2.m.d(-1723504884, true, new er.q() { // from class: t50.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return r.r(cVar4, textAreaData2, (er.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, ((i18 >> 3) & 14) | 24576, 14);
            rVarH = rVar2;
            e state = textAreaData2.getState();
            if (state instanceof e.Default) {
                rVarH.X(1563380078);
                if (((e.Default) textAreaData2.getState()).getHelperLabel().l()) {
                    rVarH.X(1220181565);
                    r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50()), rVarH, i19);
                    String testTag2 = textAreaData2.getTestTag();
                    if (testTag2 != null) {
                        str4 = testTag2 + "HelperText";
                    } else {
                        str4 = str2;
                    }
                    p40.b.b(str4, ((e.Default) textAreaData2.getState()).getHelperLabel(), true, rVarH, MLKEMEngine.KyberPolyBytes, 0);
                } else {
                    rVarH.X(1212867642);
                }
                rVarH.R();
                rVarH.R();
            } else {
                if (!(state instanceof e.Error)) {
                    rVarH.X(1563378342);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1220501392);
                r3.a(androidx.compose.foundation.layout.d.i(companion, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50()), rVarH, i19);
                String testTag3 = textAreaData2.getTestTag();
                if (testTag3 != null) {
                    str3 = testTag3 + "ErrorText";
                } else {
                    str3 = str2;
                }
                l40.d.d(str3, ((e.Error) textAreaData2.getState()).getErrorLabel(), true, rVarH, MLKEMEngine.KyberPolyBytes, 0);
                rVarH.R();
            }
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            cVarB = cVar4;
        } else {
            textAreaData2 = textAreaData;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: t50.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.y(textAreaData2, cVarB, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final d60.c cVar, final TextAreaData textAreaData, final er.l lVar, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.G(lVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1723504884, i16, -1, "pl.gov.coi.common.ui.ds.textarea.TextAreaInternal.<anonymous>.<anonymous> (TextArea.kt:94)");
            }
            BorderStroke borderStrokeA = x.a(D(cVar, rVar, 0), E(textAreaData.getEnabled(), textAreaData.getState(), cVar.j(), rVar, 0));
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            y2 radius150 = aVar.e(rVar, i17).getRadius150();
            y1 y1Var = y1.f58315a;
            long jA = aVar.a(rVar, i17).getSurface().a();
            int i18 = y1.f58316b;
            c2.c(null, radius150, y1Var.b(jA, 0L, 0L, 0L, rVar, i18 << 12, 14), y1Var.c(aVar.c(rVar, i17).getLevel0(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, rVar, i18 << 18, 62), borderStrokeA, y2.m.d(316711386, true, new er.q() { // from class: t50.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return r.s(textAreaData, cVar, lVar, (h0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 196608, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final TextAreaData textAreaData, d60.c cVar, final er.l lVar, h0 h0Var, p076m2.r rVar, int i15) {
        long jD;
        Label errorLabel;
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(316711386, i15, -1, "pl.gov.coi.common.ui.ds.textarea.TextAreaInternal.<anonymous>.<anonymous>.<anonymous> (TextArea.kt:111)");
            }
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, a0.INSTANCE.h(), textAreaData.getImeAction(), null, null, null, 115, null);
            boolean enabled = textAreaData.getEnabled();
            SolidColor solidColorF = F(textAreaData.getState(), cVar.j(), rVar, 0);
            d60.c.Companion companion = d60.c.INSTANCE;
            String text = null;
            f3.m mVarB = companion.b(companion.d(androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null), cVar), cVar);
            Object objE = rVar.E();
            p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
            if (objE == companion2.a()) {
                objE = new er.l() { // from class: t50.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.t((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = v.d(mVarB, false, (er.l) objE, 1, null);
            boolean zG = rVar.G(textAreaData);
            Object objE2 = rVar.E();
            if (zG || objE2 == companion2.a()) {
                objE2 = new er.l() { // from class: t50.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.u(textAreaData, (n4.i0) obj);
                    }
                };
                rVar.v(objE2);
            }
            f3.m mVarD2 = v.d(mVarD, false, (er.l) objE2, 1, null);
            e state = textAreaData.getState();
            e.Error error = state instanceof e.Error ? (e.Error) state : null;
            if (error != null && (errorLabel = error.getErrorLabel()) != null) {
                text = errorLabel.getText();
            }
            f3.m mVarG = t70.i.G(mVarD2, text, rVar, 0);
            boolean zW = rVar.W(lVar);
            Object objE3 = rVar.E();
            if (zW || objE3 == companion2.a()) {
                objE3 = new er.l() { // from class: t50.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.v(lVar, (l0) obj);
                    }
                };
                rVar.v(objE3);
            }
            f3.m mVarA = l3.e.a(mVarG, (er.l) objE3);
            String content = textAreaData.getContent();
            int iH = H(textAreaData.getType(), rVar, 0);
            int iG = G(textAreaData.getType(), rVar, 0);
            e1 e1VarC = e1.INSTANCE.c();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            TextStyle textStyleB = aVar.f(rVar, i16).b();
            if (textAreaData.getEnabled()) {
                rVar.X(-582979580);
                jD = aVar.a(rVar, i16).getNeutral().i();
            } else {
                rVar.X(-582978300);
                jD = aVar.a(rVar, i16).getNeutral().d();
            }
            rVar.R();
            TextStyle textStyleE = TextStyle.e(textStyleB, jD, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            boolean zG2 = rVar.G(textAreaData);
            Object objE4 = rVar.E();
            if (zG2 || objE4 == companion2.a()) {
                objE4 = new er.l() { // from class: t50.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.w(textAreaData, (String) obj);
                    }
                };
                rVar.v(objE4);
            }
            u.h(content, (er.l) objE4, mVarA, enabled, false, textStyleE, keyboardOptions, null, false, iG, iH, e1VarC, null, null, solidColorF, y2.m.d(-544489155, true, new er.q() { // from class: t50.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return r.x(textAreaData, (er.p) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 0, 196656, 12688);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(n4.i0 i0Var) {
        g0.a(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x004e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0069  */
    /* JADX WARN: Code duplicated, block: B:6:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    /* JADX WARN: Code duplicated, block: B:9:0x0039  */
    public static final i0 u(TextAreaData textAreaData, n4.i0 i0Var) {
        Label label;
        String string;
        String string2;
        f0.c0(i0Var, C(textAreaData));
        f0.g0(i0Var, new q4.e(textAreaData.getContent(), null, 2, null));
        String testTag = textAreaData.getTestTag();
        if (testTag != null) {
            string2 = testTag + "EditText";
            if (string2 == null) {
                label = textAreaData.getLabel();
                if (label != null) {
                    string2 = label.getTag();
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("EditText ");
                    sb5.append("Undefined");
                    if (textAreaData.getIndexTag() != null) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append('_');
                        sb6.append(textAreaData.getIndexTag().intValue());
                        string = sb6.toString();
                        if (string == null) {
                            string = "";
                        }
                    } else {
                        string = "";
                    }
                    sb5.append(string);
                    string2 = sb5.toString();
                }
            }
        } else {
            label = textAreaData.getLabel();
            if (label != null) {
                string2 = label.getTag();
            } else {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("EditText ");
                sb7.append("Undefined");
                if (textAreaData.getIndexTag() != null) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append('_');
                    sb8.append(textAreaData.getIndexTag().intValue());
                    string = sb8.toString();
                    if (string == null) {
                        string = "";
                    }
                } else {
                    string = "";
                }
                sb7.append(string);
                string2 = sb7.toString();
            }
        }
        f0.y0(i0Var, string2);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(er.l lVar, l0 l0Var) {
        lVar.b(l0Var);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(TextAreaData textAreaData, String str) {
        textAreaData.l().b(str);
        if (textAreaData.getCounterState() instanceof a.Visible) {
            ((a.Visible) textAreaData.getCounterState()).d().b(Boolean.valueOf(str.length() > ((a.Visible) textAreaData.getCounterState()).getMaxLength()));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(TextAreaData textAreaData, er.p pVar, p076m2.r rVar, int i15) {
        int i16;
        int i17;
        String str;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.G(pVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-544489155, i16, -1, "pl.gov.coi.common.ui.ds.textarea.TextAreaInternal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TextArea.kt:152)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarN = a3.n(companion, aVar.b(rVar2, i18).getSpacing100());
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarN);
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
            f3.m mVarN2 = a3.n(companion, aVar.b(rVar2, i18).getSpacing100());
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT2 = rVar2.t();
            f3.m mVarE2 = f3.j.e(rVar2, mVarN2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB2);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC2 = n6.c(rVar2);
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.x xVar = d1.x.f39368a;
            if (textAreaData.getContent().length() == 0) {
                rVar2.X(-173669527);
                String testTag = textAreaData.getTestTag();
                if (testTag != null) {
                    str = testTag + "HintText";
                } else {
                    str = null;
                }
                i17 = i16;
                j70.h.g(null, str, textAreaData.getHint(), null, null, aVar.a(rVar2, i18).getNeutral().d(), 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, 0, 0, null, aVar.f(rVar2, i18).b(), null, null, false, false, null, rVar, 0, 24576, MLKEMEngine.KyberPolyBytes, 28819417);
                rVar2 = rVar;
            } else {
                i17 = i16;
                rVar2.X(-180099423);
            }
            rVar2.R();
            pVar.B(rVar2, Integer.valueOf(i17 & 14));
            rVar2.x();
            if (textAreaData.getCounterState() instanceof a.Visible) {
                rVar2.X(-660335623);
                z(textAreaData.getEnabled(), textAreaData.getContent().length(), ((a.Visible) textAreaData.getCounterState()).getMaxLength(), rVar2, 0);
            } else {
                rVar2.X(-667261829);
            }
            rVar2.R();
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(TextAreaData textAreaData, d60.c cVar, int i15, int i16, p076m2.r rVar, int i17) {
        q(textAreaData, cVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void z(final boolean z15, final int i15, final int i16, p076m2.r rVar, final int i17) {
        int i18;
        p076m2.r rVar2;
        FontWeight fontWeightD;
        long jB;
        long jD;
        p076m2.r rVarH = rVar.h(-895162120);
        if ((i17 & 6) == 0) {
            i18 = (rVarH.a(z15) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 48) == 0) {
            i18 |= rVarH.c(i15) ? 32 : 16;
        }
        if ((i17 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.c(i16) ? 256 : 128;
        }
        if (rVarH.r((i18 & 147) != 146, i18 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-895162120, i18, -1, "pl.gov.coi.common.ui.ds.textarea.TextLengthCounter (TextArea.kt:265)");
            }
            rVarH.X(-1257333753);
            q4.e.b bVar = new q4.e.b(0, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            y yVarO = aVar.f(rVarH, i19).f().o();
            boolean z16 = i15 > i16;
            if (z16) {
                fontWeightD = FontWeight.INSTANCE.a();
            } else {
                if (z16) {
                    throw new oq.p();
                }
                fontWeightD = FontWeight.INSTANCE.d();
            }
            FontWeight fontWeight = fontWeightD;
            if (!z15) {
                rVarH.X(1732747423);
                jB = aVar.a(rVarH, i19).getNeutral().d();
                rVarH.R();
            } else if (i15 > i16) {
                rVarH.X(1732749793);
                jB = aVar.a(rVarH, i19).getSupport().g();
                rVarH.R();
            } else {
                rVarH.X(1732751551);
                jB = aVar.a(rVarH, i19).getNeutral().b();
                rVarH.R();
            }
            int iO = bVar.o(new SpanStyle(jB, 0L, fontWeight, yVarO, (z) null, (u4.l) null, (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (j0) null, (p3.g) null, 65522, (fr.k) null));
            try {
                bVar.f(String.valueOf(i15));
                i0 i0Var = i0.f148189a;
                bVar.l(iO);
                y yVarO2 = aVar.f(rVarH, i19).f().o();
                if (z15) {
                    rVarH.X(1732759135);
                    jD = aVar.a(rVarH, i19).getNeutral().b();
                } else {
                    rVarH.X(1732760415);
                    jD = aVar.a(rVarH, i19).getNeutral().d();
                }
                rVarH.R();
                int iO2 = bVar.o(new SpanStyle(jD, 0L, (FontWeight) null, yVarO2, (z) null, (u4.l) null, (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (j0) null, (p3.g) null, 65526, (fr.k) null));
                try {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append('/');
                    sb5.append(i16);
                    bVar.f(sb5.toString());
                    bVar.l(iO2);
                    q4.e eVarP = bVar.p();
                    rVarH.R();
                    rVar2 = rVarH;
                    j70.h.g(androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null), null, null, null, eVarP, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.b()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i19).f(), null, null, false, true, null, rVar2, 6, 0, 3072, 24637422);
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                } catch (Throwable th4) {
                    bVar.l(iO2);
                    throw th4;
                }
            } catch (Throwable th5) {
                bVar.l(iO);
                throw th5;
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: t50.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.A(z15, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
