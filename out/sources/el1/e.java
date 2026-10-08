package el1;

import er.l;
import fr.k;
import fr.t;
import jb4.ErrorActionData;
import jb4.PayloadErrorData;
import oq.i0;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001b\u0011\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u00020\u0015*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lel1/e;", "Lxw/f;", "Lel1/e$c;", "Ljb4/b;", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "Ldx/b;", "Ljb4/f;", "i", "(Ldx/b;)Ljb4/f;", "params", "m", "(Lel1/e$c;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "", "l", "(Ljb4/f;)Ljava/lang/String;", "titleOrDefault", "h", "messageOrDefault", "c", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements f<Params, jb4.b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f51843c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f51844d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lel1/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        RETRY,
        BACK,
        CLOSE;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f51851e = wq.b.a(b());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lel1/e$b;", "", "<init>", "()V", "", "BUSINESS_CODE_INCOMPLETE_DATA", "Ljava/lang/String;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: el1.e$c, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lel1/e$c;", "", "Ldx/b;", "domainError", "Lkotlin/Function1;", "Lel1/e$a;", "Loq/i0;", "resultAction", "<init>", "(Ldx/b;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "()Ldx/b;", "b", "Ler/l;", "()Ler/l;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b domainError;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<a, i0> resultAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(dx.b bVar, l<? super a, i0> lVar) {
            this.domainError = bVar;
            this.resultAction = lVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b getDomainError() {
            return this.domainError;
        }

        public final l<a, i0> b() {
            return this.resultAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.domainError, params.domainError) && t.c(this.resultAction, params.resultAction);
        }

        public int hashCode() {
            return (this.domainError.hashCode() * 31) + this.resultAction.hashCode();
        }

        public String toString() {
            return "Params(domainError=" + this.domainError + ", resultAction=" + this.resultAction + ')';
        }
    }

    public e(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
    }

    private final String h(PayloadErrorData payloadErrorData) {
        String message = payloadErrorData.getMessage();
        return message == null ? this.labelProvider.c(gk1.a.f73465x).getText() : message;
    }

    private final PayloadErrorData i(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    private final String l(PayloadErrorData payloadErrorData) {
        String title = payloadErrorData.getTitle();
        return title == null ? this.labelProvider.c(gk1.a.f73465x).getText() : title;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params) {
        params.b().b(a.CLOSE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.b().b(a.CLOSE);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params, ib4.c.b bVar) {
        if (t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            params.b().b(a.BACK);
        } else if (t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            params.b().b(a.RETRY);
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        PayloadErrorData payloadErrorDataI;
        dx.b domainError = params.getDomainError();
        dx.b.g.Http http = domainError instanceof dx.b.g.Http ? (dx.b.g.Http) domainError : null;
        if (http != null && (payloadErrorDataI = i(http)) != null) {
            if (!t.c(payloadErrorDataI.getCode(), "INCOMPLETE_DATA")) {
                payloadErrorDataI = null;
            }
            if (payloadErrorDataI != null) {
                return new jb4.b.Warning(mx.b.b(l(payloadErrorDataI), "warningTitle"), mx.b.b(h(payloadErrorDataI), "warningMessage"), null, new ErrorActionData(this.labelProvider.c(gk1.a.f73439k), new er.a() { // from class: el1.b
                    @Override // er.a
                    public final Object a() {
                        return e.q(params);
                    }
                }), null, null, new ErrorActionData(null, new er.a() { // from class: el1.c
                    @Override // er.a
                    public final Object a() {
                        return e.r(params);
                    }
                }, 1, null), 52, null);
            }
        }
        return this.genericDomainErrorMapper.b(new ib4.c.Params(params.getDomainError(), false, new l() { // from class: el1.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.s(params, (ib4.c.b) obj);
            }
        }, 2, null));
    }
}
