package q34;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lq34/z1;", "", "Lq34/z1$a;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface z1 extends gz.b {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\f\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018¨\u0006\u0019"}, d2 = {"Lq34/z1$a;", "Lgz/b$a;", "Lrq0/b;", "documentType", "", "peselTicket", "Liy/a0;", "certPkcs12", "Liy/b0;", "password", "<init>", "(Lrq0/b;Ljava/lang/String;Liy/a0;Liy/b0;)V", "a", "Lrq0/b;", "g", "()Lrq0/b;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Liy/a0;", "()Liy/a0;", "d", "Liy/b0;", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final rq0.b documentType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String peselTicket;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final iy.a0 certPkcs12;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final iy.b0 password;

        public a(rq0.b bVar, String str, iy.a0 a0Var, iy.b0 b0Var) {
            this.documentType = bVar;
            this.peselTicket = str;
            this.certPkcs12 = a0Var;
            this.password = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final iy.a0 getCertPkcs12() {
            return this.certPkcs12;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final iy.b0 getPassword() {
            return this.password;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPeselTicket() {
            return this.peselTicket;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final rq0.b getDocumentType() {
            return this.documentType;
        }
    }
}
