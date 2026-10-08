package am1;

import fr.t;
import il0.BeChildAndParentsData;
import java.util.List;
import n30.CardListData;
import n50.DefaultSingleCardData;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lam1/f;", "Lxw/f;", "Lam1/f$a;", "Lyl1/i$a$b$b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lam1/f$a;)Lyl1/i$a$b$b;", "a", "Lmx/c;", "Lil0/a$b;", "", "Ln50/g;", "c", "(Lil0/a$b;)Ljava/util/List;", "cards", "Lkk1/a;", "", "e", "(Lkk1/a;)I", "titleResId", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements xw.f<Params, yl1.i.a.Initialized.Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: am1.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lam1/f$a;", "", "Lkk1/a;", "type", "Lil0/a$b;", "data", "<init>", "(Lkk1/a;Lil0/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkk1/a;", "b", "()Lkk1/a;", "Lil0/a$b;", "()Lil0/a$b;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final kk1.a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BeChildAndParentsData.ParentsData data;

        public Params(kk1.a aVar, BeChildAndParentsData.ParentsData parentsData) {
            this.type = aVar;
            this.data = parentsData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BeChildAndParentsData.ParentsData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final kk1.a getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.type == params.type && t.c(this.data, params.data);
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.data.hashCode();
        }

        public String toString() {
            return "Params(type=" + this.type + ", data=" + this.data + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7787a;

        static {
            int[] iArr = new int[kk1.a.values().length];
            try {
                iArr[kk1.a.CHILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kk1.a.WARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f7787a = iArr;
        }
    }

    public f(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final List<DefaultSingleCardData> c(BeChildAndParentsData.ParentsData parentsData) {
        mx.c cVar = this.labelProvider;
        return v.q(xk1.a.b(cVar, Integer.valueOf(gk1.a.E), xk1.b.a(parentsData.getFathersName(), "parentsFathersName"), null, 4, null), xk1.a.b(cVar, Integer.valueOf(gk1.a.R), xk1.b.a(parentsData.getMothersName(), "parentsMothersName"), null, 4, null), xk1.a.b(cVar, Integer.valueOf(gk1.a.Q), xk1.b.a(parentsData.getMothersMaidenName(), "parentsMothersFamilyName"), null, 4, null));
    }

    private final int e(kk1.a aVar) {
        int i15 = b.f7787a[aVar.ordinal()];
        if (i15 == 1) {
            return gk1.a.f73431g;
        }
        if (i15 == 2) {
            return gk1.a.f73442l0;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public yl1.i.a.Initialized.Section b(Params params) {
        return new yl1.i.a.Initialized.Section(this.labelProvider.c(e(params.getType())), new CardListData(c(params.getData()), null, false, null, null, 30, null));
    }
}
