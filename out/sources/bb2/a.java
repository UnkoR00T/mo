package bb2;

import fr.t;
import hz.g;
import hz.h;
import mx.c;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lbb2/a;", "Lgz/b;", "Lbb2/a$a;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/h;", "validatorText", "<init>", "(Lmx/c;Lhz/h;)V", "params", "d", "(Lbb2/a$a;Ltq/e;)Ljava/lang/Object;", "", "a", "I", "requiredLength", "b", "Lhz/h;", "idCollectingNumberValidator", "idcardcollecting_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<Params, g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int requiredLength = 20;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h idCollectingNumberValidator;

    /* JADX INFO: renamed from: bb2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lbb2/a$a;", "Lgz/b$a;", "", "idCollectingNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "idcardcollecting_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String idCollectingNumber;

        public Params(String str) {
            this.idCollectingNumber = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIdCollectingNumber() {
            return this.idCollectingNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.idCollectingNumber, ((Params) other).idCollectingNumber);
        }

        public int hashCode() {
            return this.idCollectingNumber.hashCode();
        }

        public String toString() {
            return "Params(idCollectingNumber=" + this.idCollectingNumber + ')';
        }
    }

    public a(c cVar, h hVar) {
        this.idCollectingNumberValidator = hVar.L(cVar.c(za2.a.f233972c)).O(20, cVar.c(za2.a.f233974e));
    }

    public Object d(Params params, e<? super g> eVar) {
        return this.idCollectingNumberValidator.a(params.getIdCollectingNumber());
    }
}
