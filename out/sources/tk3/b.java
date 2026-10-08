package tk3;

import er.l;
import fr.t;
import jb4.ErrorActionData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltk3/b;", "Lxw/f;", "Ltk3/b$a;", "Ljb4/b;", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "params", "e", "(Ltk3/b$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<a, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0004\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ltk3/b$a;", "", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "closeAction", "b", "Ltk3/b$a$a;", "Ltk3/b$a$b;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: tk3.b$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Ltk3/b$a$a;", "Ltk3/b$a;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "retryAction", "closeAction", "<init>", "(Ldx/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "b", "()Ldx/b;", "Ler/a;", "c", "()Ler/a;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Generic implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b domainError;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> retryAction;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> closeAction;

            public Generic(dx.b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
                this.domainError = bVar;
                this.retryAction = aVar;
                this.closeAction = aVar2;
            }

            @Override // tk3.b.a
            public er.a<i0> a() {
                return this.closeAction;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final dx.b getDomainError() {
                return this.domainError;
            }

            public final er.a<i0> c() {
                return this.retryAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Generic)) {
                    return false;
                }
                Generic generic = (Generic) other;
                return t.c(this.domainError, generic.domainError) && t.c(this.retryAction, generic.retryAction) && t.c(this.closeAction, generic.closeAction);
            }

            public int hashCode() {
                return (((this.domainError.hashCode() * 31) + this.retryAction.hashCode()) * 31) + this.closeAction.hashCode();
            }

            public String toString() {
                return "Generic(domainError=" + this.domainError + ", retryAction=" + this.retryAction + ", closeAction=" + this.closeAction + ')';
            }
        }

        /* JADX INFO: renamed from: tk3.b$a$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltk3/b$a$b;", "Ltk3/b$a;", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "vehicleregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class MissingTrustedProfile implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> closeAction;

            public MissingTrustedProfile(er.a<i0> aVar) {
                this.closeAction = aVar;
            }

            @Override // tk3.b.a
            public er.a<i0> a() {
                return this.closeAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MissingTrustedProfile) && t.c(this.closeAction, ((MissingTrustedProfile) other).closeAction);
            }

            public int hashCode() {
                return this.closeAction.hashCode();
            }

            public String toString() {
                return "MissingTrustedProfile(closeAction=" + this.closeAction + ')';
            }
        }

        er.a<i0> a();
    }

    public b(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(a aVar, ib4.c.b bVar) {
        if (t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) || (bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary)) {
            aVar.a().a();
        } else {
            if (!t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new p();
            }
            ((a.Generic) aVar).c().a();
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final a params) {
        if (params instanceof a.Generic) {
            return this.genericDomainErrorMapper.b(new ib4.c.Params(((a.Generic) params).getDomainError(), false, new l() { // from class: tk3.a
                @Override // er.l
                public final Object b(Object obj) {
                    return b.f(params, (ib4.c.b) obj);
                }
            }, 2, null));
        }
        if (!(params instanceof a.MissingTrustedProfile)) {
            throw new p();
        }
        a.MissingTrustedProfile missingTrustedProfile = (a.MissingTrustedProfile) params;
        return new jb4.b.Warning(this.labelProvider.c(fk3.a.f64716d), this.labelProvider.c(fk3.a.f64714b), this.labelProvider.c(fk3.a.f64715c), new ErrorActionData(this.labelProvider.c(fk3.a.f64713a), missingTrustedProfile.a()), null, null, new ErrorActionData(null, missingTrustedProfile.a(), 1, null), 48, null);
    }
}
