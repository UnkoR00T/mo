package h30;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.g1;
import d1.a3;
import d1.d3;
import d1.p3;
import mx.Label;
import n3.y2;
import n4.f0;
import n4.g0;
import n4.v;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.C6460u1;
import p046f2.hd;
import p046f2.m1;
import p046f2.n1;
import p046f2.o1;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import t70.s;
import t70.y;
import w0.BorderStroke;
import w0.x;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\u0012\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0017\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b \u0010!\u001a'\u0010&\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0003¢\u0006\u0004\b&\u0010'\u001a'\u0010(\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0003¢\u0006\u0004\b(\u0010'\u001a'\u0010)\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0003¢\u0006\u0004\b)\u0010'\u001a\u0017\u0010+\u001a\u00020\u00102\u0006\u0010#\u001a\u00020*H\u0003¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010-\u001a\u00020\u00102\u0006\u0010#\u001a\u00020*H\u0003¢\u0006\u0004\b-\u0010,\u001a\u0017\u0010/\u001a\u00020.2\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b/\u00100\u001a\u001f\u00103\u001a\u0002022\u0006\u0010\u000f\u001a\u0002012\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b3\u00104\u001a\u0017\u00105\u001a\u00020.2\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b5\u00100\u001a)\u00107\u001a\u00020\u00192\b\u00106\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b7\u00108\u001a)\u00109\u001a\u00020\u00192\b\u00106\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b9\u0010:\u001a\u001d\u0010=\u001a\u00020\u00062\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060;H\u0003¢\u0006\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lh30/a;", "data", "", "shouldClearFocusOnTap", "", "traversalIndex", "Loq/i0;", "p", "(Lh30/a;ZLjava/lang/Float;Lm2/r;II)V", "Lf2/m1;", "G", "(Lh30/a;Lm2/r;I)Lf2/m1;", "", "testTag", "Lk30/c$a;", "buttonType", "Landroidx/compose/ui/graphics/Color;", "color", "x", "(Ljava/lang/String;Lk30/c$a;JLm2/r;I)V", "Lk30/a;", "buttonSize", "Lk30/c$b;", "z", "(Ljava/lang/String;Lk30/a;Lk30/c$b;JLm2/r;I)V", "Lf3/m;", "J", "(Lh30/a;Lm2/r;I)Lf3/m;", "Ld1/d3;", "T", "(Lh30/a;Lm2/r;I)Ld1/d3;", "Lw0/w;", "F", "(Lh30/a;Lm2/r;I)Lw0/w;", "Lk30/d;", "buttonVariant", "Lk30/b;", "buttonState", "Q", "(Lk30/a;Lk30/d;Lk30/b;Lm2/r;I)J", ip.a.f96137b, "R", "Lk30/d$b;", "U", "(Lk30/d$b;Lm2/r;I)J", "V", "Lc5/h;", "M", "(Lk30/a;Lm2/r;I)F", "Lk30/c;", "Ln3/y2;", "I", "(Lk30/c;Lk30/a;Lm2/r;I)Ln3/y2;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "testTagInternal", "N", "(Ljava/lang/String;Lk30/c$b;Lk30/a;Lm2/r;I)Lf3/m;", "K", "(Ljava/lang/String;Lk30/c$a;Lk30/a;Lm2/r;I)Lf3/m;", "Lkotlin/Function0;", "content", "C", "(Ler/p;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f80362a;

        a(long j15) {
            this.f80362a = j15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-913205084);
            if (t.k()) {
                t.o(-913205084, i15, -1, "pl.gov.coi.common.ui.ds.button.ButtonIcon.<anonymous> (Button.kt:180)");
            }
            long j15 = this.f80362a;
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return j15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(n4.i0 i0Var) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(String str, k30.a aVar, k30.c.WithText withText, long j15, int i15, r rVar, int i16) {
        z(str, aVar, withText, j15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void C(final er.p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(2001233102);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(pVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(2001233102, i16, -1, "pl.gov.coi.common.ui.ds.button.LayoutWithoutMinimumInteractiveComponentPadding (Button.kt:447)");
            }
            d0.c(hd.f().d(c5.h.j(c5.h.n(0))), y2.m.d(-1103992818, true, new er.p() { // from class: h30.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.D(pVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, c4.f122821i | 48);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h30.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.E(pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(er.p pVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1103992818, i15, -1, "pl.gov.coi.common.ui.ds.button.LayoutWithoutMinimumInteractiveComponentPadding.<anonymous> (Button.kt:449)");
            }
            pVar.B(rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(er.p pVar, int i15, r rVar, int i16) {
        C(pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final BorderStroke F(ButtonData buttonData, r rVar, int i15) {
        BorderStroke borderStrokeA;
        long jG;
        if (t.k()) {
            t.o(563468913, i15, -1, "pl.gov.coi.common.ui.ds.button.getBorderStroke (Button.kt:238)");
        }
        if (buttonData.getButtonVariant() instanceof k30.d.Secondary) {
            rVar.X(327749636);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            float strokeWidth = aVar.b(rVar, i16).getStrokeWidth();
            k30.b buttonState = buttonData.getButtonState();
            if (fr.t.c(buttonState, k30.b.c.f107768a)) {
                rVar.X(327753379);
                jG = V((k30.d.Secondary) buttonData.getButtonVariant(), rVar, 0);
                rVar.R();
            } else if (fr.t.c(buttonState, k30.b.a.f107766a)) {
                rVar.X(327756071);
                jG = U((k30.d.Secondary) buttonData.getButtonVariant(), rVar, 0);
                rVar.R();
            } else {
                if (!fr.t.c(buttonState, k30.b.C2562b.f107767a)) {
                    rVar.X(327751832);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(327759514);
                jG = aVar.a(rVar, i16).getNeutral().g();
                rVar.R();
            }
            borderStrokeA = x.a(strokeWidth, jG);
            rVar.R();
        } else {
            rVar.X(1570641932);
            rVar.R();
            borderStrokeA = null;
        }
        if (t.k()) {
            t.n();
        }
        return borderStrokeA;
    }

    private static final m1 G(ButtonData buttonData, r rVar, int i15) {
        if (t.k()) {
            t.o(-1477155603, i15, -1, "pl.gov.coi.common.ui.ds.button.getButtonColors (Button.kt:147)");
        }
        m1 m1VarB = n1.f56965a.b(Q(buttonData.getButtonSize(), buttonData.getButtonVariant(), buttonData.getButtonState(), rVar, 0), R(buttonData.getButtonSize(), buttonData.getButtonVariant(), buttonData.getButtonState(), rVar, 0), Q(buttonData.getButtonSize(), buttonData.getButtonVariant(), buttonData.getButtonState(), rVar, 0), R(buttonData.getButtonSize(), buttonData.getButtonVariant(), buttonData.getButtonState(), rVar, 0), rVar, n1.Q << 12, 0);
        if (t.k()) {
            t.n();
        }
        return m1VarB;
    }

    private static final float H(k30.a aVar, r rVar, int i15) {
        float spacing200;
        if (t.k()) {
            t.o(-1289609822, i15, -1, "pl.gov.coi.common.ui.ds.button.getButtonRadius (Button.kt:386)");
        }
        if (aVar instanceof k30.a.Large) {
            rVar.X(1930513292);
            spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing150();
            rVar.R();
        } else {
            if (!fr.t.c(aVar, k30.a.b.f107765a)) {
                rVar.X(1930511332);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(1930514988);
            spacing200 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return spacing200;
    }

    private static final y2 I(k30.c cVar, k30.a aVar, r rVar, int i15) {
        y2 radius200;
        if (t.k()) {
            t.o(1531290854, i15, -1, "pl.gov.coi.common.ui.ds.button.getButtonShape (Button.kt:377)");
        }
        if (cVar instanceof k30.c.WithIcon) {
            rVar.X(-1603268079);
            rVar.R();
            radius200 = l1.h.i();
        } else {
            if (!(cVar instanceof k30.c.WithText)) {
                rVar.X(-1603269410);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(1838340350);
            if (aVar instanceof k30.a.Large) {
                rVar.X(-1603264785);
                radius200 = k70.a.f108864a.e(rVar, k70.a.f108865b).getRadius150();
                rVar.R();
            } else {
                if (!fr.t.c(aVar, k30.a.b.f107765a)) {
                    rVar.X(-1603266684);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-1603263185);
                radius200 = k70.a.f108864a.e(rVar, k70.a.f108865b).getRadius200();
                rVar.R();
            }
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return radius200;
    }

    private static final f3.m J(ButtonData buttonData, r rVar, int i15) {
        f3.m mVarN;
        if (t.k()) {
            t.o(2095366979, i15, -1, "pl.gov.coi.common.ui.ds.button.getButtonTypeModifier (Button.kt:207)");
        }
        k30.c buttonType = buttonData.getButtonType();
        if (buttonType instanceof k30.c.WithIcon) {
            rVar.X(-691991703);
            mVarN = K(buttonData.getTestTag(), (k30.c.WithIcon) buttonData.getButtonType(), buttonData.getButtonSize(), rVar, 0);
            rVar.R();
        } else {
            if (!(buttonType instanceof k30.c.WithText)) {
                rVar.X(-691993180);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(-691986455);
            mVarN = N(buttonData.getTestTag(), (k30.c.WithText) buttonData.getButtonType(), buttonData.getButtonSize(), rVar, 0);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return mVarN;
    }

    private static final f3.m K(final String str, final k30.c.WithIcon withIcon, k30.a aVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-602892449, i15, -1, "pl.gov.coi.common.ui.ds.button.getButtonWithIconModifier (Button.kt:436)");
        }
        final Context context = (Context) rVar.N(AndroidCompositionLocals_androidKt.c());
        f3.m mVarT = androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, M(aVar, rVar, (i15 >> 6) & 14));
        boolean zG = ((((i15 & 112) ^ 48) > 32 && rVar.W(withIcon)) || (i15 & 48) == 32) | ((((i15 & 14) ^ 6) > 4 && rVar.W(str)) || (i15 & 6) == 4) | rVar.G(context);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new er.l() { // from class: h30.n
                @Override // er.l
                public final Object b(Object obj) {
                    return q.L(str, withIcon, context, (n4.i0) obj);
                }
            };
            rVar.v(objE);
        }
        f3.m mVarD = v.d(mVarT, false, (er.l) objE, 1, null);
        if (t.k()) {
            t.n();
        }
        return mVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(String str, k30.c.WithIcon withIcon, Context context, n4.i0 i0Var) {
        if (str == null) {
            str = y.a(Integer.valueOf(withIcon.getIconResId()), context);
        }
        f0.y0(i0Var, str);
        f0.c0(i0Var, withIcon.getContentDescription().getText());
        return i0.f148189a;
    }

    private static final float M(k30.a aVar, r rVar, int i15) {
        float spacing400;
        if (t.k()) {
            t.o(898988176, i15, -1, "pl.gov.coi.common.ui.ds.button.getButtonWithIconSize (Button.kt:371)");
        }
        if (aVar instanceof k30.a.Large) {
            rVar.X(639214394);
            spacing400 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing600();
            rVar.R();
        } else {
            if (!fr.t.c(aVar, k30.a.b.f107765a)) {
                rVar.X(639212434);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(639216090);
            spacing400 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing400();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return spacing400;
    }

    private static final f3.m N(final String str, final k30.c.WithText withText, k30.a aVar, r rVar, int i15) {
        f3.m mVarD;
        if (t.k()) {
            t.o(961928903, i15, -1, "pl.gov.coi.common.ui.ds.button.getButtonWithTextModifier (Button.kt:397)");
        }
        final String text = !mx.b.a(withText.getContentDescription()) ? withText.getContentDescription().getText() : withText.getLabel().getText();
        if (aVar instanceof k30.a.Large) {
            rVar.X(995726552);
            f3.m mVarH = f3.m.INSTANCE;
            f3.m mVarK = androidx.compose.foundation.layout.d.k(mVarH, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing600(), 0.0f, 2, null);
            boolean zW = ((((i15 & 112) ^ 48) > 32 && rVar.W(withText)) || (i15 & 48) == 32) | ((((i15 & 14) ^ 6) > 4 && rVar.W(str)) || (i15 & 6) == 4) | rVar.W(text);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: h30.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.O(str, withText, text, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD2 = v.d(mVarK, false, (er.l) objE, 1, null);
            if (((k30.a.Large) aVar).getFillMaxWidth()) {
                mVarH = androidx.compose.foundation.layout.d.h(mVarH, 0.0f, 1, null);
            }
            mVarD = mVarD2.u(mVarH);
            rVar.R();
        } else {
            if (!fr.t.c(aVar, k30.a.b.f107765a)) {
                rVar.X(995717555);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(995734601);
            f3.m mVarK2 = androidx.compose.foundation.layout.d.k(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing400(), 0.0f, 2, null);
            boolean zW2 = ((((i15 & 112) ^ 48) > 32 && rVar.W(withText)) || (i15 & 48) == 32) | ((((i15 & 14) ^ 6) > 4 && rVar.W(str)) || (i15 & 6) == 4) | rVar.W(text);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: h30.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.P(str, withText, text, (n4.i0) obj);
                    }
                };
                rVar.v(objE2);
            }
            mVarD = v.d(mVarK2, false, (er.l) objE2, 1, null);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return mVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(String str, k30.c.WithText withText, String str2, n4.i0 i0Var) {
        g0.a(i0Var, true);
        if (str == null) {
            str = withText.getLabel().getTag();
        }
        f0.y0(i0Var, str);
        f0.c0(i0Var, str2);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(String str, k30.c.WithText withText, String str2, n4.i0 i0Var) {
        g0.a(i0Var, true);
        if (str == null) {
            str = withText.getLabel().getTag();
        }
        f0.y0(i0Var, str);
        f0.c0(i0Var, str2);
        return i0.f148189a;
    }

    private static final long Q(k30.a aVar, k30.d dVar, k30.b bVar, r rVar, int i15) {
        long jG;
        if (t.k()) {
            t.o(-649691487, i15, -1, "pl.gov.coi.common.ui.ds.button.getContainerColor (Button.kt:256)");
        }
        if (aVar instanceof k30.a.Large) {
            rVar.X(-1836278134);
            if (fr.t.c(dVar, k30.d.a.f107773a)) {
                rVar.X(-1836231417);
                if (fr.t.c(bVar, k30.b.c.f107768a)) {
                    rVar.X(-1583251864);
                    jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
                    rVar.R();
                } else if (fr.t.c(bVar, k30.b.a.f107766a)) {
                    rVar.X(-1583249779);
                    jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                    rVar.R();
                } else {
                    if (!fr.t.c(bVar, k30.b.C2562b.f107767a)) {
                        rVar.X(-1583253925);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(-1583247638);
                    jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().g();
                    rVar.R();
                }
                rVar.R();
            } else if (dVar instanceof k30.d.Secondary) {
                rVar.X(-1583245812);
                rVar.R();
                jG = Color.INSTANCE.g();
            } else {
                if (!fr.t.c(dVar, k30.d.c.f107775a)) {
                    rVar.X(-1583255432);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-1583244276);
                rVar.R();
                jG = Color.INSTANCE.g();
            }
            rVar.R();
        } else {
            if (!fr.t.c(aVar, k30.a.b.f107765a)) {
                rVar.X(-1583256422);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(-1835882202);
            if (fr.t.c(dVar, k30.d.a.f107773a)) {
                rVar.X(-1835835485);
                if (fr.t.c(bVar, k30.b.c.f107768a)) {
                    rVar.X(-1583239094);
                    jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().b();
                    rVar.R();
                } else if (fr.t.c(bVar, k30.b.a.f107766a)) {
                    rVar.X(-1583236945);
                    jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().a();
                    rVar.R();
                } else {
                    if (!fr.t.c(bVar, k30.b.C2562b.f107767a)) {
                        rVar.X(-1583241153);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(-1583234742);
                    jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().g();
                    rVar.R();
                }
                rVar.R();
            } else if (dVar instanceof k30.d.Secondary) {
                rVar.X(-1583232916);
                rVar.R();
                jG = Color.INSTANCE.g();
            } else {
                if (!fr.t.c(dVar, k30.d.c.f107775a)) {
                    rVar.X(-1583242660);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-1583231380);
                rVar.R();
                jG = Color.INSTANCE.g();
            }
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jG;
    }

    private static final long R(k30.a aVar, k30.d dVar, k30.b bVar, r rVar, int i15) {
        long jD;
        if (t.k()) {
            t.o(918093465, i15, -1, "pl.gov.coi.common.ui.ds.button.getContentColor (Button.kt:326)");
        }
        if (aVar instanceof k30.a.Large) {
            rVar.X(570861726);
            if (fr.t.c(dVar, k30.d.a.f107773a)) {
                rVar.X(570894958);
                if (fr.t.c(bVar, k30.b.c.f107768a)) {
                    rVar.X(1819533441);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().c();
                    rVar.R();
                } else if (fr.t.c(bVar, k30.b.a.f107766a)) {
                    rVar.X(1819535553);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().c();
                    rVar.R();
                } else {
                    if (!fr.t.c(bVar, k30.b.C2562b.f107767a)) {
                        rVar.X(1819531284);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(1819537571);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().d();
                    rVar.R();
                }
                rVar.R();
            } else if (dVar instanceof k30.d.Secondary) {
                rVar.X(571148848);
                if (fr.t.c(bVar, k30.b.c.f107768a)) {
                    rVar.X(1819540870);
                    jD = V((k30.d.Secondary) dVar, rVar, (i15 >> 3) & 14);
                    rVar.R();
                } else if (fr.t.c(bVar, k30.b.a.f107766a)) {
                    rVar.X(1819543402);
                    jD = U((k30.d.Secondary) dVar, rVar, (i15 >> 3) & 14);
                    rVar.R();
                } else {
                    if (!fr.t.c(bVar, k30.b.C2562b.f107767a)) {
                        rVar.X(1819539474);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(1819546691);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().d();
                    rVar.R();
                }
                rVar.R();
            } else {
                if (!fr.t.c(dVar, k30.d.c.f107775a)) {
                    rVar.X(1819530212);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(571426670);
                if (fr.t.c(bVar, k30.b.c.f107768a)) {
                    rVar.X(1819550496);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
                    rVar.R();
                } else if (fr.t.c(bVar, k30.b.a.f107766a)) {
                    rVar.X(1819552581);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                    rVar.R();
                } else {
                    if (!fr.t.c(bVar, k30.b.C2562b.f107767a)) {
                        rVar.X(1819548436);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(1819554723);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().d();
                    rVar.R();
                }
                rVar.R();
            }
            rVar.R();
        } else {
            if (!fr.t.c(aVar, k30.a.b.f107765a)) {
                rVar.X(1819529386);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(571681738);
            if (dVar instanceof k30.d.Secondary) {
                rVar.X(571729168);
                if (fr.t.c(bVar, k30.b.c.f107768a)) {
                    rVar.X(1819559590);
                    jD = V((k30.d.Secondary) dVar, rVar, (i15 >> 3) & 14);
                    rVar.R();
                } else if (fr.t.c(bVar, k30.b.a.f107766a)) {
                    rVar.X(1819562122);
                    jD = U((k30.d.Secondary) dVar, rVar, (i15 >> 3) & 14);
                    rVar.R();
                } else {
                    if (!fr.t.c(bVar, k30.b.C2562b.f107767a)) {
                        rVar.X(1819558194);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(1819565411);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().d();
                    rVar.R();
                }
                rVar.R();
            } else {
                rVar.X(571989134);
                if (fr.t.c(bVar, k30.b.c.f107768a)) {
                    rVar.X(1819568640);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
                    rVar.R();
                } else if (fr.t.c(bVar, k30.b.a.f107766a)) {
                    rVar.X(1819570725);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                    rVar.R();
                } else {
                    if (!fr.t.c(bVar, k30.b.C2562b.f107767a)) {
                        rVar.X(1819566580);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(1819572867);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().d();
                    rVar.R();
                }
                rVar.R();
            }
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jD;
    }

    private static final long S(k30.a aVar, k30.d dVar, k30.b bVar, r rVar, int i15) {
        long jD;
        if (t.k()) {
            t.o(1101469673, i15, -1, "pl.gov.coi.common.ui.ds.button.getIconColor (Button.kt:285)");
        }
        if (aVar instanceof k30.a.Large) {
            rVar.X(333070673);
            if (fr.t.c(dVar, k30.d.a.f107773a)) {
                rVar.X(333103967);
                if (fr.t.c(bVar, k30.b.c.f107768a)) {
                    rVar.X(1950410097);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().c();
                    rVar.R();
                } else if (fr.t.c(bVar, k30.b.a.f107766a)) {
                    rVar.X(1950412209);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().c();
                    rVar.R();
                } else {
                    if (!fr.t.c(bVar, k30.b.C2562b.f107767a)) {
                        rVar.X(1950407939);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(1950414226);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().k();
                    rVar.R();
                }
                rVar.R();
            } else if (dVar instanceof k30.d.Secondary) {
                rVar.X(333356865);
                if (fr.t.c(bVar, k30.b.c.f107768a)) {
                    rVar.X(1950417494);
                    jD = V((k30.d.Secondary) dVar, rVar, (i15 >> 3) & 14);
                    rVar.R();
                } else if (fr.t.c(bVar, k30.b.a.f107766a)) {
                    rVar.X(1950420026);
                    jD = U((k30.d.Secondary) dVar, rVar, (i15 >> 3) & 14);
                    rVar.R();
                } else {
                    if (!fr.t.c(bVar, k30.b.C2562b.f107767a)) {
                        rVar.X(1950416097);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(1950423314);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().k();
                    rVar.R();
                }
                rVar.R();
            } else {
                if (!fr.t.c(dVar, k30.d.c.f107775a)) {
                    rVar.X(1950406865);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(333633695);
                if (fr.t.c(bVar, k30.b.c.f107768a)) {
                    rVar.X(1950427088);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
                    rVar.R();
                } else if (fr.t.c(bVar, k30.b.a.f107766a)) {
                    rVar.X(1950429173);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                    rVar.R();
                } else {
                    if (!fr.t.c(bVar, k30.b.C2562b.f107767a)) {
                        rVar.X(1950425027);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(1950431314);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().k();
                    rVar.R();
                }
                rVar.R();
            }
            rVar.R();
        } else {
            if (!fr.t.c(aVar, k30.a.b.f107765a)) {
                rVar.X(1950406039);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(333887802);
            if (dVar instanceof k30.d.Secondary) {
                rVar.X(333935232);
                if (fr.t.c(bVar, k30.b.c.f107768a)) {
                    rVar.X(1950436150);
                    jD = V((k30.d.Secondary) dVar, rVar, (i15 >> 3) & 14);
                    rVar.R();
                } else if (fr.t.c(bVar, k30.b.a.f107766a)) {
                    rVar.X(1950438682);
                    jD = U((k30.d.Secondary) dVar, rVar, (i15 >> 3) & 14);
                    rVar.R();
                } else {
                    if (!fr.t.c(bVar, k30.b.C2562b.f107767a)) {
                        rVar.X(1950434754);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(1950441971);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().d();
                    rVar.R();
                }
                rVar.R();
            } else {
                rVar.X(334195198);
                if (fr.t.c(bVar, k30.b.c.f107768a)) {
                    rVar.X(1950445200);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
                    rVar.R();
                } else if (fr.t.c(bVar, k30.b.a.f107766a)) {
                    rVar.X(1950447285);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                    rVar.R();
                } else {
                    if (!fr.t.c(bVar, k30.b.C2562b.f107767a)) {
                        rVar.X(1950443140);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(1950449427);
                    jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().d();
                    rVar.R();
                }
                rVar.R();
            }
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jD;
    }

    private static final d3 T(ButtonData buttonData, r rVar, int i15) {
        d3 d3VarF;
        if (t.k()) {
            t.o(586167263, i15, -1, "pl.gov.coi.common.ui.ds.button.getPaddingValues (Button.kt:222)");
        }
        k30.c buttonType = buttonData.getButtonType();
        if (buttonType instanceof k30.c.WithIcon) {
            rVar.X(666027020);
            d3VarF = a3.e(k70.a.f108864a.b(rVar, k70.a.f108865b).getZero());
            rVar.R();
        } else {
            if (!(buttonType instanceof k30.c.WithText)) {
                rVar.X(666025729);
                rVar.R();
                throw new oq.p();
            }
            rVar.X(-827916894);
            k30.a buttonSize = buttonData.getButtonSize();
            if (buttonSize instanceof k30.a.Large) {
                rVar.X(-827871541);
                k70.a aVar = k70.a.f108864a;
                int i16 = k70.a.f108865b;
                d3VarF = a3.f(aVar.b(rVar, i16).getSpacing200(), aVar.b(rVar, i16).getSpacing100());
                rVar.R();
            } else {
                if (!fr.t.c(buttonSize, k30.a.b.f107765a)) {
                    rVar.X(666029664);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(-827726740);
                k70.a aVar2 = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                d3VarF = a3.f(aVar2.b(rVar, i17).getSpacing200(), aVar2.b(rVar, i17).getSpacing50());
                rVar.R();
            }
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return d3VarF;
    }

    private static final long U(k30.d.Secondary secondary, r rVar, int i15) {
        Color colorM0boximpl;
        long jM20unboximpl;
        if (t.k()) {
            t.o(1105542397, i15, -1, "pl.gov.coi.common.ui.ds.button.getSecondaryDestructiveButtonColor (Button.kt:364)");
        }
        er.p<r, Integer, Color> pVarA = secondary.a();
        if (pVarA == null) {
            rVar.X(1404432668);
            rVar.R();
            colorM0boximpl = null;
        } else {
            rVar.X(1569324933);
            long jM20unboximpl2 = pVarA.B(rVar, 0).m20unboximpl();
            rVar.R();
            colorM0boximpl = Color.m0boximpl(jM20unboximpl2);
        }
        if (colorM0boximpl == null) {
            rVar.X(1569326089);
            jM20unboximpl = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            rVar.R();
        } else {
            rVar.X(1569324136);
            rVar.R();
            jM20unboximpl = colorM0boximpl.m20unboximpl();
        }
        if (t.k()) {
            t.n();
        }
        return jM20unboximpl;
    }

    private static final long V(k30.d.Secondary secondary, r rVar, int i15) {
        Color colorM0boximpl;
        long jM20unboximpl;
        if (t.k()) {
            t.o(-134659170, i15, -1, "pl.gov.coi.common.ui.ds.button.getSecondaryEnabledButtonColor (Button.kt:368)");
        }
        er.p<r, Integer, Color> pVarA = secondary.a();
        if (pVarA == null) {
            rVar.X(-131773605);
            rVar.R();
            colorM0boximpl = null;
        } else {
            rVar.X(-558440090);
            long jM20unboximpl2 = pVarA.B(rVar, 0).m20unboximpl();
            rVar.R();
            colorM0boximpl = Color.m0boximpl(jM20unboximpl2);
        }
        if (colorM0boximpl == null) {
            rVar.X(-558439035);
            jM20unboximpl = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
            rVar.R();
        } else {
            rVar.X(-558440895);
            rVar.R();
            jM20unboximpl = colorM0boximpl.m20unboximpl();
        }
        if (t.k()) {
            t.n();
        }
        return jM20unboximpl;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:62:0x0100  */
    /* JADX WARN: Code duplicated, block: B:65:0x010b  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"UnrememberedMutableInteractionSource"})
    public static final void p(final ButtonData buttonData, boolean z15, Float f15, r rVar, final int i15, final int i16) {
        int i17;
        boolean z16;
        int i18;
        final Float f16;
        int i19;
        boolean z17;
        final boolean z18;
        final Float f17;
        d5 d5VarM;
        final boolean z19;
        Object objE;
        r.Companion companion;
        Object objE2;
        r rVarH = rVar.h(-1318670151);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(buttonData) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i25 = i16 & 2;
        if (i25 == 0) {
            if ((i15 & 48) == 0) {
                z16 = z15;
                i17 |= rVarH.a(z16) ? 32 : 16;
            }
            i18 = i16 & 4;
            if (i18 != 0) {
                if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                    f16 = f15;
                    if (rVarH.W(f16)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i17 |= i19;
                }
                if ((i17 & 147) != 146) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (rVarH.r(z17, i17 & 1)) {
                    if (i25 != 0) {
                        z19 = true;
                    } else {
                        z19 = z16;
                    }
                    if (i18 != 0) {
                        f16 = null;
                    }
                    if (t.k()) {
                        t.o(-1318670151, i17, -1, "pl.gov.coi.common.ui.ds.button.Button (Button.kt:55)");
                    }
                    final l3.o oVar = (l3.o) rVarH.N(g1.g());
                    objE = rVarH.E();
                    companion = r.INSTANCE;
                    if (objE == companion.a()) {
                        objE = s.I();
                        rVarH.v(objE);
                    }
                    final cx.a aVar = (cx.a) objE;
                    objE2 = rVarH.E();
                    if (objE2 == companion.a()) {
                        objE2 = b1.k.a();
                        rVarH.v(objE2);
                    }
                    final b1.l lVar = (b1.l) objE2;
                    final f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
                    final long jR = R(buttonData.getButtonSize(), buttonData.getButtonVariant(), buttonData.getButtonState(), rVarH, 0);
                    final boolean z25 = !fr.t.c(buttonData.getButtonState(), k30.b.c.f107768a) || fr.t.c(buttonData.getButtonState(), k30.b.a.f107766a);
                    C(y2.m.d(223740350, true, new er.p() { // from class: h30.b
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return q.q(buttonData, f6VarA, f16, aVar, z19, oVar, z25, lVar, jR, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, 6);
                    if (t.k()) {
                        t.n();
                    }
                    z18 = z19;
                } else {
                    rVarH.O();
                    z18 = z16;
                }
                f17 = f16;
                d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: h30.h
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return q.w(buttonData, z18, f17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= MLKEMEngine.KyberPolyBytes;
            f16 = f15;
            if ((i17 & 147) != 146) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i25 != 0) {
                    z19 = true;
                } else {
                    z19 = z16;
                }
                if (i18 != 0) {
                    f16 = null;
                }
                if (t.k()) {
                    t.o(-1318670151, i17, -1, "pl.gov.coi.common.ui.ds.button.Button (Button.kt:55)");
                }
                final l3.o oVar2 = (l3.o) rVarH.N(g1.g());
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = s.I();
                    rVarH.v(objE);
                }
                final cx.a aVar2 = (cx.a) objE;
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = b1.k.a();
                    rVarH.v(objE2);
                }
                final b1.l lVar2 = (b1.l) objE2;
                final f6 f6VarA2 = b1.f.a(lVar2, rVarH, 6);
                final long jR2 = R(buttonData.getButtonSize(), buttonData.getButtonVariant(), buttonData.getButtonState(), rVarH, 0);
                final boolean z26 = !fr.t.c(buttonData.getButtonState(), k30.b.c.f107768a) || fr.t.c(buttonData.getButtonState(), k30.b.a.f107766a);
                C(y2.m.d(223740350, true, new er.p() { // from class: h30.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return q.q(buttonData, f6VarA2, f16, aVar2, z19, oVar2, z26, lVar2, jR2, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, 6);
                if (t.k()) {
                    t.n();
                }
                z18 = z19;
            } else {
                rVarH.O();
                z18 = z16;
            }
            f17 = f16;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: h30.h
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return q.w(buttonData, z18, f17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 48;
        z16 = z15;
        i18 = i16 & 4;
        if (i18 != 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                f16 = f15;
                if (rVarH.W(f16)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i17 |= i19;
            }
            if ((i17 & 147) != 146) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (rVarH.r(z17, i17 & 1)) {
                if (i25 != 0) {
                    z19 = true;
                } else {
                    z19 = z16;
                }
                if (i18 != 0) {
                    f16 = null;
                }
                if (t.k()) {
                    t.o(-1318670151, i17, -1, "pl.gov.coi.common.ui.ds.button.Button (Button.kt:55)");
                }
                final l3.o oVar3 = (l3.o) rVarH.N(g1.g());
                objE = rVarH.E();
                companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = s.I();
                    rVarH.v(objE);
                }
                final cx.a aVar3 = (cx.a) objE;
                objE2 = rVarH.E();
                if (objE2 == companion.a()) {
                    objE2 = b1.k.a();
                    rVarH.v(objE2);
                }
                final b1.l lVar3 = (b1.l) objE2;
                final f6 f6VarA3 = b1.f.a(lVar3, rVarH, 6);
                final long jR3 = R(buttonData.getButtonSize(), buttonData.getButtonVariant(), buttonData.getButtonState(), rVarH, 0);
                final boolean z27 = !fr.t.c(buttonData.getButtonState(), k30.b.c.f107768a) || fr.t.c(buttonData.getButtonState(), k30.b.a.f107766a);
                C(y2.m.d(223740350, true, new er.p() { // from class: h30.b
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return q.q(buttonData, f6VarA3, f16, aVar3, z19, oVar3, z27, lVar3, jR3, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, 6);
                if (t.k()) {
                    t.n();
                }
                z18 = z19;
            } else {
                rVarH.O();
                z18 = z16;
            }
            f17 = f16;
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: h30.h
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return q.w(buttonData, z18, f17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        f16 = f15;
        if ((i17 & 147) != 146) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (rVarH.r(z17, i17 & 1)) {
            if (i25 != 0) {
                z19 = true;
            } else {
                z19 = z16;
            }
            if (i18 != 0) {
                f16 = null;
            }
            if (t.k()) {
                t.o(-1318670151, i17, -1, "pl.gov.coi.common.ui.ds.button.Button (Button.kt:55)");
            }
            final l3.o oVar4 = (l3.o) rVarH.N(g1.g());
            objE = rVarH.E();
            companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = s.I();
                rVarH.v(objE);
            }
            final cx.a aVar4 = (cx.a) objE;
            objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = b1.k.a();
                rVarH.v(objE2);
            }
            final b1.l lVar4 = (b1.l) objE2;
            final f6 f6VarA4 = b1.f.a(lVar4, rVarH, 6);
            final long jR4 = R(buttonData.getButtonSize(), buttonData.getButtonVariant(), buttonData.getButtonState(), rVarH, 0);
            final boolean z28 = !fr.t.c(buttonData.getButtonState(), k30.b.c.f107768a) || fr.t.c(buttonData.getButtonState(), k30.b.a.f107766a);
            C(y2.m.d(223740350, true, new er.p() { // from class: h30.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.q(buttonData, f6VarA4, f16, aVar4, z19, oVar4, z28, lVar4, jR4, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 6);
            if (t.k()) {
                t.n();
            }
            z18 = z19;
        } else {
            rVarH.O();
            z18 = z16;
        }
        f17 = f16;
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h30.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.w(buttonData, z18, f17, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final ButtonData buttonData, f6 f6Var, final Float f15, final cx.a aVar, final boolean z15, final l3.o oVar, boolean z16, b1.l lVar, final long j15, r rVar, int i15) {
        f3.m mVarW;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(223740350, i15, -1, "pl.gov.coi.common.ui.ds.button.Button.<anonymous> (Button.kt:69)");
            }
            f3.m mVarJ = J(buttonData, rVar, 0);
            k30.c buttonType = buttonData.getButtonType();
            if (buttonType instanceof k30.c.WithIcon) {
                rVar.X(266116950);
                mVarW = s.o(f3.m.INSTANCE, f6Var, c5.h.j(c5.h.n(c5.h.n(M(buttonData.getButtonSize(), rVar, 0) / 2) + k70.a.f108864a.b(rVar, k70.a.f108865b).getStrokeWidth())));
                rVar.R();
            } else {
                if (!(buttonType instanceof k30.c.WithText)) {
                    rVar.X(266114924);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(266124367);
                mVarW = s.w(f3.m.INSTANCE, f6Var, H(buttonData.getButtonSize(), rVar, 0), 0.0f, 4, null);
                rVar.R();
            }
            f3.m mVarU = mVarJ.u(mVarW);
            boolean zW = rVar.W(f15);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: h30.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.r(f15, (n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD = v.d(mVarU, false, (er.l) objE, 1, null);
            y2 y2VarI = I(buttonData.getButtonType(), buttonData.getButtonSize(), rVar, 0);
            d3 d3VarT = T(buttonData, rVar, 0);
            m1 m1VarG = G(buttonData, rVar, 0);
            BorderStroke borderStrokeF = F(buttonData, rVar, 0);
            n1 n1Var = n1.f56965a;
            k70.a aVar2 = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            o1 o1VarC = n1Var.c(aVar2.c(rVar, i16).getLevel0(), aVar2.c(rVar, i16).getLevel0(), aVar2.c(rVar, i16).getLevel0(), aVar2.c(rVar, i16).getLevel0(), aVar2.c(rVar, i16).getLevel0(), rVar, n1.Q << 15, 0);
            boolean zW2 = rVar.W(buttonData) | rVar.G(aVar) | rVar.a(z15) | rVar.G(oVar);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == r.INSTANCE.a()) {
                objE2 = new er.a() { // from class: h30.j
                    @Override // er.a
                    public final Object a() {
                        return q.s(buttonData, aVar, z15, oVar);
                    }
                };
                rVar.v(objE2);
            }
            C6460u1.f((er.a) objE2, mVarD, z16, y2VarI, m1VarG, o1VarC, borderStrokeF, d3VarT, lVar, y2.m.d(-678236754, true, new er.q() { // from class: h30.k
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return q.v(buttonData, j15, (p3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 905969664, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Float f15, n4.i0 i0Var) {
        if (f15 != null) {
            f0.I0(i0Var, f15.floatValue());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(final ButtonData buttonData, cx.a aVar, final boolean z15, final l3.o oVar) {
        if (buttonData.getEventDelay() != null) {
            aVar.c(buttonData.getEventDelay().longValue(), new er.a() { // from class: h30.d
                @Override // er.a
                public final Object a() {
                    return q.t(buttonData, z15, oVar);
                }
            });
        } else {
            cx.a.a(aVar, 0L, new er.a() { // from class: h30.e
                @Override // er.a
                public final Object a() {
                    return q.u(buttonData, z15, oVar);
                }
            }, 1, null);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(ButtonData buttonData, boolean z15, l3.o oVar) {
        buttonData.h().a();
        if (z15) {
            oVar.B(true);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(ButtonData buttonData, boolean z15, l3.o oVar) {
        buttonData.h().a();
        if (z15) {
            oVar.B(true);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(ButtonData buttonData, long j15, p3 p3Var, r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-678236754, i15, -1, "pl.gov.coi.common.ui.ds.button.Button.<anonymous>.<anonymous> (Button.kt:123)");
            }
            k30.c buttonType = buttonData.getButtonType();
            if (buttonType instanceof k30.c.WithIcon) {
                rVar.X(1049510816);
                x(buttonData.getTestTag(), (k30.c.WithIcon) buttonData.getButtonType(), S(buttonData.getButtonSize(), buttonData.getButtonVariant(), buttonData.getButtonState(), rVar, 0), rVar, 0);
                rVar.R();
            } else {
                if (!(buttonType instanceof k30.c.WithText)) {
                    rVar.X(1049509198);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(1049520629);
                z(buttonData.getTestTag(), buttonData.getButtonSize(), (k30.c.WithText) buttonData.getButtonType(), j15, rVar, 0);
                rVar.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(ButtonData buttonData, boolean z15, Float f15, int i15, int i16, r rVar, int i17) {
        p(buttonData, z15, f15, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final void x(final String str, final k30.c.WithIcon withIcon, final long j15, r rVar, final int i15) {
        int i16;
        String str2;
        r rVarH = rVar.h(1485532295);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(withIcon) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.d(j15) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(1485532295, i16, -1, "pl.gov.coi.common.ui.ds.button.ButtonIcon (Button.kt:175)");
            }
            if (str != null) {
                str2 = str + "Icon";
            } else {
                str2 = null;
            }
            d40.h.f(null, new d40.b.C0864b(str2, withIcon.getIconResId(), d40.i.f.f39709e, new a(j15), null, null, 32, null), false, rVarH, 0, 5);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: h30.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.y(str, withIcon, j15, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(String str, k30.c.WithIcon withIcon, long j15, int i15, r rVar, int i16) {
        x(str, withIcon, j15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void z(final String str, final k30.a aVar, k30.c.WithText withText, final long j15, r rVar, final int i15) {
        int i16;
        k30.c.WithText withText2;
        r rVar2;
        String str2;
        TextStyle textStyleC;
        r rVarH = rVar.h(-1300963098);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(str) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            withText2 = withText;
            i16 |= rVarH.W(withText2) ? 256 : 128;
        } else {
            withText2 = withText;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.d(j15) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (t.k()) {
                t.o(-1300963098, i16, -1, "pl.gov.coi.common.ui.ds.button.ButtonText (Button.kt:192)");
            }
            if (str != null) {
                str2 = str + "Text";
            } else {
                str2 = null;
            }
            String str3 = str2;
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: h30.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.A((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarA = v.a(companion, (er.l) objE);
            Label label = withText2.getLabel();
            int iA = b5.j.INSTANCE.a();
            if (aVar instanceof k30.a.Large) {
                rVarH.X(-390041355);
                textStyleC = k70.a.f108864a.f(rVarH, k70.a.f108865b).a();
                rVarH.R();
            } else {
                if (!fr.t.c(aVar, k30.a.b.f107765a)) {
                    rVarH.X(-390043425);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-390039370);
                textStyleC = k70.a.f108864a.f(rVarH, k70.a.f108865b).c();
                rVarH.R();
            }
            j70.h.g(mVarA, str3, label, null, null, j15, 0L, null, null, null, 0L, null, b5.j.h(iA), 0L, 0, false, 0, 0, null, textStyleC, null, null, false, false, null, rVarH, (i16 << 6) & 458752, 0, 0, 33026008);
            rVar2 = rVarH;
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            final k30.c.WithText withText3 = withText2;
            d5VarM.a(new er.p() { // from class: h30.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return q.B(str, aVar, withText3, j15, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
