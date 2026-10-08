package e82;

import fu.r;
import iy.b0;
import iy.c0;
import oq.p;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Le82/b;", "Lgz/b;", "Le82/b$a;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "params", "d", "(Le82/b$a;Ltq/e;)Ljava/lang/Object;", "Lhz/h;", "a", "Lhz/h;", "applicantNameValidator", "b", "applicantAddressValidator", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<a, hz.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hz.h applicantNameValidator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz.h applicantAddressValidator;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Le82/b$a;", "Lgz/b$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "a", "Liy/b0;", "()Liy/b0;", "b", "Le82/b$a$a;", "Le82/b$a$b;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f48423b = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b0 text;

        /* JADX INFO: renamed from: e82.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le82/b$a$a;", "Le82/b$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C1126a extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f48425c = b0.f97726c;

            public C1126a(b0 b0Var) {
                super(b0Var, null);
            }
        }

        /* JADX INFO: renamed from: e82.b$a$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Le82/b$a$b;", "Le82/b$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C1127b extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f48426c = b0.f97726c;

            public C1127b(b0 b0Var) {
                super(b0Var, null);
            }
        }

        public /* synthetic */ a(b0 b0Var, fr.k kVar) {
            this(b0Var);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getText() {
            return this.text;
        }

        private a(b0 b0Var) {
            this.text = b0Var;
        }
    }

    public b(mx.c cVar, hz.i iVar) {
        hz.c.Companion companion = hz.c.INSTANCE;
        this.applicantNameValidator = (hz.h) companion.a(iVar.a().y(GF2Field.MASK, cVar.c(v72.b.f204280o)).M(cVar.c(v72.b.f204244c)), new h82.c(cVar.c(v72.b.f204277n)));
        this.applicantAddressValidator = (hz.h) companion.a(iVar.a().y(GF2Field.MASK, cVar.c(v72.b.f204280o)), new h82.a(cVar.c(v72.b.f204277n)));
    }

    public Object d(a aVar, tq.e<? super hz.g> eVar) {
        hz.h hVar;
        if (r.t0(c0.e(aVar.getText())) && !(aVar instanceof a.C1127b)) {
            return hz.g.b.f86853b;
        }
        if (aVar instanceof a.C1127b) {
            hVar = this.applicantNameValidator;
        } else {
            if (!(aVar instanceof a.C1126a)) {
                throw new p();
            }
            hVar = this.applicantAddressValidator;
        }
        return hVar.a(c0.e(aVar.getText()));
    }
}
