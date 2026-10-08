package dx0;

import a14.w;
import fr.t;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ldx0/n;", "", "Ldx0/n$b;", "Loq/i0;", "Lmx/c;", "labelProvider", "La14/w;", "openUrlIntentUseCase", "Lpx/d;", "remoteLogger", "<init>", "(Lmx/c;La14/w;Lpx/d;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Ldx0/n$b;Ltq/e;)Ljava/lang/Object;", "a", "La14/w;", "b", "Lpx/d;", "Ldx/b$c;", "c", "Ldx/b$c;", "error", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business error;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ldx0/n$a;", "Ldx/b$c$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a implements dx.b.Business.a {
        EDO_APP_INTENT;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ wq.a f45246c = wq.b.a(b());
    }

    /* JADX INFO: renamed from: dx0.n$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Ldx0/n$b;", "Lgz/b$a;", "", "url", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        public Params(String str) {
            this.url = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.url, ((Params) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "Params(url=" + this.url + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f45249e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f45251g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45249e = obj;
            this.f45251g |= PKIFailureInfo.systemUnavail;
            return n.this.d(null, this);
        }
    }

    public n(mx.c cVar, w wVar, px.d dVar) {
        this.openUrlIntentUseCase = wVar;
        this.remoteLogger = dVar;
        this.error = new dx.b.Business(a.EDO_APP_INTENT, null, cVar.c(yw0.a.U), null, null, cVar.c(yw0.a.L), null, 90, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f45251g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f45251g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f45249e;
        Object objE = uq.b.e();
        int i16 = cVar.f45251g;
        if (i16 == 0) {
            u.b(objC);
            w wVar = this.openUrlIntentUseCase;
            w.Params params2 = new w.Params(params.getUrl(), false);
            cVar.f45248d = vq.j.a(params);
            cVar.f45251g = 1;
            objC = wVar.c(params2, cVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            if (((dx.b.Business) ((dx.i.Left) iVar).b()).getType() == w.a.SERVICE_NOT_FOUND) {
                px.b.E7(this.remoteLogger, "Activation with Edo failed, SERVICE_NOT_FOUND", null, 2, null);
            }
            return new dx.i.Left(this.error);
        }
        if (iVar instanceof dx.i.Right) {
            return iVar;
        }
        throw new p();
    }
}
