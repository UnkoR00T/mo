package iw1;

import g30.ModalBottomSheetData;
import o20.BaseDocumentData;
import oq.i0;
import p071kotlin.Metadata;
import wv1.DynamicDocumentBottomSheetData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Liw1/c;", "Ll00/e;", "Liw1/c$a;", "Li70/n;", "a", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Liw1/c$a;", "", "a", "b", "Liw1/c$a$a;", "Liw1/c$a$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: iw1.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Liw1/c$a$a;", "Liw1/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C2283a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2283a f97295a = new C2283a();

            private C2283a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2283a);
            }

            public int hashCode() {
                return -1754579234;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: iw1.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006$"}, d2 = {"Liw1/c$a$b;", "Liw1/c$a;", "Lo20/k;", "baseDocumentData", "Lg30/n;", "bottomSheetData", "Lkotlin/Function0;", "Loq/i0;", "hideSnackBar", "Lwv1/b;", "bottomSheetContentData", "<init>", "(Lo20/k;Lg30/n;Ler/a;Lwv1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo20/k;", "()Lo20/k;", "b", "Lg30/n;", "c", "()Lg30/n;", "Ler/a;", "d", "()Ler/a;", "Lwv1/b;", "()Lwv1/b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseDocumentData baseDocumentData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ModalBottomSheetData bottomSheetData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> hideSnackBar;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final DynamicDocumentBottomSheetData bottomSheetContentData;

            public Initialized(BaseDocumentData baseDocumentData, ModalBottomSheetData modalBottomSheetData, er.a<i0> aVar, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData) {
                this.baseDocumentData = baseDocumentData;
                this.bottomSheetData = modalBottomSheetData;
                this.hideSnackBar = aVar;
                this.bottomSheetContentData = dynamicDocumentBottomSheetData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseDocumentData getBaseDocumentData() {
                return this.baseDocumentData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final DynamicDocumentBottomSheetData getBottomSheetContentData() {
                return this.bottomSheetContentData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ModalBottomSheetData getBottomSheetData() {
                return this.bottomSheetData;
            }

            public final er.a<i0> d() {
                return this.hideSnackBar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseDocumentData, initialized.baseDocumentData) && fr.t.c(this.bottomSheetData, initialized.bottomSheetData) && fr.t.c(this.hideSnackBar, initialized.hideSnackBar) && fr.t.c(this.bottomSheetContentData, initialized.bottomSheetContentData);
            }

            public int hashCode() {
                int iHashCode = ((((this.baseDocumentData.hashCode() * 31) + this.bottomSheetData.hashCode()) * 31) + this.hideSnackBar.hashCode()) * 31;
                DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData = this.bottomSheetContentData;
                return iHashCode + (dynamicDocumentBottomSheetData == null ? 0 : dynamicDocumentBottomSheetData.hashCode());
            }

            public String toString() {
                return "Initialized(baseDocumentData=" + this.baseDocumentData + ", bottomSheetData=" + this.bottomSheetData + ", hideSnackBar=" + this.hideSnackBar + ", bottomSheetContentData=" + this.bottomSheetContentData + ')';
            }
        }
    }
}
