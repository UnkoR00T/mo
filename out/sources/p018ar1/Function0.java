package p018ar1;

import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b70.RequirementItem;
import b70.RequirementListData;
import d1.e0;
import d1.r3;
import d60.e;
import er.l;
import er.p;
import f3.j;
import f3.m;
import ip.a;
import j30.ButtonTextData;
import j70.h;
import mx.Label;
import mx.b;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p076m2.w5;
import p70.g;
import pq.v;
import t70.s;
import u50.v0;
import v50.c;
import w0.i;

/* JADX INFO: renamed from: ar1.t, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010 \u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u001f\u001a\u001f\u0010!\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u001f\u001a+\u0010%\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010)\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010*\u001a\u001f\u0010,\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u0007H\u0002¢\u0006\u0004\b,\u0010*¨\u00061²\u0006\u000e\u0010.\u001a\u00020-8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020/8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "t", "(Ler/a;Lm2/r;I)V", "Lar1/u;", "state", "Lmx/a;", "value", "removableIconContentDescription", "Lv50/c$g;", "W", "(Lar1/u;Lmx/a;Lmx/a;)Lv50/c$g;", "onClick", "c0", "(Lar1/u;Lmx/a;Ler/a;)Lv50/c$g;", "a0", "(Lar1/u;Lmx/a;)Lv50/c$g;", "Y", "Lv50/c$b;", "E", "(Lar1/u;Lmx/a;)Lv50/c$b;", "passwordIconContentDescription", "Lv50/c$c;", "G", "(Lar1/u;Lmx/a;Lmx/a;)Lv50/c$c;", "Lv50/c$f;", "U", "(Lar1/u;Lmx/a;)Lv50/c$f;", "Lv50/c$e;", "M", "(Lar1/u;Lmx/a;)Lv50/c$e;", "Q", "O", "countryCodeValue", "phoneNumberValue", "Lv50/c$d;", "J", "(Lar1/u;Lmx/a;Lmx/a;)Lv50/c$d;", "postalCodeValue", "Lv50/c$a;", a.f96137b, "(Lar1/u;Lmx/a;)Lv50/c$a;", "blikValue", "C", "", "secondPasswordField", "Lhz/b;", "secondPasswordFieldValidationState", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(a3 a3Var, String str) {
        w(a3Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(er.a aVar, int i15, r rVar, int i16) {
        t(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final c.Masked C(final u uVar, Label label) {
        return new c.Masked(null, b.b("Kod blik", ""), label, null, null, b.b("Wpisz kod blik", ""), null, new l() { // from class: ar1.e
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.D(uVar, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, 0, null, w50.a.BLIK, 524121, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(u uVar, String str) {
        c.Masked maskedC = C(uVar, b.b(str, ""));
        a3<c.Masked> a3VarA = uVar.a();
        if (a3VarA != null) {
            a3VarA.setValue(maskedC);
        }
        return i0.f148189a;
    }

    private static final c.Number E(final u uVar, Label label) {
        return new c.Number(null, b.b("Etykieta", ""), b.b("Tekst zastępczy (hint)", ""), label, null, null, null, new l() { // from class: ar1.l
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.F(uVar, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, false, 1048433, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(u uVar, String str) {
        c.Number numberE = E(uVar, b.b(str, ""));
        a3<c.Number> a3VarB = uVar.b();
        if (a3VarB != null) {
            a3VarB.setValue(numberE);
        }
        return i0.f148189a;
    }

    private static final c.Password G(final u uVar, final Label label, final Label label2) {
        return new c.Password(null, b.b("Hasło", ""), null, label, null, null, null, new l() { // from class: ar1.r
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.H(uVar, label2, (String) obj);
            }
        }, null, false, 0, null, false, null, false, 0, null, null, null, new l() { // from class: ar1.s
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.I(uVar, label, ((Boolean) obj).booleanValue());
            }
        }, 524149, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(u uVar, Label label, String str) {
        c.Password passwordG = G(uVar, b.b(str, ""), label);
        a3<c.Password> a3VarC = uVar.c();
        if (a3VarC != null) {
            a3VarC.setValue(passwordG);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(u uVar, Label label, boolean z15) {
        c.Password passwordG = G(uVar, label, z15 ? b.b("Ikona ukrytego hasła", "") : b.b("Ikona widocznego hasła", ""));
        a3<c.Password> a3VarC = uVar.c();
        if (a3VarC != null) {
            a3VarC.setValue(passwordG);
        }
        return i0.f148189a;
    }

    private static final c.PhoneNumber J(final u uVar, Label label, Label label2) {
        return new c.PhoneNumber(null, null, b.b("Numer telefonu", ""), 0, null, null, label, 0, null, new l() { // from class: ar1.c
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.K(uVar, (String) obj);
            }
        }, null, label2, null, hz.b.C2039b.f86846c, new l() { // from class: ar1.d
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.L(uVar, (String) obj);
            }
        }, null, 38331, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(u uVar, String str) {
        c.PhoneNumber value;
        Label labelB = b.b(str, "");
        a3<c.PhoneNumber> a3VarD = uVar.d();
        c.PhoneNumber phoneNumberJ = J(uVar, labelB, (a3VarD == null || (value = a3VarD.getValue()) == null) ? null : value.getPhoneNumberValue());
        a3<c.PhoneNumber> a3VarD2 = uVar.d();
        if (a3VarD2 != null) {
            a3VarD2.setValue(phoneNumberJ);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(u uVar, String str) {
        c.PhoneNumber value;
        c.Number countryCodeNumber;
        a3<c.PhoneNumber> a3VarD = uVar.d();
        c.PhoneNumber phoneNumberJ = J(uVar, (a3VarD == null || (value = a3VarD.getValue()) == null || (countryCodeNumber = value.getCountryCodeNumber()) == null) ? null : countryCodeNumber.getValue(), b.b(str, ""));
        a3<c.PhoneNumber> a3VarD2 = uVar.d();
        if (a3VarD2 != null) {
            a3VarD2.setValue(phoneNumberJ);
        }
        return i0.f148189a;
    }

    private static final c.Pin M(final u uVar, Label label) {
        return new c.Pin(null, null, label, null, null, null, new l() { // from class: ar1.n
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.N(uVar, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, 0, null, 262075, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(u uVar, String str) {
        c.Pin pinM = M(uVar, b.b(str, ""));
        a3<c.Pin> a3VarE = uVar.e();
        if (a3VarE != null) {
            a3VarE.setValue(pinM);
        }
        return i0.f148189a;
    }

    private static final c.Pin O(final u uVar, Label label) {
        return new c.Pin(null, null, label, null, null, null, new l() { // from class: ar1.p
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.P(uVar, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, 0, null, 261819, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(u uVar, String str) {
        c.Pin pinO = O(uVar, b.b(str, ""));
        a3<c.Pin> a3VarF = uVar.f();
        if (a3VarF != null) {
            a3VarF.setValue(pinO);
        }
        return i0.f148189a;
    }

    private static final c.Pin Q(final u uVar, Label label) {
        return new c.Pin(null, null, label, new hz.b.Invalid(b.b("Tekst błędu", "")), null, null, new l() { // from class: ar1.q
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.R(uVar, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, 0, null, 262067, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(u uVar, String str) {
        c.Pin pinQ = Q(uVar, b.b(str, ""));
        a3<c.Pin> a3VarG = uVar.g();
        if (a3VarG != null) {
            a3VarG.setValue(pinQ);
        }
        return i0.f148189a;
    }

    private static final c.Masked S(final u uVar, Label label) {
        return new c.Masked(null, b.b("Kod pocztowy", ""), label, null, null, b.b("Wpisz kod pocztowy", ""), null, new l() { // from class: ar1.a
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.T(uVar, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, 0, null, w50.a.POST_CODE, 524121, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 T(u uVar, String str) {
        c.Masked maskedS = S(uVar, b.b(str, ""));
        a3<c.Masked> a3VarH = uVar.h();
        if (a3VarH != null) {
            a3VarH.setValue(maskedS);
        }
        return i0.f148189a;
    }

    private static final c.Search U(final u uVar, Label label) {
        return new c.Search(null, null, b.b("Wyszukaj (hint)", ""), label, null, null, null, new l() { // from class: ar1.m
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.V(uVar, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, 262003, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(u uVar, String str) {
        c.Search searchU = U(uVar, b.b(str, ""));
        a3<c.Search> a3VarI = uVar.i();
        if (a3VarI != null) {
            a3VarI.setValue(searchU);
        }
        return i0.f148189a;
    }

    private static final c.Text W(final u uVar, Label label, final Label label2) {
        return new c.Text(null, b.b("Etykieta", ""), null, label, null, null, null, new l() { // from class: ar1.k
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.X(uVar, label2, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048437, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X(u uVar, Label label, String str) {
        c.Text textW = W(uVar, b.b(str, ""), label);
        a3<c.Text> a3VarJ = uVar.j();
        if (a3VarJ != null) {
            a3VarJ.setValue(textW);
        }
        return i0.f148189a;
    }

    private static final c.Text Y(final u uVar, Label label) {
        return new c.Text(null, b.b("Etykieta", ""), b.b("Tekst zastępczy (hint)", ""), label, null, b.b("Tekst pomocniczy (helper text)", ""), null, new l() { // from class: ar1.o
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.Z(uVar, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1047825, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z(u uVar, String str) {
        c.Text textY = Y(uVar, b.b(str, ""));
        a3<c.Text> a3VarK = uVar.k();
        if (a3VarK != null) {
            a3VarK.setValue(textY);
        }
        return i0.f148189a;
    }

    private static final c.Text a0(final u uVar, Label label) {
        return new c.Text(null, b.b("Etykieta", ""), b.b("Tekst zastępczy (hint)", ""), label, new hz.b.Invalid(b.b("Tekst błędu", "")), null, null, new l() { // from class: ar1.b
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.b0(uVar, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048321, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b0(u uVar, String str) {
        c.Text textA0 = a0(uVar, b.b(str, ""));
        a3<c.Text> a3VarL = uVar.l();
        if (a3VarL != null) {
            a3VarL.setValue(textA0);
        }
        return i0.f148189a;
    }

    private static final c.Text c0(final u uVar, Label label, final er.a<i0> aVar) {
        return new c.Text(null, b.b("Etykieta", ""), b.b("Tekst zastępczy (hint)", ""), label, null, b.b("Tekst pomocniczy (helper text)", ""), new ButtonTextData(null, b.b("Info button", ""), null, null, aVar, 13, null), new l() { // from class: ar1.f
            @Override // er.l
            public final Object b(Object obj) {
                return Function0.d0(uVar, aVar, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, null, 1048337, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d0(u uVar, er.a aVar, String str) {
        c.Text textC0 = c0(uVar, b.b(str, ""), aVar);
        a3<c.Text> a3VarM = uVar.m();
        if (a3VarM != null) {
            a3VarM.setValue(textC0);
        }
        return i0.f148189a;
    }

    public static final void t(final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        String str;
        int i17;
        w5 w5Var;
        r rVarH = rVar.h(60249213);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(aVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(60249213, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.textinput.DeveloperTextInputScreen (DeveloperTextInputScreen.kt:54)");
            }
            final Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            u uVar = new u();
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = c6.e(W(uVar, Label.INSTANCE.c(), b.b("Usuń", "")), null, 2, null);
                rVarH.v(objE);
            }
            uVar.w((a3) objE);
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = c6.e(c0(uVar, Label.INSTANCE.c(), new er.a() { // from class: ar1.g
                    @Override // er.a
                    public final Object a() {
                        return Function0.u(context);
                    }
                }), null, 2, null);
                rVarH.v(objE2);
            }
            uVar.z((a3) objE2);
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = c6.e(a0(uVar, Label.INSTANCE.c()), null, 2, null);
                rVarH.v(objE3);
            }
            uVar.y((a3) objE3);
            Object objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = c6.e(Y(uVar, Label.INSTANCE.c()), null, 2, null);
                rVarH.v(objE4);
            }
            uVar.x((a3) objE4);
            Object objE5 = rVarH.E();
            if (objE5 == companion.a()) {
                objE5 = c6.e(E(uVar, Label.INSTANCE.c()), null, 2, null);
                rVarH.v(objE5);
            }
            uVar.o((a3) objE5);
            Object objE6 = rVarH.E();
            if (objE6 == companion.a()) {
                objE6 = c6.e(G(uVar, Label.INSTANCE.c(), b.b("Ikona widocznego hasła", "")), null, 2, null);
                rVarH.v(objE6);
            }
            uVar.p((a3) objE6);
            Object objE7 = rVarH.E();
            if (objE7 == companion.a()) {
                objE7 = c6.e(U(uVar, Label.INSTANCE.c()), null, 2, null);
                rVarH.v(objE7);
            }
            uVar.v((a3) objE7);
            Object objE8 = rVarH.E();
            if (objE8 == companion.a()) {
                objE8 = c6.e(M(uVar, Label.INSTANCE.c()), null, 2, null);
                rVarH.v(objE8);
            }
            uVar.r((a3) objE8);
            Object objE9 = rVarH.E();
            if (objE9 == companion.a()) {
                objE9 = c6.e(Q(uVar, b.b("1234", "")), null, 2, null);
                rVarH.v(objE9);
            }
            uVar.t((a3) objE9);
            Object objE10 = rVarH.E();
            if (objE10 == companion.a()) {
                objE10 = c6.e(O(uVar, b.b("1234", "")), null, 2, null);
                rVarH.v(objE10);
            }
            uVar.s((a3) objE10);
            Object objE11 = rVarH.E();
            if (objE11 == companion.a()) {
                objE11 = c6.e(J(uVar, b.b("+48", ""), b.b("123456789", "")), null, 2, null);
                rVarH.v(objE11);
            }
            uVar.q((a3) objE11);
            Object objE12 = rVarH.E();
            if (objE12 == companion.a()) {
                objE12 = c6.e(S(uVar, b.b("", "")), null, 2, null);
                rVarH.v(objE12);
            }
            uVar.u((a3) objE12);
            Object objE13 = rVarH.E();
            if (objE13 == companion.a()) {
                objE13 = c6.e(C(uVar, b.b("", "")), null, 2, null);
                rVarH.v(objE13);
            }
            uVar.n((a3) objE13);
            m.Companion companion2 = m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            m mVarD = i.d(companion2, aVar2.a(rVarH, i18).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion3.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarD);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            g.f153260a.o(b.b("DS12.1 TextInput (1.1.0)", ""), aVar, rVarH, ((i16 << 3) & 112) | (g.f153262c << 6));
            f3.c.b bVarK = companion3.k();
            m mVarS = t70.i.S(d1.a3.r(d.f(companion2, 0.0f, 1, null), aVar2.b(rVarH, i18).getSpacing200(), 0.0f, aVar2.b(rVarH, i18).getSpacing200(), 0.0f, 10, null), null, rVarH, 0, 1);
            w0 w0VarA2 = e0.a(iVar.k(), bVarK, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarS);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            h.g(null, null, b.b("TextInput", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            i0 i0Var2 = i0.f148189a;
            h.g(null, null, b.b("Pole tekstowe - Pola tekstowe umożliwiają użytkownikom wprowadzanie danych tekstowych w dowolnym formacie. Wielkość pola tekstowego powinna odzwierciedlać długosć treści, którą użytkownik ma wprowadzić. Domyślnie, pole tekstowe, przeznaczone jest dla krótkich, jednolinijkowych treści.", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            h.g(null, null, b.b("Text", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            c.Text value = uVar.j().getValue();
            int i19 = c.Text.P;
            v0.g(value, null, rVarH, i19, 2);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            h.g(null, null, b.b("Text - with optionals", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            v0.g(uVar.m().getValue(), null, rVarH, i19, 2);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            h.g(null, null, b.b("Text - Error", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            v0.g(uVar.l().getValue(), null, rVarH, i19, 2);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            h.g(null, null, b.b("Text - Disabled", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            v0.g(uVar.k().getValue(), null, rVarH, i19, 2);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            h.g(null, null, b.b("Number", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            v0.g(uVar.b().getValue(), null, rVarH, c.Number.P, 2);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            h.g(null, null, b.b("Password", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            c.Password value2 = uVar.c().getValue();
            int i25 = c.Password.O;
            v0.g(value2, null, rVarH, i25, 2);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            h.g(null, null, b.b("Search", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            v0.g(uVar.i().getValue(), null, rVarH, c.Search.N, 2);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            h.g(null, null, b.b("Pin", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            c.Pin value3 = uVar.e().getValue();
            int i26 = c.Pin.N;
            v0.g(value3, null, rVarH, i26, 2);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            h.g(null, null, b.b("Pin - Error", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            v0.g(uVar.g().getValue(), null, rVarH, i26, 2);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            h.g(null, null, b.b("Pin - Disabled", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            v0.g(uVar.f().getValue(), null, rVarH, i26, 2);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            h.g(null, null, b.b("Phone number", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            v0.g(uVar.d().getValue(), null, rVarH, c.PhoneNumber.M, 2);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            c.Masked value4 = uVar.h().getValue();
            int i27 = c.Masked.O;
            v0.g(value4, null, rVarH, i27, 2);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            v0.g(uVar.a().getValue(), null, rVarH, i27, 2);
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            h.g(null, null, b.b("Pole tekstowe z walidatorami", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(d.i(companion2, aVar2.b(rVarH, i18).getSpacing100()), rVarH, 0);
            Object objE14 = rVarH.E();
            if (objE14 == companion.a()) {
                str = "";
                i17 = 2;
                w5Var = null;
                objE14 = c6.e(str, null, 2, null);
                rVarH.v(objE14);
            } else {
                str = "";
                i17 = 2;
                w5Var = null;
            }
            final a3 a3Var = (a3) objE14;
            Object objE15 = rVarH.E();
            if (objE15 == companion.a()) {
                objE15 = c6.e(hz.b.C2039b.f86846c, w5Var, i17, w5Var);
                rVarH.v(objE15);
            }
            final a3 a3Var2 = (a3) objE15;
            Object objE16 = rVarH.E();
            if (objE16 == companion.a()) {
                objE16 = new l() { // from class: ar1.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.z(a3Var, a3Var2, ((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE16);
            }
            d60.c cVarB = e.b(false, (l) objE16, rVarH, 48, 1);
            m mVarD2 = d60.c.INSTANCE.d(companion2, cVarB);
            w0 w0VarA3 = e0.a(iVar.k(), companion3.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            m mVarE3 = j.e(rVarH, mVarD2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
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
            n6.i(rVarC3, w0VarA3, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            Label labelB = b.b("Hasło", str);
            Label labelB2 = b.b("Wpisz hasło", str);
            Label labelB3 = b.b(v(a3Var), str);
            hz.b bVarX = x(a3Var2);
            Object objE17 = rVarH.E();
            if (objE17 == companion.a()) {
                objE17 = new l() { // from class: ar1.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.A(a3Var, (String) obj);
                    }
                };
                rVarH.v(objE17);
            }
            v0.g(new c.Password(null, labelB, labelB2, labelB3, bVarX, null, null, (l) objE17, null, false, 0, null, false, null, false, 0, null, null, null, null, 1048417, null), cVarB, rVarH, i25, 0);
            b70.i.l(new RequirementListData(x(a3Var2) instanceof hz.b.Invalid, !x(a3Var2).a(), v.q(new RequirementItem(null, v(a3Var).length() > 0, b.b("1 znak", str), 1, null), new RequirementItem(null, v(a3Var).length() >= i17, b.b("2 znaki", str), 1, null), new RequirementItem(null, v(a3Var).length() >= 4, b.b("4 znaki", str), 1, null))), rVarH, RequirementListData.f16989d);
            rVarH.x();
            r3.a(d.i(companion2, c5.h.n(500)), rVarH, 6);
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
            d5VarM.a(new p() { // from class: ar1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.B(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Context context) {
        s.M(context, "Info button clicked.");
        return i0.f148189a;
    }

    private static final String v(a3<String> a3Var) {
        return a3Var.getValue();
    }

    private static final void w(a3<String> a3Var, String str) {
        a3Var.setValue(str);
    }

    private static final hz.b x(a3<hz.b> a3Var) {
        return a3Var.getValue();
    }

    private static final void y(a3<hz.b> a3Var, hz.b bVar) {
        a3Var.setValue(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(a3 a3Var, a3 a3Var2, boolean z15) {
        hz.b invalid;
        if (z15) {
            invalid = hz.b.C2039b.f86846c;
        } else {
            boolean z16 = v(a3Var).length() >= 4;
            if (z16) {
                invalid = hz.b.d.f86848c;
            } else {
                if (z16) {
                    throw new oq.p();
                }
                invalid = new hz.b.Invalid(b.b("Komunikat walidacyjny", ""));
            }
        }
        y(a3Var2, invalid);
        return i0.f148189a;
    }
}
