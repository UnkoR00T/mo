package dx;

import fr.t;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u0006*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0003\b\t\u0006B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Ldx/i;", "LEFT", "RIGHT", "", "<init>", "()V", "a", "()Ljava/lang/Object;", "b", "c", "Ldx/i$b;", "Ldx/i$c;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class i<LEFT, RIGHT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f45099b = 0;

    /* JADX INFO: renamed from: dx.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00020\u0006\"\b\b\u0002\u0010\u0004*\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldx/i$a;", "", "<init>", "()V", "RIGHT", "value", "Ldx/i;", "Loq/i0;", "a", "(Ljava/lang/Object;)Ldx/i;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final <RIGHT> i<i0, RIGHT> a(RIGHT value) {
            return value == null ? new Left(i0.f148189a) : new Right(value);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: dx.i$b, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ldx/i$b;", "A", "Ldx/i;", "", "value", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Left<A> extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final A value;

        public Left(A a15) {
            super(null);
            this.value = a15;
        }

        public final A b() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Left) && t.c(this.value, ((Left) other).value);
        }

        public int hashCode() {
            A a15 = this.value;
            if (a15 == null) {
                return 0;
            }
            return a15.hashCode();
        }

        public String toString() {
            return "Left(value=" + this.value + ")";
        }
    }

    /* JADX INFO: renamed from: dx.i$c, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ldx/i$c;", "B", "Ldx/i;", "", "value", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Right<B> extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final B value;

        public Right(B b15) {
            super(null);
            this.value = b15;
        }

        public final B b() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Right) && t.c(this.value, ((Right) other).value);
        }

        public int hashCode() {
            B b15 = this.value;
            if (b15 == null) {
                return 0;
            }
            return b15.hashCode();
        }

        public String toString() {
            return "Right(value=" + this.value + ")";
        }
    }

    public /* synthetic */ i(fr.k kVar) {
        this();
    }

    public final RIGHT a() {
        if (this instanceof Left) {
            return null;
        }
        if (this instanceof Right) {
            return (RIGHT) ((Right) this).b();
        }
        throw new p();
    }

    private i() {
    }
}
