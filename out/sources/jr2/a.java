package jr2;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ljr2/a;", "", "Ljr2/a$a;", "t4", "()Ljr2/a$a;", "a", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: jr2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Ljr2/a$a;", "", "Lar2/a$a;", "locationData", "Lgr2/a$a;", "reasonData", "Lmr2/a$a;", "invalidateData", "<init>", "(Lar2/a$a;Lgr2/a$a;Lmr2/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lar2/a$a;", "b", "()Lar2/a$a;", "Lgr2/a$a;", "c", "()Lgr2/a$a;", "Lmr2/a$a;", "()Lmr2/a$a;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SuccessData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ar2.a.Data locationData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final gr2.a.Data reasonData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final mr2.a.InvalidateData invalidateData;

        public SuccessData(ar2.a.Data data, gr2.a.Data data2, mr2.a.InvalidateData invalidateData) {
            this.locationData = data;
            this.reasonData = data2;
            this.invalidateData = invalidateData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final mr2.a.InvalidateData getInvalidateData() {
            return this.invalidateData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ar2.a.Data getLocationData() {
            return this.locationData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final gr2.a.Data getReasonData() {
            return this.reasonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuccessData)) {
                return false;
            }
            SuccessData successData = (SuccessData) other;
            return t.c(this.locationData, successData.locationData) && t.c(this.reasonData, successData.reasonData) && t.c(this.invalidateData, successData.invalidateData);
        }

        public int hashCode() {
            return (((this.locationData.hashCode() * 31) + this.reasonData.hashCode()) * 31) + this.invalidateData.hashCode();
        }

        public String toString() {
            return "SuccessData(locationData=" + this.locationData + ", reasonData=" + this.reasonData + ", invalidateData=" + this.invalidateData + ')';
        }
    }

    SuccessData t4();
}
