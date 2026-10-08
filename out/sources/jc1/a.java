package jc1;

import fr.t;
import fu.r;
import h30.ButtonData;
import hc1.CheckBox;
import hc1.TextInput;
import hc1.l;
import hc1.m;
import hc1.t0;
import k30.d;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import r30.CheckBoxRowData;
import r30.b;
import w30.CheckBoxSingleData;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JC\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ljc1/a;", "Lxw/f;", "Ljc1/a$a;", "Lhc1/m$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lhc1/t0;", "type", "", "isChecked", "isEnabled", "Lkotlin/Function1;", "Loq/i0;", "onCheckedChange", "Lmx/a;", "agreementLabel", "Lhc1/n;", "c", "(Lhc1/t0;ZZLer/l;Lmx/a;)Lhc1/n;", "params", "e", "(Ljc1/a$a;)Lhc1/m$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, m.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: jc1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BË\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b'\u0010$R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b%\u0010$R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b)\u0010$R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b*\u0010$R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b+\u0010$R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b!\u0010-R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b\u001d\u0010-¨\u0006."}, d2 = {"Ljc1/a$a;", "", "Lhc1/l;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onEMailChanged", "onWebsiteChanged", "onPhoneNumberChanged", "onCountryCodeChanged", "", "onCeidgConsentChanged", "onEmailConsentChanged", "onPhoneConsentChanged", "onWebsiteConsentChanged", "Lkotlin/Function0;", "nextAction", "backAction", "<init>", "(Lhc1/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhc1/l;", "k", "()Lhc1/l;", "b", "Ler/l;", "e", "()Ler/l;", "c", "i", "d", "h", "f", "g", "j", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onEMailChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onWebsiteChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onPhoneNumberChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onCountryCodeChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onCeidgConsentChanged;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onEmailConsentChanged;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onPhoneConsentChanged;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onWebsiteConsentChanged;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(l lVar, er.l<? super String, i0> lVar2, er.l<? super String, i0> lVar3, er.l<? super String, i0> lVar4, er.l<? super String, i0> lVar5, er.l<? super Boolean, i0> lVar6, er.l<? super Boolean, i0> lVar7, er.l<? super Boolean, i0> lVar8, er.l<? super Boolean, i0> lVar9, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = lVar;
            this.onEMailChanged = lVar2;
            this.onWebsiteChanged = lVar3;
            this.onPhoneNumberChanged = lVar4;
            this.onCountryCodeChanged = lVar5;
            this.onCeidgConsentChanged = lVar6;
            this.onEmailConsentChanged = lVar7;
            this.onPhoneConsentChanged = lVar8;
            this.onWebsiteConsentChanged = lVar9;
            this.nextAction = aVar;
            this.backAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.nextAction;
        }

        public final er.l<Boolean, i0> c() {
            return this.onCeidgConsentChanged;
        }

        public final er.l<String, i0> d() {
            return this.onCountryCodeChanged;
        }

        public final er.l<String, i0> e() {
            return this.onEMailChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onEMailChanged, params.onEMailChanged) && t.c(this.onWebsiteChanged, params.onWebsiteChanged) && t.c(this.onPhoneNumberChanged, params.onPhoneNumberChanged) && t.c(this.onCountryCodeChanged, params.onCountryCodeChanged) && t.c(this.onCeidgConsentChanged, params.onCeidgConsentChanged) && t.c(this.onEmailConsentChanged, params.onEmailConsentChanged) && t.c(this.onPhoneConsentChanged, params.onPhoneConsentChanged) && t.c(this.onWebsiteConsentChanged, params.onWebsiteConsentChanged) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction);
        }

        public final er.l<Boolean, i0> f() {
            return this.onEmailConsentChanged;
        }

        public final er.l<Boolean, i0> g() {
            return this.onPhoneConsentChanged;
        }

        public final er.l<String, i0> h() {
            return this.onPhoneNumberChanged;
        }

        public int hashCode() {
            return (((((((((((((((((((this.state.hashCode() * 31) + this.onEMailChanged.hashCode()) * 31) + this.onWebsiteChanged.hashCode()) * 31) + this.onPhoneNumberChanged.hashCode()) * 31) + this.onCountryCodeChanged.hashCode()) * 31) + this.onCeidgConsentChanged.hashCode()) * 31) + this.onEmailConsentChanged.hashCode()) * 31) + this.onPhoneConsentChanged.hashCode()) * 31) + this.onWebsiteConsentChanged.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode();
        }

        public final er.l<String, i0> i() {
            return this.onWebsiteChanged;
        }

        public final er.l<Boolean, i0> j() {
            return this.onWebsiteConsentChanged;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final l getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onEMailChanged=" + this.onEMailChanged + ", onWebsiteChanged=" + this.onWebsiteChanged + ", onPhoneNumberChanged=" + this.onPhoneNumberChanged + ", onCountryCodeChanged=" + this.onCountryCodeChanged + ", onCeidgConsentChanged=" + this.onCeidgConsentChanged + ", onEmailConsentChanged=" + this.onEmailConsentChanged + ", onPhoneConsentChanged=" + this.onPhoneConsentChanged + ", onWebsiteConsentChanged=" + this.onWebsiteConsentChanged + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final CheckBox c(t0 type, boolean isChecked, boolean isEnabled, er.l<? super Boolean, i0> onCheckedChange, Label agreementLabel) {
        return new CheckBox(type, new CheckBoxSingleData(new CheckBoxRowData(null, isChecked, onCheckedChange, agreementLabel, null, null, null, null, 241, null), b.a.f171263a, null, isEnabled, null, 20, null));
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public m.a b(Params params) {
        l state = params.getState();
        if (!(state instanceof l.FormDisplayed)) {
            throw new p();
        }
        Label labelC = this.labelProvider.c(ha1.a.f82396f1);
        Label labelC2 = this.labelProvider.c(ha1.a.f82388e1);
        er.a<i0> aVarA = params.a();
        t0 t0Var = t0.EMAIL;
        Label labelC3 = this.labelProvider.c(ha1.a.f82486r);
        v4.t.Companion companion = v4.t.INSTANCE;
        l.FormDisplayed formDisplayed = (l.FormDisplayed) state;
        TextInput textInput = new TextInput(t0Var, new v50.c.Text(null, labelC3, null, mx.b.b(formDisplayed.e().d(), "email"), formDisplayed.e().getValidationState(), null, null, params.e(), null, false, companion.d(), null, false, null, false, null, null, v50.c.Text.a.EMAIL, null, null, 916325, null));
        CheckBox checkBoxC = formDisplayed.getIsCompanyNewContactEnabled() ? c(t0.EMAIL_CONSENT, formDisplayed.f().d().booleanValue(), !r.t0(formDisplayed.e().d()), params.f(), this.labelProvider.c(ha1.a.f82364b1)) : null;
        t0 t0Var2 = t0.PHONE_NUMBER;
        int iD = companion.d();
        return new m.a.FormDisplayed(labelC, labelC2, new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), d.a.f107773a, null, params.b(), 35, null), textInput, checkBoxC, new TextInput(t0Var2, new v50.c.PhoneNumber(null, null, this.labelProvider.c(ha1.a.V), iD, null, null, mx.b.b(formDisplayed.d().d(), "countryCode"), 0, formDisplayed.d().getValidationState(), params.d(), null, mx.b.b(formDisplayed.g().d(), "phoneNumber"), null, formDisplayed.g().getValidationState(), params.h(), null, 38067, null)), formDisplayed.getIsCompanyNewContactEnabled() ? c(t0.PHONE_NUMBER_CONSENT, formDisplayed.h().d().booleanValue(), !r.t0(formDisplayed.g().d()), params.g(), this.labelProvider.c(ha1.a.f82372c1)) : null, new TextInput(t0.WEBSITE, new v50.c.Text(null, this.labelProvider.c(ha1.a.f82404g1), null, mx.b.b(formDisplayed.i().d(), "website"), formDisplayed.i().getValidationState(), null, null, params.i(), null, false, companion.b(), null, false, null, false, null, null, null, null, null, 1047397, null)), formDisplayed.getIsCompanyNewContactEnabled() ? c(t0.WEBSITE_CONSENT, formDisplayed.j().d().booleanValue(), !r.t0(formDisplayed.i().d()), params.j(), this.labelProvider.c(ha1.a.f82380d1)) : null, !formDisplayed.getIsCompanyNewContactEnabled() ? c(t0.CEIGD_CONSENT, formDisplayed.c().d().booleanValue(), true, params.c(), this.labelProvider.c(ha1.a.f82356a1)) : null, aVarA);
    }
}
