package g61;

import fu.o;
import java.time.temporal.ChronoUnit;
import mx.Label;
import oq.k;
import oq.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\n\u0005\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lg61/b;", "", "<init>", "()V", "Lfu/o;", "b", "Loq/k;", "c", "()Lfu/o;", "onlyDigitsRegex", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f70887a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final k onlyDigitsRegex = l.a(new er.a() { // from class: g61.a
        @Override // er.a
        public final Object a() {
            return b.d();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f70889c = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lg61/b$a;", "Lhz/a;", "Lfz/b$c;", "Lmx/a;", "errorMessage", "Lez/a;", "currentTimeProvider", "<init>", "(Lmx/a;Lez/a;)V", "value", "", "c", "(Lfz/b$c;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "Lez/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements hz.a<fz.b.LocalDate> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ez.a currentTimeProvider;

        public a(Label label, ez.a aVar) {
            this.errorMessage = label;
            this.currentTimeProvider = aVar;
        }

        @Override // hz.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getErrorMessage() {
            return this.errorMessage;
        }

        @Override // hz.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(fz.b.LocalDate value) {
            return ((int) ChronoUnit.YEARS.between(value.getDate(), this.currentTimeProvider.c())) < 18;
        }
    }

    /* JADX INFO: renamed from: g61.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lg61/b$b;", "Lhz/a;", "Lfz/b$c;", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Lfz/b$c;)Z", "a", "Lmx/a;", "()Lmx/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1606b implements hz.a<fz.b.LocalDate> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public C1606b(Label label) {
            this.errorMessage = label;
        }

        @Override // hz.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public Label getErrorMessage() {
            return this.errorMessage;
        }

        @Override // hz.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean b(fz.b.LocalDate value) {
            return (value != null ? value.getDate() : null) != null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lg61/b$c;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "a", "Lmx/a;", "()Lmx/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public c(Label label) {
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
            return !b.f70887a.c().f(value);
        }
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o c() {
        return (o) onlyDigitsRegex.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o d() {
        return new o("[^a-zа-џґa-zżźćńółęąśA-ZЀ-ЯҐA-ZŻŹĆŃÓŁĘĄŚ]*");
    }
}
