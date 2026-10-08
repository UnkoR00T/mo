package h32;

import i50.BaseScaffoldData;
import j30.ButtonTextData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lh32/c;", "Ll00/e;", "Lh32/c$a;", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lh32/c$a;", "", "a", "b", "Lh32/c$a$a;", "Lh32/c$a$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: h32.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lh32/c$a$a;", "Lh32/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1840a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1840a f80523a = new C1840a();

            private C1840a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1840a);
            }

            public int hashCode() {
                return 2058098632;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: h32.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b\u001d\u0010&R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b*\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b!\u00100¨\u00061"}, d2 = {"Lh32/c$a$b;", "Lh32/c$a;", "Li50/a;", "baseScaffoldData", "Ln30/b;", "inboxItemsList", "Lmx/a;", "additionalInfo", "Lkotlin/Function0;", "Loq/i0;", "topBarBackButtonClick", "topBarSettingsButtonClick", "Lj30/a;", "readMoreButtonData", "Lc30/b$c;", "alertData", "<init>", "(Li50/a;Ln30/b;Lmx/a;Ler/a;Ler/a;Lj30/a;Lc30/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Ln30/b;", "d", "()Ln30/b;", "Lmx/a;", "()Lmx/a;", "Ler/a;", "f", "()Ler/a;", "e", "getTopBarSettingsButtonClick", "Lj30/a;", "()Lj30/a;", "g", "Lc30/b$c;", "()Lc30/b$c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f80524h = ButtonTextData.f99099f | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData inboxItemsList;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label additionalInfo;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> topBarBackButtonClick;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> topBarSettingsButtonClick;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonTextData readMoreButtonData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b.c alertData;

            public Initialized(BaseScaffoldData baseScaffoldData, CardListData cardListData, Label label, er.a<i0> aVar, er.a<i0> aVar2, ButtonTextData buttonTextData, c30.b.c cVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.inboxItemsList = cardListData;
                this.additionalInfo = label;
                this.topBarBackButtonClick = aVar;
                this.topBarSettingsButtonClick = aVar2;
                this.readMoreButtonData = buttonTextData;
                this.alertData = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getAdditionalInfo() {
                return this.additionalInfo;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final c30.b.c getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final CardListData getInboxItemsList() {
                return this.inboxItemsList;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ButtonTextData getReadMoreButtonData() {
                return this.readMoreButtonData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.inboxItemsList, initialized.inboxItemsList) && fr.t.c(this.additionalInfo, initialized.additionalInfo) && fr.t.c(this.topBarBackButtonClick, initialized.topBarBackButtonClick) && fr.t.c(this.topBarSettingsButtonClick, initialized.topBarSettingsButtonClick) && fr.t.c(this.readMoreButtonData, initialized.readMoreButtonData) && fr.t.c(this.alertData, initialized.alertData);
            }

            public final er.a<i0> f() {
                return this.topBarBackButtonClick;
            }

            public int hashCode() {
                int iHashCode = ((((((((((this.baseScaffoldData.hashCode() * 31) + this.inboxItemsList.hashCode()) * 31) + this.additionalInfo.hashCode()) * 31) + this.topBarBackButtonClick.hashCode()) * 31) + this.topBarSettingsButtonClick.hashCode()) * 31) + this.readMoreButtonData.hashCode()) * 31;
                c30.b.c cVar = this.alertData;
                return iHashCode + (cVar == null ? 0 : cVar.hashCode());
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", inboxItemsList=" + this.inboxItemsList + ", additionalInfo=" + this.additionalInfo + ", topBarBackButtonClick=" + this.topBarBackButtonClick + ", topBarSettingsButtonClick=" + this.topBarSettingsButtonClick + ", readMoreButtonData=" + this.readMoreButtonData + ", alertData=" + this.alertData + ')';
            }
        }
    }
}
