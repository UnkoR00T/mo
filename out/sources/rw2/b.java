package rw2;

import er.l;
import fr.t;
import jb4.ErrorActionData;
import jb4.PayloadErrorData;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Lrw2/b;", "Lxw/f;", "Lrw2/b$a;", "Ljb4/b;", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "Ldx/b$g$d;", "params", "m", "(Ldx/b$g$d;Lrw2/b$a;)Ljb4/b;", "Ldx/b;", "Ljb4/f;", "h", "(Ldx/b;)Ljb4/f;", "i", "(Lrw2/b$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "Lmx/a;", "e", "()Lmx/a;", "commonErrorLabel", "f", "commonSomethingWentWrongLabel", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: rw2.b$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006#"}, d2 = {"Lrw2/b$a;", "", "Llv2/a;", "applicationOwner", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "retryAction", "backAction", "<init>", "(Llv2/a;Ldx/b;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llv2/a;", "getApplicationOwner", "()Llv2/a;", "b", "Ldx/b;", "c", "()Ldx/b;", "Ler/a;", "()Ler/a;", "d", "e", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final lv2.a applicationOwner;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b domainError;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> retryAction;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        public Params(lv2.a aVar, dx.b bVar, er.a<i0> aVar2, er.a<i0> aVar3, er.a<i0> aVar4) {
            this.applicationOwner = aVar;
            this.domainError = bVar;
            this.closeAction = aVar2;
            this.retryAction = aVar3;
            this.backAction = aVar4;
        }

        public final er.a<i0> a() {
            return this.backAction;
        }

        public final er.a<i0> b() {
            return this.closeAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final dx.b getDomainError() {
            return this.domainError;
        }

        public final er.a<i0> d() {
            return this.retryAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.applicationOwner == params.applicationOwner && t.c(this.domainError, params.domainError) && t.c(this.closeAction, params.closeAction) && t.c(this.retryAction, params.retryAction) && t.c(this.backAction, params.backAction);
        }

        public int hashCode() {
            return (((((((this.applicationOwner.hashCode() * 31) + this.domainError.hashCode()) * 31) + this.closeAction.hashCode()) * 31) + this.retryAction.hashCode()) * 31) + this.backAction.hashCode();
        }

        public String toString() {
            return "Params(applicationOwner=" + this.applicationOwner + ", domainError=" + this.domainError + ", closeAction=" + this.closeAction + ", retryAction=" + this.retryAction + ", backAction=" + this.backAction + ')';
        }
    }

    public b(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
    }

    private final Label e() {
        return this.labelProvider.c(gv2.a.f77314u);
    }

    private final Label f() {
        return this.labelProvider.c(gv2.a.f77246e0);
    }

    private final PayloadErrorData h(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(Params params, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.a.Close) {
            params.b().a();
        } else if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary)) {
            params.a().a();
        } else if (t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            params.b().a();
        } else {
            if (!t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new p();
            }
            params.d().a();
        }
        return i0.f148189a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final jb4.b m(dx.b.g.Http<?> http, Params params) {
        Label labelC;
        Label labelC2;
        Label labelE;
        Label labelF;
        Label labelE2;
        Label labelF2;
        Label labelE3;
        Label labelF3;
        PayloadErrorData payloadErrorDataH = h(http);
        String code = payloadErrorDataH != null ? payloadErrorDataH.getCode() : null;
        if (code != null) {
            switch (code.hashCode()) {
                case -1214338981:
                    if (code.equals("UNACCEPTABLE_AGE")) {
                        String title = payloadErrorDataH.getTitle();
                        if (title == null || (labelC = mx.b.b(title, "errorInfoTitle")) == null) {
                            labelC = this.labelProvider.c(gv2.a.f77314u);
                        }
                        Label label = labelC;
                        String message = payloadErrorDataH.getMessage();
                        if (message == null || (labelC2 = mx.b.b(message, "errorInfoMessage")) == null) {
                            labelC2 = this.labelProvider.c(gv2.a.f77236c0);
                        }
                        return new jb4.b.Info(label, labelC2, null, new ErrorActionData(this.labelProvider.c(gv2.a.f77286n), params.b()), null, null, new ErrorActionData(null, params.b(), 1, null), 52, null);
                    }
                    break;
                case 662349057:
                    if (code.equals("MICRO_PESEL_COMMUNICATION")) {
                        String title2 = payloadErrorDataH.getTitle();
                        if (title2 == null || (labelE = mx.b.b(title2, "errorFailureTitle")) == null) {
                            labelE = e();
                        }
                        Label label2 = labelE;
                        String message2 = payloadErrorDataH.getMessage();
                        if (message2 == null || (labelF = mx.b.b(message2, "errorFailureMessage")) == null) {
                            labelF = f();
                        }
                        return new jb4.b.Failure(label2, labelF, null, new ErrorActionData(this.labelProvider.c(gv2.a.f77271j0), params.d()), new ErrorActionData(this.labelProvider.c(gv2.a.f77235c), params.a()), null, new ErrorActionData(null, params.b(), 1, null), 36, null);
                    }
                    break;
                case 933565931:
                    if (code.equals("INCOMPLETE_DATA")) {
                        String title3 = payloadErrorDataH.getTitle();
                        if (title3 == null || (labelE2 = mx.b.b(title3, "errorWarningTitle")) == null) {
                            labelE2 = e();
                        }
                        Label label3 = labelE2;
                        String message3 = payloadErrorDataH.getMessage();
                        if (message3 == null || (labelF2 = mx.b.b(message3, "errorWarningMessage")) == null) {
                            labelF2 = f();
                        }
                        return new jb4.b.Warning(label3, labelF2, null, new ErrorActionData(this.labelProvider.c(gv2.a.f77286n), params.b()), null, null, new ErrorActionData(null, params.b(), 1, null), 52, null);
                    }
                    break;
                case 2109678326:
                    if (code.equals("PHYSICAL_ID_CARD_INVALIDATED")) {
                        String title4 = payloadErrorDataH.getTitle();
                        if (title4 == null || (labelE3 = mx.b.b(title4, "errorInfoTitle")) == null) {
                            labelE3 = e();
                        }
                        Label label4 = labelE3;
                        String message4 = payloadErrorDataH.getMessage();
                        if (message4 == null || (labelF3 = mx.b.b(message4, "errorInfoMessage")) == null) {
                            labelF3 = f();
                        }
                        return new jb4.b.Info(label4, labelF3, null, new ErrorActionData(this.labelProvider.c(gv2.a.f77286n), params.b()), null, null, new ErrorActionData(null, params.b(), 1, null), 52, null);
                    }
                    break;
            }
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        jb4.b bVarM;
        dx.b domainError = params.getDomainError();
        dx.b.g.Http<?> http = domainError instanceof dx.b.g.Http ? (dx.b.g.Http) domainError : null;
        return (http == null || (bVarM = m(http, params)) == null) ? this.genericDomainErrorMapper.b(new ib4.c.Params(params.getDomainError(), false, new l() { // from class: rw2.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.l(params, (ib4.c.b) obj);
            }
        }, 2, null)) : bVarM;
    }
}
