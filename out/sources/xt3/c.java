package xt3;

import fr.t;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\r\u000bB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lxt3/c;", "Lgz/a;", "Lxt3/c$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "params", "b", "(Lxt3/c$b;)Lhz/g;", "a", "Lmx/c;", "Lhz/i;", "c", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.a<Params, hz.g> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f221098d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f221099e = rt3.a.f176120w;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz.i validatorTextFactory;

    /* JADX INFO: renamed from: xt3.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lxt3/c$b;", "Lgz/b$a;", "", "apartmentNumber", "", "isRequired", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String apartmentNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRequired;

        public Params(String str, boolean z15) {
            this.apartmentNumber = str;
            this.isRequired = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getApartmentNumber() {
            return this.apartmentNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.apartmentNumber, params.apartmentNumber) && this.isRequired == params.isRequired;
        }

        public int hashCode() {
            return (this.apartmentNumber.hashCode() * 31) + Boolean.hashCode(this.isRequired);
        }

        public String toString() {
            return "Params(apartmentNumber=" + this.apartmentNumber + ", isRequired=" + this.isRequired + ')';
        }
    }

    public c(mx.c cVar, hz.i iVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
    }

    public hz.g b(Params params) {
        boolean z15 = params.getApartmentNumber().length() == 0;
        if (z15) {
            return hz.g.b.f86853b;
        }
        if (z15) {
            throw new p();
        }
        hz.c.Companion companion = hz.c.INSTANCE;
        hz.h hVarA = this.validatorTextFactory.a();
        if (params.getIsRequired()) {
            hVarA.M(this.labelProvider.c(f221099e));
        }
        mx.c cVar = this.labelProvider;
        int i15 = f221099e;
        return ((hz.h) companion.a(hVarA.F(cVar.c(i15)), new vt3.c.a(this.labelProvider.c(i15)))).y(10, this.labelProvider.c(rt3.a.f176123z)).a(params.getApartmentNumber());
    }
}
