package t02;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lt02/p;", "Lgz/a;", "Lt02/p$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/h;", "validatorText", "<init>", "(Lmx/c;Lhz/h;)V", "params", "d", "(Ljava/lang/String;)Lhz/g;", "a", "Loq/k;", "c", "()Lhz/h;", "validator", "b", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p implements gz.a<b, hz.g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f186718c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oq.k validator;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0006"}, d2 = {"Lt02/p$b;", "Lgz/b$a;", "", "value", "a", "(Ljava/lang/String;)Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements gz.b.a {
        public static String a(String str) {
            return str;
        }
    }

    public p(final mx.c cVar, final hz.h hVar) {
        this.validator = oq.l.a(new er.a() { // from class: t02.o
            @Override // er.a
            public final Object a() {
                return p.e(hVar, cVar);
            }
        });
    }

    private final hz.h c() {
        return (hz.h) this.validator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hz.h e(hz.h hVar, mx.c cVar) {
        return hVar.M(cVar.c(e02.a.D3)).y(2000, cVar.e(e02.a.K0, 2000));
    }

    public hz.g d(String params) {
        return c().a(params);
    }
}
