package hq0;

import ay.Challenge;
import er.p;
import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import zp0.BERegisterForDefenceTraining;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lhq0/h;", "", "Lhq0/h$a;", "Lry/a;", "a", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h extends gz.b {

    /* JADX INFO: renamed from: hq0.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012.\u0010\r\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR?\u0010\r\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lhq0/h$a;", "Lgz/b$a;", "Lzp0/g;", "register", "Lay/c;", "militaryChallenge", "Lkotlin/Function2;", "Liy/b0;", "Ltq/e;", "Ldx/i;", "Ldx/b;", "Lry/a;", "", "signBase64", "<init>", "(Lzp0/g;Lay/c;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzp0/g;", "b", "()Lzp0/g;", "Lay/c;", "()Lay/c;", "c", "Ler/p;", "()Ler/p;", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BERegisterForDefenceTraining register;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Challenge militaryChallenge;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<b0, tq.e<? super dx.i<? extends dx.b, ry.a>>, Object> signBase64;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(BERegisterForDefenceTraining bERegisterForDefenceTraining, Challenge challenge, p<? super b0, ? super tq.e<? super dx.i<? extends dx.b, ry.a>>, ? extends Object> pVar) {
            this.register = bERegisterForDefenceTraining;
            this.militaryChallenge = challenge;
            this.signBase64 = pVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Challenge getMilitaryChallenge() {
            return this.militaryChallenge;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BERegisterForDefenceTraining getRegister() {
            return this.register;
        }

        public final p<b0, tq.e<? super dx.i<? extends dx.b, ry.a>>, Object> c() {
            return this.signBase64;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.register, params.register) && t.c(this.militaryChallenge, params.militaryChallenge) && t.c(this.signBase64, params.signBase64);
        }

        public int hashCode() {
            return (((this.register.hashCode() * 31) + this.militaryChallenge.hashCode()) * 31) + this.signBase64.hashCode();
        }

        public String toString() {
            return "Params(register=" + this.register + ", militaryChallenge=" + this.militaryChallenge + ", signBase64=" + this.signBase64 + ')';
        }
    }
}
