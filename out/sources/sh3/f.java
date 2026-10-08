package sh3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import vh3.VehicleListAddedByPaging;
import vh3.VehicleListAddedManually;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsh3/f;", "Ll00/e;", "Lsh3/f$a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lsh3/f$a;", "", "Li50/a;", "b", "()Li50/a;", "baseScaffoldData", "c", "a", "Lsh3/f$a$a;", "Lsh3/f$a$b;", "Lsh3/f$a$c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: sh3.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0016\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lsh3/f$a$a;", "Lsh3/f$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "description", "Ln50/k;", "singleCardData", "<init>", "(Li50/a;Lmx/a;Lmx/a;Ln50/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lmx/a;", "d", "()Lmx/a;", "c", "Ln50/k;", "()Ln50/k;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Empty implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k singleCardData;

            public Empty(BaseScaffoldData baseScaffoldData, Label label, Label label2, n50.k kVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.title = label;
                this.description = label2;
                this.singleCardData = kVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            @Override // sh3.f.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final n50.k getSingleCardData() {
                return this.singleCardData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Empty)) {
                    return false;
                }
                Empty empty = (Empty) other;
                return fr.t.c(this.baseScaffoldData, empty.baseScaffoldData) && fr.t.c(this.title, empty.title) && fr.t.c(this.description, empty.description) && fr.t.c(this.singleCardData, empty.singleCardData);
            }

            public int hashCode() {
                return (((((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.singleCardData.hashCode();
            }

            public String toString() {
                return "Empty(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", description=" + this.description + ", singleCardData=" + this.singleCardData + ')';
            }
        }

        /* JADX INFO: renamed from: sh3.f$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b$\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001d\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b%\u0010/¨\u00060"}, d2 = {"Lsh3/f$a$b;", "Lsh3/f$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "description", "Lh30/a;", "buttonAdd", "Lvh3/b;", "vehicleListAddedManually", "Lvh3/a;", "vehicleListAddedByPaging", "Lmu/f0;", "Lsh3/d;", "pagerCommandFlow", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lh30/a;Lvh3/b;Lvh3/a;Lmu/f0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lmx/a;", "e", "()Lmx/a;", "c", "d", "Lh30/a;", "()Lh30/a;", "Lvh3/b;", "g", "()Lvh3/b;", "f", "Lvh3/a;", "()Lvh3/a;", "Lmu/f0;", "()Lmu/f0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class List implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonAdd;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final VehicleListAddedManually vehicleListAddedManually;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final VehicleListAddedByPaging vehicleListAddedByPaging;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final mu.f0<d> pagerCommandFlow;

            /* JADX WARN: Multi-variable type inference failed */
            public List(BaseScaffoldData baseScaffoldData, Label label, Label label2, ButtonData buttonData, VehicleListAddedManually vehicleListAddedManually, VehicleListAddedByPaging vehicleListAddedByPaging, mu.f0<? extends d> f0Var) {
                this.baseScaffoldData = baseScaffoldData;
                this.title = label;
                this.description = label2;
                this.buttonAdd = buttonData;
                this.vehicleListAddedManually = vehicleListAddedManually;
                this.vehicleListAddedByPaging = vehicleListAddedByPaging;
                this.pagerCommandFlow = f0Var;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getButtonAdd() {
                return this.buttonAdd;
            }

            @Override // sh3.f.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            public final mu.f0<d> d() {
                return this.pagerCommandFlow;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof List)) {
                    return false;
                }
                List list = (List) other;
                return fr.t.c(this.baseScaffoldData, list.baseScaffoldData) && fr.t.c(this.title, list.title) && fr.t.c(this.description, list.description) && fr.t.c(this.buttonAdd, list.buttonAdd) && fr.t.c(this.vehicleListAddedManually, list.vehicleListAddedManually) && fr.t.c(this.vehicleListAddedByPaging, list.vehicleListAddedByPaging) && fr.t.c(this.pagerCommandFlow, list.pagerCommandFlow);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final VehicleListAddedByPaging getVehicleListAddedByPaging() {
                return this.vehicleListAddedByPaging;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final VehicleListAddedManually getVehicleListAddedManually() {
                return this.vehicleListAddedManually;
            }

            public int hashCode() {
                return (((((((((((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.buttonAdd.hashCode()) * 31) + this.vehicleListAddedManually.hashCode()) * 31) + this.vehicleListAddedByPaging.hashCode()) * 31) + this.pagerCommandFlow.hashCode();
            }

            public String toString() {
                return "List(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", description=" + this.description + ", buttonAdd=" + this.buttonAdd + ", vehicleListAddedManually=" + this.vehicleListAddedManually + ", vehicleListAddedByPaging=" + this.vehicleListAddedByPaging + ", pagerCommandFlow=" + this.pagerCommandFlow + ')';
            }
        }

        /* JADX INFO: renamed from: sh3.f$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lsh3/f$a$c;", "Lsh3/f$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "Lx70/a;", "loaderData", "<init>", "(Li50/a;Lmx/a;Lx70/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lmx/a;", "c", "()Lmx/a;", "Lx70/a;", "()Lx70/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Loader implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f181767d = x70.a.f217278b | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final x70.a loaderData;

            public Loader(BaseScaffoldData baseScaffoldData, Label label, x70.a aVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.title = label;
                this.loaderData = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final x70.a getLoaderData() {
                return this.loaderData;
            }

            @Override // sh3.f.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loader)) {
                    return false;
                }
                Loader loader = (Loader) other;
                return fr.t.c(this.baseScaffoldData, loader.baseScaffoldData) && fr.t.c(this.title, loader.title) && fr.t.c(this.loaderData, loader.loaderData);
            }

            public int hashCode() {
                return (((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.loaderData.hashCode();
            }

            public String toString() {
                return "Loader(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", loaderData=" + this.loaderData + ')';
            }
        }

        /* JADX INFO: renamed from: b */
        BaseScaffoldData getBaseScaffoldData();
    }
}
