package qj1;

import com.google.android.gms.maps.model.LatLng;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;
import tj1.SelectableLocationData;
import tj1.TrainingPointClusterItem;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0004\u0007R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lqj1/j;", "Ll00/e;", "Lqj1/j$a;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "b", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0007\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lqj1/j$a;", "", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "onBack", "b", "Lqj1/j$a$a;", "Lqj1/j$a$b;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: qj1.j$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001d\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b&\u00100R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b+\u00100¨\u00061"}, d2 = {"Lqj1/j$a$a;", "Lqj1/j$a;", "Li50/a;", "baseScaffoldData", "Ly30/n$b;", "controllersData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lmx/a;", "nearestTitle", "remainingTitle", "", "showTitlesForTwoLists", "Ln30/b;", "nearestCards", "remainingCards", "<init>", "(Li50/a;Ly30/n$b;Ler/a;Lmx/a;Lmx/a;ZLn30/b;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Ly30/n$b;", "c", "()Ly30/n$b;", "Ler/a;", "()Ler/a;", "d", "Lmx/a;", "e", "()Lmx/a;", "g", "f", "Z", "h", "()Z", "Ln30/b;", "()Ln30/b;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LocationList implements a {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f166826i = y30.n.Switch.f223693f | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final y30.n.Switch controllersData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label nearestTitle;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label remainingTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean showTitlesForTwoLists;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData nearestCards;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData remainingCards;

            public LocationList(BaseScaffoldData baseScaffoldData, y30.n.Switch r15, er.a<oq.i0> aVar, Label label, Label label2, boolean z15, CardListData cardListData, CardListData cardListData2) {
                this.baseScaffoldData = baseScaffoldData;
                this.controllersData = r15;
                this.onBack = aVar;
                this.nearestTitle = label;
                this.remainingTitle = label2;
                this.showTitlesForTwoLists = z15;
                this.nearestCards = cardListData;
                this.remainingCards = cardListData2;
            }

            @Override // qj1.j.a
            public er.a<oq.i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public y30.n.Switch getControllersData() {
                return this.controllersData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final CardListData getNearestCards() {
                return this.nearestCards;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getNearestTitle() {
                return this.nearestTitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LocationList)) {
                    return false;
                }
                LocationList locationList = (LocationList) other;
                return fr.t.c(this.baseScaffoldData, locationList.baseScaffoldData) && fr.t.c(this.controllersData, locationList.controllersData) && fr.t.c(this.onBack, locationList.onBack) && fr.t.c(this.nearestTitle, locationList.nearestTitle) && fr.t.c(this.remainingTitle, locationList.remainingTitle) && this.showTitlesForTwoLists == locationList.showTitlesForTwoLists && fr.t.c(this.nearestCards, locationList.nearestCards) && fr.t.c(this.remainingCards, locationList.remainingCards);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final CardListData getRemainingCards() {
                return this.remainingCards;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getRemainingTitle() {
                return this.remainingTitle;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final boolean getShowTitlesForTwoLists() {
                return this.showTitlesForTwoLists;
            }

            public int hashCode() {
                return (((((((((((((this.baseScaffoldData.hashCode() * 31) + this.controllersData.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.nearestTitle.hashCode()) * 31) + this.remainingTitle.hashCode()) * 31) + Boolean.hashCode(this.showTitlesForTwoLists)) * 31) + this.nearestCards.hashCode()) * 31) + this.remainingCards.hashCode();
            }

            public String toString() {
                return "LocationList(baseScaffoldData=" + this.baseScaffoldData + ", controllersData=" + this.controllersData + ", onBack=" + this.onBack + ", nearestTitle=" + this.nearestTitle + ", remainingTitle=" + this.remainingTitle + ", showTitlesForTwoLists=" + this.showTitlesForTwoLists + ", nearestCards=" + this.nearestCards + ", remainingCards=" + this.remainingCards + ')';
            }
        }

        /* JADX INFO: renamed from: qj1.j$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b&\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b1\u00102R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b8\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b-\u0010?R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b;\u0010@\u001a\u0004\b6\u0010AR)\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u00178\u0006¢\u0006\f\n\u0004\b4\u0010B\u001a\u0004\b=\u0010C¨\u0006D"}, d2 = {"Lqj1/j$a$b;", "Lqj1/j$a;", "Li50/a;", "baseScaffoldData", "Ly30/n$b;", "controllersData", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lqj1/g;", "initialMapPosition", "", "isMyLocationEnabled", "Lh30/a;", "navigationButtonData", "Ltj1/a;", "selectableLocationDetailsData", "", "Ltj1/b;", "clustersList", "Lmu/g;", "Lqj1/j$b;", "mapSideEffects", "Lkotlin/Function2;", "", "onPointClick", "<init>", "(Li50/a;Ly30/n$b;Ler/a;Lqj1/g;ZLh30/a;Ltj1/a;Ljava/util/List;Lmu/g;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Ly30/n$b;", "d", "()Ly30/n$b;", "c", "Ler/a;", "()Ler/a;", "Lqj1/g;", "e", "()Lqj1/g;", "Z", "j", "()Z", "f", "Lh30/a;", "g", "()Lh30/a;", "Ltj1/a;", "i", "()Ltj1/a;", "h", "Ljava/util/List;", "()Ljava/util/List;", "Lmu/g;", "()Lmu/g;", "Ler/p;", "()Ler/p;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LocationMap implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final y30.n.Switch controllersData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final MapPosition initialMapPosition;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isMyLocationEnabled;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData navigationButtonData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final SelectableLocationData selectableLocationDetailsData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<TrainingPointClusterItem> clustersList;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final mu.g<b> mapSideEffects;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.p<TrainingPointClusterItem, Float, oq.i0> onPointClick;

            /* JADX WARN: Multi-variable type inference failed */
            public LocationMap(BaseScaffoldData baseScaffoldData, y30.n.Switch r15, er.a<oq.i0> aVar, MapPosition mapPosition, boolean z15, ButtonData buttonData, SelectableLocationData selectableLocationData, List<TrainingPointClusterItem> list, mu.g<? extends b> gVar, er.p<? super TrainingPointClusterItem, ? super Float, oq.i0> pVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.controllersData = r15;
                this.onBack = aVar;
                this.initialMapPosition = mapPosition;
                this.isMyLocationEnabled = z15;
                this.navigationButtonData = buttonData;
                this.selectableLocationDetailsData = selectableLocationData;
                this.clustersList = list;
                this.mapSideEffects = gVar;
                this.onPointClick = pVar;
            }

            @Override // qj1.j.a
            public er.a<oq.i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final List<TrainingPointClusterItem> c() {
                return this.clustersList;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public y30.n.Switch getControllersData() {
                return this.controllersData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final MapPosition getInitialMapPosition() {
                return this.initialMapPosition;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LocationMap)) {
                    return false;
                }
                LocationMap locationMap = (LocationMap) other;
                return fr.t.c(this.baseScaffoldData, locationMap.baseScaffoldData) && fr.t.c(this.controllersData, locationMap.controllersData) && fr.t.c(this.onBack, locationMap.onBack) && fr.t.c(this.initialMapPosition, locationMap.initialMapPosition) && this.isMyLocationEnabled == locationMap.isMyLocationEnabled && fr.t.c(this.navigationButtonData, locationMap.navigationButtonData) && fr.t.c(this.selectableLocationDetailsData, locationMap.selectableLocationDetailsData) && fr.t.c(this.clustersList, locationMap.clustersList) && fr.t.c(this.mapSideEffects, locationMap.mapSideEffects) && fr.t.c(this.onPointClick, locationMap.onPointClick);
            }

            public final mu.g<b> f() {
                return this.mapSideEffects;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final ButtonData getNavigationButtonData() {
                return this.navigationButtonData;
            }

            public final er.p<TrainingPointClusterItem, Float, oq.i0> h() {
                return this.onPointClick;
            }

            public int hashCode() {
                int iHashCode = ((((this.baseScaffoldData.hashCode() * 31) + this.controllersData.hashCode()) * 31) + this.onBack.hashCode()) * 31;
                MapPosition mapPosition = this.initialMapPosition;
                int iHashCode2 = (((((iHashCode + (mapPosition == null ? 0 : mapPosition.hashCode())) * 31) + Boolean.hashCode(this.isMyLocationEnabled)) * 31) + this.navigationButtonData.hashCode()) * 31;
                SelectableLocationData selectableLocationData = this.selectableLocationDetailsData;
                return ((((((iHashCode2 + (selectableLocationData != null ? selectableLocationData.hashCode() : 0)) * 31) + this.clustersList.hashCode()) * 31) + this.mapSideEffects.hashCode()) * 31) + this.onPointClick.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final SelectableLocationData getSelectableLocationDetailsData() {
                return this.selectableLocationDetailsData;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final boolean getIsMyLocationEnabled() {
                return this.isMyLocationEnabled;
            }

            public String toString() {
                return "LocationMap(baseScaffoldData=" + this.baseScaffoldData + ", controllersData=" + this.controllersData + ", onBack=" + this.onBack + ", initialMapPosition=" + this.initialMapPosition + ", isMyLocationEnabled=" + this.isMyLocationEnabled + ", navigationButtonData=" + this.navigationButtonData + ", selectableLocationDetailsData=" + this.selectableLocationDetailsData + ", clustersList=" + this.clustersList + ", mapSideEffects=" + this.mapSideEffects + ", onPointClick=" + this.onPointClick + ')';
            }
        }

        er.a<oq.i0> a();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lqj1/j$b;", "", "a", "Lqj1/j$b$a;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: qj1.j$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lqj1/j$b$a;", "Lqj1/j$b;", "Lcom/google/android/gms/maps/model/LatLng;", "coordinates", "Lqj1/e;", "type", "Lkotlin/Function0;", "Loq/i0;", "onFinished", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;Lqj1/e;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/android/gms/maps/model/LatLng;", "()Lcom/google/android/gms/maps/model/LatLng;", "b", "Lqj1/e;", "c", "()Lqj1/e;", "Ler/a;", "()Ler/a;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MoveCamera implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final LatLng coordinates;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final e type;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onFinished;

            public MoveCamera(LatLng latLng, e eVar, er.a<oq.i0> aVar) {
                this.coordinates = latLng;
                this.type = eVar;
                this.onFinished = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final LatLng getCoordinates() {
                return this.coordinates;
            }

            public final er.a<oq.i0> b() {
                return this.onFinished;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final e getType() {
                return this.type;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MoveCamera)) {
                    return false;
                }
                MoveCamera moveCamera = (MoveCamera) other;
                return fr.t.c(this.coordinates, moveCamera.coordinates) && this.type == moveCamera.type && fr.t.c(this.onFinished, moveCamera.onFinished);
            }

            public int hashCode() {
                int iHashCode = ((this.coordinates.hashCode() * 31) + this.type.hashCode()) * 31;
                er.a<oq.i0> aVar = this.onFinished;
                return iHashCode + (aVar == null ? 0 : aVar.hashCode());
            }

            public String toString() {
                return "MoveCamera(coordinates=" + this.coordinates + ", type=" + this.type + ", onFinished=" + this.onFinished + ')';
            }
        }
    }

    oz.j a();
}
