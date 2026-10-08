package au2;

import fu.o;
import mx.Label;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import u70.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lau2/b;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "f", "(Ljava/lang/String;)Z", "b", "Lmx/a;", "a", "()Lmx/a;", "c", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements hz.a<String> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f14552c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f14553d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final k<o> f14554e = l.a(new er.a() { // from class: au2.a
        @Override // er.a
        public final Object a() {
            return b.e();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ l0 f14555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label errorMessage;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lau2/b$a;", "", "<init>", "()V", "Lfu/o;", "noSpecialCharsRegex$delegate", "Loq/k;", "b", "()Lfu/o;", "noSpecialCharsRegex", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final o b() {
            return (o) b.f14554e.getValue();
        }

        private a() {
        }
    }

    public b(Label label) {
        this.f14555a = new l0(label, f14552c.b());
        this.errorMessage = label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o e() {
        return new o("[^{}<>$&%#@\"']*$");
    }

    @Override // hz.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public Label getErrorMessage() {
        return this.errorMessage;
    }

    @Override // hz.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(String value) {
        return this.f14555a.b(value);
    }
}
