package if2;

import er.l;
import fr.t;
import jb4.PayloadErrorData;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import st3.AddressFormData;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lif2/b;", "Lxw/f;", "Lif2/b$a;", "Ljb4/b;", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "Ldx/b;", "error", "l", "(Ldx/b;)Ldx/b;", "Lst3/d;", "e", "()Lst3/d;", "params", "h", "(Lif2/b$a;)Ljb4/b;", "Ljb4/f;", "f", "(Ldx/b;)Ljb4/f;", "a", "Lmx/c;", "b", "Lib4/c;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: if2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"Lif2/b$a;", "", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "onRetryAction", "Lkotlin/Function1;", "Lst3/d;", "onEnterAnotherAddressAction", "<init>", "(Ldx/b;Ler/a;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "()Ldx/b;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "internetaccess_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b domainError;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRetryAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<AddressFormData, i0> onEnterAnotherAddressAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(dx.b bVar, er.a<i0> aVar, er.a<i0> aVar2, l<? super AddressFormData, i0> lVar) {
            this.domainError = bVar;
            this.onCloseAction = aVar;
            this.onRetryAction = aVar2;
            this.onEnterAnotherAddressAction = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b getDomainError() {
            return this.domainError;
        }

        public final er.a<i0> b() {
            return this.onCloseAction;
        }

        public final l<AddressFormData, i0> c() {
            return this.onEnterAnotherAddressAction;
        }

        public final er.a<i0> d() {
            return this.onRetryAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.domainError, params.domainError) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onRetryAction, params.onRetryAction) && t.c(this.onEnterAnotherAddressAction, params.onEnterAnotherAddressAction);
        }

        public int hashCode() {
            return (((((this.domainError.hashCode() * 31) + this.onCloseAction.hashCode()) * 31) + this.onRetryAction.hashCode()) * 31) + this.onEnterAnotherAddressAction.hashCode();
        }

        public String toString() {
            return "Params(domainError=" + this.domainError + ", onCloseAction=" + this.onCloseAction + ", onRetryAction=" + this.onRetryAction + ", onEnterAnotherAddressAction=" + this.onEnterAnotherAddressAction + ')';
        }
    }

    public b(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
    }

    private final AddressFormData e() {
        return new AddressFormData(null, true, this.labelProvider.c(df2.a.f41368a), this.labelProvider.c(df2.a.I), null, null, null, 113, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(Params params, b bVar, ib4.c.b bVar2) {
        if ((bVar2 instanceof ib4.c.b.AbstractC2161b.a) || (bVar2 instanceof ib4.c.b.a.Close) || (bVar2 instanceof ib4.c.b.a.Primary)) {
            params.b().a();
        } else if (bVar2 instanceof ib4.c.b.AbstractC2161b.C2162b) {
            params.d().a();
        } else {
            if (!(bVar2 instanceof ib4.c.b.a.Secondary)) {
                throw new p();
            }
            params.c().b(bVar.e());
        }
        return i0.f148189a;
    }

    private final dx.b l(dx.b error) {
        Label labelC;
        Label labelC2;
        if (error instanceof dx.b.g.Http) {
            PayloadErrorData payloadErrorDataF = f(error);
            if (t.c(payloadErrorDataF != null ? payloadErrorDataF.getCode() : null, "ADDRESS_POINT_NOT_FOUND")) {
                dx.b.f fVar = dx.b.f.INFO;
                String title = payloadErrorDataF.getTitle();
                if (title == null || (labelC = mx.b.b(title, "errorTitle")) == null) {
                    labelC = Label.INSTANCE.c();
                }
                Label label = labelC;
                String message = payloadErrorDataF.getMessage();
                if (message == null || (labelC2 = mx.b.b(message, "errorMessage")) == null) {
                    labelC2 = Label.INSTANCE.c();
                }
                return new dx.b.Business(null, fVar, label, labelC2, null, this.labelProvider.c(df2.a.f41382h), this.labelProvider.c(df2.a.G), 17, null);
            }
        }
        return error;
    }

    public final PayloadErrorData f(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(l(params.getDomainError()), false, new l() { // from class: if2.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.i(params, this, (ib4.c.b) obj);
            }
        }, 2, null));
    }
}
