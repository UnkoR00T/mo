package t02;

import mx.Label;
import p071kotlin.Metadata;
import u70.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0013\u0012\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lt02/u;", "Lgz/a;", "Lt02/u$c;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/h;", "validatorText", "<init>", "(Lmx/c;Lhz/h;)V", "params", "g", "(Ljava/lang/String;)Lhz/g;", "a", "Loq/k;", "f", "()Lhz/h;", "validator", "b", "c", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u implements gz.a<c, hz.g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f186728c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final oq.k<fu.o> f186729d = oq.l.a(new er.a() { // from class: t02.s
        @Override // er.a
        public final Object a() {
            return u.e();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final oq.k validator;

    /* JADX INFO: renamed from: t02.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lt02/u$a;", "", "<init>", "()V", "Lfu/o;", "epuapTitle$delegate", "Loq/k;", "b", "()Lfu/o;", "epuapTitle", "", "MAX_LENGTH_TITLE", "I", "", "REGEX_ERROR_VALUE", "Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final fu.o b() {
            return (fu.o) u.f186729d.getValue();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lt02/u$b;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "b", "Lmx/a;", "a", "()Lmx/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l0 f186731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public b(Label label) {
            this.f186731a = new l0(label, u.INSTANCE.b());
            this.errorMessage = label;
        }

        @Override // hz.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getErrorMessage() {
            return this.errorMessage;
        }

        @Override // hz.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(String value) {
            return this.f186731a.b(value);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0006"}, d2 = {"Lt02/u$c;", "Lgz/b$a;", "", "value", "a", "(Ljava/lang/String;)Ljava/lang/String;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements gz.b.a {
        public static String a(String str) {
            return str;
        }
    }

    public u(final mx.c cVar, final hz.h hVar) {
        this.validator = oq.l.a(new er.a() { // from class: t02.t
            @Override // er.a
            public final Object a() {
                return u.h(hVar, cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fu.o e() {
        return new fu.o("^[^\\\\/:*?\"<>|%]*$");
    }

    private final hz.h f() {
        return (hz.h) this.validator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hz.h h(hz.h hVar, mx.c cVar) {
        hz.h hVarY = hVar.M(cVar.c(e02.a.J3)).y(250, cVar.e(e02.a.I3, 250));
        hVarY.g(new b(cVar.e(e02.a.K3, "\\ / ? : * \" > < | %")));
        return hVarY;
    }

    public hz.g g(String params) {
        return f().a(params);
    }
}
