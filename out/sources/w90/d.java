package w90;

import er.l;
import fr.t;
import jb4.ErrorActionData;
import jb4.PayloadErrorData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lw90/d;", "Lxw/f;", "Lw90/d$a;", "Ljb4/b;", "Lib4/c;", "errorMapper", "Lmx/c;", "labelProvider", "<init>", "(Lib4/c;Lmx/c;)V", "Ldx/b;", "params", "i", "(Ldx/b;Lw90/d$a;)Ljb4/b;", "Ljb4/f;", "h", "(Ldx/b;)Ljb4/f;", "m", "(Lw90/d$a;)Ljb4/b;", "a", "Lib4/c;", "b", "Lmx/c;", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: w90.d$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lw90/d$a;", "", "Ldx/b;", "error", "Lkotlin/Function0;", "Loq/i0;", "onClose", "onRestart", "<init>", "(Ldx/b;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "()Ldx/b;", "b", "Ler/a;", "()Ler/a;", "c", "activation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b error;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRestart;

        public Params(dx.b bVar, er.a<i0> aVar, er.a<i0> aVar2) {
            this.error = bVar;
            this.onClose = aVar;
            this.onRestart = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b getError() {
            return this.error;
        }

        public final er.a<i0> b() {
            return this.onClose;
        }

        public final er.a<i0> c() {
            return this.onRestart;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.error, params.error) && t.c(this.onClose, params.onClose) && t.c(this.onRestart, params.onRestart);
        }

        public int hashCode() {
            return (((this.error.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.onRestart.hashCode();
        }

        public String toString() {
            return "Params(error=" + this.error + ", onClose=" + this.onClose + ", onRestart=" + this.onRestart + ')';
        }
    }

    public d(ib4.c cVar, mx.c cVar2) {
        this.errorMapper = cVar;
        this.labelProvider = cVar2;
    }

    private final PayloadErrorData h(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    private final jb4.b i(dx.b bVar, final Params params) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new l() { // from class: w90.a
            @Override // er.l
            public final Object b(Object obj) {
                return d.l(params, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || (bVar instanceof ib4.c.b.AbstractC2161b.a)) {
            params.b().a();
        } else {
            if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
                throw new p();
            }
            params.c().a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.c().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.c().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        dx.b error = params.getError();
        if (!(error instanceof dx.b.g.Http)) {
            return i(error, params);
        }
        PayloadErrorData payloadErrorDataH = h(error);
        return t.c(payloadErrorDataH != null ? payloadErrorDataH.getCode() : null, "QR_CODE_TOKEN_EXPIRED") ? new jb4.b.Failure(this.labelProvider.c(r90.a.f172436p), this.labelProvider.c(r90.a.f172435o), null, new ErrorActionData(this.labelProvider.c(r90.a.f172424d), new er.a() { // from class: w90.b
            @Override // er.a
            public final Object a() {
                return d.q(params);
            }
        }), null, null, new ErrorActionData(this.labelProvider.c(r90.a.f172424d), new er.a() { // from class: w90.c
            @Override // er.a
            public final Object a() {
                return d.r(params);
            }
        }), 52, null) : i(error, params);
    }
}
