package q30;

import androidx.compose.ui.graphics.Color;
import b1.k;
import b1.l;
import d1.a3;
import d1.m3;
import d1.q3;
import d1.r3;
import d1.x;
import er.p;
import f3.j;
import f3.m;
import mx.Label;
import n4.f0;
import n4.g0;
import n4.v;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import r30.CheckBoxRowData;
import t70.s;
import w0.o;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0010\u001a\u00020\f*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lr30/a;", "data", "Lr30/b;", "type", "", "isEnabled", "Loq/i0;", "g", "(Lr30/a;Lr30/b;ZLm2/r;I)V", "Lr30/d;", "e", "(Lr30/d;Lm2/r;I)V", "Landroidx/compose/ui/graphics/Color;", "m", "(ZLm2/r;I)J", "isChecked", "k", "(Lr30/b;ZZLm2/r;I)J", "l", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f164118a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-30547819);
            if (t.k()) {
                t.o(-30547819, i15, -1, "pl.gov.coi.common.ui.ds.checkbox.common.CheckboxRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CheckBoxRow.kt:116)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().c();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jC;
        }
    }

    private static final void e(final r30.d dVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1084105759);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1084105759, i16, -1, "pl.gov.coi.common.ui.ds.checkbox.common.CheckBoxClickableText (CheckBoxRow.kt:152)");
            }
            m.Companion companion = m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarR = a3.r(companion, aVar.b(rVarH, i17).getSpacing500(), aVar.b(rVarH, i17).getSpacing100(), aVar.b(rVarH, i17).getSpacing500(), 0.0f, 8, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarR);
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
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            if (dVar instanceof r30.d.Button) {
                rVarH.X(-1972730723);
                j30.f.e(null, ((r30.d.Button) dVar).getButtonData(), false, rVarH, 0, 5);
                rVarH.R();
            } else {
                if (!(dVar instanceof r30.d.Link)) {
                    rVarH.X(-1972732236);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-1972728491);
                x40.h.g(((r30.d.Link) dVar).getLinkData(), rVarH, 0);
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
            d5VarM.a(new p() { // from class: q30.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.f(dVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(r30.d dVar, int i15, r rVar, int i16) {
        e(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void g(final CheckBoxRowData checkBoxRowData, final r30.b bVar, boolean z15, r rVar, final int i15) {
        int i16;
        final boolean z16;
        r rVar2;
        boolean z17;
        k70.a aVar;
        Object obj;
        m.Companion companion;
        int i17;
        String str;
        String str2;
        Label errorText;
        r rVarH = rVar.h(-754736915);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(checkBoxRowData) : rVarH.G(checkBoxRowData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        int i18 = i16;
        if (rVarH.r((i18 & 147) != 146, i18 & 1)) {
            if (t.k()) {
                t.o(-754736915, i18, -1, "pl.gov.coi.common.ui.ds.checkbox.common.CheckboxRow (CheckBoxRow.kt:55)");
            }
            Object objE = rVarH.E();
            r.Companion companion2 = r.INSTANCE;
            if (objE == companion2.a()) {
                objE = k.a();
                rVarH.v(objE);
            }
            l lVar = (l) objE;
            f6<Boolean> f6VarA = b1.f.a(lVar, rVarH, 6);
            m.Companion companion3 = m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion4 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion4.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion3);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion5.b();
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
            n6.i(rVarC, w0VarA, companion5.d());
            n6.i(rVarC, e0VarT, companion5.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion5.c());
            n6.g(rVarC, companion5.a());
            n6.i(rVarC, mVarE, companion5.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar2 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            m mVarA = k3.f.a(s.w(companion3, f6VarA, aVar2.b(rVarH, i19).getSpacing50(), 0.0f, 4, null), aVar2.e(rVarH, i19).getRadius50());
            boolean isChecked = checkBoxRowData.getIsChecked();
            int iC = n4.l.INSTANCE.c();
            r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
            n4.l lVarJ = n4.l.j(iC);
            int i25 = i18 & 14;
            boolean z18 = i25 == 4 || ((i18 & 8) != 0 && rVarH.G(checkBoxRowData));
            Object objE2 = rVarH.E();
            if (z18 || objE2 == companion2.a()) {
                objE2 = new er.l() { // from class: q30.e
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return i.h(checkBoxRowData, ((Boolean) obj2).booleanValue());
                    }
                };
                rVarH.v(objE2);
            }
            m mVarA2 = k1.g.a(mVarA, isChecked, lVar, r1VarE, z15, lVarJ, (er.l) objE2);
            boolean z19 = (i25 == 4 || ((i18 & 8) != 0 && rVarH.G(checkBoxRowData))) | ((i18 & 112) == 32 || ((i18 & 64) != 0 && rVarH.G(bVar)));
            Object objE3 = rVarH.E();
            if (z19 || objE3 == companion2.a()) {
                objE3 = new er.l() { // from class: q30.f
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return i.i(checkBoxRowData, bVar, (n4.i0) obj2);
                    }
                };
                rVarH.v(objE3);
            }
            m mVarD = v.d(mVarA2, false, (er.l) objE3, 1, null);
            r30.b.Error error = bVar instanceof r30.b.Error ? (r30.b.Error) bVar : null;
            m mVarG = t70.i.G(mVarD, (error == null || (errorText = error.getErrorText()) == null) ? null : errorText.getText(), rVarH, 0);
            w0 w0VarB = m3.b(iVar.j(), companion4.l(), rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarG);
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
            m mVarT = androidx.compose.foundation.layout.d.t(companion3, d40.i.f.f39709e.getDimension());
            w0 w0VarI = d1.r.i(companion4.e(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT3 = rVarH.t();
            m mVarE3 = j.e(rVarH, mVarT);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarI, companion5.d());
            n6.i(rVarC3, e0VarT3, companion5.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
            n6.g(rVarC3, companion5.a());
            n6.i(rVarC3, mVarE3, companion5.e());
            x xVar = x.f39368a;
            int i26 = i18 >> 3;
            m mVarB = d60.c.INSTANCE.b(androidx.compose.foundation.layout.d.t(o.h(w0.i.c(companion3, k(bVar, checkBoxRowData.getIsChecked(), z15, rVarH, (i26 & 14) | (i18 & 896)), l1.h.f(aVar2.b(rVarH, i19).getSpacing50())), aVar2.b(rVarH, i19).getSpacing25(), l(bVar, z15, checkBoxRowData.getIsChecked(), rVarH, i26 & 126), l1.h.f(aVar2.b(rVarH, i19).getSpacing50())), d40.i.e.f39708e.getDimension()), d60.e.b(false, null, rVarH, 0, 3));
            w0 w0VarI2 = d1.r.i(companion4.e(), false);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT4 = rVarH.t();
            m mVarE4 = j.e(rVarH, mVarB);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB4);
            } else {
                rVarH.u();
            }
            r rVarC4 = n6.c(rVarH);
            n6.i(rVarC4, w0VarI2, companion5.d());
            n6.i(rVarC4, e0VarT4, companion5.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion5.c());
            n6.g(rVarC4, companion5.a());
            n6.i(rVarC4, mVarE4, companion5.e());
            if (checkBoxRowData.getIsChecked()) {
                rVarH.X(713030300);
                String testTag = checkBoxRowData.getTestTag();
                if (testTag != null) {
                    str2 = testTag + "Icon";
                } else {
                    str2 = null;
                }
                z16 = z15;
                rVar2 = rVarH;
                z17 = true;
                d40.h.f(null, new d40.b.C0864b(str2, jz.a.U1, d40.i.d.f39707e, a.f164118a, Label.INSTANCE.c(), null, 32, null), false, rVar2, 0, 5);
            } else {
                z16 = z15;
                rVar2 = rVarH;
                z17 = true;
                rVar2.X(708451631);
            }
            rVar2.R();
            rVar2.x();
            rVar2.x();
            if (checkBoxRowData.getLabel().l()) {
                rVar2.X(2001439949);
                r3.a(androidx.compose.foundation.layout.d.y(companion3, aVar2.b(rVar2, i19).getSpacing200()), rVar2, 0);
                String testTag2 = checkBoxRowData.getTestTag();
                if (testTag2 != null) {
                    str = testTag2 + "Text";
                } else {
                    str = null;
                }
                int iF = b5.j.INSTANCE.f();
                Label label = checkBoxRowData.getLabel();
                TextStyle textStyleB = aVar2.f(rVar2, i19).b();
                String str3 = str;
                companion = companion3;
                r rVar3 = rVar2;
                obj = null;
                i17 = 0;
                aVar = aVar2;
                j70.h.g(null, str3, label, null, null, m(z16, rVar2, (i18 >> 6) & 14), 0L, null, null, null, 0L, null, b5.j.h(iF), 0L, 0, false, 0, 0, null, textStyleB, null, null, false, true, null, rVar3, 0, 0, 3072, 24637401);
                rVarH = rVar3;
            } else {
                rVarH = rVar2;
                aVar = aVar2;
                obj = null;
                companion = companion3;
                i17 = 0;
                rVarH.X(1996407099);
            }
            rVarH.R();
            rVarH.x();
            m mVarH = androidx.compose.foundation.layout.d.h(a3.r(companion, aVar.b(rVarH, i19).getSpacing500(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, z17, obj);
            w0 w0VarA2 = d1.e0.a(iVar.k(), companion4.k(), rVarH, i17);
            int iHashCode5 = Long.hashCode(p076m2.m.b(rVarH, i17));
            e0 e0VarT5 = rVarH.t();
            m mVarE5 = j.e(rVarH, mVarH);
            er.a<androidx.compose.ui.node.c> aVarB5 = companion5.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB5);
            } else {
                rVarH.u();
            }
            r rVarC5 = n6.c(rVarH);
            n6.i(rVarC5, w0VarA2, companion5.d());
            n6.i(rVarC5, e0VarT5, companion5.f());
            n6.i(rVarC5, Integer.valueOf(iHashCode5), companion5.c());
            n6.g(rVarC5, companion5.a());
            n6.i(rVarC5, mVarE5, companion5.e());
            s30.b.b(checkBoxRowData.getDescription(), rVarH, i17);
            d.b(checkBoxRowData.getIsChecked(), checkBoxRowData.c(), rVarH, i17);
            rVarH.x();
            r30.d clickableTextData = checkBoxRowData.getClickableTextData();
            if (clickableTextData == null) {
                rVarH.X(-2018243664);
            } else {
                rVarH.X(-2018243663);
                e(clickableTextData, rVarH, i17);
                i0 i0Var2 = i0.f148189a;
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            z16 = z15;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: q30.g
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return i.j(checkBoxRowData, bVar, z16, i15, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(CheckBoxRowData checkBoxRowData, boolean z15) {
        checkBoxRowData.h().b(Boolean.valueOf(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(CheckBoxRowData checkBoxRowData, r30.b bVar, n4.i0 i0Var) {
        String text;
        Label helperText;
        String text2;
        g0.a(i0Var, true);
        String testTag = checkBoxRowData.getTestTag();
        if (testTag == null) {
            testTag = "checkbox" + checkBoxRowData.getLabel();
        }
        f0.y0(i0Var, testTag);
        Label contentDescription = checkBoxRowData.getContentDescription();
        if (contentDescription == null || (text = contentDescription.getText()) == null) {
            text = checkBoxRowData.getLabel().getText();
        }
        f0.c0(i0Var, text);
        r30.b.Helper helper = bVar instanceof r30.b.Helper ? (r30.b.Helper) bVar : null;
        if (helper != null && (helperText = helper.getHelperText()) != null && (text2 = helperText.getText()) != null) {
            f0.x0(i0Var, text2);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(CheckBoxRowData checkBoxRowData, r30.b bVar, boolean z15, int i15, r rVar, int i16) {
        g(checkBoxRowData, bVar, z15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final long k(r30.b bVar, boolean z15, boolean z16, r rVar, int i15) {
        long primary;
        if (t.k()) {
            t.o(631781371, i15, -1, "pl.gov.coi.common.ui.ds.checkbox.common.getBackgroundColor (CheckBoxRow.kt:177)");
        }
        if (!z15) {
            rVar.X(1551512518);
            rVar.R();
            primary = Color.INSTANCE.g();
        } else if (!z16) {
            rVar.X(1551514404);
            primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().a();
            rVar.R();
        } else if (bVar instanceof r30.b.Error) {
            rVar.X(1551516583);
            primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            rVar.R();
        } else {
            rVar.X(1551518050);
            primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return primary;
    }

    private static final long l(r30.b bVar, boolean z15, boolean z16, r rVar, int i15) {
        long jA;
        if (t.k()) {
            t.o(-888145243, i15, -1, "pl.gov.coi.common.ui.ds.checkbox.common.getBorderStrokeColor (CheckBoxRow.kt:186)");
        }
        if (!z15 && z16) {
            rVar.X(1190918158);
            jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().a();
            rVar.R();
        } else if (!z15 && !z16) {
            rVar.X(1190920590);
            jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().f();
            rVar.R();
        } else if (bVar instanceof r30.b.Error) {
            rVar.X(1190922769);
            jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            rVar.R();
        } else {
            rVar.X(1190923639);
            if (z16) {
                rVar.X(1190924716);
                jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            } else {
                rVar.X(1190925902);
                jA = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().a();
            }
            rVar.R();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jA;
    }

    private static final long m(boolean z15, r rVar, int i15) {
        long jD;
        if (t.k()) {
            t.o(-1915476844, i15, -1, "pl.gov.coi.common.ui.ds.checkbox.common.getLabelColor (CheckBoxRow.kt:169)");
        }
        if (z15) {
            rVar.X(-1035107038);
            jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().i();
            rVar.R();
        } else {
            rVar.X(-1035057438);
            jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().d();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return jD;
    }
}
