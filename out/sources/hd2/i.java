package hd2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lhd2/i;", "Ll00/e;", "Lhd2/i$a;", "a", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lhd2/i$a;", "", "c", "a", "b", "Lhd2/i$a$a;", "Lhd2/i$a$b;", "Lhd2/i$a$c;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: hd2.i$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhd2/i$a$a;", "Lhd2/i$a;", "Lhb4/c;", "vmsAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: hd2.i$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b\u001c\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b \u0010+R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b)\u0010-¨\u0006."}, d2 = {"Lhd2/i$a$b;", "Lhd2/i$a;", "Li50/a;", "scaffoldData", "Lhd2/i$a$b$a;", "headerData", "Ln50/k;", "fieldData", "Lc30/b;", "alertData", "Lh30/a;", "buttonData", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "<init>", "(Li50/a;Lhd2/i$a$b$a;Ln50/k;Lc30/b;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "f", "()Li50/a;", "b", "Lhd2/i$a$b$a;", "d", "()Lhd2/i$a$b$a;", "c", "Ln50/k;", "()Ln50/k;", "Lc30/b;", "()Lc30/b;", "e", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final HeaderData headerData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k fieldData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onCloseClick;

            /* JADX INFO: renamed from: hd2.i$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lhd2/i$a$b$a;", "", "Lmx/a;", "title", "subtitle", "<init>", "(Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class HeaderData {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label title;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label subtitle;

                public HeaderData(Label label, Label label2) {
                    this.title = label;
                    this.subtitle = label2;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final Label getSubtitle() {
                    return this.subtitle;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Label getTitle() {
                    return this.title;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof HeaderData)) {
                        return false;
                    }
                    HeaderData headerData = (HeaderData) other;
                    return fr.t.c(this.title, headerData.title) && fr.t.c(this.subtitle, headerData.subtitle);
                }

                public int hashCode() {
                    return (this.title.hashCode() * 31) + this.subtitle.hashCode();
                }

                public String toString() {
                    return "HeaderData(title=" + this.title + ", subtitle=" + this.subtitle + ')';
                }
            }

            public Initialized(BaseScaffoldData baseScaffoldData, HeaderData headerData, n50.k kVar, c30.b bVar, ButtonData buttonData, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.headerData = headerData;
                this.fieldData = kVar;
                this.alertData = bVar;
                this.buttonData = buttonData;
                this.onCloseClick = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonData getButtonData() {
                return this.buttonData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final n50.k getFieldData() {
                return this.fieldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final HeaderData getHeaderData() {
                return this.headerData;
            }

            public final er.a<oq.i0> e() {
                return this.onCloseClick;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.headerData, initialized.headerData) && fr.t.c(this.fieldData, initialized.fieldData) && fr.t.c(this.alertData, initialized.alertData) && fr.t.c(this.buttonData, initialized.buttonData) && fr.t.c(this.onCloseClick, initialized.onCloseClick);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public int hashCode() {
                return (((((((((this.scaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.fieldData.hashCode()) * 31) + this.alertData.hashCode()) * 31) + this.buttonData.hashCode()) * 31) + this.onCloseClick.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", headerData=" + this.headerData + ", fieldData=" + this.fieldData + ", alertData=" + this.alertData + ", buttonData=" + this.buttonData + ", onCloseClick=" + this.onCloseClick + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhd2/i$a$c;", "Lhd2/i$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f83786a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1935499044;
            }

            public String toString() {
                return "Loading";
            }
        }
    }
}
