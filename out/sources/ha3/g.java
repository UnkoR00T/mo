package ha3;

import fr.t;
import ga3.Field;
import ga3.StageField;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ju.g2;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import vq.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u001cB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 ¨\u0006!"}, d2 = {"Lha3/g;", "Lgz/b;", "Lha3/g$a;", "Lha3/g$b;", "Lha3/c;", "isTripTooLongUC", "Lez/a;", "currentTimeProvider", "Lha3/e;", "validateDateRangeUC", "Lha3/f;", "validatePlaceUC", "<init>", "(Lha3/c;Lez/a;Lha3/e;Lha3/f;)V", "", "Lga3/d;", "", "isTripTooLong", "Ljava/time/LocalDate;", "oldestChildDayBefore18", "currentDate", "e", "(Ljava/util/List;ZLjava/time/LocalDate;Ljava/time/LocalDate;Ltq/e;)Ljava/lang/Object;", "params", "d", "(Lha3/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Lha3/c;", "b", "Lez/a;", "c", "Lha3/e;", "Lha3/f;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b<Params, Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ha3.c isTripTooLongUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e validateDateRangeUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f validatePlaceUC;

    /* JADX INFO: renamed from: ha3.g$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lha3/g$a;", "Lgz/b$a;", "", "Lga3/d;", "stages", "Ljava/time/LocalDate;", "oldestChildBirthDate", "<init>", "(Ljava/util/List;Ljava/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<StageField> stages;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate oldestChildBirthDate;

        public Params(List<StageField> list, LocalDate localDate) {
            this.stages = list;
            this.oldestChildBirthDate = localDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getOldestChildBirthDate() {
            return this.oldestChildBirthDate;
        }

        public final List<StageField> b() {
            return this.stages;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.stages, params.stages) && t.c(this.oldestChildBirthDate, params.oldestChildBirthDate);
        }

        public int hashCode() {
            int iHashCode = this.stages.hashCode() * 31;
            LocalDate localDate = this.oldestChildBirthDate;
            return iHashCode + (localDate == null ? 0 : localDate.hashCode());
        }

        public String toString() {
            return "Params(stages=" + this.stages + ", oldestChildBirthDate=" + this.oldestChildBirthDate + ')';
        }
    }

    /* JADX INFO: renamed from: ha3.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, d2 = {"Lha3/g$b;", "", "", "Lga3/d;", "validatedStages", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lga3/d;", "()Lga3/d;", "firstInvalid", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<StageField> validatedStages;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final StageField firstInvalid;

        public Result(List<StageField> list) {
            this.validatedStages = list;
            for (Object obj : list) {
                if (!((StageField) obj).getIsValid()) {
                    this.firstInvalid = (StageField) obj;
                }
            }
            obj = null;
            this.firstInvalid = (StageField) obj;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final StageField getFirstInvalid() {
            return this.firstInvalid;
        }

        public final List<StageField> b() {
            return this.validatedStages;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && t.c(this.validatedStages, ((Result) other).validatedStages);
        }

        public int hashCode() {
            return this.validatedStages.hashCode();
        }

        public String toString() {
            return "Result(validatedStages=" + this.validatedStages + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f82582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f82583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f82584f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f82585g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f82586h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f82588k;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f82586h = obj;
            this.f82588k |= PKIFailureInfo.systemUnavail;
            return g.this.d(null, this);
        }
    }

    public g(ha3.c cVar, ez.a aVar, e eVar, f fVar) {
        this.isTripTooLongUC = cVar;
        this.currentTimeProvider = aVar;
        this.validateDateRangeUC = eVar;
        this.validatePlaceUC = fVar;
    }

    private final Object e(List<StageField> list, boolean z15, LocalDate localDate, LocalDate localDate2, tq.e<? super List<StageField>> eVar) {
        List<StageField> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((StageField) it.next()).c().d());
        }
        List listN = v.n();
        int i15 = 0;
        List listM0 = listN;
        for (Object obj : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            StageField stageField = (StageField) obj;
            g2.j(eVar.getContext());
            List list3 = listM0;
            listM0 = v.M0(list3, StageField.b(stageField, null, Field.b(stageField.c(), null, this.validateDateRangeUC.i(new e.Params(arrayList, i15, z15, localDate, localDate2)), 1, null), Field.b(stageField.f(), null, this.validatePlaceUC.b(new f.Params(stageField.f().d())), 1, null), 1, null));
            i15 = i16;
        }
        return listM0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object d(Params params, tq.e<? super Result> eVar) throws Throwable {
        c cVar;
        LocalDate localDatePlusYears;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f82588k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f82588k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        c cVar2 = cVar;
        Object objE = cVar2.f82586h;
        Object objE2 = uq.b.e();
        int i16 = cVar2.f82588k;
        if (i16 == 0) {
            u.b(objE);
            boolean zBooleanValue = this.isTripTooLongUC.b(new ha3.c.Params(params.b())).booleanValue();
            LocalDate oldestChildBirthDate = params.getOldestChildBirthDate();
            LocalDate localDateMinusDays = (oldestChildBirthDate == null || (localDatePlusYears = oldestChildBirthDate.plusYears(18L)) == null) ? null : localDatePlusYears.minusDays(1L);
            LocalDate localDateC = this.currentTimeProvider.c();
            List<StageField> listB = params.b();
            cVar2.f82582d = j.a(params);
            cVar2.f82583e = j.a(localDateMinusDays);
            cVar2.f82584f = j.a(localDateC);
            cVar2.f82585g = zBooleanValue;
            cVar2.f82588k = 1;
            objE = e(listB, zBooleanValue, localDateMinusDays, localDateC, cVar2);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objE);
        }
        return new Result((List) objE);
    }
}
