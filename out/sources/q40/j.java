package q40;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.k;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lq40/j;", "", "Ld40/b;", "icon", "<init>", "(Ld40/b;)V", "a", "Ld40/b;", "()Ld40/b;", "b", "Lq40/j$a;", "Lq40/j$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d40.b icon;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\t\u0010\u0011\fB\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lq40/j$b;", "Lq40/j;", "", "iconResId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "iconColorProvider", "<init>", "(ILer/p;)V", "b", "I", "()I", "c", "Ler/p;", "getIconColorProvider", "()Ler/p;", "d", "a", "Lq40/j$b$a;", "Lq40/j$b$b;", "Lq40/j$b$c;", "Lq40/j$b$d;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int iconResId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final p<r, Integer, Color> iconColorProvider;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq40/j$b$a;", "Lq40/j$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final a f164684d = new a();

            /* JADX INFO: renamed from: q40.j$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class C4089a implements p<r, Integer, Color> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C4089a f164685a = new C4089a();

                C4089a() {
                }

                @Override // er.p
                public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                    return Color.m0boximpl(c(rVar, num.intValue()));
                }

                public final long c(r rVar, int i15) {
                    rVar.X(160122169);
                    if (t.k()) {
                        t.o(160122169, i15, -1, "pl.gov.coi.common.ui.ds.iconpage.IconSection.Result.Failure.<init>.<anonymous> (IconPageData.kt:58)");
                    }
                    long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                    if (t.k()) {
                        t.n();
                    }
                    rVar.R();
                    return jG;
                }
            }

            private a() {
                super(jz.a.f106730a2, C4089a.f164685a, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1108051492;
            }

            public String toString() {
                return "Failure";
            }
        }

        /* JADX INFO: renamed from: q40.j$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq40/j$b$b;", "Lq40/j$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C4090b extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final C4090b f164686d = new C4090b();

            /* JADX INFO: renamed from: q40.j$b$b$a */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class a implements p<r, Integer, Color> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f164687a = new a();

                a() {
                }

                @Override // er.p
                public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                    return Color.m0boximpl(c(rVar, num.intValue()));
                }

                public final long c(r rVar, int i15) {
                    rVar.X(1093976045);
                    if (t.k()) {
                        t.o(1093976045, i15, -1, "pl.gov.coi.common.ui.ds.iconpage.IconSection.Result.Info.<init>.<anonymous> (IconPageData.kt:48)");
                    }
                    long j15 = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().j();
                    if (t.k()) {
                        t.n();
                    }
                    rVar.R();
                    return j15;
                }
            }

            private C4090b() {
                super(jz.a.Y1, a.f164687a, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C4090b);
            }

            public int hashCode() {
                return -1961079396;
            }

            public String toString() {
                return "Info";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq40/j$b$c;", "Lq40/j$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final c f164688d = new c();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class a implements p<r, Integer, Color> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f164689a = new a();

                a() {
                }

                @Override // er.p
                public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                    return Color.m0boximpl(c(rVar, num.intValue()));
                }

                public final long c(r rVar, int i15) {
                    rVar.X(-2029680416);
                    if (t.k()) {
                        t.o(-2029680416, i15, -1, "pl.gov.coi.common.ui.ds.iconpage.IconSection.Result.Success.<init>.<anonymous> (IconPageData.kt:63)");
                    }
                    long jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
                    if (t.k()) {
                        t.n();
                    }
                    rVar.R();
                    return jD;
                }
            }

            private c() {
                super(jz.a.f106738b2, a.f164689a, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1888647083;
            }

            public String toString() {
                return "Success";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lq40/j$b$d;", "Lq40/j$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final d f164690d = new d();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class a implements p<r, Integer, Color> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f164691a = new a();

                a() {
                }

                @Override // er.p
                public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                    return Color.m0boximpl(c(rVar, num.intValue()));
                }

                public final long c(r rVar, int i15) {
                    rVar.X(1823141735);
                    if (t.k()) {
                        t.o(1823141735, i15, -1, "pl.gov.coi.common.ui.ds.iconpage.IconSection.Result.Warning.<init>.<anonymous> (IconPageData.kt:53)");
                    }
                    long jF = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().f();
                    if (t.k()) {
                        t.n();
                    }
                    rVar.R();
                    return jF;
                }
            }

            private d() {
                super(jz.a.Z1, a.f164691a, null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1102968814;
            }

            public String toString() {
                return "Warning";
            }
        }

        public /* synthetic */ b(int i15, p pVar, k kVar) {
            this(i15, pVar);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIconResId() {
            return this.iconResId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private b(int i15, p<? super r, ? super Integer, Color> pVar) {
            super(new d40.b.C0864b(null, i15, d40.i.j.f39713e, pVar, null, null, 33, null), null);
            this.iconResId = i15;
            this.iconColorProvider = pVar;
        }
    }

    public /* synthetic */ j(d40.b bVar, k kVar) {
        this(bVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d40.b getIcon() {
        return this.icon;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq40/j$a;", "Lq40/j;", "", "iconRes", "<init>", "(I)V", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends j {

        /* JADX INFO: renamed from: q40.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C4088a implements p<r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4088a f164681a = new C4088a();

            C4088a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(r rVar, int i15) {
                rVar.X(237407651);
                if (t.k()) {
                    t.o(237407651, i15, -1, "pl.gov.coi.common.ui.ds.iconpage.IconSection.Empty.<init>.<anonymous> (IconPageData.kt:30)");
                }
                long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
                if (t.k()) {
                    t.n();
                }
                rVar.R();
                return jC;
            }
        }

        public /* synthetic */ a(int i15, int i16, k kVar) {
            this((i16 & 1) != 0 ? jz.a.f106754d2 : i15);
        }

        public a(int i15) {
            super(new d40.b.C0864b(null, i15, d40.i.n.f39717e, C4088a.f164681a, null, null, 33, null), null);
        }
    }

    private j(d40.b bVar) {
        this.icon = bVar;
    }
}
