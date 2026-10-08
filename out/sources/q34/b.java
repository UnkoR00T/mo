package q34;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lq34/b;", "", "Lq34/b$a;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends gz.b {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lq34/b$a;", "Lgz/b$a;", "Lrq0/b;", "documentType", "Liy/b0;", "peselTicket", "Liy/a0;", "certPkcs12", "password", "<init>", "(Lrq0/b;Liy/b0;Liy/a0;Liy/b0;)V", "a", "Lrq0/b;", "g", "()Lrq0/b;", "b", "Liy/b0;", "c", "()Liy/b0;", "Liy/a0;", "()Liy/a0;", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final rq0.b documentType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final iy.b0 peselTicket;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final iy.a0 certPkcs12;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final iy.b0 password;

        public a(rq0.b bVar, iy.b0 b0Var, iy.a0 a0Var, iy.b0 b0Var2) {
            this.documentType = bVar;
            this.peselTicket = b0Var;
            this.certPkcs12 = a0Var;
            this.password = b0Var2;
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
        public final iy.b0 getPeselTicket() {
            return this.peselTicket;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final rq0.b getDocumentType() {
            return this.documentType;
        }
    }
}
