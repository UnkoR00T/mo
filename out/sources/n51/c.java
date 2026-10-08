package n51;

import d60.ScrollControllerData;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.b0;
import iy.c0;
import k30.d;
import l51.State;
import mx.Label;
import o51.ReceiveDocumentSpecifiedAddressFields;
import oq.i0;
import p071kotlin.Metadata;
import st3.g;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ln51/c;", "Lxw/f;", "Ln51/c$a;", "Ll51/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Liy/b0;", "Lmx/a;", "l", "(Liy/b0;)Lmx/a;", "params", "f", "(Ln51/c$a;)Ll51/c$a;", "a", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, l51.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: n51.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\u001c\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u0018\u0010\"¨\u0006#"}, d2 = {"Ln51/c$a;", "", "Ll51/b;", "state", "Lkotlin/Function1;", "Lo51/a;", "Loq/i0;", "onEditFieldsData", "Lkotlin/Function0;", "onNextButtonClick", "onClose", "onBack", "<init>", "(Ll51/b;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll51/b;", "e", "()Ll51/b;", "b", "Ler/l;", "c", "()Ler/l;", "Ler/a;", "d", "()Ler/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<ReceiveDocumentSpecifiedAddressFields, i0> onEditFieldsData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super ReceiveDocumentSpecifiedAddressFields, i0> lVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = state;
            this.onEditFieldsData = lVar;
            this.onNextButtonClick = aVar;
            this.onClose = aVar2;
            this.onBack = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final l<ReceiveDocumentSpecifiedAddressFields, i0> c() {
            return this.onEditFieldsData;
        }

        public final er.a<i0> d() {
            return this.onNextButtonClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onEditFieldsData, params.onEditFieldsData) && t.c(this.onNextButtonClick, params.onNextButtonClick) && t.c(this.onClose, params.onClose) && t.c(this.onBack, params.onBack);
        }

        public int hashCode() {
            return (((((((this.state.hashCode() * 31) + this.onEditFieldsData.hashCode()) * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onClose.hashCode()) * 31) + this.onBack.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onEditFieldsData=" + this.onEditFieldsData + ", onNextButtonClick=" + this.onNextButtonClick + ", onClose=" + this.onClose + ", onBack=" + this.onBack + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput textInput, String str) {
        params.c().b(ReceiveDocumentSpecifiedAddressFields.b(params.getState().getFields(), ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput.c(textInput, null, c0.g(str), null, 5, null), null, 2, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput textInput, String str) {
        params.c().b(ReceiveDocumentSpecifiedAddressFields.b(params.getState().getFields(), null, ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput.c(textInput, null, c0.g(str), null, 5, null), 1, null));
        return i0.f148189a;
    }

    private final Label l(b0 b0Var) {
        String strE;
        if (b0Var == null || (strE = c0.e(b0Var)) == null) {
            strE = "";
        }
        return new Label(strE, "");
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public l51.c.Data b(final Params params) {
        mx.c cVar = this.labelProvider;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(j31.a.J2), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, new ScrollControllerData(params.getState().e(), false, false, 6, null), 29, null);
        Label labelC = this.labelProvider.c(j31.a.Y0);
        g addressFormVMS = params.getState().getAddressFormVMS();
        final ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput nameFieldData = params.getState().getFields().getNameFieldData();
        v50.c.Text text = new v50.c.Text("NameInput", this.labelProvider.c(j31.a.f99221u2), null, l(nameFieldData.getValue()), nameFieldData.getValidationState(), null, null, new l() { // from class: n51.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.h(params, nameFieldData, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, nameFieldData.getField(), 524132, null);
        final ReceiveDocumentSpecifiedAddressFields.InterfaceC3524a.TextInput surnameFieldData = params.getState().getFields().getSurnameFieldData();
        return new l51.c.Data(baseScaffoldData, labelC, text, new v50.c.Text("SurnameInput", this.labelProvider.c(j31.a.f99231w2), null, l(surnameFieldData.getValue()), surnameFieldData.getValidationState(), null, null, new l() { // from class: n51.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.i(params, surnameFieldData, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, null, null, surnameFieldData.getField(), 524132, null), addressFormVMS, new ButtonData("NextButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(cVar.c(j31.a.f99235x2), null, 2, null), d.a.f107773a, null, params.d(), 34, null), params.a());
    }
}
