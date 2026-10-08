package dc2;

import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ldc2/g;", "Ll00/e;", "Ldc2/g$a;", "a", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ldc2/g$a;", "", "a", "b", "Ldc2/g$a$a;", "Ldc2/g$a$b;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: dc2.g$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ldc2/g$a$a;", "Ldc2/g$a;", "Lhb4/c;", "vmsAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c vmsAdapter;

            public Error(hb4.c cVar) {
                this.vmsAdapter = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getVmsAdapter() {
                return this.vmsAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.vmsAdapter, ((Error) other).vmsAdapter);
            }

            public int hashCode() {
                return this.vmsAdapter.hashCode();
            }

            public String toString() {
                return "Error(vmsAdapter=" + this.vmsAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: dc2.g$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001f\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b%\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006,"}, d2 = {"Ldc2/g$a$b;", "Ldc2/g$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "header", "", "Ln50/k;", "cardsData", "Lc30/b;", "lossDamageAlertData", "identityTheftAlertData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Lmx/a;Ljava/util/List;Lc30/b;Lc30/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "c", "()Lmx/a;", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lc30/b;", "e", "()Lc30/b;", "f", "Ler/a;", "()Ler/a;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label header;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<n50.k> cardsData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b lossDamageAlertData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b identityTheftAlertData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            /* JADX WARN: Multi-variable type inference failed */
            public Initialized(BaseScaffoldData baseScaffoldData, Label label, List<? extends n50.k> list, c30.b bVar, c30.b bVar2, er.a<i0> aVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.header = label;
                this.cardsData = list;
                this.lossDamageAlertData = bVar;
                this.identityTheftAlertData = bVar2;
                this.onBackClick = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final List<n50.k> b() {
                return this.cardsData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getHeader() {
                return this.header;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final c30.b getIdentityTheftAlertData() {
                return this.identityTheftAlertData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final c30.b getLossDamageAlertData() {
                return this.lossDamageAlertData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.header, initialized.header) && fr.t.c(this.cardsData, initialized.cardsData) && fr.t.c(this.lossDamageAlertData, initialized.lossDamageAlertData) && fr.t.c(this.identityTheftAlertData, initialized.identityTheftAlertData) && fr.t.c(this.onBackClick, initialized.onBackClick);
            }

            public final er.a<i0> f() {
                return this.onBackClick;
            }

            public int hashCode() {
                int iHashCode = ((((((this.baseScaffoldData.hashCode() * 31) + this.header.hashCode()) * 31) + this.cardsData.hashCode()) * 31) + this.lossDamageAlertData.hashCode()) * 31;
                c30.b bVar = this.identityTheftAlertData;
                return ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.onBackClick.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", header=" + this.header + ", cardsData=" + this.cardsData + ", lossDamageAlertData=" + this.lossDamageAlertData + ", identityTheftAlertData=" + this.identityTheftAlertData + ", onBackClick=" + this.onBackClick + ')';
            }
        }
    }
}
