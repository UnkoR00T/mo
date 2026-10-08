package v12;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lv12/c;", "Ll00/e;", "Lv12/c$a;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u0007B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lv12/c$a;", "", "Lkotlin/Function0;", "Loq/i0;", "backAction", "<init>", "(Ler/a;)V", "a", "Ler/a;", "()Ler/a;", "b", "Lv12/c$a$a;", "Lv12/c$a$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: v12.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u001d\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lv12/c$a$a;", "Lv12/c$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "headerLabel", "Lx12/a;", CMSAttributeTableGenerator.CONTENT_TYPE, "Lh30/a;", "nextButton", "Lkotlin/Function0;", "Loq/i0;", "back", "<init>", "(Li50/a;Lmx/a;Lx12/a;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Li50/a;", "()Li50/a;", "c", "Lmx/a;", "d", "()Lmx/a;", "Lx12/a;", "()Lx12/a;", "e", "Lh30/a;", "()Lh30/a;", "f", "Ler/a;", "getBack", "()Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized extends a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f203054g = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerLabel;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final x12.a contentType;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButton;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> back;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, x12.a aVar, ButtonData buttonData, er.a<i0> aVar2) {
                super(aVar2, null);
                this.baseScaffoldData = baseScaffoldData;
                this.headerLabel = label;
                this.contentType = aVar;
                this.nextButton = buttonData;
                this.back = aVar2;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final x12.a getContentType() {
                return this.contentType;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getHeaderLabel() {
                return this.headerLabel;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ButtonData getNextButton() {
                return this.nextButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.headerLabel, initialized.headerLabel) && fr.t.c(this.contentType, initialized.contentType) && fr.t.c(this.nextButton, initialized.nextButton) && fr.t.c(this.back, initialized.back);
            }

            public int hashCode() {
                return (((((((this.baseScaffoldData.hashCode() * 31) + this.headerLabel.hashCode()) * 31) + this.contentType.hashCode()) * 31) + this.nextButton.hashCode()) * 31) + this.back.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", headerLabel=" + this.headerLabel + ", contentType=" + this.contentType + ", nextButton=" + this.nextButton + ", back=" + this.back + ')';
            }
        }

        /* JADX INFO: renamed from: v12.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lv12/c$a$b;", "Lv12/c$a;", "Lx70/a;", "loaderData", "Lkotlin/Function0;", "Loq/i0;", "back", "<init>", "(Lx70/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lx70/a;", "()Lx70/a;", "c", "Ler/a;", "getBack", "()Ler/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Loading extends a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f203060d = x70.a.f217278b;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final x70.a loaderData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> back;

            public Loading(x70.a aVar, er.a<i0> aVar2) {
                super(aVar2, null);
                this.loaderData = aVar;
                this.back = aVar2;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final x70.a getLoaderData() {
                return this.loaderData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loading)) {
                    return false;
                }
                Loading loading = (Loading) other;
                return fr.t.c(this.loaderData, loading.loaderData) && fr.t.c(this.back, loading.back);
            }

            public int hashCode() {
                return (this.loaderData.hashCode() * 31) + this.back.hashCode();
            }

            public String toString() {
                return "Loading(loaderData=" + this.loaderData + ", back=" + this.back + ')';
            }
        }

        public /* synthetic */ a(er.a aVar, fr.k kVar) {
            this(aVar);
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        private a(er.a<i0> aVar) {
            this.backAction = aVar;
        }
    }

    oz.j a();
}
