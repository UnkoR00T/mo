package tz2;

import jk0.QualifiedSignatureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Ltz2/j;", "", "Ljk0/m;", "qualifiedSignatureInfo", "<init>", "(Ljk0/m;)V", "a", "Ljk0/m;", "()Ljk0/m;", "c", "b", "d", "Ltz2/j$a;", "Ltz2/j$b;", "Ltz2/j$c;", "Ltz2/j$d;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final QualifiedSignatureInfo qualifiedSignatureInfo;

    /* JADX INFO: renamed from: tz2.j$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Ltz2/j$a;", "Ltz2/j;", "Ljk0/m;", "qualifiedSignatureInfo", "", "providerId", "Lhb4/c;", "errorVMS", "<init>", "(Ljk0/m;Ljava/lang/String;Lhb4/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljk0/m;", "a", "()Ljk0/m;", "c", "Ljava/lang/String;", "d", "Lhb4/c;", "()Lhb4/c;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final QualifiedSignatureInfo qualifiedSignatureInfo;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String providerId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final hb4.c errorVMS;

        public Error(QualifiedSignatureInfo qualifiedSignatureInfo, String str, hb4.c cVar) {
            super(qualifiedSignatureInfo, null);
            this.qualifiedSignatureInfo = qualifiedSignatureInfo;
            this.providerId = str;
            this.errorVMS = cVar;
        }

        @Override // tz2.j
        /* JADX INFO: renamed from: a, reason: from getter */
        public QualifiedSignatureInfo getQualifiedSignatureInfo() {
            return this.qualifiedSignatureInfo;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hb4.c getErrorVMS() {
            return this.errorVMS;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return fr.t.c(this.qualifiedSignatureInfo, error.qualifiedSignatureInfo) && fr.t.c(this.providerId, error.providerId) && fr.t.c(this.errorVMS, error.errorVMS);
        }

        public int hashCode() {
            return (((this.qualifiedSignatureInfo.hashCode() * 31) + this.providerId.hashCode()) * 31) + this.errorVMS.hashCode();
        }

        public String toString() {
            return "Error(qualifiedSignatureInfo=" + this.qualifiedSignatureInfo + ", providerId=" + this.providerId + ", errorVMS=" + this.errorVMS + ')';
        }
    }

    /* JADX INFO: renamed from: tz2.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\t¨\u0006\u0018"}, d2 = {"Ltz2/j$b;", "Ltz2/j;", "Ljk0/m;", "qualifiedSignatureInfo", "", "providerId", "<init>", "(Ljk0/m;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljk0/m;", "a", "()Ljk0/m;", "c", "Ljava/lang/String;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GenerateProviderEntry extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final QualifiedSignatureInfo qualifiedSignatureInfo;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String providerId;

        public GenerateProviderEntry(QualifiedSignatureInfo qualifiedSignatureInfo, String str) {
            super(qualifiedSignatureInfo, null);
            this.qualifiedSignatureInfo = qualifiedSignatureInfo;
            this.providerId = str;
        }

        @Override // tz2.j
        /* JADX INFO: renamed from: a, reason: from getter */
        public QualifiedSignatureInfo getQualifiedSignatureInfo() {
            return this.qualifiedSignatureInfo;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GenerateProviderEntry)) {
                return false;
            }
            GenerateProviderEntry generateProviderEntry = (GenerateProviderEntry) other;
            return fr.t.c(this.qualifiedSignatureInfo, generateProviderEntry.qualifiedSignatureInfo) && fr.t.c(this.providerId, generateProviderEntry.providerId);
        }

        public int hashCode() {
            return (this.qualifiedSignatureInfo.hashCode() * 31) + this.providerId.hashCode();
        }

        public String toString() {
            return "GenerateProviderEntry(qualifiedSignatureInfo=" + this.qualifiedSignatureInfo + ", providerId=" + this.providerId + ')';
        }
    }

    /* JADX INFO: renamed from: tz2.j$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltz2/j$c;", "Ltz2/j;", "Ljk0/m;", "qualifiedSignatureInfo", "<init>", "(Ljk0/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljk0/m;", "a", "()Ljk0/m;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final QualifiedSignatureInfo qualifiedSignatureInfo;

        public Initialized(QualifiedSignatureInfo qualifiedSignatureInfo) {
            super(qualifiedSignatureInfo, null);
            this.qualifiedSignatureInfo = qualifiedSignatureInfo;
        }

        @Override // tz2.j
        /* JADX INFO: renamed from: a, reason: from getter */
        public QualifiedSignatureInfo getQualifiedSignatureInfo() {
            return this.qualifiedSignatureInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initialized) && fr.t.c(this.qualifiedSignatureInfo, ((Initialized) other).qualifiedSignatureInfo);
        }

        public int hashCode() {
            return this.qualifiedSignatureInfo.hashCode();
        }

        public String toString() {
            return "Initialized(qualifiedSignatureInfo=" + this.qualifiedSignatureInfo + ')';
        }
    }

    /* JADX INFO: renamed from: tz2.j$d, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\t¨\u0006\u0018"}, d2 = {"Ltz2/j$d;", "Ltz2/j;", "Ljk0/m;", "qualifiedSignatureInfo", "", "providerEntryUrl", "<init>", "(Ljk0/m;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljk0/m;", "a", "()Ljk0/m;", "c", "Ljava/lang/String;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RedirectionToProvider extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final QualifiedSignatureInfo qualifiedSignatureInfo;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String providerEntryUrl;

        public RedirectionToProvider(QualifiedSignatureInfo qualifiedSignatureInfo, String str) {
            super(qualifiedSignatureInfo, null);
            this.qualifiedSignatureInfo = qualifiedSignatureInfo;
            this.providerEntryUrl = str;
        }

        @Override // tz2.j
        /* JADX INFO: renamed from: a, reason: from getter */
        public QualifiedSignatureInfo getQualifiedSignatureInfo() {
            return this.qualifiedSignatureInfo;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getProviderEntryUrl() {
            return this.providerEntryUrl;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RedirectionToProvider)) {
                return false;
            }
            RedirectionToProvider redirectionToProvider = (RedirectionToProvider) other;
            return fr.t.c(this.qualifiedSignatureInfo, redirectionToProvider.qualifiedSignatureInfo) && fr.t.c(this.providerEntryUrl, redirectionToProvider.providerEntryUrl);
        }

        public int hashCode() {
            return (this.qualifiedSignatureInfo.hashCode() * 31) + this.providerEntryUrl.hashCode();
        }

        public String toString() {
            return "RedirectionToProvider(qualifiedSignatureInfo=" + this.qualifiedSignatureInfo + ", providerEntryUrl=" + this.providerEntryUrl + ')';
        }
    }

    public /* synthetic */ j(QualifiedSignatureInfo qualifiedSignatureInfo, fr.k kVar) {
        this(qualifiedSignatureInfo);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public QualifiedSignatureInfo getQualifiedSignatureInfo() {
        return this.qualifiedSignatureInfo;
    }

    private j(QualifiedSignatureInfo qualifiedSignatureInfo) {
        this.qualifiedSignatureInfo = qualifiedSignatureInfo;
    }
}
