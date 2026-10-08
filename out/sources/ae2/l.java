package ae2;

import fr.t;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lae2/l;", "Lgz/a;", "Lae2/l$a;", "Lhz/g;", "Lhz/i;", "validatorTextFactory", "Lmx/c;", "labelProvider", "<init>", "(Lhz/i;Lmx/c;)V", "params", "b", "(Lae2/l$a;)Lhz/g;", "Lhz/h;", "a", "Lhz/h;", "validator", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements gz.a<Param, hz.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hz.h validator;

    /* JADX INFO: renamed from: ae2.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lae2/l$a;", "Lgz/b$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Param implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5625b = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 text;

        public Param(b0 b0Var) {
            this.text = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getText() {
            return this.text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Param) && t.c(this.text, ((Param) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Param(text=" + this.text + ')';
        }
    }

    public l(hz.i iVar, mx.c cVar) {
        this.validator = (hz.h) hz.c.INSTANCE.a(iVar.a().y(1000, cVar.e(ud2.a.K, 1000)), new yd2.b.a(cVar.c(ud2.a.P)));
    }

    public hz.g b(Param params) {
        return this.validator.a(c0.e(params.getText()));
    }
}
