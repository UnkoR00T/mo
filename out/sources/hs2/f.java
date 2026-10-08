package hs2;

import b30.AccordionData;
import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lhs2/f;", "Ll00/e;", "Lhs2/f$a;", "a", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lhs2/f$a;", "", "b", "a", "Lhs2/f$a$a;", "Lhs2/f$a$b;", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: hs2.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001a\u0010 ¨\u0006!"}, d2 = {"Lhs2/f$a$a;", "Lhs2/f$a;", "Li50/a;", "scaffoldData", "", "Ln50/g;", "violation", "Lb30/a;", "violationPlaceAccordionData", "vehicleAccordionData", "<init>", "(Li50/a;Ljava/util/List;Lb30/a;Lb30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lb30/a;", "d", "()Lb30/a;", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DataLoaded implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<DefaultSingleCardData> violation;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionData violationPlaceAccordionData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionData vehicleAccordionData;

            public DataLoaded(BaseScaffoldData baseScaffoldData, List<DefaultSingleCardData> list, AccordionData accordionData, AccordionData accordionData2) {
                this.scaffoldData = baseScaffoldData;
                this.violation = list;
                this.violationPlaceAccordionData = accordionData;
                this.vehicleAccordionData = accordionData2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final AccordionData getVehicleAccordionData() {
                return this.vehicleAccordionData;
            }

            public final List<DefaultSingleCardData> c() {
                return this.violation;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final AccordionData getViolationPlaceAccordionData() {
                return this.violationPlaceAccordionData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DataLoaded)) {
                    return false;
                }
                DataLoaded dataLoaded = (DataLoaded) other;
                return t.c(this.scaffoldData, dataLoaded.scaffoldData) && t.c(this.violation, dataLoaded.violation) && t.c(this.violationPlaceAccordionData, dataLoaded.violationPlaceAccordionData) && t.c(this.vehicleAccordionData, dataLoaded.vehicleAccordionData);
            }

            public int hashCode() {
                return (((((this.scaffoldData.hashCode() * 31) + this.violation.hashCode()) * 31) + this.violationPlaceAccordionData.hashCode()) * 31) + this.vehicleAccordionData.hashCode();
            }

            public String toString() {
                return "DataLoaded(scaffoldData=" + this.scaffoldData + ", violation=" + this.violation + ", violationPlaceAccordionData=" + this.violationPlaceAccordionData + ", vehicleAccordionData=" + this.vehicleAccordionData + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhs2/f$a$b;", "Lhs2/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f86546a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 852052822;
            }

            public String toString() {
                return "Empty";
            }
        }
    }
}
