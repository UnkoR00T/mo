package qk1;

import fr.k;
import fr.t;
import hz.d;
import hz.g;
import java.time.temporal.ChronoUnit;
import mx.Label;
import mx.c;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\r\u0011\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"Lqk1/a;", "Lgz/a;", "Lqk1/a$c;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/d;", "conditionValidator", "Lez/a;", "currentTimeProvider", "<init>", "(Lmx/c;Lhz/d;Lez/a;)V", "params", "c", "(Lqk1/a$c;)Lhz/g;", "a", "Lmx/c;", "b", "Lhz/d;", "Lez/a;", "d", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a<Params, g> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C4199a f167025d = new C4199a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f167026e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d conditionValidator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: qk1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqk1/a$a;", "", "<init>", "()V", "", "CHILD_MAX_AGE", "I", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C4199a {
        public /* synthetic */ C4199a(k kVar) {
            this();
        }

        private C4199a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lqk1/a$b;", "Lhz/a;", "", "<init>", "(Lqk1/a;)V", "value", "c", "(Ljava/lang/Boolean;)Z", "Lmx/a;", "a", "()Lmx/a;", "errorMessage", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class b implements hz.a<Boolean> {
        public b() {
        }

        @Override // hz.a
        /* JADX INFO: renamed from: a */
        public Label getErrorMessage() {
            return a.this.labelProvider.c(gk1.a.f73454r0);
        }

        @Override // hz.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(Boolean value) {
            return value != null;
        }
    }

    /* JADX INFO: renamed from: qk1.a$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lqk1/a$c;", "Lgz/b$a;", "Lkk1/a;", "type", "Lfz/b$c;", "birthDate", "<init>", "(Lkk1/a;Lfz/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkk1/a;", "b", "()Lkk1/a;", "Lfz/b$c;", "()Lfz/b$c;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f167031c = fz.b.LocalDate.f68860b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final kk1.a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.LocalDate birthDate;

        public Params(kk1.a aVar, fz.b.LocalDate localDate) {
            this.type = aVar;
            this.birthDate = localDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final fz.b.LocalDate getBirthDate() {
            return this.birthDate;
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
            return this.type == params.type && t.c(this.birthDate, params.birthDate);
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            fz.b.LocalDate localDate = this.birthDate;
            return iHashCode + (localDate == null ? 0 : localDate.hashCode());
        }

        public String toString() {
            return "Params(type=" + this.type + ", birthDate=" + this.birthDate + ')';
        }
    }

    public a(c cVar, d dVar, ez.a aVar) {
        this.labelProvider = cVar;
        this.conditionValidator = dVar;
        this.currentTimeProvider = aVar;
    }

    public g c(Params params) {
        if (params.getBirthDate() == null) {
            return new g.Invalid(new b());
        }
        if (params.getType() == kk1.a.WARD) {
            return g.b.f86853b;
        }
        return this.conditionValidator.e(this.labelProvider.c(gk1.a.f73452q0)).a(Boolean.valueOf(((int) ChronoUnit.YEARS.between(params.getBirthDate().getDate(), this.currentTimeProvider.c())) < 18));
    }
}
