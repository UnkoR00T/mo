package qb3;

import com.google.android.gms.maps.model.LatLng;
import er.l;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j50.SearchBarData;
import java.util.ArrayList;
import java.util.List;
import k40.EmptyStateData;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.k;
import n50.x0;
import ob3.o;
import ob3.v;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import rb3.NativeResults;
import rb3.Results;
import rb3.SelectedPlaceData;
import rb3.TripStateData;
import vy.Coordinates;
import w04.LocationDetails;
import x50.NavigationButtonData;
import x50.i;
import z93.Place;
import z93.PlaceSuggestion;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJI\u0010\u0014\u001a\u00020\u0013*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u001c\u001a\u00020\u001b*\u00020\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u000e2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e*\b\u0012\u0004\u0012\u00020\u00170\u001e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u000eH\u0002¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e*\b\u0012\u0004\u0012\u00020\u00190\u001e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f0\u000eH\u0002¢\u0006\u0004\b\"\u0010!J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lqb3/f;", "Lxw/f;", "Lqb3/f$a;", "Lob3/v$a;", "Lmx/c;", "labelProvider", "Lda3/a;", "addressFormatter", "<init>", "(Lmx/c;Lda3/a;)V", "Lob3/o;", "Lkotlin/Function0;", "Loq/i0;", "onLoaded", "Lkotlin/Function1;", "Lz93/c;", "onNext", "Lvy/c;", "onClick", "Lob3/v$a$b$a;", "l", "(Lob3/o;Ler/a;Ler/l;Ler/l;)Lob3/v$a$b$a;", "Lob3/o$c;", "Lz93/g;", "onPlacesHintClick", "Lw04/c;", "onNativeHintClick", "Lob3/v$a$b$b;", "E", "(Lob3/o$c;Ler/l;Ler/l;)Lob3/v$a$b$b;", "", "Ln50/g;", "x", "(Ljava/util/List;Ler/l;)Ljava/util/List;", "u", "params", "r", "(Lqb3/f$a;)Lob3/v$a;", "a", "Lmx/c;", "b", "Lda3/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, v.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final da3.a addressFormatter;

    /* JADX INFO: renamed from: qb3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b/\u0010.R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b*\u0010)R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b1\u0010.R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b2\u0010)R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b3\u0010.R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b0\u0010.R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b\"\u0010)R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b&\u0010)¨\u00064"}, d2 = {"Lqb3/f$a;", "", "Lob3/o;", "state", "Lkotlin/Function0;", "Loq/i0;", "onMapLoaded", "onOpenSearch", "Lkotlin/Function1;", "Lvy/c;", "onMapClick", "Lz93/c;", "onNext", "onCloseSearch", "", "onSearchQueryChanged", "onSearchQueryCleared", "Lz93/g;", "onPlaceHintClick", "Lw04/c;", "onNativeHintClick", "onBack", "onClose", "<init>", "(Lob3/o;Ler/a;Ler/a;Ler/l;Ler/l;Ler/a;Ler/l;Ler/a;Ler/l;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lob3/o;", "l", "()Lob3/o;", "b", "Ler/a;", "e", "()Ler/a;", "c", "h", "d", "Ler/l;", "()Ler/l;", "g", "f", "j", "k", "i", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final o state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onMapLoaded;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onOpenSearch;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Coordinates, i0> onMapClick;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<Place, i0> onNext;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseSearch;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onSearchQueryChanged;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onSearchQueryCleared;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<PlaceSuggestion, i0> onPlaceHintClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<LocationDetails, i0> onNativeHintClick;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBack;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(o oVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super Coordinates, i0> lVar, l<? super Place, i0> lVar2, er.a<i0> aVar3, l<? super String, i0> lVar3, er.a<i0> aVar4, l<? super PlaceSuggestion, i0> lVar4, l<? super LocationDetails, i0> lVar5, er.a<i0> aVar5, er.a<i0> aVar6) {
            this.state = oVar;
            this.onMapLoaded = aVar;
            this.onOpenSearch = aVar2;
            this.onMapClick = lVar;
            this.onNext = lVar2;
            this.onCloseSearch = aVar3;
            this.onSearchQueryChanged = lVar3;
            this.onSearchQueryCleared = aVar4;
            this.onPlaceHintClick = lVar4;
            this.onNativeHintClick = lVar5;
            this.onBack = aVar5;
            this.onClose = aVar6;
        }

        public final er.a<i0> a() {
            return this.onBack;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onCloseSearch;
        }

        public final l<Coordinates, i0> d() {
            return this.onMapClick;
        }

        public final er.a<i0> e() {
            return this.onMapLoaded;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onMapLoaded, params.onMapLoaded) && t.c(this.onOpenSearch, params.onOpenSearch) && t.c(this.onMapClick, params.onMapClick) && t.c(this.onNext, params.onNext) && t.c(this.onCloseSearch, params.onCloseSearch) && t.c(this.onSearchQueryChanged, params.onSearchQueryChanged) && t.c(this.onSearchQueryCleared, params.onSearchQueryCleared) && t.c(this.onPlaceHintClick, params.onPlaceHintClick) && t.c(this.onNativeHintClick, params.onNativeHintClick) && t.c(this.onBack, params.onBack) && t.c(this.onClose, params.onClose);
        }

        public final l<LocationDetails, i0> f() {
            return this.onNativeHintClick;
        }

        public final l<Place, i0> g() {
            return this.onNext;
        }

        public final er.a<i0> h() {
            return this.onOpenSearch;
        }

        public int hashCode() {
            return (((((((((((((((((((((this.state.hashCode() * 31) + this.onMapLoaded.hashCode()) * 31) + this.onOpenSearch.hashCode()) * 31) + this.onMapClick.hashCode()) * 31) + this.onNext.hashCode()) * 31) + this.onCloseSearch.hashCode()) * 31) + this.onSearchQueryChanged.hashCode()) * 31) + this.onSearchQueryCleared.hashCode()) * 31) + this.onPlaceHintClick.hashCode()) * 31) + this.onNativeHintClick.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onClose.hashCode();
        }

        public final l<PlaceSuggestion, i0> i() {
            return this.onPlaceHintClick;
        }

        public final l<String, i0> j() {
            return this.onSearchQueryChanged;
        }

        public final er.a<i0> k() {
            return this.onSearchQueryCleared;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final o getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onMapLoaded=" + this.onMapLoaded + ", onOpenSearch=" + this.onOpenSearch + ", onMapClick=" + this.onMapClick + ", onNext=" + this.onNext + ", onCloseSearch=" + this.onCloseSearch + ", onSearchQueryChanged=" + this.onSearchQueryChanged + ", onSearchQueryCleared=" + this.onSearchQueryCleared + ", onPlaceHintClick=" + this.onPlaceHintClick + ", onNativeHintClick=" + this.onNativeHintClick + ", onBack=" + this.onBack + ", onClose=" + this.onClose + ')';
        }
    }

    public f(mx.c cVar, da3.a aVar) {
        this.labelProvider = cVar;
        this.addressFormatter = aVar;
    }

    private final v.a.Initialized.InterfaceC3582b E(o.c cVar, l<? super PlaceSuggestion, i0> lVar, l<? super LocationDetails, i0> lVar2) {
        TripStateData.a hintsState = cVar.getData().getHintsState();
        if (t.c(hintsState, TripStateData.a.C4412a.f172995a)) {
            return new v.a.Initialized.InterfaceC3582b.Empty(new EmptyStateData(this.labelProvider.c(r93.a.f172521v), this.labelProvider.c(r93.a.V), null, 4, null));
        }
        if (t.c(hintsState, TripStateData.a.C4413b.f172996a)) {
            return v.a.Initialized.InterfaceC3582b.c.f144375a;
        }
        if (t.c(hintsState, TripStateData.a.c.f172997a)) {
            return new v.a.Initialized.InterfaceC3582b.Empty(new EmptyStateData(this.labelProvider.c(r93.a.f172534z0), this.labelProvider.c(r93.a.f172531y0), null, 4, null));
        }
        if (t.c(hintsState, rb3.c.f173004a)) {
            return new v.a.Initialized.InterfaceC3582b.Empty(new EmptyStateData(this.labelProvider.c(r93.a.F), this.labelProvider.c(r93.a.V), null, 4, null));
        }
        if (hintsState instanceof Results) {
            return new v.a.Initialized.InterfaceC3582b.Hints(new CardListData(x(((Results) hintsState).a(), lVar), null, false, null, null, 30, null));
        }
        if (hintsState instanceof NativeResults) {
            return new v.a.Initialized.InterfaceC3582b.Hints(new CardListData(u(((NativeResults) hintsState).a(), lVar2), null, false, null, null, 30, null));
        }
        throw new p();
    }

    private final v.a.Initialized.MapData l(o oVar, er.a<i0> aVar, final l<? super Place, i0> lVar, final l<? super Coordinates, i0> lVar2) {
        int i15;
        Label labelC;
        k30.b bVar;
        boolean z15 = !(oVar instanceof o.b.Initialization);
        final TripStateData.InterfaceC4414b selectedPlaceType = oVar.getData().getSelectedPlaceType();
        SelectedPlaceData selectedPlaceData = null;
        if (selectedPlaceType != null) {
            Label labelC2 = this.labelProvider.c(r93.a.A0);
            if (selectedPlaceType instanceof TripStateData.InterfaceC4414b.Supported) {
                labelC = mx.b.b(this.addressFormatter.b(((TripStateData.InterfaceC4414b.Supported) selectedPlaceType).getValue()), "selectedPlaceDescription");
            } else {
                if (!(selectedPlaceType instanceof TripStateData.InterfaceC4414b.a)) {
                    throw new p();
                }
                mx.c cVar = this.labelProvider;
                TripStateData.InterfaceC4414b.a aVar2 = (TripStateData.InterfaceC4414b.a) selectedPlaceType;
                if (aVar2 instanceof TripStateData.InterfaceC4414b.a.PlaceInPoland) {
                    i15 = r93.a.C0;
                } else {
                    if (!(aVar2 instanceof TripStateData.InterfaceC4414b.a.Unknown)) {
                        throw new p();
                    }
                    i15 = r93.a.B0;
                }
                labelC = cVar.c(i15);
            }
            LatLng latLngC = j10.a.c(selectedPlaceType.getCoordinates());
            boolean zA = selectedPlaceType.a();
            k30.a.Large large = new k30.a.Large(false, 1, null);
            k30.d.a aVar3 = k30.d.a.f107773a;
            k30.c.WithText withText = new k30.c.WithText(this.labelProvider.c(r93.a.f172482i), null, 2, null);
            boolean zA2 = selectedPlaceType.a();
            if (zA2) {
                bVar = k30.b.c.f107768a;
            } else {
                if (zA2) {
                    throw new p();
                }
                bVar = k30.b.C2562b.f107767a;
            }
            selectedPlaceData = new SelectedPlaceData(labelC2, labelC, latLngC, zA, new ButtonData(null, null, large, withText, aVar3, bVar, new er.a() { // from class: qb3.b
                @Override // er.a
                public final Object a() {
                    return f.m(selectedPlaceType, lVar);
                }
            }, 3, null));
        }
        return new v.a.Initialized.MapData(z15, aVar, selectedPlaceData, new l() { // from class: qb3.c
            @Override // er.l
            public final Object b(Object obj) {
                return f.q(lVar2, (LatLng) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(TripStateData.InterfaceC4414b interfaceC4414b, l lVar) {
        Place value;
        TripStateData.InterfaceC4414b.Supported supported = interfaceC4414b instanceof TripStateData.InterfaceC4414b.Supported ? (TripStateData.InterfaceC4414b.Supported) interfaceC4414b : null;
        if (supported != null && (value = supported.getValue()) != null) {
            lVar.b(value);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(l lVar, LatLng latLng) {
        lVar.b(j10.a.a(latLng));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, boolean z15) {
        if (z15 && (params.getState() instanceof o.b)) {
            params.h().a();
        } else if (!z15 && (params.getState() instanceof o.c)) {
            params.c().a();
        }
        return i0.f148189a;
    }

    private final List<DefaultSingleCardData> u(List<LocationDetails> list, final l<? super LocationDetails, i0> lVar) {
        List<LocationDetails> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            final LocationDetails locationDetails = (LocationDetails) obj;
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: qb3.a
                @Override // er.a
                public final Object a() {
                    return f.v(lVar, locationDetails);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(this.addressFormatter.a(fa3.b.c(locationDetails)), "hint#" + i15), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(l lVar, LocationDetails locationDetails) {
        lVar.b(locationDetails);
        return i0.f148189a;
    }

    private final List<DefaultSingleCardData> x(List<PlaceSuggestion> list, final l<? super PlaceSuggestion, i0> lVar) {
        List<PlaceSuggestion> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        int i15 = 0;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                pq.v.x();
            }
            final PlaceSuggestion placeSuggestion = (PlaceSuggestion) obj;
            arrayList.add(new DefaultSingleCardData(null, new er.a() { // from class: qb3.d
                @Override // er.a
                public final Object a() {
                    return f.z(lVar, placeSuggestion);
                }
            }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(this.addressFormatter.a(placeSuggestion), "hint#" + i15), null, null, 0, 0, null, 62, null)), null, 5, null), null, x0.Icon.INSTANCE.b(), null, 2813, null));
            i15 = i16;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(l lVar, PlaceSuggestion placeSuggestion) {
        lVar.b(placeSuggestion);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public v.a b(final Params params) {
        CardListData cards;
        List<k> listD;
        o state = params.getState();
        if (state instanceof o.a) {
            return new v.a.Error(((o.a) params.getState()).getVmsAdapter());
        }
        if (!(state instanceof o.b) && !(state instanceof o.c)) {
            throw new p();
        }
        o state2 = params.getState();
        Integer numValueOf = null;
        o.c cVar = state2 instanceof o.c ? (o.c) state2 : null;
        v.a.Initialized.InterfaceC3582b interfaceC3582bE = cVar != null ? E(cVar, params.i(), params.f()) : null;
        o state3 = params.getState();
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, (state3 instanceof o.b ? (o.b) state3 : null) != null ? new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(r93.a.E0), null, null, null, 28, null) : null, null, null, null, null, 61, null);
        String query = params.getState().getData().getQuery();
        l<String, i0> lVarJ = params.j();
        boolean z15 = params.getState() instanceof o.c;
        l lVar = new l() { // from class: qb3.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.s(params, ((Boolean) obj).booleanValue());
            }
        };
        er.a<i0> aVarK = params.k();
        Label labelC = this.labelProvider.c(r93.a.Q);
        v.a.Initialized.InterfaceC3582b.Hints hints = interfaceC3582bE instanceof v.a.Initialized.InterfaceC3582b.Hints ? (v.a.Initialized.InterfaceC3582b.Hints) interfaceC3582bE : null;
        if (hints != null && (cards = hints.getCards()) != null && (listD = cards.d()) != null) {
            numValueOf = Integer.valueOf(listD.size());
        }
        return new v.a.Initialized(baseScaffoldData, new SearchBarData(query, lVarJ, z15, lVar, aVarK, labelC, null, numValueOf, 64, null), l(params.getState(), params.e(), params.g(), params.d()), interfaceC3582bE, params.a());
    }
}
