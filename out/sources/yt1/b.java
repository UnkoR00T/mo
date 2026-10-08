package yt1;

import fu.o;
import hz.g;
import hz.h;
import hz.i;
import mx.Label;
import oq.k;
import oq.l;
import oq.p;
import p071kotlin.Metadata;
import tq.e;
import u70.l0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0013\u0011\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0016"}, d2 = {"Lyt1/b;", "Lgz/b;", "Lyt1/b$c;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "params", "h", "(Lyt1/b$c;Ltq/e;)Ljava/lang/Object;", "Lhz/h;", "a", "Lhz/h;", "nameFieldValidator", "b", "surnameValidator", "c", "seriesAndNumberValidator", "d", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<c, g> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f229330d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f229331e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final k<o> f229332f = l.a(new er.a() { // from class: yt1.a
        @Override // er.a
        public final Object a() {
            return b.g();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h nameFieldValidator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h surnameValidator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h seriesAndNumberValidator;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lyt1/b$a;", "", "<init>", "()V", "Lfu/o;", "invalidCharsInPersonalDataRegex$delegate", "Loq/k;", "b", "()Lfu/o;", "invalidCharsInPersonalDataRegex", "", "MAX_LENGTH_NAME", "I", "MAX_LENGTH_SURNAME", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final o b() {
            return (o) b.f229332f.getValue();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: yt1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyt1/b$b;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "b", "Lmx/a;", "a", "()Lmx/a;", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C6157b implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l0 f229336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public C6157b(Label label) {
            this.f229336a = new l0(label, b.f229330d.b());
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
            return this.f229336a.b(value);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lyt1/b$c;", "Lgz/b$a;", "", "value", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "b", "Lyt1/b$c$a;", "Lyt1/b$c$b;", "Lyt1/b$c$c;", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyt1/b$c$a;", "Lyt1/b$c;", "", "value", "<init>", "(Ljava/lang/String;)V", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {
            public a(String str) {
                super(str, null);
            }
        }

        /* JADX INFO: renamed from: yt1.b$c$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyt1/b$c$b;", "Lyt1/b$c;", "", "value", "<init>", "(Ljava/lang/String;)V", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C6158b extends c {
            public C6158b(String str) {
                super(str, null);
            }
        }

        /* JADX INFO: renamed from: yt1.b$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyt1/b$c$c;", "Lyt1/b$c;", "", "value", "<init>", "(Ljava/lang/String;)V", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C6159c extends c {
            public C6159c(String str) {
                super(str, null);
            }
        }

        public /* synthetic */ c(String str, fr.k kVar) {
            this(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        private c(String str) {
            this.value = str;
        }
    }

    public b(mx.c cVar, i iVar) {
        hz.c.Companion companion = hz.c.INSTANCE;
        this.nameFieldValidator = (h) companion.a(iVar.a().M(cVar.c(vt1.a.f208268d)).y(60, cVar.e(vt1.a.f208270f, 60)), new C6157b(cVar.c(vt1.a.f208271g)));
        this.surnameValidator = (h) companion.a(iVar.a().M(cVar.c(vt1.a.f208269e)).y(160, cVar.e(vt1.a.f208270f, 160)), new C6157b(cVar.c(vt1.a.f208272h)));
        this.seriesAndNumberValidator = (h) companion.a(iVar.a().M(cVar.c(vt1.a.N)), new xt1.a(cVar.c(vt1.a.O)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o g() {
        return new o("^[^\\[\\]<\"%&;{>$}`]*$");
    }

    public Object h(c cVar, e<? super g> eVar) {
        h hVar;
        if (cVar instanceof c.a) {
            hVar = this.nameFieldValidator;
        } else if (cVar instanceof c.C6159c) {
            hVar = this.surnameValidator;
        } else {
            if (!(cVar instanceof c.C6158b)) {
                throw new p();
            }
            hVar = this.seriesAndNumberValidator;
        }
        return hVar.a(cVar.getValue());
    }
}
