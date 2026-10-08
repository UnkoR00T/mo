package a14;

import p071kotlin.Metadata;
import wx.DomainFile;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"La14/z;", "", "La14/z$a;", "Lu04/b;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
@oq.a
public interface z extends gz.b {

    /* JADX INFO: renamed from: a14.z$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012(\u0010\b\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R9\u0010\b\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"La14/z$a;", "Lgz/b$a;", "Lkotlin/Function1;", "Ltq/e;", "Ldx/i;", "Ldx/b;", "Lwx/a;", "", "getFile", "<init>", "(Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/l;", "()Ler/l;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<tq.e<? super dx.i<? extends dx.b, DomainFile>>, Object> getFile;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(er.l<? super tq.e<? super dx.i<? extends dx.b, DomainFile>>, ? extends Object> lVar) {
            this.getFile = lVar;
        }

        public final er.l<tq.e<? super dx.i<? extends dx.b, DomainFile>>, Object> a() {
            return this.getFile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.getFile, ((Params) other).getFile);
        }

        public int hashCode() {
            return this.getFile.hashCode();
        }

        public String toString() {
            return "Params(getFile=" + this.getFile + ")";
        }
    }
}
