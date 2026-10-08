package vk2;

import fr.t;
import jb4.ErrorActionData;
import jb4.PayloadErrorData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvk2/c;", "Lib4/c;", "Lmx/c;", "labelProvider", "domainErrorMapper", "<init>", "(Lmx/c;Lib4/c;)V", "Ldx/b;", "Ljb4/f;", "f", "(Ldx/b;)Ljb4/f;", "Lib4/c$a;", "params", "Ljb4/b;", "h", "(Lib4/c$a;)Ljb4/b;", "a", "Lmx/c;", "b", "Lib4/c;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements ib4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    public c(mx.c cVar, ib4.c cVar2) {
        this.labelProvider = cVar;
        this.domainErrorMapper = cVar2;
    }

    private final PayloadErrorData f(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(ib4.c.Params params) {
        params.c().b(ib4.c.b.AbstractC2161b.a.f90859a);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final ib4.c.Params params) {
        Label labelC;
        Label labelC2;
        dx.b domainError = params.getDomainError();
        if (!(domainError instanceof dx.b.g.Http)) {
            return this.domainErrorMapper.b(params);
        }
        PayloadErrorData payloadErrorDataF = f(domainError);
        if (!t.c(payloadErrorDataF != null ? payloadErrorDataF.getCode() : null, "PHYSICAL_ID_CARD_NOT_PRESENT_YET")) {
            return this.domainErrorMapper.b(params);
        }
        String title = payloadErrorDataF.getTitle();
        if (title == null || (labelC = mx.b.b(title, "networkErrorDataTitle")) == null) {
            labelC = Label.INSTANCE.c();
        }
        Label label = labelC;
        String message = payloadErrorDataF.getMessage();
        if (message == null || (labelC2 = mx.b.b(message, "networkErrorDataMessage")) == null) {
            labelC2 = Label.INSTANCE.c();
        }
        Label label2 = labelC2;
        Label.Companion companion = Label.INSTANCE;
        return new jb4.b.Info(label, label2, companion.c(), new ErrorActionData(this.labelProvider.c(ik2.a.f93185b), new er.a() { // from class: vk2.a
            @Override // er.a
            public final Object a() {
                return c.i(params);
            }
        }), null, null, new ErrorActionData(companion.c(), new er.a() { // from class: vk2.b
            @Override // er.a
            public final Object a() {
                return c.l(params);
            }
        }), 48, null);
    }
}
