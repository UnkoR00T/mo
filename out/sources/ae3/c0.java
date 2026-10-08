package ae3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0016"}, d2 = {"Lae3/c0;", "Lgz/b;", "Lae3/c0$a;", "Lhz/g;", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "params", "d", "(Lae3/c0$a;Ltq/e;)Ljava/lang/Object;", "Lhz/h;", "a", "Lhz/h;", "cityValidator", "b", "streetValidator", "c", "buildingNumberValidator", "flatNumberValidator", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 implements gz.b<a, hz.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final hz.h cityValidator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final hz.h streetValidator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hz.h buildingNumberValidator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hz.h flatNumberValidator;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\t\n\u0006\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lae3/c0$a;", "Lgz/b$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "a", "Liy/b0;", "()Liy/b0;", "b", "d", "c", "Lae3/c0$a$a;", "Lae3/c0$a$b;", "Lae3/c0$a$c;", "Lae3/c0$a$d;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f5680b = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final iy.b0 text;

        /* JADX INFO: renamed from: ae3.c0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lae3/c0$a$a;", "Lae3/c0$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0121a extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f5682c = iy.b0.f97726c;

            public C0121a(iy.b0 b0Var) {
                super(b0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lae3/c0$a$b;", "Lae3/c0$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f5683c = iy.b0.f97726c;

            public b(iy.b0 b0Var) {
                super(b0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lae3/c0$a$c;", "Lae3/c0$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f5684c = iy.b0.f97726c;

            public c(iy.b0 b0Var) {
                super(b0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lae3/c0$a$d;", "Lae3/c0$a;", "Liy/b0;", "text", "<init>", "(Liy/b0;)V", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f5685c = iy.b0.f97726c;

            public d(iy.b0 b0Var) {
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

    public c0(mx.c cVar, hz.i iVar) {
        hz.c.Companion companion = hz.c.INSTANCE;
        this.cityValidator = ((hz.h) companion.a(iVar.a().M(cVar.c(md3.b.X1)), new ud3.e.b(cVar.c(md3.b.Y1)))).y(112, cVar.c(md3.b.Y1)).O(2, cVar.c(md3.b.Y1));
        this.streetValidator = ((hz.h) companion.a(iVar.a().M(cVar.c(md3.b.f125764l0)), new ud3.e.c(cVar.c(md3.b.f125772m0)))).y(112, cVar.c(md3.b.f125772m0)).O(2, cVar.c(md3.b.f125772m0));
        this.buildingNumberValidator = ((hz.h) companion.a(iVar.a().M(cVar.c(md3.b.f125700d0)), new ud3.e.a(cVar.c(md3.b.f125708e0)))).y(15, cVar.c(md3.b.f125708e0)).O(1, cVar.c(md3.b.f125708e0));
        this.flatNumberValidator = ((hz.h) companion.a(iVar.a(), new ud3.e.a(cVar.c(md3.b.f125692c0)))).y(5, cVar.c(md3.b.f125692c0));
    }

    public Object d(a aVar, tq.e<? super hz.g> eVar) {
        hz.h hVar;
        if (aVar instanceof a.b) {
            hVar = this.cityValidator;
        } else if (aVar instanceof a.d) {
            hVar = this.streetValidator;
        } else if (aVar instanceof a.C0121a) {
            hVar = this.buildingNumberValidator;
        } else {
            if (!(aVar instanceof a.c)) {
                throw new oq.p();
            }
            hVar = this.flatNumberValidator;
        }
        return hVar.a(iy.c0.e(aVar.getText()));
    }
}
