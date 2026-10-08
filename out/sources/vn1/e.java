package vn1;

import al0.IdCardSuspensionChildData;
import fr.t;
import fu.r;
import iy.b0;
import iy.c0;
import mx.Label;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lvn1/e;", "Lxw/f;", "Lvn1/e$a;", "Ltn1/c$a$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "e", "(Lvn1/e$a;)Ltn1/c$a$a;", "a", "Lmx/c;", "Lmm1/a;", "", "c", "(Lmm1/a;)I", "headerResId", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements xw.f<Params, tn1.c.Data.Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: vn1.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lvn1/e$a;", "", "Lmm1/a;", "type", "Lal0/d0;", "data", "<init>", "(Lmm1/a;Lal0/d0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmm1/a;", "b", "()Lmm1/a;", "Lal0/d0;", "()Lal0/d0;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mm1.a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdCardSuspensionChildData data;

        public Params(mm1.a aVar, IdCardSuspensionChildData idCardSuspensionChildData) {
            this.type = aVar;
            this.data = idCardSuspensionChildData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final IdCardSuspensionChildData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final mm1.a getType() {
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
        public static final /* synthetic */ int[] f207516a;

        static {
            int[] iArr = new int[mm1.a.values().length];
            try {
                iArr[mm1.a.CHILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mm1.a.WARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f207516a = iArr;
        }
    }

    public e(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final int c(mm1.a aVar) {
        int i15 = b.f207516a[aVar.ordinal()];
        if (i15 == 1) {
            return em1.a.f51946b;
        }
        if (i15 == 2) {
            return em1.a.L;
        }
        throw new p();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00c1  */
    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public tn1.c.Data.Section b(Params params) {
        DefaultSingleCardData defaultSingleCardData;
        String strE;
        String strE2;
        IdCardSuspensionChildData data = params.getData();
        Label labelC = this.labelProvider.c(c(params.getType()));
        DefaultSingleCardData defaultSingleCardData2 = null;
        DefaultSingleCardData defaultSingleCardData3 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(em1.a.f51976q), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(rm1.a.a(data.getFirstName(), "firstName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        b0 secondName = data.getSecondName();
        if (secondName == null || (strE2 = c0.e(secondName)) == null) {
            defaultSingleCardData = null;
        } else {
            if (r.t0(strE2)) {
                strE2 = null;
            }
            if (strE2 != null) {
                defaultSingleCardData = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(em1.a.F), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(strE2, "secondName"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            } else {
                defaultSingleCardData = null;
            }
        }
        DefaultSingleCardData defaultSingleCardData4 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(em1.a.f51986v), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(rm1.a.a(data.getSurname(), "surname"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
        DefaultSingleCardData defaultSingleCardData5 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(em1.a.B), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(c0.e(data.getPesel()), "pesel"), null, null, 0, 0, j70.a.LETTER_BY_LETTER, 30, null)), null, 4, null), null, null, null, 3839, null);
        b0 seriesAndNumber = data.getSeriesAndNumber();
        if (seriesAndNumber != null && (strE = c0.e(seriesAndNumber)) != null) {
            if (r.t0(strE)) {
                strE = null;
            }
            if (strE != null) {
                defaultSingleCardData2 = new DefaultSingleCardData(null, null, false, null, null, false, null, null, new BodySection(new SingleCardLabel(this.labelProvider.c(em1.a.f51982t), null, null, 0, 0, null, 62, null), new n50.b.Title(new SingleCardLabel(mx.b.b(strE, "idSeriesAndNumber"), null, null, 0, 0, null, 62, null)), null, 4, null), null, null, null, 3839, null);
            }
        }
        return new tn1.c.Data.Section(labelC, new CardListData(v.s(defaultSingleCardData3, defaultSingleCardData, defaultSingleCardData4, defaultSingleCardData5, defaultSingleCardData2), null, false, null, null, 30, null));
    }
}
