package am1;

import fr.t;
import fu.r;
import il0.BeChildAndParentsData;
import iy.b0;
import iy.c0;
import java.util.List;
import n30.CardListData;
import n50.DefaultSingleCardData;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lam1/b;", "Lxw/f;", "Lam1/b$a;", "Lyl1/i$a$b$b;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "params", "f", "(Lam1/b$a;)Lyl1/i$a$b$b;", "a", "Lmx/c;", "b", "Lez/e;", "Lkk1/a;", "", "e", "(Lkk1/a;)I", "titleResId", "Lil0/a$a;", "", "Ln50/g;", "c", "(Lil0/a$a;)Ljava/util/List;", "cards", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xw.f<Params, yl1.i.a.Initialized.Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: am1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lam1/b$a;", "", "Lkk1/a;", "type", "Lil0/a$a;", "data", "<init>", "(Lkk1/a;Lil0/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkk1/a;", "b", "()Lkk1/a;", "Lil0/a$a;", "()Lil0/a$a;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final kk1.a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BeChildAndParentsData.ChildData data;

        public Params(kk1.a aVar, BeChildAndParentsData.ChildData childData) {
            this.type = aVar;
            this.data = childData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BeChildAndParentsData.ChildData getData() {
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

    /* JADX INFO: renamed from: am1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0171b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7775a;

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
            f7775a = iArr;
        }
    }

    public b(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d8  */
    private final List<DefaultSingleCardData> c(BeChildAndParentsData.ChildData childData) {
        DefaultSingleCardData defaultSingleCardDataB;
        DefaultSingleCardData defaultSingleCardData;
        String strE;
        String strE2;
        mx.c cVar = this.labelProvider;
        DefaultSingleCardData defaultSingleCardDataB2 = xk1.a.b(cVar, Integer.valueOf(gk1.a.F), xk1.b.a(childData.getFirstName(), "childFirstName"), null, 4, null);
        b0 secondName = childData.getSecondName();
        DefaultSingleCardData defaultSingleCardDataB3 = null;
        if (secondName != null && (strE2 = c0.e(secondName)) != null) {
            if (r.t0(strE2)) {
                strE2 = null;
            }
            if (strE2 != null) {
                defaultSingleCardDataB3 = xk1.a.b(cVar, Integer.valueOf(gk1.a.f73420a0), mx.b.b(strE2, "childSecondName"), null, 4, null);
            }
        }
        DefaultSingleCardData defaultSingleCardDataB4 = xk1.a.b(cVar, Integer.valueOf(gk1.a.P), xk1.b.a(childData.getLastName(), "childLastName"), null, 4, null);
        DefaultSingleCardData defaultSingleCardDataB5 = xk1.a.b(cVar, Integer.valueOf(gk1.a.D), xk1.b.a(childData.getFamilyName(), "childFamilyName"), null, 4, null);
        DefaultSingleCardData defaultSingleCardDataB6 = xk1.a.b(cVar, Integer.valueOf(gk1.a.f73421b), mx.b.b(childData.getBirthPlace(), "childBirthPlace"), null, 4, null);
        DefaultSingleCardData defaultSingleCardDataB7 = xk1.a.b(cVar, Integer.valueOf(gk1.a.f73419a), mx.b.b(this.dateFormatter.d(childData.getBirthDate(), fz.c.DOTTED), "childBirthDate"), null, 4, null);
        b0 idSeriesAndNumber = childData.getIdSeriesAndNumber();
        if (idSeriesAndNumber == null || (strE = c0.e(idSeriesAndNumber)) == null) {
            defaultSingleCardDataB = defaultSingleCardDataB3;
            defaultSingleCardData = defaultSingleCardDataB7;
        } else {
            if (r.t0(strE)) {
                strE = null;
            }
            if (strE != null) {
                defaultSingleCardData = defaultSingleCardDataB7;
                defaultSingleCardDataB = xk1.a.b(cVar, Integer.valueOf(gk1.a.M), mx.b.b(strE, "childIdSeriesAndNumber"), null, 4, null);
            } else {
                defaultSingleCardDataB = defaultSingleCardDataB3;
                defaultSingleCardData = defaultSingleCardDataB7;
            }
        }
        return v.s(defaultSingleCardDataB2, defaultSingleCardDataB3, defaultSingleCardDataB4, defaultSingleCardDataB5, defaultSingleCardDataB6, defaultSingleCardData, defaultSingleCardDataB);
    }

    private final int e(kk1.a aVar) {
        int i15 = C0171b.f7775a[aVar.ordinal()];
        if (i15 == 1) {
            return gk1.a.f73429f;
        }
        if (i15 == 2) {
            return gk1.a.f73440k0;
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public yl1.i.a.Initialized.Section b(Params params) {
        return new yl1.i.a.Initialized.Section(this.labelProvider.c(e(params.getType())), new CardListData(c(params.getData()), null, false, null, null, 30, null));
    }
}
