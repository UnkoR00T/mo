package kj3;

import fr.t;
import i50.BaseScaffoldData;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lkj3/f;", "Ll00/e;", "Lkj3/f$a;", "a", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<Data> {

    /* JADX INFO: renamed from: kj3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\u001e\u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b!\u0010(¨\u0006)"}, d2 = {"Lkj3/f$a;", "", "Li50/a;", "scaffoldData", "Lc30/b$b;", "alertData", "", "Ln50/k;", "serviceSingleCardDataItems", "Lc30/b$c;", "infoAlert", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lc30/b$b;Ljava/util/List;Lc30/b$c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lc30/b$b;", "()Lc30/b$b;", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lc30/b$c;", "()Lc30/b$c;", "Ler/a;", "()Ler/a;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b.C0606b alertData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<n50.k> serviceSingleCardDataItems;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b.c infoAlert;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(BaseScaffoldData baseScaffoldData, c30.b.C0606b c0606b, List<? extends n50.k> list, c30.b.c cVar, er.a<i0> aVar) {
            this.scaffoldData = baseScaffoldData;
            this.alertData = c0606b;
            this.serviceSingleCardDataItems = list;
            this.infoAlert = cVar;
            this.onBackAction = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c30.b.C0606b getAlertData() {
            return this.alertData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c30.b.c getInfoAlert() {
            return this.infoAlert;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public final List<n50.k> e() {
            return this.serviceSingleCardDataItems;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.alertData, data.alertData) && t.c(this.serviceSingleCardDataItems, data.serviceSingleCardDataItems) && t.c(this.infoAlert, data.infoAlert) && t.c(this.onBackAction, data.onBackAction);
        }

        public int hashCode() {
            int iHashCode = this.scaffoldData.hashCode() * 31;
            c30.b.C0606b c0606b = this.alertData;
            return ((((((iHashCode + (c0606b == null ? 0 : c0606b.hashCode())) * 31) + this.serviceSingleCardDataItems.hashCode()) * 31) + this.infoAlert.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", alertData=" + this.alertData + ", serviceSingleCardDataItems=" + this.serviceSingleCardDataItems + ", infoAlert=" + this.infoAlert + ", onBackAction=" + this.onBackAction + ')';
        }
    }
}
