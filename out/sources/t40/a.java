package t40;

import androidx.compose.ui.graphics.Color;
import d40.i;
import er.p;
import fr.k;
import mx.Label;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lt40/a;", "", "Lmx/a;", "description", "Ld40/b;", "icon", "<init>", "(Lmx/a;Ld40/b;)V", "a", "Lmx/a;", "()Lmx/a;", "b", "Ld40/b;", "()Ld40/b;", "Lt40/a$a;", "Lt40/a$b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d40.b icon;

    /* JADX INFO: renamed from: t40.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt40/a$a;", "Lt40/a;", "Lmx/a;", "description", "<init>", "(Lmx/a;)V", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C4874a extends a {

        /* JADX INFO: renamed from: t40.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C4875a implements p<r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4875a f187639a = new C4875a();

            C4875a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(r rVar, int i15) {
                rVar.X(-198396896);
                if (t.k()) {
                    t.o(-198396896, i15, -1, "pl.gov.coi.common.ui.ds.inforow.model.InfoRowData.Bullet.<init>.<anonymous> (InfoRowData.kt:22)");
                }
                long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                if (t.k()) {
                    t.n();
                }
                rVar.R();
                return jB;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C4874a(Label label) {
            super(label, new d40.b.C0864b(null, jz.a.D, i.f.f39709e, C4875a.f187639a, null, null, 33, null), 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ a(Label label, d40.b bVar, k kVar) {
        this(label, bVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d40.b getIcon() {
        return this.icon;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0013"}, d2 = {"Lt40/a$b;", "Lt40/a;", "Lmx/a;", "description", "", "iconResId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "iconColorProvider", "title", "<init>", "(Lmx/a;ILer/p;Lmx/a;)V", "c", "I", "getIconResId", "()I", "d", "Lmx/a;", "()Lmx/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int iconResId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Label title;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: t40.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4876a implements p<r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4876a f187642a = new C4876a();

            C4876a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(r rVar, int i15) {
                rVar.X(-266438459);
                if (t.k()) {
                    t.o(-266438459, i15, -1, "pl.gov.coi.common.ui.ds.inforow.model.InfoRowData.Default.<init>.<anonymous> (InfoRowData.kt:30)");
                }
                long jH = Color.INSTANCE.h();
                if (t.k()) {
                    t.n();
                }
                rVar.R();
                return jH;
            }
        }

        public /* synthetic */ b(Label label, int i15, p pVar, Label label2, int i16, k kVar) {
            this(label, i15, (i16 & 4) != 0 ? C4876a.f187642a : pVar, label2);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public b(Label label, int i15, p<? super r, ? super Integer, Color> pVar, Label label2) {
            super(label, new d40.b.C0864b(null, i15, i.g.f39710e, pVar, null, null, 33, null), null);
            this.iconResId = i15;
            this.title = label2;
        }
    }

    private a(Label label, d40.b bVar) {
        this.description = label;
        this.icon = bVar;
    }
}
