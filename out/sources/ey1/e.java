package ey1;

import fr.t;
import i50.BaseScaffoldData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ley1/e;", "Ll00/e;", "Ley1/e$a;", "a", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {

    /* JADX INFO: renamed from: ey1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u0017\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ley1/e$a;", "", "Li50/a;", "scaffoldData", "Ln50/k;", "presenceCert", "authenticationCert", "authorizationCert", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "<init>", "(Li50/a;Ln50/k;Ln50/k;Ln50/k;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Ln50/k;", "c", "()Ln50/k;", "e", "Ler/a;", "getOnCloseClick", "()Ler/a;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final n50.k presenceCert;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final n50.k authenticationCert;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final n50.k authorizationCert;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseClick;

        public Data(BaseScaffoldData baseScaffoldData, n50.k kVar, n50.k kVar2, n50.k kVar3, er.a<i0> aVar) {
            this.scaffoldData = baseScaffoldData;
            this.presenceCert = kVar;
            this.authenticationCert = kVar2;
            this.authorizationCert = kVar3;
            this.onCloseClick = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final n50.k getAuthenticationCert() {
            return this.authenticationCert;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n50.k getAuthorizationCert() {
            return this.authorizationCert;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final n50.k getPresenceCert() {
            return this.presenceCert;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.scaffoldData, data.scaffoldData) && t.c(this.presenceCert, data.presenceCert) && t.c(this.authenticationCert, data.authenticationCert) && t.c(this.authorizationCert, data.authorizationCert) && t.c(this.onCloseClick, data.onCloseClick);
        }

        public int hashCode() {
            return (((((((this.scaffoldData.hashCode() * 31) + this.presenceCert.hashCode()) * 31) + this.authenticationCert.hashCode()) * 31) + this.authorizationCert.hashCode()) * 31) + this.onCloseClick.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", presenceCert=" + this.presenceCert + ", authenticationCert=" + this.authenticationCert + ", authorizationCert=" + this.authorizationCert + ", onCloseClick=" + this.onCloseClick + ')';
        }
    }
}
