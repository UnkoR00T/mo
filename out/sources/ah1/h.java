package ah1;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lah1/h;", "T", "", "a", "b", "Lah1/h$a;", "Lah1/h$b;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h<T> {

    /* JADX INFO: renamed from: ah1.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lah1/h$a;", "Lah1/h;", "Lay0/c;", "", "position", "data", "", "isLoading", "<init>", "(ILay0/c;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lay0/c;", "()Lay0/c;", "c", "Z", "()Z", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AirQualityWidgetData implements h<ay0.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int position;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ay0.c data;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        public AirQualityWidgetData(int i15, ay0.c cVar, boolean z15) {
            this.position = i15;
            this.data = cVar;
            this.isLoading = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public ay0.c getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public int getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsLoading() {
            return this.isLoading;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AirQualityWidgetData)) {
                return false;
            }
            AirQualityWidgetData airQualityWidgetData = (AirQualityWidgetData) other;
            return this.position == airQualityWidgetData.position && t.c(this.data, airQualityWidgetData.data) && this.isLoading == airQualityWidgetData.isLoading;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.position) * 31;
            ay0.c cVar = this.data;
            return ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "AirQualityWidgetData(position=" + this.position + ", data=" + this.data + ", isLoading=" + this.isLoading + ')';
        }
    }

    /* JADX INFO: renamed from: ah1.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lah1/h$b;", "Lah1/h;", "Lq44/c;", "", "position", "data", "", "isLoading", "<init>", "(ILq44/c;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lq44/c;", "()Lq44/c;", "c", "Z", "()Z", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentsWidgetData implements h<q44.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int position;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final q44.c data;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoading;

        public PaymentsWidgetData(int i15, q44.c cVar, boolean z15) {
            this.position = i15;
            this.data = cVar;
            this.isLoading = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public q44.c getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public int getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsLoading() {
            return this.isLoading;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentsWidgetData)) {
                return false;
            }
            PaymentsWidgetData paymentsWidgetData = (PaymentsWidgetData) other;
            return this.position == paymentsWidgetData.position && t.c(this.data, paymentsWidgetData.data) && this.isLoading == paymentsWidgetData.isLoading;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.position) * 31;
            q44.c cVar = this.data;
            return ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "PaymentsWidgetData(position=" + this.position + ", data=" + this.data + ", isLoading=" + this.isLoading + ')';
        }
    }
}
