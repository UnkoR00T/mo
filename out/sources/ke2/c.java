package ke2;

import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import iy.c0;
import je2.d;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import x50.NavigationButtonData;
import x50.i;
import xw.PhoneNumber;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lke2/c;", "Lxw/f;", "Lke2/c$a;", "Lje2/d$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "", "stringId", "Lmx/a;", "l", "(I)Lmx/a;", "params", "f", "(Lke2/c$a;)Lje2/d$a;", "a", "Lmx/c;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<Params, d.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ke2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001a\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b\u001e\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010$\u001a\u0004\b\"\u0010%¨\u0006&"}, d2 = {"Lke2/c$a;", "", "Lje2/c;", "state", "Lkotlin/Function1;", "Lxw/h$c;", "Loq/i0;", "onPrefixInputValueChange", "Lxw/h$b;", "onPhoneNumberInputValueChange", "Lkotlin/Function0;", "onBackClick", "onCloseClick", "onNextClick", "<init>", "(Lje2/c;Ler/l;Ler/l;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lje2/c;", "f", "()Lje2/c;", "b", "Ler/l;", "e", "()Ler/l;", "c", "d", "Ler/a;", "()Ler/a;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final je2.c state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<PhoneNumber.c, i0> onPrefixInputValueChange;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<PhoneNumber.b, i0> onPhoneNumberInputValueChange;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextClick;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(je2.c cVar, l<? super PhoneNumber.c, i0> lVar, l<? super PhoneNumber.b, i0> lVar2, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = cVar;
            this.onPrefixInputValueChange = lVar;
            this.onPhoneNumberInputValueChange = lVar2;
            this.onBackClick = aVar;
            this.onCloseClick = aVar2;
            this.onNextClick = aVar3;
        }

        public final er.a<i0> a() {
            return this.onBackClick;
        }

        public final er.a<i0> b() {
            return this.onCloseClick;
        }

        public final er.a<i0> c() {
            return this.onNextClick;
        }

        public final l<PhoneNumber.b, i0> d() {
            return this.onPhoneNumberInputValueChange;
        }

        public final l<PhoneNumber.c, i0> e() {
            return this.onPrefixInputValueChange;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onPrefixInputValueChange, params.onPrefixInputValueChange) && t.c(this.onPhoneNumberInputValueChange, params.onPhoneNumberInputValueChange) && t.c(this.onBackClick, params.onBackClick) && t.c(this.onCloseClick, params.onCloseClick) && t.c(this.onNextClick, params.onNextClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final je2.c getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((this.state.hashCode() * 31) + this.onPrefixInputValueChange.hashCode()) * 31) + this.onPhoneNumberInputValueChange.hashCode()) * 31) + this.onBackClick.hashCode()) * 31) + this.onCloseClick.hashCode()) * 31) + this.onNextClick.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onPrefixInputValueChange=" + this.onPrefixInputValueChange + ", onPhoneNumberInputValueChange=" + this.onPhoneNumberInputValueChange + ", onBackClick=" + this.onBackClick + ", onCloseClick=" + this.onCloseClick + ", onNextClick=" + this.onNextClick + ')';
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, String str) {
        params.e().b(PhoneNumber.c.b(PhoneNumber.c.c(c0.g(str))));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, String str) {
        params.d().b(PhoneNumber.b.b(PhoneNumber.b.c(c0.g(str))));
        return i0.f148189a;
    }

    private final Label l(int stringId) {
        return this.labelProvider.c(stringId);
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d.Data b(final Params params) {
        er.a<i0> aVarA = params.a();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), l(ud2.a.f197739i), null, new x50.a.Icon(new x50.a.MenuButtonData(x50.a.MenuButtonData.b.f216847c, null, null, params.b(), 6, null)), null, 20, null), null, null, null, null, 61, null);
        er.a<i0> aVarC = params.c();
        cb4.i dialogVMSAdapter = null;
        ButtonData buttonData = new ButtonData("goNextButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(l(ud2.a.f197771y), null, 2, null), k30.d.a.f107773a, null, aVarC, 34, null);
        je2.c state = params.getState();
        if (!(state instanceof je2.c.ContactDetails)) {
            if (!(state instanceof je2.c.Dialog)) {
                throw new p();
            }
            dialogVMSAdapter = ((je2.c.Dialog) params.getState()).getDialogVMSAdapter();
        }
        cb4.i iVar = dialogVMSAdapter;
        Label labelL = l(ud2.a.f197741j);
        Label labelL2 = l(ud2.a.f197773z);
        hz.b phoneNumberValidationState = params.getState().getInitializedStateData().getPhoneNumberValidationState();
        hz.b prefixValidationState = params.getState().getInitializedStateData().getPrefixValidationState();
        return new d.Data(baseScaffoldData, labelL, new v50.c.PhoneNumber("phoneNumberInput", null, labelL2, 0, null, null, mx.b.b(c0.e(params.getState().getInitializedStateData().getPhoneNumber().h()), "countryCodeValue"), 0, prefixValidationState, new l() { // from class: ke2.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.h(params, (String) obj);
            }
        }, null, mx.b.b(c0.e(params.getState().getInitializedStateData().getPhoneNumber().g()), "phoneNumberValue"), null, phoneNumberValidationState, new l() { // from class: ke2.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.i(params, (String) obj);
            }
        }, null, 38074, null), buttonData, iVar, aVarA);
    }
}
