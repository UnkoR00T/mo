package ae3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, d2 = {"Lae3/e0;", "Lgz/b;", "Lae3/e0$a;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "params", "d", "(Lae3/e0$a;Ltq/e;)Ljava/lang/Object;", "Lhz/h;", "a", "Lhz/h;", "companyNameValidator", "b", "personNameValidator", "c", "personSurnameValidator", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 implements gz.b<a, hz.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hz.h companyNameValidator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz.h personNameValidator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hz.h personSurnameValidator;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lae3/e0$a;", "Lgz/b$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "a", "Liy/b0;", "()Liy/b0;", "b", "c", "Lae3/e0$a$a;", "Lae3/e0$a$b;", "Lae3/e0$a$c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5724b = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final iy.b0 text;

        /* JADX INFO: renamed from: ae3.e0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lae3/e0$a$a;", "Lae3/e0$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0122a extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f5726c = iy.b0.f97726c;

            public C0122a(iy.b0 b0Var) {
                super(b0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lae3/e0$a$b;", "Lae3/e0$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f5727c = iy.b0.f97726c;

            public b(iy.b0 b0Var) {
                super(b0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lae3/e0$a$c;", "Lae3/e0$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f5728c = iy.b0.f97726c;

            public c(iy.b0 b0Var) {
                super(b0Var, null);
            }
        }

        public /* synthetic */ a(iy.b0 b0Var, fr.k kVar) {
            this(b0Var);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final iy.b0 getText() {
            return this.text;
        }

        private a(iy.b0 b0Var) {
            this.text = b0Var;
        }
    }

    public e0(mx.c cVar, hz.i iVar) {
        this.companyNameValidator = iVar.a().y(100, cVar.e(md3.b.f125851w, "100")).M(cVar.c(md3.b.f125724g0));
        hz.c.Companion companion = hz.c.INSTANCE;
        this.personNameValidator = (hz.h) companion.a(iVar.a().y(100, cVar.e(md3.b.f125851w, "100")).M(cVar.c(md3.b.f125732h0)).K(cVar.c(md3.b.f125748j0)), new ud3.e.d(cVar.c(md3.b.f125849v5)));
        this.personSurnameValidator = (hz.h) companion.a(iVar.a().y(100, cVar.e(md3.b.f125851w, "100")).M(cVar.c(md3.b.f125740i0)).K(cVar.c(md3.b.f125748j0)), new ud3.e.d(cVar.c(md3.b.f125849v5)));
    }

    public Object d(a aVar, tq.e<? super hz.g> eVar) {
        hz.h hVar;
        if (aVar instanceof a.C0122a) {
            hVar = this.companyNameValidator;
        } else if (aVar instanceof a.b) {
            hVar = this.personNameValidator;
        } else {
            if (!(aVar instanceof a.c)) {
                throw new oq.p();
            }
            hVar = this.personSurnameValidator;
        }
        return hVar.a(iy.c0.e(aVar.getText()));
    }
}
