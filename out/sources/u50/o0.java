package u50;

import android.text.TextUtils;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import d1.m3;
import d1.q3;
import d1.r3;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p079n1.KeyboardOptions;
import p079n1.l3;
import q4.TextStyle;
import q4.a4;
import q4.z3;
import v4.TextFieldValue;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lv50/c$e;", "data", "Ld60/c;", "focusHost", "Ll3/o;", "focusManager", "Loq/i0;", "l", "(Lv50/c$e;Ld60/c;Ll3/o;Lm2/r;I)V", "", "characterIndex", "", "pinValue", "", "isError", "enabled", "i", "(ILjava/lang/String;ZZLd60/c;Lm2/r;I)V", "characters", "s", "(I)Ljava/lang/String;", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class o0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f195453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ v50.c.Pin f195454g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.a<oq.i0> f195455h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i15, v50.c.Pin pin, er.a<oq.i0> aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f195453f = i15;
            this.f195454g = pin;
            this.f195455h = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f195452e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (this.f195453f == this.f195454g.getLength()) {
                this.f195455h.a();
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f195453f, this.f195454g, this.f195455h, eVar);
        }
    }

    private static final void i(final int i15, final String str, final boolean z15, final boolean z16, final d60.c cVar, p076m2.r rVar, final int i16) {
        int i17;
        String str2;
        d60.c cVar2;
        p076m2.r rVar2;
        float strokeWidth;
        long jA;
        long jD;
        p076m2.r rVarH = rVar.h(1820029885);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.c(i15) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            str2 = str;
            i17 |= rVarH.W(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.a(z15) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= rVarH.a(z16) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            cVar2 = cVar;
            i17 |= rVarH.W(cVar2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            cVar2 = cVar;
        }
        if (rVarH.r((i17 & 9363) != 9362, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1820029885, i17, -1, "pl.gov.coi.common.ui.ds.textinput.PinCharField (TextFieldPin.kt:139)");
            }
            boolean z17 = i15 == str2.length() && cVar2.j();
            String string = (i15 >= str2.length() ? "" : (char) 8226).toString();
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: u50.k0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o0.j((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f3.m mVarD = n4.v.d(companion, false, (er.l) objE, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarA = k3.f.a(androidx.compose.foundation.layout.d.v(mVarD, aVar.b(rVarH, i18).getSpacing500(), aVar.b(rVarH, i18).getSpacing600()), aVar.e(rVarH, i18).getRadius150());
            if (z17) {
                rVarH.X(997051974);
                strokeWidth = aVar.b(rVarH, i18).getSpacing25();
                rVarH.R();
            } else {
                rVarH.X(997053512);
                strokeWidth = aVar.b(rVarH, i18).getStrokeWidth();
                rVarH.R();
            }
            if (z15) {
                rVarH.X(997056425);
                jA = aVar.a(rVarH, i18).getSupport().g();
                rVarH.R();
            } else if (z17) {
                rVarH.X(997058532);
                jA = aVar.a(rVarH, i18).getBase().getPrimary();
                rVarH.R();
            } else if (z16) {
                rVarH.X(997061926);
                jA = aVar.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().a();
                rVarH.R();
            } else {
                rVarH.X(997060262);
                jA = aVar.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g();
                rVarH.R();
            }
            f3.m mVarD2 = w0.i.d(w0.o.h(mVarA, strokeWidth, jA, aVar.e(rVarH, i18).getRadius150()), aVar.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), null, 2, null);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.e(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarD2);
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
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarD3 = d1.x.f39368a.d(companion, companion2.e());
            Label labelB = mx.b.b(string, "fieldValue");
            TextStyle textStyleM = aVar.f(rVarH, i18).m();
            if (z16) {
                rVarH.X(1015548365);
                jD = aVar.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
                rVarH.R();
            } else {
                rVarH.X(1015550125);
                jD = aVar.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().d();
                rVarH.R();
            }
            rVar2 = rVarH;
            j70.h.g(mVarD3, null, labelB, null, null, 0L, 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, TextStyle.e(textStyleM, jD, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), null, null, false, false, null, rVar2, 0, 0, 0, 33026042);
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
            d5VarM.a(new er.p() { // from class: u50.l0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o0.k(i15, str, z15, z16, cVar, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(int i15, String str, boolean z15, boolean z16, d60.c cVar, int i16, p076m2.r rVar, int i17) {
        i(i15, str, z15, z16, cVar, rVar, g4.a(i16 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final v50.c.Pin pin, final d60.c cVar, final l3.o oVar, p076m2.r rVar, final int i15) {
        int i16;
        final d60.c cVar2;
        p076m2.r rVarH = rVar.h(-361275294);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(pin) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(cVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(oVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-361275294, i16, -1, "pl.gov.coi.common.ui.ds.textinput.TextFieldPin (TextFieldPin.kt:58)");
            }
            er.a<oq.i0> aVarB = pin.B();
            if (aVarB == null) {
                rVarH.X(435904931);
            } else {
                rVarH.X(435904932);
                int length = pin.getValue().getText().length();
                Integer numValueOf = Integer.valueOf(length);
                boolean zC = rVarH.c(length) | rVarH.G(pin) | rVarH.W(aVarB);
                Object objE = rVarH.E();
                if (zC || objE == p076m2.r.INSTANCE.a()) {
                    objE = new a(length, pin, aVarB, null);
                    rVarH.v(objE);
                }
                Function0.d(numValueOf, (er.p) objE, rVarH, 0);
            }
            rVarH.R();
            cVar2 = cVar;
            p030d20.d.d(cVar2, 0, 0, false, y2.m.d(826622174, true, new er.q() { // from class: u50.m0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return o0.m(cVar, pin, oVar, (er.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, ((i16 >> 3) & 14) | 24576, 14);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            cVar2 = cVar;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u50.n0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return o0.r(pin, cVar2, oVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(final d60.c cVar, final v50.c.Pin pin, l3.o oVar, final er.l lVar, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.G(lVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(826622174, i16, -1, "pl.gov.coi.common.ui.ds.textinput.TextFieldPin.<anonymous> (TextFieldPin.kt:70)");
            }
            d60.c.Companion companion = d60.c.INSTANCE;
            f3.m.Companion companion2 = f3.m.INSTANCE;
            l3.g.Companion companion3 = l3.g.INSTANCE;
            f3.m mVarZ = t70.i.z(companion.b(t70.i.E(t70.i.F(companion2, companion3.f(), rVar, 6), companion3.e(), rVar, 0), cVar), pin, rVar, 0);
            boolean z15 = (i16 & 14) == 4;
            Object objE = rVar.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: u50.g0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o0.n(lVar, (l3.l0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarA = l3.e.a(mVarZ, (er.l) objE);
            boolean zG = rVar.G(pin);
            Object objE2 = rVar.E();
            if (zG || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: u50.h0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o0.o(pin, (n4.i0) obj);
                    }
                };
                rVar.v(objE2);
            }
            f3.m mVarD = n4.v.d(mVarA, false, (er.l) objE2, 1, null);
            TextFieldValue textFieldValue = new TextFieldValue(pin.getValue().getText(), a4.a(pin.getValue().getText().length()), (z3) null, 4, (fr.k) null);
            SolidColor solidColor = new SolidColor(Color.INSTANCE.h(), null);
            boolean enabled = pin.getEnabled();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, pin.getKeyboardType(), pin.getImeAction(), null, null, null, 115, null);
            l3 l3VarB = pin.i().b(oVar);
            boolean zG2 = rVar.G(pin);
            Object objE3 = rVar.E();
            if (zG2 || objE3 == p076m2.r.INSTANCE.a()) {
                objE3 = new er.l() { // from class: u50.i0
                    @Override // er.l
                    public final Object b(Object obj) {
                        return o0.p(pin, (TextFieldValue) obj);
                    }
                };
                rVar.v(objE3);
            }
            p079n1.u.i(textFieldValue, (er.l) objE3, mVarD, enabled, false, null, keyboardOptions, l3VarB, false, 0, 0, null, null, null, solidColor, y2.m.d(-111164133, true, new er.q() { // from class: u50.j0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return o0.q(pin, cVar, (er.p) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 0, 221184, 16176);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(er.l lVar, l3.l0 l0Var) {
        lVar.b(l0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(v50.c.Pin pin, n4.i0 i0Var) {
        StringBuilder sb5 = new StringBuilder();
        c70.a aVar = c70.a.f23835a;
        sb5.append(aVar.a().W().getText());
        Label.Companion companion = Label.INSTANCE;
        sb5.append(companion.d().getText());
        sb5.append(aVar.a().K0().getText());
        sb5.append(companion.d().getText());
        sb5.append(aVar.a().u0(pin.getLength(), pin.getLength()).getText());
        n4.f0.c0(i0Var, sb5.toString());
        if (pin.getValue().getText().length() > 0) {
            n4.f0.g0(i0Var, new q4.e(s(pin.getValue().getText().length()), null, 2, null));
        }
        hz.b validationState = pin.getValidationState();
        hz.b.Invalid invalid = validationState instanceof hz.b.Invalid ? (hz.b.Invalid) validationState : null;
        if (invalid != null) {
            n4.f0.l0(i0Var, n4.i.INSTANCE.b());
            n4.f0.x0(i0Var, t70.s.O(invalid.getMessage()));
            n4.f0.m(i0Var, t70.s.O(invalid.getMessage()));
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(v50.c.Pin pin, TextFieldValue textFieldValue) {
        if (textFieldValue.m().length() <= pin.getLength() && TextUtils.isDigitsOnly(textFieldValue.m())) {
            pin.n().b(textFieldValue.m());
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(v50.c.Pin pin, d60.c cVar, er.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-111164133, i15, -1, "pl.gov.coi.common.ui.ds.textinput.TextFieldPin.<anonymous>.<anonymous> (TextFieldPin.kt:112)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, companion);
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
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var = q3.f39261a;
            rVar.X(350799829);
            int length = pin.getLength();
            int i16 = 0;
            while (i16 < length) {
                d60.c cVar2 = cVar;
                p076m2.r rVar2 = rVar;
                i(i16, pin.getValue().getText(), pin.getValidationState() instanceof hz.b.Invalid, pin.getEnabled(), cVar2, rVar2, 0);
                if (i16 != pin.getLength() - 1) {
                    r3.a(androidx.compose.foundation.layout.d.y(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing150()), rVar2, 0);
                }
                i16++;
                cVar = cVar2;
                rVar = rVar2;
            }
            p076m2.r rVar3 = rVar;
            rVar3.R();
            rVar3.x();
            rVar3.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(v50.c.Pin pin, d60.c cVar, l3.o oVar, int i15, p076m2.r rVar, int i16) {
        l(pin, cVar, oVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final String s(int i15) {
        StringBuilder sb5 = new StringBuilder();
        c70.a aVar = c70.a.f23835a;
        sb5.append(aVar.a().v0().getText());
        sb5.append(Label.INSTANCE.d().getText());
        sb5.append(aVar.a().u0(i15, i15).getText());
        return sb5.toString();
    }
}
