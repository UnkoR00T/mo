package qj3;

import java.util.List;
import jb4.ErrorActionData;
import jb4.PayloadErrorData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lqj3/e;", "Lib4/c;", "Lmx/c;", "labelProvider", "genericDomainErrorMapper", "Lgx/d;", "globalEventManager", "<init>", "(Lmx/c;Lib4/c;Lgx/d;)V", "Ldx/b;", "Ljb4/f;", "i", "(Ldx/b;)Ljb4/f;", "Lib4/c$a;", "params", "Ljb4/b;", "l", "(Lib4/c$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "c", "Lgx/d;", "", "", "d", "Ljava/util/List;", "errorCodes", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements ib4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> errorCodes = v.q("CEPIK_SERVICE_NOT_AVAILABLE", "ALL_ABROAD_SERVICES_NOT_AVAILABLE", "CEPIK_TIMELINE_SERVICE_NOT_AVAILABLE");

    public e(mx.c cVar, ib4.c cVar2, gx.d dVar) {
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
        this.globalEventManager = dVar;
    }

    private final PayloadErrorData i(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(e eVar) {
        eVar.globalEventManager.c(new gx.a.GoToStore(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q() {
        ib4.c.b.AbstractC2161b.a aVar = ib4.c.b.AbstractC2161b.a.f90859a;
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public jb4.b b(ib4.c.Params params) {
        Label labelC;
        Label labelC2;
        dx.b domainError = params.getDomainError();
        if (domainError instanceof dx.b.AppUpdateRequired) {
            dx.b.AppUpdateRequired appUpdateRequired = (dx.b.AppUpdateRequired) domainError;
            Label title = appUpdateRequired.getTitle();
            if (title == null) {
                title = this.labelProvider.c(yi3.a.f227215c);
            }
            Label label = title;
            Label message = appUpdateRequired.getMessage();
            if (message == null) {
                message = this.labelProvider.c(yi3.a.f227230h);
            }
            return new jb4.b.Info(label, message, null, new ErrorActionData(this.labelProvider.c(yi3.a.f227227g), new er.a() { // from class: qj3.a
                @Override // er.a
                public final Object a() {
                    return e.m(this.f167007a);
                }
            }), new ErrorActionData(this.labelProvider.c(yi3.a.f227209a), new er.a() { // from class: qj3.b
                @Override // er.a
                public final Object a() {
                    return e.q();
                }
            }), null, null, 100, null);
        }
        if (!(domainError instanceof dx.b.g.Http)) {
            return this.genericDomainErrorMapper.b(new ib4.c.Params(params.getDomainError(), false, params.c(), 2, null));
        }
        PayloadErrorData payloadErrorDataI = i(domainError);
        if (payloadErrorDataI == null || !v.c0(this.errorCodes, payloadErrorDataI.getCode())) {
            return this.genericDomainErrorMapper.b(new ib4.c.Params(params.getDomainError(), false, params.c(), 2, null));
        }
        String message2 = payloadErrorDataI.getMessage();
        if (message2 == null || (labelC = mx.b.b(message2, "error_title")) == null) {
            labelC = this.labelProvider.c(yi3.a.f227215c);
        }
        Label label2 = labelC;
        String message3 = payloadErrorDataI.getMessage();
        if (message3 == null || (labelC2 = mx.b.b(message3, "error_message")) == null) {
            labelC2 = this.labelProvider.c(yi3.a.f227224f);
        }
        return new jb4.b.Failure(label2, labelC2, null, new ErrorActionData(this.labelProvider.c(yi3.a.f227209a), new er.a() { // from class: qj3.c
            @Override // er.a
            public final Object a() {
                return e.r();
            }
        }), null, null, new ErrorActionData(Label.INSTANCE.c(), new er.a() { // from class: qj3.d
            @Override // er.a
            public final Object a() {
                return e.s();
            }
        }), 52, null);
    }
}
