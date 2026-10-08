package am1;

import al0.ParentOrGuardData;
import fr.t;
import fu.r;
import iy.c0;
import java.util.List;
import n30.CardListData;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lam1/e;", "Lxw/f;", "Lam1/e$a;", "Lyl1/i$a$b$b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lam1/e$a;)Lyl1/i$a$b$b;", "a", "Lmx/c;", "Lal0/j0;", "", "Ln50/g;", "c", "(Lal0/j0;)Ljava/util/List;", "cards", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, yl1.i.a.Initialized.Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: am1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lam1/e$a;", "", "Lal0/j0;", "data", "<init>", "(Lal0/j0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/j0;", "()Lal0/j0;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ParentOrGuardData data;

        public Params(ParentOrGuardData parentOrGuardData) {
            this.data = parentOrGuardData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ParentOrGuardData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.data, ((Params) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ')';
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<DefaultSingleCardData> c(ParentOrGuardData parentOrGuardData) {
        mx.c cVar = this.labelProvider;
        DefaultSingleCardData defaultSingleCardDataB = xk1.a.b(cVar, Integer.valueOf(gk1.a.F), mx.b.b(parentOrGuardData.getFirstName(), "firstName"), null, 4, null);
        String secondName = parentOrGuardData.getSecondName();
        DefaultSingleCardData defaultSingleCardDataB2 = null;
        if (secondName != null) {
            if (r.t0(secondName)) {
                secondName = null;
            }
            if (secondName != null) {
                defaultSingleCardDataB2 = xk1.a.b(cVar, Integer.valueOf(gk1.a.f73420a0), mx.b.b(secondName, "secondName"), null, 4, null);
            }
        }
        return v.s(defaultSingleCardDataB, defaultSingleCardDataB2, xk1.a.b(cVar, Integer.valueOf(gk1.a.P), mx.b.b(parentOrGuardData.getSurname(), "surname"), null, 4, null), xk1.a.b(cVar, Integer.valueOf(gk1.a.M), mx.b.b(c0.e(parentOrGuardData.getIdentityCardSeriesAndNumber()), "idCardSeriesAndNumber"), null, 4, null));
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public yl1.i.a.Initialized.Section b(Params params) {
        return new yl1.i.a.Initialized.Section(this.labelProvider.c(gk1.a.f73444m0), new CardListData(c(params.getData()), null, false, null, null, 30, null));
    }
}
