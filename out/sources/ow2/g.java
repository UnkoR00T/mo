package ow2;

import fr.t;
import jb4.ErrorActionData;
import jb4.PayloadErrorData;
import mw2.l;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Low2/g;", "Lxw/f;", "Low2/g$a;", "Ljb4/b;", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "Ldx/b;", "Ljb4/f;", "m", "(Ldx/b;)Ljb4/f;", "params", "q", "(Low2/g$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, jb4.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: ow2.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Low2/g$a;", "", "Lmw2/l;", "applicationDataRequester", "Ldx/b;", "error", "Lkotlin/Function1;", "Lib4/c$b;", "Loq/i0;", "resultAction", "<init>", "(Lmw2/l;Ldx/b;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmw2/l;", "getApplicationDataRequester", "()Lmw2/l;", "b", "Ldx/b;", "()Ldx/b;", "c", "Ler/l;", "()Ler/l;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l applicationDataRequester;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b error;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<ib4.c.b, i0> resultAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(l lVar, dx.b bVar, er.l<? super ib4.c.b, i0> lVar2) {
            this.applicationDataRequester = lVar;
            this.error = bVar;
            this.resultAction = lVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b getError() {
            return this.error;
        }

        public final er.l<ib4.c.b, i0> b() {
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
            return t.c(this.applicationDataRequester, params.applicationDataRequester) && t.c(this.error, params.error) && t.c(this.resultAction, params.resultAction);
        }

        public int hashCode() {
            return (((this.applicationDataRequester.hashCode() * 31) + this.error.hashCode()) * 31) + this.resultAction.hashCode();
        }

        public String toString() {
            return "Params(applicationDataRequester=" + this.applicationDataRequester + ", error=" + this.error + ", resultAction=" + this.resultAction + ')';
        }
    }

    public g(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
    }

    private final PayloadErrorData m(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params) {
        params.b().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Params params) {
        params.b().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params) {
        params.b().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params) {
        params.b().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params) {
        params.b().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params) {
        params.b().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        Label labelC;
        Label labelC2;
        Label labelC3;
        Label labelC4;
        Label labelC5;
        Label labelC6;
        dx.b error = params.getError();
        PayloadErrorData payloadErrorDataM = m(error);
        String code = payloadErrorDataM != null ? payloadErrorDataM.getCode() : null;
        if (code != null) {
            int iHashCode = code.hashCode();
            if (iHashCode != -1214338981) {
                if (iHashCode != -523304072) {
                    if (iHashCode == 933565931 && code.equals("INCOMPLETE_DATA")) {
                        String title = payloadErrorDataM.getTitle();
                        if (title == null || (labelC5 = mx.b.b(title, "errorWarningTitle")) == null) {
                            labelC5 = this.labelProvider.c(gv2.a.f77314u);
                        }
                        Label label = labelC5;
                        String message = payloadErrorDataM.getMessage();
                        if (message == null || (labelC6 = mx.b.b(message, "errorWarningMessage")) == null) {
                            labelC6 = this.labelProvider.c(gv2.a.f77246e0);
                        }
                        return new jb4.b.Warning(label, labelC6, null, new ErrorActionData(this.labelProvider.c(gv2.a.f77286n), new er.a() { // from class: ow2.a
                            @Override // er.a
                            public final Object a() {
                                return g.r(params);
                            }
                        }), null, null, new ErrorActionData(null, new er.a() { // from class: ow2.b
                            @Override // er.a
                            public final Object a() {
                                return g.s(params);
                            }
                        }, 1, null), 52, null);
                    }
                } else if (code.equals("APPLICATION_IN_PROGRESS")) {
                    String title2 = payloadErrorDataM.getTitle();
                    if (title2 == null || (labelC3 = mx.b.b(title2, "errorWarningTitle")) == null) {
                        labelC3 = this.labelProvider.c(gv2.a.O0);
                    }
                    Label label2 = labelC3;
                    String message2 = payloadErrorDataM.getMessage();
                    if (message2 == null || (labelC4 = mx.b.b(message2, "errorWarningMessage")) == null) {
                        labelC4 = this.labelProvider.c(gv2.a.N0);
                    }
                    return new jb4.b.Warning(label2, labelC4, null, new ErrorActionData(this.labelProvider.c(gv2.a.f77286n), new er.a() { // from class: ow2.e
                        @Override // er.a
                        public final Object a() {
                            return g.x(params);
                        }
                    }), null, null, new ErrorActionData(null, new er.a() { // from class: ow2.f
                        @Override // er.a
                        public final Object a() {
                            return g.z(params);
                        }
                    }, 1, null), 52, null);
                }
            } else if (code.equals("UNACCEPTABLE_AGE")) {
                String title3 = payloadErrorDataM.getTitle();
                if (title3 == null || (labelC = mx.b.b(title3, "errorInfoTitle")) == null) {
                    labelC = this.labelProvider.c(gv2.a.f77314u);
                }
                Label label3 = labelC;
                String message3 = payloadErrorDataM.getMessage();
                if (message3 == null || (labelC2 = mx.b.b(message3, "errorInfoMessage")) == null) {
                    labelC2 = this.labelProvider.c(gv2.a.f77236c0);
                }
                return new jb4.b.Info(label3, labelC2, null, new ErrorActionData(this.labelProvider.c(gv2.a.f77286n), new er.a() { // from class: ow2.c
                    @Override // er.a
                    public final Object a() {
                        return g.u(params);
                    }
                }), null, null, new ErrorActionData(null, new er.a() { // from class: ow2.d
                    @Override // er.a
                    public final Object a() {
                        return g.v(params);
                    }
                }, 1, null), 52, null);
            }
        }
        return this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, params.b(), 2, null));
    }
}
