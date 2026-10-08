package vv3;

import er.l;
import fr.t;
import jb4.ErrorActionData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lvv3/b;", "Lxw/f;", "Lvv3/b$a;", "Ljb4/b;", "Lib4/c;", "genericDomainErrorMapper", "Lmx/c;", "labelProvider", "<init>", "(Lib4/c;Lmx/c;)V", "params", "e", "(Lvv3/b$a;)Ljb4/b;", "a", "Lib4/c;", "b", "Lmx/c;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: vv3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvv3/b$a;", "Lgz/b$a;", "Lqv3/a;", "errorType", "<init>", "(Lqv3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqv3/a;", "()Lqv3/a;", "edorauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final qv3.a errorType;

        public Params(qv3.a aVar) {
            this.errorType = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final qv3.a getErrorType() {
            return this.errorType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.errorType, ((Params) other).errorType);
        }

        public int hashCode() {
            return this.errorType.hashCode();
        }

        public String toString() {
            return "Params(errorType=" + this.errorType + ')';
        }
    }

    public b(ib4.c cVar, mx.c cVar2) {
        this.genericDomainErrorMapper = cVar;
        this.labelProvider = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(qv3.a aVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            ((qv3.a.Domain) aVar).c().a();
        } else {
            if (!(bVar instanceof ib4.c.b.a.Close) && !t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                throw new p();
            }
            ((qv3.a.Domain) aVar).a().a();
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public jb4.b b(Params params) {
        final qv3.a errorType = params.getErrorType();
        if (errorType instanceof qv3.a.Domain) {
            return this.genericDomainErrorMapper.b(new ib4.c.Params(((qv3.a.Domain) errorType).getError(), false, new l() { // from class: vv3.a
                @Override // er.l
                public final Object b(Object obj) {
                    return b.f(errorType, (ib4.c.b) obj);
                }
            }, 2, null));
        }
        if (!(errorType instanceof qv3.a.MissingEdorAddress)) {
            throw new p();
        }
        qv3.a.MissingEdorAddress missingEdorAddress = (qv3.a.MissingEdorAddress) errorType;
        return new jb4.b.Warning(this.labelProvider.c(lv3.a.f120602e), this.labelProvider.c(lv3.a.f120601d), null, new ErrorActionData(this.labelProvider.c(lv3.a.f120600c), missingEdorAddress.b()), new ErrorActionData(this.labelProvider.c(lv3.a.f120598a), missingEdorAddress.a()), null, new ErrorActionData(null, missingEdorAddress.a(), 1, null), 36, null);
    }
}
