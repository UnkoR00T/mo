package q73;

import fu.o;
import hz.g;
import hz.h;
import hz.i;
import iy.b0;
import iy.c0;
import mx.Label;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import u70.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0002\u000e\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lq73/e;", "", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "Lfp0/h;", "qrCode", "Lhz/g;", "g", "(Liy/b0;)Lhz/g;", "Lhz/h;", "a", "Loq/k;", "f", "()Lhz/h;", "validator", "b", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f165212b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f165213c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final k<o> f165214d = l.a(new er.a() { // from class: q73.c
        @Override // er.a
        public final Object a() {
            return e.e();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k validator;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq73/e$a;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "b", "Lmx/a;", "a", "()Lmx/a;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l0 f165216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public a(Label label) {
            this.f165216a = new l0(label, e.f165212b.b());
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
            return this.f165216a.b(value);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lq73/e$b;", "", "<init>", "()V", "Lfu/o;", "alphanumericWithDashRegex$delegate", "Loq/k;", "b", "()Lfu/o;", "alphanumericWithDashRegex", "", "JUNIOR_SCHOOL_CARD_QR_CODE_LENGTH", "I", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final o b() {
            return (o) e.f165214d.getValue();
        }

        private b() {
        }
    }

    public e(final mx.c cVar, final i iVar) {
        this.validator = l.a(new er.a() { // from class: q73.d
            @Override // er.a
            public final Object a() {
                return e.h(iVar, cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o e() {
        return new o("^[a-zA-Z0-9-]+$");
    }

    private final h f() {
        return (h) this.validator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h h(i iVar, mx.c cVar) {
        return (h) hz.c.INSTANCE.a(iVar.a().M(cVar.c(n73.a.f133462i)).O(36, cVar.c(n73.a.f133464j)).y(36, cVar.c(n73.a.f133466k)), new a(cVar.c(n73.a.f133464j)));
    }

    public final g g(b0 qrCode) {
        return f().a(c0.e(qrCode));
    }
}
