package l84;

import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import q40.IconPageData;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Ll84/f;", "Ll00/e;", "Ll84/f$a;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<a> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\n\u000b\u0007B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Ll84/f$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Ler/a;)V", "a", "Ler/a;", "()Ler/a;", "c", "b", "Ll84/f$a$a;", "Ll84/f$a$b;", "Ll84/f$a$c;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final er.a<oq.i0> onBack;

        /* JADX INFO: renamed from: l84.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b$\u0010)R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b*\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u001d\u0010-R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010)¨\u00060"}, d2 = {"Ll84/f$a$a;", "Ll84/f$a;", "Li50/a;", "scaffoldData", "", "Ln84/a;", "messages", "Lmx/a;", "refreshButtonLabel", "Lkotlin/Function0;", "Loq/i0;", "refreshButtonClick", "closeButtonContentDescription", "Lc30/b;", "alertData", "onBack", "<init>", "(Li50/a;Ljava/util/List;Lmx/a;Ler/a;Lmx/a;Lc30/b;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Li50/a;", "f", "()Li50/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lmx/a;", "e", "()Lmx/a;", "Ler/a;", "()Ler/a;", "getCloseButtonContentDescription", "g", "Lc30/b;", "()Lc30/b;", "h", "a", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DataLoaded extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<n84.a> messages;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label refreshButtonLabel;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> refreshButtonClick;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label closeButtonContentDescription;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            /* JADX WARN: Multi-variable type inference failed */
            public DataLoaded(BaseScaffoldData baseScaffoldData, List<? extends n84.a> list, Label label, er.a<oq.i0> aVar, Label label2, c30.b bVar, er.a<oq.i0> aVar2) {
                super(aVar2, null);
                this.scaffoldData = baseScaffoldData;
                this.messages = list;
                this.refreshButtonLabel = label;
                this.refreshButtonClick = aVar;
                this.closeButtonContentDescription = label2;
                this.alertData = bVar;
                this.onBack = aVar2;
            }

            @Override // l84.f.a
            public er.a<oq.i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            public final List<n84.a> c() {
                return this.messages;
            }

            public final er.a<oq.i0> d() {
                return this.refreshButtonClick;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getRefreshButtonLabel() {
                return this.refreshButtonLabel;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DataLoaded)) {
                    return false;
                }
                DataLoaded dataLoaded = (DataLoaded) other;
                return fr.t.c(this.scaffoldData, dataLoaded.scaffoldData) && fr.t.c(this.messages, dataLoaded.messages) && fr.t.c(this.refreshButtonLabel, dataLoaded.refreshButtonLabel) && fr.t.c(this.refreshButtonClick, dataLoaded.refreshButtonClick) && fr.t.c(this.closeButtonContentDescription, dataLoaded.closeButtonContentDescription) && fr.t.c(this.alertData, dataLoaded.alertData) && fr.t.c(this.onBack, dataLoaded.onBack);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.scaffoldData.hashCode() * 31) + this.messages.hashCode()) * 31) + this.refreshButtonLabel.hashCode()) * 31) + this.refreshButtonClick.hashCode()) * 31) + this.closeButtonContentDescription.hashCode()) * 31;
                c30.b bVar = this.alertData;
                return ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.onBack.hashCode();
            }

            public String toString() {
                return "DataLoaded(scaffoldData=" + this.scaffoldData + ", messages=" + this.messages + ", refreshButtonLabel=" + this.refreshButtonLabel + ", refreshButtonClick=" + this.refreshButtonClick + ", closeButtonContentDescription=" + this.closeButtonContentDescription + ", alertData=" + this.alertData + ", onBack=" + this.onBack + ')';
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u001e\u000eB?\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R*\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0001\u0002\u001f ¨\u0006!"}, d2 = {"Ll84/f$a$b;", "Ll84/f$a;", "Li50/a;", "scaffoldData", "Lq40/g;", "Lh30/a;", "emptyStateIconPageData", "Lmx/a;", "closeButtonContentDescription", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Li50/a;Lq40/g;Lmx/a;Ler/a;)V", "b", "Li50/a;", "getScaffoldData", "()Li50/a;", "c", "Lq40/g;", "getEmptyStateIconPageData", "()Lq40/g;", "d", "Lmx/a;", "getCloseButtonContentDescription", "()Lmx/a;", "e", "Ler/a;", "getOnBack", "()Ler/a;", "a", "Ll84/f$a$b$a;", "Ll84/f$a$b$b;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class b extends a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final int f117060f = IconPageData.f164667h | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final IconPageData<ButtonData, ButtonData> emptyStateIconPageData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final Label closeButtonContentDescription;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final er.a<oq.i0> onBack;

            /* JADX INFO: renamed from: l84.f$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR*\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Ll84/f$a$b$a;", "Ll84/f$a$b;", "Li50/a;", "scaffoldData", "Lq40/g;", "Lh30/a;", "emptyStateIconPageData", "Lmx/a;", "closeButtonContentDescription", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Li50/a;Lq40/g;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "g", "Li50/a;", "c", "()Li50/a;", "h", "Lq40/g;", "b", "()Lq40/g;", "i", "Lmx/a;", "getCloseButtonContentDescription", "()Lmx/a;", "j", "Ler/a;", "a", "()Ler/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class NoData extends b {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public static final int f117065k;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseScaffoldData scaffoldData;

                /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
                private final IconPageData<ButtonData, ButtonData> emptyStateIconPageData;

                /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label closeButtonContentDescription;

                /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<oq.i0> onBack;

                static {
                    int i15 = IconPageData.f164667h;
                    int i16 = BaseScaffoldData.f89350g;
                    f117065k = i15 | i15 | i16 | i16;
                }

                public NoData(BaseScaffoldData baseScaffoldData, IconPageData<ButtonData, ButtonData> iconPageData, Label label, er.a<oq.i0> aVar) {
                    super(baseScaffoldData, iconPageData, label, aVar, null);
                    this.scaffoldData = baseScaffoldData;
                    this.emptyStateIconPageData = iconPageData;
                    this.closeButtonContentDescription = label;
                    this.onBack = aVar;
                }

                @Override // l84.f.a
                public er.a<oq.i0> a() {
                    return this.onBack;
                }

                public IconPageData<ButtonData, ButtonData> b() {
                    return this.emptyStateIconPageData;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public BaseScaffoldData getScaffoldData() {
                    return this.scaffoldData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof NoData)) {
                        return false;
                    }
                    NoData noData = (NoData) other;
                    return fr.t.c(this.scaffoldData, noData.scaffoldData) && fr.t.c(this.emptyStateIconPageData, noData.emptyStateIconPageData) && fr.t.c(this.closeButtonContentDescription, noData.closeButtonContentDescription) && fr.t.c(this.onBack, noData.onBack);
                }

                public int hashCode() {
                    return (((((this.scaffoldData.hashCode() * 31) + this.emptyStateIconPageData.hashCode()) * 31) + this.closeButtonContentDescription.hashCode()) * 31) + this.onBack.hashCode();
                }

                public String toString() {
                    return "NoData(scaffoldData=" + this.scaffoldData + ", emptyStateIconPageData=" + this.emptyStateIconPageData + ", closeButtonContentDescription=" + this.closeButtonContentDescription + ", onBack=" + this.onBack + ')';
                }
            }

            /* JADX INFO: renamed from: l84.f$a$b$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR*\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Ll84/f$a$b$b;", "Ll84/f$a$b;", "Li50/a;", "scaffoldData", "Lq40/g;", "Lh30/a;", "emptyStateIconPageData", "Lmx/a;", "closeButtonContentDescription", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Li50/a;Lq40/g;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "g", "Li50/a;", "c", "()Li50/a;", "h", "Lq40/g;", "b", "()Lq40/g;", "i", "Lmx/a;", "getCloseButtonContentDescription", "()Lmx/a;", "j", "Ler/a;", "a", "()Ler/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class NoNotificationPermissions extends b {

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public static final int f117070k;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseScaffoldData scaffoldData;

                /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
                private final IconPageData<ButtonData, ButtonData> emptyStateIconPageData;

                /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label closeButtonContentDescription;

                /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<oq.i0> onBack;

                static {
                    int i15 = IconPageData.f164667h;
                    int i16 = BaseScaffoldData.f89350g;
                    f117070k = i15 | i15 | i16 | i16;
                }

                public NoNotificationPermissions(BaseScaffoldData baseScaffoldData, IconPageData<ButtonData, ButtonData> iconPageData, Label label, er.a<oq.i0> aVar) {
                    super(baseScaffoldData, iconPageData, label, aVar, null);
                    this.scaffoldData = baseScaffoldData;
                    this.emptyStateIconPageData = iconPageData;
                    this.closeButtonContentDescription = label;
                    this.onBack = aVar;
                }

                @Override // l84.f.a
                public er.a<oq.i0> a() {
                    return this.onBack;
                }

                public IconPageData<ButtonData, ButtonData> b() {
                    return this.emptyStateIconPageData;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public BaseScaffoldData getScaffoldData() {
                    return this.scaffoldData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof NoNotificationPermissions)) {
                        return false;
                    }
                    NoNotificationPermissions noNotificationPermissions = (NoNotificationPermissions) other;
                    return fr.t.c(this.scaffoldData, noNotificationPermissions.scaffoldData) && fr.t.c(this.emptyStateIconPageData, noNotificationPermissions.emptyStateIconPageData) && fr.t.c(this.closeButtonContentDescription, noNotificationPermissions.closeButtonContentDescription) && fr.t.c(this.onBack, noNotificationPermissions.onBack);
                }

                public int hashCode() {
                    return (((((this.scaffoldData.hashCode() * 31) + this.emptyStateIconPageData.hashCode()) * 31) + this.closeButtonContentDescription.hashCode()) * 31) + this.onBack.hashCode();
                }

                public String toString() {
                    return "NoNotificationPermissions(scaffoldData=" + this.scaffoldData + ", emptyStateIconPageData=" + this.emptyStateIconPageData + ", closeButtonContentDescription=" + this.closeButtonContentDescription + ", onBack=" + this.onBack + ')';
                }
            }

            public /* synthetic */ b(BaseScaffoldData baseScaffoldData, IconPageData iconPageData, Label label, er.a aVar, fr.k kVar) {
                this(baseScaffoldData, iconPageData, label, aVar);
            }

            private b(BaseScaffoldData baseScaffoldData, IconPageData<ButtonData, ButtonData> iconPageData, Label label, er.a<oq.i0> aVar) {
                super(aVar, null);
                this.scaffoldData = baseScaffoldData;
                this.emptyStateIconPageData = iconPageData;
                this.closeButtonContentDescription = label;
                this.onBack = aVar;
            }
        }

        /* JADX INFO: renamed from: l84.f$a$c, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ll84/f$a$c;", "Ll84/f$a;", "Lmx/a;", "title", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lmx/a;", "()Lmx/a;", "c", "Ler/a;", "a", "()Ler/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LoadingState extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            public LoadingState(Label label, er.a<oq.i0> aVar) {
                super(aVar, null);
                this.title = label;
                this.onBack = aVar;
            }

            @Override // l84.f.a
            public er.a<oq.i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadingState)) {
                    return false;
                }
                LoadingState loadingState = (LoadingState) other;
                return fr.t.c(this.title, loadingState.title) && fr.t.c(this.onBack, loadingState.onBack);
            }

            public int hashCode() {
                return (this.title.hashCode() * 31) + this.onBack.hashCode();
            }

            public String toString() {
                return "LoadingState(title=" + this.title + ", onBack=" + this.onBack + ')';
            }
        }

        public /* synthetic */ a(er.a aVar, fr.k kVar) {
            this(aVar);
        }

        public er.a<oq.i0> a() {
            return this.onBack;
        }

        private a(er.a<oq.i0> aVar) {
            this.onBack = aVar;
        }
    }

    oz.j a();
}
