package vt3;

import fu.o;
import mx.Label;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import u70.l0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\r\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lvt3/c;", "", "<init>", "()V", "Lfu/o;", "b", "Loq/k;", "g", "()Lfu/o;", "apartmentNumberPattern", "c", "h", "buildingNumberPattern", "a", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f208292a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final k apartmentNumberPattern = l.a(new er.a() { // from class: vt3.a
        @Override // er.a
        public final Object a() {
            return c.e();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final k buildingNumberPattern = l.a(new er.a() { // from class: vt3.b
        @Override // er.a
        public final Object a() {
            return c.f();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f208295d = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvt3/c$a;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "b", "Lmx/a;", "a", "()Lmx/a;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l0 f208296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public a(Label label) {
            this.f208296a = new l0(label, c.f208292a.g());
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
            return this.f208296a.b(value);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvt3/c$b;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "b", "Lmx/a;", "a", "()Lmx/a;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l0 f208298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public b(Label label) {
            this.f208298a = new l0(label, c.f208292a.h());
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
            return this.f208298a.b(value);
        }
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o e() {
        return new o("^[a-zA-Z0-9ąćęłńóśźżĄĆĘŁŃÓŚŹŻ _\\-\\/\\\\]*$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o f() {
        return new o("^[a-zA-Z0-9ąćęłńóśźżĄĆĘŁŃÓŚŹŻ _\\-\\/\\\\]+$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o g() {
        return (o) apartmentNumberPattern.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o h() {
        return (o) buildingNumberPattern.getValue();
    }
}
