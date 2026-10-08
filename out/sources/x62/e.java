package x62;

import i50.BaseScaffoldData;
import ja.n0;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bR(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lx62/e;", "Ll00/e;", "Lx62/e$a;", "Lmu/g;", "Lja/n0;", "Lz62/a;", "y1", "()Lmu/g;", "setTicketPagingDataFlow", "(Lmu/g;)V", "ticketPagingDataFlow", "a", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lx62/e$a;", "", "b", "c", "a", "Lx62/e$a$a;", "Lx62/e$a$b;", "Lx62/e$a$c;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: x62.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lx62/e$a$a;", "Lx62/e$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "description", "<init>", "(Li50/a;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "c", "()Lmx/a;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InformalTaxPayer implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f217010d = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            public InformalTaxPayer(BaseScaffoldData baseScaffoldData, Label label, Label label2) {
                this.baseScaffoldData = baseScaffoldData;
                this.title = label;
                this.description = label2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InformalTaxPayer)) {
                    return false;
                }
                InformalTaxPayer informalTaxPayer = (InformalTaxPayer) other;
                return fr.t.c(this.baseScaffoldData, informalTaxPayer.baseScaffoldData) && fr.t.c(this.title, informalTaxPayer.title) && fr.t.c(this.description, informalTaxPayer.description);
            }

            public int hashCode() {
                return (((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode();
            }

            public String toString() {
                return "InformalTaxPayer(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", description=" + this.description + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lx62/e$a$b;", "Lx62/e$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f217014a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1745181166;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: x62.e$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001a\u0010\"R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(¨\u0006)"}, d2 = {"Lx62/e$a$c;", "Lx62/e$a;", "Lkotlin/Function0;", "Loq/i0;", "backButtonAction", "Ly30/n$b;", "controllersData", "Lc30/b;", "alertData", "Lq40/g;", "emptyTicketsIconPageData", "Li50/a;", "scaffoldData", "<init>", "(Ler/a;Ly30/n$b;Lc30/b;Lq40/g;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "b", "()Ler/a;", "Ly30/n$b;", "c", "()Ly30/n$b;", "Lc30/b;", "()Lc30/b;", "d", "Lq40/g;", "()Lq40/g;", "e", "Li50/a;", "()Li50/a;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f217015f = ((BaseScaffoldData.f89350g | IconPageData.f164667h) | c30.b.f22944i) | y30.n.Switch.f223693f;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> backButtonAction;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final y30.n.Switch controllersData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<i0, i0> emptyTicketsIconPageData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            public Initialized(er.a<i0> aVar, y30.n.Switch r15, c30.b bVar, IconPageData<i0, i0> iconPageData, BaseScaffoldData baseScaffoldData) {
                this.backButtonAction = aVar;
                this.controllersData = r15;
                this.alertData = bVar;
                this.emptyTicketsIconPageData = iconPageData;
                this.scaffoldData = baseScaffoldData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            public final er.a<i0> b() {
                return this.backButtonAction;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final y30.n.Switch getControllersData() {
                return this.controllersData;
            }

            public final IconPageData<i0, i0> d() {
                return this.emptyTicketsIconPageData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.backButtonAction, initialized.backButtonAction) && fr.t.c(this.controllersData, initialized.controllersData) && fr.t.c(this.alertData, initialized.alertData) && fr.t.c(this.emptyTicketsIconPageData, initialized.emptyTicketsIconPageData) && fr.t.c(this.scaffoldData, initialized.scaffoldData);
            }

            public int hashCode() {
                return (((((((this.backButtonAction.hashCode() * 31) + this.controllersData.hashCode()) * 31) + this.alertData.hashCode()) * 31) + this.emptyTicketsIconPageData.hashCode()) * 31) + this.scaffoldData.hashCode();
            }

            public String toString() {
                return "Initialized(backButtonAction=" + this.backButtonAction + ", controllersData=" + this.controllersData + ", alertData=" + this.alertData + ", emptyTicketsIconPageData=" + this.emptyTicketsIconPageData + ", scaffoldData=" + this.scaffoldData + ')';
            }
        }
    }

    mu.g<n0<z62.a>> y1();
}
