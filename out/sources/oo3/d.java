package oo3;

import co3.QrCodeData;
import eo3.MultiDocumentSelectorLabel;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0003\u0005\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Loo3/d;", "", "", "a", "()Z", "c", "b", "Loo3/d$a;", "Loo3/d$b;", "Loo3/d$c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Loo3/d$a;", "Loo3/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f147893a = new a();

        private a() {
        }

        @Override // oo3.d
        public /* bridge */ boolean a() {
            return super.a();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 2045680254;
        }

        public String toString() {
            return "Initial";
        }
    }

    /* JADX INFO: renamed from: oo3.d$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Loo3/d$c;", "Loo3/d;", "Lco3/e;", "qrCodeData", "Lwn3/c;", "entryPoint", "<init>", "(Lco3/e;Lwn3/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/e;", "c", "()Lco3/e;", "b", "Lwn3/c;", "()Lwn3/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Loading implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn3.c entryPoint;

        public Loading(QrCodeData qrCodeData, wn3.c cVar) {
            this.qrCodeData = qrCodeData;
            this.entryPoint = cVar;
        }

        @Override // oo3.d
        public /* bridge */ boolean a() {
            return super.a();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final wn3.c getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final QrCodeData getQrCodeData() {
            return this.qrCodeData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) other;
            return fr.t.c(this.qrCodeData, loading.qrCodeData) && fr.t.c(this.entryPoint, loading.entryPoint);
        }

        public int hashCode() {
            return (this.qrCodeData.hashCode() * 31) + this.entryPoint.hashCode();
        }

        public String toString() {
            return "Loading(qrCodeData=" + this.qrCodeData + ", entryPoint=" + this.entryPoint + ')';
        }
    }

    default boolean a() {
        if (this instanceof Initialized) {
            List<co3.n> listP = ((Initialized) this).p();
            return (listP != null ? listP.size() : 0) <= 1;
        }
        if (fr.t.c(this, a.f147893a) || (this instanceof Loading)) {
            return true;
        }
        throw new oq.p();
    }

    /* JADX INFO: renamed from: oo3.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ¸\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b4\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010 R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u00108\u001a\u0004\b6\u0010 R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b7\u0010DR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b@\u0010E\u001a\u0004\b>\u0010FR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b<\u0010G\u001a\u0004\b:\u0010HR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b+\u0010I\u001a\u0004\bB\u0010J¨\u0006K"}, d2 = {"Loo3/d$b;", "Loo3/d;", "Lk34/g;", "selectedDocument", "", "Lco3/q;", "listOfVerificationDataType", "Lco3/n;", "subDocument", "subDocumentList", "availableDocuments", "", "sessionUuid", "encodedCertificate", "Loq/r;", "Lk34/a0;", "scope", "Lco3/e;", "qrCodeData", "Lwn3/c;", "entryPoint", "Leo3/p;", "multiDocumentSelectorLabel", "Lg30/v;", "modalBottomSheetValue", "Ljo3/b;", "openedSheetType", "<init>", "(Lk34/g;Ljava/util/List;Lco3/n;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Loq/r;Lco3/e;Lwn3/c;Leo3/p;Lg30/v;Ljo3/b;)V", "b", "(Lk34/g;Ljava/util/List;Lco3/n;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Loq/r;Lco3/e;Lwn3/c;Leo3/p;Lg30/v;Ljo3/b;)Loo3/d$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/g;", "m", "()Lk34/g;", "Ljava/util/List;", "g", "()Ljava/util/List;", "c", "Lco3/n;", "o", "()Lco3/n;", "d", "p", "e", "f", "Ljava/lang/String;", "n", "h", "Loq/r;", "l", "()Loq/r;", "i", "Lco3/e;", "k", "()Lco3/e;", "j", "Lwn3/c;", "()Lwn3/c;", "Leo3/p;", "()Leo3/p;", "Lg30/v;", "()Lg30/v;", "Ljo3/b;", "()Ljo3/b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.g selectedDocument;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<co3.q> listOfVerificationDataType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final co3.n subDocument;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<co3.n> subDocumentList;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<k34.g> availableDocuments;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionUuid;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String encodedCertificate;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.r<k34.a0, k34.a0> scope;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn3.c entryPoint;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final MultiDocumentSelectorLabel multiDocumentSelectorLabel;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final g30.v modalBottomSheetValue;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final jo3.b openedSheetType;

        /* JADX WARN: Multi-variable type inference failed */
        public Initialized(k34.g gVar, List<? extends co3.q> list, co3.n nVar, List<? extends co3.n> list2, List<? extends k34.g> list3, String str, String str2, oq.r<? extends k34.a0, ? extends k34.a0> rVar, QrCodeData qrCodeData, wn3.c cVar, MultiDocumentSelectorLabel multiDocumentSelectorLabel, g30.v vVar, jo3.b bVar) {
            this.selectedDocument = gVar;
            this.listOfVerificationDataType = list;
            this.subDocument = nVar;
            this.subDocumentList = list2;
            this.availableDocuments = list3;
            this.sessionUuid = str;
            this.encodedCertificate = str2;
            this.scope = rVar;
            this.qrCodeData = qrCodeData;
            this.entryPoint = cVar;
            this.multiDocumentSelectorLabel = multiDocumentSelectorLabel;
            this.modalBottomSheetValue = vVar;
            this.openedSheetType = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized c(Initialized initialized, k34.g gVar, List list, co3.n nVar, List list2, List list3, String str, String str2, oq.r rVar, QrCodeData qrCodeData, wn3.c cVar, MultiDocumentSelectorLabel multiDocumentSelectorLabel, g30.v vVar, jo3.b bVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                gVar = initialized.selectedDocument;
            }
            return initialized.b(gVar, (i15 & 2) != 0 ? initialized.listOfVerificationDataType : list, (i15 & 4) != 0 ? initialized.subDocument : nVar, (i15 & 8) != 0 ? initialized.subDocumentList : list2, (i15 & 16) != 0 ? initialized.availableDocuments : list3, (i15 & 32) != 0 ? initialized.sessionUuid : str, (i15 & 64) != 0 ? initialized.encodedCertificate : str2, (i15 & 128) != 0 ? initialized.scope : rVar, (i15 & 256) != 0 ? initialized.qrCodeData : qrCodeData, (i15 & 512) != 0 ? initialized.entryPoint : cVar, (i15 & 1024) != 0 ? initialized.multiDocumentSelectorLabel : multiDocumentSelectorLabel, (i15 & 2048) != 0 ? initialized.modalBottomSheetValue : vVar, (i15 & PKIFailureInfo.certConfirmed) != 0 ? initialized.openedSheetType : bVar);
        }

        @Override // oo3.d
        public /* bridge */ boolean a() {
            return super.a();
        }

        public final Initialized b(k34.g selectedDocument, List<? extends co3.q> listOfVerificationDataType, co3.n subDocument, List<? extends co3.n> subDocumentList, List<? extends k34.g> availableDocuments, String sessionUuid, String encodedCertificate, oq.r<? extends k34.a0, ? extends k34.a0> scope, QrCodeData qrCodeData, wn3.c entryPoint, MultiDocumentSelectorLabel multiDocumentSelectorLabel, g30.v modalBottomSheetValue, jo3.b openedSheetType) {
            return new Initialized(selectedDocument, listOfVerificationDataType, subDocument, subDocumentList, availableDocuments, sessionUuid, encodedCertificate, scope, qrCodeData, entryPoint, multiDocumentSelectorLabel, modalBottomSheetValue, openedSheetType);
        }

        public final List<k34.g> d() {
            return this.availableDocuments;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getEncodedCertificate() {
            return this.encodedCertificate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.selectedDocument, initialized.selectedDocument) && fr.t.c(this.listOfVerificationDataType, initialized.listOfVerificationDataType) && fr.t.c(this.subDocument, initialized.subDocument) && fr.t.c(this.subDocumentList, initialized.subDocumentList) && fr.t.c(this.availableDocuments, initialized.availableDocuments) && fr.t.c(this.sessionUuid, initialized.sessionUuid) && fr.t.c(this.encodedCertificate, initialized.encodedCertificate) && fr.t.c(this.scope, initialized.scope) && fr.t.c(this.qrCodeData, initialized.qrCodeData) && fr.t.c(this.entryPoint, initialized.entryPoint) && fr.t.c(this.multiDocumentSelectorLabel, initialized.multiDocumentSelectorLabel) && this.modalBottomSheetValue == initialized.modalBottomSheetValue && this.openedSheetType == initialized.openedSheetType;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final wn3.c getEntryPoint() {
            return this.entryPoint;
        }

        public final List<co3.q> g() {
            return this.listOfVerificationDataType;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final g30.v getModalBottomSheetValue() {
            return this.modalBottomSheetValue;
        }

        public int hashCode() {
            int iHashCode = ((this.selectedDocument.hashCode() * 31) + this.listOfVerificationDataType.hashCode()) * 31;
            co3.n nVar = this.subDocument;
            int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
            List<co3.n> list = this.subDocumentList;
            int iHashCode3 = (((((((((((((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.availableDocuments.hashCode()) * 31) + this.sessionUuid.hashCode()) * 31) + this.encodedCertificate.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.qrCodeData.hashCode()) * 31) + this.entryPoint.hashCode()) * 31;
            MultiDocumentSelectorLabel multiDocumentSelectorLabel = this.multiDocumentSelectorLabel;
            return ((((iHashCode3 + (multiDocumentSelectorLabel != null ? multiDocumentSelectorLabel.hashCode() : 0)) * 31) + this.modalBottomSheetValue.hashCode()) * 31) + this.openedSheetType.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final MultiDocumentSelectorLabel getMultiDocumentSelectorLabel() {
            return this.multiDocumentSelectorLabel;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final jo3.b getOpenedSheetType() {
            return this.openedSheetType;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final QrCodeData getQrCodeData() {
            return this.qrCodeData;
        }

        public final oq.r<k34.a0, k34.a0> l() {
            return this.scope;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final k34.g getSelectedDocument() {
            return this.selectedDocument;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getSessionUuid() {
            return this.sessionUuid;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final co3.n getSubDocument() {
            return this.subDocument;
        }

        public final List<co3.n> p() {
            return this.subDocumentList;
        }

        public String toString() {
            return "Initialized(selectedDocument=" + this.selectedDocument + ", listOfVerificationDataType=" + this.listOfVerificationDataType + ", subDocument=" + this.subDocument + ", subDocumentList=" + this.subDocumentList + ", availableDocuments=" + this.availableDocuments + ", sessionUuid=" + this.sessionUuid + ", encodedCertificate=" + this.encodedCertificate + ", scope=" + this.scope + ", qrCodeData=" + this.qrCodeData + ", entryPoint=" + this.entryPoint + ", multiDocumentSelectorLabel=" + this.multiDocumentSelectorLabel + ", modalBottomSheetValue=" + this.modalBottomSheetValue + ", openedSheetType=" + this.openedSheetType + ')';
        }

        public /* synthetic */ Initialized(k34.g gVar, List list, co3.n nVar, List list2, List list3, String str, String str2, oq.r rVar, QrCodeData qrCodeData, wn3.c cVar, MultiDocumentSelectorLabel multiDocumentSelectorLabel, g30.v vVar, jo3.b bVar, int i15, fr.k kVar) {
            this(gVar, list, nVar, list2, list3, str, str2, rVar, qrCodeData, cVar, multiDocumentSelectorLabel, (i15 & 2048) != 0 ? g30.v.HIDDEN : vVar, (i15 & PKIFailureInfo.certConfirmed) != 0 ? jo3.b.NONE : bVar);
        }
    }
}
