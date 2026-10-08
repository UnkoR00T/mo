package kv3;

import er.l;
import fr.t;
import mz3.z;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkv3/d;", "Lxw/f;", "Lkv3/d$a;", "Ljb4/b;", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lib4/c;)V", "params", "e", "(Lkv3/d$a;)Ljb4/b;", "a", "Lib4/c;", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: kv3.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001c¨\u0006!"}, d2 = {"Lkv3/d$a;", "", "Ljv3/b;", "error", "Lkotlin/Function0;", "Loq/i0;", "goBackAction", "Lkotlin/Function1;", "Lmz3/z$b;", "retryUpdateAction", "retryDownloadAction", "<init>", "(Ljv3/b;Ler/a;Ler/l;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljv3/b;", "()Ljv3/b;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "d", "()Ler/l;", "documentdownloadloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final jv3.b error;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<z.b, i0> retryUpdateAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> retryDownloadAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(jv3.b bVar, er.a<i0> aVar, l<? super z.b, i0> lVar, er.a<i0> aVar2) {
            this.error = bVar;
            this.goBackAction = aVar;
            this.retryUpdateAction = lVar;
            this.retryDownloadAction = aVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jv3.b getError() {
            return this.error;
        }

        public final er.a<i0> b() {
            return this.goBackAction;
        }

        public final er.a<i0> c() {
            return this.retryDownloadAction;
        }

        public final l<z.b, i0> d() {
            return this.retryUpdateAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.error, params.error) && t.c(this.goBackAction, params.goBackAction) && t.c(this.retryUpdateAction, params.retryUpdateAction) && t.c(this.retryDownloadAction, params.retryDownloadAction);
        }

        public int hashCode() {
            return (((((this.error.hashCode() * 31) + this.goBackAction.hashCode()) * 31) + this.retryUpdateAction.hashCode()) * 31) + this.retryDownloadAction.hashCode();
        }

        public String toString() {
            return "Params(error=" + this.error + ", goBackAction=" + this.goBackAction + ", retryUpdateAction=" + this.retryUpdateAction + ", retryDownloadAction=" + this.retryDownloadAction + ')';
        }
    }

    public d(ib4.c cVar) {
        this.genericDomainErrorMapper = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(Params params, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.AbstractC2161b.C2162b) || (bVar instanceof ib4.c.b.a.Primary)) {
            jv3.b error = params.getError();
            if (error instanceof jv3.b.DownloadError) {
                params.c().a();
            } else if (error instanceof jv3.b.UpdateError) {
                params.d().b(((jv3.b.UpdateError) error).getUpdateMethodType());
            } else {
                if (!(error instanceof jv3.b.InitializationError)) {
                    throw new p();
                }
                params.b().a();
            }
        } else {
            if (!(bVar instanceof ib4.c.b.a.Secondary) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.AbstractC2161b.a)) {
                throw new p();
            }
            params.b().a();
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(params.getError().getDomainError(), false, new l() { // from class: kv3.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.f(params, (ib4.c.b) obj);
            }
        }, 2, null));
    }
}
