package u82;

import er.l;
import fr.t;
import h30.ButtonData;
import j40.DropDownButtonData;
import j40.m;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import s82.State;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lu82/e;", "Lxw/f;", "Lu82/e$a;", "Ls82/c$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lhz/b;", "Lj40/m;", "s", "(Lhz/b;)Lj40/m;", "params", "i", "(Lu82/e$a;)Ls82/c$a;", "a", "Lmx/c;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, s82.c.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: u82.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u001c\u0010#R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b$\u0010#R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b&\u0010#R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010)R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b \u0010)¨\u0006*"}, d2 = {"Lu82/e$a;", "", "Ls82/b;", "state", "Lkotlin/Function1;", "Lmx/a;", "Loq/i0;", "onStreetValueChanged", "onCityNameValueChanged", "onPostalCodeValueChanged", "Lc92/a$c;", "onVoivodeshipDropDownClicked", "onVoivodeshipItemSelected", "Lkotlin/Function0;", "onScrolledToField", "onNextButtonClicked", "<init>", "(Ls82/b;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls82/b;", "h", "()Ls82/b;", "b", "Ler/l;", "e", "()Ler/l;", "c", "d", "f", "g", "Ler/a;", "()Ler/a;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f196503i = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Label, i0> onStreetValueChanged;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Label, i0> onCityNameValueChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Label, i0> onPostalCodeValueChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<c92.a.Voivodeship, i0> onVoivodeshipDropDownClicked;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Label, i0> onVoivodeshipItemSelected;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextButtonClicked;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super Label, i0> lVar, l<? super Label, i0> lVar2, l<? super Label, i0> lVar3, l<? super c92.a.Voivodeship, i0> lVar4, l<? super Label, i0> lVar5, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onStreetValueChanged = lVar;
            this.onCityNameValueChanged = lVar2;
            this.onPostalCodeValueChanged = lVar3;
            this.onVoivodeshipDropDownClicked = lVar4;
            this.onVoivodeshipItemSelected = lVar5;
            this.onScrolledToField = aVar;
            this.onNextButtonClicked = aVar2;
        }

        public final l<Label, i0> a() {
            return this.onCityNameValueChanged;
        }

        public final er.a<i0> b() {
            return this.onNextButtonClicked;
        }

        public final l<Label, i0> c() {
            return this.onPostalCodeValueChanged;
        }

        public final er.a<i0> d() {
            return this.onScrolledToField;
        }

        public final l<Label, i0> e() {
            return this.onStreetValueChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onStreetValueChanged, params.onStreetValueChanged) && t.c(this.onCityNameValueChanged, params.onCityNameValueChanged) && t.c(this.onPostalCodeValueChanged, params.onPostalCodeValueChanged) && t.c(this.onVoivodeshipDropDownClicked, params.onVoivodeshipDropDownClicked) && t.c(this.onVoivodeshipItemSelected, params.onVoivodeshipItemSelected) && t.c(this.onScrolledToField, params.onScrolledToField) && t.c(this.onNextButtonClicked, params.onNextButtonClicked);
        }

        public final l<c92.a.Voivodeship, i0> f() {
            return this.onVoivodeshipDropDownClicked;
        }

        public final l<Label, i0> g() {
            return this.onVoivodeshipItemSelected;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public int hashCode() {
            return (((((((((((((this.state.hashCode() * 31) + this.onStreetValueChanged.hashCode()) * 31) + this.onCityNameValueChanged.hashCode()) * 31) + this.onPostalCodeValueChanged.hashCode()) * 31) + this.onVoivodeshipDropDownClicked.hashCode()) * 31) + this.onVoivodeshipItemSelected.hashCode()) * 31) + this.onScrolledToField.hashCode()) * 31) + this.onNextButtonClicked.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onStreetValueChanged=" + this.onStreetValueChanged + ", onCityNameValueChanged=" + this.onCityNameValueChanged + ", onPostalCodeValueChanged=" + this.onPostalCodeValueChanged + ", onVoivodeshipDropDownClicked=" + this.onVoivodeshipDropDownClicked + ", onVoivodeshipItemSelected=" + this.onVoivodeshipItemSelected + ", onScrolledToField=" + this.onScrolledToField + ", onNextButtonClicked=" + this.onNextButtonClicked + ')';
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, DropDownButtonData dropDownButtonData) {
        params.f().b(new c92.a.Voivodeship(params.g()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(Params params, String str) {
        params.a().b(mx.b.b(str, "cityName"));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, String str) {
        params.e().b(mx.b.b(str, "address"));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, String str) {
        params.c().b(mx.b.b(str, "postalCode"));
        return i0.f148189a;
    }

    private final m s(hz.b bVar) {
        if (t.c(bVar, hz.b.C2039b.f86846c) || t.c(bVar, hz.b.d.f86848c)) {
            return new m.Enabled(null, 1, null);
        }
        if (bVar instanceof hz.b.Invalid) {
            return new m.Error(((hz.b.Invalid) bVar).getMessage());
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public s82.c.Data b(final Params params) {
        Label labelC = this.labelProvider.c(v72.b.Q);
        v82.a aVar = v82.a.VOIVODESHIP;
        Label labelC2 = this.labelProvider.c(v72.b.S);
        List<Label> listD = this.labelProvider.d(v72.a.f204237a);
        Label labelC3 = this.labelProvider.c(v72.b.R);
        m mVarS = s(params.getState().getVoivodeshipNameState().getState());
        Iterator<Label> it = this.labelProvider.d(v72.a.f204237a).iterator();
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                i15 = -1;
                break;
            }
            if (t.c(it.next().getText(), params.getState().getVoivodeshipNameState().getValue().getText())) {
                break;
            }
            i15++;
        }
        Integer numValueOf = Integer.valueOf(i15);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        List listQ = v.q(new s82.c.Data.Field(aVar, new s82.c.Data.Field.InterfaceC4602a.Dropdown(new DropDownButtonData(labelC2, listD, numValueOf, mVarS, labelC3, false, null, new l() { // from class: u82.a
            @Override // er.l
            public final Object b(Object obj) {
                return e.l(params, (DropDownButtonData) obj);
            }
        }, 96, null))), new s82.c.Data.Field(v82.a.CITY, new s82.c.Data.Field.InterfaceC4602a.Text(new v50.c.Text(null, this.labelProvider.c(v72.b.K), this.labelProvider.c(v72.b.J), params.getState().getCityNameState().getValue(), params.getState().getCityNameState().getState(), null, null, new l() { // from class: u82.b
            @Override // er.l
            public final Object b(Object obj) {
                return e.m(params, (String) obj);
            }
        }, null, false, 0, null, false, null, true, null, null, null, null, null, 1032033, null))), new s82.c.Data.Field(v82.a.STREET_BUILDING_AND_APARTMENT, new s82.c.Data.Field.InterfaceC4602a.Text(new v50.c.Text(null, this.labelProvider.c(v72.b.P), this.labelProvider.c(v72.b.O), params.getState().getStreetNameAndNumberState().getValue(), params.getState().getStreetNameAndNumberState().getState(), null, null, new l() { // from class: u82.c
            @Override // er.l
            public final Object b(Object obj) {
                return e.q(params, (String) obj);
            }
        }, null, false, 0, null, false, null, true, null, null, null, null, null, 1032033, null))), new s82.c.Data.Field(v82.a.ZIP_CODE, new s82.c.Data.Field.InterfaceC4602a.Text(new v50.c.Number(null, this.labelProvider.c(v72.b.N), this.labelProvider.c(v72.b.M), params.getState().getPostalCodeState().getValue(), params.getState().getPostalCodeState().getState(), null, null, new l() { // from class: u82.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.r(params, (String) obj);
            }
        }, null, false, 0, null, false, null, true, null, null, null, null, false, 1032033, null))));
        a82.a scrollToField = params.getState().getScrollToField();
        return new s82.c.Data(labelC, listQ, scrollToField != null ? v82.b.a(scrollToField) : null, params.d(), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(v72.b.L), null, 2, null), k30.d.a.f107773a, null, params.b(), 35, null));
    }
}
