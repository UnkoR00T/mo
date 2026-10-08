package jv3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ljv3/d;", "Ll00/e;", "Ljv3/d$a;", "a", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ljv3/d$a;", "", "<init>", "()V", "a", "b", "Ljv3/d$a$a;", "Ljv3/d$a$b;", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: jv3.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljv3/d$a$a;", "Ljv3/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C2518a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2518a f106108a = new C2518a();

            private C2518a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2518a);
            }

            public int hashCode() {
                return 524349979;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: jv3.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010$R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b%\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b&\u0010+¨\u0006,"}, d2 = {"Ljv3/d$a$b;", "Ljv3/d$a;", "Li50/a;", "baseScaffoldData", "Lh30/a;", "interruptButtonData", "Lmx/a;", "documentDownloading", "documentDownloadingTakeTooLong", "interruptProcessPossibility", "", "showTakesTooLong", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Lh30/a;Lmx/a;Lmx/a;Lmx/a;ZLer/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lh30/a;", "d", "()Lh30/a;", "c", "Lmx/a;", "()Lmx/a;", "e", "f", "Z", "g", "()Z", "Ler/a;", "()Ler/a;", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Loader extends a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f106109h = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData interruptButtonData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label documentDownloading;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label documentDownloadingTakeTooLong;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label interruptProcessPossibility;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean showTakesTooLong;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            public Loader(BaseScaffoldData baseScaffoldData, ButtonData buttonData, Label label, Label label2, Label label3, boolean z15, er.a<i0> aVar) {
                super(null);
                this.baseScaffoldData = baseScaffoldData;
                this.interruptButtonData = buttonData;
                this.documentDownloading = label;
                this.documentDownloadingTakeTooLong = label2;
                this.interruptProcessPossibility = label3;
                this.showTakesTooLong = z15;
                this.onBackClick = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getDocumentDownloading() {
                return this.documentDownloading;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getDocumentDownloadingTakeTooLong() {
                return this.documentDownloadingTakeTooLong;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final ButtonData getInterruptButtonData() {
                return this.interruptButtonData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getInterruptProcessPossibility() {
                return this.interruptProcessPossibility;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loader)) {
                    return false;
                }
                Loader loader = (Loader) other;
                return fr.t.c(this.baseScaffoldData, loader.baseScaffoldData) && fr.t.c(this.interruptButtonData, loader.interruptButtonData) && fr.t.c(this.documentDownloading, loader.documentDownloading) && fr.t.c(this.documentDownloadingTakeTooLong, loader.documentDownloadingTakeTooLong) && fr.t.c(this.interruptProcessPossibility, loader.interruptProcessPossibility) && this.showTakesTooLong == loader.showTakesTooLong && fr.t.c(this.onBackClick, loader.onBackClick);
            }

            public final er.a<i0> f() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final boolean getShowTakesTooLong() {
                return this.showTakesTooLong;
            }

            public int hashCode() {
                return (((((((((((this.baseScaffoldData.hashCode() * 31) + this.interruptButtonData.hashCode()) * 31) + this.documentDownloading.hashCode()) * 31) + this.documentDownloadingTakeTooLong.hashCode()) * 31) + this.interruptProcessPossibility.hashCode()) * 31) + Boolean.hashCode(this.showTakesTooLong)) * 31) + this.onBackClick.hashCode();
            }

            public String toString() {
                return "Loader(baseScaffoldData=" + this.baseScaffoldData + ", interruptButtonData=" + this.interruptButtonData + ", documentDownloading=" + this.documentDownloading + ", documentDownloadingTakeTooLong=" + this.documentDownloadingTakeTooLong + ", interruptProcessPossibility=" + this.interruptProcessPossibility + ", showTakesTooLong=" + this.showTakesTooLong + ", onBackClick=" + this.onBackClick + ')';
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }
}
