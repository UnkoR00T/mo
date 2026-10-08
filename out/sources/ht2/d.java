package ht2;

import a14.i;
import er.p;
import er.q;
import ez.e;
import ez.h;
import fr.t;
import iy.b0;
import ja.n0;
import ja.u0;
import java.time.OffsetDateTime;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.SingleCardLabel;
import n50.w0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import r50.g;
import ts0.RestrictionStatusChange;
import ts0.l;
import vq.k;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u001bB)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lht2/d;", "Lxw/f;", "Lht2/d$a;", "Lja/n0;", "Lit2/b;", "Lmx/c;", "labelProvider", "Lez/h;", "timeProvider", "Lez/e;", "dateFormatter", "La14/i;", "formatHeaderDatesWithDaysUseCase", "<init>", "(Lmx/c;Lez/h;Lez/e;La14/i;)V", "Lts0/m;", "item", "Lit2/b$a;", "i", "(Lts0/m;)Lit2/b$a;", "Lts0/l;", "Lr50/a;", "l", "(Lts0/l;)Lr50/a;", "params", "h", "(Lht2/d$a;)Lja/n0;", "a", "Lmx/c;", "b", "Lez/h;", "c", "Lez/e;", "d", "La14/i;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, n0<it2.b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h timeProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i formatHeaderDatesWithDaysUseCase;

    /* JADX INFO: renamed from: ht2.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lht2/d$a;", "", "Lja/n0;", "Lts0/m;", "restrictionStatusChangesDataFlow", "Liy/b0;", "userPesel", "<init>", "(Lja/n0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lja/n0;", "()Lja/n0;", "b", "Liy/b0;", "()Liy/b0;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n0<RestrictionStatusChange> restrictionStatusChangesDataFlow;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 userPesel;

        public Params(n0<RestrictionStatusChange> n0Var, b0 b0Var) {
            this.restrictionStatusChangesDataFlow = n0Var;
            this.userPesel = b0Var;
        }

        public final n0<RestrictionStatusChange> a() {
            return this.restrictionStatusChangesDataFlow;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return t.c(this.restrictionStatusChangesDataFlow, params.restrictionStatusChangesDataFlow) && t.c(this.userPesel, params.userPesel);
        }

        public int hashCode() {
            return (this.restrictionStatusChangesDataFlow.hashCode() * 31) + this.userPesel.hashCode();
        }

        public String toString() {
            return "Params(restrictionStatusChangesDataFlow=" + this.restrictionStatusChangesDataFlow + ", userPesel=" + this.userPesel + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86650a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.RESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.UNRESTRICTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86650a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lts0/m;", "pagingData", "Lit2/b$a;", "<anonymous>", "(Lts0/m;)Lit2/b$a;"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements p<RestrictionStatusChange, tq.e<? super it2.b.a>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86652f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            RestrictionStatusChange restrictionStatusChange = (RestrictionStatusChange) this.f86652f;
            uq.b.e();
            if (this.f86651e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return d.this.i(restrictionStatusChange);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(RestrictionStatusChange restrictionStatusChange, tq.e<? super it2.b.a> eVar) {
            return ((c) v(restrictionStatusChange, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = d.this.new c(eVar);
            cVar.f86652f = obj;
            return cVar;
        }
    }

    /* JADX INFO: renamed from: ht2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lit2/b$a;", "before", "after", "Lit2/b;", "<anonymous>", "(Lit2/b$a;Lit2/b$a;)Lit2/b;"}, k = 3, mv = {2, 2, 0})
    static final class C2025d extends k implements q<it2.b.a, it2.b.a, tq.e<? super it2.b>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86655f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f86656g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Params f86658j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2025d(Params params, tq.e<? super C2025d> eVar) {
            super(3, eVar);
            this.f86658j = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            it2.b.a aVar = (it2.b.a) this.f86655f;
            it2.b.a aVar2 = (it2.b.a) this.f86656g;
            uq.b.e();
            if (this.f86654e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (aVar2 == null) {
                return null;
            }
            if (ez.d.a(aVar2.getItemDate(), aVar != null ? aVar.getItemDate() : null)) {
                if (ht2.b.INSTANCE.a(aVar != null ? aVar.getUserPesel() : null, aVar2.getUserPesel())) {
                    aVar2 = null;
                }
            }
            if (aVar2 == null) {
                return null;
            }
            d dVar = d.this;
            Params params = this.f86658j;
            Label labelA = dVar.formatHeaderDatesWithDaysUseCase.a(new i.Params(aVar2.getItemDate(), fz.f.POLISH));
            if (!ht2.b.INSTANCE.a(params.getUserPesel(), aVar2.getUserPesel())) {
                labelA = labelA.o(Label.INSTANCE.d()).o(dVar.labelProvider.c(rs2.a.K));
            }
            return new it2.b.C2272b(labelA);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(it2.b.a aVar, it2.b.a aVar2, tq.e<? super it2.b> eVar) {
            C2025d c2025d = d.this.new C2025d(this.f86658j, eVar);
            c2025d.f86655f = aVar;
            c2025d.f86656g = aVar2;
            return c2025d.J(i0.f148189a);
        }
    }

    public d(mx.c cVar, h hVar, e eVar, i iVar) {
        this.labelProvider = cVar;
        this.timeProvider = hVar;
        this.dateFormatter = eVar;
        this.formatHeaderDatesWithDaysUseCase = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final it2.b.a i(RestrictionStatusChange item) {
        h hVar = this.timeProvider;
        OffsetDateTime changeDate = item.getChangeDate();
        if (changeDate == null) {
            changeDate = OffsetDateTime.now();
        }
        OffsetDateTime offsetDateTimeB = hVar.b(changeDate, fz.f.POLISH);
        w0.StatusBadge statusBadge = new w0.StatusBadge(l(item.getStatus()));
        n50.b.Title title = new n50.b.Title(new SingleCardLabel(this.labelProvider.e(rs2.a.M, this.dateFormatter.d(new fz.b.OffsetDateTime(offsetDateTimeB), fz.c.ONLY_HOUR)), null, null, 0, 0, null, 62, null));
        mx.c cVar = this.labelProvider;
        int i15 = rs2.a.L;
        String subject = item.getSubject();
        if (subject == null) {
            subject = "";
        }
        return new it2.b.a(new DefaultSingleCardData(null, null, false, null, null, false, null, statusBadge, new BodySection(null, title, new SingleCardLabel(cVar.e(i15, subject), null, null, 0, 0, null, 62, null), 1, null), null, null, null, 3711, null), offsetDateTimeB, item.getPesel());
    }

    private final r50.a l(l item) {
        int i15 = item == null ? -1 : b.f86650a[item.ordinal()];
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
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public n0<it2.b> b(Params params) {
        return u0.b(u0.c(params.a(), new c(null)), null, new C2025d(params, null), 1, null);
    }
}
