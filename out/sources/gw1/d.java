package gw1;

import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import n50.DefaultSingleCardData;
import o20.BaseDocumentData;
import p071kotlin.Metadata;
import wv1.DynamicDocumentBottomSheetData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lgw1/d;", "Ll00/e;", "Lgw1/d$a;", "Li70/n;", "a", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lgw1/d$a;", "", "a", "b", "Lgw1/d$a$a;", "Lgw1/d$a$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: gw1.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgw1/d$a$a;", "Lgw1/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1765a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1765a f77906a = new C1765a();

            private C1765a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1765a);
            }

            public int hashCode() {
                return -1800410889;
            }

            public String toString() {
                return "Initial";
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u0019\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lgw1/d$a$b;", "Lgw1/d$a;", "Li50/a;", "b", "()Li50/a;", "baseScaffoldData", "Ly30/n$b;", "d", "()Ly30/n$b;", "controllerData", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "onBackAction", "e", "hideSnackBar", "Lg30/n;", "c", "()Lg30/n;", "bottomSheetData", "Lwv1/b;", "f", "()Lwv1/b;", "bottomSheetContentData", "Lgw1/d$a$b$a;", "Lgw1/d$a$b$b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface b extends a {

            /* JADX INFO: renamed from: gw1.d$a$b$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b\u001d\u0010)R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b*\u0010)R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b$\u0010-R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b+\u0010/¨\u00060"}, d2 = {"Lgw1/d$a$b$b;", "Lgw1/d$a$b;", "Lo20/k;", "documentData", "Li50/a;", "baseScaffoldData", "Ly30/n$b;", "controllerData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "hideSnackBar", "Lg30/n;", "bottomSheetData", "Lwv1/b;", "bottomSheetContentData", "<init>", "(Lo20/k;Li50/a;Ly30/n$b;Ler/a;Ler/a;Lg30/n;Lwv1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo20/k;", "g", "()Lo20/k;", "b", "Li50/a;", "()Li50/a;", "c", "Ly30/n$b;", "d", "()Ly30/n$b;", "Ler/a;", "()Ler/a;", "e", "f", "Lg30/n;", "()Lg30/n;", "Lwv1/b;", "()Lwv1/b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class SingleDocument implements b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseDocumentData documentData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseScaffoldData baseScaffoldData;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final y30.n.Switch controllerData;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<oq.i0> onBackAction;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<oq.i0> hideSnackBar;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final ModalBottomSheetData bottomSheetData;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                private final DynamicDocumentBottomSheetData bottomSheetContentData;

                public SingleDocument(BaseDocumentData baseDocumentData, BaseScaffoldData baseScaffoldData, y30.n.Switch r15, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, ModalBottomSheetData modalBottomSheetData, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData) {
                    this.documentData = baseDocumentData;
                    this.baseScaffoldData = baseScaffoldData;
                    this.controllerData = r15;
                    this.onBackAction = aVar;
                    this.hideSnackBar = aVar2;
                    this.bottomSheetData = modalBottomSheetData;
                    this.bottomSheetContentData = dynamicDocumentBottomSheetData;
                }

                @Override // gw1.d.a.b
                public er.a<oq.i0> a() {
                    return this.onBackAction;
                }

                @Override // gw1.d.a.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public BaseScaffoldData getBaseScaffoldData() {
                    return this.baseScaffoldData;
                }

                @Override // gw1.d.a.b
                /* JADX INFO: renamed from: c, reason: from getter */
                public ModalBottomSheetData getBottomSheetData() {
                    return this.bottomSheetData;
                }

                @Override // gw1.d.a.b
                /* JADX INFO: renamed from: d, reason: from getter */
                public y30.n.Switch getControllerData() {
                    return this.controllerData;
                }

                @Override // gw1.d.a.b
                public er.a<oq.i0> e() {
                    return this.hideSnackBar;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SingleDocument)) {
                        return false;
                    }
                    SingleDocument singleDocument = (SingleDocument) other;
                    return fr.t.c(this.documentData, singleDocument.documentData) && fr.t.c(this.baseScaffoldData, singleDocument.baseScaffoldData) && fr.t.c(this.controllerData, singleDocument.controllerData) && fr.t.c(this.onBackAction, singleDocument.onBackAction) && fr.t.c(this.hideSnackBar, singleDocument.hideSnackBar) && fr.t.c(this.bottomSheetData, singleDocument.bottomSheetData) && fr.t.c(this.bottomSheetContentData, singleDocument.bottomSheetContentData);
                }

                @Override // gw1.d.a.b
                /* JADX INFO: renamed from: f, reason: from getter */
                public DynamicDocumentBottomSheetData getBottomSheetContentData() {
                    return this.bottomSheetContentData;
                }

                /* JADX INFO: renamed from: g, reason: from getter */
                public final BaseDocumentData getDocumentData() {
                    return this.documentData;
                }

                public int hashCode() {
                    int iHashCode = ((this.documentData.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31;
                    y30.n.Switch r15 = this.controllerData;
                    int iHashCode2 = (((((((iHashCode + (r15 == null ? 0 : r15.hashCode())) * 31) + this.onBackAction.hashCode()) * 31) + this.hideSnackBar.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31;
                    DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData = this.bottomSheetContentData;
                    return iHashCode2 + (dynamicDocumentBottomSheetData != null ? dynamicDocumentBottomSheetData.hashCode() : 0);
                }

                public String toString() {
                    return "SingleDocument(documentData=" + this.documentData + ", baseScaffoldData=" + this.baseScaffoldData + ", controllerData=" + this.controllerData + ", onBackAction=" + this.onBackAction + ", hideSnackBar=" + this.hideSnackBar + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ')';
                }
            }

            er.a<oq.i0> a();

            /* JADX INFO: renamed from: b */
            BaseScaffoldData getBaseScaffoldData();

            /* JADX INFO: renamed from: c */
            ModalBottomSheetData getBottomSheetData();

            /* JADX INFO: renamed from: d */
            y30.n.Switch getControllerData();

            er.a<oq.i0> e();

            /* JADX INFO: renamed from: f */
            DynamicDocumentBottomSheetData getBottomSheetContentData();

            /* JADX INFO: renamed from: gw1.d$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b \u00100R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b.\u00100R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\b(\u00103R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\b1\u00105¨\u00066"}, d2 = {"Lgw1/d$a$b$a;", "Lgw1/d$a$b;", "", "Ln50/g;", "cardDataList", "Lh30/a;", "updateButtonData", "Li50/a;", "baseScaffoldData", "Ly30/n$b;", "controllerData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "hideSnackBar", "Lg30/n;", "bottomSheetData", "Lwv1/b;", "bottomSheetContentData", "<init>", "(Ljava/util/List;Lh30/a;Li50/a;Ly30/n$b;Ler/a;Ler/a;Lg30/n;Lwv1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "g", "()Ljava/util/List;", "b", "Lh30/a;", "h", "()Lh30/a;", "c", "Li50/a;", "()Li50/a;", "d", "Ly30/n$b;", "()Ly30/n$b;", "e", "Ler/a;", "()Ler/a;", "f", "Lg30/n;", "()Lg30/n;", "Lwv1/b;", "()Lwv1/b;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class DocumentsList implements b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final List<DefaultSingleCardData> cardDataList;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final ButtonData updateButtonData;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final BaseScaffoldData baseScaffoldData;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final y30.n.Switch controllerData;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<oq.i0> onBackAction;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<oq.i0> hideSnackBar;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                private final ModalBottomSheetData bottomSheetData;

                /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
                private final DynamicDocumentBottomSheetData bottomSheetContentData;

                public DocumentsList(List<DefaultSingleCardData> list, ButtonData buttonData, BaseScaffoldData baseScaffoldData, y30.n.Switch r15, er.a<oq.i0> aVar, er.a<oq.i0> aVar2, ModalBottomSheetData modalBottomSheetData, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData) {
                    this.cardDataList = list;
                    this.updateButtonData = buttonData;
                    this.baseScaffoldData = baseScaffoldData;
                    this.controllerData = r15;
                    this.onBackAction = aVar;
                    this.hideSnackBar = aVar2;
                    this.bottomSheetData = modalBottomSheetData;
                    this.bottomSheetContentData = dynamicDocumentBottomSheetData;
                }

                @Override // gw1.d.a.b
                public er.a<oq.i0> a() {
                    return this.onBackAction;
                }

                @Override // gw1.d.a.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public BaseScaffoldData getBaseScaffoldData() {
                    return this.baseScaffoldData;
                }

                @Override // gw1.d.a.b
                /* JADX INFO: renamed from: c, reason: from getter */
                public ModalBottomSheetData getBottomSheetData() {
                    return this.bottomSheetData;
                }

                @Override // gw1.d.a.b
                /* JADX INFO: renamed from: d, reason: from getter */
                public y30.n.Switch getControllerData() {
                    return this.controllerData;
                }

                @Override // gw1.d.a.b
                public er.a<oq.i0> e() {
                    return this.hideSnackBar;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DocumentsList)) {
                        return false;
                    }
                    DocumentsList documentsList = (DocumentsList) other;
                    return fr.t.c(this.cardDataList, documentsList.cardDataList) && fr.t.c(this.updateButtonData, documentsList.updateButtonData) && fr.t.c(this.baseScaffoldData, documentsList.baseScaffoldData) && fr.t.c(this.controllerData, documentsList.controllerData) && fr.t.c(this.onBackAction, documentsList.onBackAction) && fr.t.c(this.hideSnackBar, documentsList.hideSnackBar) && fr.t.c(this.bottomSheetData, documentsList.bottomSheetData) && fr.t.c(this.bottomSheetContentData, documentsList.bottomSheetContentData);
                }

                @Override // gw1.d.a.b
                /* JADX INFO: renamed from: f, reason: from getter */
                public DynamicDocumentBottomSheetData getBottomSheetContentData() {
                    return this.bottomSheetContentData;
                }

                public final List<DefaultSingleCardData> g() {
                    return this.cardDataList;
                }

                /* JADX INFO: renamed from: h, reason: from getter */
                public final ButtonData getUpdateButtonData() {
                    return this.updateButtonData;
                }

                public int hashCode() {
                    int iHashCode = ((((this.cardDataList.hashCode() * 31) + this.updateButtonData.hashCode()) * 31) + this.baseScaffoldData.hashCode()) * 31;
                    y30.n.Switch r15 = this.controllerData;
                    int iHashCode2 = (((((((iHashCode + (r15 == null ? 0 : r15.hashCode())) * 31) + this.onBackAction.hashCode()) * 31) + this.hideSnackBar.hashCode()) * 31) + this.bottomSheetData.hashCode()) * 31;
                    DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData = this.bottomSheetContentData;
                    return iHashCode2 + (dynamicDocumentBottomSheetData != null ? dynamicDocumentBottomSheetData.hashCode() : 0);
                }

                public String toString() {
                    return "DocumentsList(cardDataList=" + this.cardDataList + ", updateButtonData=" + this.updateButtonData + ", baseScaffoldData=" + this.baseScaffoldData + ", controllerData=" + this.controllerData + ", onBackAction=" + this.onBackAction + ", hideSnackBar=" + this.hideSnackBar + ", bottomSheetData=" + this.bottomSheetData + ", bottomSheetContentData=" + this.bottomSheetContentData + ')';
                }

                public /* synthetic */ DocumentsList(List list, ButtonData buttonData, BaseScaffoldData baseScaffoldData, y30.n.Switch r15, er.a aVar, er.a aVar2, ModalBottomSheetData modalBottomSheetData, DynamicDocumentBottomSheetData dynamicDocumentBottomSheetData, int i15, fr.k kVar) {
                    this(list, buttonData, baseScaffoldData, r15, aVar, aVar2, modalBottomSheetData, (i15 & 128) != 0 ? null : dynamicDocumentBottomSheetData);
                }
            }
        }
    }
}
