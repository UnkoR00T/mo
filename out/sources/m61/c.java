package m61;

import fr.t;
import hz.g;
import hz.h;
import j61.e;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000b\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lm61/c;", "Lgz/a;", "Lm61/c$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/h;", "textValidator", "<init>", "(Lmx/c;Lhz/h;)V", "params", "b", "(Lm61/c$b;)Lhz/g;", "a", "Lhz/h;", "validator", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.a<Params, g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f123838c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h validator;

    /* JADX INFO: renamed from: m61.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lm61/c$b;", "Lgz/b$a;", "", "birthPlace", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String birthPlace;

        public Params(String str) {
            this.birthPlace = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBirthPlace() {
            return this.birthPlace;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.birthPlace, ((Params) other).birthPlace);
        }

        public int hashCode() {
            return this.birthPlace.hashCode();
        }

        public String toString() {
            return "Params(birthPlace=" + this.birthPlace + ')';
        }
    }

    public c(mx.c cVar, h hVar) {
        this.validator = (h) hz.c.INSTANCE.a(hVar.M(cVar.c(w51.a.O4)).O(1, cVar.e(w51.a.O4, 1)).y(80, cVar.e(w51.a.f210450w5, 80)), new e(cVar.c(w51.a.R4)));
    }

    public g b(Params params) {
        return this.validator.a(params.getBirthPlace());
    }
}
