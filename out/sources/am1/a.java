package am1;

import java.util.List;
import n30.CardListData;
import n50.DefaultSingleCardData;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u00020\u0013*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lam1/a;", "Lxw/f;", "Lam1/a$a;", "Lyl1/i$a$b$b;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "f", "(Lam1/a$a;)Lyl1/i$a$b$b;", "a", "Lmx/c;", "Lgl0/a;", "", "Ln50/g;", "e", "(Lgl0/a;)Ljava/util/List;", "cards", "", "c", "(Lgl0/a;)I", "bodyResId", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xw.f<Params, yl1.i.a.Initialized.Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: am1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lam1/a$a;", "", "Lgl0/a;", "data", "<init>", "(Lgl0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgl0/a;", "()Lgl0/a;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final gl0.a data;

        public Params(gl0.a aVar) {
            this.data = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final gl0.a getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && this.data == ((Params) other).data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7770a;

        static {
            int[] iArr = new int[gl0.a.values().length];
            try {
                iArr[gl0.a.OFFICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gl0.a.EDOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gl0.a.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7770a = iArr;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final int c(gl0.a aVar) {
        int i15 = b.f7770a[aVar.ordinal()];
        if (i15 == 1) {
            return gk1.a.f73441l;
        }
        if (i15 == 2) {
            return gk1.a.f73434h0;
        }
        if (i15 == 3) {
            return gk1.a.f73451q;
        }
        throw new p();
    }

    private final List<DefaultSingleCardData> e(gl0.a aVar) {
        mx.c cVar = this.labelProvider;
        return v.e(xk1.a.b(cVar, null, cVar.c(c(aVar)), null, 5, null));
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public yl1.i.a.Initialized.Section b(Params params) {
        return new yl1.i.a.Initialized.Section(this.labelProvider.c(gk1.a.f73425d), new CardListData(e(params.getData()), null, false, null, null, 30, null));
    }
}
