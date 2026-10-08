package ru2;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru2/s;", "Lxw/f;", "Lru2/s$a;", "Lru2/o$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "h", "(Lru2/s$a;)Lru2/o$a;", "a", "Lmx/c;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements xw.f<Params, o.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ru2.s$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b'\u0010*R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b,\u0010*R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b#\u0010*R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b\u001f\u0010*R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b+\u0010*R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b/\u0010*R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b0\u0010*R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b.\u0010*¨\u00061"}, d2 = {"Lru2/s$a;", "", "Lru2/n;", "state", "Lkotlin/Function0;", "Loq/i0;", "onNextButtonClick", "Lkotlin/Function1;", "", "onCompanyNameChanged", "onCompanyCityChanged", "onCompanyPostalCodeChanged", "onCompanyStreetChanged", "onCompanyBuildingNumberChanged", "onCompanyApartmentNumberChanged", "Lbu2/a;", "onCompanyIdRadioButtonSelected", "onNipNumberChanged", "onRegonNumberChanged", "onKrsNumberChanged", "<init>", "(Lru2/n;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lru2/n;", "l", "()Lru2/n;", "b", "Ler/a;", "i", "()Ler/a;", "c", "Ler/l;", "e", "()Ler/l;", "d", "f", "g", "h", "j", "k", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onNextButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onCompanyNameChanged;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onCompanyCityChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onCompanyPostalCodeChanged;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onCompanyStreetChanged;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onCompanyBuildingNumberChanged;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onCompanyApartmentNumberChanged;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<bu2.a, oq.i0> onCompanyIdRadioButtonSelected;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onNipNumberChanged;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onRegonNumberChanged;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onKrsNumberChanged;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<oq.i0> aVar, er.l<? super String, oq.i0> lVar, er.l<? super String, oq.i0> lVar2, er.l<? super String, oq.i0> lVar3, er.l<? super String, oq.i0> lVar4, er.l<? super String, oq.i0> lVar5, er.l<? super String, oq.i0> lVar6, er.l<? super bu2.a, oq.i0> lVar7, er.l<? super String, oq.i0> lVar8, er.l<? super String, oq.i0> lVar9, er.l<? super String, oq.i0> lVar10) {
            this.state = state;
            this.onNextButtonClick = aVar;
            this.onCompanyNameChanged = lVar;
            this.onCompanyCityChanged = lVar2;
            this.onCompanyPostalCodeChanged = lVar3;
            this.onCompanyStreetChanged = lVar4;
            this.onCompanyBuildingNumberChanged = lVar5;
            this.onCompanyApartmentNumberChanged = lVar6;
            this.onCompanyIdRadioButtonSelected = lVar7;
            this.onNipNumberChanged = lVar8;
            this.onRegonNumberChanged = lVar9;
            this.onKrsNumberChanged = lVar10;
        }

        public final er.l<String, oq.i0> a() {
            return this.onCompanyApartmentNumberChanged;
        }

        public final er.l<String, oq.i0> b() {
            return this.onCompanyBuildingNumberChanged;
        }

        public final er.l<String, oq.i0> c() {
            return this.onCompanyCityChanged;
        }

        public final er.l<bu2.a, oq.i0> d() {
            return this.onCompanyIdRadioButtonSelected;
        }

        public final er.l<String, oq.i0> e() {
            return this.onCompanyNameChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.onNextButtonClick, params.onNextButtonClick) && fr.t.c(this.onCompanyNameChanged, params.onCompanyNameChanged) && fr.t.c(this.onCompanyCityChanged, params.onCompanyCityChanged) && fr.t.c(this.onCompanyPostalCodeChanged, params.onCompanyPostalCodeChanged) && fr.t.c(this.onCompanyStreetChanged, params.onCompanyStreetChanged) && fr.t.c(this.onCompanyBuildingNumberChanged, params.onCompanyBuildingNumberChanged) && fr.t.c(this.onCompanyApartmentNumberChanged, params.onCompanyApartmentNumberChanged) && fr.t.c(this.onCompanyIdRadioButtonSelected, params.onCompanyIdRadioButtonSelected) && fr.t.c(this.onNipNumberChanged, params.onNipNumberChanged) && fr.t.c(this.onRegonNumberChanged, params.onRegonNumberChanged) && fr.t.c(this.onKrsNumberChanged, params.onKrsNumberChanged);
        }

        public final er.l<String, oq.i0> f() {
            return this.onCompanyPostalCodeChanged;
        }

        public final er.l<String, oq.i0> g() {
            return this.onCompanyStreetChanged;
        }

        public final er.l<String, oq.i0> h() {
            return this.onKrsNumberChanged;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.state.hashCode() * 31) + this.onNextButtonClick.hashCode()) * 31) + this.onCompanyNameChanged.hashCode()) * 31) + this.onCompanyCityChanged.hashCode()) * 31) + this.onCompanyPostalCodeChanged.hashCode()) * 31) + this.onCompanyStreetChanged.hashCode()) * 31) + this.onCompanyBuildingNumberChanged.hashCode()) * 31) + this.onCompanyApartmentNumberChanged.hashCode()) * 31) + this.onCompanyIdRadioButtonSelected.hashCode()) * 31) + this.onNipNumberChanged.hashCode()) * 31) + this.onRegonNumberChanged.hashCode()) * 31) + this.onKrsNumberChanged.hashCode();
        }

        public final er.a<oq.i0> i() {
            return this.onNextButtonClick;
        }

        public final er.l<String, oq.i0> j() {
            return this.onNipNumberChanged;
        }

        public final er.l<String, oq.i0> k() {
            return this.onRegonNumberChanged;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onNextButtonClick=" + this.onNextButtonClick + ", onCompanyNameChanged=" + this.onCompanyNameChanged + ", onCompanyCityChanged=" + this.onCompanyCityChanged + ", onCompanyPostalCodeChanged=" + this.onCompanyPostalCodeChanged + ", onCompanyStreetChanged=" + this.onCompanyStreetChanged + ", onCompanyBuildingNumberChanged=" + this.onCompanyBuildingNumberChanged + ", onCompanyApartmentNumberChanged=" + this.onCompanyApartmentNumberChanged + ", onCompanyIdRadioButtonSelected=" + this.onCompanyIdRadioButtonSelected + ", onNipNumberChanged=" + this.onNipNumberChanged + ", onRegonNumberChanged=" + this.onRegonNumberChanged + ", onKrsNumberChanged=" + this.onKrsNumberChanged + ')';
        }
    }

    public s(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(Params params) {
        params.d().b(bu2.a.NIP);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(Params params) {
        params.d().b(bu2.a.REGON);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(Params params) {
        params.d().b(bu2.a.KRS);
        return oq.i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public o.Data b(final Params params) {
        return new o.Data(this.labelProvider.c(ut2.a.f201415m0).getText(), this.labelProvider.c(ut2.a.f201433v0), this.labelProvider.c(ut2.a.f201423q0), this.labelProvider.c(ut2.a.f201441z0), this.labelProvider.c(ut2.a.B0), this.labelProvider.c(ut2.a.C0), this.labelProvider.c(ut2.a.f201419o0), this.labelProvider.c(ut2.a.f201412l), params.i(), params.getState().getCompanyNameScreenData(), params.getState().getCompanyCityScreenData(), params.getState().getCompanyPostalCodeScreenData(), params.getState().getCompanyStreetScreenData(), params.getState().getCompanyBuildingScreenData(), params.getState().getCompanyApartmentScreenData(), params.e(), params.c(), params.f(), params.g(), params.b(), params.a(), params.getState().getSelectedRadioButtonId(), params.d(), new RadioButtonData(pq.v.q(new RadioButtonRow(new RadioButtonItemData(false, params.getState().getSelectedRadioButtonId() == bu2.a.NIP, false, 5, null), new er.a() { // from class: ru2.p
            @Override // er.a
            public final Object a() {
                return s.i(params);
            }
        }, this.labelProvider.c(ut2.a.f201439y0), null, new su2.b(this.labelProvider.c(ut2.a.f201414m), params.getState().getNipNumberData().getContent(), params.j(), params.getState().getNipNumberData().getValidationState()), 8, null), new RadioButtonRow(new RadioButtonItemData(false, params.getState().getSelectedRadioButtonId() == bu2.a.REGON, false, 5, null), new er.a() { // from class: ru2.q
            @Override // er.a
            public final Object a() {
                return s.l(params);
            }
        }, this.labelProvider.c(ut2.a.A0), null, new su2.b(this.labelProvider.c(ut2.a.f201422q), params.getState().getRegonNumberData().getContent(), params.k(), params.getState().getRegonNumberData().getValidationState()), 8, null), new RadioButtonRow(new RadioButtonItemData(false, params.getState().getSelectedRadioButtonId() == bu2.a.KRS, false, 5, null), new er.a() { // from class: ru2.r
            @Override // er.a
            public final Object a() {
                return s.m(params);
            }
        }, this.labelProvider.c(ut2.a.f201431u0), null, new su2.b(this.labelProvider.c(ut2.a.f201408j), params.getState().getKrsNumberData().getContent(), params.h(), params.getState().getKrsNumberData().getValidationState()), 8, null)), b50.e.a.f16684a, null, this.labelProvider.c(ut2.a.f201417n0), null, null, null, 116, null));
    }
}
