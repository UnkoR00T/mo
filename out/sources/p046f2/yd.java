package p046f2;

import c5.p;
import c5.r;
import er.q;
import p071kotlin.Metadata;
import r0.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lf2/yd;", "", "a", "b", "Lf2/yd$a;", "Lf2/yd$b;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface yd {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf2/yd$a;", "Lf2/yd;", "<init>", "()V", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements yd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58347a = new a();

        private a() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR/\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R/\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lf2/yd$b;", "Lf2/yd;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/Function3;", "Lc5/p;", "Lc5/r;", "Lr0/o;", "a", "Ler/q;", "()Ler/q;", "xCandidates", "b", "yCandidates", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements yd {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q<p, r, r, o> xCandidates;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q<p, r, r, o> yCandidates;

        public final q<p, r, r, o> a() {
            return this.xCandidates;
        }

        public final q<p, r, r, o> b() {
            return this.yCandidates;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.xCandidates == bVar.xCandidates && this.yCandidates == bVar.yCandidates;
        }

        public int hashCode() {
            return (this.xCandidates.hashCode() * 31) + this.yCandidates.hashCode();
        }
    }
}
