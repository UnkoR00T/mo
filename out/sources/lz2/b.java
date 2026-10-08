package lz2;

import er.l;
import fr.t;
import jb4.PayloadErrorData;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Llz2/b;", "Lxw/f;", "Llz2/b$a;", "Ljb4/b;", "Lib4/c;", "errorMapper", "Lmx/c;", "labelProvider", "<init>", "(Lib4/c;Lmx/c;)V", "Ldx/b;", "params", "f", "(Ldx/b;Llz2/b$a;)Ljb4/b;", "Ljb4/f;", "e", "(Ldx/b;)Ljb4/f;", "i", "(Llz2/b$a;)Ljb4/b;", "a", "Lib4/c;", "b", "Lmx/c;", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: lz2.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006!"}, d2 = {"Llz2/b$a;", "", "Lmz2/a;", "errorType", "Lkotlin/Function0;", "Loq/i0;", "onClose", "onCloseProcess", "onRetry", "goToEmptyCanScreen", "goToCanScreen", "<init>", "(Lmz2/a;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmz2/a;", "()Lmz2/a;", "b", "Ler/a;", "d", "()Ler/a;", "c", "e", "f", "qualifiedsignature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mz2.a errorType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseProcess;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onRetry;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToEmptyCanScreen;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> goToCanScreen;

        public Params(mz2.a aVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4, er.a<i0> aVar5, er.a<i0> aVar6) {
            this.errorType = aVar;
            this.onClose = aVar2;
            this.onCloseProcess = aVar3;
            this.onRetry = aVar4;
            this.goToEmptyCanScreen = aVar5;
            this.goToCanScreen = aVar6;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final mz2.a getErrorType() {
            return this.errorType;
        }

        public final er.a<i0> b() {
            return this.goToCanScreen;
        }

        public final er.a<i0> c() {
            return this.goToEmptyCanScreen;
        }

        public final er.a<i0> d() {
            return this.onClose;
        }

        public final er.a<i0> e() {
            return this.onCloseProcess;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.errorType, params.errorType) && t.c(this.onClose, params.onClose) && t.c(this.onCloseProcess, params.onCloseProcess) && t.c(this.onRetry, params.onRetry) && t.c(this.goToEmptyCanScreen, params.goToEmptyCanScreen) && t.c(this.goToCanScreen, params.goToCanScreen);
        }

        public final er.a<i0> f() {
            return this.onRetry;
        }

        public int hashCode() {
            return (((((((((this.errorType.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.onCloseProcess.hashCode()) * 31) + this.onRetry.hashCode()) * 31) + this.goToEmptyCanScreen.hashCode()) * 31) + this.goToCanScreen.hashCode();
        }

        public String toString() {
            return "Params(errorType=" + this.errorType + ", onClose=" + this.onClose + ", onCloseProcess=" + this.onCloseProcess + ", onRetry=" + this.onRetry + ", goToEmptyCanScreen=" + this.goToEmptyCanScreen + ", goToCanScreen=" + this.goToCanScreen + ')';
        }
    }

    public b(ib4.c cVar, mx.c cVar2) {
        this.errorMapper = cVar;
        this.labelProvider = cVar2;
    }

    private final PayloadErrorData e(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    private final jb4.b f(dx.b bVar, final Params params) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new l() { // from class: lz2.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.h(params, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Params params, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a)) {
            if (t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                params.f().a();
            } else {
                if (!t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new p();
                }
                params.d().a();
            }
        }
        return i0.f148189a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (r5.equals("SUSPENDED_DOCUMENT") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (r5.equals("REVOKED_DOCUMENT") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
    
        return new jb4.b.Warning(mx.b.d(r3.getTitle(), "errorTitleValue"), mx.b.d(r3.getMessage(), "errorMessageValue"), null, new jb4.ErrorActionData(r21.labelProvider.c(uy2.b.f202284c), r22.e()), null, null, new jb4.ErrorActionData(null, r22.e(), 1, null), 52, null);
     */
    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jb4.b b(lz2.b.Params r22) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lz2.b.b(lz2.b$a):jb4.b");
    }
}
