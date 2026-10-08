package s62;

import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ls62/d;", "Ll00/e;", "Ls62/d$a;", "a", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: s62.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006\""}, d2 = {"Ls62/d$a;", "", "Lmx/a;", "ticketName", "Ln30/b;", "ticketDetails", "Lc30/b;", "alertData", "Li50/a;", "scaffoldData", "<init>", "(Lmx/a;Ln30/b;Lc30/b;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "Ln30/b;", "c", "()Ln30/b;", "Lc30/b;", "()Lc30/b;", "Li50/a;", "()Li50/a;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f178276e = BaseScaffoldData.f89350g | c30.b.f22944i;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label ticketName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData ticketDetails;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b alertData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        public Data(Label label, CardListData cardListData, c30.b bVar, BaseScaffoldData baseScaffoldData) {
            this.ticketName = label;
            this.ticketDetails = cardListData;
            this.alertData = bVar;
            this.scaffoldData = baseScaffoldData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c30.b getAlertData() {
            return this.alertData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final CardListData getTicketDetails() {
            return this.ticketDetails;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getTicketName() {
            return this.ticketName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.ticketName, data.ticketName) && t.c(this.ticketDetails, data.ticketDetails) && t.c(this.alertData, data.alertData) && t.c(this.scaffoldData, data.scaffoldData);
        }

        public int hashCode() {
            int iHashCode = ((this.ticketName.hashCode() * 31) + this.ticketDetails.hashCode()) * 31;
            c30.b bVar = this.alertData;
            return ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.scaffoldData.hashCode();
        }

        public String toString() {
            return "Data(ticketName=" + this.ticketName + ", ticketDetails=" + this.ticketDetails + ", alertData=" + this.alertData + ", scaffoldData=" + this.scaffoldData + ')';
        }
    }
}
