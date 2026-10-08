package pl.gov.coi.mobywatel.technical.documents.data.storage;

import ay.j;
import er.p;
import fr.q0;
import fr.t;
import fr0.BEDocumentConfigLabel;
import fr0.DocumentConfig;
import fr0.DocumentMaintenanceBreak;
import fr0.i;
import java.util.ArrayList;
import java.util.List;
import mr.r;
import mu.a0;
import mu.h0;
import oq.i0;
import oq.k;
import oq.l;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0017\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\b*\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b*\b\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001e\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR'\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/storage/h;", "Lpl/gov/coi/mobywatel/technical/documents/data/storage/a;", "Lcz/c;", "storageFactory", "Lay/j;", "jsonSerializer", "<init>", "(Lcz/c;Lay/j;)V", "", "Lfr0/g;", "Lpl/gov/coi/mobywatel/technical/documents/data/storage/h$b;", "l", "(Ljava/util/List;)Ljava/util/List;", "k", "configs", "Loq/i0;", "c", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "d", "(Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "a", "()Lmu/g;", "b", "Lay/j;", "Lcz/b;", "Loq/k;", "h", "()Lcz/b;", "storage", "Lmu/a0;", "g", "()Lmu/a0;", "monitor", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f159199e = cz.b.a.b("SHARED_PREFERENCES_CONFIGS");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k storage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k monitor = l.a(new er.a() { // from class: pl.gov.coi.mobywatel.technical.documents.data.storage.g
        @Override // er.a
        public final Object a() {
            return h.i();
        }
    });

    /* JADX INFO: renamed from: pl.gov.coi.mobywatel.technical.documents.data.storage.h$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u001d\b\u0082\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b%\u0010/R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b3\u00102R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b\u001e\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b!\u0010*R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\u0017R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b4\u0010*¨\u00065"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/storage/h$b;", "", "", "typeReferenceName", "", "enabled", "subtype", "dynamic", "Lfr0/h;", "maintenanceBreak", "", "asyncDownloadTerminationInterval", "", "Lfr0/f;", "longNameByLanguage", "shortNameByLanguage", "additionalNameDescriptionByLanguage", "additionalVerificationRequired", "documentStoringMode", "multipleCreatingNewDocument", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Lfr0/h;JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "l", "b", "Z", "f", "()Z", "c", "k", "d", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "Lfr0/h;", "h", "()Lfr0/h;", "J", "()J", "g", "Ljava/util/List;", "()Ljava/util/List;", "j", "i", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final /* data */ class DocumentConfigStorage {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("typeReferenceName")
        private final String typeReferenceName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("enabled")
        private final boolean enabled;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("subtype")
        private final String subtype;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("dynamic")
        private final Boolean dynamic;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("maintenanceBreak")
        private final DocumentMaintenanceBreak maintenanceBreak;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("asyncDownloadTerminationInterval")
        private final long asyncDownloadTerminationInterval;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("longNameByLanguage")
        private final List<BEDocumentConfigLabel> longNameByLanguage;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("shortNameByLanguage")
        private final List<BEDocumentConfigLabel> shortNameByLanguage;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("additionalNameDescriptionByLanguage")
        private final List<BEDocumentConfigLabel> additionalNameDescriptionByLanguage;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("additionalVerificationRequired")
        private final Boolean additionalVerificationRequired;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("documentStoringMode")
        private final String documentStoringMode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @vl.c("multipleCreatingNewDocument")
        private final Boolean multipleCreatingNewDocument;

        public DocumentConfigStorage(String str, boolean z15, String str2, Boolean bool, DocumentMaintenanceBreak documentMaintenanceBreak, long j15, List<BEDocumentConfigLabel> list, List<BEDocumentConfigLabel> list2, List<BEDocumentConfigLabel> list3, Boolean bool2, String str3, Boolean bool3) {
            this.typeReferenceName = str;
            this.enabled = z15;
            this.subtype = str2;
            this.dynamic = bool;
            this.maintenanceBreak = documentMaintenanceBreak;
            this.asyncDownloadTerminationInterval = j15;
            this.longNameByLanguage = list;
            this.shortNameByLanguage = list2;
            this.additionalNameDescriptionByLanguage = list3;
            this.additionalVerificationRequired = bool2;
            this.documentStoringMode = str3;
            this.multipleCreatingNewDocument = bool3;
        }

        public final List<BEDocumentConfigLabel> a() {
            return this.additionalNameDescriptionByLanguage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Boolean getAdditionalVerificationRequired() {
            return this.additionalVerificationRequired;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getAsyncDownloadTerminationInterval() {
            return this.asyncDownloadTerminationInterval;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDocumentStoringMode() {
            return this.documentStoringMode;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Boolean getDynamic() {
            return this.dynamic;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentConfigStorage)) {
                return false;
            }
            DocumentConfigStorage documentConfigStorage = (DocumentConfigStorage) other;
            return t.c(this.typeReferenceName, documentConfigStorage.typeReferenceName) && this.enabled == documentConfigStorage.enabled && t.c(this.subtype, documentConfigStorage.subtype) && t.c(this.dynamic, documentConfigStorage.dynamic) && t.c(this.maintenanceBreak, documentConfigStorage.maintenanceBreak) && this.asyncDownloadTerminationInterval == documentConfigStorage.asyncDownloadTerminationInterval && t.c(this.longNameByLanguage, documentConfigStorage.longNameByLanguage) && t.c(this.shortNameByLanguage, documentConfigStorage.shortNameByLanguage) && t.c(this.additionalNameDescriptionByLanguage, documentConfigStorage.additionalNameDescriptionByLanguage) && t.c(this.additionalVerificationRequired, documentConfigStorage.additionalVerificationRequired) && t.c(this.documentStoringMode, documentConfigStorage.documentStoringMode) && t.c(this.multipleCreatingNewDocument, documentConfigStorage.multipleCreatingNewDocument);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final List<BEDocumentConfigLabel> g() {
            return this.longNameByLanguage;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final DocumentMaintenanceBreak getMaintenanceBreak() {
            return this.maintenanceBreak;
        }

        public int hashCode() {
            int iHashCode = ((this.typeReferenceName.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31;
            String str = this.subtype;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.dynamic;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            DocumentMaintenanceBreak documentMaintenanceBreak = this.maintenanceBreak;
            int iHashCode4 = (((((((iHashCode3 + (documentMaintenanceBreak == null ? 0 : documentMaintenanceBreak.hashCode())) * 31) + Long.hashCode(this.asyncDownloadTerminationInterval)) * 31) + this.longNameByLanguage.hashCode()) * 31) + this.shortNameByLanguage.hashCode()) * 31;
            List<BEDocumentConfigLabel> list = this.additionalNameDescriptionByLanguage;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool2 = this.additionalVerificationRequired;
            int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.documentStoringMode;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool3 = this.multipleCreatingNewDocument;
            return iHashCode7 + (bool3 != null ? bool3.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Boolean getMultipleCreatingNewDocument() {
            return this.multipleCreatingNewDocument;
        }

        public final List<BEDocumentConfigLabel> j() {
            return this.shortNameByLanguage;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getSubtype() {
            return this.subtype;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getTypeReferenceName() {
            return this.typeReferenceName;
        }

        public String toString() {
            return "DocumentConfigStorage(typeReferenceName=" + this.typeReferenceName + ", enabled=" + this.enabled + ", subtype=" + this.subtype + ", dynamic=" + this.dynamic + ", maintenanceBreak=" + this.maintenanceBreak + ", asyncDownloadTerminationInterval=" + this.asyncDownloadTerminationInterval + ", longNameByLanguage=" + this.longNameByLanguage + ", shortNameByLanguage=" + this.shortNameByLanguage + ", additionalNameDescriptionByLanguage=" + this.additionalNameDescriptionByLanguage + ", additionalVerificationRequired=" + this.additionalVerificationRequired + ", documentStoringMode=" + this.documentStoringMode + ", multipleCreatingNewDocument=" + this.multipleCreatingNewDocument + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f159215d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f159217f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f159215d = obj;
            this.f159217f |= PKIFailureInfo.systemUnavail;
            return h.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmu/h;", "", "Lfr0/g;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements p<mu.h<? super List<? extends DocumentConfig>>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f159218e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f159219f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f159220g;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        
            if (r2.F(r6, r5) == r1) goto L16;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f159220g
                mu.h r0 = (mu.h) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f159219f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r6)
                goto L4f
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                java.lang.Object r2 = r5.f159218e
                mu.h r2 = (mu.h) r2
                oq.u.b(r6)
                goto L3d
            L26:
                oq.u.b(r6)
                pl.gov.coi.mobywatel.technical.documents.data.storage.h r6 = pl.gov.coi.mobywatel.technical.documents.data.storage.h.this
                java.lang.Object r2 = vq.j.a(r0)
                r5.f159220g = r2
                r5.f159218e = r0
                r5.f159219f = r4
                java.lang.Object r6 = r6.d(r5)
                if (r6 != r1) goto L3c
                goto L4e
            L3c:
                r2 = r0
            L3d:
                java.lang.Object r0 = vq.j.a(r0)
                r5.f159220g = r0
                r0 = 0
                r5.f159218e = r0
                r5.f159219f = r3
                java.lang.Object r6 = r2.F(r6, r5)
                if (r6 != r1) goto L4f
            L4e:
                return r1
            L4f:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.documents.data.storage.h.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super List<DocumentConfig>> hVar, tq.e<? super i0> eVar) {
            return ((d) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = h.this.new d(eVar);
            dVar.f159220g = obj;
            return dVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f159222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f159223e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f159224f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f159226h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f159224f = obj;
            this.f159226h |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, this);
        }
    }

    public h(final cz.c cVar, j jVar) {
        this.jsonSerializer = jVar;
        this.storage = l.a(new er.a() { // from class: pl.gov.coi.mobywatel.technical.documents.data.storage.f
            @Override // er.a
            public final Object a() {
                return h.j(cVar);
            }
        });
    }

    private final a0<List<DocumentConfig>> g() {
        return (a0) this.monitor.getValue();
    }

    private final cz.b h() {
        return (cz.b) this.storage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 i() {
        return h0.b(1, 0, lu.a.DROP_OLDEST, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b j(cz.c cVar) {
        return cVar.a("shared_prefs_documents_configs", cz.d.PLAIN);
    }

    private final List<DocumentConfig> k(List<DocumentConfigStorage> list) {
        ArrayList arrayList = new ArrayList();
        for (DocumentConfigStorage documentConfigStorage : list) {
            boolean enabled = documentConfigStorage.getEnabled();
            String subtype = documentConfigStorage.getSubtype();
            Boolean dynamic = documentConfigStorage.getDynamic();
            DocumentMaintenanceBreak maintenanceBreak = documentConfigStorage.getMaintenanceBreak();
            rq0.b bVarA = rq0.b.INSTANCE.a(documentConfigStorage.getTypeReferenceName());
            DocumentConfig documentConfig = null;
            if (bVarA != null) {
                long asyncDownloadTerminationInterval = documentConfigStorage.getAsyncDownloadTerminationInterval();
                List<BEDocumentConfigLabel> listA = documentConfigStorage.a();
                List<BEDocumentConfigLabel> listG = documentConfigStorage.g();
                List<BEDocumentConfigLabel> listJ = documentConfigStorage.j();
                i iVarA = i.INSTANCE.a(documentConfigStorage.getDocumentStoringMode());
                if (iVarA != null) {
                    documentConfig = new DocumentConfig(asyncDownloadTerminationInterval, bVarA, enabled, listG, listJ, listA, subtype, dynamic, maintenanceBreak, documentConfigStorage.getAdditionalVerificationRequired(), iVarA, documentConfigStorage.getMultipleCreatingNewDocument());
                }
            }
            if (documentConfig != null) {
                arrayList.add(documentConfig);
            }
        }
        return arrayList;
    }

    private final List<DocumentConfigStorage> l(List<DocumentConfig> list) {
        List<DocumentConfig> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (DocumentConfig documentConfig : list2) {
            boolean enabled = documentConfig.getEnabled();
            String subtype = documentConfig.getSubtype();
            Boolean dynamic = documentConfig.getDynamic();
            DocumentMaintenanceBreak maintenanceBreak = documentConfig.getMaintenanceBreak();
            String referenceName = documentConfig.getType().getReferenceName();
            List<BEDocumentConfigLabel> listJ = documentConfig.j();
            long asyncDownloadTerminationInterval = documentConfig.getAsyncDownloadTerminationInterval();
            List<BEDocumentConfigLabel> listA = documentConfig.a();
            List<BEDocumentConfigLabel> listG = documentConfig.g();
            i documentStoringMode = documentConfig.getDocumentStoringMode();
            arrayList.add(new DocumentConfigStorage(referenceName, enabled, subtype, dynamic, maintenanceBreak, asyncDownloadTerminationInterval, listG, listJ, listA, documentConfig.getAdditionalVerificationRequired(), documentStoringMode != null ? documentStoringMode.name() : null, documentConfig.getMultipleCreatingNewDocument()));
        }
        return arrayList;
    }

    @Override // pl.gov.coi.mobywatel.technical.documents.data.storage.a
    public mu.g<List<DocumentConfig>> a() {
        return mu.i.T(g(), new d(null));
    }

    @Override // pl.gov.coi.mobywatel.technical.documents.data.storage.a
    public Object b(tq.e<? super i0> eVar) {
        Object objA = h().a(eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r12.F(r2, r0) == r1) goto L29;
     */
    @Override // pl.gov.coi.mobywatel.technical.documents.data.storage.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.util.List<fr0.DocumentConfig> r11, tq.e<? super oq.i0> r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof pl.gov.coi.mobywatel.technical.documents.data.storage.h.e
            if (r0 == 0) goto L13
            r0 = r12
            pl.gov.coi.mobywatel.technical.documents.data.storage.h$e r0 = (pl.gov.coi.mobywatel.technical.documents.data.storage.h.e) r0
            int r1 = r0.f159226h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159226h = r1
            goto L18
        L13:
            pl.gov.coi.mobywatel.technical.documents.data.storage.h$e r0 = new pl.gov.coi.mobywatel.technical.documents.data.storage.h$e
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f159224f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f159226h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L54
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r11 = r0.f159223e
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = r0.f159222d
            java.util.List r11 = (java.util.List) r11
            oq.u.b(r12)
            goto Lb7
        L38:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L40:
            java.lang.Object r11 = r0.f159223e
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r0.f159222d
            java.util.List r2 = (java.util.List) r2
            oq.u.b(r12)
            goto L95
        L4c:
            java.lang.Object r11 = r0.f159222d
            java.util.List r11 = (java.util.List) r11
            oq.u.b(r12)
            goto L62
        L54:
            oq.u.b(r12)
            r0.f159222d = r11
            r0.f159226h = r5
            java.lang.Object r12 = r10.d(r0)
            if (r12 != r1) goto L62
            goto Lb6
        L62:
            java.util.List r12 = (java.util.List) r12
            cz.b r2 = r10.h()
            java.lang.String r5 = pl.gov.coi.mobywatel.technical.documents.data.storage.h.f159199e
            ay.j r6 = r10.jsonSerializer
            java.util.List r7 = r10.l(r11)
            mr.r$a r8 = mr.r.INSTANCE
            java.lang.Class<pl.gov.coi.mobywatel.technical.documents.data.storage.h$b> r9 = pl.gov.coi.mobywatel.technical.documents.data.storage.h.DocumentConfigStorage.class
            mr.p r9 = fr.q0.n(r9)
            mr.r r8 = r8.d(r9)
            java.lang.Class<java.util.List> r9 = java.util.List.class
            mr.p r8 = fr.q0.o(r9, r8)
            java.lang.String r6 = r6.b(r7, r8)
            r0.f159222d = r11
            r0.f159223e = r12
            r0.f159226h = r4
            java.lang.Object r2 = r2.e(r5, r6, r0)
            if (r2 != r1) goto L93
            goto Lb6
        L93:
            r2 = r11
            r11 = r12
        L95:
            r12 = r2
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r11.containsAll(r12)
            if (r12 != 0) goto Lba
            mu.a0 r12 = r10.g()
            java.lang.Object r4 = vq.j.a(r2)
            r0.f159222d = r4
            java.lang.Object r11 = vq.j.a(r11)
            r0.f159223e = r11
            r0.f159226h = r3
            java.lang.Object r11 = r12.F(r2, r0)
            if (r11 != r1) goto Lb7
        Lb6:
            return r1
        Lb7:
            oq.i0 r11 = oq.i0.f148189a
            return r11
        Lba:
            oq.i0 r11 = oq.i0.f148189a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.documents.data.storage.h.c(java.util.List, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pl.gov.coi.mobywatel.technical.documents.data.storage.a
    public Object d(tq.e<? super List<DocumentConfig>> eVar) throws Throwable {
        c cVar;
        List<DocumentConfig> listK;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f159217f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f159217f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objJ = cVar.f159215d;
        Object objE = uq.b.e();
        int i16 = cVar.f159217f;
        boolean z15 = true;
        if (i16 == 0) {
            u.b(objJ);
            cz.b bVarH = h();
            String str = f159199e;
            cVar.f159217f = 1;
            objJ = bVarH.j(str, cVar);
            if (objJ == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objJ);
        }
        String str2 = (String) objJ;
        if (str2 != null && str2.length() != 0) {
            z15 = false;
        }
        if (z15) {
            objJ = null;
        }
        String str3 = (String) objJ;
        return (str3 == null || (listK = k((List) this.jsonSerializer.a(str3, q0.o(List.class, r.INSTANCE.d(q0.n(DocumentConfigStorage.class)))))) == null) ? v.n() : listK;
    }
}
