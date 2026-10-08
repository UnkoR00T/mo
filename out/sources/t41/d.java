package t41;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import u41.ContactInfoWriteFieldsData;
import x50.NavigationButtonData;
import x50.i;
import xw.PhoneNumber;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lt41/d;", "Lxw/f;", "Lt41/d$a;", "Lr41/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Liy/b0;", "Lmx/a;", "q", "(Liy/b0;)Lmx/a;", "params", "h", "(Lt41/d$a;)Lr41/c$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, r41.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: t41.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u001d\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0019\u0010#¨\u0006%"}, d2 = {"Lt41/d$a;", "", "Lr41/b;", "state", "Lkotlin/Function1;", "Lu41/a;", "Loq/i0;", "onEditEmailOrPhoneFieldsData", "Lkotlin/Function0;", "onPointerTouch", "onNextButtonClick", "onClose", "onBack", "<init>", "(Lr41/b;Ler/l;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr41/b;", "f", "()Lr41/b;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "e", "()Ler/a;", "d", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final r41.b state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ContactInfoWriteFieldsData, i0> onEditEmailOrPhoneFieldsData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPointerTouch;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(r41.b bVar, l<? super ContactInfoWriteFieldsData, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = bVar;
            this.onEditEmailOrPhoneFieldsData = lVar;
            this.onPointerTouch = aVar;
            this.onNextButtonClick = aVar2;
            this.onClose = aVar3;
            this.onBack = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final l<ContactInfoWriteFieldsData, i0> c() {
            return this.onEditEmailOrPhoneFieldsData;
        }

        public final er.a<i0> d() {
            return this.onNextButtonClick;
        }

        public final er.a<i0> e() {
            return this.onPointerTouch;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onEditEmailOrPhoneFieldsData, params.onEditEmailOrPhoneFieldsData) && t.c(this.onPointerTouch, params.onPointerTouch) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onClose, params.onClose) && t.c(this.onBack, params.onBack);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final r41.b getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onEditEmailOrPhoneFieldsData.hashCode()) * 31) + this.onPointerTouch.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onEditEmailOrPhoneFieldsData=" + this.onEditEmailOrPhoneFieldsData + ", onPointerTouch=" + this.onPointerTouch + ", onNextButtonClick=" + this.onNextButtonClick + ", onClose=" + this.onClose + ", onBack=" + this.onBack + ')';
        }
    }

    public d(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, r41.b bVar, ContactInfoWriteFieldsData.InterfaceC5084a.TextInput textInput, String str) {
        params.c().b(ContactInfoWriteFieldsData.b(bVar.getFieldsData(), textInput.a(hz.b.C2039b.f86846c, c0.g(str)), null, 2, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, r41.b bVar, ContactInfoWriteFieldsData.InterfaceC5084a.Phone phone, String str) {
        params.c().b(ContactInfoWriteFieldsData.b(bVar.getFieldsData(), null, ContactInfoWriteFieldsData.InterfaceC5084a.Phone.b(phone, hz.b.C2039b.f86846c, null, PhoneNumber.e(phone.getPhoneNumber(), PhoneNumber.c.c(c0.g(str)), null, 2, null), 2, null), 1, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, r41.b bVar, ContactInfoWriteFieldsData.InterfaceC5084a.Phone phone, String str) {
        params.c().b(ContactInfoWriteFieldsData.b(bVar.getFieldsData(), null, ContactInfoWriteFieldsData.InterfaceC5084a.Phone.b(phone, null, hz.b.C2039b.f86846c, PhoneNumber.e(phone.getPhoneNumber(), null, PhoneNumber.b.c(c0.g(str)), 1, null), 1, null), 1, null));
        return i0.f148189a;
    }

    private final Label q(b0 b0Var) {
        String strE;
        if (b0Var == null || (strE = c0.e(b0Var)) == null) {
            strE = "";
        }
        return new Label(strE, "");
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public r41.c.Data b(final Params params) {
        mx.c cVar = this.labelProvider;
        final r41.b state = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(j31.a.f99181m2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        ButtonData buttonData = new ButtonData("NextButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(j31.a.f99235x2), null, 2, null), k30.d.a.f107773a, null, params.d(), 34, null);
        Label labelC = this.labelProvider.c(j31.a.f99119a0);
        Label labelC2 = this.labelProvider.c(j31.a.Z);
        Label labelC3 = state.getAddress() != null ? this.labelProvider.c(j31.a.Y) : null;
        final ContactInfoWriteFieldsData.InterfaceC5084a.TextInput emailFieldData = state.getFieldsData().getEmailFieldData();
        v50.c.Text text = new v50.c.Text("EmailInput", this.labelProvider.c(j31.a.f99201q2), null, q(emailFieldData.getValue()), emailFieldData.getValidationState(), null, null, new l() { // from class: t41.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.i(params, state, emailFieldData, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, v50.c.Text.a.EMAIL, null, null, 917348, null);
        final ContactInfoWriteFieldsData.InterfaceC5084a.Phone phoneFieldData = state.getFieldsData().getPhoneFieldData();
        v50.c.PhoneNumber phoneNumber = new v50.c.PhoneNumber("PhoneInput", null, this.labelProvider.c(j31.a.H2), 0, null, null, q(phoneFieldData.getPhoneNumber().h()), 0, phoneFieldData.getPhonePrefixValidationState(), new l() { // from class: t41.b
            @Override // er.l
            public final Object b(Object obj) {
                return d.l(params, state, phoneFieldData, (String) obj);
            }
        }, null, q(phoneFieldData.getPhoneNumber().g()), null, phoneFieldData.getPhoneNumberValidationState(), new l() { // from class: t41.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.m(params, state, phoneFieldData, (String) obj);
            }
        }, null, 38074, null);
        b0 address = state.getAddress();
        return new r41.c.Data(baseScaffoldData, labelC, labelC2, labelC3, text, phoneNumber, address != null ? new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(this.labelProvider.c(j31.a.f99196p2), null, null, 0, 0, null, 62, null)), new SingleCardLabel(mx.b.b(c0.e(address), "edorAddress"), null, null, 0, 0, null, 62, null), 1, null), null, null, null, 3839, null) : null, buttonData, params.a(), params.e());
    }
}
