package l61;

import mx.Label;
import p071kotlin.Metadata;
import u70.l0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0011\r\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ll61/b;", "Lgz/a;", "Ll61/b$c;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "params", "f", "(Ll61/b$c;)Lhz/g;", "a", "Lmx/c;", "b", "Lhz/i;", "c", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.a<Params, hz.g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C2818b f116333c = new C2818b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f116334d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final oq.k<fu.o> f116335e = oq.l.a(new er.a() { // from class: l61.a
        @Override // er.a
        public final Object a() {
            return b.e();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz.i validatorTextFactory;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll61/b$a;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "b", "Lmx/a;", "a", "()Lmx/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l0 f116338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public a(Label label) {
            this.f116338a = new l0(label, b.f116333c.b());
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
            return this.f116338a.b(value);
        }
    }

    /* JADX INFO: renamed from: l61.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll61/b$b;", "", "<init>", "()V", "Lfu/o;", "alphanumericWithDashRegex$delegate", "Loq/k;", "b", "()Lfu/o;", "alphanumericWithDashRegex", "", "MAX_LENGTH", "I", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C2818b {
        public /* synthetic */ C2818b(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final fu.o b() {
            return (fu.o) b.f116335e.getValue();
        }

        private C2818b() {
        }
    }

    /* JADX INFO: renamed from: l61.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Ll61/b$c;", "Lgz/b$a;", "", "documentSeriesAndNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentSeriesAndNumber;

        public Params(String str) {
            this.documentSeriesAndNumber = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentSeriesAndNumber() {
            return this.documentSeriesAndNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.documentSeriesAndNumber, ((Params) other).documentSeriesAndNumber);
        }

        public int hashCode() {
            return this.documentSeriesAndNumber.hashCode();
        }

        public String toString() {
            return "Params(documentSeriesAndNumber=" + this.documentSeriesAndNumber + ')';
        }
    }

    public b(mx.c cVar, hz.i iVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fu.o e() {
        return new fu.o("^[a-zA-Z0-9-]+$");
    }

    public hz.g f(Params params) {
        mx.c cVar = this.labelProvider;
        return ((hz.h) hz.c.INSTANCE.a(this.validatorTextFactory.a().M(cVar.c(w51.a.f210380m5)), new a(cVar.c(w51.a.f210387n5)))).y(24, cVar.c(w51.a.f210394o5)).a(params.getDocumentSeriesAndNumber());
    }
}
