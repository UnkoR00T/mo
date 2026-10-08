package s72;

import d72.HydroArea;
import i50.BaseScaffoldData;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ls72/c;", "Ll00/e;", "Ls72/c$a;", "a", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: s72.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\r0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010*\u001a\u0004\b$\u0010+R)\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\r0\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001d\u0010.R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b(\u0010/\u001a\u0004\b,\u00100¨\u00061"}, d2 = {"Ls72/c$a;", "", "Lc30/b;", "infoAlert", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "onResumeEvent", "onPauseEvent", "", "isMyLocationEnabled", "Lvy/c;", "mapViewCoordinates", "", "Ld72/a;", "hydroAreas", "Li50/a;", "scaffoldData", "<init>", "(Lc30/b;Ler/a;Ler/a;Ler/a;ZLvy/c;Ljava/util/List;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lc30/b;", "b", "()Lc30/b;", "Ler/a;", "d", "()Ler/a;", "c", "f", "e", "Z", "h", "()Z", "Lvy/c;", "()Lvy/c;", "g", "Ljava/util/List;", "()Ljava/util/List;", "Li50/a;", "()Li50/a;", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b infoAlert;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onResumeEvent;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPauseEvent;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isMyLocationEnabled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Coordinates mapViewCoordinates;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<List<List<HydroArea>>> hydroAreas;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(c30.b bVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3, boolean z15, Coordinates coordinates, List<? extends List<? extends List<HydroArea>>> list, BaseScaffoldData baseScaffoldData) {
            this.infoAlert = bVar;
            this.onBackClick = aVar;
            this.onResumeEvent = aVar2;
            this.onPauseEvent = aVar3;
            this.isMyLocationEnabled = z15;
            this.mapViewCoordinates = coordinates;
            this.hydroAreas = list;
            this.scaffoldData = baseScaffoldData;
        }

        public final List<List<List<HydroArea>>> a() {
            return this.hydroAreas;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c30.b getInfoAlert() {
            return this.infoAlert;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Coordinates getMapViewCoordinates() {
            return this.mapViewCoordinates;
        }

        public final er.a<i0> d() {
            return this.onBackClick;
        }

        public final er.a<i0> e() {
            return this.onPauseEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.infoAlert, data.infoAlert) && fr.t.c(this.onBackClick, data.onBackClick) && fr.t.c(this.onResumeEvent, data.onResumeEvent) && fr.t.c(this.onPauseEvent, data.onPauseEvent) && this.isMyLocationEnabled == data.isMyLocationEnabled && fr.t.c(this.mapViewCoordinates, data.mapViewCoordinates) && fr.t.c(this.hydroAreas, data.hydroAreas) && fr.t.c(this.scaffoldData, data.scaffoldData);
        }

        public final er.a<i0> f() {
            return this.onResumeEvent;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsMyLocationEnabled() {
            return this.isMyLocationEnabled;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.infoAlert.hashCode() * 31) + this.onBackClick.hashCode()) * 31) + this.onResumeEvent.hashCode()) * 31) + this.onPauseEvent.hashCode()) * 31) + Boolean.hashCode(this.isMyLocationEnabled)) * 31;
            Coordinates coordinates = this.mapViewCoordinates;
            return ((((iHashCode + (coordinates == null ? 0 : coordinates.hashCode())) * 31) + this.hydroAreas.hashCode()) * 31) + this.scaffoldData.hashCode();
        }

        public String toString() {
            return "Data(infoAlert=" + this.infoAlert + ", onBackClick=" + this.onBackClick + ", onResumeEvent=" + this.onResumeEvent + ", onPauseEvent=" + this.onPauseEvent + ", isMyLocationEnabled=" + this.isMyLocationEnabled + ", mapViewCoordinates=" + this.mapViewCoordinates + ", hydroAreas=" + this.hydroAreas + ", scaffoldData=" + this.scaffoldData + ')';
        }
    }
}
