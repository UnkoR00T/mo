package xf3;

import androidx.compose.ui.graphics.Color;
import d60.ScrollControllerData;
import er.l;
import er.p;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import v4.a0;
import vf3.FormData;
import x50.NavigationButtonData;
import yf3.ContactDetailsFields;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lxf3/i;", "Lxw/f;", "Lxf3/i$a;", "Lvf3/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "stringId", "Lmx/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(I)Lmx/a;", "params", "r", "(Lxf3/i$a;)Lvf3/d$a;", "a", "Lmx/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements xw.f<Params, vf3.d.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: xf3.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b*\u0010-R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b1\u0010-R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b(\u0010-R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b2\u0010-R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b$\u0010-R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b0\u0010-R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b \u0010'R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b.\u0010'¨\u00063"}, d2 = {"Lxf3/i$a;", "", "Lvf3/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onGoToNextStep", "onPointerTouch", "Lkotlin/Function1;", "Liy/b0;", "onPhoneNumberChanged", "onPhonePrefixChanged", "onEmailChanged", "onPostCodeChanged", "onCityChanged", "onStreetChanged", "onBuildingNumberChanged", "onFlatNumberChanged", "onBackAction", "onExitAction", "<init>", "(Lvf3/c;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvf3/c;", "m", "()Lvf3/c;", "b", "Ler/a;", "g", "()Ler/a;", "c", "j", "d", "Ler/l;", "h", "()Ler/l;", "e", "i", "f", "k", "l", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final vf3.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToNextStep;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPointerTouch;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPhoneNumberChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPhonePrefixChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onEmailChanged;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onPostCodeChanged;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onCityChanged;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onStreetChanged;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onBuildingNumberChanged;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<b0, i0> onFlatNumberChanged;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onExitAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(vf3.c cVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super b0, i0> lVar, l<? super b0, i0> lVar2, l<? super b0, i0> lVar3, l<? super b0, i0> lVar4, l<? super b0, i0> lVar5, l<? super b0, i0> lVar6, l<? super b0, i0> lVar7, l<? super b0, i0> lVar8, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.state = cVar;
            this.onGoToNextStep = aVar;
            this.onPointerTouch = aVar2;
            this.onPhoneNumberChanged = lVar;
            this.onPhonePrefixChanged = lVar2;
            this.onEmailChanged = lVar3;
            this.onPostCodeChanged = lVar4;
            this.onCityChanged = lVar5;
            this.onStreetChanged = lVar6;
            this.onBuildingNumberChanged = lVar7;
            this.onFlatNumberChanged = lVar8;
            this.onBackAction = aVar3;
            this.onExitAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
        }

        public final l<b0, i0> b() {
            return this.onBuildingNumberChanged;
        }

        public final l<b0, i0> c() {
            return this.onCityChanged;
        }

        public final l<b0, i0> d() {
            return this.onEmailChanged;
        }

        public final er.a<i0> e() {
            return this.onExitAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onGoToNextStep, params.onGoToNextStep) && t.c(this.onPointerTouch, params.onPointerTouch) && t.c(this.onPhoneNumberChanged, params.onPhoneNumberChanged) && t.c(this.onPhonePrefixChanged, params.onPhonePrefixChanged) && t.c(this.onEmailChanged, params.onEmailChanged) && t.c(this.onPostCodeChanged, params.onPostCodeChanged) && t.c(this.onCityChanged, params.onCityChanged) && t.c(this.onStreetChanged, params.onStreetChanged) && t.c(this.onBuildingNumberChanged, params.onBuildingNumberChanged) && t.c(this.onFlatNumberChanged, params.onFlatNumberChanged) && t.c(this.onBackAction, params.onBackAction) && t.c(this.onExitAction, params.onExitAction);
        }

        public final l<b0, i0> f() {
            return this.onFlatNumberChanged;
        }

        public final er.a<i0> g() {
            return this.onGoToNextStep;
        }

        public final l<b0, i0> h() {
            return this.onPhoneNumberChanged;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.state.hashCode() * 31) + this.onGoToNextStep.hashCode()) * 31) + this.onPointerTouch.hashCode()) * 31) + this.onPhoneNumberChanged.hashCode()) * 31) + this.onPhonePrefixChanged.hashCode()) * 31) + this.onEmailChanged.hashCode()) * 31) + this.onPostCodeChanged.hashCode()) * 31) + this.onCityChanged.hashCode()) * 31) + this.onStreetChanged.hashCode()) * 31) + this.onBuildingNumberChanged.hashCode()) * 31) + this.onFlatNumberChanged.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.onExitAction.hashCode();
        }

        public final l<b0, i0> i() {
            return this.onPhonePrefixChanged;
        }

        public final er.a<i0> j() {
            return this.onPointerTouch;
        }

        public final l<b0, i0> k() {
            return this.onPostCodeChanged;
        }

        public final l<b0, i0> l() {
            return this.onStreetChanged;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final vf3.c getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onGoToNextStep=" + this.onGoToNextStep + ", onPointerTouch=" + this.onPointerTouch + ", onPhoneNumberChanged=" + this.onPhoneNumberChanged + ", onPhonePrefixChanged=" + this.onPhonePrefixChanged + ", onEmailChanged=" + this.onEmailChanged + ", onPostCodeChanged=" + this.onPostCodeChanged + ", onCityChanged=" + this.onCityChanged + ", onStreetChanged=" + this.onStreetChanged + ", onBuildingNumberChanged=" + this.onBuildingNumberChanged + ", onFlatNumberChanged=" + this.onFlatNumberChanged + ", onBackAction=" + this.onBackAction + ", onExitAction=" + this.onExitAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f218443a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(248997750);
            if (p076m2.t.k()) {
                p076m2.t.o(248997750, i15, -1, "pl.gov.coi.mobywatel.feature.vehiclecollision.presentation.screens.newcolission.contactdetails.mapper.ContactDetailsScreenMapper.invoke.<anonymous>.<anonymous> (ContactDetailsScreenMapper.kt:65)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public i(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params, String str) {
        params.l().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Params params, String str) {
        params.b().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(Params params, String str) {
        params.f().b(c0.g(str));
        return i0.f148189a;
    }

    private final Label H(int stringId) {
        return this.labelProvider.c(stringId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, String str) {
        params.i().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, String str) {
        params.h().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, String str) {
        params.d().b(c0.g(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params, String str) {
        params.k().b(c0.g(t04.a.b(str, 0, 1, null)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, String str) {
        params.c().b(c0.g(str));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public vf3.d.a b(final Params params) {
        vf3.c state = params.getState();
        if (t.c(state, vf3.c.a.f206481a)) {
            return vf3.d.a.C5402a.f206490a;
        }
        if (!(state instanceof vf3.c.b)) {
            throw new oq.p();
        }
        FormData formData = ((vf3.c.b) state).getFormData();
        Label labelC = this.labelProvider.c(md3.b.f125847v3);
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), labelC, null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, b.f218443a, null, params.e(), 4, null)), null, 20, null), null, null, null, new ScrollControllerData(((vf3.c.b) params.getState()).getFormData().d(), false, false, 6, null), 29, null);
        Label labelH = H(md3.b.Y3);
        Label labelH2 = H(md3.b.X3);
        c30.b.c cVar = new c30.b.c(null, null, null, H(md3.b.S3), null, null, null, 119, null);
        ContactDetailsFields.InterfaceC6083a.Phone phoneField = formData.getContactDetailsFields().getPhoneField();
        Label labelH3 = H(md3.b.O);
        Label labelB = mx.b.b(c0.e(phoneField.getPhoneNumber().h()), "prefix");
        Label labelB2 = mx.b.b(c0.e(phoneField.getPhoneNumber().g()), "phoneNumber");
        hz.b phoneNumberValidation = formData.getContactDetailsFields().getPhoneField().getPhoneNumberValidation();
        v50.c.PhoneNumber phoneNumber = new v50.c.PhoneNumber(null, null, labelH3, 0, null, phoneField.getField(), labelB, 0, formData.getContactDetailsFields().getPhoneField().getPhonePrefixValidation(), new l() { // from class: xf3.a
            @Override // er.l
            public final Object b(Object obj) {
                return i.s(params, (String) obj);
            }
        }, null, labelB2, null, phoneNumberValidation, new l() { // from class: xf3.b
            @Override // er.l
            public final Object b(Object obj) {
                return i.u(params, (String) obj);
            }
        }, null, 38043, null);
        ContactDetailsFields.InterfaceC6083a.Input emailField = formData.getContactDetailsFields().getEmailField();
        Label labelH4 = H(md3.b.f125827t);
        hz.b validationState = emailField.getValidationState();
        v50.c.Text text = new v50.c.Text(null, labelH4, null, mx.b.b(c0.e(emailField.getValue()), "email"), validationState, null, null, new l() { // from class: xf3.c
            @Override // er.l
            public final Object b(Object obj) {
                return i.v(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, v50.c.Text.a.EMAIL, null, emailField.getField(), 393061, null);
        Label labelH5 = H(md3.b.T3);
        ContactDetailsFields.InterfaceC6083a.Input postCodeField = formData.getContactDetailsFields().getPostCodeField();
        Label labelH6 = H(md3.b.Z3);
        Label labelB3 = mx.b.b(t04.a.e(c0.e(postCodeField.getValue()), null, 1, null), "postCode");
        hz.b validationState2 = postCodeField.getValidationState();
        w50.a aVar = w50.a.POST_CODE;
        v50.c.Masked masked = new v50.c.Masked(null, labelH6, labelB3, null, validationState2, null, null, new l() { // from class: xf3.d
            @Override // er.l
            public final Object b(Object obj) {
                return i.x(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, a0.INSTANCE.d(), postCodeField.getField(), aVar, 130921, null);
        ContactDetailsFields.InterfaceC6083a.Input cityField = formData.getContactDetailsFields().getCityField();
        v50.c.Text text2 = new v50.c.Text(null, H(md3.b.W3), null, mx.b.b(c0.e(cityField.getValue()), "city"), cityField.getValidationState(), null, null, new l() { // from class: xf3.e
            @Override // er.l
            public final Object b(Object obj) {
                return i.z(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, cityField.getField(), 524133, null);
        ContactDetailsFields.InterfaceC6083a.Input streetField = formData.getContactDetailsFields().getStreetField();
        v50.c.Text text3 = new v50.c.Text(null, H(md3.b.f125680a4), null, mx.b.b(c0.e(streetField.getValue()), "street"), streetField.getValidationState(), null, null, new l() { // from class: xf3.f
            @Override // er.l
            public final Object b(Object obj) {
                return i.E(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, streetField.getField(), 524133, null);
        ContactDetailsFields.InterfaceC6083a.Input buildingNumberField = formData.getContactDetailsFields().getBuildingNumberField();
        v50.c.Text text4 = new v50.c.Text(null, H(md3.b.V3), null, mx.b.b(c0.e(buildingNumberField.getValue()), "buildingNumber"), buildingNumberField.getValidationState(), null, null, new l() { // from class: xf3.g
            @Override // er.l
            public final Object b(Object obj) {
                return i.F(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, buildingNumberField.getField(), 524133, null);
        ContactDetailsFields.InterfaceC6083a.Input flatNumberField = formData.getContactDetailsFields().getFlatNumberField();
        return new vf3.d.a.Initialized(baseScaffoldData, cVar, labelH, labelH2, phoneNumber, text, labelH5, masked, text2, text3, text4, new v50.c.Text(null, H(md3.b.U3), null, mx.b.b(c0.e(flatNumberField.getValue()), "flatNumber"), flatNumberField.getValidationState(), null, null, new l() { // from class: xf3.h
            @Override // er.l
            public final Object b(Object obj) {
                return i.G(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, flatNumberField.getField(), 524133, null), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(H(md3.b.f125812r0), null, 2, null), k30.d.a.f107773a, null, params.g(), 35, null), params.j());
    }
}
