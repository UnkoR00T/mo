package th0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: th0.k, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lth0/k;", "", "Lth0/k$a;", "certificateSourceDocumentType", "<init>", "(Lth0/k$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth0/k$a;", "()Lth0/k$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitExternalAuthInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a certificateSourceDocumentType;

    /* JADX INFO: renamed from: th0.k$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lth0/k$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        DIIA_PL("DIIA_PL"),
        MOBILE_ID_CARD("MOBILE_ID_CARD"),
        PHYSICAL_CARD_ID("PHYSICAL_CARD_ID"),
        SCHOOL_STUDENT_CARD("SCHOOL_STUDENT_CARD"),
        UNIVERSITY_STUDENT_CARD("UNIVERSITY_STUDENT_CARD"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ wq.a f190239k = wq.b.a(b());

        a(String str) {
            this.value = str;
        }
    }

    public InitExternalAuthInput(a aVar) {
        this.certificateSourceDocumentType = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCertificateSourceDocumentType() {
        return this.certificateSourceDocumentType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InitExternalAuthInput) && this.certificateSourceDocumentType == ((InitExternalAuthInput) other).certificateSourceDocumentType;
    }

    public int hashCode() {
        return this.certificateSourceDocumentType.hashCode();
    }

    public String toString() {
        return "InitExternalAuthInput(certificateSourceDocumentType=" + this.certificateSourceDocumentType + ")";
    }
}
