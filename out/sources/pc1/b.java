package pc1;

import er.l;
import fr.t;
import h30.ButtonData;
import k30.d;
import mx.Label;
import mx.c;
import nc1.TextInput;
import nc1.g0;
import nc1.h;
import nc1.i;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import v4.a0;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lpc1/b;", "Lxw/f;", "Lpc1/b$a;", "Lnc1/i$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lpc1/b$a;)Lnc1/i$a;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: pc1.b$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b#\u0010 R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010 R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001d\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u0019\u0010%¨\u0006&"}, d2 = {"Lpc1/b$a;", "", "Lnc1/h;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onCityChanged", "onPostalCodeChanged", "onPostOfficeChanged", "onBoxNumberChanged", "Lkotlin/Function0;", "nextAction", "backAction", "<init>", "(Lnc1/h;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnc1/h;", "g", "()Lnc1/h;", "b", "Ler/l;", "d", "()Ler/l;", "c", "f", "e", "Ler/a;", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final h state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onCityChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onPostalCodeChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onPostOfficeChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onBoxNumberChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(h hVar, l<? super String, i0> lVar, l<? super String, i0> lVar2, l<? super String, i0> lVar3, l<? super String, i0> lVar4, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = hVar;
            this.onCityChanged = lVar;
            this.onPostalCodeChanged = lVar2;
            this.onPostOfficeChanged = lVar3;
            this.onBoxNumberChanged = lVar4;
            this.nextAction = aVar;
            this.backAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.nextAction;
        }

        public final l<String, i0> c() {
            return this.onBoxNumberChanged;
        }

        public final l<String, i0> d() {
            return this.onCityChanged;
        }

        public final l<String, i0> e() {
            return this.onPostOfficeChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onCityChanged, params.onCityChanged) && t.c(this.onPostalCodeChanged, params.onPostalCodeChanged) && t.c(this.onPostOfficeChanged, params.onPostOfficeChanged) && t.c(this.onBoxNumberChanged, params.onBoxNumberChanged) && t.c(this.nextAction, params.nextAction) && t.c(this.backAction, params.backAction);
        }

        public final l<String, i0> f() {
            return this.onPostalCodeChanged;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final h getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((this.state.hashCode() * 31) + this.onCityChanged.hashCode()) * 31) + this.onPostalCodeChanged.hashCode()) * 31) + this.onPostOfficeChanged.hashCode()) * 31) + this.onBoxNumberChanged.hashCode()) * 31) + this.nextAction.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCityChanged=" + this.onCityChanged + ", onPostalCodeChanged=" + this.onPostalCodeChanged + ", onPostOfficeChanged=" + this.onPostOfficeChanged + ", onBoxNumberChanged=" + this.onBoxNumberChanged + ", nextAction=" + this.nextAction + ", backAction=" + this.backAction + ')';
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, String str) {
        params.f().b(w50.a.POST_CODE.o(str));
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public i.a b(final Params params) {
        h state = params.getState();
        if (!(state instanceof h.FormDisplayed)) {
            throw new p();
        }
        Label labelC = this.labelProvider.c(ha1.a.f82421i2);
        er.a<i0> aVarA = params.a();
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(ha1.a.O), null, 2, null), d.a.f107773a, null, params.b(), 35, null);
        g0 g0Var = g0.POSTAL_CODE;
        Label labelC2 = this.labelProvider.c(ha1.a.W);
        h.FormDisplayed formDisplayed = (h.FormDisplayed) state;
        Label labelB = mx.b.b(t04.a.e(formDisplayed.f().d(), null, 1, null), "postalCodeValue");
        hz.b validationState = formDisplayed.f().getValidationState();
        w50.a aVar = w50.a.POST_CODE;
        TextInput textInput = new TextInput(g0Var, new v50.c.Masked(null, labelC2, labelB, null, validationState, null, null, new l() { // from class: pc1.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.f(params, (String) obj);
            }
        }, null, false, 0, null, false, null, false, null, null, a0.INSTANCE.d(), null, aVar, 393065, null));
        g0 g0Var2 = g0.CITY;
        Label labelC3 = this.labelProvider.c(ha1.a.f82442l);
        v4.t.Companion companion = v4.t.INSTANCE;
        int iD = companion.d();
        TextInput textInput2 = new TextInput(g0Var2, new v50.c.Text(null, labelC3, null, mx.b.b(formDisplayed.d().d(), "city"), formDisplayed.d().getValidationState(), null, null, params.d(), null, false, iD, null, false, null, false, null, null, null, null, null, 1047397, null));
        g0 g0Var3 = g0.POST_OFFICE;
        Label labelC4 = this.labelProvider.c(ha1.a.f82429j2);
        int iD2 = companion.d();
        TextInput textInput3 = new TextInput(g0Var3, new v50.c.Text(null, labelC4, null, mx.b.b(formDisplayed.e().d(), "postOffice"), formDisplayed.e().getValidationState(), null, null, params.e(), null, false, iD2, null, false, null, false, null, null, null, null, null, 1047397, null));
        g0 g0Var4 = g0.BOX_NUMBER;
        Label labelC5 = this.labelProvider.c(ha1.a.f82389e2);
        int iB = companion.b();
        return new i.a.DataDisplayed(labelC, textInput, textInput2, textInput3, new TextInput(g0Var4, new v50.c.Number(null, labelC5, null, mx.b.b(formDisplayed.c().d(), "boxNumber"), formDisplayed.c().getValidationState(), null, null, params.c(), null, false, iB, null, false, null, false, null, null, null, null, false, 1047397, null)), buttonData, aVarA);
    }
}
