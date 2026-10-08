package ph3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.Map;
import mx.Label;
import p071kotlin.Metadata;
import sv0.v0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lph3/g;", "Ll00/e;", "Lph3/g$a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<Data> {

    /* JADX INFO: renamed from: ph3.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b'\u0010(R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\"\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b)\u0010-R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b\u001e\u0010/¨\u00060"}, d2 = {"Lph3/g$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "header", "", "vehicleImageRes", "", "isTopSpaceOfImageRequired", "", "Lsv0/v0;", "Lh30/a;", "damageButtons", "Lhz/b;", "validationState", "buttonNextData", "<init>", "(Li50/a;Lmx/a;Ljava/lang/Integer;ZLjava/util/Map;Lhz/b;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "Z", "g", "()Z", "e", "Ljava/util/Map;", "()Ljava/util/Map;", "Lhz/b;", "()Lhz/b;", "Lh30/a;", "()Lh30/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label header;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer vehicleImageRes;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isTopSpaceOfImageRequired;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<v0, ButtonData> damageButtons;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData buttonNextData;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Integer num, boolean z15, Map<v0, ButtonData> map, hz.b bVar, ButtonData buttonData) {
            this.baseScaffoldData = baseScaffoldData;
            this.header = label;
            this.vehicleImageRes = num;
            this.isTopSpaceOfImageRequired = z15;
            this.damageButtons = map;
            this.validationState = bVar;
            this.buttonNextData = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ButtonData getButtonNextData() {
            return this.buttonNextData;
        }

        public final Map<v0, ButtonData> c() {
            return this.damageButtons;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.header, data.header) && fr.t.c(this.vehicleImageRes, data.vehicleImageRes) && this.isTopSpaceOfImageRequired == data.isTopSpaceOfImageRequired && fr.t.c(this.damageButtons, data.damageButtons) && fr.t.c(this.validationState, data.validationState) && fr.t.c(this.buttonNextData, data.buttonNextData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Integer getVehicleImageRes() {
            return this.vehicleImageRes;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsTopSpaceOfImageRequired() {
            return this.isTopSpaceOfImageRequired;
        }

        public int hashCode() {
            int iHashCode = ((this.baseScaffoldData.hashCode() * 31) + this.header.hashCode()) * 31;
            Integer num = this.vehicleImageRes;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isTopSpaceOfImageRequired)) * 31;
            Map<v0, ButtonData> map = this.damageButtons;
            return ((((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31) + this.validationState.hashCode()) * 31) + this.buttonNextData.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", header=" + this.header + ", vehicleImageRes=" + this.vehicleImageRes + ", isTopSpaceOfImageRequired=" + this.isTopSpaceOfImageRequired + ", damageButtons=" + this.damageButtons + ", validationState=" + this.validationState + ", buttonNextData=" + this.buttonNextData + ')';
        }
    }
}
