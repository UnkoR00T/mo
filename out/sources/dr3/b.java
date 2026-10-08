package dr3;

import cr3.WruDocumentItem;
import dx.i;
import ez.c;
import fr.t;
import hr3.LicenceCode;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ldr3/b;", "", "Ldr3/b$a;", "Lcr3/b;", "Lez/c;", "dateConverter", "Lar3/a;", "wruContainersInteractor", "<init>", "(Lez/c;Lar3/a;)V", "", "Lcr3/f;", "commonParameters", "Ljava/util/Date;", "d", "(Ljava/util/List;)Ljava/util/Date;", "params", "Ldx/i;", "Ldx/b;", "e", "(Ldr3/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lez/c;", "b", "Lar3/a;", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c dateConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ar3.a wruContainersInteractor;

    /* JADX INFO: renamed from: dr3.b$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Ldr3/b$a;", "Lgz/b$a;", "Lhr3/d;", "licenceCode", "", "documentId", "", "Lcr3/f;", "commonParameters", "<init>", "(Lhr3/d;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhr3/d;", "c", "()Lhr3/d;", "b", "Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LicenceCode licenceCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<WruDocumentItem> commonParameters;

        public Params(LicenceCode licenceCode, String str, List<WruDocumentItem> list) {
            this.licenceCode = licenceCode;
            this.documentId = str;
            this.commonParameters = list;
        }

        public final List<WruDocumentItem> a() {
            return this.commonParameters;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LicenceCode getLicenceCode() {
            return this.licenceCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.licenceCode, params.licenceCode) && t.c(this.documentId, params.documentId) && t.c(this.commonParameters, params.commonParameters);
        }

        public int hashCode() {
            int iHashCode = this.licenceCode.hashCode() * 31;
            String str = this.documentId;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.commonParameters.hashCode();
        }

        public String toString() {
            return "Params(licenceCode=" + this.licenceCode + ", documentId=" + this.documentId + ", commonParameters=" + this.commonParameters + ')';
        }
    }

    public b(c cVar, ar3.a aVar) {
        this.dateConverter = cVar;
        this.wruContainersInteractor = aVar;
    }

    private final Date d(List<WruDocumentItem> commonParameters) {
        Object next;
        Iterator<T> it = commonParameters.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!t.c(((WruDocumentItem) next).getType(), "VALID_TO"));
        WruDocumentItem wruDocumentItem = (WruDocumentItem) next;
        String value = wruDocumentItem != null ? wruDocumentItem.getValue() : null;
        c cVar = this.dateConverter;
        if (value == null || value.length() == 0) {
            value = null;
        }
        if (value == null) {
            return null;
        }
        return cVar.e(value, fz.c.DASHED_REVERSED);
    }

    public Object e(Params params, e<? super i<? extends dx.b, ? extends cr3.b>> eVar) {
        return this.wruContainersInteractor.g(d(params.a()), params.getLicenceCode(), params.getDocumentId(), eVar);
    }
}
