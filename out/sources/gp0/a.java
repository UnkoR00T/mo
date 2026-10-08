package gp0;

import fr.t;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lgp0/a;", "", "Lgp0/a$a;", "Lfp0/f;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends gz.b {

    /* JADX INFO: renamed from: gp0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lgp0/a$a;", "Lgz/b$a;", "Lry/c;", "certKeyPair", "Lfp0/d;", "identity", "Lfz/b$a;", "currentServerDate", "<init>", "(Lry/c;Lfp0/d;Lfz/b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lry/c;", "()Lry/c;", "b", "Lfp0/d;", "c", "()Lfp0/d;", "Lfz/b$a;", "()Lfz/b$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertKeyPair certKeyPair;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final fp0.d identity;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.Date currentServerDate;

        public Params(CertKeyPair certKeyPair, fp0.d dVar, fz.b.Date date) {
            this.certKeyPair = certKeyPair;
            this.identity = dVar;
            this.currentServerDate = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CertKeyPair getCertKeyPair() {
            return this.certKeyPair;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final fz.b.Date getCurrentServerDate() {
            return this.currentServerDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final fp0.d getIdentity() {
            return this.identity;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.certKeyPair, params.certKeyPair) && t.c(this.identity, params.identity) && t.c(this.currentServerDate, params.currentServerDate);
        }

        public int hashCode() {
            return (((this.certKeyPair.hashCode() * 31) + this.identity.hashCode()) * 31) + this.currentServerDate.hashCode();
        }

        public String toString() {
            return "Params(certKeyPair=" + this.certKeyPair + ", identity=" + this.identity + ", currentServerDate=" + this.currentServerDate + ")";
        }
    }
}
