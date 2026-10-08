package uh0;

import fr.t;
import iy.b0;
import java.security.KeyPair;
import p071kotlin.Metadata;
import th0.AsyncAppActivationWithKeysResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Luh0/c;", "", "Luh0/c$a;", "Luh0/c$b;", "a", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends gz.b {

    /* JADX INFO: renamed from: uh0.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Luh0/c$a;", "Lgz/b$a;", "Liy/b0;", "challenge", "Ljava/security/KeyPair;", "keyPair", "Lth0/a;", "activationDocument", "<init>", "(Liy/b0;Ljava/security/KeyPair;Lth0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "Ljava/security/KeyPair;", "c", "()Ljava/security/KeyPair;", "Lth0/a;", "()Lth0/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 challenge;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final KeyPair keyPair;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final th0.a activationDocument;

        public Params(b0 b0Var, KeyPair keyPair, th0.a aVar) {
            this.challenge = b0Var;
            this.keyPair = keyPair;
            this.activationDocument = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final th0.a getActivationDocument() {
            return this.activationDocument;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getChallenge() {
            return this.challenge;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final KeyPair getKeyPair() {
            return this.keyPair;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.challenge, params.challenge) && t.c(this.keyPair, params.keyPair) && t.c(this.activationDocument, params.activationDocument);
        }

        public int hashCode() {
            return (((this.challenge.hashCode() * 31) + this.keyPair.hashCode()) * 31) + this.activationDocument.hashCode();
        }

        public String toString() {
            return "Params(challenge=" + this.challenge + ", keyPair=" + this.keyPair + ", activationDocument=" + this.activationDocument + ")";
        }
    }

    /* JADX INFO: renamed from: uh0.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Luh0/c$b;", "", "Lth0/c;", "response", "Ljava/security/KeyPair;", "keyPair", "<init>", "(Lth0/c;Ljava/security/KeyPair;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lth0/c;", "b", "()Lth0/c;", "Ljava/security/KeyPair;", "()Ljava/security/KeyPair;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AsyncAppActivationWithKeysResponse response;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final KeyPair keyPair;

        public Result(AsyncAppActivationWithKeysResponse asyncAppActivationWithKeysResponse, KeyPair keyPair) {
            this.response = asyncAppActivationWithKeysResponse;
            this.keyPair = keyPair;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final KeyPair getKeyPair() {
            return this.keyPair;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AsyncAppActivationWithKeysResponse getResponse() {
            return this.response;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return t.c(this.response, result.response) && t.c(this.keyPair, result.keyPair);
        }

        public int hashCode() {
            return (this.response.hashCode() * 31) + this.keyPair.hashCode();
        }

        public String toString() {
            return "Result(response=" + this.response + ", keyPair=" + this.keyPair + ")";
        }
    }
}
