package tb2;

import fr.t;
import fu.o;
import hz.g;
import hz.h;
import hz.i;
import mx.Label;
import oq.i0;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import u70.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0019\u0017\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Ltb2/e;", "Lgz/b;", "Ltb2/e$c;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "Lhz/h;", "", "condition", "Lkotlin/Function1;", "Loq/i0;", "block", "i", "(Lhz/h;ZLer/l;)Lhz/h;", "params", "k", "(Ltb2/e$c;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lhz/i;", "c", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b<Params, g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f189427c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f189428d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final k<o> f189429e = l.a(new er.a() { // from class: tb2.d
        @Override // er.a
        public final Object a() {
            return e.j();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i validatorTextFactory;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ltb2/e$a;", "", "<init>", "()V", "Lfu/o;", "invalidCharsInPersonalDataRegex$delegate", "Loq/k;", "b", "()Lfu/o;", "invalidCharsInPersonalDataRegex", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final o b() {
            return (o) e.f189429e.getValue();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltb2/e$b;", "Lhz/a;", "", "Lmx/a;", "errorMessage", "<init>", "(Lmx/a;)V", "value", "", "c", "(Ljava/lang/String;)Z", "b", "Lmx/a;", "a", "()Lmx/a;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class b implements hz.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l0 f189432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Label errorMessage;

        public b(Label label) {
            this.f189432a = new l0(label, e.f189427c.b());
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
            return this.f189432a.b(value);
        }
    }

    /* JADX INFO: renamed from: tb2.e$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"Ltb2/e$c;", "Lgz/b$a;", "", "description", "", "isRequired", "verifySpecialCharacters", "<init>", "(Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRequired;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean verifySpecialCharacters;

        public Params(String str, boolean z15, boolean z16) {
            this.description = str;
            this.isRequired = z15;
            this.verifySpecialCharacters = z16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getVerifySpecialCharacters() {
            return this.verifySpecialCharacters;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.description, params.description) && this.isRequired == params.isRequired && this.verifySpecialCharacters == params.verifySpecialCharacters;
        }

        public int hashCode() {
            return (((this.description.hashCode() * 31) + Boolean.hashCode(this.isRequired)) * 31) + Boolean.hashCode(this.verifySpecialCharacters);
        }

        public String toString() {
            return "Params(description=" + this.description + ", isRequired=" + this.isRequired + ", verifySpecialCharacters=" + this.verifySpecialCharacters + ')';
        }
    }

    public e(mx.c cVar, i iVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
    }

    private final h i(h hVar, boolean z15, er.l<? super h, i0> lVar) {
        if (z15) {
            lVar.b(hVar);
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o j() {
        return new o("^[^\\[\\]<\"%&;{>$}`]*$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(e eVar, h hVar) {
        hVar.M(eVar.labelProvider.c(hb2.b.f82812t0));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(e eVar, h hVar) {
        hz.c.INSTANCE.a(hVar, new b(eVar.labelProvider.c(hb2.b.f82814u0)));
        return i0.f148189a;
    }

    public Object k(Params params, tq.e<? super g> eVar) {
        return i(i(this.validatorTextFactory.a(), params.getIsRequired(), new er.l() { // from class: tb2.b
            @Override // er.l
            public final Object b(Object obj) {
                return e.l(this.f189425a, (h) obj);
            }
        }).y(1500, this.labelProvider.c(hb2.b.S)), params.getVerifySpecialCharacters(), new er.l() { // from class: tb2.c
            @Override // er.l
            public final Object b(Object obj) {
                return e.m(this.f189426a, (h) obj);
            }
        }).a(params.getDescription());
    }
}
