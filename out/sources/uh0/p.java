package uh0;

import ay.Challenge;
import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Luh0/p;", "", "Luh0/p$a;", "Lth0/s;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface p extends gz.b {

    /* JADX INFO: renamed from: uh0.p$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Luh0/p$a;", "Lgz/b$a;", "Liy/b0;", "certSerialNumber", "Lay/c;", "challenge", "Lry/c;", "certKeyPair", "<init>", "(Liy/b0;Lay/c;Lry/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "Lay/c;", "c", "()Lay/c;", "Lry/c;", "()Lry/c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 certSerialNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Challenge challenge;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CertKeyPair certKeyPair;

        public Params(b0 b0Var, Challenge challenge, CertKeyPair certKeyPair) {
            this.certSerialNumber = b0Var;
            this.challenge = challenge;
            this.certKeyPair = certKeyPair;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CertKeyPair getCertKeyPair() {
            return this.certKeyPair;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getCertSerialNumber() {
            return this.certSerialNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Challenge getChallenge() {
            return this.challenge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.certSerialNumber, params.certSerialNumber) && t.c(this.challenge, params.challenge) && t.c(this.certKeyPair, params.certKeyPair);
        }

        public int hashCode() {
            return (((this.certSerialNumber.hashCode() * 31) + this.challenge.hashCode()) * 31) + this.certKeyPair.hashCode();
        }

        public String toString() {
            return "Params(certSerialNumber=" + this.certSerialNumber + ", challenge=" + this.challenge + ", certKeyPair=" + this.certKeyPair + ")";
        }
    }
}
