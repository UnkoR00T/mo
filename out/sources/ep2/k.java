package ep2;

import fr.t;
import iy.b0;
import iy.c0;
import oq.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lep2/k;", "Lgz/b;", "Lep2/k$b;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "params", "f", "(Lep2/k$b;Ltq/e;)Ljava/lang/Object;", "a", "Lmx/c;", "b", "Lhz/i;", "Lhz/h;", "c", "Loq/k;", "e", "()Lhz/h;", "textValidator", "d", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements gz.b<Params, hz.g> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f52695d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f52696e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz.i validatorTextFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k textValidator = l.a(new er.a() { // from class: ep2.j
        @Override // er.a
        public final Object a() {
            return k.g(this.f52694a);
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lep2/k$a;", "", "<init>", "()V", "", "NAME_MAX_LENGTH", "I", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ep2.k$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lep2/k$b;", "Lgz/b$a;", "Liy/b0;", "name", "", "isRequired", "<init>", "(Liy/b0;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Z", "()Z", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f52700c = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRequired;

        public Params(b0 b0Var, boolean z15) {
            this.name = b0Var;
            this.isRequired = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return t.c(this.name, params.name) && this.isRequired == params.isRequired;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Boolean.hashCode(this.isRequired);
        }

        public String toString() {
            return "Params(name=" + this.name + ", isRequired=" + this.isRequired + ')';
        }
    }

    public k(mx.c cVar, hz.i iVar) {
        this.labelProvider = cVar;
        this.validatorTextFactory = iVar;
    }

    private final hz.h e() {
        return (hz.h) this.textValidator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hz.h g(k kVar) {
        return kVar.validatorTextFactory.a();
    }

    public Object f(Params params, tq.e<? super hz.g> eVar) {
        mx.c cVar = this.labelProvider;
        if (!params.getIsRequired() && c0.e(params.getName()).length() == 0) {
            return hz.g.b.f86853b;
        }
        hz.h hVarY = e().M(cVar.c(bp2.a.J)).y(120, cVar.c(bp2.a.R));
        hVarY.g(new dp2.a(cVar.c(bp2.a.M)));
        return hVarY.K(cVar.c(bp2.a.M)).a(c0.e(params.getName()));
    }
}
