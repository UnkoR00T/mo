package pa3;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.t;
import java.util.List;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJI\u0010\u0013\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lpa3/a;", "Lxw/f;", "Lpa3/a$a;", "", "Ln50/g;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lmx/a;", "title", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "titleColor", "", "iconResId", "iconColor", "Loq/i0;", "onClick", "c", "(Lmx/a;Ler/p;ILer/p;Ler/a;)Ln50/g;", "params", "e", "(Lpa3/a$a;)Ljava/util/List;", "a", "Lmx/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xw.f<Params, List<? extends DefaultSingleCardData>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: pa3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Lpa3/a$a;", "", "", "showDownloadButton", "Lkotlin/Function0;", "Loq/i0;", "onEditClick", "onDownloadFileClick", "onDeleteClick", "<init>", "(ZLer/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Ler/a;", "c", "()Ler/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showDownloadButton;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onEditClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDownloadFileClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDeleteClick;

        public Params(boolean z15, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.showDownloadButton = z15;
            this.onEditClick = aVar;
            this.onDownloadFileClick = aVar2;
            this.onDeleteClick = aVar3;
        }

        public final er.a<i0> a() {
            return this.onDeleteClick;
        }

        public final er.a<i0> b() {
            return this.onDownloadFileClick;
        }

        public final er.a<i0> c() {
            return this.onEditClick;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getShowDownloadButton() {
            return this.showDownloadButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.showDownloadButton == params.showDownloadButton && t.c(this.onEditClick, params.onEditClick) && t.c(this.onDownloadFileClick, params.onDownloadFileClick) && t.c(this.onDeleteClick, params.onDeleteClick);
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.showDownloadButton) * 31) + this.onEditClick.hashCode()) * 31) + this.onDownloadFileClick.hashCode()) * 31) + this.onDeleteClick.hashCode();
        }

        public String toString() {
            return "Params(showDownloadButton=" + this.showDownloadButton + ", onEditClick=" + this.onEditClick + ", onDownloadFileClick=" + this.onDownloadFileClick + ", onDeleteClick=" + this.onDeleteClick + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f153898a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1348152238);
            if (p076m2.t.k()) {
                p076m2.t.o(1348152238, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.mapper.ButtonSectionMapper.invoke.<anonymous> (ButtonSectionMapper.kt:31)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jC;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f153899a = new c();

        c() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(378261740);
            if (p076m2.t.k()) {
                p076m2.t.o(378261740, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.mapper.ButtonSectionMapper.invoke.<anonymous> (ButtonSectionMapper.kt:33)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jC;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f153900a = new d();

        d() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(453135403);
            if (p076m2.t.k()) {
                p076m2.t.o(453135403, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.mapper.ButtonSectionMapper.invoke.<anonymous>.<anonymous> (ButtonSectionMapper.kt:39)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jC;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f153901a = new e();

        e() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(863884589);
            if (p076m2.t.k()) {
                p076m2.t.o(863884589, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.mapper.ButtonSectionMapper.invoke.<anonymous>.<anonymous> (ButtonSectionMapper.kt:41)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jC;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f153902a = new f();

        f() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1835225964);
            if (p076m2.t.k()) {
                p076m2.t.o(1835225964, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.mapper.ButtonSectionMapper.invoke.<anonymous> (ButtonSectionMapper.kt:47)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f153903a = new g();

        g() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(865335466);
            if (p076m2.t.k()) {
                p076m2.t.o(865335466, i15, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.common.overview.mapper.ButtonSectionMapper.invoke.<anonymous> (ButtonSectionMapper.kt:49)");
            }
            long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jG;
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final DefaultSingleCardData c(Label title, p<? super r, ? super Integer, Color> titleColor, int iconResId, p<? super r, ? super Integer, Color> iconColor, er.a<i0> onClick) {
        return new DefaultSingleCardData(null, onClick, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(title, null, titleColor, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new n50.i.Icon(iconResId, null, iconColor, null, null, 26, null), 3, null), null, null, 3325, null);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public List<DefaultSingleCardData> b(Params params) {
        DefaultSingleCardData defaultSingleCardDataC = c(this.labelProvider.c(r93.a.W0), b.f153898a, jz.a.f106768f0, c.f153899a, params.c());
        boolean showDownloadButton = params.getShowDownloadButton();
        Boolean boolValueOf = Boolean.valueOf(showDownloadButton);
        if (!showDownloadButton) {
            boolValueOf = null;
        }
        return v.s(defaultSingleCardDataC, boolValueOf != null ? c(this.labelProvider.c(r93.a.f172500o), d.f153900a, jz.a.f106751d, e.f153901a, params.b()) : null, c(this.labelProvider.c(r93.a.T0), f.f153902a, jz.a.f106727a, g.f153903a, params.a()));
    }
}
