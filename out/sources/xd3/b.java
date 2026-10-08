package xd3;

import fr.t;
import oq.p;
import p071kotlin.Metadata;
import sv0.CollisionCreatedDescription;
import sv0.ProcessId;
import sv0.o;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lxd3/b;", "Lxw/f;", "Lxd3/b$a;", "Lyd3/a;", "<init>", "()V", "params", "c", "(Lxd3/b$a;)Lyd3/a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, yd3.a> {

    /* JADX INFO: renamed from: xd3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lxd3/b$a;", "", "Lsv0/y;", "processId", "Lsv0/i;", "description", "<init>", "(Lsv0/y;Lsv0/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsv0/y;", "b", "()Lsv0/y;", "Lsv0/i;", "()Lsv0/i;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProcessId processId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CollisionCreatedDescription description;

        public Params(ProcessId processId, CollisionCreatedDescription collisionCreatedDescription) {
            this.processId = processId;
            this.description = collisionCreatedDescription;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CollisionCreatedDescription getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ProcessId getProcessId() {
            return this.processId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.processId, params.processId) && t.c(this.description, params.description);
        }

        public int hashCode() {
            return (this.processId.hashCode() * 31) + this.description.hashCode();
        }

        public String toString() {
            return "Params(processId=" + this.processId + ", description=" + this.description + ')';
        }
    }

    /* JADX INFO: renamed from: xd3.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5824b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f218057a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.ME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f218057a = iArr;
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public yd3.a b(Params params) {
        int i15 = C5824b.f218057a[params.getDescription().getDescriptionAuthor().ordinal()];
        if (i15 == 1) {
            return new yd3.a.OfAuthor(params.getDescription(), params.getProcessId());
        }
        if (i15 != 2) {
            throw new p();
        }
        return new yd3.a.OfReviewer(params.getDescription().getPersonal(), params.getProcessId());
    }
}
