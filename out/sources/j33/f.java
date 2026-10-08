package j33;

import d60.ScrollControllerData;
import er.l;
import fr.t;
import h30.ButtonData;
import h33.Form;
import i33.PhoneAndEmailInputsCustomContentData;
import i50.BaseScaffoldData;
import iy.c0;
import java.util.Arrays;
import mx.Label;
import oq.i0;
import oq.p;
import org.bouncycastle.asn1.BERTags;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;
import r30.CheckBoxRowData;
import u30.CheckBoxGroupData;
import w30.CheckBoxSingleData;
import x50.NavigationButtonData;
import x50.i;
import y2.m;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lj33/f;", "Lxw/f;", "Lj33/f$a;", "Lh33/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lh33/b;", "form", "Li33/d;", "l", "(Lj33/f$a;Lh33/b;)Li33/d;", "", "stringId", "Lmx/a;", "x", "(I)Lmx/a;", "", "", "arg", "z", "(I[Ljava/lang/Object;)Lmx/a;", "params", "m", "(Lj33/f$a;)Lh33/d$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, h33.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: j33.f$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u001c\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b \u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b(\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b)\u0010#R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b&\u0010+R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b%\u0010+R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010*\u001a\u0004\b$\u0010+¨\u0006,"}, d2 = {"Lj33/f$a;", "", "Lh33/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextClick", "onBack", "onClose", "onToggleAnonymousReport", "onToggleEdorAddress", "onToggleEmailPhoneAddress", "Lkotlin/Function1;", "", "onEditPhonePrefix", "onEditPhoneNumber", "onEditEmail", "<init>", "(Lh33/c;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh33/c;", "j", "()Lh33/c;", "b", "Ler/a;", "f", "()Ler/a;", "c", "d", "e", "g", "h", "i", "Ler/l;", "()Ler/l;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h33.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onToggleAnonymousReport;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onToggleEdorAddress;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onToggleEmailPhoneAddress;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onEditPhonePrefix;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onEditPhoneNumber;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onEditEmail;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(h33.c cVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6, l<? super String, i0> lVar, l<? super String, i0> lVar2, l<? super String, i0> lVar3) {
            this.state = cVar;
            this.onNextClick = aVar;
            this.onBack = aVar2;
            this.onClose = aVar3;
            this.onToggleAnonymousReport = aVar4;
            this.onToggleEdorAddress = aVar5;
            this.onToggleEmailPhoneAddress = aVar6;
            this.onEditPhonePrefix = lVar;
            this.onEditPhoneNumber = lVar2;
            this.onEditEmail = lVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final l<String, i0> c() {
            return this.onEditEmail;
        }

        public final l<String, i0> d() {
            return this.onEditPhoneNumber;
        }

        public final l<String, i0> e() {
            return this.onEditPhonePrefix;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onNextClick, params.onNextClick) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose) && t.c(this.onToggleAnonymousReport, params.onToggleAnonymousReport) && t.c(this.onToggleEdorAddress, params.onToggleEdorAddress) && t.c(this.onToggleEmailPhoneAddress, params.onToggleEmailPhoneAddress) && t.c(this.onEditPhonePrefix, params.onEditPhonePrefix) && t.c(this.onEditPhoneNumber, params.onEditPhoneNumber) && t.c(this.onEditEmail, params.onEditEmail);
        }

        public final er.a<i0> f() {
            return this.onNextClick;
        }

        public final er.a<i0> g() {
            return this.onToggleAnonymousReport;
        }

        public final er.a<i0> h() {
            return this.onToggleEdorAddress;
        }

        public int hashCode() {
            return (((((((((((((((((this.state.hashCode() * 31) + this.onNextClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onToggleAnonymousReport.hashCode()) * 31) + this.onToggleEdorAddress.hashCode()) * 31) + this.onToggleEmailPhoneAddress.hashCode()) * 31) + this.onEditPhonePrefix.hashCode()) * 31) + this.onEditPhoneNumber.hashCode()) * 31) + this.onEditEmail.hashCode();
        }

        public final er.a<i0> i() {
            return this.onToggleEmailPhoneAddress;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final h33.c getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextClick=" + this.onNextClick + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ", onToggleAnonymousReport=" + this.onToggleAnonymousReport + ", onToggleEdorAddress=" + this.onToggleEdorAddress + ", onToggleEmailPhoneAddress=" + this.onToggleEmailPhoneAddress + ", onEditPhonePrefix=" + this.onEditPhonePrefix + ", onEditPhoneNumber=" + this.onEditPhoneNumber + ", onEditEmail=" + this.onEditEmail + ')';
        }
    }

    public f(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final PhoneAndEmailInputsCustomContentData l(Params params, Form form) {
        Label labelC = this.labelProvider.c(h23.b.K);
        Label labelB = mx.b.b(c0.e(form.getPhoneNumber().g()), "");
        hz.b phoneNumberValidation = form.getPhoneNumberValidation();
        Label labelB2 = mx.b.b(c0.e(form.getPhoneNumber().h()), "");
        hz.b phonePrefixValidation = form.getPhonePrefixValidation();
        l<String, i0> lVarD = params.d();
        return new PhoneAndEmailInputsCustomContentData(new v50.c.PhoneNumber("PhoneNumberInput", null, labelC, 0, null, Form.a.EnumC1845a.PHONE_NUMBER, labelB2, 0, phonePrefixValidation, params.e(), null, labelB, null, phoneNumberValidation, lVarD, null, 38042, null), new v50.c.Text("EmailInput", this.labelProvider.c(h23.b.f80181u), null, mx.b.b(c0.e(form.getEmail()), ""), form.getEmailValidation(), null, null, params.c(), null, false, 0, null, false, null, false, null, null, v50.c.Text.a.EMAIL, null, Form.a.EnumC1845a.EMAIL, 393060, null), form.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, boolean z15) {
        params.g().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, boolean z15) {
        params.h().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, boolean z15) {
        params.i().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(f fVar, Params params, h33.c cVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1847552588, i15, -1, "pl.gov.coi.mobywatel.feature.sanitary.presentation.screens.newreport.methodofcontact.mapper.MethodOfContactScreenMapper.invoke.<anonymous> (MethodOfContactScreenMapper.kt:123)");
            }
            i33.c.b(fVar.l(params, ((h33.c.a) cVar).getForm()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    private final Label x(int stringId) {
        return this.labelProvider.c(stringId);
    }

    private final Label z(int stringId, Object... arg) {
        return this.labelProvider.e(stringId, Arrays.copyOf(arg, arg.length));
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public h33.d.a b(final Params params) {
        i33.a checkBoxes;
        r30.b error;
        final h33.c state = params.getState();
        if ((state instanceof h33.c.b) || (state instanceof h33.c.LoadingDataFromContract)) {
            return new h33.d.a.Initial(new er.a() { // from class: j33.a
                @Override // er.a
                public final Object a() {
                    return f.q();
                }
            });
        }
        if (!(state instanceof h33.c.a)) {
            throw new p();
        }
        h33.c.a aVar = (h33.c.a) state;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), x(h23.b.f80157m), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, new ScrollControllerData(aVar.getForm().i(), false, false, 6, null), 29, null);
        h33.c state2 = params.getState();
        h33.c.a.Dialog dialog = state2 instanceof h33.c.a.Dialog ? (h33.c.a.Dialog) state2 : null;
        cb4.i dialogVMSAdapter = dialog != null ? dialog.getDialogVMSAdapter() : null;
        ButtonData buttonData = new ButtonData("NextButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(h23.b.H), null, 2, null), k30.d.a.f107773a, null, params.f(), 34, null);
        Label labelX = x(h23.b.f80160n);
        Label labelX2 = x(h23.b.f80164o0);
        CheckBoxSingleData checkBoxSingleData = new CheckBoxSingleData(new CheckBoxRowData("AnonymousReportCheckBox", aVar.getForm().getIsAnonymousReportSelected(), new l() { // from class: j33.b
            @Override // er.l
            public final Object b(Object obj) {
                return f.r(params, ((Boolean) obj).booleanValue());
            }
        }, x(h23.b.f80176s0), null, null, null, null, 240, null), null, null, false, null, 30, null);
        String edorAddress = aVar.getForm().getEdorAddress();
        if (edorAddress == null) {
            checkBoxes = new i33.a.PhoneAndEmailOnly(l(params, aVar.getForm()));
        } else {
            boolean showNoMethodSelectedError = aVar.getForm().getShowNoMethodSelectedError();
            if (showNoMethodSelectedError) {
                error = new r30.b.Error("CheckBoxesError", x(h23.b.f80139g));
            } else {
                if (showNoMethodSelectedError) {
                    throw new p();
                }
                error = r30.b.a.f171263a;
            }
            checkBoxes = new i33.a.CheckBoxes(new CheckBoxGroupData(v.q(new CheckBoxRowData("EdorCheckBox", aVar.getForm().getIsEdorAddressEnabled(), new l() { // from class: j33.c
                @Override // er.l
                public final Object b(Object obj) {
                    return f.s(params, ((Boolean) obj).booleanValue());
                }
            }, x(h23.b.f80178t), z(h23.b.f80121a, edorAddress), null, null, null, BERTags.FLAGS, null), new CheckBoxRowData("PhoneAndEmailCheckBox", aVar.getForm().getIsPhoneEmailEnabled(), new l() { // from class: j33.d
                @Override // er.l
                public final Object b(Object obj) {
                    return f.u(params, ((Boolean) obj).booleanValue());
                }
            }, x(h23.b.f80167p0), null, null, null, m.b(1847552588, true, new er.p() { // from class: j33.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return f.v(this.f99336a, params, state, (r) obj, ((Integer) obj2).intValue());
                }
            }), 112, null)), null, error, r30.c.CONTENT_BOX, false, Form.a.C1846b.f80644a, 18, null));
        }
        return new h33.d.a.Content(params.a(), baseScaffoldData, dialogVMSAdapter, buttonData, labelX, labelX2, checkBoxSingleData, checkBoxes);
    }
}
