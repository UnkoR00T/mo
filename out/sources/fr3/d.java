package fr3;

import g30.ModalBottomSheetData;
import hr3.WruDocumentScreenData;
import i50.BaseScaffoldData;
import mu.p0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\tR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lfr3/d;", "Ll00/e;", "Lfr3/d$a;", "Li70/n;", "Lmu/p0;", "Lhr3/e;", "T", "()Lmu/p0;", "bottomSheetState", "a", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lfr3/d$a;", "", "a", "b", "Lfr3/d$a$a;", "Lfr3/d$a$b;", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: fr3.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfr3/d$a$a;", "Lfr3/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1488a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1488a f66596a = new C1488a();

            private C1488a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1488a);
            }

            public int hashCode() {
                return 2113651272;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: fr3.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006$"}, d2 = {"Lfr3/d$a$b;", "Lfr3/d$a;", "Li50/a;", "baseScaffoldData", "Lg30/n;", "modalBottomSheetData", "Lhr3/f;", "wruDocumentScreenData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Lg30/n;Lhr3/f;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lg30/n;", "()Lg30/n;", "c", "Lhr3/f;", "d", "()Lhr3/f;", "Ler/a;", "()Ler/a;", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData modalBottomSheetData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final WruDocumentScreenData wruDocumentScreenData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            public Initialized(BaseScaffoldData baseScaffoldData, ModalBottomSheetData modalBottomSheetData, WruDocumentScreenData wruDocumentScreenData, er.a<i0> aVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.modalBottomSheetData = modalBottomSheetData;
                this.wruDocumentScreenData = wruDocumentScreenData;
                this.onBackClick = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ModalBottomSheetData getModalBottomSheetData() {
                return this.modalBottomSheetData;
            }

            public final er.a<i0> c() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final WruDocumentScreenData getWruDocumentScreenData() {
                return this.wruDocumentScreenData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.modalBottomSheetData, initialized.modalBottomSheetData) && fr.t.c(this.wruDocumentScreenData, initialized.wruDocumentScreenData) && fr.t.c(this.onBackClick, initialized.onBackClick);
            }

            public int hashCode() {
                return (((((this.baseScaffoldData.hashCode() * 31) + this.modalBottomSheetData.hashCode()) * 31) + this.wruDocumentScreenData.hashCode()) * 31) + this.onBackClick.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", modalBottomSheetData=" + this.modalBottomSheetData + ", wruDocumentScreenData=" + this.wruDocumentScreenData + ", onBackClick=" + this.onBackClick + ')';
            }
        }
    }

    p0<hr3.e> T();
}
