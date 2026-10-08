package rw1;

import fr.t;
import hz.g;
import hz.h;
import iy.b0;
import iy.c0;
import lw1.j0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lrw1/c;", "Lgz/b;", "Lrw1/c$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/h;", "validatorText", "<init>", "(Lmx/c;Lhz/h;)V", "params", "d", "(Lrw1/c$b;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lhz/h;", "c", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b<Params, g> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f176555d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h validatorText;

    /* JADX INFO: renamed from: rw1.c$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lrw1/c$b;", "Lgz/b$a;", "Liy/b0;", "pin", "Lyw1/a;", "certificateType", "<init>", "(Liy/b0;Lyw1/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "Lyw1/a;", "()Lyw1/a;", "eidservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f176558c = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 pin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final yw1.a certificateType;

        public Params(b0 b0Var, yw1.a aVar) {
            this.pin = b0Var;
            this.certificateType = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yw1.a getCertificateType() {
            return this.certificateType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getPin() {
            return this.pin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.pin, params.pin) && this.certificateType == params.certificateType;
        }

        public int hashCode() {
            return (this.pin.hashCode() * 31) + this.certificateType.hashCode();
        }

        public String toString() {
            return "Params(pin=" + this.pin + ", certificateType=" + this.certificateType + ')';
        }
    }

    /* JADX INFO: renamed from: rw1.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4506c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f176561a;

        static {
            int[] iArr = new int[yw1.a.values().length];
            try {
                iArr[yw1.a.AUTHENTICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yw1.a.AUTHORIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f176561a = iArr;
        }
    }

    public c(mx.c cVar, h hVar) {
        this.labelProvider = cVar;
        this.validatorText = hVar;
    }

    public Object d(Params params, tq.e<? super g> eVar) {
        h hVarU;
        int i15 = C4506c.f176561a[params.getCertificateType().ordinal()];
        if (i15 == 1) {
            hVarU = this.validatorText.y(4, this.labelProvider.c(j0.U2)).O(4, this.labelProvider.c(j0.U2)).u(this.labelProvider.c(j0.U2));
        } else {
            if (i15 != 2) {
                throw new p();
            }
            hVarU = this.validatorText.y(6, this.labelProvider.c(j0.Z2)).O(6, this.labelProvider.c(j0.Z2)).u(this.labelProvider.c(j0.Z2));
        }
        return hVarU.a(c0.e(params.getPin()));
    }
}
