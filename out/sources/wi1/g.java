package wi1;

import er.l;
import fr.k;
import fr.t;
import java.util.Collection;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import vy.Coordinates;
import zp0.AvailableDefenceTrainings;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u000f\u0010\u000bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lwi1/g;", "Lgz/b;", "Lwi1/g$b;", "Lwi1/g$c;", "Luy/b;", "distanceCalculator", "<init>", "(Luy/b;)V", "params", "e", "(Lwi1/g$b;Ltq/e;)Ljava/lang/Object;", "a", "Luy/b;", "getDistanceCalculator", "()Luy/b;", "b", "c", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b<Params, Result> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f213669b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f213670c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uy.b distanceCalculator;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwi1/g$a;", "", "<init>", "()V", "", "NEAREST_POINTS_TO_SELECT_COUNT", "I", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: wi1.g$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lwi1/g$b;", "Lgz/b$a;", "Lvy/c;", "userCoordinates", "", "Lzp0/a;", "availableTrainings", "<init>", "(Lvy/c;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvy/c;", "b", "()Lvy/c;", "Ljava/util/List;", "()Ljava/util/List;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Coordinates userCoordinates;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AvailableDefenceTrainings> availableTrainings;

        public Params(Coordinates coordinates, List<AvailableDefenceTrainings> list) {
            this.userCoordinates = coordinates;
            this.availableTrainings = list;
        }

        public final List<AvailableDefenceTrainings> a() {
            return this.availableTrainings;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Coordinates getUserCoordinates() {
            return this.userCoordinates;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.userCoordinates, params.userCoordinates) && t.c(this.availableTrainings, params.availableTrainings);
        }

        public int hashCode() {
            return (this.userCoordinates.hashCode() * 31) + this.availableTrainings.hashCode();
        }

        public String toString() {
            return "Params(userCoordinates=" + this.userCoordinates + ", availableTrainings=" + this.availableTrainings + ')';
        }
    }

    /* JADX INFO: renamed from: wi1.g$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lwi1/g$c;", "", "", "Lzp0/a;", "nearestTrainings", "remainingTrainings", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AvailableDefenceTrainings> nearestTrainings;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AvailableDefenceTrainings> remainingTrainings;

        public Result(List<AvailableDefenceTrainings> list, List<AvailableDefenceTrainings> list2) {
            this.nearestTrainings = list;
            this.remainingTrainings = list2;
        }

        public final List<AvailableDefenceTrainings> a() {
            return this.nearestTrainings;
        }

        public final List<AvailableDefenceTrainings> b() {
            return this.remainingTrainings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return t.c(this.nearestTrainings, result.nearestTrainings) && t.c(this.remainingTrainings, result.remainingTrainings);
        }

        public int hashCode() {
            return (this.nearestTrainings.hashCode() * 31) + this.remainingTrainings.hashCode();
        }

        public String toString() {
            return "Result(nearestTrainings=" + this.nearestTrainings + ", remainingTrainings=" + this.remainingTrainings + ')';
        }
    }

    public g(uy.b bVar) {
        this.distanceCalculator = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Coordinates f(AvailableDefenceTrainings availableDefenceTrainings) {
        return availableDefenceTrainings.getUnit().getCoordinates();
    }

    public Object e(Params params, tq.e<? super Result> eVar) {
        Collection collectionB = this.distanceCalculator.b(params.getUserCoordinates(), params.a(), new l() { // from class: wi1.f
            @Override // er.l
            public final Object b(Object obj) {
                return g.f((AvailableDefenceTrainings) obj);
            }
        });
        return new Result(v.X0(collectionB, 3), v.f0(collectionB, 3));
    }
}
