package ht2;

import a14.i;
import er.l;
import er.p;
import er.q;
import ez.h;
import fr.k;
import fr.t;
import iy.b0;
import ja.n0;
import ja.u0;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.w0;
import n50.x0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import pq.v;
import r50.g;
import ts0.Institution;
import ts0.RestrictionCheck;
import ts0.RestrictionCheckStatus;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0002$\"B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lht2/b;", "Lxw/f;", "Lht2/b$b;", "Lja/n0;", "Lit2/b;", "Lmx/c;", "labelProvider", "Lez/h;", "timeProvider", "Lez/e;", "dateFormatter", "La14/i;", "formatHeaderDatesWithDaysUseCase", "<init>", "(Lmx/c;Lez/h;Lez/e;La14/i;)V", "Lts0/g;", "item", "Lkotlin/Function1;", "Loq/i0;", "navigateToRestrictionCheckDetails", "Lit2/b$a;", "l", "(Lts0/g;Ler/l;)Lit2/b$a;", "", "Lts0/h;", "statuses", "Ljava/time/LocalDate;", "verifiedForDate", "Lr50/a;", "q", "(Ljava/util/List;Ljava/time/LocalDate;)Lr50/a;", "params", "i", "(Lht2/b$b;)Lja/n0;", "a", "Lmx/c;", "b", "Lez/h;", "c", "Lez/e;", "d", "La14/i;", "e", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, n0<it2.b>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f86618f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h timeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i formatHeaderDatesWithDaysUseCase;

    /* JADX INFO: renamed from: ht2.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lht2/b$a;", "", "<init>", "()V", "Liy/b0;", "otherPesel", "", "a", "(Liy/b0;Liy/b0;)Z", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final boolean a(b0 b0Var, b0 b0Var2) {
            if (b0Var == null) {
                return false;
            }
            Boolean boolValueOf = b0Var2 != null ? Boolean.valueOf(b0Var.c(b0Var2)) : null;
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
            return false;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: ht2.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lht2/b$b;", "", "Lja/n0;", "Lts0/g;", "restrictionChecksDataFlow", "Liy/b0;", "userPesel", "Lkotlin/Function1;", "Loq/i0;", "navigateToRestrictionCheckDetails", "<init>", "(Lja/n0;Liy/b0;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lja/n0;", "b", "()Lja/n0;", "Liy/b0;", "c", "()Liy/b0;", "Ler/l;", "()Ler/l;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n0<RestrictionCheck> restrictionChecksDataFlow;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 userPesel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<RestrictionCheck, i0> navigateToRestrictionCheckDetails;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(n0<RestrictionCheck> n0Var, b0 b0Var, l<? super RestrictionCheck, i0> lVar) {
            this.restrictionChecksDataFlow = n0Var;
            this.userPesel = b0Var;
            this.navigateToRestrictionCheckDetails = lVar;
        }

        public final l<RestrictionCheck, i0> a() {
            return this.navigateToRestrictionCheckDetails;
        }

        public final n0<RestrictionCheck> b() {
            return this.restrictionChecksDataFlow;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getUserPesel() {
            return this.userPesel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.restrictionChecksDataFlow, params.restrictionChecksDataFlow) && t.c(this.userPesel, params.userPesel) && t.c(this.navigateToRestrictionCheckDetails, params.navigateToRestrictionCheckDetails);
        }

        public int hashCode() {
            return (((this.restrictionChecksDataFlow.hashCode() * 31) + this.userPesel.hashCode()) * 31) + this.navigateToRestrictionCheckDetails.hashCode();
        }

        public String toString() {
            return "Params(restrictionChecksDataFlow=" + this.restrictionChecksDataFlow + ", userPesel=" + this.userPesel + ", navigateToRestrictionCheckDetails=" + this.navigateToRestrictionCheckDetails + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86626a;

        static {
            int[] iArr = new int[ts0.l.values().length];
            try {
                iArr[ts0.l.RESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ts0.l.UNRESTRICTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ts0.l.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86626a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lts0/g;", "pagingData", "Lit2/b$a;", "<anonymous>", "(Lts0/g;)Lit2/b$a;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements p<RestrictionCheck, tq.e<? super it2.b.a>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86628f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f86630h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Params params, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f86630h = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            RestrictionCheck restrictionCheck = (RestrictionCheck) this.f86628f;
            uq.b.e();
            if (this.f86627e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return b.this.l(restrictionCheck, this.f86630h.a());
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(RestrictionCheck restrictionCheck, tq.e<? super it2.b.a> eVar) {
            return ((d) v(restrictionCheck, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = b.this.new d(this.f86630h, eVar);
            dVar.f86628f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lit2/b$a;", "before", "after", "Lit2/b;", "<anonymous>", "(Lit2/b$a;Lit2/b$a;)Lit2/b;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<it2.b.a, it2.b.a, tq.e<? super it2.b>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f86633g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Params f86635j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Params params, tq.e<? super e> eVar) {
            super(3, eVar);
            this.f86635j = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            it2.b.a aVar = (it2.b.a) this.f86632f;
            it2.b.a aVar2 = (it2.b.a) this.f86633g;
            uq.b.e();
            if (this.f86631e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (aVar2 == null) {
                return null;
            }
            if (ez.d.a(aVar2.getItemDate(), aVar != null ? aVar.getItemDate() : null)) {
                if (b.INSTANCE.a(aVar != null ? aVar.getUserPesel() : null, aVar2.getUserPesel())) {
                    aVar2 = null;
                }
            }
            if (aVar2 == null) {
                return null;
            }
            b bVar = b.this;
            Params params = this.f86635j;
            Label labelA = bVar.formatHeaderDatesWithDaysUseCase.a(new i.Params(aVar2.getItemDate(), fz.f.POLISH));
            if (!b.INSTANCE.a(params.getUserPesel(), aVar2.getUserPesel())) {
                labelA = labelA.o(Label.INSTANCE.d()).o(bVar.labelProvider.c(rs2.a.K));
            }
            return new it2.b.C2272b(labelA);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(it2.b.a aVar, it2.b.a aVar2, tq.e<? super it2.b> eVar) {
            e eVar2 = b.this.new e(this.f86635j, eVar);
            eVar2.f86632f = aVar;
            eVar2.f86633g = aVar2;
            return eVar2.J(i0.f148189a);
        }
    }

    public b(mx.c cVar, h hVar, ez.e eVar, i iVar) {
        this.labelProvider = cVar;
        this.timeProvider = hVar;
        this.dateFormatter = eVar;
        this.formatHeaderDatesWithDaysUseCase = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final it2.b.a l(final RestrictionCheck item, final l<? super RestrictionCheck, i0> navigateToRestrictionCheckDetails) {
        String name;
        OffsetDateTime offsetDateTimeB = this.timeProvider.b(item.getVerifiedAt(), fz.f.POLISH);
        er.a aVar = new er.a() { // from class: ht2.a
            @Override // er.a
            public final Object a() {
                return b.m(navigateToRestrictionCheckDetails, item);
            }
        };
        w0.StatusBadge statusBadge = new w0.StatusBadge(q(item.d(), item.getVerifiedForDate()));
        SingleCardLabel singleCardLabel = new SingleCardLabel(this.labelProvider.e(rs2.a.M, this.dateFormatter.d(new fz.b.OffsetDateTime(offsetDateTimeB), fz.c.ONLY_HOUR)), null, null, 0, 0, null, 62, null);
        Institution institution = item.getInstitution();
        if (institution == null || (name = institution.getName()) == null) {
            name = "";
        }
        return new it2.b.a(new DefaultSingleCardData(null, aVar, false, null, null, false, null, statusBadge, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(name, "title"), null, null, 0, 0, null, 62, null)), singleCardLabel, 1, null), null, x0.Icon.INSTANCE.b(), null, 2685, null), offsetDateTimeB, item.getPesel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(l lVar, RestrictionCheck restrictionCheck) {
        lVar.b(restrictionCheck);
        return i0.f148189a;
    }

    private final r50.a q(List<RestrictionCheckStatus> statuses, LocalDate verifiedForDate) {
        if (verifiedForDate != null) {
            return new r50.a.WithIcon(null, this.labelProvider.c(rs2.a.f175893d0), null, 0, false, g.INFORMATIVE, 29, null);
        }
        RestrictionCheckStatus restrictionCheckStatus = (RestrictionCheckStatus) v.n0(statuses);
        ts0.l status = restrictionCheckStatus != null ? restrictionCheckStatus.getStatus() : null;
        int i15 = status == null ? -1 : c.f86626a[status.ordinal()];
        if (i15 != -1) {
            if (i15 == 1) {
                return new r50.a.WithIcon(null, this.labelProvider.c(rs2.a.f175904j), null, 0, false, g.POSITIVE, 29, null);
            }
            if (i15 == 2) {
                return new r50.a.WithIcon(null, this.labelProvider.c(rs2.a.f175906k), null, 0, false, g.NOTICE, 29, null);
            }
            if (i15 != 3) {
                throw new oq.p();
            }
        }
        return new r50.a.WithIcon(null, this.labelProvider.c(rs2.a.f175914o), null, 0, false, g.NEGATIVE, 29, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public n0<it2.b> b(Params params) {
        return u0.b(u0.c(params.b(), new d(params, null)), null, new e(params, null), 1, null);
    }
}
