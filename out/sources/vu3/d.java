package vu3;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import uu3.State;
import wu3.ContactDetailsFormSection;
import x50.NavigationButtonData;
import x50.i;
import xw.PhoneNumber;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lvu3/d;", "Lxw/f;", "Lvu3/d$a;", "Luu3/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Lvu3/d$a;)Luu3/c$a;", "a", "Lmx/c;", "contactdetailsform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, uu3.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: vu3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b,\u0010+R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b(\u0010+R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b\u001e\u0010+R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b\"\u0010+¨\u0006-"}, d2 = {"Lvu3/d$a;", "", "Luu3/b;", "state", "Lkotlin/Function1;", "Lxw/h$c;", "Loq/i0;", "onPrefixInputValueChange", "Lxw/h$b;", "onPhoneNumberInputValueChange", "Lkotlin/Function0;", "onScrolledToPhoneField", "Liy/b0;", "onEmailAddressInputValueChange", "onScrolledToEmailField", "onNextButtonClick", "backAction", "closeAction", "<init>", "(Luu3/b;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luu3/b;", "i", "()Luu3/b;", "b", "Ler/l;", "f", "()Ler/l;", "c", "e", "d", "Ler/a;", "h", "()Ler/a;", "g", "contactdetailsform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<PhoneNumber.c, i0> onPrefixInputValueChange;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<PhoneNumber.b, i0> onPhoneNumberInputValueChange;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToPhoneField;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onEmailAddressInputValueChange;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToEmailField;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super PhoneNumber.c, i0> lVar, l<? super PhoneNumber.b, i0> lVar2, er.a<i0> aVar, l<? super b0, i0> lVar3, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5) {
            this.state = state;
            this.onPrefixInputValueChange = lVar;
            this.onPhoneNumberInputValueChange = lVar2;
            this.onScrolledToPhoneField = aVar;
            this.onEmailAddressInputValueChange = lVar3;
            this.onScrolledToEmailField = aVar2;
            this.onNextButtonClick = aVar3;
            this.backAction = aVar4;
            this.closeAction = aVar5;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        public final l<b0, i0> c() {
            return this.onEmailAddressInputValueChange;
        }

        public final er.a<i0> d() {
            return this.onNextButtonClick;
        }

        public final l<PhoneNumber.b, i0> e() {
            return this.onPhoneNumberInputValueChange;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onPrefixInputValueChange, params.onPrefixInputValueChange) && t.c(this.onPhoneNumberInputValueChange, params.onPhoneNumberInputValueChange) && t.c(this.onScrolledToPhoneField, params.onScrolledToPhoneField) && t.c(this.onEmailAddressInputValueChange, params.onEmailAddressInputValueChange) && t.c(this.onScrolledToEmailField, params.onScrolledToEmailField) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.backAction, params.backAction) && t.c(this.closeAction, params.closeAction);
        }

        public final l<PhoneNumber.c, i0> f() {
            return this.onPrefixInputValueChange;
        }

        public final er.a<i0> g() {
            return this.onScrolledToEmailField;
        }

        public final er.a<i0> h() {
            return this.onScrolledToPhoneField;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onPrefixInputValueChange.hashCode()) * 31) + this.onPhoneNumberInputValueChange.hashCode()) * 31) + this.onScrolledToPhoneField.hashCode()) * 31) + this.onEmailAddressInputValueChange.hashCode()) * 31) + this.onScrolledToEmailField.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.backAction.hashCode()) * 31) + this.closeAction.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onPrefixInputValueChange=" + this.onPrefixInputValueChange + ", onPhoneNumberInputValueChange=" + this.onPhoneNumberInputValueChange + ", onScrolledToPhoneField=" + this.onScrolledToPhoneField + ", onEmailAddressInputValueChange=" + this.onEmailAddressInputValueChange + ", onScrolledToEmailField=" + this.onScrolledToEmailField + ", onNextButtonClick=" + this.onNextButtonClick + ", backAction=" + this.backAction + ", closeAction=" + this.closeAction + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, String str) {
        params.f().b(PhoneNumber.c.b(PhoneNumber.c.c(c0.g(str))));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, String str) {
        params.e().b(PhoneNumber.b.b(PhoneNumber.b.c(c0.g(str))));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, String str) {
        params.c().b(c0.g(str));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public uu3.c.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), params.getState().getTopMenuTitle(), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        Label labelC = this.labelProvider.c(qu3.a.f169020h);
        Label labelC2 = this.labelProvider.c(qu3.a.f169019g);
        Label labelC3 = this.labelProvider.c(qu3.a.f169015c);
        hz.b phoneNumberValidationState = params.getState().getPhoneNumberValidationState();
        hz.b prefixValidationState = params.getState().getPrefixValidationState();
        return new uu3.c.Data(baseScaffoldData, new ContactDetailsFormSection(labelC, labelC2, new v50.c.PhoneNumber(null, null, labelC3, 0, null, null, mx.b.b(c0.e(params.getState().getData().getPhoneNumber().h()), "countryCodeValue"), 0, prefixValidationState, new l() { // from class: vu3.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.i(params, (String) obj);
            }
        }, null, mx.b.b(c0.e(params.getState().getData().getPhoneNumber().g()), "phoneNumberValue"), null, phoneNumberValidationState, new l() { // from class: vu3.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.l(params, (String) obj);
            }
        }, null, 38075, null), params.getState().getScrollToPhoneField(), params.h(), new v50.c.Text(null, this.labelProvider.c(qu3.a.f169013a), null, mx.b.b(c0.e(params.getState().getData().getEmailAddress()), "emailAddressValue"), params.getState().getEmailValidationState(), null, null, new l() { // from class: vu3.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.m(params, (String) obj);
            }
        }, null, false, 0, null, false, null, true, null, null, v50.c.Text.a.EMAIL, null, null, 900965, null), params.getState().getScrollToEmailField(), params.g()), new c30.b.c(null, null, this.labelProvider.c(qu3.a.f169018f), this.labelProvider.c(qu3.a.f169017e), null, null, null, 115, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(qu3.a.f169014b), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null));
    }
}
