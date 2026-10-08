package qd0;

import fr.t;
import hz.g;
import hz.h;
import hz.i;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lqd0/a;", "Lgz/b;", "Lqd0/a$a;", "Lhz/g;", "Lhz/i;", "validatorTextFactory", "Lmx/c;", "labelProvider", "<init>", "(Lhz/i;Lmx/c;)V", "", "pinToCompare", "Lhz/h;", "d", "(Ljava/lang/String;)Lhz/h;", "params", "e", "(Lqd0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lhz/i;", "b", "Lmx/c;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<Params, g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i validatorTextFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: qd0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lqd0/a$a;", "Lgz/b$a;", "Liy/b0;", "newPin", "currentPin", "<init>", "(Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "setpin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f166076c = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 newPin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 currentPin;

        public Params(b0 b0Var, b0 b0Var2) {
            this.newPin = b0Var;
            this.currentPin = b0Var2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getCurrentPin() {
            return this.currentPin;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getNewPin() {
            return this.newPin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.newPin, params.newPin) && t.c(this.currentPin, params.currentPin);
        }

        public int hashCode() {
            return (this.newPin.hashCode() * 31) + this.currentPin.hashCode();
        }

        public String toString() {
            return "Params(newPin=" + this.newPin + ", currentPin=" + this.currentPin + ')';
        }
    }

    public a(i iVar, mx.c cVar) {
        this.validatorTextFactory = iVar;
        this.labelProvider = cVar;
    }

    private final h d(String pinToCompare) {
        return this.validatorTextFactory.a().n(pinToCompare, this.labelProvider.c(pd0.a.f157002m)).w(this.labelProvider.c(pd0.a.f156996g)).f(this.labelProvider.c(pd0.a.f156995f));
    }

    public Object e(Params params, e<? super g> eVar) {
        return d(c0.e(params.getCurrentPin())).a(c0.e(params.getNewPin()));
    }
}
