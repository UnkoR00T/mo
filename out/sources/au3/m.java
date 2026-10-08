package au3;

import bh0.BETerytDetail;
import er.p;
import fr.t;
import fu.r;
import j40.DropDownButtonData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;
import pq.v;
import tt3.AddressNoSearchResultsData;
import tt3.AddressSearchData;
import tt3.AddressSearchItemData;
import v4.a0;
import zt3.AddressState;
import zt3.DropDown;
import zt3.m1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00012B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJe\u0010\u001c\u001a\u00020\u0015*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJO\u0010#\u001a\u00020\"*\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\u00142\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010$J7\u0010(\u001a\u00020\"*\u00020\u000f2\b\b\u0001\u0010\u001e\u001a\u00020\u00102\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b(\u0010)J!\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lau3/m;", "Lxw/f;", "Lau3/m$a;", "Lzt3/g$b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lzt3/b;", "params", "Lzt3/f;", "screenState", "Lzt3/g$a;", "F", "(Lzt3/b;Lau3/m$a;Lzt3/f;)Lzt3/g$a;", "Lzt3/c;", "", "labelResId", "hintResId", "noOptionsResId", "Lkotlin/Function1;", "Lj40/a;", "Loq/i0;", "onClicked", "Lbh0/a;", "selectedItem", "", "combinedItems", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lzt3/c;Lzt3/f;IILjava/lang/Integer;Ler/l;Lbh0/a;Z)Lj40/a;", "titleResId", "onSelected", "combineNameAndDescription", "withDescription", "Ltt3/b;", ip.a.f96137b, "(Lzt3/c;ILbh0/a;Ler/l;ZZ)Ltt3/b;", "Lkotlin/Function2;", "Ltt3/e;", "itemMapper", "R", "(Lzt3/c;ILer/p;)Ltt3/b;", "", "name", "description", "Lmx/a;", "x", "(Ljava/lang/String;Ljava/lang/String;)Lmx/a;", "z", "(Lau3/m$a;)Lzt3/g$b;", "a", "Lmx/c;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements xw.f<Params, zt3.g.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: au3.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b,\u0010'R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b \u0010'R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b-\u0010'R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b*\u0010'R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b(\u0010'R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b$\u0010'R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00148\u0006¢\u0006\f\n\u0004\b\"\u00100\u001a\u0004\b/\u00101¨\u00062"}, d2 = {"Lau3/m$a;", "", "Lzt3/f;", "state", "Lkotlin/Function1;", "Lbh0/a;", "Loq/i0;", "onProvinceSelected", "onCountySelected", "onCommunitySelected", "onCitySelected", "Ltt3/b;", "goToSearch", "", "onPostalCodeChanged", "onStreetSelected", "", "onChangeStreetFieldVisibility", "onBuildingNumberChanged", "onApartmentNumberChanged", "Lkotlin/Function0;", "onScrolledToField", "<init>", "(Lzt3/f;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lzt3/f;", "l", "()Lzt3/f;", "b", "Ler/l;", "i", "()Ler/l;", "c", "g", "d", "f", "e", "h", "k", "j", "Ler/a;", "()Ler/a;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final zt3.f state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<BETerytDetail, i0> onProvinceSelected;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<BETerytDetail, i0> onCountySelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<BETerytDetail, i0> onCommunitySelected;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<BETerytDetail, i0> onCitySelected;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<AddressSearchData, i0> goToSearch;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onPostalCodeChanged;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<BETerytDetail, i0> onStreetSelected;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onChangeStreetFieldVisibility;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onBuildingNumberChanged;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onApartmentNumberChanged;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(zt3.f fVar, er.l<? super BETerytDetail, i0> lVar, er.l<? super BETerytDetail, i0> lVar2, er.l<? super BETerytDetail, i0> lVar3, er.l<? super BETerytDetail, i0> lVar4, er.l<? super AddressSearchData, i0> lVar5, er.l<? super String, i0> lVar6, er.l<? super BETerytDetail, i0> lVar7, er.l<? super Boolean, i0> lVar8, er.l<? super String, i0> lVar9, er.l<? super String, i0> lVar10, er.a<i0> aVar) {
            this.state = fVar;
            this.onProvinceSelected = lVar;
            this.onCountySelected = lVar2;
            this.onCommunitySelected = lVar3;
            this.onCitySelected = lVar4;
            this.goToSearch = lVar5;
            this.onPostalCodeChanged = lVar6;
            this.onStreetSelected = lVar7;
            this.onChangeStreetFieldVisibility = lVar8;
            this.onBuildingNumberChanged = lVar9;
            this.onApartmentNumberChanged = lVar10;
            this.onScrolledToField = aVar;
        }

        public final er.l<AddressSearchData, i0> a() {
            return this.goToSearch;
        }

        public final er.l<String, i0> b() {
            return this.onApartmentNumberChanged;
        }

        public final er.l<String, i0> c() {
            return this.onBuildingNumberChanged;
        }

        public final er.l<Boolean, i0> d() {
            return this.onChangeStreetFieldVisibility;
        }

        public final er.l<BETerytDetail, i0> e() {
            return this.onCitySelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onProvinceSelected, params.onProvinceSelected) && t.c(this.onCountySelected, params.onCountySelected) && t.c(this.onCommunitySelected, params.onCommunitySelected) && t.c(this.onCitySelected, params.onCitySelected) && t.c(this.goToSearch, params.goToSearch) && t.c(this.onPostalCodeChanged, params.onPostalCodeChanged) && t.c(this.onStreetSelected, params.onStreetSelected) && t.c(this.onChangeStreetFieldVisibility, params.onChangeStreetFieldVisibility) && t.c(this.onBuildingNumberChanged, params.onBuildingNumberChanged) && t.c(this.onApartmentNumberChanged, params.onApartmentNumberChanged) && t.c(this.onScrolledToField, params.onScrolledToField);
        }

        public final er.l<BETerytDetail, i0> f() {
            return this.onCommunitySelected;
        }

        public final er.l<BETerytDetail, i0> g() {
            return this.onCountySelected;
        }

        public final er.l<String, i0> h() {
            return this.onPostalCodeChanged;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.state.hashCode() * 31) + this.onProvinceSelected.hashCode()) * 31) + this.onCountySelected.hashCode()) * 31) + this.onCommunitySelected.hashCode()) * 31) + this.onCitySelected.hashCode()) * 31) + this.goToSearch.hashCode()) * 31) + this.onPostalCodeChanged.hashCode()) * 31) + this.onStreetSelected.hashCode()) * 31) + this.onChangeStreetFieldVisibility.hashCode()) * 31) + this.onBuildingNumberChanged.hashCode()) * 31) + this.onApartmentNumberChanged.hashCode()) * 31) + this.onScrolledToField.hashCode();
        }

        public final er.l<BETerytDetail, i0> i() {
            return this.onProvinceSelected;
        }

        public final er.a<i0> j() {
            return this.onScrolledToField;
        }

        public final er.l<BETerytDetail, i0> k() {
            return this.onStreetSelected;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final zt3.f getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onProvinceSelected=" + this.onProvinceSelected + ", onCountySelected=" + this.onCountySelected + ", onCommunitySelected=" + this.onCommunitySelected + ", onCitySelected=" + this.onCitySelected + ", goToSearch=" + this.goToSearch + ", onPostalCodeChanged=" + this.onPostalCodeChanged + ", onStreetSelected=" + this.onStreetSelected + ", onChangeStreetFieldVisibility=" + this.onChangeStreetFieldVisibility + ", onBuildingNumberChanged=" + this.onBuildingNumberChanged + ", onApartmentNumberChanged=" + this.onApartmentNumberChanged + ", onScrolledToField=" + this.onScrolledToField + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(Boolean.valueOf(((AddressSearchItemData) t16).getIsSelected()), Boolean.valueOf(((AddressSearchItemData) t15).getIsSelected()));
        }
    }

    public m(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E() {
        return i0.f148189a;
    }

    private final zt3.g.AddressSection F(final AddressState addressState, final Params params, zt3.f fVar) {
        v50.c.Masked masked;
        zt3.g.AddressSection.StreetData c6413a;
        v50.c.Text text;
        v50.c.Text text2;
        DropDownButtonData dropDownButtonDataQ;
        s50.a.c cVar;
        DropDown province = addressState.getProvince();
        int i15 = rt3.a.f176113p;
        int i16 = rt3.a.f176114q;
        zt3.d state = addressState.getProvince().getState();
        zt3.d.Enabled enabled = state instanceof zt3.d.Enabled ? (zt3.d.Enabled) state : null;
        DropDownButtonData dropDownButtonDataQ2 = Q(this, province, fVar, i15, i16, null, new er.l() { // from class: au3.a
            @Override // er.l
            public final Object b(Object obj) {
                return m.G(params, this, addressState, (DropDownButtonData) obj);
            }
        }, enabled != null ? enabled.getSelected() : null, false, 72, null);
        DropDown county = addressState.getCounty();
        int i17 = rt3.a.f176106i;
        int i18 = rt3.a.f176107j;
        zt3.d state2 = addressState.getCounty().getState();
        zt3.d.Enabled enabled2 = state2 instanceof zt3.d.Enabled ? (zt3.d.Enabled) state2 : null;
        DropDownButtonData dropDownButtonDataQ3 = Q(this, county, fVar, i17, i18, null, new er.l() { // from class: au3.d
            @Override // er.l
            public final Object b(Object obj) {
                return m.H(params, this, addressState, (DropDownButtonData) obj);
            }
        }, enabled2 != null ? enabled2.getSelected() : null, false, 72, null);
        DropDown community = addressState.getCommunity();
        int i19 = rt3.a.f176104g;
        int i25 = rt3.a.f176105h;
        zt3.d state3 = addressState.getCommunity().getState();
        zt3.d.Enabled enabled3 = state3 instanceof zt3.d.Enabled ? (zt3.d.Enabled) state3 : null;
        DropDownButtonData dropDownButtonDataQ4 = Q(this, community, fVar, i19, i25, null, new er.l() { // from class: au3.e
            @Override // er.l
            public final Object b(Object obj) {
                return m.I(params, this, addressState, (DropDownButtonData) obj);
            }
        }, enabled3 != null ? enabled3.getSelected() : null, true, 8, null);
        DropDown city = addressState.getCity();
        int i26 = rt3.a.f176103f;
        int i27 = rt3.a.f176102e;
        zt3.d state4 = addressState.getCity().getState();
        zt3.d.Enabled enabled4 = state4 instanceof zt3.d.Enabled ? (zt3.d.Enabled) state4 : null;
        DropDownButtonData dropDownButtonDataQ5 = Q(this, city, fVar, i26, i27, null, new er.l() { // from class: au3.f
            @Override // er.l
            public final Object b(Object obj) {
                return m.L(params, addressState, this, (DropDownButtonData) obj);
            }
        }, enabled4 != null ? enabled4.getSelected() : null, false, 72, null);
        Integer numB = params.getState().getMode().b();
        if (numB != null) {
            masked = new v50.c.Masked(null, this.labelProvider.c(numB.intValue()), mx.b.b(t04.a.e(addressState.getPostalCode().getValue(), null, 1, null), "postalCodeValue"), null, addressState.getPostalCode().getValidationState(), null, null, new er.l() { // from class: au3.g
                @Override // er.l
                public final Object b(Object obj) {
                    return m.M(params, (String) obj);
                }
            }, null, false, 0, null, false, null, false, null, null, a0.INSTANCE.d(), null, w50.a.POST_CODE, 393065, null);
        } else {
            masked = null;
        }
        Integer numF = params.getState().getMode().f();
        if (numF != null) {
            int iIntValue = numF.intValue();
            zt3.d state5 = addressState.getStreet().getState();
            if (state5 instanceof zt3.d.c) {
                state5 = null;
            }
            if (state5 != null) {
                DropDown street = addressState.getStreet();
                int i28 = rt3.a.f176117t;
                int i29 = rt3.a.f176110m;
                zt3.d state6 = addressState.getStreet().getState();
                zt3.d.Enabled enabled5 = state6 instanceof zt3.d.Enabled ? (zt3.d.Enabled) state6 : null;
                dropDownButtonDataQ = Q(this, street, fVar, iIntValue, i28, Integer.valueOf(i29), new er.l() { // from class: au3.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.N(params, this, addressState, (DropDownButtonData) obj);
                    }
                }, enabled5 != null ? enabled5.getSelected() : null, false, 64, null);
            } else {
                dropDownButtonDataQ = null;
            }
            boolean canToggleStreet = addressState.getCanToggleStreet();
            Boolean boolValueOf = Boolean.valueOf(canToggleStreet);
            if (!canToggleStreet) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                cVar = new s50.a.c(null, addressState.getStreet().getState() instanceof zt3.d.c, this.labelProvider.c(rt3.a.f176110m), null, false, null, new er.l() { // from class: au3.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return m.O(params, addressState, ((Boolean) obj).booleanValue());
                    }
                }, null, 185, null);
            } else {
                cVar = null;
            }
            c6413a = new zt3.g.AddressSection.StreetData(dropDownButtonDataQ, cVar);
        } else {
            c6413a = null;
        }
        Integer numD = params.getState().getMode().d();
        if (numD != null) {
            text = new v50.c.Text(null, this.labelProvider.c(numD.intValue()), null, mx.b.b(addressState.getBuildingNumber().getValue(), "buildingNumberValue"), addressState.getBuildingNumber().getValidationState(), null, null, params.c(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null);
        } else {
            text = null;
        }
        Integer numC = params.getState().getMode().c();
        if (numC != null) {
            text2 = new v50.c.Text(null, this.labelProvider.c(numC.intValue()), null, mx.b.b(addressState.getApartmentNumber().getValue(), "apartmentNumberValue"), addressState.getApartmentNumber().getValidationState(), null, null, params.b(), null, false, 0, null, false, null, false, null, null, null, null, null, 1048421, null);
        } else {
            text2 = null;
        }
        return new zt3.g.AddressSection(dropDownButtonDataQ2, dropDownButtonDataQ3, dropDownButtonDataQ4, dropDownButtonDataQ5, masked, c6413a, text, text2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(Params params, m mVar, AddressState addressState, DropDownButtonData dropDownButtonData) {
        er.l<AddressSearchData, i0> lVarA = params.a();
        DropDown province = addressState.getProvince();
        int i15 = rt3.a.f176114q;
        zt3.d state = addressState.getProvince().getState();
        zt3.d.Enabled enabled = state instanceof zt3.d.Enabled ? (zt3.d.Enabled) state : null;
        lVarA.b(T(mVar, province, i15, enabled != null ? enabled.getSelected() : null, params.i(), false, false, 24, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(Params params, m mVar, AddressState addressState, DropDownButtonData dropDownButtonData) {
        er.l<AddressSearchData, i0> lVarA = params.a();
        DropDown county = addressState.getCounty();
        int i15 = rt3.a.f176107j;
        zt3.d state = addressState.getCounty().getState();
        zt3.d.Enabled enabled = state instanceof zt3.d.Enabled ? (zt3.d.Enabled) state : null;
        lVarA.b(T(mVar, county, i15, enabled != null ? enabled.getSelected() : null, params.g(), false, false, 24, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(final Params params, m mVar, final AddressState addressState, DropDownButtonData dropDownButtonData) {
        params.a().b(mVar.R(addressState.getCommunity(), rt3.a.f176105h, new p() { // from class: au3.j
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return m.J(addressState, params, ((Integer) obj).intValue(), (BETerytDetail) obj2);
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressSearchItemData J(AddressState addressState, final Params params, int i15, final BETerytDetail bETerytDetail) {
        Label labelB;
        BETerytDetail selected;
        Label labelB2 = mx.b.b(bETerytDetail.getName(), "addressItemName_" + i15);
        String description = bETerytDetail.getDescription();
        String id5 = null;
        if (description != null) {
            labelB = mx.b.b(description, "addressItemDescription_" + i15);
        } else {
            labelB = null;
        }
        zt3.d state = addressState.getCommunity().getState();
        zt3.d.Enabled enabled = state instanceof zt3.d.Enabled ? (zt3.d.Enabled) state : null;
        if (enabled != null && (selected = enabled.getSelected()) != null) {
            id5 = selected.getId();
        }
        return new AddressSearchItemData(labelB2, labelB, id5 == null ? false : BETerytDetail.b.b(id5, bETerytDetail.getId()), new er.a() { // from class: au3.l
            @Override // er.a
            public final Object a() {
                return m.K(params, bETerytDetail);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(Params params, BETerytDetail bETerytDetail) {
        params.f().b(bETerytDetail);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(Params params, AddressState addressState, m mVar, DropDownButtonData dropDownButtonData) {
        er.l<AddressSearchData, i0> lVarA = params.a();
        DropDown city = addressState.getCity();
        int i15 = rt3.a.f176102e;
        zt3.d state = addressState.getCity().getState();
        zt3.d.Enabled enabled = state instanceof zt3.d.Enabled ? (zt3.d.Enabled) state : null;
        lVarA.b(T(mVar, city, i15, enabled != null ? enabled.getSelected() : null, params.e(), false, true, 8, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(Params params, String str) {
        params.h().b(w50.a.POST_CODE.o(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(Params params, m mVar, AddressState addressState, DropDownButtonData dropDownButtonData) {
        er.l<AddressSearchData, i0> lVarA = params.a();
        DropDown street = addressState.getStreet();
        int i15 = rt3.a.f176117t;
        zt3.d state = addressState.getStreet().getState();
        zt3.d.Enabled enabled = state instanceof zt3.d.Enabled ? (zt3.d.Enabled) state : null;
        lVarA.b(T(mVar, street, i15, enabled != null ? enabled.getSelected() : null, params.k(), true, false, 16, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(Params params, AddressState addressState, boolean z15) {
        params.d().b(Boolean.valueOf(addressState.getStreet().getState() instanceof zt3.d.c));
        return i0.f148189a;
    }

    private final DropDownButtonData P(DropDown dropDown, zt3.f fVar, int i15, int i16, Integer num, er.l<? super DropDownButtonData, i0> lVar, BETerytDetail bETerytDetail, boolean z15) {
        Integer numValueOf;
        m1 fieldType = dropDown.getFieldType();
        zt3.f.Form aVar = fVar instanceof zt3.f.Form ? (zt3.f.Form) fVar : null;
        int i17 = 0;
        boolean z16 = fieldType == (aVar != null ? aVar.getFieldToAutoFocus() : null);
        Label labelC = this.labelProvider.c(i15);
        List<BETerytDetail> listC = dropDown.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        int i18 = 0;
        for (Object obj : listC) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                v.x();
            }
            BETerytDetail bETerytDetail2 = (BETerytDetail) obj;
            arrayList.add(z15 ? x(bETerytDetail2.getName(), bETerytDetail2.getDescription()) : mx.b.b(bETerytDetail2.getName(), "dropdownItemName_" + i18));
            i18 = i19;
        }
        if (bETerytDetail != null) {
            Iterator<BETerytDetail> it = dropDown.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (BETerytDetail.b.b(it.next().getId(), bETerytDetail.getId())) {
                    break;
                }
                i17++;
            }
            numValueOf = Integer.valueOf(i17);
        } else {
            numValueOf = null;
        }
        Label labelC2 = (!t.c(dropDown.getState(), zt3.d.C6410d.f237440a) || num == null) ? this.labelProvider.c(i16) : this.labelProvider.c(num.intValue());
        return new DropDownButtonData(labelC, arrayList, numValueOf, dropDown.getState() instanceof zt3.d.Enabled ? dropDown.getValidationState() instanceof hz.b.Invalid ? new j40.m.Error(((hz.b.Invalid) dropDown.getValidationState()).getMessage()) : new j40.m.Enabled(null, 1, null) : new j40.m.Disabled(null, 1, null), labelC2, z16, null, lVar, 64, null);
    }

    static /* synthetic */ DropDownButtonData Q(m mVar, DropDown dropDown, zt3.f fVar, int i15, int i16, Integer num, er.l lVar, BETerytDetail bETerytDetail, boolean z15, int i17, Object obj) {
        if ((i17 & 8) != 0) {
            num = null;
        }
        if ((i17 & 32) != 0) {
            zt3.d state = dropDown.getState();
            zt3.d.Enabled enabled = state instanceof zt3.d.Enabled ? (zt3.d.Enabled) state : null;
            bETerytDetail = enabled != null ? enabled.getSelected() : null;
        }
        if ((i17 & 64) != 0) {
            z15 = false;
        }
        return mVar.P(dropDown, fVar, i15, i16, num, lVar, bETerytDetail, z15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final AddressSearchData R(DropDown dropDown, int i15, p<? super Integer, ? super BETerytDetail, AddressSearchItemData> pVar) {
        Label labelC = this.labelProvider.c(i15);
        List<BETerytDetail> listC = dropDown.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        int i16 = 0;
        for (Object obj : listC) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                v.x();
            }
            arrayList.add(pVar.B(Integer.valueOf(i16), obj));
            i16 = i17;
        }
        return new AddressSearchData(labelC, this.labelProvider.c(rt3.a.f176115r), v.U0(arrayList, new b()), new AddressNoSearchResultsData(this.labelProvider.c(rt3.a.f176109l), this.labelProvider.c(rt3.a.f176119v)));
    }

    private final AddressSearchData S(DropDown dropDown, int i15, final BETerytDetail bETerytDetail, final er.l<? super BETerytDetail, i0> lVar, final boolean z15, final boolean z16) {
        return R(dropDown, i15, new p() { // from class: au3.k
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return m.U(bETerytDetail, z15, z16, lVar, ((Integer) obj).intValue(), (BETerytDetail) obj2);
            }
        });
    }

    static /* synthetic */ AddressSearchData T(m mVar, DropDown dropDown, int i15, BETerytDetail bETerytDetail, er.l lVar, boolean z15, boolean z16, int i16, Object obj) {
        if ((i16 & 8) != 0) {
            z15 = false;
        }
        if ((i16 & 16) != 0) {
            z16 = false;
        }
        return mVar.S(dropDown, i15, bETerytDetail, lVar, z15, z16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddressSearchItemData U(BETerytDetail bETerytDetail, boolean z15, boolean z16, final er.l lVar, int i15, final BETerytDetail bETerytDetail2) {
        Label labelB;
        String name = bETerytDetail2.getDescription() + ' ' + bETerytDetail2.getName();
        if (!z15) {
            name = null;
        }
        if (name == null) {
            name = bETerytDetail2.getName();
        }
        Label labelB2 = mx.b.b(name, "addressItemName_" + i15);
        String description = bETerytDetail2.getDescription();
        if (description != null) {
            labelB = mx.b.b(description, "addressItemDescription_" + i15);
        } else {
            labelB = null;
        }
        if (!z16) {
            labelB = null;
        }
        String id5 = bETerytDetail != null ? bETerytDetail.getId() : null;
        return new AddressSearchItemData(labelB2, labelB, id5 == null ? false : BETerytDetail.b.b(id5, bETerytDetail2.getId()), new er.a() { // from class: au3.b
            @Override // er.a
            public final Object a() {
                return m.V(lVar, bETerytDetail2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(er.l lVar, BETerytDetail bETerytDetail) {
        lVar.b(bETerytDetail);
        return i0.f148189a;
    }

    private final Label x(String name, String description) {
        if (description != null) {
            if (r.t0(description)) {
                description = null;
            }
            if (description != null) {
                Label labelB = mx.b.b(name + " (" + description + ')', "nameWithDescription");
                if (labelB != null) {
                    return labelB;
                }
            }
        }
        return mx.b.b(name, "name");
    }

    @Override // er.l
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public zt3.g.Data b(Params params) {
        zt3.f state = params.getState();
        if (state instanceof zt3.f.Setup) {
            return new zt3.g.Data(F(new AddressState(null, null, null, null, null, null, null, null, GF2Field.MASK, null), params, state), null, new er.a() { // from class: au3.c
                @Override // er.a
                public final Object a() {
                    return m.E();
                }
            });
        }
        if (!(state instanceof zt3.f.Form)) {
            throw new oq.p();
        }
        zt3.f.Form aVar = (zt3.f.Form) state;
        return new zt3.g.Data(F(aVar.getAddressState(), params, state), aVar.getScrollToField(), params.j());
    }
}
