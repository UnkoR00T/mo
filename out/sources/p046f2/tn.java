package p046f2;

import f3.c;
import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lf2/tn;", "", "<init>", "()V", "b", "a", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class tn {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf2/tn$a;", "Lf2/tn;", "Lf3/c$b;", "alignment", "Lf3/c$b;", "a", "()Lf3/c$b;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends tn {
        public final c.b a() {
            throw null;
        }
    }

    public /* synthetic */ tn(k kVar) {
        this();
    }

    private tn() {
    }

    /* JADX INFO: renamed from: f2.tn$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"Lf2/tn$b;", "Lf2/tn;", "", "alwaysMinimize", "Lf3/c$b;", "minimizedAlignment", "expandedAlignment", "<init>", "(ZLf3/c$b;Lf3/c$b;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Z", "()Z", "b", "Lf3/c$b;", "c", "()Lf3/c$b;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Attached extends tn {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean alwaysMinimize;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final c.b minimizedAlignment;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final c.b expandedAlignment;

        public Attached(boolean z15, c.b bVar, c.b bVar2) {
            super(null);
            this.alwaysMinimize = z15;
            this.minimizedAlignment = bVar;
            this.expandedAlignment = bVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getAlwaysMinimize() {
            return this.alwaysMinimize;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c.b getExpandedAlignment() {
            return this.expandedAlignment;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final c.b getMinimizedAlignment() {
            return this.minimizedAlignment;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attached)) {
                return false;
            }
            Attached attached = (Attached) other;
            return this.alwaysMinimize == attached.alwaysMinimize && t.c(this.minimizedAlignment, attached.minimizedAlignment) && t.c(this.expandedAlignment, attached.expandedAlignment);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.alwaysMinimize) * 31) + this.minimizedAlignment.hashCode()) * 31) + this.expandedAlignment.hashCode();
        }

        public String toString() {
            return "Attached(alwaysMinimize=" + this.alwaysMinimize + ", minimizedAlignment=" + this.minimizedAlignment + ", expandedAlignment=" + this.expandedAlignment + ')';
        }

        public /* synthetic */ Attached(boolean z15, c.b bVar, c.b bVar2, int i15, k kVar) {
            this((i15 & 1) != 0 ? false : z15, (i15 & 2) != 0 ? c.INSTANCE.k() : bVar, (i15 & 4) != 0 ? c.INSTANCE.k() : bVar2);
        }
    }
}
