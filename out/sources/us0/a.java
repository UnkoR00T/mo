package us0;

import er.p;
import fr.t;
import iy.b0;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lus0/a;", "", "Lus0/a$a;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends gz.b {

    /* JADX INFO: renamed from: us0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012.\u0010\f\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR?\u0010\f\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"Lus0/a$a;", "Lgz/b$a;", "Liy/b0;", "challenge", "Ljava/time/OffsetDateTime;", "value", "Lkotlin/Function2;", "Ltq/e;", "Ldx/i;", "Ldx/b;", "Lry/a;", "", "signBase64", "<init>", "(Liy/b0;Ljava/time/OffsetDateTime;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Ljava/time/OffsetDateTime;", "c", "()Ljava/time/OffsetDateTime;", "Ler/p;", "()Ler/p;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 challenge;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<b0, tq.e<? super dx.i<? extends dx.b, ry.a>>, Object> signBase64;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(b0 b0Var, OffsetDateTime offsetDateTime, p<? super b0, ? super tq.e<? super dx.i<? extends dx.b, ry.a>>, ? extends Object> pVar) {
            this.challenge = b0Var;
            this.value = offsetDateTime;
            this.signBase64 = pVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getChallenge() {
            return this.challenge;
        }

        public final p<b0, tq.e<? super dx.i<? extends dx.b, ry.a>>, Object> b() {
            return this.signBase64;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final OffsetDateTime getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.challenge, params.challenge) && t.c(this.value, params.value) && t.c(this.signBase64, params.signBase64);
        }

        public int hashCode() {
            int iHashCode = this.challenge.hashCode() * 31;
            OffsetDateTime offsetDateTime = this.value;
            return ((iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31) + this.signBase64.hashCode();
        }

        public String toString() {
            return "Params(challenge=" + this.challenge + ", value=" + this.value + ", signBase64=" + this.signBase64 + ")";
        }
    }
}
